package ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

/**
 * @author John
 *
 */
public interface FloatIntegerComparison extends IntBinaryComparison, FloatBinaryOperation {
  int doIntApply(ExtendedThreadContext tc, float lhs, char rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, float lhs, byte rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, float lhs, short rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, float lhs, int rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, float lhs, long rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, float lhs, float rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, float lhs, double rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, float lhs, BigInteger rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, float lhs, BigDecimal rhs)  throws NotPerformed;
}