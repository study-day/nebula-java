/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.meta;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.annotations.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class HostItem implements TBase, java.io.Serializable, Cloneable, Comparable<HostItem> {
  private static final TStruct STRUCT_DESC = new TStruct("HostItem");
  private static final TField HOST_ADDR_FIELD_DESC = new TField("hostAddr", TType.STRUCT, (short)1);
  private static final TField STATUS_FIELD_DESC = new TField("status", TType.I32, (short)2);
  private static final TField LEADER_PARTS_FIELD_DESC = new TField("leader_parts", TType.MAP, (short)3);
  private static final TField ALL_PARTS_FIELD_DESC = new TField("all_parts", TType.MAP, (short)4);
  private static final TField ROLE_FIELD_DESC = new TField("role", TType.I32, (short)5);
  private static final TField GIT_INFO_SHA_FIELD_DESC = new TField("git_info_sha", TType.STRING, (short)6);
  private static final TField ZONE_NAME_FIELD_DESC = new TField("zone_name", TType.STRING, (short)7);

  public com.vesoft.nebula.HostAddr hostAddr;
  /**
   * 
   * @see HostStatus
   */
  public HostStatus status;
  public Map<byte[],List<Integer>> leader_parts;
  public Map<byte[],List<Integer>> all_parts;
  public HostRole role;
  public byte[] git_info_sha;
  public byte[] zone_name;
  public static final int HOSTADDR = 1;
  public static final int STATUS = 2;
  public static final int LEADER_PARTS = 3;
  public static final int ALL_PARTS = 4;
  public static final int ROLE = 5;
  public static final int GIT_INFO_SHA = 6;
  public static final int ZONE_NAME = 7;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(HOSTADDR, new FieldMetaData("hostAddr", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, com.vesoft.nebula.HostAddr.class)));
    tmpMetaDataMap.put(STATUS, new FieldMetaData("status", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(LEADER_PARTS, new FieldMetaData("leader_parts", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.STRING), 
            new ListMetaData(TType.LIST, 
                new FieldValueMetaData(TType.I32)))));
    tmpMetaDataMap.put(ALL_PARTS, new FieldMetaData("all_parts", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.STRING), 
            new ListMetaData(TType.LIST, 
                new FieldValueMetaData(TType.I32)))));
    tmpMetaDataMap.put(ROLE, new FieldMetaData("role", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(GIT_INFO_SHA, new FieldMetaData("git_info_sha", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(ZONE_NAME, new FieldMetaData("zone_name", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(HostItem.class, metaDataMap);
  }

  public HostItem() {
  }

  public HostItem(
      com.vesoft.nebula.HostAddr hostAddr,
      HostStatus status,
      Map<byte[],List<Integer>> leader_parts,
      Map<byte[],List<Integer>> all_parts,
      HostRole role,
      byte[] git_info_sha) {
    this();
    this.hostAddr = hostAddr;
    this.status = status;
    this.leader_parts = leader_parts;
    this.all_parts = all_parts;
    this.role = role;
    this.git_info_sha = git_info_sha;
  }

  public HostItem(
      com.vesoft.nebula.HostAddr hostAddr,
      HostStatus status,
      Map<byte[],List<Integer>> leader_parts,
      Map<byte[],List<Integer>> all_parts,
      HostRole role,
      byte[] git_info_sha,
      byte[] zone_name) {
    this();
    this.hostAddr = hostAddr;
    this.status = status;
    this.leader_parts = leader_parts;
    this.all_parts = all_parts;
    this.role = role;
    this.git_info_sha = git_info_sha;
    this.zone_name = zone_name;
  }

  public static class Builder {
    private com.vesoft.nebula.HostAddr hostAddr;
    private HostStatus status;
    private Map<byte[],List<Integer>> leader_parts;
    private Map<byte[],List<Integer>> all_parts;
    private HostRole role;
    private byte[] git_info_sha;
    private byte[] zone_name;

    public Builder() {
    }

    public Builder setHostAddr(final com.vesoft.nebula.HostAddr hostAddr) {
      this.hostAddr = hostAddr;
      return this;
    }

    public Builder setStatus(final HostStatus status) {
      this.status = status;
      return this;
    }

    public Builder setLeader_parts(final Map<byte[],List<Integer>> leader_parts) {
      this.leader_parts = leader_parts;
      return this;
    }

    public Builder setAll_parts(final Map<byte[],List<Integer>> all_parts) {
      this.all_parts = all_parts;
      return this;
    }

    public Builder setRole(final HostRole role) {
      this.role = role;
      return this;
    }

    public Builder setGit_info_sha(final byte[] git_info_sha) {
      this.git_info_sha = git_info_sha;
      return this;
    }

    public Builder setZone_name(final byte[] zone_name) {
      this.zone_name = zone_name;
      return this;
    }

    public HostItem build() {
      HostItem result = new HostItem();
      result.setHostAddr(this.hostAddr);
      result.setStatus(this.status);
      result.setLeader_parts(this.leader_parts);
      result.setAll_parts(this.all_parts);
      result.setRole(this.role);
      result.setGit_info_sha(this.git_info_sha);
      result.setZone_name(this.zone_name);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HostItem(HostItem other) {
    if (other.isSetHostAddr()) {
      this.hostAddr = TBaseHelper.deepCopy(other.hostAddr);
    }
    if (other.isSetStatus()) {
      this.status = TBaseHelper.deepCopy(other.status);
    }
    if (other.isSetLeader_parts()) {
      this.leader_parts = TBaseHelper.deepCopy(other.leader_parts);
    }
    if (other.isSetAll_parts()) {
      this.all_parts = TBaseHelper.deepCopy(other.all_parts);
    }
    if (other.isSetRole()) {
      this.role = TBaseHelper.deepCopy(other.role);
    }
    if (other.isSetGit_info_sha()) {
      this.git_info_sha = TBaseHelper.deepCopy(other.git_info_sha);
    }
    if (other.isSetZone_name()) {
      this.zone_name = TBaseHelper.deepCopy(other.zone_name);
    }
  }

  public HostItem deepCopy() {
    return new HostItem(this);
  }

  public com.vesoft.nebula.HostAddr getHostAddr() {
    return this.hostAddr;
  }

  public HostItem setHostAddr(com.vesoft.nebula.HostAddr hostAddr) {
    this.hostAddr = hostAddr;
    return this;
  }

  public void unsetHostAddr() {
    this.hostAddr = null;
  }

  // Returns true if field hostAddr is set (has been assigned a value) and false otherwise
  public boolean isSetHostAddr() {
    return this.hostAddr != null;
  }

  public void setHostAddrIsSet(boolean __value) {
    if (!__value) {
      this.hostAddr = null;
    }
  }

  /**
   * 
   * @see HostStatus
   */
  public HostStatus getStatus() {
    return this.status;
  }

  /**
   * 
   * @see HostStatus
   */
  public HostItem setStatus(HostStatus status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  // Returns true if field status is set (has been assigned a value) and false otherwise
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean __value) {
    if (!__value) {
      this.status = null;
    }
  }

  public Map<byte[],List<Integer>> getLeader_parts() {
    return this.leader_parts;
  }

  public HostItem setLeader_parts(Map<byte[],List<Integer>> leader_parts) {
    this.leader_parts = leader_parts;
    return this;
  }

  public void unsetLeader_parts() {
    this.leader_parts = null;
  }

  // Returns true if field leader_parts is set (has been assigned a value) and false otherwise
  public boolean isSetLeader_parts() {
    return this.leader_parts != null;
  }

  public void setLeader_partsIsSet(boolean __value) {
    if (!__value) {
      this.leader_parts = null;
    }
  }

  public Map<byte[],List<Integer>> getAll_parts() {
    return this.all_parts;
  }

  public HostItem setAll_parts(Map<byte[],List<Integer>> all_parts) {
    this.all_parts = all_parts;
    return this;
  }

  public void unsetAll_parts() {
    this.all_parts = null;
  }

  // Returns true if field all_parts is set (has been assigned a value) and false otherwise
  public boolean isSetAll_parts() {
    return this.all_parts != null;
  }

  public void setAll_partsIsSet(boolean __value) {
    if (!__value) {
      this.all_parts = null;
    }
  }

  public HostRole getRole() {
    return this.role;
  }

  public HostItem setRole(HostRole role) {
    this.role = role;
    return this;
  }

  public void unsetRole() {
    this.role = null;
  }

  // Returns true if field role is set (has been assigned a value) and false otherwise
  public boolean isSetRole() {
    return this.role != null;
  }

  public void setRoleIsSet(boolean __value) {
    if (!__value) {
      this.role = null;
    }
  }

  public byte[] getGit_info_sha() {
    return this.git_info_sha;
  }

  public HostItem setGit_info_sha(byte[] git_info_sha) {
    this.git_info_sha = git_info_sha;
    return this;
  }

  public void unsetGit_info_sha() {
    this.git_info_sha = null;
  }

  // Returns true if field git_info_sha is set (has been assigned a value) and false otherwise
  public boolean isSetGit_info_sha() {
    return this.git_info_sha != null;
  }

  public void setGit_info_shaIsSet(boolean __value) {
    if (!__value) {
      this.git_info_sha = null;
    }
  }

  public byte[] getZone_name() {
    return this.zone_name;
  }

  public HostItem setZone_name(byte[] zone_name) {
    this.zone_name = zone_name;
    return this;
  }

  public void unsetZone_name() {
    this.zone_name = null;
  }

  // Returns true if field zone_name is set (has been assigned a value) and false otherwise
  public boolean isSetZone_name() {
    return this.zone_name != null;
  }

  public void setZone_nameIsSet(boolean __value) {
    if (!__value) {
      this.zone_name = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case HOSTADDR:
      if (__value == null) {
        unsetHostAddr();
      } else {
        setHostAddr((com.vesoft.nebula.HostAddr)__value);
      }
      break;

    case STATUS:
      if (__value == null) {
        unsetStatus();
      } else {
        setStatus((HostStatus)__value);
      }
      break;

    case LEADER_PARTS:
      if (__value == null) {
        unsetLeader_parts();
      } else {
        setLeader_parts((Map<byte[],List<Integer>>)__value);
      }
      break;

    case ALL_PARTS:
      if (__value == null) {
        unsetAll_parts();
      } else {
        setAll_parts((Map<byte[],List<Integer>>)__value);
      }
      break;

    case ROLE:
      if (__value == null) {
        unsetRole();
      } else {
        setRole((HostRole)__value);
      }
      break;

    case GIT_INFO_SHA:
      if (__value == null) {
        unsetGit_info_sha();
      } else {
        setGit_info_sha((byte[])__value);
      }
      break;

    case ZONE_NAME:
      if (__value == null) {
        unsetZone_name();
      } else {
        setZone_name((byte[])__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case HOSTADDR:
      return getHostAddr();

    case STATUS:
      return getStatus();

    case LEADER_PARTS:
      return getLeader_parts();

    case ALL_PARTS:
      return getAll_parts();

    case ROLE:
      return getRole();

    case GIT_INFO_SHA:
      return getGit_info_sha();

    case ZONE_NAME:
      return getZone_name();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof HostItem))
      return false;
    HostItem that = (HostItem)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetHostAddr(), that.isSetHostAddr(), this.hostAddr, that.hostAddr)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetStatus(), that.isSetStatus(), this.status, that.status)) { return false; }

    if (!TBaseHelper.equalsSlow(this.isSetLeader_parts(), that.isSetLeader_parts(), this.leader_parts, that.leader_parts)) { return false; }

    if (!TBaseHelper.equalsSlow(this.isSetAll_parts(), that.isSetAll_parts(), this.all_parts, that.all_parts)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetRole(), that.isSetRole(), this.role, that.role)) { return false; }

    if (!TBaseHelper.equalsSlow(this.isSetGit_info_sha(), that.isSetGit_info_sha(), this.git_info_sha, that.git_info_sha)) { return false; }

    if (!TBaseHelper.equalsSlow(this.isSetZone_name(), that.isSetZone_name(), this.zone_name, that.zone_name)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {hostAddr, status, leader_parts, all_parts, role, git_info_sha, zone_name});
  }

  @Override
  public int compareTo(HostItem other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetHostAddr()).compareTo(other.isSetHostAddr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(hostAddr, other.hostAddr);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(status, other.status);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetLeader_parts()).compareTo(other.isSetLeader_parts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(leader_parts, other.leader_parts);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetAll_parts()).compareTo(other.isSetAll_parts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(all_parts, other.all_parts);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetRole()).compareTo(other.isSetRole());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(role, other.role);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetGit_info_sha()).compareTo(other.isSetGit_info_sha());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(git_info_sha, other.git_info_sha);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetZone_name()).compareTo(other.isSetZone_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(zone_name, other.zone_name);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField __field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) { 
        break;
      }
      switch (__field.id)
      {
        case HOSTADDR:
          if (__field.type == TType.STRUCT) {
            this.hostAddr = new com.vesoft.nebula.HostAddr();
            this.hostAddr.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case STATUS:
          if (__field.type == TType.I32) {
            this.status = HostStatus.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case LEADER_PARTS:
          if (__field.type == TType.MAP) {
            {
              TMap _map8 = iprot.readMapBegin();
              this.leader_parts = new HashMap<byte[],List<Integer>>(Math.max(0, 2*_map8.size));
              for (int _i9 = 0; 
                   (_map8.size < 0) ? iprot.peekMap() : (_i9 < _map8.size); 
                   ++_i9)
              {
                byte[] _key10;
                List<Integer> _val11;
                _key10 = iprot.readBinary();
                {
                  TList _list12 = iprot.readListBegin();
                  _val11 = new ArrayList<Integer>(Math.max(0, _list12.size));
                  for (int _i13 = 0; 
                       (_list12.size < 0) ? iprot.peekList() : (_i13 < _list12.size); 
                       ++_i13)
                  {
                    int _elem14;
                    _elem14 = iprot.readI32();
                    _val11.add(_elem14);
                  }
                  iprot.readListEnd();
                }
                this.leader_parts.put(_key10, _val11);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case ALL_PARTS:
          if (__field.type == TType.MAP) {
            {
              TMap _map15 = iprot.readMapBegin();
              this.all_parts = new HashMap<byte[],List<Integer>>(Math.max(0, 2*_map15.size));
              for (int _i16 = 0; 
                   (_map15.size < 0) ? iprot.peekMap() : (_i16 < _map15.size); 
                   ++_i16)
              {
                byte[] _key17;
                List<Integer> _val18;
                _key17 = iprot.readBinary();
                {
                  TList _list19 = iprot.readListBegin();
                  _val18 = new ArrayList<Integer>(Math.max(0, _list19.size));
                  for (int _i20 = 0; 
                       (_list19.size < 0) ? iprot.peekList() : (_i20 < _list19.size); 
                       ++_i20)
                  {
                    int _elem21;
                    _elem21 = iprot.readI32();
                    _val18.add(_elem21);
                  }
                  iprot.readListEnd();
                }
                this.all_parts.put(_key17, _val18);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case ROLE:
          if (__field.type == TType.I32) {
            this.role = HostRole.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case GIT_INFO_SHA:
          if (__field.type == TType.STRING) {
            this.git_info_sha = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case ZONE_NAME:
          if (__field.type == TType.STRING) {
            this.zone_name = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, __field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.hostAddr != null) {
      oprot.writeFieldBegin(HOST_ADDR_FIELD_DESC);
      this.hostAddr.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.status != null) {
      oprot.writeFieldBegin(STATUS_FIELD_DESC);
      oprot.writeI32(this.status == null ? 0 : this.status.getValue());
      oprot.writeFieldEnd();
    }
    if (this.leader_parts != null) {
      oprot.writeFieldBegin(LEADER_PARTS_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.LIST, this.leader_parts.size()));
        for (Map.Entry<byte[], List<Integer>> _iter22 : this.leader_parts.entrySet())        {
          oprot.writeBinary(_iter22.getKey());
          {
            oprot.writeListBegin(new TList(TType.I32, _iter22.getValue().size()));
            for (int _iter23 : _iter22.getValue())            {
              oprot.writeI32(_iter23);
            }
            oprot.writeListEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.all_parts != null) {
      oprot.writeFieldBegin(ALL_PARTS_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.LIST, this.all_parts.size()));
        for (Map.Entry<byte[], List<Integer>> _iter24 : this.all_parts.entrySet())        {
          oprot.writeBinary(_iter24.getKey());
          {
            oprot.writeListBegin(new TList(TType.I32, _iter24.getValue().size()));
            for (int _iter25 : _iter24.getValue())            {
              oprot.writeI32(_iter25);
            }
            oprot.writeListEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.role != null) {
      oprot.writeFieldBegin(ROLE_FIELD_DESC);
      oprot.writeI32(this.role == null ? 0 : this.role.getValue());
      oprot.writeFieldEnd();
    }
    if (this.git_info_sha != null) {
      oprot.writeFieldBegin(GIT_INFO_SHA_FIELD_DESC);
      oprot.writeBinary(this.git_info_sha);
      oprot.writeFieldEnd();
    }
    if (this.zone_name != null) {
      if (isSetZone_name()) {
        oprot.writeFieldBegin(ZONE_NAME_FIELD_DESC);
        oprot.writeBinary(this.zone_name);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
    String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("HostItem");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("hostAddr");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getHostAddr() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getHostAddr(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("status");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getStatus() == null) {
      sb.append("null");
    } else {
      String status_name = this.getStatus() == null ? "null" : this.getStatus().name();
      if (status_name != null) {
        sb.append(status_name);
        sb.append(" (");
      }
      sb.append(this.getStatus());
      if (status_name != null) {
        sb.append(")");
      }
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("leader_parts");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getLeader_parts() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getLeader_parts(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("all_parts");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getAll_parts() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getAll_parts(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("role");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getRole() == null) {
      sb.append("null");
    } else {
      String role_name = this.getRole() == null ? "null" : this.getRole().name();
      if (role_name != null) {
        sb.append(role_name);
        sb.append(" (");
      }
      sb.append(this.getRole());
      if (role_name != null) {
        sb.append(")");
      }
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("git_info_sha");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getGit_info_sha() == null) {
      sb.append("null");
    } else {
        int __git_info_sha_size = Math.min(this.getGit_info_sha().length, 128);
        for (int i = 0; i < __git_info_sha_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this.getGit_info_sha()[i]).length() > 1 ? Integer.toHexString(this.getGit_info_sha()[i]).substring(Integer.toHexString(this.getGit_info_sha()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this.getGit_info_sha()[i]).toUpperCase());
        }
        if (this.getGit_info_sha().length > 128) sb.append(" ...");
    }
    first = false;
    if (isSetZone_name())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("zone_name");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getZone_name() == null) {
        sb.append("null");
      } else {
          int __zone_name_size = Math.min(this.getZone_name().length, 128);
          for (int i = 0; i < __zone_name_size; i++) {
            if (i != 0) sb.append(" ");
            sb.append(Integer.toHexString(this.getZone_name()[i]).length() > 1 ? Integer.toHexString(this.getZone_name()[i]).substring(Integer.toHexString(this.getZone_name()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this.getZone_name()[i]).toUpperCase());
          }
          if (this.getZone_name().length > 128) sb.append(" ...");
      }
      first = false;
    }
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

