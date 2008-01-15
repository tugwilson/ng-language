package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

public interface ByteBooleanComparison extends BooleanBinaryComparison, ByteBinaryOperation {
  boolean doApplyBoolean(ThreadContext tc, byte lhs, char rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, byte lhs, byte rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, byte lhs, short rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, byte lhs, int rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, byte lhs, long rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, byte lhs, float rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, byte lhs, double rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, byte lhs, BigInteger rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, byte lhs, BigDecimal rhs)  throws NotPerformed;
}
