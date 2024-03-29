package ng.runtime.metaclass.primitives.biginteger;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

public interface BigIntegerBooleanComparison extends BooleanBinaryComparison, BigIntegerBinaryOperation {
  boolean doApplyBoolean(ExtendedThreadContext tc, BigInteger lhs, char rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, BigInteger lhs, byte rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, BigInteger lhs, short rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, BigInteger lhs, int rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, BigInteger lhs, long rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, BigInteger lhs, float rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, BigInteger lhs, double rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, BigInteger lhs, BigInteger rhs) throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, BigInteger lhs, BigDecimal rhs) throws NotPerformed;
}
