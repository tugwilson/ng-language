package ng.runtime.metaclass.primitives.intimpl;

import java.math.BigInteger;

import ng.runtime.metaclass.BinaryOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

/**
 * @author John
 *
 */
public interface IntShiftOperation extends BinaryOperation, IntBinaryOperation {
  int doIntApply(ExtendedThreadContext tc, int lhs, char rhs) throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, int lhs, byte rhs) throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, int lhs, short rhs) throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, int lhs, int rhs) throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, int lhs, long rhs) throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, int lhs, BigInteger rhs) throws NotPerformed;
}
