package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

public interface CharBooleanComparison extends BooleanBinaryComparison, CharBinaryOperation {
  boolean doApplyBoolean(ThreadContext tc, char lhs, char rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, char lhs, byte rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, char lhs, short rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, char lhs, int rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, char lhs, long rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, char lhs, float rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, char lhs, double rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, char lhs, BigInteger rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, char lhs, BigDecimal rhs)  throws NotPerformed;
}
