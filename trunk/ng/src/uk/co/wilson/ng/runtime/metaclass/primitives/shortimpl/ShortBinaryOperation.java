package uk.co.wilson.ng.runtime.metaclass.primitives.shortimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;


public interface ShortBinaryOperation {
  Object doApply(ExtendedThreadContext tc, short lhs, char rhs);
  Object doApply(ExtendedThreadContext tc, short lhs, byte rhs);
  Object doApply(ExtendedThreadContext tc, short lhs, short rhs);
  Object doApply(ExtendedThreadContext tc, short lhs, int rhs);
  Object doApply(ExtendedThreadContext tc, short lhs, long rhs);
  Object doApply(ExtendedThreadContext tc, short lhs, float rhs);
  Object doApply(ExtendedThreadContext tc, short lhs, double rhs);
  Object doApply(ExtendedThreadContext tc, short lhs, BigInteger rhs);
  Object doApply(ExtendedThreadContext tc, short lhs, BigDecimal rhs);
}
