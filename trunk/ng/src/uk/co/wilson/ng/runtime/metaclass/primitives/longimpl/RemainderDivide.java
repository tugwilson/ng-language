package uk.co.wilson.ng.runtime.metaclass.primitives.longimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import uk.co.wilson.ng.runtime.metaclass.primitives.LongBinaryArithmeticOperation;

/**
 * @author John
 *
 */
public class RemainderDivide extends BaseBinaryOperation implements LongBinaryArithmeticOperation {
  public Object doApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.remainderDivide().apply(tc.unwrapToLong(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.remainderDivide().apply(tc.unwrapToLong(lhs), rhsMetaClass, rhs);
  }

  public Object doReverseApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(final ThreadContext tc, final char lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(final ThreadContext tc, final byte lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(final ThreadContext tc, final short lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(final ThreadContext tc, final int lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(final ThreadContext tc, final long lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(final ThreadContext tc, final float lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(final ThreadContext tc, final double lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(final ThreadContext tc, final long lhs, final char rhs) {
    return BigDecimal.valueOf(lhs).divideAndRemainder(BigDecimal.valueOf(rhs))[1];
  }

  public Object doApply(final ThreadContext tc, final long lhs, final byte rhs) {
    return BigDecimal.valueOf(lhs).divideAndRemainder(BigDecimal.valueOf(rhs))[1];
  }

  public Object doApply(final ThreadContext tc, final long lhs, final short rhs) {
    return BigDecimal.valueOf(lhs).divideAndRemainder(BigDecimal.valueOf(rhs))[1];
  }

  public Object doApply(final ThreadContext tc, final long lhs, final int rhs) {
    return BigDecimal.valueOf(lhs).divideAndRemainder(BigDecimal.valueOf(rhs))[1];
  }

  public Object doApply(final ThreadContext tc, final long lhs, final long rhs) {
    return BigDecimal.valueOf(lhs).divideAndRemainder(BigDecimal.valueOf(rhs))[1];
  }

  public Object doApply(final ThreadContext tc, final long lhs, final float rhs) {
  final double tmp = lhs / rhs;
    
    return tc.wrap((float)(tmp - Math.floor(tmp)));
  }

  public Object doApply(final ThreadContext tc, final long lhs, final double rhs) {
  final double tmp = lhs / rhs;
    
    return tc.wrap(tmp - Math.floor(tmp));
  }

  public Object doApply(final ThreadContext tc, final long lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).divideAndRemainder(rhs)[1];
  }

  public Object doApply(final ThreadContext tc, final long lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs).divideAndRemainder(rhs)[1];
  }

  public long doLongApply(final ThreadContext tc, final long lhs, final char rhs) {
    throw new NotImplementedException();
  }

  public long doLongApply(final ThreadContext tc, final long lhs, final byte rhs) {
    throw new NotImplementedException();
  }

  public long doLongApply(final ThreadContext tc, final long lhs, final short rhs) {
    throw new NotImplementedException();
  }

  public long doLongApply(final ThreadContext tc, final long lhs, final int rhs) {
    throw new NotImplementedException();
  }

  public long doLongApply(final ThreadContext tc, final long lhs, final long rhs) {
    throw new NotImplementedException();
  }

  public float doFloatApply(final ThreadContext tc, final long lhs, final float rhs) {
  final double tmp = lhs / rhs;
    
    return (float)(tmp - Math.floor(tmp));
  }

  public double doDoubleApply(final ThreadContext tc, final long lhs, final double rhs) {
  final double tmp = lhs / rhs;
    
    return tmp - Math.floor(tmp);
  }

  public BigInteger doBigIntegerApply(final ThreadContext tc, final long lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).divideAndRemainder(rhs)[1];
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final long lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs).divideAndRemainder(rhs)[1];
  }
}
