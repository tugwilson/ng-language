package uk.co.wilson.ng.runtime.metaclass.primitives.shortimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.LogicalBinaryOperation;
import ng.runtime.metaclass.ShortBinaryLogicalOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.primitives.ArithmeticOperationWrapper;

/**
 * @author John
 *
 */
public class ShortBinaryLogicalOperationWrapper extends ArithmeticOperationWrapper implements ShortBinaryLogicalOperation {

  /**
   * @param delegate
   */
  public ShortBinaryLogicalOperationWrapper(final LogicalBinaryOperation delegate) {
    super(delegate);
  }

  public Object doApply(ExtendedThreadContext tc, short lhs, BigDecimal rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, short lhs, BigInteger rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, short lhs, byte rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, short lhs, char rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, short lhs, double rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, short lhs, float rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, short lhs, int rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, short lhs, long rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(ExtendedThreadContext tc, short lhs, short rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public BigInteger doBigIntegerApply(ExtendedThreadContext tc, short lhs, BigInteger rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(ExtendedThreadContext tc, short lhs, byte rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(ExtendedThreadContext tc, short lhs, char rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(ExtendedThreadContext tc, short lhs, int rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(ExtendedThreadContext tc, short lhs, short rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public long doLongApply(ExtendedThreadContext tc, short lhs, long rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }
}
