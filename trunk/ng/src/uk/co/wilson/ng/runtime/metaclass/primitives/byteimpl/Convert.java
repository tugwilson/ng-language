package uk.co.wilson.ng.runtime.metaclass.primitives.byteimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.ByteConversion;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;



class Convert implements ByteConversion {
  public boolean doAsBoolean(final ExtendedThreadContext tc, final byte value) throws NotPerformed {
    return value != 0;
  }

  public char doAsChar(final ExtendedThreadContext tc, final byte value) throws NotPerformed {
    return (char)value;
  }

  public short doAsShort(final ExtendedThreadContext tc, final byte value) throws NotPerformed {
    return value;
  }

  public int doAsInt(final ExtendedThreadContext tc, final byte value) throws NotPerformed {
    return value;
  }

  public long doAsLong(final ExtendedThreadContext tc, final byte value) throws NotPerformed {
    return value;
  }

  public float doAsFloat(final ExtendedThreadContext tc, final byte value) throws NotPerformed {
    return value;
  }

  public double doAsDouble(final ExtendedThreadContext tc, final byte value) throws NotPerformed {
    return value;
  }

  public BigInteger doAsBigInteger(final ExtendedThreadContext tc, final byte value) throws NotPerformed {
    return BigInteger.valueOf(value);
  }

  public BigDecimal doAsBigDecimal(final ExtendedThreadContext tc, final byte value) throws NotPerformed {
    return BigDecimal.valueOf(value);
  }

  public String doAsString(final ExtendedThreadContext tc, final byte value) throws NotPerformed {
    return String.valueOf(value);
  }

  public boolean doAsBoolean(final ExtendedThreadContext tc, final Object instance) {
    return tc.unwrapToByte(instance) != 0;
  }

  public char doAsChar(final ExtendedThreadContext tc, final Object instance) {
    return (char)tc.unwrapToByte(instance);
  }

  public byte doAsByte(final ExtendedThreadContext tc, final Object instance) {
    return tc.unwrapToByte(instance);
  }

  public short doAsShort(final ExtendedThreadContext tc, final Object instance) {
    return tc.unwrapToByte(instance);
  }

  public int doAsInt(final ExtendedThreadContext tc, final Object instance) {
    return tc.unwrapToByte(instance);
  }

  public long doAsLong(final ExtendedThreadContext tc, final Object instance) {
    return tc.unwrapToByte(instance);
  }

  public float doAsFloat(final ExtendedThreadContext tc, final Object instance) {
    return tc.unwrapToByte(instance);
  }

  public double doAsDouble(final ExtendedThreadContext tc, final Object instance) {
    return tc.unwrapToByte(instance);
  }

  public BigInteger doAsBigInteger(final ExtendedThreadContext tc, final Object instance) {
    return BigInteger.valueOf(tc.unwrapToByte(instance));
  }

  public BigDecimal doAsBigDecimal(final ExtendedThreadContext tc, final Object instance) {
    return BigDecimal.valueOf(tc.unwrapToByte(instance));
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsString(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public String doAsString(final ExtendedThreadContext tc, final Object instance) throws NotPerformed {
    return String.valueOf(tc.unwrapToByte(instance));
  }

  public Object doAsType(final ExtendedThreadContext tc, final Object instance, final Class<?> type) {
    return tc.getMetaClassFor(type).convert().doAsYourType(tc, tc.unwrapToByte(instance));
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final boolean value) {
    return tc.wrap(value ? (byte)1 : (byte)0);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final char value) {
    return tc.wrap((byte)value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final byte value) {
    return tc.wrap(value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final short value) {
    return tc.wrap((byte)value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final int value) {
    return tc.wrap((byte)value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final long value) {
    return tc.wrap((byte)value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final float value) {
    return tc.wrap((byte)value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final double value) {
    return tc.wrap((byte)value);
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final BigInteger value) {
    return tc.wrap(value.byteValue());
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final BigDecimal value) {
    return tc.wrap(value.byteValue());
  }

  public Object doAsYourType(final ExtendedThreadContext tc, final Object instance) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }
}
