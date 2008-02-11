package uk.co.wilson.ng.runtime.metaclass.primitives.bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.ArithmeticBinaryOperation;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

public interface BigDecimalBinaryArithmeticOperation extends ArithmeticBinaryOperation, BigDecimalBinaryOperation {
  BigDecimal doBigDecimalApply(ThreadContext tc, BigDecimal lhs, char rhs) throws NotPerformed;
  BigDecimal doBigDecimalApply(ThreadContext tc, BigDecimal lhs, byte rhs) throws NotPerformed;
  BigDecimal doBigDecimalApply(ThreadContext tc, BigDecimal lhs, short rhs) throws NotPerformed;
  BigDecimal doBigDecimalApply(ThreadContext tc, BigDecimal lhs, int rhs) throws NotPerformed;
  BigDecimal doBigDecimalApply(ThreadContext tc, BigDecimal lhs, long rhs) throws NotPerformed;
  BigDecimal doBigDecimalApply(ThreadContext tc, BigDecimal lhs, float rhs) throws NotPerformed;
  BigDecimal doBigDecimalApply(ThreadContext tc, BigDecimal lhs, double rhs) throws NotPerformed;
  BigDecimal doBigDecimalApply(ThreadContext tc, BigDecimal lhs, BigInteger rhs) throws NotPerformed;
  BigDecimal doBigDecimalApply(ThreadContext tc, BigDecimal lhs, BigDecimal rhs) throws NotPerformed;
}
