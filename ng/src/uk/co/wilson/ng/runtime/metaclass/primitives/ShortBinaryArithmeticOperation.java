package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BinaryArithmeticOperation;
import ng.runtime.threadcontext.ThreadContext;


public interface ShortBinaryArithmeticOperation extends BinaryArithmeticOperation, ShortBinaryOperation {
  int doIntApply(ThreadContext tc, short lhs, char rhs);
  int doIntApply(ThreadContext tc, short lhs, byte rhs);
  int doIntApply(ThreadContext tc, short lhs, short rhs);
  int doIntApply(ThreadContext tc, short lhs, int rhs);
  long doLongApply(ThreadContext tc, short lhs, long rhs);
  float doFloatApply(ThreadContext tc, short lhs, float rhs);
  double doDoubleApply(ThreadContext tc, short lhs, double rhs);
  BigInteger doBigIntegerApply(ThreadContext tc, short lhs, BigInteger rhs);
  BigDecimal doBigDecimalApply(ThreadContext tc, short lhs, BigDecimal rhs);
}
