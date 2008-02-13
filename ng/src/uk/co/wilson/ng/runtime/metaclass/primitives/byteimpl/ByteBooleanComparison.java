package uk.co.wilson.ng.runtime.metaclass.primitives.byteimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

public interface ByteBooleanComparison extends BooleanBinaryComparison, ByteBinaryOperation {
  boolean doApplyBoolean(ExtendedThreadContext tc, byte lhs, char rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, byte lhs, byte rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, byte lhs, short rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, byte lhs, int rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, byte lhs, long rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, byte lhs, float rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, byte lhs, double rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, byte lhs, BigInteger rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, byte lhs, BigDecimal rhs)  throws NotPerformed;
}
