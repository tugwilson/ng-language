package uk.co.wilson.ng.runtime.threadcontext;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import java.util.Stack;

import ng.lang.NgRuntimeException;
import ng.runtime.metaclass.Conversion;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.metaclass.PrimitiveMetaClasses;
import ng.runtime.threadcontext.ConversionOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

public class BaseConversionImpl implements ConversionOperation {
  private Map<Object, Conversion> categoryOperationMap = null;

  private final Stack<Map<Object, Conversion>> categoryOperationMapStack = new Stack<Map<Object, Conversion>>();

  private final ExtendedThreadContext tc;

  public BaseConversionImpl(final ExtendedThreadContext tc) {
    this.tc = tc;
  }

  public Map<Object, Conversion> getCategoryConversionCallMap() {
    return this.categoryOperationMap;
  }

  public void setCategoryConversionMap(final Map<Object, Conversion> categoryConversionMap) {
    this.categoryOperationMap = categoryConversionMap;
  }

  public boolean asBoolean(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert(this).doAsBoolean(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to boolean");
    }
  }

  public boolean asBoolean(final Object instance) {
    return asBoolean(this.tc.getMetaClassFor(instance), instance);
  }

  public boolean asBoolean(final char value) {
    try {
      return PrimitiveMetaClasses.getCharMetaClass().convert(this).doAsBoolean(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type char cannot be converted to boolean");
    }
  }

  public boolean asBoolean(final byte value) {
    try {
      return PrimitiveMetaClasses.getByteMetaClass().convert(this).doAsBoolean(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type byte cannot be converted to boolean");
    }
  }

  public boolean asBoolean(final short value) {
    try {
      return PrimitiveMetaClasses.getShortMetaClass().convert(this).doAsBoolean(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type short cannot be converted to boolean");
    }
  }

  public boolean asBoolean(final int value) {
    try {
      return PrimitiveMetaClasses.getIntMetaClass().convert(this).doAsBoolean(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type int cannot be converted to boolean");
    }
  }

  public boolean asBoolean(final long value) {
    try {
      return PrimitiveMetaClasses.getLongMetaClass().convert(this).doAsBoolean(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type long cannot be converted to boolean");
    }
  }

  public boolean asBoolean(final float value) {
    try {
      return PrimitiveMetaClasses.getFloatMetaClass().convert(this).doAsBoolean(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type float cannot be converted to boolean");
    }
  }

  public boolean asBoolean(final double value) {
    try {
      return PrimitiveMetaClasses.getDoubleMetaClass().convert(this).doAsBoolean(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type double cannot be converted to boolean");
    }
  }

  public boolean asBoolean(final BigInteger value) {
    try {
      return PrimitiveMetaClasses.getBigIntegerMetaClass().convert(this).doAsBoolean(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigInteger cannot be converted to boolean");
    }
  }

  public boolean asBoolean(final BigDecimal value) {
    try {
      return PrimitiveMetaClasses.getBigDecimalMetaClass().convert(this).doAsBoolean(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigDecimal cannot be converted to boolean");
    }
  }

  public char asChar(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert(this).doAsChar(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to char");
    }
  }

  public char asChar(final Object instance) {
    return asChar(this.tc.getMetaClassFor(instance), instance);
  }

  public char asChar(final byte value) {
    try {
      return PrimitiveMetaClasses.getByteMetaClass().convert(this).doAsChar(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type byte cannot be converted to char");
    }
  }

  public char asChar(final short value) {
    try {
      return PrimitiveMetaClasses.getShortMetaClass().convert(this).doAsChar(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type short cannot be converted to char");
    }
  }

  public char asChar(final int value) {
    try {
      return PrimitiveMetaClasses.getIntMetaClass().convert(this).doAsChar(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type int cannot be converted to char");
    }
  }

  public char asChar(final long value) {
    try {
      return PrimitiveMetaClasses.getLongMetaClass().convert(this).doAsChar(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type long cannot be converted to char");
    }
  }

  public char asChar(final float value) {
    try {
      return PrimitiveMetaClasses.getFloatMetaClass().convert(this).doAsChar(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type float cannot be converted to char");
    }
  }

  public char asChar(final double value) {
    try {
      return PrimitiveMetaClasses.getDoubleMetaClass().convert(this).doAsChar(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type double cannot be converted to char");
    }
  }

  public char asChar(final BigInteger value) {
    try {
      return PrimitiveMetaClasses.getBigIntegerMetaClass().convert(this).doAsChar(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigInteger cannot be converted to char");
    }
  }

  public char asChar(final BigDecimal value) {
    try {
      return PrimitiveMetaClasses.getBigDecimalMetaClass().convert(this).doAsChar(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigDecimal cannot be converted to char");
    }
  }

  public byte asByte(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert(this).doAsByte(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to byte");
    }
  }

  public byte asByte(final Object instance) {
    return asByte(this.tc.getMetaClassFor(instance), instance);
  }

  public byte asByte(final char value) {
    try {
      return PrimitiveMetaClasses.getCharMetaClass().convert(this).doAsByte(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type char cannot be converted to byte");
    }
  }

  public byte asByte(final short value) {
    try {
      return PrimitiveMetaClasses.getShortMetaClass().convert(this).doAsByte(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type short cannot be converted to byte");
    }
  }

  public byte asByte(final int value) {
    try {
      return PrimitiveMetaClasses.getIntMetaClass().convert(this).doAsByte(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type int cannot be converted to byte");
    }
  }

  public byte asByte(final long value) {
    try {
      return PrimitiveMetaClasses.getLongMetaClass().convert(this).doAsByte(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type long cannot be converted to byte");
    }
  }

  public byte asByte(final float value) {
    try {
      return PrimitiveMetaClasses.getFloatMetaClass().convert(this).doAsByte(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type float cannot be converted to byte");
    }
  }

  public byte asByte(final double value) {
    try {
      return PrimitiveMetaClasses.getDoubleMetaClass().convert(this).doAsByte(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type double cannot be converted to byte");
    }
  }

  public byte asByte(final BigInteger value) {
    try {
      return PrimitiveMetaClasses.getBigIntegerMetaClass().convert(this).doAsByte(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigInteger cannot be converted to byte");
    }
  }

  public byte asByte(final BigDecimal value) {
    try {
      return PrimitiveMetaClasses.getBigDecimalMetaClass().convert(this).doAsByte(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigDecimal cannot be converted to byte");
    }
  }

  public short asShort(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert(this).doAsShort(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to short");
    }
  }

  public short asShort(final Object instance) {
    return asShort(this.tc.getMetaClassFor(instance), instance);
  }

  public short asShort(final char value) {
    try {
      return PrimitiveMetaClasses.getCharMetaClass().convert(this).doAsShort(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type char cannot be converted to short");
    }
  }

  public short asShort(final byte value) {
    try {
      return PrimitiveMetaClasses.getByteMetaClass().convert(this).doAsShort(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type byte cannot be converted to short");
    }
  }

  public short asShort(final int value) {
    try {
      return PrimitiveMetaClasses.getIntMetaClass().convert(this).doAsShort(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type int cannot be converted to short");
    }
  }

  public short asShort(final long value) {
    try {
      return PrimitiveMetaClasses.getLongMetaClass().convert(this).doAsShort(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type long cannot be converted to short");
    }
  }

  public short asShort(final float value) {
    try {
      return PrimitiveMetaClasses.getFloatMetaClass().convert(this).doAsShort(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type float cannot be converted to short");
    }
  }

  public short asShort(final double value) {
    try {
      return PrimitiveMetaClasses.getDoubleMetaClass().convert(this).doAsShort(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type double cannot be converted to short");
    }
  }

  public short asShort(final BigInteger value) {
    try {
      return PrimitiveMetaClasses.getBigIntegerMetaClass().convert(this).doAsShort(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigInteger cannot be converted to short");
    }
  }

  public short asShort(final BigDecimal value) {
    try {
      return PrimitiveMetaClasses.getBigDecimalMetaClass().convert(this).doAsShort(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigDecimal cannot be converted to short");
    }
  }

  public int asInt(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert(this).doAsInt(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to int");
    }
  }

  public int asInt(final Object instance) {
    return asInt(this.tc.getMetaClassFor(instance), instance);
  }

  public int asInt(final char value) {
    try {
      return PrimitiveMetaClasses.getCharMetaClass().convert(this).doAsInt(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type char cannot be converted to int");
    }
  }

  public int asInt(final byte value) {
    try {
      return PrimitiveMetaClasses.getByteMetaClass().convert(this).doAsInt(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type byte cannot be converted to int");
    }
  }

  public int asInt(final short value) {
    try {
      return PrimitiveMetaClasses.getShortMetaClass().convert(this).doAsInt(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type short cannot be converted to int");
    }
  }

  public int asInt(final long value) {
    try {
      return PrimitiveMetaClasses.getLongMetaClass().convert(this).doAsInt(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type long cannot be converted to int");
    }
  }

  public int asInt(final float value) {
    try {
      return PrimitiveMetaClasses.getFloatMetaClass().convert(this).doAsInt(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type float cannot be converted to int");
    }
  }

  public int asInt(final double value) {
    try {
      return PrimitiveMetaClasses.getDoubleMetaClass().convert(this).doAsInt(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type double cannot be converted to int");
    }
  }

  public int asInt(final BigInteger value) {
    try {
      return PrimitiveMetaClasses.getBigIntegerMetaClass().convert(this).doAsInt(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigInteger cannot be converted to int");
    }
  }

  public int asInt(final BigDecimal value) {
    try {
      return PrimitiveMetaClasses.getBigDecimalMetaClass().convert(this).doAsInt(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigDecimal cannot be converted to int");
    }
  }

  public long asLong(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert(this).doAsLong(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to long");
    }
  }

  public long asLong(final Object instance) {
    return asLong(this.tc.getMetaClassFor(instance), instance);
  }

  public long asLong(final char value) {
    try {
      return PrimitiveMetaClasses.getCharMetaClass().convert(this).doAsLong(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type char cannot be converted to long");
    }
  }

  public long asLong(final byte value) {
    try {
      return PrimitiveMetaClasses.getByteMetaClass().convert(this).doAsLong(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type byte cannot be converted to long");
    }
  }

  public long asLong(final short value) {
    try {
      return PrimitiveMetaClasses.getShortMetaClass().convert(this).doAsLong(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type short cannot be converted to long");
    }
  }

  public long asLong(final int value) {
    try {
      return PrimitiveMetaClasses.getIntMetaClass().convert(this).doAsLong(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type int cannot be converted to long");
    }
  }

  public long asLong(final float value) {
    try {
      return PrimitiveMetaClasses.getFloatMetaClass().convert(this).doAsLong(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type float cannot be converted to long");
    }
  }

  public long asLong(final double value) {
    try {
      return PrimitiveMetaClasses.getDoubleMetaClass().convert(this).doAsLong(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type double cannot be converted to long");
    }
  }

  public long asLong(final BigInteger value) {
    try {
      return PrimitiveMetaClasses.getBigIntegerMetaClass().convert(this).doAsLong(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigInteger cannot be converted to long");
    }
  }

  public long asLong(final BigDecimal value) {
    try {
      return PrimitiveMetaClasses.getBigDecimalMetaClass().convert(this).doAsLong(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigDecimal cannot be converted to long");
    }
  }

  public float asFloat(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert(this).doAsFloat(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to float");
    }
  }

  public float asFloat(final Object instance) {
    return asFloat(this.tc.getMetaClassFor(instance), instance);
  }

  public float asFloat(final char value) {
    try {
      return PrimitiveMetaClasses.getCharMetaClass().convert(this).doAsFloat(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type char cannot be converted to float");
    }
  }

  public float asFloat(final byte value) {
    try {
      return PrimitiveMetaClasses.getByteMetaClass().convert(this).doAsFloat(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type byte cannot be converted to float");
    }
  }

  public float asFloat(final short value) {
    try {
      return PrimitiveMetaClasses.getShortMetaClass().convert(this).doAsFloat(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type short cannot be converted to float");
    }
  }

  public float asFloat(final int value) {
    try {
      return PrimitiveMetaClasses.getIntMetaClass().convert(this).doAsFloat(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type int cannot be converted to float");
    }
  }

  public float asFloat(final long value) {
    try {
      return PrimitiveMetaClasses.getLongMetaClass().convert(this).doAsFloat(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type long cannot be converted to float");
    }
  }

  public float asFloat(final double value) {
    try {
      return PrimitiveMetaClasses.getDoubleMetaClass().convert(this).doAsFloat(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type double cannot be converted to float");
    }
  }

  public float asFloat(final BigInteger value) {
    try {
      return PrimitiveMetaClasses.getBigIntegerMetaClass().convert(this).doAsFloat(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigInteger cannot be converted to float");
    }
  }

  public float asFloat(final BigDecimal value) {
    try {
      return PrimitiveMetaClasses.getBigDecimalMetaClass().convert(this).doAsFloat(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigDecimal cannot be converted to float");
    }
  }

  public double asDouble(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert(this).doAsDouble(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to double");
    }
  }

  public double asDouble(final Object instance) {
    return asDouble(this.tc.getMetaClassFor(instance), instance);
  }

  public double asDouble(final char value) {
    try {
      return PrimitiveMetaClasses.getCharMetaClass().convert(this).doAsDouble(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type char cannot be converted to Double");
    }
  }

  public double asDouble(final byte value) {
    try {
      return PrimitiveMetaClasses.getByteMetaClass().convert(this).doAsDouble(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type byte cannot be converted to Double");
    }
  }

  public double asDouble(final short value) {
    try {
      return PrimitiveMetaClasses.getShortMetaClass().convert(this).doAsDouble(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type short cannot be converted to Double");
    }
  }

  public double asDouble(final int value) {
    try {
      return PrimitiveMetaClasses.getIntMetaClass().convert(this).doAsDouble(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type int cannot be converted to Double");
    }
  }

  public double asDouble(final long value) {
    try {
      return PrimitiveMetaClasses.getLongMetaClass().convert(this).doAsDouble(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type long cannot be converted to Double");
    }
  }

  public double asDouble(final float value) {
    try {
      return PrimitiveMetaClasses.getFloatMetaClass().convert(this).doAsDouble(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type float cannot be converted to Double");
    }
  }

  public double asDouble(final BigInteger value) {
    try {
      return PrimitiveMetaClasses.getBigIntegerMetaClass().convert(this).doAsDouble(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigInteger cannot be converted to Double");
    }
  }

  public double asDouble(final BigDecimal value) {
    try {
      return PrimitiveMetaClasses.getBigDecimalMetaClass().convert(this).doAsDouble(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigDecimal cannot be converted to Double");
    }
  }

  public BigInteger asBigInteger(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert(this).doAsBigInteger(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to BigInteger");
    }
  }

  public BigInteger asBigInteger(final Object instance) {
    return asBigInteger(this.tc.getMetaClassFor(instance), instance);
  }

  public BigInteger asBigInteger(final char value) {
    try {
      return PrimitiveMetaClasses.getCharMetaClass().convert(this).doAsBigInteger(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type char cannot be converted to BigInteger");
    }
  }

  public BigInteger asBigInteger(final byte value) {
    try {
      return PrimitiveMetaClasses.getByteMetaClass().convert(this).doAsBigInteger(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type byte cannot be converted to BigInteger");
    }
  }

  public BigInteger asBigInteger(final short value) {
    try {
      return PrimitiveMetaClasses.getShortMetaClass().convert(this).doAsBigInteger(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type short cannot be converted to BigInteger");
    }
  }

  public BigInteger asBigInteger(final int value) {
    try {
      return PrimitiveMetaClasses.getIntMetaClass().convert(this).doAsBigInteger(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type int cannot be converted to BigInteger");
    }
  }

  public BigInteger asBigInteger(final long value) {
    try {
      return PrimitiveMetaClasses.getLongMetaClass().convert(this).doAsBigInteger(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type long cannot be converted to BigInteger");
    }
  }

  public BigInteger asBigInteger(final float value) {
    try {
      return PrimitiveMetaClasses.getFloatMetaClass().convert(this).doAsBigInteger(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type float cannot be converted to BigInteger");
    }
  }

  public BigInteger asBigInteger(final double value) {
    try {
      return PrimitiveMetaClasses.getDoubleMetaClass().convert(this).doAsBigInteger(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type double cannot be converted to BigInteger");
    }
  }

  public BigInteger asBigInteger(final BigDecimal value) {
    try {
      return PrimitiveMetaClasses.getBigDecimalMetaClass().convert(this).doAsBigInteger(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigDecimal cannot be converted to BigInteger");
    }
  }

  public BigDecimal asBigDecimal(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert(this).doAsBigDecimal(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to BigDecimal");
    }
  }

  public BigDecimal asBigDecimal(final Object instance) {
    return asBigDecimal(this.tc.getMetaClassFor(instance), instance);
  }

  public BigDecimal asBigDecimal(final char value) {
    try {
      return PrimitiveMetaClasses.getCharMetaClass().convert(this).doAsBigDecimal(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type char cannot be converted to BigDecimal");
    }
  }

  public BigDecimal asBigDecimal(final byte value) {
    try {
      return PrimitiveMetaClasses.getByteMetaClass().convert(this).doAsBigDecimal(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type byte cannot be converted to BigDecimal");
    }
  }

  public BigDecimal asBigDecimal(final short value) {
    try {
      return PrimitiveMetaClasses.getShortMetaClass().convert(this).doAsBigDecimal(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type short cannot be converted to BigDecimal");
    }
  }

  public BigDecimal asBigDecimal(final int value) {
    try {
      return PrimitiveMetaClasses.getIntMetaClass().convert(this).doAsBigDecimal(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type int cannot be converted to BigDecimal");
    }
  }

  public BigDecimal asBigDecimal(final long value) {
    try {
      return PrimitiveMetaClasses.getLongMetaClass().convert(this).doAsBigDecimal(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type long cannot be converted to BigDecimal");
    }
  }

  public BigDecimal asBigDecimal(final float value) {
    try {
      return PrimitiveMetaClasses.getFloatMetaClass().convert(this).doAsBigDecimal(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type float cannot be converted to BigDecimal");
    }
  }

  public BigDecimal asBigDecimal(final double value) {
    try {
      return PrimitiveMetaClasses.getDoubleMetaClass().convert(this).doAsBigDecimal(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type double cannot be converted to BigDecimal");
    }
  }

  public BigDecimal asBigDecimal(final BigInteger value) {
    try {
      return PrimitiveMetaClasses.getBigIntegerMetaClass().convert(this).doAsBigDecimal(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigInteger cannot be converted to BigDecimal");
    }
  }

  public String asString(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert(this).doAsString(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to String");
    }
  }

  public String asString(final Object instance) {
    return asString(this.tc.getMetaClassFor(instance), instance);
  }

  public String asString(final char value) {
    try {
      return PrimitiveMetaClasses.getCharMetaClass().convert(this).doAsString(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type char cannot be converted to boolean");
    }
  }

  public String asString(final byte value) {
    try {
      return PrimitiveMetaClasses.getByteMetaClass().convert(this).doAsString(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type byte cannot be converted to boolean");
    }
  }

  public String asString(final short value) {
    try {
      return PrimitiveMetaClasses.getShortMetaClass().convert(this).doAsString(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type short cannot be converted to boolean");
    }
  }

  public String asString(final int value) {
    try {
      return PrimitiveMetaClasses.getIntMetaClass().convert(this).doAsString(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type int cannot be converted to boolean");
    }
  }

  public String asString(final long value) {
    try {
      return PrimitiveMetaClasses.getLongMetaClass().convert(this).doAsString(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type long cannot be converted to boolean");
    }
  }

  public String asString(final float value) {
    try {
      return PrimitiveMetaClasses.getFloatMetaClass().convert(this).doAsString(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type float cannot be converted to boolean");
    }
  }

  public String asString(final double value) {
    try {
      return PrimitiveMetaClasses.getDoubleMetaClass().convert(this).doAsString(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type double cannot be converted to boolean");
    }
  }

  public String asString(final BigInteger value) {
    try {
      return PrimitiveMetaClasses.getBigIntegerMetaClass().convert(this).doAsString(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigInteger cannot be converted to boolean");
    }
  }

  public String asString(final BigDecimal value) {
    try {
      return PrimitiveMetaClasses.getBigDecimalMetaClass().convert(this).doAsString(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigDecimal cannot be converted to boolean");
    }
  }

  public Object asType(final MetaClass metaClass, final Object instance, final Object type) {
    Object result;

    if (type instanceof Class) {
      try {
        if (type == boolean.class) {
          return this.tc.wrap(metaClass.convert(this).doAsBoolean(this.tc, instance));
        } else if (type == char.class) {
          return this.tc.wrap(metaClass.convert(this).doAsChar(this.tc, instance));
        } else if (type == byte.class) {
          return this.tc.wrap(metaClass.convert(this).doAsByte(this.tc, instance));
        } else if (type == short.class) {
          return this.tc.wrap(metaClass.convert(this).doAsShort(this.tc, instance));
        } else if (type == int.class) {
          return this.tc.wrap(metaClass.convert(this).doAsInt(this.tc, instance));
        } else if (type == long.class) {
          return this.tc.wrap(metaClass.convert(this).doAsLong(this.tc, instance));
        } else if (type == float.class) {
          return this.tc.wrap(metaClass.convert(this).doAsFloat(this.tc, instance));
        } else if (type == double.class) {
          return this.tc.wrap(metaClass.convert(this).doAsDouble(this.tc, instance));
        } else if (type == BigInteger.class) {
          return metaClass.convert(this).doAsBigInteger(this.tc, instance);
        } else if (type == BigDecimal.class) {
          return metaClass.convert(this).doAsBigDecimal(this.tc, instance);
        } else {
          result = metaClass.convert(this).doAsType(this.tc, instance, (Class<?>)type);
        }
      } catch (final NotPerformed e) {
        result = ExtendedThreadContext.NOT_PERFORMED;
      }

      if (result == ExtendedThreadContext.NOT_PERFORMED) {
        throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to " + ((Class<?>)type).getName());
      } else {
        return result;
      }
    } else {
      throw new NgRuntimeException("The target type for an as operation is " + type.getClass() + " it should be a Class" );
    }
  }

  public Object asType(final Object instance, final Object type) {
    return asType(this.tc.getMetaClassFor(type), instance, type);
 }
}
