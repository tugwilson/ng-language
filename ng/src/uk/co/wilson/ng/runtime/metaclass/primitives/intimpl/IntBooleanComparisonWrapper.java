package uk.co.wilson.ng.runtime.metaclass.primitives.intimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.primitives.intimpl.IntBooleanComparison;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.primitives.BooleanBinaryComparisonWrapper;

/**
 * @author John
 * 
 */
public class IntBooleanComparisonWrapper extends BooleanBinaryComparisonWrapper implements IntBooleanComparison {

  /**
   * @param delegate
   */
  public IntBooleanComparisonWrapper(final BooleanBinaryComparison delegate) {
    super(delegate);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final int lhs, final char rhs) throws NotPerformed {
    return doApplyBoolean(tc, tc.wrap(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final int lhs, final byte rhs) throws NotPerformed {
    return doApplyBoolean(tc, tc.wrap(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final int lhs, final short rhs) throws NotPerformed {
    return doApplyBoolean(tc, tc.wrap(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final int lhs, final int rhs) throws NotPerformed {
    return doApplyBoolean(tc, tc.wrap(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final int lhs, final long rhs) throws NotPerformed {
    return doApplyBoolean(tc, tc.wrap(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final int lhs, final float rhs) throws NotPerformed {
    return doApplyBoolean(tc, tc.wrap(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final int lhs, final double rhs) throws NotPerformed {
    return doApplyBoolean(tc, tc.wrap(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final int lhs, final BigInteger rhs) throws NotPerformed {
    return doApplyBoolean(tc, tc.wrap(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final int lhs, final BigDecimal rhs) throws NotPerformed {
    return doApplyBoolean(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final char rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final byte rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final short rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final int rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final long rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final float rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final double rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final BigInteger rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final BigDecimal rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }
}
