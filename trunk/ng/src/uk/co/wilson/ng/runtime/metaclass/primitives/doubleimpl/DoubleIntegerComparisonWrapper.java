package uk.co.wilson.ng.runtime.metaclass.primitives.doubleimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.NgDouble;
import ng.runtime.metaclass.IntegerBinaryComparison;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.primitives.IntegerBinaryComparisonWrapper;

/**
 * @author John
 *
 */
public class DoubleIntegerComparisonWrapper extends IntegerBinaryComparisonWrapper implements DoubleIntegerComparison {

  /**
   * @param delegate
   */
  public DoubleIntegerComparisonWrapper(final IntegerBinaryComparison delegate) {
    super(delegate);
  }

  public int doIntApply(final ExtendedThreadContext tc, final double lhs, final char rhs) throws NotPerformed {
    return doIntApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final double lhs, final byte rhs) throws NotPerformed {
    return doIntApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final double lhs, final short rhs) throws NotPerformed {
    return doIntApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final double lhs, final int rhs) throws NotPerformed {
    return doIntApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final double lhs, final long rhs) throws NotPerformed {
    return doIntApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final double lhs, final float rhs) throws NotPerformed {
    return doIntApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final double lhs, final double rhs) throws NotPerformed {
    return doIntApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final double lhs, final BigInteger rhs) throws NotPerformed {
    return doIntApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final double lhs, final BigDecimal rhs) throws NotPerformed {
    return doIntApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final char rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final byte rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final short rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final int rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final long rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final float rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final double rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final BigInteger rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final BigDecimal rhs) {
    return doApply(tc, NgDouble.valueOf(lhs), rhs);
  }
}
