package uk.co.wilson.ng.runtime.metaclass.primitives.floatimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.FloatConversion;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;



class Convert implements FloatConversion {
  public boolean doAsBoolean(final ExtendedThreadContext tc, final float value) throws NotPerformed {
    return value != 0;
  }

  public char doAsChar(final ExtendedThreadContext tc, final float value) throws NotPerformed {
    return (char)value;
  }

  public byte doAsByte(final ExtendedThreadContext tc, final float value) throws NotPerformed {
    return (byte)value;
  }

  public short doAsShort(final ExtendedThreadContext tc, final float value) throws NotPerformed {
    return (short)value;
  }

  public int doAsInt(final ExtendedThreadContext tc, final float value) throws NotPerformed {
    return (int)value;
  }

  public long doAsLong(final ExtendedThreadContext tc, final float value) throws NotPerformed {
    return (long)value;
  }

  public double doAsDouble(final ExtendedThreadContext tc, final float value) throws NotPerformed {
    return value;
  }

  public BigInteger doAsBigInteger(final ExtendedThreadContext tc, final float value) throws NotPerformed {
    return BigInteger.valueOf((long)value);
  }

  public BigDecimal doAsBigDecimal(final ExtendedThreadContext tc, final float value) throws NotPerformed {
    return BigDecimal.valueOf(value);
  }

  public String doAsString(final ExtendedThreadContext tc, final float value) throws NotPerformed {
    return String.valueOf(value);
  }

  public boolean doAsBoolean(final ExtendedThreadContext tc, final Object instance) {
    return tc.unwrapToFloat(instance) != 0;
  }

  public char doAsChar(final ExtendedThreadContext tc, final Object instance) {
    return (char)tc.unwrapToFloat(instance);
  }

  public byte doAsByte(final ExtendedThreadContext tc, final Object instance) {
    return (byte)tc.unwrapToFloat(instance);
  }

  public short doAsShort(final ExtendedThreadContext tc, final Object instance) {
    return (short)tc.unwrapToFloat(instance);
  }

  public int doAsInt(final ExtendedThreadContext tc, final Object instance) {
    return (int)tc.unwrapToFloat(instance);
  }

  public long doAsLong(final ExtendedThreadContext tc, final Object instance) {
    return (long)tc.unwrapToFloat(instance);
  }

  public float doAsFloat(final ExtendedThreadContext tc, final Object instance) {
    return tc.unwrapToFloat(instance);
  }

  public double doAsDouble(final ExtendedThreadContext tc, final Object instance) {
    return tc.unwrapToFloat(instance);
  }

  public BigInteger doAsBigInteger(final ExtendedThreadContext tc, final Object instance) {
    return BigInteger.valueOf((long)tc.unwrapToFloat(instance));
  }

  public BigDecimal doAsBigDecimal(final ExtendedThreadContext tc, final Object instance) {
    return BigDecimal.valueOf(tc.unwrapToFloat(instance));
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsString(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public String doAsString(final ExtendedThreadContext tc, final Object instance) throws NotPerformed {
    return String.valueOf(tc.unwrapToFloat(instance));
  }

  public Object doAsType(final ExtendedThreadContext tc, final Object instance, final Class<?> type) {
    return tc.getMetaClassFor(type).convert().doAsYourType(tc, tc.unwrapToFloat(instance));
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final boolean value) {
    return tc.wrap(value ? 1.0f : 0.0f);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final char value) {
    return tc.wrap((float)value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final byte value) {
    return tc.wrap((float)value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final short value) {
    return tc.wrap((float)value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final int value) {
    return tc.wrap((float)value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final long value) {
    return tc.wrap((float)value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final float value) {
    return tc.wrap(value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final double value) {
    return tc.wrap((float)value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final BigInteger value) {
    return tc.wrap(value.floatValue());
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final BigDecimal value) {
    return tc.wrap(value.floatValue());
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final Object instance) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }
}
