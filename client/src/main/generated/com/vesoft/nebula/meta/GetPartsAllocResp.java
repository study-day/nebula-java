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
public class GetPartsAllocResp implements TBase, java.io.Serializable, Cloneable, Comparable<GetPartsAllocResp> {
  private static final TStruct STRUCT_DESC = new TStruct("GetPartsAllocResp");
  private static final TField CODE_FIELD_DESC = new TField("code", TType.I32, (short)1);
  private static final TField LEADER_FIELD_DESC = new TField("leader", TType.STRUCT, (short)2);
  private static final TField PARTS_FIELD_DESC = new TField("parts", TType.MAP, (short)3);

  /**
   * 
   * @see com.vesoft.nebula.ErrorCode
   */
  public com.vesoft.nebula.ErrorCode code;
  public com.vesoft.nebula.HostAddr leader;
  public Map<Integer,List<com.vesoft.nebula.HostAddr>> parts;
  public static final int CODE = 1;
  public static final int LEADER = 2;
  public static final int PARTS = 3;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(CODE, new FieldMetaData("code", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(LEADER, new FieldMetaData("leader", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, com.vesoft.nebula.HostAddr.class)));
    tmpMetaDataMap.put(PARTS, new FieldMetaData("parts", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.I32), 
            new ListMetaData(TType.LIST, 
                new StructMetaData(TType.STRUCT, com.vesoft.nebula.HostAddr.class)))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(GetPartsAllocResp.class, metaDataMap);
  }

  public GetPartsAllocResp() {
  }

  public GetPartsAllocResp(
      com.vesoft.nebula.ErrorCode code,
      com.vesoft.nebula.HostAddr leader,
      Map<Integer,List<com.vesoft.nebula.HostAddr>> parts) {
    this();
    this.code = code;
    this.leader = leader;
    this.parts = parts;
  }

  public static class Builder {
    private com.vesoft.nebula.ErrorCode code;
    private com.vesoft.nebula.HostAddr leader;
    private Map<Integer,List<com.vesoft.nebula.HostAddr>> parts;

    public Builder() {
    }

    public Builder setCode(final com.vesoft.nebula.ErrorCode code) {
      this.code = code;
      return this;
    }

    public Builder setLeader(final com.vesoft.nebula.HostAddr leader) {
      this.leader = leader;
      return this;
    }

    public Builder setParts(final Map<Integer,List<com.vesoft.nebula.HostAddr>> parts) {
      this.parts = parts;
      return this;
    }

    public GetPartsAllocResp build() {
      GetPartsAllocResp result = new GetPartsAllocResp();
      result.setCode(this.code);
      result.setLeader(this.leader);
      result.setParts(this.parts);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetPartsAllocResp(GetPartsAllocResp other) {
    if (other.isSetCode()) {
      this.code = TBaseHelper.deepCopy(other.code);
    }
    if (other.isSetLeader()) {
      this.leader = TBaseHelper.deepCopy(other.leader);
    }
    if (other.isSetParts()) {
      this.parts = TBaseHelper.deepCopy(other.parts);
    }
  }

  public GetPartsAllocResp deepCopy() {
    return new GetPartsAllocResp(this);
  }

  /**
   * 
   * @see com.vesoft.nebula.ErrorCode
   */
  public com.vesoft.nebula.ErrorCode getCode() {
    return this.code;
  }

  /**
   * 
   * @see com.vesoft.nebula.ErrorCode
   */
  public GetPartsAllocResp setCode(com.vesoft.nebula.ErrorCode code) {
    this.code = code;
    return this;
  }

  public void unsetCode() {
    this.code = null;
  }

  // Returns true if field code is set (has been assigned a value) and false otherwise
  public boolean isSetCode() {
    return this.code != null;
  }

  public void setCodeIsSet(boolean __value) {
    if (!__value) {
      this.code = null;
    }
  }

  public com.vesoft.nebula.HostAddr getLeader() {
    return this.leader;
  }

  public GetPartsAllocResp setLeader(com.vesoft.nebula.HostAddr leader) {
    this.leader = leader;
    return this;
  }

  public void unsetLeader() {
    this.leader = null;
  }

  // Returns true if field leader is set (has been assigned a value) and false otherwise
  public boolean isSetLeader() {
    return this.leader != null;
  }

  public void setLeaderIsSet(boolean __value) {
    if (!__value) {
      this.leader = null;
    }
  }

  public Map<Integer,List<com.vesoft.nebula.HostAddr>> getParts() {
    return this.parts;
  }

  public GetPartsAllocResp setParts(Map<Integer,List<com.vesoft.nebula.HostAddr>> parts) {
    this.parts = parts;
    return this;
  }

  public void unsetParts() {
    this.parts = null;
  }

  // Returns true if field parts is set (has been assigned a value) and false otherwise
  public boolean isSetParts() {
    return this.parts != null;
  }

  public void setPartsIsSet(boolean __value) {
    if (!__value) {
      this.parts = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case CODE:
      if (__value == null) {
        unsetCode();
      } else {
        setCode((com.vesoft.nebula.ErrorCode)__value);
      }
      break;

    case LEADER:
      if (__value == null) {
        unsetLeader();
      } else {
        setLeader((com.vesoft.nebula.HostAddr)__value);
      }
      break;

    case PARTS:
      if (__value == null) {
        unsetParts();
      } else {
        setParts((Map<Integer,List<com.vesoft.nebula.HostAddr>>)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case CODE:
      return getCode();

    case LEADER:
      return getLeader();

    case PARTS:
      return getParts();

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
    if (!(_that instanceof GetPartsAllocResp))
      return false;
    GetPartsAllocResp that = (GetPartsAllocResp)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetCode(), that.isSetCode(), this.code, that.code)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetLeader(), that.isSetLeader(), this.leader, that.leader)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetParts(), that.isSetParts(), this.parts, that.parts)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {code, leader, parts});
  }

  @Override
  public int compareTo(GetPartsAllocResp other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCode()).compareTo(other.isSetCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(code, other.code);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetLeader()).compareTo(other.isSetLeader());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(leader, other.leader);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetParts()).compareTo(other.isSetParts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(parts, other.parts);
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
        case CODE:
          if (__field.type == TType.I32) {
            this.code = com.vesoft.nebula.ErrorCode.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case LEADER:
          if (__field.type == TType.STRUCT) {
            this.leader = new com.vesoft.nebula.HostAddr();
            this.leader.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case PARTS:
          if (__field.type == TType.MAP) {
            {
              TMap _map110 = iprot.readMapBegin();
              this.parts = new HashMap<Integer,List<com.vesoft.nebula.HostAddr>>(Math.max(0, 2*_map110.size));
              for (int _i111 = 0; 
                   (_map110.size < 0) ? iprot.peekMap() : (_i111 < _map110.size); 
                   ++_i111)
              {
                int _key112;
                List<com.vesoft.nebula.HostAddr> _val113;
                _key112 = iprot.readI32();
                {
                  TList _list114 = iprot.readListBegin();
                  _val113 = new ArrayList<com.vesoft.nebula.HostAddr>(Math.max(0, _list114.size));
                  for (int _i115 = 0; 
                       (_list114.size < 0) ? iprot.peekList() : (_i115 < _list114.size); 
                       ++_i115)
                  {
                    com.vesoft.nebula.HostAddr _elem116;
                    _elem116 = new com.vesoft.nebula.HostAddr();
                    _elem116.read(iprot);
                    _val113.add(_elem116);
                  }
                  iprot.readListEnd();
                }
                this.parts.put(_key112, _val113);
              }
              iprot.readMapEnd();
            }
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
    if (this.code != null) {
      oprot.writeFieldBegin(CODE_FIELD_DESC);
      oprot.writeI32(this.code == null ? 0 : this.code.getValue());
      oprot.writeFieldEnd();
    }
    if (this.leader != null) {
      oprot.writeFieldBegin(LEADER_FIELD_DESC);
      this.leader.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.parts != null) {
      oprot.writeFieldBegin(PARTS_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.I32, TType.LIST, this.parts.size()));
        for (Map.Entry<Integer, List<com.vesoft.nebula.HostAddr>> _iter117 : this.parts.entrySet())        {
          oprot.writeI32(_iter117.getKey());
          {
            oprot.writeListBegin(new TList(TType.STRUCT, _iter117.getValue().size()));
            for (com.vesoft.nebula.HostAddr _iter118 : _iter117.getValue())            {
              _iter118.write(oprot);
            }
            oprot.writeListEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
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
    StringBuilder sb = new StringBuilder("GetPartsAllocResp");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("code");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getCode() == null) {
      sb.append("null");
    } else {
      String code_name = this.getCode() == null ? "null" : this.getCode().name();
      if (code_name != null) {
        sb.append(code_name);
        sb.append(" (");
      }
      sb.append(this.getCode());
      if (code_name != null) {
        sb.append(")");
      }
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("leader");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getLeader() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getLeader(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("parts");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getParts() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getParts(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

