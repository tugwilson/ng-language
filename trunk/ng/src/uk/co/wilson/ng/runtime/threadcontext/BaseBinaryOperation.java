package uk.co.wilson.ng.runtime.threadcontext;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.BinaryOperation;
import ng.runtime.threadcontext.ThreadContext;

public abstract class BaseBinaryOperation extends BaseOperation implements BinaryOperation{

  protected BaseBinaryOperation(final ThreadContext tc) {
    super(tc);
  }

  public Object apply(final Object lhs, final Object rhs) {
    return apply(this.tc.getMetaClassFor(lhs), lhs, rhs);
  }

  public Object apply(final Object lhs, final char rhs) {
    return apply(this.tc.getMetaClassFor(lhs), lhs, rhs);
  }

  public Object apply(final Object lhs, final byte rhs) {
    return apply(this.tc.getMetaClassFor(lhs), lhs, rhs);
  }

  public Object apply(final Object lhs, final short rhs) {
    return apply(this.tc.getMetaClassFor(lhs), lhs, rhs);
  }

  public Object apply(final Object lhs, final int rhs) {
    return apply(this.tc.getMetaClassFor(lhs), lhs, rhs);
  }

  public Object apply(final Object lhs, final long rhs) {
    return apply(this.tc.getMetaClassFor(lhs), lhs, rhs);
  }

  public Object apply(final Object lhs, final float rhs) {
    return apply(this.tc.getMetaClassFor(lhs), lhs, rhs);
  }

  public Object apply(final Object lhs, final double rhs) {
    return apply(this.tc.getMetaClassFor(lhs), lhs, rhs);
  }

  public Object apply(final Object lhs, final BigInteger rhs) {
    return apply(this.tc.getMetaClassFor(lhs), lhs, rhs);
  }

  public Object apply(final Object lhs, final BigDecimal rhs) {
    return apply(this.tc.getMetaClassFor(lhs), lhs, rhs);
  }

  public Object apply(final char lhs, final Object rhs) {
    return apply(lhs, this.tc.getMetaClassFor(rhs), rhs);
  }

  public Object apply(final byte lhs, final Object rhs) {
    return apply(lhs, this.tc.getMetaClassFor(rhs), rhs);
  }

  public Object apply(final short lhs, final Object rhs) {
    return apply(lhs, this.tc.getMetaClassFor(rhs), rhs);
  }

  public Object apply(final int lhs, final Object rhs) {
    return apply(lhs, this.tc.getMetaClassFor(rhs), rhs);
  }

  public Object apply(final long lhs, final Object rhs) {
    return apply(lhs, this.tc.getMetaClassFor(rhs), rhs);
  }

  public Object apply(final float lhs, final Object rhs) {
    return apply(lhs, this.tc.getMetaClassFor(rhs), rhs);
  }

  public Object apply(final double lhs, final Object rhs) {
    return apply(lhs, this.tc.getMetaClassFor(rhs), rhs);
  }

  public Object apply(final BigInteger lhs, final Object rhs) {
    return apply(lhs, this.tc.getMetaClassFor(rhs), rhs);
  }

  public Object apply(final BigDecimal lhs, final Object rhs) {
    return apply(lhs, this.tc.getMetaClassFor(rhs), rhs);
  }
}
