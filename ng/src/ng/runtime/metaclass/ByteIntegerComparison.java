package ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

/**
 * @author John
 *
 */
public interface  ByteIntegerComparison extends IntegerBinaryComparison, ByteBinaryOperation {
  int doIntApply(ExtendedThreadContext tc, byte lhs, char rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, byte lhs, byte rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, byte lhs, short rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, byte lhs, int rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, byte lhs, long rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, byte lhs, float rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, byte lhs, double rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, byte lhs, BigInteger rhs)  throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, byte lhs, BigDecimal rhs)  throws NotPerformed;
}