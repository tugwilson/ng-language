package uk.co.wilson.ng.runtime.metaclass.primitives.charimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.ShiftOperation;
import ng.runtime.metaclass.primitives.charimpl.CharShiftOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.primitives.ArithmeticOperationWrapper;

/**
 * @author John
 *
 */
public class CharShiftOperationWrapper extends ArithmeticOperationWrapper implements CharShiftOperation {

  /**
   * @param delegate
   */
  public CharShiftOperationWrapper(final ShiftOperation delegate) {
    super(delegate);
  }

  public Object doApply(ExtendedThreadContext tc, char lhs, BigDecimal rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, char lhs, BigInteger rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, char lhs, byte rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, char lhs, char rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, char lhs, double rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, char lhs, float rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, char lhs, int rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, char lhs, long rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, char lhs, short rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public int doIntApply(ExtendedThreadContext tc, char lhs, BigInteger rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(ExtendedThreadContext tc, char lhs, byte rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(ExtendedThreadContext tc, char lhs, char rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(ExtendedThreadContext tc, char lhs, int rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(ExtendedThreadContext tc, char lhs, short rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(ExtendedThreadContext tc, char lhs, long rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }
}
