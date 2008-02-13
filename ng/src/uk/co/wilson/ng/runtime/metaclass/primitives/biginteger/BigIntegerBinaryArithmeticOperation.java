package uk.co.wilson.ng.runtime.metaclass.primitives.biginteger;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.ArithmeticBinaryOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

public interface BigIntegerBinaryArithmeticOperation extends ArithmeticBinaryOperation, BigIntegerBinaryOperation {
  BigInteger doBigIntegerApply(ExtendedThreadContext tc, BigInteger lhs, char rhs) throws NotPerformed;
  BigInteger doBigIntegerApply(ExtendedThreadContext tc, BigInteger lhs, byte rhs) throws NotPerformed;
  BigInteger doBigIntegerApply(ExtendedThreadContext tc, BigInteger lhs, short rhs) throws NotPerformed;
  BigInteger doBigIntegerApply(ExtendedThreadContext tc, BigInteger lhs, int rhs) throws NotPerformed;
  BigInteger doBigIntegerApply(ExtendedThreadContext tc, BigInteger lhs, long rhs) throws NotPerformed;
  float doFloatApply(ExtendedThreadContext tc, BigInteger lhs, float rhs) throws NotPerformed;
  double doDoubleApply(ExtendedThreadContext tc, BigInteger lhs, double rhs) throws NotPerformed;
  BigInteger doBigIntegerApply(ExtendedThreadContext tc, BigInteger lhs, BigInteger rhs) throws NotPerformed;
  BigDecimal doBigDecimalApply(ExtendedThreadContext tc, BigInteger lhs, BigDecimal rhs) throws NotPerformed;
}
