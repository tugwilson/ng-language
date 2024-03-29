package ng.runtime.metaclass.primitives.longimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

public interface LongBooleanComparison extends BooleanBinaryComparison, LongBinaryOperation {
  boolean doApplyBoolean(ExtendedThreadContext tc, long lhs, char rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, long lhs, byte rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, long lhs, short rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, long lhs, int rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, long lhs, long rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, long lhs, float rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, long lhs, double rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, long lhs, BigInteger rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, long lhs, BigDecimal rhs) throws NotPerformed;
}
