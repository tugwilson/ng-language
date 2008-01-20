package uk.co.wilson.ng.runtime.metaclass.primitives.floatimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;
import uk.co.wilson.ng.runtime.metaclass.primitives.FloatBinaryArithmeticOperation;

/**
 * @author John
 *
 */
public abstract class BaseBinaryArithmeticOperation extends BaseBinaryOperation implements FloatBinaryArithmeticOperation {

  public Object doApply(final ThreadContext tc, final float lhs, final char rhs) {
    try {
      return tc.wrap(doFloatApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final float lhs, final byte rhs) {
    try {
      return tc.wrap(doFloatApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final float lhs, final short rhs) {
    try {
      return tc.wrap(doFloatApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final float lhs, final int rhs) {
    try {
      return tc.wrap(doFloatApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final float lhs, final long rhs) {
    try {
      return tc.wrap(doFloatApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final float lhs, final float rhs) {
    try {
      return tc.wrap(doFloatApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final float lhs, final double rhs) {
    try {
      return tc.wrap(doDoubleApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final float lhs, final BigInteger rhs) {
    try {
      return tc.wrap(doFloatApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final float lhs, final BigDecimal rhs) {
    try {
      return doBigDecimalApply(tc, lhs, rhs);
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }
}
