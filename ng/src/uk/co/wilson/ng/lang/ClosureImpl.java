package uk.co.wilson.ng.lang;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.lang.Closure;
import ng.runtime.NgBoolean;
import ng.runtime.NgByte;
import ng.runtime.NgChar;
import ng.runtime.NgDouble;
import ng.runtime.NgFloat;
import ng.runtime.NgInt;
import ng.runtime.NgLong;
import ng.runtime.NgShort;
import ng.runtime.RuntimeMetaClass;

import uk.co.wilson.ng.runtime.metaclass.RuntimeMetaClassImpl;

/**
 * @author John
 *
 */
public class ClosureImpl extends Closure {

  /**
   * @param metaClass
   */
  public ClosureImpl(final RuntimeMetaClass metaClass) {
    super(metaClass);
  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(java.lang.Object, java.lang.Object[])
   */
  public Object call(final Object instance, final Object[] arguments) throws Throwable {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(java.lang.Object)
   */
  public Object call(final Object instance) throws Throwable {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(java.lang.Object, java.lang.Object)
   */
  public Object call(final Object instance, final Object p1) throws Throwable {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object call(final Object instance, final Object p1, final Object p2) throws Throwable {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object call(final Object instance, final Object p1, final Object p2, final Object p3) throws Throwable {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object call(final Object instance, final Object p1, final Object p2, final Object p3, final Object p4) throws Throwable {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(java.lang.Object, boolean)
   */
  public Object call(final Object instance, final boolean p1) throws Throwable {
    return this.call(instance, NgBoolean.valueOf(p1));
  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(java.lang.Object, byte)
   */
  public Object call(final Object instance, final byte p1) throws Throwable {
    return this.call(instance, NgByte.valueOf(p1));
  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(java.lang.Object, char)
   */
  public Object call(final Object instance, final char p1) throws Throwable {
    return this.call(instance, NgChar.valueOf(p1));

  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(java.lang.Object, short)
   */
  public Object call(final Object instance, final short p1) throws Throwable {
    return this.call(instance, NgShort.valueOf(p1));
  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(java.lang.Object, int)
   */
  public Object call(final Object instance, final int p1) throws Throwable {
    return this.call(instance, NgInt.valueOf(p1));
  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(java.lang.Object, long)
   */
  public Object call(final Object instance, final long p1) throws Throwable {
    return this.call(instance, NgLong.valueOf(p1));
  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(java.lang.Object, float)
   */
  public Object call(final Object instance, final float p1) throws Throwable {
    return this.call(instance, NgFloat.valueOf(p1));
  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(java.lang.Object, double)
   */
  public Object call(final Object instance, final double p1) throws Throwable {
    return this.call(instance, NgDouble.valueOf(p1));
  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(java.lang.Object, java.math.BigInteger)
   */
  public Object call(final Object instance, final BigInteger p1) throws Throwable {
    return this.call(instance, (Object)p1);
  }

  /* (non-Javadoc)
   * @see ng.lang.Closure#call(java.lang.Object, java.math.BigDecimal)
   */
  public Object call(final Object instance, final BigDecimal p1) throws Throwable {
    return this.call(instance, (Object)p1);
  }
}
