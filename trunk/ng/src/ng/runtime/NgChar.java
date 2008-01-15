package ng.runtime;

import ng.lang.NgObject;
import ng.runtime.metaclass.MetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.CharMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.charimpl.CharMetaClassImpl;

public class NgChar extends NgObject {
  private static final CharMetaClass metaclass = new CharMetaClassImpl();

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
}
