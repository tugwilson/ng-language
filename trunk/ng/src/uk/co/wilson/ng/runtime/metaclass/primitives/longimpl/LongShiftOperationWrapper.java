package uk.co.wilson.ng.runtime.metaclass.primitives.longimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.LongShiftOperation;
import ng.runtime.metaclass.ShiftOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.primitives.ArithmeticOperationWrapper;

/**
 * @author John
 *
 */
public class LongShiftOperationWrapper extends ArithmeticOperationWrapper implements LongShiftOperation {

  /**
   * @param delegate
   */
  public LongShiftOperationWrapper(final ShiftOperation delegate) {
    super(delegate);
  }

  public Object doApply(ExtendedThreadContext tc, long lhs, BigDecimal rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, long lhs, BigInteger rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, long lhs, byte rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, long lhs, char rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, long lhs, double rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, long lhs, float rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, long lhs, int rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, long lhs, long rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, long lhs, short rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public long doLongApply(ExtendedThreadContext tc, long lhs, BigInteger rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public long doLongApply(ExtendedThreadContext tc, long lhs, byte rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public long doLongApply(ExtendedThreadContext tc, long lhs, char rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public long doLongApply(ExtendedThreadContext tc, long lhs, int rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public long doLongApply(ExtendedThreadContext tc, long lhs, short rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public long doLongApply(ExtendedThreadContext tc, long lhs, long rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }
}
