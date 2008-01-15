package uk.co.wilson.ng.runtime.metaclass.primitives.floatimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.ThreadContext;
import uk.co.wilson.ng.runtime.metaclass.primitives.FloatBinaryOperation;

abstract class BaseBinaryOperation implements FloatBinaryOperation {

  public Object doApply(final ThreadContext tc, final Object lhs, final char rhs) {
    return doApply(tc, tc.unwrapToFloat(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final byte rhs) {
    return doApply(tc, tc.unwrapToFloat(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final short rhs) {
    return doApply(tc, tc.unwrapToFloat(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final int rhs) {
    return doApply(tc, tc.unwrapToFloat(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final long rhs) {
    return doApply(tc, tc.unwrapToFloat(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final float rhs) {
    return doApply(tc, tc.unwrapToFloat(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final double rhs) {
    return doApply(tc, tc.unwrapToFloat(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final BigInteger rhs) {
    return doApply(tc, tc.unwrapToFloat(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final BigDecimal rhs) {
    return doApply(tc, tc.unwrapToFloat(lhs), rhs);
  }
}