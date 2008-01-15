package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BinaryArithmeticOperation;
import ng.runtime.threadcontext.ThreadContext;

public interface IntBinaryArithmeticOperation extends BinaryArithmeticOperation, IntBinaryOperation {
  int doIntApply(ThreadContext tc, int lhs, char rhs);
  int doIntApply(ThreadContext tc, int lhs, byte rhs);
  int doIntApply(ThreadContext tc, int lhs, short rhs);
  int doIntApply(ThreadContext tc, int lhs, int rhs);
  long doLongApply(ThreadContext tc, int lhs, long rhs);
  float doFloatApply(ThreadContext tc, int lhs, float rhs);
  double doDoubleApply(ThreadContext tc, int lhs, double rhs);
  BigInteger doBigIntegerApply(ThreadContext tc, int lhs, BigInteger rhs);
  BigDecimal doBigDecimalApply(ThreadContext tc, int lhs, BigDecimal rhs);
}
