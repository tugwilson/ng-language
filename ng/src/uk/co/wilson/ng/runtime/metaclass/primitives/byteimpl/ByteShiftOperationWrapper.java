package uk.co.wilson.ng.runtime.metaclass.primitives.byteimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.ByteShiftOperation;
import ng.runtime.metaclass.ShiftOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.primitives.ArithmeticOperationWrapper;

/**
 * @author John
 *
 */
public class ByteShiftOperationWrapper extends ArithmeticOperationWrapper implements ByteShiftOperation {

  /**
   * @param delegate
   */
  public ByteShiftOperationWrapper(final ShiftOperation delegate) {
    super(delegate);
  }

  public Object doApply(ExtendedThreadContext tc, byte lhs, BigDecimal rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, byte lhs, BigInteger rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, byte lhs, byte rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, byte lhs, char rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, byte lhs, double rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, byte lhs, float rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, byte lhs, int rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, byte lhs, long rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, byte lhs, short rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public int doIntApply(ExtendedThreadContext tc, byte lhs, BigInteger rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(ExtendedThreadContext tc, byte lhs, byte rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(ExtendedThreadContext tc, byte lhs, char rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(ExtendedThreadContext tc, byte lhs, int rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(ExtendedThreadContext tc, byte lhs, short rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(ExtendedThreadContext tc, byte lhs, long rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }
}
