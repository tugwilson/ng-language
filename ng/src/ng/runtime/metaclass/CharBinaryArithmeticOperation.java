package ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

public interface CharBinaryArithmeticOperation extends BinaryOperation, CharBinaryOperation {
  int doIntApply(ExtendedThreadContext tc, char lhs, char rhs) throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, char lhs, byte rhs) throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, char lhs, short rhs) throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, char lhs, int rhs) throws NotPerformed;
  long doLongApply(ExtendedThreadContext tc, char lhs, long rhs) throws NotPerformed;
  float doFloatApply(ExtendedThreadContext tc, char lhs, float rhs) throws NotPerformed;
  double doDoubleApply(ExtendedThreadContext tc, char lhs, double rhs) throws NotPerformed;
  BigInteger doBigIntegerApply(ExtendedThreadContext tc, char lhs, BigInteger rhs) throws NotPerformed;
  BigDecimal doBigDecimalApply(ExtendedThreadContext tc, char lhs, BigDecimal rhs) throws NotPerformed;
}
