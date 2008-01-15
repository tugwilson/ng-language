package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.ThreadContext;

public interface DoubleBinaryOperation {
  Object doApply(ThreadContext tc, double lhs, char rhs);
  Object doApply(ThreadContext tc, double lhs, byte rhs);
  Object doApply(ThreadContext tc, double lhs, short rhs);
  Object doApply(ThreadContext tc, double lhs, int rhs);
  Object doApply(ThreadContext tc, double lhs, long rhs);
  Object doApply(ThreadContext tc, double lhs, float rhs);
  Object doApply(ThreadContext tc, double lhs, double rhs);
  Object doApply(ThreadContext tc, double lhs, BigInteger rhs);
  Object doApply(ThreadContext tc, double lhs, BigDecimal rhs);
}
