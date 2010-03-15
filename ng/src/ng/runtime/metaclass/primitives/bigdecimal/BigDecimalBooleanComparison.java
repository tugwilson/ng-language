package ng.runtime.metaclass.primitives.bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

public interface BigDecimalBooleanComparison extends BooleanBinaryComparison, BigDecimalBinaryOperation {
  boolean doApplyBoolean(ExtendedThreadContext tc, BigDecimal lhs, char rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, BigDecimal lhs, byte rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, BigDecimal lhs, short rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, BigDecimal lhs, int rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, BigDecimal lhs, long rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, BigDecimal lhs, float rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, BigDecimal lhs, double rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, BigDecimal lhs, BigInteger rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, BigDecimal lhs, BigDecimal rhs) throws NotPerformed;
}
