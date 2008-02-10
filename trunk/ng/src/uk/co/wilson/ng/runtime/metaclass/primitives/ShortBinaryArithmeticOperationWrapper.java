package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.NgShort;
import ng.runtime.metaclass.BinaryArithmeticOperation;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

/**
 * @author John
 *
 */
public class ShortBinaryArithmeticOperationWrapper extends ArithmeticOperationWrapper implements ShortBinaryArithmeticOperation {

  /**
   * @param delegate
   */
  public ShortBinaryArithmeticOperationWrapper(final BinaryArithmeticOperation delegate) {
    super(delegate);
  }

  public Object doApply(final ThreadContext tc, final short lhs, final BigDecimal rhs) {
    return doApply(tc, NgShort.valueOf(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final short lhs, final BigInteger rhs) {
    return doApply(tc, NgShort.valueOf(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final short lhs, final byte rhs) {
    return doApply(tc, NgShort.valueOf(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final short lhs, final char rhs) {
    return doApply(tc, NgShort.valueOf(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final short lhs, final double rhs) {
    return doApply(tc, NgShort.valueOf(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final short lhs, final float rhs) {
    return doApply(tc, NgShort.valueOf(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final short lhs, final int rhs) {
    return doApply(tc, NgShort.valueOf(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final short lhs, final long rhs) {
    return doApply(tc, NgShort.valueOf(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final short lhs, final short rhs) {
    return doApply(tc, NgShort.valueOf(lhs), rhs);
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final short lhs, final BigDecimal rhs) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigInteger doBigIntegerApply(final ThreadContext tc, final short lhs, final BigInteger rhs) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(final ThreadContext tc, final short lhs, final byte rhs) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(final ThreadContext tc, final short lhs, final char rhs) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public double doDoubleApply(final ThreadContext tc, final short lhs, final double rhs) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public float doFloatApply(final ThreadContext tc, final short lhs, final float rhs) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(final ThreadContext tc, final short lhs, final int rhs) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public long doLongApply(final ThreadContext tc, final short lhs, final long rhs) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(final ThreadContext tc, final short lhs, final short rhs) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }
}
