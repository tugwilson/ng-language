package uk.co.wilson.ng.runtime.metaclass.primitives.bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.ArithmeticBinaryOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.ArithmeticOperationWrapper;
import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 *
 */
public class BigDecimalBinaryArithmeticOperationWrapper extends ArithmeticOperationWrapper implements BigDecimalBinaryArithmeticOperation {
  public BigDecimalBinaryArithmeticOperationWrapper(final ArithmeticBinaryOperation delegate) {
    super(delegate);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final BigDecimal rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final BigInteger rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final byte rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final char rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final double rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final float rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final int rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final long rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final short rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public BigDecimal doBigDecimalApply(final ExtendedThreadContext tc, final BigDecimal lhs, final BigDecimal rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigDecimal doBigDecimalApply(final ExtendedThreadContext tc, final BigDecimal lhs, final BigInteger rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigDecimal doBigDecimalApply(final ExtendedThreadContext tc, final BigDecimal lhs, final byte rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigDecimal doBigDecimalApply(final ExtendedThreadContext tc, final BigDecimal lhs, final char rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigDecimal doBigDecimalApply(final ExtendedThreadContext tc, final BigDecimal lhs, final double rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigDecimal doBigDecimalApply(final ExtendedThreadContext tc, final BigDecimal lhs, final float rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigDecimal doBigDecimalApply(final ExtendedThreadContext tc, final BigDecimal lhs, final int rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigDecimal doBigDecimalApply(final ExtendedThreadContext tc, final BigDecimal lhs, final long rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigDecimal doBigDecimalApply(final ExtendedThreadContext tc, final BigDecimal lhs, final short rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }
}
