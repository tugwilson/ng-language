package uk.co.wilson.ng.runtime.metaclass.primitives.doubleimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.NgDouble;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.ArithmeticBinaryOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.ArithmeticOperationWrapper;
import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 *
 */
public class DoubleBinaryArithmeticOperationWrapper extends ArithmeticOperationWrapper implements DoubleBinaryArithmeticOperation {

  /**
   * @param delegate
   */
  public DoubleBinaryArithmeticOperationWrapper(final ArithmeticBinaryOperation delegate) {
    super(delegate);
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final BigDecimal rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final BigInteger rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final byte rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final char rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final double rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final float rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final int rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final long rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final short rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public BigDecimal doBigDecimalApply(final ExtendedThreadContext tc, final double lhs, final BigDecimal rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public double doDoubleApply(final ExtendedThreadContext tc, final double lhs, final BigInteger rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public double doDoubleApply(final ExtendedThreadContext tc, final double lhs, final byte rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public double doDoubleApply(final ExtendedThreadContext tc, final double lhs, final char rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public double doDoubleApply(final ExtendedThreadContext tc, final double lhs, final double rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public double doDoubleApply(final ExtendedThreadContext tc, final double lhs, final float rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public double doDoubleApply(final ExtendedThreadContext tc, final double lhs, final int rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public double doDoubleApply(final ExtendedThreadContext tc, final double lhs, final long rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public double doDoubleApply(final ExtendedThreadContext tc, final double lhs, final short rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }
}
