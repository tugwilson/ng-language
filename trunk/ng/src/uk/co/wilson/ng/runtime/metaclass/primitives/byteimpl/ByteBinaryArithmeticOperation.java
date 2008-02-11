package uk.co.wilson.ng.runtime.metaclass.primitives.byteimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.ArithmeticBinaryOperation;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

public interface ByteBinaryArithmeticOperation extends ArithmeticBinaryOperation, ByteBinaryOperation {
  int doIntApply(ThreadContext tc, byte lhs, char rhs) throws NotPerformed;
  int doIntApply(ThreadContext tc, byte lhs, byte rhs) throws NotPerformed;
  int doIntApply(ThreadContext tc, byte lhs, short rhs) throws NotPerformed;
  int doIntApply(ThreadContext tc, byte lhs, int rhs) throws NotPerformed;
  long doLongApply(ThreadContext tc, byte lhs, long rhs) throws NotPerformed;
  float doFloatApply(ThreadContext tc, byte lhs, float rhs) throws NotPerformed;
  double doDoubleApply(ThreadContext tc, byte lhs, double rhs) throws NotPerformed;
  BigInteger doBigIntegerApply(ThreadContext tc, byte lhs, BigInteger rhs) throws NotPerformed;
  BigDecimal doBigDecimalApply(ThreadContext tc, byte lhs, BigDecimal rhs) throws NotPerformed;
}
