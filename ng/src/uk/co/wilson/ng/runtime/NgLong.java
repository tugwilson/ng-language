package uk.co.wilson.ng.runtime;

import ng.runtime.BaseNgObject;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.metaclass.primitives.longimpl.LongMetaClass;
import ng.runtime.metaclass.util.PrimitiveMetaClasses;

public class NgLong extends BaseNgObject {
  private static final LongMetaClass metaclass = PrimitiveMetaClasses.getLongMetaClass();

  public static LongMetaClass get$MetaClass() {
    return NgLong.metaclass;
  }

  public static NgLong valueOf(final long value) {
    return new NgLong(value);
  }

  private final long value;

  private NgLong(final long value) {
    this.value = value;
  }

  public MetaClass getMetaClass() {
    return get$MetaClass();
  }

  public long getLongValue() {
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
