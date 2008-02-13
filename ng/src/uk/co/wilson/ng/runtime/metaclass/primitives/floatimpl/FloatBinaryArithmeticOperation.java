package uk.co.wilson.ng.runtime.metaclass.primitives.floatimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.ArithmeticBinaryOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

public interface FloatBinaryArithmeticOperation extends ArithmeticBinaryOperation, FloatBinaryOperation {
  float doFloatApply(ExtendedThreadContext tc, float lhs, char rhs) throws NotPerformed;
  float doFloatApply(ExtendedThreadContext tc, float lhs, byte rhs) throws NotPerformed;
  float doFloatApply(ExtendedThreadContext tc, float lhs, short rhs) throws NotPerformed;
  float doFloatApply(ExtendedThreadContext tc, float lhs, int rhs) throws NotPerformed;
  float doFloatApply(ExtendedThreadContext tc, float lhs, long rhs) throws NotPerformed;
  float doFloatApply(ExtendedThreadContext tc, float lhs, float rhs) throws NotPerformed;
  double doDoubleApply(ExtendedThreadContext tc, float lhs, double rhs) throws NotPerformed;
  float doFloatApply(ExtendedThreadContext tc, float lhs, BigInteger rhs) throws NotPerformed;
  BigDecimal doBigDecimalApply(ExtendedThreadContext tc, float lhs, BigDecimal rhs) throws NotPerformed;
}
