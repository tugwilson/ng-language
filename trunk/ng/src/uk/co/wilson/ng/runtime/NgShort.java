package uk.co.wilson.ng.runtime;

import ng.lang.NgObject;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.metaclass.primitives.shortimpl.ShortMetaClass;
import ng.runtime.metaclass.util.PrimitiveMetaClasses;

public class NgShort extends NgObject {
  private static final ShortMetaClass metaclass = PrimitiveMetaClasses.getShortMetaClass();

  public static ShortMetaClass get$MetaClass() {
    return metaclass;
  }

  public static NgShort valueOf(final short value) {
    return new NgShort(value);
  }

  private final short value;

  private NgShort(final short value) {
    this.value = value;
  }

  @Override
  public MetaClass getMetaClass() {
    return get$MetaClass();
  }

  public short getShortValue() {
    return this.value;
  }

  /* (non-JavaDoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return String.valueOf(this.value);
  }
}
