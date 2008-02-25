package uk.co.wilson.ng.runtime.metaclass.primitives.biginteger;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.IntegerBinaryComparison;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 *
 */
public interface BigIntegerIntegerComparison extends IntegerBinaryComparison, BigIntegerBinaryOperation {
  int doIntApply(ExtendedThreadContext tc, BigInteger lhs, char rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, BigInteger lhs, byte rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, BigInteger lhs, short rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, BigInteger lhs, int rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, BigInteger lhs, long rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, BigInteger lhs, float rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, BigInteger lhs, double rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, BigInteger lhs, BigInteger rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, BigInteger lhs, BigDecimal rhs)  throws NotPerformed;
}
