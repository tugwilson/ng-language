package ng.runtime.metaclass.primitives.biginteger;

import java.math.BigInteger;

import ng.runtime.metaclass.LogicalBinaryOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

/**
 * @author John
 * 
 */
public interface BigIntegerBinaryLogicalOperation extends LogicalBinaryOperation, BigIntegerBinaryOperation {
  BigInteger doBigIntegerApply(ExtendedThreadContext tc, BigInteger lhs, char rhs) throws NotPerformed;

  BigInteger doBigIntegerApply(ExtendedThreadContext tc, BigInteger lhs, byte rhs) throws NotPerformed;

  BigInteger doBigIntegerApply(ExtendedThreadContext tc, BigInteger lhs, short rhs) throws NotPerformed;

  BigInteger doBigIntegerApply(ExtendedThreadContext tc, BigInteger lhs, int rhs) throws NotPerformed;

  BigInteger doBigIntegerApply(ExtendedThreadContext tc, BigInteger lhs, long rhs) throws NotPerformed;

  BigInteger doBigIntegerApply(ExtendedThreadContext tc, BigInteger lhs, BigInteger rhs) throws NotPerformed;
}