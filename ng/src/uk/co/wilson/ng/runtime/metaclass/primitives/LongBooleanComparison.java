package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

public interface LongBooleanComparison extends BooleanBinaryComparison, LongBinaryOperation {
  boolean doApplyBoolean(ThreadContext tc, long lhs, char rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, long lhs, byte rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, long lhs, short rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, long lhs, int rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, long lhs, long rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, long lhs, float rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, long lhs, double rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, long lhs, BigInteger rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, long lhs, BigDecimal rhs)  throws NotPerformed;
}
