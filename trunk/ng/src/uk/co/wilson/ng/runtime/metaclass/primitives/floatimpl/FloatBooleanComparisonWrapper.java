package uk.co.wilson.ng.runtime.metaclass.primitives.floatimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.NgFloat;
import ng.runtime.metaclass.BooleanBinaryComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.BooleanBinaryComparisonWrapper;
import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;
import uk.co.wilson.ng.runtime.threadcontext.NotPerformed;

/**
 * @author John
 *
 */
public class FloatBooleanComparisonWrapper extends BooleanBinaryComparisonWrapper implements FloatBooleanComparison {

  /**
   * @param delegate
   */
  public FloatBooleanComparisonWrapper(final BooleanBinaryComparison delegate) {
    super(delegate);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final float lhs, final char rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgFloat.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final float lhs, final byte rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgFloat.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final float lhs, final short rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgFloat.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final float lhs, final int rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgFloat.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final float lhs, final long rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgFloat.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final float lhs, final float rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgFloat.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final float lhs, final double rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgFloat.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final float lhs, final BigInteger rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgFloat.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final float lhs, final BigDecimal rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgFloat.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final float lhs, final char rhs) {
    return doApply(tc, NgFloat.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final float lhs, final byte rhs) {
    return doApply(tc, NgFloat.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final float lhs, final short rhs) {
    return doApply(tc, NgFloat.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final float lhs, final int rhs) {
    return doApply(tc, NgFloat.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final float lhs, final long rhs) {
    return doApply(tc, NgFloat.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final float lhs, final float rhs) {
    return doApply(tc, NgFloat.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final float lhs, final double rhs) {
    return doApply(tc, NgFloat.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final float lhs, final BigInteger rhs) {
    return doApply(tc, NgFloat.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final float lhs, final BigDecimal rhs) {
    return doApply(tc, NgFloat.valueOf(lhs), rhs);
  }
}
