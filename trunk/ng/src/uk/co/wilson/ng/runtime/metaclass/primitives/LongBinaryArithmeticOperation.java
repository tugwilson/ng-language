package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BinaryArithmeticOperation;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

public interface LongBinaryArithmeticOperation extends BinaryArithmeticOperation, LongBinaryOperation {
  long doLongApply(ThreadContext tc, long lhs, char rhs) throws NotPerformed;
  long doLongApply(ThreadContext tc, long lhs, byte rhs) throws NotPerformed;
  long doLongApply(ThreadContext tc, long lhs, short rhs) throws NotPerformed;
  long doLongApply(ThreadContext tc, long lhs, int rhs) throws NotPerformed;
  long doLongApply(ThreadContext tc, long lhs, long rhs) throws NotPerformed;
  float doFloatApply(ThreadContext tc, long lhs, float rhs) throws NotPerformed;
  double doDoubleApply(ThreadContext tc, long lhs, double rhs) throws NotPerformed;
  BigInteger doBigIntegerApply(ThreadContext tc, long lhs, BigInteger rhs) throws NotPerformed;
  BigDecimal doBigDecimalApply(ThreadContext tc, long lhs, BigDecimal rhs) throws NotPerformed;
}
