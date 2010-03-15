package ng.runtime.metaclass.primitives.doubleimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BinaryOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

public interface DoubleBinaryArithmeticOperation extends BinaryOperation, DoubleBinaryOperation {
  double doDoubleApply(ExtendedThreadContext tc, double lhs, char rhs) throws NotPerformed;

  double doDoubleApply(ExtendedThreadContext tc, double lhs, byte rhs) throws NotPerformed;

  double doDoubleApply(ExtendedThreadContext tc, double lhs, short rhs) throws NotPerformed;

  double doDoubleApply(ExtendedThreadContext tc, double lhs, int rhs) throws NotPerformed;

  double doDoubleApply(ExtendedThreadContext tc, double lhs, long rhs) throws NotPerformed;

  double doDoubleApply(ExtendedThreadContext tc, double lhs, float rhs) throws NotPerformed;

  double doDoubleApply(ExtendedThreadContext tc, double lhs, double rhs) throws NotPerformed;

  double doDoubleApply(ExtendedThreadContext tc, double lhs, BigInteger rhs) throws NotPerformed;

  BigDecimal doBigDecimalApply(ExtendedThreadContext tc, double lhs, BigDecimal rhs) throws NotPerformed;
}
