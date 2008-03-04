package uk.co.wilson.ng.runtime;

import ng.runtime.BaseNgObject;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.metaclass.primitives.floatimpl.FloatMetaClass;
import ng.runtime.metaclass.util.PrimitiveMetaClasses;

public class NgFloat extends BaseNgObject {
  private static final FloatMetaClass metaclass = PrimitiveMetaClasses.getFloatMetaClass();
  
  private static final NgFloat zero = new NgFloat(0.0f);
  private static final NgFloat one = new NgFloat(1.0f);

  public static FloatMetaClass get$MetaClass() {
    return metaclass;
  }

  public static NgFloat valueOf(final float value) {
    if (value == 0.0f) return zero;
    
    if (value == 1.0f) return one;
    
    return new NgFloat(value);
  }

  private final float value;

  private NgFloat(final float value) {
    this.value = value;
  }

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
