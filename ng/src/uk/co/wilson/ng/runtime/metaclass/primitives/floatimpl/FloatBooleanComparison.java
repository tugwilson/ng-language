package uk.co.wilson.ng.runtime.metaclass.primitives.floatimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

public interface FloatBooleanComparison extends BooleanBinaryComparison, FloatBinaryOperation {
  boolean doApplyBoolean(ThreadContext tc, float lhs, char rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, float lhs, byte rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, float lhs, short rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, float lhs, int rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, float lhs, long rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, float lhs, float rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, float lhs, double rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, float lhs, BigInteger rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, float lhs, BigDecimal rhs)  throws NotPerformed;
}
