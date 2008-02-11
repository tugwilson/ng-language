package uk.co.wilson.ng.runtime.metaclass.primitives.charimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.ThreadContext;

public interface CharBinaryOperation {
  Object doApply(ThreadContext tc, char lhs, char rhs);
  Object doApply(ThreadContext tc, char lhs, byte rhs);
  Object doApply(ThreadContext tc, char lhs, short rhs);
  Object doApply(ThreadContext tc, char lhs, int rhs);
  Object doApply(ThreadContext tc, char lhs, long rhs);
  Object doApply(ThreadContext tc, char lhs, float rhs);
  Object doApply(ThreadContext tc, char lhs, double rhs);
  Object doApply(ThreadContext tc, char lhs, BigInteger rhs);
  Object doApply(ThreadContext tc, char lhs, BigDecimal rhs);
}
