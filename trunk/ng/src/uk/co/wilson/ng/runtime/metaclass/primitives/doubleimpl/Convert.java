package uk.co.wilson.ng.runtime.metaclass.primitives.doubleimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.DoubleConversion;
import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;



class Convert implements DoubleConversion {
  public boolean doAsBoolean(final ExtendedThreadContext tc, final double value) throws NotPerformed {
    return value != 0;
  }

  public char doAsChar(final ExtendedThreadContext tc, final double value) throws NotPerformed {
    return (char)value;
  }

  public byte doAsByte(final ExtendedThreadContext tc, final double value) throws NotPerformed {
    return (byte)value;
  }

  public short doAsShort(final ExtendedThreadContext tc, final double value) throws NotPerformed {
    return (short)value;
  }

  public int doAsInt(final ExtendedThreadContext tc, final double value) throws NotPerformed {
    return (int)value;
  }

  public long doAsLong(final ExtendedThreadContext tc, final double value) throws NotPerformed {
    return (long)value;
  }

  public float doAsFloat(final ExtendedThreadContext tc, final double value) throws NotPerformed {
    return (float)value;
  }

  public BigInteger doAsBigInteger(final ExtendedThreadContext tc, final double value) throws NotPerformed {
    return BigInteger.valueOf((long)value);
  }

  public BigDecimal doAsBigDecimal(final ExtendedThreadContext tc, final double value) throws NotPerformed {
    return BigDecimal.valueOf(value);
  }

  public String doAsString(final ExtendedThreadContext tc, final double value) throws NotPerformed {
    return String.valueOf(value);
  }

  public boolean doAsBoolean(final ExtendedThreadContext tc, final Object instance) {
    return tc.unwrapToDouble(instance) != 0;
  }

  public char doAsChar(final ExtendedThreadContext tc, final Object instance) {
    return (char)tc.unwrapToDouble(instance);
  }

  public byte doAsByte(final ExtendedThreadContext tc, final Object instance) {
    return (byte)tc.unwrapToDouble(instance);
  }

  public short doAsShort(final ExtendedThreadContext tc, final Object instance) {
    return (short)tc.unwrapToDouble(instance);
  }

  public int doAsInt(final ExtendedThreadContext tc, final Object instance) {
    return (int)tc.unwrapToDouble(instance);
  }

  public long doAsLong(final ExtendedThreadContext tc, final Object instance) {
    return (long)tc.unwrapToDouble(instance);
  }

  public float doAsFloat(final ExtendedThreadContext tc, final Object instance) {
    return (float)tc.unwrapToDouble(instance);
  }

  public double doAsDouble(final ExtendedThreadContext tc, final Object instance) {
    return tc.unwrapToDouble(instance);
  }

  public BigInteger doAsBigInteger(final ExtendedThreadContext tc, final Object instance) {
    return BigInteger.valueOf((long)tc.unwrapToDouble(instance));
  }

  public BigDecimal doAsBigDecimal(final ExtendedThreadContext tc, final Object instance) {
    return BigDecimal.valueOf(tc.unwrapToDouble(instance));
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsString(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public String doAsString(final ExtendedThreadContext tc, final Object instance) throws NotPerformed {
    return String.valueOf(tc.unwrapToDouble(instance));
  }

  public Object doAsType(final ExtendedThreadContext tc, final Object instance, final Class<?> type) {
    return tc.getMetaClassFor(type).convert().doAsYourType(tc, tc.unwrapToDouble(instance));
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final boolean value) {
    return tc.wrap(value ? 1.0d : 0.0d);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final char value) {
    return tc.wrap((double)value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final byte value) {
    return tc.wrap((double)value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final short value) {
    return tc.wrap((double)value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final int value) {
    return tc.wrap((double)value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final long value) {
    return tc.wrap((double)value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final float value) {
    return tc.wrap((double)value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final double value) {
    return tc.wrap(value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final BigInteger value) {
    return tc.wrap(value.doubleValue());
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final BigDecimal value) {
    return tc.wrap(value.doubleValue());
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final Object instance) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }
}
