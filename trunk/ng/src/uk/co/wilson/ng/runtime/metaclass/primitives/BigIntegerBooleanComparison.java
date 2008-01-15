package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

public interface BigIntegerBooleanComparison  extends BooleanBinaryComparison, BigIntegerBinaryOperation {
  boolean doApplyBoolean(ThreadContext tc, BigInteger lhs, char rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, BigInteger lhs, byte rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, BigInteger lhs, short rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, BigInteger lhs, int rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, BigInteger lhs, long rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, BigInteger lhs, float rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, BigInteger lhs, double rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, BigInteger lhs, BigInteger rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, BigInteger lhs, BigDecimal rhs)  throws NotPerformed;
}
