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
public class BackupMeta implements TBase, java.io.Serializable, Cloneable, Comparable<BackupMeta> {
  private static final TStruct STRUCT_DESC = new TStruct("BackupMeta");
  private static final TField BACKUP_INFO_FIELD_DESC = new TField("backup_info", TType.MAP, (short)1);
  private static final TField META_FILES_FIELD_DESC = new TField("meta_files", TType.LIST, (short)2);
  private static final TField BACKUP_NAME_FIELD_DESC = new TField("backup_name", TType.STRING, (short)3);

  public Map<Integer,SpaceBackupInfo> backup_info;
  public List<byte[]> meta_files;
  public byte[] backup_name;
  public static final int BACKUP_INFO = 1;
  public static final int META_FILES = 2;
  public static final int BACKUP_NAME = 3;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(BACKUP_INFO, new FieldMetaData("backup_info", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.I32), 
            new StructMetaData(TType.STRUCT, SpaceBackupInfo.class))));
    tmpMetaDataMap.put(META_FILES, new FieldMetaData("meta_files", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.STRING))));
    tmpMetaDataMap.put(BACKUP_NAME, new FieldMetaData("backup_name", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(BackupMeta.class, metaDataMap);
  }

  public BackupMeta() {
  }

  public BackupMeta(
      Map<Integer,SpaceBackupInfo> backup_info,
      List<byte[]> meta_files,
      byte[] backup_name) {
    this();
    this.backup_info = backup_info;
    this.meta_files = meta_files;
    this.backup_name = backup_name;
  }

  public static class Builder {
    private Map<Integer,SpaceBackupInfo> backup_info;
    private List<byte[]> meta_files;
    private byte[] backup_name;

    public Builder() {
    }

    public Builder setBackup_info(final Map<Integer,SpaceBackupInfo> backup_info) {
      this.backup_info = backup_info;
      return this;
    }

    public Builder setMeta_files(final List<byte[]> meta_files) {
      this.meta_files = meta_files;
      return this;
    }

    public Builder setBackup_name(final byte[] backup_name) {
      this.backup_name = backup_name;
      return this;
    }

    public BackupMeta build() {
      BackupMeta result = new BackupMeta();
      result.setBackup_info(this.backup_info);
      result.setMeta_files(this.meta_files);
      result.setBackup_name(this.backup_name);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BackupMeta(BackupMeta other) {
    if (other.isSetBackup_info()) {
      this.backup_info = TBaseHelper.deepCopy(other.backup_info);
    }
    if (other.isSetMeta_files()) {
      this.meta_files = TBaseHelper.deepCopy(other.meta_files);
    }
    if (other.isSetBackup_name()) {
      this.backup_name = TBaseHelper.deepCopy(other.backup_name);
    }
  }

  public BackupMeta deepCopy() {
    return new BackupMeta(this);
  }

  public Map<Integer,SpaceBackupInfo> getBackup_info() {
    return this.backup_info;
  }

  public BackupMeta setBackup_info(Map<Integer,SpaceBackupInfo> backup_info) {
    this.backup_info = backup_info;
    return this;
  }

  public void unsetBackup_info() {
    this.backup_info = null;
  }

  // Returns true if field backup_info is set (has been assigned a value) and false otherwise
  public boolean isSetBackup_info() {
    return this.backup_info != null;
  }

  public void setBackup_infoIsSet(boolean __value) {
    if (!__value) {
      this.backup_info = null;
    }
  }

  public List<byte[]> getMeta_files() {
    return this.meta_files;
  }

  public BackupMeta setMeta_files(List<byte[]> meta_files) {
    this.meta_files = meta_files;
    return this;
  }

  public void unsetMeta_files() {
    this.meta_files = null;
  }

  // Returns true if field meta_files is set (has been assigned a value) and false otherwise
  public boolean isSetMeta_files() {
    return this.meta_files != null;
  }

  public void setMeta_filesIsSet(boolean __value) {
    if (!__value) {
      this.meta_files = null;
    }
  }

  public byte[] getBackup_name() {
    return this.backup_name;
  }

  public BackupMeta setBackup_name(byte[] backup_name) {
    this.backup_name = backup_name;
    return this;
  }

  public void unsetBackup_name() {
    this.backup_name = null;
  }

  // Returns true if field backup_name is set (has been assigned a value) and false otherwise
  public boolean isSetBackup_name() {
    return this.backup_name != null;
  }

  public void setBackup_nameIsSet(boolean __value) {
    if (!__value) {
      this.backup_name = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case BACKUP_INFO:
      if (__value == null) {
        unsetBackup_info();
      } else {
        setBackup_info((Map<Integer,SpaceBackupInfo>)__value);
      }
      break;

    case META_FILES:
      if (__value == null) {
        unsetMeta_files();
      } else {
        setMeta_files((List<byte[]>)__value);
      }
      break;

    case BACKUP_NAME:
      if (__value == null) {
        unsetBackup_name();
      } else {
        setBackup_name((byte[])__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case BACKUP_INFO:
      return getBackup_info();

    case META_FILES:
      return getMeta_files();

    case BACKUP_NAME:
      return getBackup_name();

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
    if (!(_that instanceof BackupMeta))
      return false;
    BackupMeta that = (BackupMeta)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetBackup_info(), that.isSetBackup_info(), this.backup_info, that.backup_info)) { return false; }

    if (!TBaseHelper.equalsSlow(this.isSetMeta_files(), that.isSetMeta_files(), this.meta_files, that.meta_files)) { return false; }

    if (!TBaseHelper.equalsSlow(this.isSetBackup_name(), that.isSetBackup_name(), this.backup_name, that.backup_name)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {backup_info, meta_files, backup_name});
  }

  @Override
  public int compareTo(BackupMeta other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBackup_info()).compareTo(other.isSetBackup_info());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(backup_info, other.backup_info);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetMeta_files()).compareTo(other.isSetMeta_files());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(meta_files, other.meta_files);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetBackup_name()).compareTo(other.isSetBackup_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(backup_name, other.backup_name);
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
        case BACKUP_INFO:
          if (__field.type == TType.MAP) {
            {
              TMap _map241 = iprot.readMapBegin();
              this.backup_info = new HashMap<Integer,SpaceBackupInfo>(Math.max(0, 2*_map241.size));
              for (int _i242 = 0; 
                   (_map241.size < 0) ? iprot.peekMap() : (_i242 < _map241.size); 
                   ++_i242)
              {
                int _key243;
                SpaceBackupInfo _val244;
                _key243 = iprot.readI32();
                _val244 = new SpaceBackupInfo();
                _val244.read(iprot);
                this.backup_info.put(_key243, _val244);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case META_FILES:
          if (__field.type == TType.LIST) {
            {
              TList _list245 = iprot.readListBegin();
              this.meta_files = new ArrayList<byte[]>(Math.max(0, _list245.size));
              for (int _i246 = 0; 
                   (_list245.size < 0) ? iprot.peekList() : (_i246 < _list245.size); 
                   ++_i246)
              {
                byte[] _elem247;
                _elem247 = iprot.readBinary();
                this.meta_files.add(_elem247);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case BACKUP_NAME:
          if (__field.type == TType.STRING) {
            this.backup_name = iprot.readBinary();
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
    if (this.backup_info != null) {
      oprot.writeFieldBegin(BACKUP_INFO_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.I32, TType.STRUCT, this.backup_info.size()));
        for (Map.Entry<Integer, SpaceBackupInfo> _iter248 : this.backup_info.entrySet())        {
          oprot.writeI32(_iter248.getKey());
          _iter248.getValue().write(oprot);
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.meta_files != null) {
      oprot.writeFieldBegin(META_FILES_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.meta_files.size()));
        for (byte[] _iter249 : this.meta_files)        {
          oprot.writeBinary(_iter249);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.backup_name != null) {
      oprot.writeFieldBegin(BACKUP_NAME_FIELD_DESC);
      oprot.writeBinary(this.backup_name);
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
    StringBuilder sb = new StringBuilder("BackupMeta");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("backup_info");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getBackup_info() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getBackup_info(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("meta_files");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getMeta_files() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getMeta_files(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("backup_name");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getBackup_name() == null) {
      sb.append("null");
    } else {
        int __backup_name_size = Math.min(this.getBackup_name().length, 128);
        for (int i = 0; i < __backup_name_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this.getBackup_name()[i]).length() > 1 ? Integer.toHexString(this.getBackup_name()[i]).substring(Integer.toHexString(this.getBackup_name()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this.getBackup_name()[i]).toUpperCase());
        }
        if (this.getBackup_name().length > 128) sb.append(" ...");
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

