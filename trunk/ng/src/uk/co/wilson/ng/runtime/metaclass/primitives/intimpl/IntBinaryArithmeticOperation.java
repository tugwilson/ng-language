package uk.co.wilson.ng.runtime.metaclass.primitives.intimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.ArithmeticBinaryOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

public interface IntBinaryArithmeticOperation extends ArithmeticBinaryOperation, IntBinaryOperation {
  int doIntApply(ExtendedThreadContext tc, int lhs, char rhs) throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, int lhs, byte rhs) throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, int lhs, short rhs) throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, int lhs, int rhs) throws NotPerformed;
  long doLongApply(ExtendedThreadContext tc, int lhs, long rhs) throws NotPerformed;
  float doFloatApply(ExtendedThreadContext tc, int lhs, float rhs) throws NotPerformed;
  double doDoubleApply(ExtendedThreadContext tc, int lhs, double rhs) throws NotPerformed;
  BigInteger doBigIntegerApply(ExtendedThreadContext tc, int lhs, BigInteger rhs) throws NotPerformed;
  BigDecimal doBigDecimalApply(ExtendedThreadContext tc, int lhs, BigDecimal rhs) throws NotPerformed;
}
