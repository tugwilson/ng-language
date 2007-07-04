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
      Object result = this.instanceHandler.getMetaMethodFor(methodName, arguments).call(instance, arguments);

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
  Object result = this.instanceHandler.getMetaMethodQuick(methodName).callQuick(instance);

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
  Object result = this.instanceHandler.getMetaMethodQuick(methodName, p1).callQuick(instance, p1);

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
  Object result = this.instanceHandler.getMetaMethodQuick(methodName, p1).callQuick(instance, p1);

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
  Object result = this.instanceHandler.getMetaMethodQuick(methodName, p1).callQuick(instance, p1);

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
  Object result = this.instanceHandler.getMetaMethodQuick(methodName, p1).callQuick(instance, p1);

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
  Object result = this.instanceHandler.getMetaMethodQuick(methodName, p1).callQuick(instance, p1);

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
  Object result = this.instanceHandler.getMetaMethodQuick(methodName, p1).callQuick(instance, p1);

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
  Object result = this.instanceHandler.getMetaMethodQuick(methodName, p1).callQuick(instance, p1);

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
  Object result = this.instanceHandler.getMetaMethodQuick(methodName, p1).callQuick(instance, p1);

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
  Object result = this.instanceHandler.getMetaMethodQuick(methodName, p1).callQuick(instance, p1);

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
  Object result = this.instanceHandler.getMetaMethodQuick(methodName, p1).callQuick(instance, p1);

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
  Object result = this.instanceHandler.getMetaMethodQuick(methodName, p1).callQuick(instance, p1);

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
  Object result = this.instanceHandler.getMetaMethodQuick(methodName, p1, p2).callQuick(instance, p1, p2);

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
  Object result = this.instanceHandler.getMetaMethodQuick(methodName, p1, p2, p3).callQuick(instance, p1, p2, p3);

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
  Object result = this.instanceHandler.getMetaMethodQuick(methodName, p1, p2, p3, p4).callQuick(instance, p1, p2, p3, p4);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = doGetProperty(tc, instance, methodName);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return tc.callQuick(result, p1, p2, p3, p4);
      }
    }

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doGetProperty(ng.runtime.ThreadContext, java.lang.Object, java.lang.String)
   */
  public Object doGetProperty(final ThreadContext tc, final Object instance, final String propertyName) throws Throwable {
  final Object result = this.instanceHandler.getGetPropertyMetaMethod(instance, propertyName).callQuick(instance);
    
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
  final Object result = this.instanceHandler.getSetPropertyMetaMethod(instance, propertyName, newValue).callQuick(instance, newValue);
    
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
    return this.instanceHandler.getGetFieldMetaMethod(instance, fieldName).callQuick(instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doSetField(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object doSetField(final ThreadContext tc, final Object instance, final String fieldName, final Object newValue) throws Throwable {
    return this.instanceHandler.getSetFieldMetaMethod(instance, fieldName, newValue).callQuick(instance, newValue);
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doGetCallable(java.lang.Object)
   */
  public Callable doGetCallable(final Object instance) {
    return this.instanceHandler.getCallable();
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doAsType(java.lang.Object, java.lang.Class)
   */
  public Object doAsType(final Object instance, final Class type) throws Throwable {
  final Object result = this.instanceHandler.asType(instance, type);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return this.instanceHandler.getMetaMethodQuick("asType", type).callQuick(instance, type);
    } else {
      return result;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doGetAt(java.lang.Object, java.lang.Object)
   */
  public Object doGetAt(final Object instance, final Object index) throws Throwable {
  final Object result = this.instanceHandler.getAt(instance, index);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return this.instanceHandler.getMetaMethodQuick("getAt", index).callQuick(instance, index);
    } else {
      return result;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doGetAt(java.lang.Object, int)
   */
  public Object doGetAt(final Object instance, final int index) throws Throwable {
    return doGetAt(instance, NgInt.valueOf(index));
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doGetAt(java.lang.Object, java.math.BigInteger)
   */
  public Object doGetAt(final Object instance, final BigInteger index) throws Throwable {
   return doGetAt(instance, (Object)index);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doPutAt(java.lang.Object, java.lang.Object)
   */
  public Object doPutAt(final Object instance, final Object index) throws Throwable {
  final Object result = this.instanceHandler.putAt(instance, index);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return this.instanceHandler.getMetaMethodQuick("putAt", index).callQuick(instance, index);
    } else {
      return result;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doPutAt(java.lang.Object, int)
   */
  public Object doPutAt(final Object instance, final int index) throws Throwable {
    return doPutAt(instance, NgInt.valueOf(index));
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#doPutAt(java.lang.Object, java.math.BigInteger)
   */
  public Object doPutAt(final Object instance, final BigInteger index) throws Throwable {
    return doPutAt(instance, (Object)index);
  }
}
