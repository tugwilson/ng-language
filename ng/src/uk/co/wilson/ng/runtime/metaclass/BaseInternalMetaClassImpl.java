package uk.co.wilson.ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.Callable;
import ng.runtime.InstanceHandler;
import ng.runtime.InternalMetaClass;
import ng.runtime.MetaClass;
import ng.runtime.NgInt;
import ng.runtime.RuntimeMetaClass;
import ng.runtime.ThreadContext;
import uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection;
import uk.co.wilson.ng.runtime.metaclass.reflection.InstanceReflectionHandler;

/*
 * Created on 4 Jul 2007
 *
 * Copyright 2007 John G. Wilson
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

/**
 * @author John
 *
 */
public abstract class BaseInternalMetaClassImpl implements InternalMetaClass {
  final protected InstanceHandler instanceHandler;
  
  /**
   * @param theClass
   */
  public BaseInternalMetaClassImpl(final Class theClass) {
    this.instanceHandler = new InstanceReflectionHandler(theClass);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doGetParamObject(java.lang.Object, java.lang.Class)
   */
  public Object doGetParamObject(final Object instance, final Class theClass) {
    return instance;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaClassFor(java.lang.Class)
   */
  public MetaClass doGetMetaClassFor(final Class theClass) {
    return this.instanceHandler.getMetaClassFor(theClass);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doGetTheClass(java.lang.Object)
   */
  public Class doGetTheClass(final Object instance) {
    return this.instanceHandler.getTheClass(instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doCalculateConversionCost(java.lang.Class)
   */
  public int doCalculateConversionCost(final Class parameterType) {
   return this.instanceHandler.calculateConversionCost(parameterType);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doInvokeConstructor(java.lang.Class, java.lang.Object[])
   */
  public Object doInvokeConstructor(final Class theClass, final Object[] arguments) {
    return this.instanceHandler.invokeConstructor(theClass, arguments);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doSelectMethod(uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection, java.lang.String, ng.runtime.RuntimeMetaClass[])
   */
  public MetaMethodSelection doSelectMethod(final MetaMethodSelection currentSelection, final String methodName, final RuntimeMetaClass[] argumentMetaClasses) {
    return this.instanceHandler.selectMethod(currentSelection, methodName, argumentMetaClasses);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doSelectMethod(uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection, java.lang.String)
   */
  public MetaMethodSelection doSelectMethod(final MetaMethodSelection currentSelection, final String methodName) {
    return this.instanceHandler.selectMethod(currentSelection, methodName);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doSelectMethod(uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection, java.lang.String, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection doSelectMethod(final MetaMethodSelection currentSelection, final String methodName, final RuntimeMetaClass p1) {
    return this.instanceHandler.selectMethod(currentSelection, methodName);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doSelectMethod(uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection, java.lang.String, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection doSelectMethod(final MetaMethodSelection currentSelection, final String methodName, final RuntimeMetaClass p1, final RuntimeMetaClass p2) {
    return this.instanceHandler.selectMethod(currentSelection, methodName, p1, p2);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doSelectMethod(uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection, java.lang.String, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection doSelectMethod(final MetaMethodSelection currentSelection, final String methodName, final RuntimeMetaClass p1, final RuntimeMetaClass p2, final RuntimeMetaClass p3) {
    return this.instanceHandler.selectMethod(currentSelection, methodName, p1, p2, p3);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doSelectMethod(uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection, java.lang.String, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection doSelectMethod(final MetaMethodSelection currentSelection, final String methodName, final RuntimeMetaClass p1, final RuntimeMetaClass p2, final RuntimeMetaClass p3, final RuntimeMetaClass p4) {
    return this.instanceHandler.selectMethod(currentSelection, methodName, p1, p2, p3, p4);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doInvokeMethod(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, java.lang.Object[])
   */
  public Object doInvokeMethod(final ThreadContext tc, final Object instance, final String methodName, final Object[] arguments) throws Throwable {
    switch (arguments.length) {
    case 0:
      return doInvokeMethodQuick(tc, instance, methodName);

    case 1:
      return doInvokeMethodQuick(tc, instance, methodName, arguments[0]);

    case 2:
      return doInvokeMethodQuick(tc, instance, methodName, arguments[0], arguments[1]);

    case 3:
      return doInvokeMethodQuick(tc, instance, methodName, arguments[0], arguments[1], arguments[2]);

    case 4:
      return doInvokeMethodQuick(tc, instance, methodName, arguments[0], arguments[1], arguments[2], arguments[3]);

    default:
      Object result = doGetMetaMethodFor(methodName, arguments).call(tc, instance, arguments);

      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = doGetProperty(tc, instance, methodName);
        
        if (result != RuntimeMetaClassImpl.NOT_CALLED) {
          return tc.callQuick(result, arguments);
        }
      }
  
      return result;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String)
   */
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName) throws Throwable {
  Object result = doGetMetaMethodQuick(methodName).callQuick(tc, instance);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = doGetProperty(tc, instance, methodName);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return tc.callQuick(result);
      }
    }

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final Object p1) throws Throwable {
  Object result = doGetMetaMethodQuick(methodName, p1).callQuick(tc, instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = doGetProperty(tc, instance, methodName);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return tc.callQuick(result, p1);
      }
    }

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, boolean)
   */
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final boolean p1) throws Throwable {
  Object result = doGetMetaMethodQuick(methodName, p1).callQuick(tc, instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = doGetProperty(tc, instance, methodName);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return tc.callQuick(result, p1);
      }
    }

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, char)
   */
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final char p1) throws Throwable {
  Object result = doGetMetaMethodQuick(methodName, p1).callQuick(tc, instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = doGetProperty(tc, instance, methodName);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return tc.callQuick(result, p1);
      }
    }

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, byte)
   */
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final byte p1) throws Throwable {
  Object result = doGetMetaMethodQuick(methodName, p1).callQuick(tc, instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = doGetProperty(tc, instance, methodName);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return tc.callQuick(result, p1);
      }
    }

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, short)
   */
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final short p1) throws Throwable {
  Object result = doGetMetaMethodQuick(methodName, p1).callQuick(tc, instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = doGetProperty(tc, instance, methodName);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return tc.callQuick(result, p1);
      }
    }

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, int)
   */
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final int p1) throws Throwable {
  Object result = doGetMetaMethodQuick(methodName, p1).callQuick(tc, instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = doGetProperty(tc, instance, methodName);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return tc.callQuick(result, p1);
      }
    }

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, long)
   */
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final long p1) throws Throwable {
  Object result = doGetMetaMethodQuick(methodName, p1).callQuick(tc, instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = doGetProperty(tc, instance, methodName);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return tc.callQuick(result, p1);
      }
    }

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, float)
   */
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final float p1) throws Throwable {
  Object result = doGetMetaMethodQuick(methodName, p1).callQuick(tc, instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = doGetProperty(tc, instance, methodName);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return tc.callQuick(result, p1);
      }
    }

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, double)
   */
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final double p1) throws Throwable {
  Object result = doGetMetaMethodQuick(methodName, p1).callQuick(tc, instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = doGetProperty(tc, instance, methodName);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return tc.callQuick(result, p1);
      }
    }

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, java.math.BigInteger)
   */
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final BigInteger p1) throws Throwable {
  Object result = doGetMetaMethodQuick(methodName, p1).callQuick(tc, instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = doGetProperty(tc, instance, methodName);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return tc.callQuick(result, p1);
      }
    }

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, java.math.BigDecimal)
   */
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final BigDecimal p1) throws Throwable {
  Object result = doGetMetaMethodQuick(methodName, p1).callQuick(tc, instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = doGetProperty(tc, instance, methodName);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return tc.callQuick(result, p1);
      }
    }

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object)
   */
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final Object p1, final Object p2) throws Throwable {
  Object result = doGetMetaMethodQuick(methodName, p1, p2).callQuick(tc, instance, p1, p2);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = doGetProperty(tc, instance, methodName);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return tc.callQuick(result, p1, p2);
      }
    }

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final Object p1, final Object p2, final Object p3) throws Throwable {
  Object result = doGetMetaMethodQuick(methodName, p1, p2, p3).callQuick(tc, instance, p1, p2, p3);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = doGetProperty(tc, instance, methodName);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return tc.callQuick(result, p1, p2, p3);
      }
    }

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final Object p1, final Object p2, final Object p3, final Object p4) throws Throwable {
  Object result = doGetMetaMethodQuick(methodName, p1, p2, p3, p4).callQuick(tc, instance, p1, p2, p3, p4);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = doGetProperty(tc, instance, methodName);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return tc.callQuick(result, p1, p2, p3, p4);
      }
    }

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethodFor(java.lang.String, java.lang.Object[])
   */
  public Callable doGetMetaMethodFor(String methodName, Object[] arguments) {
    return this.instanceHandler.getMetaMethodFor(methodName, arguments);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethodQuick(java.lang.String, java.math.BigDecimal)
   */
  public Callable doGetMetaMethodQuick(String methodName, BigDecimal p1) {
    return this.instanceHandler.getMetaMethodQuick(methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethodQuick(java.lang.String, java.math.BigInteger)
   */
  public Callable doGetMetaMethodQuick(String methodName, BigInteger p1) {
    return this.instanceHandler.getMetaMethodQuick(methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethodQuick(java.lang.String, boolean)
   */
  public Callable doGetMetaMethodQuick(String methodName, boolean p1) {
    return this.instanceHandler.getMetaMethodQuick(methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethodQuick(java.lang.String, byte)
   */
  public Callable doGetMetaMethodQuick(String methodName, byte p1) {
    return this.instanceHandler.getMetaMethodQuick(methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethodQuick(java.lang.String, char)
   */
  public Callable doGetMetaMethodQuick(String methodName, char p1) {
    return this.instanceHandler.getMetaMethodQuick(methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethodQuick(java.lang.String, double)
   */
  public Callable doGetMetaMethodQuick(String methodName, double p1) {
    return this.instanceHandler.getMetaMethodQuick(methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethodQuick(java.lang.String, float)
   */
  public Callable doGetMetaMethodQuick(String methodName, float p1) {
    return this.instanceHandler.getMetaMethodQuick(methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethodQuick(java.lang.String, int)
   */
  public Callable doGetMetaMethodQuick(String methodName, int p1) {
    return this.instanceHandler.getMetaMethodQuick(methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethodQuick(java.lang.String, long)
   */
  public Callable doGetMetaMethodQuick(String methodName, long p1) {
    return this.instanceHandler.getMetaMethodQuick(methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethodQuick(java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Callable doGetMetaMethodQuick(String methodName, Object p1, Object p2, Object p3, Object p4) {
    return this.instanceHandler.getMetaMethodQuick(methodName, p1, p2, p3, p4);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethodQuick(java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Callable doGetMetaMethodQuick(String methodName, Object p1, Object p2, Object p3) {
    return this.instanceHandler.getMetaMethodQuick(methodName, p1, p2, p3);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethodQuick(java.lang.String, java.lang.Object, java.lang.Object)
   */
  public Callable doGetMetaMethodQuick(String methodName, Object p1, Object p2) {
    return this.instanceHandler.getMetaMethodQuick(methodName, p1, p2);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethodQuick(java.lang.String, java.lang.Object)
   */
  public Callable doGetMetaMethodQuick(String methodName, Object p1) {
    return this.instanceHandler.getMetaMethodQuick(methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethodQuick(java.lang.String, short)
   */
  public Callable doGetMetaMethodQuick(String methodName, short p1) {
    return this.instanceHandler.getMetaMethodQuick(methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethodQuick(java.lang.String)
   */
  public Callable doGetMetaMethodQuick(String methodName) {
    return this.instanceHandler.getMetaMethodQuick(methodName);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doGetProperty(ng.runtime.ThreadContext, java.lang.Object, java.lang.String)
   */
  public Object doGetProperty(final ThreadContext tc, final Object instance, final String propertyName) throws Throwable {
  final Object result = this.instanceHandler.getGetPropertyMetaMethod(instance, propertyName).callQuick(tc, instance);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return doGetField(tc, instance, propertyName);
    } else {
      return result;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doSetProperty(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object doSetProperty(final ThreadContext tc, final Object instance, final String propertyName, final Object newValue) throws Throwable {
  final Object result = this.instanceHandler.getSetPropertyMetaMethod(instance, propertyName, newValue).callQuick(tc, instance, newValue);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return doSetField(tc, instance, propertyName, newValue);
    } else {
      return result;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doGetField(ng.runtime.ThreadContext, java.lang.Object, java.lang.String)
   */
  public Object doGetField(final ThreadContext tc, final Object instance, final String fieldName) throws Throwable {
    return this.instanceHandler.getGetFieldMetaMethod(instance, fieldName).callQuick(tc, instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doSetField(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object doSetField(final ThreadContext tc, final Object instance, final String fieldName, final Object newValue) throws Throwable {
    return this.instanceHandler.getSetFieldMetaMethod(instance, fieldName, newValue).callQuick(tc, instance, newValue);
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doCall(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object[])
   */
  public Object doCall(ThreadContext tc, Object instance, Object[] arguments) throws Throwable {
    return doGetCallable(instance).call(tc, instance, arguments);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doCallQuick(ng.runtime.ThreadContext, java.lang.Object, java.math.BigDecimal)
   */
  public Object doCallQuick(ThreadContext tc, Object instance, BigDecimal p1) throws Throwable {
    return doGetCallable(instance).callQuick(tc, instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doCallQuick(ng.runtime.ThreadContext, java.lang.Object, java.math.BigInteger)
   */
  public Object doCallQuick(ThreadContext tc, Object instance, BigInteger p1) throws Throwable {
    return doGetCallable(instance).callQuick(tc, instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doCallQuick(ng.runtime.ThreadContext, java.lang.Object, boolean)
   */
  public Object doCallQuick(ThreadContext tc, Object instance, boolean p1) throws Throwable {
    return doGetCallable(instance).callQuick(tc, instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doCallQuick(ng.runtime.ThreadContext, java.lang.Object, byte)
   */
  public Object doCallQuick(ThreadContext tc, Object instance, byte p1) throws Throwable {
    return doGetCallable(instance).callQuick(tc, instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doCallQuick(ng.runtime.ThreadContext, java.lang.Object, char)
   */
  public Object doCallQuick(ThreadContext tc, Object instance, char p1) throws Throwable {
    return doGetCallable(instance).callQuick(tc, instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doCallQuick(ng.runtime.ThreadContext, java.lang.Object, double)
   */
  public Object doCallQuick(ThreadContext tc, Object instance, double p1) throws Throwable {
    return doGetCallable(instance).callQuick(tc, instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doCallQuick(ng.runtime.ThreadContext, java.lang.Object, float)
   */
  public Object doCallQuick(ThreadContext tc, Object instance, float p1) throws Throwable {
    return doGetCallable(instance).callQuick(tc, instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doCallQuick(ng.runtime.ThreadContext, java.lang.Object, int)
   */
  public Object doCallQuick(ThreadContext tc, Object instance, int p1) throws Throwable {
    return doGetCallable(instance).callQuick(tc, instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doCallQuick(ng.runtime.ThreadContext, java.lang.Object, long)
   */
  public Object doCallQuick(ThreadContext tc, Object instance, long p1) throws Throwable {
    return doGetCallable(instance).callQuick(tc, instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doCallQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object doCallQuick(ThreadContext tc, Object instance, Object p1, Object p2, Object p3, Object p4) throws Throwable {
    return doGetCallable(instance).callQuick(tc, instance, p1, p2, p3, p4);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doCallQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object doCallQuick(ThreadContext tc, Object instance, Object p1, Object p2, Object p3) throws Throwable {
    return doGetCallable(instance).callQuick(tc, instance, p1, p2, p3);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doCallQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object doCallQuick(ThreadContext tc, Object instance, Object p1, Object p2) throws Throwable {
    return doGetCallable(instance).callQuick(tc, instance, p1, p2);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doCallQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object)
   */
  public Object doCallQuick(ThreadContext tc, Object instance, Object p1) throws Throwable {
    return doGetCallable(instance).callQuick(tc, instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doCallQuick(ng.runtime.ThreadContext, java.lang.Object, short)
   */
  public Object doCallQuick(ThreadContext tc, Object instance, short p1) throws Throwable {
    return doGetCallable(instance).callQuick(tc, instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doCallQuick(ng.runtime.ThreadContext, java.lang.Object)
   */
  public Object doCallQuick(ThreadContext tc, Object instance) throws Throwable {
    return doGetCallable(instance).callQuick(tc, instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doGetCallable(java.lang.Object)
   */
  public Callable doGetCallable(final Object instance) {
    return this.instanceHandler.getCallable();
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doAsType(ng.runtime.ThreadContext, java.lang.Object, java.lang.Class)
   */
  public Object doAsType(final ThreadContext tc, final Object instance, final Class type) throws Throwable {
  final Object result = this.instanceHandler.asType(tc, instance, type);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return this.instanceHandler.getMetaMethodQuick("asType", type).callQuick(tc, instance, type);
    } else {
      return result;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doGetAt(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object)
   */
  public Object doGetAt(final ThreadContext tc, final Object instance, final Object index) throws Throwable {
  final Object result = this.instanceHandler.getAt(tc, instance, index);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return this.instanceHandler.getMetaMethodQuick("getAt", index).callQuick(tc, instance, index);
    } else {
      return result;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doGetAt(ng.runtime.ThreadContext, java.lang.Object, int)
   */
  public Object doGetAt(final ThreadContext tc, final Object instance, final int index) throws Throwable {
    return doGetAt(tc, instance, NgInt.valueOf(index));
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doGetAt(ng.runtime.ThreadContext, java.lang.Object, java.math.BigInteger)
   */
  public Object doGetAt(final ThreadContext tc, final Object instance, final BigInteger index) throws Throwable {
   return doGetAt(tc, instance, (Object)index);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doPutAt(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object)
   */
  public Object doPutAt(final ThreadContext tc, final Object instance, final Object index) throws Throwable {
  final Object result = this.instanceHandler.putAt(tc, instance, index);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return this.instanceHandler.getMetaMethodQuick("putAt", index).callQuick(tc, instance, index);
    } else {
      return result;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doPutAt(ng.runtime.ThreadContext, java.lang.Object, int)
   */
  public Object doPutAt(final ThreadContext tc, final Object instance, final int index) throws Throwable {
    return doPutAt(tc, instance, NgInt.valueOf(index));
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doPutAt(ng.runtime.ThreadContext, java.lang.Object, java.math.BigInteger)
   */
  public Object doPutAt(final ThreadContext tc, final Object instance, final BigInteger index) throws Throwable {
    return doPutAt(tc, instance, (Object)index);
  }
}
