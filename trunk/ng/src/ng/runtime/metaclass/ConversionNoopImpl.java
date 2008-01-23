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
  public BigDecimal doAsBigDecimal(ThreadContext tc, Object instance) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsBigInteger(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public BigInteger doAsBigInteger(ThreadContext tc, Object instance) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsBoolean(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public boolean doAsBoolean(ThreadContext tc, Object instance) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsByte(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public byte doAsByte(ThreadContext tc, Object instance) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsChar(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public char doAsChar(ThreadContext tc, Object instance) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsDouble(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public double doAsDouble(ThreadContext tc, Object instance) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsFloat(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public float doAsFloat(ThreadContext tc, Object instance) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsInt(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public int doAsInt(ThreadContext tc, Object instance) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsLong(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public long doAsLong(ThreadContext tc, Object instance) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsShort(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public short doAsShort(ThreadContext tc, Object instance) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsString(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public String doAsString(ThreadContext tc, Object instance) throws NotPerformed {
    return instance.toString();
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsType(ng.runtime.threadcontext.ThreadContext, java.lang.Object, java.lang.Class)
   */
  public Object doAsType(ThreadContext tc, Object instance, Class<?> type) {
    return ThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, java.math.BigDecimal)
   */
  public Object doAsYourType(ThreadContext tc, BigDecimal value) {
    return ThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, java.math.BigInteger)
   */
  public Object doAsYourType(ThreadContext tc, BigInteger value) {
    return ThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, boolean)
   */
  public Object doAsYourType(ThreadContext tc, boolean value) {
    return ThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, byte)
   */
  public Object doAsYourType(ThreadContext tc, byte value) {
    return ThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, char)
   */
  public Object doAsYourType(ThreadContext tc, char value) {
    return ThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, double)
   */
  public Object doAsYourType(ThreadContext tc, double value) {
    return ThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, float)
   */
  public Object doAsYourType(ThreadContext tc, float value) {
    return ThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, int)
   */
  public Object doAsYourType(ThreadContext tc, int value) {
    return ThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, long)
   */
  public Object doAsYourType(ThreadContext tc, long value) {
    return ThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public Object doAsYourType(ThreadContext tc, Object instance) {
    return ThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, short)
   */
  public Object doAsYourType(ThreadContext tc, short value) {
    return ThreadContext.NOT_PERFORMED;
  }
}
