package uk.co.wilson.ng.runtime.metaclass.primitives.doubleimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

class Convert implements DoubleConversion {
  public boolean doAsBoolean(final ThreadContext tc, final double value) throws NotPerformed {
    return value != 0;
  }

  public char doAsChar(final ThreadContext tc, final double value) throws NotPerformed {
    return (char)value;
  }

  public byte doAsByte(final ThreadContext tc, final double value) throws NotPerformed {
    return (byte)value;
  }

  public short doAsShort(final ThreadContext tc, final double value) throws NotPerformed {
    return (short)value;
  }

  public int doAsInt(final ThreadContext tc, final double value) throws NotPerformed {
    return (int)value;
  }

  public long doAsLong(final ThreadContext tc, final double value) throws NotPerformed {
    return (long)value;
  }

  public float doAsFloat(final ThreadContext tc, final double value) throws NotPerformed {
    return (float)value;
  }

  public BigInteger doAsBigInteger(final ThreadContext tc, final double value) throws NotPerformed {
    return BigInteger.valueOf((long)value);
  }

  public BigDecimal doAsBigDecimal(final ThreadContext tc, final double value) throws NotPerformed {
    return BigDecimal.valueOf(value);
  }

  public String doAsString(final ThreadContext tc, final double value) throws NotPerformed {
    return String.valueOf(value);
  }

  public boolean doAsBoolean(final ThreadContext tc, final Object instance) {
    return tc.unwrapToDouble(instance) != 0;
  }

  public char doAsChar(final ThreadContext tc, final Object instance) {
    return (char)tc.unwrapToDouble(instance);
  }

  public byte doAsByte(final ThreadContext tc, final Object instance) {
    return (byte)tc.unwrapToDouble(instance);
  }

  public short doAsShort(final ThreadContext tc, final Object instance) {
    return (short)tc.unwrapToDouble(instance);
  }

  public int doAsInt(final ThreadContext tc, final Object instance) {
    return (int)tc.unwrapToDouble(instance);
  }

  public long doAsLong(final ThreadContext tc, final Object instance) {
    return (long)tc.unwrapToDouble(instance);
  }

  public float doAsFloat(final ThreadContext tc, final Object instance) {
    return (float)tc.unwrapToDouble(instance);
  }

  public double doAsDouble(final ThreadContext tc, final Object instance) {
    return tc.unwrapToDouble(instance);
  }

  public BigInteger doAsBigInteger(final ThreadContext tc, final Object instance) {
    return BigInteger.valueOf((long)tc.unwrapToDouble(instance));
  }

  public BigDecimal doAsBigDecimal(final ThreadContext tc, final Object instance) {
    return BigDecimal.valueOf(tc.unwrapToDouble(instance));
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsString(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public String doAsString(final ThreadContext tc, final Object instance) throws NotPerformed {
    return String.valueOf(tc.unwrapToDouble(instance));
  }

  public Object doAsType(final ThreadContext tc, final Object instance, final Class<?> type) {
    return tc.getMetaClassFor(type).convert().doAsYourType(tc, tc.unwrapToDouble(instance));
  }

  public Object doAsYourType(final ThreadContext tc, final boolean value) {
    return tc.wrap(value ? 1.0d : 0.0d);
  }

  public Object doAsYourType(final ThreadContext tc, final char value) {
    return tc.wrap((double)value);
  }

  public Object doAsYourType(final ThreadContext tc, final byte value) {
    return tc.wrap((double)value);
  }

  public Object doAsYourType(final ThreadContext tc, final short value) {
    return tc.wrap((double)value);
  }

  public Object doAsYourType(final ThreadContext tc, final int value) {
    return tc.wrap((double)value);
  }

  public Object doAsYourType(final ThreadContext tc, final long value) {
    return tc.wrap((double)value);
  }

  public Object doAsYourType(final ThreadContext tc, final float value) {
    return tc.wrap((double)value);
  }

  public Object doAsYourType(final ThreadContext tc, final double value) {
    return tc.wrap(value);
  }

  public Object doAsYourType(final ThreadContext tc, final BigInteger value) {
    return tc.wrap(value.doubleValue());
  }

  public Object doAsYourType(final ThreadContext tc, final BigDecimal value) {
    return tc.wrap(value.doubleValue());
  }

  public Object doAsYourType(final ThreadContext tc, final Object instance) {
    return ThreadContext.NOT_PERFORMED;
  }
}
