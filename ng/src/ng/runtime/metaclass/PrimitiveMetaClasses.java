package ng.runtime.metaclass;

import ng.lang.MetaClass;
import uk.co.wilson.ng.runtime.metaclass.MetaClassImpl;
import uk.co.wilson.ng.runtime.metaclass.primitives.bigdecimal.BigDecimalMetaClassImpl;
import uk.co.wilson.ng.runtime.metaclass.primitives.biginteger.BigIntegerMetaClassImpl;
import uk.co.wilson.ng.runtime.metaclass.primitives.booleanimpl.BooleanMetaClassImpl;
import uk.co.wilson.ng.runtime.metaclass.primitives.byteimpl.ByteMetaClassImpl;
import uk.co.wilson.ng.runtime.metaclass.primitives.charimpl.CharMetaClassImpl;
import uk.co.wilson.ng.runtime.metaclass.primitives.doubleimpl.DoubleMetaClassImpl;
import uk.co.wilson.ng.runtime.metaclass.primitives.floatimpl.FloatMetaClassImpl;
import uk.co.wilson.ng.runtime.metaclass.primitives.intimpl.IntMetaClassImpl;
import uk.co.wilson.ng.runtime.metaclass.primitives.longimpl.LongMetaClassImpl;
import uk.co.wilson.ng.runtime.metaclass.primitives.shortimpl.ShortMetaClassImpl;
import uk.co.wilson.ng.runtime.metaclass.primitives.string.StringMetaClassImpl;


public abstract class PrimitiveMetaClasses {
  private static final MetaClass objectMetaClass = new MetaClassImpl(Object.class);
  private static final BooleanMetaClass booleanMetaClass = new BooleanMetaClassImpl();
  private static final CharMetaClass charMetaClass = new CharMetaClassImpl();
  private static final ByteMetaClass byteMetaClass = new ByteMetaClassImpl();
  private static final ShortMetaClass shortMetaClass = new ShortMetaClassImpl();
  private static final IntMetaClass intMetaClass = new IntMetaClassImpl();
  private static final LongMetaClass longMetaClass = new LongMetaClassImpl();
  private static final FloatMetaClass floatMetaClass = new FloatMetaClassImpl();
  private static final DoubleMetaClass doubleMetaClass = new DoubleMetaClassImpl();
  private static final BigIntegerMetaClass bigIntegerMetaClass = new BigIntegerMetaClassImpl();
  private static final BigDecimalMetaClass bigDecimalMetaClass = new BigDecimalMetaClassImpl();
  private static final StringMetaClass stringMetaClass = new StringMetaClassImpl();

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
