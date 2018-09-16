/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.politecnica.federico.hdfswritertest1;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-09-11")
public class UsesEdge implements org.apache.thrift.TBase<UsesEdge, UsesEdge._Fields>, java.io.Serializable, Cloneable, Comparable<UsesEdge> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UsesEdge");

  private static final org.apache.thrift.protocol.TField ATTACK_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("attackId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField WEAPON_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("weaponId", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UsesEdgeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UsesEdgeTupleSchemeFactory();

  public long attackId; // required
  public long weaponId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ATTACK_ID((short)1, "attackId"),
    WEAPON_ID((short)2, "weaponId");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ATTACK_ID
          return ATTACK_ID;
        case 2: // WEAPON_ID
          return WEAPON_ID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ATTACKID_ISSET_ID = 0;
  private static final int __WEAPONID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ATTACK_ID, new org.apache.thrift.meta_data.FieldMetaData("attackId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.WEAPON_ID, new org.apache.thrift.meta_data.FieldMetaData("weaponId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UsesEdge.class, metaDataMap);
  }

  public UsesEdge() {
  }

  public UsesEdge(
    long attackId,
    long weaponId)
  {
    this();
    this.attackId = attackId;
    setAttackIdIsSet(true);
    this.weaponId = weaponId;
    setWeaponIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UsesEdge(UsesEdge other) {
    __isset_bitfield = other.__isset_bitfield;
    this.attackId = other.attackId;
    this.weaponId = other.weaponId;
  }

  public UsesEdge deepCopy() {
    return new UsesEdge(this);
  }

  @Override
  public void clear() {
    setAttackIdIsSet(false);
    this.attackId = 0;
    setWeaponIdIsSet(false);
    this.weaponId = 0;
  }

  public long getAttackId() {
    return this.attackId;
  }

  public UsesEdge setAttackId(long attackId) {
    this.attackId = attackId;
    setAttackIdIsSet(true);
    return this;
  }

  public void unsetAttackId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ATTACKID_ISSET_ID);
  }

  /** Returns true if field attackId is set (has been assigned a value) and false otherwise */
  public boolean isSetAttackId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ATTACKID_ISSET_ID);
  }

  public void setAttackIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ATTACKID_ISSET_ID, value);
  }

  public long getWeaponId() {
    return this.weaponId;
  }

  public UsesEdge setWeaponId(long weaponId) {
    this.weaponId = weaponId;
    setWeaponIdIsSet(true);
    return this;
  }

  public void unsetWeaponId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __WEAPONID_ISSET_ID);
  }

  /** Returns true if field weaponId is set (has been assigned a value) and false otherwise */
  public boolean isSetWeaponId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __WEAPONID_ISSET_ID);
  }

  public void setWeaponIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __WEAPONID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ATTACK_ID:
      if (value == null) {
        unsetAttackId();
      } else {
        setAttackId((java.lang.Long)value);
      }
      break;

    case WEAPON_ID:
      if (value == null) {
        unsetWeaponId();
      } else {
        setWeaponId((java.lang.Long)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ATTACK_ID:
      return getAttackId();

    case WEAPON_ID:
      return getWeaponId();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ATTACK_ID:
      return isSetAttackId();
    case WEAPON_ID:
      return isSetWeaponId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof UsesEdge)
      return this.equals((UsesEdge)that);
    return false;
  }

  public boolean equals(UsesEdge that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_attackId = true;
    boolean that_present_attackId = true;
    if (this_present_attackId || that_present_attackId) {
      if (!(this_present_attackId && that_present_attackId))
        return false;
      if (this.attackId != that.attackId)
        return false;
    }

    boolean this_present_weaponId = true;
    boolean that_present_weaponId = true;
    if (this_present_weaponId || that_present_weaponId) {
      if (!(this_present_weaponId && that_present_weaponId))
        return false;
      if (this.weaponId != that.weaponId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(attackId);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(weaponId);

    return hashCode;
  }

  @Override
  public int compareTo(UsesEdge other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetAttackId()).compareTo(other.isSetAttackId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAttackId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.attackId, other.attackId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetWeaponId()).compareTo(other.isSetWeaponId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWeaponId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.weaponId, other.weaponId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("UsesEdge(");
    boolean first = true;

    sb.append("attackId:");
    sb.append(this.attackId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("weaponId:");
    sb.append(this.weaponId);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class UsesEdgeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UsesEdgeStandardScheme getScheme() {
      return new UsesEdgeStandardScheme();
    }
  }

  private static class UsesEdgeStandardScheme extends org.apache.thrift.scheme.StandardScheme<UsesEdge> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UsesEdge struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ATTACK_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.attackId = iprot.readI64();
              struct.setAttackIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // WEAPON_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.weaponId = iprot.readI64();
              struct.setWeaponIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, UsesEdge struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ATTACK_ID_FIELD_DESC);
      oprot.writeI64(struct.attackId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(WEAPON_ID_FIELD_DESC);
      oprot.writeI64(struct.weaponId);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UsesEdgeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UsesEdgeTupleScheme getScheme() {
      return new UsesEdgeTupleScheme();
    }
  }

  private static class UsesEdgeTupleScheme extends org.apache.thrift.scheme.TupleScheme<UsesEdge> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UsesEdge struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetAttackId()) {
        optionals.set(0);
      }
      if (struct.isSetWeaponId()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetAttackId()) {
        oprot.writeI64(struct.attackId);
      }
      if (struct.isSetWeaponId()) {
        oprot.writeI64(struct.weaponId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UsesEdge struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.attackId = iprot.readI64();
        struct.setAttackIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.weaponId = iprot.readI64();
        struct.setWeaponIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

