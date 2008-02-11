package uk.co.wilson.ng.runtime.metaclass.primitives.intimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

public interface IntBooleanComparison extends BooleanBinaryComparison, IntBinaryOperation {
  boolean doApplyBoolean(ThreadContext tc, int lhs, char rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, int lhs, byte rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, int lhs, short rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, int lhs, int rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, int lhs, long rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, int lhs, float rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, int lhs, double rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, int lhs, BigInteger rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, int lhs, BigDecimal rhs)  throws NotPerformed;
}
