package uk.co.wilson.ng.runtime.metaclass.primitives.floatimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.ThreadContext;

public interface FloatBinaryOperation {
  Object doApply(ThreadContext tc, float lhs, char rhs);
  Object doApply(ThreadContext tc, float lhs, byte rhs);
  Object doApply(ThreadContext tc, float lhs, short rhs);
  Object doApply(ThreadContext tc, float lhs, int rhs);
  Object doApply(ThreadContext tc, float lhs, long rhs);
  Object doApply(ThreadContext tc, float lhs, float rhs);
  Object doApply(ThreadContext tc, float lhs, double rhs);
  Object doApply(ThreadContext tc, float lhs, BigInteger rhs);
  Object doApply(ThreadContext tc, float lhs, BigDecimal rhs);
}
