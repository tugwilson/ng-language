package ng.runtime.metaclass.primitives.byteimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.ExtendedThreadContext;

public interface ByteBinaryOperation {
  Object doApply(ExtendedThreadContext tc, byte lhs, char rhs);

  Object doApply(ExtendedThreadContext tc, byte lhs, byte rhs);

  Object doApply(ExtendedThreadContext tc, byte lhs, short rhs);

  Object doApply(ExtendedThreadContext tc, byte lhs, int rhs);

  Object doApply(ExtendedThreadContext tc, byte lhs, long rhs);

  Object doApply(ExtendedThreadContext tc, byte lhs, float rhs);

  Object doApply(ExtendedThreadContext tc, byte lhs, double rhs);

  Object doApply(ExtendedThreadContext tc, byte lhs, BigInteger rhs);

  Object doApply(ExtendedThreadContext tc, byte lhs, BigDecimal rhs);
}
