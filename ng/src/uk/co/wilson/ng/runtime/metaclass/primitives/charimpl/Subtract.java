package uk.co.wilson.ng.runtime.metaclass.primitives.charimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;
import uk.co.wilson.ng.runtime.metaclass.primitives.CharBinaryArithmeticOperation;

/**
 * @author John
 *
 */
public class Subtract extends BaseBinaryOperation implements CharBinaryArithmeticOperation {
  public Object doApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.subtract().apply(tc.unwrapToChar(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.subtract().apply(tc.unwrapToChar(lhs), rhsMetaClass, rhs);
  }

  public Object doReverseApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.subtract().apply(lhs, tc.unwrapToChar(rhs));
  }

  public Object doApply(final ThreadContext tc, final char lhs, final Object rhs) {
    return tc.subtract().apply(lhs, tc.unwrapToChar(rhs));
  }

  public Object doApply(final ThreadContext tc, final byte lhs, final Object rhs) {
    return tc.subtract().apply(lhs, tc.unwrapToChar(rhs));
  }

  public Object doApply(final ThreadContext tc, final short lhs, final Object rhs) {
    return tc.subtract().apply(lhs, tc.unwrapToChar(rhs));
  }

  public Object doApply(final ThreadContext tc, final int lhs, final Object rhs) {
    return tc.subtract().apply(lhs, tc.unwrapToChar(rhs));
  }

  public Object doApply(final ThreadContext tc, final long lhs, final Object rhs) {
    return tc.subtract().apply(lhs, tc.unwrapToChar(rhs));
  }

  public Object doApply(final ThreadContext tc, final float lhs, final Object rhs) {
    return tc.subtract().apply(lhs, tc.unwrapToChar(rhs));
  }

  public Object doApply(final ThreadContext tc, final double lhs, final Object rhs) {
    return tc.subtract().apply(lhs, tc.unwrapToChar(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final Object rhs) {
    return tc.subtract().apply(lhs, tc.unwrapToChar(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return tc.subtract().apply(lhs, tc.unwrapToChar(rhs));
  }

  public Object doApply(final ThreadContext tc, final char lhs, final char rhs) {
    return tc.wrap(lhs - rhs);
  }

  public Object doApply(final ThreadContext tc, final char lhs, final byte rhs) {
    return tc.wrap(lhs - rhs);
  }

  public Object doApply(final ThreadContext tc, final char lhs, final short rhs) {
    return tc.wrap(lhs - rhs);
  }

  public Object doApply(final ThreadContext tc, final char lhs, final int rhs) {
    return tc.wrap(lhs - rhs);
  }

  public Object doApply(final ThreadContext tc, final char lhs, final long rhs) {
    return tc.wrap(lhs - rhs);
  }

  public Object doApply(final ThreadContext tc, final char lhs, final float rhs) {
    return tc.wrap(lhs - rhs);
  }

  public Object doApply(final ThreadContext tc, final char lhs, final double rhs) {
    return tc.wrap(lhs - rhs);
  }

  public Object doApply(final ThreadContext tc, final char lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).subtract(rhs);
  }

  public Object doApply(final ThreadContext tc, final char lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs).subtract(rhs);
  }

  public int doIntApply(final ThreadContext tc, final char lhs, final char rhs) {
    return lhs - rhs;
  }

  public int doIntApply(final ThreadContext tc, final char lhs, final byte rhs) {
    return lhs - rhs;
  }

  public int doIntApply(final ThreadContext tc, final char lhs, final short rhs) {
    return lhs - rhs;
  }

  public int doIntApply(final ThreadContext tc, final char lhs, final int rhs) {
    return lhs - rhs;
  }

  public long doLongApply(final ThreadContext tc, final char lhs, final long rhs) {
    return lhs - rhs;
  }

  public float doFloatApply(final ThreadContext tc, final char lhs, final float rhs) {
    return lhs - rhs;
  }

  public double doDoubleApply(final ThreadContext tc, final char lhs, final double rhs) {
    return lhs - rhs;
  }

  public BigInteger doBigIntegerApply(final ThreadContext tc, final char lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).subtract(rhs);
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final char lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs).subtract(rhs);
  }
}
