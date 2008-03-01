package uk.co.wilson.ng.runtime;

import ng.lang.NgObject;
import ng.runtime.metaclass.BooleanMetaClass;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.metaclass.util.PrimitiveMetaClasses;

public class NgBoolean extends NgObject {
  private static final BooleanMetaClass metaclass = PrimitiveMetaClasses.getBooleanMetaClass();
  private static NgBoolean TRUE = new NgBoolean(true);
  private static NgBoolean FALSE = new NgBoolean(false);

  public static BooleanMetaClass get$MetaClass() {
    return metaclass;
  }

  public static NgBoolean valueOf(final boolean value) {
    return (value) ? TRUE : FALSE;
  }

  private final boolean value;

  private NgBoolean(final boolean value) {
    this.value = value;
  }

  @Override
  public MetaClass getMetaClass() {
    return get$MetaClass();
  }

  public boolean getBooleanValue() {
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
