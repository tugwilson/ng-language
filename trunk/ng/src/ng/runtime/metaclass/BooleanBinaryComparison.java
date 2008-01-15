package ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

public interface BooleanBinaryComparison extends BinaryArithmeticOperation {
  boolean doApplyBoolean(ThreadContext tc, Object lhs, Object rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, Object lhs, MetaClass rhsMetaClass, Object rhs)  throws NotPerformed;
  boolean doReverseApplyBoolean(ThreadContext tc, Object lhs, Object rhs)  throws NotPerformed;

  boolean doApplyBoolean(ThreadContext tc, Object lhs, char rhs) throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, Object lhs, byte rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, Object lhs, short rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, Object lhs, int rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, Object lhs, long rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, Object lhs, float rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, Object lhs, double rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, Object lhs, BigInteger rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, Object lhs, BigDecimal rhs)  throws NotPerformed;

  boolean doApplyBoolean(ThreadContext tc, char lhs, Object rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, byte lhs, Object rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, short lhs, Object rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, int lhs, Object rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, long lhs, Object rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, float lhs, Object rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, double lhs, Object rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, BigInteger lhs, Object rhs)  throws NotPerformed;
  boolean doApplyBoolean(ThreadContext tc, BigDecimal lhs, Object rhs)  throws NotPerformed;
}
