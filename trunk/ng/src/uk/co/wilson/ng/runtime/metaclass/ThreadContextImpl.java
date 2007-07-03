package uk.co.wilson.ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.lang.NgRuntimeException;
import ng.lang.NgSystem;
import ng.runtime.InternalMetaClass;
import ng.runtime.RuntimeMetaClass;
import ng.runtime.ThreadContext;

/**
 * @author John
 *
 */
public abstract class ThreadContextImpl implements ThreadContext {
  protected InternalMetaClass getInternalMetaClassFor(final Object instance) {
    return getInternalMetaClassFor(NgSystem.metaClassRegistry.getRuntimeMetaClass(this, instance));
  }

  protected InternalMetaClass getInternalMetaClassFor(final RuntimeMetaClass metaClass) {
    return metaClass.getInternalMetaClass();
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#getProperty(java.lang.Object, java.lang.String)
   */
  public Object getProperty(final Object instance, final String propertyName) throws Throwable {
    return getProperty(getInternalMetaClassFor(instance), instance, propertyName);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#setProperty(java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object setProperty(final Object instance, final String propertyName, final Object newValue) throws Throwable {
    return setProperty(getInternalMetaClassFor(instance), instance, propertyName, newValue);
  }
  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#getProperty(ng.runtime.RuntimeMetaClass, java.lang.Object, java.lang.String)
   */
  public Object getProperty(final RuntimeMetaClass metaClass, final Object instance, final String propertyName) throws Throwable {
    return getProperty(getInternalMetaClassFor(metaClass), instance, propertyName);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#setProperty(ng.runtime.RuntimeMetaClass, java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object setProperty(final RuntimeMetaClass metaClass, final Object instance, final String propertyName, final Object newValue) throws Throwable {
    return setProperty(getInternalMetaClassFor(metaClass), instance, propertyName, newValue);
  }

  /**
   * @param metaClass
   * @param instance
   * @param propertyName
   * @return
   * @throws Throwable
   */
  protected Object getProperty(final InternalMetaClass metaClass, final Object instance, final String propertyName) throws Throwable {
  Object result = metaClass.doGetGetPropertyCallable(instance, propertyName).callQuick(instance);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = metaClass.doGetGetFieldMetaMethod(instance, propertyName).callQuick(instance);
      
      // TODO: make this error more detailed.
      if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException("The property " +  propertyName + " was not found");
    }
    
    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param propertyName
   * @param newValue
   * @return
   * @throws Throwable
   */
  protected Object setProperty(final InternalMetaClass metaClass, final Object instance, final String propertyName, final Object newValue) throws Throwable {
    Object result = metaClass.doGetSetPropertyMetaMethod(instance, propertyName, newValue).callQuick(instance, newValue);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = metaClass.doGetSetFieldMetaMethod(instance, propertyName, newValue).callQuick(instance, newValue);
      
      // TODO: make this error more detailed.
      if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException("The property " +  propertyName + " was not found");
    }

      return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethod(java.lang.Object, java.lang.String, java.lang.Object[])
   */
  public Object invokeMethod(final Object instance, final String methodName, final Object[] arguments) throws Throwable {
    return invokeMethod(getInternalMetaClassFor(instance), instance, methodName, arguments);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethodQuick(java.lang.Object, java.lang.String, java.math.BigDecimal)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final BigDecimal p1) throws Throwable {
    return invokeMethodQuick(getInternalMetaClassFor(instance), instance, methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethodQuick(java.lang.Object, java.lang.String, java.math.BigInteger)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final BigInteger p1) throws Throwable {
    return invokeMethodQuick(getInternalMetaClassFor(instance), instance, methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethodQuick(java.lang.Object, java.lang.String, boolean)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final boolean p1) throws Throwable {
    return invokeMethodQuick(getInternalMetaClassFor(instance), instance, methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethodQuick(java.lang.Object, java.lang.String, byte)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final byte p1) throws Throwable {
    return invokeMethodQuick(getInternalMetaClassFor(instance), instance, methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethodQuick(java.lang.Object, java.lang.String, char)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final char p1) throws Throwable {
    return invokeMethodQuick(getInternalMetaClassFor(instance), instance, methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethodQuick(java.lang.Object, java.lang.String, double)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final double p1) throws Throwable {
    return invokeMethodQuick(getInternalMetaClassFor(instance), instance, methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethodQuick(java.lang.Object, java.lang.String, float)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final float p1) throws Throwable {
    return invokeMethodQuick(getInternalMetaClassFor(instance), instance, methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethodQuick(java.lang.Object, java.lang.String, int)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final int p1) throws Throwable {
    return invokeMethodQuick(getInternalMetaClassFor(instance), instance, methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethodQuick(java.lang.Object, java.lang.String, long)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final long p1) throws Throwable {
    return invokeMethodQuick(getInternalMetaClassFor(instance), instance, methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethodQuick(java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final Object p1, final Object p2, final Object p3, final Object p4) throws Throwable {
    return invokeMethodQuick(getInternalMetaClassFor(instance), instance, methodName, p1, p2, p3, p4);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethodQuick(java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final Object p1, final Object p2, final Object p3) throws Throwable {
    return invokeMethodQuick(getInternalMetaClassFor(instance), instance, methodName, p1, p2, p3);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethodQuick(java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final Object p1, final Object p2) throws Throwable {
    return invokeMethodQuick(getInternalMetaClassFor(instance), instance, methodName, p1, p2);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethodQuick(java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final Object p1) throws Throwable {
    return invokeMethodQuick(getInternalMetaClassFor(instance), instance, methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethodQuick(java.lang.Object, java.lang.String, short)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final short p1) throws Throwable {
    return invokeMethodQuick(getInternalMetaClassFor(instance), instance, methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethodQuick(java.lang.Object, java.lang.String)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName) throws Throwable {
    return invokeMethodQuick(getInternalMetaClassFor(instance), instance, methodName);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethod(ng.runtime.RuntimeMetaClass, java.lang.Object, java.lang.String, java.lang.Object[])
   */
  public Object invokeMethod(final RuntimeMetaClass metaClass, final Object instance, final String methodName, final Object[] arguments) throws Throwable {
    return invokeMethod(getInternalMetaClassFor(metaClass), instance, methodName, arguments);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethodQuick(ng.runtime.RuntimeMetaClass, java.lang.Object, java.lang.String, java.math.BigDecimal)
   */
  public Object invokeMethodQuick(final RuntimeMetaClass metaClass, final Object instance, final String methodName, final BigDecimal p1) throws Throwable {
    return invokeMethodQuick(getInternalMetaClassFor(metaClass), instance, methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethodQuick(ng.runtime.RuntimeMetaClass, java.lang.Object, java.lang.String, java.math.BigInteger)
   */
  public Object invokeMethodQuick(final RuntimeMetaClass metaClass, final Object instance, final String methodName, final BigInteger p1) throws Throwable {
    return invokeMethodQuick(getInternalMetaClassFor(metaClass), instance, methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethodQuick(ng.runtime.RuntimeMetaClass, java.lang.Object, java.lang.String, boolean)
   */
  public Object invokeMethodQuick(final RuntimeMetaClass metaClass, final Object instance, final String methodName, final boolean p1) throws Throwable {
    return invokeMethodQuick(getInternalMetaClassFor(metaClass), instance, methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethodQuick(ng.runtime.RuntimeMetaClass, java.lang.Object, java.lang.String, byte)
   */
  public Object invokeMethodQuick(final RuntimeMetaClass metaClass, final Object instance, final String methodName, final byte p1) throws Throwable {
    return invokeMethodQuick(getInternalMetaClassFor(metaClass), instance, methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethodQuick(ng.runtime.RuntimeMetaClass, java.lang.Object, java.lang.String, char)
   */
  public Object invokeMethodQuick(final RuntimeMetaClass metaClass, final Object instance, final String methodName, final char p1) throws Throwable {
    return invokeMethodQuick(getInternalMetaClassFor(metaClass), instance, methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethodQuick(ng.runtime.RuntimeMetaClass, java.lang.Object, java.lang.String, double)
   */
  public Object invokeMethodQuick(final RuntimeMetaClass metaClass, final Object instance, final String methodName, final double p1) throws Throwable {
    return invokeMethodQuick(getInternalMetaClassFor(metaClass), instance, methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethodQuick(ng.runtime.RuntimeMetaClass, java.lang.Object, java.lang.String, float)
   */
  public Object invokeMethodQuick(final RuntimeMetaClass metaClass, final Object instance, final String methodName, final float p1) throws Throwable {
    return invokeMethodQuick(getInternalMetaClassFor(metaClass), instance, methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethodQuick(ng.runtime.RuntimeMetaClass, java.lang.Object, java.lang.String, int)
   */
  public Object invokeMethodQuick(final RuntimeMetaClass metaClass, final Object instance, final String methodName, final int p1) throws Throwable {
    return invokeMethodQuick(getInternalMetaClassFor(metaClass), instance, methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethodQuick(ng.runtime.RuntimeMetaClass, java.lang.Object, java.lang.String, long)
   */
  public Object invokeMethodQuick(final RuntimeMetaClass metaClass, final Object instance, final String methodName, final long p1) throws Throwable {
    return invokeMethodQuick(getInternalMetaClassFor(metaClass), instance, methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethodQuick(ng.runtime.RuntimeMetaClass, java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object invokeMethodQuick(final RuntimeMetaClass metaClass, final Object instance, final String methodName, final Object p1, final Object p2, final Object p3, final Object p4) throws Throwable {
    return invokeMethodQuick(getInternalMetaClassFor(metaClass), instance, methodName, p1, p2, p3, p4);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethodQuick(ng.runtime.RuntimeMetaClass, java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object invokeMethodQuick(final RuntimeMetaClass metaClass, final Object instance, final String methodName, final Object p1, final Object p2, final Object p3) throws Throwable {
    return invokeMethodQuick(getInternalMetaClassFor(metaClass), instance, methodName, p1, p2, p3);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethodQuick(ng.runtime.RuntimeMetaClass, java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object)
   */
  public Object invokeMethodQuick(final RuntimeMetaClass metaClass, final Object instance, final String methodName, final Object p1, final Object p2) throws Throwable {
    return invokeMethodQuick(getInternalMetaClassFor(metaClass), instance, methodName, p1, p2);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethodQuick(ng.runtime.RuntimeMetaClass, java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object invokeMethodQuick(final RuntimeMetaClass metaClass, final Object instance, final String methodName, final Object p1) throws Throwable {
    return invokeMethodQuick(getInternalMetaClassFor(metaClass), instance, methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethodQuick(ng.runtime.RuntimeMetaClass, java.lang.Object, java.lang.String, short)
   */
  public Object invokeMethodQuick(final RuntimeMetaClass metaClass, final Object instance, final String methodName, final short p1) throws Throwable {
    return invokeMethodQuick(getInternalMetaClassFor(metaClass), instance, methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#invokeMethodQuick(ng.runtime.RuntimeMetaClass, java.lang.Object, java.lang.String)
   */
  public Object invokeMethodQuick(final RuntimeMetaClass metaClass, final Object instance, final String methodName) throws Throwable {
    return invokeMethodQuick(getInternalMetaClassFor(metaClass), instance, methodName);
  }

  protected Object invokeMethod(final InternalMetaClass metaClass, final Object instance, final String methodName, final Object[] arguments) throws Throwable {
    switch (arguments.length) {
    case 0:
      return invokeMethodQuick(metaClass, instance, methodName);

    case 1:
      return invokeMethodQuick(metaClass, instance, methodName, arguments[0]);

    case 2:
      return invokeMethodQuick(metaClass, instance, methodName, arguments[0], arguments[1]);

    case 3:
      return invokeMethodQuick(metaClass, instance, methodName, arguments[0], arguments[1], arguments[2]);

    case 4:
      return invokeMethodQuick(metaClass, instance, methodName, arguments[0], arguments[1], arguments[2], arguments[3]);

    default:
      Object result = metaClass.doGetCallable(instance, methodName, arguments).call(instance, arguments);

      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = metaClass.doGetGetPropertyCallable(instance, methodName).callQuick(instance);
        
        if (result != RuntimeMetaClassImpl.NOT_CALLED) {
          return NgSystem.metaClassRegistry.getRuntimeMetaClass(result).call(instance, arguments);
        }
        
        // TODO: make this error more detailed.
        throw new NgRuntimeException("The method " +  methodName + " is not found");
      }
  
      return result;
    }
  }

  protected Object invokeMethodQuick(final InternalMetaClass metaClass, final Object instance, final String methodName, final BigDecimal p1) throws Throwable {
    Object result = metaClass.doGetCallableQuick(instance, methodName, p1).callQuick(instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = metaClass.doGetGetPropertyCallable(instance, methodName).callQuick(instance);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return callQuick(getInternalMetaClassFor(result), result, p1);
      }
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  protected Object invokeMethodQuick(final InternalMetaClass metaClass, final Object instance, final String methodName, final BigInteger p1) throws Throwable {
    Object result = metaClass.doGetCallableQuick(instance, methodName, p1).callQuick(instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = metaClass.doGetGetPropertyCallable(instance, methodName).callQuick(instance);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return callQuick(getInternalMetaClassFor(result), result, p1);
      }
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  protected Object invokeMethodQuick(final InternalMetaClass metaClass, final Object instance, final String methodName, final boolean p1) throws Throwable {
    Object result = metaClass.doGetCallableQuick(instance, methodName, p1).callQuick(instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = metaClass.doGetGetPropertyCallable(instance, methodName).callQuick(instance);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return callQuick(getInternalMetaClassFor(result), result, p1);
      }
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  protected Object invokeMethodQuick(final InternalMetaClass metaClass, final Object instance, final String methodName, final byte p1) throws Throwable {
    Object result = metaClass.doGetCallableQuick(instance, methodName, p1).callQuick(instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = metaClass.doGetGetPropertyCallable(instance, methodName).callQuick(instance);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return callQuick(getInternalMetaClassFor(result), result, p1);
      }
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  protected Object invokeMethodQuick(final InternalMetaClass metaClass, final Object instance, final String methodName, final char p1) throws Throwable {
    Object result = metaClass.doGetCallableQuick(instance, methodName, p1).callQuick(instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = metaClass.doGetGetPropertyCallable(instance, methodName).callQuick(instance);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return callQuick(getInternalMetaClassFor(result), result, p1);
      }
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  protected Object invokeMethodQuick(final InternalMetaClass metaClass, final Object instance, final String methodName, final double p1) throws Throwable {
    Object result = metaClass.doGetCallableQuick(instance, methodName, p1).callQuick(instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = metaClass.doGetGetPropertyCallable(instance, methodName).callQuick(instance);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return callQuick(getInternalMetaClassFor(result), result, p1);
      }
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  protected Object invokeMethodQuick(final InternalMetaClass metaClass, final Object instance, final String methodName, final float p1) throws Throwable {
    Object result = metaClass.doGetCallableQuick(instance, methodName, p1).callQuick(instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = metaClass.doGetGetPropertyCallable(instance, methodName).callQuick(instance);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return callQuick(getInternalMetaClassFor(result), result, p1);
      }
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  protected Object invokeMethodQuick(final InternalMetaClass metaClass, final Object instance, final String methodName, final int p1) throws Throwable {
    Object result = metaClass.doGetCallableQuick(instance, methodName, p1).callQuick(instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = metaClass.doGetGetPropertyCallable(instance, methodName).callQuick(instance);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return callQuick(getInternalMetaClassFor(result), result, p1);
      }
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  protected Object invokeMethodQuick(final InternalMetaClass metaClass, final Object instance, final String methodName, final long p1) throws Throwable {
    Object result = metaClass.doGetCallableQuick(instance, methodName, p1).callQuick(instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = metaClass.doGetGetPropertyCallable(instance, methodName).callQuick(instance);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return callQuick(getInternalMetaClassFor(result), result, p1);
      }
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  protected Object invokeMethodQuick(final InternalMetaClass metaClass, final Object instance, final String methodName, final Object p1, final Object p2, final Object p3, final Object p4) throws Throwable {
    Object result = metaClass.doGetCallableQuick(instance, methodName, p1, p2, p3, p4).callQuick(instance, p1, p2, p3, p4);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = metaClass.doGetGetPropertyCallable(instance, methodName).callQuick(instance);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return callQuick(getInternalMetaClassFor(result), result, p1, p2, p3, p4);
      }
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  protected Object invokeMethodQuick(final InternalMetaClass metaClass, final Object instance, final String methodName, final Object p1, final Object p2, final Object p3) throws Throwable {
    Object result = metaClass.doGetCallableQuick(instance, methodName, p1, p2, p3).callQuick(instance, p1, p2, p3);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = metaClass.doGetGetPropertyCallable(instance, methodName).callQuick(instance);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return callQuick(getInternalMetaClassFor(result), result, p1, p2, p3);
      }
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  protected Object invokeMethodQuick(final InternalMetaClass metaClass, final Object instance, final String methodName, final Object p1, final Object p2) throws Throwable {
    Object result = metaClass.doGetCallableQuick(instance, methodName, p1, p2).callQuick(instance, p1, p2);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = metaClass.doGetGetPropertyCallable(instance, methodName).callQuick(instance);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return callQuick(getInternalMetaClassFor(result), result, p1, p2);
      }
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  protected Object invokeMethodQuick(final InternalMetaClass metaClass, final Object instance, final String methodName, final Object p1) throws Throwable {
  Object result = metaClass.doGetCallableQuick(instance, methodName, p1).callQuick(instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = metaClass.doGetGetPropertyCallable(instance, methodName).callQuick(instance);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return callQuick(getInternalMetaClassFor(result), result, p1);
      }
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  protected Object invokeMethodQuick(final InternalMetaClass metaClass, final Object instance, final String methodName, final short p1) throws Throwable {
    Object result = metaClass.doGetCallableQuick(instance, methodName, p1).callQuick(instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = metaClass.doGetGetPropertyCallable(instance, methodName).callQuick(instance);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return callQuick(getInternalMetaClassFor(result), result, p1);
      }
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  protected Object invokeMethodQuick(final InternalMetaClass metaClass, final Object instance, final String methodName) throws Throwable {
    Object result = metaClass.doGetCallableQuick(instance, methodName).callQuick(instance);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = metaClass.doGetGetPropertyCallable(instance, methodName).callQuick(instance);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return callQuick(getInternalMetaClassFor(result), result);
      }
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#call.lang.Object, java.lang.Object[])
   */
  public Object call(final Object instance, final Object[] arguments) throws Throwable {
    return call(getInternalMetaClassFor(instance), instance, arguments);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#callQuick(java.lang.Object, java.math.BigDecimal)
   */
  public Object callQuick(final Object instance, final BigDecimal p1) throws Throwable {
    return callQuick(getInternalMetaClassFor(instance), instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#callQuick(java.lang.Object, java.math.BigInteger)
   */
  public Object callQuick(final Object instance, final BigInteger p1) throws Throwable {
    return callQuick(getInternalMetaClassFor(instance), instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#callQuick(java.lang.Object, boolean)
   */
  public Object callQuick(final Object instance, final boolean p1) throws Throwable {
    return callQuick(getInternalMetaClassFor(instance), instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#callQuick(java.lang.Object, byte)
   */
  public Object callQuick(final Object instance, final byte p1) throws Throwable {
    return callQuick(getInternalMetaClassFor(instance), instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#callQuick(java.lang.Object, char)
   */
  public Object callQuick(final Object instance, final char p1) throws Throwable {
    return callQuick(getInternalMetaClassFor(instance), instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#callQuick(java.lang.Object, double)
   */
  public Object callQuick(final Object instance, final double p1) throws Throwable {
    return callQuick(getInternalMetaClassFor(instance), instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#callQuick(java.lang.Object, float)
   */
  public Object callQuick(final Object instance, final float p1) throws Throwable {
    return callQuick(getInternalMetaClassFor(instance), instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#callQuick(java.lang.Object, int)
   */
  public Object callQuick(final Object instance, final int p1) throws Throwable {
    return callQuick(getInternalMetaClassFor(instance), instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#callQuick(java.lang.Object, long)
   */
  public Object callQuick(final Object instance, final long p1) throws Throwable {
    return callQuick(getInternalMetaClassFor(instance), instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#callQuick(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final Object instance, final Object p1, final Object p2, final Object p3, final Object p4) throws Throwable {
    return callQuick(getInternalMetaClassFor(instance), instance, p1, p2, p3, p4);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#callQuick(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final Object instance, final Object p1, final Object p2, final Object p3) throws Throwable {
    return callQuick(getInternalMetaClassFor(instance), instance, p1, p2, p3);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#callQuick(java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final Object instance, final Object p1, final Object p2) throws Throwable {
    return callQuick(getInternalMetaClassFor(instance), instance, p1, p2);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#callQuick(java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final Object instance, final Object p1) throws Throwable {
    return callQuick(getInternalMetaClassFor(instance), instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#callQuick(java.lang.Object, short)
   */
  public Object callQuick(final Object instance, final short p1) throws Throwable {
    return callQuick(getInternalMetaClassFor(instance), instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#callQuick(java.lang.Object)
   */
  public Object callQuick(final Object instance) throws Throwable {
    return callQuick(getInternalMetaClassFor(instance), instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#call(lang.Object, java.lang.Object[])
   */
  public Object call(final RuntimeMetaClass metaClass, final Object instance, final Object[] arguments) throws Throwable {
    return call(getInternalMetaClassFor(metaClass), instance, arguments);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#callQuick(ng.runtime.RuntimeMetaClass java.lang.Object, java.math.BigDecimal)
   */
  public Object callQuick(final RuntimeMetaClass metaClass, final Object instance, final BigDecimal p1) throws Throwable {
    return callQuick(getInternalMetaClassFor(metaClass), instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#callQuick(ng.runtime.RuntimeMetaClass java.lang.Object, java.math.BigInteger)
   */
  public Object callQuick(final RuntimeMetaClass metaClass, final Object instance, final BigInteger p1) throws Throwable {
    return callQuick(getInternalMetaClassFor(metaClass), instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#callQuick(ng.runtime.RuntimeMetaClass java.lang.Object, boolean)
   */
  public Object callQuick(final RuntimeMetaClass metaClass, final Object instance, final boolean p1) throws Throwable {
    return callQuick(getInternalMetaClassFor(metaClass), instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#callQuick(ng.runtime.RuntimeMetaClass java.lang.Object, byte)
   */
  public Object callQuick(final RuntimeMetaClass metaClass, final Object instance, final byte p1) throws Throwable {
    return callQuick(getInternalMetaClassFor(metaClass), instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#callQuick(ng.runtime.RuntimeMetaClass java.lang.Object, char)
   */
  public Object callQuick(final RuntimeMetaClass metaClass, final Object instance, final char p1) throws Throwable {
    return callQuick(getInternalMetaClassFor(metaClass), instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#callQuick(ng.runtime.RuntimeMetaClass java.lang.Object, double)
   */
  public Object callQuick(final RuntimeMetaClass metaClass, final Object instance, final double p1) throws Throwable {
    return callQuick(getInternalMetaClassFor(metaClass), instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#callQuick(ng.runtime.RuntimeMetaClass java.lang.Object, float)
   */
  public Object callQuick(final RuntimeMetaClass metaClass, final Object instance, final float p1) throws Throwable {
    return callQuick(getInternalMetaClassFor(metaClass), instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#callQuick(ng.runtime.RuntimeMetaClass java.lang.Object, int)
   */
  public Object callQuick(final RuntimeMetaClass metaClass, final Object instance, final int p1) throws Throwable {
    return callQuick(getInternalMetaClassFor(metaClass), instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#callQuick(ng.runtime.RuntimeMetaClass java.lang.Object, long)
   */
  public Object callQuick(final RuntimeMetaClass metaClass, final Object instance, final long p1) throws Throwable {
    return callQuick(getInternalMetaClassFor(metaClass), instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#callQuick(ng.runtime.RuntimeMetaClass java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final RuntimeMetaClass metaClass, final Object instance, final Object p1, final Object p2, final Object p3, final Object p4) throws Throwable {
    return callQuick(getInternalMetaClassFor(metaClass), instance, p1, p2, p3, p4);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#callQuick(ng.runtime.RuntimeMetaClass java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final RuntimeMetaClass metaClass, final Object instance, final Object p1, final Object p2, final Object p3) throws Throwable {
    return callQuick(getInternalMetaClassFor(metaClass), instance, p1, p2, p3);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#callQuick(ng.runtime.RuntimeMetaClass java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final RuntimeMetaClass metaClass, final Object instance, final Object p1, final Object p2) throws Throwable {
    return callQuick(getInternalMetaClassFor(metaClass), instance, p1, p2);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#callQuick(ng.runtime.RuntimeMetaClass java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final RuntimeMetaClass metaClass, final Object instance, final Object p1) throws Throwable {
    return callQuick(getInternalMetaClassFor(metaClass), instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#callQuick(ng.runtime.RuntimeMetaClass java.lang.Object, short)
   */
  public Object callQuick(final RuntimeMetaClass metaClass, final Object instance, final short p1) throws Throwable {
    return callQuick(getInternalMetaClassFor(metaClass), instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#callQuick(ng.runtime.RuntimeMetaClass java.lang.Object)
   */
  public Object callQuick(final RuntimeMetaClass metaClass, final Object instance) throws Throwable {
    return callQuick(getInternalMetaClassFor(metaClass), instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#call(ng.runtime.InternalMetaClass, java.lang.Object, java.lang.Object[])
   */
  protected Object call(final InternalMetaClass metaClass, final Object instance, final Object[] arguments) throws Throwable {
    switch (arguments.length) {
    case 0:
      return callQuick(metaClass, instance);

    case 1:
      return callQuick(metaClass, instance, arguments[0]);

    case 2:
      return callQuick(metaClass, instance, arguments[0], arguments[1]);

    case 3:
      return callQuick(metaClass, instance, arguments[0], arguments[1], arguments[2]);

    case 4:
      return callQuick(metaClass, instance, arguments[0], arguments[1], arguments[2], arguments[3]);

    default:
      final Object result = metaClass.doGetCallable(instance).call(this, instance, arguments);

      // TODO: make this error more detailed.
      if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");
  
      return result;
    }
  }

  protected Object callQuick(final InternalMetaClass metaClass, final Object instance, final BigDecimal p1) throws Throwable {
  final Object result = metaClass.doGetCallable(instance).callQuick(this, instance, p1);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");

    return result;
  }

  protected Object callQuick(final InternalMetaClass metaClass, final Object instance, final BigInteger p1) throws Throwable {
    final Object result = metaClass.doGetCallable(instance).callQuick(instance, p1);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");

    return result;
  }

  protected Object callQuick(final InternalMetaClass metaClass, final Object instance, final boolean p1) throws Throwable {
    final Object result = metaClass.doGetCallable(instance).callQuick(this, instance, p1);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");

    return result;
  }

  protected Object callQuick(final InternalMetaClass metaClass, final Object instance, final byte p1) throws Throwable {
    final Object result = metaClass.doGetCallable(instance).callQuick(this, instance, p1);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");

    return result;
  }

  protected Object callQuick(final InternalMetaClass metaClass, final Object instance, final char p1) throws Throwable {
    final Object result = metaClass.doGetCallable(instance).callQuick(this, instance, p1);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");

    return result;
  }

  protected Object callQuick(final InternalMetaClass metaClass, final Object instance, final double p1) throws Throwable {
    final Object result = metaClass.doGetCallable(instance).callQuick(this, instance, p1);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");

    return result;
  }

  protected Object callQuick(final InternalMetaClass metaClass, final Object instance, final float p1) throws Throwable {
    final Object result = metaClass.doGetCallable(instance).callQuick(this, instance, p1);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");

    return result;
  }

  protected Object callQuick(final InternalMetaClass metaClass, final Object instance, final int p1) throws Throwable {
    final Object result = metaClass.doGetCallable(instance).callQuick(this, instance, p1);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");

    return result;
  }

  protected Object callQuick(final InternalMetaClass metaClass, final Object instance, final long p1) throws Throwable {
    final Object result = metaClass.doGetCallable(instance).callQuick(this, instance, p1);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");

    return result;
  }

  protected Object callQuick(final InternalMetaClass metaClass, final Object instance, final Object p1, final Object p2, final Object p3, final Object p4) throws Throwable {
    final Object result = metaClass.doGetCallable(instance).callQuick(this, instance, p1, p2, p3, p4);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");

    return result;
  }

  protected Object callQuick(final InternalMetaClass metaClass, final Object instance, final Object p1, final Object p2, final Object p3) throws Throwable {
    final Object result = metaClass.doGetCallable(instance).callQuick(this, instance, p1, p2, p3);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");

    return result;
  }

  protected Object callQuick(final InternalMetaClass metaClass, final Object instance, final Object p1, final Object p2) throws Throwable {
    final Object result = metaClass.doGetCallable(instance).callQuick(this, instance, p1, p2);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");

    return result;
  }

  protected Object callQuick(final InternalMetaClass metaClass, final Object instance, final Object p1) throws Throwable {
    final Object result = metaClass.doGetCallable(instance).callQuick(this, instance, p1);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");

    return result;
  }

  protected Object callQuick(final InternalMetaClass metaClass, final Object instance, final short p1) throws Throwable {
    final Object result = metaClass.doGetCallable(instance).callQuick(this, instance, p1);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");

    return result;
  }

  protected Object callQuick(final InternalMetaClass metaClass, final Object instance) throws Throwable {
    final Object result = metaClass.doGetCallable(instance).callQuick(this, instance);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");

    return result;
  }
}
