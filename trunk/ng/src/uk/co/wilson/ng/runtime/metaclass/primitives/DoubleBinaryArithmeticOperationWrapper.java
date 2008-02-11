package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.NgDouble;
import ng.runtime.metaclass.ArithmeticBinaryOperation;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

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

  public Object doApply(final ThreadContext tc, final double lhs, final BigDecimal rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final double lhs, final BigInteger rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final double lhs, final byte rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final double lhs, final char rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final double lhs, final double rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final double lhs, final float rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final double lhs, final int rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final double lhs, final long rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final double lhs, final short rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final double lhs, final BigDecimal rhs) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public double doDoubleApply(final ThreadContext tc, final double lhs, final BigInteger rhs) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public double doDoubleApply(final ThreadContext tc, final double lhs, final byte rhs) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public double doDoubleApply(final ThreadContext tc, final double lhs, final char rhs) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public double doDoubleApply(final ThreadContext tc, final double lhs, final double rhs) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public double doDoubleApply(final ThreadContext tc, final double lhs, final float rhs) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public double doDoubleApply(final ThreadContext tc, final double lhs, final int rhs) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public double doDoubleApply(final ThreadContext tc, final double lhs, final long rhs) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public double doDoubleApply(final ThreadContext tc, final double lhs, final short rhs) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }
}
