package ng.runtime.metaclass.primitives.charimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

public interface CharBooleanComparison extends BooleanBinaryComparison, CharBinaryOperation {
  boolean doApplyBoolean(ExtendedThreadContext tc, char lhs, char rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, char lhs, byte rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, char lhs, short rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, char lhs, int rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, char lhs, long rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, char lhs, float rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, char lhs, double rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, char lhs, BigInteger rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, char lhs, BigDecimal rhs) throws NotPerformed;
}
