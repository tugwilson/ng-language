package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BinaryArithmeticOperation;
import ng.runtime.threadcontext.ThreadContext;

public interface CharBinaryArithmeticOperation extends BinaryArithmeticOperation, CharBinaryOperation {
  int doIntApply(ThreadContext tc, char lhs, char rhs);
  int doIntApply(ThreadContext tc, char lhs, byte rhs);
  int doIntApply(ThreadContext tc, char lhs, short rhs);
  int doIntApply(ThreadContext tc, char lhs, int rhs);
  long doLongApply(ThreadContext tc, char lhs, long rhs);
  float doFloatApply(ThreadContext tc, char lhs, float rhs);
  double doDoubleApply(ThreadContext tc, char lhs, double rhs);
  BigInteger doBigIntegerApply(ThreadContext tc, char lhs, BigInteger rhs);
  BigDecimal doBigDecimalApply(ThreadContext tc, char lhs, BigDecimal rhs);
}
