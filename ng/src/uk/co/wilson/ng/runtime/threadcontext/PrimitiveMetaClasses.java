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
import uk.co.wilson.ng.runtime.metaclass.primitives.BigDecimalMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigIntegerMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.BooleanMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.ByteMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.CharMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.DoubleMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.FloatMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.IntMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.LongMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.ShortMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.bigdecimal.BigDecimalMetaClassImpl;
import uk.co.wilson.ng.runtime.metaclass.primitives.biginteger.BigIntegerMetaClassImpl;


public abstract class PrimitiveMetaClasses {
  private static final BigIntegerMetaClass bigIntegerMetaClass = new BigIntegerMetaClassImpl();
  private static final BigDecimalMetaClass bigDecimalMetaClass = new BigDecimalMetaClassImpl();

  public static MetaClass getObjectMetaClass() {
    // TODO implement
    return null;
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
}
