package uk.co.wilson.ng.runtime.metaclass.primitives.biginteger;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

class Convert implements BigIntegerConversion {
  public boolean doAsBoolean(final ThreadContext tc, final BigInteger value) throws NotPerformed {
    return value.compareTo(BigInteger.ZERO) != 0;
  }

  public char doAsChar(final ThreadContext tc, final BigInteger value) throws NotPerformed {
    return (char)value.intValue();
  }

  public byte doAsByte(final ThreadContext tc, final BigInteger value) throws NotPerformed {
    return value.byteValue();
  }

  public short doAsShort(final ThreadContext tc, final BigInteger value) throws NotPerformed {
    return value.shortValue();
  }

  public int doAsInt(final ThreadContext tc, final BigInteger value) throws NotPerformed {
    return value.intValue();
  }

  public long doAsLong(final ThreadContext tc, final BigInteger value) throws NotPerformed {
    return value.longValue();
  }

  public float doAsFloat(final ThreadContext tc, final BigInteger value) throws NotPerformed {
    return value.floatValue();
  }

  public double doAsDouble(final ThreadContext tc, final BigInteger value) throws NotPerformed {
    return value.doubleValue();
  }

  public BigDecimal doAsBigDecimal(final ThreadContext tc, final BigInteger value) throws NotPerformed {
    return new BigDecimal(value);
  }

  public String doAsString(final ThreadContext tc, final BigInteger value) throws NotPerformed {
    return value.toString();
  }

  public boolean doAsBoolean(final ThreadContext tc, final Object instance) {
    return ((BigInteger)instance).intValue() != 0;
  }

  public char doAsChar(final ThreadContext tc, final Object instance) {
    return (char)((BigInteger)instance).intValue();
  }

  public byte doAsByte(final ThreadContext tc, final Object instance) {
    return (byte)((BigInteger)instance).intValue();
  }

  public short doAsShort(final ThreadContext tc, final Object instance) {
    return (short)((BigInteger)instance).intValue();
  }

  public int doAsInt(final ThreadContext tc, final Object instance) {
    return ((BigInteger)instance).intValue();
  }

  public long doAsLong(final ThreadContext tc, final Object instance) {
    return ((BigInteger)instance).longValue();
  }

  public float doAsFloat(final ThreadContext tc, final Object instance) {
    return ((BigInteger)instance).floatValue();
  }

  public double doAsDouble(final ThreadContext tc, final Object instance) {
    return ((BigInteger)instance).doubleValue();
  }

  public BigInteger doAsBigInteger(final ThreadContext tc, final Object instance) {
    return (BigInteger)instance;
  }

  public BigDecimal doAsBigDecimal(final ThreadContext tc, final Object instance) {
    return new BigDecimal((BigInteger)instance);
  }

  public String doAsString(final ThreadContext tc, final Object instance) throws NotPerformed {
    return ((BigDecimal)instance).toString();
  }

  public Object doAsType(final ThreadContext tc, final Object instance, final Class<?> type) {
    return tc.getMetaClassFor(type).convert().doAsYourType(tc, (BigDecimal)instance);
  }

  public Object doAsYourType(final ThreadContext tc, final boolean value) {
    return BigDecimal.valueOf(value ? 1 : 0);
  }

  public Object doAsYourType(final ThreadContext tc, final char value) {
    return BigDecimal.valueOf(value);
  }

  public Object doAsYourType(final ThreadContext tc, final byte value) {
    return BigDecimal.valueOf(value);
  }

  public Object doAsYourType(final ThreadContext tc, final short value) {
    return BigDecimal.valueOf(value);
  }

  public Object doAsYourType(final ThreadContext tc, final int value) {
    return BigDecimal.valueOf(value);
  }

  public Object doAsYourType(final ThreadContext tc, final long value) {
    return BigDecimal.valueOf(value);
  }

  public Object doAsYourType(final ThreadContext tc, final float value) {
    return BigDecimal.valueOf(value);
  }

  public Object doAsYourType(final ThreadContext tc, final double value) {
    return BigDecimal.valueOf(value);
  }

  public Object doAsYourType(final ThreadContext tc, final BigInteger value) {
    return BigDecimal.valueOf(value.longValue());
  }

  public Object doAsYourType(final ThreadContext tc, final BigDecimal value) {
    return value;
  }

  public Object doAsYourType(final ThreadContext tc, final Object instance) {
    return ThreadContext.NOT_PERFORMED;
  }
}
