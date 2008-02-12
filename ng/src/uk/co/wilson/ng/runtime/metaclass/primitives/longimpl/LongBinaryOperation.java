package uk.co.wilson.ng.runtime.metaclass.primitives.longimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.ExtendedThreadContext;

public interface LongBinaryOperation {
  Object doApply(ExtendedThreadContext tc, long lhs, char rhs);
  Object doApply(ExtendedThreadContext tc, long lhs, byte rhs);
  Object doApply(ExtendedThreadContext tc, long lhs, short rhs);
  Object doApply(ExtendedThreadContext tc, long lhs, int rhs);
  Object doApply(ExtendedThreadContext tc, long lhs, long rhs);
  Object doApply(ExtendedThreadContext tc, long lhs, float rhs);
  Object doApply(ExtendedThreadContext tc, long lhs, double rhs);
  Object doApply(ExtendedThreadContext tc, long lhs, BigInteger rhs);
  Object doApply(ExtendedThreadContext tc, long lhs, BigDecimal rhs);
}
