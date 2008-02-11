package ng.runtime;

import ng.lang.NgObject;
import ng.runtime.metaclass.MetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.doubleimpl.DoubleMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.doubleimpl.DoubleMetaClassImpl;

public class NgDouble extends NgObject {
  private static final DoubleMetaClass metaclass = new DoubleMetaClassImpl();

  public static DoubleMetaClass get$MetaClass() {
    return metaclass;
  }

  public static NgDouble valueOf(final double value) {
    return new NgDouble(value);
  }

  private final double value;

  private NgDouble(final double value) {
    this.value = value;
  }

  @Override
  public MetaClass getMetaClass() {
    return get$MetaClass();
  }

  public double getDoubleValue() {
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

