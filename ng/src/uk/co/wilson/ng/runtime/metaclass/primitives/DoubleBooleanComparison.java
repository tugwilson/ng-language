package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

public interface DoubleBooleanComparison extends BooleanBinaryComparison, DoubleBinaryOperation {
  boolean doApplyBoolean(ThreadContext tc, double lhs, char rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, double lhs, byte rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, double lhs, short rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, double lhs, int rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, double lhs, long rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, double lhs, float rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, double lhs, double rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, double lhs, BigInteger rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, double lhs, BigDecimal rhs)  throws NotPerformed;
}
