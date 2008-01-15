package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.ThreadContext;

public interface BigIntegerBinaryOperation {
  Object doApply(ThreadContext tc, BigInteger lhs, char rhs);
  Object doApply(ThreadContext tc, BigInteger lhs, byte rhs);
  Object doApply(ThreadContext tc, BigInteger lhs, short rhs);
  Object doApply(ThreadContext tc, BigInteger lhs, int rhs);
  Object doApply(ThreadContext tc, BigInteger lhs, long rhs);
  Object doApply(ThreadContext tc, BigInteger lhs, float rhs);
  Object doApply(ThreadContext tc, BigInteger lhs, double rhs);
  Object doApply(ThreadContext tc, BigInteger lhs, BigInteger rhs);
  Object doApply(ThreadContext tc, BigInteger lhs, BigDecimal rhs);
}
