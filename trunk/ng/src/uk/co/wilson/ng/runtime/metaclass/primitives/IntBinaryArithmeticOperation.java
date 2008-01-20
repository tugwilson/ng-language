package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BinaryArithmeticOperation;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

public interface IntBinaryArithmeticOperation extends BinaryArithmeticOperation, IntBinaryOperation {
  int doIntApply(ThreadContext tc, int lhs, char rhs) throws NotPerformed;
  int doIntApply(ThreadContext tc, int lhs, byte rhs) throws NotPerformed;
  int doIntApply(ThreadContext tc, int lhs, short rhs) throws NotPerformed;
  int doIntApply(ThreadContext tc, int lhs, int rhs) throws NotPerformed;
  long doLongApply(ThreadContext tc, int lhs, long rhs) throws NotPerformed;
  float doFloatApply(ThreadContext tc, int lhs, float rhs) throws NotPerformed;
  double doDoubleApply(ThreadContext tc, int lhs, double rhs) throws NotPerformed;
  BigInteger doBigIntegerApply(ThreadContext tc, int lhs, BigInteger rhs) throws NotPerformed;
  BigDecimal doBigDecimalApply(ThreadContext tc, int lhs, BigDecimal rhs) throws NotPerformed;
}
