package uk.co.wilson.ng.runtime.metaclass.primitives.biginteger;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ExtendedThreadContext;
import uk.co.wilson.ng.runtime.metaclass.primitives.BooleanBinaryComparisonWrapper;

/**
 * @author John
 *
 */
public class BigIntegerBooleanComparisonWrapper extends BooleanBinaryComparisonWrapper implements BigIntegerBooleanComparison {

  /**
   * @param delegate
   */
  public BigIntegerBooleanComparisonWrapper(final BooleanBinaryComparison delegate) {
    super(delegate);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigInteger lhs, final char rhs) throws NotPerformed {
    return doApplyBoolean(tc, (Object)lhs, rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigInteger lhs, final byte rhs) throws NotPerformed {
    return doApplyBoolean(tc, (Object)lhs, rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigInteger lhs, final short rhs) throws NotPerformed {
    return doApplyBoolean(tc, (Object)lhs, rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigInteger lhs, final int rhs) throws NotPerformed {
    return doApplyBoolean(tc, (Object)lhs, rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigInteger lhs, final long rhs) throws NotPerformed {
    return doApplyBoolean(tc, (Object)lhs, rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigInteger lhs, final float rhs) throws NotPerformed {
    return doApplyBoolean(tc, (Object)lhs, rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigInteger lhs, final double rhs) throws NotPerformed {
    return doApplyBoolean(tc, (Object)lhs, rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigInteger lhs, final BigInteger rhs) throws NotPerformed {
    return doApplyBoolean(tc, (Object)lhs, rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigInteger lhs, final BigDecimal rhs) throws NotPerformed {
    return doApplyBoolean(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final char rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final byte rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final short rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final int rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final long rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final float rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final double rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final BigInteger rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final BigDecimal rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }
}
