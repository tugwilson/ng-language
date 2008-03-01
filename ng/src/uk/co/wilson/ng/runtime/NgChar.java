package uk.co.wilson.ng.runtime;

import ng.lang.NgObject;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.metaclass.primitives.charimpl.CharMetaClass;
import ng.runtime.metaclass.util.PrimitiveMetaClasses;

public class NgChar extends NgObject {
  private static final CharMetaClass metaclass = PrimitiveMetaClasses.getCharMetaClass();

  public static CharMetaClass get$MetaClass() {
    return metaclass;
  }

  public static NgChar valueOf(final char value) {
    return new NgChar(value);
  }

  private final char value;

  private NgChar(final char value) {
    this.value = value;
  }

  @Override
  public MetaClass getMetaClass() {
    return get$MetaClass();
  }

  public char getCharValue() {
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
