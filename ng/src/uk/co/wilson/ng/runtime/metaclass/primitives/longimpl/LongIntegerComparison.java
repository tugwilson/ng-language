package uk.co.wilson.ng.runtime.metaclass.primitives.longimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.IntegerBinaryComparison;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

/**
 * @author John
 *
 */
public interface LongIntegerComparison extends IntegerBinaryComparison, LongBinaryOperation {
  int doIntApply(ExtendedThreadContext tc, long lhs, char rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, long lhs, byte rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, long lhs, short rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, long lhs, int rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, long lhs, long rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, long lhs, float rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, long lhs, double rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, long lhs, BigInteger rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, long lhs, BigDecimal rhs)  throws NotPerformed;
}