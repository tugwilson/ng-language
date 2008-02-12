package ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;
import uk.co.wilson.ng.runtime.threadcontext.NotPerformed;


/**
 * @author John
 *
 */
public class ConversionNoopImpl implements Conversion {
  public final static Conversion instance = new ConversionNoopImpl();

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsBigDecimal(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public BigDecimal doAsBigDecimal(final ExtendedThreadContext tc, final Object instance) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsBigInteger(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public BigInteger doAsBigInteger(final ExtendedThreadContext tc, final Object instance) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsBoolean(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public boolean doAsBoolean(final ExtendedThreadContext tc, final Object instance) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsByte(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public byte doAsByte(final ExtendedThreadContext tc, final Object instance) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsChar(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public char doAsChar(final ExtendedThreadContext tc, final Object instance) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsDouble(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public double doAsDouble(final ExtendedThreadContext tc, final Object instance) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsFloat(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public float doAsFloat(final ExtendedThreadContext tc, final Object instance) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsInt(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public int doAsInt(final ExtendedThreadContext tc, final Object instance) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsLong(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public long doAsLong(final ExtendedThreadContext tc, final Object instance) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsShort(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public short doAsShort(final ExtendedThreadContext tc, final Object instance) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsString(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public String doAsString(final ExtendedThreadContext tc, final Object instance) throws NotPerformed {
    return instance.toString();
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsType(ng.runtime.threadcontext.ThreadContext, java.lang.Object, java.lang.Class)
   */
  public Object doAsType(final ExtendedThreadContext tc, final Object instance, final Class<?> type) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, java.math.BigDecimal)
   */
  public Object doAsYourType(final ExtendedThreadContext tc, final BigDecimal value) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, java.math.BigInteger)
   */
  public Object doAsYourType(final ExtendedThreadContext tc, final BigInteger value) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, boolean)
   */
  public Object doAsYourType(final ExtendedThreadContext tc, final boolean value) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, byte)
   */
  public Object doAsYourType(final ExtendedThreadContext tc, final byte value) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, char)
   */
  public Object doAsYourType(final ExtendedThreadContext tc, final char value) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, double)
   */
  public Object doAsYourType(final ExtendedThreadContext tc, final double value) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, float)
   */
  public Object doAsYourType(final ExtendedThreadContext tc, final float value) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, int)
   */
  public Object doAsYourType(final ExtendedThreadContext tc, final int value) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, long)
   */
  public Object doAsYourType(final ExtendedThreadContext tc, final long value) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public Object doAsYourType(final ExtendedThreadContext tc, final Object instance) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, short)
   */
  public Object doAsYourType(final ExtendedThreadContext tc, final short value) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }
}
