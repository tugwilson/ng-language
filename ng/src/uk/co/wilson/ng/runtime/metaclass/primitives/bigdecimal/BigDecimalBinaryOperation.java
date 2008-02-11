package uk.co.wilson.ng.runtime.metaclass.primitives.bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.ThreadContext;

public interface BigDecimalBinaryOperation {
  Object doApply(ThreadContext tc, BigDecimal lhs, char rhs);
  Object doApply(ThreadContext tc, BigDecimal lhs, byte rhs);
  Object doApply(ThreadContext tc, BigDecimal lhs, short rhs);
  Object doApply(ThreadContext tc, BigDecimal lhs, int rhs);
  Object doApply(ThreadContext tc, BigDecimal lhs, long rhs);
  Object doApply(ThreadContext tc, BigDecimal lhs, float rhs);
  Object doApply(ThreadContext tc, BigDecimal lhs, double rhs);
  Object doApply(ThreadContext tc, BigDecimal lhs, BigInteger rhs);
  Object doApply(ThreadContext tc, BigDecimal lhs, BigDecimal rhs);
}
