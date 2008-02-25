package uk.co.wilson.ng.runtime.metaclass.primitives.doubleimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.NgDouble;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.BooleanBinaryComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.BooleanBinaryComparisonWrapper;
import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 *
 */
public class DoubleBooleanComparisonWrapper extends BooleanBinaryComparisonWrapper implements DoubleBooleanComparison {

  /**
   * @param delegate
   */
  public DoubleBooleanComparisonWrapper(final BooleanBinaryComparison delegate) {
    super(delegate);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final double lhs, final char rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgDouble.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final double lhs, final byte rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgDouble.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final double lhs, final short rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgDouble.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final double lhs, final int rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgDouble.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final double lhs, final long rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgDouble.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final double lhs, final float rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgDouble.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final double lhs, final double rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgDouble.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final double lhs, final BigInteger rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgDouble.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final double lhs, final BigDecimal rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final char rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final byte rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final short rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final int rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final long rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final float rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final double rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final BigInteger rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final BigDecimal rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }
}
