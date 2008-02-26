package uk.co.wilson.ng.runtime.metaclass.primitives.bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BigDecimalIntegerComparison;
import ng.runtime.metaclass.IntegerBinaryComparison;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.primitives.IntegerBinaryComparisonWrapper;

/**
 * @author John
 *
 */
public class BigDecimalIntegerComparisonWrapper extends IntegerBinaryComparisonWrapper implements BigDecimalIntegerComparison {

  /**
   * @param delegate
   */
  public BigDecimalIntegerComparisonWrapper(final IntegerBinaryComparison delegate) {
    super(delegate);
  }

  public int doIntApply(final ExtendedThreadContext tc, final BigDecimal lhs, final char rhs) throws NotPerformed {
    return doIntApply(tc, (Object)lhs, rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final BigDecimal lhs, final byte rhs) throws NotPerformed {
    return doIntApply(tc, (Object)lhs, rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final BigDecimal lhs, final short rhs) throws NotPerformed {
    return doIntApply(tc, (Object)lhs, rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final BigDecimal lhs, final int rhs) throws NotPerformed {
    return doIntApply(tc, (Object)lhs, rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final BigDecimal lhs, final long rhs) throws NotPerformed {
    return doIntApply(tc, (Object)lhs, rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final BigDecimal lhs, final float rhs) throws NotPerformed {
    return doIntApply(tc, (Object)lhs, rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final BigDecimal lhs, final double rhs) throws NotPerformed {
    return doIntApply(tc, (Object)lhs, rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final BigDecimal lhs, final BigInteger rhs) throws NotPerformed {
    return doIntApply(tc, (Object)lhs, rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final BigDecimal lhs, final BigDecimal rhs) throws NotPerformed {
    return doIntApply(tc, (Object)lhs, rhs);
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
