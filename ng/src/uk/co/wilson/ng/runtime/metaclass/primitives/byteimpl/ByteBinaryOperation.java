package uk.co.wilson.ng.runtime.metaclass.primitives.byteimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.ThreadContext;

public interface ByteBinaryOperation {
  Object doApply(ThreadContext tc, byte lhs, char rhs);
  Object doApply(ThreadContext tc, byte lhs, byte rhs);
  Object doApply(ThreadContext tc, byte lhs, short rhs);
  Object doApply(ThreadContext tc, byte lhs, int rhs);
  Object doApply(ThreadContext tc, byte lhs, long rhs);
  Object doApply(ThreadContext tc, byte lhs, float rhs);
  Object doApply(ThreadContext tc, byte lhs, double rhs);
  Object doApply(ThreadContext tc, byte lhs, BigInteger rhs);
  Object doApply(ThreadContext tc, byte lhs, BigDecimal rhs);
}
