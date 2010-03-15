package uk.co.wilson.ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

/**
 * @author John
 * 
 */
public class BooleanBinaryComparisonNoopImpl implements BooleanBinaryComparison {
  public static final BooleanBinaryComparison instance = new BooleanBinaryComparisonNoopImpl();

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.
   * threadcontext.ThreadContext, java.math.BigDecimal, java.lang.Object)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigDecimal lhs, final Object rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.
   * threadcontext.ThreadContext, java.math.BigInteger, java.lang.Object)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigInteger lhs, final Object rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.
   * threadcontext.ThreadContext, byte, java.lang.Object)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final byte lhs, final Object rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.
   * threadcontext.ThreadContext, char, java.lang.Object)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final char lhs, final Object rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.
   * threadcontext.ThreadContext, double, java.lang.Object)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final double lhs, final Object rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.
   * threadcontext.ThreadContext, float, java.lang.Object)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final float lhs, final Object rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.
   * threadcontext.ThreadContext, int, java.lang.Object)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final int lhs, final Object rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.
   * threadcontext.ThreadContext, long, java.lang.Object)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final long lhs, final Object rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.
   * threadcontext.ThreadContext, java.lang.Object, java.math.BigDecimal)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final BigDecimal rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.
   * threadcontext.ThreadContext, java.lang.Object, java.math.BigInteger)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final BigInteger rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.
   * threadcontext.ThreadContext, java.lang.Object, byte)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final byte rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.
   * threadcontext.ThreadContext, java.lang.Object, char)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final char rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.
   * threadcontext.ThreadContext, java.lang.Object, double)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final double rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.
   * threadcontext.ThreadContext, java.lang.Object, float)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final float rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.
   * threadcontext.ThreadContext, java.lang.Object, int)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final int rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.
   * threadcontext.ThreadContext, java.lang.Object, long)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final long rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.
   * threadcontext.ThreadContext, java.lang.Object,
   * ng.runtime.metaclass.MetaClass, java.lang.Object)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.
   * threadcontext.ThreadContext, java.lang.Object, java.lang.Object)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final Object rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.
   * threadcontext.ThreadContext, java.lang.Object, short)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final short rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.
   * threadcontext.ThreadContext, short, java.lang.Object)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final short lhs, final Object rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BooleanBinaryComparison#doReverseApplyBoolean(ng.runtime
   * .threadcontext.ThreadContext, java.lang.Object, java.lang.Object)
   */
  public boolean doReverseApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final Object rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext
   * .ThreadContext, java.math.BigDecimal, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext
   * .ThreadContext, java.math.BigInteger, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext
   * .ThreadContext, byte, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext
   * .ThreadContext, char, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final char lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext
   * .ThreadContext, double, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final double lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext
   * .ThreadContext, float, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final float lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext
   * .ThreadContext, int, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final int lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext
   * .ThreadContext, long, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final long lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext
   * .ThreadContext, java.lang.Object, java.math.BigDecimal)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final BigDecimal rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext
   * .ThreadContext, java.lang.Object, java.math.BigInteger)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final BigInteger rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext
   * .ThreadContext, java.lang.Object, byte)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final byte rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext
   * .ThreadContext, java.lang.Object, char)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final char rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext
   * .ThreadContext, java.lang.Object, double)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final double rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext
   * .ThreadContext, java.lang.Object, float)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final float rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext
   * .ThreadContext, java.lang.Object, int)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final int rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext
   * .ThreadContext, java.lang.Object, long)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final long rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext
   * .ThreadContext, java.lang.Object, ng.runtime.metaclass.MetaClass,
   * java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext
   * .ThreadContext, java.lang.Object, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext
   * .ThreadContext, java.lang.Object, short)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final short rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext
   * .ThreadContext, short, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final short lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see
   * ng.runtime.metaclass.BinaryArithmeticOperation#doReverseApply(ng.runtime
   * .threadcontext.ThreadContext, java.lang.Object, java.lang.Object)
   */
  public Object doReverseApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

}
