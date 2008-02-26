package uk.co.wilson.ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.IntegerBinaryComparison;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

/**
 * @author John
 *
 */
public class IntegerBinaryComparisonNoopImpl implements IntegerBinaryComparison {
  public static final IntegerBinaryComparisonNoopImpl instance = new IntegerBinaryComparisonNoopImpl();

  private IntegerBinaryComparisonNoopImpl() {
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.IntegerBinaryComparison#doIntApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, java.lang.Object)
   */
  public int doIntApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.IntegerBinaryComparison#doIntApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, ng.runtime.metaclass.MetaClass, java.lang.Object)
   */
  public int doIntApply(final ExtendedThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.IntegerBinaryComparison#doIntApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, char)
   */
  public int doIntApply(final ExtendedThreadContext tc, final Object lhs, final char rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.IntegerBinaryComparison#doIntApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, byte)
   */
  public int doIntApply(final ExtendedThreadContext tc, final Object lhs, final byte rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.IntegerBinaryComparison#doIntApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, short)
   */
  public int doIntApply(final ExtendedThreadContext tc, final Object lhs, final short rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.IntegerBinaryComparison#doIntApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, int)
   */
  public int doIntApply(final ExtendedThreadContext tc, final Object lhs, final int rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.IntegerBinaryComparison#doIntApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, long)
   */
  public int doIntApply(final ExtendedThreadContext tc, final Object lhs, final long rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.IntegerBinaryComparison#doIntApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, float)
   */
  public int doIntApply(final ExtendedThreadContext tc, final Object lhs, final float rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.IntegerBinaryComparison#doIntApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, double)
   */
  public int doIntApply(final ExtendedThreadContext tc, final Object lhs, final double rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.IntegerBinaryComparison#doIntApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, java.math.BigInteger)
   */
  public int doIntApply(final ExtendedThreadContext tc, final Object lhs, final BigInteger rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.IntegerBinaryComparison#doIntApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, java.math.BigDecimal)
   */
  public int doIntApply(final ExtendedThreadContext tc, final Object lhs, final BigDecimal rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.IntegerBinaryComparison#doIntApply(ng.runtime.threadcontext.ExtendedThreadContext, char, java.lang.Object)
   */
  public int doIntApply(final ExtendedThreadContext tc, final char lhs, final Object rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.IntegerBinaryComparison#doIntApply(ng.runtime.threadcontext.ExtendedThreadContext, byte, java.lang.Object)
   */
  public int doIntApply(final ExtendedThreadContext tc, final byte lhs, final Object rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.IntegerBinaryComparison#doIntApply(ng.runtime.threadcontext.ExtendedThreadContext, short, java.lang.Object)
   */
  public int doIntApply(final ExtendedThreadContext tc, final short lhs, final Object rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.IntegerBinaryComparison#doIntApply(ng.runtime.threadcontext.ExtendedThreadContext, int, java.lang.Object)
   */
  public int doIntApply(final ExtendedThreadContext tc, final int lhs, final Object rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.IntegerBinaryComparison#doIntApply(ng.runtime.threadcontext.ExtendedThreadContext, long, java.lang.Object)
   */
  public int doIntApply(final ExtendedThreadContext tc, final long lhs, final Object rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.IntegerBinaryComparison#doIntApply(ng.runtime.threadcontext.ExtendedThreadContext, float, java.lang.Object)
   */
  public int doIntApply(final ExtendedThreadContext tc, final float lhs, final Object rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.IntegerBinaryComparison#doIntApply(ng.runtime.threadcontext.ExtendedThreadContext, double, java.lang.Object)
   */
  public int doIntApply(final ExtendedThreadContext tc, final double lhs, final Object rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.IntegerBinaryComparison#doIntApply(ng.runtime.threadcontext.ExtendedThreadContext, java.math.BigInteger, java.lang.Object)
   */
  public int doIntApply(final ExtendedThreadContext tc, final BigInteger lhs, final Object rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.IntegerBinaryComparison#doIntApply(ng.runtime.threadcontext.ExtendedThreadContext, java.math.BigDecimal, java.lang.Object)
   */
  public int doIntApply(final ExtendedThreadContext tc, final BigDecimal lhs, final Object rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.IntegerBinaryComparison#doReverseIntApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, java.lang.Object)
   */
  public int doReverseIntApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, ng.runtime.metaclass.MetaClass, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, char)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final char rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, byte)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final byte rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, short)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final short rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, int)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final int rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, long)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final long rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, float)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final float rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, double)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final double rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, java.math.BigInteger)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final BigInteger rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, java.math.BigDecimal)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final BigDecimal rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, char, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final char lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, byte, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, short, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final short lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, int, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final int lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, long, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final long lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, float, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final float lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, double, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final double lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.math.BigInteger, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.math.BigDecimal, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doReverseApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, java.lang.Object)
   */
  public Object doReverseApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }
}
