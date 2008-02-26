package uk.co.wilson.ng.runtime.metaclass.primitives.charimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.NgChar;
import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.CharBooleanComparison;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.primitives.BooleanBinaryComparisonWrapper;
import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 *
 */
public class CharBooleanComparisonWrapper extends BooleanBinaryComparisonWrapper implements CharBooleanComparison {

  /**
   * @param delegate
   */
  public CharBooleanComparisonWrapper(final BooleanBinaryComparison delegate) {
    super(delegate);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final char lhs, final char rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgChar.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final char lhs, final byte rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgChar.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final char lhs, final short rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgChar.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final char lhs, final int rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgChar.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final char lhs, final long rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgChar.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final char lhs, final float rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgChar.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final char lhs, final double rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgChar.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final char lhs, final BigInteger rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgChar.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final char lhs, final BigDecimal rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgChar.valueOf(lhs), rhs);
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
