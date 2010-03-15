package uk.co.wilson.ng.runtime;

import ng.runtime.BaseNgObject;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.metaclass.primitives.doubleimpl.DoubleMetaClass;
import ng.runtime.metaclass.util.PrimitiveMetaClasses;

public class NgDouble extends BaseNgObject {
  private static final DoubleMetaClass metaclass = PrimitiveMetaClasses.getDoubleMetaClass();

  private static final NgDouble zero = new NgDouble(0.0);

  private static final NgDouble one = new NgDouble(1.0);

  public static DoubleMetaClass get$MetaClass() {
    return NgDouble.metaclass;
  }

  public static NgDouble valueOf(final double value) {
    if (value == 0.0)
      return NgDouble.zero;

    if (value == 1.0)
      return NgDouble.one;

    return new NgDouble(value);
  }

  private final double value;

  private NgDouble(final double value) {
    this.value = value;
  }

  public MetaClass getMetaClass() {
    return get$MetaClass();
  }

  public double getDoubleValue() {
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
