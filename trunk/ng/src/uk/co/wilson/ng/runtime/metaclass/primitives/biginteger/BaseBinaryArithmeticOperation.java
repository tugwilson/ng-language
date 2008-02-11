package uk.co.wilson.ng.runtime.metaclass.primitives.biginteger;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

/**
 * @author John
 *
 */
public abstract class BaseBinaryArithmeticOperation extends BaseBinaryOperation implements BigIntegerBinaryArithmeticOperation {

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final char rhs) {
    try {
      return doBigIntegerApply(tc, lhs, rhs);
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final byte rhs) {
    try {
      return doBigIntegerApply(tc, lhs, rhs);
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final short rhs) {
    try {
      return doBigIntegerApply(tc, lhs, rhs);
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final int rhs) {
    try {
      return doBigIntegerApply(tc, lhs, rhs);
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final long rhs) {
    try {
      return doBigIntegerApply(tc, lhs, rhs);
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final float rhs) {
    try {
      return tc.wrap(doFloatApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final double rhs) {
    try {
      return tc.wrap(doDoubleApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final BigInteger rhs) {
    try {
      return doBigIntegerApply(tc, lhs, rhs);
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final BigDecimal rhs) {
    try {
      return doBigDecimalApply(tc, lhs, rhs);
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }
}
