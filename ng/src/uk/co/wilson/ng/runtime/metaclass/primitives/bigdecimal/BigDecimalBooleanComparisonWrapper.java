package uk.co.wilson.ng.runtime.metaclass.primitives.bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.primitives.BooleanBinaryComparisonWrapper;
import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 *
 */
public class BigDecimalBooleanComparisonWrapper extends BooleanBinaryComparisonWrapper implements BigDecimalBooleanComparison {

  /**
   * @param delegate
   */
  public BigDecimalBooleanComparisonWrapper(final BooleanBinaryComparison delegate) {
    super(delegate);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigDecimal lhs, final char rhs) throws NotPerformed {
    return doApplyBoolean(tc, (Object)lhs, rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigDecimal lhs, final byte rhs) throws NotPerformed {
    return doApplyBoolean(tc, (Object)lhs, rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigDecimal lhs, final short rhs) throws NotPerformed {
    return doApplyBoolean(tc, (Object)lhs, rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigDecimal lhs, final int rhs) throws NotPerformed {
    return doApplyBoolean(tc, (Object)lhs, rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigDecimal lhs, final long rhs) throws NotPerformed {
    return doApplyBoolean(tc, (Object)lhs, rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigDecimal lhs, final float rhs) throws NotPerformed {
    return doApplyBoolean(tc, (Object)lhs, rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigDecimal lhs, final double rhs) throws NotPerformed {
    return doApplyBoolean(tc, (Object)lhs, rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigDecimal lhs, final BigInteger rhs) throws NotPerformed {
    return doApplyBoolean(tc, (Object)lhs, rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigDecimal lhs, final BigDecimal rhs) throws NotPerformed {
    return doApplyBoolean(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final char rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final byte rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final short rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final int rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final long rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final float rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final double rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final BigInteger rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final BigDecimal rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }
}
