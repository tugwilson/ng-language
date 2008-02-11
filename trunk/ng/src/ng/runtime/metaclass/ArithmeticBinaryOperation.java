package ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.ThreadContext;

public interface ArithmeticBinaryOperation {
  Object doApply(ThreadContext tc, Object lhs, Object rhs);
  Object doApply(ThreadContext tc, Object lhs, MetaClass rhsMetaClass, Object rhs);
  Object doReverseApply(ThreadContext tc, Object lhs, Object rhs);

  Object doApply(ThreadContext tc, Object lhs, char rhs);
  Object doApply(ThreadContext tc, Object lhs, byte rhs);
  Object doApply(ThreadContext tc, Object lhs, short rhs);
  Object doApply(ThreadContext tc, Object lhs, int rhs);
  Object doApply(ThreadContext tc, Object lhs, long rhs);
  Object doApply(ThreadContext tc, Object lhs, float rhs);
  Object doApply(ThreadContext tc, Object lhs, double rhs);
  Object doApply(ThreadContext tc, Object lhs, BigInteger rhs);
  Object doApply(ThreadContext tc, Object lhs, BigDecimal rhs);

  Object doApply(ThreadContext tc, char lhs, Object rhs);
  Object doApply(ThreadContext tc, byte lhs, Object rhs);
  Object doApply(ThreadContext tc, short lhs, Object rhs);
  Object doApply(ThreadContext tc, int lhs, Object rhs);
  Object doApply(ThreadContext tc, long lhs, Object rhs);
  Object doApply(ThreadContext tc, float lhs, Object rhs);
  Object doApply(ThreadContext tc, double lhs, Object rhs);
  Object doApply(ThreadContext tc, BigInteger lhs, Object rhs);
  Object doApply(ThreadContext tc, BigDecimal lhs, Object rhs);
}
