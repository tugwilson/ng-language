package uk.co.wilson.ng.runtime;

import ng.runtime.BaseNgObject;
import ng.runtime.metaclass.BooleanMetaClass;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.metaclass.util.PrimitiveMetaClasses;

public class NgBoolean extends BaseNgObject {
  private static final BooleanMetaClass metaclass = PrimitiveMetaClasses.getBooleanMetaClass();

  private static NgBoolean TRUE = new NgBoolean(true);

  private static NgBoolean FALSE = new NgBoolean(false);

  public static BooleanMetaClass get$MetaClass() {
    return NgBoolean.metaclass;
  }

  public static NgBoolean valueOf(final boolean value) {
    return (value) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  private final boolean value;

  private NgBoolean(final boolean value) {
    this.value = value;
  }

  public MetaClass getMetaClass() {
    return get$MetaClass();
  }

  public boolean getBooleanValue() {
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
