package uk.co.wilson.ng.runtime.metaclass.primitives.charimpl;


import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;
import uk.co.wilson.ng.runtime.metaclass.primitives.CharBinaryArithmeticOperation;

/**
 * @author John
 *
 */
public abstract class BaseBinaryArithmeticOperation extends BaseBinaryOperation implements CharBinaryArithmeticOperation {

  public Object doApply(final ThreadContext tc, final char lhs, final char rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final char lhs, final byte rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final char lhs, final short rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final char lhs, final int rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final char lhs, final long rhs) {
    try {
      return tc.wrap(doLongApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final char lhs, final float rhs) {
    try {
      return tc.wrap(doFloatApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final char lhs, final double rhs) {
    try {
      return tc.wrap(doDoubleApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final char lhs, final BigInteger rhs) {
    try {
      return doBigIntegerApply(tc, lhs, rhs);
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final char lhs, final BigDecimal rhs) {
    try {
      return doBigDecimalApply(tc, lhs, rhs);
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }
}
