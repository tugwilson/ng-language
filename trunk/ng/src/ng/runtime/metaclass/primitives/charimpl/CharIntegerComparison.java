package ng.runtime.metaclass.primitives.charimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.primitives.intimpl.IntBinaryComparison;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

/**
 * @author John
 * 
 */
public interface CharIntegerComparison extends IntBinaryComparison, CharBinaryOperation {
  int doIntApply(ExtendedThreadContext tc, char lhs, char rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, char lhs, byte rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, char lhs, short rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, char lhs, int rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, char lhs, long rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, char lhs, float rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, char lhs, double rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, char lhs, BigInteger rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, char lhs, BigDecimal rhs) throws NotPerformed;
}