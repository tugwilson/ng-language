package uk.co.wilson.ng.runtime.metaclass.reflection.fields;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.NgBoolean;
import ng.runtime.NgByte;
import ng.runtime.NgChar;
import ng.runtime.NgDouble;
import ng.runtime.NgFloat;
import ng.runtime.NgInt;
import ng.runtime.NgLong;
import ng.runtime.NgShort;
import ng.runtime.ThreadContext;
import uk.co.wilson.ng.runtime.metaclass.RuntimeMetaClassImpl;
import uk.co.wilson.ng.runtime.metaclass.reflection.ReflectionMetaMethod;

/**
 * @author John
 *
 */
public class SetUntypedFieldMetaMethod extends ReflectionMetaMethod {
  protected final Field field;
  
  public SetUntypedFieldMetaMethod(final Field field) {
    super(new Class[]{field.getClass()});
    this.field = field;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, java.lang.Object[])
   */
  public Object call(final Object instance, final Object[] arguments) {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object)
   */
  public Object callQuick(final Object instance) {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final Object instance, final Object value) {
    try {
      this.field.set(instance, value);
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
    
    return value;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, boolean)
   */
  public Object callQuick(final Object instance, final boolean value) {
    try {
      this.field.set(instance, value);
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
    
    return NgBoolean.valueOf(value);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, char)
   */
  public Object callQuick(final Object instance, final char value) {
    try {
      this.field.set(instance, value);
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
    
    return NgChar.valueOf(value);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, byte)
   */
  public Object callQuick(final Object instance, final byte value) {
    try {
      this.field.set(instance, value);
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
    
    return NgByte.valueOf(value);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, short)
   */
  public Object callQuick(final Object instance, final short value) {
    try {
      this.field.set(instance, value);
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
    
    return NgShort.valueOf(value);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, int)
   */
  public Object callQuick(final Object instance, final int value) {
    try {
      this.field.set(instance, value);
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
    
    return NgInt.valueOf(value);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, long)
   */
  public Object callQuick(final Object instance, final long value) {
    try {
      this.field.set(instance, value);
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
    
    return NgLong.valueOf(value);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, float)
   */
  public Object callQuick(final Object instance, final float value) {
    try {
      this.field.set(instance, value);
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
    
    return NgFloat.valueOf(value);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, double)
   */
  public Object callQuick(final Object instance, final double value) {
    try {
      this.field.set(instance, value);
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
    
    return NgDouble.valueOf(value);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, java.math.BigInteger)
   */
  public Object callQuick(final Object instance, final BigInteger value) {
    try {
      this.field.set(instance, value);
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
    
    return value;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, java.math.BigDecimal)
   */
  public Object callQuick(final Object instance, final BigDecimal value) {
    try {
      this.field.set(instance, value);
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
    
    return value;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final Object instance, final Object p1, final Object p2) {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final Object instance, final Object p1, final Object p2, final Object p3) {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final Object instance, final Object p1, final Object p2, final Object p3, final Object p4) {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object[])
   */
  public Object call(final ThreadContext tc, final Object instance, final Object[] arguments) throws Throwable {
    return call(instance, arguments);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object)
   */
  public Object callQuick(final ThreadContext tc, final Object instance) throws Throwable {
    return callQuick(instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final Object p1) throws Throwable {
    return callQuick(instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object, boolean)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final boolean p1) throws Throwable {
    return callQuick(instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object, char)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final char p1)throws Throwable  {
    return callQuick(instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object, byte)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final byte p1) throws Throwable {
    return callQuick(instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object, short)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final short p1) throws Throwable {
    return callQuick(instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object, int)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final int p1) throws Throwable {
    return callQuick(instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object, long)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final long p1) throws Throwable {
    return callQuick(instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object, float)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final float p1) throws Throwable {
    return callQuick(instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object, double)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final double p1) throws Throwable {
    return callQuick(instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object, java.math.BigInteger)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final BigInteger p1) throws Throwable {
    return callQuick(instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object, java.math.BigDecimal)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final BigDecimal p1) throws Throwable {
    return callQuick(instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final Object p1, final Object p2) throws Throwable {
    return callQuick(instance, p1, p2);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final Object p1, final Object p2, final Object p3) throws Throwable {
    return callQuick(instance, p1, p2, p3);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final Object p1, final Object p2, final Object p3, final Object p4) throws Throwable {
    return callQuick(instance, p1, p2, p3, p4);
  }
}
