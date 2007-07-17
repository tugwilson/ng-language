package uk.co.wilson.ng.runtime.metaclass;

import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.math.BigInteger;

import ng.lang.NgRuntimeException;
import ng.lang.NgSystem;
import ng.runtime.*;
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
  
  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doCreateMetaClassFor(java.lang.Class)
   */
  public RuntimeMetaClass doCreateMetaClassFor(final Class theClass) {
  final RuntimeMetaClass customMetaClass = lookForCustomMetaClass(theClass);

    if (customMetaClass == null) {
      return new RuntimeMetaClassImpl(theClass);
    } else {
      return customMetaClass;
    }
  }
  
  /**
   * 
   * See if a custom MetaClass is present if so return an instance of it if not
   * return null
   * 
   * @param theClass
   * @return The custom MetaClass for the class or null if none exists
   */
  protected RuntimeMetaClass lookForCustomMetaClass(final Class theClass) {
    try {
      final Class customMetaClass = Class.forName("ng.runtime.metaclass." + theClass.getName() + "MetaClass");
      final Constructor customMetaClassConstructor = customMetaClass.getConstructor(new Class[] {Class.class});

      return (RuntimeMetaClass)customMetaClassConstructor.newInstance(new Object[] {theClass});
    } catch (final ClassNotFoundException e) {
      return null;
    } catch (final Exception e) {
      throw new NgRuntimeException("Could not instantiate custom Metaclass for class: " + theClass.getName() + ". Reason: " + e, e);
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetParamObject(java.lang.Object, java.lang.Class)
   */
  public Object doGetParamObject(final Object instance, final Class theClass) {
    return instance;
  }

  /**
   * @return
   */
  public Object doGetParamObject(final boolean instance, final Class theClass) {
    return NgBoolean.valueOf(instance);
  }

  /**
   * @return
   */
  public Object doGetParamObject(final char instance, final Class theClass) {
    return NgChar.valueOf(instance);
  }

  /**
   * @return
   */
  public Object doGetParamObject(final byte instance, final Class theClass) {
    return NgByte.valueOf(instance);
  }

  /**
   * @return
   */
  public Object doGetParamObject(final short instance, final Class theClass) {
    return NgShort.valueOf(instance);
  }

  /**
   * @return
   */
  public Object doGetParamObject(final int instance, final Class theClass) {
    return NgInt.valueOf(instance);
  }

  /**
   * @return
   */
  public Object doGetParamObject(final long instance, final Class theClass) {
    return NgLong.valueOf(instance);
  }

  /**
   * @return
   */
  public Object doGetParamObject(final float instance, final Class theClass) {
    return NgFloat.valueOf(instance);
  }

  /**
   * @return
   */
  public Object doGetParamObject(final double instance, final Class theClass) {
    return NgDouble.valueOf(instance);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaClassFor(java.lang.Class)
   */
  public MetaClass doGetMetaClassFor(final Class theClass) {
    return this.instanceHandler.getMetaClassFor(theClass);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetTheClass(java.lang.Object)
   */
  public Class doGetTheClass(final Object instance) {
    return this.instanceHandler.getTheClass(instance);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doCalculateConversionCost(java.lang.Class)
   */
  public int doCalculateConversionCost(final Class parameterType) {
   return this.instanceHandler.calculateConversionCost(parameterType);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doInvokeConstructor(ng.runtime.ThreadContext, java.lang.Class, java.lang.Object[])
   */
  public Object doInvokeConstructor(final ThreadContext tc, final Class theClass, final Object[] arguments) throws Throwable {
    return doGetMetaConstructor(tc, theClass, arguments).callQuick(tc, theClass, arguments);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doInvokeConstructorQuick(ng.runtime.ThreadContext, java.lang.Class)
   */
  public Object doInvokeConstructorQuick(ThreadContext tc, Class theClass) throws Throwable {
    return doGetMetaConstructorQuick(tc, theClass).callQuick(tc, theClass);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doInvokeConstructorQuick(ng.runtime.ThreadContext, java.lang.Class, java.lang.Object)
   */
  public Object doInvokeConstructorQuick(ThreadContext tc, Class theClass, Object p1) throws Throwable {
    return doGetMetaConstructorQuick(tc, theClass, p1).callQuick(tc, theClass, p1);
  }
  
  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doInvokeConstructorQuick(ng.runtime.ThreadContext, java.lang.Class, boolean)
   */
  public Object doInvokeConstructorQuick(ThreadContext tc, Class theClass, boolean p1) throws Throwable {
    return doGetMetaConstructorQuick(tc, theClass, p1).callQuick(tc, theClass, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doInvokeConstructorQuick(ng.runtime.ThreadContext, java.lang.Class, char)
   */
  public Object doInvokeConstructorQuick(ThreadContext tc, Class theClass, char p1) throws Throwable {
    return doGetMetaConstructorQuick(tc, theClass, p1).callQuick(tc, theClass, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doInvokeConstructorQuick(ng.runtime.ThreadContext, java.lang.Class, byte)
   */
  public Object doInvokeConstructorQuick(ThreadContext tc, Class theClass, byte p1) throws Throwable {
    return doGetMetaConstructorQuick(tc, theClass, p1).callQuick(tc, theClass, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doInvokeConstructorQuick(ng.runtime.ThreadContext, java.lang.Class, short)
   */
  public Object doInvokeConstructorQuick(ThreadContext tc, Class theClass, short p1) throws Throwable {
    return doGetMetaConstructorQuick(tc, theClass, p1).callQuick(tc, theClass, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doInvokeConstructorQuick(ng.runtime.ThreadContext, java.lang.Class, int)
   */
  public Object doInvokeConstructorQuick(ThreadContext tc, Class theClass,  int p1) throws Throwable {
    return doGetMetaConstructorQuick(tc, theClass, p1).callQuick(tc, theClass, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doInvokeConstructorQuick(ng.runtime.ThreadContext, java.lang.Class, long)
   */
  public Object doInvokeConstructorQuick(ThreadContext tc, Class theClass,  long p1) throws Throwable {
    return doGetMetaConstructorQuick(tc, theClass, p1).callQuick(tc, theClass, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doInvokeConstructorQuick(ng.runtime.ThreadContext, java.lang.Class, float)
   */
  public Object doInvokeConstructorQuick(ThreadContext tc, Class theClass, float p1) throws Throwable {
    return doGetMetaConstructorQuick(tc, theClass, p1).callQuick(tc, theClass, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doInvokeConstructorQuick(ng.runtime.ThreadContext, java.lang.Class, double)
   */
  public Object doInvokeConstructorQuick(ThreadContext tc, Class theClass, double p1) throws Throwable {
    return doGetMetaConstructorQuick(tc, theClass, p1).callQuick(tc, theClass, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doInvokeConstructorQuick(ng.runtime.ThreadContext, java.lang.Class, java.math.BigInteger)
   */
  public Object doInvokeConstructorQuick(ThreadContext tc, Class theClass, BigInteger p1) throws Throwable {
    return doGetMetaConstructorQuick(tc, theClass, p1).callQuick(tc, theClass, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doInvokeConstructorQuick(ng.runtime.ThreadContext, java.lang.Class, java.math.BigDecimal)
   */
  public Object doInvokeConstructorQuick(ThreadContext tc, Class theClass, BigDecimal p1) throws Throwable {
    return doGetMetaConstructorQuick(tc, theClass, p1).callQuick(tc, theClass, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doInvokeConstructorQuick(ng.runtime.ThreadContext, java.lang.Class, java.lang.Object, java.lang.Object)
   */
  public Object doInvokeConstructorQuick(ThreadContext tc, Class theClass, Object p1, Object p2) throws Throwable {
    return doGetMetaConstructorQuick(tc, theClass, p1).callQuick(tc, theClass, p1, p2);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doInvokeConstructorQuick(ng.runtime.ThreadContext, java.lang.Class, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object doInvokeConstructorQuick(ThreadContext tc, Class theClass, Object p1, Object p2, Object p3) throws Throwable {
    return doGetMetaConstructorQuick(tc, theClass, p1).callQuick(tc, theClass, p1, p2, p3);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doInvokeConstructorQuick(ng.runtime.ThreadContext, java.lang.Class, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object doInvokeConstructorQuick(ThreadContext tc, Class theClass, Object p1, Object p2, Object p3, Object p4) throws Throwable {
    return doGetMetaConstructorQuick(tc, theClass, p1).callQuick(tc, theClass, p1, p2, p3, p4);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaConstructor(ng.runtime.ThreadContext, java.lang.Class, java.lang.Object[])
   */
  public Callable doGetMetaConstructor(ThreadContext tc, Class theClass, Object[] arguments) {
    return this.instanceHandler.getMetaConstructor(tc, theClass, arguments);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaConstructorQuick(ng.runtime.ThreadContext, java.lang.Class, java.math.BigDecimal)
   */
  public Callable doGetMetaConstructorQuick(ThreadContext tc, Class theClass, BigDecimal p1) {
    return this.instanceHandler.getMetaConstructorQuick(tc, theClass, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaConstructorQuick(ng.runtime.ThreadContext, java.lang.Class, java.math.BigInteger)
   */
  public Callable doGetMetaConstructorQuick(ThreadContext tc, Class theClass, BigInteger p1) {
    return this.instanceHandler.getMetaConstructorQuick(tc, theClass, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaConstructorQuick(ng.runtime.ThreadContext, java.lang.Class, boolean)
   */
  public Callable doGetMetaConstructorQuick(ThreadContext tc, Class theClass, boolean p1) {
    return this.instanceHandler.getMetaConstructorQuick(tc, theClass, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaConstructorQuick(ng.runtime.ThreadContext, java.lang.Class, byte)
   */
  public Callable doGetMetaConstructorQuick(ThreadContext tc, Class theClass, byte p1) {
    return this.instanceHandler.getMetaConstructorQuick(tc, theClass, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaConstructorQuick(ng.runtime.ThreadContext, java.lang.Class, char)
   */
  public Callable doGetMetaConstructorQuick(ThreadContext tc, Class theClass, char p1) {
    return this.instanceHandler.getMetaConstructorQuick(tc, theClass, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaConstructorQuick(ng.runtime.ThreadContext, java.lang.Class, double)
   */
  public Callable doGetMetaConstructorQuick(ThreadContext tc, Class theClass, double p1) {
    return this.instanceHandler.getMetaConstructorQuick(tc, theClass, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaConstructorQuick(ng.runtime.ThreadContext, java.lang.Class, float)
   */
  public Callable doGetMetaConstructorQuick(ThreadContext tc, Class theClass, float p1) {
    return this.instanceHandler.getMetaConstructorQuick(tc, theClass, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaConstructorQuick(ng.runtime.ThreadContext, java.lang.Class, int)
   */
  public Callable doGetMetaConstructorQuick(ThreadContext tc, Class theClass, int p1) {
    return this.instanceHandler.getMetaConstructorQuick(tc, theClass, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaConstructorQuick(ng.runtime.ThreadContext, java.lang.Class, long)
   */
  public Callable doGetMetaConstructorQuick(ThreadContext tc, Class theClass, long p1) {
    return this.instanceHandler.getMetaConstructorQuick(tc, theClass, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaConstructorQuick(ng.runtime.ThreadContext, java.lang.Class, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Callable doGetMetaConstructorQuick(ThreadContext tc, Class theClass, Object p1, Object p2, Object p3, Object p4) {
    return this.instanceHandler.getMetaConstructorQuick(tc, theClass, p1, p2, p3, p4);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaConstructorQuick(ng.runtime.ThreadContext, java.lang.Class, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Callable doGetMetaConstructorQuick(ThreadContext tc, Class theClass, Object p1, Object p2, Object p3) {
    return this.instanceHandler.getMetaConstructorQuick(tc, theClass, p1, p2, p3);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaConstructorQuick(ng.runtime.ThreadContext, java.lang.Class, java.lang.Object, java.lang.Object)
   */
  public Callable doGetMetaConstructorQuick(ThreadContext tc, Class theClass, Object p1, Object p2) {
    return this.instanceHandler.getMetaConstructorQuick(tc, theClass, p1, p2);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaConstructorQuick(ng.runtime.ThreadContext, java.lang.Class, java.lang.Object)
   */
  public Callable doGetMetaConstructorQuick(ThreadContext tc, Class theClass, Object p1) {
    return this.instanceHandler.getMetaConstructorQuick(tc, theClass, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaConstructorQuick(ng.runtime.ThreadContext, java.lang.Class, short)
   */
  public Callable doGetMetaConstructorQuick(ThreadContext tc, Class theClass, short p1) {
    return this.instanceHandler.getMetaConstructorQuick(tc, theClass, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaConstructorQuick(ng.runtime.ThreadContext, java.lang.Class)
   */
  public Callable doGetMetaConstructorQuick(ThreadContext tc, Class theClass) {
    return this.instanceHandler.getMetaConstructorQuick(tc, theClass);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doSelectMethod(ng.runtime.ThreadContext, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, java.lang.String, ng.runtime.RuntimeMetaClass[])
   */
  public MetaMethodSelection doSelectMethod(final ThreadContext tc, final MetaMethodSelection currentSelection, final String methodName, final MetaClass[] argumentMetaClasses) {
    return this.instanceHandler.selectMethod(tc, currentSelection, methodName, argumentMetaClasses);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doSelectMethod(ng.runtime.ThreadContext, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, java.lang.String)
   */
  public MetaMethodSelection doSelectMethod(final ThreadContext tc, final MetaMethodSelection currentSelection, final String methodName) {
    return this.instanceHandler.selectMethod(tc, currentSelection, methodName);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doSelectMethod(ng.runtime.ThreadContext, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, java.lang.String, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection doSelectMethod(final ThreadContext tc, final MetaMethodSelection currentSelection, final String methodName, final MetaClass p1) {
    return this.instanceHandler.selectMethod(tc, currentSelection, methodName);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doSelectMethod(ng.runtime.ThreadContext, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, java.lang.String, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection doSelectMethod(final ThreadContext tc, final MetaMethodSelection currentSelection, final String methodName, final MetaClass p1, final MetaClass p2) {
    return this.instanceHandler.selectMethod(tc, currentSelection, methodName, p1, p2);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doSelectMethod(ng.runtime.ThreadContext, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, java.lang.String, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection doSelectMethod(final ThreadContext tc, final MetaMethodSelection currentSelection, final String methodName, final MetaClass p1, final MetaClass p2, final MetaClass p3) {
    return this.instanceHandler.selectMethod(tc, currentSelection, methodName, p1, p2, p3);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doSelectMethod(ng.runtime.ThreadContext, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, java.lang.String, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection doSelectMethod(final ThreadContext tc, final MetaMethodSelection currentSelection, final String methodName, final MetaClass p1, final MetaClass p2, final MetaClass p3, final MetaClass p4) {
    return this.instanceHandler.selectMethod(tc, currentSelection, methodName, p1, p2, p3, p4);
  }

  /* (non-JavaDoc)
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
      Object result = doGetMetaMethod(tc, methodName, arguments).call(tc, instance, arguments);

      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = doGetProperty(tc, instance, methodName);
        
        if (result != RuntimeMetaClassImpl.NOT_CALLED) {
          return tc.callQuick(result, arguments);
        }
      }
  
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String)
   */
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName) throws Throwable {
  Object result = doGetMetaMethodQuick(tc, methodName).callQuick(tc, instance);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = doGetProperty(tc, instance, methodName);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return tc.callQuick(result);
      }
    }

    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final Object p1) throws Throwable {
  Object result = doGetMetaMethodQuick(tc, methodName, p1).callQuick(tc, instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = doGetProperty(tc, instance, methodName);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return tc.callQuick(result, p1);
      }
    }

    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, boolean)
   */
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final boolean p1) throws Throwable {
  Object result = doGetMetaMethodQuick(tc, methodName, p1).callQuick(tc, instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = doGetProperty(tc, instance, methodName);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return tc.callQuick(result, p1);
      }
    }

    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, char)
   */
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final char p1) throws Throwable {
  Object result = doGetMetaMethodQuick(tc, methodName, p1).callQuick(tc, instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = doGetProperty(tc, instance, methodName);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return tc.callQuick(result, p1);
      }
    }

    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, byte)
   */
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final byte p1) throws Throwable {
  Object result = doGetMetaMethodQuick(tc, methodName, p1).callQuick(tc, instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = doGetProperty(tc, instance, methodName);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return tc.callQuick(result, p1);
      }
    }

    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, short)
   */
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final short p1) throws Throwable {
  Object result = doGetMetaMethodQuick(tc, methodName, p1).callQuick(tc, instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = doGetProperty(tc, instance, methodName);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return tc.callQuick(result, p1);
      }
    }

    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, int)
   */
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final int p1) throws Throwable {
  Object result = doGetMetaMethodQuick(tc, methodName, p1).callQuick(tc, instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = doGetProperty(tc, instance, methodName);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return tc.callQuick(result, p1);
      }
    }

    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, long)
   */
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final long p1) throws Throwable {
  Object result = doGetMetaMethodQuick(tc, methodName, p1).callQuick(tc, instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = doGetProperty(tc, instance, methodName);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return tc.callQuick(result, p1);
      }
    }

    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, float)
   */
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final float p1) throws Throwable {
  Object result = doGetMetaMethodQuick(tc, methodName, p1).callQuick(tc, instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = doGetProperty(tc, instance, methodName);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return tc.callQuick(result, p1);
      }
    }

    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, double)
   */
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final double p1) throws Throwable {
  Object result = doGetMetaMethodQuick(tc, methodName, p1).callQuick(tc, instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = doGetProperty(tc, instance, methodName);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return tc.callQuick(result, p1);
      }
    }

    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, java.math.BigInteger)
   */
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final BigInteger p1) throws Throwable {
  Object result = doGetMetaMethodQuick(tc, methodName, p1).callQuick(tc, instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = doGetProperty(tc, instance, methodName);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return tc.callQuick(result, p1);
      }
    }

    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, java.math.BigDecimal)
   */
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final BigDecimal p1) throws Throwable {
  Object result = doGetMetaMethodQuick(tc, methodName, p1).callQuick(tc, instance, p1);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = doGetProperty(tc, instance, methodName);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return tc.callQuick(result, p1);
      }
    }

    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object)
   */
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final Object p1, final Object p2) throws Throwable {
  Object result = doGetMetaMethodQuick(tc, methodName, p1, p2).callQuick(tc, instance, p1, p2);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = doGetProperty(tc, instance, methodName);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return tc.callQuick(result, p1, p2);
      }
    }

    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final Object p1, final Object p2, final Object p3) throws Throwable {
  Object result = doGetMetaMethodQuick(tc, methodName, p1, p2, p3).callQuick(tc, instance, p1, p2, p3);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = doGetProperty(tc, instance, methodName);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return tc.callQuick(result, p1, p2, p3);
      }
    }

    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final Object p1, final Object p2, final Object p3, final Object p4) throws Throwable {
  Object result = doGetMetaMethodQuick(tc, methodName, p1, p2, p3, p4).callQuick(tc, instance, p1, p2, p3, p4);

    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = doGetProperty(tc, instance, methodName);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) {
        return tc.callQuick(result, p1, p2, p3, p4);
      }
    }

    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethod(ng.runtime.ThreadContext, java.lang.String, java.lang.Object[])
   */
  public Callable doGetMetaMethod(ThreadContext tc, String methodName, Object[] arguments) {
    return this.instanceHandler.getMetaMethod(tc, methodName, arguments);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethodQuick(ng.runtime.ThreadContext, java.lang.String, java.math.BigDecimal)
   */
  public Callable doGetMetaMethodQuick(ThreadContext tc, String methodName, BigDecimal p1) {
    return this.instanceHandler.getMetaMethodQuick(tc, methodName, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethodQuick(ng.runtime.ThreadContext, java.lang.String, java.math.BigInteger)
   */
  public Callable doGetMetaMethodQuick(ThreadContext tc, String methodName, BigInteger p1) {
    return this.instanceHandler.getMetaMethodQuick(tc, methodName, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethodQuick(ng.runtime.ThreadContext, java.lang.String, boolean)
   */
  public Callable doGetMetaMethodQuick(ThreadContext tc, String methodName, boolean p1) {
    return this.instanceHandler.getMetaMethodQuick(tc, methodName, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethodQuick(ng.runtime.ThreadContext, java.lang.String, byte)
   */
  public Callable doGetMetaMethodQuick(ThreadContext tc, String methodName, byte p1) {
    return this.instanceHandler.getMetaMethodQuick(tc, methodName, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethodQuick(ng.runtime.ThreadContext, java.lang.String, char)
   */
  public Callable doGetMetaMethodQuick(ThreadContext tc, String methodName, char p1) {
    return this.instanceHandler.getMetaMethodQuick(tc, methodName, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethodQuick(ng.runtime.ThreadContext, java.lang.String, double)
   */
  public Callable doGetMetaMethodQuick(ThreadContext tc, String methodName, double p1) {
    return this.instanceHandler.getMetaMethodQuick(tc, methodName, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethodQuick(ng.runtime.ThreadContext, java.lang.String, float)
   */
  public Callable doGetMetaMethodQuick(ThreadContext tc, String methodName, float p1) {
    return this.instanceHandler.getMetaMethodQuick(tc, methodName, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethodQuick(ng.runtime.ThreadContext, java.lang.String, int)
   */
  public Callable doGetMetaMethodQuick(ThreadContext tc, String methodName, int p1) {
    return this.instanceHandler.getMetaMethodQuick(tc, methodName, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethodQuick(ng.runtime.ThreadContext, java.lang.String, long)
   */
  public Callable doGetMetaMethodQuick(ThreadContext tc, String methodName, long p1) {
    return this.instanceHandler.getMetaMethodQuick(tc, methodName, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethodQuick(ng.runtime.ThreadContext, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Callable doGetMetaMethodQuick(ThreadContext tc, String methodName, Object p1, Object p2, Object p3, Object p4) {
    return this.instanceHandler.getMetaMethodQuick(tc, methodName, p1, p2, p3, p4);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethodQuick(ng.runtime.ThreadContext, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Callable doGetMetaMethodQuick(ThreadContext tc, String methodName, Object p1, Object p2, Object p3) {
    return this.instanceHandler.getMetaMethodQuick(tc, methodName, p1, p2, p3);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethodQuick(ng.runtime.ThreadContext, java.lang.String, java.lang.Object, java.lang.Object)
   */
  public Callable doGetMetaMethodQuick(ThreadContext tc, String methodName, Object p1, Object p2) {
    return this.instanceHandler.getMetaMethodQuick(tc, methodName, p1, p2);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethodQuick(ng.runtime.ThreadContext, java.lang.String, java.lang.Object)
   */
  public Callable doGetMetaMethodQuick(ThreadContext tc, String methodName, Object p1) {
    return this.instanceHandler.getMetaMethodQuick(tc, methodName, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethodQuick(ng.runtime.ThreadContext, java.lang.String, short)
   */
  public Callable doGetMetaMethodQuick(ThreadContext tc, String methodName, short p1) {
    return this.instanceHandler.getMetaMethodQuick(tc, methodName, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetMetaMethodQuick(ng.runtime.ThreadContext, java.lang.String)
   */
  public Callable doGetMetaMethodQuick(ThreadContext tc, String methodName) {
    return this.instanceHandler.getMetaMethodQuick(tc, methodName);
  }

  /* (non-JavaDoc)
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

  /* (non-JavaDoc)
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

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetField(ng.runtime.ThreadContext, java.lang.Object, java.lang.String)
   */
  public Object doGetField(final ThreadContext tc, final Object instance, final String fieldName) throws Throwable {
    return this.instanceHandler.getGetFieldMetaMethod(instance, fieldName).callQuick(tc, instance);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doSetField(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object doSetField(final ThreadContext tc, final Object instance, final String fieldName, final Object newValue) throws Throwable {
    return this.instanceHandler.getSetFieldMetaMethod(instance, fieldName, newValue).callQuick(tc, instance, newValue);
  }
  
  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doCall(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object[])
   */
  public Object doCall(ThreadContext tc, Object instance, Object[] arguments) throws Throwable {
    return doGetCallable(instance).call(tc, instance, arguments);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doCallQuick(ng.runtime.ThreadContext, java.lang.Object, java.math.BigDecimal)
   */
  public Object doCallQuick(ThreadContext tc, Object instance, BigDecimal p1) throws Throwable {
    return doGetCallable(instance).callQuick(tc, instance, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doCallQuick(ng.runtime.ThreadContext, java.lang.Object, java.math.BigInteger)
   */
  public Object doCallQuick(ThreadContext tc, Object instance, BigInteger p1) throws Throwable {
    return doGetCallable(instance).callQuick(tc, instance, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doCallQuick(ng.runtime.ThreadContext, java.lang.Object, boolean)
   */
  public Object doCallQuick(ThreadContext tc, Object instance, boolean p1) throws Throwable {
    return doGetCallable(instance).callQuick(tc, instance, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doCallQuick(ng.runtime.ThreadContext, java.lang.Object, byte)
   */
  public Object doCallQuick(ThreadContext tc, Object instance, byte p1) throws Throwable {
    return doGetCallable(instance).callQuick(tc, instance, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doCallQuick(ng.runtime.ThreadContext, java.lang.Object, char)
   */
  public Object doCallQuick(ThreadContext tc, Object instance, char p1) throws Throwable {
    return doGetCallable(instance).callQuick(tc, instance, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doCallQuick(ng.runtime.ThreadContext, java.lang.Object, double)
   */
  public Object doCallQuick(ThreadContext tc, Object instance, double p1) throws Throwable {
    return doGetCallable(instance).callQuick(tc, instance, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doCallQuick(ng.runtime.ThreadContext, java.lang.Object, float)
   */
  public Object doCallQuick(ThreadContext tc, Object instance, float p1) throws Throwable {
    return doGetCallable(instance).callQuick(tc, instance, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doCallQuick(ng.runtime.ThreadContext, java.lang.Object, int)
   */
  public Object doCallQuick(ThreadContext tc, Object instance, int p1) throws Throwable {
    return doGetCallable(instance).callQuick(tc, instance, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doCallQuick(ng.runtime.ThreadContext, java.lang.Object, long)
   */
  public Object doCallQuick(ThreadContext tc, Object instance, long p1) throws Throwable {
    return doGetCallable(instance).callQuick(tc, instance, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doCallQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object doCallQuick(ThreadContext tc, Object instance, Object p1, Object p2, Object p3, Object p4) throws Throwable {
    return doGetCallable(instance).callQuick(tc, instance, p1, p2, p3, p4);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doCallQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object doCallQuick(ThreadContext tc, Object instance, Object p1, Object p2, Object p3) throws Throwable {
    return doGetCallable(instance).callQuick(tc, instance, p1, p2, p3);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doCallQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object doCallQuick(ThreadContext tc, Object instance, Object p1, Object p2) throws Throwable {
    return doGetCallable(instance).callQuick(tc, instance, p1, p2);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doCallQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object)
   */
  public Object doCallQuick(ThreadContext tc, Object instance, Object p1) throws Throwable {
    return doGetCallable(instance).callQuick(tc, instance, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doCallQuick(ng.runtime.ThreadContext, java.lang.Object, short)
   */
  public Object doCallQuick(ThreadContext tc, Object instance, short p1) throws Throwable {
    return doGetCallable(instance).callQuick(tc, instance, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doCallQuick(ng.runtime.ThreadContext, java.lang.Object)
   */
  public Object doCallQuick(ThreadContext tc, Object instance) throws Throwable {
    return doGetCallable(instance).callQuick(tc, instance);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetCallable(java.lang.Object)
   */
  public Callable doGetCallable(final Object instance) {
    return this.instanceHandler.getCallable();
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doIsCase(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object)
   */
  public boolean doIsCase(final ThreadContext tc, final Object instance, final Object rhs) throws Throwable {
    return this.instanceHandler.isCase(tc, instance, rhs);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doIsInstanceof(ng.runtime.ThreadContext, java.lang.Object, java.lang.Class)
   */
  public boolean doIsInstanceof(final ThreadContext tc, final Object instance, final Class type) throws Throwable {
    return this.instanceHandler.isInstanceof(tc, instance, type);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doAsType(ng.runtime.ThreadContext, java.lang.Object, java.lang.Class)
   */
  public Object doAsType(final ThreadContext tc, final Object instance, final Class type) throws Throwable {
  final Object result = this.instanceHandler.asType(tc, instance, type);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return this.instanceHandler.getMetaMethodQuick(tc, "asType", type).callQuick(tc, instance, type);
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetAt(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object)
   */
  public Object doGetAt(final ThreadContext tc, final Object instance, final Object index) throws Throwable {
  final Object result = this.instanceHandler.getAt(tc, instance, index);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return this.instanceHandler.getMetaMethodQuick(tc, "getAt", index).callQuick(tc, instance, index);
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetAt(ng.runtime.ThreadContext, java.lang.Object, int)
   */
  public Object doGetAt(final ThreadContext tc, final Object instance, final int index) throws Throwable {
    return doGetAt(tc, instance, NgInt.valueOf(index));
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doGetAt(ng.runtime.ThreadContext, java.lang.Object, java.math.BigInteger)
   */
  public Object doGetAt(final ThreadContext tc, final Object instance, final BigInteger index) throws Throwable {
   return doGetAt(tc, instance, (Object)index);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doPutAt(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object)
   */
  public Object doPutAt(final ThreadContext tc, final Object instance, final Object index) throws Throwable {
  final Object result = this.instanceHandler.putAt(tc, instance, index);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return this.instanceHandler.getMetaMethodQuick(tc, "putAt", index).callQuick(tc, instance, index);
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doPutAt(ng.runtime.ThreadContext, java.lang.Object, int)
   */
  public Object doPutAt(final ThreadContext tc, final Object instance, final int index) throws Throwable {
    return doPutAt(tc, instance, NgInt.valueOf(index));
  }

  /* (non-JavaDoc)
   * @see ng.runtime.InternalMetaClass#doPutAt(ng.runtime.ThreadContext, java.lang.Object, java.math.BigInteger)
   */
  public Object doPutAt(final ThreadContext tc, final Object instance, final BigInteger index) throws Throwable {
    return doPutAt(tc, instance, (Object)index);
  }
}
