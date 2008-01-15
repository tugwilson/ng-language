package ng.runtime;

import ng.lang.NgObject;
import ng.runtime.metaclass.MetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.IntMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.intimpl.IntMetaClassImpl;

public class NgInt extends NgObject {
  private static final IntMetaClass metaclass = new IntMetaClassImpl();

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
}
