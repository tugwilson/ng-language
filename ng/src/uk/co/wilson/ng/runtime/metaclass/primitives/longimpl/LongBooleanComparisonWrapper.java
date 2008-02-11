package uk.co.wilson.ng.runtime.metaclass.primitives.longimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.NgLong;
import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;
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

  public boolean doApplyBoolean(final ThreadContext tc, final long lhs, final char rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgLong.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final long lhs, final byte rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgLong.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final long lhs, final short rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgLong.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final long lhs, final int rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgLong.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final long lhs, final long rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgLong.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final long lhs, final float rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgLong.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final long lhs, final double rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgLong.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final long lhs, final BigInteger rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgLong.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final long lhs, final BigDecimal rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgLong.valueOf(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final long lhs, final char rhs) {
    return doApply(tc, NgLong.valueOf(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final long lhs, final byte rhs) {
    return doApply(tc, NgLong.valueOf(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final long lhs, final short rhs) {
    return doApply(tc, NgLong.valueOf(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final long lhs, final int rhs) {
    return doApply(tc, NgLong.valueOf(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final long lhs, final long rhs) {
    return doApply(tc, NgLong.valueOf(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final long lhs, final float rhs) {
    return doApply(tc, NgLong.valueOf(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final long lhs, final double rhs) {
    return doApply(tc, NgLong.valueOf(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final long lhs, final BigInteger rhs) {
    return doApply(tc, NgLong.valueOf(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final long lhs, final BigDecimal rhs) {
    return doApply(tc, NgLong.valueOf(lhs), rhs);
  }
}
