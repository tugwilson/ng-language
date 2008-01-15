package uk.co.wilson.ng.runtime.metaclass.primitives.biginteger;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.Conversion;
import ng.runtime.threadcontext.ThreadContext;

class Convert implements Conversion {

  public boolean doAsBoolean(final ThreadContext tc, final Object instance) {
    return ((BigDecimal)instance).intValue() != 0;
  }

  public char doAsChar(final ThreadContext tc, final Object instance) {
    return (char)((BigDecimal)instance).intValue();
  }

  public byte doAsByte(final ThreadContext tc, final Object instance) {
    return (byte)((BigDecimal)instance).intValue();
  }

  public short doAsShort(final ThreadContext tc, final Object instance) {
    return (short)((BigDecimal)instance).intValue();
  }

  public int doAsInt(final ThreadContext tc, final Object instance) {
    return ((BigDecimal)instance).intValue();
  }

  public long doAsLong(final ThreadContext tc, final Object instance) {
    return ((BigDecimal)instance).longValue();
  }

  public float doAsFloat(final ThreadContext tc, final Object instance) {
    return ((BigDecimal)instance).floatValue();
  }

  public double doAsDouble(final ThreadContext tc, final Object instance) {
    return ((BigDecimal)instance).doubleValue();
  }

  public BigInteger doAsBigInteger(final ThreadContext tc, final Object instance) {
    return BigInteger.valueOf(((BigDecimal)instance).longValue());
  }

  public BigDecimal doAsBigDecimal(final ThreadContext tc, final Object instance) {
    return (BigDecimal)instance;
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
