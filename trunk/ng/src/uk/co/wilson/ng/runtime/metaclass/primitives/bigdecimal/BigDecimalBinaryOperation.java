package uk.co.wilson.ng.runtime.metaclass.primitives.bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;


public interface BigDecimalBinaryOperation {
  Object doApply(ExtendedThreadContext tc, BigDecimal lhs, char rhs);
  Object doApply(ExtendedThreadContext tc, BigDecimal lhs, byte rhs);
  Object doApply(ExtendedThreadContext tc, BigDecimal lhs, short rhs);
  Object doApply(ExtendedThreadContext tc, BigDecimal lhs, int rhs);
  Object doApply(ExtendedThreadContext tc, BigDecimal lhs, long rhs);
  Object doApply(ExtendedThreadContext tc, BigDecimal lhs, float rhs);
  Object doApply(ExtendedThreadContext tc, BigDecimal lhs, double rhs);
  Object doApply(ExtendedThreadContext tc, BigDecimal lhs, BigInteger rhs);
  Object doApply(ExtendedThreadContext tc, BigDecimal lhs, BigDecimal rhs);
}
