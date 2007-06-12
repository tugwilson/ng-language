package uk.co.wilson.ng.runtime.metaclass;

/*
 * Created on Feb 23, 2007
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

import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.math.BigInteger;

import ng.lang.NgRuntimeException;
import ng.lang.NgSystem;
import ng.runtime.*;
import uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection;

public class RuntimeMetaClassImpl implements RuntimeMetaClass {
  public static final Object NOT_CONSTRUCTED = new Object();
  public static final Object NOT_CALLED = new Object();
  
  protected static final Object[] NO_PARAMETERS = new Object[] {};

  private volatile InternalMetaClass internalMetaClass;

  protected static class NgPrefixUnaryOperatorException extends NgRuntimeException {
    private static final long serialVersionUID = 1L;

    public NgPrefixUnaryOperatorException(final String operator, final String name) {
      super("Operation '" + operator + "x' not available on " + name);
    }
  }

  protected static class NgPostfixUnaryOperatorException extends NgRuntimeException {
    private static final long serialVersionUID = 1L;

    public NgPostfixUnaryOperatorException(final String operator, final String name) {
      super("Operation 'x" + operator + "' not available on " + name);
    }
  }

  protected static class NgBinaryOperatorException extends NgRuntimeException {
    private static final long serialVersionUID = 1L;

    public NgBinaryOperatorException(final Class lhsClass, final String operator, final String rhsClassName) {
      super("Operation 'x " + operator + " y' not available between " + lhsClass.getName() + " and " + rhsClassName);
    }

    public NgBinaryOperatorException(final Class lhsClass, final String operator, final Class rhsClass) {
      this(lhsClass, operator, rhsClass.getName());
    }

    public NgBinaryOperatorException(final Class lhsClass, final String operator, final Object rhs) throws Throwable {
      this(lhsClass, operator, ((rhs == null) ? "null" : NgSystem.metaClassRegistry.getRuntimeMetaClass(rhs).getTheClass(rhs).getName()));
    }
  }
  protected static class NgMetaClassConstuctionException extends NgRuntimeException {
    private static final long serialVersionUID = 1L;

    public NgMetaClassConstuctionException(final Class expecting, final Class got) {
      throw new NgRuntimeException("Error when trying to create the MetaClass for " + expecting.getName()
                                   + " the class passed to the constuctor is " + got.getName());
    }
  }

  /**
   * @param theClass
   * @param internalMetaClass
   */
  public RuntimeMetaClassImpl(final Class theClass, final InternalMetaClass internalMetaClass) {
    this.internalMetaClass = internalMetaClass;
  }
  
  /**
   * @param theClass
   */
  public RuntimeMetaClassImpl(final Class theClass) {
    this.internalMetaClass = new InternalMetaClassImpl(theClass);
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#getParamObject(java.lang.Object, java.lang.Class)
   */
  public Object getParamObject(final Object instance, final Class theClass) {
    return this.internalMetaClass.doGetParamObject(instance, theClass);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#getMetaClassFor(java.lang.Class)
   */
  public MetaClass getMetaClassFor(final Class theClass) {
    return this.internalMetaClass.doGetMetaClassFor(theClass);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#getRuntimeMetaClass()
   */
  public RuntimeMetaClass getRuntimeMetaClass() {
    return this;
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#getInternalMetaClass()
   */
  public InternalMetaClass getInternalMetaClass() {
    return this.internalMetaClass;
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#setInternalMetaClass(ng.runtime.InternalMetaClass)
   */
  public void setInternalMetaClass(final InternalMetaClass internalMetaClass) {
    this.internalMetaClass = internalMetaClass;
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#createMetaClassFor(java.lang.Class)
   */
  public RuntimeMetaClass createMetaClassFor(final Class theClass) {
  final RuntimeMetaClass customMetaClass = lookForCustomMetaClass(theClass);

    if (customMetaClass == null) {
      return new RuntimeMetaClassImpl(theClass);
    } else {
      return customMetaClass;
    }
  }
  
  /**
   * 
   * See if a custom Metaclass is present if so return an instance of it if not
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

  /*
   * (non-Javadoc)
   * 
   * @see ng.lang.MetaClass#getTheClass()
   */
  public Class getTheClass(final Object instance) {
    return this.internalMetaClass.doGetTheClass(instance);
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#calculateConversionCost(java.lang.Class)
   */
  public int calculateConversionCost(final Class parameterType) {
    return this.internalMetaClass.doCalculateConversionCost(parameterType);
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#invokeConstructor(java.lang.Class, java.lang.Object[])
   */
  public  Object invokeConstructor(final Class theClass, final Object[] arguments) throws Throwable {
  final Object result = this.internalMetaClass.doInvokeConstructor(theClass, arguments);
  
    // TODO: make this error more detailed.
    if (result == NOT_CONSTRUCTED) throw new NgRuntimeException("The constructor for " +  theClass.getName() + " was not found");

    return result;
  
  }
  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#invokeMethod(java.lang.Object, java.lang.String, java.lang.Object[])
   */
  public  Object invokeMethod(final Object instance, final String methodName, final Object[] arguments) throws  Throwable {
  final InternalMetaClass internalMetaClass = this.internalMetaClass;
  
    switch (arguments.length) {
    case 0:
      return invokeMethodQuick(instance, methodName);

    case 1:
      return invokeMethodQuick(instance, methodName, arguments[0]);

    case 2:
      return invokeMethodQuick(instance, methodName, arguments[0], arguments[1]);

    case 3:
      return invokeMethodQuick(instance, methodName, arguments[0], arguments[1], arguments[2]);

    case 4:
      return invokeMethodQuick(instance, methodName, arguments[0], arguments[1], arguments[2], arguments[3]);

    default:
      Object result = internalMetaClass.doGetMetaMethodFor(methodName, arguments).call(instance, arguments);

      if (result == NOT_CALLED) {
        result = internalMetaClass.doGetGetPropertyMetaMethod(instance, methodName).call(instance, methodName);
        
        if (result != NOT_CALLED) {
          return NgSystem.metaClassRegistry.getRuntimeMetaClass(result).call(instance, arguments);
        }
        
        // TODO: make this error more detailed.
        throw new NgRuntimeException("The method " +  methodName + " is not found");
      }
  
      return result;
    }
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#selectMethod(uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection, java.lang.String, ng.runtime.RuntimeMetaClass[])
   */
  public MetaMethodSelection selectMethod(final MetaMethodSelection currentSelection, final String methodName, final RuntimeMetaClass[] argumentMetaClasses) {
    return this.internalMetaClass.doSelectMethod(currentSelection, methodName, argumentMetaClasses);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#selectMethod(uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection, java.lang.String)
   */
  public MetaMethodSelection selectMethod(final MetaMethodSelection currentSelection, final String methodName) {
    return this.internalMetaClass.doSelectMethod(currentSelection, methodName);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#selectMethod(uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection, java.lang.String, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection selectMethod(final MetaMethodSelection currentSelection, final String methodName, final RuntimeMetaClass p1) {
    return this.internalMetaClass.doSelectMethod(currentSelection, methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#selectMethod(uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection, java.lang.String, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection selectMethod(final MetaMethodSelection currentSelection, final String methodName, final RuntimeMetaClass p1, final RuntimeMetaClass p2) {
    return this.internalMetaClass.doSelectMethod(currentSelection, methodName, p1, p2);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#selectMethod(uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection, java.lang.String, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection selectMethod(final MetaMethodSelection currentSelection, final String methodName, final RuntimeMetaClass p1, final RuntimeMetaClass p2, final RuntimeMetaClass p3) {
    return this.internalMetaClass.doSelectMethod(currentSelection, methodName, p1, p2, p3);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#selectMethod(uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection, java.lang.String, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection selectMethod(final MetaMethodSelection currentSelection, final String methodName, final RuntimeMetaClass p1, final RuntimeMetaClass p2, final RuntimeMetaClass p3, final RuntimeMetaClass p4) {
    return this.internalMetaClass.doSelectMethod(currentSelection, methodName, p1, p2, p3, p4);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#invokeMethod(java.lang.Object, java.lang.String)
   */
  public  Object invokeMethodQuick(final Object instance, final String methodName) throws  Throwable {
  Object result = this.internalMetaClass.doGetMetaMethodQuick(methodName).call(instance);
  
    if (result == NOT_CALLED) {
      result = this.internalMetaClass.doGetGetPropertyMetaMethod(instance, methodName).call(instance, methodName);
      
      if (result != NOT_CALLED) {
        return NgSystem.metaClassRegistry.getRuntimeMetaClass(result).callQuick(instance);
      }
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#invokeMethod(java.lang.Object, java.lang.String, java.lang.Object)
   */
  public  Object invokeMethodQuick(final Object instance, final String methodName, final Object p1) throws  Throwable {
  Object result = this.internalMetaClass.doGetMetaMethodQuick(methodName, p1).call(instance, p1);

    if (result == NOT_CALLED) {
      result = this.internalMetaClass.doGetGetPropertyMetaMethod(instance, methodName).call(instance, methodName);
      
      if (result != NOT_CALLED) {
        return NgSystem.metaClassRegistry.getRuntimeMetaClass(result).callQuick(instance, p1);
      }
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#invokeMethod(java.lang.Object, java.lang.String, boolean)
   */
  public  Object invokeMethodQuick(final Object instance, final String methodName, final boolean p1) throws  Throwable {
  Object result = this.internalMetaClass.doGetMetaMethodQuick(methodName, p1).call(instance, p1);

    if (result == NOT_CALLED) {
      result = this.internalMetaClass.doGetGetPropertyMetaMethod(instance, methodName).call(instance, methodName);
      
      if (result != NOT_CALLED) {
        return NgSystem.metaClassRegistry.getRuntimeMetaClass(result).callQuick(instance, p1);
      }
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#invokeMethod(java.lang.Object, java.lang.String, char)
   */
  public  Object invokeMethodQuick(final Object instance, final String methodName, final char p1) throws  Throwable {
  Object result = this.internalMetaClass.doGetMetaMethodQuick(methodName, p1).call(instance, p1);

    if (result == NOT_CALLED) {
      result = this.internalMetaClass.doGetGetPropertyMetaMethod(instance, methodName).call(instance, methodName);
      
      if (result != NOT_CALLED) {
        return NgSystem.metaClassRegistry.getRuntimeMetaClass(result).callQuick(instance, p1);
      }
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#invokeMethod(java.lang.Object, java.lang.String, byte)
   */
  public  Object invokeMethodQuick(final Object instance, final String methodName, final byte p1) throws  Throwable {
  Object result = this.internalMetaClass.doGetMetaMethodQuick(methodName, p1).call(instance, p1);

    if (result == NOT_CALLED) {
      result = this.internalMetaClass.doGetGetPropertyMetaMethod(instance, methodName).call(instance, methodName);
      
      if (result != NOT_CALLED) {
        return NgSystem.metaClassRegistry.getRuntimeMetaClass(result).callQuick(instance, p1);
      }
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#invokeMethod(java.lang.Object, java.lang.String, short)
   */
  public  Object invokeMethodQuick(final Object instance, final String methodName, final short p1) throws  Throwable {
  Object result = this.internalMetaClass.doGetMetaMethodQuick(methodName, p1).call(instance, p1);

    if (result == NOT_CALLED) {
      result = this.internalMetaClass.doGetGetPropertyMetaMethod(instance, methodName).call(instance, methodName);
      
      if (result != NOT_CALLED) {
        return NgSystem.metaClassRegistry.getRuntimeMetaClass(result).callQuick(instance, p1);
      }
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#invokeMethod(java.lang.Object, java.lang.String, int)
   */
  public  Object invokeMethodQuick(final Object instance, final String methodName, final int p1) throws  Throwable {
  Object result = this.internalMetaClass.doGetMetaMethodQuick(methodName, p1).call(instance, p1);

    if (result == NOT_CALLED) {
      result = this.internalMetaClass.doGetGetPropertyMetaMethod(instance, methodName).call(instance, methodName);
      
      if (result != NOT_CALLED) {
        return NgSystem.metaClassRegistry.getRuntimeMetaClass(result).callQuick(instance, p1);
      }
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#invokeMethod(java.lang.Object, java.lang.String, long)
   */
  public  Object invokeMethodQuick(final Object instance, final String methodName, final long p1) throws  Throwable {
  Object result = this.internalMetaClass.doGetMetaMethodQuick(methodName, p1).call(instance, p1);

    if (result == NOT_CALLED) {
      result = this.internalMetaClass.doGetGetPropertyMetaMethod(instance, methodName).call(instance, methodName);
      
      if (result != NOT_CALLED) {
        return NgSystem.metaClassRegistry.getRuntimeMetaClass(result).callQuick(instance, p1);
      }
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#invokeMethod(java.lang.Object, java.lang.String, float)
   */
  public  Object invokeMethodQuick(final Object instance, final String methodName, final float p1) throws  Throwable {
  Object result = this.internalMetaClass.doGetMetaMethodQuick(methodName, p1).call(instance, p1);

    if (result == NOT_CALLED) {
      result = this.internalMetaClass.doGetGetPropertyMetaMethod(instance, methodName).call(instance, methodName);
      
      if (result != NOT_CALLED) {
        return NgSystem.metaClassRegistry.getRuntimeMetaClass(result).callQuick(instance, p1);
      }
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#invokeMethod(java.lang.Object, java.lang.String, double)
   */
  public  Object invokeMethodQuick(final Object instance, final String methodName, final double p1) throws  Throwable {
  Object result = this.internalMetaClass.doGetMetaMethodQuick(methodName, p1).call(instance, p1);

    if (result == NOT_CALLED) {
      result = this.internalMetaClass.doGetGetPropertyMetaMethod(instance, methodName).call(instance, methodName);
      
      if (result != NOT_CALLED) {
        return NgSystem.metaClassRegistry.getRuntimeMetaClass(result).callQuick(instance, p1);
      }
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#invokeMethod(java.lang.Object, java.lang.String, java.math.BigInteger)
   */
  public  Object invokeMethodQuick(final Object instance, final String methodName, final BigInteger p1) throws  Throwable {
  Object result = this.internalMetaClass.doGetMetaMethodQuick(methodName, p1).call(instance, p1);

    if (result == NOT_CALLED) {
      result = this.internalMetaClass.doGetGetPropertyMetaMethod(instance, methodName).call(instance, methodName);
      
      if (result != NOT_CALLED) {
        return NgSystem.metaClassRegistry.getRuntimeMetaClass(result).callQuick(instance, p1);
      }
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#invokeMethod(java.lang.Object, java.lang.String, java.math.BigDecimal)
   */
  public  Object invokeMethodQuick(final Object instance, final String methodName, final BigDecimal p1) throws  Throwable {
  Object result = this.internalMetaClass.doGetMetaMethodQuick(methodName, p1).call(instance, p1);

    if (result == NOT_CALLED) {
      result = this.internalMetaClass.doGetGetPropertyMetaMethod(instance, methodName).call(instance, methodName);
      
      if (result != NOT_CALLED) {
        return NgSystem.metaClassRegistry.getRuntimeMetaClass(result).callQuick(instance, p1);
      }
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#invokeMethod(java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object)
   */
  public  Object invokeMethodQuick(final Object instance, final String methodName, final Object p1, final Object p2) throws  Throwable {
  Object result = this.internalMetaClass.doGetMetaMethodQuick(methodName, p1, p2).call(instance, p1, p2);

    if (result == NOT_CALLED) {
      result = this.internalMetaClass.doGetGetPropertyMetaMethod(instance, methodName).call(instance, methodName);
      
      if (result != NOT_CALLED) {
        return NgSystem.metaClassRegistry.getRuntimeMetaClass(result).callQuick(instance, p1, p2);
      }
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#invokeMethod(java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public  Object invokeMethodQuick(final Object instance, final String methodName, final Object p1, final Object p2, final Object p3) throws  Throwable {
  Object result = this.internalMetaClass.doGetMetaMethodQuick(methodName, p1, p2, p3).call(instance, p1, p2, p3);

    if (result == NOT_CALLED) {
      result = this.internalMetaClass.doGetGetPropertyMetaMethod(instance, methodName).call(instance, methodName);
      
      if (result != NOT_CALLED) {
        return NgSystem.metaClassRegistry.getRuntimeMetaClass(result).callQuick(instance, p1, p2, p3);
      }
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#invokeMethod(java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public  Object invokeMethodQuick(final Object instance, final String methodName, final Object p1, final Object p2, final Object p3, final Object p4) throws  Throwable {
  Object result = this.internalMetaClass.doGetMetaMethodQuick(methodName, p1, p2, p3, p4).call(instance, p1, p2, p3, p4);

    if (result == NOT_CALLED) {
      result = this.internalMetaClass.doGetGetPropertyMetaMethod(instance, methodName).call(instance, methodName);
      
      if (result != NOT_CALLED) {
        return NgSystem.metaClassRegistry.getRuntimeMetaClass(result).callQuick(instance, p1, p2, p3, p4);
      }
      
      // TODO: make this error more detailed.
      throw new NgRuntimeException("The method " +  methodName + " is not found");
    }

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#getProperty(java.lang.Object, java.lang.String)
   */
  public Object getProperty(final Object instance, final String propertyName) throws  Throwable {
  final InternalMetaClass internalMetaClass = this.internalMetaClass;
  Object result = internalMetaClass.doGetGetPropertyMetaMethod(instance, propertyName).call(instance);
    
    if (result == NOT_CALLED) {
      result = internalMetaClass.doGetGetFieldMetaMethod(instance, propertyName).call(instance);
      
      // TODO: make this error more detailed.
      if (result == NOT_CALLED) throw new NgRuntimeException("The property " +  propertyName + " was not found");
    }
    
    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#setProperty(java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object setProperty(final Object instance, final String propertyName, final Object newValue) throws Throwable {
  final InternalMetaClass internalMetaClass = this.internalMetaClass;
  Object result = internalMetaClass.doGetSetPropertyMetaMethod(instance, propertyName, newValue).call(instance, newValue);
    
  if (result == NOT_CALLED) {
    result = internalMetaClass.doGetSetFieldMetaMethod(instance, propertyName, newValue).call(instance, newValue);
    
    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException("The property " +  propertyName + " was not found");
  }

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#getField(java.lang.Object, java.lang.String)
   */
  public Object getField(final Object instance, final String fieldName) throws Throwable {
  final Object result = this.internalMetaClass.doGetGetFieldMetaMethod(instance, fieldName).call(instance);
    
    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException("The field " +  fieldName + " was not found");

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#setField(java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object setField(final Object instance, final String fieldName, final Object newValue) throws  Throwable {
  final Object result = this.internalMetaClass.doGetSetFieldMetaMethod(instance, fieldName, newValue).call(instance, newValue);
    
    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException("The field " +  fieldName + " was not found");

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#call(java.lang.Object, java.lang.Object[])
   */
  public  Object call(final Object instance, final Object[] arguments) throws  Throwable {
    switch (arguments.length) {
    case 0:
      return callQuick(instance);

    case 1:
      return callQuick(instance, arguments[0]);

    case 2:
      return callQuick(instance, arguments[0], arguments[1]);

    case 3:
      return callQuick(instance, arguments[0], arguments[1], arguments[2]);

    case 4:
      return callQuick(instance, arguments[0], arguments[1], arguments[2], arguments[3]);

    default:
      final Object result = this.internalMetaClass.doGetAnonMetaMethod().call(instance, arguments);

      // TODO: make this error more detailed.
      if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " is not callable");
  
      return result;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#call(java.lang.Object)
   */
  public  Object callQuick(final Object instance) throws  Throwable {
  final Object result = this.internalMetaClass.doGetAnonMetaMethod().call(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " is not callable");

    return result;
 }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#call(java.lang.Object, java.lang.Object)
   */
  public  Object callQuick(final Object instance, final Object p1) throws  Throwable {
  final Object result = this.internalMetaClass.doGetAnonMetaMethod().call(instance, p1);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " is not callable");

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#call(java.lang.Object, boolean)
   */
  public  Object callQuick(final Object instance, final boolean p1) throws  Throwable {
  final Object result = this.internalMetaClass.doGetAnonMetaMethod().call(instance, p1);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " is not callable");

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#call(java.lang.Object, char)
   */
  public  Object callQuick(final Object instance, final char p1) throws  Throwable {
  final Object result = this.internalMetaClass.doGetAnonMetaMethod().call(instance, p1);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " is not callable");

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#call(java.lang.Object, byte)
   */
  public  Object callQuick(final Object instance, final byte p1) throws  Throwable {
  final Object result = this.internalMetaClass.doGetAnonMetaMethod().call(instance, p1);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " is not callable");

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#call(java.lang.Object, short)
   */
  public  Object callQuick(final Object instance, final short p1) throws  Throwable {
  final Object result = this.internalMetaClass.doGetAnonMetaMethod().call(instance, p1);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " is not callable");

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#call(java.lang.Object, int)
   */
  public  Object callQuick(final Object instance, final int p1) throws  Throwable {
  final Object result = this.internalMetaClass.doGetAnonMetaMethod().call(instance, p1);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " is not callable");

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#call(java.lang.Object, long)
   */
  public  Object callQuick(final Object instance, final long p1) throws  Throwable {
  final Object result = this.internalMetaClass.doGetAnonMetaMethod().call(instance, p1);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " is not callable");

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#call(java.lang.Object, float)
   */
  public  Object callQuick(final Object instance, final float p1) throws  Throwable {
  final Object result = this.internalMetaClass.doGetAnonMetaMethod().call(instance, p1);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " is not callable");

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#call(java.lang.Object, double)
   */
  public  Object callQuick(final Object instance, final double p1) throws  Throwable {
  final Object result = this.internalMetaClass.doGetAnonMetaMethod().call(instance, p1);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " is not callable");

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#call(java.lang.Object, java.math.BigInteger)
   */
  public  Object callQuick(final Object instance, final BigInteger p1) throws  Throwable {
  final Object result = this.internalMetaClass.doGetAnonMetaMethod().call(instance, p1);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " is not callable");

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#call(java.lang.Object, java.math.BigDecimal)
   */
  public  Object callQuick(final Object instance, final BigDecimal p1) throws  Throwable {
  final Object result = this.internalMetaClass.doGetAnonMetaMethod().call(instance, p1);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " is not callable");

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#call(java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public  Object callQuick(final Object instance, final Object p1, final Object p2) throws  Throwable {
  final Object result = this.internalMetaClass.doGetAnonMetaMethod().call(instance, p1, p2);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " is not callable");

    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#call(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public  Object callQuick(final Object instance, final Object p1, final Object p2, final Object p3) throws  Throwable {
  final Object result = this.internalMetaClass.doGetAnonMetaMethod().call(instance, p1, p2, p3);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " is not callable");

    return result;
  }
  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#call(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public  Object callQuick(final Object instance, final Object p1, final Object p2, final Object p3, final Object p4) throws  Throwable {
  final Object result = this.internalMetaClass.doGetAnonMetaMethod().call(instance, p1, p2, p3, p4);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " is not callable");

    return result;
  }

  public Object complement(final Object instance) throws  Throwable {
  final Object result = this.internalMetaClass.doComplement(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("~", this.getTheClass(instance).getName());

    return result;
  }

  public Object complement(final int instance) throws  Throwable {
  final Object result = this.internalMetaClass.doComplement(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("~", "int");

    return result;
  }

  public Object complement(final long instance) throws  Throwable {
  final Object result = this.internalMetaClass.doComplement(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("~", "long");

    return result;
  }

  public Object complement(final BigInteger instance) throws  Throwable {
  final Object result = this.internalMetaClass.doComplement(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("~", this.getTheClass(instance).getName());

    return result;
  }

  public Object not(final Object instance) throws  Throwable {
  final Object result = this.internalMetaClass.doNot(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("!", this.getTheClass(instance).getName());

    return result;
  }

  public Object not(final boolean instance) throws  Throwable {
  final Object result = this.internalMetaClass.doNot(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("!", "boolean");

    return result;
  }

  public Object unaryPlus(final Object instance) throws  Throwable {
  final Object result = this.internalMetaClass.doUnaryPlus(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("+", this.getTheClass(instance).getName());

    return result;
  }

  public Object unaryPlus(final int instance) throws  Throwable {
  final Object result = this.internalMetaClass.doUnaryPlus(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("+", "int");

    return result;
  }

  public Object unaryPlus(final long instance) throws  Throwable {
  final Object result = this.internalMetaClass.doUnaryPlus(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("+", "long");

    return result;
  }

  public Object unaryPlus(final float instance) throws  Throwable {
  final Object result = this.internalMetaClass.doUnaryPlus(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("+", "float");

    return result;
  }

  public Object unaryPlus(final double instance) throws  Throwable {
  final Object result = this.internalMetaClass.doUnaryPlus(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("+", "double");

    return result;
  }

  public Object unaryPlus(final BigInteger instance) throws  Throwable {
  final Object result = this.internalMetaClass.doUnaryPlus(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("+", this.getTheClass(instance).getName());

    return result;
  }

  public Object unaryPlus(final BigDecimal instance) throws Throwable {
  final Object result = this.internalMetaClass.doUnaryPlus(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("+", this.getTheClass(instance).getName());

    return result;
  }

  public Object unaryMinus(final Object instance) throws Throwable {
  final Object result = this.internalMetaClass.doUnaryMinus(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("-", this.getTheClass(instance).getName());
    return result;
  }

  public Object unaryMinus(final int instance) throws Throwable {
  final Object result = this.internalMetaClass.doUnaryMinus(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("-", "int");

    return result;
  }

  public Object unaryMinus(final long instance) throws Throwable {
  final Object result = this.internalMetaClass.doUnaryMinus(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("-", "long");

    return result;
  }

  public Object unaryMinus(final float instance) throws Throwable {
  final Object result = this.internalMetaClass.doUnaryMinus(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("-", "float");

    return result;
  }

  public Object unaryMinus(final double instance) throws Throwable {
  final Object result = this.internalMetaClass.doUnaryMinus(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("-", "double");

    return result;
  }

  public Object unaryMinus(final BigInteger instance) throws Throwable {
  final Object result = this.internalMetaClass.doUnaryMinus(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("-", this.getTheClass(instance).getName());

    return result;
  }

  public Object unaryMinus(final BigDecimal instance) throws Throwable {
  final Object result = this.internalMetaClass.doUnaryMinus(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("-", this.getTheClass(instance).getName());

    return result;
  }

  public Object isInstanceof(final Object instance, final Class type) throws Throwable {
  final Object result = this.internalMetaClass.doIsInstanceof(instance, type);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("instanceof", this.getTheClass(instance).getName());

    return result;
  }

  public Object isCase(final Object instance, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIsCase(instance, rhs);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " cannot appear as a case value");

    return result;
  }

  public Object asType(final Object instance, final Class type) throws Throwable {
  final Object result = this.internalMetaClass.doAsType(instance, type);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " cannot be converted to " + type.getClass().getName());

    return result;
  }

  public byte asByte(final Object instance) throws Throwable {
  final Object result = this.internalMetaClass.doAsType(instance, byte.class);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " cannot be converted to byte");

    return ((NgByte)result).getByteValue();
  }

  public char asChar(final Object instance) throws Throwable {
  final Object result = this.internalMetaClass.doAsType(instance, char.class);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " cannot be converted to char");

    return ((NgChar)result).getCharValue();
  }

  public short asShort(final Object instance) throws Throwable {
  final Object result = this.internalMetaClass.doAsType(instance, short.class);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " cannot be converted to short");

    return ((NgShort)result).getShortValue();
  }

  public int asInt(final Object instance) throws Throwable {
  final Object result = this.internalMetaClass.doAsType(instance, int.class);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " cannot be converted to int");

    return ((NgInt)result).getIntValue();
  }

  public long asLong(final Object instance) throws Throwable {
  final Object result = this.internalMetaClass.doAsType(instance, long.class);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " cannot be converted to long");

    return ((NgLong)result).getLongValue();
  }

  public float asFloat(final Object instance) throws Throwable {
  final Object result = this.internalMetaClass.doAsType(instance, float.class);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " cannot be converted to float");

    return ((NgFloat)result).getFloatValue();
  }

  public double asDouble(final Object instance) throws Throwable {
  final Object result = this.internalMetaClass.doAsType(instance, double.class);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " cannot be converted to double");

    return ((NgDouble)result).getDoubleValue();
  }

  public boolean asBoolean(final Object instance) throws Throwable {
  final Object result = this.internalMetaClass.doAsType(instance, boolean.class);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " cannot be converted to boolean");

    return ((NgBoolean)result).getBooleanValue();
  }

  public Object getAt(final Object instance, final Object index) throws Throwable {
  final Object result = this.internalMetaClass.doGetAt(instance, index);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " cannot be subscripted");

    return result;
  }

  public Object getAt(final Object instance, final int index) throws Throwable {
  final Object result = this.internalMetaClass.doGetAt(instance, index);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " cannot be subscripted");

    return result;
  }

  public Object getAt(final Object instance, final BigInteger index) throws Throwable {
  final Object result = this.internalMetaClass.doGetAt(instance, index);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " cannot be subscripted");

    return result;
  }

  public Object putAt(final Object instance, final Object index) throws Throwable {
  final Object result = this.internalMetaClass.doPutAt(instance, index);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " cannot be subscripted");

    return result;
  }

  public Object putAt(final Object instance, final int index) throws Throwable {
  final Object result = this.internalMetaClass.doPutAt(instance, index);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " cannot be subscripted");

    return result;
  }

  public Object putAt(final Object instance, final BigInteger index) throws Throwable {
  final Object result = this.internalMetaClass.doPutAt(instance, index);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgRuntimeException(this.getTheClass(instance).getName() + " cannot be subscripted");

    return result;
  }

  public Object prefixIncrement(final Object operand) throws Throwable {
  final Object result = this.internalMetaClass.doPrefixIncrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("++", this.getTheClass(operand).getName());

    return result;
  }

  public Object prefixIncrement(final int operand) throws Throwable {
  final Object result = this.internalMetaClass.doPrefixIncrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("++", "int");

    return result;
  }

  public Object prefixIncrement(final long operand) throws Throwable {
  final Object result = this.internalMetaClass.doPrefixIncrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("++", "long");

    return result;
  }

  public Object prefixIncrement(final float operand) throws Throwable {
  final Object result = this.internalMetaClass.doPrefixIncrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("++", "float");

    return result;
  }

  public Object prefixIncrement(final double operand) throws Throwable {
  final Object result = this.internalMetaClass.doPrefixIncrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("++", "double");

    return result;
  }

  public Object prefixIncrement(final BigInteger operand) throws Throwable {
  final Object result = this.internalMetaClass.doPrefixIncrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("++", this.getTheClass(operand).getName());

    return result;
  }

  public Object prefixIncrement(final BigDecimal operand) throws Throwable {
  final Object result = this.internalMetaClass.doPrefixIncrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("++", this.getTheClass(operand).getName());

    return result;
  }

  public Object prefixDecrement(final Object operand) throws Throwable {
  final Object result = this.internalMetaClass.doPrefixDecrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("--", this.getTheClass(operand).getName());

    return result;
  }

  public Object prefixDecrement(final int operand) throws Throwable {
  final Object result = this.internalMetaClass.doPrefixDecrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("--", "int");

    return result;
  }

  public Object prefixDecrement(final long operand) throws Throwable {
  final Object result = this.internalMetaClass.doPrefixDecrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("--", "long");

    return result;
  }

  public Object prefixDecrement(final float operand) throws Throwable {
  final Object result = this.internalMetaClass.doPrefixDecrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("--", "float");

    return result;
  }

  public Object prefixDecrement(final double operand) throws Throwable {
  final Object result = this.internalMetaClass.doPrefixDecrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("--", "double");

    return result;
  }

  public Object prefixDecrement(final BigInteger operand) throws Throwable {
  final Object result = this.internalMetaClass.doPrefixDecrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("--", this.getTheClass(operand).getName());

    return result;
  }

  public Object prefixDecrement(final BigDecimal operand) throws Throwable {
  final Object result = this.internalMetaClass.doPrefixDecrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("--", this.getTheClass(operand).getName());

    return result;
  }

  public Object postfixIncrement(final Object operand) throws Throwable {
  final Object result = this.internalMetaClass.doPostfixIncrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPostfixUnaryOperatorException("++", this.getTheClass(operand).getName());

    return result;
  }

  public Object postfixIncrement(final int operand) throws Throwable {
  final Object result = this.internalMetaClass.doPostfixIncrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPostfixUnaryOperatorException("++", "int");

    return result;
  }

  public Object postfixIncrement(final long operand) throws Throwable {
  final Object result = this.internalMetaClass.doPostfixIncrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPostfixUnaryOperatorException("++", "long");

    return result;
  }

  public Object postfixIncrement(final float operand) throws Throwable {
  final Object result = this.internalMetaClass.doPostfixIncrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPostfixUnaryOperatorException("++", "float");

    return result;
  }

  public Object postfixIncrement(final double operand) throws Throwable {
  final Object result = this.internalMetaClass.doPostfixIncrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPostfixUnaryOperatorException("++", "double");

    return result;
  }

  public Object postfixIncrement(final BigInteger operand) throws Throwable {
  final Object result = this.internalMetaClass.doPostfixIncrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPostfixUnaryOperatorException("++", this.getTheClass(operand).getName());

    return result;
  }

  public Object postfixIncrement(final BigDecimal operand) throws Throwable {
  final Object result = this.internalMetaClass.doPostfixIncrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPostfixUnaryOperatorException("++", this.getTheClass(operand).getName());

    return result;
  }

  public Object postfixDecrement(final Object operand) throws Throwable {
  final Object result = this.internalMetaClass.doPostfixDecrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPostfixUnaryOperatorException("--", this.getTheClass(operand).getName());

    return result;
  }

  public Object postfixDecrement(final int operand) throws Throwable {
  final Object result = this.internalMetaClass.doPostfixDecrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPostfixUnaryOperatorException("--", "int");

    return result;
  }

  public Object postfixDecrement(final long operand) throws Throwable {
  final Object result = this.internalMetaClass.doPostfixDecrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPostfixUnaryOperatorException("--", "long");

    return result;
  }

  public Object postfixDecrement(final float operand) throws Throwable {
  final Object result = this.internalMetaClass.doPostfixDecrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPostfixUnaryOperatorException("--", "float");

    return result;
  }

  public Object postfixDecrement(final double operand) throws Throwable {
  final Object result = this.internalMetaClass.doPostfixDecrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPostfixUnaryOperatorException("--", "double");

    return result;
  }

  public Object postfixDecrement(final BigInteger operand) throws Throwable {
  final Object result = this.internalMetaClass.doPostfixDecrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPostfixUnaryOperatorException("--", this.getTheClass(operand).getName());

    return result;
  }

  public Object postfixDecrement(final BigDecimal operand) throws Throwable {
  final Object result = this.internalMetaClass.doPostfixDecrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPostfixUnaryOperatorException("--", this.getTheClass(operand).getName());
    return result;
  }

  //
  //   MetaClass method for operator +
  //

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#add(java.lang.Object, java.lang.Object)
   */
  public Object add(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "+", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator +
  //
  
  public Object add(final byte lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+", byte.class);
      
    return result;
  }

  public Object add(final byte lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+", char.class);
      
    return result;
  }

  public Object add(final byte lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+", short.class);
      
    return result;
  }

  public Object add(final byte lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+", int.class);
      
    return result;
  }

  public Object add(final byte lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+", long.class);
      
    return result;
  }

  public Object add(final byte lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+", float.class);
      
    return result;
  }

  public Object add(final byte lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+", double.class);
      
    return result;
  }

  public Object add(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+", BigInteger.class);
      
    return result;
  }

  public Object add(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+", BigDecimal.class);
      
    return result;
  }

  public Object add(final char lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+", byte.class);
      
    return result;
  }

  public Object add(final char lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+", char.class);
      
    return result;
  }

  public Object add(final char lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+", short.class);
      
    return result;
  }

  public Object add(final char lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+", int.class);
      
    return result;
  }

  public Object add(final char lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+", long.class);
      
    return result;
  }

  public Object add(final char lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+", float.class);
      
    return result;
  }

  public Object add(final char lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+", double.class);
      
    return result;
  }

  public Object add(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+", BigInteger.class);
      
    return result;
  }

  public Object add(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+", BigDecimal.class);
      
    return result;
  }

  public Object add(final short lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+", byte.class);
      
    return result;
  }

  public Object add(final short lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+", char.class);
      
    return result;
  }

  public Object add(final short lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+", short.class);
      
    return result;
  }

  public Object add(final short lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+", int.class);
      
    return result;
  }

  public Object add(final short lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+", long.class);
      
    return result;
  }

  public Object add(final short lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+", float.class);
      
    return result;
  }

  public Object add(final short lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+", double.class);
      
    return result;
  }

  public Object add(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+", BigInteger.class);
      
    return result;
  }

  public Object add(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+", BigDecimal.class);
      
    return result;
  }

  public Object add(final int lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+", byte.class);
      
    return result;
  }

  public Object add(final int lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+", char.class);
      
    return result;
  }

  public Object add(final int lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+", short.class);
      
    return result;
  }

  public Object add(final int lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+", int.class);
      
    return result;
  }

  public Object add(final int lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+", long.class);
      
    return result;
  }

  public Object add(final int lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+", float.class);
      
    return result;
  }

  public Object add(final int lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+", double.class);
      
    return result;
  }

  public Object add(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+", BigInteger.class);
      
    return result;
  }

  public Object add(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+", BigDecimal.class);
      
    return result;
  }

  public Object add(final long lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+", byte.class);
      
    return result;
  }

  public Object add(final long lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+", char.class);
      
    return result;
  }

  public Object add(final long lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+", short.class);
      
    return result;
  }

  public Object add(final long lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+", int.class);
      
    return result;
  }

  public Object add(final long lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+", long.class);
      
    return result;
  }

  public Object add(final long lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+", float.class);
      
    return result;
  }

  public Object add(final long lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+", double.class);
      
    return result;
  }

  public Object add(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+", BigInteger.class);
      
    return result;
  }

  public Object add(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+", BigDecimal.class);
      
    return result;
  }

  public Object add(final float lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+", byte.class);
      
    return result;
  }

  public Object add(final float lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+", char.class);
      
    return result;
  }

  public Object add(final float lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+", short.class);
      
    return result;
  }

  public Object add(final float lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+", int.class);
      
    return result;
  }

  public Object add(final float lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+", long.class);
      
    return result;
  }

  public Object add(final float lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+", float.class);
      
    return result;
  }

  public Object add(final float lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+", double.class);
      
    return result;
  }

  public Object add(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+", BigInteger.class);
      
    return result;
  }

  public Object add(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+", BigDecimal.class);
      
    return result;
  }

  public Object add(final double lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+", byte.class);
      
    return result;
  }

  public Object add(final double lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+", char.class);
      
    return result;
  }

  public Object add(final double lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+", short.class);
      
    return result;
  }

  public Object add(final double lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+", int.class);
      
    return result;
  }

  public Object add(final double lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+", long.class);
      
    return result;
  }

  public Object add(final double lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+", float.class);
      
    return result;
  }

  public Object add(final double lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+", double.class);
      
    return result;
  }

  public Object add(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+", BigInteger.class);
      
    return result;
  }

  public Object add(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+", BigDecimal.class);
      
    return result;
  }

  public Object add(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+", byte.class);
      
    return result;
  }

  public Object add(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", char.class);
      
    return result;
  }

  public Object add(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", short.class);
      
    return result;
  }

  public Object add(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", int.class);
      
    return result;
  }

  public Object add(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", long.class);
      
    return result;
  }

  public Object add(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", float.class);
      
    return result;
  }

  public Object add(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", double.class);
      
    return result;
  }

  public Object add(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", BigInteger.class);
      
    return result;
  }

  public Object add(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", BigDecimal.class);
      
    return result;
  }

  public Object add(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", byte.class);
      
    return result;
  }

  public Object add(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", char.class);
      
    return result;
  }

  public Object add(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", short.class);
      
    return result;
  }

  public Object add(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", int.class);
      
    return result;
  }

  public Object add(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", long.class);
      
    return result;
  }

  public Object add(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", float.class);
      
    return result;
  }

  public Object add(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", double.class);
      
    return result;
  }

  public Object add(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", BigInteger.class);
      
    return result;
  }

  public Object add(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", BigDecimal.class);
      
    return result;
  }

  public Object add(final Object lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", byte.class);
        
    return result;
  }

  public Object add(final Object lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", char.class);
        
    return result;
  }

  public Object add(final Object lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", short.class);
        
    return result;
  }

  public Object add(final Object lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", int.class);
        
    return result;
  }

  public Object add(final Object lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", long.class);
        
    return result;
  }

  public Object add(final Object lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", float.class);
        
    return result;
  }

  public Object add(final Object lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", double.class);
        
    return result;
  }

  public Object add(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", BigInteger.class);
        
    return result;
  }

  public Object add(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", BigDecimal.class);
        
    return result;
  }

  public Object reverseAdd(final byte lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAdd(final char lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAdd(final short lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAdd(final int lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAdd(final long lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAdd(final float lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAdd(final double lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAdd(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAdd(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   MetaClass method for operator +=
  //

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.lang.Object, java.lang.Object)
   */
  public Object addEquals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "+=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator +=
  //
  
  public Object addEquals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+=", byte.class);
      
    return result;
  }

  public Object addEquals(final byte lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+=", char.class);
      
    return result;
  }

  public Object addEquals(final byte lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+=", short.class);
      
    return result;
  }

  public Object addEquals(final byte lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+=", int.class);
      
    return result;
  }

  public Object addEquals(final byte lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+=", long.class);
      
    return result;
  }

  public Object addEquals(final byte lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+=", float.class);
      
    return result;
  }

  public Object addEquals(final byte lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+=", double.class);
      
    return result;
  }

  public Object addEquals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+=", BigInteger.class);
      
    return result;
  }

  public Object addEquals(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+=", BigDecimal.class);
      
    return result;
  }

  public Object addEquals(final char lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+=", byte.class);
      
    return result;
  }

  public Object addEquals(final char lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+=", char.class);
      
    return result;
  }

  public Object addEquals(final char lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+=", short.class);
      
    return result;
  }

  public Object addEquals(final char lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+=", int.class);
      
    return result;
  }

  public Object addEquals(final char lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+=", long.class);
      
    return result;
  }

  public Object addEquals(final char lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+=", float.class);
      
    return result;
  }

  public Object addEquals(final char lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+=", double.class);
      
    return result;
  }

  public Object addEquals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+=", BigInteger.class);
      
    return result;
  }

  public Object addEquals(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+=", BigDecimal.class);
      
    return result;
  }

  public Object addEquals(final short lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+=", byte.class);
      
    return result;
  }

  public Object addEquals(final short lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+=", char.class);
      
    return result;
  }

  public Object addEquals(final short lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+=", short.class);
      
    return result;
  }

  public Object addEquals(final short lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+=", int.class);
      
    return result;
  }

  public Object addEquals(final short lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+=", long.class);
      
    return result;
  }

  public Object addEquals(final short lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+=", float.class);
      
    return result;
  }

  public Object addEquals(final short lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+=", double.class);
      
    return result;
  }

  public Object addEquals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+=", BigInteger.class);
      
    return result;
  }

  public Object addEquals(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+=", BigDecimal.class);
      
    return result;
  }

  public Object addEquals(final int lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+=", byte.class);
      
    return result;
  }

  public Object addEquals(final int lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+=", char.class);
      
    return result;
  }

  public Object addEquals(final int lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+=", short.class);
      
    return result;
  }

  public Object addEquals(final int lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+=", int.class);
      
    return result;
  }

  public Object addEquals(final int lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+=", long.class);
      
    return result;
  }

  public Object addEquals(final int lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+=", float.class);
      
    return result;
  }

  public Object addEquals(final int lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+=", double.class);
      
    return result;
  }

  public Object addEquals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+=", BigInteger.class);
      
    return result;
  }

  public Object addEquals(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+=", BigDecimal.class);
      
    return result;
  }

  public Object addEquals(final long lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+=", byte.class);
      
    return result;
  }

  public Object addEquals(final long lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+=", char.class);
      
    return result;
  }

  public Object addEquals(final long lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+=", short.class);
      
    return result;
  }

  public Object addEquals(final long lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+=", int.class);
      
    return result;
  }

  public Object addEquals(final long lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+=", long.class);
      
    return result;
  }

  public Object addEquals(final long lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+=", float.class);
      
    return result;
  }

  public Object addEquals(final long lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+=", double.class);
      
    return result;
  }

  public Object addEquals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+=", BigInteger.class);
      
    return result;
  }

  public Object addEquals(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+=", BigDecimal.class);
      
    return result;
  }

  public Object addEquals(final float lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+=", byte.class);
      
    return result;
  }

  public Object addEquals(final float lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+=", char.class);
      
    return result;
  }

  public Object addEquals(final float lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+=", short.class);
      
    return result;
  }

  public Object addEquals(final float lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+=", int.class);
      
    return result;
  }

  public Object addEquals(final float lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+=", long.class);
      
    return result;
  }

  public Object addEquals(final float lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+=", float.class);
      
    return result;
  }

  public Object addEquals(final float lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+=", double.class);
      
    return result;
  }

  public Object addEquals(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+=", BigInteger.class);
      
    return result;
  }

  public Object addEquals(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+=", BigDecimal.class);
      
    return result;
  }

  public Object addEquals(final double lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+=", byte.class);
      
    return result;
  }

  public Object addEquals(final double lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+=", char.class);
      
    return result;
  }

  public Object addEquals(final double lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+=", short.class);
      
    return result;
  }

  public Object addEquals(final double lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+=", int.class);
      
    return result;
  }

  public Object addEquals(final double lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+=", long.class);
      
    return result;
  }

  public Object addEquals(final double lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+=", float.class);
      
    return result;
  }

  public Object addEquals(final double lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+=", double.class);
      
    return result;
  }

  public Object addEquals(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+=", BigInteger.class);
      
    return result;
  }

  public Object addEquals(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+=", BigDecimal.class);
      
    return result;
  }

  public Object addEquals(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", byte.class);
      
    return result;
  }

  public Object addEquals(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", char.class);
      
    return result;
  }

  public Object addEquals(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", short.class);
      
    return result;
  }

  public Object addEquals(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", int.class);
      
    return result;
  }

  public Object addEquals(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", long.class);
      
    return result;
  }

  public Object addEquals(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", float.class);
      
    return result;
  }

  public Object addEquals(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", double.class);
      
    return result;
  }

  public Object addEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", BigInteger.class);
      
    return result;
  }

  public Object addEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", BigDecimal.class);
      
    return result;
  }

  public Object addEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", byte.class);
      
    return result;
  }

  public Object addEquals(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", char.class);
      
    return result;
  }

  public Object addEquals(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", short.class);
      
    return result;
  }

  public Object addEquals(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", int.class);
      
    return result;
  }

  public Object addEquals(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", long.class);
      
    return result;
  }

  public Object addEquals(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", float.class);
      
    return result;
  }

  public Object addEquals(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", double.class);
      
    return result;
  }

  public Object addEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", BigInteger.class);
      
    return result;
  }

  public Object addEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", BigDecimal.class);
      
    return result;
  }

  public Object addEquals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", byte.class);
        
    return result;
  }

  public Object addEquals(final Object lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", char.class);
        
    return result;
  }

  public Object addEquals(final Object lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", short.class);
        
    return result;
  }

  public Object addEquals(final Object lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", int.class);
        
    return result;
  }

  public Object addEquals(final Object lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", long.class);
        
    return result;
  }

  public Object addEquals(final Object lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", float.class);
        
    return result;
  }

  public Object addEquals(final Object lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", double.class);
        
    return result;
  }

  public Object addEquals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", BigInteger.class);
        
    return result;
  }

  public Object addEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", BigDecimal.class);
        
    return result;
  }

  public Object reverseAddEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAddEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAddEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAddEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAddEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAddEquals(final float lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAddEquals(final double lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAddEquals(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAddEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   MetaClass method for operator -
  //

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#subtract(java.lang.Object, java.lang.Object)
   */
  public Object subtract(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "-", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator -
  //
  
  public Object subtract(final byte lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-", byte.class);
      
    return result;
  }

  public Object subtract(final byte lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-", char.class);
      
    return result;
  }

  public Object subtract(final byte lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-", short.class);
      
    return result;
  }

  public Object subtract(final byte lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-", int.class);
      
    return result;
  }

  public Object subtract(final byte lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-", long.class);
      
    return result;
  }

  public Object subtract(final byte lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-", float.class);
      
    return result;
  }

  public Object subtract(final byte lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-", double.class);
      
    return result;
  }

  public Object subtract(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-", BigInteger.class);
      
    return result;
  }

  public Object subtract(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-", BigDecimal.class);
      
    return result;
  }

  public Object subtract(final char lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-", byte.class);
      
    return result;
  }

  public Object subtract(final char lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-", char.class);
      
    return result;
  }

  public Object subtract(final char lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-", short.class);
      
    return result;
  }

  public Object subtract(final char lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-", int.class);
      
    return result;
  }

  public Object subtract(final char lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-", long.class);
      
    return result;
  }

  public Object subtract(final char lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-", float.class);
      
    return result;
  }

  public Object subtract(final char lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-", double.class);
      
    return result;
  }

  public Object subtract(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-", BigInteger.class);
      
    return result;
  }

  public Object subtract(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-", BigDecimal.class);
      
    return result;
  }

  public Object subtract(final short lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-", byte.class);
      
    return result;
  }

  public Object subtract(final short lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-", char.class);
      
    return result;
  }

  public Object subtract(final short lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-", short.class);
      
    return result;
  }

  public Object subtract(final short lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-", int.class);
      
    return result;
  }

  public Object subtract(final short lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-", long.class);
      
    return result;
  }

  public Object subtract(final short lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-", float.class);
      
    return result;
  }

  public Object subtract(final short lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-", double.class);
      
    return result;
  }

  public Object subtract(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-", BigInteger.class);
      
    return result;
  }

  public Object subtract(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-", BigDecimal.class);
      
    return result;
  }

  public Object subtract(final int lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-", byte.class);
      
    return result;
  }

  public Object subtract(final int lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-", char.class);
      
    return result;
  }

  public Object subtract(final int lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-", short.class);
      
    return result;
  }

  public Object subtract(final int lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-", int.class);
      
    return result;
  }

  public Object subtract(final int lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-", long.class);
      
    return result;
  }

  public Object subtract(final int lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-", float.class);
      
    return result;
  }

  public Object subtract(final int lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-", double.class);
      
    return result;
  }

  public Object subtract(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-", BigInteger.class);
      
    return result;
  }

  public Object subtract(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-", BigDecimal.class);
      
    return result;
  }

  public Object subtract(final long lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-", byte.class);
      
    return result;
  }

  public Object subtract(final long lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-", char.class);
      
    return result;
  }

  public Object subtract(final long lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-", short.class);
      
    return result;
  }

  public Object subtract(final long lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-", int.class);
      
    return result;
  }

  public Object subtract(final long lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-", long.class);
      
    return result;
  }

  public Object subtract(final long lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-", float.class);
      
    return result;
  }

  public Object subtract(final long lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-", double.class);
      
    return result;
  }

  public Object subtract(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-", BigInteger.class);
      
    return result;
  }

  public Object subtract(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-", BigDecimal.class);
      
    return result;
  }

  public Object subtract(final float lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-", byte.class);
      
    return result;
  }

  public Object subtract(final float lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-", char.class);
      
    return result;
  }

  public Object subtract(final float lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-", short.class);
      
    return result;
  }

  public Object subtract(final float lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-", int.class);
      
    return result;
  }

  public Object subtract(final float lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-", long.class);
      
    return result;
  }

  public Object subtract(final float lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-", float.class);
      
    return result;
  }

  public Object subtract(final float lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-", double.class);
      
    return result;
  }

  public Object subtract(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-", BigInteger.class);
      
    return result;
  }

  public Object subtract(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-", BigDecimal.class);
      
    return result;
  }

  public Object subtract(final double lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-", byte.class);
      
    return result;
  }

  public Object subtract(final double lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-", char.class);
      
    return result;
  }

  public Object subtract(final double lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-", short.class);
      
    return result;
  }

  public Object subtract(final double lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-", int.class);
      
    return result;
  }

  public Object subtract(final double lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-", long.class);
      
    return result;
  }

  public Object subtract(final double lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-", float.class);
      
    return result;
  }

  public Object subtract(final double lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-", double.class);
      
    return result;
  }

  public Object subtract(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-", BigInteger.class);
      
    return result;
  }

  public Object subtract(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-", BigDecimal.class);
      
    return result;
  }

  public Object subtract(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", byte.class);
      
    return result;
  }

  public Object subtract(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", char.class);
      
    return result;
  }

  public Object subtract(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", short.class);
      
    return result;
  }

  public Object subtract(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", int.class);
      
    return result;
  }

  public Object subtract(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", long.class);
      
    return result;
  }

  public Object subtract(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", float.class);
      
    return result;
  }

  public Object subtract(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", double.class);
      
    return result;
  }

  public Object subtract(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", BigInteger.class);
      
    return result;
  }

  public Object subtract(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", BigDecimal.class);
      
    return result;
  }

  public Object subtract(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", byte.class);
      
    return result;
  }

  public Object subtract(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", char.class);
      
    return result;
  }

  public Object subtract(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", short.class);
      
    return result;
  }

  public Object subtract(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", int.class);
      
    return result;
  }

  public Object subtract(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", long.class);
      
    return result;
  }

  public Object subtract(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", float.class);
      
    return result;
  }

  public Object subtract(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", double.class);
      
    return result;
  }

  public Object subtract(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", BigInteger.class);
      
    return result;
  }

  public Object subtract(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", BigDecimal.class);
      
    return result;
  }

  public Object subtract(final Object lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", byte.class);
        
    return result;
  }

  public Object subtract(final Object lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", char.class);
        
    return result;
  }

  public Object subtract(final Object lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", short.class);
        
    return result;
  }

  public Object subtract(final Object lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", int.class);
        
    return result;
  }

  public Object subtract(final Object lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", long.class);
        
    return result;
  }

  public Object subtract(final Object lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", float.class);
        
    return result;
  }

  public Object subtract(final Object lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", double.class);
        
    return result;
  }

  public Object subtract(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", BigInteger.class);
        
    return result;
  }

  public Object subtract(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", BigDecimal.class);
        
    return result;
  }

  public Object reverseSubtract(final byte lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtract(final char lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtract(final short lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtract(final int lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtract(final long lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtract(final float lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtract(final double lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtract(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtract(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   MetaClass method for operator -=
  //

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.lang.Object, java.lang.Object)
   */
  public Object subtractEquals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "-=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator -=
  //
  
  public Object subtractEquals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-=", byte.class);
      
    return result;
  }

  public Object subtractEquals(final byte lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-=", char.class);
      
    return result;
  }

  public Object subtractEquals(final byte lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-=", short.class);
      
    return result;
  }

  public Object subtractEquals(final byte lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-=", int.class);
      
    return result;
  }

  public Object subtractEquals(final byte lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-=", long.class);
      
    return result;
  }

  public Object subtractEquals(final byte lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-=", float.class);
      
    return result;
  }

  public Object subtractEquals(final byte lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-=", double.class);
      
    return result;
  }

  public Object subtractEquals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-=", BigInteger.class);
      
    return result;
  }

  public Object subtractEquals(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-=", BigDecimal.class);
      
    return result;
  }

  public Object subtractEquals(final char lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-=", byte.class);
      
    return result;
  }

  public Object subtractEquals(final char lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-=", char.class);
      
    return result;
  }

  public Object subtractEquals(final char lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-=", short.class);
      
    return result;
  }

  public Object subtractEquals(final char lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-=", int.class);
      
    return result;
  }

  public Object subtractEquals(final char lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-=", long.class);
      
    return result;
  }

  public Object subtractEquals(final char lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-=", float.class);
      
    return result;
  }

  public Object subtractEquals(final char lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-=", double.class);
      
    return result;
  }

  public Object subtractEquals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-=", BigInteger.class);
      
    return result;
  }

  public Object subtractEquals(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-=", BigDecimal.class);
      
    return result;
  }

  public Object subtractEquals(final short lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-=", byte.class);
      
    return result;
  }

  public Object subtractEquals(final short lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-=", char.class);
      
    return result;
  }

  public Object subtractEquals(final short lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-=", short.class);
      
    return result;
  }

  public Object subtractEquals(final short lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-=", int.class);
      
    return result;
  }

  public Object subtractEquals(final short lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-=", long.class);
      
    return result;
  }

  public Object subtractEquals(final short lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-=", float.class);
      
    return result;
  }

  public Object subtractEquals(final short lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-=", double.class);
      
    return result;
  }

  public Object subtractEquals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-=", BigInteger.class);
      
    return result;
  }

  public Object subtractEquals(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-=", BigDecimal.class);
      
    return result;
  }

  public Object subtractEquals(final int lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-=", byte.class);
      
    return result;
  }

  public Object subtractEquals(final int lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-=", char.class);
      
    return result;
  }

  public Object subtractEquals(final int lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-=", short.class);
      
    return result;
  }

  public Object subtractEquals(final int lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-=", int.class);
      
    return result;
  }

  public Object subtractEquals(final int lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-=", long.class);
      
    return result;
  }

  public Object subtractEquals(final int lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-=", float.class);
      
    return result;
  }

  public Object subtractEquals(final int lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-=", double.class);
      
    return result;
  }

  public Object subtractEquals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-=", BigInteger.class);
      
    return result;
  }

  public Object subtractEquals(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-=", BigDecimal.class);
      
    return result;
  }

  public Object subtractEquals(final long lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-=", byte.class);
      
    return result;
  }

  public Object subtractEquals(final long lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-=", char.class);
      
    return result;
  }

  public Object subtractEquals(final long lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-=", short.class);
      
    return result;
  }

  public Object subtractEquals(final long lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-=", int.class);
      
    return result;
  }

  public Object subtractEquals(final long lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-=", long.class);
      
    return result;
  }

  public Object subtractEquals(final long lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-=", float.class);
      
    return result;
  }

  public Object subtractEquals(final long lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-=", double.class);
      
    return result;
  }

  public Object subtractEquals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-=", BigInteger.class);
      
    return result;
  }

  public Object subtractEquals(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-=", BigDecimal.class);
      
    return result;
  }

  public Object subtractEquals(final float lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-=", byte.class);
      
    return result;
  }

  public Object subtractEquals(final float lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-=", char.class);
      
    return result;
  }

  public Object subtractEquals(final float lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-=", short.class);
      
    return result;
  }

  public Object subtractEquals(final float lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-=", int.class);
      
    return result;
  }

  public Object subtractEquals(final float lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-=", long.class);
      
    return result;
  }

  public Object subtractEquals(final float lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-=", float.class);
      
    return result;
  }

  public Object subtractEquals(final float lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-=", double.class);
      
    return result;
  }

  public Object subtractEquals(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-=", BigInteger.class);
      
    return result;
  }

  public Object subtractEquals(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-=", BigDecimal.class);
      
    return result;
  }

  public Object subtractEquals(final double lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-=", byte.class);
      
    return result;
  }

  public Object subtractEquals(final double lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-=", char.class);
      
    return result;
  }

  public Object subtractEquals(final double lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-=", short.class);
      
    return result;
  }

  public Object subtractEquals(final double lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-=", int.class);
      
    return result;
  }

  public Object subtractEquals(final double lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-=", long.class);
      
    return result;
  }

  public Object subtractEquals(final double lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-=", float.class);
      
    return result;
  }

  public Object subtractEquals(final double lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-=", double.class);
      
    return result;
  }

  public Object subtractEquals(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-=", BigInteger.class);
      
    return result;
  }

  public Object subtractEquals(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-=", BigDecimal.class);
      
    return result;
  }

  public Object subtractEquals(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", byte.class);
      
    return result;
  }

  public Object subtractEquals(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", char.class);
      
    return result;
  }

  public Object subtractEquals(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", short.class);
      
    return result;
  }

  public Object subtractEquals(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", int.class);
      
    return result;
  }

  public Object subtractEquals(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", long.class);
      
    return result;
  }

  public Object subtractEquals(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", float.class);
      
    return result;
  }

  public Object subtractEquals(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", double.class);
      
    return result;
  }

  public Object subtractEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", BigInteger.class);
      
    return result;
  }

  public Object subtractEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", BigDecimal.class);
      
    return result;
  }

  public Object subtractEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", byte.class);
      
    return result;
  }

  public Object subtractEquals(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", char.class);
      
    return result;
  }

  public Object subtractEquals(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", short.class);
      
    return result;
  }

  public Object subtractEquals(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", int.class);
      
    return result;
  }

  public Object subtractEquals(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", long.class);
      
    return result;
  }

  public Object subtractEquals(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", float.class);
      
    return result;
  }

  public Object subtractEquals(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", double.class);
      
    return result;
  }

  public Object subtractEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", BigInteger.class);
      
    return result;
  }

  public Object subtractEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", BigDecimal.class);
      
    return result;
  }

  public Object subtractEquals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", byte.class);
        
    return result;
  }

  public Object subtractEquals(final Object lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", char.class);
        
    return result;
  }

  public Object subtractEquals(final Object lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", short.class);
        
    return result;
  }

  public Object subtractEquals(final Object lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", int.class);
        
    return result;
  }

  public Object subtractEquals(final Object lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", long.class);
        
    return result;
  }

  public Object subtractEquals(final Object lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", float.class);
        
    return result;
  }

  public Object subtractEquals(final Object lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", double.class);
        
    return result;
  }

  public Object subtractEquals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", BigInteger.class);
        
    return result;
  }

  public Object subtractEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", BigDecimal.class);
        
    return result;
  }

  public Object reverseSubtractEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtractEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtractEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtractEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtractEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtractEquals(final float lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtractEquals(final double lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtractEquals(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtractEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   MetaClass method for operator *
  //

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#multiply(java.lang.Object, java.lang.Object)
   */
  public Object multiply(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "*", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator *
  //
  
  public Object multiply(final byte lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*", byte.class);
      
    return result;
  }

  public Object multiply(final byte lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*", char.class);
      
    return result;
  }

  public Object multiply(final byte lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*", short.class);
      
    return result;
  }

  public Object multiply(final byte lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*", int.class);
      
    return result;
  }

  public Object multiply(final byte lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*", long.class);
      
    return result;
  }

  public Object multiply(final byte lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*", float.class);
      
    return result;
  }

  public Object multiply(final byte lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*", double.class);
      
    return result;
  }

  public Object multiply(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*", BigInteger.class);
      
    return result;
  }

  public Object multiply(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*", BigDecimal.class);
      
    return result;
  }

  public Object multiply(final char lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*", byte.class);
      
    return result;
  }

  public Object multiply(final char lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*", char.class);
      
    return result;
  }

  public Object multiply(final char lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*", short.class);
      
    return result;
  }

  public Object multiply(final char lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*", int.class);
      
    return result;
  }

  public Object multiply(final char lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*", long.class);
      
    return result;
  }

  public Object multiply(final char lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*", float.class);
      
    return result;
  }

  public Object multiply(final char lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*", double.class);
      
    return result;
  }

  public Object multiply(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*", BigInteger.class);
      
    return result;
  }

  public Object multiply(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*", BigDecimal.class);
      
    return result;
  }

  public Object multiply(final short lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*", byte.class);
      
    return result;
  }

  public Object multiply(final short lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*", char.class);
      
    return result;
  }

  public Object multiply(final short lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*", short.class);
      
    return result;
  }

  public Object multiply(final short lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*", int.class);
      
    return result;
  }

  public Object multiply(final short lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*", long.class);
      
    return result;
  }

  public Object multiply(final short lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*", float.class);
      
    return result;
  }

  public Object multiply(final short lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*", double.class);
      
    return result;
  }

  public Object multiply(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*", BigInteger.class);
      
    return result;
  }

  public Object multiply(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*", BigDecimal.class);
      
    return result;
  }

  public Object multiply(final int lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*", byte.class);
      
    return result;
  }

  public Object multiply(final int lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*", char.class);
      
    return result;
  }

  public Object multiply(final int lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*", short.class);
      
    return result;
  }

  public Object multiply(final int lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*", int.class);
      
    return result;
  }

  public Object multiply(final int lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*", long.class);
      
    return result;
  }

  public Object multiply(final int lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*", float.class);
      
    return result;
  }

  public Object multiply(final int lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*", double.class);
      
    return result;
  }

  public Object multiply(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*", BigInteger.class);
      
    return result;
  }

  public Object multiply(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*", BigDecimal.class);
      
    return result;
  }

  public Object multiply(final long lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*", byte.class);
      
    return result;
  }

  public Object multiply(final long lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*", char.class);
      
    return result;
  }

  public Object multiply(final long lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*", short.class);
      
    return result;
  }

  public Object multiply(final long lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*", int.class);
      
    return result;
  }

  public Object multiply(final long lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*", long.class);
      
    return result;
  }

  public Object multiply(final long lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*", float.class);
      
    return result;
  }

  public Object multiply(final long lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*", double.class);
      
    return result;
  }

  public Object multiply(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*", BigInteger.class);
      
    return result;
  }

  public Object multiply(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*", BigDecimal.class);
      
    return result;
  }

  public Object multiply(final float lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*", byte.class);
      
    return result;
  }

  public Object multiply(final float lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*", char.class);
      
    return result;
  }

  public Object multiply(final float lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*", short.class);
      
    return result;
  }

  public Object multiply(final float lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*", int.class);
      
    return result;
  }

  public Object multiply(final float lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*", long.class);
      
    return result;
  }

  public Object multiply(final float lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*", float.class);
      
    return result;
  }

  public Object multiply(final float lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*", double.class);
      
    return result;
  }

  public Object multiply(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*", BigInteger.class);
      
    return result;
  }

  public Object multiply(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*", BigDecimal.class);
      
    return result;
  }

  public Object multiply(final double lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*", byte.class);
      
    return result;
  }

  public Object multiply(final double lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*", char.class);
      
    return result;
  }

  public Object multiply(final double lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*", short.class);
      
    return result;
  }

  public Object multiply(final double lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*", int.class);
      
    return result;
  }

  public Object multiply(final double lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*", long.class);
      
    return result;
  }

  public Object multiply(final double lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*", float.class);
      
    return result;
  }

  public Object multiply(final double lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*", double.class);
      
    return result;
  }

  public Object multiply(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*", BigInteger.class);
      
    return result;
  }

  public Object multiply(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*", BigDecimal.class);
      
    return result;
  }

  public Object multiply(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", byte.class);
      
    return result;
  }

  public Object multiply(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", char.class);
      
    return result;
  }

  public Object multiply(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", short.class);
      
    return result;
  }

  public Object multiply(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", int.class);
      
    return result;
  }

  public Object multiply(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", long.class);
      
    return result;
  }

  public Object multiply(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", float.class);
      
    return result;
  }

  public Object multiply(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", double.class);
      
    return result;
  }

  public Object multiply(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", BigInteger.class);
      
    return result;
  }

  public Object multiply(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", BigDecimal.class);
      
    return result;
  }

  public Object multiply(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", byte.class);
      
    return result;
  }

  public Object multiply(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", char.class);
      
    return result;
  }

  public Object multiply(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", short.class);
      
    return result;
  }

  public Object multiply(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", int.class);
      
    return result;
  }

  public Object multiply(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", long.class);
      
    return result;
  }

  public Object multiply(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", float.class);
      
    return result;
  }

  public Object multiply(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", double.class);
      
    return result;
  }

  public Object multiply(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", BigInteger.class);
      
    return result;
  }

  public Object multiply(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", BigDecimal.class);
      
    return result;
  }

  public Object multiply(final Object lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", byte.class);
        
    return result;
  }

  public Object multiply(final Object lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", char.class);
        
    return result;
  }

  public Object multiply(final Object lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", short.class);
        
    return result;
  }

  public Object multiply(final Object lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", int.class);
        
    return result;
  }

  public Object multiply(final Object lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", long.class);
        
    return result;
  }

  public Object multiply(final Object lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", float.class);
        
    return result;
  }

  public Object multiply(final Object lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", double.class);
        
    return result;
  }

  public Object multiply(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", BigInteger.class);
        
    return result;
  }

  public Object multiply(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", BigDecimal.class);
        
    return result;
  }

  public Object reverseMultiply(final byte lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiply(final char lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiply(final short lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiply(final int lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiply(final long lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiply(final float lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiply(final double lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiply(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiply(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   MetaClass method for operator *=
  //

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.lang.Object, java.lang.Object)
   */
  public Object multiplyEquals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "*=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator *=
  //
  
  public Object multiplyEquals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*=", byte.class);
      
    return result;
  }

  public Object multiplyEquals(final byte lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*=", char.class);
      
    return result;
  }

  public Object multiplyEquals(final byte lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*=", short.class);
      
    return result;
  }

  public Object multiplyEquals(final byte lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*=", int.class);
      
    return result;
  }

  public Object multiplyEquals(final byte lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*=", long.class);
      
    return result;
  }

  public Object multiplyEquals(final byte lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*=", float.class);
      
    return result;
  }

  public Object multiplyEquals(final byte lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*=", double.class);
      
    return result;
  }

  public Object multiplyEquals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*=", BigInteger.class);
      
    return result;
  }

  public Object multiplyEquals(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*=", BigDecimal.class);
      
    return result;
  }

  public Object multiplyEquals(final char lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*=", byte.class);
      
    return result;
  }

  public Object multiplyEquals(final char lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*=", char.class);
      
    return result;
  }

  public Object multiplyEquals(final char lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*=", short.class);
      
    return result;
  }

  public Object multiplyEquals(final char lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*=", int.class);
      
    return result;
  }

  public Object multiplyEquals(final char lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*=", long.class);
      
    return result;
  }

  public Object multiplyEquals(final char lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*=", float.class);
      
    return result;
  }

  public Object multiplyEquals(final char lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*=", double.class);
      
    return result;
  }

  public Object multiplyEquals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*=", BigInteger.class);
      
    return result;
  }

  public Object multiplyEquals(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*=", BigDecimal.class);
      
    return result;
  }

  public Object multiplyEquals(final short lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*=", byte.class);
      
    return result;
  }

  public Object multiplyEquals(final short lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*=", char.class);
      
    return result;
  }

  public Object multiplyEquals(final short lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*=", short.class);
      
    return result;
  }

  public Object multiplyEquals(final short lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*=", int.class);
      
    return result;
  }

  public Object multiplyEquals(final short lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*=", long.class);
      
    return result;
  }

  public Object multiplyEquals(final short lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*=", float.class);
      
    return result;
  }

  public Object multiplyEquals(final short lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*=", double.class);
      
    return result;
  }

  public Object multiplyEquals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*=", BigInteger.class);
      
    return result;
  }

  public Object multiplyEquals(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*=", BigDecimal.class);
      
    return result;
  }

  public Object multiplyEquals(final int lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*=", byte.class);
      
    return result;
  }

  public Object multiplyEquals(final int lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*=", char.class);
      
    return result;
  }

  public Object multiplyEquals(final int lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*=", short.class);
      
    return result;
  }

  public Object multiplyEquals(final int lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*=", int.class);
      
    return result;
  }

  public Object multiplyEquals(final int lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*=", long.class);
      
    return result;
  }

  public Object multiplyEquals(final int lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*=", float.class);
      
    return result;
  }

  public Object multiplyEquals(final int lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*=", double.class);
      
    return result;
  }

  public Object multiplyEquals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*=", BigInteger.class);
      
    return result;
  }

  public Object multiplyEquals(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*=", BigDecimal.class);
      
    return result;
  }

  public Object multiplyEquals(final long lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*=", byte.class);
      
    return result;
  }

  public Object multiplyEquals(final long lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*=", char.class);
      
    return result;
  }

  public Object multiplyEquals(final long lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*=", short.class);
      
    return result;
  }

  public Object multiplyEquals(final long lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*=", int.class);
      
    return result;
  }

  public Object multiplyEquals(final long lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*=", long.class);
      
    return result;
  }

  public Object multiplyEquals(final long lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*=", float.class);
      
    return result;
  }

  public Object multiplyEquals(final long lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*=", double.class);
      
    return result;
  }

  public Object multiplyEquals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*=", BigInteger.class);
      
    return result;
  }

  public Object multiplyEquals(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*=", BigDecimal.class);
      
    return result;
  }

  public Object multiplyEquals(final float lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*=", byte.class);
      
    return result;
  }

  public Object multiplyEquals(final float lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*=", char.class);
      
    return result;
  }

  public Object multiplyEquals(final float lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*=", short.class);
      
    return result;
  }

  public Object multiplyEquals(final float lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*=", int.class);
      
    return result;
  }

  public Object multiplyEquals(final float lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*=", long.class);
      
    return result;
  }

  public Object multiplyEquals(final float lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*=", float.class);
      
    return result;
  }

  public Object multiplyEquals(final float lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*=", double.class);
      
    return result;
  }

  public Object multiplyEquals(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*=", BigInteger.class);
      
    return result;
  }

  public Object multiplyEquals(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*=", BigDecimal.class);
      
    return result;
  }

  public Object multiplyEquals(final double lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*=", byte.class);
      
    return result;
  }

  public Object multiplyEquals(final double lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*=", char.class);
      
    return result;
  }

  public Object multiplyEquals(final double lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*=", short.class);
      
    return result;
  }

  public Object multiplyEquals(final double lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*=", int.class);
      
    return result;
  }

  public Object multiplyEquals(final double lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*=", long.class);
      
    return result;
  }

  public Object multiplyEquals(final double lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*=", float.class);
      
    return result;
  }

  public Object multiplyEquals(final double lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*=", double.class);
      
    return result;
  }

  public Object multiplyEquals(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*=", BigInteger.class);
      
    return result;
  }

  public Object multiplyEquals(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*=", BigDecimal.class);
      
    return result;
  }

  public Object multiplyEquals(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", byte.class);
      
    return result;
  }

  public Object multiplyEquals(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", char.class);
      
    return result;
  }

  public Object multiplyEquals(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", short.class);
      
    return result;
  }

  public Object multiplyEquals(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", int.class);
      
    return result;
  }

  public Object multiplyEquals(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", long.class);
      
    return result;
  }

  public Object multiplyEquals(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", float.class);
      
    return result;
  }

  public Object multiplyEquals(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", double.class);
      
    return result;
  }

  public Object multiplyEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", BigInteger.class);
      
    return result;
  }

  public Object multiplyEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", BigDecimal.class);
      
    return result;
  }

  public Object multiplyEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", byte.class);
      
    return result;
  }

  public Object multiplyEquals(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", char.class);
      
    return result;
  }

  public Object multiplyEquals(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", short.class);
      
    return result;
  }

  public Object multiplyEquals(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", int.class);
      
    return result;
  }

  public Object multiplyEquals(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", long.class);
      
    return result;
  }

  public Object multiplyEquals(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", float.class);
      
    return result;
  }

  public Object multiplyEquals(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", double.class);
      
    return result;
  }

  public Object multiplyEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", BigInteger.class);
      
    return result;
  }

  public Object multiplyEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", BigDecimal.class);
      
    return result;
  }

  public Object multiplyEquals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", byte.class);
        
    return result;
  }

  public Object multiplyEquals(final Object lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", char.class);
        
    return result;
  }

  public Object multiplyEquals(final Object lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", short.class);
        
    return result;
  }

  public Object multiplyEquals(final Object lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", int.class);
        
    return result;
  }

  public Object multiplyEquals(final Object lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", long.class);
        
    return result;
  }

  public Object multiplyEquals(final Object lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", float.class);
        
    return result;
  }

  public Object multiplyEquals(final Object lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", double.class);
        
    return result;
  }

  public Object multiplyEquals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", BigInteger.class);
        
    return result;
  }

  public Object multiplyEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", BigDecimal.class);
        
    return result;
  }

  public Object reverseMultiplyEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiplyEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiplyEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiplyEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiplyEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiplyEquals(final float lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiplyEquals(final double lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiplyEquals(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiplyEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   MetaClass method for operator /
  //

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#divide(java.lang.Object, java.lang.Object)
   */
  public Object divide(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "/", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator /
  //
  
  public Object divide(final byte lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/", byte.class);
      
    return result;
  }

  public Object divide(final byte lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/", char.class);
      
    return result;
  }

  public Object divide(final byte lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/", short.class);
      
    return result;
  }

  public Object divide(final byte lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/", int.class);
      
    return result;
  }

  public Object divide(final byte lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/", long.class);
      
    return result;
  }

  public Object divide(final byte lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/", float.class);
      
    return result;
  }

  public Object divide(final byte lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/", double.class);
      
    return result;
  }

  public Object divide(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/", BigInteger.class);
      
    return result;
  }

  public Object divide(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/", BigDecimal.class);
      
    return result;
  }

  public Object divide(final char lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/", byte.class);
      
    return result;
  }

  public Object divide(final char lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/", char.class);
      
    return result;
  }

  public Object divide(final char lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/", short.class);
      
    return result;
  }

  public Object divide(final char lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/", int.class);
      
    return result;
  }

  public Object divide(final char lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/", long.class);
      
    return result;
  }

  public Object divide(final char lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/", float.class);
      
    return result;
  }

  public Object divide(final char lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/", double.class);
      
    return result;
  }

  public Object divide(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/", BigInteger.class);
      
    return result;
  }

  public Object divide(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/", BigDecimal.class);
      
    return result;
  }

  public Object divide(final short lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/", byte.class);
      
    return result;
  }

  public Object divide(final short lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/", char.class);
      
    return result;
  }

  public Object divide(final short lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/", short.class);
      
    return result;
  }

  public Object divide(final short lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/", int.class);
      
    return result;
  }

  public Object divide(final short lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/", long.class);
      
    return result;
  }

  public Object divide(final short lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/", float.class);
      
    return result;
  }

  public Object divide(final short lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/", double.class);
      
    return result;
  }

  public Object divide(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/", BigInteger.class);
      
    return result;
  }

  public Object divide(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/", BigDecimal.class);
      
    return result;
  }

  public Object divide(final int lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/", byte.class);
      
    return result;
  }

  public Object divide(final int lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/", char.class);
      
    return result;
  }

  public Object divide(final int lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/", short.class);
      
    return result;
  }

  public Object divide(final int lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/", int.class);
      
    return result;
  }

  public Object divide(final int lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/", long.class);
      
    return result;
  }

  public Object divide(final int lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/", float.class);
      
    return result;
  }

  public Object divide(final int lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/", double.class);
      
    return result;
  }

  public Object divide(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/", BigInteger.class);
      
    return result;
  }

  public Object divide(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/", BigDecimal.class);
      
    return result;
  }

  public Object divide(final long lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/", byte.class);
      
    return result;
  }

  public Object divide(final long lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/", char.class);
      
    return result;
  }

  public Object divide(final long lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/", short.class);
      
    return result;
  }

  public Object divide(final long lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/", int.class);
      
    return result;
  }

  public Object divide(final long lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/", long.class);
      
    return result;
  }

  public Object divide(final long lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/", float.class);
      
    return result;
  }

  public Object divide(final long lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/", double.class);
      
    return result;
  }

  public Object divide(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/", BigInteger.class);
      
    return result;
  }

  public Object divide(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/", BigDecimal.class);
      
    return result;
  }

  public Object divide(final float lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/", byte.class);
      
    return result;
  }

  public Object divide(final float lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/", char.class);
      
    return result;
  }

  public Object divide(final float lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/", short.class);
      
    return result;
  }

  public Object divide(final float lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/", int.class);
      
    return result;
  }

  public Object divide(final float lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/", long.class);
      
    return result;
  }

  public Object divide(final float lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/", float.class);
      
    return result;
  }

  public Object divide(final float lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/", double.class);
      
    return result;
  }

  public Object divide(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/", BigInteger.class);
      
    return result;
  }

  public Object divide(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/", BigDecimal.class);
      
    return result;
  }

  public Object divide(final double lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/", byte.class);
      
    return result;
  }

  public Object divide(final double lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/", char.class);
      
    return result;
  }

  public Object divide(final double lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/", short.class);
      
    return result;
  }

  public Object divide(final double lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/", int.class);
      
    return result;
  }

  public Object divide(final double lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/", long.class);
      
    return result;
  }

  public Object divide(final double lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/", float.class);
      
    return result;
  }

  public Object divide(final double lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/", double.class);
      
    return result;
  }

  public Object divide(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/", BigInteger.class);
      
    return result;
  }

  public Object divide(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/", BigDecimal.class);
      
    return result;
  }

  public Object divide(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", byte.class);
      
    return result;
  }

  public Object divide(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", char.class);
      
    return result;
  }

  public Object divide(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", short.class);
      
    return result;
  }

  public Object divide(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", int.class);
      
    return result;
  }

  public Object divide(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", long.class);
      
    return result;
  }

  public Object divide(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", float.class);
      
    return result;
  }

  public Object divide(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", double.class);
      
    return result;
  }

  public Object divide(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", BigInteger.class);
      
    return result;
  }

  public Object divide(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", BigDecimal.class);
      
    return result;
  }

  public Object divide(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", byte.class);
      
    return result;
  }

  public Object divide(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", char.class);
      
    return result;
  }

  public Object divide(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", short.class);
      
    return result;
  }

  public Object divide(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", int.class);
      
    return result;
  }

  public Object divide(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", long.class);
      
    return result;
  }

  public Object divide(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", float.class);
      
    return result;
  }

  public Object divide(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", double.class);
      
    return result;
  }

  public Object divide(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", BigInteger.class);
      
    return result;
  }

  public Object divide(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", BigDecimal.class);
      
    return result;
  }

  public Object divide(final Object lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", byte.class);
        
    return result;
  }

  public Object divide(final Object lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", char.class);
        
    return result;
  }

  public Object divide(final Object lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", short.class);
        
    return result;
  }

  public Object divide(final Object lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", int.class);
        
    return result;
  }

  public Object divide(final Object lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", long.class);
        
    return result;
  }

  public Object divide(final Object lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", float.class);
        
    return result;
  }

  public Object divide(final Object lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", double.class);
        
    return result;
  }

  public Object divide(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", BigInteger.class);
        
    return result;
  }

  public Object divide(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", BigDecimal.class);
        
    return result;
  }

  public Object reverseDivide(final byte lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivide(final char lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivide(final short lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivide(final int lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivide(final long lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivide(final float lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivide(final double lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivide(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivide(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   MetaClass method for operator /=
  //

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.lang.Object, java.lang.Object)
   */
  public Object divideEquals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "/=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator /=
  //
  
  public Object divideEquals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/=", byte.class);
      
    return result;
  }

  public Object divideEquals(final byte lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/=", char.class);
      
    return result;
  }

  public Object divideEquals(final byte lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/=", short.class);
      
    return result;
  }

  public Object divideEquals(final byte lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/=", int.class);
      
    return result;
  }

  public Object divideEquals(final byte lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/=", long.class);
      
    return result;
  }

  public Object divideEquals(final byte lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/=", float.class);
      
    return result;
  }

  public Object divideEquals(final byte lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/=", double.class);
      
    return result;
  }

  public Object divideEquals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/=", BigInteger.class);
      
    return result;
  }

  public Object divideEquals(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/=", BigDecimal.class);
      
    return result;
  }

  public Object divideEquals(final char lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/=", byte.class);
      
    return result;
  }

  public Object divideEquals(final char lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/=", char.class);
      
    return result;
  }

  public Object divideEquals(final char lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/=", short.class);
      
    return result;
  }

  public Object divideEquals(final char lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/=", int.class);
      
    return result;
  }

  public Object divideEquals(final char lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/=", long.class);
      
    return result;
  }

  public Object divideEquals(final char lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/=", float.class);
      
    return result;
  }

  public Object divideEquals(final char lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/=", double.class);
      
    return result;
  }

  public Object divideEquals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/=", BigInteger.class);
      
    return result;
  }

  public Object divideEquals(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/=", BigDecimal.class);
      
    return result;
  }

  public Object divideEquals(final short lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/=", byte.class);
      
    return result;
  }

  public Object divideEquals(final short lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/=", char.class);
      
    return result;
  }

  public Object divideEquals(final short lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/=", short.class);
      
    return result;
  }

  public Object divideEquals(final short lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/=", int.class);
      
    return result;
  }

  public Object divideEquals(final short lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/=", long.class);
      
    return result;
  }

  public Object divideEquals(final short lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/=", float.class);
      
    return result;
  }

  public Object divideEquals(final short lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/=", double.class);
      
    return result;
  }

  public Object divideEquals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/=", BigInteger.class);
      
    return result;
  }

  public Object divideEquals(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/=", BigDecimal.class);
      
    return result;
  }

  public Object divideEquals(final int lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/=", byte.class);
      
    return result;
  }

  public Object divideEquals(final int lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/=", char.class);
      
    return result;
  }

  public Object divideEquals(final int lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/=", short.class);
      
    return result;
  }

  public Object divideEquals(final int lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/=", int.class);
      
    return result;
  }

  public Object divideEquals(final int lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/=", long.class);
      
    return result;
  }

  public Object divideEquals(final int lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/=", float.class);
      
    return result;
  }

  public Object divideEquals(final int lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/=", double.class);
      
    return result;
  }

  public Object divideEquals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/=", BigInteger.class);
      
    return result;
  }

  public Object divideEquals(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/=", BigDecimal.class);
      
    return result;
  }

  public Object divideEquals(final long lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/=", byte.class);
      
    return result;
  }

  public Object divideEquals(final long lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/=", char.class);
      
    return result;
  }

  public Object divideEquals(final long lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/=", short.class);
      
    return result;
  }

  public Object divideEquals(final long lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/=", int.class);
      
    return result;
  }

  public Object divideEquals(final long lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/=", long.class);
      
    return result;
  }

  public Object divideEquals(final long lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/=", float.class);
      
    return result;
  }

  public Object divideEquals(final long lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/=", double.class);
      
    return result;
  }

  public Object divideEquals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/=", BigInteger.class);
      
    return result;
  }

  public Object divideEquals(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/=", BigDecimal.class);
      
    return result;
  }

  public Object divideEquals(final float lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/=", byte.class);
      
    return result;
  }

  public Object divideEquals(final float lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/=", char.class);
      
    return result;
  }

  public Object divideEquals(final float lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/=", short.class);
      
    return result;
  }

  public Object divideEquals(final float lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/=", int.class);
      
    return result;
  }

  public Object divideEquals(final float lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/=", long.class);
      
    return result;
  }

  public Object divideEquals(final float lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/=", float.class);
      
    return result;
  }

  public Object divideEquals(final float lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/=", double.class);
      
    return result;
  }

  public Object divideEquals(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/=", BigInteger.class);
      
    return result;
  }

  public Object divideEquals(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/=", BigDecimal.class);
      
    return result;
  }

  public Object divideEquals(final double lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/=", byte.class);
      
    return result;
  }

  public Object divideEquals(final double lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/=", char.class);
      
    return result;
  }

  public Object divideEquals(final double lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/=", short.class);
      
    return result;
  }

  public Object divideEquals(final double lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/=", int.class);
      
    return result;
  }

  public Object divideEquals(final double lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/=", long.class);
      
    return result;
  }

  public Object divideEquals(final double lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/=", float.class);
      
    return result;
  }

  public Object divideEquals(final double lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/=", double.class);
      
    return result;
  }

  public Object divideEquals(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/=", BigInteger.class);
      
    return result;
  }

  public Object divideEquals(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/=", BigDecimal.class);
      
    return result;
  }

  public Object divideEquals(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", byte.class);
      
    return result;
  }

  public Object divideEquals(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", char.class);
      
    return result;
  }

  public Object divideEquals(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", short.class);
      
    return result;
  }

  public Object divideEquals(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", int.class);
      
    return result;
  }

  public Object divideEquals(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", long.class);
      
    return result;
  }

  public Object divideEquals(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", float.class);
      
    return result;
  }

  public Object divideEquals(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", double.class);
      
    return result;
  }

  public Object divideEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", BigInteger.class);
      
    return result;
  }

  public Object divideEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", BigDecimal.class);
      
    return result;
  }

  public Object divideEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", byte.class);
      
    return result;
  }

  public Object divideEquals(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", char.class);
      
    return result;
  }

  public Object divideEquals(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", short.class);
      
    return result;
  }

  public Object divideEquals(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", int.class);
      
    return result;
  }

  public Object divideEquals(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", long.class);
      
    return result;
  }

  public Object divideEquals(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", float.class);
      
    return result;
  }

  public Object divideEquals(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", double.class);
      
    return result;
  }

  public Object divideEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", BigInteger.class);
      
    return result;
  }

  public Object divideEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", BigDecimal.class);
      
    return result;
  }

  public Object divideEquals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", byte.class);
        
    return result;
  }

  public Object divideEquals(final Object lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", char.class);
        
    return result;
  }

  public Object divideEquals(final Object lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", short.class);
        
    return result;
  }

  public Object divideEquals(final Object lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", int.class);
        
    return result;
  }

  public Object divideEquals(final Object lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", long.class);
        
    return result;
  }

  public Object divideEquals(final Object lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", float.class);
        
    return result;
  }

  public Object divideEquals(final Object lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", double.class);
        
    return result;
  }

  public Object divideEquals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", BigInteger.class);
        
    return result;
  }

  public Object divideEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", BigDecimal.class);
        
    return result;
  }

  public Object reverseDivideEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivideEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivideEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivideEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivideEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivideEquals(final float lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivideEquals(final double lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivideEquals(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivideEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   MetaClass method for operator %
  //

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#remainder(java.lang.Object, java.lang.Object)
   */
  public Object remainder(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "%", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator %
  //
  
  public Object remainder(final byte lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "%", byte.class);
      
    return result;
  }

  public Object remainder(final byte lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "%", char.class);
      
    return result;
  }

  public Object remainder(final byte lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "%", short.class);
      
    return result;
  }

  public Object remainder(final byte lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "%", int.class);
      
    return result;
  }

  public Object remainder(final byte lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "%", long.class);
      
    return result;
  }

  public Object remainder(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "%", BigInteger.class);
      
    return result;
  }

  public Object remainder(final char lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "%", byte.class);
      
    return result;
  }

  public Object remainder(final char lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "%", char.class);
      
    return result;
  }

  public Object remainder(final char lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "%", short.class);
      
    return result;
  }

  public Object remainder(final char lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "%", int.class);
      
    return result;
  }

  public Object remainder(final char lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "%", long.class);
      
    return result;
  }

  public Object remainder(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "%", BigInteger.class);
      
    return result;
  }

  public Object remainder(final short lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "%", byte.class);
      
    return result;
  }

  public Object remainder(final short lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "%", char.class);
      
    return result;
  }

  public Object remainder(final short lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "%", short.class);
      
    return result;
  }

  public Object remainder(final short lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "%", int.class);
      
    return result;
  }

  public Object remainder(final short lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "%", long.class);
      
    return result;
  }

  public Object remainder(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "%", BigInteger.class);
      
    return result;
  }

  public Object remainder(final int lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "%", byte.class);
      
    return result;
  }

  public Object remainder(final int lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "%", char.class);
      
    return result;
  }

  public Object remainder(final int lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "%", short.class);
      
    return result;
  }

  public Object remainder(final int lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "%", int.class);
      
    return result;
  }

  public Object remainder(final int lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "%", long.class);
      
    return result;
  }

  public Object remainder(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "%", BigInteger.class);
      
    return result;
  }

  public Object remainder(final long lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "%", byte.class);
      
    return result;
  }

  public Object remainder(final long lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "%", char.class);
      
    return result;
  }

  public Object remainder(final long lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "%", short.class);
      
    return result;
  }

  public Object remainder(final long lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "%", int.class);
      
    return result;
  }

  public Object remainder(final long lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "%", long.class);
      
    return result;
  }

  public Object remainder(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "%", BigInteger.class);
      
    return result;
  }

  public Object remainder(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%", byte.class);
      
    return result;
  }

  public Object remainder(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%", char.class);
      
    return result;
  }

  public Object remainder(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%", short.class);
      
    return result;
  }

  public Object remainder(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%", int.class);
      
    return result;
  }

  public Object remainder(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%", long.class);
      
    return result;
  }

  public Object remainder(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%", BigInteger.class);
      
    return result;
  }

  public Object remainder(final Object lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%", byte.class);
        
    return result;
  }

  public Object remainder(final Object lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%", char.class);
        
    return result;
  }

  public Object remainder(final Object lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%", short.class);
        
    return result;
  }

  public Object remainder(final Object lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%", int.class);
        
    return result;
  }

  public Object remainder(final Object lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%", long.class);
        
    return result;
  }

  public Object remainder(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%", BigInteger.class);
        
    return result;
  }

  public Object reverseRemainder(final byte lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "%", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseRemainder(final char lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "%", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseRemainder(final short lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "%", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseRemainder(final int lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "%", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseRemainder(final long lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "%", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseRemainder(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   MetaClass method for operator %=
  //

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(java.lang.Object, java.lang.Object)
   */
  public Object remainderEquals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "%=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator %=
  //
  
  public Object remainderEquals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "%=", byte.class);
      
    return result;
  }

  public Object remainderEquals(final byte lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "%=", char.class);
      
    return result;
  }

  public Object remainderEquals(final byte lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "%=", short.class);
      
    return result;
  }

  public Object remainderEquals(final byte lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "%=", int.class);
      
    return result;
  }

  public Object remainderEquals(final byte lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "%=", long.class);
      
    return result;
  }

  public Object remainderEquals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "%=", BigInteger.class);
      
    return result;
  }

  public Object remainderEquals(final char lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "%=", byte.class);
      
    return result;
  }

  public Object remainderEquals(final char lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "%=", char.class);
      
    return result;
  }

  public Object remainderEquals(final char lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "%=", short.class);
      
    return result;
  }

  public Object remainderEquals(final char lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "%=", int.class);
      
    return result;
  }

  public Object remainderEquals(final char lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "%=", long.class);
      
    return result;
  }

  public Object remainderEquals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "%=", BigInteger.class);
      
    return result;
  }

  public Object remainderEquals(final short lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "%=", byte.class);
      
    return result;
  }

  public Object remainderEquals(final short lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "%=", char.class);
      
    return result;
  }

  public Object remainderEquals(final short lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "%=", short.class);
      
    return result;
  }

  public Object remainderEquals(final short lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "%=", int.class);
      
    return result;
  }

  public Object remainderEquals(final short lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "%=", long.class);
      
    return result;
  }

  public Object remainderEquals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "%=", BigInteger.class);
      
    return result;
  }

  public Object remainderEquals(final int lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "%=", byte.class);
      
    return result;
  }

  public Object remainderEquals(final int lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "%=", char.class);
      
    return result;
  }

  public Object remainderEquals(final int lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "%=", short.class);
      
    return result;
  }

  public Object remainderEquals(final int lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "%=", int.class);
      
    return result;
  }

  public Object remainderEquals(final int lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "%=", long.class);
      
    return result;
  }

  public Object remainderEquals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "%=", BigInteger.class);
      
    return result;
  }

  public Object remainderEquals(final long lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "%=", byte.class);
      
    return result;
  }

  public Object remainderEquals(final long lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "%=", char.class);
      
    return result;
  }

  public Object remainderEquals(final long lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "%=", short.class);
      
    return result;
  }

  public Object remainderEquals(final long lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "%=", int.class);
      
    return result;
  }

  public Object remainderEquals(final long lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "%=", long.class);
      
    return result;
  }

  public Object remainderEquals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "%=", BigInteger.class);
      
    return result;
  }

  public Object remainderEquals(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%=", byte.class);
      
    return result;
  }

  public Object remainderEquals(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%=", char.class);
      
    return result;
  }

  public Object remainderEquals(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%=", short.class);
      
    return result;
  }

  public Object remainderEquals(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%=", int.class);
      
    return result;
  }

  public Object remainderEquals(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%=", long.class);
      
    return result;
  }

  public Object remainderEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%=", BigInteger.class);
      
    return result;
  }

  public Object remainderEquals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%=", byte.class);
        
    return result;
  }

  public Object remainderEquals(final Object lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%=", char.class);
        
    return result;
  }

  public Object remainderEquals(final Object lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%=", short.class);
        
    return result;
  }

  public Object remainderEquals(final Object lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%=", int.class);
        
    return result;
  }

  public Object remainderEquals(final Object lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%=", long.class);
        
    return result;
  }

  public Object remainderEquals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%=", BigInteger.class);
        
    return result;
  }

  public Object reverseRemainderEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "%=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseRemainderEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "%=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseRemainderEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "%=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseRemainderEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "%=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseRemainderEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "%=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseRemainderEquals(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   MetaClass method for operator ÷
  //

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.lang.Object, java.lang.Object)
   */
  public Object integerDivide(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "÷", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator ÷
  //
  
  public Object integerDivide(final byte lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "÷", byte.class);
      
    return result;
  }

  public Object integerDivide(final byte lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "÷", char.class);
      
    return result;
  }

  public Object integerDivide(final byte lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "÷", short.class);
      
    return result;
  }

  public Object integerDivide(final byte lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "÷", int.class);
      
    return result;
  }

  public Object integerDivide(final byte lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "÷", long.class);
      
    return result;
  }

  public Object integerDivide(final byte lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "÷", float.class);
      
    return result;
  }

  public Object integerDivide(final byte lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "÷", double.class);
      
    return result;
  }

  public Object integerDivide(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "÷", BigInteger.class);
      
    return result;
  }

  public Object integerDivide(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "÷", BigDecimal.class);
      
    return result;
  }

  public Object integerDivide(final char lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "÷", byte.class);
      
    return result;
  }

  public Object integerDivide(final char lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "÷", char.class);
      
    return result;
  }

  public Object integerDivide(final char lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "÷", short.class);
      
    return result;
  }

  public Object integerDivide(final char lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "÷", int.class);
      
    return result;
  }

  public Object integerDivide(final char lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "÷", long.class);
      
    return result;
  }

  public Object integerDivide(final char lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "÷", float.class);
      
    return result;
  }

  public Object integerDivide(final char lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "÷", double.class);
      
    return result;
  }

  public Object integerDivide(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "÷", BigInteger.class);
      
    return result;
  }

  public Object integerDivide(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "÷", BigDecimal.class);
      
    return result;
  }

  public Object integerDivide(final short lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "÷", byte.class);
      
    return result;
  }

  public Object integerDivide(final short lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "÷", char.class);
      
    return result;
  }

  public Object integerDivide(final short lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "÷", short.class);
      
    return result;
  }

  public Object integerDivide(final short lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "÷", int.class);
      
    return result;
  }

  public Object integerDivide(final short lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "÷", long.class);
      
    return result;
  }

  public Object integerDivide(final short lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "÷", float.class);
      
    return result;
  }

  public Object integerDivide(final short lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "÷", double.class);
      
    return result;
  }

  public Object integerDivide(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "÷", BigInteger.class);
      
    return result;
  }

  public Object integerDivide(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "÷", BigDecimal.class);
      
    return result;
  }

  public Object integerDivide(final int lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "÷", byte.class);
      
    return result;
  }

  public Object integerDivide(final int lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "÷", char.class);
      
    return result;
  }

  public Object integerDivide(final int lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "÷", short.class);
      
    return result;
  }

  public Object integerDivide(final int lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "÷", int.class);
      
    return result;
  }

  public Object integerDivide(final int lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "÷", long.class);
      
    return result;
  }

  public Object integerDivide(final int lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "÷", float.class);
      
    return result;
  }

  public Object integerDivide(final int lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "÷", double.class);
      
    return result;
  }

  public Object integerDivide(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "÷", BigInteger.class);
      
    return result;
  }

  public Object integerDivide(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "÷", BigDecimal.class);
      
    return result;
  }

  public Object integerDivide(final long lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "÷", byte.class);
      
    return result;
  }

  public Object integerDivide(final long lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "÷", char.class);
      
    return result;
  }

  public Object integerDivide(final long lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "÷", short.class);
      
    return result;
  }

  public Object integerDivide(final long lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "÷", int.class);
      
    return result;
  }

  public Object integerDivide(final long lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "÷", long.class);
      
    return result;
  }

  public Object integerDivide(final long lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "÷", float.class);
      
    return result;
  }

  public Object integerDivide(final long lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "÷", double.class);
      
    return result;
  }

  public Object integerDivide(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "÷", BigInteger.class);
      
    return result;
  }

  public Object integerDivide(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "÷", BigDecimal.class);
      
    return result;
  }

  public Object integerDivide(final float lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "÷", byte.class);
      
    return result;
  }

  public Object integerDivide(final float lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "÷", char.class);
      
    return result;
  }

  public Object integerDivide(final float lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "÷", short.class);
      
    return result;
  }

  public Object integerDivide(final float lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "÷", int.class);
      
    return result;
  }

  public Object integerDivide(final float lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "÷", long.class);
      
    return result;
  }

  public Object integerDivide(final float lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "÷", float.class);
      
    return result;
  }

  public Object integerDivide(final float lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "÷", double.class);
      
    return result;
  }

  public Object integerDivide(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "÷", BigInteger.class);
      
    return result;
  }

  public Object integerDivide(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "÷", BigDecimal.class);
      
    return result;
  }

  public Object integerDivide(final double lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "÷", byte.class);
      
    return result;
  }

  public Object integerDivide(final double lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "÷", char.class);
      
    return result;
  }

  public Object integerDivide(final double lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "÷", short.class);
      
    return result;
  }

  public Object integerDivide(final double lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "÷", int.class);
      
    return result;
  }

  public Object integerDivide(final double lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "÷", long.class);
      
    return result;
  }

  public Object integerDivide(final double lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "÷", float.class);
      
    return result;
  }

  public Object integerDivide(final double lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "÷", double.class);
      
    return result;
  }

  public Object integerDivide(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "÷", BigInteger.class);
      
    return result;
  }

  public Object integerDivide(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "÷", BigDecimal.class);
      
    return result;
  }

  public Object integerDivide(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷", byte.class);
      
    return result;
  }

  public Object integerDivide(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷", char.class);
      
    return result;
  }

  public Object integerDivide(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷", short.class);
      
    return result;
  }

  public Object integerDivide(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷", int.class);
      
    return result;
  }

  public Object integerDivide(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷", long.class);
      
    return result;
  }

  public Object integerDivide(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷", float.class);
      
    return result;
  }

  public Object integerDivide(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷", double.class);
      
    return result;
  }

  public Object integerDivide(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷", BigInteger.class);
      
    return result;
  }

  public Object integerDivide(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷", BigDecimal.class);
      
    return result;
  }

  public Object integerDivide(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷", byte.class);
      
    return result;
  }

  public Object integerDivide(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷", char.class);
      
    return result;
  }

  public Object integerDivide(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷", short.class);
      
    return result;
  }

  public Object integerDivide(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷", int.class);
      
    return result;
  }

  public Object integerDivide(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷", long.class);
      
    return result;
  }

  public Object integerDivide(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷", float.class);
      
    return result;
  }

  public Object integerDivide(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷", double.class);
      
    return result;
  }

  public Object integerDivide(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷", BigInteger.class);
      
    return result;
  }

  public Object integerDivide(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷", BigDecimal.class);
      
    return result;
  }

  public Object integerDivide(final Object lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷", byte.class);
        
    return result;
  }

  public Object integerDivide(final Object lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷", char.class);
        
    return result;
  }

  public Object integerDivide(final Object lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷", short.class);
        
    return result;
  }

  public Object integerDivide(final Object lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷", int.class);
        
    return result;
  }

  public Object integerDivide(final Object lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷", long.class);
        
    return result;
  }

  public Object integerDivide(final Object lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷", float.class);
        
    return result;
  }

  public Object integerDivide(final Object lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷", double.class);
        
    return result;
  }

  public Object integerDivide(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷", BigInteger.class);
        
    return result;
  }

  public Object integerDivide(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷", BigDecimal.class);
        
    return result;
  }

  public Object reverseIntegerDivide(final byte lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "÷", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivide(final char lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "÷", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivide(final short lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "÷", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivide(final int lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "÷", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivide(final long lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "÷", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivide(final float lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "÷", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivide(final double lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "÷", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivide(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivide(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   MetaClass method for operator ÷=
  //

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.lang.Object, java.lang.Object)
   */
  public Object integerDivideEquals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "÷=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator ÷=
  //
  
  public Object integerDivideEquals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "÷=", byte.class);
      
    return result;
  }

  public Object integerDivideEquals(final byte lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "÷=", char.class);
      
    return result;
  }

  public Object integerDivideEquals(final byte lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "÷=", short.class);
      
    return result;
  }

  public Object integerDivideEquals(final byte lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "÷=", int.class);
      
    return result;
  }

  public Object integerDivideEquals(final byte lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "÷=", long.class);
      
    return result;
  }

  public Object integerDivideEquals(final byte lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "÷=", float.class);
      
    return result;
  }

  public Object integerDivideEquals(final byte lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "÷=", double.class);
      
    return result;
  }

  public Object integerDivideEquals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "÷=", BigInteger.class);
      
    return result;
  }

  public Object integerDivideEquals(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "÷=", BigDecimal.class);
      
    return result;
  }

  public Object integerDivideEquals(final char lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "÷=", byte.class);
      
    return result;
  }

  public Object integerDivideEquals(final char lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "÷=", char.class);
      
    return result;
  }

  public Object integerDivideEquals(final char lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "÷=", short.class);
      
    return result;
  }

  public Object integerDivideEquals(final char lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "÷=", int.class);
      
    return result;
  }

  public Object integerDivideEquals(final char lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "÷=", long.class);
      
    return result;
  }

  public Object integerDivideEquals(final char lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "÷=", float.class);
      
    return result;
  }

  public Object integerDivideEquals(final char lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "÷=", double.class);
      
    return result;
  }

  public Object integerDivideEquals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "÷=", BigInteger.class);
      
    return result;
  }

  public Object integerDivideEquals(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "÷=", BigDecimal.class);
      
    return result;
  }

  public Object integerDivideEquals(final short lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "÷=", byte.class);
      
    return result;
  }

  public Object integerDivideEquals(final short lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "÷=", char.class);
      
    return result;
  }

  public Object integerDivideEquals(final short lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "÷=", short.class);
      
    return result;
  }

  public Object integerDivideEquals(final short lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "÷=", int.class);
      
    return result;
  }

  public Object integerDivideEquals(final short lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "÷=", long.class);
      
    return result;
  }

  public Object integerDivideEquals(final short lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "÷=", float.class);
      
    return result;
  }

  public Object integerDivideEquals(final short lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "÷=", double.class);
      
    return result;
  }

  public Object integerDivideEquals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "÷=", BigInteger.class);
      
    return result;
  }

  public Object integerDivideEquals(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "÷=", BigDecimal.class);
      
    return result;
  }

  public Object integerDivideEquals(final int lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "÷=", byte.class);
      
    return result;
  }

  public Object integerDivideEquals(final int lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "÷=", char.class);
      
    return result;
  }

  public Object integerDivideEquals(final int lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "÷=", short.class);
      
    return result;
  }

  public Object integerDivideEquals(final int lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "÷=", int.class);
      
    return result;
  }

  public Object integerDivideEquals(final int lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "÷=", long.class);
      
    return result;
  }

  public Object integerDivideEquals(final int lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "÷=", float.class);
      
    return result;
  }

  public Object integerDivideEquals(final int lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "÷=", double.class);
      
    return result;
  }

  public Object integerDivideEquals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "÷=", BigInteger.class);
      
    return result;
  }

  public Object integerDivideEquals(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "÷=", BigDecimal.class);
      
    return result;
  }

  public Object integerDivideEquals(final long lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "÷=", byte.class);
      
    return result;
  }

  public Object integerDivideEquals(final long lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "÷=", char.class);
      
    return result;
  }

  public Object integerDivideEquals(final long lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "÷=", short.class);
      
    return result;
  }

  public Object integerDivideEquals(final long lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "÷=", int.class);
      
    return result;
  }

  public Object integerDivideEquals(final long lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "÷=", long.class);
      
    return result;
  }

  public Object integerDivideEquals(final long lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "÷=", float.class);
      
    return result;
  }

  public Object integerDivideEquals(final long lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "÷=", double.class);
      
    return result;
  }

  public Object integerDivideEquals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "÷=", BigInteger.class);
      
    return result;
  }

  public Object integerDivideEquals(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "÷=", BigDecimal.class);
      
    return result;
  }

  public Object integerDivideEquals(final float lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "÷=", byte.class);
      
    return result;
  }

  public Object integerDivideEquals(final float lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "÷=", char.class);
      
    return result;
  }

  public Object integerDivideEquals(final float lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "÷=", short.class);
      
    return result;
  }

  public Object integerDivideEquals(final float lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "÷=", int.class);
      
    return result;
  }

  public Object integerDivideEquals(final float lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "÷=", long.class);
      
    return result;
  }

  public Object integerDivideEquals(final float lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "÷=", float.class);
      
    return result;
  }

  public Object integerDivideEquals(final float lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "÷=", double.class);
      
    return result;
  }

  public Object integerDivideEquals(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "÷=", BigInteger.class);
      
    return result;
  }

  public Object integerDivideEquals(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "÷=", BigDecimal.class);
      
    return result;
  }

  public Object integerDivideEquals(final double lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "÷=", byte.class);
      
    return result;
  }

  public Object integerDivideEquals(final double lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "÷=", char.class);
      
    return result;
  }

  public Object integerDivideEquals(final double lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "÷=", short.class);
      
    return result;
  }

  public Object integerDivideEquals(final double lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "÷=", int.class);
      
    return result;
  }

  public Object integerDivideEquals(final double lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "÷=", long.class);
      
    return result;
  }

  public Object integerDivideEquals(final double lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "÷=", float.class);
      
    return result;
  }

  public Object integerDivideEquals(final double lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "÷=", double.class);
      
    return result;
  }

  public Object integerDivideEquals(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "÷=", BigInteger.class);
      
    return result;
  }

  public Object integerDivideEquals(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "÷=", BigDecimal.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷=", byte.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷=", char.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷=", short.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷=", int.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷=", long.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷=", float.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷=", double.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷=", BigInteger.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷=", BigDecimal.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷=", byte.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷=", char.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷=", short.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷=", int.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷=", long.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷=", float.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷=", double.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷=", BigInteger.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷=", BigDecimal.class);
      
    return result;
  }

  public Object integerDivideEquals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷=", byte.class);
        
    return result;
  }

  public Object integerDivideEquals(final Object lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷=", char.class);
        
    return result;
  }

  public Object integerDivideEquals(final Object lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷=", short.class);
        
    return result;
  }

  public Object integerDivideEquals(final Object lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷=", int.class);
        
    return result;
  }

  public Object integerDivideEquals(final Object lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷=", long.class);
        
    return result;
  }

  public Object integerDivideEquals(final Object lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷=", float.class);
        
    return result;
  }

  public Object integerDivideEquals(final Object lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷=", double.class);
        
    return result;
  }

  public Object integerDivideEquals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷=", BigInteger.class);
        
    return result;
  }

  public Object integerDivideEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷=", BigDecimal.class);
        
    return result;
  }

  public Object reverseIntegerDivideEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "÷=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivideEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "÷=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivideEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "÷=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivideEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "÷=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivideEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "÷=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivideEquals(final float lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "÷=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivideEquals(final double lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "÷=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivideEquals(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivideEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "÷=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   MetaClass method for operator <<
  //

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#leftShift(java.lang.Object, java.lang.Object)
   */
  public Object leftShift(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "<<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator <<
  //
  
  public Object leftShift(final byte lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<<", byte.class);
      
    return result;
  }

  public Object leftShift(final byte lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<<", char.class);
      
    return result;
  }

  public Object leftShift(final byte lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<<", short.class);
      
    return result;
  }

  public Object leftShift(final byte lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<<", int.class);
      
    return result;
  }

  public Object leftShift(final byte lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<<", long.class);
      
    return result;
  }

  public Object leftShift(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<<", BigInteger.class);
      
    return result;
  }

  public Object leftShift(final char lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<<", byte.class);
      
    return result;
  }

  public Object leftShift(final char lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<<", char.class);
      
    return result;
  }

  public Object leftShift(final char lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<<", short.class);
      
    return result;
  }

  public Object leftShift(final char lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<<", int.class);
      
    return result;
  }

  public Object leftShift(final char lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<<", long.class);
      
    return result;
  }

  public Object leftShift(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<<", BigInteger.class);
      
    return result;
  }

  public Object leftShift(final short lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<<", byte.class);
      
    return result;
  }

  public Object leftShift(final short lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<<", char.class);
      
    return result;
  }

  public Object leftShift(final short lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<<", short.class);
      
    return result;
  }

  public Object leftShift(final short lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<<", int.class);
      
    return result;
  }

  public Object leftShift(final short lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<<", long.class);
      
    return result;
  }

  public Object leftShift(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<<", BigInteger.class);
      
    return result;
  }

  public Object leftShift(final int lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<<", byte.class);
      
    return result;
  }

  public Object leftShift(final int lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<<", char.class);
      
    return result;
  }

  public Object leftShift(final int lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<<", short.class);
      
    return result;
  }

  public Object leftShift(final int lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<<", int.class);
      
    return result;
  }

  public Object leftShift(final int lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<<", long.class);
      
    return result;
  }

  public Object leftShift(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<<", BigInteger.class);
      
    return result;
  }

  public Object leftShift(final long lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<<", byte.class);
      
    return result;
  }

  public Object leftShift(final long lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<<", char.class);
      
    return result;
  }

  public Object leftShift(final long lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<<", short.class);
      
    return result;
  }

  public Object leftShift(final long lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<<", int.class);
      
    return result;
  }

  public Object leftShift(final long lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<<", long.class);
      
    return result;
  }

  public Object leftShift(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<<", BigInteger.class);
      
    return result;
  }

  public Object leftShift(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<", byte.class);
      
    return result;
  }

  public Object leftShift(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<", char.class);
      
    return result;
  }

  public Object leftShift(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<", short.class);
      
    return result;
  }

  public Object leftShift(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<", int.class);
      
    return result;
  }

  public Object leftShift(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<", long.class);
      
    return result;
  }

  public Object leftShift(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<", BigInteger.class);
      
    return result;
  }

  public Object leftShift(final Object lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<", byte.class);
        
    return result;
  }

  public Object leftShift(final Object lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<", char.class);
        
    return result;
  }

  public Object leftShift(final Object lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<", short.class);
        
    return result;
  }

  public Object leftShift(final Object lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<", int.class);
        
    return result;
  }

  public Object leftShift(final Object lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<", long.class);
        
    return result;
  }

  public Object leftShift(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<", BigInteger.class);
        
    return result;
  }

  public Object reverseLeftShift(final byte lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLeftShift(final char lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLeftShift(final short lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLeftShift(final int lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLeftShift(final long lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLeftShift(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   MetaClass method for operator <<=
  //

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(java.lang.Object, java.lang.Object)
   */
  public Object leftShiftEquals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "<<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator <<=
  //
  
  public Object leftShiftEquals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<<=", byte.class);
      
    return result;
  }

  public Object leftShiftEquals(final byte lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<<=", char.class);
      
    return result;
  }

  public Object leftShiftEquals(final byte lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<<=", short.class);
      
    return result;
  }

  public Object leftShiftEquals(final byte lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<<=", int.class);
      
    return result;
  }

  public Object leftShiftEquals(final byte lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<<=", long.class);
      
    return result;
  }

  public Object leftShiftEquals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<<=", BigInteger.class);
      
    return result;
  }

  public Object leftShiftEquals(final char lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<<=", byte.class);
      
    return result;
  }

  public Object leftShiftEquals(final char lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<<=", char.class);
      
    return result;
  }

  public Object leftShiftEquals(final char lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<<=", short.class);
      
    return result;
  }

  public Object leftShiftEquals(final char lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<<=", int.class);
      
    return result;
  }

  public Object leftShiftEquals(final char lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<<=", long.class);
      
    return result;
  }

  public Object leftShiftEquals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<<=", BigInteger.class);
      
    return result;
  }

  public Object leftShiftEquals(final short lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<<=", byte.class);
      
    return result;
  }

  public Object leftShiftEquals(final short lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<<=", char.class);
      
    return result;
  }

  public Object leftShiftEquals(final short lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<<=", short.class);
      
    return result;
  }

  public Object leftShiftEquals(final short lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<<=", int.class);
      
    return result;
  }

  public Object leftShiftEquals(final short lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<<=", long.class);
      
    return result;
  }

  public Object leftShiftEquals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<<=", BigInteger.class);
      
    return result;
  }


  public Object leftShiftEquals(final int lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<<=", byte.class);
      
    return result;
  }

  public Object leftShiftEquals(final int lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<<=", char.class);
      
    return result;
  }

  public Object leftShiftEquals(final int lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<<=", short.class);
      
    return result;
  }

  public Object leftShiftEquals(final int lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<<=", int.class);
      
    return result;
  }

  public Object leftShiftEquals(final int lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<<=", long.class);
      
    return result;
  }

  public Object leftShiftEquals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<<=", BigInteger.class);
      
    return result;
  }

  public Object leftShiftEquals(final long lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<<=", byte.class);
      
    return result;
  }

  public Object leftShiftEquals(final long lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<<=", char.class);
      
    return result;
  }

  public Object leftShiftEquals(final long lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<<=", short.class);
      
    return result;
  }

  public Object leftShiftEquals(final long lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<<=", int.class);
      
    return result;
  }

  public Object leftShiftEquals(final long lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<<=", long.class);
      
    return result;
  }

  public Object leftShiftEquals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<<=", BigInteger.class);
      
    return result;
  }

  public Object leftShiftEquals(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<=", byte.class);
      
    return result;
  }

  public Object leftShiftEquals(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<=", char.class);
      
    return result;
  }

  public Object leftShiftEquals(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<=", short.class);
      
    return result;
  }

  public Object leftShiftEquals(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<=", int.class);
      
    return result;
  }

  public Object leftShiftEquals(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<=", long.class);
      
    return result;
  }

  public Object leftShiftEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<=", BigInteger.class);
      
    return result;
  }

  public Object leftShiftEquals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<=", byte.class);
        
    return result;
  }

  public Object leftShiftEquals(final Object lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<=", char.class);
        
    return result;
  }

  public Object leftShiftEquals(final Object lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<=", short.class);
        
    return result;
  }

  public Object leftShiftEquals(final Object lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<=", int.class);
        
    return result;
  }

  public Object leftShiftEquals(final Object lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<=", long.class);
        
    return result;
  }

  public Object leftShiftEquals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<=", BigInteger.class);
        
    return result;
  }

  public Object reverseLeftShiftEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLeftShiftEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLeftShiftEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLeftShiftEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLeftShiftEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLeftShiftEquals(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   MetaClass method for operator >>>
  //

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(java.lang.Object, java.lang.Object)
   */
  public Object logicalRightShift(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), ">>>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator >>>
  //
  
  public Object logicalRightShift(final byte lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>>", byte.class);
      
    return result;
  }

  public Object logicalRightShift(final byte lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>>", char.class);
      
    return result;
  }

  public Object logicalRightShift(final byte lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>>", short.class);
      
    return result;
  }

  public Object logicalRightShift(final byte lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>>", int.class);
      
    return result;
  }

  public Object logicalRightShift(final byte lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>>", long.class);
      
    return result;
  }

  public Object logicalRightShift(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>>", BigInteger.class);
      
    return result;
  }

  public Object logicalRightShift(final char lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>>", byte.class);
      
    return result;
  }

  public Object logicalRightShift(final char lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>>", char.class);
      
    return result;
  }

  public Object logicalRightShift(final char lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>>", short.class);
      
    return result;
  }

  public Object logicalRightShift(final char lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>>", int.class);
      
    return result;
  }

  public Object logicalRightShift(final char lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>>", long.class);
      
    return result;
  }

  public Object logicalRightShift(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>>", BigInteger.class);
      
    return result;
  }

  public Object logicalRightShift(final short lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>>", byte.class);
      
    return result;
  }

  public Object logicalRightShift(final short lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>>", char.class);
      
    return result;
  }

  public Object logicalRightShift(final short lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>>", short.class);
      
    return result;
  }

  public Object logicalRightShift(final short lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>>", int.class);
      
    return result;
  }

  public Object logicalRightShift(final short lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>>", long.class);
      
    return result;
  }

  public Object logicalRightShift(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>>", BigInteger.class);
      
    return result;
  }

  public Object logicalRightShift(final int lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>>", byte.class);
      
    return result;
  }

  public Object logicalRightShift(final int lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>>", char.class);
      
    return result;
  }

  public Object logicalRightShift(final int lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>>", short.class);
      
    return result;
  }

  public Object logicalRightShift(final int lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>>", int.class);
      
    return result;
  }

  public Object logicalRightShift(final int lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>>", long.class);
      
    return result;
  }

  public Object logicalRightShift(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>>", BigInteger.class);
      
    return result;
  }

  public Object logicalRightShift(final long lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>>", byte.class);
      
    return result;
  }

  public Object logicalRightShift(final long lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>>", char.class);
      
    return result;
  }

  public Object logicalRightShift(final long lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>>", short.class);
      
    return result;
  }

  public Object logicalRightShift(final long lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>>", int.class);
      
    return result;
  }

  public Object logicalRightShift(final long lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>>", long.class);
      
    return result;
  }

  public Object logicalRightShift(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>>", BigInteger.class);
      
    return result;
  }

  public Object logicalRightShift(final Object lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>>", byte.class);
        
    return result;
  }

  public Object logicalRightShift(final Object lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>>", char.class);
        
    return result;
  }

  public Object logicalRightShift(final Object lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>>", short.class);
        
    return result;
  }

  public Object logicalRightShift(final Object lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>>", int.class);
        
    return result;
  }

  public Object logicalRightShift(final Object lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>>", long.class);
        
    return result;
  }

  public Object logicalRightShift(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>>", BigInteger.class);
        
    return result;
  }

  public Object reverseLogicalRightShift(final byte lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLogicalRightShift(final char lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLogicalRightShift(final short lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLogicalRightShift(final int lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLogicalRightShift(final long lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   MetaClass method for operator >>>=
  //

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(java.lang.Object, java.lang.Object)
   */
  public Object logicalRightShiftEquals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), ">>>=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator >>>=
  //
  
  public Object logicalRightShiftEquals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>>=", byte.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final byte lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>>=", char.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final byte lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>>=", short.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final byte lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>>=", int.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final byte lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>>=", long.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>>=", BigInteger.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final char lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>>=", byte.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final char lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>>=", char.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final char lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>>=", short.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final char lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>>=", int.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final char lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>>=", long.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>>=", BigInteger.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final short lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>>=", byte.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final short lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>>=", char.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final short lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>>=", short.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final short lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>>=", int.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final short lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>>=", long.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>>=", BigInteger.class);
      
    return result;
  }


  public Object logicalRightShiftEquals(final int lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>>=", byte.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final int lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>>=", char.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final int lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>>=", short.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final int lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>>=", int.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final int lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>>=", long.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>>=", BigInteger.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final long lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>>=", byte.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final long lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>>=", char.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final long lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>>=", short.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final long lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>>=", int.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final long lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>>=", long.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>>=", BigInteger.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>>=", byte.class);
        
    return result;
  }

  public Object logicalRightShiftEquals(final Object lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>>=", char.class);
        
    return result;
  }

  public Object logicalRightShiftEquals(final Object lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>>=", short.class);
        
    return result;
  }

  public Object logicalRightShiftEquals(final Object lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>>=", int.class);
        
    return result;
  }

  public Object logicalRightShiftEquals(final Object lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>>=", long.class);
        
    return result;
  }

  public Object logicalRightShiftEquals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>>=", BigInteger.class);
        
    return result;
  }

  public Object reverseLogicalRightShiftEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>>=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLogicalRightShiftEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>>=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLogicalRightShiftEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>>=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLogicalRightShiftEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>>=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLogicalRightShiftEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>>=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   MetaClass method for operator >>
  //

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(java.lang.Object, java.lang.Object)
   */
  public Object arithmeticRightShift(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), ">>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator >>
  //
  
  public Object arithmeticRightShift(final byte lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>", byte.class);
      
    return result;
  }

  public Object arithmeticRightShift(final byte lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>", char.class);
      
    return result;
  }

  public Object arithmeticRightShift(final byte lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>", short.class);
      
    return result;
  }

  public Object arithmeticRightShift(final byte lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>", int.class);
      
    return result;
  }

  public Object arithmeticRightShift(final byte lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>", long.class);
      
    return result;
  }

  public Object arithmeticRightShift(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>", BigInteger.class);
      
    return result;
  }

  public Object arithmeticRightShift(final char lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>", byte.class);
      
    return result;
  }

  public Object arithmeticRightShift(final char lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>", char.class);
      
    return result;
  }

  public Object arithmeticRightShift(final char lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>", short.class);
      
    return result;
  }

  public Object arithmeticRightShift(final char lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>", int.class);
      
    return result;
  }

  public Object arithmeticRightShift(final char lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>", long.class);
      
    return result;
  }

  public Object arithmeticRightShift(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>", BigInteger.class);
      
    return result;
  }

  public Object arithmeticRightShift(final short lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>", byte.class);
      
    return result;
  }

  public Object arithmeticRightShift(final short lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>", char.class);
      
    return result;
  }

  public Object arithmeticRightShift(final short lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>", short.class);
      
    return result;
  }

  public Object arithmeticRightShift(final short lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>", int.class);
      
    return result;
  }

  public Object arithmeticRightShift(final short lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>", long.class);
      
    return result;
  }

  public Object arithmeticRightShift(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>", BigInteger.class);
      
    return result;
  }

  public Object arithmeticRightShift(final int lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>", byte.class);
      
    return result;
  }

  public Object arithmeticRightShift(final int lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>", char.class);
      
    return result;
  }

  public Object arithmeticRightShift(final int lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>", short.class);
      
    return result;
  }

  public Object arithmeticRightShift(final int lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>", int.class);
      
    return result;
  }

  public Object arithmeticRightShift(final int lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>", long.class);
      
    return result;
  }

  public Object arithmeticRightShift(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>", BigInteger.class);
      
    return result;
  }

  public Object arithmeticRightShift(final long lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>", byte.class);
      
    return result;
  }

  public Object arithmeticRightShift(final long lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>", char.class);
      
    return result;
  }

  public Object arithmeticRightShift(final long lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>", short.class);
      
    return result;
  }

  public Object arithmeticRightShift(final long lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>", int.class);
      
    return result;
  }

  public Object arithmeticRightShift(final long lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>", long.class);
      
    return result;
  }

  public Object arithmeticRightShift(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>", BigInteger.class);
      
    return result;
  }

  public Object arithmeticRightShift(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>", byte.class);
      
    return result;
  }

  public Object arithmeticRightShift(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>", char.class);
      
    return result;
  }

  public Object arithmeticRightShift(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>", short.class);
      
    return result;
  }

  public Object arithmeticRightShift(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>", int.class);
      
    return result;
  }

  public Object arithmeticRightShift(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>", long.class);
      
    return result;
  }

  public Object arithmeticRightShift(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>", BigInteger.class);
      
    return result;
  }

  public Object arithmeticRightShift(final Object lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>", byte.class);
        
    return result;
  }

  public Object arithmeticRightShift(final Object lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>", char.class);
        
    return result;
  }

  public Object arithmeticRightShift(final Object lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>", short.class);
        
    return result;
  }

  public Object arithmeticRightShift(final Object lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>", int.class);
        
    return result;
  }

  public Object arithmeticRightShift(final Object lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>", long.class);
        
    return result;
  }

  public Object arithmeticRightShift(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>", BigInteger.class);
        
    return result;
  }

  public Object reverseArithmeticRightShift(final byte lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseArithmeticRightShift(final char lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseArithmeticRightShift(final short lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseArithmeticRightShift(final int lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseArithmeticRightShift(final long lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseArithmeticRightShift(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   MetaClass method for operator >>=
  //

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(java.lang.Object, java.lang.Object)
   */
  public Object arithmeticRightShiftEquals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), ">>=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator >>=
  //
  
  public Object arithmeticRightShiftEquals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>=", byte.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final byte lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>=", char.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final byte lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>=", short.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final byte lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>=", int.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final byte lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>=", long.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>=", BigInteger.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final char lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>=", byte.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final char lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>=", char.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final char lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>=", short.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final char lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>=", int.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final char lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>=", long.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>=", BigInteger.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final short lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>=", byte.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final short lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>=", char.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final short lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>=", short.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final short lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>=", int.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final short lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>=", long.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>=", BigInteger.class);
      
    return result;
  }


  public Object arithmeticRightShiftEquals(final int lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>=", byte.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final int lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>=", char.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final int lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>=", short.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final int lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>=", int.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final int lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>=", long.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>=", BigInteger.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final long lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>=", byte.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final long lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>=", char.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final long lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>=", short.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final long lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>=", int.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final long lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>=", long.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>=", BigInteger.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>=", byte.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>=", char.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>=", short.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>=", int.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>=", long.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>=", BigInteger.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>=", byte.class);
        
    return result;
  }

  public Object arithmeticRightShiftEquals(final Object lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>=", char.class);
        
    return result;
  }

  public Object arithmeticRightShiftEquals(final Object lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>=", short.class);
        
    return result;
  }

  public Object arithmeticRightShiftEquals(final Object lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>=", int.class);
        
    return result;
  }

  public Object arithmeticRightShiftEquals(final Object lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>=", long.class);
        
    return result;
  }

  public Object arithmeticRightShiftEquals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>=", BigInteger.class);
        
    return result;
  }

  public Object reverseArithmeticRightShiftEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseArithmeticRightShiftEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseArithmeticRightShiftEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseArithmeticRightShiftEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseArithmeticRightShiftEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseArithmeticRightShiftEquals(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   MetaClass method for operator |
  //

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#or(java.lang.Object, java.lang.Object)
   */
  public Object or(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "|", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator |
  //
  
  public Object or(final byte lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "|", byte.class);
      
    return result;
  }

  public Object or(final byte lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "|", char.class);
      
    return result;
  }

  public Object or(final byte lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "|", short.class);
      
    return result;
  }

  public Object or(final byte lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "|", int.class);
      
    return result;
  }

  public Object or(final byte lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "|", long.class);
      
    return result;
  }

  public Object or(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "|", BigInteger.class);
      
    return result;
  }

  public Object or(final char lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "|", byte.class);
      
    return result;
  }

  public Object or(final char lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "|", char.class);
      
    return result;
  }

  public Object or(final char lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "|", short.class);
      
    return result;
  }

  public Object or(final char lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "|", int.class);
      
    return result;
  }

  public Object or(final char lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "|", long.class);
      
    return result;
  }

  public Object or(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "|", BigInteger.class);
      
    return result;
  }

  public Object or(final short lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "|", byte.class);
      
    return result;
  }

  public Object or(final short lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "|", char.class);
      
    return result;
  }

  public Object or(final short lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "|", short.class);
      
    return result;
  }

  public Object or(final short lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "|", int.class);
      
    return result;
  }

  public Object or(final short lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "|", long.class);
      
    return result;
  }

  public Object or(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "|", BigInteger.class);
      
    return result;
  }

  public Object or(final int lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "|", byte.class);
      
    return result;
  }

  public Object or(final int lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "|", char.class);
      
    return result;
  }

  public Object or(final int lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "|", short.class);
      
    return result;
  }

  public Object or(final int lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "|", int.class);
      
    return result;
  }

  public Object or(final int lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "|", long.class);
      
    return result;
  }

  public Object or(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "|", BigInteger.class);
      
    return result;
  }

  public Object or(final long lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "|", byte.class);
      
    return result;
  }

  public Object or(final long lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "|", char.class);
      
    return result;
  }

  public Object or(final long lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "|", short.class);
      
    return result;
  }

  public Object or(final long lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "|", int.class);
      
    return result;
  }

  public Object or(final long lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "|", long.class);
      
    return result;
  }

  public Object or(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "|", BigInteger.class);
      
    return result;
  }

  public Object or(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|", byte.class);
      
    return result;
  }

  public Object or(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|", char.class);
      
    return result;
  }

  public Object or(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|", short.class);
      
    return result;
  }

  public Object or(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|", int.class);
      
    return result;
  }

  public Object or(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|", long.class);
      
    return result;
  }

  public Object or(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|", BigInteger.class);
      
    return result;
  }

  public Object or(final Object lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|", byte.class);
        
    return result;
  }

  public Object or(final Object lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|", char.class);
        
    return result;
  }

  public Object or(final Object lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|", short.class);
        
    return result;
  }

  public Object or(final Object lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|", int.class);
        
    return result;
  }

  public Object or(final Object lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|", long.class);
        
    return result;
  }

  public Object or(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|", BigInteger.class);
        
    return result;
  }

  public Object reverseOr(final byte lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "|", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseOr(final char lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "|", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseOr(final short lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "|", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseOr(final int lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "|", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseOr(final long lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "|", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseOr(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   MetaClass method for operator |=
  //

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#orEquals(java.lang.Object, java.lang.Object)
   */
  public Object orEquals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "|=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator |=
  //
  
  public Object orEquals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "|=", byte.class);
      
    return result;
  }

  public Object orEquals(final byte lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "|=", char.class);
      
    return result;
  }

  public Object orEquals(final byte lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "|=", short.class);
      
    return result;
  }

  public Object orEquals(final byte lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "|=", int.class);
      
    return result;
  }

  public Object orEquals(final byte lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "|=", long.class);
      
    return result;
  }

  public Object orEquals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "|=", BigInteger.class);
      
    return result;
  }

  public Object orEquals(final char lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "|=", byte.class);
      
    return result;
  }

  public Object orEquals(final char lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "|=", char.class);
      
    return result;
  }

  public Object orEquals(final char lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "|=", short.class);
      
    return result;
  }

  public Object orEquals(final char lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "|=", int.class);
      
    return result;
  }

  public Object orEquals(final char lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "|=", long.class);
      
    return result;
  }

  public Object orEquals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "|=", BigInteger.class);
      
    return result;
  }

  public Object orEquals(final short lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "|=", byte.class);
      
    return result;
  }

  public Object orEquals(final short lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "|=", char.class);
      
    return result;
  }

  public Object orEquals(final short lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "|=", short.class);
      
    return result;
  }

  public Object orEquals(final short lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "|=", int.class);
      
    return result;
  }

  public Object orEquals(final short lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "|=", long.class);
      
    return result;
  }

  public Object orEquals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "|=", BigInteger.class);
      
    return result;
  }

  public Object orEquals(final int lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "|=", byte.class);
      
    return result;
  }

  public Object orEquals(final int lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "|=", char.class);
      
    return result;
  }

  public Object orEquals(final int lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "|=", short.class);
      
    return result;
  }

  public Object orEquals(final int lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "|=", int.class);
      
    return result;
  }

  public Object orEquals(final int lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "|=", long.class);
      
    return result;
  }

  public Object orEquals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "|=", BigInteger.class);
      
    return result;
  }

  public Object orEquals(final long lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "|=", byte.class);
      
    return result;
  }

  public Object orEquals(final long lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "|=", char.class);
      
    return result;
  }

  public Object orEquals(final long lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "|=", short.class);
      
    return result;
  }

  public Object orEquals(final long lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "|=", int.class);
      
    return result;
  }

  public Object orEquals(final long lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "|=", long.class);
      
    return result;
  }

  public Object orEquals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "|=", BigInteger.class);
      
    return result;
  }

  public Object orEquals(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|=", byte.class);
      
    return result;
  }

  public Object orEquals(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|=", char.class);
      
    return result;
  }

  public Object orEquals(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|=", short.class);
      
    return result;
  }

  public Object orEquals(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|=", int.class);
      
    return result;
  }

  public Object orEquals(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|=", long.class);
      
    return result;
  }

  public Object orEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|=", BigInteger.class);
      
    return result;
  }

  public Object orEquals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|=", byte.class);
        
    return result;
  }

  public Object orEquals(final Object lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|=", char.class);
        
    return result;
  }

  public Object orEquals(final Object lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|=", short.class);
        
    return result;
  }

  public Object orEquals(final Object lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|=", int.class);
        
    return result;
  }

  public Object orEquals(final Object lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|=", long.class);
        
    return result;
  }

  public Object orEquals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|=", BigInteger.class);
        
    return result;
  }

  public Object reverseOrEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "|=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseOrEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "|=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseOrEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "|=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseOrEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "|=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseOrEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "|=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseOrEquals(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   MetaClass method for operator ^
  //

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#xor(java.lang.Object, java.lang.Object)
   */
  public Object xor(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "^", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator ^
  //
  
  public Object xor(final byte lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "^", byte.class);
      
    return result;
  }

  public Object xor(final byte lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "^", char.class);
      
    return result;
  }

  public Object xor(final byte lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "^", short.class);
      
    return result;
  }

  public Object xor(final byte lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "^", int.class);
      
    return result;
  }

  public Object xor(final byte lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "^", long.class);
      
    return result;
  }

  public Object xor(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "^", BigInteger.class);
      
    return result;
  }

  public Object xor(final char lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "^", byte.class);
      
    return result;
  }

  public Object xor(final char lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "^", char.class);
      
    return result;
  }

  public Object xor(final char lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "^", short.class);
      
    return result;
  }

  public Object xor(final char lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "^", int.class);
      
    return result;
  }

  public Object xor(final char lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "^", long.class);
      
    return result;
  }

  public Object xor(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "^", BigInteger.class);
      
    return result;
  }

  public Object xor(final short lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "^", byte.class);
      
    return result;
  }

  public Object xor(final short lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "^", char.class);
      
    return result;
  }

  public Object xor(final short lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "^", short.class);
      
    return result;
  }

  public Object xor(final short lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "^", int.class);
      
    return result;
  }

  public Object xor(final short lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "^", long.class);
      
    return result;
  }

  public Object xor(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "^", BigInteger.class);
      
    return result;
  }

  public Object xor(final int lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "^", byte.class);
      
    return result;
  }

  public Object xor(final int lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "^", char.class);
      
    return result;
  }

  public Object xor(final int lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "^", short.class);
      
    return result;
  }

  public Object xor(final int lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "^", int.class);
      
    return result;
  }

  public Object xor(final int lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "^", long.class);
      
    return result;
  }

  public Object xor(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "^", BigInteger.class);
      
    return result;
  }

  public Object xor(final long lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "^", byte.class);
      
    return result;
  }

  public Object xor(final long lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "^", char.class);
      
    return result;
  }

  public Object xor(final long lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "^", short.class);
      
    return result;
  }

  public Object xor(final long lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "^", int.class);
      
    return result;
  }

  public Object xor(final long lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "^", long.class);
      
    return result;
  }
  
  public Object xor(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "^", BigInteger.class);
      
    return result;
  }

  public Object xor(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^", byte.class);
      
    return result;
  }

  public Object xor(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^", char.class);
      
    return result;
  }

  public Object xor(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^", short.class);
      
    return result;
  }

  public Object xor(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^", int.class);
      
    return result;
  }

  public Object xor(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^", long.class);
      
    return result;
  }

  public Object xor(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^", BigInteger.class);
      
    return result;
  }

  public Object xor(final Object lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^", byte.class);
        
    return result;
  }

  public Object xor(final Object lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^", char.class);
        
    return result;
  }

  public Object xor(final Object lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^", short.class);
        
    return result;
  }

  public Object xor(final Object lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^", int.class);
        
    return result;
  }

  public Object xor(final Object lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^", long.class);
        
    return result;
  }

  public Object xor(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^", BigInteger.class);
        
    return result;
  }

  public Object reverseXor(final byte lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "^", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseXor(final char lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "^", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseXor(final short lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "^", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseXor(final int lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "^", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseXor(final long lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "^", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseXor(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   MetaClass method for operator ^=
  //

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#xorEquals(java.lang.Object, java.lang.Object)
   */
  public Object xorEquals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "^=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator ^=
  //
  
  public Object xorEquals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "^=", byte.class);
      
    return result;
  }

  public Object xorEquals(final byte lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "^=", char.class);
      
    return result;
  }

  public Object xorEquals(final byte lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "^=", short.class);
      
    return result;
  }

  public Object xorEquals(final byte lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "^=", int.class);
      
    return result;
  }

  public Object xorEquals(final byte lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "^=", long.class);
      
    return result;
  }

  public Object xorEquals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "^=", BigInteger.class);
      
    return result;
  }

  public Object xorEquals(final char lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "^=", byte.class);
      
    return result;
  }

  public Object xorEquals(final char lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "^=", char.class);
      
    return result;
  }

  public Object xorEquals(final char lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "^=", short.class);
      
    return result;
  }

  public Object xorEquals(final char lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "^=", int.class);
      
    return result;
  }

  public Object xorEquals(final char lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "^=", long.class);
      
    return result;
  }

  public Object xorEquals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "^=", BigInteger.class);
      
    return result;
  }

  public Object xorEquals(final short lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "^=", byte.class);
      
    return result;
  }

  public Object xorEquals(final short lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "^=", char.class);
      
    return result;
  }

  public Object xorEquals(final short lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "^=", short.class);
      
    return result;
  }

  public Object xorEquals(final short lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "^=", int.class);
      
    return result;
  }

  public Object xorEquals(final short lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "^=", long.class);
      
    return result;
  }

  public Object xorEquals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "^=", BigInteger.class);
      
    return result;
  }

  public Object xorEquals(final int lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "^=", byte.class);
      
    return result;
  }

  public Object xorEquals(final int lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "^=", char.class);
      
    return result;
  }

  public Object xorEquals(final int lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "^=", short.class);
      
    return result;
  }

  public Object xorEquals(final int lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "^=", int.class);
      
    return result;
  }

  public Object xorEquals(final int lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "^=", long.class);
      
    return result;
  }

  public Object xorEquals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "^=", BigInteger.class);
      
    return result;
  }

  public Object xorEquals(final long lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "^=", byte.class);
      
    return result;
  }

  public Object xorEquals(final long lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "^=", char.class);
      
    return result;
  }

  public Object xorEquals(final long lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "^=", short.class);
      
    return result;
  }

  public Object xorEquals(final long lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "^=", int.class);
      
    return result;
  }

  public Object xorEquals(final long lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "^=", long.class);
      
    return result;
  }

  public Object xorEquals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "^=", BigInteger.class);
      
    return result;
  }

  public Object xorEquals(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^=", byte.class);
      
    return result;
  }

  public Object xorEquals(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^=", char.class);
      
    return result;
  }

  public Object xorEquals(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^=", short.class);
      
    return result;
  }

  public Object xorEquals(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^=", int.class);
      
    return result;
  }

  public Object xorEquals(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^=", long.class);
      
    return result;
  }

  public Object xorEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^=", BigInteger.class);
      
    return result;
  }

  public Object xorEquals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^=", byte.class);
        
    return result;
  }

  public Object xorEquals(final Object lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^=", char.class);
        
    return result;
  }

  public Object xorEquals(final Object lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^=", short.class);
        
    return result;
  }

  public Object xorEquals(final Object lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^=", int.class);
        
    return result;
  }

  public Object xorEquals(final Object lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^=", long.class);
        
    return result;
  }

  public Object xorEquals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^=", BigInteger.class);
        
    return result;
  }

  public Object reverseXorEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "^=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseXorEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "^=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseXorEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "^=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseXorEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "^=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseXorEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "^=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseXorEquals(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   MetaClass method for operator &
  //

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#and(java.lang.Object, java.lang.Object)
   */
  public Object and(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "&", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator &
  //
  
  public Object and(final byte lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "&", byte.class);
      
    return result;
  }

  public Object and(final byte lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "&", char.class);
      
    return result;
  }

  public Object and(final byte lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "&", short.class);
      
    return result;
  }

  public Object and(final byte lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "&", int.class);
      
    return result;
  }

  public Object and(final byte lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "&", long.class);
      
    return result;
  }

  public Object and(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "&", BigInteger.class);
      
    return result;
  }

  public Object and(final char lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "&", byte.class);
      
    return result;
  }

  public Object and(final char lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "&", char.class);
      
    return result;
  }

  public Object and(final char lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "&", short.class);
      
    return result;
  }

  public Object and(final char lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "&", int.class);
      
    return result;
  }

  public Object and(final char lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "&", long.class);
      
    return result;
  }

  public Object and(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "&", BigInteger.class);
      
    return result;
  }

  public Object and(final short lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "&", byte.class);
      
    return result;
  }

  public Object and(final short lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "&", char.class);
      
    return result;
  }

  public Object and(final short lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "&", short.class);
      
    return result;
  }

  public Object and(final short lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "&", int.class);
      
    return result;
  }

  public Object and(final short lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "&", long.class);
      
    return result;
  }

  public Object and(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "&", BigInteger.class);
      
    return result;
  }

  public Object and(final int lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "&", byte.class);
      
    return result;
  }

  public Object and(final int lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "&", char.class);
      
    return result;
  }

  public Object and(final int lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "&", short.class);
      
    return result;
  }

  public Object and(final int lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "&", int.class);
      
    return result;
  }

  public Object and(final int lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "&", long.class);
      
    return result;
  }

  public Object and(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "&", BigInteger.class);
      
    return result;
  }

  public Object and(final long lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "&", byte.class);
      
    return result;
  }

  public Object and(final long lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "&", char.class);
      
    return result;
  }

  public Object and(final long lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "&", short.class);
      
    return result;
  }

  public Object and(final long lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "&", int.class);
      
    return result;
  }

  public Object and(final long lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "&", long.class);
      
    return result;
  }

  public Object and(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "&", BigInteger.class);
      
    return result;
  }

  public Object and(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&", byte.class);
      
    return result;
  }

  public Object and(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&", char.class);
      
    return result;
  }

  public Object and(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&", short.class);
      
    return result;
  }

  public Object and(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&", int.class);
      
    return result;
  }

  public Object and(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&", long.class);
      
    return result;
  }

  public Object and(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&", BigInteger.class);
      
    return result;
  }

  public Object and(final Object lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&", byte.class);
        
    return result;
  }

  public Object and(final Object lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&", char.class);
        
    return result;
  }

  public Object and(final Object lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&", short.class);
        
    return result;
  }

  public Object and(final Object lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&", int.class);
        
    return result;
  }

  public Object and(final Object lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&", long.class);
        
    return result;
  }

  public Object and(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&", BigInteger.class);
        
    return result;
  }

  public Object reverseAnd(final byte lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "&", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAnd(final char lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "&", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAnd(final short lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "&", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAnd(final int lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "&", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAnd(final long lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "&", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAnd(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   MetaClass method for operator &=
  //

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#andEquals(java.lang.Object, java.lang.Object)
   */
  public Object andEquals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "&=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator &=
  //
  
  public Object andEquals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "&=", byte.class);
      
    return result;
  }

  public Object andEquals(final byte lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "&=", char.class);
      
    return result;
  }

  public Object andEquals(final byte lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "&=", short.class);
      
    return result;
  }

  public Object andEquals(final byte lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "&=", int.class);
      
    return result;
  }

  public Object andEquals(final byte lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "&=", long.class);
      
    return result;
  }

  public Object andEquals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "&=", BigInteger.class);
      
    return result;
  }

  public Object andEquals(final char lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "&=", byte.class);
      
    return result;
  }

  public Object andEquals(final char lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "&=", char.class);
      
    return result;
  }

  public Object andEquals(final char lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "&=", short.class);
      
    return result;
  }

  public Object andEquals(final char lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "&=", int.class);
      
    return result;
  }

  public Object andEquals(final char lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "&=", long.class);
      
    return result;
  }

  public Object andEquals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "&=", BigInteger.class);
      
    return result;
  }

  public Object andEquals(final short lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "&=", byte.class);
      
    return result;
  }

  public Object andEquals(final short lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "&=", char.class);
      
    return result;
  }

  public Object andEquals(final short lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "&=", short.class);
      
    return result;
  }

  public Object andEquals(final short lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "&=", int.class);
      
    return result;
  }

  public Object andEquals(final short lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "&=", long.class);
      
    return result;
  }

  public Object andEquals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "&=", BigInteger.class);
      
    return result;
  }


  public Object andEquals(final int lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "&=", byte.class);
      
    return result;
  }

  public Object andEquals(final int lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "&=", char.class);
      
    return result;
  }

  public Object andEquals(final int lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "&=", short.class);
      
    return result;
  }

  public Object andEquals(final int lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "&=", int.class);
      
    return result;
  }

  public Object andEquals(final int lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "&=", long.class);
      
    return result;
  }

  public Object andEquals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "&=", BigInteger.class);
      
    return result;
  }

  public Object andEquals(final long lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "&=", byte.class);
      
    return result;
  }

  public Object andEquals(final long lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "&=", char.class);
      
    return result;
  }

  public Object andEquals(final long lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "&=", short.class);
      
    return result;
  }

  public Object andEquals(final long lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "&=", int.class);
      
    return result;
  }

  public Object andEquals(final long lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "&=", long.class);
      
    return result;
  }

  public Object andEquals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "&=", BigInteger.class);
      
    return result;
  }

  public Object andEquals(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&=", byte.class);
      
    return result;
  }

  public Object andEquals(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&=", char.class);
      
    return result;
  }

  public Object andEquals(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&=", short.class);
      
    return result;
  }

  public Object andEquals(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&=", int.class);
      
    return result;
  }

  public Object andEquals(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&=", long.class);
      
    return result;
  }

  public Object andEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&=", BigInteger.class);
      
    return result;
  }

  public Object andEquals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&=", byte.class);
        
    return result;
  }

  public Object andEquals(final Object lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&=", char.class);
        
    return result;
  }

  public Object andEquals(final Object lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&=", short.class);
        
    return result;
  }

  public Object andEquals(final Object lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&=", int.class);
        
    return result;
  }

  public Object andEquals(final Object lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&=", long.class);
        
    return result;
  }

  public Object andEquals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&=", BigInteger.class);
        
    return result;
  }

  public Object reverseAndEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "&=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAndEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "&=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAndEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "&=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAndEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "&=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAndEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "&=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAndEquals(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   MetaClass method for operator <=>
  //

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#compare(java.lang.Object, java.lang.Object)
   */
  public Object compare(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "<=>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator <=>
  //
  
  public Object compare(final byte lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=>", byte.class);
      
    return result;
  }

  public Object compare(final byte lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=>", char.class);
      
    return result;
  }

  public Object compare(final byte lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=>", short.class);
      
    return result;
  }

  public Object compare(final byte lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=>", int.class);
      
    return result;
  }

  public Object compare(final byte lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=>", long.class);
      
    return result;
  }

  public Object compare(final byte lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=>", float.class);
      
    return result;
  }

  public Object compare(final byte lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=>", double.class);
      
    return result;
  }

  public Object compare(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=>", BigInteger.class);
      
    return result;
  }

  public Object compare(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=>", BigDecimal.class);
      
    return result;
  }

  public Object compare(final char lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=>", byte.class);
      
    return result;
  }

  public Object compare(final char lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=>", char.class);
      
    return result;
  }

  public Object compare(final char lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=>", short.class);
      
    return result;
  }

  public Object compare(final char lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=>", int.class);
      
    return result;
  }

  public Object compare(final char lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=>", long.class);
      
    return result;
  }

  public Object compare(final char lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=>", float.class);
      
    return result;
  }

  public Object compare(final char lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=>", double.class);
      
    return result;
  }

  public Object compare(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=>", BigInteger.class);
      
    return result;
  }

  public Object compare(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=>", BigDecimal.class);
      
    return result;
  }

  public Object compare(final short lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=>", byte.class);
      
    return result;
  }

  public Object compare(final short lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=>", char.class);
      
    return result;
  }

  public Object compare(final short lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=>", short.class);
      
    return result;
  }

  public Object compare(final short lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=>", int.class);
      
    return result;
  }

  public Object compare(final short lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=>", long.class);
      
    return result;
  }

  public Object compare(final short lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=>", float.class);
      
    return result;
  }

  public Object compare(final short lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=>", double.class);
      
    return result;
  }

  public Object compare(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=>", BigInteger.class);
      
    return result;
  }

  public Object compare(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=>", BigDecimal.class);
      
    return result;
  }

  public Object compare(final int lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=>", byte.class);
      
    return result;
  }

  public Object compare(final int lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=>", char.class);
      
    return result;
  }

  public Object compare(final int lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=>", short.class);
      
    return result;
  }

  public Object compare(final int lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=>", int.class);
      
    return result;
  }

  public Object compare(final int lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=>", long.class);
      
    return result;
  }

  public Object compare(final int lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=>", float.class);
      
    return result;
  }

  public Object compare(final int lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=>", double.class);
      
    return result;
  }

  public Object compare(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=>", BigInteger.class);
      
    return result;
  }

  public Object compare(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=>", BigDecimal.class);
      
    return result;
  }

  public Object compare(final long lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=>", byte.class);
      
    return result;
  }

  public Object compare(final long lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=>", char.class);
      
    return result;
  }

  public Object compare(final long lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=>", short.class);
      
    return result;
  }

  public Object compare(final long lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=>", int.class);
      
    return result;
  }

  public Object compare(final long lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=>", long.class);
      
    return result;
  }

  public Object compare(final long lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=>", float.class);
      
    return result;
  }

  public Object compare(final long lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=>", double.class);
      
    return result;
  }

  public Object compare(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=>", BigInteger.class);
      
    return result;
  }

  public Object compare(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=>", BigDecimal.class);
      
    return result;
  }

  public Object compare(final float lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=>", byte.class);
      
    return result;
  }

  public Object compare(final float lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=>", char.class);
      
    return result;
  }

  public Object compare(final float lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=>", short.class);
      
    return result;
  }

  public Object compare(final float lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=>", int.class);
      
    return result;
  }

  public Object compare(final float lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=>", long.class);
      
    return result;
  }

  public Object compare(final float lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=>", float.class);
      
    return result;
  }

  public Object compare(final float lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=>", double.class);
      
    return result;
  }

  public Object compare(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=>", BigInteger.class);
      
    return result;
  }

  public Object compare(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=>", BigDecimal.class);
      
    return result;
  }

  public Object compare(final double lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=>", byte.class);
      
    return result;
  }

  public Object compare(final double lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=>", char.class);
      
    return result;
  }

  public Object compare(final double lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=>", short.class);
      
    return result;
  }

  public Object compare(final double lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=>", int.class);
      
    return result;
  }

  public Object compare(final double lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=>", long.class);
      
    return result;
  }

  public Object compare(final double lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=>", float.class);
      
    return result;
  }

  public Object compare(final double lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=>", double.class);
      
    return result;
  }

  public Object compare(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=>", BigInteger.class);
      
    return result;
  }

  public Object compare(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=>", BigDecimal.class);
      
    return result;
  }

  public Object compare(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", byte.class);
      
    return result;
  }

  public Object compare(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", char.class);
      
    return result;
  }

  public Object compare(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", short.class);
      
    return result;
  }

  public Object compare(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", int.class);
      
    return result;
  }

  public Object compare(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", long.class);
      
    return result;
  }

  public Object compare(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", float.class);
      
    return result;
  }

  public Object compare(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", double.class);
      
    return result;
  }

  public Object compare(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", BigInteger.class);
      
    return result;
  }

  public Object compare(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", BigDecimal.class);
      
    return result;
  }

  public Object compare(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", byte.class);
      
    return result;
  }

  public Object compare(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", char.class);
      
    return result;
  }

  public Object compare(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", short.class);
      
    return result;
  }

  public Object compare(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", int.class);
      
    return result;
  }

  public Object compare(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", long.class);
      
    return result;
  }

  public Object compare(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", float.class);
      
    return result;
  }

  public Object compare(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", double.class);
      
    return result;
  }

  public Object compare(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", BigInteger.class);
      
    return result;
  }

  public Object compare(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", BigDecimal.class);
      
    return result;
  }

  public Object compare(final Object lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", byte.class);
        
    return result;
  }

  public Object compare(final Object lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", char.class);
        
    return result;
  }

  public Object compare(final Object lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", short.class);
        
    return result;
  }

  public Object compare(final Object lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", int.class);
        
    return result;
  }

  public Object compare(final Object lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", long.class);
        
    return result;
  }

  public Object compare(final Object lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", float.class);
        
    return result;
  }

  public Object compare(final Object lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", double.class);
        
    return result;
  }

  public Object compare(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", BigInteger.class);
        
    return result;
  }

  public Object compare(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", BigDecimal.class);
        
    return result;
  }

  public Object reverseCompare(final byte lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseCompare(final char lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseCompare(final short lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseCompare(final int lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseCompare(final long lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseCompare(final float lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseCompare(final double lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseCompare(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseCompare(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   MetaClass method for operator ==
  //

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equals(java.lang.Object, java.lang.Object)
   */
  public Object equals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "==", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator ==
  //
  
  public Object equals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "==", byte.class);
      
    return result;
  }

  public Object equals(final byte lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "==", char.class);
      
    return result;
  }

  public Object equals(final byte lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "==", short.class);
      
    return result;
  }

  public Object equals(final byte lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "==", int.class);
      
    return result;
  }

  public Object equals(final byte lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "==", long.class);
      
    return result;
  }

  public Object equals(final byte lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "==", float.class);
      
    return result;
  }

  public Object equals(final byte lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "==", double.class);
      
    return result;
  }

  public Object equals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "==", BigInteger.class);
      
    return result;
  }

  public Object equals(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "==", BigDecimal.class);
      
    return result;
  }

  public Object equals(final char lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "==", byte.class);
      
    return result;
  }

  public Object equals(final char lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "==", char.class);
      
    return result;
  }

  public Object equals(final char lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "==", short.class);
      
    return result;
  }

  public Object equals(final char lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "==", int.class);
      
    return result;
  }

  public Object equals(final char lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "==", long.class);
      
    return result;
  }

  public Object equals(final char lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "==", float.class);
      
    return result;
  }

  public Object equals(final char lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "==", double.class);
      
    return result;
  }

  public Object equals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "==", BigInteger.class);
      
    return result;
  }

  public Object equals(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "==", BigDecimal.class);
      
    return result;
  }

  public Object equals(final short lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "==", byte.class);
      
    return result;
  }

  public Object equals(final short lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "==", char.class);
      
    return result;
  }

  public Object equals(final short lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "==", short.class);
      
    return result;
  }

  public Object equals(final short lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "==", int.class);
      
    return result;
  }

  public Object equals(final short lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "==", long.class);
      
    return result;
  }

  public Object equals(final short lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "==", float.class);
      
    return result;
  }

  public Object equals(final short lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "==", double.class);
      
    return result;
  }

  public Object equals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "==", BigInteger.class);
      
    return result;
  }

  public Object equals(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "==", BigDecimal.class);
      
    return result;
  }

  public Object equals(final int lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "==", byte.class);
      
    return result;
  }

  public Object equals(final int lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "==", char.class);
      
    return result;
  }

  public Object equals(final int lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "==", short.class);
      
    return result;
  }

  public Object equals(final int lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "==", int.class);
      
    return result;
  }

  public Object equals(final int lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "==", long.class);
      
    return result;
  }

  public Object equals(final int lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "==", float.class);
      
    return result;
  }

  public Object equals(final int lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "==", double.class);
      
    return result;
  }

  public Object equals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "==", BigInteger.class);
      
    return result;
  }

  public Object equals(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "==", BigDecimal.class);
      
    return result;
  }

  public Object equals(final long lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "==", byte.class);
      
    return result;
  }

  public Object equals(final long lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "==", char.class);
      
    return result;
  }

  public Object equals(final long lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "==", short.class);
      
    return result;
  }

  public Object equals(final long lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "==", int.class);
      
    return result;
  }

  public Object equals(final long lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "==", long.class);
      
    return result;
  }

  public Object equals(final long lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "==", float.class);
      
    return result;
  }

  public Object equals(final long lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "==", double.class);
      
    return result;
  }

  public Object equals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "==", BigInteger.class);
      
    return result;
  }

  public Object equals(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "==", BigDecimal.class);
      
    return result;
  }

  public Object equals(final float lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "==", byte.class);
      
    return result;
  }

  public Object equals(final float lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "==", char.class);
      
    return result;
  }

  public Object equals(final float lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "==", short.class);
      
    return result;
  }

  public Object equals(final float lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "==", int.class);
      
    return result;
  }

  public Object equals(final float lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "==", long.class);
      
    return result;
  }

  public Object equals(final float lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "==", float.class);
      
    return result;
  }

  public Object equals(final float lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "==", double.class);
      
    return result;
  }

  public Object equals(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "==", BigInteger.class);
      
    return result;
  }

  public Object equals(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "==", BigDecimal.class);
      
    return result;
  }

  public Object equals(final double lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "==", byte.class);
      
    return result;
  }

  public Object equals(final double lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "==", char.class);
      
    return result;
  }

  public Object equals(final double lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "==", short.class);
      
    return result;
  }

  public Object equals(final double lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "==", int.class);
      
    return result;
  }

  public Object equals(final double lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "==", long.class);
      
    return result;
  }

  public Object equals(final double lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "==", float.class);
      
    return result;
  }

  public Object equals(final double lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "==", double.class);
      
    return result;
  }

  public Object equals(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "==", BigInteger.class);
      
    return result;
  }

  public Object equals(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "==", BigDecimal.class);
      
    return result;
  }

  public Object equals(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", byte.class);
      
    return result;
  }

  public Object equals(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", char.class);
      
    return result;
  }

  public Object equals(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", short.class);
      
    return result;
  }

  public Object equals(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", int.class);
      
    return result;
  }

  public Object equals(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", long.class);
      
    return result;
  }

  public Object equals(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", float.class);
      
    return result;
  }

  public Object equals(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", double.class);
      
    return result;
  }

  public Object equals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", BigInteger.class);
      
    return result;
  }

  public Object equals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", BigDecimal.class);
      
    return result;
  }

  public Object equals(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", byte.class);
      
    return result;
  }

  public Object equals(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", char.class);
      
    return result;
  }

  public Object equals(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", short.class);
      
    return result;
  }

  public Object equals(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", int.class);
      
    return result;
  }

  public Object equals(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", long.class);
      
    return result;
  }

  public Object equals(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", float.class);
      
    return result;
  }

  public Object equals(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", double.class);
      
    return result;
  }

  public Object equals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", BigInteger.class);
      
    return result;
  }

  public Object equals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", BigDecimal.class);
      
    return result;
  }

  public Object equals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", byte.class);
        
    return result;
  }

  public Object equals(final Object lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", char.class);
        
    return result;
  }

  public Object equals(final Object lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", short.class);
        
    return result;
  }

  public Object equals(final Object lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", int.class);
        
    return result;
  }

  public Object equals(final Object lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", long.class);
        
    return result;
  }

  public Object equals(final Object lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", float.class);
        
    return result;
  }

  public Object equals(final Object lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", double.class);
        
    return result;
  }

  public Object equals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", BigInteger.class);
        
    return result;
  }

  public Object equals(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", BigDecimal.class);
        
    return result;
  }

  public Object reverseEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "==", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "==", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "==", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "==", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "==", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseEquals(final float lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "==", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseEquals(final double lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "==", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseEquals(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public boolean equalsBoolean(final Object lhs, final Object rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }
  
  public boolean equalsBoolean(final byte lhs, final byte rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final byte lhs, final char rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final byte lhs, final short rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final byte lhs, final int rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final byte lhs, final long rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final byte lhs, final float rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final byte lhs, final double rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final byte lhs, final BigInteger rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final byte lhs, final BigDecimal rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final char lhs, final byte rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final char lhs, final char rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final char lhs, final short rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final char lhs, final int rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final char lhs, final long rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final char lhs, final float rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final char lhs, final double rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final char lhs, final BigInteger rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final char lhs, final BigDecimal rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final short lhs, final byte rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final short lhs, final char rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final short lhs, final short rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final short lhs, final int rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final short lhs, final long rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final short lhs, final float rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final short lhs, final double rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final short lhs, final BigInteger rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final short lhs, final BigDecimal rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final int lhs, final byte rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final int lhs, final char rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final int lhs, final short rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final int lhs, final int rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final int lhs, final long rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final int lhs, final float rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final int lhs, final double rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final int lhs, final BigInteger rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final int lhs, final BigDecimal rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final long lhs, final byte rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final long lhs, final char rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final long lhs, final short rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final long lhs, final int rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final long lhs, final long rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final long lhs, final float rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final long lhs, final double rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final long lhs, final BigInteger rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final long lhs, final BigDecimal rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final float lhs, final byte rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final float lhs, final char rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final float lhs, final short rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final float lhs, final int rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final float lhs, final long rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final float lhs, final float rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final float lhs, final double rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final float lhs, final BigInteger rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final float lhs, final BigDecimal rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final double lhs, final byte rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final double lhs, final char rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final double lhs, final short rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final double lhs, final int rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final double lhs, final long rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final double lhs, final float rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final double lhs, final double rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final double lhs, final BigInteger rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final double lhs, final BigDecimal rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigInteger lhs, final byte rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigInteger lhs, final char rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigInteger lhs, final short rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigInteger lhs, final int rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigInteger lhs, final long rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigInteger lhs, final float rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigInteger lhs, final double rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigDecimal lhs, final byte rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigDecimal lhs, final char rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigDecimal lhs, final short rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigDecimal lhs, final int rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigDecimal lhs, final long rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigDecimal lhs, final float rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigDecimal lhs, final double rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final Object lhs, final byte rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final Object lhs, final char rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final Object lhs, final short rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final Object lhs, final int rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final Object lhs, final long rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final Object lhs, final float rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final Object lhs, final double rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final Object lhs, final BigDecimal rhs) throws Throwable {
    return this.internalMetaClass.doEqualsBoolean(lhs, rhs);
  }

  public boolean reverseEqualsBoolean(final byte lhs, final Object rhs) throws Throwable {
    return this.internalMetaClass.doReverseEqualsBoolean(lhs, rhs);
  }

  public boolean reverseEqualsBoolean(final char lhs, final Object rhs) throws Throwable {
    return this.internalMetaClass.doReverseEqualsBoolean(lhs, rhs);
  }

  public boolean reverseEqualsBoolean(final short lhs, final Object rhs) throws Throwable {
    return this.internalMetaClass.doReverseEqualsBoolean(lhs, rhs);
  }

  public boolean reverseEqualsBoolean(final int lhs, final Object rhs) throws Throwable {
    return this.internalMetaClass.doReverseEqualsBoolean(lhs, rhs);
  }

  public boolean reverseEqualsBoolean(final long lhs, final Object rhs) throws Throwable {
    return this.internalMetaClass.doReverseEqualsBoolean(lhs, rhs);
  }

  public boolean reverseEqualsBoolean(final float lhs, final Object rhs) throws Throwable {
    return this.internalMetaClass.doReverseEqualsBoolean(lhs, rhs);
  }

  public boolean reverseEqualsBoolean(final double lhs, final Object rhs) throws Throwable {
    return this.internalMetaClass.doReverseEqualsBoolean(lhs, rhs);
  }

  public boolean reverseEqualsBoolean(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.internalMetaClass.doReverseEqualsBoolean(lhs, rhs);
  }

  public boolean reverseEqualsBoolean(final BigDecimal lhs, final Object rhs) throws Throwable {
    return this.internalMetaClass.doReverseEqualsBoolean(lhs, rhs);
  }

  //
  //   MetaClass method for operator !=
  //

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.lang.Object, java.lang.Object)
   */
  public Object notEquals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "!=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator !=
  //
  
  public Object notEquals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "!=", byte.class);
      
    return result;
  }

  public Object notEquals(final byte lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "!=", char.class);
      
    return result;
  }

  public Object notEquals(final byte lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "!=", short.class);
      
    return result;
  }

  public Object notEquals(final byte lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "!=", int.class);
      
    return result;
  }

  public Object notEquals(final byte lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "!=", long.class);
      
    return result;
  }

  public Object notEquals(final byte lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "!=", float.class);
      
    return result;
  }

  public Object notEquals(final byte lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "!=", double.class);
      
    return result;
  }

  public Object notEquals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "!=", BigInteger.class);
      
    return result;
  }

  public Object notEquals(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "!=", BigDecimal.class);
      
    return result;
  }

  public Object notEquals(final char lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "!=", byte.class);
      
    return result;
  }

  public Object notEquals(final char lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "!=", char.class);
      
    return result;
  }

  public Object notEquals(final char lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "!=", short.class);
      
    return result;
  }

  public Object notEquals(final char lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "!=", int.class);
      
    return result;
  }

  public Object notEquals(final char lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "!=", long.class);
      
    return result;
  }

  public Object notEquals(final char lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "!=", float.class);
      
    return result;
  }

  public Object notEquals(final char lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "!=", double.class);
      
    return result;
  }

  public Object notEquals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "!=", BigInteger.class);
      
    return result;
  }

  public Object notEquals(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "!=", BigDecimal.class);
      
    return result;
  }

  public Object notEquals(final short lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "!=", byte.class);
      
    return result;
  }

  public Object notEquals(final short lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "!=", char.class);
      
    return result;
  }

  public Object notEquals(final short lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "!=", short.class);
      
    return result;
  }

  public Object notEquals(final short lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "!=", int.class);
      
    return result;
  }

  public Object notEquals(final short lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "!=", long.class);
      
    return result;
  }

  public Object notEquals(final short lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "!=", float.class);
      
    return result;
  }

  public Object notEquals(final short lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "!=", double.class);
      
    return result;
  }

  public Object notEquals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "!=", BigInteger.class);
      
    return result;
  }

  public Object notEquals(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "!=", BigDecimal.class);
      
    return result;
  }

  public Object notEquals(final int lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "!=", byte.class);
      
    return result;
  }

  public Object notEquals(final int lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "!=", char.class);
      
    return result;
  }

  public Object notEquals(final int lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "!=", short.class);
      
    return result;
  }

  public Object notEquals(final int lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "!=", int.class);
      
    return result;
  }

  public Object notEquals(final int lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "!=", long.class);
      
    return result;
  }

  public Object notEquals(final int lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "!=", float.class);
      
    return result;
  }

  public Object notEquals(final int lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "!=", double.class);
      
    return result;
  }

  public Object notEquals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "!=", BigInteger.class);
      
    return result;
  }

  public Object notEquals(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "!=", BigDecimal.class);
      
    return result;
  }

  public Object notEquals(final long lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "!=", byte.class);
      
    return result;
  }

  public Object notEquals(final long lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "!=", char.class);
      
    return result;
  }

  public Object notEquals(final long lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "!=", short.class);
      
    return result;
  }

  public Object notEquals(final long lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "!=", int.class);
      
    return result;
  }

  public Object notEquals(final long lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "!=", long.class);
      
    return result;
  }

  public Object notEquals(final long lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "!=", float.class);
      
    return result;
  }

  public Object notEquals(final long lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "!=", double.class);
      
    return result;
  }

  public Object notEquals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "!=", BigInteger.class);
      
    return result;
  }

  public Object notEquals(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "!=", BigDecimal.class);
      
    return result;
  }

  public Object notEquals(final float lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "!=", byte.class);
      
    return result;
  }

  public Object notEquals(final float lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "!=", char.class);
      
    return result;
  }

  public Object notEquals(final float lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "!=", short.class);
      
    return result;
  }

  public Object notEquals(final float lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "!=", int.class);
      
    return result;
  }

  public Object notEquals(final float lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "!=", long.class);
      
    return result;
  }

  public Object notEquals(final float lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "!=", float.class);
      
    return result;
  }

  public Object notEquals(final float lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "!=", double.class);
      
    return result;
  }

  public Object notEquals(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "!=", BigInteger.class);
      
    return result;
  }

  public Object notEquals(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "!=", BigDecimal.class);
      
    return result;
  }

  public Object notEquals(final double lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "!=", byte.class);
      
    return result;
  }

  public Object notEquals(final double lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "!=", char.class);
      
    return result;
  }

  public Object notEquals(final double lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "!=", short.class);
      
    return result;
  }

  public Object notEquals(final double lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "!=", int.class);
      
    return result;
  }

  public Object notEquals(final double lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "!=", long.class);
      
    return result;
  }

  public Object notEquals(final double lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "!=", float.class);
      
    return result;
  }

  public Object notEquals(final double lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "!=", double.class);
      
    return result;
  }

  public Object notEquals(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "!=", BigInteger.class);
      
    return result;
  }

  public Object notEquals(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "!=", BigDecimal.class);
      
    return result;
  }

  public Object notEquals(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", byte.class);
      
    return result;
  }

  public Object notEquals(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", char.class);
      
    return result;
  }

  public Object notEquals(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", short.class);
      
    return result;
  }

  public Object notEquals(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", int.class);
      
    return result;
  }

  public Object notEquals(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", long.class);
      
    return result;
  }

  public Object notEquals(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", float.class);
      
    return result;
  }

  public Object notEquals(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", double.class);
      
    return result;
  }

  public Object notEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", BigInteger.class);
      
    return result;
  }

  public Object notEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", BigDecimal.class);
      
    return result;
  }

  public Object notEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", byte.class);
      
    return result;
  }

  public Object notEquals(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", char.class);
      
    return result;
  }

  public Object notEquals(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", short.class);
      
    return result;
  }

  public Object notEquals(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", int.class);
      
    return result;
  }

  public Object notEquals(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", long.class);
      
    return result;
  }

  public Object notEquals(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", float.class);
      
    return result;
  }

  public Object notEquals(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", double.class);
      
    return result;
  }

  public Object notEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", BigInteger.class);
      
    return result;
  }

  public Object notEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", BigDecimal.class);
      
    return result;
  }

  public Object notEquals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", byte.class);
        
    return result;
  }

  public Object notEquals(final Object lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", char.class);
        
    return result;
  }

  public Object notEquals(final Object lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", short.class);
        
    return result;
  }

  public Object notEquals(final Object lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", int.class);
        
    return result;
  }

  public Object notEquals(final Object lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", long.class);
        
    return result;
  }

  public Object notEquals(final Object lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", float.class);
        
    return result;
  }

  public Object notEquals(final Object lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", double.class);
        
    return result;
  }

  public Object notEquals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", BigInteger.class);
        
    return result;
  }

  public Object notEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", BigDecimal.class);
        
    return result;
  }

  public Object reverseNotEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "!=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseNotEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "!=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseNotEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "!=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseNotEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "!=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseNotEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "!=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseNotEquals(final float lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "!=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseNotEquals(final double lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "!=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseNotEquals(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseNotEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   MetaClass method for operator <
  //

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.lang.Object, java.lang.Object)
   */
  public Object lessThan(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator <
  //
  
  public Object lessThan(final byte lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<", byte.class);
      
    return result;
  }

  public Object lessThan(final byte lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<", char.class);
      
    return result;
  }

  public Object lessThan(final byte lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<", short.class);
      
    return result;
  }

  public Object lessThan(final byte lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<", int.class);
      
    return result;
  }

  public Object lessThan(final byte lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<", long.class);
      
    return result;
  }

  public Object lessThan(final byte lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<", float.class);
      
    return result;
  }

  public Object lessThan(final byte lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<", double.class);
      
    return result;
  }

  public Object lessThan(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<", BigInteger.class);
      
    return result;
  }

  public Object lessThan(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<", BigDecimal.class);
      
    return result;
  }

  public Object lessThan(final char lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<", byte.class);
      
    return result;
  }

  public Object lessThan(final char lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<", char.class);
      
    return result;
  }

  public Object lessThan(final char lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<", short.class);
      
    return result;
  }

  public Object lessThan(final char lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<", int.class);
      
    return result;
  }

  public Object lessThan(final char lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<", long.class);
      
    return result;
  }

  public Object lessThan(final char lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<", float.class);
      
    return result;
  }

  public Object lessThan(final char lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<", double.class);
      
    return result;
  }

  public Object lessThan(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<", BigInteger.class);
      
    return result;
  }

  public Object lessThan(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<", BigDecimal.class);
      
    return result;
  }

  public Object lessThan(final short lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<", byte.class);
      
    return result;
  }

  public Object lessThan(final short lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<", char.class);
      
    return result;
  }

  public Object lessThan(final short lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<", short.class);
      
    return result;
  }

  public Object lessThan(final short lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<", int.class);
      
    return result;
  }

  public Object lessThan(final short lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<", long.class);
      
    return result;
  }

  public Object lessThan(final short lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<", float.class);
      
    return result;
  }

  public Object lessThan(final short lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<", double.class);
      
    return result;
  }

  public Object lessThan(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<", BigInteger.class);
      
    return result;
  }

  public Object lessThan(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<", BigDecimal.class);
      
    return result;
  }

  public Object lessThan(final int lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<", byte.class);
      
    return result;
  }

  public Object lessThan(final int lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<", char.class);
      
    return result;
  }

  public Object lessThan(final int lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<", short.class);
      
    return result;
  }

  public Object lessThan(final int lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<", int.class);
      
    return result;
  }

  public Object lessThan(final int lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<", long.class);
      
    return result;
  }

  public Object lessThan(final int lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<", float.class);
      
    return result;
  }

  public Object lessThan(final int lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<", double.class);
      
    return result;
  }

  public Object lessThan(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<", BigInteger.class);
      
    return result;
  }

  public Object lessThan(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<", BigDecimal.class);
      
    return result;
  }

  public Object lessThan(final long lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<", byte.class);
      
    return result;
  }

  public Object lessThan(final long lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<", char.class);
      
    return result;
  }

  public Object lessThan(final long lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<", short.class);
      
    return result;
  }

  public Object lessThan(final long lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<", int.class);
      
    return result;
  }

  public Object lessThan(final long lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<", long.class);
      
    return result;
  }

  public Object lessThan(final long lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<", float.class);
      
    return result;
  }

  public Object lessThan(final long lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<", double.class);
      
    return result;
  }

  public Object lessThan(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<", BigInteger.class);
      
    return result;
  }

  public Object lessThan(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<", BigDecimal.class);
      
    return result;
  }

  public Object lessThan(final float lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<", byte.class);
      
    return result;
  }

  public Object lessThan(final float lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<", char.class);
      
    return result;
  }

  public Object lessThan(final float lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<", short.class);
      
    return result;
  }

  public Object lessThan(final float lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<", int.class);
      
    return result;
  }

  public Object lessThan(final float lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<", long.class);
      
    return result;
  }

  public Object lessThan(final float lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<", float.class);
      
    return result;
  }

  public Object lessThan(final float lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<", double.class);
      
    return result;
  }

  public Object lessThan(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<", BigInteger.class);
      
    return result;
  }

  public Object lessThan(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<", BigDecimal.class);
      
    return result;
  }

  public Object lessThan(final double lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<", byte.class);
      
    return result;
  }

  public Object lessThan(final double lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<", char.class);
      
    return result;
  }

  public Object lessThan(final double lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<", short.class);
      
    return result;
  }

  public Object lessThan(final double lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<", int.class);
      
    return result;
  }

  public Object lessThan(final double lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<", long.class);
      
    return result;
  }

  public Object lessThan(final double lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<", float.class);
      
    return result;
  }

  public Object lessThan(final double lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<", double.class);
      
    return result;
  }

  public Object lessThan(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<", BigInteger.class);
      
    return result;
  }

  public Object lessThan(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<", BigDecimal.class);
      
    return result;
  }

  public Object lessThan(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", byte.class);
      
    return result;
  }

  public Object lessThan(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", char.class);
      
    return result;
  }

  public Object lessThan(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", short.class);
      
    return result;
  }

  public Object lessThan(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", int.class);
      
    return result;
  }

  public Object lessThan(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", long.class);
      
    return result;
  }

  public Object lessThan(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", float.class);
      
    return result;
  }

  public Object lessThan(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", double.class);
      
    return result;
  }

  public Object lessThan(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", BigInteger.class);
      
    return result;
  }

  public Object lessThan(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", BigDecimal.class);
      
    return result;
  }

  public Object lessThan(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", byte.class);
      
    return result;
  }

  public Object lessThan(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", char.class);
      
    return result;
  }

  public Object lessThan(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", short.class);
      
    return result;
  }

  public Object lessThan(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", int.class);
      
    return result;
  }

  public Object lessThan(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", long.class);
      
    return result;
  }

  public Object lessThan(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", float.class);
      
    return result;
  }

  public Object lessThan(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", double.class);
      
    return result;
  }

  public Object lessThan(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", BigInteger.class);
      
    return result;
  }

  public Object lessThan(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", BigDecimal.class);
      
    return result;
  }

  public Object lessThan(final Object lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", byte.class);
        
    return result;
  }

  public Object lessThan(final Object lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", char.class);
        
    return result;
  }

  public Object lessThan(final Object lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", short.class);
        
    return result;
  }

  public Object lessThan(final Object lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", int.class);
        
    return result;
  }

  public Object lessThan(final Object lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", long.class);
        
    return result;
  }

  public Object lessThan(final Object lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", float.class);
        
    return result;
  }

  public Object lessThan(final Object lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", double.class);
        
    return result;
  }

  public Object lessThan(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", BigInteger.class);
        
    return result;
  }

  public Object lessThan(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", BigDecimal.class);
        
    return result;
  }

  public Object reverseLessThan(final byte lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThan(final char lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThan(final short lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThan(final int lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThan(final long lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThan(final float lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThan(final double lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThan(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThan(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   MetaClass method for operator <=
  //

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.lang.Object, java.lang.Object)
   */
  public Object lessThanOrEquals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator <=
  //
  
  public Object lessThanOrEquals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=", byte.class);
      
    return result;
  }

  public Object lessThanOrEquals(final byte lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=", char.class);
      
    return result;
  }

  public Object lessThanOrEquals(final byte lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=", short.class);
      
    return result;
  }

  public Object lessThanOrEquals(final byte lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=", int.class);
      
    return result;
  }

  public Object lessThanOrEquals(final byte lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=", long.class);
      
    return result;
  }

  public Object lessThanOrEquals(final byte lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=", float.class);
      
    return result;
  }

  public Object lessThanOrEquals(final byte lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=", double.class);
      
    return result;
  }

  public Object lessThanOrEquals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=", BigInteger.class);
      
    return result;
  }

  public Object lessThanOrEquals(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=", BigDecimal.class);
      
    return result;
  }

  public Object lessThanOrEquals(final char lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=", byte.class);
      
    return result;
  }

  public Object lessThanOrEquals(final char lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=", char.class);
      
    return result;
  }

  public Object lessThanOrEquals(final char lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=", short.class);
      
    return result;
  }

  public Object lessThanOrEquals(final char lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=", int.class);
      
    return result;
  }

  public Object lessThanOrEquals(final char lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=", long.class);
      
    return result;
  }

  public Object lessThanOrEquals(final char lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=", float.class);
      
    return result;
  }

  public Object lessThanOrEquals(final char lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=", double.class);
      
    return result;
  }

  public Object lessThanOrEquals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=", BigInteger.class);
      
    return result;
  }

  public Object lessThanOrEquals(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=", BigDecimal.class);
      
    return result;
  }

  public Object lessThanOrEquals(final short lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=", byte.class);
      
    return result;
  }

  public Object lessThanOrEquals(final short lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=", char.class);
      
    return result;
  }

  public Object lessThanOrEquals(final short lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=", short.class);
      
    return result;
  }

  public Object lessThanOrEquals(final short lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=", int.class);
      
    return result;
  }

  public Object lessThanOrEquals(final short lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=", long.class);
      
    return result;
  }

  public Object lessThanOrEquals(final short lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=", float.class);
      
    return result;
  }

  public Object lessThanOrEquals(final short lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=", double.class);
      
    return result;
  }

  public Object lessThanOrEquals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=", BigInteger.class);
      
    return result;
  }

  public Object lessThanOrEquals(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=", BigDecimal.class);
      
    return result;
  }

  public Object lessThanOrEquals(final int lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=", byte.class);
      
    return result;
  }

  public Object lessThanOrEquals(final int lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=", char.class);
      
    return result;
  }

  public Object lessThanOrEquals(final int lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=", short.class);
      
    return result;
  }

  public Object lessThanOrEquals(final int lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=", int.class);
      
    return result;
  }

  public Object lessThanOrEquals(final int lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=", long.class);
      
    return result;
  }

  public Object lessThanOrEquals(final int lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=", float.class);
      
    return result;
  }

  public Object lessThanOrEquals(final int lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=", double.class);
      
    return result;
  }

  public Object lessThanOrEquals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=", BigInteger.class);
      
    return result;
  }

  public Object lessThanOrEquals(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=", BigDecimal.class);
      
    return result;
  }

  public Object lessThanOrEquals(final long lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=", byte.class);
      
    return result;
  }

  public Object lessThanOrEquals(final long lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=", char.class);
      
    return result;
  }

  public Object lessThanOrEquals(final long lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=", short.class);
      
    return result;
  }

  public Object lessThanOrEquals(final long lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=", int.class);
      
    return result;
  }

  public Object lessThanOrEquals(final long lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=", long.class);
      
    return result;
  }

  public Object lessThanOrEquals(final long lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=", float.class);
      
    return result;
  }

  public Object lessThanOrEquals(final long lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=", double.class);
      
    return result;
  }

  public Object lessThanOrEquals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=", BigInteger.class);
      
    return result;
  }

  public Object lessThanOrEquals(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=", BigDecimal.class);
      
    return result;
  }

  public Object lessThanOrEquals(final float lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=", byte.class);
      
    return result;
  }

  public Object lessThanOrEquals(final float lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=", char.class);
      
    return result;
  }

  public Object lessThanOrEquals(final float lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=", short.class);
      
    return result;
  }

  public Object lessThanOrEquals(final float lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=", int.class);
      
    return result;
  }

  public Object lessThanOrEquals(final float lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=", long.class);
      
    return result;
  }

  public Object lessThanOrEquals(final float lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=", float.class);
      
    return result;
  }

  public Object lessThanOrEquals(final float lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=", double.class);
      
    return result;
  }

  public Object lessThanOrEquals(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=", BigInteger.class);
      
    return result;
  }

  public Object lessThanOrEquals(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=", BigDecimal.class);
      
    return result;
  }

  public Object lessThanOrEquals(final double lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=", byte.class);
      
    return result;
  }

  public Object lessThanOrEquals(final double lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=", char.class);
      
    return result;
  }

  public Object lessThanOrEquals(final double lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=", short.class);
      
    return result;
  }

  public Object lessThanOrEquals(final double lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=", int.class);
      
    return result;
  }

  public Object lessThanOrEquals(final double lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=", long.class);
      
    return result;
  }

  public Object lessThanOrEquals(final double lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=", float.class);
      
    return result;
  }

  public Object lessThanOrEquals(final double lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=", double.class);
      
    return result;
  }

  public Object lessThanOrEquals(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=", BigInteger.class);
      
    return result;
  }

  public Object lessThanOrEquals(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=", BigDecimal.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=", byte.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", char.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", short.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", int.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", long.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", float.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", double.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", BigInteger.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", BigDecimal.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", byte.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", char.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", short.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", int.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", long.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", float.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", double.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", BigInteger.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", BigDecimal.class);
      
    return result;
  }

  public Object lessThanOrEquals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", byte.class);
        
    return result;
  }

  public Object lessThanOrEquals(final Object lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", char.class);
        
    return result;
  }

  public Object lessThanOrEquals(final Object lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", short.class);
        
    return result;
  }

  public Object lessThanOrEquals(final Object lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", int.class);
        
    return result;
  }

  public Object lessThanOrEquals(final Object lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", long.class);
        
    return result;
  }

  public Object lessThanOrEquals(final Object lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", float.class);
        
    return result;
  }

  public Object lessThanOrEquals(final Object lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", double.class);
        
    return result;
  }

  public Object lessThanOrEquals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", BigInteger.class);
        
    return result;
  }

  public Object lessThanOrEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", BigDecimal.class);
        
    return result;
  }

  public Object reverseLessThanOrEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThanOrEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThanOrEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThanOrEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThanOrEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThanOrEquals(final float lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThanOrEquals(final double lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThanOrEquals(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThanOrEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   MetaClass method for operator >
  //

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.lang.Object, java.lang.Object)
   */
  public Object greaterThan(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), ">", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator >
  //
  
  public Object greaterThan(final byte lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">", byte.class);
      
    return result;
  }

  public Object greaterThan(final byte lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">", char.class);
      
    return result;
  }

  public Object greaterThan(final byte lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">", short.class);
      
    return result;
  }

  public Object greaterThan(final byte lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">", int.class);
      
    return result;
  }

  public Object greaterThan(final byte lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">", long.class);
      
    return result;
  }

  public Object greaterThan(final byte lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">", float.class);
      
    return result;
  }

  public Object greaterThan(final byte lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">", double.class);
      
    return result;
  }

  public Object greaterThan(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">", BigInteger.class);
      
    return result;
  }

  public Object greaterThan(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">", BigDecimal.class);
      
    return result;
  }

  public Object greaterThan(final char lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">", byte.class);
      
    return result;
  }

  public Object greaterThan(final char lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">", char.class);
      
    return result;
  }

  public Object greaterThan(final char lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">", short.class);
      
    return result;
  }

  public Object greaterThan(final char lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">", int.class);
      
    return result;
  }

  public Object greaterThan(final char lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">", long.class);
      
    return result;
  }

  public Object greaterThan(final char lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">", float.class);
      
    return result;
  }

  public Object greaterThan(final char lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">", double.class);
      
    return result;
  }

  public Object greaterThan(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">", BigInteger.class);
      
    return result;
  }

  public Object greaterThan(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">", BigDecimal.class);
      
    return result;
  }

  public Object greaterThan(final short lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">", byte.class);
      
    return result;
  }

  public Object greaterThan(final short lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">", char.class);
      
    return result;
  }

  public Object greaterThan(final short lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">", short.class);
      
    return result;
  }

  public Object greaterThan(final short lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">", int.class);
      
    return result;
  }

  public Object greaterThan(final short lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">", long.class);
      
    return result;
  }

  public Object greaterThan(final short lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">", float.class);
      
    return result;
  }

  public Object greaterThan(final short lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">", double.class);
      
    return result;
  }

  public Object greaterThan(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">", BigInteger.class);
      
    return result;
  }

  public Object greaterThan(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">", BigDecimal.class);
      
    return result;
  }

  public Object greaterThan(final int lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">", byte.class);
      
    return result;
  }

  public Object greaterThan(final int lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">", char.class);
      
    return result;
  }

  public Object greaterThan(final int lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">", short.class);
      
    return result;
  }

  public Object greaterThan(final int lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">", int.class);
      
    return result;
  }

  public Object greaterThan(final int lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">", long.class);
      
    return result;
  }

  public Object greaterThan(final int lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">", float.class);
      
    return result;
  }

  public Object greaterThan(final int lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">", double.class);
      
    return result;
  }

  public Object greaterThan(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">", BigInteger.class);
      
    return result;
  }

  public Object greaterThan(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">", BigDecimal.class);
      
    return result;
  }

  public Object greaterThan(final long lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">", byte.class);
      
    return result;
  }

  public Object greaterThan(final long lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">", char.class);
      
    return result;
  }

  public Object greaterThan(final long lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">", short.class);
      
    return result;
  }

  public Object greaterThan(final long lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">", int.class);
      
    return result;
  }

  public Object greaterThan(final long lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">", long.class);
      
    return result;
  }

  public Object greaterThan(final long lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">", float.class);
      
    return result;
  }

  public Object greaterThan(final long lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">", double.class);
      
    return result;
  }

  public Object greaterThan(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">", BigInteger.class);
      
    return result;
  }

  public Object greaterThan(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">", BigDecimal.class);
      
    return result;
  }

  public Object greaterThan(final float lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">", byte.class);
      
    return result;
  }

  public Object greaterThan(final float lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">", char.class);
      
    return result;
  }

  public Object greaterThan(final float lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">", short.class);
      
    return result;
  }

  public Object greaterThan(final float lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">", int.class);
      
    return result;
  }

  public Object greaterThan(final float lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">", long.class);
      
    return result;
  }

  public Object greaterThan(final float lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">", float.class);
      
    return result;
  }

  public Object greaterThan(final float lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">", double.class);
      
    return result;
  }

  public Object greaterThan(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">", BigInteger.class);
      
    return result;
  }

  public Object greaterThan(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">", BigDecimal.class);
      
    return result;
  }

  public Object greaterThan(final double lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">", byte.class);
      
    return result;
  }

  public Object greaterThan(final double lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">", char.class);
      
    return result;
  }

  public Object greaterThan(final double lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">", short.class);
      
    return result;
  }

  public Object greaterThan(final double lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">", int.class);
      
    return result;
  }

  public Object greaterThan(final double lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">", long.class);
      
    return result;
  }

  public Object greaterThan(final double lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">", float.class);
      
    return result;
  }

  public Object greaterThan(final double lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">", double.class);
      
    return result;
  }

  public Object greaterThan(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">", BigInteger.class);
      
    return result;
  }

  public Object greaterThan(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">", BigDecimal.class);
      
    return result;
  }

  public Object greaterThan(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", byte.class);
      
    return result;
  }

  public Object greaterThan(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", char.class);
      
    return result;
  }

  public Object greaterThan(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", short.class);
      
    return result;
  }

  public Object greaterThan(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", int.class);
      
    return result;
  }

  public Object greaterThan(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", long.class);
      
    return result;
  }

  public Object greaterThan(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", float.class);
      
    return result;
  }

  public Object greaterThan(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", double.class);
      
    return result;
  }

  public Object greaterThan(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", BigInteger.class);
      
    return result;
  }

  public Object greaterThan(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", BigDecimal.class);
      
    return result;
  }

  public Object greaterThan(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", byte.class);
      
    return result;
  }

  public Object greaterThan(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", char.class);
      
    return result;
  }

  public Object greaterThan(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", short.class);
      
    return result;
  }

  public Object greaterThan(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", int.class);
      
    return result;
  }

  public Object greaterThan(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", long.class);
      
    return result;
  }

  public Object greaterThan(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", float.class);
      
    return result;
  }

  public Object greaterThan(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", double.class);
      
    return result;
  }

  public Object greaterThan(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", BigInteger.class);
      
    return result;
  }

  public Object greaterThan(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", BigDecimal.class);
      
    return result;
  }

  public Object greaterThan(final Object lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", byte.class);
        
    return result;
  }

  public Object greaterThan(final Object lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", char.class);
        
    return result;
  }

  public Object greaterThan(final Object lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", short.class);
        
    return result;
  }

  public Object greaterThan(final Object lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", int.class);
        
    return result;
  }

  public Object greaterThan(final Object lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", long.class);
        
    return result;
  }

  public Object greaterThan(final Object lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", float.class);
        
    return result;
  }

  public Object greaterThan(final Object lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", double.class);
        
    return result;
  }

  public Object greaterThan(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", BigInteger.class);
        
    return result;
  }

  public Object greaterThan(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", BigDecimal.class);
        
    return result;
  }

  public Object reverseGreaterThan(final byte lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThan(final char lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThan(final short lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThan(final int lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThan(final long lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThan(final float lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThan(final double lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThan(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThan(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   MetaClass method for operator >=
  //

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.lang.Object, java.lang.Object)
   */
  public Object greaterThanOrEquals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), ">=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator >=
  //
  
  public Object greaterThanOrEquals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">=", byte.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final byte lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">=", char.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final byte lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">=", short.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final byte lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">=", int.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final byte lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">=", long.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final byte lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">=", float.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final byte lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">=", double.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">=", BigInteger.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">=", BigDecimal.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final char lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">=", byte.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final char lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">=", char.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final char lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">=", short.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final char lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">=", int.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final char lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">=", long.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final char lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">=", float.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final char lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">=", double.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">=", BigInteger.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">=", BigDecimal.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final short lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">=", byte.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final short lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">=", char.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final short lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">=", short.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final short lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">=", int.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final short lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">=", long.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final short lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">=", float.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final short lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">=", double.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">=", BigInteger.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">=", BigDecimal.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final int lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">=", byte.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final int lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">=", char.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final int lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">=", short.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final int lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">=", int.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final int lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">=", long.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final int lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">=", float.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final int lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">=", double.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">=", BigInteger.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">=", BigDecimal.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final long lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">=", byte.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final long lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">=", char.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final long lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">=", short.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final long lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">=", int.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final long lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">=", long.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final long lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">=", float.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final long lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">=", double.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">=", BigInteger.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">=", BigDecimal.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final float lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">=", byte.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final float lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">=", char.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final float lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">=", short.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final float lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">=", int.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final float lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">=", long.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final float lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">=", float.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final float lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">=", double.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">=", BigInteger.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">=", BigDecimal.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final double lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">=", byte.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final double lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">=", char.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final double lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">=", short.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final double lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">=", int.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final double lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">=", long.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final double lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">=", float.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final double lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">=", double.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">=", BigInteger.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">=", BigDecimal.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", byte.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", char.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", short.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", int.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", long.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", float.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", double.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", BigInteger.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", BigDecimal.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", byte.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", char.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", short.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", int.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", long.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", float.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", double.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", BigInteger.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", BigDecimal.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", byte.class);
        
    return result;
  }

  public Object greaterThanOrEquals(final Object lhs, final char rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", char.class);
        
    return result;
  }

  public Object greaterThanOrEquals(final Object lhs, final short rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", short.class);
        
    return result;
  }

  public Object greaterThanOrEquals(final Object lhs, final int rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", int.class);
        
    return result;
  }

  public Object greaterThanOrEquals(final Object lhs, final long rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", long.class);
        
    return result;
  }

  public Object greaterThanOrEquals(final Object lhs, final float rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", float.class);
        
    return result;
  }

  public Object greaterThanOrEquals(final Object lhs, final double rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", double.class);
        
    return result;
  }

  public Object greaterThanOrEquals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", BigInteger.class);
        
    return result;
  }

  public Object greaterThanOrEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = this.internalMetaClass.doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", BigDecimal.class);
        
    return result;
  }

  public Object reverseGreaterThanOrEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThanOrEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThanOrEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThanOrEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThanOrEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThanOrEquals(final float lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThanOrEquals(final double lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThanOrEquals(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThanOrEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doReverseGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }
}
