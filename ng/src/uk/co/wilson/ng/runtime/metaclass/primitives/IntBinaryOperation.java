package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.ThreadContext;

public interface IntBinaryOperation {
  Object doApply(ThreadContext tc, int lhs, char rhs);
  Object doApply(ThreadContext tc, int lhs, byte rhs);
  Object doApply(ThreadContext tc, int lhs, short rhs);
  Object doApply(ThreadContext tc, int lhs, int rhs);
  Object doApply(ThreadContext tc, int lhs, long rhs);
  Object doApply(ThreadContext tc, int lhs, float rhs);
  Object doApply(ThreadContext tc, int lhs, double rhs);
  Object doApply(ThreadContext tc, int lhs, BigInteger rhs);
  Object doApply(ThreadContext tc, int lhs, BigDecimal rhs);
}
