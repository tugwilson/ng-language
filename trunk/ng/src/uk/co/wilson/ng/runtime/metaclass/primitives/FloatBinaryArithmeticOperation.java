package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.ArithmeticBinaryOperation;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

public interface FloatBinaryArithmeticOperation extends ArithmeticBinaryOperation, FloatBinaryOperation {
  float doFloatApply(ThreadContext tc, float lhs, char rhs) throws NotPerformed;
  float doFloatApply(ThreadContext tc, float lhs, byte rhs) throws NotPerformed;
  float doFloatApply(ThreadContext tc, float lhs, short rhs) throws NotPerformed;
  float doFloatApply(ThreadContext tc, float lhs, int rhs) throws NotPerformed;
  float doFloatApply(ThreadContext tc, float lhs, long rhs) throws NotPerformed;
  float doFloatApply(ThreadContext tc, float lhs, float rhs) throws NotPerformed;
  double doDoubleApply(ThreadContext tc, float lhs, double rhs) throws NotPerformed;
  float doFloatApply(ThreadContext tc, float lhs, BigInteger rhs) throws NotPerformed;
  BigDecimal doBigDecimalApply(ThreadContext tc, float lhs, BigDecimal rhs) throws NotPerformed;
}
