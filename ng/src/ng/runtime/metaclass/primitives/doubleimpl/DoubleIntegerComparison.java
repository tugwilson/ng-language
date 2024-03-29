package ng.runtime.metaclass.primitives.doubleimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.primitives.intimpl.IntBinaryComparison;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

/**
 * @author John
 * 
 */
public interface DoubleIntegerComparison extends IntBinaryComparison, DoubleBinaryOperation {
  int doIntApply(ExtendedThreadContext tc, double lhs, char rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, double lhs, byte rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, double lhs, short rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, double lhs, int rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, double lhs, long rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, double lhs, float rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, double lhs, double rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, double lhs, BigInteger rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, double lhs, BigDecimal rhs) throws NotPerformed;
}