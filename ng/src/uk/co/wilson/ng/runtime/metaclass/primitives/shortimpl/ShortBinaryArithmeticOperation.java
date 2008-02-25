package uk.co.wilson.ng.runtime.metaclass.primitives.shortimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.ArithmeticBinaryOperation;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;


public interface ShortBinaryArithmeticOperation extends ArithmeticBinaryOperation, ShortBinaryOperation {
  int doIntApply(ExtendedThreadContext tc, short lhs, char rhs) throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, short lhs, byte rhs) throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, short lhs, short rhs) throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, short lhs, int rhs) throws NotPerformed;
  long doLongApply(ExtendedThreadContext tc, short lhs, long rhs) throws NotPerformed;
  float doFloatApply(ExtendedThreadContext tc, short lhs, float rhs) throws NotPerformed;
  double doDoubleApply(ExtendedThreadContext tc, short lhs, double rhs) throws NotPerformed;
  BigInteger doBigIntegerApply(ExtendedThreadContext tc, short lhs, BigInteger rhs) throws NotPerformed;
  BigDecimal doBigDecimalApply(ExtendedThreadContext tc, short lhs, BigDecimal rhs) throws NotPerformed;
}
