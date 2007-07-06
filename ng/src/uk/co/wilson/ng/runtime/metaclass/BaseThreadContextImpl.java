package uk.co.wilson.ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection;

import ng.lang.NgRuntimeException;
import ng.lang.NgSystem;
import ng.runtime.*;

/**
 * @author John
 *
 */
public abstract class BaseThreadContextImpl implements ThreadContext {
  /**
   * @param instance
   * @return
   */
  protected InternalMetaClass getInternalMetaClassFor(final Object instance) {
    return getInternalMetaClassFor(NgSystem.metaClassRegistry.getRuntimeMetaClass(this, instance));
  }

  /**
   * @param metaClass
   * @return
   */
  protected InternalMetaClass getInternalMetaClassFor(final RuntimeMetaClass metaClass) {
    return metaClass.getInternalMetaClass();
  }
  
  public RuntimeMetaClass createMetaClassFor(Class theClass) {
    return createMetaClassFor(getInternalMetaClassFor(theClass), theClass);
  }
  
  public RuntimeMetaClass createMetaClassFor(RuntimeMetaClass metaClass, Class theClass) {
    return createMetaClassFor(getInternalMetaClassFor(metaClass), theClass);
        
  }
  
  protected RuntimeMetaClass createMetaClassFor(InternalMetaClass metaClass, Class theClass) {
    return metaClass.doCreateMetaClassFor(theClass);
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

  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param arguments
   * @return
   * @throws Throwable
   */
  protected Object invokeMethod(final InternalMetaClass metaClass, final Object instance, final String methodName, final Object[] arguments) throws Throwable {
    final Object result = metaClass.doInvokeMethod(this, instance, methodName, arguments);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   * @throws Throwable
   */
  protected Object invokeMethodQuick(final InternalMetaClass metaClass, final Object instance, final String methodName, final BigDecimal p1) throws Throwable {
  final Object result = metaClass.doInvokeMethodQuick(this, instance, methodName, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   * @throws Throwable
   */
  protected Object invokeMethodQuick(final InternalMetaClass metaClass, final Object instance, final String methodName, final BigInteger p1) throws Throwable {
  final Object result = metaClass.doInvokeMethodQuick(this, instance, methodName, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   * @throws Throwable
   */
  protected Object invokeMethodQuick(final InternalMetaClass metaClass, final Object instance, final String methodName, final boolean p1) throws Throwable {
  final Object result = metaClass.doInvokeMethodQuick(this, instance, methodName, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   * @throws Throwable
   */
  protected Object invokeMethodQuick(final InternalMetaClass metaClass, final Object instance, final String methodName, final byte p1) throws Throwable {
  final Object result = metaClass.doInvokeMethodQuick(this, instance, methodName, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   * @throws Throwable
   */
  protected Object invokeMethodQuick(final InternalMetaClass metaClass, final Object instance, final String methodName, final char p1) throws Throwable {
  final Object result = metaClass.doInvokeMethodQuick(this, instance, methodName, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   * @throws Throwable
   */
  protected Object invokeMethodQuick(final InternalMetaClass metaClass, final Object instance, final String methodName, final double p1) throws Throwable {
  final Object result = metaClass.doInvokeMethodQuick(this, instance, methodName, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   * @throws Throwable
   */
  protected Object invokeMethodQuick(final InternalMetaClass metaClass, final Object instance, final String methodName, final float p1) throws Throwable {
  final Object result = metaClass.doInvokeMethodQuick(this, instance, methodName, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   * @throws Throwable
   */
  protected Object invokeMethodQuick(final InternalMetaClass metaClass, final Object instance, final String methodName, final int p1) throws Throwable {
  final Object result = metaClass.doInvokeMethodQuick(this, instance, methodName, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   * @throws Throwable
   */
  protected Object invokeMethodQuick(final InternalMetaClass metaClass, final Object instance, final String methodName, final long p1) throws Throwable {
  final Object result = metaClass.doInvokeMethodQuick(this, instance, methodName, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   * @throws Throwable
   */
  protected Object invokeMethodQuick(final InternalMetaClass metaClass, final Object instance, final String methodName, final Object p1, final Object p2, final Object p3, final Object p4) throws Throwable {
  final Object result = metaClass.doInvokeMethodQuick(this, instance, methodName, p1, p2, p3, p4);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @return
   * @throws Throwable
   */
  protected Object invokeMethodQuick(final InternalMetaClass metaClass, final Object instance, final String methodName, final Object p1, final Object p2, final Object p3) throws Throwable {
  final Object result = metaClass.doInvokeMethodQuick(this, instance, methodName, p1, p2, p3);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @return
   * @throws Throwable
   */
  protected Object invokeMethodQuick(final InternalMetaClass metaClass, final Object instance, final String methodName, final Object p1, final Object p2) throws Throwable {
    final Object result = metaClass.doInvokeMethodQuick(this, instance, methodName, p1, p2);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   * @throws Throwable
   */
  protected Object invokeMethodQuick(final InternalMetaClass metaClass, final Object instance, final String methodName, final Object p1) throws Throwable {
  final Object result = metaClass.doInvokeMethodQuick(this, instance, methodName, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   * @throws Throwable
   */
  protected Object invokeMethodQuick(final InternalMetaClass metaClass, final Object instance, final String methodName, final short p1) throws Throwable {
  final Object result = metaClass.doInvokeMethodQuick(this, instance, methodName, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @return
   * @throws Throwable
   */
  protected Object invokeMethodQuick(final InternalMetaClass metaClass, final Object instance, final String methodName) throws Throwable {
  final Object result = metaClass.doInvokeMethodQuick(this, instance, methodName);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      
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
      final Object result = metaClass.doCall(this, instance, arguments);

      // TODO: make this error more detailed.
      if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");
  
      return result;
    }
  }

  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   * @throws Throwable
   */
  protected Object callQuick(final InternalMetaClass metaClass, final Object instance, final BigDecimal p1) throws Throwable {
  final Object result = metaClass.doCallQuick(this, instance, p1);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   * @throws Throwable
   */
  protected Object callQuick(final InternalMetaClass metaClass, final Object instance, final BigInteger p1) throws Throwable {
    final Object result = metaClass.doCallQuick(this, instance, p1);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   * @throws Throwable
   */
  protected Object callQuick(final InternalMetaClass metaClass, final Object instance, final boolean p1) throws Throwable {
    final Object result = metaClass.doCallQuick(this, instance, p1);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   * @throws Throwable
   */
  protected Object callQuick(final InternalMetaClass metaClass, final Object instance, final byte p1) throws Throwable {
    final Object result = metaClass.doCallQuick(this, instance, p1);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   * @throws Throwable
   */
  protected Object callQuick(final InternalMetaClass metaClass, final Object instance, final char p1) throws Throwable {
    final Object result = metaClass.doCallQuick(this, instance, p1);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   * @throws Throwable
   */
  protected Object callQuick(final InternalMetaClass metaClass, final Object instance, final double p1) throws Throwable {
    final Object result = metaClass.doCallQuick(this, instance, p1);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   * @throws Throwable
   */
  protected Object callQuick(final InternalMetaClass metaClass, final Object instance, final float p1) throws Throwable {
    final Object result = metaClass.doCallQuick(this, instance, p1);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   * @throws Throwable
   */
  protected Object callQuick(final InternalMetaClass metaClass, final Object instance, final int p1) throws Throwable {
    final Object result = metaClass.doCallQuick(this, instance, p1);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   * @throws Throwable
   */
  protected Object callQuick(final InternalMetaClass metaClass, final Object instance, final long p1) throws Throwable {
    final Object result = metaClass.doCallQuick(this, instance, p1);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   * @throws Throwable
   */
  protected Object callQuick(final InternalMetaClass metaClass, final Object instance, final Object p1, final Object p2, final Object p3, final Object p4) throws Throwable {
    final Object result = metaClass.doCallQuick(this, instance, p1, p2, p3, p4);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @param p2
   * @param p3
   * @return
   * @throws Throwable
   */
  protected Object callQuick(final InternalMetaClass metaClass, final Object instance, final Object p1, final Object p2, final Object p3) throws Throwable {
    final Object result = metaClass.doCallQuick(this, instance, p1, p2, p3);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @param p2
   * @return
   * @throws Throwable
   */
  protected Object callQuick(final InternalMetaClass metaClass, final Object instance, final Object p1, final Object p2) throws Throwable {
    final Object result = metaClass.doCallQuick(this, instance, p1, p2);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   * @throws Throwable
   */
  protected Object callQuick(final InternalMetaClass metaClass, final Object instance, final Object p1) throws Throwable {
    final Object result = metaClass.doCallQuick(this, instance, p1);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   * @throws Throwable
   */
  protected Object callQuick(final InternalMetaClass metaClass, final Object instance, final short p1) throws Throwable {
    final Object result = metaClass.doCallQuick(this, instance, p1);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @return
   * @throws Throwable
   */
  protected Object callQuick(final InternalMetaClass metaClass, final Object instance) throws Throwable {
    final Object result = metaClass.doCallQuick(this, instance);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " is not callable");

    return result;
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
  final Object result = metaClass.doGetProperty(this, instance, propertyName);
  
    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException("The property " +  propertyName + " was not found");

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
  final Object result = metaClass.doSetProperty(this, instance, propertyName, newValue);
    
    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException("The property " +  propertyName + " was not found");

    return result;
  }
  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#getField(java.lang.Object, java.lang.String)
   */
  public Object getField(final Object instance, final String fieldName) throws Throwable {
    return getField(getInternalMetaClassFor(instance), instance, fieldName);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#setField(java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object setField(final Object instance, final String fieldName, final Object newValue) throws Throwable {
    return setField(getInternalMetaClassFor(instance), instance, fieldName, newValue);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#getField(ng.runtime.RuntimeMetaClass, java.lang.Object, java.lang.String)
   */
  public Object getField(final RuntimeMetaClass metaClass, final Object instance, final String fieldName) throws Throwable {
    return getField(getInternalMetaClassFor(metaClass), instance, fieldName);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#setField(ng.runtime.RuntimeMetaClass, java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object setField(final RuntimeMetaClass metaClass, final Object instance, final String fieldName, final Object newValue) throws Throwable {
    return setField(getInternalMetaClassFor(metaClass), instance, fieldName, newValue);
  }

  /**
   * @param metaClass
   * @param instance
   * @param fieldName
   * @return
   * @throws Throwable
   */
  protected Object getField(final InternalMetaClass metaClass, final Object instance, final String fieldName) throws Throwable {
  final Object result = metaClass.doGetField(this, instance, fieldName);
  
    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException("The field " +  fieldName + " was not found");

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param fieldName
   * @param newValue
   * @return
   * @throws Throwable
   */
  protected Object setField(final InternalMetaClass metaClass, final Object instance, final String fieldName, final Object newValue) throws Throwable {
  final Object result = metaClass.doSetField(this, instance, fieldName, newValue);
    
    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException("The field " +  fieldName + " was not found");

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#asType(java.lang.Object, java.lang.Class)
   */
  public Object asType(Object instance, Class type) throws Throwable {
    return asType(getInternalMetaClassFor(instance), instance, type);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#asBoolean(java.lang.Object)
   */
  public boolean asBoolean(Object instance) throws Throwable {
    return asBoolean(getInternalMetaClassFor(instance), instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#asByte(java.lang.Object)
   */
  public byte asByte(Object instance) throws Throwable {
    return asByte(getInternalMetaClassFor(instance), instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#asChar(java.lang.Object)
   */
  public char asChar(Object instance) throws Throwable {
    return asChar(getInternalMetaClassFor(instance), instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#asDouble(java.lang.Object)
   */
  public double asDouble(Object instance) throws Throwable {
    return asDouble(getInternalMetaClassFor(instance), instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#asFloat(java.lang.Object)
   */
  public float asFloat(Object instance) throws Throwable {
    return asFloat(getInternalMetaClassFor(instance), instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#asInt(java.lang.Object)
   */
  public int asInt(Object instance) throws Throwable {
    return asInt(getInternalMetaClassFor(instance), instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#asLong(java.lang.Object)
   */
  public long asLong(Object instance) throws Throwable {
    return asLong(getInternalMetaClassFor(instance), instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#asShort(java.lang.Object)
   */
  public short asShort(Object instance) throws Throwable {
    return asShort(getInternalMetaClassFor(instance), instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#asType(ng.runtime.RuntimeMetaClass, java.lang.Object, java.lang.Class)
   */
  public Object asType(RuntimeMetaClass metaClass, Object instance, Class type) throws Throwable {
    return asType(getInternalMetaClassFor(metaClass), instance, type);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#asBoolean(ng.runtime.RuntimeMetaClass, java.lang.Object)
   */
  public boolean asBoolean(RuntimeMetaClass metaClass, Object instance) throws Throwable {
    return asBoolean(getInternalMetaClassFor(metaClass), instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#asByte(ng.runtime.RuntimeMetaClass, java.lang.Object)
   */
  public byte asByte(RuntimeMetaClass metaClass, Object instance) throws Throwable {
    return asByte(getInternalMetaClassFor(metaClass), instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#asChar(ng.runtime.RuntimeMetaClass, java.lang.Object)
   */
  public char asChar(RuntimeMetaClass metaClass, Object instance) throws Throwable {
    return asChar(getInternalMetaClassFor(metaClass), instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#asDouble(ng.runtime.RuntimeMetaClass, java.lang.Object)
   */
  public double asDouble(RuntimeMetaClass metaClass, Object instance) throws Throwable {
    return asDouble(getInternalMetaClassFor(metaClass), instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#asFloat(ng.runtime.RuntimeMetaClass, java.lang.Object)
   */
  public float asFloat(RuntimeMetaClass metaClass, Object instance) throws Throwable {
    return asFloat(getInternalMetaClassFor(metaClass), instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#asInt(ng.runtime.RuntimeMetaClass, java.lang.Object)
   */
  public int asInt(RuntimeMetaClass metaClass, Object instance) throws Throwable {
    return asInt(getInternalMetaClassFor(metaClass), instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#asLong(ng.runtime.RuntimeMetaClass, java.lang.Object)
   */
  public long asLong(RuntimeMetaClass metaClass, Object instance) throws Throwable {
    return asLong(getInternalMetaClassFor(metaClass), instance);
  }
  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#asShort(ng.runtime.RuntimeMetaClass, java.lang.Object)
   */
  public short asShort(RuntimeMetaClass metaClass, Object instance) throws Throwable {
    return asShort(getInternalMetaClassFor(metaClass), instance);
  }

  /**
   * @param metaClass
   * @param instance
   * @param type
   * @return
   * @throws Throwable
   */
  protected Object asType(InternalMetaClass metaClass, Object instance, Class type) throws Throwable {
    final Object result = metaClass.doAsType(this, instance, type);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " cannot be converted to " + type.getClass().getName());

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @return
   * @throws Throwable
   */
  protected boolean asBoolean(InternalMetaClass metaClass, Object instance) throws Throwable {
  final Object result = metaClass.doAsType(this, instance, boolean.class);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " cannot be converted to boolean");

    return ((NgBoolean)result).getBooleanValue();
  }

  /**
   * @param metaClass
   * @param instance
   * @return
   * @throws Throwable
   */
  protected byte asByte(InternalMetaClass metaClass, Object instance) throws Throwable {
    final Object result = metaClass.doAsType(this, instance, byte.class);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " cannot be converted to byte");

    return ((NgByte)result).getByteValue();
  }

  /**
   * @param metaClass
   * @param instance
   * @return
   * @throws Throwable
   */
  protected char asChar(InternalMetaClass metaClass, Object instance) throws Throwable {
    final Object result = metaClass.doAsType(this, instance, char.class);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " cannot be converted to char");

    return ((NgChar)result).getCharValue();
  }

  /**
   * @param metaClass
   * @param instance
   * @return
   * @throws Throwable
   */
  protected double asDouble(InternalMetaClass metaClass, Object instance) throws Throwable {
    final Object result = metaClass.doAsType(this, instance, double.class);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " cannot be converted to double");

    return ((NgDouble)result).getDoubleValue();
  }

  /**
   * @param metaClass
   * @param instance
   * @return
   * @throws Throwable
   */
  protected float asFloat(InternalMetaClass metaClass, Object instance) throws Throwable {
    final Object result = metaClass.doAsType(this, instance, float.class);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " cannot be converted to float");

    return ((NgFloat)result).getFloatValue();
  }

  /**
   * @param metaClass
   * @param instance
   * @return
   * @throws Throwable
   */
  protected int asInt(InternalMetaClass metaClass, Object instance) throws Throwable {
    final Object result = metaClass.doAsType(this, instance, int.class);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " cannot be converted to int");

    return ((NgInt)result).getIntValue();
  }

  /**
   * @param metaClass
   * @param instance
   * @return
   * @throws Throwable
   */
  protected long asLong(InternalMetaClass metaClass, Object instance) throws Throwable {
    final Object result = metaClass.doAsType(this, instance, long.class);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " cannot be converted to long");

    return ((NgLong)result).getLongValue();
  }
  /**
   * @param metaClass
   * @param instance
   * @return
   * @throws Throwable
   */
  protected short asShort(InternalMetaClass metaClass, Object instance) throws Throwable {
    final Object result = metaClass.doAsType(this, instance, short.class);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " cannot be converted to short");

    return ((NgShort)result).getShortValue();
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#getAt(java.lang.Object, java.lang.Object)
   */
  public Object getAt(Object instance, Object index) throws Throwable {
    return getAt(getInternalMetaClassFor(instance), instance, index);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#getAt(java.lang.Object, java.math.BigInteger)
   */
  public Object getAt(Object instance, BigInteger index) throws Throwable {
    return getAt(getInternalMetaClassFor(instance), instance, index);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#getAt(java.lang.Object, int)
   */
  public Object getAt(Object instance, int index) throws Throwable {
    return getAt(getInternalMetaClassFor(instance), instance, index);
  }
  
  /**
   * @param metaClass
   * @param instance
   * @param index
   * @return
   * @throws Throwable
   */
  public Object getAt(RuntimeMetaClass metaClass, Object instance, Object index) throws Throwable {
    return getAt(getInternalMetaClassFor(metaClass), instance, index);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#getAt(ng.runtime.RuntimeMetaClass, java.lang.Object, java.math.BigInteger)
   */
  public Object getAt(RuntimeMetaClass metaClass, Object instance, BigInteger index) throws Throwable {
    return getAt(getInternalMetaClassFor(metaClass), instance, index);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#getAt(ng.runtime.RuntimeMetaClass, java.lang.Object, int)
   */
  public Object getAt(RuntimeMetaClass metaClass, Object instance, int index) throws Throwable {
    return getAt(getInternalMetaClassFor(metaClass), instance, index);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#putAt(java.lang.Object, java.lang.Object)
   */
  public Object putAt(Object instance, Object index) throws Throwable {
    return putAt(getInternalMetaClassFor(instance), instance, index);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#putAt(java.lang.Object, java.math.BigInteger)
   */
  public Object putAt(Object instance, BigInteger index) throws Throwable {
    return putAt(getInternalMetaClassFor(instance), instance, index);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#putAt(java.lang.Object, int)
   */
  public Object putAt(Object instance, int index) throws Throwable {
    return putAt(getInternalMetaClassFor(instance), instance, index);
  }

  /**
   * @param metaClass
   * @param instance
   * @param index
   * @return
   * @throws Throwable
   */
  public Object putAt(RuntimeMetaClass metaClass, Object instance, Object index) throws Throwable {
    return putAt(getInternalMetaClassFor(metaClass), instance, index);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#putAt(ng.runtime.RuntimeMetaClass, java.lang.Object, java.math.BigInteger)
   */
  public Object putAt(RuntimeMetaClass metaClass, Object instance, BigInteger index) throws Throwable {
    return putAt(getInternalMetaClassFor(metaClass), instance, index);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#putAt(ng.runtime.RuntimeMetaClass, java.lang.Object, int)
   */
  public Object putAt(RuntimeMetaClass metaClass, Object instance, int index) throws Throwable {
    return putAt(getInternalMetaClassFor(metaClass), instance, index);
  }
  
  /**
   * @param metaClass
   * @param instance
   * @param index
   * @return
   * @throws Throwable
   */
  protected Object getAt(InternalMetaClass metaClass, Object instance, Object index) throws Throwable {
  final Object result = metaClass.doGetAt(this, instance, index);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " cannot be subscripted");

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param index
   * @return
   * @throws Throwable
   */
  protected Object getAt(InternalMetaClass metaClass, Object instance, int index) throws Throwable {
  final Object result = metaClass.doGetAt(this, instance, index);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " cannot be subscripted");

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param index
   * @return
   * @throws Throwable
   */
  protected Object getAt(InternalMetaClass metaClass, Object instance, BigInteger index) throws Throwable {
  final Object result = metaClass.doGetAt(this, instance, index);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " cannot be subscripted");

    return result;
  }

  /**
   * @param metaClass
   * @param instance
   * @param index
   * @return
   * @throws Throwable
   */
  protected Object putAt(InternalMetaClass metaClass, Object instance, Object index) throws Throwable {
  final Object result = metaClass.doPutAt(this, instance, index);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " cannot be subscripted");

    return result;
  }
    
  /**
   * @param metaClass
   * @param instance
   * @param index
   * @return
   * @throws Throwable
   */
  protected Object putAt(InternalMetaClass metaClass, Object instance, int index) throws Throwable {
  final Object result = metaClass.doPutAt(this, instance, index);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " cannot be subscripted");

    return result;
  }
  
  /**
   * @param metaClass
   * @param instance
   * @param index
   * @return
   * @throws Throwable
   */
  protected Object putAt(InternalMetaClass metaClass, Object instance, BigInteger index) throws Throwable {
  final Object result = metaClass.doPutAt(this, instance, index);

    // TODO: make this error more detailed.
    if (result == RuntimeMetaClassImpl.NOT_CALLED) throw new NgRuntimeException(metaClass.doGetTheClass(instance).getName() + " cannot be subscripted");

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#selectMethod(ng.runtime.RuntimeMetaClass, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, java.lang.String, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection selectMethod(RuntimeMetaClass metaClass, MetaMethodSelection currentSelection, String methodName, RuntimeMetaClass p1, RuntimeMetaClass p2, RuntimeMetaClass p3, RuntimeMetaClass p4) {
    return selectMethod(getInternalMetaClassFor(metaClass), currentSelection, methodName, p1, p2, p3, p4);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#selectMethod(ng.runtime.RuntimeMetaClass, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, java.lang.String, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection selectMethod(RuntimeMetaClass metaClass, MetaMethodSelection currentSelection, String methodName, RuntimeMetaClass p1, RuntimeMetaClass p2, RuntimeMetaClass p3) {
    return selectMethod(getInternalMetaClassFor(metaClass), currentSelection, methodName, p1, p2, p3);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#selectMethod(ng.runtime.RuntimeMetaClass, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, java.lang.String, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection selectMethod(RuntimeMetaClass metaClass, MetaMethodSelection currentSelection, String methodName, RuntimeMetaClass p1, RuntimeMetaClass p2) {
    return selectMethod(getInternalMetaClassFor(metaClass), currentSelection, methodName, p1, p2);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#selectMethod(ng.runtime.RuntimeMetaClass, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, java.lang.String, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection selectMethod(RuntimeMetaClass metaClass, MetaMethodSelection currentSelection, String methodName, RuntimeMetaClass p1) {
    return selectMethod(getInternalMetaClassFor(metaClass), currentSelection, methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#selectMethod(ng.runtime.RuntimeMetaClass, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, java.lang.String, ng.runtime.RuntimeMetaClass[])
   */
  public MetaMethodSelection selectMethod(RuntimeMetaClass metaClass, MetaMethodSelection currentSelection, String methodName, RuntimeMetaClass[] argumentMetaClasses) {
    return selectMethod(getInternalMetaClassFor(metaClass), currentSelection, methodName, argumentMetaClasses);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#selectMethod(ng.runtime.RuntimeMetaClass, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, java.lang.String)
   */
  public MetaMethodSelection selectMethod(RuntimeMetaClass metaClass, MetaMethodSelection currentSelection, String methodName) {
    return selectMethod(getInternalMetaClassFor(metaClass), currentSelection, methodName);
  }

  /**
   * @param metaClass
   * @param currentSelection
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  protected MetaMethodSelection selectMethod(InternalMetaClass metaClass, MetaMethodSelection currentSelection, String methodName, RuntimeMetaClass p1, RuntimeMetaClass p2, RuntimeMetaClass p3, RuntimeMetaClass p4) {
    return metaClass.doSelectMethod(this, currentSelection, methodName, p1, p2, p3, p4);
  }

  /**
   * @param metaClass
   * @param currentSelection
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  protected MetaMethodSelection selectMethod(InternalMetaClass metaClass, MetaMethodSelection currentSelection, String methodName, RuntimeMetaClass p1, RuntimeMetaClass p2, RuntimeMetaClass p3) {
    return metaClass.doSelectMethod(this, currentSelection, methodName, p1, p2, p3);
  }

  /**
   * @param metaClass
   * @param currentSelection
   * @param methodName
   * @param p1
   * @param p2
   * @return
   */
  protected MetaMethodSelection selectMethod(InternalMetaClass metaClass, MetaMethodSelection currentSelection, String methodName, RuntimeMetaClass p1, RuntimeMetaClass p2) {
    return metaClass.doSelectMethod(this, currentSelection, methodName, p1, p2);
  }

  /**
   * @param metaClass
   * @param currentSelection
   * @param methodName
   * @param p1
   * @return
   */
  protected MetaMethodSelection selectMethod(InternalMetaClass metaClass, MetaMethodSelection currentSelection, String methodName, RuntimeMetaClass p1) {
    return metaClass.doSelectMethod(this, currentSelection, methodName, p1);
  }

  /**
   * @param metaClass
   * @param currentSelection
   * @param methodName
   * @param argumentMetaClasses
   * @return
   */
  protected MetaMethodSelection selectMethod(InternalMetaClass metaClass, MetaMethodSelection currentSelection, String methodName, RuntimeMetaClass[] argumentMetaClasses) {
    return metaClass.doSelectMethod(this, currentSelection, methodName, argumentMetaClasses);
  }

  /**
   * @param metaClass
   * @param currentSelection
   * @param methodName
   * @return
   */
  protected MetaMethodSelection selectMethod(InternalMetaClass metaClass, MetaMethodSelection currentSelection, String methodName) {
    return metaClass.doSelectMethod(this, currentSelection, methodName);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#calculateConversionCost(ng.runtime.RuntimeMetaClass, java.lang.Class)
   */
  public int calculateConversionCost(RuntimeMetaClass metaClass, Class parameterType) {
    return calculateConversionCost(getInternalMetaClassFor(metaClass), parameterType);
  }

  /**
   * @param metaClass
   * @param parameterType
   * @return
   */
  protected int calculateConversionCost(InternalMetaClass metaClass, Class parameterType) {
    return metaClass.doCalculateConversionCost(parameterType);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#getParamObject(java.lang.Object, java.lang.Class)
   */
  public Object getParamObject(Object instance, Class theClass) {
    return getParamObject(getInternalMetaClassFor(instance), instance, theClass);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#getParamObject(ng.runtime.RuntimeMetaClass, java.lang.Object, java.lang.Class)
   */
  public Object getParamObject(RuntimeMetaClass metaClass, Object instance, Class theClass) {
    return getParamObject(getInternalMetaClassFor(metaClass), instance, theClass);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#getParamObject(boolean, java.lang.Class)
   */
  public Object getParamObject(boolean instance, Class theClass) {
    return getParamObject(getInternalMetaClassFor(NgSystem.ngBooleanMetaClass), instance, theClass);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#getParamObject(char, java.lang.Class)
   */
  public Object getParamObject(char instance, Class theClass) {
    return getParamObject(getInternalMetaClassFor(NgSystem.ngCharMetaClass), instance, theClass);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#getParamObject(byte, java.lang.Class)
   */
  public Object getParamObject(byte instance, Class theClass) {
    return getParamObject(getInternalMetaClassFor(NgSystem.ngByteMetaClass), instance, theClass);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#getParamObject(short, java.lang.Class)
   */
  public Object getParamObject(short instance, Class theClass) {
    return getParamObject(getInternalMetaClassFor(NgSystem.ngShortMetaClass), instance, theClass);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#getParamObject(int, java.lang.Class)
   */
  public Object getParamObject(int instance, Class theClass) {
    return getParamObject(getInternalMetaClassFor(NgSystem.ngIntMetaClass), instance, theClass);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#getParamObject(long, java.lang.Class)
   */
  public Object getParamObject(long instance, Class theClass) {
    return getParamObject(getInternalMetaClassFor(NgSystem.ngLongMetaClass), instance, theClass);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#getParamObject(float, java.lang.Class)
   */
  public Object getParamObject(float instance, Class theClass) {
    return getParamObject(getInternalMetaClassFor(NgSystem.ngFloatMetaClass), instance, theClass);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#getParamObject(double, java.lang.Class)
   */
  public Object getParamObject(double instance, Class theClass) {
    return getParamObject(getInternalMetaClassFor(NgSystem.ngDoubleMetaClass), instance, theClass);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#getParamObject(java.math.BigInteger, java.lang.Class)
   */
  public Object getParamObject(BigInteger instance, Class theClass) {
    return getParamObject(getInternalMetaClassFor(NgSystem.bigIntegerMetaClass), instance, theClass);
  }

  /* (non-Javadoc)
   * @see ng.runtime.ThreadContext#getParamObject(java.math.BigDecimal, java.lang.Class)
   */
  public Object getParamObject(BigDecimal instance, Class theClass) {
    return getParamObject(getInternalMetaClassFor(NgSystem.bigDecimalMetaClass), instance, theClass);
  }

  /**
   * @param metaClass
   * @param instance
   * @param theClass
   * @return
   */
  protected Object getParamObject(InternalMetaClass metaClass, Object instance, Class theClass) {
    return metaClass.doGetParamObject(instance, theClass);
  }

  /**
   * @param metaClass
   * @param instance
   * @param theClass
   * @return
   */
  protected Object getParamObject(InternalMetaClass metaClass, boolean instance, Class theClass) {
    return metaClass.doGetParamObject(instance, theClass);
  }

  /**
   * @param metaClass
   * @param instance
   * @param theClass
   * @return
   */
  protected Object getParamObject(InternalMetaClass metaClass, char instance, Class theClass) {
    return metaClass.doGetParamObject(instance, theClass);
  }

  /**
   * @param metaClass
   * @param instance
   * @param theClass
   * @return
   */
  protected Object getParamObject(InternalMetaClass metaClass, byte instance, Class theClass) {
    return metaClass.doGetParamObject(instance, theClass);
  }

  /**
   * @param metaClass
   * @param instance
   * @param theClass
   * @return
   */
  protected Object getParamObject(InternalMetaClass metaClass, short instance, Class theClass) {
    return metaClass.doGetParamObject(instance, theClass);
  }

  /**
   * @param metaClass
   * @param instance
   * @param theClass
   * @return
   */
  protected Object getParamObject(InternalMetaClass metaClass, int instance, Class theClass) {
    return metaClass.doGetParamObject(instance, theClass);
  }

  /**
   * @param metaClass
   * @param instance
   * @param theClass
   * @return
   */
  protected Object getParamObject(InternalMetaClass metaClass, long instance, Class theClass) {
    return metaClass.doGetParamObject(instance, theClass);
  }

  /**
   * @param metaClass
   * @param instance
   * @param theClass
   * @return
   */
  protected Object getParamObject(InternalMetaClass metaClass, float instance, Class theClass) {
    return metaClass.doGetParamObject(instance, theClass);
  }

  /**
   * @param metaClass
   * @param instance
   * @param theClass
   * @return
   */
  protected Object getParamObject(InternalMetaClass metaClass, double instance, Class theClass) {
    return metaClass.doGetParamObject(instance, theClass);
  }
}
