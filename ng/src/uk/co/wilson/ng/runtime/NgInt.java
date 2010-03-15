package uk.co.wilson.ng.runtime;

import ng.runtime.BaseNgObject;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.metaclass.primitives.intimpl.IntMetaClass;
import ng.runtime.metaclass.util.PrimitiveMetaClasses;

public class NgInt extends BaseNgObject {
  private static final IntMetaClass metaclass = PrimitiveMetaClasses.getIntMetaClass();

  private static final int range = 127;

  private static final NgInt cache[] = new NgInt[NgInt.range * 2 + 1];
  static {
    for (int i = 0; i != NgInt.cache.length; i++) {
      NgInt.cache[i] = new NgInt(i - NgInt.range);
    }
  }

  public static IntMetaClass get$MetaClass() {
    return NgInt.metaclass;
  }

  public static NgInt valueOf(final int value) {
    if (value >= -NgInt.range && value <= NgInt.range)
      return NgInt.cache[value + NgInt.range];

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
