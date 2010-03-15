package ng.runtime.metaclass.primitives.longimpl;

import java.math.BigInteger;

import ng.runtime.metaclass.BinaryOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

/**
 * @author John
 * 
 */
public interface LongShiftOperation extends BinaryOperation, LongBinaryOperation {
  long doLongApply(ExtendedThreadContext tc, long lhs, char rhs) throws NotPerformed;

  long doLongApply(ExtendedThreadContext tc, long lhs, byte rhs) throws NotPerformed;

  long doLongApply(ExtendedThreadContext tc, long lhs, short rhs) throws NotPerformed;

  long doLongApply(ExtendedThreadContext tc, long lhs, int rhs) throws NotPerformed;

  long doLongApply(ExtendedThreadContext tc, long lhs, long rhs) throws NotPerformed;

  long doLongApply(ExtendedThreadContext tc, long lhs, BigInteger rhs) throws NotPerformed;
}
