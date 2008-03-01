package uk.co.wilson.ng.runtime.metaclass.primitives.longimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.primitives.longimpl.LongBooleanComparison;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.primitives.BooleanBinaryComparisonWrapper;

/**
 * @author John
 *
 */
public class LongBooleanComparisonWrapper extends BooleanBinaryComparisonWrapper implements LongBooleanComparison {

  /**
   * @param delegate
   */
  public LongBooleanComparisonWrapper(final BooleanBinaryComparison delegate) {
    super(delegate);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final long lhs, final char rhs) throws NotPerformed {
    return doApplyBoolean(tc, tc.wrap(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final long lhs, final byte rhs) throws NotPerformed {
    return doApplyBoolean(tc, tc.wrap(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final long lhs, final short rhs) throws NotPerformed {
    return doApplyBoolean(tc, tc.wrap(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final long lhs, final int rhs) throws NotPerformed {
    return doApplyBoolean(tc, tc.wrap(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final long lhs, final long rhs) throws NotPerformed {
    return doApplyBoolean(tc, tc.wrap(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final long lhs, final float rhs) throws NotPerformed {
    return doApplyBoolean(tc, tc.wrap(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final long lhs, final double rhs) throws NotPerformed {
    return doApplyBoolean(tc, tc.wrap(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final long lhs, final BigInteger rhs) throws NotPerformed {
    return doApplyBoolean(tc, tc.wrap(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final long lhs, final BigDecimal rhs) throws NotPerformed {
    return doApplyBoolean(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final char rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final byte rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final short rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final int rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final long rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final float rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final double rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final BigInteger rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final BigDecimal rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }
}
