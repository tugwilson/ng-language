package uk.co.wilson.ng.runtime.metaclass.primitives.shortimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.ShiftOperation;
import ng.runtime.metaclass.primitives.shortimpl.ShortShiftOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.primitives.ArithmeticOperationWrapper;

/**
 * @author John
 * 
 */
public class ShortShiftOperationWrapper extends ArithmeticOperationWrapper implements ShortShiftOperation {

  /**
   * @param delegate
   */
  public ShortShiftOperationWrapper(final ShiftOperation delegate) {
    super(delegate);
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final BigDecimal rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final BigInteger rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final byte rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final char rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final double rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final float rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final int rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final long rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final short rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final short lhs, final BigInteger rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(final ExtendedThreadContext tc, final short lhs, final byte rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(final ExtendedThreadContext tc, final short lhs, final char rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(final ExtendedThreadContext tc, final short lhs, final int rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(final ExtendedThreadContext tc, final short lhs, final short rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(final ExtendedThreadContext tc, final short lhs, final long rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }
}
