package uk.co.wilson.ng.runtime.metaclass.primitives.floatimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;


public interface FloatBinaryOperation {
  Object doApply(ExtendedThreadContext tc, float lhs, char rhs);
  Object doApply(ExtendedThreadContext tc, float lhs, byte rhs);
  Object doApply(ExtendedThreadContext tc, float lhs, short rhs);
  Object doApply(ExtendedThreadContext tc, float lhs, int rhs);
  Object doApply(ExtendedThreadContext tc, float lhs, long rhs);
  Object doApply(ExtendedThreadContext tc, float lhs, float rhs);
  Object doApply(ExtendedThreadContext tc, float lhs, double rhs);
  Object doApply(ExtendedThreadContext tc, float lhs, BigInteger rhs);
  Object doApply(ExtendedThreadContext tc, float lhs, BigDecimal rhs);
}
