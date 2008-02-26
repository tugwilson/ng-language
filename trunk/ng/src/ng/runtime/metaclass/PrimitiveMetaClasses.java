package ng.runtime.metaclass;

import ng.lang.NgRuntimeException;


public abstract class PrimitiveMetaClasses {
  // TODO: get these strings from Properties
  private static final MetaClass objectMetaClass = (MetaClass)getInstance("uk.co.wilson.ng.runtime.metaclass.MetaClassImpl");
  private static final BooleanMetaClass booleanMetaClass = (BooleanMetaClass)getInstance("uk.co.wilson.ng.runtime.metaclass.primitives.booleanimpl.BooleanMetaClassImpl");
  private static final CharMetaClass charMetaClass = (CharMetaClass)getInstance("uk.co.wilson.ng.runtime.metaclass.primitives.charimpl.CharMetaClassImpl");
  private static final ByteMetaClass byteMetaClass = (ByteMetaClass)getInstance("uk.co.wilson.ng.runtime.metaclass.primitives.byteimpl.ByteMetaClassImpl");
  private static final ShortMetaClass shortMetaClass = (ShortMetaClass)getInstance("uk.co.wilson.ng.runtime.metaclass.primitives.shortimpl.ShortMetaClassImpl");
  private static final IntMetaClass intMetaClass = (IntMetaClass)getInstance("uk.co.wilson.ng.runtime.metaclass.primitives.intimpl.IntMetaClassImpl");
  private static final LongMetaClass longMetaClass = (LongMetaClass)getInstance("uk.co.wilson.ng.runtime.metaclass.primitives.longimpl.LongMetaClassImpl");
  private static final FloatMetaClass floatMetaClass = (FloatMetaClass)getInstance("uk.co.wilson.ng.runtime.metaclass.primitives.floatimpl.FloatMetaClassImpl");
  private static final DoubleMetaClass doubleMetaClass = (DoubleMetaClass)getInstance("uk.co.wilson.ng.runtime.metaclass.primitives.doubleimpl.DoubleMetaClassImpl");
  private static final BigIntegerMetaClass bigIntegerMetaClass = (BigIntegerMetaClass)getInstance("uk.co.wilson.ng.runtime.metaclass.primitives.biginteger.BigIntegerMetaClassImpl");
  private static final BigDecimalMetaClass bigDecimalMetaClass = (BigDecimalMetaClass)getInstance("uk.co.wilson.ng.runtime.metaclass.primitives.bigdecimal.BigDecimalMetaClassImpl");
  private static final StringMetaClass stringMetaClass = (StringMetaClass)getInstance("uk.co.wilson.ng.runtime.metaclass.primitives.string.StringMetaClassImpl");

  private static Object getInstance(final String className) {
    try {
      return Class.forName(className).newInstance();
    } catch (InstantiationException e) {
      throw new NgRuntimeException(e);
    } catch (IllegalAccessException e) {
      throw new NgRuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new NgRuntimeException(e);
    }
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
