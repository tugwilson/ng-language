package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BinaryArithmeticOperation;
import ng.runtime.threadcontext.ThreadContext;

public interface LongBinaryArithmeticOperation extends BinaryArithmeticOperation, LongBinaryOperation {
  long doLongApply(ThreadContext tc, long lhs, char rhs);
  long doLongApply(ThreadContext tc, long lhs, byte rhs);
  long doLongApply(ThreadContext tc, long lhs, short rhs);
  long doLongApply(ThreadContext tc, long lhs, int rhs);
  long doLongApply(ThreadContext tc, long lhs, long rhs);
  float doFloatApply(ThreadContext tc, long lhs, float rhs);
  double doDoubleApply(ThreadContext tc, long lhs, double rhs);
  BigInteger doBigIntegerApply(ThreadContext tc, long lhs, BigInteger rhs);
  BigDecimal doBigDecimalApply(ThreadContext tc, long lhs, BigDecimal rhs);
}
