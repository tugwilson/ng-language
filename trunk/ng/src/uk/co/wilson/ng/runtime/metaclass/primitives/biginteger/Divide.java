package uk.co.wilson.ng.runtime.metaclass.primitives.biginteger;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigIntegerBinaryArithmeticOperation;

/**
 * @author John
 *
 */
public class Divide extends BaseBinaryOperation implements BigIntegerBinaryArithmeticOperation {
  public Object doApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.add().apply((BigInteger)lhs, rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.divide().apply((BigInteger)lhs, rhsMetaClass, rhs);
  }

  public Object doReverseApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.divide().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ThreadContext tc, final char lhs, final Object rhs) {
    return tc.divide().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ThreadContext tc, final byte lhs, final Object rhs) {
    return tc.divide().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ThreadContext tc, final short lhs, final Object rhs) {
    return tc.divide().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ThreadContext tc, final int lhs, final Object rhs) {
    return tc.divide().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ThreadContext tc, final long lhs, final Object rhs) {
    return tc.divide().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ThreadContext tc, final float lhs, final Object rhs) {
    return tc.divide().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ThreadContext tc, final double lhs, final Object rhs) {
    return tc.divide().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final Object rhs) {
    return tc.divide().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return tc.divide().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final char rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final byte rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final short rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final int rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final long rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final float rhs) {
    return tc.wrap(lhs.divide(BigInteger.valueOf((long)rhs)).floatValue());
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final double rhs) {
    return tc.wrap(lhs.divide(BigInteger.valueOf((long)rhs)).doubleValue());
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final BigInteger rhs) {
    return lhs.divide(rhs);
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs.longValue()).divide(rhs);
  }

  public BigInteger doBigIntegerApply(final ThreadContext tc, final BigInteger lhs, final char rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public BigInteger doBigIntegerApply(final ThreadContext tc, final BigInteger lhs, final byte rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public BigInteger doBigIntegerApply(final ThreadContext tc, final BigInteger lhs, final short rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public BigInteger doBigIntegerApply(final ThreadContext tc, final BigInteger lhs, final int rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public BigInteger doBigIntegerApply(final ThreadContext tc, final BigInteger lhs, final long rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public float doFloatApply(final ThreadContext tc, final BigInteger lhs, final float rhs) {
    return lhs.divide(BigInteger.valueOf((long)rhs)).floatValue();
  }

  public double doDoubleApply(final ThreadContext tc, final BigInteger lhs, final double rhs) {
    return lhs.divide(BigInteger.valueOf((long)rhs)).doubleValue();
  }

  public BigInteger doBigIntegerApply(final ThreadContext tc, final BigInteger lhs, final BigInteger rhs) {
    return lhs.divide(rhs);
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final BigInteger lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs.longValue()).divide(rhs);
  }
}
