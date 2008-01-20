package uk.co.wilson.ng.runtime.metaclass.primitives.intimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;
import uk.co.wilson.ng.runtime.metaclass.primitives.IntBinaryArithmeticOperation;

/**
 * @author John
 *
 */
public abstract class BaseBinaryArithmeticOperation extends BaseBinaryOperation implements IntBinaryArithmeticOperation {

  public Object doApply(final ThreadContext tc, final int lhs, final byte rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final int lhs, final short rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final int lhs, final int rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final int lhs, final long rhs) {
    try {
      return tc.wrap(doLongApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final int lhs, final float rhs) {
    try {
      return tc.wrap(doFloatApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final int lhs, final double rhs) {
    try {
      return tc.wrap(doDoubleApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final int lhs, final BigInteger rhs) {
    try {
      return doBigIntegerApply(tc, lhs, rhs);
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final int lhs, final BigDecimal rhs) {
    try {
      return doBigDecimalApply(tc, lhs, rhs);
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }
}
