package ng.runtime;

import ng.lang.MetaClass;
import ng.lang.NgObject;
import ng.runtime.metaclass.LongMetaClass;
import ng.runtime.metaclass.PrimitiveMetaClasses;

public class NgLong extends NgObject {
  private static final LongMetaClass metaclass = PrimitiveMetaClasses.getLongMetaClass();

  public static LongMetaClass get$MetaClass() {
    return metaclass;
  }

  public static NgLong valueOf(final long value) {
    return new NgLong(value);
  }

  private final long value;

  private NgLong(final long value) {
    this.value = value;
  }

  @Override
  public MetaClass getMetaClass() {
    return get$MetaClass();
  }

  public long getLongValue() {
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
