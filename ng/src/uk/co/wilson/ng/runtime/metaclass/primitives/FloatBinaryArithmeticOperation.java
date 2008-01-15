package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BinaryArithmeticOperation;
import ng.runtime.threadcontext.ThreadContext;

public interface FloatBinaryArithmeticOperation extends BinaryArithmeticOperation, FloatBinaryOperation {
  float doFloatApply(ThreadContext tc, float lhs, char rhs);
  float doFloatApply(ThreadContext tc, float lhs, byte rhs);
  float doFloatApply(ThreadContext tc, float lhs, short rhs);
  float doFloatApply(ThreadContext tc, float lhs, int rhs);
  float doFloatApply(ThreadContext tc, float lhs, long rhs);
  float doFloatApply(ThreadContext tc, float lhs, float rhs);
  double doDoubleApply(ThreadContext tc, float lhs, double rhs);
  float doFloatApply(ThreadContext tc, float lhs, BigInteger rhs);
  BigDecimal doBigDecimalApply(ThreadContext tc, float lhs, BigDecimal rhs);
}
