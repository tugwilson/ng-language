package ng.runtime.metaclass.util;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BooleanMetaClass;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.metaclass.primitives.bigdecimal.BigDecimalMetaClass;
import ng.runtime.metaclass.primitives.biginteger.BigIntegerMetaClass;
import ng.runtime.metaclass.primitives.byteimpl.ByteMetaClass;
import ng.runtime.metaclass.primitives.charimpl.CharMetaClass;
import ng.runtime.metaclass.primitives.doubleimpl.DoubleMetaClass;
import ng.runtime.metaclass.primitives.floatimpl.FloatMetaClass;
import ng.runtime.metaclass.primitives.intimpl.IntMetaClass;
import ng.runtime.metaclass.primitives.longimpl.LongMetaClass;
import ng.runtime.metaclass.primitives.shortimpl.ShortMetaClass;
import ng.runtime.metaclass.primitives.stringimpl.StringMetaClass;
import ng.runtime.threadcontext.ThreadContext;

public abstract class PrimitiveMetaClasses {
  private static final MetaClass objectMetaClass;

  private static final BooleanMetaClass booleanMetaClass;

  private static final CharMetaClass charMetaClass;

  private static final ByteMetaClass byteMetaClass;

  private static final ShortMetaClass shortMetaClass;

  private static final IntMetaClass intMetaClass;

  private static final LongMetaClass longMetaClass;

  private static final FloatMetaClass floatMetaClass;

  private static final DoubleMetaClass doubleMetaClass;

  private static final BigIntegerMetaClass bigIntegerMetaClass;

  private static final BigDecimalMetaClass bigDecimalMetaClass;

  private static final StringMetaClass stringMetaClass;

  static {
    final ThreadContext tc = ThreadContext.getThreadContext();

    objectMetaClass = tc.getMetaClassFor(Object.class);
    booleanMetaClass = (BooleanMetaClass) tc.getMetaClassFor(boolean.class);
    charMetaClass = (CharMetaClass) tc.getMetaClassFor(char.class);
    byteMetaClass = (ByteMetaClass) tc.getMetaClassFor(byte.class);
    shortMetaClass = (ShortMetaClass) tc.getMetaClassFor(short.class);
    intMetaClass = (IntMetaClass) tc.getMetaClassFor(int.class);
    longMetaClass = (LongMetaClass) tc.getMetaClassFor(long.class);
    floatMetaClass = (FloatMetaClass) tc.getMetaClassFor(float.class);
    doubleMetaClass = (DoubleMetaClass) tc.getMetaClassFor(double.class);
    bigIntegerMetaClass = (BigIntegerMetaClass) tc.getMetaClassFor(BigInteger.class);
    bigDecimalMetaClass = (BigDecimalMetaClass) tc.getMetaClassFor(BigDecimal.class);
    stringMetaClass = (StringMetaClass) tc.getMetaClassFor(String.class);
  }

  public static MetaClass getObjectMetaClass() {
    return PrimitiveMetaClasses.objectMetaClass;
  }

  public static MetaClass getNullMetaClass() {
    // TODO implement
    return null;
  }

  public static BooleanMetaClass getBooleanMetaClass() {
    return PrimitiveMetaClasses.booleanMetaClass;
  }

  public static CharMetaClass getCharMetaClass() {
    return PrimitiveMetaClasses.charMetaClass;
  }

  public static ByteMetaClass getByteMetaClass() {
    return PrimitiveMetaClasses.byteMetaClass;
  }

  public static ShortMetaClass getShortMetaClass() {
    return PrimitiveMetaClasses.shortMetaClass;
  }

  public static IntMetaClass getIntMetaClass() {
    return PrimitiveMetaClasses.intMetaClass;
  }

  public static LongMetaClass getLongMetaClass() {
    return PrimitiveMetaClasses.longMetaClass;
  }

  public static FloatMetaClass getFloatMetaClass() {
    return PrimitiveMetaClasses.floatMetaClass;
  }

  public static DoubleMetaClass getDoubleMetaClass() {
    return PrimitiveMetaClasses.doubleMetaClass;
  }

  public static BigIntegerMetaClass getBigIntegerMetaClass() {
    return PrimitiveMetaClasses.bigIntegerMetaClass;
  }

  public static BigDecimalMetaClass getBigDecimalMetaClass() {
    return PrimitiveMetaClasses.bigDecimalMetaClass;
  }

  public static StringMetaClass getStringMetaClass() {
    return PrimitiveMetaClasses.stringMetaClass;
  }
}
