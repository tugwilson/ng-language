package ng.runtime.metaclass.primitives.shortimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.primitives.intimpl.IntBinaryComparison;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

/**
 * @author John
 *
 */
public interface ShortIntegerComparison extends IntBinaryComparison, ShortBinaryOperation {
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