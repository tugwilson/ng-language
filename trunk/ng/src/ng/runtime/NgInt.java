package ng.runtime;

import ng.lang.MetaClass;
import ng.lang.NgObject;
import ng.runtime.metaclass.IntMetaClass;
import ng.runtime.metaclass.PrimitiveMetaClasses;

public class NgInt extends NgObject {
  private static final IntMetaClass metaclass = PrimitiveMetaClasses.getIntMetaClass();

  public static IntMetaClass get$MetaClass() {
    return metaclass;
  }

  public static NgInt valueOf(final int value) {
    return new NgInt(value);
  }

  private final int value;

  private NgInt(final int value) {
    this.value = value;
  }

  @Override
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
