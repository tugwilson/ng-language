package ng.runtime.metaclass.primitives.charimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.ExtendedThreadContext;





public interface CharBinaryOperation {
  Object doApply(ExtendedThreadContext tc, char lhs, char rhs);
  Object doApply(ExtendedThreadContext tc, char lhs, byte rhs);
  Object doApply(ExtendedThreadContext tc, char lhs, short rhs);
  Object doApply(ExtendedThreadContext tc, char lhs, int rhs);
  Object doApply(ExtendedThreadContext tc, char lhs, long rhs);
  Object doApply(ExtendedThreadContext tc, char lhs, float rhs);
  Object doApply(ExtendedThreadContext tc, char lhs, double rhs);
  Object doApply(ExtendedThreadContext tc, char lhs, BigInteger rhs);
  Object doApply(ExtendedThreadContext tc, char lhs, BigDecimal rhs);
}
