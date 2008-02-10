package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BinaryArithmeticOperation;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

/**
 * @author John
 *
 */
public class BigDecimalBinaryArithmeticOperationWrapper extends ArithmeticOperationWrapper implements BigDecimalBinaryArithmeticOperation {
  public BigDecimalBinaryArithmeticOperationWrapper(final BinaryArithmeticOperation delegate) {
    super(delegate);
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final BigDecimal rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final BigInteger rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final byte rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final char rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final double rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final float rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final int rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final long rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final short rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final BigDecimal lhs, final BigDecimal rhs) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final BigDecimal lhs, final BigInteger rhs) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final BigDecimal lhs, final byte rhs) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final BigDecimal lhs, final char rhs) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final BigDecimal lhs, final double rhs) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final BigDecimal lhs, final float rhs) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final BigDecimal lhs, final int rhs) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final BigDecimal lhs, final long rhs) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final BigDecimal lhs, final short rhs) throws NotPerformed {
    throw ThreadContext.NOT_PERFORMED_EXCEPTION;
  }
}
