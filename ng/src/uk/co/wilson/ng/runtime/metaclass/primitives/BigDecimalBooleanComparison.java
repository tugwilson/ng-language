package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

public interface BigDecimalBooleanComparison extends BooleanBinaryComparison, BigDecimalBinaryOperation {
  boolean doApplyBoolean(ThreadContext tc, BigDecimal lhs, char rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, BigDecimal lhs, byte rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, BigDecimal lhs, short rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, BigDecimal lhs, int rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, BigDecimal lhs, long rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, BigDecimal lhs, float rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, BigDecimal lhs, double rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, BigDecimal lhs, BigInteger rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, BigDecimal lhs, BigDecimal rhs)  throws NotPerformed;
}
