package ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

/**
 * @author John
 *
 */
public class ConversionNoopImpl implements Conversion {
  public final static Conversion instance = new ConversionNoopImpl();

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsBigDecimal(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public BigDecimal doAsBigDecimal(final ThreadContext tc, final Object instance) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsBigInteger(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public BigInteger doAsBigInteger(final ThreadContext tc, final Object instance) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsBoolean(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public boolean doAsBoolean(final ThreadContext tc, final Object instance) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsByte(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public byte doAsByte(final ThreadContext tc, final Object instance) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsChar(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public char doAsChar(final ThreadContext tc, final Object instance) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsDouble(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public double doAsDouble(final ThreadContext tc, final Object instance) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsFloat(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public float doAsFloat(final ThreadContext tc, final Object instance) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsInt(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public int doAsInt(final ThreadContext tc, final Object instance) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsLong(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public long doAsLong(final ThreadContext tc, final Object instance) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsShort(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public short doAsShort(final ThreadContext tc, final Object instance) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsString(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public String doAsString(final ThreadContext tc, final Object instance) throws NotPerformed {
    return instance.toString();
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsType(ng.runtime.threadcontext.ThreadContext, java.lang.Object, java.lang.Class)
   */
  public Object doAsType(final ThreadContext tc, final Object instance, final Class<?> type) {
    return ThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, java.math.BigDecimal)
   */
  public Object doAsYourType(final ThreadContext tc, final BigDecimal value) {
    return ThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, java.math.BigInteger)
   */
  public Object doAsYourType(final ThreadContext tc, final BigInteger value) {
    return ThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, boolean)
   */
  public Object doAsYourType(final ThreadContext tc, final boolean value) {
    return ThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, byte)
   */
  public Object doAsYourType(final ThreadContext tc, final byte value) {
    return ThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, char)
   */
  public Object doAsYourType(final ThreadContext tc, final char value) {
    return ThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, double)
   */
  public Object doAsYourType(final ThreadContext tc, final double value) {
    return ThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, float)
   */
  public Object doAsYourType(final ThreadContext tc, final float value) {
    return ThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, int)
   */
  public Object doAsYourType(final ThreadContext tc, final int value) {
    return ThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, long)
   */
  public Object doAsYourType(final ThreadContext tc, final long value) {
    return ThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public Object doAsYourType(final ThreadContext tc, final Object instance) {
    return ThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, short)
   */
  public Object doAsYourType(final ThreadContext tc, final short value) {
    return ThreadContext.NOT_PERFORMED;
  }
}
