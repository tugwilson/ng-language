package uk.co.wilson.ng.lang;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.lang.Closure;
import ng.lang.NgSystem;
import ng.runtime.*;
import uk.co.wilson.ng.runtime.metaclass.RuntimeMetaClassImpl;

/**
 * @author John
 *
 */
public abstract class ClosureImpl extends Closure {
  /**
   * 
   */
  public ClosureImpl() {
    super(NgSystem.closureMetaClass);
  }
  
  /**
   * @param metaClass
   */
  public ClosureImpl(final RuntimeMetaClass metaClass) {
    super(metaClass);
  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object[])
   */
  public Object call(final ThreadContext tc, final Object instance, final Object[] arguments) throws Throwable {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(ng.runtime.ThreadContext, java.lang.Object)
   */
  public Object callQuick(final ThreadContext tc, final Object instance) throws Throwable {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final Object p1) throws Throwable {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final Object p1, final Object p2) throws Throwable {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final Object p1, final Object p2, final Object p3) throws Throwable {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final Object p1, final Object p2, final Object p3, final Object p4) throws Throwable {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(ng.runtime.ThreadContext, java.lang.Object, boolean)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final boolean p1) throws Throwable {
    return this.callQuick(tc, instance, NgBoolean.valueOf(p1));
  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(ng.runtime.ThreadContext, java.lang.Object, byte)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final byte p1) throws Throwable {
    return this.callQuick(tc, instance, NgByte.valueOf(p1));
  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(ng.runtime.ThreadContext, java.lang.Object, char)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final char p1) throws Throwable {
    return this.callQuick(tc, instance, NgChar.valueOf(p1));

  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(ng.runtime.ThreadContext, java.lang.Object, short)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final short p1) throws Throwable {
    return this.callQuick(tc, instance, NgShort.valueOf(p1));
  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(ng.runtime.ThreadContext, java.lang.Object, int)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final int p1) throws Throwable {
    return this.callQuick(tc, instance, NgInt.valueOf(p1));
  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(ng.runtime.ThreadContext, java.lang.Object, long)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final long p1) throws Throwable {
    return this.callQuick(tc, instance, NgLong.valueOf(p1));
  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(ng.runtime.ThreadContext, java.lang.Object, float)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final float p1) throws Throwable {
    return this.callQuick(tc, instance, NgFloat.valueOf(p1));
  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(ng.runtime.ThreadContext, java.lang.Object, double)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final double p1) throws Throwable {
    return this.callQuick(tc, instance, NgDouble.valueOf(p1));
  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(ng.runtime.ThreadContext, java.lang.Object, java.math.BigInteger)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final BigInteger p1) throws Throwable {
    return this.callQuick(tc, instance, (Object)p1);
  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(ng.runtime.ThreadContext, java.lang.Object, java.math.BigDecimal)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final BigDecimal p1) throws Throwable {
    return this.callQuick(tc, instance, (Object)p1);
  }
}
