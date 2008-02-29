package uk.co.wilson.ng.runtime.metaclass.primitives.biginteger;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BigIntegerShiftOperation;
import ng.runtime.metaclass.ShiftOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.primitives.ArithmeticOperationWrapper;

/**
 * @author John
 *
 */
public class BigIntegerShiftOperationWrapper extends ArithmeticOperationWrapper implements BigIntegerShiftOperation {

  /**
   * @param delegate
   */
  public BigIntegerShiftOperationWrapper(final ShiftOperation delegate) {
    super(delegate);
  }

  public Object doApply(ExtendedThreadContext tc, BigInteger lhs, BigDecimal rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(ExtendedThreadContext tc, BigInteger lhs, BigInteger rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(ExtendedThreadContext tc, BigInteger lhs, byte rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(ExtendedThreadContext tc, BigInteger lhs, char rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(ExtendedThreadContext tc, BigInteger lhs, double rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(ExtendedThreadContext tc, BigInteger lhs, float rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(ExtendedThreadContext tc, BigInteger lhs, int rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(ExtendedThreadContext tc, BigInteger lhs, long rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(ExtendedThreadContext tc, BigInteger lhs, short rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public BigInteger doBigIntegerApply(ExtendedThreadContext tc, BigInteger lhs, BigInteger rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigInteger doBigIntegerApply(ExtendedThreadContext tc, BigInteger lhs, byte rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigInteger doBigIntegerApply(ExtendedThreadContext tc, BigInteger lhs, char rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigInteger doBigIntegerApply(ExtendedThreadContext tc, BigInteger lhs, int rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigInteger doBigIntegerApply(ExtendedThreadContext tc, BigInteger lhs, short rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigInteger doBigIntegerApply(ExtendedThreadContext tc, BigInteger lhs, long rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }
}
