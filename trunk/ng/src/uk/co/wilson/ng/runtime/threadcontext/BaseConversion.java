package uk.co.wilson.ng.runtime.threadcontext;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.lang.NgRuntimeException;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.Coversion;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

public class BaseConversion implements Coversion {
  private final ExtendedThreadContext tc;

  public BaseConversion(final ExtendedThreadContext tc) {
    this.tc = tc;
  }

  public boolean asBoolean(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert().doAsBoolean(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to boolean");
    }
  }

  public boolean asBoolean(final Object instance) {
    return asBoolean(this.tc.getMetaClassFor(instance), instance);
  }

  public boolean asBoolean(final char value) {
    try {
      return PrimitiveMetaClasses.getCharMetaClass().convert().doAsBoolean(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type char cannot be converted to boolean");
    }
  }

  public boolean asBoolean(final byte value) {
    try {
      return PrimitiveMetaClasses.getByteMetaClass().convert().doAsBoolean(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type byte cannot be converted to boolean");
    }
  }

  public boolean asBoolean(final short value) {
    try {
      return PrimitiveMetaClasses.getShortMetaClass().convert().doAsBoolean(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type short cannot be converted to boolean");
    }
  }

  public boolean asBoolean(final int value) {
    try {
      return PrimitiveMetaClasses.getIntMetaClass().convert().doAsBoolean(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type int cannot be converted to boolean");
    }
  }

  public boolean asBoolean(final long value) {
    try {
      return PrimitiveMetaClasses.getLongMetaClass().convert().doAsBoolean(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type long cannot be converted to boolean");
    }
  }

  public boolean asBoolean(final float value) {
    try {
      return PrimitiveMetaClasses.getFloatMetaClass().convert().doAsBoolean(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type float cannot be converted to boolean");
    }
  }

  public boolean asBoolean(final double value) {
    try {
      return PrimitiveMetaClasses.getDoubleMetaClass().convert().doAsBoolean(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type double cannot be converted to boolean");
    }
  }

  public boolean asBoolean(final BigInteger value) {
    try {
      return PrimitiveMetaClasses.getBigIntegerMetaClass().convert().doAsBoolean(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigInteger cannot be converted to boolean");
    }
  }

  public boolean asBoolean(final BigDecimal value) {
    try {
      return PrimitiveMetaClasses.getBigDecimalMetaClass().convert().doAsBoolean(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigDecimal cannot be converted to boolean");
    }
  }

  public char asChar(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert().doAsChar(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to char");
    }
  }

  public char asChar(final Object instance) {
    return asChar(this.tc.getMetaClassFor(instance), instance);
  }

  public char asChar(final byte value) {
    try {
      return PrimitiveMetaClasses.getByteMetaClass().convert().doAsChar(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type byte cannot be converted to char");
    }
  }

  public char asChar(final short value) {
    try {
      return PrimitiveMetaClasses.getShortMetaClass().convert().doAsChar(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type short cannot be converted to char");
    }
  }

  public char asChar(final int value) {
    try {
      return PrimitiveMetaClasses.getIntMetaClass().convert().doAsChar(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type int cannot be converted to char");
    }
  }

  public char asChar(final long value) {
    try {
      return PrimitiveMetaClasses.getLongMetaClass().convert().doAsChar(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type long cannot be converted to char");
    }
  }

  public char asChar(final float value) {
    try {
      return PrimitiveMetaClasses.getFloatMetaClass().convert().doAsChar(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type float cannot be converted to char");
    }
  }

  public char asChar(final double value) {
    try {
      return PrimitiveMetaClasses.getDoubleMetaClass().convert().doAsChar(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type double cannot be converted to char");
    }
  }

  public char asChar(final BigInteger value) {
    try {
      return PrimitiveMetaClasses.getBigIntegerMetaClass().convert().doAsChar(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigInteger cannot be converted to char");
    }
  }

  public char asChar(final BigDecimal value) {
    try {
      return PrimitiveMetaClasses.getBigDecimalMetaClass().convert().doAsChar(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigDecimal cannot be converted to char");
    }
  }

  public byte asByte(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert().doAsByte(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to byte");
    }
  }

  public byte asByte(final Object instance) {
    return asByte(this.tc.getMetaClassFor(instance), instance);
  }

  public byte asByte(final char value) {
    try {
      return PrimitiveMetaClasses.getCharMetaClass().convert().doAsByte(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type char cannot be converted to byte");
    }
  }

  public byte asByte(final short value) {
    try {
      return PrimitiveMetaClasses.getShortMetaClass().convert().doAsByte(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type short cannot be converted to byte");
    }
  }

  public byte asByte(final int value) {
    try {
      return PrimitiveMetaClasses.getIntMetaClass().convert().doAsByte(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type int cannot be converted to byte");
    }
  }

  public byte asByte(final long value) {
    try {
      return PrimitiveMetaClasses.getLongMetaClass().convert().doAsByte(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type long cannot be converted to byte");
    }
  }

  public byte asByte(final float value) {
    try {
      return PrimitiveMetaClasses.getFloatMetaClass().convert().doAsByte(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type float cannot be converted to byte");
    }
  }

  public byte asByte(final double value) {
    try {
      return PrimitiveMetaClasses.getDoubleMetaClass().convert().doAsByte(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type double cannot be converted to byte");
    }
  }

  public byte asByte(final BigInteger value) {
    try {
      return PrimitiveMetaClasses.getBigIntegerMetaClass().convert().doAsByte(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigInteger cannot be converted to byte");
    }
  }

  public byte asByte(final BigDecimal value) {
    try {
      return PrimitiveMetaClasses.getBigDecimalMetaClass().convert().doAsByte(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigDecimal cannot be converted to byte");
    }
  }

  public short asShort(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert().doAsShort(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to short");
    }
  }

  public short asShort(final Object instance) {
    return asShort(this.tc.getMetaClassFor(instance), instance);
  }

  public short asShort(final char value) {
    try {
      return PrimitiveMetaClasses.getCharMetaClass().convert().doAsShort(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type char cannot be converted to short");
    }
  }

  public short asShort(final byte value) {
    try {
      return PrimitiveMetaClasses.getByteMetaClass().convert().doAsShort(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type byte cannot be converted to short");
    }
  }

  public short asShort(final int value) {
    try {
      return PrimitiveMetaClasses.getIntMetaClass().convert().doAsShort(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type int cannot be converted to short");
    }
  }

  public short asShort(final long value) {
    try {
      return PrimitiveMetaClasses.getLongMetaClass().convert().doAsShort(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type long cannot be converted to short");
    }
  }

  public short asShort(final float value) {
    try {
      return PrimitiveMetaClasses.getFloatMetaClass().convert().doAsShort(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type float cannot be converted to short");
    }
  }

  public short asShort(final double value) {
    try {
      return PrimitiveMetaClasses.getDoubleMetaClass().convert().doAsShort(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type double cannot be converted to short");
    }
  }

  public short asShort(final BigInteger value) {
    try {
      return PrimitiveMetaClasses.getBigIntegerMetaClass().convert().doAsShort(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigInteger cannot be converted to short");
    }
  }

  public short asShort(final BigDecimal value) {
    try {
      return PrimitiveMetaClasses.getBigDecimalMetaClass().convert().doAsShort(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigDecimal cannot be converted to short");
    }
  }

  public int asInt(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert().doAsInt(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to int");
    }
  }

  public int asInt(final Object instance) {
    return asInt(this.tc.getMetaClassFor(instance), instance);
  }

  public int asInt(final char value) {
    try {
      return PrimitiveMetaClasses.getCharMetaClass().convert().doAsInt(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type char cannot be converted to int");
    }
  }

  public int asInt(final byte value) {
    try {
      return PrimitiveMetaClasses.getByteMetaClass().convert().doAsInt(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type byte cannot be converted to int");
    }
  }

  public int asInt(final short value) {
    try {
      return PrimitiveMetaClasses.getShortMetaClass().convert().doAsInt(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type short cannot be converted to int");
    }
  }

  public int asInt(final long value) {
    try {
      return PrimitiveMetaClasses.getLongMetaClass().convert().doAsInt(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type long cannot be converted to int");
    }
  }

  public int asInt(final float value) {
    try {
      return PrimitiveMetaClasses.getFloatMetaClass().convert().doAsInt(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type float cannot be converted to int");
    }
  }

  public int asInt(final double value) {
    try {
      return PrimitiveMetaClasses.getDoubleMetaClass().convert().doAsInt(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type double cannot be converted to int");
    }
  }

  public int asInt(final BigInteger value) {
    try {
      return PrimitiveMetaClasses.getBigIntegerMetaClass().convert().doAsInt(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigInteger cannot be converted to int");
    }
  }

  public int asInt(final BigDecimal value) {
    try {
      return PrimitiveMetaClasses.getBigDecimalMetaClass().convert().doAsInt(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigDecimal cannot be converted to int");
    }
  }

  public long asLong(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert().doAsLong(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to long");
    }
  }

  public long asLong(final Object instance) {
    return asLong(this.tc.getMetaClassFor(instance), instance);
  }

  public long asLong(final char value) {
    try {
      return PrimitiveMetaClasses.getCharMetaClass().convert().doAsLong(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type char cannot be converted to long");
    }
  }

  public long asLong(final byte value) {
    try {
      return PrimitiveMetaClasses.getByteMetaClass().convert().doAsLong(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type byte cannot be converted to long");
    }
  }

  public long asLong(final short value) {
    try {
      return PrimitiveMetaClasses.getShortMetaClass().convert().doAsLong(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type short cannot be converted to long");
    }
  }

  public long asLong(final int value) {
    try {
      return PrimitiveMetaClasses.getIntMetaClass().convert().doAsLong(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type int cannot be converted to long");
    }
  }

  public long asLong(final float value) {
    try {
      return PrimitiveMetaClasses.getFloatMetaClass().convert().doAsLong(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type float cannot be converted to long");
    }
  }

  public long asLong(final double value) {
    try {
      return PrimitiveMetaClasses.getDoubleMetaClass().convert().doAsLong(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type double cannot be converted to long");
    }
  }

  public long asLong(final BigInteger value) {
    try {
      return PrimitiveMetaClasses.getBigIntegerMetaClass().convert().doAsLong(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigInteger cannot be converted to long");
    }
  }

  public long asLong(final BigDecimal value) {
    try {
      return PrimitiveMetaClasses.getBigDecimalMetaClass().convert().doAsLong(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigDecimal cannot be converted to long");
    }
  }

  public float asFloat(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert().doAsFloat(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to float");
    }
  }

  public float asFloat(final Object instance) {
    return asFloat(this.tc.getMetaClassFor(instance), instance);
  }

  public float asFloat(final char value) {
    try {
      return PrimitiveMetaClasses.getCharMetaClass().convert().doAsFloat(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type char cannot be converted to float");
    }
  }

  public float asFloat(final byte value) {
    try {
      return PrimitiveMetaClasses.getByteMetaClass().convert().doAsFloat(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type byte cannot be converted to float");
    }
  }

  public float asFloat(final short value) {
    try {
      return PrimitiveMetaClasses.getShortMetaClass().convert().doAsFloat(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type short cannot be converted to float");
    }
  }

  public float asFloat(final int value) {
    try {
      return PrimitiveMetaClasses.getIntMetaClass().convert().doAsFloat(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type int cannot be converted to float");
    }
  }

  public float asFloat(final long value) {
    try {
      return PrimitiveMetaClasses.getLongMetaClass().convert().doAsFloat(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type long cannot be converted to float");
    }
  }

  public float asFloat(final double value) {
    try {
      return PrimitiveMetaClasses.getDoubleMetaClass().convert().doAsFloat(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type double cannot be converted to float");
    }
  }

  public float asFloat(final BigInteger value) {
    try {
      return PrimitiveMetaClasses.getBigIntegerMetaClass().convert().doAsFloat(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigInteger cannot be converted to float");
    }
  }

  public float asFloat(final BigDecimal value) {
    try {
      return PrimitiveMetaClasses.getBigDecimalMetaClass().convert().doAsFloat(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigDecimal cannot be converted to float");
    }
  }

  public double asDouble(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert().doAsDouble(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to double");
    }
  }

  public double asDouble(final Object instance) {
    return asDouble(this.tc.getMetaClassFor(instance), instance);
  }

  public double asDouble(final char value) {
    try {
      return PrimitiveMetaClasses.getCharMetaClass().convert().doAsDouble(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type char cannot be converted to Double");
    }
  }

  public double asDouble(final byte value) {
    try {
      return PrimitiveMetaClasses.getByteMetaClass().convert().doAsDouble(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type byte cannot be converted to Double");
    }
  }

  public double asDouble(final short value) {
    try {
      return PrimitiveMetaClasses.getShortMetaClass().convert().doAsDouble(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type short cannot be converted to Double");
    }
  }

  public double asDouble(final int value) {
    try {
      return PrimitiveMetaClasses.getIntMetaClass().convert().doAsDouble(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type int cannot be converted to Double");
    }
  }

  public double asDouble(final long value) {
    try {
      return PrimitiveMetaClasses.getLongMetaClass().convert().doAsDouble(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type long cannot be converted to Double");
    }
  }

  public double asDouble(final float value) {
    try {
      return PrimitiveMetaClasses.getFloatMetaClass().convert().doAsDouble(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type float cannot be converted to Double");
    }
  }

  public double asDouble(final BigInteger value) {
    try {
      return PrimitiveMetaClasses.getBigIntegerMetaClass().convert().doAsDouble(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigInteger cannot be converted to Double");
    }
  }

  public double asDouble(final BigDecimal value) {
    try {
      return PrimitiveMetaClasses.getBigDecimalMetaClass().convert().doAsDouble(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigDecimal cannot be converted to Double");
    }
  }

  public BigInteger asBigInteger(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert().doAsBigInteger(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to BigInteger");
    }
  }

  public BigInteger asBigInteger(final Object instance) {
    return asBigInteger(this.tc.getMetaClassFor(instance), instance);
  }

  public BigInteger asBigInteger(final char value) {
    try {
      return PrimitiveMetaClasses.getCharMetaClass().convert().doAsBigInteger(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type char cannot be converted to BigInteger");
    }
  }

  public BigInteger asBigInteger(final byte value) {
    try {
      return PrimitiveMetaClasses.getByteMetaClass().convert().doAsBigInteger(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type byte cannot be converted to BigInteger");
    }
  }

  public BigInteger asBigInteger(final short value) {
    try {
      return PrimitiveMetaClasses.getShortMetaClass().convert().doAsBigInteger(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type short cannot be converted to BigInteger");
    }
  }

  public BigInteger asBigInteger(final int value) {
    try {
      return PrimitiveMetaClasses.getIntMetaClass().convert().doAsBigInteger(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type int cannot be converted to BigInteger");
    }
  }

  public BigInteger asBigInteger(final long value) {
    try {
      return PrimitiveMetaClasses.getLongMetaClass().convert().doAsBigInteger(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type long cannot be converted to BigInteger");
    }
  }

  public BigInteger asBigInteger(final float value) {
    try {
      return PrimitiveMetaClasses.getFloatMetaClass().convert().doAsBigInteger(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type float cannot be converted to BigInteger");
    }
  }

  public BigInteger asBigInteger(final double value) {
    try {
      return PrimitiveMetaClasses.getDoubleMetaClass().convert().doAsBigInteger(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type double cannot be converted to BigInteger");
    }
  }

  public BigInteger asBigInteger(final BigDecimal value) {
    try {
      return PrimitiveMetaClasses.getBigDecimalMetaClass().convert().doAsBigInteger(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigDecimal cannot be converted to BigInteger");
    }
  }

  public BigDecimal asBigDecimal(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert().doAsBigDecimal(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to BigDecimal");
    }
  }

  public BigDecimal asBigDecimal(final Object instance) {
    return asBigDecimal(this.tc.getMetaClassFor(instance), instance);
  }

  public BigDecimal asBigDecimal(final char value) {
    try {
      return PrimitiveMetaClasses.getCharMetaClass().convert().doAsBigDecimal(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type char cannot be converted to BigDecimal");
    }
  }

  public BigDecimal asBigDecimal(final byte value) {
    try {
      return PrimitiveMetaClasses.getByteMetaClass().convert().doAsBigDecimal(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type byte cannot be converted to BigDecimal");
    }
  }

  public BigDecimal asBigDecimal(final short value) {
    try {
      return PrimitiveMetaClasses.getShortMetaClass().convert().doAsBigDecimal(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type short cannot be converted to BigDecimal");
    }
  }

  public BigDecimal asBigDecimal(final int value) {
    try {
      return PrimitiveMetaClasses.getIntMetaClass().convert().doAsBigDecimal(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type int cannot be converted to BigDecimal");
    }
  }

  public BigDecimal asBigDecimal(final long value) {
    try {
      return PrimitiveMetaClasses.getLongMetaClass().convert().doAsBigDecimal(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type long cannot be converted to BigDecimal");
    }
  }

  public BigDecimal asBigDecimal(final float value) {
    try {
      return PrimitiveMetaClasses.getFloatMetaClass().convert().doAsBigDecimal(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type float cannot be converted to BigDecimal");
    }
  }

  public BigDecimal asBigDecimal(final double value) {
    try {
      return PrimitiveMetaClasses.getDoubleMetaClass().convert().doAsBigDecimal(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type double cannot be converted to BigDecimal");
    }
  }

  public BigDecimal asBigDecimal(final BigInteger value) {
    try {
      return PrimitiveMetaClasses.getBigIntegerMetaClass().convert().doAsBigDecimal(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigInteger cannot be converted to BigDecimal");
    }
  }

  public String asString(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert().doAsString(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to String");
    }
  }

  public String asString(final Object instance) {
    return asString(this.tc.getMetaClassFor(instance), instance);
  }

  public String asString(final char value) {
    try {
      return PrimitiveMetaClasses.getCharMetaClass().convert().doAsString(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type char cannot be converted to boolean");
    }
  }

  public String asString(final byte value) {
    try {
      return PrimitiveMetaClasses.getByteMetaClass().convert().doAsString(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type byte cannot be converted to boolean");
    }
  }

  public String asString(final short value) {
    try {
      return PrimitiveMetaClasses.getShortMetaClass().convert().doAsString(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type short cannot be converted to boolean");
    }
  }

  public String asString(final int value) {
    try {
      return PrimitiveMetaClasses.getIntMetaClass().convert().doAsString(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type int cannot be converted to boolean");
    }
  }

  public String asString(final long value) {
    try {
      return PrimitiveMetaClasses.getLongMetaClass().convert().doAsString(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type long cannot be converted to boolean");
    }
  }

  public String asString(final float value) {
    try {
      return PrimitiveMetaClasses.getFloatMetaClass().convert().doAsString(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type float cannot be converted to boolean");
    }
  }

  public String asString(final double value) {
    try {
      return PrimitiveMetaClasses.getDoubleMetaClass().convert().doAsString(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type double cannot be converted to boolean");
    }
  }

  public String asString(final BigInteger value) {
    try {
      return PrimitiveMetaClasses.getBigIntegerMetaClass().convert().doAsString(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigInteger cannot be converted to boolean");
    }
  }

  public String asString(final BigDecimal value) {
    try {
      return PrimitiveMetaClasses.getBigDecimalMetaClass().convert().doAsString(this.tc, value);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Standard behaviour has been changed and now a value of type BigDecimal cannot be converted to boolean");
    }
  }

  public Object asType(final MetaClass metaClass, final Object instance, final Object type) {
    Object result;

    if (type instanceof Class) {
      try {
        if (type == boolean.class) {
          return this.tc.wrap(metaClass.convert().doAsBoolean(this.tc, instance));
        } else if (type == char.class) {
          return this.tc.wrap(metaClass.convert().doAsChar(this.tc, instance));
        } else if (type == byte.class) {
          return this.tc.wrap(metaClass.convert().doAsByte(this.tc, instance));
        } else if (type == short.class) {
          return this.tc.wrap(metaClass.convert().doAsShort(this.tc, instance));
        } else if (type == int.class) {
          return this.tc.wrap(metaClass.convert().doAsInt(this.tc, instance));
        } else if (type == long.class) {
          return this.tc.wrap(metaClass.convert().doAsLong(this.tc, instance));
        } else if (type == float.class) {
          return this.tc.wrap(metaClass.convert().doAsFloat(this.tc, instance));
        } else if (type == double.class) {
          return this.tc.wrap(metaClass.convert().doAsDouble(this.tc, instance));
        } else if (type == BigInteger.class) {
          return metaClass.convert().doAsBigInteger(this.tc, instance);
        } else if (type == BigDecimal.class) {
          return metaClass.convert().doAsBigDecimal(this.tc, instance);
        } else {
          result = metaClass.convert().doAsType(this.tc, instance, (Class<?>)type);
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
