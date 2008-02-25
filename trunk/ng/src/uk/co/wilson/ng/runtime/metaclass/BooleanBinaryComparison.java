package uk.co.wilson.ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;



public interface BooleanBinaryComparison extends ArithmeticBinaryOperation {
  boolean doApplyBoolean(ExtendedThreadContext tc, Object lhs, Object rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, Object lhs, MetaClass rhsMetaClass, Object rhs)  throws NotPerformed;
  boolean doReverseApplyBoolean(ExtendedThreadContext tc, Object lhs, Object rhs)  throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, Object lhs, char rhs) throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, Object lhs, byte rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, Object lhs, short rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, Object lhs, int rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, Object lhs, long rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, Object lhs, float rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, Object lhs, double rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, Object lhs, BigInteger rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, Object lhs, BigDecimal rhs)  throws NotPerformed;

  boolean doApplyBoolean(ExtendedThreadContext tc, char lhs, Object rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, byte lhs, Object rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, short lhs, Object rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, int lhs, Object rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, long lhs, Object rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, float lhs, Object rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, double lhs, Object rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, BigInteger lhs, Object rhs)  throws NotPerformed;
  boolean doApplyBoolean(ExtendedThreadContext tc, BigDecimal lhs, Object rhs)  throws NotPerformed;
}
