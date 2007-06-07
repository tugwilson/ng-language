package uk.co.wilson.ng.runtime.metaclass.reflection.methods;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;

import ng.lang.NgRuntimeException;
import ng.lang.NgSystem;
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
   * @see ng.runtime.MetaMethod#call(java.lang.Object, java.lang.Object[])
   */
  public Object call(final Object instance, final Object[] arguments) {
    if (this.numberOfParameters != arguments.length) return RuntimeMetaClassImpl.NOT_CALLED;
    
    final Object[] actualParams = new Object[arguments.length];
    
    for (int i = 0; i != arguments.length; i++) {
    final Object p = arguments[i];
    
      actualParams[i] = NgSystem.metaClassRegistry.getRuntimeMetaClass(p).getParamObject(p, this.parameterTypes[i]);
    }
    
    try {
      return this.method.invoke(instance, actualParams);
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw new NgRuntimeException(e.getCause());
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object)
   */
  public Object call(final Object instance) {
    if (this.numberOfParameters != 0) return RuntimeMetaClassImpl.NOT_CALLED;
    
    try {
      return this.method.invoke(instance, NO_PARAMS);
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw new NgRuntimeException(e.getCause());
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, java.lang.Object)
   */
  public Object call(final Object instance, final Object p1) {
    if (this.numberOfParameters != 1) return RuntimeMetaClassImpl.NOT_CALLED;
    
    try {
      return this.method.invoke(instance, new Object[]{NgSystem.metaClassRegistry.getRuntimeMetaClass(p1).getParamObject(p1, this.parameterTypes[0])});
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw new NgRuntimeException(e.getCause());
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, boolean)
   */
  public Object call(final Object instance, final boolean p1) {
    if (this.numberOfParameters != 1) return RuntimeMetaClassImpl.NOT_CALLED;
    
    try {
      return this.method.invoke(instance, new Object[]{NgSystem.ngBooleanMetaClass.getParamObject(p1, this.parameterTypes[0])});
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw new NgRuntimeException(e.getCause());
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, char)
   */
  public Object call(final Object instance, final char p1) {
    if (this.numberOfParameters != 1) return RuntimeMetaClassImpl.NOT_CALLED;
    
    try {
      return this.method.invoke(instance, new Object[]{NgSystem.ngCharMetaClass.getParamObject(p1, this.parameterTypes[0])});
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw new NgRuntimeException(e.getCause());
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, byte)
   */
  public Object call(final Object instance, final byte p1) {
    if (this.numberOfParameters != 1) return RuntimeMetaClassImpl.NOT_CALLED;
    
    try {
      return this.method.invoke(instance, new Object[]{NgSystem.ngByteMetaClass.getParamObject(p1, this.parameterTypes[0])});
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw new NgRuntimeException(e.getCause());
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, short)
   */
  public Object call(final Object instance, final short p1) {
    if (this.numberOfParameters != 1) return RuntimeMetaClassImpl.NOT_CALLED;
    
    try {
      return this.method.invoke(instance, new Object[]{NgSystem.ngShortMetaClass.getParamObject(p1, this.parameterTypes[0])});
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw new NgRuntimeException(e.getCause());
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, int)
   */
  public Object call(final Object instance, final int p1) {
    if (this.numberOfParameters != 1) return RuntimeMetaClassImpl.NOT_CALLED;
    
    try {
      return this.method.invoke(instance, new Object[]{NgSystem.ngIntMetaClass.getParamObject(p1, this.parameterTypes[0])});
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw new NgRuntimeException(e.getCause());
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, long)
   */
  public Object call(final Object instance, final long p1) {
    if (this.numberOfParameters != 1) return RuntimeMetaClassImpl.NOT_CALLED;
    
    try {
      return this.method.invoke(instance, new Object[]{NgSystem.ngLongMetaClass.getParamObject(p1, this.parameterTypes[0])});
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw new NgRuntimeException(e.getCause());
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, float)
   */
  public Object call(final Object instance, final float p1) {
    if (this.numberOfParameters != 1) return RuntimeMetaClassImpl.NOT_CALLED;
    
    try {
      return this.method.invoke(instance, new Object[]{NgSystem.ngFloatMetaClass.getParamObject(p1, this.parameterTypes[0])});
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw new NgRuntimeException(e.getCause());
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, double)
   */
  public Object call(final Object instance, final double p1) {
    if (this.numberOfParameters != 1) return RuntimeMetaClassImpl.NOT_CALLED;
    
    try {
      return this.method.invoke(instance, new Object[]{NgSystem.ngDoubleMetaClass.getParamObject(p1, this.parameterTypes[0])});
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw new NgRuntimeException(e.getCause());
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, java.math.BigInteger)
   */
  public Object call(final Object instance, final BigInteger p1) {
    if (this.numberOfParameters != 1) return RuntimeMetaClassImpl.NOT_CALLED;
    
    try {
      return this.method.invoke(instance, new Object[]{NgSystem.bigIntegerMetaClass.getParamObject(p1, this.parameterTypes[0])});
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw new NgRuntimeException(e.getCause());
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, java.math.BigDecimal)
   */
  public Object call(final Object instance, final BigDecimal p1) {
    if (this.numberOfParameters != 1) return RuntimeMetaClassImpl.NOT_CALLED;
    
    try {
      return this.method.invoke(instance, new Object[]{NgSystem.bigDecimalMetaClass.getParamObject(p1, this.parameterTypes[0])});
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw new NgRuntimeException(e.getCause());
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object call(final Object instance, final Object p1, final Object p2) {
    if (this.numberOfParameters != 2) return RuntimeMetaClassImpl.NOT_CALLED;
        
    try {
      return this.method.invoke(instance, new Object[]{NgSystem.metaClassRegistry.getRuntimeMetaClass(p1).getParamObject(p1, this.parameterTypes[0]),
                                                       NgSystem.metaClassRegistry.getRuntimeMetaClass(p2).getParamObject(p2, this.parameterTypes[1])});
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw new NgRuntimeException(e.getCause());
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object call(final Object instance, final Object p1, final Object p2, final Object p3) {
    if (this.numberOfParameters != 3) return RuntimeMetaClassImpl.NOT_CALLED;
    
    try {
      return this.method.invoke(instance, new Object[]{NgSystem.metaClassRegistry.getRuntimeMetaClass(p1).getParamObject(p1, this.parameterTypes[0]),
                                                       NgSystem.metaClassRegistry.getRuntimeMetaClass(p2).getParamObject(p2, this.parameterTypes[1]),
                                                       NgSystem.metaClassRegistry.getRuntimeMetaClass(p3).getParamObject(p3, this.parameterTypes[2])});
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw new NgRuntimeException(e.getCause());
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object call(final Object instance, final Object p1, final Object p2, final Object p3, final Object p4) {
    if (this.numberOfParameters != 4) return RuntimeMetaClassImpl.NOT_CALLED;
    
    try {
      return this.method.invoke(instance, new Object[]{NgSystem.metaClassRegistry.getRuntimeMetaClass(p1).getParamObject(p1, this.parameterTypes[0]),
                                                       NgSystem.metaClassRegistry.getRuntimeMetaClass(p2).getParamObject(p2, this.parameterTypes[1]),
                                                       NgSystem.metaClassRegistry.getRuntimeMetaClass(p3).getParamObject(p3, this.parameterTypes[2]),
                                                       NgSystem.metaClassRegistry.getRuntimeMetaClass(p4).getParamObject(p4, this.parameterTypes[3])});
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final InvocationTargetException e) {
      throw new NgRuntimeException(e.getCause());
    }
  }

}
