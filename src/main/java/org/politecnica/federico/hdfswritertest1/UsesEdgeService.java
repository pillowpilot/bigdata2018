/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.politecnica.federico.hdfswritertest1;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-09-27")
public class UsesEdgeService {

  public interface Iface {

    public void setAttackWeapon(long attackId, long weaponId, java.lang.String descripcion) throws org.apache.thrift.TException;

  }

  public interface AsyncIface {

    public void setAttackWeapon(long attackId, long weaponId, java.lang.String descripcion, org.apache.thrift.async.AsyncMethodCallback<Void> resultHandler) throws org.apache.thrift.TException;

  }

  public static class Client extends org.apache.thrift.TServiceClient implements Iface {
    public static class Factory implements org.apache.thrift.TServiceClientFactory<Client> {
      public Factory() {}
      public Client getClient(org.apache.thrift.protocol.TProtocol prot) {
        return new Client(prot);
      }
      public Client getClient(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
        return new Client(iprot, oprot);
      }
    }

    public Client(org.apache.thrift.protocol.TProtocol prot)
    {
      super(prot, prot);
    }

    public Client(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
      super(iprot, oprot);
    }

    public void setAttackWeapon(long attackId, long weaponId, java.lang.String descripcion) throws org.apache.thrift.TException
    {
      send_setAttackWeapon(attackId, weaponId, descripcion);
      recv_setAttackWeapon();
    }

    public void send_setAttackWeapon(long attackId, long weaponId, java.lang.String descripcion) throws org.apache.thrift.TException
    {
      setAttackWeapon_args args = new setAttackWeapon_args();
      args.setAttackId(attackId);
      args.setWeaponId(weaponId);
      args.setDescripcion(descripcion);
      sendBase("setAttackWeapon", args);
    }

    public void recv_setAttackWeapon() throws org.apache.thrift.TException
    {
      setAttackWeapon_result result = new setAttackWeapon_result();
      receiveBase(result, "setAttackWeapon");
      return;
    }

  }
  public static class AsyncClient extends org.apache.thrift.async.TAsyncClient implements AsyncIface {
    public static class Factory implements org.apache.thrift.async.TAsyncClientFactory<AsyncClient> {
      private org.apache.thrift.async.TAsyncClientManager clientManager;
      private org.apache.thrift.protocol.TProtocolFactory protocolFactory;
      public Factory(org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.protocol.TProtocolFactory protocolFactory) {
        this.clientManager = clientManager;
        this.protocolFactory = protocolFactory;
      }
      public AsyncClient getAsyncClient(org.apache.thrift.transport.TNonblockingTransport transport) {
        return new AsyncClient(protocolFactory, clientManager, transport);
      }
    }

    public AsyncClient(org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.transport.TNonblockingTransport transport) {
      super(protocolFactory, clientManager, transport);
    }

    public void setAttackWeapon(long attackId, long weaponId, java.lang.String descripcion, org.apache.thrift.async.AsyncMethodCallback<Void> resultHandler) throws org.apache.thrift.TException {
      checkReady();
      setAttackWeapon_call method_call = new setAttackWeapon_call(attackId, weaponId, descripcion, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class setAttackWeapon_call extends org.apache.thrift.async.TAsyncMethodCall<Void> {
      private long attackId;
      private long weaponId;
      private java.lang.String descripcion;
      public setAttackWeapon_call(long attackId, long weaponId, java.lang.String descripcion, org.apache.thrift.async.AsyncMethodCallback<Void> resultHandler, org.apache.thrift.async.TAsyncClient client, org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.transport.TNonblockingTransport transport) throws org.apache.thrift.TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.attackId = attackId;
        this.weaponId = weaponId;
        this.descripcion = descripcion;
      }

      public void write_args(org.apache.thrift.protocol.TProtocol prot) throws org.apache.thrift.TException {
        prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("setAttackWeapon", org.apache.thrift.protocol.TMessageType.CALL, 0));
        setAttackWeapon_args args = new setAttackWeapon_args();
        args.setAttackId(attackId);
        args.setWeaponId(weaponId);
        args.setDescripcion(descripcion);
        args.write(prot);
        prot.writeMessageEnd();
      }

      public Void getResult() throws org.apache.thrift.TException {
        if (getState() != org.apache.thrift.async.TAsyncMethodCall.State.RESPONSE_READ) {
          throw new java.lang.IllegalStateException("Method call not finished!");
        }
        org.apache.thrift.transport.TMemoryInputTransport memoryTransport = new org.apache.thrift.transport.TMemoryInputTransport(getFrameBuffer().array());
        org.apache.thrift.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
        return null;
      }
    }

  }

  public static class Processor<I extends Iface> extends org.apache.thrift.TBaseProcessor<I> implements org.apache.thrift.TProcessor {
    private static final org.slf4j.Logger _LOGGER = org.slf4j.LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new java.util.HashMap<java.lang.String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
    }

    protected Processor(I iface, java.util.Map<java.lang.String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> java.util.Map<java.lang.String,  org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>> getProcessMap(java.util.Map<java.lang.String, org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      processMap.put("setAttackWeapon", new setAttackWeapon());
      return processMap;
    }

    public static class setAttackWeapon<I extends Iface> extends org.apache.thrift.ProcessFunction<I, setAttackWeapon_args> {
      public setAttackWeapon() {
        super("setAttackWeapon");
      }

      public setAttackWeapon_args getEmptyArgsInstance() {
        return new setAttackWeapon_args();
      }

      protected boolean isOneway() {
        return false;
      }

      @Override
      protected boolean handleRuntimeExceptions() {
        return false;
      }

      public setAttackWeapon_result getResult(I iface, setAttackWeapon_args args) throws org.apache.thrift.TException {
        setAttackWeapon_result result = new setAttackWeapon_result();
        iface.setAttackWeapon(args.attackId, args.weaponId, args.descripcion);
        return result;
      }
    }

  }

  public static class AsyncProcessor<I extends AsyncIface> extends org.apache.thrift.TBaseAsyncProcessor<I> {
    private static final org.slf4j.Logger _LOGGER = org.slf4j.LoggerFactory.getLogger(AsyncProcessor.class.getName());
    public AsyncProcessor(I iface) {
      super(iface, getProcessMap(new java.util.HashMap<java.lang.String, org.apache.thrift.AsyncProcessFunction<I, ? extends org.apache.thrift.TBase, ?>>()));
    }

    protected AsyncProcessor(I iface, java.util.Map<java.lang.String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends AsyncIface> java.util.Map<java.lang.String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase,?>> getProcessMap(java.util.Map<java.lang.String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      processMap.put("setAttackWeapon", new setAttackWeapon());
      return processMap;
    }

    public static class setAttackWeapon<I extends AsyncIface> extends org.apache.thrift.AsyncProcessFunction<I, setAttackWeapon_args, Void> {
      public setAttackWeapon() {
        super("setAttackWeapon");
      }

      public setAttackWeapon_args getEmptyArgsInstance() {
        return new setAttackWeapon_args();
      }

      public org.apache.thrift.async.AsyncMethodCallback<Void> getResultHandler(final org.apache.thrift.server.AbstractNonblockingServer.AsyncFrameBuffer fb, final int seqid) {
        final org.apache.thrift.AsyncProcessFunction fcall = this;
        return new org.apache.thrift.async.AsyncMethodCallback<Void>() { 
          public void onComplete(Void o) {
            setAttackWeapon_result result = new setAttackWeapon_result();
            try {
              fcall.sendResponse(fb, result, org.apache.thrift.protocol.TMessageType.REPLY,seqid);
            } catch (org.apache.thrift.transport.TTransportException e) {
              _LOGGER.error("TTransportException writing to internal frame buffer", e);
              fb.close();
            } catch (java.lang.Exception e) {
              _LOGGER.error("Exception writing to internal frame buffer", e);
              onError(e);
            }
          }
          public void onError(java.lang.Exception e) {
            byte msgType = org.apache.thrift.protocol.TMessageType.REPLY;
            org.apache.thrift.TSerializable msg;
            setAttackWeapon_result result = new setAttackWeapon_result();
            if (e instanceof org.apache.thrift.transport.TTransportException) {
              _LOGGER.error("TTransportException inside handler", e);
              fb.close();
              return;
            } else if (e instanceof org.apache.thrift.TApplicationException) {
              _LOGGER.error("TApplicationException inside handler", e);
              msgType = org.apache.thrift.protocol.TMessageType.EXCEPTION;
              msg = (org.apache.thrift.TApplicationException)e;
            } else {
              _LOGGER.error("Exception inside handler", e);
              msgType = org.apache.thrift.protocol.TMessageType.EXCEPTION;
              msg = new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.INTERNAL_ERROR, e.getMessage());
            }
            try {
              fcall.sendResponse(fb,msg,msgType,seqid);
            } catch (java.lang.Exception ex) {
              _LOGGER.error("Exception writing to internal frame buffer", ex);
              fb.close();
            }
          }
        };
      }

      protected boolean isOneway() {
        return false;
      }

      public void start(I iface, setAttackWeapon_args args, org.apache.thrift.async.AsyncMethodCallback<Void> resultHandler) throws org.apache.thrift.TException {
        iface.setAttackWeapon(args.attackId, args.weaponId, args.descripcion,resultHandler);
      }
    }

  }

  public static class setAttackWeapon_args implements org.apache.thrift.TBase<setAttackWeapon_args, setAttackWeapon_args._Fields>, java.io.Serializable, Cloneable, Comparable<setAttackWeapon_args>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("setAttackWeapon_args");

    private static final org.apache.thrift.protocol.TField ATTACK_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("attackId", org.apache.thrift.protocol.TType.I64, (short)1);
    private static final org.apache.thrift.protocol.TField WEAPON_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("weaponId", org.apache.thrift.protocol.TType.I64, (short)2);
    private static final org.apache.thrift.protocol.TField DESCRIPCION_FIELD_DESC = new org.apache.thrift.protocol.TField("descripcion", org.apache.thrift.protocol.TType.STRING, (short)3);

    private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new setAttackWeapon_argsStandardSchemeFactory();
    private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new setAttackWeapon_argsTupleSchemeFactory();

    public long attackId; // required
    public long weaponId; // required
    public java.lang.String descripcion; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      ATTACK_ID((short)1, "attackId"),
      WEAPON_ID((short)2, "weaponId"),
      DESCRIPCION((short)3, "descripcion");

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
          case 3: // DESCRIPCION
            return DESCRIPCION;
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
      tmpMap.put(_Fields.DESCRIPCION, new org.apache.thrift.meta_data.FieldMetaData("descripcion", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
      metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(setAttackWeapon_args.class, metaDataMap);
    }

    public setAttackWeapon_args() {
    }

    public setAttackWeapon_args(
      long attackId,
      long weaponId,
      java.lang.String descripcion)
    {
      this();
      this.attackId = attackId;
      setAttackIdIsSet(true);
      this.weaponId = weaponId;
      setWeaponIdIsSet(true);
      this.descripcion = descripcion;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public setAttackWeapon_args(setAttackWeapon_args other) {
      __isset_bitfield = other.__isset_bitfield;
      this.attackId = other.attackId;
      this.weaponId = other.weaponId;
      if (other.isSetDescripcion()) {
        this.descripcion = other.descripcion;
      }
    }

    public setAttackWeapon_args deepCopy() {
      return new setAttackWeapon_args(this);
    }

    @Override
    public void clear() {
      setAttackIdIsSet(false);
      this.attackId = 0;
      setWeaponIdIsSet(false);
      this.weaponId = 0;
      this.descripcion = null;
    }

    public long getAttackId() {
      return this.attackId;
    }

    public setAttackWeapon_args setAttackId(long attackId) {
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

    public setAttackWeapon_args setWeaponId(long weaponId) {
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

    public java.lang.String getDescripcion() {
      return this.descripcion;
    }

    public setAttackWeapon_args setDescripcion(java.lang.String descripcion) {
      this.descripcion = descripcion;
      return this;
    }

    public void unsetDescripcion() {
      this.descripcion = null;
    }

    /** Returns true if field descripcion is set (has been assigned a value) and false otherwise */
    public boolean isSetDescripcion() {
      return this.descripcion != null;
    }

    public void setDescripcionIsSet(boolean value) {
      if (!value) {
        this.descripcion = null;
      }
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

      case DESCRIPCION:
        if (value == null) {
          unsetDescripcion();
        } else {
          setDescripcion((java.lang.String)value);
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

      case DESCRIPCION:
        return getDescripcion();

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
      case DESCRIPCION:
        return isSetDescripcion();
      }
      throw new java.lang.IllegalStateException();
    }

    @Override
    public boolean equals(java.lang.Object that) {
      if (that == null)
        return false;
      if (that instanceof setAttackWeapon_args)
        return this.equals((setAttackWeapon_args)that);
      return false;
    }

    public boolean equals(setAttackWeapon_args that) {
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

      boolean this_present_descripcion = true && this.isSetDescripcion();
      boolean that_present_descripcion = true && that.isSetDescripcion();
      if (this_present_descripcion || that_present_descripcion) {
        if (!(this_present_descripcion && that_present_descripcion))
          return false;
        if (!this.descripcion.equals(that.descripcion))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      int hashCode = 1;

      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(attackId);

      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(weaponId);

      hashCode = hashCode * 8191 + ((isSetDescripcion()) ? 131071 : 524287);
      if (isSetDescripcion())
        hashCode = hashCode * 8191 + descripcion.hashCode();

      return hashCode;
    }

    @Override
    public int compareTo(setAttackWeapon_args other) {
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
      lastComparison = java.lang.Boolean.valueOf(isSetDescripcion()).compareTo(other.isSetDescripcion());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetDescripcion()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.descripcion, other.descripcion);
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
      java.lang.StringBuilder sb = new java.lang.StringBuilder("setAttackWeapon_args(");
      boolean first = true;

      sb.append("attackId:");
      sb.append(this.attackId);
      first = false;
      if (!first) sb.append(", ");
      sb.append("weaponId:");
      sb.append(this.weaponId);
      first = false;
      if (!first) sb.append(", ");
      sb.append("descripcion:");
      if (this.descripcion == null) {
        sb.append("null");
      } else {
        sb.append(this.descripcion);
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
        // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
        __isset_bitfield = 0;
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class setAttackWeapon_argsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
      public setAttackWeapon_argsStandardScheme getScheme() {
        return new setAttackWeapon_argsStandardScheme();
      }
    }

    private static class setAttackWeapon_argsStandardScheme extends org.apache.thrift.scheme.StandardScheme<setAttackWeapon_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, setAttackWeapon_args struct) throws org.apache.thrift.TException {
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
            case 3: // DESCRIPCION
              if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                struct.descripcion = iprot.readString();
                struct.setDescripcionIsSet(true);
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

      public void write(org.apache.thrift.protocol.TProtocol oprot, setAttackWeapon_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        oprot.writeFieldBegin(ATTACK_ID_FIELD_DESC);
        oprot.writeI64(struct.attackId);
        oprot.writeFieldEnd();
        oprot.writeFieldBegin(WEAPON_ID_FIELD_DESC);
        oprot.writeI64(struct.weaponId);
        oprot.writeFieldEnd();
        if (struct.descripcion != null) {
          oprot.writeFieldBegin(DESCRIPCION_FIELD_DESC);
          oprot.writeString(struct.descripcion);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class setAttackWeapon_argsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
      public setAttackWeapon_argsTupleScheme getScheme() {
        return new setAttackWeapon_argsTupleScheme();
      }
    }

    private static class setAttackWeapon_argsTupleScheme extends org.apache.thrift.scheme.TupleScheme<setAttackWeapon_args> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, setAttackWeapon_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
        java.util.BitSet optionals = new java.util.BitSet();
        if (struct.isSetAttackId()) {
          optionals.set(0);
        }
        if (struct.isSetWeaponId()) {
          optionals.set(1);
        }
        if (struct.isSetDescripcion()) {
          optionals.set(2);
        }
        oprot.writeBitSet(optionals, 3);
        if (struct.isSetAttackId()) {
          oprot.writeI64(struct.attackId);
        }
        if (struct.isSetWeaponId()) {
          oprot.writeI64(struct.weaponId);
        }
        if (struct.isSetDescripcion()) {
          oprot.writeString(struct.descripcion);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, setAttackWeapon_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
        java.util.BitSet incoming = iprot.readBitSet(3);
        if (incoming.get(0)) {
          struct.attackId = iprot.readI64();
          struct.setAttackIdIsSet(true);
        }
        if (incoming.get(1)) {
          struct.weaponId = iprot.readI64();
          struct.setWeaponIdIsSet(true);
        }
        if (incoming.get(2)) {
          struct.descripcion = iprot.readString();
          struct.setDescripcionIsSet(true);
        }
      }
    }

    private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
      return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
    }
  }

  public static class setAttackWeapon_result implements org.apache.thrift.TBase<setAttackWeapon_result, setAttackWeapon_result._Fields>, java.io.Serializable, Cloneable, Comparable<setAttackWeapon_result>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("setAttackWeapon_result");


    private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new setAttackWeapon_resultStandardSchemeFactory();
    private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new setAttackWeapon_resultTupleSchemeFactory();


    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
;

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
    public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(setAttackWeapon_result.class, metaDataMap);
    }

    public setAttackWeapon_result() {
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public setAttackWeapon_result(setAttackWeapon_result other) {
    }

    public setAttackWeapon_result deepCopy() {
      return new setAttackWeapon_result(this);
    }

    @Override
    public void clear() {
    }

    public void setFieldValue(_Fields field, java.lang.Object value) {
      switch (field) {
      }
    }

    public java.lang.Object getFieldValue(_Fields field) {
      switch (field) {
      }
      throw new java.lang.IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new java.lang.IllegalArgumentException();
      }

      switch (field) {
      }
      throw new java.lang.IllegalStateException();
    }

    @Override
    public boolean equals(java.lang.Object that) {
      if (that == null)
        return false;
      if (that instanceof setAttackWeapon_result)
        return this.equals((setAttackWeapon_result)that);
      return false;
    }

    public boolean equals(setAttackWeapon_result that) {
      if (that == null)
        return false;
      if (this == that)
        return true;

      return true;
    }

    @Override
    public int hashCode() {
      int hashCode = 1;

      return hashCode;
    }

    @Override
    public int compareTo(setAttackWeapon_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

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
      java.lang.StringBuilder sb = new java.lang.StringBuilder("setAttackWeapon_result(");
      boolean first = true;

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

    private static class setAttackWeapon_resultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
      public setAttackWeapon_resultStandardScheme getScheme() {
        return new setAttackWeapon_resultStandardScheme();
      }
    }

    private static class setAttackWeapon_resultStandardScheme extends org.apache.thrift.scheme.StandardScheme<setAttackWeapon_result> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, setAttackWeapon_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            default:
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked in the validate method
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, setAttackWeapon_result struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class setAttackWeapon_resultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
      public setAttackWeapon_resultTupleScheme getScheme() {
        return new setAttackWeapon_resultTupleScheme();
      }
    }

    private static class setAttackWeapon_resultTupleScheme extends org.apache.thrift.scheme.TupleScheme<setAttackWeapon_result> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, setAttackWeapon_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, setAttackWeapon_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      }
    }

    private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
      return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
    }
  }

}
