package ng.runtime.metaclass.primitives.shortimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

public interface ShortBooleanComparison extends BooleanBinaryComparison, ShortBinaryOperation {
  boolean doApplyBoolean(ExtendedThreadContext tc, short lhs, char rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, short lhs, byte rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, short lhs, short rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, short lhs, int rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, short lhs, long rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, short lhs, float rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, short lhs, double rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, short lhs, BigInteger rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, short lhs, BigDecimal rhs) throws NotPerformed;
}
