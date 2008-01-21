package uk.co.wilson.ng.runtime.metaclass.primitives.shortimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.Conversion;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

class Convert implements Conversion {

  public boolean doAsBoolean(final ThreadContext tc, final Object instance) {
    return tc.unwrapToShort(instance) != 0;
  }

  public char doAsChar(final ThreadContext tc, final Object instance) {
    return (char)tc.unwrapToShort(instance);
  }

  public byte doAsByte(final ThreadContext tc, final Object instance) {
    return (byte)tc.unwrapToShort(instance);
  }

  public short doAsShort(final ThreadContext tc, final Object instance) {
    return tc.unwrapToShort(instance);
  }

  public int doAsInt(final ThreadContext tc, final Object instance) {
    return tc.unwrapToShort(instance);
  }

  public long doAsLong(final ThreadContext tc, final Object instance) {
    return tc.unwrapToShort(instance);
  }

  public float doAsFloat(final ThreadContext tc, final Object instance) {
    return tc.unwrapToShort(instance);
  }

  public double doAsDouble(final ThreadContext tc, final Object instance) {
    return tc.unwrapToShort(instance);
  }

  public BigInteger doAsBigInteger(final ThreadContext tc, final Object instance) {
    return BigInteger.valueOf(tc.unwrapToShort(instance));
  }

  public BigDecimal doAsBigDecimal(final ThreadContext tc, final Object instance) {
    return BigDecimal.valueOf(tc.unwrapToShort(instance));
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsString(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public String doAsString(ThreadContext tc, Object instance) throws NotPerformed {
    return String.valueOf(tc.unwrapToShort(instance));
  }

  public Object doAsType(final ThreadContext tc, final Object instance, final Class<?> type) {
    return tc.getMetaClassFor(type).convert().doAsYourType(tc, tc.unwrapToShort(instance));
  }

  public Object doAsYourType(final ThreadContext tc, final boolean value) {
    return tc.wrap(value ? (short)1 : (short)0);
  }

  public Object doAsYourType(final ThreadContext tc, final char value) {
    return tc.wrap((short)value);
  }

  public Object doAsYourType(final ThreadContext tc, final byte value) {
    return tc.wrap((short)value);
  }

  public Object doAsYourType(final ThreadContext tc, final short value) {
    return tc.wrap(value);
  }

  public Object doAsYourType(final ThreadContext tc, final int value) {
    return tc.wrap((short)value);
  }

  public Object doAsYourType(final ThreadContext tc, final long value) {
    return tc.wrap((short)value);
  }

  public Object doAsYourType(final ThreadContext tc, final float value) {
    return tc.wrap((short)value);
  }

  public Object doAsYourType(final ThreadContext tc, final double value) {
    return tc.wrap((short)value);
  }

  public Object doAsYourType(final ThreadContext tc, final BigInteger value) {
    return tc.wrap(value.shortValue());
  }

  public Object doAsYourType(final ThreadContext tc, final BigDecimal value) {
    return tc.wrap(value.shortValue());
  }

  public Object doAsYourType(final ThreadContext tc, final Object instance) {
    return ThreadContext.NOT_PERFORMED;
  }
}
