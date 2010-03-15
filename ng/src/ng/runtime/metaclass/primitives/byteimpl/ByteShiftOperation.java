package ng.runtime.metaclass.primitives.byteimpl;

import java.math.BigInteger;

import ng.runtime.metaclass.BinaryOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

/**
 * @author John
 * 
 */
public interface ByteShiftOperation extends BinaryOperation, ByteBinaryOperation {
  int doIntApply(ExtendedThreadContext tc, byte lhs, char rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, byte lhs, byte rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, byte lhs, short rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, byte lhs, int rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, byte lhs, long rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, byte lhs, BigInteger rhs) throws NotPerformed;
}
