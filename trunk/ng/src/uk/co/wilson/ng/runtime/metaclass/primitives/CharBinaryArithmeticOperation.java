package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BinaryArithmeticOperation;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

public interface CharBinaryArithmeticOperation extends BinaryArithmeticOperation, CharBinaryOperation {
  int doIntApply(ThreadContext tc, char lhs, char rhs) throws NotPerformed;
  int doIntApply(ThreadContext tc, char lhs, byte rhs) throws NotPerformed;
  int doIntApply(ThreadContext tc, char lhs, short rhs) throws NotPerformed;
  int doIntApply(ThreadContext tc, char lhs, int rhs) throws NotPerformed;
  long doLongApply(ThreadContext tc, char lhs, long rhs) throws NotPerformed;
  float doFloatApply(ThreadContext tc, char lhs, float rhs) throws NotPerformed;
  double doDoubleApply(ThreadContext tc, char lhs, double rhs) throws NotPerformed;
  BigInteger doBigIntegerApply(ThreadContext tc, char lhs, BigInteger rhs) throws NotPerformed;
  BigDecimal doBigDecimalApply(ThreadContext tc, char lhs, BigDecimal rhs) throws NotPerformed;
}
