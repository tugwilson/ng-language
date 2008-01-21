package uk.co.wilson.ng.runtime.metaclass.primitives.bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.Conversion;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

class Convert implements Conversion {

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
    return BigDecimal.valueOf(((BigInteger)instance).longValue());
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsString(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public String doAsString(ThreadContext tc, Object instance) throws NotPerformed {
    return ((BigInteger)instance).toString();
  }

  public Object doAsType(final ThreadContext tc, final Object instance, final Class<?> type) {
    return tc.getMetaClassFor(type).convert().doAsYourType(tc, (BigInteger)instance);
  }

  public Object doAsYourType(final ThreadContext tc, final boolean value) {
    return BigInteger.valueOf(value ? 1 : 0);
  }

  public Object doAsYourType(final ThreadContext tc, final char value) {
    return BigInteger.valueOf(value);
  }

  public Object doAsYourType(final ThreadContext tc, final byte value) {
    return BigInteger.valueOf(value);
  }

  public Object doAsYourType(final ThreadContext tc, final short value) {
    return BigInteger.valueOf(value);
  }

  public Object doAsYourType(final ThreadContext tc, final int value) {
    return BigInteger.valueOf(value);
  }

  public Object doAsYourType(final ThreadContext tc, final long value) {
    return BigInteger.valueOf(value);
  }

  public Object doAsYourType(final ThreadContext tc, final float value) {
    return BigInteger.valueOf((long)value);
  }

  public Object doAsYourType(final ThreadContext tc, final double value) {
    return BigInteger.valueOf((long)value);
  }

  public Object doAsYourType(final ThreadContext tc, final BigInteger value) {
    return value;
  }

  public Object doAsYourType(final ThreadContext tc, final BigDecimal value) {
    return BigInteger.valueOf(value.longValue());
  }

  public Object doAsYourType(final ThreadContext tc, final Object instance) {
    return ThreadContext.NOT_PERFORMED;
  }
}
