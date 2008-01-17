package uk.co.wilson.ng.runtime.metaclass.primitives.bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigDecimalBinaryArithmeticOperation;

/**
 * @author John
 *
 */
public class Modulo extends BaseBinaryOperation implements BigDecimalBinaryArithmeticOperation {
  public Object doApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.modulo().apply((BigDecimal)lhs, rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.modulo().apply((BigDecimal)lhs, rhsMetaClass, rhs);
  }

  public Object doApply(final ThreadContext tc, final char lhs, final Object rhs) {
    return tc.modulo().apply(lhs, (BigDecimal)rhs);
  }

  public Object doReverseApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.modulo().apply(lhs, (BigDecimal)rhs);
  }

  public Object doApply(final ThreadContext tc, final byte lhs, final Object rhs) {
    return tc.modulo().apply(lhs, (BigDecimal)rhs);
  }

  public Object doApply(final ThreadContext tc, final short lhs, final Object rhs) {
    return tc.modulo().apply(lhs, (BigDecimal)rhs);
  }

  public Object doApply(final ThreadContext tc, final int lhs, final Object rhs) {
    return tc.modulo().apply(lhs, (BigDecimal)rhs);
  }

  public Object doApply(final ThreadContext tc, final long lhs, final Object rhs) {
    return tc.modulo().apply(lhs, (BigDecimal)rhs);
  }

  public Object doApply(final ThreadContext tc, final float lhs, final Object rhs) {
    return tc.modulo().apply(lhs, (BigDecimal)rhs);
  }

  public Object doApply(final ThreadContext tc, final double lhs, final Object rhs) {
    return tc.modulo().apply(lhs, (BigDecimal)rhs);
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final Object rhs) {
    return tc.modulo().apply(lhs, (BigDecimal)rhs);
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return tc.modulo().apply(lhs, (BigDecimal)rhs);
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final char rhs) {
    return lhs.divideToIntegralValue(BigDecimal.valueOf(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final byte rhs) {
    return lhs.divideToIntegralValue(BigDecimal.valueOf(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final short rhs) {
    return lhs.divideToIntegralValue(BigDecimal.valueOf(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final int rhs) {
    return lhs.divideToIntegralValue(BigDecimal.valueOf(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final long rhs) {
    return lhs.divideToIntegralValue(BigDecimal.valueOf(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final float rhs) {
    return lhs.divideToIntegralValue(BigDecimal.valueOf(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final double rhs) {
    return lhs.divideToIntegralValue(BigDecimal.valueOf(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final BigInteger rhs) {
    return lhs.divideToIntegralValue(BigDecimal.valueOf(rhs.longValue()));
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final BigDecimal rhs) {
    return lhs.divideToIntegralValue(rhs);
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final BigDecimal lhs, final char rhs) {
    return lhs.divideToIntegralValue(BigDecimal.valueOf(rhs));
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final BigDecimal lhs, final byte rhs) {
    return lhs.divideToIntegralValue(BigDecimal.valueOf(rhs));
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final BigDecimal lhs, final short rhs) {
    return lhs.divideToIntegralValue(BigDecimal.valueOf(rhs));
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final BigDecimal lhs, final int rhs) {
    return lhs.divideToIntegralValue(BigDecimal.valueOf(rhs));
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final BigDecimal lhs, final long rhs) {
    return lhs.divideToIntegralValue(BigDecimal.valueOf(rhs));
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final BigDecimal lhs, final float rhs) {
    return lhs.divideToIntegralValue(BigDecimal.valueOf(rhs));
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final BigDecimal lhs, final double rhs) {
    return lhs.divideToIntegralValue(BigDecimal.valueOf(rhs));
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final BigDecimal lhs, final BigInteger rhs) {
    return lhs.divideToIntegralValue(BigDecimal.valueOf(rhs.longValue()));
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final BigDecimal lhs, final BigDecimal rhs) {
    return lhs.divideToIntegralValue(rhs);
  }
}
