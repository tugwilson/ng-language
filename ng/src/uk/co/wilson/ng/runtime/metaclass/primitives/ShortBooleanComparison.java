package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

public interface ShortBooleanComparison extends BooleanBinaryComparison, ShortBinaryOperation {
  boolean doApplyBoolean(ThreadContext tc, short lhs, char rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, short lhs, byte rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, short lhs, short rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, short lhs, int rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, short lhs, long rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, short lhs, float rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, short lhs, double rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, short lhs, BigInteger rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, short lhs, BigDecimal rhs)  throws NotPerformed;
}
