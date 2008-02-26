package ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.ExtendedThreadContext;





public interface DoubleBinaryOperation {
  Object doApply(ExtendedThreadContext tc, double lhs, char rhs);
  Object doApply(ExtendedThreadContext tc, double lhs, byte rhs);
  Object doApply(ExtendedThreadContext tc, double lhs, short rhs);
  Object doApply(ExtendedThreadContext tc, double lhs, int rhs);
  Object doApply(ExtendedThreadContext tc, double lhs, long rhs);
  Object doApply(ExtendedThreadContext tc, double lhs, float rhs);
  Object doApply(ExtendedThreadContext tc, double lhs, double rhs);
  Object doApply(ExtendedThreadContext tc, double lhs, BigInteger rhs);
  Object doApply(ExtendedThreadContext tc, double lhs, BigDecimal rhs);
}
