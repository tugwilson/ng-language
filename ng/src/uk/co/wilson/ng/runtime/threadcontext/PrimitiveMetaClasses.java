package uk.co.wilson.ng.runtime.threadcontext;

import ng.runtime.NgBoolean;
import ng.runtime.NgByte;
import ng.runtime.NgChar;
import ng.runtime.NgDouble;
import ng.runtime.NgFloat;
import ng.runtime.NgInt;
import ng.runtime.NgLong;
import ng.runtime.NgShort;
import ng.runtime.metaclass.MetaClass;
import uk.co.wilson.ng.runtime.metaclass.MetaClassImpl;
import uk.co.wilson.ng.runtime.metaclass.primitives.bigdecimal.BigDecimalMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.bigdecimal.BigDecimalMetaClassImpl;
import uk.co.wilson.ng.runtime.metaclass.primitives.biginteger.BigIntegerMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.biginteger.BigIntegerMetaClassImpl;
import uk.co.wilson.ng.runtime.metaclass.primitives.booleanimpl.BooleanMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.byteimpl.ByteMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.charimpl.CharMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.doubleimpl.DoubleMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.floatimpl.FloatMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.intimpl.IntMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.longimpl.LongMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.shortimpl.ShortMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.string.StringMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.string.StringMetaClassImpl;


public abstract class PrimitiveMetaClasses {
  private static final MetaClass objectMetaClass = new MetaClassImpl(Object.class);
  private static final StringMetaClass stringMetaClass = new StringMetaClassImpl();
  private static final BigIntegerMetaClass bigIntegerMetaClass = new BigIntegerMetaClassImpl();
  private static final BigDecimalMetaClass bigDecimalMetaClass = new BigDecimalMetaClassImpl();

  public static MetaClass getObjectMetaClass() {
    return objectMetaClass;
  }

  public static MetaClass getNullMetaClass() {
    // TODO implement
    return null;
  }

  public static BooleanMetaClass getBooleanMetaClass() {
    return NgBoolean.get$MetaClass();
  }

  public static CharMetaClass getCharMetaClass() {
    return NgChar.get$MetaClass();
  }

  public static ByteMetaClass getByteMetaClass() {
    return NgByte.get$MetaClass();
  }

  public static ShortMetaClass getShortMetaClass() {
    return NgShort.get$MetaClass();
  }

  public static IntMetaClass getIntMetaClass() {
    return NgInt.get$MetaClass();
  }

  public static LongMetaClass getLongMetaClass() {
    return NgLong.get$MetaClass();
  }

  public static FloatMetaClass getFloatMetaClass() {
    return NgFloat.get$MetaClass();
  }

  public static DoubleMetaClass getDoubleMetaClass() {
    return NgDouble.get$MetaClass();
  }

  public static BigIntegerMetaClass getBigIntegerMetaClass() {
    return bigIntegerMetaClass;
  }

  public static BigDecimalMetaClass getBigDecimalMetaClass() {
    return bigDecimalMetaClass;
  }

  public static StringMetaClass getStringMetaClass() {
    return stringMetaClass;
  }
}
