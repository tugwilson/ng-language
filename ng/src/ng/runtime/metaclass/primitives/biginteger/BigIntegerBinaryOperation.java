package ng.runtime.metaclass.primitives.biginteger;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.ExtendedThreadContext;

public interface BigIntegerBinaryOperation {
  Object doApply(ExtendedThreadContext tc, BigInteger lhs, char rhs);

  Object doApply(ExtendedThreadContext tc, BigInteger lhs, byte rhs);

  Object doApply(ExtendedThreadContext tc, BigInteger lhs, short rhs);

  Object doApply(ExtendedThreadContext tc, BigInteger lhs, int rhs);

  Object doApply(ExtendedThreadContext tc, BigInteger lhs, long rhs);

  Object doApply(ExtendedThreadContext tc, BigInteger lhs, float rhs);

  Object doApply(ExtendedThreadContext tc, BigInteger lhs, double rhs);

  Object doApply(ExtendedThreadContext tc, BigInteger lhs, BigInteger rhs);

  Object doApply(ExtendedThreadContext tc, BigInteger lhs, BigDecimal rhs);
}
