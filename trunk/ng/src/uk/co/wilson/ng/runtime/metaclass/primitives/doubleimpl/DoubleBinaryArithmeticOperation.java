package uk.co.wilson.ng.runtime.metaclass.primitives.doubleimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.ArithmeticBinaryOperation;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

public interface DoubleBinaryArithmeticOperation extends ArithmeticBinaryOperation, DoubleBinaryOperation {
  double doDoubleApply(ThreadContext tc, double lhs, char rhs) throws NotPerformed;
  double doDoubleApply(ThreadContext tc, double lhs, byte rhs) throws NotPerformed;
  double doDoubleApply(ThreadContext tc, double lhs, short rhs) throws NotPerformed;
  double doDoubleApply(ThreadContext tc, double lhs, int rhs) throws NotPerformed;
  double doDoubleApply(ThreadContext tc, double lhs, long rhs) throws NotPerformed;
  double doDoubleApply(ThreadContext tc, double lhs, float rhs) throws NotPerformed;
  double doDoubleApply(ThreadContext tc, double lhs, double rhs) throws NotPerformed;
  double doDoubleApply(ThreadContext tc, double lhs, BigInteger rhs) throws NotPerformed;
  BigDecimal doBigDecimalApply(ThreadContext tc, double lhs, BigDecimal rhs) throws NotPerformed;
}
