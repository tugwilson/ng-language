package uk.co.wilson.ng.runtime.metaclass.reflection.methods;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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
   * @see ng.runtime.MetaMethod#call(java.lang.final Object, java.lang.final Object[])
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
   * @see ng.runtime.MetaMethod#call(java.lang.final Object)
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
   * @see ng.runtime.MetaMethod#call(java.lang.final Object, java.lang.final Object)
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
   * @see ng.runtime.MetaMethod#call(java.lang.final Object, java.lang.final Object, java.lang.final Object)
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
   * @see ng.runtime.MetaMethod#call(java.lang.final Object, java.lang.final Object, java.lang.final Object, java.lang.final Object)
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
   * @see ng.runtime.MetaMethod#call(java.lang.final Object, java.lang.final Object, java.lang.final Object, java.lang.final Object, java.lang.final Object)
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
