package uk.co.wilson.ng.runtime.metaclass.primitives.biginteger;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.ArithmeticBinaryOperation;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

public interface BigIntegerBinaryArithmeticOperation extends ArithmeticBinaryOperation, BigIntegerBinaryOperation {
  BigInteger doBigIntegerApply(ThreadContext tc, BigInteger lhs, char rhs) throws NotPerformed;
  BigInteger doBigIntegerApply(ThreadContext tc, BigInteger lhs, byte rhs) throws NotPerformed;
  BigInteger doBigIntegerApply(ThreadContext tc, BigInteger lhs, short rhs) throws NotPerformed;
  BigInteger doBigIntegerApply(ThreadContext tc, BigInteger lhs, int rhs) throws NotPerformed;
  BigInteger doBigIntegerApply(ThreadContext tc, BigInteger lhs, long rhs) throws NotPerformed;
  float doFloatApply(ThreadContext tc, BigInteger lhs, float rhs) throws NotPerformed;
  double doDoubleApply(ThreadContext tc, BigInteger lhs, double rhs) throws NotPerformed;
  BigInteger doBigIntegerApply(ThreadContext tc, BigInteger lhs, BigInteger rhs) throws NotPerformed;
  BigDecimal doBigDecimalApply(ThreadContext tc, BigInteger lhs, BigDecimal rhs) throws NotPerformed;
}
