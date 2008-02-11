package uk.co.wilson.ng.runtime.metaclass.primitives.shortimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.ArithmeticBinaryOperation;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;


public interface ShortBinaryArithmeticOperation extends ArithmeticBinaryOperation, ShortBinaryOperation {
  int doIntApply(ThreadContext tc, short lhs, char rhs) throws NotPerformed;
  int doIntApply(ThreadContext tc, short lhs, byte rhs) throws NotPerformed;
  int doIntApply(ThreadContext tc, short lhs, short rhs) throws NotPerformed;
  int doIntApply(ThreadContext tc, short lhs, int rhs) throws NotPerformed;
  long doLongApply(ThreadContext tc, short lhs, long rhs) throws NotPerformed;
  float doFloatApply(ThreadContext tc, short lhs, float rhs) throws NotPerformed;
  double doDoubleApply(ThreadContext tc, short lhs, double rhs) throws NotPerformed;
  BigInteger doBigIntegerApply(ThreadContext tc, short lhs, BigInteger rhs) throws NotPerformed;
  BigDecimal doBigDecimalApply(ThreadContext tc, short lhs, BigDecimal rhs) throws NotPerformed;
}
