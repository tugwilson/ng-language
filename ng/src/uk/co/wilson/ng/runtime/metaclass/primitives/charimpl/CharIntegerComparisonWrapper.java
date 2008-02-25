package uk.co.wilson.ng.runtime.metaclass.primitives.charimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.NgChar;
import ng.runtime.metaclass.IntegerBinaryComparison;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.primitives.IntegerBinaryComparisonWrapper;
import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 *
 */
public class CharIntegerComparisonWrapper extends IntegerBinaryComparisonWrapper implements CharIntegerComparison {

  /**
   * @param delegate
   */
  public CharIntegerComparisonWrapper(final IntegerBinaryComparison delegate) {
    super(delegate);
  }

  public int doIntApply(final ExtendedThreadContext tc, final char lhs, final char rhs) throws NotPerformed {
    return doIntApply(tc, NgChar.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final char lhs, final byte rhs) throws NotPerformed {
    return doIntApply(tc, NgChar.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final char lhs, final short rhs) throws NotPerformed {
    return doIntApply(tc, NgChar.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final char lhs, final int rhs) throws NotPerformed {
    return doIntApply(tc, NgChar.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final char lhs, final long rhs) throws NotPerformed {
    return doIntApply(tc, NgChar.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final char lhs, final float rhs) throws NotPerformed {
    return doIntApply(tc, NgChar.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final char lhs, final double rhs) throws NotPerformed {
    return doIntApply(tc, NgChar.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final char lhs, final BigInteger rhs) throws NotPerformed {
    return doIntApply(tc, NgChar.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final char lhs, final BigDecimal rhs) throws NotPerformed {
    return doIntApply(tc, NgChar.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final char rhs) {
    return doApply(tc, NgChar.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final byte rhs) {
    return doApply(tc, NgChar.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final short rhs) {
    return doApply(tc, NgChar.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final int rhs) {
    return doApply(tc, NgChar.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final long rhs) {
    return doApply(tc, NgChar.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final float rhs) {
    return doApply(tc, NgChar.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final double rhs) {
    return doApply(tc, NgChar.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final BigInteger rhs) {
    return doApply(tc, NgChar.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final BigDecimal rhs) {
    return doApply(tc, NgChar.valueOf(lhs), rhs);
  }
}
