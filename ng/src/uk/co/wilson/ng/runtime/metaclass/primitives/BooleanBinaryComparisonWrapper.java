package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;
import uk.co.wilson.ng.runtime.threadcontext.NotPerformed;

import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.MetaClass;

/**
 * @author John
 *
 */
public abstract class BooleanBinaryComparisonWrapper implements BooleanBinaryComparison {
  private final BooleanBinaryComparison delegate;
  public BooleanBinaryComparisonWrapper(final BooleanBinaryComparison delegate) {
    this.delegate = delegate;
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.math.BigDecimal, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.math.BigInteger, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final Object rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, byte, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final Object rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, char, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final char lhs, final Object rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, double, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final double lhs, final Object rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, float, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final float lhs, final Object rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, int, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final int lhs, final Object rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, long, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final long lhs, final Object rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, java.math.BigDecimal)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final BigDecimal rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, java.math.BigInteger)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final BigInteger rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, byte)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final byte rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, char)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final char rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, double)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final double rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, float)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final float rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, int)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final int rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, long)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final long rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhsMetaClass
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, ng.runtime.metaclass.MetaClass, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return this.delegate.doApply(tc, lhs, rhsMetaClass, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, short)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final short rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doApply(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, short, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final short lhs, final Object rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.math.BigDecimal, java.lang.Object)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigDecimal lhs, final Object rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.math.BigInteger, java.lang.Object)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigInteger lhs, final Object rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, byte, java.lang.Object)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final byte lhs, final Object rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, char, java.lang.Object)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final char lhs, final Object rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, double, java.lang.Object)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final double lhs, final Object rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, float, java.lang.Object)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final float lhs, final Object rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, int, java.lang.Object)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final int lhs, final Object rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, long, java.lang.Object)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final long lhs, final Object rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, java.math.BigDecimal)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final BigDecimal rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, java.math.BigInteger)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final BigInteger rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, byte)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final byte rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, char)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final char rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, double)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final double rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, float)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final float rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, int)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final int rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, long)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final long rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhsMetaClass
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, ng.runtime.metaclass.MetaClass, java.lang.Object)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhsMetaClass, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, java.lang.Object)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final Object rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, short)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final short rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, short, java.lang.Object)
   */
  public boolean doApplyBoolean(final ExtendedThreadContext tc, final short lhs, final Object rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.ArithmeticBinaryOperation#doReverseApply(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, java.lang.Object)
   */
  public Object doReverseApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return this.delegate.doReverseApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doReverseApplyBoolean(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, java.lang.Object)
   */
  public boolean doReverseApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final Object rhs) throws NotPerformed {
    return this.delegate.doReverseApplyBoolean(tc, lhs, rhs);
  }
}
