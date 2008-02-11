package uk.co.wilson.ng.runtime.metaclass.primitives.longimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

class Convert implements LongConversion {
  public boolean doAsBoolean(final ThreadContext tc, final long value) throws NotPerformed {
    return value != 0;
  }

  public char doAsChar(final ThreadContext tc, final long value) throws NotPerformed {
    return (char)value;
  }

  public byte doAsByte(final ThreadContext tc, final long value) throws NotPerformed {
    return (byte)value;
  }

  public short doAsShort(final ThreadContext tc, final long value) throws NotPerformed {
    return (short)value;
  }

  public int doAsInt(final ThreadContext tc, final long value) throws NotPerformed {
    return (int)value;
  }

  public float doAsFloat(final ThreadContext tc, final long value) throws NotPerformed {
    return value;
  }

  public double doAsDouble(final ThreadContext tc, final long value) throws NotPerformed {
    return value;
  }

  public BigInteger doAsBigInteger(final ThreadContext tc, final long value) throws NotPerformed {
    return BigInteger.valueOf(value);
  }

  public BigDecimal doAsBigDecimal(final ThreadContext tc, final long value) throws NotPerformed {
    return BigDecimal.valueOf(value);
  }

  public String doAsString(final ThreadContext tc, final long value) throws NotPerformed {
    return String.valueOf(value);
  }

  public boolean doAsBoolean(final ThreadContext tc, final Object instance) {
    return tc.unwrapToLong(instance) != 0;
  }

  public char doAsChar(final ThreadContext tc, final Object instance) {
    return (char)tc.unwrapToLong(instance);
  }

  public byte doAsByte(final ThreadContext tc, final Object instance) {
    return (byte)tc.unwrapToLong(instance);
  }

  public short doAsShort(final ThreadContext tc, final Object instance) {
    return (short)tc.unwrapToLong(instance);
  }

  public int doAsInt(final ThreadContext tc, final Object instance) {
    return (int)tc.unwrapToLong(instance);
  }

  public long doAsLong(final ThreadContext tc, final Object instance) {
    return tc.unwrapToLong(instance);
  }

  public float doAsFloat(final ThreadContext tc, final Object instance) {
    return tc.unwrapToLong(instance);
  }

  public double doAsDouble(final ThreadContext tc, final Object instance) {
    return tc.unwrapToLong(instance);
  }

  public BigInteger doAsBigInteger(final ThreadContext tc, final Object instance) {
    return BigInteger.valueOf(tc.unwrapToLong(instance));
  }

  public BigDecimal doAsBigDecimal(final ThreadContext tc, final Object instance) {
    return BigDecimal.valueOf(tc.unwrapToLong(instance));
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsString(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public String doAsString(final ThreadContext tc, final Object instance) throws NotPerformed {
    return String.valueOf(tc.unwrapToLong(instance));
  }

  public Object doAsType(final ThreadContext tc, final Object instance, final Class<?> type) {
    return tc.getMetaClassFor(type).convert().doAsYourType(tc, tc.unwrapToLong(instance));
  }

  public Object doAsYourType(final ThreadContext tc, final boolean value) {
    return tc.wrap(value ? 1l : 0l);
  }

  public Object doAsYourType(final ThreadContext tc, final char value) {
    return tc.wrap((long)value);
  }

  public Object doAsYourType(final ThreadContext tc, final byte value) {
    return tc.wrap((long)value);
  }

  public Object doAsYourType(final ThreadContext tc, final short value) {
    return tc.wrap((long)value);
  }

  public Object doAsYourType(final ThreadContext tc, final int value) {
    return tc.wrap((long)value);
  }

  public Object doAsYourType(final ThreadContext tc, final long value) {
    return tc.wrap(value);
  }

  public Object doAsYourType(final ThreadContext tc, final float value) {
    return tc.wrap((long)value);
  }

  public Object doAsYourType(final ThreadContext tc, final double value) {
    return tc.wrap((long)value);
  }

  public Object doAsYourType(final ThreadContext tc, final BigInteger value) {
    return tc.wrap(value.longValue());
  }

  public Object doAsYourType(final ThreadContext tc, final BigDecimal value) {
    return tc.wrap(value.longValue());
  }

  public Object doAsYourType(final ThreadContext tc, final Object instance) {
    return ThreadContext.NOT_PERFORMED;
  }
}
