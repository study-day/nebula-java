/* Copyright (c) 2020 vesoft inc. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License,
 * attached with Common Clause Condition 1.0, found in the LICENSES directory.
 */

package com.vesoft.nebula.client.storage.scan;

import com.facebook.thrift.TException;
import com.vesoft.nebula.DataSet;
import com.vesoft.nebula.ErrorCode;
import com.vesoft.nebula.client.graph.data.HostAddress;
import com.vesoft.nebula.client.meta.MetaManager;
import com.vesoft.nebula.client.storage.GraphStorageConnection;
import com.vesoft.nebula.client.storage.StorageConnPool;
import com.vesoft.nebula.client.storage.data.ScanStatus;
import com.vesoft.nebula.storage.PartitionResult;
import com.vesoft.nebula.storage.ScanVertexRequest;
import com.vesoft.nebula.storage.ScanVertexResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ScanVertexResult's iterator
 */
public class ScanVertexResultIterator extends ScanResultIterator {
    private static final Logger LOGGER = LoggerFactory.getLogger(ScanVertexResultIterator.class);

    private final ScanVertexRequest request;

    private ScanVertexResultIterator(MetaManager metaManager,
                                     StorageConnPool pool,
                                     Set<PartScanInfo> partScanInfoList,
                                     List<HostAddress> addresses,
                                     ScanVertexRequest request,
                                     String spaceName,
                                     String labelName,
                                     boolean partSuccess) {
        super(metaManager, pool, new PartScanQueue(partScanInfoList), addresses, spaceName,
                labelName, partSuccess);
        this.request = request;
    }


    /**
     * get the next vertex set
     *
     * @return ScanVertexResult
     */
    public ScanVertexResult next() throws Exception {
        if (!hasNext()) {
            throw new IllegalAccessException("iterator has no more data");
        }
        final List<DataSet> results =
                Collections.synchronizedList(new ArrayList<>(addresses.size()));
        List<Exception> exceptions =
                Collections.synchronizedList(new ArrayList<>(addresses.size()));
        CountDownLatch countDownLatch = new CountDownLatch(addresses.size());
        AtomicInteger existSuccess = new AtomicInteger(0);

        for (HostAddress addr : addresses) {
            threadPool.submit(() -> {
                ScanVertexRequest partRequest = new ScanVertexRequest(request);
                ScanVertexResponse response;
                PartScanInfo partInfo = partScanQueue.getPart(addr);
                // no part need to scan
                if (partInfo == null) {
                    countDownLatch.countDown();
                    existSuccess.addAndGet(1);
                    return;
                }

                GraphStorageConnection connection;
                try {
                    connection = pool.getStorageConnection(addr);
                } catch (Exception e) {
                    LOGGER.error("get storage client error, ", e);
                    exceptions.add(e);
                    countDownLatch.countDown();
                    return;
                }

                partRequest.setPart_id(partInfo.getPart());
                partRequest.setCursor(partInfo.getCursor());
                try {
                    response = connection.scanVertex(partRequest);
                } catch (TException e) {
                    LOGGER.error(String.format("Scan vertex failed for %s", e.getMessage()), e);
                    exceptions.add(e);
                    partScanQueue.dropPart(partInfo);
                    countDownLatch.countDown();
                    return;
                }

                if (response == null) {
                    handleNullResponse(partInfo, exceptions);
                    countDownLatch.countDown();
                    return;
                }

                if (isSuccessful(response)) {
                    handleSucceedResult(existSuccess, response, partInfo);
                    results.add(response.getVertex_data());
                }

                if (response.getResult() != null) {
                    handleFailedResult(response, partInfo, exceptions);
                } else {
                    handleNullResult(partInfo, exceptions);
                }
                pool.release(addr, connection);
                countDownLatch.countDown();
            });
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException interruptedE) {
            LOGGER.error("scan interrupted:", interruptedE);
            throw interruptedE;
        }

        if (partSuccess) {
            hasNext = partScanQueue.size() > 0;
            // no part succeed, throw ExecuteFailedException
            if (existSuccess.get() == 0) {
                throwExceptions(exceptions);
            }
            ScanStatus status = exceptions.size() > 0 ? ScanStatus.PART_SUCCESS :
                    ScanStatus.ALL_SUCCESS;
            return new ScanVertexResult(results, status);
        } else {
            hasNext = partScanQueue.size() > 0 && exceptions.isEmpty();
            // any part failed, throw ExecuteFailedException
            if (!exceptions.isEmpty()) {
                throwExceptions(exceptions);
            }
            boolean success = (existSuccess.get() == addresses.size());
            List<DataSet> finalResults = success ? results : null;
            return new ScanVertexResult(finalResults, ScanStatus.ALL_SUCCESS);
        }
    }


    private boolean isSuccessful(ScanVertexResponse response) {
        return response != null && response.result.failed_parts.size() <= 0;
    }

    private void handleSucceedResult(AtomicInteger existSuccess, ScanVertexResponse response,
                                     PartScanInfo partInfo) {
        existSuccess.addAndGet(1);
        if (!response.has_next) {
            partScanQueue.dropPart(partInfo);
        } else {
            partInfo.setCursor(response.getNext_cursor());
        }
    }

    private void handleFailedResult(ScanVertexResponse response, PartScanInfo partInfo,
                                    List<Exception> exceptions) {
        for (PartitionResult partResult : response.getResult().getFailed_parts()) {
            if (partResult.code == ErrorCode.E_LEADER_CHANGED) {
                freshLeader(spaceName, partInfo.getPart(), partResult.getLeader());
                partInfo.setLeader(getLeader(partResult.getLeader()));
            } else {
                ErrorCode code = partResult.getCode();
                LOGGER.error(String.format("part scan failed, error code=%d", code));
                partScanQueue.dropPart(partInfo);
                exceptions.add(new Exception(String.format("part scan, error code=%d", code)));
            }
        }
    }


    /**
     * builder to build {@link ScanVertexResult}
     */
    public static class ScanVertexResultBuilder {

        MetaManager metaManager;
        StorageConnPool pool;
        Set<PartScanInfo> partScanInfoList;
        List<HostAddress> addresses;
        ScanVertexRequest request;
        String spaceName;
        String tagName;
        boolean partSuccess = false;

        public ScanVertexResultBuilder withMetaClient(MetaManager metaManager) {
            this.metaManager = metaManager;
            return this;
        }

        public ScanVertexResultBuilder withPool(StorageConnPool pool) {
            this.pool = pool;
            return this;
        }

        public ScanVertexResultBuilder withPartScanInfo(Set<PartScanInfo> partScanInfoList) {
            this.partScanInfoList = partScanInfoList;
            return this;
        }

        public ScanVertexResultBuilder withAddresses(List<HostAddress> addresses) {
            this.addresses = addresses;
            return this;
        }

        public ScanVertexResultBuilder withRequest(ScanVertexRequest request) {
            this.request = request;
            return this;
        }

        public ScanVertexResultBuilder withSpaceName(String spaceName) {
            this.spaceName = spaceName;
            return this;
        }

        public ScanVertexResultBuilder withTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }

        public ScanVertexResultBuilder withPartSuccess(boolean partSuccess) {
            this.partSuccess = partSuccess;
            return this;
        }

        public ScanVertexResultIterator build() {
            return new ScanVertexResultIterator(
                    metaManager,
                    pool,
                    partScanInfoList,
                    addresses,
                    request,
                    spaceName,
                    tagName,
                    partSuccess);
        }
    }
}