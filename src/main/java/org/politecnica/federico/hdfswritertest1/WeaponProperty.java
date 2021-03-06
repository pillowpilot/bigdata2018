/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.politecnica.federico.hdfswritertest1;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-09-25")
public class WeaponProperty implements org.apache.thrift.TBase<WeaponProperty, WeaponProperty._Fields>, java.io.Serializable, Cloneable, Comparable<WeaponProperty> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("WeaponProperty");

  private static final org.apache.thrift.protocol.TField WEAPON_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("weaponId", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField PROPERTY_FIELD_DESC = new org.apache.thrift.protocol.TField("property", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new WeaponPropertyStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new WeaponPropertyTupleSchemeFactory();

  public Weapon weaponId; // required
  public WeaponPropertyValue property; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    WEAPON_ID((short)1, "weaponId"),
    PROPERTY((short)2, "property");

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
        case 1: // WEAPON_ID
          return WEAPON_ID;
        case 2: // PROPERTY
          return PROPERTY;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.WEAPON_ID, new org.apache.thrift.meta_data.FieldMetaData("weaponId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Weapon.class)));
    tmpMap.put(_Fields.PROPERTY, new org.apache.thrift.meta_data.FieldMetaData("property", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, WeaponPropertyValue.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WeaponProperty.class, metaDataMap);
  }

  public WeaponProperty() {
  }

  public WeaponProperty(
    Weapon weaponId,
    WeaponPropertyValue property)
  {
    this();
    this.weaponId = weaponId;
    this.property = property;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WeaponProperty(WeaponProperty other) {
    if (other.isSetWeaponId()) {
      this.weaponId = new Weapon(other.weaponId);
    }
    if (other.isSetProperty()) {
      this.property = new WeaponPropertyValue(other.property);
    }
  }

  public WeaponProperty deepCopy() {
    return new WeaponProperty(this);
  }

  @Override
  public void clear() {
    this.weaponId = null;
    this.property = null;
  }

  public Weapon getWeaponId() {
    return this.weaponId;
  }

  public WeaponProperty setWeaponId(Weapon weaponId) {
    this.weaponId = weaponId;
    return this;
  }

  public void unsetWeaponId() {
    this.weaponId = null;
  }

  /** Returns true if field weaponId is set (has been assigned a value) and false otherwise */
  public boolean isSetWeaponId() {
    return this.weaponId != null;
  }

  public void setWeaponIdIsSet(boolean value) {
    if (!value) {
      this.weaponId = null;
    }
  }

  public WeaponPropertyValue getProperty() {
    return this.property;
  }

  public WeaponProperty setProperty(WeaponPropertyValue property) {
    this.property = property;
    return this;
  }

  public void unsetProperty() {
    this.property = null;
  }

  /** Returns true if field property is set (has been assigned a value) and false otherwise */
  public boolean isSetProperty() {
    return this.property != null;
  }

  public void setPropertyIsSet(boolean value) {
    if (!value) {
      this.property = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case WEAPON_ID:
      if (value == null) {
        unsetWeaponId();
      } else {
        setWeaponId((Weapon)value);
      }
      break;

    case PROPERTY:
      if (value == null) {
        unsetProperty();
      } else {
        setProperty((WeaponPropertyValue)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case WEAPON_ID:
      return getWeaponId();

    case PROPERTY:
      return getProperty();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case WEAPON_ID:
      return isSetWeaponId();
    case PROPERTY:
      return isSetProperty();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof WeaponProperty)
      return this.equals((WeaponProperty)that);
    return false;
  }

  public boolean equals(WeaponProperty that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_weaponId = true && this.isSetWeaponId();
    boolean that_present_weaponId = true && that.isSetWeaponId();
    if (this_present_weaponId || that_present_weaponId) {
      if (!(this_present_weaponId && that_present_weaponId))
        return false;
      if (!this.weaponId.equals(that.weaponId))
        return false;
    }

    boolean this_present_property = true && this.isSetProperty();
    boolean that_present_property = true && that.isSetProperty();
    if (this_present_property || that_present_property) {
      if (!(this_present_property && that_present_property))
        return false;
      if (!this.property.equals(that.property))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetWeaponId()) ? 131071 : 524287);
    if (isSetWeaponId())
      hashCode = hashCode * 8191 + weaponId.hashCode();

    hashCode = hashCode * 8191 + ((isSetProperty()) ? 131071 : 524287);
    if (isSetProperty())
      hashCode = hashCode * 8191 + property.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(WeaponProperty other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = java.lang.Boolean.valueOf(isSetProperty()).compareTo(other.isSetProperty());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProperty()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.property, other.property);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("WeaponProperty(");
    boolean first = true;

    sb.append("weaponId:");
    if (this.weaponId == null) {
      sb.append("null");
    } else {
      sb.append(this.weaponId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("property:");
    if (this.property == null) {
      sb.append("null");
    } else {
      sb.append(this.property);
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class WeaponPropertyStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public WeaponPropertyStandardScheme getScheme() {
      return new WeaponPropertyStandardScheme();
    }
  }

  private static class WeaponPropertyStandardScheme extends org.apache.thrift.scheme.StandardScheme<WeaponProperty> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, WeaponProperty struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // WEAPON_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.weaponId = new Weapon();
              struct.weaponId.read(iprot);
              struct.setWeaponIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PROPERTY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.property = new WeaponPropertyValue();
              struct.property.read(iprot);
              struct.setPropertyIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, WeaponProperty struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.weaponId != null) {
        oprot.writeFieldBegin(WEAPON_ID_FIELD_DESC);
        struct.weaponId.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.property != null) {
        oprot.writeFieldBegin(PROPERTY_FIELD_DESC);
        struct.property.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class WeaponPropertyTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public WeaponPropertyTupleScheme getScheme() {
      return new WeaponPropertyTupleScheme();
    }
  }

  private static class WeaponPropertyTupleScheme extends org.apache.thrift.scheme.TupleScheme<WeaponProperty> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, WeaponProperty struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetWeaponId()) {
        optionals.set(0);
      }
      if (struct.isSetProperty()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetWeaponId()) {
        struct.weaponId.write(oprot);
      }
      if (struct.isSetProperty()) {
        struct.property.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, WeaponProperty struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.weaponId = new Weapon();
        struct.weaponId.read(iprot);
        struct.setWeaponIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.property = new WeaponPropertyValue();
        struct.property.read(iprot);
        struct.setPropertyIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

