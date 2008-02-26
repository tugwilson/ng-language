package ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

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
    booleanMetaClass = (BooleanMetaClass)tc.getMetaClassFor(boolean.class);
    charMetaClass = (CharMetaClass)tc.getMetaClassFor(char.class);
    byteMetaClass = (ByteMetaClass)tc.getMetaClassFor(byte.class);
    shortMetaClass = (ShortMetaClass)tc.getMetaClassFor(short.class);
    intMetaClass = (IntMetaClass)tc.getMetaClassFor(int.class);
    longMetaClass = (LongMetaClass)tc.getMetaClassFor(long.class);
    floatMetaClass = (FloatMetaClass)tc.getMetaClassFor(float.class);
    doubleMetaClass = (DoubleMetaClass)tc.getMetaClassFor(double.class);
    bigIntegerMetaClass = (BigIntegerMetaClass)tc.getMetaClassFor(BigInteger.class);
    bigDecimalMetaClass = (BigDecimalMetaClass)tc.getMetaClassFor(BigDecimal.class);
    stringMetaClass = (StringMetaClass)tc.getMetaClassFor(String.class);
  }

 public static MetaClass getObjectMetaClass() {
    return objectMetaClass;
  }

  public static MetaClass getNullMetaClass() {
    // TODO implement
    return null;
  }

  public static BooleanMetaClass getBooleanMetaClass() {
    return booleanMetaClass;
  }

  public static CharMetaClass getCharMetaClass() {
    return charMetaClass;
  }

  public static ByteMetaClass getByteMetaClass() {
    return byteMetaClass;
  }

  public static ShortMetaClass getShortMetaClass() {
    return shortMetaClass;
  }

  public static IntMetaClass getIntMetaClass() {
    return intMetaClass;
  }

  public static LongMetaClass getLongMetaClass() {
    return longMetaClass;
  }

  public static FloatMetaClass getFloatMetaClass() {
    return floatMetaClass;
  }

  public static DoubleMetaClass getDoubleMetaClass() {
    return doubleMetaClass;
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
