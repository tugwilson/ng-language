package uk.co.wilson.ng.runtime.metaclass.primitives.intimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;
import uk.co.wilson.ng.runtime.metaclass.primitives.IntBinaryArithmeticOperation;

class Add implements IntBinaryArithmeticOperation {
  public Object doApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.add().apply(tc.unwrapToInt(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.add().apply(tc.unwrapToInt(lhs), rhsMetaClass, rhs);
  }

  public Object doReverseApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.add().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final char rhs) {
    return doApply(tc, tc.unwrapToInt(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final byte rhs) {
    return doApply(tc, tc.unwrapToInt(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final short rhs) {
    return doApply(tc, tc.unwrapToInt(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final int rhs) {
    return doApply(tc, tc.unwrapToInt(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final long rhs) {
    return doApply(tc, tc.unwrapToInt(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final float rhs) {
    return doApply(tc, tc.unwrapToInt(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final double rhs) {
    return doApply(tc, tc.unwrapToInt(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final BigInteger rhs) {
    return doApply(tc, tc.unwrapToInt(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final BigDecimal rhs) {
    return doApply(tc, tc.unwrapToInt(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final char lhs, final Object rhs) {
    return tc.wrap(lhs + tc.unwrapToInt(rhs));
  }

  public Object doApply(final ThreadContext tc, final byte lhs, final Object rhs) {
    return tc.wrap(lhs + tc.unwrapToInt(rhs));
  }

  public Object doApply(final ThreadContext tc, final short lhs, final Object rhs) {
    return tc.wrap(lhs + tc.unwrapToInt(rhs));
  }

  public Object doApply(final ThreadContext tc, final int lhs, final Object rhs) {
    return tc.wrap(lhs + tc.unwrapToInt(rhs));
  }

  public Object doApply(final ThreadContext tc, final long lhs, final Object rhs) {
    return tc.wrap(lhs + tc.unwrapToInt(rhs));
  }

  public Object doApply(final ThreadContext tc, final float lhs, final Object rhs) {
    return tc.wrap(lhs + tc.unwrapToInt(rhs));
  }

  public Object doApply(final ThreadContext tc, final double lhs, final Object rhs) {
    return tc.wrap(lhs + tc.unwrapToInt(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final Object rhs) {
    return lhs.add(BigInteger.valueOf(tc.unwrapToInt(rhs)));
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return lhs.add(new BigDecimal(tc.unwrapToInt(rhs)));
  }

  public Object doApply(final ThreadContext tc, final int lhs, final char rhs) {
    return tc.wrap(lhs + rhs);
  }

  public Object doApply(final ThreadContext tc, final int lhs, final byte rhs) {
    return tc.wrap(lhs + rhs);
  }

  public Object doApply(final ThreadContext tc, final int lhs, final short rhs) {
    return tc.wrap(lhs + rhs);
  }

  public Object doApply(final ThreadContext tc, final int lhs, final int rhs) {
    return tc.wrap(lhs + rhs);
  }

  public Object doApply(final ThreadContext tc, final int lhs, final long rhs) {
    return tc.wrap(lhs + rhs);
  }

  public Object doApply(final ThreadContext tc, final int lhs, final float rhs) {
    return tc.wrap(lhs + rhs);
  }

  public Object doApply(final ThreadContext tc, final int lhs, final double rhs) {
    return tc.wrap(lhs + rhs);
  }

  public Object doApply(final ThreadContext tc, final int lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).add(rhs);
  }

  public Object doApply(final ThreadContext tc, final int lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs).add(rhs);
  }

  public int doIntApply(final ThreadContext tc, final int lhs, final char rhs) {
    return lhs + rhs;
  }

  public int doIntApply(final ThreadContext tc, final int lhs, final byte rhs) {
    return lhs + rhs;
  }

  public int doIntApply(final ThreadContext tc, final int lhs, final short rhs) {
    return lhs + rhs;
  }

  public int doIntApply(final ThreadContext tc, final int lhs, final int rhs) {
    return lhs + rhs;
  }

  public long doLongApply(final ThreadContext tc, final int lhs, final long rhs) {
    return lhs + rhs;
  }

  public float doFloatApply(final ThreadContext tc, final int lhs, final float rhs) {
    return lhs + rhs;
  }

  public double doDoubleApply(final ThreadContext tc, final int lhs, final double rhs) {
    return lhs + rhs;
  }

  public BigInteger doBigIntegerApply(final ThreadContext tc, final int lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).add(rhs);
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final int lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs).add(rhs);
  }
}
