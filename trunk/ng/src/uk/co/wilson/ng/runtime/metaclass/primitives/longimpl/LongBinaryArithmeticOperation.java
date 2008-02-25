package uk.co.wilson.ng.runtime.metaclass.primitives.longimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.ArithmeticBinaryOperation;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;

public interface LongBinaryArithmeticOperation extends ArithmeticBinaryOperation, LongBinaryOperation {
  long doLongApply(ExtendedThreadContext tc, long lhs, char rhs) throws NotPerformed;
  long doLongApply(ExtendedThreadContext tc, long lhs, byte rhs) throws NotPerformed;
  long doLongApply(ExtendedThreadContext tc, long lhs, short rhs) throws NotPerformed;
  long doLongApply(ExtendedThreadContext tc, long lhs, int rhs) throws NotPerformed;
  long doLongApply(ExtendedThreadContext tc, long lhs, long rhs) throws NotPerformed;
  float doFloatApply(ExtendedThreadContext tc, long lhs, float rhs) throws NotPerformed;
  double doDoubleApply(ExtendedThreadContext tc, long lhs, double rhs) throws NotPerformed;
  BigInteger doBigIntegerApply(ExtendedThreadContext tc, long lhs, BigInteger rhs) throws NotPerformed;
  BigDecimal doBigDecimalApply(ExtendedThreadContext tc, long lhs, BigDecimal rhs) throws NotPerformed;
}
