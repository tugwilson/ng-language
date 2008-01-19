package uk.co.wilson.ng.runtime.metaclass.primitives.biginteger;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigIntegerBinaryArithmeticOperation;

class Add extends BaseBinaryOperation implements BigIntegerBinaryArithmeticOperation {
  public Object doApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.add().apply((BigInteger)lhs, rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.add().apply((BigInteger)lhs, rhsMetaClass, rhs);
  }

  public Object doReverseApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.add().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ThreadContext tc, final char lhs, final Object rhs) {
    return tc.add().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ThreadContext tc, final byte lhs, final Object rhs) {
    return tc.add().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ThreadContext tc, final short lhs, final Object rhs) {
    return tc.add().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ThreadContext tc, final int lhs, final Object rhs) {
    return tc.add().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ThreadContext tc, final long lhs, final Object rhs) {
    return tc.add().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ThreadContext tc, final float lhs, final Object rhs) {
    return tc.add().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ThreadContext tc, final double lhs, final Object rhs) {
    return tc.add().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final Object rhs) {
    return tc.add().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return tc.add().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final char rhs) {
    return lhs.add(BigInteger.valueOf(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final byte rhs) {
    return lhs.add(BigInteger.valueOf(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final short rhs) {
    return lhs.add(BigInteger.valueOf(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final int rhs) {
    return lhs.add(BigInteger.valueOf(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final long rhs) {
    return lhs.add(BigInteger.valueOf(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final float rhs) {
    return tc.wrap(lhs.floatValue() + rhs);
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final double rhs) {
    return tc.wrap(lhs.doubleValue() + rhs);
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final BigInteger rhs) {
    return lhs.add(rhs);
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs.longValue()).add(rhs);
  }

  public BigInteger doBigIntegerApply(final ThreadContext tc, final BigInteger lhs, final char rhs) {
    return lhs.add(BigInteger.valueOf(rhs));
  }

  public BigInteger doBigIntegerApply(final ThreadContext tc, final BigInteger lhs, final byte rhs) {
    return lhs.add(BigInteger.valueOf(rhs));
  }

  public BigInteger doBigIntegerApply(final ThreadContext tc, final BigInteger lhs, final short rhs) {
    return lhs.add(BigInteger.valueOf(rhs));
  }

  public BigInteger doBigIntegerApply(final ThreadContext tc, final BigInteger lhs, final int rhs) {
    return lhs.add(BigInteger.valueOf(rhs));
  }

  public BigInteger doBigIntegerApply(final ThreadContext tc, final BigInteger lhs, final long rhs) {
    return lhs.add(BigInteger.valueOf(rhs));
  }

  public float doFloatApply(final ThreadContext tc, final BigInteger lhs, final float rhs) {
    return lhs.floatValue() + rhs;
  }

  public double doDoubleApply(final ThreadContext tc, final BigInteger lhs, final double rhs) {
    return lhs.doubleValue() + rhs;
  }

  public BigInteger doBigIntegerApply(final ThreadContext tc, final BigInteger lhs, final BigInteger rhs) {
    return lhs.add(rhs);
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final BigInteger lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs.longValue()).add(rhs);
  }
}
