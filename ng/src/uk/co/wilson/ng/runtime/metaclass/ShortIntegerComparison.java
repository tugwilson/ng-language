package uk.co.wilson.ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.IntegerBinaryComparison;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 *
 */
public interface ShortIntegerComparison extends IntegerBinaryComparison, ShortBinaryOperation {
  int doIntApply(ExtendedThreadContext tc, short lhs, char rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, short lhs, byte rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, short lhs, short rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, short lhs, int rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, short lhs, long rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, short lhs, float rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, short lhs, double rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, short lhs, BigInteger rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, short lhs, BigDecimal rhs)  throws NotPerformed;
}