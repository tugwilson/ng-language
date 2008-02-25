package uk.co.wilson.ng.runtime.metaclass.primitives.intimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.IntegerBinaryComparison;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 *
 */
public interface IntIntegerComparison extends IntegerBinaryComparison, IntBinaryOperation {
  int doIntApply(ExtendedThreadContext tc, int lhs, char rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, int lhs, byte rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, int lhs, short rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, int lhs, int rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, int lhs, long rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, int lhs, float rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, int lhs, double rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, int lhs, BigInteger rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, int lhs, BigDecimal rhs)  throws NotPerformed;
}