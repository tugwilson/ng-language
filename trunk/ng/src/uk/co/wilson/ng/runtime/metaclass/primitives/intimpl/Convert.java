package uk.co.wilson.ng.runtime.metaclass.primitives.intimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.primitives.intimpl.IntConversion;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;



class Convert implements IntConversion {
  public boolean doAsBoolean(final ExtendedThreadContext tc, final int value) throws NotPerformed {
    return value != 0;
  }

  public char doAsChar(final ExtendedThreadContext tc, final int value) throws NotPerformed {
    return (char)value;
  }

  public byte doAsByte(final ExtendedThreadContext tc, final int value) throws NotPerformed {
    return (byte)value;
  }

  public short doAsShort(final ExtendedThreadContext tc, final int value) throws NotPerformed {
    return (short)value;
  }

  public long doAsLong(final ExtendedThreadContext tc, final int value) throws NotPerformed {
    return value;
  }

  public float doAsFloat(final ExtendedThreadContext tc, final int value) throws NotPerformed {
    return value;
  }

  public double doAsDouble(final ExtendedThreadContext tc, final int value) throws NotPerformed {
    return value;
  }

  public String doAsString(final ExtendedThreadContext tc, final int value) throws NotPerformed {
    return String.valueOf(value);
  }

  public BigInteger doAsBigInteger(final ExtendedThreadContext tc, final int value) throws NotPerformed {
    return BigInteger.valueOf(value);
  }

  public BigDecimal doAsBigDecimal(final ExtendedThreadContext tc, final int value) throws NotPerformed {
    return BigDecimal.valueOf(value);
  }

  public boolean doAsBoolean(final ExtendedThreadContext tc, final Object instance) {
    return tc.unwrapToInt(instance) != 0;
  }

  public char doAsChar(final ExtendedThreadContext tc, final Object instance) {
    return (char)tc.unwrapToInt(instance);
  }

  public byte doAsByte(final ExtendedThreadContext tc, final Object instance) {
    return (byte)tc.unwrapToInt(instance);
  }

  public short doAsShort(final ExtendedThreadContext tc, final Object instance) {
    return (short)tc.unwrapToInt(instance);
  }

  public int doAsInt(final ExtendedThreadContext tc, final Object instance) {
    return tc.unwrapToInt(instance);
  }

  public long doAsLong(final ExtendedThreadContext tc, final Object instance) {
    return tc.unwrapToInt(instance);
  }

  public float doAsFloat(final ExtendedThreadContext tc, final Object instance) {
    return tc.unwrapToInt(instance);
  }

  public double doAsDouble(final ExtendedThreadContext tc, final Object instance) {
    return tc.unwrapToInt(instance);
  }

  public BigInteger doAsBigInteger(final ExtendedThreadContext tc, final Object instance) {
    return BigInteger.valueOf(tc.unwrapToInt(instance));
  }

  public BigDecimal doAsBigDecimal(final ExtendedThreadContext tc, final Object instance) {
    return BigDecimal.valueOf(tc.unwrapToInt(instance));
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsString(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public String doAsString(final ExtendedThreadContext tc, final Object instance) throws NotPerformed {
    return String.valueOf(tc.unwrapToInt(instance));
  }

  public Object doAsType(final ExtendedThreadContext tc, final Object instance, final Class<?> type) {
    return tc.getMetaClassFor(type).convert(tc.convert()).doAsYourType(tc, tc.unwrapToInt(instance));
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final boolean value) {
    return tc.wrap(value ? 1 : 0);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final char value) {
    return tc.wrap((int)value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final byte value) {
    return tc.wrap((int)value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final short value) {
    return tc.wrap((int)value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final int value) {
    return tc.wrap(value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final long value) {
    return tc.wrap((int)value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final float value) {
    return tc.wrap((int)value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final double value) {
    return tc.wrap((int)value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final BigInteger value) {
    return tc.wrap(value.intValue());
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final BigDecimal value) {
    return tc.wrap(value.intValue());
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final Object instance) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }
}
