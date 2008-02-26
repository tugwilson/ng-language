package ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

public interface FloatBooleanComparison extends BooleanBinaryComparison, FloatBinaryOperation {
  boolean doApplyBoolean(ExtendedThreadContext tc, float lhs, char rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, float lhs, byte rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, float lhs, short rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, float lhs, int rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, float lhs, long rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, float lhs, float rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, float lhs, double rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, float lhs, BigInteger rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, float lhs, BigDecimal rhs)  throws NotPerformed;
}
