package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BinaryArithmeticOperation;
import ng.runtime.threadcontext.ThreadContext;

public interface ByteBinaryArithmeticOperation extends BinaryArithmeticOperation, ByteBinaryOperation {
  int doIntApply(ThreadContext tc, byte lhs, char rhs);
  int doIntApply(ThreadContext tc, byte lhs, byte rhs);
  int doIntApply(ThreadContext tc, byte lhs, short rhs);
  int doIntApply(ThreadContext tc, byte lhs, int rhs);
  long doLongApply(ThreadContext tc, byte lhs, long rhs);
  float doFloatApply(ThreadContext tc, byte lhs, float rhs);
  double doDoubleApply(ThreadContext tc, byte lhs, double rhs);
  BigInteger doBigIntegerApply(ThreadContext tc, byte lhs, BigInteger rhs);
  BigDecimal doBigDecimalApply(ThreadContext tc, byte lhs, BigDecimal rhs);
}
