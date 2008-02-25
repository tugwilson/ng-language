package uk.co.wilson.ng.runtime.metaclass.primitives.byteimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.ArithmeticBinaryOperation;
import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;

public interface ByteBinaryArithmeticOperation extends ArithmeticBinaryOperation, ByteBinaryOperation {
  int doIntApply(ExtendedThreadContext tc, byte lhs, char rhs) throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, byte lhs, byte rhs) throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, byte lhs, short rhs) throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, byte lhs, int rhs) throws NotPerformed;
  long doLongApply(ExtendedThreadContext tc, byte lhs, long rhs) throws NotPerformed;
  float doFloatApply(ExtendedThreadContext tc, byte lhs, float rhs) throws NotPerformed;
  double doDoubleApply(ExtendedThreadContext tc, byte lhs, double rhs) throws NotPerformed;
  BigInteger doBigIntegerApply(ExtendedThreadContext tc, byte lhs, BigInteger rhs) throws NotPerformed;
  BigDecimal doBigDecimalApply(ExtendedThreadContext tc, byte lhs, BigDecimal rhs) throws NotPerformed;
}
