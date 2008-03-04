package uk.co.wilson.ng.runtime;

import ng.runtime.BaseNgObject;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.metaclass.primitives.intimpl.IntMetaClass;
import ng.runtime.metaclass.util.PrimitiveMetaClasses;

public class NgInt extends BaseNgObject {
  private static final IntMetaClass metaclass = PrimitiveMetaClasses.getIntMetaClass();
  private static final int range = 127;
  private static final NgInt cache[] = new NgInt[range * 2 + 1];
  static {
    for (int i = 0; i != cache.length; i++) {
      cache[i] = new NgInt(i - range);
    }
  }

  public static IntMetaClass get$MetaClass() {
    return metaclass;
  }

  public static NgInt valueOf(final int value) {
    if (value >= -range && value <= range) return cache[value + range];
    
    return new NgInt(value);
  }

  private final int value;

  private NgInt(final int value) {
    this.value = value;
  }

  public MetaClass getMetaClass() {
    return get$MetaClass();
  }

  public int getIntValue() {
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
