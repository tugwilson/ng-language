package ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.ExtendedThreadContext;





public interface IntBinaryOperation {
  Object doApply(ExtendedThreadContext tc, int lhs, char rhs);
  Object doApply(ExtendedThreadContext tc, int lhs, byte rhs);
  Object doApply(ExtendedThreadContext tc, int lhs, short rhs);
  Object doApply(ExtendedThreadContext tc, int lhs, int rhs);
  Object doApply(ExtendedThreadContext tc, int lhs, long rhs);
  Object doApply(ExtendedThreadContext tc, int lhs, float rhs);
  Object doApply(ExtendedThreadContext tc, int lhs, double rhs);
  Object doApply(ExtendedThreadContext tc, int lhs, BigInteger rhs);
  Object doApply(ExtendedThreadContext tc, int lhs, BigDecimal rhs);
}
