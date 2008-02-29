package uk.co.wilson.ng.runtime.metaclass.primitives.intimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.IntShiftOperation;
import ng.runtime.metaclass.ShiftOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.primitives.ArithmeticOperationWrapper;

/**
 * @author John
 *
 */
public class IntShiftOperationWrapper extends ArithmeticOperationWrapper implements IntShiftOperation {

  /**
   * @param delegate
   */
  public IntShiftOperationWrapper(final ShiftOperation delegate) {
    super(delegate);
  }

  public Object doApply(ExtendedThreadContext tc, int lhs, BigDecimal rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, int lhs, BigInteger rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, int lhs, byte rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, int lhs, char rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, int lhs, double rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, int lhs, float rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, int lhs, int rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, int lhs, long rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, int lhs, short rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public int doIntApply(ExtendedThreadContext tc, int lhs, BigInteger rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(ExtendedThreadContext tc, int lhs, byte rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(ExtendedThreadContext tc, int lhs, char rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(ExtendedThreadContext tc, int lhs, int rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(ExtendedThreadContext tc, int lhs, short rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(ExtendedThreadContext tc, int lhs, long rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }
}
