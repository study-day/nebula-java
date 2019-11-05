/* Copyright (c) 2019 vesoft inc. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License,
 * attached with Common Clause Condition 1.0, found in the LICENSES directory.
 */

package com.vesoft.nebula.graph.client;

import com.google.common.collect.Lists;
import com.vesoft.nebula.graph.RowValue;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ResultSet {

    private List<String> columns;
    private List<RowValue> rows;

    public ResultSet() {
        this(Lists.newArrayList(), Lists.newArrayList());
    }

    public ResultSet(List<byte[]> columns, List<RowValue> rows) {
        this.columns = columns.stream().map(String::new).collect(Collectors.toList());
        this.rows = rows;
    }

    public List<String> getColumns() {
        return columns;
    }

    public List<RowValue> getRows() {
        return rows;
    }

    @Override
    public String toString() {
        return "ResultSet{"
                + "columns=" + columns
                + ", rows=" + rows
                + '}';
    }
}
