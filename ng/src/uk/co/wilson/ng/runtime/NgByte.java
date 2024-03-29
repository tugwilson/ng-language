package uk.co.wilson.ng.runtime;

import ng.runtime.BaseNgObject;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.metaclass.primitives.byteimpl.ByteMetaClass;
import ng.runtime.metaclass.util.PrimitiveMetaClasses;

public class NgByte extends BaseNgObject {
  private static final ByteMetaClass metaclass = PrimitiveMetaClasses.getByteMetaClass();

  public static ByteMetaClass get$MetaClass() {
    return NgByte.metaclass;
  }

  public static NgByte valueOf(final byte value) {
    return new NgByte(value);
  }

  private final byte value;

  private NgByte(final byte value) {
    this.value = value;
  }

  public MetaClass getMetaClass() {
    return get$MetaClass();
  }

  public byte getByteValue() {
    return this.value;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return String.valueOf(this.value);
  }
}
