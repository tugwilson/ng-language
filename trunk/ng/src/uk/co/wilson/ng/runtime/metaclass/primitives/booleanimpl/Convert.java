package uk.co.wilson.ng.runtime.metaclass.primitives.booleanimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.Conversion;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

class Convert implements Conversion {

  public boolean doAsBoolean(final ThreadContext tc, final Object instance) {
    return tc.unwrapToBoolean(instance);
  }

  public char doAsChar(final ThreadContext tc, final Object instance) {
    return (char)(tc.unwrapToBoolean(instance) ? 1 : 0);
  }

  public byte doAsByte(final ThreadContext tc, final Object instance) {
    return (byte)(tc.unwrapToBoolean(instance) ? 1 : 0);
  }

  public short doAsShort(final ThreadContext tc, final Object instance) {
    return (short)(tc.unwrapToBoolean(instance) ? 1 : 0);
  }

  public int doAsInt(final ThreadContext tc, final Object instance) {
    return (tc.unwrapToBoolean(instance) ? 1 : 0);
  }

  public long doAsLong(final ThreadContext tc, final Object instance) {
    return (tc.unwrapToBoolean(instance) ? 1 : 0);
  }

  public float doAsFloat(final ThreadContext tc, final Object instance) {
    return (tc.unwrapToBoolean(instance) ? 1 : 0);
  }

  public double doAsDouble(final ThreadContext tc, final Object instance) {
    return (tc.unwrapToBoolean(instance) ? 1 : 0);
  }

  public BigInteger doAsBigInteger(final ThreadContext tc, final Object instance) {
    return BigInteger.valueOf((tc.unwrapToBoolean(instance) ? 1 : 0));
  }

  public BigDecimal doAsBigDecimal(final ThreadContext tc, final Object instance) {
    return BigDecimal.valueOf((tc.unwrapToBoolean(instance) ? 1 : 0));
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsString(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public String doAsString(final ThreadContext tc, final Object instance) throws NotPerformed {
    return String.valueOf(tc.unwrapToBoolean(instance));
  }

  public Object doAsType(final ThreadContext tc, final Object instance, final Class<?> type) {
    return tc.getMetaClassFor(type).convert().doAsYourType(tc, tc.unwrapToBoolean(instance));
  }

  public Object doAsYourType(final ThreadContext tc, final boolean value) {
    return tc.wrap(value);
  }

  public Object doAsYourType(final ThreadContext tc, final char value) {
    return tc.wrap(tc.convert().asBoolean(tc.wrap(value)));
  }

  public Object doAsYourType(final ThreadContext tc, final byte value) {
    return tc.wrap(tc.convert().asBoolean(tc.wrap(value)));
  }

  public Object doAsYourType(final ThreadContext tc, final short value) {
    return tc.wrap(tc.convert().asBoolean(tc.wrap(value)));
  }

  public Object doAsYourType(final ThreadContext tc, final int value) {
    return tc.wrap(tc.convert().asBoolean(tc.wrap(value)));
  }

  public Object doAsYourType(final ThreadContext tc, final long value) {
    return tc.wrap(tc.convert().asBoolean(tc.wrap(value)));
  }

  public Object doAsYourType(final ThreadContext tc, final float value) {
    return tc.wrap(tc.convert().asBoolean(tc.wrap(value)));
  }

  public Object doAsYourType(final ThreadContext tc, final double value) {
    return tc.wrap(tc.convert().asBoolean(tc.wrap(value)));
  }

  public Object doAsYourType(final ThreadContext tc, final BigInteger value) {
    return tc.wrap(tc.convert().asBoolean(value));
  }

  public Object doAsYourType(final ThreadContext tc, final BigDecimal value) {
    return tc.wrap(tc.convert().asBoolean(value));
  }

  public Object doAsYourType(final ThreadContext tc, final Object instance) {
    return ThreadContext.NOT_PERFORMED;
  }
}
