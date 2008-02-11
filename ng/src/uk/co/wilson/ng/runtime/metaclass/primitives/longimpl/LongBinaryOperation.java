package uk.co.wilson.ng.runtime.metaclass.primitives.longimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.ThreadContext;

public interface LongBinaryOperation {
  Object doApply(ThreadContext tc, long lhs, char rhs);
  Object doApply(ThreadContext tc, long lhs, byte rhs);
  Object doApply(ThreadContext tc, long lhs, short rhs);
  Object doApply(ThreadContext tc, long lhs, int rhs);
  Object doApply(ThreadContext tc, long lhs, long rhs);
  Object doApply(ThreadContext tc, long lhs, float rhs);
  Object doApply(ThreadContext tc, long lhs, double rhs);
  Object doApply(ThreadContext tc, long lhs, BigInteger rhs);
  Object doApply(ThreadContext tc, long lhs, BigDecimal rhs);
}
