package uk.co.wilson.ng.runtime.metaclass.reflection.methods;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.ThreadContext;
import uk.co.wilson.ng.runtime.metaclass.RuntimeMetaClassImpl;
import uk.co.wilson.ng.runtime.metaclass.reflection.ReflectionMetaMethod;

/**
 * @author tug
 *
 */
public class UntypedMetaMethod extends ReflectionMetaMethod {
  private static final Object[] NO_PARAMS = new Object[]{};
  
  private final Method method;
  
  public UntypedMetaMethod(final Method method) {
    super(method.getParameterTypes());
    this.method = method;
  }

  /* (non-Javadoc)
   * @see ng.runtime.Callable#call(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object[])
   */
  public Object call(final ThreadContext tc, final Object instance, final Object[] arguments) throws Throwable {
    if (this.numberOfParameters != arguments.length) return RuntimeMetaClassImpl.NOT_CALLED;
    
    final Object[] actualParams = new Object[arguments.length];
    
    for (int i = 0; i != arguments.length; i++) {
    final Object p = arguments[i];
    
      actualParams[i] = tc.getParamObject(p, this.parameterTypes[i]);
    }
    
    try {
      return this.method.invoke(instance, actualParams);
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw e.getCause();
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.Callable#callQuick(ng.runtime.ThreadContext, java.lang.Object)
   */
  public Object callQuick(final ThreadContext tc, final Object instance) throws Throwable {
    if (this.numberOfParameters != 0) return RuntimeMetaClassImpl.NOT_CALLED;
    
    try {
      return this.method.invoke(instance, NO_PARAMS);
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw e.getCause();
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.Callable#callQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final Object p1) throws Throwable {
    if (this.numberOfParameters != 1) return RuntimeMetaClassImpl.NOT_CALLED;
    
    try {
      return this.method.invoke(instance, new Object[]{tc.getParamObject(p1, this.parameterTypes[0])});
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw e.getCause();
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.Callable#callQuick(ng.runtime.ThreadContext, java.lang.Object, boolean)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final boolean p1) throws Throwable {
    if (this.numberOfParameters != 1) return RuntimeMetaClassImpl.NOT_CALLED;
    
    try {
      return this.method.invoke(instance, new Object[]{tc.getParamObject(p1, this.parameterTypes[0])});
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw e.getCause();
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.Callable#callQuick(ng.runtime.ThreadContext, java.lang.Object, char)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final char p1)throws Throwable  {
    if (this.numberOfParameters != 1) return RuntimeMetaClassImpl.NOT_CALLED;
    
    try {
      return this.method.invoke(instance, new Object[]{tc.getParamObject(p1, this.parameterTypes[0])});
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw e.getCause();
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.Callable#callQuick(ng.runtime.ThreadContext, java.lang.Object, byte)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final byte p1) throws Throwable {
    if (this.numberOfParameters != 1) return RuntimeMetaClassImpl.NOT_CALLED;
    
    try {
      return this.method.invoke(instance, new Object[]{tc.getParamObject(p1, this.parameterTypes[0])});
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw e.getCause();
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.Callable#callQuick(ng.runtime.ThreadContext, java.lang.Object, short)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final short p1) throws Throwable {
    if (this.numberOfParameters != 1) return RuntimeMetaClassImpl.NOT_CALLED;
    
    try {
      return this.method.invoke(instance, new Object[]{tc.getParamObject(p1, this.parameterTypes[0])});
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw e.getCause();
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.Callable#callQuick(ng.runtime.ThreadContext, java.lang.Object, int)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final int p1) throws Throwable {
    if (this.numberOfParameters != 1) return RuntimeMetaClassImpl.NOT_CALLED;
    
    try {
      return this.method.invoke(instance, new Object[]{tc.getParamObject(p1, this.parameterTypes[0])});
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw e.getCause();
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.Callable#callQuick(ng.runtime.ThreadContext, java.lang.Object, long)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final long p1) throws Throwable {
    if (this.numberOfParameters != 1) return RuntimeMetaClassImpl.NOT_CALLED;
    
    try {
      return this.method.invoke(instance, new Object[]{tc.getParamObject(p1, this.parameterTypes[0])});
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw e.getCause();
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.Callable#callQuick(ng.runtime.ThreadContext, java.lang.Object, float)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final float p1) throws Throwable {
    if (this.numberOfParameters != 1) return RuntimeMetaClassImpl.NOT_CALLED;
    
    try {
      return this.method.invoke(instance, new Object[]{tc.getParamObject(p1, this.parameterTypes[0])});
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw e.getCause();
    }
  }

  public Object callQuick(final ThreadContext tc, final Object instance, final double p1) throws Throwable {
    if (this.numberOfParameters != 1) return RuntimeMetaClassImpl.NOT_CALLED;
    
    try {
      return this.method.invoke(instance, new Object[]{tc.getParamObject(p1, this.parameterTypes[0])});
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw e.getCause();
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.Callable#callQuick(ng.runtime.ThreadContext, java.lang.Object, java.math.BigInteger)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final BigInteger p1) throws Throwable {
    if (this.numberOfParameters != 1) return RuntimeMetaClassImpl.NOT_CALLED;
    
    try {
      return this.method.invoke(instance, new Object[]{tc.getParamObject(p1, this.parameterTypes[0])});
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw e.getCause();
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.Callable#callQuick(ng.runtime.ThreadContext, java.lang.Object, java.math.BigDecimal)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final BigDecimal p1) throws Throwable {
    if (this.numberOfParameters != 1) return RuntimeMetaClassImpl.NOT_CALLED;
    
    try {
      return this.method.invoke(instance, new Object[]{tc.getParamObject(p1, this.parameterTypes[0])});
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw e.getCause();
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.Callable#callQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final Object p1, final Object p2) throws Throwable {
    if (this.numberOfParameters != 2) return RuntimeMetaClassImpl.NOT_CALLED;
        
    try {
      return this.method.invoke(instance, new Object[]{tc.getParamObject(p1, this.parameterTypes[0]),
                                                       tc.getParamObject(p2, this.parameterTypes[1])});
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw e.getCause();
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.Callable#callQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final Object p1, final Object p2, final Object p3) throws Throwable {
    if (this.numberOfParameters != 3) return RuntimeMetaClassImpl.NOT_CALLED;
    
    try {
      return this.method.invoke(instance, new Object[]{tc.getParamObject(p1, this.parameterTypes[0]),
                                                       tc.getParamObject(p2, this.parameterTypes[1]),
                                                       tc.getParamObject(p3, this.parameterTypes[2])});
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw e.getCause();
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.Callable#callQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final Object p1, final Object p2, final Object p3, final Object p4) throws Throwable {
    if (this.numberOfParameters != 4) return RuntimeMetaClassImpl.NOT_CALLED;
    
    try {
      return this.method.invoke(instance, new Object[]{tc.getParamObject(p1, this.parameterTypes[0]),
                                                       tc.getParamObject(p2, this.parameterTypes[1]),
                                                       tc.getParamObject(p3, this.parameterTypes[2]),
                                                       tc.getParamObject(p4, this.parameterTypes[3])});
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw e.getCause();
    }
  }
}
