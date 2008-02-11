package uk.co.wilson.ng.runtime.metaclass.primitives.charimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;
import uk.co.wilson.ng.runtime.metaclass.primitives.CharConversion;

class Convert implements CharConversion {

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.primitives.CharConversion#doAsBoolean(ng.runtime.threadcontext.ThreadContext, char)
   */
  public boolean doAsBoolean(final ThreadContext tc, final char value) throws NotPerformed {
    return value != 0;
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.primitives.CharConversion#doAsByte(ng.runtime.threadcontext.ThreadContext, char)
   */
  public byte doAsByte(final ThreadContext tc, final char value) throws NotPerformed {
    return (byte)value;
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.primitives.CharConversion#doAsShort(ng.runtime.threadcontext.ThreadContext, char)
   */
  public short doAsShort(final ThreadContext tc, final char value) throws NotPerformed {
    return (short)value;
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.primitives.CharConversion#doAsInt(ng.runtime.threadcontext.ThreadContext, char)
   */
  public int doAsInt(final ThreadContext tc, final char value) throws NotPerformed {
    return value;
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.primitives.CharConversion#doAsLong(ng.runtime.threadcontext.ThreadContext, char)
   */
  public long doAsLong(final ThreadContext tc, final char value) throws NotPerformed {
    return value;
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.primitives.CharConversion#doAsFloat(ng.runtime.threadcontext.ThreadContext, char)
   */
  public float doAsFloat(final ThreadContext tc, final char value) throws NotPerformed {
    return value;
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.primitives.CharConversion#doAsDouble(ng.runtime.threadcontext.ThreadContext, char)
   */
  public double doAsDouble(final ThreadContext tc, final char value) throws NotPerformed {
    return value;
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.primitives.CharConversion#doAsBigInteger(ng.runtime.threadcontext.ThreadContext, char)
   */
  public BigInteger doAsBigInteger(final ThreadContext tc, final char value) throws NotPerformed {
    return BigInteger.valueOf(value);
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.primitives.CharConversion#doAsBigDecimal(ng.runtime.threadcontext.ThreadContext, char)
   */
  public BigDecimal doAsBigDecimal(final ThreadContext tc, final char value) throws NotPerformed {
    return BigDecimal.valueOf(value);
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.primitives.CharConversion#doAsString(ng.runtime.threadcontext.ThreadContext, char)
   */
  public String doAsString(final ThreadContext tc, final char value) throws NotPerformed {
    return String.valueOf(value);
  }

  public boolean doAsBoolean(final ThreadContext tc, final Object instance) {
    return tc.unwrapToChar(instance) != 0;
  }

  public char doAsChar(final ThreadContext tc, final Object instance) {
    return tc.unwrapToChar(instance);
  }

  public byte doAsByte(final ThreadContext tc, final Object instance) {
    return (byte)tc.unwrapToChar(instance);
  }

  public short doAsShort(final ThreadContext tc, final Object instance) {
    return (short)tc.unwrapToChar(instance);
  }

  public int doAsInt(final ThreadContext tc, final Object instance) {
    return tc.unwrapToChar(instance);
  }

  public long doAsLong(final ThreadContext tc, final Object instance) {
    return tc.unwrapToChar(instance);
  }

  public float doAsFloat(final ThreadContext tc, final Object instance) {
    return tc.unwrapToChar(instance);
  }

  public double doAsDouble(final ThreadContext tc, final Object instance) {
    return tc.unwrapToChar(instance);
  }

  public BigInteger doAsBigInteger(final ThreadContext tc, final Object instance) {
    return BigInteger.valueOf(tc.unwrapToChar(instance));
  }

  public BigDecimal doAsBigDecimal(final ThreadContext tc, final Object instance) {
    return BigDecimal.valueOf(tc.unwrapToChar(instance));
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsString(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public String doAsString(final ThreadContext tc, final Object instance) throws NotPerformed {
    return String.valueOf(tc.unwrapToChar(instance));
  }

  public Object doAsType(final ThreadContext tc, final Object instance, final Class<?> type) {
    return tc.getMetaClassFor(type).convert().doAsYourType(tc, tc.unwrapToChar(instance));
  }

  public Object doAsYourType(final ThreadContext tc, final boolean value) {
    return tc.wrap(value ? (char)1 : (char)0);
  }

  public Object doAsYourType(final ThreadContext tc, final char value) {
    return tc.wrap(value);
  }

  public Object doAsYourType(final ThreadContext tc, final byte value) {
    return tc.wrap((char)value);
  }

  public Object doAsYourType(final ThreadContext tc, final short value) {
    return tc.wrap((char)value);
  }

  public Object doAsYourType(final ThreadContext tc, final int value) {
    return tc.wrap((char)value);
  }

  public Object doAsYourType(final ThreadContext tc, final long value) {
    return tc.wrap((char)value);
  }

  public Object doAsYourType(final ThreadContext tc, final float value) {
    return tc.wrap((char)value);
  }

  public Object doAsYourType(final ThreadContext tc, final double value) {
    return tc.wrap((char)value);
  }

  public Object doAsYourType(final ThreadContext tc, final BigInteger value) {
    return tc.wrap((char)value.shortValue());
  }

  public Object doAsYourType(final ThreadContext tc, final BigDecimal value) {
    return tc.wrap((char)value.shortValue());
  }

  public Object doAsYourType(final ThreadContext tc, final Object instance) {
    return ThreadContext.NOT_PERFORMED;
  }
}