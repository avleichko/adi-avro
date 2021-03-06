/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.adidas.product.worker.schema;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class WorkerLaunch extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -791323320236231042L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"WorkerLaunch\",\"namespace\":\"com.adidas.product.worker.schema\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"brand\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"consumer\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"flow\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"locale\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<WorkerLaunch> ENCODER =
      new BinaryMessageEncoder<WorkerLaunch>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<WorkerLaunch> DECODER =
      new BinaryMessageDecoder<WorkerLaunch>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<WorkerLaunch> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<WorkerLaunch> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<WorkerLaunch>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this WorkerLaunch to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a WorkerLaunch from a ByteBuffer. */
  public static WorkerLaunch fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.String id;
   private java.lang.String brand;
   private java.lang.String consumer;
   private java.lang.String flow;
   private java.util.List<java.lang.String> locale;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public WorkerLaunch() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param brand The new value for brand
   * @param consumer The new value for consumer
   * @param flow The new value for flow
   * @param locale The new value for locale
   */
  public WorkerLaunch(java.lang.String id, java.lang.String brand, java.lang.String consumer, java.lang.String flow, java.util.List<java.lang.String> locale) {
    this.id = id;
    this.brand = brand;
    this.consumer = consumer;
    this.flow = flow;
    this.locale = locale;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return brand;
    case 2: return consumer;
    case 3: return flow;
    case 4: return locale;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.String)value$; break;
    case 1: brand = (java.lang.String)value$; break;
    case 2: consumer = (java.lang.String)value$; break;
    case 3: flow = (java.lang.String)value$; break;
    case 4: locale = (java.util.List<java.lang.String>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.String value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'brand' field.
   * @return The value of the 'brand' field.
   */
  public java.lang.String getBrand() {
    return brand;
  }

  /**
   * Sets the value of the 'brand' field.
   * @param value the value to set.
   */
  public void setBrand(java.lang.String value) {
    this.brand = value;
  }

  /**
   * Gets the value of the 'consumer' field.
   * @return The value of the 'consumer' field.
   */
  public java.lang.String getConsumer() {
    return consumer;
  }

  /**
   * Sets the value of the 'consumer' field.
   * @param value the value to set.
   */
  public void setConsumer(java.lang.String value) {
    this.consumer = value;
  }

  /**
   * Gets the value of the 'flow' field.
   * @return The value of the 'flow' field.
   */
  public java.lang.String getFlow() {
    return flow;
  }

  /**
   * Sets the value of the 'flow' field.
   * @param value the value to set.
   */
  public void setFlow(java.lang.String value) {
    this.flow = value;
  }

  /**
   * Gets the value of the 'locale' field.
   * @return The value of the 'locale' field.
   */
  public java.util.List<java.lang.String> getLocale() {
    return locale;
  }

  /**
   * Sets the value of the 'locale' field.
   * @param value the value to set.
   */
  public void setLocale(java.util.List<java.lang.String> value) {
    this.locale = value;
  }

  /**
   * Creates a new WorkerLaunch RecordBuilder.
   * @return A new WorkerLaunch RecordBuilder
   */
  public static com.adidas.product.worker.schema.WorkerLaunch.Builder newBuilder() {
    return new com.adidas.product.worker.schema.WorkerLaunch.Builder();
  }

  /**
   * Creates a new WorkerLaunch RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new WorkerLaunch RecordBuilder
   */
  public static com.adidas.product.worker.schema.WorkerLaunch.Builder newBuilder(com.adidas.product.worker.schema.WorkerLaunch.Builder other) {
    return new com.adidas.product.worker.schema.WorkerLaunch.Builder(other);
  }

  /**
   * Creates a new WorkerLaunch RecordBuilder by copying an existing WorkerLaunch instance.
   * @param other The existing instance to copy.
   * @return A new WorkerLaunch RecordBuilder
   */
  public static com.adidas.product.worker.schema.WorkerLaunch.Builder newBuilder(com.adidas.product.worker.schema.WorkerLaunch other) {
    return new com.adidas.product.worker.schema.WorkerLaunch.Builder(other);
  }

  /**
   * RecordBuilder for WorkerLaunch instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<WorkerLaunch>
    implements org.apache.avro.data.RecordBuilder<WorkerLaunch> {

    private java.lang.String id;
    private java.lang.String brand;
    private java.lang.String consumer;
    private java.lang.String flow;
    private java.util.List<java.lang.String> locale;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.adidas.product.worker.schema.WorkerLaunch.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.brand)) {
        this.brand = data().deepCopy(fields()[1].schema(), other.brand);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.consumer)) {
        this.consumer = data().deepCopy(fields()[2].schema(), other.consumer);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.flow)) {
        this.flow = data().deepCopy(fields()[3].schema(), other.flow);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.locale)) {
        this.locale = data().deepCopy(fields()[4].schema(), other.locale);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing WorkerLaunch instance
     * @param other The existing instance to copy.
     */
    private Builder(com.adidas.product.worker.schema.WorkerLaunch other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.brand)) {
        this.brand = data().deepCopy(fields()[1].schema(), other.brand);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.consumer)) {
        this.consumer = data().deepCopy(fields()[2].schema(), other.consumer);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.flow)) {
        this.flow = data().deepCopy(fields()[3].schema(), other.flow);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.locale)) {
        this.locale = data().deepCopy(fields()[4].schema(), other.locale);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.String getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.adidas.product.worker.schema.WorkerLaunch.Builder setId(java.lang.String value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.adidas.product.worker.schema.WorkerLaunch.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'brand' field.
      * @return The value.
      */
    public java.lang.String getBrand() {
      return brand;
    }

    /**
      * Sets the value of the 'brand' field.
      * @param value The value of 'brand'.
      * @return This builder.
      */
    public com.adidas.product.worker.schema.WorkerLaunch.Builder setBrand(java.lang.String value) {
      validate(fields()[1], value);
      this.brand = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'brand' field has been set.
      * @return True if the 'brand' field has been set, false otherwise.
      */
    public boolean hasBrand() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'brand' field.
      * @return This builder.
      */
    public com.adidas.product.worker.schema.WorkerLaunch.Builder clearBrand() {
      brand = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'consumer' field.
      * @return The value.
      */
    public java.lang.String getConsumer() {
      return consumer;
    }

    /**
      * Sets the value of the 'consumer' field.
      * @param value The value of 'consumer'.
      * @return This builder.
      */
    public com.adidas.product.worker.schema.WorkerLaunch.Builder setConsumer(java.lang.String value) {
      validate(fields()[2], value);
      this.consumer = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'consumer' field has been set.
      * @return True if the 'consumer' field has been set, false otherwise.
      */
    public boolean hasConsumer() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'consumer' field.
      * @return This builder.
      */
    public com.adidas.product.worker.schema.WorkerLaunch.Builder clearConsumer() {
      consumer = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'flow' field.
      * @return The value.
      */
    public java.lang.String getFlow() {
      return flow;
    }

    /**
      * Sets the value of the 'flow' field.
      * @param value The value of 'flow'.
      * @return This builder.
      */
    public com.adidas.product.worker.schema.WorkerLaunch.Builder setFlow(java.lang.String value) {
      validate(fields()[3], value);
      this.flow = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'flow' field has been set.
      * @return True if the 'flow' field has been set, false otherwise.
      */
    public boolean hasFlow() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'flow' field.
      * @return This builder.
      */
    public com.adidas.product.worker.schema.WorkerLaunch.Builder clearFlow() {
      flow = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'locale' field.
      * @return The value.
      */
    public java.util.List<java.lang.String> getLocale() {
      return locale;
    }

    /**
      * Sets the value of the 'locale' field.
      * @param value The value of 'locale'.
      * @return This builder.
      */
    public com.adidas.product.worker.schema.WorkerLaunch.Builder setLocale(java.util.List<java.lang.String> value) {
      validate(fields()[4], value);
      this.locale = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'locale' field has been set.
      * @return True if the 'locale' field has been set, false otherwise.
      */
    public boolean hasLocale() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'locale' field.
      * @return This builder.
      */
    public com.adidas.product.worker.schema.WorkerLaunch.Builder clearLocale() {
      locale = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public WorkerLaunch build() {
      try {
        WorkerLaunch record = new WorkerLaunch();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.String) defaultValue(fields()[0]);
        record.brand = fieldSetFlags()[1] ? this.brand : (java.lang.String) defaultValue(fields()[1]);
        record.consumer = fieldSetFlags()[2] ? this.consumer : (java.lang.String) defaultValue(fields()[2]);
        record.flow = fieldSetFlags()[3] ? this.flow : (java.lang.String) defaultValue(fields()[3]);
        record.locale = fieldSetFlags()[4] ? this.locale : (java.util.List<java.lang.String>) defaultValue(fields()[4]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<WorkerLaunch>
    WRITER$ = (org.apache.avro.io.DatumWriter<WorkerLaunch>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<WorkerLaunch>
    READER$ = (org.apache.avro.io.DatumReader<WorkerLaunch>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
