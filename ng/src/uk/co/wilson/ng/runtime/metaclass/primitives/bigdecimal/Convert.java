package uk.co.wilson.ng.runtime.metaclass.primitives.bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;
import uk.co.wilson.ng.runtime.threadcontext.NotPerformed;


class Convert implements BigDecimalConversion {
  public boolean doAsBoolean(final ExtendedThreadContext tc, final BigDecimal value) throws NotPerformed {
    return value.compareTo(BigDecimal.ZERO) == 0;
  }

  public char doAsChar(final ExtendedThreadContext tc, final BigDecimal value) throws NotPerformed {
    return (char)value.intValue();
  }

  public byte doAsByte(final ExtendedThreadContext tc, final BigDecimal value) throws NotPerformed {
    return value.byteValue();
  }

  public short doAsShort(final ExtendedThreadContext tc, final BigDecimal value) throws NotPerformed {
    return value.shortValue();
  }

  public int doAsInt(final ExtendedThreadContext tc, final BigDecimal value) throws NotPerformed {
    return value.intValue();
  }

  public long doAsLong(final ExtendedThreadContext tc, final BigDecimal value) throws NotPerformed {
    return value.longValue();
  }

  public float doAsFloat(final ExtendedThreadContext tc, final BigDecimal value) throws NotPerformed {
    return value.floatValue();
  }

  public double doAsDouble(final ExtendedThreadContext tc, final BigDecimal value) throws NotPerformed {
    return value.doubleValue();
  }

  public BigInteger doAsBigInteger(final ExtendedThreadContext tc, final BigDecimal value) throws NotPerformed {
    return value.toBigInteger();
  }

  public String doAsString(final ExtendedThreadContext tc, final BigDecimal value) throws NotPerformed {
    return value.toString();
  }

  public boolean doAsBoolean(final ExtendedThreadContext tc, final Object instance) {
    return ((BigInteger)instance).intValue() != 0;
  }

  public char doAsChar(final ExtendedThreadContext tc, final Object instance) {
    return (char)((BigInteger)instance).intValue();
  }

  public byte doAsByte(final ExtendedThreadContext tc, final Object instance) {
    return (byte)((BigInteger)instance).intValue();
  }

  public short doAsShort(final ExtendedThreadContext tc, final Object instance) {
    return (short)((BigInteger)instance).intValue();
  }

  public int doAsInt(final ExtendedThreadContext tc, final Object instance) {
    return ((BigInteger)instance).intValue();
  }

  public long doAsLong(final ExtendedThreadContext tc, final Object instance) {
    return ((BigInteger)instance).longValue();
  }

  public float doAsFloat(final ExtendedThreadContext tc, final Object instance) {
    return ((BigInteger)instance).floatValue();
  }

  public double doAsDouble(final ExtendedThreadContext tc, final Object instance) {
    return ((BigInteger)instance).doubleValue();
  }

  public BigInteger doAsBigInteger(final ExtendedThreadContext tc, final Object instance) {
    return (BigInteger)instance;
  }

  public BigDecimal doAsBigDecimal(final ExtendedThreadContext tc, final Object instance) {
    return new BigDecimal((BigInteger)instance);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsString(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public String doAsString(final ExtendedThreadContext tc, final Object instance) throws NotPerformed {
    return ((BigInteger)instance).toString();
  }

  public Object doAsType(final ExtendedThreadContext tc, final Object instance, final Class<?> type) {
    return tc.getMetaClassFor(type).convert().doAsYourType(tc, (BigInteger)instance);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final boolean value) {
    return BigInteger.valueOf(value ? 1 : 0);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final char value) {
    return BigInteger.valueOf(value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final byte value) {
    return BigInteger.valueOf(value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final short value) {
    return BigInteger.valueOf(value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final int value) {
    return BigInteger.valueOf(value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final long value) {
    return BigInteger.valueOf(value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final float value) {
    return BigInteger.valueOf((long)value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final double value) {
    return BigInteger.valueOf((long)value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final BigInteger value) {
    return value;
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final BigDecimal value) {
    return BigInteger.valueOf(value.longValue());
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final Object instance) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }
}
