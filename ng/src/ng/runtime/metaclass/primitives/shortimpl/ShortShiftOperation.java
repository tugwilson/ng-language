package ng.runtime.metaclass.primitives.shortimpl;

import java.math.BigInteger;

import ng.runtime.metaclass.BinaryOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

/**
 * @author John
 *
 */
public interface ShortShiftOperation  extends BinaryOperation, ShortBinaryOperation {
  int doIntApply(ExtendedThreadContext tc, short lhs, char rhs) throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, short lhs, byte rhs) throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, short lhs, short rhs) throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, short lhs, int rhs) throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, short lhs, long rhs) throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, short lhs, BigInteger rhs) throws NotPerformed;
}
