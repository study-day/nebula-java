/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.graph;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class ExecutionResponse implements TBase, java.io.Serializable, Cloneable, Comparable<ExecutionResponse> {
  private static final TStruct STRUCT_DESC = new TStruct("ExecutionResponse");
  private static final TField ERROR_CODE_FIELD_DESC = new TField("error_code", TType.I32, (short)1);
  private static final TField LATENCY_IN_US_FIELD_DESC = new TField("latency_in_us", TType.I32, (short)2);
  private static final TField ERROR_MSG_FIELD_DESC = new TField("error_msg", TType.STRING, (short)3);
  private static final TField COLUMN_NAMES_FIELD_DESC = new TField("column_names", TType.LIST, (short)4);
  private static final TField ROWS_FIELD_DESC = new TField("rows", TType.LIST, (short)5);
  private static final TField SPACE_NAME_FIELD_DESC = new TField("space_name", TType.STRING, (short)6);

  /**
   * 
   * @see ErrorCode
   */
  public int error_code;
  public int latency_in_us;
  public String error_msg;
  public List<byte[]> column_names;
  public List<RowValue> rows;
  public String space_name;
  public static final int ERROR_CODE = 1;
  public static final int LATENCY_IN_US = 2;
  public static final int ERROR_MSG = 3;
  public static final int COLUMN_NAMES = 4;
  public static final int ROWS = 5;
  public static final int SPACE_NAME = 6;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __ERROR_CODE_ISSET_ID = 0;
  private static final int __LATENCY_IN_US_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(ERROR_CODE, new FieldMetaData("error_code", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(LATENCY_IN_US, new FieldMetaData("latency_in_us", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(ERROR_MSG, new FieldMetaData("error_msg", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(COLUMN_NAMES, new FieldMetaData("column_names", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.STRING))));
    tmpMetaDataMap.put(ROWS, new FieldMetaData("rows", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, RowValue.class))));
    tmpMetaDataMap.put(SPACE_NAME, new FieldMetaData("space_name", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(ExecutionResponse.class, metaDataMap);
  }

  public ExecutionResponse() {
  }

  public ExecutionResponse(
    int error_code,
    int latency_in_us)
  {
    this();
    this.error_code = error_code;
    setError_codeIsSet(true);
    this.latency_in_us = latency_in_us;
    setLatency_in_usIsSet(true);
  }

  public ExecutionResponse(
    int error_code,
    int latency_in_us,
    String error_msg,
    List<byte[]> column_names,
    List<RowValue> rows,
    String space_name)
  {
    this();
    this.error_code = error_code;
    setError_codeIsSet(true);
    this.latency_in_us = latency_in_us;
    setLatency_in_usIsSet(true);
    this.error_msg = error_msg;
    this.column_names = column_names;
    this.rows = rows;
    this.space_name = space_name;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ExecutionResponse(ExecutionResponse other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.error_code = TBaseHelper.deepCopy(other.error_code);
    this.latency_in_us = TBaseHelper.deepCopy(other.latency_in_us);
    if (other.isSetError_msg()) {
      this.error_msg = TBaseHelper.deepCopy(other.error_msg);
    }
    if (other.isSetColumn_names()) {
      this.column_names = TBaseHelper.deepCopy(other.column_names);
    }
    if (other.isSetRows()) {
      this.rows = TBaseHelper.deepCopy(other.rows);
    }
    if (other.isSetSpace_name()) {
      this.space_name = TBaseHelper.deepCopy(other.space_name);
    }
  }

  public ExecutionResponse deepCopy() {
    return new ExecutionResponse(this);
  }

  @Deprecated
  public ExecutionResponse clone() {
    return new ExecutionResponse(this);
  }

  /**
   * 
   * @see ErrorCode
   */
  public int  getError_code() {
    return this.error_code;
  }

  /**
   * 
   * @see ErrorCode
   */
  public ExecutionResponse setError_code(int error_code) {
    this.error_code = error_code;
    setError_codeIsSet(true);
    return this;
  }

  public void unsetError_code() {
    __isset_bit_vector.clear(__ERROR_CODE_ISSET_ID);
  }

  // Returns true if field error_code is set (has been assigned a value) and false otherwise
  public boolean isSetError_code() {
    return __isset_bit_vector.get(__ERROR_CODE_ISSET_ID);
  }

  public void setError_codeIsSet(boolean value) {
    __isset_bit_vector.set(__ERROR_CODE_ISSET_ID, value);
  }

  public int  getLatency_in_us() {
    return this.latency_in_us;
  }

  public ExecutionResponse setLatency_in_us(int latency_in_us) {
    this.latency_in_us = latency_in_us;
    setLatency_in_usIsSet(true);
    return this;
  }

  public void unsetLatency_in_us() {
    __isset_bit_vector.clear(__LATENCY_IN_US_ISSET_ID);
  }

  // Returns true if field latency_in_us is set (has been assigned a value) and false otherwise
  public boolean isSetLatency_in_us() {
    return __isset_bit_vector.get(__LATENCY_IN_US_ISSET_ID);
  }

  public void setLatency_in_usIsSet(boolean value) {
    __isset_bit_vector.set(__LATENCY_IN_US_ISSET_ID, value);
  }

  public String  getError_msg() {
    return this.error_msg;
  }

  public ExecutionResponse setError_msg(String error_msg) {
    this.error_msg = error_msg;
    return this;
  }

  public void unsetError_msg() {
    this.error_msg = null;
  }

  // Returns true if field error_msg is set (has been assigned a value) and false otherwise
  public boolean isSetError_msg() {
    return this.error_msg != null;
  }

  public void setError_msgIsSet(boolean value) {
    if (!value) {
      this.error_msg = null;
    }
  }

  public List<byte[]>  getColumn_names() {
    return this.column_names;
  }

  public ExecutionResponse setColumn_names(List<byte[]> column_names) {
    this.column_names = column_names;
    return this;
  }

  public void unsetColumn_names() {
    this.column_names = null;
  }

  // Returns true if field column_names is set (has been assigned a value) and false otherwise
  public boolean isSetColumn_names() {
    return this.column_names != null;
  }

  public void setColumn_namesIsSet(boolean value) {
    if (!value) {
      this.column_names = null;
    }
  }

  public List<RowValue>  getRows() {
    return this.rows;
  }

  public ExecutionResponse setRows(List<RowValue> rows) {
    this.rows = rows;
    return this;
  }

  public void unsetRows() {
    this.rows = null;
  }

  // Returns true if field rows is set (has been assigned a value) and false otherwise
  public boolean isSetRows() {
    return this.rows != null;
  }

  public void setRowsIsSet(boolean value) {
    if (!value) {
      this.rows = null;
    }
  }

  public String  getSpace_name() {
    return this.space_name;
  }

  public ExecutionResponse setSpace_name(String space_name) {
    this.space_name = space_name;
    return this;
  }

  public void unsetSpace_name() {
    this.space_name = null;
  }

  // Returns true if field space_name is set (has been assigned a value) and false otherwise
  public boolean isSetSpace_name() {
    return this.space_name != null;
  }

  public void setSpace_nameIsSet(boolean value) {
    if (!value) {
      this.space_name = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case ERROR_CODE:
      if (value == null) {
        unsetError_code();
      } else {
        setError_code((Integer)value);
      }
      break;

    case LATENCY_IN_US:
      if (value == null) {
        unsetLatency_in_us();
      } else {
        setLatency_in_us((Integer)value);
      }
      break;

    case ERROR_MSG:
      if (value == null) {
        unsetError_msg();
      } else {
        setError_msg((String)value);
      }
      break;

    case COLUMN_NAMES:
      if (value == null) {
        unsetColumn_names();
      } else {
        setColumn_names((List<byte[]>)value);
      }
      break;

    case ROWS:
      if (value == null) {
        unsetRows();
      } else {
        setRows((List<RowValue>)value);
      }
      break;

    case SPACE_NAME:
      if (value == null) {
        unsetSpace_name();
      } else {
        setSpace_name((String)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case ERROR_CODE:
      return getError_code();

    case LATENCY_IN_US:
      return new Integer(getLatency_in_us());

    case ERROR_MSG:
      return getError_msg();

    case COLUMN_NAMES:
      return getColumn_names();

    case ROWS:
      return getRows();

    case SPACE_NAME:
      return getSpace_name();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case ERROR_CODE:
      return isSetError_code();
    case LATENCY_IN_US:
      return isSetLatency_in_us();
    case ERROR_MSG:
      return isSetError_msg();
    case COLUMN_NAMES:
      return isSetColumn_names();
    case ROWS:
      return isSetRows();
    case SPACE_NAME:
      return isSetSpace_name();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ExecutionResponse)
      return this.equals((ExecutionResponse)that);
    return false;
  }

  public boolean equals(ExecutionResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_error_code = true;
    boolean that_present_error_code = true;
    if (this_present_error_code || that_present_error_code) {
      if (!(this_present_error_code && that_present_error_code))
        return false;
      if (!TBaseHelper.equalsNobinary(this.error_code, that.error_code))
        return false;
    }

    boolean this_present_latency_in_us = true;
    boolean that_present_latency_in_us = true;
    if (this_present_latency_in_us || that_present_latency_in_us) {
      if (!(this_present_latency_in_us && that_present_latency_in_us))
        return false;
      if (!TBaseHelper.equalsNobinary(this.latency_in_us, that.latency_in_us))
        return false;
    }

    boolean this_present_error_msg = true && this.isSetError_msg();
    boolean that_present_error_msg = true && that.isSetError_msg();
    if (this_present_error_msg || that_present_error_msg) {
      if (!(this_present_error_msg && that_present_error_msg))
        return false;
      if (!TBaseHelper.equalsNobinary(this.error_msg, that.error_msg))
        return false;
    }

    boolean this_present_column_names = true && this.isSetColumn_names();
    boolean that_present_column_names = true && that.isSetColumn_names();
    if (this_present_column_names || that_present_column_names) {
      if (!(this_present_column_names && that_present_column_names))
        return false;
      if (!TBaseHelper.equalsSlow(this.column_names, that.column_names))
        return false;
    }

    boolean this_present_rows = true && this.isSetRows();
    boolean that_present_rows = true && that.isSetRows();
    if (this_present_rows || that_present_rows) {
      if (!(this_present_rows && that_present_rows))
        return false;
      if (!TBaseHelper.equalsNobinary(this.rows, that.rows))
        return false;
    }

    boolean this_present_space_name = true && this.isSetSpace_name();
    boolean that_present_space_name = true && that.isSetSpace_name();
    if (this_present_space_name || that_present_space_name) {
      if (!(this_present_space_name && that_present_space_name))
        return false;
      if (!TBaseHelper.equalsNobinary(this.space_name, that.space_name))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_error_code = true;
    builder.append(present_error_code);
    if (present_error_code)
      builder.append(error_code);

    boolean present_latency_in_us = true;
    builder.append(present_latency_in_us);
    if (present_latency_in_us)
      builder.append(latency_in_us);

    boolean present_error_msg = true && (isSetError_msg());
    builder.append(present_error_msg);
    if (present_error_msg)
      builder.append(error_msg);

    boolean present_column_names = true && (isSetColumn_names());
    builder.append(present_column_names);
    if (present_column_names)
      builder.append(column_names);

    boolean present_rows = true && (isSetRows());
    builder.append(present_rows);
    if (present_rows)
      builder.append(rows);

    boolean present_space_name = true && (isSetSpace_name());
    builder.append(present_space_name);
    if (present_space_name)
      builder.append(space_name);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(ExecutionResponse other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetError_code()).compareTo(other.isSetError_code());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(error_code, other.error_code);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetLatency_in_us()).compareTo(other.isSetLatency_in_us());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(latency_in_us, other.latency_in_us);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetError_msg()).compareTo(other.isSetError_msg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(error_msg, other.error_msg);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetColumn_names()).compareTo(other.isSetColumn_names());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(column_names, other.column_names);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetRows()).compareTo(other.isSetRows());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(rows, other.rows);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetSpace_name()).compareTo(other.isSetSpace_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(space_name, other.space_name);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case ERROR_CODE:
          if (field.type == TType.I32) {
            this.error_code = iprot.readI32();
            setError_codeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case LATENCY_IN_US:
          if (field.type == TType.I32) {
            this.latency_in_us = iprot.readI32();
            setLatency_in_usIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case ERROR_MSG:
          if (field.type == TType.STRING) {
            this.error_msg = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case COLUMN_NAMES:
          if (field.type == TType.LIST) {
            {
              TList _list4 = iprot.readListBegin();
              this.column_names = new ArrayList<byte[]>(Math.max(0, _list4.size));
              for (int _i5 = 0; 
                   (_list4.size < 0) ? iprot.peekList() : (_i5 < _list4.size); 
                   ++_i5)
              {
                byte[] _elem6;
                _elem6 = iprot.readBinary();
                this.column_names.add(_elem6);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case ROWS:
          if (field.type == TType.LIST) {
            {
              TList _list7 = iprot.readListBegin();
              this.rows = new ArrayList<RowValue>(Math.max(0, _list7.size));
              for (int _i8 = 0; 
                   (_list7.size < 0) ? iprot.peekList() : (_i8 < _list7.size); 
                   ++_i8)
              {
                RowValue _elem9;
                _elem9 = new RowValue();
                _elem9.read(iprot);
                this.rows.add(_elem9);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SPACE_NAME:
          if (field.type == TType.STRING) {
            this.space_name = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    if (!isSetError_code()) {
      throw new TProtocolException("Required field 'error_code' was not found in serialized data! Struct: " + toString());
    }
    if (!isSetLatency_in_us()) {
      throw new TProtocolException("Required field 'latency_in_us' was not found in serialized data! Struct: " + toString());
    }
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(ERROR_CODE_FIELD_DESC);
    oprot.writeI32(this.error_code);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(LATENCY_IN_US_FIELD_DESC);
    oprot.writeI32(this.latency_in_us);
    oprot.writeFieldEnd();
    if (this.error_msg != null) {
      if (isSetError_msg()) {
        oprot.writeFieldBegin(ERROR_MSG_FIELD_DESC);
        oprot.writeString(this.error_msg);
        oprot.writeFieldEnd();
      }
    }
    if (this.column_names != null) {
      if (isSetColumn_names()) {
        oprot.writeFieldBegin(COLUMN_NAMES_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.column_names.size()));
          for (byte[] _iter10 : this.column_names)          {
            oprot.writeBinary(_iter10);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.rows != null) {
      if (isSetRows()) {
        oprot.writeFieldBegin(ROWS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.rows.size()));
          for (RowValue _iter11 : this.rows)          {
            _iter11.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.space_name != null) {
      if (isSetSpace_name()) {
        oprot.writeFieldBegin(SPACE_NAME_FIELD_DESC);
        oprot.writeString(this.space_name);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("ExecutionResponse");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("error_code");
    sb.append(space);
    sb.append(":").append(space);
    String error_code_name = ErrorCode.VALUES_TO_NAMES.get(this. getError_code());
    if (error_code_name != null) {
      sb.append(error_code_name);
      sb.append(" (");
    }
    sb.append(this. getError_code());
    if (error_code_name != null) {
      sb.append(")");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("latency_in_us");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getLatency_in_us(), indent + 1, prettyPrint));
    first = false;
    if (isSetError_msg())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("error_msg");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getError_msg() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getError_msg(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (isSetColumn_names())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("column_names");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getColumn_names() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getColumn_names(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (isSetRows())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("rows");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getRows() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getRows(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (isSetSpace_name())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("space_name");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getSpace_name() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getSpace_name(), indent + 1, prettyPrint));
      }
      first = false;
    }
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // alas, we cannot check 'error_code' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'latency_in_us' because it's a primitive and you chose the non-beans generator.
    // check that fields of type enum have valid values
    if (isSetError_code() && !ErrorCode.VALID_VALUES.contains(error_code)){
      throw new TProtocolException("The field 'error_code' has been assigned the invalid value " + error_code);
    }
  }

}

