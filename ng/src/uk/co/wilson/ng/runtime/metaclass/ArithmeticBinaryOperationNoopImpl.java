package uk.co.wilson.ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.lang.MetaClass;
import ng.runtime.metaclass.ArithmeticBinaryOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;



/**
 * @author John
 *
 */
public class ArithmeticBinaryOperationNoopImpl implements ArithmeticBinaryOperation {
  public final static ArithmeticBinaryOperation instance = new ArithmeticBinaryOperationNoopImpl();

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, java.math.BigDecimal, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, java.math.BigInteger, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, byte, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, char, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final char lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, double, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final double lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, float, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final float lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, int, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final int lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, long, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final long lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, java.lang.Object, java.math.BigDecimal)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final BigDecimal rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, java.lang.Object, java.math.BigInteger)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final BigInteger rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, java.lang.Object, byte)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final byte rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, java.lang.Object, char)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final char rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, java.lang.Object, double)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final double rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, java.lang.Object, float)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final float rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, java.lang.Object, int)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final int rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, java.lang.Object, long)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final long rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, java.lang.Object, ng.runtime.metaclass.MetaClass, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, java.lang.Object, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, java.lang.Object, short)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final short rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, short, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final short lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doReverseApply(ng.runtime.threadcontext.ThreadContext, java.lang.Object, java.lang.Object)
   */
  public Object doReverseApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }
}
