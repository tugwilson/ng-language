package ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

public interface IntBooleanComparison extends BooleanBinaryComparison, IntBinaryOperation {
  boolean doApplyBoolean(ExtendedThreadContext tc, int lhs, char rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, int lhs, byte rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, int lhs, short rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, int lhs, int rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, int lhs, long rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, int lhs, float rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, int lhs, double rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, int lhs, BigInteger rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, int lhs, BigDecimal rhs)  throws NotPerformed;
}
