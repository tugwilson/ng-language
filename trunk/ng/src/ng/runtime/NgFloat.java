package ng.runtime;

import ng.lang.NgObject;
import ng.runtime.metaclass.FloatMetaClass;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.metaclass.PrimitiveMetaClasses;

public class NgFloat extends NgObject {
  private static final FloatMetaClass metaclass = PrimitiveMetaClasses.getFloatMetaClass();

  public static FloatMetaClass get$MetaClass() {
    return metaclass;
  }

  public static NgFloat valueOf(final float value) {
    return new NgFloat(value);
  }

  private final float value;

  private NgFloat(final float value) {
    this.value = value;
  }

  @Override
  public MetaClass getMetaClass() {
    return get$MetaClass();
  }

  public float getFloatValue() {
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
