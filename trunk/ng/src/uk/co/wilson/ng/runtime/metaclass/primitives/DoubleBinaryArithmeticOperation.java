package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BinaryArithmeticOperation;
import ng.runtime.threadcontext.ThreadContext;

public interface DoubleBinaryArithmeticOperation extends BinaryArithmeticOperation, DoubleBinaryOperation {
  double doDoubleApply(ThreadContext tc, double lhs, char rhs);
  double doDoubleApply(ThreadContext tc, double lhs, byte rhs);
  double doDoubleApply(ThreadContext tc, double lhs, short rhs);
  double doDoubleApply(ThreadContext tc, double lhs, int rhs);
  double doDoubleApply(ThreadContext tc, double lhs, long rhs);
  double doDoubleApply(ThreadContext tc, double lhs, float rhs);
  double doDoubleApply(ThreadContext tc, double lhs, double rhs);
  double doDoubleApply(ThreadContext tc, double lhs, BigInteger rhs);
  BigDecimal doBigDecimalApply(ThreadContext tc, double lhs, BigDecimal rhs);
}
