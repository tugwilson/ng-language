package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.ThreadContext;

public interface ShortBinaryOperation {
  Object doApply(ThreadContext tc, short lhs, char rhs);
  Object doApply(ThreadContext tc, short lhs, byte rhs);
  Object doApply(ThreadContext tc, short lhs, short rhs);
  Object doApply(ThreadContext tc, short lhs, int rhs);
  Object doApply(ThreadContext tc, short lhs, long rhs);
  Object doApply(ThreadContext tc, short lhs, float rhs);
  Object doApply(ThreadContext tc, short lhs, double rhs);
  Object doApply(ThreadContext tc, short lhs, BigInteger rhs);
  Object doApply(ThreadContext tc, short lhs, BigDecimal rhs);
}
