package uk.co.wilson.ng.runtime.metaclass.primitives.floatimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.Conversion;
import ng.runtime.threadcontext.ThreadContext;

class Convert implements Conversion {

  public boolean doAsBoolean(final ThreadContext tc, final Object instance) {
    return tc.unwrapToFloat(instance) != 0;
  }

  public char doAsChar(final ThreadContext tc, final Object instance) {
    return (char)tc.unwrapToFloat(instance);
  }

  public byte doAsByte(final ThreadContext tc, final Object instance) {
    return (byte)tc.unwrapToFloat(instance);
  }

  public short doAsShort(final ThreadContext tc, final Object instance) {
    return (short)tc.unwrapToFloat(instance);
  }

  public int doAsInt(final ThreadContext tc, final Object instance) {
    return (int)tc.unwrapToFloat(instance);
  }

  public long doAsLong(final ThreadContext tc, final Object instance) {
    return (long)tc.unwrapToFloat(instance);
  }

  public float doAsFloat(final ThreadContext tc, final Object instance) {
    return tc.unwrapToFloat(instance);
  }

  public double doAsDouble(final ThreadContext tc, final Object instance) {
    return tc.unwrapToFloat(instance);
  }

  public BigInteger doAsBigInteger(final ThreadContext tc, final Object instance) {
    return BigInteger.valueOf((long)tc.unwrapToFloat(instance));
  }

  public BigDecimal doAsBigDecimal(final ThreadContext tc, final Object instance) {
    return BigDecimal.valueOf(tc.unwrapToFloat(instance));
  }

  public Object doAsType(final ThreadContext tc, final Object instance, final Class<?> type) {
    return tc.getMetaClassFor(type).convert().doAsYourType(tc, tc.unwrapToFloat(instance));
  }

  public Object doAsYourType(final ThreadContext tc, final boolean value) {
    return tc.wrap(value ? 1.0f : 0.0f);
  }

  public Object doAsYourType(final ThreadContext tc, final char value) {
    return tc.wrap((float)value);
  }

  public Object doAsYourType(final ThreadContext tc, final byte value) {
    return tc.wrap((float)value);
  }

  public Object doAsYourType(final ThreadContext tc, final short value) {
    return tc.wrap((float)value);
  }

  public Object doAsYourType(final ThreadContext tc, final int value) {
    return tc.wrap((float)value);
  }

  public Object doAsYourType(final ThreadContext tc, final long value) {
    return tc.wrap((float)value);
  }

  public Object doAsYourType(final ThreadContext tc, final float value) {
    return tc.wrap(value);
  }

  public Object doAsYourType(final ThreadContext tc, final double value) {
    return tc.wrap((float)value);
  }

  public Object doAsYourType(final ThreadContext tc, final BigInteger value) {
    return tc.wrap(value.floatValue());
  }

  public Object doAsYourType(final ThreadContext tc, final BigDecimal value) {
    return tc.wrap(value.floatValue());
  }

  public Object doAsYourType(final ThreadContext tc, final Object instance) {
    return ThreadContext.NOT_PERFORMED;
  }
}
