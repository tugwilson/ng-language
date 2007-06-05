package uk.co.wilson.ng.runtime.metaclass;

/*
 * Created on Feb 28, 2007
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

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.lang.NgSystem;
import ng.runtime.*;
import uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection;
import uk.co.wilson.ng.runtime.metaclass.reflection.InstanceReflectionHandler;

public class InternalMetaClassImpl implements InternalMetaClass {
  final InstanceHandler instanceHandler;;
  
  public InternalMetaClassImpl(final Class theClass) {
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

  /**
   * @param methodName
   * @param arguments
   * @return
   */
  public MetaMethod doGetMetaMethodFor(final String methodName, final Object[] arguments) {
    return this.instanceHandler.getMetaMethodFor(methodName, arguments);
  }

  /**
   * @param methodName
   * @return the result of invoking the method on the instance with no
   *         parameters.
   * @return
   */
  public MetaMethod doGetMetaMethodQuick(final String methodName) {
    return this.instanceHandler.getMetaMethodQuick(methodName);
  }

  /**
   * @param methodName
   * @param p1
   * @return the result of invoking the method on the instance with the supplied
   *         parameters.
   */
  public MetaMethod doGetMetaMethodQuick(final String methodName, final Object p1) {
    return this.instanceHandler.getMetaMethodQuick(methodName, p1);
  }

  /**
   * @param methodName
   * @param p1
   * @param p2
   * @return the result of invoking the method on the instance with the supplied
   *         parameters.
   */
  public MetaMethod doGetMetaMethodQuick(final String methodName, final Object p1, final Object p2) {
    return this.instanceHandler.getMetaMethodQuick(methodName, p1, p2);
  }

  /**
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @return the result of invoking the method on the instance with the supplied
   *         parameters.
   */
  public MetaMethod doGetMetaMethodQuick(final String methodName, final Object p1, final Object p2, final Object p3) {
    return this.instanceHandler.getMetaMethodQuick(methodName, p1, p2, p3);
  }

  /**
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  public MetaMethod doGetMetaMethodQuick(final String methodName, final Object p1, final Object p2, final Object p3, final Object p4) {
    return this.instanceHandler.getMetaMethodQuick(methodName, p1, p2, p3, p4);
  }

  /**
   * @param instance
   * @param propertyName
   * @return
   */
  public MetaMethod doGetGetPropertyMetaMethod(final Object instance, final String propertyName) {
    return this.instanceHandler.getGetPropertyMetaMethod(instance, propertyName);
  }

  /**
   * @param instance
   * @param propertyName
   * @param newValue
   * @return
   */
  public MetaMethod doGetSetPropertyMetaMethod(final Object instance, final String propertyName, final Object newValue) {
    return this.instanceHandler.getSetPropertyMetaMethod(instance, propertyName, newValue);
  }

  /**
   * @param instance
   * @param fieldName
   * @return
   */
  public MetaMethod doGetGetFieldMetaMethod(final Object instance, final String fieldName) {
    return this.instanceHandler.getGetFieldMetaMethod(instance, fieldName);
  }

  /**
   * @param instance
   * @param fieldName
   * @param newValue
   * @return
   */
  public MetaMethod doGetSetFieldMetaMethod(final Object instance, final String fieldName, final Object newValue) {
    return this.instanceHandler.getSetFieldMetaMethod(instance, fieldName, newValue);
  }
  
  /**
   * @return
   */
  public MetaMethod doGetAnonMetaMethod() {
    return this.instanceHandler.getAnonMetaMethod();
  }

  public Object doComplement(final Object instance) {
  final Object result = this.instanceHandler.complement(instance);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return this.instanceHandler.getMetaMethodQuick("negate").call(instance);
    } else {
      return result;
    }
  }

  public Object doComplement(final int instance) {
    return doComplement(NgInt.valueOf(instance));
  }

  public Object doComplement(final long instance) {
    return doComplement(NgLong.valueOf(instance));
  }

  public Object doComplement(final BigInteger instance) {
    return doComplement((Object)instance);
  }

  public Object doNot(final Object instance) {
  final Object result = this.instanceHandler.not(instance);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return this.instanceHandler.getMetaMethodQuick("not").call(instance);
    } else {
      return result;
    }
  }

  public Object doNot(final boolean instance) {
    return doNot((instance) ? NgBoolean.TRUE : NgBoolean.FALSE);
  }

  public Object doUnaryPlus(final Object instance) {
  final Object result = this.instanceHandler.unaryPlus(instance);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return this.instanceHandler.getMetaMethodQuick("unaryPlus").call(instance);
    } else {
      return result;
    }
  }

  public Object doUnaryPlus(final int instance) {
    return doUnaryPlus(NgInt.valueOf(instance));
  }

  public Object doUnaryPlus(final long instance) {
    return doUnaryPlus(NgLong.valueOf(instance));
  }

  public Object doUnaryPlus(final float instance) {
    return doUnaryPlus(NgFloat.valueOf(instance));
  }

  public Object doUnaryPlus(final double instance) {
    return doUnaryPlus(NgDouble.valueOf(instance));
  }

  public Object doUnaryPlus(final BigInteger instance) {
    return doUnaryPlus((Object)instance);
  }

  public Object doUnaryPlus(final BigDecimal instance) {
    return doUnaryPlus((Object)instance);
  }

  public Object doUnaryMinus(final Object instance) {
  final Object result = this.instanceHandler.unaryMinus(instance);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return this.instanceHandler.getMetaMethodQuick("unaryMinus").call(instance);
    } else {
      return result;
    }
  }

  public Object doUnaryMinus(final int instance) {
    return doUnaryMinus(NgInt.valueOf(instance));
  }

  public Object doUnaryMinus(final long instance) {
    return doUnaryMinus(NgLong.valueOf(instance));
  }

  public Object doUnaryMinus(final float instance) {
    return doUnaryMinus(NgFloat.valueOf(instance));
  }

  public Object doUnaryMinus(final double instance) {
    return doUnaryMinus(NgDouble.valueOf(instance));
  }

  public Object doUnaryMinus(final BigInteger instance) {
    return doUnaryMinus((Object)instance);
  }

  public Object doUnaryMinus(final BigDecimal instance) {
    return doUnaryMinus((Object)instance);
  }

  public Object doIsCase(final Object instance, final Object rhs) {
  final Object result = this.instanceHandler.isCase(instance, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return this.instanceHandler.getMetaMethodQuick("isCase", rhs).call(instance, rhs);
    } else {
      return result;
    }
  }

  public Object doIsInstanceof(final Object instance, final Class type) {
  final Object result = this.instanceHandler.isInstanceof(instance, type);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return this.instanceHandler.getMetaMethodQuick("isInstanceof", type).call(instance, type);
    } else {
      return result;
    }
  }

  public Object doAsType(final Object instance, final Class type) {
  final Object result = this.instanceHandler.asType(instance, type);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return this.instanceHandler.getMetaMethodQuick("asType", type).call(instance, type);
    } else {
      return result;
    }
  }

  public Object doGetAt(final Object instance, final Object index) {
  final Object result = this.instanceHandler.getAt(instance, index);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return this.instanceHandler.getMetaMethodQuick("getAt", index).call(instance, index);
    } else {
      return result;
    }
  }

  public Object doGetAt(final Object instance, final int index) {
    return doGetAt(instance, NgInt.valueOf(index));
  }

  public Object doGetAt(final Object instance, final BigInteger index) {
   return doGetAt(instance, (Object)index);
  }

  public Object doPutAt(final Object instance, final Object index) {
  final Object result = this.instanceHandler.putAt(instance, index);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return this.instanceHandler.getMetaMethodQuick("putAt", index).call(instance, index);
    } else {
      return result;
    }
  }

  public Object doPutAt(final Object instance, final int index) {
    return doPutAt(instance, NgInt.valueOf(index));
  }

  public Object doPutAt(final Object instance, final BigInteger index) {
    return doPutAt(instance, (Object)index);
  }

  public Object doPrefixIncrement(final Object instance) {
  Object result = this.instanceHandler.prefixIncrement(instance);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = this.instanceHandler.getMetaMethodQuick("prefixIncrement").call(instance);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        return doAdd(instance, NgInt.ONE);
      }
    }

    return result;
  }

  public Object doPrefixIncrement(final int instance) {
    return doPrefixIncrement(NgInt.valueOf(instance));
  }

  public Object doPrefixIncrement(final long instance) {
    return doPrefixIncrement(NgLong.valueOf(instance));
  }

  public Object doPrefixIncrement(final float instance) {
    return doPrefixIncrement(NgFloat.valueOf(instance));
  }

  public Object doPrefixIncrement(final double instance) {
    return doPrefixIncrement(NgDouble.valueOf(instance));
  }

  public Object doPrefixIncrement(final BigInteger instance) {
    return doPrefixIncrement((Object)instance);
  }

  public Object doPrefixIncrement(final BigDecimal instance) {
    return doPrefixIncrement((Object)instance);
  }

  public Object doPrefixDecrement(final Object instance) {
  Object result = this.instanceHandler.prefixDecrement(instance);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = this.instanceHandler.getMetaMethodQuick("prefixDecrement").call(instance);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        return doSubtract(instance, NgInt.ONE);
      }
    }

    return result;
  }

  public Object doPrefixDecrement(final int instance) {
    return doPrefixDecrement(NgInt.valueOf(instance));
  }

  public Object doPrefixDecrement(final long instance) {
    return doPrefixDecrement(NgLong.valueOf(instance));
  }

  public Object doPrefixDecrement(final float instance) {
    return doPrefixDecrement(NgFloat.valueOf(instance));
  }

  public Object doPrefixDecrement(final double instance) {
    return doPrefixDecrement(NgDouble.valueOf(instance));
  }

  public Object doPrefixDecrement(final BigInteger instance) {
    return doPrefixDecrement((Object)instance);
  }

  public Object doPrefixDecrement(final BigDecimal instance) {
    return doPrefixDecrement((Object)instance);
  }

  public Object doPostfixIncrement(final Object instance) {
  Object result = this.instanceHandler.postfixIncrement(instance);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = this.instanceHandler.getMetaMethodQuick("postfixIncrement").call(instance);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        return doAdd(instance, NgInt.ONE);
      }
    }

    return result;
  }

  public Object doPostfixIncrement(final int instance) {
    return doPostfixIncrement(NgInt.valueOf(instance));
  }

  public Object doPostfixIncrement(final long instance) {
    return doPostfixIncrement(NgLong.valueOf(instance));
  }

  public Object doPostfixIncrement(final float instance) {
    return doPostfixIncrement(NgFloat.valueOf(instance));
  }

  public Object doPostfixIncrement(final double instance) {
    return doPostfixIncrement(NgDouble.valueOf(instance));
  }

  public Object doPostfixIncrement(final BigInteger instance) {
    return doPostfixIncrement((Object)instance);
  }

  public Object doPostfixIncrement(final BigDecimal instance) {
    return doPostfixIncrement((Object)instance);
  }

  public Object doPostfixDecrement(final Object instance) {
  Object result = this.instanceHandler.postfixDecrement(instance);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = this.instanceHandler.getMetaMethodQuick("postfixDecrement").call(instance);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        return doSubtract(instance, NgInt.ONE);
      }
    }

    return result;
  }

  public Object doPostfixDecrement(final int instance) {
    return doPostfixDecrement(NgInt.valueOf(instance));
  }

  public Object doPostfixDecrement(final long instance) {
    return doPostfixDecrement(NgLong.valueOf(instance));
  }

  public Object doPostfixDecrement(final float instance) {
    return doPostfixDecrement(NgFloat.valueOf(instance));
  }

  public Object doPostfixDecrement(final double instance) {
    return doPostfixDecrement(NgDouble.valueOf(instance));
  }

  public Object doPostfixDecrement(final BigInteger instance) {
    return doPostfixDecrement((Object)instance);
  }

  public Object doPostfixDecrement(final BigDecimal instance) {
    return doPostfixDecrement((Object)instance);
  }

  //
  //   Internal methods for operator +
  //
  //  These methods can be overidden to implement +
  //  If the underlying object does not have the appropriate method
  //
  public Object doAdd(final Object lhs, final Object rhs) {
  Object result = this.instanceHandler.add(lhs, rhs);
  
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = this.instanceHandler.getMetaMethodQuick("plus", rhs).call(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAdd(lhs, rhs);
      }
    }

    return result;
  }
  
  public Object doReverseAdd(final Object lhs, final Object rhs) {
  final Object result = this.instanceHandler.reverseAdd(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return this.instanceHandler.getMetaMethodQuick("reversePlus", lhs).call(rhs, lhs);
    }

    return result;
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doAdd(final byte lhs, final byte rhs) {
    return doAdd(NgByte.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doAdd(final byte lhs, final char rhs) {
    return doAdd(NgByte.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doAdd(final byte lhs, final short rhs) {
    return doAdd(NgByte.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doAdd(final byte lhs, final int rhs) {
    return doAdd(NgByte.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doAdd(final byte lhs, final long rhs) {
    return doAdd(NgByte.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doAdd(final byte lhs, final float rhs) {
    return doAdd(NgByte.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doAdd(final byte lhs, final double rhs) {
    return doAdd(NgByte.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doAdd(final byte lhs, final BigInteger rhs) {
    return doAdd(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doAdd(final byte lhs, final BigDecimal rhs) {
    return doAdd(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doAdd(final char lhs, final byte rhs) {
    return doAdd(NgChar.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doAdd(final char lhs, final char rhs) {
    return doAdd(NgChar.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doAdd(final char lhs, final short rhs) {
    return doAdd(NgChar.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doAdd(final char lhs, final int rhs) {
    return doAdd(NgChar.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doAdd(final char lhs, final long rhs) {
    return doAdd(NgChar.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doAdd(final char lhs, final float rhs) {
    return doAdd(NgChar.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doAdd(final char lhs, final double rhs) {
    return doAdd(NgChar.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doAdd(final char lhs, final BigInteger rhs) {
    return doAdd(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doAdd(final char lhs, final BigDecimal rhs) {
    return doAdd(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doAdd(final short lhs, final byte rhs) {
    return doAdd(NgShort.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doAdd(final short lhs, final char rhs) {
    return doAdd(NgShort.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doAdd(final short lhs, final short rhs) {
    return doAdd(NgShort.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doAdd(final short lhs, final int rhs) {
    return doAdd(NgShort.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doAdd(final short lhs, final long rhs) {
    return doAdd(NgShort.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doAdd(final short lhs, final float rhs) {
    return doAdd(NgShort.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doAdd(final short lhs, final double rhs) {
    return doAdd(NgShort.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doAdd(final short lhs, final BigInteger rhs) {
    return doAdd(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doAdd(final short lhs, final BigDecimal rhs) {
    return doAdd(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doAdd(final int lhs, final byte rhs) {
    return doAdd(NgInt.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doAdd(final int lhs, final char rhs) {
    return doAdd(NgInt.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doAdd(final int lhs, final short rhs) {
    return doAdd(NgInt.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doAdd(final int lhs, final int rhs) {
    return doAdd(NgInt.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doAdd(final int lhs, final long rhs) {
    return doAdd(NgInt.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doAdd(final int lhs, final float rhs) {
    return doAdd(NgInt.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doAdd(final int lhs, final double rhs) {
    return doAdd(NgInt.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doAdd(final int lhs, final BigInteger rhs) {
    return doAdd(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doAdd(final int lhs, final BigDecimal rhs) {
    return doAdd(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doAdd(final long lhs, final byte rhs) {
    return doAdd(NgLong.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doAdd(final long lhs, final char rhs) {
    return doAdd(NgLong.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doAdd(final long lhs, final short rhs) {
    return doAdd(NgLong.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doAdd(final long lhs, final int rhs) {
    return doAdd(NgLong.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doAdd(final long lhs, final long rhs) {
    return doAdd(NgLong.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doAdd(final long lhs, final float rhs) {
    return doAdd(NgLong.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doAdd(final long lhs, final double rhs) {
    return doAdd(NgLong.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doAdd(final long lhs, final BigInteger rhs) {
    return doAdd(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doAdd(final long lhs, final BigDecimal rhs) {
    return doAdd(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doAdd(final float lhs, final byte rhs) {
    return doAdd(NgFloat.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doAdd(final float lhs, final char rhs) {
    return doAdd(NgFloat.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doAdd(final float lhs, final short rhs) {
    return doAdd(NgFloat.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doAdd(final float lhs, final int rhs) {
    return doAdd(NgFloat.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doAdd(final float lhs, final long rhs) {
    return doAdd(NgFloat.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doAdd(final float lhs, final float rhs) {
    return doAdd(NgFloat.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doAdd(final float lhs, final double rhs) {
    return doAdd(NgFloat.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doAdd(final float lhs, final BigInteger rhs) {
    return doAdd(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doAdd(final float lhs, final BigDecimal rhs) {
    return doAdd(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doAdd(final double lhs, final byte rhs) {
    return doAdd(NgDouble.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doAdd(final double lhs, final char rhs) {
    return doAdd(NgDouble.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doAdd(final double lhs, final short rhs) {
    return doAdd(NgDouble.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doAdd(final double lhs, final int rhs) {
    return doAdd(NgDouble.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doAdd(final double lhs, final long rhs) {
    return doAdd(NgDouble.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doAdd(final double lhs, final float rhs) {
    return doAdd(NgDouble.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doAdd(final double lhs, final double rhs) {
    return doAdd(NgDouble.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doAdd(final double lhs, final BigInteger rhs) {
    return doAdd(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doAdd(final double lhs, final BigDecimal rhs) {
    return doAdd(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doAdd(final BigInteger lhs, final byte rhs) {
    return doAdd(lhs, NgByte.valueOf(rhs));
  }

  public Object doAdd(final BigInteger lhs, final char rhs) {
    return doAdd(lhs, NgChar.valueOf(rhs));
  }

  public Object doAdd(final BigInteger lhs, final short rhs) {
    return doAdd(lhs, NgShort.valueOf(rhs));
  }

  public Object doAdd(final BigInteger lhs, final int rhs) {
    return doAdd(lhs, NgInt.valueOf(rhs));
  }

  public Object doAdd(final BigInteger lhs, final long rhs) {
    return doAdd(lhs, NgLong.valueOf(rhs));
  }

  public Object doAdd(final BigInteger lhs, final float rhs) {
    return doAdd(lhs, NgFloat.valueOf(rhs));
  }

  public Object doAdd(final BigInteger lhs, final double rhs) {
    return doAdd(lhs, NgDouble.valueOf(rhs));
  }

  public Object doAdd(final BigInteger lhs, final BigInteger rhs) {
    return doAdd((Object)lhs, (Object)rhs);
  }

  public Object doAdd(final BigInteger lhs, final BigDecimal rhs) {
    return doAdd((Object)lhs, (Object)rhs);
  }

  public Object doAdd(final BigDecimal lhs, final byte rhs) {
    return doAdd(lhs, NgByte.valueOf(rhs));
  }

  public Object doAdd(final BigDecimal lhs, final char rhs) {
    return doAdd(lhs, NgChar.valueOf(rhs));
  }

  public Object doAdd(final BigDecimal lhs, final short rhs) {
    return doAdd(lhs, NgShort.valueOf(rhs));
  }

  public Object doAdd(final BigDecimal lhs, final int rhs) {
    return doAdd(lhs, NgInt.valueOf(rhs));
  }

  public Object doAdd(final BigDecimal lhs, final long rhs) {
    return doAdd(lhs, NgLong.valueOf(rhs));
  }

  public Object doAdd(final BigDecimal lhs, final float rhs) {
    return doAdd(lhs, NgFloat.valueOf(rhs));
  }

  public Object doAdd(final BigDecimal lhs, final double rhs) {
    return doAdd(lhs, NgDouble.valueOf(rhs));
  }

  public Object doAdd(final BigDecimal lhs, final BigInteger rhs) {
    return doAdd((Object)lhs, (Object)rhs);
  }

  public Object doAdd(final BigDecimal lhs, final BigDecimal rhs) {
    return doAdd((Object)lhs, (Object)rhs);
  }

  public Object doAdd(final Object lhs, final byte rhs) {
  final Object rhsObject = NgByte.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAdd(lhs, rhsObject);
  }

  public Object doAdd(final Object lhs, final char rhs) {
  final Object rhsObject = NgChar.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAdd(lhs, rhsObject);
  }

  public Object doAdd(final Object lhs, final short rhs) {
  final Object rhsObject = NgShort.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAdd(lhs, rhsObject);
  }

  public Object doAdd(final Object lhs, final int rhs) {
  final Object rhsObject = NgInt.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAdd(lhs, rhsObject);
  }

  public Object doAdd(final Object lhs, final long rhs) {
  final Object rhsObject = NgLong.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAdd(lhs, rhsObject);
  }

  public Object doAdd(final Object lhs, final float rhs) {
  final Object rhsObject = NgFloat.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAdd(lhs, rhsObject);
  }

  public Object doAdd(final Object lhs, final double rhs) {
  final Object rhsObject = NgDouble.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAdd(lhs, rhsObject);
  }

  public Object doAdd(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAdd(lhs, rhsObject);
  }

  public Object doAdd(final Object lhs, final BigDecimal rhs) {
  final Object rhsObject = rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAdd(lhs, rhsObject);
  }

  public Object doReverseAdd(final byte lhs, final Object rhs) {
  final Object lhsObject = NgByte.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAdd(lhsObject, rhs);
  }

  public Object doReverseAdd(final char lhs, final Object rhs) {
  final Object lhsObject = NgChar.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAdd(lhsObject, rhs);
  }

  public Object doReverseAdd(final short lhs, final Object rhs) {
  final Object lhsObject = NgShort.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAdd(lhsObject, rhs);
  }

  public Object doReverseAdd(final int lhs, final Object rhs) {
  final Object lhsObject = NgInt.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAdd(lhsObject, rhs);
  }

  public Object doReverseAdd(final long lhs, final Object rhs) {
  final Object lhsObject = NgLong.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAdd(lhsObject, rhs);
  }

  public Object doReverseAdd(final float lhs, final Object rhs) {
  final Object lhsObject = NgFloat.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAdd(lhsObject, rhs);
  }

  public Object doReverseAdd(final double lhs, final Object rhs) {
  final Object lhsObject = NgDouble.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAdd(lhsObject, rhs);
  }

  public Object doReverseAdd(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAdd(lhsObject, rhs);
  }

  public Object doReverseAdd(final BigDecimal lhs, final Object rhs) {
  final Object lhsObject = lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAdd(lhsObject, rhs);
  }

  //
  //   Internal methods for operator +=
  //
  //  These methods can be overidden to implement +=
  //  If the underlying object does not have the appropriate method
  //
  public Object doAddEquals(final Object lhs, final Object rhs) {
  Object result = this.instanceHandler.addEquals(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = this.instanceHandler.getMetaMethodQuick("plusEquals", rhs).call(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAddEquals(lhs, rhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          return doAdd(lhs, rhs);
        }
      }
    }

    return result;
  }
  
  public Object doReverseAddEquals(final Object lhs, final Object rhs) {
  Object result = this.instanceHandler.reverseAddEquals(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      result = this.instanceHandler.getMetaMethodQuick("reversePlusEquals", lhs).call(rhs, lhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        return doReverseAdd(lhs, rhs);
      }
    }

    return result;
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doAddEquals(final byte lhs, final byte rhs) {
    return doAddEquals(NgByte.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doAddEquals(final byte lhs, final char rhs) {
    return doAddEquals(NgByte.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doAddEquals(final byte lhs, final short rhs) {
    return doAddEquals(NgByte.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doAddEquals(final byte lhs, final int rhs) {
    return doAddEquals(NgByte.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doAddEquals(final byte lhs, final long rhs) {
    return doAddEquals(NgByte.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doAddEquals(final byte lhs, final float rhs) {
    return doAddEquals(NgByte.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doAddEquals(final byte lhs, final double rhs) {
    return doAddEquals(NgByte.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doAddEquals(final byte lhs, final BigInteger rhs) {
    return doAddEquals(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doAddEquals(final byte lhs, final BigDecimal rhs) {
    return doAddEquals(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doAddEquals(final char lhs, final byte rhs) {
    return doAddEquals(NgChar.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doAddEquals(final char lhs, final char rhs) {
    return doAddEquals(NgChar.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doAddEquals(final char lhs, final short rhs) {
    return doAddEquals(NgChar.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doAddEquals(final char lhs, final int rhs) {
    return doAddEquals(NgChar.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doAddEquals(final char lhs, final long rhs) {
    return doAddEquals(NgChar.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doAddEquals(final char lhs, final float rhs) {
    return doAddEquals(NgChar.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doAddEquals(final char lhs, final double rhs) {
    return doAddEquals(NgChar.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doAddEquals(final char lhs, final BigInteger rhs) {
    return doAddEquals(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doAddEquals(final char lhs, final BigDecimal rhs) {
    return doAddEquals(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doAddEquals(final short lhs, final byte rhs) {
    return doAddEquals(NgShort.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doAddEquals(final short lhs, final char rhs) {
    return doAddEquals(NgShort.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doAddEquals(final short lhs, final short rhs) {
    return doAddEquals(NgShort.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doAddEquals(final short lhs, final int rhs) {
    return doAddEquals(NgShort.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doAddEquals(final short lhs, final long rhs) {
    return doAddEquals(NgShort.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doAddEquals(final short lhs, final float rhs) {
    return doAddEquals(NgShort.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doAddEquals(final short lhs, final double rhs) {
    return doAddEquals(NgShort.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doAddEquals(final short lhs, final BigInteger rhs) {
    return doAddEquals(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doAddEquals(final short lhs, final BigDecimal rhs) {
    return doAddEquals(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doAddEquals(final int lhs, final byte rhs) {
    return doAddEquals(NgInt.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doAddEquals(final int lhs, final char rhs) {
    return doAddEquals(NgInt.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doAddEquals(final int lhs, final short rhs) {
    return doAddEquals(NgInt.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doAddEquals(final int lhs, final int rhs) {
    return doAddEquals(NgInt.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doAddEquals(final int lhs, final long rhs) {
    return doAddEquals(NgInt.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doAddEquals(final int lhs, final float rhs) {
    return doAddEquals(NgInt.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doAddEquals(final int lhs, final double rhs) {
    return doAddEquals(NgInt.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doAddEquals(final int lhs, final BigInteger rhs) {
    return doAddEquals(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doAddEquals(final int lhs, final BigDecimal rhs) {
    return doAddEquals(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doAddEquals(final long lhs, final byte rhs) {
    return doAddEquals(NgLong.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doAddEquals(final long lhs, final char rhs) {
    return doAddEquals(NgLong.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doAddEquals(final long lhs, final short rhs) {
    return doAddEquals(NgLong.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doAddEquals(final long lhs, final int rhs) {
    return doAddEquals(NgLong.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doAddEquals(final long lhs, final long rhs) {
    return doAddEquals(NgLong.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doAddEquals(final long lhs, final float rhs) {
    return doAddEquals(NgLong.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doAddEquals(final long lhs, final double rhs) {
    return doAddEquals(NgLong.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doAddEquals(final long lhs, final BigInteger rhs) {
    return doAddEquals(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doAddEquals(final long lhs, final BigDecimal rhs) {
    return doAddEquals(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doAddEquals(final float lhs, final byte rhs) {
    return doAddEquals(NgFloat.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doAddEquals(final float lhs, final char rhs) {
    return doAddEquals(NgFloat.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doAddEquals(final float lhs, final short rhs) {
    return doAddEquals(NgFloat.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doAddEquals(final float lhs, final int rhs) {
    return doAddEquals(NgFloat.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doAddEquals(final float lhs, final long rhs) {
    return doAddEquals(NgFloat.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doAddEquals(final float lhs, final float rhs) {
    return doAddEquals(NgFloat.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doAddEquals(final float lhs, final double rhs) {
    return doAddEquals(NgFloat.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doAddEquals(final float lhs, final BigInteger rhs) {
    return doAddEquals(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doAddEquals(final float lhs, final BigDecimal rhs) {
    return doAddEquals(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doAddEquals(final double lhs, final byte rhs) {
    return doAddEquals(NgDouble.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doAddEquals(final double lhs, final char rhs) {
    return doAddEquals(NgDouble.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doAddEquals(final double lhs, final short rhs) {
    return doAddEquals(NgDouble.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doAddEquals(final double lhs, final int rhs) {
    return doAddEquals(NgDouble.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doAddEquals(final double lhs, final long rhs) {
    return doAddEquals(NgDouble.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doAddEquals(final double lhs, final float rhs) {
    return doAddEquals(NgDouble.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doAddEquals(final double lhs, final double rhs) {
    return doAddEquals(NgDouble.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doAddEquals(final double lhs, final BigInteger rhs) {
    return doAddEquals(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doAddEquals(final double lhs, final BigDecimal rhs) {
    return doAddEquals(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doAddEquals(final BigInteger lhs, final byte rhs) {
    return doAddEquals(lhs, NgByte.valueOf(rhs));
  }

  public Object doAddEquals(final BigInteger lhs, final char rhs) {
    return doAddEquals(lhs, NgChar.valueOf(rhs));
  }

  public Object doAddEquals(final BigInteger lhs, final short rhs) {
    return doAddEquals(lhs, NgShort.valueOf(rhs));
  }

  public Object doAddEquals(final BigInteger lhs, final int rhs) {
    return doAddEquals(lhs, NgInt.valueOf(rhs));
  }

  public Object doAddEquals(final BigInteger lhs, final long rhs) {
    return doAddEquals(lhs, NgLong.valueOf(rhs));
  }

  public Object doAddEquals(final BigInteger lhs, final float rhs) {
    return doAddEquals(lhs, NgFloat.valueOf(rhs));
  }

  public Object doAddEquals(final BigInteger lhs, final double rhs) {
    return doAddEquals(lhs, NgDouble.valueOf(rhs));
  }

  public Object doAddEquals(final BigInteger lhs, final BigInteger rhs) {
    return doAddEquals((Object)lhs, (Object)rhs);
  }

  public Object doAddEquals(final BigInteger lhs, final BigDecimal rhs) {
    return doAddEquals((Object)lhs, (Object)rhs);
  }

  public Object doAddEquals(final BigDecimal lhs, final byte rhs) {
    return doAddEquals(lhs, NgByte.valueOf(rhs));
  }

  public Object doAddEquals(final BigDecimal lhs, final char rhs) {
    return doAddEquals(lhs, NgChar.valueOf(rhs));
  }

  public Object doAddEquals(final BigDecimal lhs, final short rhs) {
    return doAddEquals(lhs, NgShort.valueOf(rhs));
  }

  public Object doAddEquals(final BigDecimal lhs, final int rhs) {
    return doAddEquals(lhs, NgInt.valueOf(rhs));
  }

  public Object doAddEquals(final BigDecimal lhs, final long rhs) {
    return doAddEquals(lhs, NgLong.valueOf(rhs));
  }

  public Object doAddEquals(final BigDecimal lhs, final float rhs) {
    return doAddEquals(lhs, NgFloat.valueOf(rhs));
  }

  public Object doAddEquals(final BigDecimal lhs, final double rhs) {
    return doAddEquals(lhs, NgDouble.valueOf(rhs));
  }

  public Object doAddEquals(final BigDecimal lhs, final BigInteger rhs) {
    return doAddEquals((Object)lhs, (Object)rhs);
  }

  public Object doAddEquals(final BigDecimal lhs, final BigDecimal rhs) {
    return doAddEquals((Object)lhs, (Object)rhs);
  }

  public Object doAddEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = NgByte.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAddEquals(lhs, rhsObject);
  }

  public Object doAddEquals(final Object lhs, final char rhs) {
  final Object rhsObject = NgChar.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAddEquals(lhs, rhsObject);
  }

  public Object doAddEquals(final Object lhs, final short rhs) {
  final Object rhsObject = NgShort.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAddEquals(lhs, rhsObject);
  }

  public Object doAddEquals(final Object lhs, final int rhs) {
  final Object rhsObject = NgInt.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAddEquals(lhs, rhsObject);
  }

  public Object doAddEquals(final Object lhs, final long rhs) {
  final Object rhsObject = NgLong.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAddEquals(lhs, rhsObject);
  }

  public Object doAddEquals(final Object lhs, final float rhs) {
  final Object rhsObject = NgFloat.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAddEquals(lhs, rhsObject);
  }

  public Object doAddEquals(final Object lhs, final double rhs) {
  final Object rhsObject = NgDouble.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAddEquals(lhs, rhsObject);
  }

  public Object doAddEquals(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAddEquals(lhs, rhsObject);
  }

  public Object doAddEquals(final Object lhs, final BigDecimal rhs) {
  final Object rhsObject = rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAddEquals(lhs, rhsObject);
  }

  public Object doReverseAddEquals(final byte lhs, final Object rhs) {
  final Object lhsObject = NgByte.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAddEquals(lhsObject, rhs);
  }

  public Object doReverseAddEquals(final char lhs, final Object rhs) {
  final Object lhsObject = NgChar.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAddEquals(lhsObject, rhs);
  }

  public Object doReverseAddEquals(final short lhs, final Object rhs) {
  final Object lhsObject = NgShort.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAddEquals(lhsObject, rhs);
  }

  public Object doReverseAddEquals(final int lhs, final Object rhs) {
  final Object lhsObject = NgInt.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAddEquals(lhsObject, rhs);
  }

  public Object doReverseAddEquals(final long lhs, final Object rhs) {
  final Object lhsObject = NgLong.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAddEquals(lhsObject, rhs);
  }

  public Object doReverseAddEquals(final float lhs, final Object rhs) {
  final Object lhsObject = NgFloat.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAddEquals(lhsObject, rhs);
  }

  public Object doReverseAddEquals(final double lhs, final Object rhs) {
  final Object lhsObject = NgDouble.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAddEquals(lhsObject, rhs);
  }

  public Object doReverseAddEquals(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAddEquals(lhsObject, rhs);
  }

  public Object doReverseAddEquals(final BigDecimal lhs, final Object rhs) {
  final Object lhsObject = lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAddEquals(lhsObject, rhs);
  }

  //
  //   Internal methods for operator -
  //
  //  These methods can be overidden to implement -
  //  If the underlying object does not have the appropriate method
  //
  public Object doSubtract(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.subtract(lhs, rhs);
    
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("minus", rhs).call(lhs, rhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtract(lhs, rhs);
        }
      }

      return result;
    }
    
    public Object doReverseSubtract(final Object lhs, final Object rhs) {
    final Object result = this.instanceHandler.reverseSubtract(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        return this.instanceHandler.getMetaMethodQuick("reverseMinus", lhs).call(rhs, lhs);
      }

      return result;
    }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doSubtract(final byte lhs, final byte rhs) {
    return doSubtract(NgByte.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doSubtract(final byte lhs, final char rhs) {
    return doSubtract(NgByte.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doSubtract(final byte lhs, final short rhs) {
    return doSubtract(NgByte.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doSubtract(final byte lhs, final int rhs) {
    return doSubtract(NgByte.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doSubtract(final byte lhs, final long rhs) {
    return doSubtract(NgByte.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doSubtract(final byte lhs, final float rhs) {
    return doSubtract(NgByte.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doSubtract(final byte lhs, final double rhs) {
    return doSubtract(NgByte.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doSubtract(final byte lhs, final BigInteger rhs) {
    return doSubtract(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doSubtract(final byte lhs, final BigDecimal rhs) {
    return doSubtract(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doSubtract(final char lhs, final byte rhs) {
    return doSubtract(NgChar.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doSubtract(final char lhs, final char rhs) {
    return doSubtract(NgChar.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doSubtract(final char lhs, final short rhs) {
    return doSubtract(NgChar.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doSubtract(final char lhs, final int rhs) {
    return doSubtract(NgChar.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doSubtract(final char lhs, final long rhs) {
    return doSubtract(NgChar.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doSubtract(final char lhs, final float rhs) {
    return doSubtract(NgChar.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doSubtract(final char lhs, final double rhs) {
    return doSubtract(NgChar.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doSubtract(final char lhs, final BigInteger rhs) {
    return doSubtract(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doSubtract(final char lhs, final BigDecimal rhs) {
    return doSubtract(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doSubtract(final short lhs, final byte rhs) {
    return doSubtract(NgShort.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doSubtract(final short lhs, final char rhs) {
    return doSubtract(NgShort.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doSubtract(final short lhs, final short rhs) {
    return doSubtract(NgShort.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doSubtract(final short lhs, final int rhs) {
    return doSubtract(NgShort.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doSubtract(final short lhs, final long rhs) {
    return doSubtract(NgShort.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doSubtract(final short lhs, final float rhs) {
    return doSubtract(NgShort.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doSubtract(final short lhs, final double rhs) {
    return doSubtract(NgShort.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doSubtract(final short lhs, final BigInteger rhs) {
    return doSubtract(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doSubtract(final short lhs, final BigDecimal rhs) {
    return doSubtract(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doSubtract(final int lhs, final byte rhs) {
    return doSubtract(NgInt.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doSubtract(final int lhs, final char rhs) {
    return doSubtract(NgInt.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doSubtract(final int lhs, final short rhs) {
    return doSubtract(NgInt.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doSubtract(final int lhs, final int rhs) {
    return doSubtract(NgInt.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doSubtract(final int lhs, final long rhs) {
    return doSubtract(NgInt.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doSubtract(final int lhs, final float rhs) {
    return doSubtract(NgInt.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doSubtract(final int lhs, final double rhs) {
    return doSubtract(NgInt.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doSubtract(final int lhs, final BigInteger rhs) {
    return doSubtract(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doSubtract(final int lhs, final BigDecimal rhs) {
    return doSubtract(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doSubtract(final long lhs, final byte rhs) {
    return doSubtract(NgLong.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doSubtract(final long lhs, final char rhs) {
    return doSubtract(NgLong.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doSubtract(final long lhs, final short rhs) {
    return doSubtract(NgLong.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doSubtract(final long lhs, final int rhs) {
    return doSubtract(NgLong.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doSubtract(final long lhs, final long rhs) {
    return doSubtract(NgLong.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doSubtract(final long lhs, final float rhs) {
    return doSubtract(NgLong.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doSubtract(final long lhs, final double rhs) {
    return doSubtract(NgLong.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doSubtract(final long lhs, final BigInteger rhs) {
    return doSubtract(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doSubtract(final long lhs, final BigDecimal rhs) {
    return doSubtract(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doSubtract(final float lhs, final byte rhs) {
    return doSubtract(NgFloat.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doSubtract(final float lhs, final char rhs) {
    return doSubtract(NgFloat.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doSubtract(final float lhs, final short rhs) {
    return doSubtract(NgFloat.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doSubtract(final float lhs, final int rhs) {
    return doSubtract(NgFloat.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doSubtract(final float lhs, final long rhs) {
    return doSubtract(NgFloat.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doSubtract(final float lhs, final float rhs) {
    return doSubtract(NgFloat.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doSubtract(final float lhs, final double rhs) {
    return doSubtract(NgFloat.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doSubtract(final float lhs, final BigInteger rhs) {
    return doSubtract(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doSubtract(final float lhs, final BigDecimal rhs) {
    return doSubtract(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doSubtract(final double lhs, final byte rhs) {
    return doSubtract(NgDouble.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doSubtract(final double lhs, final char rhs) {
    return doSubtract(NgDouble.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doSubtract(final double lhs, final short rhs) {
    return doSubtract(NgDouble.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doSubtract(final double lhs, final int rhs) {
    return doSubtract(NgDouble.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doSubtract(final double lhs, final long rhs) {
    return doSubtract(NgDouble.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doSubtract(final double lhs, final float rhs) {
    return doSubtract(NgDouble.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doSubtract(final double lhs, final double rhs) {
    return doSubtract(NgDouble.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doSubtract(final double lhs, final BigInteger rhs) {
    return doSubtract(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doSubtract(final double lhs, final BigDecimal rhs) {
    return doSubtract(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doSubtract(final BigInteger lhs, final byte rhs) {
    return doSubtract(lhs, NgByte.valueOf(rhs));
  }

  public Object doSubtract(final BigInteger lhs, final char rhs) {
    return doSubtract(lhs, NgChar.valueOf(rhs));
  }

  public Object doSubtract(final BigInteger lhs, final short rhs) {
    return doSubtract(lhs, NgShort.valueOf(rhs));
  }

  public Object doSubtract(final BigInteger lhs, final int rhs) {
    return doSubtract(lhs, NgInt.valueOf(rhs));
  }

  public Object doSubtract(final BigInteger lhs, final long rhs) {
    return doSubtract(lhs, NgLong.valueOf(rhs));
  }

  public Object doSubtract(final BigInteger lhs, final float rhs) {
    return doSubtract(lhs, NgFloat.valueOf(rhs));
  }

  public Object doSubtract(final BigInteger lhs, final double rhs) {
    return doSubtract(lhs, NgDouble.valueOf(rhs));
  }

  public Object doSubtract(final BigInteger lhs, final BigInteger rhs) {
    return doSubtract((Object)lhs, (Object)rhs);
  }

  public Object doSubtract(final BigInteger lhs, final BigDecimal rhs) {
    return doSubtract((Object)lhs, (Object)rhs);
  }

  public Object doSubtract(final BigDecimal lhs, final byte rhs) {
    return doSubtract(lhs, NgByte.valueOf(rhs));
  }

  public Object doSubtract(final BigDecimal lhs, final char rhs) {
    return doSubtract(lhs, NgChar.valueOf(rhs));
  }

  public Object doSubtract(final BigDecimal lhs, final short rhs) {
    return doSubtract(lhs, NgShort.valueOf(rhs));
  }

  public Object doSubtract(final BigDecimal lhs, final int rhs) {
    return doSubtract(lhs, NgInt.valueOf(rhs));
  }

  public Object doSubtract(final BigDecimal lhs, final long rhs) {
    return doSubtract(lhs, NgLong.valueOf(rhs));
  }

  public Object doSubtract(final BigDecimal lhs, final float rhs) {
    return doSubtract(lhs, NgFloat.valueOf(rhs));
  }

  public Object doSubtract(final BigDecimal lhs, final double rhs) {
    return doSubtract(lhs, NgDouble.valueOf(rhs));
  }

  public Object doSubtract(final BigDecimal lhs, final BigInteger rhs) {
    return doSubtract((Object)lhs, (Object)rhs);
  }

  public Object doSubtract(final BigDecimal lhs, final BigDecimal rhs) {
    return doSubtract((Object)lhs, (Object)rhs);
  }

  public Object doSubtract(final Object lhs, final byte rhs) {
  final Object rhsObject = NgByte.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtract(lhs, rhsObject);
  }

  public Object doSubtract(final Object lhs, final char rhs) {
  final Object rhsObject = NgChar.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtract(lhs, rhsObject);
  }

  public Object doSubtract(final Object lhs, final short rhs) {
  final Object rhsObject = NgShort.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtract(lhs, rhsObject);
  }

  public Object doSubtract(final Object lhs, final int rhs) {
  final Object rhsObject = NgInt.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtract(lhs, rhsObject);
  }

  public Object doSubtract(final Object lhs, final long rhs) {
  final Object rhsObject = NgLong.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtract(lhs, rhsObject);
  }

  public Object doSubtract(final Object lhs, final float rhs) {
  final Object rhsObject = NgFloat.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtract(lhs, rhsObject);
  }

  public Object doSubtract(final Object lhs, final double rhs) {
  final Object rhsObject = NgDouble.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtract(lhs, rhsObject);
  }

  public Object doSubtract(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtract(lhs, rhsObject);
  }

  public Object doSubtract(final Object lhs, final BigDecimal rhs) {
  final Object rhsObject = rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtract(lhs, rhsObject);
  }

  public Object doReverseSubtract(final byte lhs, final Object rhs) {
  final Object lhsObject = NgByte.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtract(lhsObject, rhs);
  }

  public Object doReverseSubtract(final char lhs, final Object rhs) {
  final Object lhsObject = NgChar.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtract(lhsObject, rhs);
  }

  public Object doReverseSubtract(final short lhs, final Object rhs) {
  final Object lhsObject = NgShort.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtract(lhsObject, rhs);
  }

  public Object doReverseSubtract(final int lhs, final Object rhs) {
  final Object lhsObject = NgInt.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtract(lhsObject, rhs);
  }

  public Object doReverseSubtract(final long lhs, final Object rhs) {
  final Object lhsObject = NgLong.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtract(lhsObject, rhs);
  }

  public Object doReverseSubtract(final float lhs, final Object rhs) {
  final Object lhsObject = NgFloat.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtract(lhsObject, rhs);
  }

  public Object doReverseSubtract(final double lhs, final Object rhs) {
  final Object lhsObject = NgDouble.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtract(lhsObject, rhs);
  }

  public Object doReverseSubtract(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtract(lhsObject, rhs);
  }

  public Object doReverseSubtract(final BigDecimal lhs, final Object rhs) {
  final Object lhsObject = lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtract(lhsObject, rhs);
  }

  //
  //   Internal methods for operator -=
  //
  //  These methods can be overidden to implement -=
  //  If the underlying object does not have the appropriate method
  //
  public Object doSubtractEquals(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.subtractEquals(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("minusEquals", rhs).call(lhs, rhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          result = NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtractEquals(lhs, rhs);
          
          if (result == RuntimeMetaClassImpl.NOT_CALLED) {
            return doSubtract(lhs, rhs);
          }
        }
      }

      return result;
    }
    
    public Object doReverseSubtractEquals(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.reverseSubtractEquals(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("reverseMinusEquals", lhs).call(rhs, lhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          return doReverseSubtract(lhs, rhs);
        }
      }

      return result;
    }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doSubtractEquals(final byte lhs, final byte rhs) {
    return doSubtractEquals(NgByte.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doSubtractEquals(final byte lhs, final char rhs) {
    return doSubtractEquals(NgByte.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doSubtractEquals(final byte lhs, final short rhs) {
    return doSubtractEquals(NgByte.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doSubtractEquals(final byte lhs, final int rhs) {
    return doSubtractEquals(NgByte.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doSubtractEquals(final byte lhs, final long rhs) {
    return doSubtractEquals(NgByte.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doSubtractEquals(final byte lhs, final float rhs) {
    return doSubtractEquals(NgByte.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doSubtractEquals(final byte lhs, final double rhs) {
    return doSubtractEquals(NgByte.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doSubtractEquals(final byte lhs, final BigInteger rhs) {
    return doSubtractEquals(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doSubtractEquals(final byte lhs, final BigDecimal rhs) {
    return doSubtractEquals(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doSubtractEquals(final char lhs, final byte rhs) {
    return doSubtractEquals(NgChar.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doSubtractEquals(final char lhs, final char rhs) {
    return doSubtractEquals(NgChar.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doSubtractEquals(final char lhs, final short rhs) {
    return doSubtractEquals(NgChar.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doSubtractEquals(final char lhs, final int rhs) {
    return doSubtractEquals(NgChar.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doSubtractEquals(final char lhs, final long rhs) {
    return doSubtractEquals(NgChar.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doSubtractEquals(final char lhs, final float rhs) {
    return doSubtractEquals(NgChar.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doSubtractEquals(final char lhs, final double rhs) {
    return doSubtractEquals(NgChar.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doSubtractEquals(final char lhs, final BigInteger rhs) {
    return doSubtractEquals(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doSubtractEquals(final char lhs, final BigDecimal rhs) {
    return doSubtractEquals(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doSubtractEquals(final short lhs, final byte rhs) {
    return doSubtractEquals(NgShort.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doSubtractEquals(final short lhs, final char rhs) {
    return doSubtractEquals(NgShort.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doSubtractEquals(final short lhs, final short rhs) {
    return doSubtractEquals(NgShort.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doSubtractEquals(final short lhs, final int rhs) {
    return doSubtractEquals(NgShort.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doSubtractEquals(final short lhs, final long rhs) {
    return doSubtractEquals(NgShort.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doSubtractEquals(final short lhs, final float rhs) {
    return doSubtractEquals(NgShort.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doSubtractEquals(final short lhs, final double rhs) {
    return doSubtractEquals(NgShort.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doSubtractEquals(final short lhs, final BigInteger rhs) {
    return doSubtractEquals(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doSubtractEquals(final short lhs, final BigDecimal rhs) {
    return doSubtractEquals(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doSubtractEquals(final int lhs, final byte rhs) {
    return doSubtractEquals(NgInt.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doSubtractEquals(final int lhs, final char rhs) {
    return doSubtractEquals(NgInt.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doSubtractEquals(final int lhs, final short rhs) {
    return doSubtractEquals(NgInt.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doSubtractEquals(final int lhs, final int rhs) {
    return doSubtractEquals(NgInt.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doSubtractEquals(final int lhs, final long rhs) {
    return doSubtractEquals(NgInt.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doSubtractEquals(final int lhs, final float rhs) {
    return doSubtractEquals(NgInt.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doSubtractEquals(final int lhs, final double rhs) {
    return doSubtractEquals(NgInt.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doSubtractEquals(final int lhs, final BigInteger rhs) {
    return doSubtractEquals(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doSubtractEquals(final int lhs, final BigDecimal rhs) {
    return doSubtractEquals(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doSubtractEquals(final long lhs, final byte rhs) {
    return doSubtractEquals(NgLong.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doSubtractEquals(final long lhs, final char rhs) {
    return doSubtractEquals(NgLong.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doSubtractEquals(final long lhs, final short rhs) {
    return doSubtractEquals(NgLong.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doSubtractEquals(final long lhs, final int rhs) {
    return doSubtractEquals(NgLong.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doSubtractEquals(final long lhs, final long rhs) {
    return doSubtractEquals(NgLong.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doSubtractEquals(final long lhs, final float rhs) {
    return doSubtractEquals(NgLong.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doSubtractEquals(final long lhs, final double rhs) {
    return doSubtractEquals(NgLong.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doSubtractEquals(final long lhs, final BigInteger rhs) {
    return doSubtractEquals(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doSubtractEquals(final long lhs, final BigDecimal rhs) {
    return doSubtractEquals(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doSubtractEquals(final float lhs, final byte rhs) {
    return doSubtractEquals(NgFloat.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doSubtractEquals(final float lhs, final char rhs) {
    return doSubtractEquals(NgFloat.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doSubtractEquals(final float lhs, final short rhs) {
    return doSubtractEquals(NgFloat.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doSubtractEquals(final float lhs, final int rhs) {
    return doSubtractEquals(NgFloat.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doSubtractEquals(final float lhs, final long rhs) {
    return doSubtractEquals(NgFloat.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doSubtractEquals(final float lhs, final float rhs) {
    return doSubtractEquals(NgFloat.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doSubtractEquals(final float lhs, final double rhs) {
    return doSubtractEquals(NgFloat.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doSubtractEquals(final float lhs, final BigInteger rhs) {
    return doSubtractEquals(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doSubtractEquals(final float lhs, final BigDecimal rhs) {
    return doSubtractEquals(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doSubtractEquals(final double lhs, final byte rhs) {
    return doSubtractEquals(NgDouble.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doSubtractEquals(final double lhs, final char rhs) {
    return doSubtractEquals(NgDouble.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doSubtractEquals(final double lhs, final short rhs) {
    return doSubtractEquals(NgDouble.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doSubtractEquals(final double lhs, final int rhs) {
    return doSubtractEquals(NgDouble.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doSubtractEquals(final double lhs, final long rhs) {
    return doSubtractEquals(NgDouble.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doSubtractEquals(final double lhs, final float rhs) {
    return doSubtractEquals(NgDouble.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doSubtractEquals(final double lhs, final double rhs) {
    return doSubtractEquals(NgDouble.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doSubtractEquals(final double lhs, final BigInteger rhs) {
    return doSubtractEquals(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doSubtractEquals(final double lhs, final BigDecimal rhs) {
    return doSubtractEquals(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doSubtractEquals(final BigInteger lhs, final byte rhs) {
    return doSubtractEquals(lhs, NgByte.valueOf(rhs));
  }

  public Object doSubtractEquals(final BigInteger lhs, final char rhs) {
    return doSubtractEquals(lhs, NgChar.valueOf(rhs));
  }

  public Object doSubtractEquals(final BigInteger lhs, final short rhs) {
    return doSubtractEquals(lhs, NgShort.valueOf(rhs));
  }

  public Object doSubtractEquals(final BigInteger lhs, final int rhs) {
    return doSubtractEquals(lhs, NgInt.valueOf(rhs));
  }

  public Object doSubtractEquals(final BigInteger lhs, final long rhs) {
    return doSubtractEquals(lhs, NgLong.valueOf(rhs));
  }

  public Object doSubtractEquals(final BigInteger lhs, final float rhs) {
    return doSubtractEquals(lhs, NgFloat.valueOf(rhs));
  }

  public Object doSubtractEquals(final BigInteger lhs, final double rhs) {
    return doSubtractEquals(lhs, NgDouble.valueOf(rhs));
  }

  public Object doSubtractEquals(final BigInteger lhs, final BigInteger rhs) {
    return doSubtractEquals((Object)lhs, (Object)rhs);
  }

  public Object doSubtractEquals(final BigInteger lhs, final BigDecimal rhs) {
    return doSubtractEquals((Object)lhs, (Object)rhs);
  }

  public Object doSubtractEquals(final BigDecimal lhs, final byte rhs) {
    return doSubtractEquals(lhs, NgByte.valueOf(rhs));
  }

  public Object doSubtractEquals(final BigDecimal lhs, final char rhs) {
    return doSubtractEquals(lhs, NgChar.valueOf(rhs));
  }

  public Object doSubtractEquals(final BigDecimal lhs, final short rhs) {
    return doSubtractEquals(lhs, NgShort.valueOf(rhs));
  }

  public Object doSubtractEquals(final BigDecimal lhs, final int rhs) {
    return doSubtractEquals(lhs, NgInt.valueOf(rhs));
  }

  public Object doSubtractEquals(final BigDecimal lhs, final long rhs) {
    return doSubtractEquals(lhs, NgLong.valueOf(rhs));
  }

  public Object doSubtractEquals(final BigDecimal lhs, final float rhs) {
    return doSubtractEquals(lhs, NgFloat.valueOf(rhs));
  }

  public Object doSubtractEquals(final BigDecimal lhs, final double rhs) {
    return doSubtractEquals(lhs, NgDouble.valueOf(rhs));
  }

  public Object doSubtractEquals(final BigDecimal lhs, final BigInteger rhs) {
    return doSubtractEquals((Object)lhs, (Object)rhs);
  }

  public Object doSubtractEquals(final BigDecimal lhs, final BigDecimal rhs) {
    return doSubtractEquals((Object)lhs, (Object)rhs);
  }

  public Object doSubtractEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = NgByte.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtractEquals(lhs, rhsObject);
  }

  public Object doSubtractEquals(final Object lhs, final char rhs) {
  final Object rhsObject = NgChar.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtractEquals(lhs, rhsObject);
  }

  public Object doSubtractEquals(final Object lhs, final short rhs) {
  final Object rhsObject = NgShort.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtractEquals(lhs, rhsObject);
  }

  public Object doSubtractEquals(final Object lhs, final int rhs) {
  final Object rhsObject = NgInt.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtractEquals(lhs, rhsObject);
  }

  public Object doSubtractEquals(final Object lhs, final long rhs) {
  final Object rhsObject = NgLong.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtractEquals(lhs, rhsObject);
  }

  public Object doSubtractEquals(final Object lhs, final float rhs) {
  final Object rhsObject = NgFloat.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtractEquals(lhs, rhsObject);
  }

  public Object doSubtractEquals(final Object lhs, final double rhs) {
  final Object rhsObject = NgDouble.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtractEquals(lhs, rhsObject);
  }

  public Object doSubtractEquals(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtractEquals(lhs, rhsObject);
  }

  public Object doSubtractEquals(final Object lhs, final BigDecimal rhs) {
  final Object rhsObject = rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtractEquals(lhs, rhsObject);
  }

  public Object doReverseSubtractEquals(final byte lhs, final Object rhs) {
  final Object lhsObject = NgByte.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtractEquals(lhsObject, rhs);
  }

  public Object doReverseSubtractEquals(final char lhs, final Object rhs) {
  final Object lhsObject = NgChar.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtractEquals(lhsObject, rhs);
  }

  public Object doReverseSubtractEquals(final short lhs, final Object rhs) {
  final Object lhsObject = NgShort.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtractEquals(lhsObject, rhs);
  }

  public Object doReverseSubtractEquals(final int lhs, final Object rhs) {
  final Object lhsObject = NgInt.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtractEquals(lhsObject, rhs);
  }

  public Object doReverseSubtractEquals(final long lhs, final Object rhs) {
  final Object lhsObject = NgLong.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtractEquals(lhsObject, rhs);
  }

  public Object doReverseSubtractEquals(final float lhs, final Object rhs) {
  final Object lhsObject = NgFloat.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtractEquals(lhsObject, rhs);
  }

  public Object doReverseSubtractEquals(final double lhs, final Object rhs) {
  final Object lhsObject = NgDouble.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtractEquals(lhsObject, rhs);
  }

  public Object doReverseSubtractEquals(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtractEquals(lhsObject, rhs);
  }

  public Object doReverseSubtractEquals(final BigDecimal lhs, final Object rhs) {
  final Object lhsObject = lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtractEquals(lhsObject, rhs);
  }

  //
  //   Internal methods for operator *
  //
  //  These methods can be overidden to implement *
  //  If the underlying object does not have the appropriate method
  //
  public Object doMultiply(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.multiply(lhs, rhs);
    
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("multiply", rhs).call(lhs, rhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiply(lhs, rhs);
        }
      }

      return result;
    }
    
    public Object doReverseMultiply(final Object lhs, final Object rhs) {
    final Object result = this.instanceHandler.reverseMultiply(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        return this.instanceHandler.getMetaMethodQuick("reverseMultiply", lhs).call(rhs, lhs);
      }

      return result;
    }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doMultiply(final byte lhs, final byte rhs) {
    return doMultiply(NgByte.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doMultiply(final byte lhs, final char rhs) {
    return doMultiply(NgByte.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doMultiply(final byte lhs, final short rhs) {
    return doMultiply(NgByte.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doMultiply(final byte lhs, final int rhs) {
    return doMultiply(NgByte.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doMultiply(final byte lhs, final long rhs) {
    return doMultiply(NgByte.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doMultiply(final byte lhs, final float rhs) {
    return doMultiply(NgByte.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doMultiply(final byte lhs, final double rhs) {
    return doMultiply(NgByte.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doMultiply(final byte lhs, final BigInteger rhs) {
    return doMultiply(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doMultiply(final byte lhs, final BigDecimal rhs) {
    return doMultiply(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doMultiply(final char lhs, final byte rhs) {
    return doMultiply(NgChar.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doMultiply(final char lhs, final char rhs) {
    return doMultiply(NgChar.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doMultiply(final char lhs, final short rhs) {
    return doMultiply(NgChar.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doMultiply(final char lhs, final int rhs) {
    return doMultiply(NgChar.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doMultiply(final char lhs, final long rhs) {
    return doMultiply(NgChar.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doMultiply(final char lhs, final float rhs) {
    return doMultiply(NgChar.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doMultiply(final char lhs, final double rhs) {
    return doMultiply(NgChar.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doMultiply(final char lhs, final BigInteger rhs) {
    return doMultiply(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doMultiply(final char lhs, final BigDecimal rhs) {
    return doMultiply(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doMultiply(final short lhs, final byte rhs) {
    return doMultiply(NgShort.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doMultiply(final short lhs, final char rhs) {
    return doMultiply(NgShort.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doMultiply(final short lhs, final short rhs) {
    return doMultiply(NgShort.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doMultiply(final short lhs, final int rhs) {
    return doMultiply(NgShort.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doMultiply(final short lhs, final long rhs) {
    return doMultiply(NgShort.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doMultiply(final short lhs, final float rhs) {
    return doMultiply(NgShort.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doMultiply(final short lhs, final double rhs) {
    return doMultiply(NgShort.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doMultiply(final short lhs, final BigInteger rhs) {
    return doMultiply(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doMultiply(final short lhs, final BigDecimal rhs) {
    return doMultiply(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doMultiply(final int lhs, final byte rhs) {
    return doMultiply(NgInt.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doMultiply(final int lhs, final char rhs) {
    return doMultiply(NgInt.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doMultiply(final int lhs, final short rhs) {
    return doMultiply(NgInt.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doMultiply(final int lhs, final int rhs) {
    return doMultiply(NgInt.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doMultiply(final int lhs, final long rhs) {
    return doMultiply(NgInt.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doMultiply(final int lhs, final float rhs) {
    return doMultiply(NgInt.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doMultiply(final int lhs, final double rhs) {
    return doMultiply(NgInt.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doMultiply(final int lhs, final BigInteger rhs) {
    return doMultiply(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doMultiply(final int lhs, final BigDecimal rhs) {
    return doMultiply(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doMultiply(final long lhs, final byte rhs) {
    return doMultiply(NgLong.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doMultiply(final long lhs, final char rhs) {
    return doMultiply(NgLong.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doMultiply(final long lhs, final short rhs) {
    return doMultiply(NgLong.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doMultiply(final long lhs, final int rhs) {
    return doMultiply(NgLong.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doMultiply(final long lhs, final long rhs) {
    return doMultiply(NgLong.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doMultiply(final long lhs, final float rhs) {
    return doMultiply(NgLong.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doMultiply(final long lhs, final double rhs) {
    return doMultiply(NgLong.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doMultiply(final long lhs, final BigInteger rhs) {
    return doMultiply(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doMultiply(final long lhs, final BigDecimal rhs) {
    return doMultiply(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doMultiply(final float lhs, final byte rhs) {
    return doMultiply(NgFloat.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doMultiply(final float lhs, final char rhs) {
    return doMultiply(NgFloat.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doMultiply(final float lhs, final short rhs) {
    return doMultiply(NgFloat.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doMultiply(final float lhs, final int rhs) {
    return doMultiply(NgFloat.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doMultiply(final float lhs, final long rhs) {
    return doMultiply(NgFloat.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doMultiply(final float lhs, final float rhs) {
    return doMultiply(NgFloat.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doMultiply(final float lhs, final double rhs) {
    return doMultiply(NgFloat.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doMultiply(final float lhs, final BigInteger rhs) {
    return doMultiply(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doMultiply(final float lhs, final BigDecimal rhs) {
    return doMultiply(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doMultiply(final double lhs, final byte rhs) {
    return doMultiply(NgDouble.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doMultiply(final double lhs, final char rhs) {
    return doMultiply(NgDouble.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doMultiply(final double lhs, final short rhs) {
    return doMultiply(NgDouble.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doMultiply(final double lhs, final int rhs) {
    return doMultiply(NgDouble.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doMultiply(final double lhs, final long rhs) {
    return doMultiply(NgDouble.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doMultiply(final double lhs, final float rhs) {
    return doMultiply(NgDouble.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doMultiply(final double lhs, final double rhs) {
    return doMultiply(NgDouble.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doMultiply(final double lhs, final BigInteger rhs) {
    return doMultiply(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doMultiply(final double lhs, final BigDecimal rhs) {
    return doMultiply(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doMultiply(final BigInteger lhs, final byte rhs) {
    return doMultiply(lhs, NgByte.valueOf(rhs));
  }

  public Object doMultiply(final BigInteger lhs, final char rhs) {
    return doMultiply(lhs, NgChar.valueOf(rhs));
  }

  public Object doMultiply(final BigInteger lhs, final short rhs) {
    return doMultiply(lhs, NgShort.valueOf(rhs));
  }

  public Object doMultiply(final BigInteger lhs, final int rhs) {
    return doMultiply(lhs, NgInt.valueOf(rhs));
  }

  public Object doMultiply(final BigInteger lhs, final long rhs) {
    return doMultiply(lhs, NgLong.valueOf(rhs));
  }

  public Object doMultiply(final BigInteger lhs, final float rhs) {
    return doMultiply(lhs, NgFloat.valueOf(rhs));
  }

  public Object doMultiply(final BigInteger lhs, final double rhs) {
    return doMultiply(lhs, NgDouble.valueOf(rhs));
  }

  public Object doMultiply(final BigInteger lhs, final BigInteger rhs) {
    return doMultiply((Object)lhs, (Object)rhs);
  }

  public Object doMultiply(final BigInteger lhs, final BigDecimal rhs) {
    return doMultiply((Object)lhs, (Object)rhs);
  }

  public Object doMultiply(final BigDecimal lhs, final byte rhs) {
    return doMultiply(lhs, NgByte.valueOf(rhs));
  }

  public Object doMultiply(final BigDecimal lhs, final char rhs) {
    return doMultiply(lhs, NgChar.valueOf(rhs));
  }

  public Object doMultiply(final BigDecimal lhs, final short rhs) {
    return doMultiply(lhs, NgShort.valueOf(rhs));
  }

  public Object doMultiply(final BigDecimal lhs, final int rhs) {
    return doMultiply(lhs, NgInt.valueOf(rhs));
  }

  public Object doMultiply(final BigDecimal lhs, final long rhs) {
    return doMultiply(lhs, NgLong.valueOf(rhs));
  }

  public Object doMultiply(final BigDecimal lhs, final float rhs) {
    return doMultiply(lhs, NgFloat.valueOf(rhs));
  }

  public Object doMultiply(final BigDecimal lhs, final double rhs) {
    return doMultiply(lhs, NgDouble.valueOf(rhs));
  }

  public Object doMultiply(final BigDecimal lhs, final BigInteger rhs) {
    return doMultiply((Object)lhs, (Object)rhs);
  }

  public Object doMultiply(final BigDecimal lhs, final BigDecimal rhs) {
    return doMultiply((Object)lhs, (Object)rhs);
  }

  public Object doMultiply(final Object lhs, final byte rhs) {
  final Object rhsObject = NgByte.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiply(lhs, rhsObject);
  }

  public Object doMultiply(final Object lhs, final char rhs) {
  final Object rhsObject = NgChar.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiply(lhs, rhsObject);
  }

  public Object doMultiply(final Object lhs, final short rhs) {
  final Object rhsObject = NgShort.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiply(lhs, rhsObject);
  }

  public Object doMultiply(final Object lhs, final int rhs) {
  final Object rhsObject = NgInt.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiply(lhs, rhsObject);
  }

  public Object doMultiply(final Object lhs, final long rhs) {
  final Object rhsObject = NgLong.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiply(lhs, rhsObject);
  }

  public Object doMultiply(final Object lhs, final float rhs) {
  final Object rhsObject = NgFloat.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiply(lhs, rhsObject);
  }

  public Object doMultiply(final Object lhs, final double rhs) {
  final Object rhsObject = NgDouble.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiply(lhs, rhsObject);
  }

  public Object doMultiply(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiply(lhs, rhsObject);
  }

  public Object doMultiply(final Object lhs, final BigDecimal rhs) {
  final Object rhsObject = rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiply(lhs, rhsObject);
  }

  public Object doReverseMultiply(final byte lhs, final Object rhs) {
  final Object lhsObject = NgByte.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiply(lhsObject, rhs);
  }

  public Object doReverseMultiply(final char lhs, final Object rhs) {
  final Object lhsObject = NgChar.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiply(lhsObject, rhs);
  }

  public Object doReverseMultiply(final short lhs, final Object rhs) {
  final Object lhsObject = NgShort.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiply(lhsObject, rhs);
  }

  public Object doReverseMultiply(final int lhs, final Object rhs) {
  final Object lhsObject = NgInt.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiply(lhsObject, rhs);
  }

  public Object doReverseMultiply(final long lhs, final Object rhs) {
  final Object lhsObject = NgLong.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiply(lhsObject, rhs);
  }

  public Object doReverseMultiply(final float lhs, final Object rhs) {
  final Object lhsObject = NgFloat.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiply(lhsObject, rhs);
  }

  public Object doReverseMultiply(final double lhs, final Object rhs) {
  final Object lhsObject = NgDouble.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiply(lhsObject, rhs);
  }

  public Object doReverseMultiply(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiply(lhsObject, rhs);
  }

  public Object doReverseMultiply(final BigDecimal lhs, final Object rhs) {
  final Object lhsObject = lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiply(lhsObject, rhs);
  }

  //
  //   Internal methods for operator *=
  //
  //  These methods can be overidden to implement *=
  //  If the underlying object does not have the appropriate method
  //
  public Object doMultiplyEquals(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.multiplyEquals(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("multiplyEquals", rhs).call(lhs, rhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          result = NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiplyEquals(lhs, rhs);
          
          if (result == RuntimeMetaClassImpl.NOT_CALLED) {
            return doMultiply(lhs, rhs);
          }
        }
      }

      return result;
    }
    
    public Object doReverseMultiplyEquals(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.reverseMultiplyEquals(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("reverseMultiplyEquals", lhs).call(rhs, lhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          return doReverseMultiply(lhs, rhs);
        }
      }

      return result;
    }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doMultiplyEquals(final byte lhs, final byte rhs) {
    return doMultiplyEquals(NgByte.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doMultiplyEquals(final byte lhs, final char rhs) {
    return doMultiplyEquals(NgByte.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doMultiplyEquals(final byte lhs, final short rhs) {
    return doMultiplyEquals(NgByte.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doMultiplyEquals(final byte lhs, final int rhs) {
    return doMultiplyEquals(NgByte.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doMultiplyEquals(final byte lhs, final long rhs) {
    return doMultiplyEquals(NgByte.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doMultiplyEquals(final byte lhs, final float rhs) {
    return doMultiplyEquals(NgByte.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doMultiplyEquals(final byte lhs, final double rhs) {
    return doMultiplyEquals(NgByte.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doMultiplyEquals(final byte lhs, final BigInteger rhs) {
    return doMultiplyEquals(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doMultiplyEquals(final byte lhs, final BigDecimal rhs) {
    return doMultiplyEquals(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doMultiplyEquals(final char lhs, final byte rhs) {
    return doMultiplyEquals(NgChar.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doMultiplyEquals(final char lhs, final char rhs) {
    return doMultiplyEquals(NgChar.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doMultiplyEquals(final char lhs, final short rhs) {
    return doMultiplyEquals(NgChar.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doMultiplyEquals(final char lhs, final int rhs) {
    return doMultiplyEquals(NgChar.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doMultiplyEquals(final char lhs, final long rhs) {
    return doMultiplyEquals(NgChar.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doMultiplyEquals(final char lhs, final float rhs) {
    return doMultiplyEquals(NgChar.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doMultiplyEquals(final char lhs, final double rhs) {
    return doMultiplyEquals(NgChar.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doMultiplyEquals(final char lhs, final BigInteger rhs) {
    return doMultiplyEquals(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doMultiplyEquals(final char lhs, final BigDecimal rhs) {
    return doMultiplyEquals(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doMultiplyEquals(final short lhs, final byte rhs) {
    return doMultiplyEquals(NgShort.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doMultiplyEquals(final short lhs, final char rhs) {
    return doMultiplyEquals(NgShort.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doMultiplyEquals(final short lhs, final short rhs) {
    return doMultiplyEquals(NgShort.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doMultiplyEquals(final short lhs, final int rhs) {
    return doMultiplyEquals(NgShort.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doMultiplyEquals(final short lhs, final long rhs) {
    return doMultiplyEquals(NgShort.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doMultiplyEquals(final short lhs, final float rhs) {
    return doMultiplyEquals(NgShort.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doMultiplyEquals(final short lhs, final double rhs) {
    return doMultiplyEquals(NgShort.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doMultiplyEquals(final short lhs, final BigInteger rhs) {
    return doMultiplyEquals(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doMultiplyEquals(final short lhs, final BigDecimal rhs) {
    return doMultiplyEquals(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doMultiplyEquals(final int lhs, final byte rhs) {
    return doMultiplyEquals(NgInt.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doMultiplyEquals(final int lhs, final char rhs) {
    return doMultiplyEquals(NgInt.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doMultiplyEquals(final int lhs, final short rhs) {
    return doMultiplyEquals(NgInt.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doMultiplyEquals(final int lhs, final int rhs) {
    return doMultiplyEquals(NgInt.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doMultiplyEquals(final int lhs, final long rhs) {
    return doMultiplyEquals(NgInt.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doMultiplyEquals(final int lhs, final float rhs) {
    return doMultiplyEquals(NgInt.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doMultiplyEquals(final int lhs, final double rhs) {
    return doMultiplyEquals(NgInt.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doMultiplyEquals(final int lhs, final BigInteger rhs) {
    return doMultiplyEquals(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doMultiplyEquals(final int lhs, final BigDecimal rhs) {
    return doMultiplyEquals(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doMultiplyEquals(final long lhs, final byte rhs) {
    return doMultiplyEquals(NgLong.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doMultiplyEquals(final long lhs, final char rhs) {
    return doMultiplyEquals(NgLong.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doMultiplyEquals(final long lhs, final short rhs) {
    return doMultiplyEquals(NgLong.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doMultiplyEquals(final long lhs, final int rhs) {
    return doMultiplyEquals(NgLong.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doMultiplyEquals(final long lhs, final long rhs) {
    return doMultiplyEquals(NgLong.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doMultiplyEquals(final long lhs, final float rhs) {
    return doMultiplyEquals(NgLong.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doMultiplyEquals(final long lhs, final double rhs) {
    return doMultiplyEquals(NgLong.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doMultiplyEquals(final long lhs, final BigInteger rhs) {
    return doMultiplyEquals(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doMultiplyEquals(final long lhs, final BigDecimal rhs) {
    return doMultiplyEquals(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doMultiplyEquals(final float lhs, final byte rhs) {
    return doMultiplyEquals(NgFloat.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doMultiplyEquals(final float lhs, final char rhs) {
    return doMultiplyEquals(NgFloat.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doMultiplyEquals(final float lhs, final short rhs) {
    return doMultiplyEquals(NgFloat.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doMultiplyEquals(final float lhs, final int rhs) {
    return doMultiplyEquals(NgFloat.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doMultiplyEquals(final float lhs, final long rhs) {
    return doMultiplyEquals(NgFloat.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doMultiplyEquals(final float lhs, final float rhs) {
    return doMultiplyEquals(NgFloat.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doMultiplyEquals(final float lhs, final double rhs) {
    return doMultiplyEquals(NgFloat.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doMultiplyEquals(final float lhs, final BigInteger rhs) {
    return doMultiplyEquals(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doMultiplyEquals(final float lhs, final BigDecimal rhs) {
    return doMultiplyEquals(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doMultiplyEquals(final double lhs, final byte rhs) {
    return doMultiplyEquals(NgDouble.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doMultiplyEquals(final double lhs, final char rhs) {
    return doMultiplyEquals(NgDouble.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doMultiplyEquals(final double lhs, final short rhs) {
    return doMultiplyEquals(NgDouble.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doMultiplyEquals(final double lhs, final int rhs) {
    return doMultiplyEquals(NgDouble.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doMultiplyEquals(final double lhs, final long rhs) {
    return doMultiplyEquals(NgDouble.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doMultiplyEquals(final double lhs, final float rhs) {
    return doMultiplyEquals(NgDouble.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doMultiplyEquals(final double lhs, final double rhs) {
    return doMultiplyEquals(NgDouble.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doMultiplyEquals(final double lhs, final BigInteger rhs) {
    return doMultiplyEquals(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doMultiplyEquals(final double lhs, final BigDecimal rhs) {
    return doMultiplyEquals(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doMultiplyEquals(final BigInteger lhs, final byte rhs) {
    return doMultiplyEquals(lhs, NgByte.valueOf(rhs));
  }

  public Object doMultiplyEquals(final BigInteger lhs, final char rhs) {
    return doMultiplyEquals(lhs, NgChar.valueOf(rhs));
  }

  public Object doMultiplyEquals(final BigInteger lhs, final short rhs) {
    return doMultiplyEquals(lhs, NgShort.valueOf(rhs));
  }

  public Object doMultiplyEquals(final BigInteger lhs, final int rhs) {
    return doMultiplyEquals(lhs, NgInt.valueOf(rhs));
  }

  public Object doMultiplyEquals(final BigInteger lhs, final long rhs) {
    return doMultiplyEquals(lhs, NgLong.valueOf(rhs));
  }

  public Object doMultiplyEquals(final BigInteger lhs, final float rhs) {
    return doMultiplyEquals(lhs, NgFloat.valueOf(rhs));
  }

  public Object doMultiplyEquals(final BigInteger lhs, final double rhs) {
    return doMultiplyEquals(lhs, NgDouble.valueOf(rhs));
  }

  public Object doMultiplyEquals(final BigInteger lhs, final BigInteger rhs) {
    return doMultiplyEquals((Object)lhs, (Object)rhs);
  }

  public Object doMultiplyEquals(final BigInteger lhs, final BigDecimal rhs) {
    return doMultiplyEquals((Object)lhs, (Object)rhs);
  }

  public Object doMultiplyEquals(final BigDecimal lhs, final byte rhs) {
    return doMultiplyEquals(lhs, NgByte.valueOf(rhs));
  }

  public Object doMultiplyEquals(final BigDecimal lhs, final char rhs) {
    return doMultiplyEquals(lhs, NgChar.valueOf(rhs));
  }

  public Object doMultiplyEquals(final BigDecimal lhs, final short rhs) {
    return doMultiplyEquals(lhs, NgShort.valueOf(rhs));
  }

  public Object doMultiplyEquals(final BigDecimal lhs, final int rhs) {
    return doMultiplyEquals(lhs, NgInt.valueOf(rhs));
  }

  public Object doMultiplyEquals(final BigDecimal lhs, final long rhs) {
    return doMultiplyEquals(lhs, NgLong.valueOf(rhs));
  }

  public Object doMultiplyEquals(final BigDecimal lhs, final float rhs) {
    return doMultiplyEquals(lhs, NgFloat.valueOf(rhs));
  }

  public Object doMultiplyEquals(final BigDecimal lhs, final double rhs) {
    return doMultiplyEquals(lhs, NgDouble.valueOf(rhs));
  }

  public Object doMultiplyEquals(final BigDecimal lhs, final BigInteger rhs) {
    return doMultiplyEquals((Object)lhs, (Object)rhs);
  }

  public Object doMultiplyEquals(final BigDecimal lhs, final BigDecimal rhs) {
    return doMultiplyEquals((Object)lhs, (Object)rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = NgByte.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiplyEquals(lhs, rhsObject);
  }

  public Object doMultiplyEquals(final Object lhs, final char rhs) {
  final Object rhsObject = NgChar.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiplyEquals(lhs, rhsObject);
  }

  public Object doMultiplyEquals(final Object lhs, final short rhs) {
  final Object rhsObject = NgShort.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiplyEquals(lhs, rhsObject);
  }

  public Object doMultiplyEquals(final Object lhs, final int rhs) {
  final Object rhsObject = NgInt.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiplyEquals(lhs, rhsObject);
  }

  public Object doMultiplyEquals(final Object lhs, final long rhs) {
  final Object rhsObject = NgLong.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiplyEquals(lhs, rhsObject);
  }

  public Object doMultiplyEquals(final Object lhs, final float rhs) {
  final Object rhsObject = NgFloat.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiplyEquals(lhs, rhsObject);
  }

  public Object doMultiplyEquals(final Object lhs, final double rhs) {
  final Object rhsObject = NgDouble.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiplyEquals(lhs, rhsObject);
  }

  public Object doMultiplyEquals(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiplyEquals(lhs, rhsObject);
  }

  public Object doMultiplyEquals(final Object lhs, final BigDecimal rhs) {
  final Object rhsObject = rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiplyEquals(lhs, rhsObject);
  }

  public Object doReverseMultiplyEquals(final byte lhs, final Object rhs) {
  final Object lhsObject = NgByte.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiplyEquals(lhsObject, rhs);
  }

  public Object doReverseMultiplyEquals(final char lhs, final Object rhs) {
  final Object lhsObject = NgChar.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiplyEquals(lhsObject, rhs);
  }

  public Object doReverseMultiplyEquals(final short lhs, final Object rhs) {
  final Object lhsObject = NgShort.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiplyEquals(lhsObject, rhs);
  }

  public Object doReverseMultiplyEquals(final int lhs, final Object rhs) {
  final Object lhsObject = NgInt.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiplyEquals(lhsObject, rhs);
  }

  public Object doReverseMultiplyEquals(final long lhs, final Object rhs) {
  final Object lhsObject = NgLong.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiplyEquals(lhsObject, rhs);
  }

  public Object doReverseMultiplyEquals(final float lhs, final Object rhs) {
  final Object lhsObject = NgFloat.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiplyEquals(lhsObject, rhs);
  }

  public Object doReverseMultiplyEquals(final double lhs, final Object rhs) {
  final Object lhsObject = NgDouble.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiplyEquals(lhsObject, rhs);
  }

  public Object doReverseMultiplyEquals(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiplyEquals(lhsObject, rhs);
  }

  public Object doReverseMultiplyEquals(final BigDecimal lhs, final Object rhs) {
  final Object lhsObject = lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiplyEquals(lhsObject, rhs);
  }

  //
  //   Internal methods for operator /
  //
  //  These methods can be overidden to implement /
  //  If the underlying object does not have the appropriate method
  //
  public Object doDivide(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.divide(lhs, rhs);
    
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("div", rhs).call(lhs, rhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivide(lhs, rhs);
        }
      }

      return result;
    }
    
    public Object doReverseDivide(final Object lhs, final Object rhs) {
    final Object result = this.instanceHandler.reverseDivide(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        return this.instanceHandler.getMetaMethodQuick("reverseDiv", lhs).call(rhs, lhs);
      }

      return result;
    }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doDivide(final byte lhs, final byte rhs) {
    return doDivide(NgByte.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doDivide(final byte lhs, final char rhs) {
    return doDivide(NgByte.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doDivide(final byte lhs, final short rhs) {
    return doDivide(NgByte.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doDivide(final byte lhs, final int rhs) {
    return doDivide(NgByte.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doDivide(final byte lhs, final long rhs) {
    return doDivide(NgByte.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doDivide(final byte lhs, final float rhs) {
    return doDivide(NgByte.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doDivide(final byte lhs, final double rhs) {
    return doDivide(NgByte.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doDivide(final byte lhs, final BigInteger rhs) {
    return doDivide(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doDivide(final byte lhs, final BigDecimal rhs) {
    return doDivide(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doDivide(final char lhs, final byte rhs) {
    return doDivide(NgChar.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doDivide(final char lhs, final char rhs) {
    return doDivide(NgChar.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doDivide(final char lhs, final short rhs) {
    return doDivide(NgChar.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doDivide(final char lhs, final int rhs) {
    return doDivide(NgChar.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doDivide(final char lhs, final long rhs) {
    return doDivide(NgChar.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doDivide(final char lhs, final float rhs) {
    return doDivide(NgChar.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doDivide(final char lhs, final double rhs) {
    return doDivide(NgChar.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doDivide(final char lhs, final BigInteger rhs) {
    return doDivide(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doDivide(final char lhs, final BigDecimal rhs) {
    return doDivide(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doDivide(final short lhs, final byte rhs) {
    return doDivide(NgShort.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doDivide(final short lhs, final char rhs) {
    return doDivide(NgShort.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doDivide(final short lhs, final short rhs) {
    return doDivide(NgShort.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doDivide(final short lhs, final int rhs) {
    return doDivide(NgShort.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doDivide(final short lhs, final long rhs) {
    return doDivide(NgShort.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doDivide(final short lhs, final float rhs) {
    return doDivide(NgShort.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doDivide(final short lhs, final double rhs) {
    return doDivide(NgShort.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doDivide(final short lhs, final BigInteger rhs) {
    return doDivide(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doDivide(final short lhs, final BigDecimal rhs) {
    return doDivide(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doDivide(final int lhs, final byte rhs) {
    return doDivide(NgInt.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doDivide(final int lhs, final char rhs) {
    return doDivide(NgInt.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doDivide(final int lhs, final short rhs) {
    return doDivide(NgInt.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doDivide(final int lhs, final int rhs) {
    return doDivide(NgInt.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doDivide(final int lhs, final long rhs) {
    return doDivide(NgInt.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doDivide(final int lhs, final float rhs) {
    return doDivide(NgInt.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doDivide(final int lhs, final double rhs) {
    return doDivide(NgInt.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doDivide(final int lhs, final BigInteger rhs) {
    return doDivide(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doDivide(final int lhs, final BigDecimal rhs) {
    return doDivide(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doDivide(final long lhs, final byte rhs) {
    return doDivide(NgLong.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doDivide(final long lhs, final char rhs) {
    return doDivide(NgLong.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doDivide(final long lhs, final short rhs) {
    return doDivide(NgLong.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doDivide(final long lhs, final int rhs) {
    return doDivide(NgLong.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doDivide(final long lhs, final long rhs) {
    return doDivide(NgLong.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doDivide(final long lhs, final float rhs) {
    return doDivide(NgLong.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doDivide(final long lhs, final double rhs) {
    return doDivide(NgLong.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doDivide(final long lhs, final BigInteger rhs) {
    return doDivide(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doDivide(final long lhs, final BigDecimal rhs) {
    return doDivide(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doDivide(final float lhs, final byte rhs) {
    return doDivide(NgFloat.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doDivide(final float lhs, final char rhs) {
    return doDivide(NgFloat.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doDivide(final float lhs, final short rhs) {
    return doDivide(NgFloat.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doDivide(final float lhs, final int rhs) {
    return doDivide(NgFloat.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doDivide(final float lhs, final long rhs) {
    return doDivide(NgFloat.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doDivide(final float lhs, final float rhs) {
    return doDivide(NgFloat.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doDivide(final float lhs, final double rhs) {
    return doDivide(NgFloat.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doDivide(final float lhs, final BigInteger rhs) {
    return doDivide(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doDivide(final float lhs, final BigDecimal rhs) {
    return doDivide(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doDivide(final double lhs, final byte rhs) {
    return doDivide(NgDouble.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doDivide(final double lhs, final char rhs) {
    return doDivide(NgDouble.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doDivide(final double lhs, final short rhs) {
    return doDivide(NgDouble.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doDivide(final double lhs, final int rhs) {
    return doDivide(NgDouble.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doDivide(final double lhs, final long rhs) {
    return doDivide(NgDouble.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doDivide(final double lhs, final float rhs) {
    return doDivide(NgDouble.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doDivide(final double lhs, final double rhs) {
    return doDivide(NgDouble.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doDivide(final double lhs, final BigInteger rhs) {
    return doDivide(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doDivide(final double lhs, final BigDecimal rhs) {
    return doDivide(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doDivide(final BigInteger lhs, final byte rhs) {
    return doDivide(lhs, NgByte.valueOf(rhs));
  }

  public Object doDivide(final BigInteger lhs, final char rhs) {
    return doDivide(lhs, NgChar.valueOf(rhs));
  }

  public Object doDivide(final BigInteger lhs, final short rhs) {
    return doDivide(lhs, NgShort.valueOf(rhs));
  }

  public Object doDivide(final BigInteger lhs, final int rhs) {
    return doDivide(lhs, NgInt.valueOf(rhs));
  }

  public Object doDivide(final BigInteger lhs, final long rhs) {
    return doDivide(lhs, NgLong.valueOf(rhs));
  }

  public Object doDivide(final BigInteger lhs, final float rhs) {
    return doDivide(lhs, NgFloat.valueOf(rhs));
  }

  public Object doDivide(final BigInteger lhs, final double rhs) {
    return doDivide(lhs, NgDouble.valueOf(rhs));
  }

  public Object doDivide(final BigInteger lhs, final BigInteger rhs) {
    return doDivide((Object)lhs, (Object)rhs);
  }

  public Object doDivide(final BigInteger lhs, final BigDecimal rhs) {
    return doDivide((Object)lhs, (Object)rhs);
  }

  public Object doDivide(final BigDecimal lhs, final byte rhs) {
    return doDivide(lhs, NgByte.valueOf(rhs));
  }

  public Object doDivide(final BigDecimal lhs, final char rhs) {
    return doDivide(lhs, NgChar.valueOf(rhs));
  }

  public Object doDivide(final BigDecimal lhs, final short rhs) {
    return doDivide(lhs, NgShort.valueOf(rhs));
  }

  public Object doDivide(final BigDecimal lhs, final int rhs) {
    return doDivide(lhs, NgInt.valueOf(rhs));
  }

  public Object doDivide(final BigDecimal lhs, final long rhs) {
    return doDivide(lhs, NgLong.valueOf(rhs));
  }

  public Object doDivide(final BigDecimal lhs, final float rhs) {
    return doDivide(lhs, NgFloat.valueOf(rhs));
  }

  public Object doDivide(final BigDecimal lhs, final double rhs) {
    return doDivide(lhs, NgDouble.valueOf(rhs));
  }

  public Object doDivide(final BigDecimal lhs, final BigInteger rhs) {
    return doDivide((Object)lhs, (Object)rhs);
  }

  public Object doDivide(final BigDecimal lhs, final BigDecimal rhs) {
    return doDivide((Object)lhs, (Object)rhs);
  }

  public Object doDivide(final Object lhs, final byte rhs) {
  final Object rhsObject = NgByte.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivide(lhs, rhsObject);
  }

  public Object doDivide(final Object lhs, final char rhs) {
  final Object rhsObject = NgChar.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivide(lhs, rhsObject);
  }

  public Object doDivide(final Object lhs, final short rhs) {
  final Object rhsObject = NgShort.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivide(lhs, rhsObject);
  }

  public Object doDivide(final Object lhs, final int rhs) {
  final Object rhsObject = NgInt.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivide(lhs, rhsObject);
  }

  public Object doDivide(final Object lhs, final long rhs) {
  final Object rhsObject = NgLong.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivide(lhs, rhsObject);
  }

  public Object doDivide(final Object lhs, final float rhs) {
  final Object rhsObject = NgFloat.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivide(lhs, rhsObject);
  }

  public Object doDivide(final Object lhs, final double rhs) {
  final Object rhsObject = NgDouble.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivide(lhs, rhsObject);
  }

  public Object doDivide(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivide(lhs, rhsObject);
  }

  public Object doDivide(final Object lhs, final BigDecimal rhs) {
  final Object rhsObject = rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivide(lhs, rhsObject);
  }

  public Object doReverseDivide(final byte lhs, final Object rhs) {
  final Object lhsObject = NgByte.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivide(lhsObject, rhs);
  }

  public Object doReverseDivide(final char lhs, final Object rhs) {
  final Object lhsObject = NgChar.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivide(lhsObject, rhs);
  }

  public Object doReverseDivide(final short lhs, final Object rhs) {
  final Object lhsObject = NgShort.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivide(lhsObject, rhs);
  }

  public Object doReverseDivide(final int lhs, final Object rhs) {
  final Object lhsObject = NgInt.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivide(lhsObject, rhs);
  }

  public Object doReverseDivide(final long lhs, final Object rhs) {
  final Object lhsObject = NgLong.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivide(lhsObject, rhs);
  }

  public Object doReverseDivide(final float lhs, final Object rhs) {
  final Object lhsObject = NgFloat.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivide(lhsObject, rhs);
  }

  public Object doReverseDivide(final double lhs, final Object rhs) {
  final Object lhsObject = NgDouble.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivide(lhsObject, rhs);
  }

  public Object doReverseDivide(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivide(lhsObject, rhs);
  }

  public Object doReverseDivide(final BigDecimal lhs, final Object rhs) {
  final Object lhsObject = lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivide(lhsObject, rhs);
  }

  //
  //   Internal methods for operator /=
  //
  //  These methods can be overidden to implement /=
  //  If the underlying object does not have the appropriate method
  //
  public Object doDivideEquals(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.divide(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("divEquals", rhs).call(lhs, rhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          result = NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivideEquals(lhs, rhs);
          
          if (result == RuntimeMetaClassImpl.NOT_CALLED) {
            return doDivide(lhs, rhs);
          }
        }
      }

      return result;
    }
    
    public Object doReverseDivideEquals(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.reverseDivideEquals(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("reverseDivEquals", lhs).call(rhs, lhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          return doReverseDivide(lhs, rhs);
        }
      }

      return result;
    }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doDivideEquals(final byte lhs, final byte rhs) {
    return doDivideEquals(NgByte.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doDivideEquals(final byte lhs, final char rhs) {
    return doDivideEquals(NgByte.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doDivideEquals(final byte lhs, final short rhs) {
    return doDivideEquals(NgByte.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doDivideEquals(final byte lhs, final int rhs) {
    return doDivideEquals(NgByte.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doDivideEquals(final byte lhs, final long rhs) {
    return doDivideEquals(NgByte.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doDivideEquals(final byte lhs, final float rhs) {
    return doDivideEquals(NgByte.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doDivideEquals(final byte lhs, final double rhs) {
    return doDivideEquals(NgByte.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doDivideEquals(final byte lhs, final BigInteger rhs) {
    return doDivideEquals(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doDivideEquals(final byte lhs, final BigDecimal rhs) {
    return doDivideEquals(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doDivideEquals(final char lhs, final byte rhs) {
    return doDivideEquals(NgChar.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doDivideEquals(final char lhs, final char rhs) {
    return doDivideEquals(NgChar.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doDivideEquals(final char lhs, final short rhs) {
    return doDivideEquals(NgChar.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doDivideEquals(final char lhs, final int rhs) {
    return doDivideEquals(NgChar.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doDivideEquals(final char lhs, final long rhs) {
    return doDivideEquals(NgChar.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doDivideEquals(final char lhs, final float rhs) {
    return doDivideEquals(NgChar.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doDivideEquals(final char lhs, final double rhs) {
    return doDivideEquals(NgChar.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doDivideEquals(final char lhs, final BigInteger rhs) {
    return doDivideEquals(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doDivideEquals(final char lhs, final BigDecimal rhs) {
    return doDivideEquals(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doDivideEquals(final short lhs, final byte rhs) {
    return doDivideEquals(NgShort.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doDivideEquals(final short lhs, final char rhs) {
    return doDivideEquals(NgShort.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doDivideEquals(final short lhs, final short rhs) {
    return doDivideEquals(NgShort.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doDivideEquals(final short lhs, final int rhs) {
    return doDivideEquals(NgShort.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doDivideEquals(final short lhs, final long rhs) {
    return doDivideEquals(NgShort.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doDivideEquals(final short lhs, final float rhs) {
    return doDivideEquals(NgShort.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doDivideEquals(final short lhs, final double rhs) {
    return doDivideEquals(NgShort.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doDivideEquals(final short lhs, final BigInteger rhs) {
    return doDivideEquals(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doDivideEquals(final short lhs, final BigDecimal rhs) {
    return doDivideEquals(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doDivideEquals(final int lhs, final byte rhs) {
    return doDivideEquals(NgInt.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doDivideEquals(final int lhs, final char rhs) {
    return doDivideEquals(NgInt.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doDivideEquals(final int lhs, final short rhs) {
    return doDivideEquals(NgInt.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doDivideEquals(final int lhs, final int rhs) {
    return doDivideEquals(NgInt.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doDivideEquals(final int lhs, final long rhs) {
    return doDivideEquals(NgInt.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doDivideEquals(final int lhs, final float rhs) {
    return doDivideEquals(NgInt.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doDivideEquals(final int lhs, final double rhs) {
    return doDivideEquals(NgInt.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doDivideEquals(final int lhs, final BigInteger rhs) {
    return doDivideEquals(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doDivideEquals(final int lhs, final BigDecimal rhs) {
    return doDivideEquals(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doDivideEquals(final long lhs, final byte rhs) {
    return doDivideEquals(NgLong.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doDivideEquals(final long lhs, final char rhs) {
    return doDivideEquals(NgLong.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doDivideEquals(final long lhs, final short rhs) {
    return doDivideEquals(NgLong.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doDivideEquals(final long lhs, final int rhs) {
    return doDivideEquals(NgLong.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doDivideEquals(final long lhs, final long rhs) {
    return doDivideEquals(NgLong.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doDivideEquals(final long lhs, final float rhs) {
    return doDivideEquals(NgLong.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doDivideEquals(final long lhs, final double rhs) {
    return doDivideEquals(NgLong.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doDivideEquals(final long lhs, final BigInteger rhs) {
    return doDivideEquals(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doDivideEquals(final long lhs, final BigDecimal rhs) {
    return doDivideEquals(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doDivideEquals(final float lhs, final byte rhs) {
    return doDivideEquals(NgFloat.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doDivideEquals(final float lhs, final char rhs) {
    return doDivideEquals(NgFloat.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doDivideEquals(final float lhs, final short rhs) {
    return doDivideEquals(NgFloat.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doDivideEquals(final float lhs, final int rhs) {
    return doDivideEquals(NgFloat.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doDivideEquals(final float lhs, final long rhs) {
    return doDivideEquals(NgFloat.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doDivideEquals(final float lhs, final float rhs) {
    return doDivideEquals(NgFloat.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doDivideEquals(final float lhs, final double rhs) {
    return doDivideEquals(NgFloat.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doDivideEquals(final float lhs, final BigInteger rhs) {
    return doDivideEquals(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doDivideEquals(final float lhs, final BigDecimal rhs) {
    return doDivideEquals(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doDivideEquals(final double lhs, final byte rhs) {
    return doDivideEquals(NgDouble.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doDivideEquals(final double lhs, final char rhs) {
    return doDivideEquals(NgDouble.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doDivideEquals(final double lhs, final short rhs) {
    return doDivideEquals(NgDouble.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doDivideEquals(final double lhs, final int rhs) {
    return doDivideEquals(NgDouble.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doDivideEquals(final double lhs, final long rhs) {
    return doDivideEquals(NgDouble.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doDivideEquals(final double lhs, final float rhs) {
    return doDivideEquals(NgDouble.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doDivideEquals(final double lhs, final double rhs) {
    return doDivideEquals(NgDouble.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doDivideEquals(final double lhs, final BigInteger rhs) {
    return doDivideEquals(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doDivideEquals(final double lhs, final BigDecimal rhs) {
    return doDivideEquals(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doDivideEquals(final BigInteger lhs, final byte rhs) {
    return doDivideEquals(lhs, NgByte.valueOf(rhs));
  }

  public Object doDivideEquals(final BigInteger lhs, final char rhs) {
    return doDivideEquals(lhs, NgChar.valueOf(rhs));
  }

  public Object doDivideEquals(final BigInteger lhs, final short rhs) {
    return doDivideEquals(lhs, NgShort.valueOf(rhs));
  }

  public Object doDivideEquals(final BigInteger lhs, final int rhs) {
    return doDivideEquals(lhs, NgInt.valueOf(rhs));
  }

  public Object doDivideEquals(final BigInteger lhs, final long rhs) {
    return doDivideEquals(lhs, NgLong.valueOf(rhs));
  }

  public Object doDivideEquals(final BigInteger lhs, final float rhs) {
    return doDivideEquals(lhs, NgFloat.valueOf(rhs));
  }

  public Object doDivideEquals(final BigInteger lhs, final double rhs) {
    return doDivideEquals(lhs, NgDouble.valueOf(rhs));
  }

  public Object doDivideEquals(final BigInteger lhs, final BigInteger rhs) {
    return doDivideEquals((Object)lhs, (Object)rhs);
  }

  public Object doDivideEquals(final BigInteger lhs, final BigDecimal rhs) {
    return doDivideEquals((Object)lhs, (Object)rhs);
  }

  public Object doDivideEquals(final BigDecimal lhs, final byte rhs) {
    return doDivideEquals(lhs, NgByte.valueOf(rhs));
  }

  public Object doDivideEquals(final BigDecimal lhs, final char rhs) {
    return doDivideEquals(lhs, NgChar.valueOf(rhs));
  }

  public Object doDivideEquals(final BigDecimal lhs, final short rhs) {
    return doDivideEquals(lhs, NgShort.valueOf(rhs));
  }

  public Object doDivideEquals(final BigDecimal lhs, final int rhs) {
    return doDivideEquals(lhs, NgInt.valueOf(rhs));
  }

  public Object doDivideEquals(final BigDecimal lhs, final long rhs) {
    return doDivideEquals(lhs, NgLong.valueOf(rhs));
  }

  public Object doDivideEquals(final BigDecimal lhs, final float rhs) {
    return doDivideEquals(lhs, NgFloat.valueOf(rhs));
  }

  public Object doDivideEquals(final BigDecimal lhs, final double rhs) {
    return doDivideEquals(lhs, NgDouble.valueOf(rhs));
  }

  public Object doDivideEquals(final BigDecimal lhs, final BigInteger rhs) {
    return doDivideEquals((Object)lhs, (Object)rhs);
  }

  public Object doDivideEquals(final BigDecimal lhs, final BigDecimal rhs) {
    return doDivideEquals((Object)lhs, (Object)rhs);
  }

  public Object doDivideEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = NgByte.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivideEquals(lhs, rhsObject);
  }

  public Object doDivideEquals(final Object lhs, final char rhs) {
  final Object rhsObject = NgChar.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivideEquals(lhs, rhsObject);
  }

  public Object doDivideEquals(final Object lhs, final short rhs) {
  final Object rhsObject = NgShort.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivideEquals(lhs, rhsObject);
  }

  public Object doDivideEquals(final Object lhs, final int rhs) {
  final Object rhsObject = NgInt.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivideEquals(lhs, rhsObject);
  }

  public Object doDivideEquals(final Object lhs, final long rhs) {
  final Object rhsObject = NgLong.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivideEquals(lhs, rhsObject);
  }

  public Object doDivideEquals(final Object lhs, final float rhs) {
  final Object rhsObject = NgFloat.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivideEquals(lhs, rhsObject);
  }

  public Object doDivideEquals(final Object lhs, final double rhs) {
  final Object rhsObject = NgDouble.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivideEquals(lhs, rhsObject);
  }

  public Object doDivideEquals(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivideEquals(lhs, rhsObject);
  }

  public Object doDivideEquals(final Object lhs, final BigDecimal rhs) {
  final Object rhsObject = rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivideEquals(lhs, rhsObject);
  }

  public Object doReverseDivideEquals(final byte lhs, final Object rhs) {
  final Object lhsObject = NgByte.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivideEquals(lhsObject, rhs);
  }

  public Object doReverseDivideEquals(final char lhs, final Object rhs) {
  final Object lhsObject = NgChar.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivideEquals(lhsObject, rhs);
  }

  public Object doReverseDivideEquals(final short lhs, final Object rhs) {
  final Object lhsObject = NgShort.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivideEquals(lhsObject, rhs);
  }

  public Object doReverseDivideEquals(final int lhs, final Object rhs) {
  final Object lhsObject = NgInt.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivideEquals(lhsObject, rhs);
  }

  public Object doReverseDivideEquals(final long lhs, final Object rhs) {
  final Object lhsObject = NgLong.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivideEquals(lhsObject, rhs);
  }

  public Object doReverseDivideEquals(final float lhs, final Object rhs) {
  final Object lhsObject = NgFloat.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivideEquals(lhsObject, rhs);
  }

  public Object doReverseDivideEquals(final double lhs, final Object rhs) {
  final Object lhsObject = NgDouble.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivideEquals(lhsObject, rhs);
  }

  public Object doReverseDivideEquals(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivideEquals(lhsObject, rhs);
  }

  public Object doReverseDivideEquals(final BigDecimal lhs, final Object rhs) {
  final Object lhsObject = lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivideEquals(lhsObject, rhs);
  }

  //
  //   Internal methods for operator %
  //
  //  These methods can be overidden to implement %
  //  If the underlying object does not have the appropriate method
  //
  public Object doRemainder(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.remainder(lhs, rhs);
    
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("mod", rhs).call(lhs, rhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainder(lhs, rhs);
        }
      }

      return result;
    }
    
    public Object doReverseRemainder(final Object lhs, final Object rhs) {
    final Object result = this.instanceHandler.reverseRemainder(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        return this.instanceHandler.getMetaMethodQuick("reverseMod", lhs).call(rhs, lhs);
      }

      return result;
    }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doRemainder(final byte lhs, final byte rhs) {
    return doRemainder(NgByte.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doRemainder(final byte lhs, final char rhs) {
    return doRemainder(NgByte.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doRemainder(final byte lhs, final short rhs) {
    return doRemainder(NgByte.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doRemainder(final byte lhs, final int rhs) {
    return doRemainder(NgByte.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doRemainder(final byte lhs, final long rhs) {
    return doRemainder(NgByte.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doRemainder(final byte lhs, final BigInteger rhs) {
    return doRemainder(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doRemainder(final char lhs, final byte rhs) {
    return doRemainder(NgChar.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doRemainder(final char lhs, final char rhs) {
    return doRemainder(NgChar.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doRemainder(final char lhs, final short rhs) {
    return doRemainder(NgChar.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doRemainder(final char lhs, final int rhs) {
    return doRemainder(NgChar.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doRemainder(final char lhs, final long rhs) {
    return doRemainder(NgChar.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doRemainder(final char lhs, final BigInteger rhs) {
    return doRemainder(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doRemainder(final short lhs, final byte rhs) {
    return doRemainder(NgShort.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doRemainder(final short lhs, final char rhs) {
    return doRemainder(NgShort.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doRemainder(final short lhs, final short rhs) {
    return doRemainder(NgShort.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doRemainder(final short lhs, final int rhs) {
    return doRemainder(NgShort.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doRemainder(final short lhs, final long rhs) {
    return doRemainder(NgShort.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doRemainder(final short lhs, final BigInteger rhs) {
    return doRemainder(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doRemainder(final int lhs, final byte rhs) {
    return doRemainder(NgInt.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doRemainder(final int lhs, final char rhs) {
    return doRemainder(NgInt.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doRemainder(final int lhs, final short rhs) {
    return doRemainder(NgInt.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doRemainder(final int lhs, final int rhs) {
    return doRemainder(NgInt.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doRemainder(final int lhs, final long rhs) {
    return doRemainder(NgInt.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doRemainder(final int lhs, final BigInteger rhs) {
    return doRemainder(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doRemainder(final long lhs, final byte rhs) {
    return doRemainder(NgLong.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doRemainder(final long lhs, final char rhs) {
    return doRemainder(NgLong.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doRemainder(final long lhs, final short rhs) {
    return doRemainder(NgLong.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doRemainder(final long lhs, final int rhs) {
    return doRemainder(NgLong.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doRemainder(final long lhs, final long rhs) {
    return doRemainder(NgLong.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doRemainder(final long lhs, final BigInteger rhs) {
    return doRemainder(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doRemainder(final BigInteger lhs, final byte rhs) {
    return doRemainder(lhs, NgByte.valueOf(rhs));
  }

  public Object doRemainder(final BigInteger lhs, final char rhs) {
    return doRemainder(lhs, NgChar.valueOf(rhs));
  }

  public Object doRemainder(final BigInteger lhs, final short rhs) {
    return doRemainder(lhs, NgShort.valueOf(rhs));
  }

  public Object doRemainder(final BigInteger lhs, final int rhs) {
    return doRemainder(lhs, NgInt.valueOf(rhs));
  }

  public Object doRemainder(final BigInteger lhs, final long rhs) {
    return doRemainder(lhs, NgLong.valueOf(rhs));
  }

  public Object doRemainder(final BigInteger lhs, final BigInteger rhs) {
    return doRemainder((Object)lhs, (Object)rhs);
  }

  public Object doRemainder(final Object lhs, final byte rhs) {
  final Object rhsObject = NgByte.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseRemainder(lhs, rhsObject);
  }

  public Object doRemainder(final Object lhs, final char rhs) {
  final Object rhsObject = NgChar.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseRemainder(lhs, rhsObject);
  }

  public Object doRemainder(final Object lhs, final short rhs) {
  final Object rhsObject = NgShort.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseRemainder(lhs, rhsObject);
  }

  public Object doRemainder(final Object lhs, final int rhs) {
  final Object rhsObject = NgInt.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseRemainder(lhs, rhsObject);
  }

  public Object doRemainder(final Object lhs, final long rhs) {
  final Object rhsObject = NgLong.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseRemainder(lhs, rhsObject);
  }

  public Object doRemainder(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseRemainder(lhs, rhsObject);
  }

  public Object doReverseRemainder(final byte lhs, final Object rhs) {
  final Object lhsObject = NgByte.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainder(lhsObject, rhs);
  }

  public Object doReverseRemainder(final char lhs, final Object rhs) {
  final Object lhsObject = NgChar.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainder(lhsObject, rhs);
  }

  public Object doReverseRemainder(final short lhs, final Object rhs) {
  final Object lhsObject = NgShort.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainder(lhsObject, rhs);
  }

  public Object doReverseRemainder(final int lhs, final Object rhs) {
  final Object lhsObject = NgInt.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainder(lhsObject, rhs);
  }

  public Object doReverseRemainder(final long lhs, final Object rhs) {
  final Object lhsObject = NgLong.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainder(lhsObject, rhs);
  }

  public Object doReverseRemainder(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainder(lhsObject, rhs);
  }

  //
  //   Internal methods for operator %=
  //
  //  These methods can be overidden to implement %=
  //  If the underlying object does not have the appropriate method
  //
  public Object doRemainderEquals(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.remainderEquals(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("modEquals", rhs).call(lhs, rhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          result = NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainderEquals(lhs, rhs);
          
          if (result == RuntimeMetaClassImpl.NOT_CALLED) {
            return doRemainder(lhs, rhs);
          }
        }
      }

      return result;
    }
    
    public Object doReverseRemainderEquals(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.reverseRemainderEquals(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("reverseModEquals", lhs).call(rhs, lhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          return doReverseRemainder(lhs, rhs);
        }
      }

      return result;
    }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doRemainderEquals(final byte lhs, final byte rhs) {
    return doRemainderEquals(NgByte.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doRemainderEquals(final byte lhs, final char rhs) {
    return doRemainderEquals(NgByte.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doRemainderEquals(final byte lhs, final short rhs) {
    return doRemainderEquals(NgByte.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doRemainderEquals(final byte lhs, final int rhs) {
    return doRemainderEquals(NgByte.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doRemainderEquals(final byte lhs, final long rhs) {
    return doRemainderEquals(NgByte.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doRemainderEquals(final byte lhs, final BigInteger rhs) {
    return doRemainderEquals(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doRemainderEquals(final char lhs, final byte rhs) {
    return doRemainderEquals(NgChar.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doRemainderEquals(final char lhs, final char rhs) {
    return doRemainderEquals(NgChar.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doRemainderEquals(final char lhs, final short rhs) {
    return doRemainderEquals(NgChar.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doRemainderEquals(final char lhs, final int rhs) {
    return doRemainderEquals(NgChar.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doRemainderEquals(final char lhs, final long rhs) {
    return doRemainderEquals(NgChar.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doRemainderEquals(final char lhs, final BigInteger rhs) {
    return doRemainderEquals(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doRemainderEquals(final short lhs, final byte rhs) {
    return doRemainderEquals(NgShort.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doRemainderEquals(final short lhs, final char rhs) {
    return doRemainderEquals(NgShort.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doRemainderEquals(final short lhs, final short rhs) {
    return doRemainderEquals(NgShort.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doRemainderEquals(final short lhs, final int rhs) {
    return doRemainderEquals(NgShort.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doRemainderEquals(final short lhs, final long rhs) {
    return doRemainderEquals(NgShort.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doRemainderEquals(final short lhs, final BigInteger rhs) {
    return doRemainderEquals(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doRemainderEquals(final int lhs, final byte rhs) {
    return doRemainderEquals(NgInt.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doRemainderEquals(final int lhs, final char rhs) {
    return doRemainderEquals(NgInt.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doRemainderEquals(final int lhs, final short rhs) {
    return doRemainderEquals(NgInt.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doRemainderEquals(final int lhs, final int rhs) {
    return doRemainderEquals(NgInt.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doRemainderEquals(final int lhs, final long rhs) {
    return doRemainderEquals(NgInt.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doRemainderEquals(final int lhs, final BigInteger rhs) {
    return doRemainderEquals(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doRemainderEquals(final long lhs, final byte rhs) {
    return doRemainderEquals(NgLong.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doRemainderEquals(final long lhs, final char rhs) {
    return doRemainderEquals(NgLong.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doRemainderEquals(final long lhs, final short rhs) {
    return doRemainderEquals(NgLong.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doRemainderEquals(final long lhs, final int rhs) {
    return doRemainderEquals(NgLong.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doRemainderEquals(final long lhs, final long rhs) {
    return doRemainderEquals(NgLong.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doRemainderEquals(final long lhs, final BigInteger rhs) {
    return doRemainderEquals(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doRemainderEquals(final BigInteger lhs, final byte rhs) {
    return doRemainderEquals((Object)lhs, NgByte.valueOf(rhs));
  }

  public Object doRemainderEquals(final BigInteger lhs, final char rhs) {
    return doRemainderEquals((Object)lhs, NgChar.valueOf(rhs));
  }

  public Object doRemainderEquals(final BigInteger lhs, final short rhs) {
    return doRemainderEquals((Object)lhs, NgShort.valueOf(rhs));
  }

  public Object doRemainderEquals(final BigInteger lhs, final int rhs) {
    return doRemainderEquals((Object)lhs, NgInt.valueOf(rhs));
  }

  public Object doRemainderEquals(final BigInteger lhs, final long rhs) {
    return doRemainderEquals((Object)lhs, NgLong.valueOf(rhs));
  }

  public Object doRemainderEquals(final BigInteger lhs, final BigInteger rhs) {
    return doRemainderEquals((Object)lhs, (Object)rhs);
  }

  public Object doRemainderEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = NgByte.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseRemainderEquals(lhs, rhsObject);
  }

  public Object doRemainderEquals(final Object lhs, final char rhs) {
  final Object rhsObject = NgChar.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseRemainderEquals(lhs, rhsObject);
  }

  public Object doRemainderEquals(final Object lhs, final short rhs) {
  final Object rhsObject = NgShort.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseRemainderEquals(lhs, rhsObject);
  }

  public Object doRemainderEquals(final Object lhs, final int rhs) {
  final Object rhsObject = NgInt.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseRemainderEquals(lhs, rhsObject);
  }

  public Object doRemainderEquals(final Object lhs, final long rhs) {
  final Object rhsObject = NgLong.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseRemainderEquals(lhs, rhsObject);
  }

  public Object doRemainderEquals(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseRemainderEquals(lhs, rhsObject);
  }

  public Object doReverseRemainderEquals(final byte lhs, final Object rhs) {
  final Object lhsObject = NgByte.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainderEquals(lhsObject, rhs);
  }

  public Object doReverseRemainderEquals(final char lhs, final Object rhs) {
  final Object lhsObject = NgChar.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainderEquals(lhsObject, rhs);
  }

  public Object doReverseRemainderEquals(final short lhs, final Object rhs) {
  final Object lhsObject = NgShort.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainderEquals(lhsObject, rhs);
  }

  public Object doReverseRemainderEquals(final int lhs, final Object rhs) {
  final Object lhsObject = NgInt.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainderEquals(lhsObject, rhs);
  }

  public Object doReverseRemainderEquals(final long lhs, final Object rhs) {
  final Object lhsObject = NgLong.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainderEquals(lhsObject, rhs);
  }

  public Object doReverseRemainderEquals(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainderEquals(lhsObject, rhs);
  }

  //
  //   Internal methods for operator ÷
  //
  //  These methods can be overidden to implement ÷
  //  If the underlying object does not have the appropriate method
  //
  public Object doIntegerDivide(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.integerDivide(lhs, rhs);
    
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("intDiv", rhs).call(lhs, rhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivide(lhs, rhs);
        }
      }

      return result;
    }
    
    public Object doReverseIntegerDivide(final Object lhs, final Object rhs) {
    final Object result = this.instanceHandler.reverseIntegerDivide(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        return this.instanceHandler.getMetaMethodQuick("reverseIntDiv", lhs).call(rhs, lhs);
      }

      return result;
    }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doIntegerDivide(final byte lhs, final byte rhs) {
    return doIntegerDivide(NgByte.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doIntegerDivide(final byte lhs, final char rhs) {
    return doIntegerDivide(NgByte.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doIntegerDivide(final byte lhs, final short rhs) {
    return doIntegerDivide(NgByte.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doIntegerDivide(final byte lhs, final int rhs) {
    return doIntegerDivide(NgByte.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doIntegerDivide(final byte lhs, final long rhs) {
    return doIntegerDivide(NgByte.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doIntegerDivide(final byte lhs, final float rhs) {
    return doIntegerDivide(NgByte.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doIntegerDivide(final byte lhs, final double rhs) {
    return doIntegerDivide(NgByte.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doIntegerDivide(final byte lhs, final BigInteger rhs) {
    return doIntegerDivide(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doIntegerDivide(final byte lhs, final BigDecimal rhs) {
    return doIntegerDivide(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doIntegerDivide(final char lhs, final byte rhs) {
    return doIntegerDivide(NgChar.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doIntegerDivide(final char lhs, final char rhs) {
    return doIntegerDivide(NgChar.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doIntegerDivide(final char lhs, final short rhs) {
    return doIntegerDivide(NgChar.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doIntegerDivide(final char lhs, final int rhs) {
    return doIntegerDivide(NgChar.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doIntegerDivide(final char lhs, final long rhs) {
    return doIntegerDivide(NgChar.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doIntegerDivide(final char lhs, final float rhs) {
    return doIntegerDivide(NgChar.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doIntegerDivide(final char lhs, final double rhs) {
    return doIntegerDivide(NgChar.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doIntegerDivide(final char lhs, final BigInteger rhs) {
    return doIntegerDivide(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doIntegerDivide(final char lhs, final BigDecimal rhs) {
    return doIntegerDivide(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doIntegerDivide(final short lhs, final byte rhs) {
    return doIntegerDivide(NgShort.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doIntegerDivide(final short lhs, final char rhs) {
    return doIntegerDivide(NgShort.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doIntegerDivide(final short lhs, final short rhs) {
    return doIntegerDivide(NgShort.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doIntegerDivide(final short lhs, final int rhs) {
    return doIntegerDivide(NgShort.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doIntegerDivide(final short lhs, final long rhs) {
    return doIntegerDivide(NgShort.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doIntegerDivide(final short lhs, final float rhs) {
    return doIntegerDivide(NgShort.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doIntegerDivide(final short lhs, final double rhs) {
    return doIntegerDivide(NgShort.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doIntegerDivide(final short lhs, final BigInteger rhs) {
    return doIntegerDivide(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doIntegerDivide(final short lhs, final BigDecimal rhs) {
    return doIntegerDivide(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doIntegerDivide(final int lhs, final byte rhs) {
    return doIntegerDivide(NgInt.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doIntegerDivide(final int lhs, final char rhs) {
    return doIntegerDivide(NgInt.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doIntegerDivide(final int lhs, final short rhs) {
    return doIntegerDivide(NgInt.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doIntegerDivide(final int lhs, final int rhs) {
    return doIntegerDivide(NgInt.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doIntegerDivide(final int lhs, final long rhs) {
    return doIntegerDivide(NgInt.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doIntegerDivide(final int lhs, final float rhs) {
    return doIntegerDivide(NgInt.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doIntegerDivide(final int lhs, final double rhs) {
    return doIntegerDivide(NgInt.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doIntegerDivide(final int lhs, final BigInteger rhs) {
    return doIntegerDivide(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doIntegerDivide(final int lhs, final BigDecimal rhs) {
    return doIntegerDivide(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doIntegerDivide(final long lhs, final byte rhs) {
    return doIntegerDivide(NgLong.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doIntegerDivide(final long lhs, final char rhs) {
    return doIntegerDivide(NgLong.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doIntegerDivide(final long lhs, final short rhs) {
    return doIntegerDivide(NgLong.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doIntegerDivide(final long lhs, final int rhs) {
    return doIntegerDivide(NgLong.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doIntegerDivide(final long lhs, final long rhs) {
    return doIntegerDivide(NgLong.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doIntegerDivide(final long lhs, final float rhs) {
    return doIntegerDivide(NgLong.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doIntegerDivide(final long lhs, final double rhs) {
    return doIntegerDivide(NgLong.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doIntegerDivide(final long lhs, final BigInteger rhs) {
    return doIntegerDivide(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doIntegerDivide(final long lhs, final BigDecimal rhs) {
    return doIntegerDivide(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doIntegerDivide(final float lhs, final byte rhs) {
    return doIntegerDivide(NgFloat.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doIntegerDivide(final float lhs, final char rhs) {
    return doIntegerDivide(NgFloat.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doIntegerDivide(final float lhs, final short rhs) {
    return doIntegerDivide(NgFloat.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doIntegerDivide(final float lhs, final int rhs) {
    return doIntegerDivide(NgFloat.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doIntegerDivide(final float lhs, final long rhs) {
    return doIntegerDivide(NgFloat.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doIntegerDivide(final float lhs, final float rhs) {
    return doIntegerDivide(NgFloat.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doIntegerDivide(final float lhs, final double rhs) {
    return doIntegerDivide(NgFloat.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doIntegerDivide(final float lhs, final BigInteger rhs) {
    return doIntegerDivide(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doIntegerDivide(final float lhs, final BigDecimal rhs) {
    return doIntegerDivide(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doIntegerDivide(final double lhs, final byte rhs) {
    return doIntegerDivide(NgDouble.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doIntegerDivide(final double lhs, final char rhs) {
    return doIntegerDivide(NgDouble.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doIntegerDivide(final double lhs, final short rhs) {
    return doIntegerDivide(NgDouble.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doIntegerDivide(final double lhs, final int rhs) {
    return doIntegerDivide(NgDouble.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doIntegerDivide(final double lhs, final long rhs) {
    return doIntegerDivide(NgDouble.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doIntegerDivide(final double lhs, final float rhs) {
    return doIntegerDivide(NgDouble.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doIntegerDivide(final double lhs, final double rhs) {
    return doIntegerDivide(NgDouble.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doIntegerDivide(final double lhs, final BigInteger rhs) {
    return doIntegerDivide(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doIntegerDivide(final double lhs, final BigDecimal rhs) {
    return doIntegerDivide(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doIntegerDivide(final BigInteger lhs, final byte rhs) {
    return doIntegerDivide((Object)lhs, NgByte.valueOf(rhs));
  }

  public Object doIntegerDivide(final BigInteger lhs, final char rhs) {
    return doIntegerDivide((Object)lhs, NgChar.valueOf(rhs));
  }

  public Object doIntegerDivide(final BigInteger lhs, final short rhs) {
    return doIntegerDivide((Object)lhs, NgShort.valueOf(rhs));
  }

  public Object doIntegerDivide(final BigInteger lhs, final int rhs) {
    return doIntegerDivide((Object)lhs, NgInt.valueOf(rhs));
  }

  public Object doIntegerDivide(final BigInteger lhs, final long rhs) {
    return doIntegerDivide((Object)lhs, NgLong.valueOf(rhs));
  }

  public Object doIntegerDivide(final BigInteger lhs, final float rhs) {
    return doIntegerDivide((Object)lhs, NgFloat.valueOf(rhs));
  }

  public Object doIntegerDivide(final BigInteger lhs, final double rhs) {
    return doIntegerDivide((Object)lhs, NgDouble.valueOf(rhs));
  }

  public Object doIntegerDivide(final BigInteger lhs, final BigInteger rhs) {
    return doIntegerDivide((Object)lhs, (Object)rhs);
  }

  public Object doIntegerDivide(final BigInteger lhs, final BigDecimal rhs) {
    return doIntegerDivide((Object)lhs, (Object)rhs);
  }

  public Object doIntegerDivide(final BigDecimal lhs, final byte rhs) {
    return doIntegerDivide((Object)lhs, NgByte.valueOf(rhs));
  }

  public Object doIntegerDivide(final BigDecimal lhs, final char rhs) {
    return doIntegerDivide((Object)lhs, NgChar.valueOf(rhs));
  }

  public Object doIntegerDivide(final BigDecimal lhs, final short rhs) {
    return doIntegerDivide((Object)lhs, NgShort.valueOf(rhs));
  }

  public Object doIntegerDivide(final BigDecimal lhs, final int rhs) {
    return doIntegerDivide((Object)lhs, NgInt.valueOf(rhs));
  }

  public Object doIntegerDivide(final BigDecimal lhs, final long rhs) {
    return doIntegerDivide((Object)lhs, NgLong.valueOf(rhs));
  }

  public Object doIntegerDivide(final BigDecimal lhs, final float rhs) {
    return doIntegerDivide((Object)lhs, NgFloat.valueOf(rhs));
  }

  public Object doIntegerDivide(final BigDecimal lhs, final double rhs) {
    return doIntegerDivide((Object)lhs, NgDouble.valueOf(rhs));
  }

  public Object doIntegerDivide(final BigDecimal lhs, final BigInteger rhs) {
    return doIntegerDivide((Object)lhs, (Object)rhs);
  }

  public Object doIntegerDivide(final BigDecimal lhs, final BigDecimal rhs) {
    return doIntegerDivide((Object)lhs, (Object)rhs);
  }

  public Object doIntegerDivide(final Object lhs, final byte rhs) {
  final Object rhsObject = NgByte.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseIntegerDivide(lhs, rhsObject);
  }

  public Object doIntegerDivide(final Object lhs, final char rhs) {
  final Object rhsObject = NgChar.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseIntegerDivide(lhs, rhsObject);
  }

  public Object doIntegerDivide(final Object lhs, final short rhs) {
  final Object rhsObject = NgShort.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseIntegerDivide(lhs, rhsObject);
  }

  public Object doIntegerDivide(final Object lhs, final int rhs) {
  final Object rhsObject = NgInt.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseIntegerDivide(lhs, rhsObject);
  }

  public Object doIntegerDivide(final Object lhs, final long rhs) {
  final Object rhsObject = NgLong.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseIntegerDivide(lhs, rhsObject);
  }

  public Object doIntegerDivide(final Object lhs, final float rhs) {
  final Object rhsObject = NgFloat.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseIntegerDivide(lhs, rhsObject);
  }

  public Object doIntegerDivide(final Object lhs, final double rhs) {
  final Object rhsObject = NgDouble.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseIntegerDivide(lhs, rhsObject);
  }

  public Object doIntegerDivide(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseIntegerDivide(lhs, rhsObject);
  }

  public Object doIntegerDivide(final Object lhs, final BigDecimal rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseIntegerDivide(lhs, rhsObject);
  }

  public Object doReverseIntegerDivide(final byte lhs, final Object rhs) {
  final Object lhsObject = NgByte.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivide(lhsObject, rhs);
  }

  public Object doReverseIntegerDivide(final char lhs, final Object rhs) {
  final Object lhsObject = NgChar.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivide(lhsObject, rhs);
  }

  public Object doReverseIntegerDivide(final short lhs, final Object rhs) {
  final Object lhsObject = NgShort.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivide(lhsObject, rhs);
  }

  public Object doReverseIntegerDivide(final int lhs, final Object rhs) {
  final Object lhsObject = NgInt.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivide(lhsObject, rhs);
  }

  public Object doReverseIntegerDivide(final long lhs, final Object rhs) {
  final Object lhsObject = NgLong.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivide(lhsObject, rhs);
  }

  public Object doReverseIntegerDivide(final float lhs, final Object rhs) {
  final Object lhsObject = NgFloat.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivide(lhsObject, rhs);
  }

  public Object doReverseIntegerDivide(final double lhs, final Object rhs) {
  final Object lhsObject = NgDouble.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivide(lhsObject, rhs);
  }

  public Object doReverseIntegerDivide(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivide(lhsObject, rhs);
  }

  public Object doReverseIntegerDivide(final BigDecimal lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivide(lhsObject, rhs);
  }

  //
  //   Internal methods for operator ÷=
  //
  //  These methods can be overidden to implement ÷=
  //  If the underlying object does not have the appropriate method
  //
  public Object doIntegerDivideEquals(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.integerDivideEquals(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("intdivEquals", rhs).call(lhs, rhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          result = NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivideEquals(lhs, rhs);
          
          if (result == RuntimeMetaClassImpl.NOT_CALLED) {
            return doIntegerDivide(lhs, rhs);
          }
        }
      }

      return result;
    }
    
    public Object doReverseIntegerDivideEquals(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.reverseIntegerDivideEquals(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("reverseIntDivEquals", lhs).call(rhs, lhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          return doReverseIntegerDivide(lhs, rhs);
        }
      }

      return result;
    }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doIntegerDivideEquals(final byte lhs, final byte rhs) {
    return doIntegerDivideEquals(NgByte.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final byte lhs, final char rhs) {
    return doIntegerDivideEquals(NgByte.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final byte lhs, final short rhs) {
    return doIntegerDivideEquals(NgByte.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final byte lhs, final int rhs) {
    return doIntegerDivideEquals(NgByte.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final byte lhs, final long rhs) {
    return doIntegerDivideEquals(NgByte.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final byte lhs, final float rhs) {
    return doIntegerDivideEquals(NgByte.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final byte lhs, final double rhs) {
    return doIntegerDivideEquals(NgByte.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final byte lhs, final BigInteger rhs) {
    return doIntegerDivideEquals(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doIntegerDivideEquals(final byte lhs, final BigDecimal rhs) {
    return doIntegerDivideEquals(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doIntegerDivideEquals(final char lhs, final byte rhs) {
    return doIntegerDivideEquals(NgChar.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final char lhs, final char rhs) {
    return doIntegerDivideEquals(NgChar.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final char lhs, final short rhs) {
    return doIntegerDivideEquals(NgChar.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final char lhs, final int rhs) {
    return doIntegerDivideEquals(NgChar.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final char lhs, final long rhs) {
    return doIntegerDivideEquals(NgChar.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final char lhs, final float rhs) {
    return doIntegerDivideEquals(NgChar.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final char lhs, final double rhs) {
    return doIntegerDivideEquals(NgChar.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final char lhs, final BigInteger rhs) {
    return doIntegerDivideEquals(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doIntegerDivideEquals(final char lhs, final BigDecimal rhs) {
    return doIntegerDivideEquals(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doIntegerDivideEquals(final short lhs, final byte rhs) {
    return doIntegerDivideEquals(NgShort.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final short lhs, final char rhs) {
    return doIntegerDivideEquals(NgShort.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final short lhs, final short rhs) {
    return doIntegerDivideEquals(NgShort.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final short lhs, final int rhs) {
    return doIntegerDivideEquals(NgShort.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final short lhs, final long rhs) {
    return doIntegerDivideEquals(NgShort.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final short lhs, final float rhs) {
    return doIntegerDivideEquals(NgShort.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final short lhs, final double rhs) {
    return doIntegerDivideEquals(NgShort.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final short lhs, final BigInteger rhs) {
    return doIntegerDivideEquals(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doIntegerDivideEquals(final short lhs, final BigDecimal rhs) {
    return doIntegerDivideEquals(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doIntegerDivideEquals(final int lhs, final byte rhs) {
    return doIntegerDivideEquals(NgInt.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final int lhs, final char rhs) {
    return doIntegerDivideEquals(NgInt.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final int lhs, final short rhs) {
    return doIntegerDivideEquals(NgInt.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final int lhs, final int rhs) {
    return doIntegerDivideEquals(NgInt.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final int lhs, final long rhs) {
    return doIntegerDivideEquals(NgInt.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final int lhs, final float rhs) {
    return doIntegerDivideEquals(NgInt.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final int lhs, final double rhs) {
    return doIntegerDivideEquals(NgInt.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final int lhs, final BigInteger rhs) {
    return doIntegerDivideEquals(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doIntegerDivideEquals(final int lhs, final BigDecimal rhs) {
    return doIntegerDivideEquals(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doIntegerDivideEquals(final long lhs, final byte rhs) {
    return doIntegerDivideEquals(NgLong.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final long lhs, final char rhs) {
    return doIntegerDivideEquals(NgLong.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final long lhs, final short rhs) {
    return doIntegerDivideEquals(NgLong.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final long lhs, final int rhs) {
    return doIntegerDivideEquals(NgLong.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final long lhs, final long rhs) {
    return doIntegerDivideEquals(NgLong.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final long lhs, final float rhs) {
    return doIntegerDivideEquals(NgLong.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final long lhs, final double rhs) {
    return doIntegerDivideEquals(NgLong.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final long lhs, final BigInteger rhs) {
    return doIntegerDivideEquals(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doIntegerDivideEquals(final long lhs, final BigDecimal rhs) {
    return doIntegerDivideEquals(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doIntegerDivideEquals(final float lhs, final byte rhs) {
    return doIntegerDivideEquals(NgFloat.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final float lhs, final char rhs) {
    return doIntegerDivideEquals(NgFloat.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final float lhs, final short rhs) {
    return doIntegerDivideEquals(NgFloat.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final float lhs, final int rhs) {
    return doIntegerDivideEquals(NgFloat.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final float lhs, final long rhs) {
    return doIntegerDivideEquals(NgFloat.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final float lhs, final float rhs) {
    return doIntegerDivideEquals(NgFloat.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final float lhs, final double rhs) {
    return doIntegerDivideEquals(NgFloat.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final float lhs, final BigInteger rhs) {
    return doIntegerDivideEquals(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doIntegerDivideEquals(final float lhs, final BigDecimal rhs) {
    return doIntegerDivideEquals(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doIntegerDivideEquals(final double lhs, final byte rhs) {
    return doIntegerDivideEquals(NgDouble.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final double lhs, final char rhs) {
    return doIntegerDivideEquals(NgDouble.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final double lhs, final short rhs) {
    return doIntegerDivideEquals(NgDouble.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final double lhs, final int rhs) {
    return doIntegerDivideEquals(NgDouble.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final double lhs, final long rhs) {
    return doIntegerDivideEquals(NgDouble.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final double lhs, final float rhs) {
    return doIntegerDivideEquals(NgDouble.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final double lhs, final double rhs) {
    return doIntegerDivideEquals(NgDouble.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final double lhs, final BigInteger rhs) {
    return doIntegerDivideEquals(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doIntegerDivideEquals(final double lhs, final BigDecimal rhs) {
    return doIntegerDivideEquals(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doIntegerDivideEquals(final BigInteger lhs, final byte rhs) {
    return doIntegerDivideEquals((Object)lhs, NgByte.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final BigInteger lhs, final char rhs) {
    return doIntegerDivideEquals((Object)lhs, NgChar.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final BigInteger lhs, final short rhs) {
    return doIntegerDivideEquals((Object)lhs, NgShort.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final BigInteger lhs, final int rhs) {
    return doIntegerDivideEquals((Object)lhs, NgInt.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final BigInteger lhs, final long rhs) {
    return doIntegerDivideEquals((Object)lhs, NgLong.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final BigInteger lhs, final float rhs) {
    return doIntegerDivideEquals((Object)lhs, NgFloat.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final BigInteger lhs, final double rhs) {
    return doIntegerDivideEquals((Object)lhs, NgDouble.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final BigInteger lhs, final BigInteger rhs) {
    return doIntegerDivideEquals((Object)lhs, (Object)rhs);
  }

  public Object doIntegerDivideEquals(final BigInteger lhs, final BigDecimal rhs) {
    return doIntegerDivideEquals((Object)lhs, (Object)rhs);
  }

  public Object doIntegerDivideEquals(final BigDecimal lhs, final byte rhs) {
    return doIntegerDivideEquals((Object)lhs, NgByte.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final BigDecimal lhs, final char rhs) {
    return doIntegerDivideEquals((Object)lhs, NgChar.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final BigDecimal lhs, final short rhs) {
    return doIntegerDivideEquals((Object)lhs, NgShort.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final BigDecimal lhs, final int rhs) {
    return doIntegerDivideEquals((Object)lhs, NgInt.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final BigDecimal lhs, final long rhs) {
    return doIntegerDivideEquals((Object)lhs, NgLong.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final BigDecimal lhs, final float rhs) {
    return doIntegerDivideEquals((Object)lhs, NgFloat.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final BigDecimal lhs, final double rhs) {
    return doIntegerDivideEquals((Object)lhs, NgDouble.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final BigDecimal lhs, final BigInteger rhs) {
    return doIntegerDivideEquals((Object)lhs, (Object)rhs);
  }

  public Object doIntegerDivideEquals(final BigDecimal lhs, final BigDecimal rhs) {
    return doIntegerDivideEquals((Object)lhs, (Object)rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = NgByte.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseIntegerDivideEquals(lhs, rhsObject);
  }

  public Object doIntegerDivideEquals(final Object lhs, final char rhs) {
  final Object rhsObject = NgChar.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseIntegerDivideEquals(lhs, rhsObject);
  }

  public Object doIntegerDivideEquals(final Object lhs, final short rhs) {
  final Object rhsObject = NgShort.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseIntegerDivideEquals(lhs, rhsObject);
  }

  public Object doIntegerDivideEquals(final Object lhs, final int rhs) {
  final Object rhsObject = NgInt.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseIntegerDivideEquals(lhs, rhsObject);
  }

  public Object doIntegerDivideEquals(final Object lhs, final long rhs) {
  final Object rhsObject = NgLong.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseIntegerDivideEquals(lhs, rhsObject);
  }

  public Object doIntegerDivideEquals(final Object lhs, final float rhs) {
  final Object rhsObject = NgFloat.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseIntegerDivideEquals(lhs, rhsObject);
  }

  public Object doIntegerDivideEquals(final Object lhs, final double rhs) {
  final Object rhsObject = NgDouble.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseIntegerDivideEquals(lhs, rhsObject);
  }

  public Object doIntegerDivideEquals(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseIntegerDivideEquals(lhs, rhsObject);
  }

  public Object doIntegerDivideEquals(final Object lhs, final BigDecimal rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseIntegerDivideEquals(lhs, rhsObject);
  }

  public Object doReverseIntegerDivideEquals(final byte lhs, final Object rhs) {
  final Object lhsObject = NgByte.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivideEquals(lhsObject, rhs);
  }

  public Object doReverseIntegerDivideEquals(final char lhs, final Object rhs) {
  final Object lhsObject = NgChar.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivideEquals(lhsObject, rhs);
  }

  public Object doReverseIntegerDivideEquals(final short lhs, final Object rhs) {
  final Object lhsObject = NgShort.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivideEquals(lhsObject, rhs);
  }

  public Object doReverseIntegerDivideEquals(final int lhs, final Object rhs) {
  final Object lhsObject = NgInt.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivideEquals(lhsObject, rhs);
  }

  public Object doReverseIntegerDivideEquals(final long lhs, final Object rhs) {
  final Object lhsObject = NgLong.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivideEquals(lhsObject, rhs);
  }

  public Object doReverseIntegerDivideEquals(final float lhs, final Object rhs) {
  final Object lhsObject = NgFloat.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivideEquals(lhsObject, rhs);
  }

  public Object doReverseIntegerDivideEquals(final double lhs, final Object rhs) {
  final Object lhsObject = NgDouble.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivideEquals(lhsObject, rhs);
  }

  public Object doReverseIntegerDivideEquals(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivideEquals(lhsObject, rhs);
  }

  public Object doReverseIntegerDivideEquals(final BigDecimal lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivideEquals(lhsObject, rhs);
  }

  //
  //   Internal methods for operator &
  //
  //  These methods can be overidden to implement &
  //  If the underlying object does not have the appropriate method
  //
  public Object doAnd(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.and(lhs, rhs);
    
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("and", rhs).call(lhs, rhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAnd(lhs, rhs);
        }
      }

      return result;
    }
    
    public Object doReverseAnd(final Object lhs, final Object rhs) {
    final Object result = this.instanceHandler.reverseAnd(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        return this.instanceHandler.getMetaMethodQuick("reverseAnd", lhs).call(rhs, lhs);
      }

      return result;
    }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doAnd(final byte lhs, final byte rhs) {
    return doAnd(NgByte.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doAnd(final byte lhs, final char rhs) {
    return doAnd(NgByte.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doAnd(final byte lhs, final short rhs) {
    return doAnd(NgByte.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doAnd(final byte lhs, final int rhs) {
    return doAnd(NgByte.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doAnd(final byte lhs, final long rhs) {
    return doAnd(NgByte.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doAnd(final byte lhs, final BigInteger rhs) {
    return doAnd(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doAnd(final char lhs, final byte rhs) {
    return doAnd(NgChar.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doAnd(final char lhs, final char rhs) {
    return doAnd(NgChar.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doAnd(final char lhs, final short rhs) {
    return doAnd(NgChar.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doAnd(final char lhs, final int rhs) {
    return doAnd(NgChar.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doAnd(final char lhs, final long rhs) {
    return doAnd(NgChar.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doAnd(final char lhs, final BigInteger rhs) {
    return doAnd(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doAnd(final short lhs, final byte rhs) {
    return doAnd(NgShort.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doAnd(final short lhs, final char rhs) {
    return doAnd(NgShort.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doAnd(final short lhs, final short rhs) {
    return doAnd(NgShort.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doAnd(final short lhs, final int rhs) {
    return doAnd(NgShort.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doAnd(final short lhs, final long rhs) {
    return doAnd(NgShort.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doAnd(final short lhs, final BigInteger rhs) {
    return doAnd(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doAnd(final int lhs, final byte rhs) {
    return doAnd(NgInt.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doAnd(final int lhs, final char rhs) {
    return doAnd(NgInt.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doAnd(final int lhs, final short rhs) {
    return doAnd(NgInt.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doAnd(final int lhs, final int rhs) {
    return doAnd(NgInt.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doAnd(final int lhs, final long rhs) {
    return doAnd(NgInt.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doAnd(final int lhs, final BigInteger rhs) {
    return doAnd(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doAnd(final long lhs, final byte rhs) {
    return doAnd(NgLong.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doAnd(final long lhs, final char rhs) {
    return doAnd(NgLong.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doAnd(final long lhs, final short rhs) {
    return doAnd(NgLong.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doAnd(final long lhs, final int rhs) {
    return doAnd(NgLong.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doAnd(final long lhs, final long rhs) {
    return doAnd(NgLong.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doAnd(final long lhs, final BigInteger rhs) {
    return doAnd(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doAnd(final BigInteger lhs, final byte rhs) {
    return doAnd((Object)lhs, NgByte.valueOf(rhs));
  }

  public Object doAnd(final BigInteger lhs, final char rhs) {
    return doAnd((Object)lhs, NgChar.valueOf(rhs));
  }

  public Object doAnd(final BigInteger lhs, final short rhs) {
    return doAnd((Object)lhs, NgShort.valueOf(rhs));
  }

  public Object doAnd(final BigInteger lhs, final int rhs) {
    return doAnd((Object)lhs, NgInt.valueOf(rhs));
  }

  public Object doAnd(final BigInteger lhs, final long rhs) {
    return doAnd((Object)lhs, NgLong.valueOf(rhs));
  }

  public Object doAnd(final BigInteger lhs, final BigInteger rhs) {
    return doAnd((Object)lhs, (Object)rhs);
  }

  public Object doAnd(final Object lhs, final byte rhs) {
  final Object rhsObject = NgByte.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAnd(lhs, rhsObject);
  }

  public Object doAnd(final Object lhs, final char rhs) {
  final Object rhsObject = NgChar.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAnd(lhs, rhsObject);
  }

  public Object doAnd(final Object lhs, final short rhs) {
  final Object rhsObject = NgShort.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAnd(lhs, rhsObject);
  }

  public Object doAnd(final Object lhs, final int rhs) {
  final Object rhsObject = NgInt.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAnd(lhs, rhsObject);
  }

  public Object doAnd(final Object lhs, final long rhs) {
  final Object rhsObject = NgLong.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAnd(lhs, rhsObject);
  }

  public Object doAnd(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAnd(lhs, rhsObject);
  }

  public Object doReverseAnd(final byte lhs, final Object rhs) {
  final Object lhsObject = NgByte.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAnd(lhsObject, rhs);
  }

  public Object doReverseAnd(final char lhs, final Object rhs) {
  final Object lhsObject = NgChar.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAnd(lhsObject, rhs);
  }

  public Object doReverseAnd(final short lhs, final Object rhs) {
  final Object lhsObject = NgShort.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAnd(lhsObject, rhs);
  }

  public Object doReverseAnd(final int lhs, final Object rhs) {
  final Object lhsObject = NgInt.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAnd(lhsObject, rhs);
  }

  public Object doReverseAnd(final long lhs, final Object rhs) {
  final Object lhsObject = NgLong.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAnd(lhsObject, rhs);
  }

  public Object doReverseAnd(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAnd(lhsObject, rhs);
  }

  //
  //   Internal methods for operator &=
  //
  //  These methods can be overidden to implement &=
  //  If the underlying object does not have the appropriate method
  //
  public Object doAndEquals(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.andEquals(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("andEquals", rhs).call(lhs, rhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          result = NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAndEquals(lhs, rhs);
          
          if (result == RuntimeMetaClassImpl.NOT_CALLED) {
            return doAnd(lhs, rhs);
          }
        }
      }

      return result;
    }
    
    public Object doReverseAndEquals(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.reverseAndEquals(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("reverseAndEquals", lhs).call(rhs, lhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          return doReverseAnd(lhs, rhs);
        }
      }

      return result;
    }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doAndEquals(final byte lhs, final byte rhs) {
    return doAndEquals(NgByte.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doAndEquals(final byte lhs, final char rhs) {
    return doAndEquals(NgByte.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doAndEquals(final byte lhs, final short rhs) {
    return doAndEquals(NgByte.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doAndEquals(final byte lhs, final int rhs) {
    return doAndEquals(NgByte.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doAndEquals(final byte lhs, final long rhs) {
    return doAndEquals(NgByte.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doAndEquals(final byte lhs, final BigInteger rhs) {
    return doAndEquals(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doAndEquals(final char lhs, final byte rhs) {
    return doAndEquals(NgChar.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doAndEquals(final char lhs, final char rhs) {
    return doAndEquals(NgChar.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doAndEquals(final char lhs, final short rhs) {
    return doAndEquals(NgChar.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doAndEquals(final char lhs, final int rhs) {
    return doAndEquals(NgChar.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doAndEquals(final char lhs, final long rhs) {
    return doAndEquals(NgChar.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doAndEquals(final char lhs, final BigInteger rhs) {
    return doAndEquals(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doAndEquals(final short lhs, final byte rhs) {
    return doAndEquals(NgShort.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doAndEquals(final short lhs, final char rhs) {
    return doAndEquals(NgShort.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doAndEquals(final short lhs, final short rhs) {
    return doAndEquals(NgShort.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doAndEquals(final short lhs, final int rhs) {
    return doAndEquals(NgShort.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doAndEquals(final short lhs, final long rhs) {
    return doAndEquals(NgShort.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doAndEquals(final short lhs, final BigInteger rhs) {
    return doAndEquals(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doAndEquals(final int lhs, final byte rhs) {
    return doAndEquals(NgInt.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doAndEquals(final int lhs, final char rhs) {
    return doAndEquals(NgInt.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doAndEquals(final int lhs, final short rhs) {
    return doAndEquals(NgInt.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doAndEquals(final int lhs, final int rhs) {
    return doAndEquals(NgInt.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doAndEquals(final int lhs, final long rhs) {
    return doAndEquals(NgInt.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doAndEquals(final int lhs, final BigInteger rhs) {
    return doAndEquals(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doAndEquals(final long lhs, final byte rhs) {
    return doAndEquals(NgLong.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doAndEquals(final long lhs, final char rhs) {
    return doAndEquals(NgLong.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doAndEquals(final long lhs, final short rhs) {
    return doAndEquals(NgLong.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doAndEquals(final long lhs, final int rhs) {
    return doAndEquals(NgLong.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doAndEquals(final long lhs, final long rhs) {
    return doAndEquals(NgLong.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doAndEquals(final long lhs, final BigInteger rhs) {
    return doAndEquals(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doAndEquals(final BigInteger lhs, final byte rhs) {
    return doAndEquals((Object)lhs, NgByte.valueOf(rhs));
  }

  public Object doAndEquals(final BigInteger lhs, final char rhs) {
    return doAndEquals((Object)lhs, NgChar.valueOf(rhs));
  }

  public Object doAndEquals(final BigInteger lhs, final short rhs) {
    return doAndEquals((Object)lhs, NgShort.valueOf(rhs));
  }

  public Object doAndEquals(final BigInteger lhs, final int rhs) {
    return doAndEquals((Object)lhs, NgInt.valueOf(rhs));
  }

  public Object doAndEquals(final BigInteger lhs, final long rhs) {
    return doAndEquals((Object)lhs, NgLong.valueOf(rhs));
  }

  public Object doAndEquals(final BigInteger lhs, final BigInteger rhs) {
    return doAndEquals((Object)lhs, (Object)rhs);
  }

  public Object doAndEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = NgByte.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAndEquals(lhs, rhsObject);
  }

  public Object doAndEquals(final Object lhs, final char rhs) {
  final Object rhsObject = NgChar.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAndEquals(lhs, rhsObject);
  }

  public Object doAndEquals(final Object lhs, final short rhs) {
  final Object rhsObject = NgShort.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAndEquals(lhs, rhsObject);
  }

  public Object doAndEquals(final Object lhs, final int rhs) {
  final Object rhsObject = NgInt.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAndEquals(lhs, rhsObject);
  }

  public Object doAndEquals(final Object lhs, final long rhs) {
  final Object rhsObject = NgLong.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAndEquals(lhs, rhsObject);
  }

  public Object doAndEquals(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAndEquals(lhs, rhsObject);
  }

  public Object doReverseAndEquals(final byte lhs, final Object rhs) {
  final Object lhsObject = NgByte.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAndEquals(lhsObject, rhs);
  }

  public Object doReverseAndEquals(final char lhs, final Object rhs) {
  final Object lhsObject = NgChar.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAndEquals(lhsObject, rhs);
  }

  public Object doReverseAndEquals(final short lhs, final Object rhs) {
  final Object lhsObject = NgShort.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAndEquals(lhsObject, rhs);
  }

  public Object doReverseAndEquals(final int lhs, final Object rhs) {
  final Object lhsObject = NgInt.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAndEquals(lhsObject, rhs);
  }

  public Object doReverseAndEquals(final long lhs, final Object rhs) {
  final Object lhsObject = NgLong.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAndEquals(lhsObject, rhs);
  }

  public Object doReverseAndEquals(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAndEquals(lhsObject, rhs);
  }

  //
  //   Internal methods for operator |
  //
  //  These methods can be overidden to implement |
  //  If the underlying object does not have the appropriate method
  //
  public Object doOr(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.or(lhs, rhs);
    
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("or", rhs).call(lhs, rhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOr(lhs, rhs);
        }
      }

      return result;
    }
    
    public Object doReverseOr(final Object lhs, final Object rhs) {
    final Object result = this.instanceHandler.reverseOr(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        return this.instanceHandler.getMetaMethodQuick("reverseOr", lhs).call(rhs, lhs);
      }

      return result;
    }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doOr(final byte lhs, final byte rhs) {
    return doOr(NgByte.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doOr(final byte lhs, final char rhs) {
    return doOr(NgByte.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doOr(final byte lhs, final short rhs) {
    return doOr(NgByte.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doOr(final byte lhs, final int rhs) {
    return doOr(NgByte.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doOr(final byte lhs, final long rhs) {
    return doOr(NgByte.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doOr(final byte lhs, final BigInteger rhs) {
    return doOr(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doOr(final char lhs, final byte rhs) {
    return doOr(NgChar.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doOr(final char lhs, final char rhs) {
    return doOr(NgChar.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doOr(final char lhs, final short rhs) {
    return doOr(NgChar.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doOr(final char lhs, final int rhs) {
    return doOr(NgChar.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doOr(final char lhs, final long rhs) {
    return doOr(NgChar.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doOr(final char lhs, final BigInteger rhs) {
    return doOr(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doOr(final short lhs, final byte rhs) {
    return doOr(NgShort.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doOr(final short lhs, final char rhs) {
    return doOr(NgShort.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doOr(final short lhs, final short rhs) {
    return doOr(NgShort.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doOr(final short lhs, final int rhs) {
    return doOr(NgShort.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doOr(final short lhs, final long rhs) {
    return doOr(NgShort.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doOr(final short lhs, final BigInteger rhs) {
    return doOr(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doOr(final int lhs, final byte rhs) {
    return doOr(NgInt.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doOr(final int lhs, final char rhs) {
    return doOr(NgInt.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doOr(final int lhs, final short rhs) {
    return doOr(NgInt.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doOr(final int lhs, final int rhs) {
    return doOr(NgInt.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doOr(final int lhs, final long rhs) {
    return doOr(NgInt.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doOr(final int lhs, final BigInteger rhs) {
    return doOr(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doOr(final long lhs, final byte rhs) {
    return doOr(NgLong.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doOr(final long lhs, final char rhs) {
    return doOr(NgLong.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doOr(final long lhs, final short rhs) {
    return doOr(NgLong.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doOr(final long lhs, final int rhs) {
    return doOr(NgLong.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doOr(final long lhs, final long rhs) {
    return doOr(NgLong.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doOr(final long lhs, final BigInteger rhs) {
    return doOr(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doOr(final BigInteger lhs, final byte rhs) {
    return doOr((Object)lhs, NgByte.valueOf(rhs));
  }

  public Object doOr(final BigInteger lhs, final char rhs) {
    return doOr((Object)lhs, NgChar.valueOf(rhs));
  }

  public Object doOr(final BigInteger lhs, final short rhs) {
    return doOr((Object)lhs, NgShort.valueOf(rhs));
  }

  public Object doOr(final BigInteger lhs, final int rhs) {
    return doOr((Object)lhs, NgInt.valueOf(rhs));
  }

  public Object doOr(final BigInteger lhs, final long rhs) {
    return doOr((Object)lhs, NgLong.valueOf(rhs));
  }

  public Object doOr(final BigInteger lhs, final BigInteger rhs) {
    return doOr((Object)lhs, (Object)rhs);
  }

  public Object doOr(final Object lhs, final byte rhs) {
  final Object rhsObject = NgByte.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseOr(lhs, rhsObject);
  }

  public Object doOr(final Object lhs, final char rhs) {
  final Object rhsObject = NgChar.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseOr(lhs, rhsObject);
  }

  public Object doOr(final Object lhs, final short rhs) {
  final Object rhsObject = NgShort.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseOr(lhs, rhsObject);
  }

  public Object doOr(final Object lhs, final int rhs) {
  final Object rhsObject = NgInt.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseOr(lhs, rhsObject);
  }

  public Object doOr(final Object lhs, final long rhs) {
  final Object rhsObject = NgLong.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseOr(lhs, rhsObject);
  }

  public Object doOr(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseOr(lhs, rhsObject);
  }

  public Object doReverseOr(final byte lhs, final Object rhs) {
  final Object lhsObject = NgByte.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOr(lhsObject, rhs);
  }

  public Object doReverseOr(final char lhs, final Object rhs) {
  final Object lhsObject = NgChar.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOr(lhsObject, rhs);
  }

  public Object doReverseOr(final short lhs, final Object rhs) {
  final Object lhsObject = NgShort.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOr(lhsObject, rhs);
  }

  public Object doReverseOr(final int lhs, final Object rhs) {
  final Object lhsObject = NgInt.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOr(lhsObject, rhs);
  }

  public Object doReverseOr(final long lhs, final Object rhs) {
  final Object lhsObject = NgLong.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOr(lhsObject, rhs);
  }

  public Object doReverseOr(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOr(lhsObject, rhs);
  }

  //
  //   Internal methods for operator |=
  //
  //  These methods can be overidden to implement |=
  //  If the underlying object does not have the appropriate method
  //
  public Object doOrEquals(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.orEquals(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("orEquals", rhs).call(lhs, rhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          result = NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOrEquals(lhs, rhs);
          
          if (result == RuntimeMetaClassImpl.NOT_CALLED) {
            return doOr(lhs, rhs);
          }
        }
      }

      return result;
    }
    
    public Object doReverseOrEquals(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.reverseOrEquals(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("reverseOrEquals", lhs).call(rhs, lhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          return doReverseOr(lhs, rhs);
        }
      }

      return result;
    }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doOrEquals(final byte lhs, final byte rhs) {
    return doOrEquals(NgByte.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doOrEquals(final byte lhs, final char rhs) {
    return doOrEquals(NgByte.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doOrEquals(final byte lhs, final short rhs) {
    return doOrEquals(NgByte.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doOrEquals(final byte lhs, final int rhs) {
    return doOrEquals(NgByte.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doOrEquals(final byte lhs, final long rhs) {
    return doOrEquals(NgByte.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doOrEquals(final byte lhs, final BigInteger rhs) {
    return doOrEquals(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doOrEquals(final char lhs, final byte rhs) {
    return doOrEquals(NgChar.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doOrEquals(final char lhs, final char rhs) {
    return doOrEquals(NgChar.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doOrEquals(final char lhs, final short rhs) {
    return doOrEquals(NgChar.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doOrEquals(final char lhs, final int rhs) {
    return doOrEquals(NgChar.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doOrEquals(final char lhs, final long rhs) {
    return doOrEquals(NgChar.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doOrEquals(final char lhs, final BigInteger rhs) {
    return doOrEquals(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doOrEquals(final short lhs, final byte rhs) {
    return doOrEquals(NgShort.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doOrEquals(final short lhs, final char rhs) {
    return doOrEquals(NgShort.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doOrEquals(final short lhs, final short rhs) {
    return doOrEquals(NgShort.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doOrEquals(final short lhs, final int rhs) {
    return doOrEquals(NgShort.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doOrEquals(final short lhs, final long rhs) {
    return doOrEquals(NgShort.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doOrEquals(final short lhs, final BigInteger rhs) {
    return doOrEquals(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doOrEquals(final int lhs, final byte rhs) {
    return doOrEquals(NgInt.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doOrEquals(final int lhs, final char rhs) {
    return doOrEquals(NgInt.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doOrEquals(final int lhs, final short rhs) {
    return doOrEquals(NgInt.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doOrEquals(final int lhs, final int rhs) {
    return doOrEquals(NgInt.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doOrEquals(final int lhs, final long rhs) {
    return doOrEquals(NgInt.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doOrEquals(final int lhs, final BigInteger rhs) {
    return doOrEquals(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doOrEquals(final long lhs, final byte rhs) {
    return doOrEquals(NgLong.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doOrEquals(final long lhs, final char rhs) {
    return doOrEquals(NgLong.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doOrEquals(final long lhs, final short rhs) {
    return doOrEquals(NgLong.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doOrEquals(final long lhs, final int rhs) {
    return doOrEquals(NgLong.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doOrEquals(final long lhs, final long rhs) {
    return doOrEquals(NgLong.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doOrEquals(final long lhs, final BigInteger rhs) {
    return doOrEquals(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doOrEquals(final BigInteger lhs, final byte rhs) {
    return doOrEquals((Object)lhs, NgByte.valueOf(rhs));
  }

  public Object doOrEquals(final BigInteger lhs, final char rhs) {
    return doOrEquals((Object)lhs, NgChar.valueOf(rhs));
  }

  public Object doOrEquals(final BigInteger lhs, final short rhs) {
    return doOrEquals((Object)lhs, NgShort.valueOf(rhs));
  }

  public Object doOrEquals(final BigInteger lhs, final int rhs) {
    return doOrEquals((Object)lhs, NgInt.valueOf(rhs));
  }

  public Object doOrEquals(final BigInteger lhs, final long rhs) {
    return doOrEquals((Object)lhs, NgLong.valueOf(rhs));
  }

  public Object doOrEquals(final BigInteger lhs, final BigInteger rhs) {
    return doOrEquals((Object)lhs, (Object)rhs);
  }

  public Object doOrEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = NgByte.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseOrEquals(lhs, rhsObject);
  }

  public Object doOrEquals(final Object lhs, final char rhs) {
  final Object rhsObject = NgChar.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseOrEquals(lhs, rhsObject);
  }

  public Object doOrEquals(final Object lhs, final short rhs) {
  final Object rhsObject = NgShort.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseOrEquals(lhs, rhsObject);
  }

  public Object doOrEquals(final Object lhs, final int rhs) {
  final Object rhsObject = NgInt.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseOrEquals(lhs, rhsObject);
  }

  public Object doOrEquals(final Object lhs, final long rhs) {
  final Object rhsObject = NgLong.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseOrEquals(lhs, rhsObject);
  }

  public Object doOrEquals(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseOrEquals(lhs, rhsObject);
  }

  public Object doReverseOrEquals(final byte lhs, final Object rhs) {
  final Object lhsObject = NgByte.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOrEquals(lhsObject, rhs);
  }

  public Object doReverseOrEquals(final char lhs, final Object rhs) {
  final Object lhsObject = NgChar.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOrEquals(lhsObject, rhs);
  }

  public Object doReverseOrEquals(final short lhs, final Object rhs) {
  final Object lhsObject = NgShort.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOrEquals(lhsObject, rhs);
  }

  public Object doReverseOrEquals(final int lhs, final Object rhs) {
  final Object lhsObject = NgInt.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOrEquals(lhsObject, rhs);
  }

  public Object doReverseOrEquals(final long lhs, final Object rhs) {
  final Object lhsObject = NgLong.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOrEquals(lhsObject, rhs);
  }

  public Object doReverseOrEquals(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOrEquals(lhsObject, rhs);
  }

  //
  //   Internal methods for operator ^
  //
  //  These methods can be overidden to implement ^
  //  If the underlying object does not have the appropriate method
  //
  public Object doXor(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.xor(lhs, rhs);
    
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("xor", rhs).call(lhs, rhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXor(lhs, rhs);
        }
      }

      return result;
    }
    
    public Object doReverseXor(final Object lhs, final Object rhs) {
    final Object result = this.instanceHandler.reverseXor(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        return this.instanceHandler.getMetaMethodQuick("reverseXor", lhs).call(rhs, lhs);
      }

      return result;
    }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doXor(final byte lhs, final byte rhs) {
    return doXor(NgByte.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doXor(final byte lhs, final char rhs) {
    return doXor(NgByte.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doXor(final byte lhs, final short rhs) {
    return doXor(NgByte.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doXor(final byte lhs, final int rhs) {
    return doXor(NgByte.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doXor(final byte lhs, final long rhs) {
    return doXor(NgByte.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doXor(final byte lhs, final BigInteger rhs) {
    return doXor(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doXor(final char lhs, final byte rhs) {
    return doXor(NgChar.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doXor(final char lhs, final char rhs) {
    return doXor(NgChar.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doXor(final char lhs, final short rhs) {
    return doXor(NgChar.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doXor(final char lhs, final int rhs) {
    return doXor(NgChar.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doXor(final char lhs, final long rhs) {
    return doXor(NgChar.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doXor(final char lhs, final BigInteger rhs) {
    return doXor(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doXor(final short lhs, final byte rhs) {
    return doXor(NgShort.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doXor(final short lhs, final char rhs) {
    return doXor(NgShort.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doXor(final short lhs, final short rhs) {
    return doXor(NgShort.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doXor(final short lhs, final int rhs) {
    return doXor(NgShort.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doXor(final short lhs, final long rhs) {
    return doXor(NgShort.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doXor(final short lhs, final BigInteger rhs) {
    return doXor(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doXor(final int lhs, final byte rhs) {
    return doXor(NgInt.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doXor(final int lhs, final char rhs) {
    return doXor(NgInt.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doXor(final int lhs, final short rhs) {
    return doXor(NgInt.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doXor(final int lhs, final int rhs) {
    return doXor(NgInt.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doXor(final int lhs, final long rhs) {
    return doXor(NgInt.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doXor(final int lhs, final BigInteger rhs) {
    return doXor(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doXor(final long lhs, final byte rhs) {
    return doXor(NgLong.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doXor(final long lhs, final char rhs) {
    return doXor(NgLong.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doXor(final long lhs, final short rhs) {
    return doXor(NgLong.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doXor(final long lhs, final int rhs) {
    return doXor(NgLong.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doXor(final long lhs, final long rhs) {
    return doXor(NgLong.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doXor(final long lhs, final BigInteger rhs) {
    return doXor(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doXor(final BigInteger lhs, final byte rhs) {
    return doXor((Object)lhs, NgByte.valueOf(rhs));
  }

  public Object doXor(final BigInteger lhs, final char rhs) {
    return doXor((Object)lhs, NgChar.valueOf(rhs));
  }

  public Object doXor(final BigInteger lhs, final short rhs) {
    return doXor((Object)lhs, NgShort.valueOf(rhs));
  }

  public Object doXor(final BigInteger lhs, final int rhs) {
    return doXor((Object)lhs, NgInt.valueOf(rhs));
  }

  public Object doXor(final BigInteger lhs, final long rhs) {
    return doXor((Object)lhs, NgLong.valueOf(rhs));
  }

  public Object doXor(final BigInteger lhs, final BigInteger rhs) {
    return doXor((Object)lhs, (Object)rhs);
  }

  public Object doXor(final Object lhs, final byte rhs) {
  final Object rhsObject = NgByte.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseXor(lhs, rhsObject);
  }

  public Object doXor(final Object lhs, final char rhs) {
  final Object rhsObject = NgChar.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseXor(lhs, rhsObject);
  }

  public Object doXor(final Object lhs, final short rhs) {
  final Object rhsObject = NgShort.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseXor(lhs, rhsObject);
  }

  public Object doXor(final Object lhs, final int rhs) {
  final Object rhsObject = NgInt.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseXor(lhs, rhsObject);
  }

  public Object doXor(final Object lhs, final long rhs) {
  final Object rhsObject = NgLong.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseXor(lhs, rhsObject);
  }

  public Object doXor(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseXor(lhs, rhsObject);
  }


  public Object doReverseXor(final byte lhs, final Object rhs) {
  final Object lhsObject = NgByte.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXor(lhsObject, rhs);
  }

  public Object doReverseXor(final char lhs, final Object rhs) {
  final Object lhsObject = NgChar.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXor(lhsObject, rhs);
  }

  public Object doReverseXor(final short lhs, final Object rhs) {
  final Object lhsObject = NgShort.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXor(lhsObject, rhs);
  }

  public Object doReverseXor(final int lhs, final Object rhs) {
  final Object lhsObject = NgInt.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXor(lhsObject, rhs);
  }

  public Object doReverseXor(final long lhs, final Object rhs) {
  final Object lhsObject = NgLong.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXor(lhsObject, rhs);
  }

  public Object doReverseXor(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXor(lhsObject, rhs);
  }

  //
  //   Internal methods for operator ^=
  //
  //  These methods can be overidden to implement ^=
  //  If the underlying object does not have the appropriate method
  //
  public Object doXorEquals(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.xorEquals(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("xorEquals", rhs).call(lhs, rhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          result = NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXorEquals(lhs, rhs);
          
          if (result == RuntimeMetaClassImpl.NOT_CALLED) {
            return doXor(lhs, rhs);
          }
        }
      }

      return result;
    }
    
    public Object doReverseXorEquals(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.reverseXorEquals(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("reverseXorEquals", lhs).call(rhs, lhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          return doReverseXor(lhs, rhs);
        }
      }

      return result;
    }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doXorEquals(final byte lhs, final byte rhs) {
    return doXorEquals(NgByte.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doXorEquals(final byte lhs, final char rhs) {
    return doXorEquals(NgByte.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doXorEquals(final byte lhs, final short rhs) {
    return doXorEquals(NgByte.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doXorEquals(final byte lhs, final int rhs) {
    return doXorEquals(NgByte.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doXorEquals(final byte lhs, final long rhs) {
    return doXorEquals(NgByte.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doXorEquals(final byte lhs, final BigInteger rhs) {
    return doXorEquals(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doXorEquals(final char lhs, final byte rhs) {
    return doXorEquals(NgChar.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doXorEquals(final char lhs, final char rhs) {
    return doXorEquals(NgChar.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doXorEquals(final char lhs, final short rhs) {
    return doXorEquals(NgChar.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doXorEquals(final char lhs, final int rhs) {
    return doXorEquals(NgChar.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doXorEquals(final char lhs, final long rhs) {
    return doXorEquals(NgChar.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doXorEquals(final char lhs, final BigInteger rhs) {
    return doXorEquals(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doXorEquals(final short lhs, final byte rhs) {
    return doXorEquals(NgShort.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doXorEquals(final short lhs, final char rhs) {
    return doXorEquals(NgShort.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doXorEquals(final short lhs, final short rhs) {
    return doXorEquals(NgShort.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doXorEquals(final short lhs, final int rhs) {
    return doXorEquals(NgShort.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doXorEquals(final short lhs, final long rhs) {
    return doXorEquals(NgShort.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doXorEquals(final short lhs, final BigInteger rhs) {
    return doXorEquals(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doXorEquals(final int lhs, final byte rhs) {
    return doXorEquals(NgInt.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doXorEquals(final int lhs, final char rhs) {
    return doXorEquals(NgInt.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doXorEquals(final int lhs, final short rhs) {
    return doXorEquals(NgInt.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doXorEquals(final int lhs, final int rhs) {
    return doXorEquals(NgInt.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doXorEquals(final int lhs, final long rhs) {
    return doXorEquals(NgInt.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doXorEquals(final int lhs, final BigInteger rhs) {
    return doXorEquals(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doXorEquals(final long lhs, final byte rhs) {
    return doXorEquals(NgLong.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doXorEquals(final long lhs, final char rhs) {
    return doXorEquals(NgLong.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doXorEquals(final long lhs, final short rhs) {
    return doXorEquals(NgLong.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doXorEquals(final long lhs, final int rhs) {
    return doXorEquals(NgLong.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doXorEquals(final long lhs, final long rhs) {
    return doXorEquals(NgLong.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doXorEquals(final long lhs, final BigInteger rhs) {
    return doXorEquals(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doXorEquals(final BigInteger lhs, final byte rhs) {
    return doXorEquals((Object)lhs, NgByte.valueOf(rhs));
  }

  public Object doXorEquals(final BigInteger lhs, final char rhs) {
    return doXorEquals((Object)lhs, NgChar.valueOf(rhs));
  }

  public Object doXorEquals(final BigInteger lhs, final short rhs) {
    return doXorEquals((Object)lhs, NgShort.valueOf(rhs));
  }

  public Object doXorEquals(final BigInteger lhs, final int rhs) {
    return doXorEquals((Object)lhs, NgInt.valueOf(rhs));
  }

  public Object doXorEquals(final BigInteger lhs, final long rhs) {
    return doXorEquals((Object)lhs, NgLong.valueOf(rhs));
  }

  public Object doXorEquals(final BigInteger lhs, final BigInteger rhs) {
    return doXorEquals((Object)lhs, (Object)rhs);
  }

  public Object doXorEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = NgByte.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseXorEquals(lhs, rhsObject);
  }

  public Object doXorEquals(final Object lhs, final char rhs) {
  final Object rhsObject = NgChar.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseXorEquals(lhs, rhsObject);
  }

  public Object doXorEquals(final Object lhs, final short rhs) {
  final Object rhsObject = NgShort.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseXorEquals(lhs, rhsObject);
  }

  public Object doXorEquals(final Object lhs, final int rhs) {
  final Object rhsObject = NgInt.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseXorEquals(lhs, rhsObject);
  }

  public Object doXorEquals(final Object lhs, final long rhs) {
  final Object rhsObject = NgLong.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseXorEquals(lhs, rhsObject);
  }
 
  public Object doXorEquals(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseXorEquals(lhs, rhsObject);
  }

  public Object doReverseXorEquals(final byte lhs, final Object rhs) {
  final Object lhsObject = NgByte.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXorEquals(lhsObject, rhs);
  }

  public Object doReverseXorEquals(final char lhs, final Object rhs) {
  final Object lhsObject = NgChar.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXorEquals(lhsObject, rhs);
  }

  public Object doReverseXorEquals(final short lhs, final Object rhs) {
  final Object lhsObject = NgShort.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXorEquals(lhsObject, rhs);
  }

  public Object doReverseXorEquals(final int lhs, final Object rhs) {
  final Object lhsObject = NgInt.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXorEquals(lhsObject, rhs);
  }

  public Object doReverseXorEquals(final long lhs, final Object rhs) {
  final Object lhsObject = NgLong.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXorEquals(lhsObject, rhs);
  }

  public Object doReverseXorEquals(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXorEquals(lhsObject, rhs);
  }

  //
  //   Internal methods for operator <<
  //
  //  These methods can be overidden to implement <<
  //  If the underlying object does not have the appropriate method
  //
  public Object doLeftShift(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.leftShift(lhs, rhs);
    
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("leftShift", rhs).call(lhs, rhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShift(lhs, rhs);
        }
      }

      return result;
    }
    
    public Object doReverseLeftShift(final Object lhs, final Object rhs) {
    final Object result = this.instanceHandler.reverseLeftShift(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        return this.instanceHandler.getMetaMethodQuick("reverseLeftShift", lhs).call(rhs, lhs);
      }

      return result;
    }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doLeftShift(final byte lhs, final byte rhs) {
    return doLeftShift(NgByte.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLeftShift(final byte lhs, final char rhs) {
    return doLeftShift(NgByte.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLeftShift(final byte lhs, final short rhs) {
    return doLeftShift(NgByte.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLeftShift(final byte lhs, final int rhs) {
    return doLeftShift(NgByte.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLeftShift(final byte lhs, final long rhs) {
    return doLeftShift(NgByte.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLeftShift(final byte lhs, final BigInteger rhs) {
    return doLeftShift(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doLeftShift(final char lhs, final byte rhs) {
    return doLeftShift(NgChar.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLeftShift(final char lhs, final char rhs) {
    return doLeftShift(NgChar.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLeftShift(final char lhs, final short rhs) {
    return doLeftShift(NgChar.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLeftShift(final char lhs, final int rhs) {
    return doLeftShift(NgChar.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLeftShift(final char lhs, final long rhs) {
    return doLeftShift(NgChar.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLeftShift(final char lhs, final BigInteger rhs) {
    return doLeftShift(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doLeftShift(final short lhs, final byte rhs) {
    return doLeftShift(NgShort.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLeftShift(final short lhs, final char rhs) {
    return doLeftShift(NgShort.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLeftShift(final short lhs, final short rhs) {
    return doLeftShift(NgShort.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLeftShift(final short lhs, final int rhs) {
    return doLeftShift(NgShort.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLeftShift(final short lhs, final long rhs) {
    return doLeftShift(NgShort.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLeftShift(final short lhs, final BigInteger rhs) {
    return doLeftShift(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doLeftShift(final int lhs, final byte rhs) {
    return doLeftShift(NgInt.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLeftShift(final int lhs, final char rhs) {
    return doLeftShift(NgInt.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLeftShift(final int lhs, final short rhs) {
    return doLeftShift(NgInt.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLeftShift(final int lhs, final int rhs) {
    return doLeftShift(NgInt.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLeftShift(final int lhs, final long rhs) {
    return doLeftShift(NgInt.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLeftShift(final int lhs, final BigInteger rhs) {
    return doLeftShift(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doLeftShift(final long lhs, final byte rhs) {
    return doLeftShift(NgLong.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLeftShift(final long lhs, final char rhs) {
    return doLeftShift(NgLong.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLeftShift(final long lhs, final short rhs) {
    return doLeftShift(NgLong.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLeftShift(final long lhs, final int rhs) {
    return doLeftShift(NgLong.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLeftShift(final long lhs, final long rhs) {
    return doLeftShift(NgLong.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLeftShift(final long lhs, final BigInteger rhs) {
    return doLeftShift(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doLeftShift(final BigInteger lhs, final byte rhs) {
    return doLeftShift((Object)lhs, NgByte.valueOf(rhs));
  }

  public Object doLeftShift(final BigInteger lhs, final char rhs) {
    return doLeftShift((Object)lhs, NgChar.valueOf(rhs));
  }

  public Object doLeftShift(final BigInteger lhs, final short rhs) {
    return doLeftShift((Object)lhs, NgShort.valueOf(rhs));
  }

  public Object doLeftShift(final BigInteger lhs, final int rhs) {
    return doLeftShift((Object)lhs, NgInt.valueOf(rhs));
  }

  public Object doLeftShift(final BigInteger lhs, final long rhs) {
    return doLeftShift((Object)lhs, NgLong.valueOf(rhs));
  }

  public Object doLeftShift(final BigInteger lhs, final BigInteger rhs) {
    return doLeftShift((Object)lhs, (Object)rhs);
  }

  public Object doLeftShift(final Object lhs, final byte rhs) {
  final Object rhsObject = NgByte.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLeftShift(lhs, rhsObject);
  }

  public Object doLeftShift(final Object lhs, final char rhs) {
  final Object rhsObject = NgChar.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLeftShift(lhs, rhsObject);
  }

  public Object doLeftShift(final Object lhs, final short rhs) {
  final Object rhsObject = NgShort.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLeftShift(lhs, rhsObject);
  }

  public Object doLeftShift(final Object lhs, final int rhs) {
  final Object rhsObject = NgInt.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLeftShift(lhs, rhsObject);
  }

  public Object doLeftShift(final Object lhs, final long rhs) {
  final Object rhsObject = NgLong.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLeftShift(lhs, rhsObject);
  }

  public Object doLeftShift(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLeftShift(lhs, rhsObject);
  }

  public Object doReverseLeftShift(final byte lhs, final Object rhs) {
  final Object lhsObject = NgByte.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShift(lhsObject, rhs);
  }

  public Object doReverseLeftShift(final char lhs, final Object rhs) {
  final Object lhsObject = NgChar.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShift(lhsObject, rhs);
  }

  public Object doReverseLeftShift(final short lhs, final Object rhs) {
  final Object lhsObject = NgShort.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShift(lhsObject, rhs);
  }

  public Object doReverseLeftShift(final int lhs, final Object rhs) {
  final Object lhsObject = NgInt.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShift(lhsObject, rhs);
  }

  public Object doReverseLeftShift(final long lhs, final Object rhs) {
  final Object lhsObject = NgLong.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShift(lhsObject, rhs);
  }

  public Object doReverseLeftShift(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShift(lhsObject, rhs);
  }

  //
  //   Internal methods for operator <<=
  //
  //  These methods can be overidden to implement <<=
  //  If the underlying object does not have the appropriate method
  //
  public Object doLeftShiftEquals(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.leftShiftEquals(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("leftShiftEquals", rhs).call(lhs, rhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          result = NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShiftEquals(lhs, rhs);
          
          if (result == RuntimeMetaClassImpl.NOT_CALLED) {
            return doLeftShift(lhs, rhs);
          }
        }
      }

      return result;
    }
    
    public Object doReverseLeftShiftEquals(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.reverseLeftShiftEquals(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("reverseLeftShiftEquals", lhs).call(rhs, lhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          return doReverseLeftShift(lhs, rhs);
        }
      }

      return result;
    }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doLeftShiftEquals(final byte lhs, final byte rhs) {
    return doLeftShiftEquals(NgByte.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLeftShiftEquals(final byte lhs, final char rhs) {
    return doLeftShiftEquals(NgByte.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLeftShiftEquals(final byte lhs, final short rhs) {
    return doLeftShiftEquals(NgByte.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLeftShiftEquals(final byte lhs, final int rhs) {
    return doLeftShiftEquals(NgByte.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLeftShiftEquals(final byte lhs, final long rhs) {
    return doLeftShiftEquals(NgByte.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLeftShiftEquals(final byte lhs, final BigInteger rhs) {
    return doLeftShiftEquals(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doLeftShiftEquals(final char lhs, final byte rhs) {
    return doLeftShiftEquals(NgChar.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLeftShiftEquals(final char lhs, final char rhs) {
    return doLeftShiftEquals(NgChar.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLeftShiftEquals(final char lhs, final short rhs) {
    return doLeftShiftEquals(NgChar.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLeftShiftEquals(final char lhs, final int rhs) {
    return doLeftShiftEquals(NgChar.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLeftShiftEquals(final char lhs, final long rhs) {
    return doLeftShiftEquals(NgChar.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLeftShiftEquals(final char lhs, final BigInteger rhs) {
    return doLeftShiftEquals(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doLeftShiftEquals(final short lhs, final byte rhs) {
    return doLeftShiftEquals(NgShort.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLeftShiftEquals(final short lhs, final char rhs) {
    return doLeftShiftEquals(NgShort.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLeftShiftEquals(final short lhs, final short rhs) {
    return doLeftShiftEquals(NgShort.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLeftShiftEquals(final short lhs, final int rhs) {
    return doLeftShiftEquals(NgShort.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLeftShiftEquals(final short lhs, final long rhs) {
    return doLeftShiftEquals(NgShort.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLeftShiftEquals(final short lhs, final BigInteger rhs) {
    return doLeftShiftEquals(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doLeftShiftEquals(final int lhs, final byte rhs) {
    return doLeftShiftEquals(NgInt.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLeftShiftEquals(final int lhs, final char rhs) {
    return doLeftShiftEquals(NgInt.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLeftShiftEquals(final int lhs, final short rhs) {
    return doLeftShiftEquals(NgInt.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLeftShiftEquals(final int lhs, final int rhs) {
    return doLeftShiftEquals(NgInt.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLeftShiftEquals(final int lhs, final long rhs) {
    return doLeftShiftEquals(NgInt.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLeftShiftEquals(final int lhs, final BigInteger rhs) {
    return doLeftShiftEquals(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doLeftShiftEquals(final long lhs, final byte rhs) {
    return doLeftShiftEquals(NgLong.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLeftShiftEquals(final long lhs, final char rhs) {
    return doLeftShiftEquals(NgLong.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLeftShiftEquals(final long lhs, final short rhs) {
    return doLeftShiftEquals(NgLong.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLeftShiftEquals(final long lhs, final int rhs) {
    return doLeftShiftEquals(NgLong.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLeftShiftEquals(final long lhs, final long rhs) {
    return doLeftShiftEquals(NgLong.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLeftShiftEquals(final long lhs, final BigInteger rhs) {
    return doLeftShiftEquals(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doLeftShiftEquals(final BigInteger lhs, final byte rhs) {
    return doLeftShiftEquals((Object)lhs, NgByte.valueOf(rhs));
  }

  public Object doLeftShiftEquals(final BigInteger lhs, final char rhs) {
    return doLeftShiftEquals((Object)lhs, NgChar.valueOf(rhs));
  }

  public Object doLeftShiftEquals(final BigInteger lhs, final short rhs) {
    return doLeftShiftEquals((Object)lhs, NgShort.valueOf(rhs));
  }

  public Object doLeftShiftEquals(final BigInteger lhs, final int rhs) {
    return doLeftShiftEquals((Object)lhs, NgInt.valueOf(rhs));
  }

  public Object doLeftShiftEquals(final BigInteger lhs, final long rhs) {
    return doLeftShiftEquals((Object)lhs, NgLong.valueOf(rhs));
  }

  public Object doLeftShiftEquals(final BigInteger lhs, final BigInteger rhs) {
    return doLeftShiftEquals((Object)lhs, (Object)rhs);
  }

  public Object doLeftShiftEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = NgByte.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLeftShiftEquals(lhs, rhsObject);
  }

  public Object doLeftShiftEquals(final Object lhs, final char rhs) {
  final Object rhsObject = NgChar.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLeftShiftEquals(lhs, rhsObject);
  }

  public Object doLeftShiftEquals(final Object lhs, final short rhs) {
  final Object rhsObject = NgShort.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLeftShiftEquals(lhs, rhsObject);
  }

  public Object doLeftShiftEquals(final Object lhs, final int rhs) {
  final Object rhsObject = NgInt.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLeftShiftEquals(lhs, rhsObject);
  }

  public Object doLeftShiftEquals(final Object lhs, final long rhs) {
  final Object rhsObject = NgLong.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLeftShiftEquals(lhs, rhsObject);
  }

  public Object doLeftShiftEquals(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLeftShiftEquals(lhs, rhsObject);
  }

  public Object doReverseLeftShiftEquals(final byte lhs, final Object rhs) {
  final Object lhsObject = NgByte.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShiftEquals(lhsObject, rhs);
  }

  public Object doReverseLeftShiftEquals(final char lhs, final Object rhs) {
  final Object lhsObject = NgChar.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShiftEquals(lhsObject, rhs);
  }

  public Object doReverseLeftShiftEquals(final short lhs, final Object rhs) {
  final Object lhsObject = NgShort.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShiftEquals(lhsObject, rhs);
  }

  public Object doReverseLeftShiftEquals(final int lhs, final Object rhs) {
  final Object lhsObject = NgInt.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShiftEquals(lhsObject, rhs);
  }

  public Object doReverseLeftShiftEquals(final long lhs, final Object rhs) {
  final Object lhsObject = NgLong.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShiftEquals(lhsObject, rhs);
  }

  public Object doReverseLeftShiftEquals(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShiftEquals(lhsObject, rhs);
  }

  //
  //   Internal methods for operator >>
  //
  //  These methods can be overidden to implement >>
  //  If the underlying object does not have the appropriate method
  //
  public Object doArithmeticRightShift(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.arithmeticRightShift(lhs, rhs);
    
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("rightShift", rhs).call(lhs, rhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShift(lhs, rhs);
        }
      }

      return result;
    }
    
    public Object doReverseArithmeticRightShift(final Object lhs, final Object rhs) {
    final Object result = this.instanceHandler.reverseArithmeticRightShift(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        return this.instanceHandler.getMetaMethodQuick("reverseRightShift", lhs).call(rhs, lhs);
      }

      return result;
    }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doArithmeticRightShift(final byte lhs, final byte rhs) {
    return doArithmeticRightShift(NgByte.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doArithmeticRightShift(final byte lhs, final char rhs) {
    return doArithmeticRightShift(NgByte.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doArithmeticRightShift(final byte lhs, final short rhs) {
    return doArithmeticRightShift(NgByte.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doArithmeticRightShift(final byte lhs, final int rhs) {
    return doArithmeticRightShift(NgByte.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doArithmeticRightShift(final byte lhs, final long rhs) {
    return doArithmeticRightShift(NgByte.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doArithmeticRightShift(final byte lhs, final BigInteger rhs) {
    return doArithmeticRightShift(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doArithmeticRightShift(final char lhs, final byte rhs) {
    return doArithmeticRightShift(NgChar.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doArithmeticRightShift(final char lhs, final char rhs) {
    return doArithmeticRightShift(NgChar.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doArithmeticRightShift(final char lhs, final short rhs) {
    return doArithmeticRightShift(NgChar.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doArithmeticRightShift(final char lhs, final int rhs) {
    return doArithmeticRightShift(NgChar.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doArithmeticRightShift(final char lhs, final long rhs) {
    return doArithmeticRightShift(NgChar.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doArithmeticRightShift(final char lhs, final BigInteger rhs) {
    return doArithmeticRightShift(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doArithmeticRightShift(final short lhs, final byte rhs) {
    return doArithmeticRightShift(NgShort.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doArithmeticRightShift(final short lhs, final char rhs) {
    return doArithmeticRightShift(NgShort.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doArithmeticRightShift(final short lhs, final short rhs) {
    return doArithmeticRightShift(NgShort.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doArithmeticRightShift(final short lhs, final int rhs) {
    return doArithmeticRightShift(NgShort.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doArithmeticRightShift(final short lhs, final long rhs) {
    return doArithmeticRightShift(NgShort.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doArithmeticRightShift(final short lhs, final BigInteger rhs) {
    return doArithmeticRightShift(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doArithmeticRightShift(final int lhs, final byte rhs) {
    return doArithmeticRightShift(NgInt.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doArithmeticRightShift(final int lhs, final char rhs) {
    return doArithmeticRightShift(NgInt.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doArithmeticRightShift(final int lhs, final short rhs) {
    return doArithmeticRightShift(NgInt.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doArithmeticRightShift(final int lhs, final int rhs) {
    return doArithmeticRightShift(NgInt.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doArithmeticRightShift(final int lhs, final long rhs) {
    return doArithmeticRightShift(NgInt.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doArithmeticRightShift(final int lhs, final BigInteger rhs) {
    return doArithmeticRightShift(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doArithmeticRightShift(final long lhs, final byte rhs) {
    return doArithmeticRightShift(NgLong.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doArithmeticRightShift(final long lhs, final char rhs) {
    return doArithmeticRightShift(NgLong.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doArithmeticRightShift(final long lhs, final short rhs) {
    return doArithmeticRightShift(NgLong.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doArithmeticRightShift(final long lhs, final int rhs) {
    return doArithmeticRightShift(NgLong.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doArithmeticRightShift(final long lhs, final long rhs) {
    return doArithmeticRightShift(NgLong.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doArithmeticRightShift(final long lhs, final BigInteger rhs) {
    return doArithmeticRightShift(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doArithmeticRightShift(final BigInteger lhs, final byte rhs) {
    return doArithmeticRightShift((Object)lhs, NgByte.valueOf(rhs));
  }

  public Object doArithmeticRightShift(final BigInteger lhs, final char rhs) {
    return doArithmeticRightShift((Object)lhs, NgChar.valueOf(rhs));
  }

  public Object doArithmeticRightShift(final BigInteger lhs, final short rhs) {
    return doArithmeticRightShift((Object)lhs, NgShort.valueOf(rhs));
  }

  public Object doArithmeticRightShift(final BigInteger lhs, final int rhs) {
    return doArithmeticRightShift((Object)lhs, NgInt.valueOf(rhs));
  }

  public Object doArithmeticRightShift(final BigInteger lhs, final long rhs) {
    return doArithmeticRightShift((Object)lhs, NgLong.valueOf(rhs));
  }

  public Object doArithmeticRightShift(final BigInteger lhs, final BigInteger rhs) {
    return doArithmeticRightShift((Object)lhs, (Object)rhs);
  }

  public Object doArithmeticRightShift(final Object lhs, final byte rhs) {
  final Object rhsObject = NgByte.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseArithmeticRightShift(lhs, rhsObject);
  }

  public Object doArithmeticRightShift(final Object lhs, final char rhs) {
  final Object rhsObject = NgChar.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseArithmeticRightShift(lhs, rhsObject);
  }

  public Object doArithmeticRightShift(final Object lhs, final short rhs) {
  final Object rhsObject = NgShort.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseArithmeticRightShift(lhs, rhsObject);
  }

  public Object doArithmeticRightShift(final Object lhs, final int rhs) {
  final Object rhsObject = NgInt.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseArithmeticRightShift(lhs, rhsObject);
  }

  public Object doArithmeticRightShift(final Object lhs, final long rhs) {
  final Object rhsObject = NgLong.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseArithmeticRightShift(lhs, rhsObject);
  }

  public Object doArithmeticRightShift(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseArithmeticRightShift(lhs, rhsObject);
  }

  public Object doReverseArithmeticRightShift(final byte lhs, final Object rhs) {
  final Object lhsObject = NgByte.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShift(lhsObject, rhs);
  }

  public Object doReverseArithmeticRightShift(final char lhs, final Object rhs) {
  final Object lhsObject = NgChar.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShift(lhsObject, rhs);
  }

  public Object doReverseArithmeticRightShift(final short lhs, final Object rhs) {
  final Object lhsObject = NgShort.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShift(lhsObject, rhs);
  }

  public Object doReverseArithmeticRightShift(final int lhs, final Object rhs) {
  final Object lhsObject = NgInt.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShift(lhsObject, rhs);
  }

  public Object doReverseArithmeticRightShift(final long lhs, final Object rhs) {
  final Object lhsObject = NgLong.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShift(lhsObject, rhs);
  }

  public Object doReverseArithmeticRightShift(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShift(lhsObject, rhs);
  }

  //
  //   Internal methods for operator >>=
  //
  //  These methods can be overidden to implement >>=
  //  If the underlying object does not have the appropriate method
  //
  public Object doArithmeticRightShiftEquals(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.arithmeticRightShiftEquals(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("rightShiftEquals", rhs).call(lhs, rhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          result = NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShiftEquals(lhs, rhs);
          
          if (result == RuntimeMetaClassImpl.NOT_CALLED) {
            return doArithmeticRightShift(lhs, rhs);
          }
        }
      }

      return result;
    }
    
    public Object doReverseArithmeticRightShiftEquals(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.reverseArithmeticRightShiftEquals(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("reverseRightShiftEquals", lhs).call(rhs, lhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          return doReverseArithmeticRightShift(lhs, rhs);
        }
      }

      return result;
    }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doArithmeticRightShiftEquals(final byte lhs, final byte rhs) {
    return doArithmeticRightShiftEquals(NgByte.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doArithmeticRightShiftEquals(final byte lhs, final char rhs) {
    return doArithmeticRightShiftEquals(NgByte.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doArithmeticRightShiftEquals(final byte lhs, final short rhs) {
    return doArithmeticRightShiftEquals(NgByte.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doArithmeticRightShiftEquals(final byte lhs, final int rhs) {
    return doArithmeticRightShiftEquals(NgByte.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doArithmeticRightShiftEquals(final byte lhs, final long rhs) {
    return doArithmeticRightShiftEquals(NgByte.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doArithmeticRightShiftEquals(final byte lhs, final BigInteger rhs) {
    return doArithmeticRightShiftEquals(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doArithmeticRightShiftEquals(final char lhs, final byte rhs) {
    return doArithmeticRightShiftEquals(NgChar.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doArithmeticRightShiftEquals(final char lhs, final char rhs) {
    return doArithmeticRightShiftEquals(NgChar.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doArithmeticRightShiftEquals(final char lhs, final short rhs) {
    return doArithmeticRightShiftEquals(NgChar.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doArithmeticRightShiftEquals(final char lhs, final int rhs) {
    return doArithmeticRightShiftEquals(NgChar.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doArithmeticRightShiftEquals(final char lhs, final long rhs) {
    return doArithmeticRightShiftEquals(NgChar.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doArithmeticRightShiftEquals(final char lhs, final BigInteger rhs) {
    return doArithmeticRightShiftEquals(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doArithmeticRightShiftEquals(final short lhs, final byte rhs) {
    return doArithmeticRightShiftEquals(NgShort.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doArithmeticRightShiftEquals(final short lhs, final char rhs) {
    return doArithmeticRightShiftEquals(NgShort.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doArithmeticRightShiftEquals(final short lhs, final short rhs) {
    return doArithmeticRightShiftEquals(NgShort.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doArithmeticRightShiftEquals(final short lhs, final int rhs) {
    return doArithmeticRightShiftEquals(NgShort.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doArithmeticRightShiftEquals(final short lhs, final long rhs) {
    return doArithmeticRightShiftEquals(NgShort.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doArithmeticRightShiftEquals(final short lhs, final BigInteger rhs) {
    return doArithmeticRightShiftEquals(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doArithmeticRightShiftEquals(final int lhs, final byte rhs) {
    return doArithmeticRightShiftEquals(NgInt.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doArithmeticRightShiftEquals(final int lhs, final char rhs) {
    return doArithmeticRightShiftEquals(NgInt.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doArithmeticRightShiftEquals(final int lhs, final short rhs) {
    return doArithmeticRightShiftEquals(NgInt.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doArithmeticRightShiftEquals(final int lhs, final int rhs) {
    return doArithmeticRightShiftEquals(NgInt.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doArithmeticRightShiftEquals(final int lhs, final long rhs) {
    return doArithmeticRightShiftEquals(NgInt.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doArithmeticRightShiftEquals(final int lhs, final BigInteger rhs) {
    return doArithmeticRightShiftEquals(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doArithmeticRightShiftEquals(final long lhs, final byte rhs) {
    return doArithmeticRightShiftEquals(NgLong.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doArithmeticRightShiftEquals(final long lhs, final char rhs) {
    return doArithmeticRightShiftEquals(NgLong.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doArithmeticRightShiftEquals(final long lhs, final short rhs) {
    return doArithmeticRightShiftEquals(NgLong.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doArithmeticRightShiftEquals(final long lhs, final int rhs) {
    return doArithmeticRightShiftEquals(NgLong.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doArithmeticRightShiftEquals(final long lhs, final long rhs) {
    return doArithmeticRightShiftEquals(NgLong.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doArithmeticRightShiftEquals(final long lhs, final BigInteger rhs) {
    return doArithmeticRightShiftEquals(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doArithmeticRightShiftEquals(final BigInteger lhs, final byte rhs) {
    return doArithmeticRightShiftEquals((Object)lhs, NgByte.valueOf(rhs));
  }

  public Object doArithmeticRightShiftEquals(final BigInteger lhs, final char rhs) {
    return doArithmeticRightShiftEquals((Object)lhs, NgChar.valueOf(rhs));
  }

  public Object doArithmeticRightShiftEquals(final BigInteger lhs, final short rhs) {
    return doArithmeticRightShiftEquals((Object)lhs, NgShort.valueOf(rhs));
  }

  public Object doArithmeticRightShiftEquals(final BigInteger lhs, final int rhs) {
    return doArithmeticRightShiftEquals((Object)lhs, NgInt.valueOf(rhs));
  }

  public Object doArithmeticRightShiftEquals(final BigInteger lhs, final long rhs) {
    return doArithmeticRightShiftEquals((Object)lhs, NgLong.valueOf(rhs));
  }

  public Object doArithmeticRightShiftEquals(final BigInteger lhs, final BigInteger rhs) {
    return doArithmeticRightShiftEquals((Object)lhs, (Object)rhs);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = NgByte.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseArithmeticRightShiftEquals(lhs, rhsObject);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final char rhs) {
  final Object rhsObject = NgChar.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseArithmeticRightShiftEquals(lhs, rhsObject);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final short rhs) {
  final Object rhsObject = NgShort.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseArithmeticRightShiftEquals(lhs, rhsObject);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final int rhs) {
  final Object rhsObject = NgInt.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseArithmeticRightShiftEquals(lhs, rhsObject);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final long rhs) {
  final Object rhsObject = NgLong.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseArithmeticRightShiftEquals(lhs, rhsObject);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseArithmeticRightShiftEquals(lhs, rhsObject);
  }

  public Object doReverseArithmeticRightShiftEquals(final byte lhs, final Object rhs) {
  final Object lhsObject = NgByte.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShiftEquals(lhsObject, rhs);
  }

  public Object doReverseArithmeticRightShiftEquals(final char lhs, final Object rhs) {
  final Object lhsObject = NgChar.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShiftEquals(lhsObject, rhs);
  }

  public Object doReverseArithmeticRightShiftEquals(final short lhs, final Object rhs) {
  final Object lhsObject = NgShort.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShiftEquals(lhsObject, rhs);
  }

  public Object doReverseArithmeticRightShiftEquals(final int lhs, final Object rhs) {
  final Object lhsObject = NgInt.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShiftEquals(lhsObject, rhs);
  }

  public Object doReverseArithmeticRightShiftEquals(final long lhs, final Object rhs) {
  final Object lhsObject = NgLong.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShiftEquals(lhsObject, rhs);
  }

  public Object doReverseArithmeticRightShiftEquals(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShiftEquals(lhsObject, rhs);
  }

  //
  //   Internal methods for operator >>>
  //
  //  These methods can be overidden to implement >>>
  //  If the underlying object does not have the appropriate method
  //
  public Object doLogicalRightShift(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.logicalRightShift(lhs, rhs);
    
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("rightShiftUnsigned", rhs).call(lhs, rhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShift(lhs, rhs);
        }
      }

      return result;
    }
    
    public Object doReverseLogicalRightShift(final Object lhs, final Object rhs) {
    final Object result = this.instanceHandler.reverseLogicalRightShift(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        return this.instanceHandler.getMetaMethodQuick("reverseRightShiftUnsigned", lhs).call(rhs, lhs);
      }

      return result;
    }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doLogicalRightShift(final byte lhs, final byte rhs) {
    return doLogicalRightShift(NgByte.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLogicalRightShift(final byte lhs, final char rhs) {
    return doLogicalRightShift(NgByte.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLogicalRightShift(final byte lhs, final short rhs) {
    return doLogicalRightShift(NgByte.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLogicalRightShift(final byte lhs, final int rhs) {
    return doLogicalRightShift(NgByte.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLogicalRightShift(final byte lhs, final long rhs) {
    return doLogicalRightShift(NgByte.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLogicalRightShift(final byte lhs, final BigInteger rhs) {
    return doLogicalRightShift(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doLogicalRightShift(final char lhs, final byte rhs) {
    return doLogicalRightShift(NgChar.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLogicalRightShift(final char lhs, final char rhs) {
    return doLogicalRightShift(NgChar.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLogicalRightShift(final char lhs, final short rhs) {
    return doLogicalRightShift(NgChar.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLogicalRightShift(final char lhs, final int rhs) {
    return doLogicalRightShift(NgChar.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLogicalRightShift(final char lhs, final long rhs) {
    return doLogicalRightShift(NgChar.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLogicalRightShift(final char lhs, final BigInteger rhs) {
    return doLogicalRightShift(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doLogicalRightShift(final short lhs, final byte rhs) {
    return doLogicalRightShift(NgShort.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLogicalRightShift(final short lhs, final char rhs) {
    return doLogicalRightShift(NgShort.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLogicalRightShift(final short lhs, final short rhs) {
    return doLogicalRightShift(NgShort.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLogicalRightShift(final short lhs, final int rhs) {
    return doLogicalRightShift(NgShort.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLogicalRightShift(final short lhs, final long rhs) {
    return doLogicalRightShift(NgShort.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLogicalRightShift(final short lhs, final BigInteger rhs) {
    return doLogicalRightShift(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doLogicalRightShift(final int lhs, final byte rhs) {
    return doLogicalRightShift(NgInt.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLogicalRightShift(final int lhs, final char rhs) {
    return doLogicalRightShift(NgInt.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLogicalRightShift(final int lhs, final short rhs) {
    return doLogicalRightShift(NgInt.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLogicalRightShift(final int lhs, final int rhs) {
    return doLogicalRightShift(NgInt.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLogicalRightShift(final int lhs, final long rhs) {
    return doLogicalRightShift(NgInt.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLogicalRightShift(final int lhs, final BigInteger rhs) {
    return doLogicalRightShift(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doLogicalRightShift(final long lhs, final byte rhs) {
    return doLogicalRightShift(NgLong.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLogicalRightShift(final long lhs, final char rhs) {
    return doLogicalRightShift(NgLong.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLogicalRightShift(final long lhs, final short rhs) {
    return doLogicalRightShift(NgLong.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLogicalRightShift(final long lhs, final int rhs) {
    return doLogicalRightShift(NgLong.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLogicalRightShift(final long lhs, final long rhs) {
    return doLogicalRightShift(NgLong.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLogicalRightShift(final long lhs, final BigInteger rhs) {
    return doLogicalRightShift(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doLogicalRightShift(final Object lhs, final byte rhs) {
  final Object rhsObject = NgByte.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLogicalRightShift(lhs, rhsObject);
  }

  public Object doLogicalRightShift(final Object lhs, final char rhs) {
  final Object rhsObject = NgChar.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLogicalRightShift(lhs, rhsObject);
  }

  public Object doLogicalRightShift(final Object lhs, final short rhs) {
  final Object rhsObject = NgShort.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLogicalRightShift(lhs, rhsObject);
  }

  public Object doLogicalRightShift(final Object lhs, final int rhs) {
  final Object rhsObject = NgInt.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLogicalRightShift(lhs, rhsObject);
  }

  public Object doLogicalRightShift(final Object lhs, final long rhs) {
  final Object rhsObject = NgLong.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLogicalRightShift(lhs, rhsObject);
  }

  public Object doLogicalRightShift(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLogicalRightShift(lhs, rhsObject);
  }

  public Object doReverseLogicalRightShift(final byte lhs, final Object rhs) {
  final Object lhsObject = NgByte.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShift(lhsObject, rhs);
  }

  public Object doReverseLogicalRightShift(final char lhs, final Object rhs) {
  final Object lhsObject = NgChar.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShift(lhsObject, rhs);
  }

  public Object doReverseLogicalRightShift(final short lhs, final Object rhs) {
  final Object lhsObject = NgShort.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShift(lhsObject, rhs);
  }

  public Object doReverseLogicalRightShift(final int lhs, final Object rhs) {
  final Object lhsObject = NgInt.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShift(lhsObject, rhs);
  }

  public Object doReverseLogicalRightShift(final long lhs, final Object rhs) {
  final Object lhsObject = NgLong.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShift(lhsObject, rhs);
  }

  //
  //   Internal methods for operator &=
  //
  //  These methods can be overidden to implement &=
  //  If the underlying object does not have the appropriate method
  //
  public Object doLogicalRightShiftEquals(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.logicalRightShiftEquals(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("rightShiftUnsignedEquals", rhs).call(lhs, rhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          result = NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShiftEquals(lhs, rhs);
          
          if (result == RuntimeMetaClassImpl.NOT_CALLED) {
            return doLogicalRightShift(lhs, rhs);
          }
        }
      }

      return result;
    }
    
    public Object doReverseLogicalRightShiftEquals(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.reverseLogicalRightShiftEquals(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("reverseRightShiftUnsignedEquals", lhs).call(rhs, lhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          return doReverseLogicalRightShift(lhs, rhs);
        }
      }

      return result;
    }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doLogicalRightShiftEquals(final byte lhs, final byte rhs) {
    return doLogicalRightShiftEquals(NgByte.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLogicalRightShiftEquals(final byte lhs, final char rhs) {
    return doLogicalRightShiftEquals(NgByte.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLogicalRightShiftEquals(final byte lhs, final short rhs) {
    return doLogicalRightShiftEquals(NgByte.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLogicalRightShiftEquals(final byte lhs, final int rhs) {
    return doLogicalRightShiftEquals(NgByte.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLogicalRightShiftEquals(final byte lhs, final long rhs) {
    return doLogicalRightShiftEquals(NgByte.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLogicalRightShiftEquals(final byte lhs, final BigInteger rhs) {
    return doLogicalRightShiftEquals(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doLogicalRightShiftEquals(final char lhs, final byte rhs) {
    return doLogicalRightShiftEquals(NgChar.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLogicalRightShiftEquals(final char lhs, final char rhs) {
    return doLogicalRightShiftEquals(NgChar.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLogicalRightShiftEquals(final char lhs, final short rhs) {
    return doLogicalRightShiftEquals(NgChar.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLogicalRightShiftEquals(final char lhs, final int rhs) {
    return doLogicalRightShiftEquals(NgChar.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLogicalRightShiftEquals(final char lhs, final long rhs) {
    return doLogicalRightShiftEquals(NgChar.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLogicalRightShiftEquals(final char lhs, final BigInteger rhs) {
    return doLogicalRightShiftEquals(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doLogicalRightShiftEquals(final short lhs, final byte rhs) {
    return doLogicalRightShiftEquals(NgShort.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLogicalRightShiftEquals(final short lhs, final char rhs) {
    return doLogicalRightShiftEquals(NgShort.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLogicalRightShiftEquals(final short lhs, final short rhs) {
    return doLogicalRightShiftEquals(NgShort.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLogicalRightShiftEquals(final short lhs, final int rhs) {
    return doLogicalRightShiftEquals(NgShort.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLogicalRightShiftEquals(final short lhs, final long rhs) {
    return doLogicalRightShiftEquals(NgShort.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLogicalRightShiftEquals(final short lhs, final BigInteger rhs) {
    return doLogicalRightShiftEquals(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doLogicalRightShiftEquals(final int lhs, final byte rhs) {
    return doLogicalRightShiftEquals(NgInt.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLogicalRightShiftEquals(final int lhs, final char rhs) {
    return doLogicalRightShiftEquals(NgInt.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLogicalRightShiftEquals(final int lhs, final short rhs) {
    return doLogicalRightShiftEquals(NgInt.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLogicalRightShiftEquals(final int lhs, final int rhs) {
    return doLogicalRightShiftEquals(NgInt.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLogicalRightShiftEquals(final int lhs, final long rhs) {
    return doLogicalRightShiftEquals(NgInt.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLogicalRightShiftEquals(final int lhs, final BigInteger rhs) {
    return doLogicalRightShiftEquals(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doLogicalRightShiftEquals(final long lhs, final byte rhs) {
    return doLogicalRightShiftEquals(NgLong.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLogicalRightShiftEquals(final long lhs, final char rhs) {
    return doLogicalRightShiftEquals(NgLong.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLogicalRightShiftEquals(final long lhs, final short rhs) {
    return doLogicalRightShiftEquals(NgLong.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLogicalRightShiftEquals(final long lhs, final int rhs) {
    return doLogicalRightShiftEquals(NgLong.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLogicalRightShiftEquals(final long lhs, final long rhs) {
    return doLogicalRightShiftEquals(NgLong.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLogicalRightShiftEquals(final long lhs, final BigInteger rhs) {
    return doLogicalRightShiftEquals(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = NgByte.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLogicalRightShiftEquals(lhs, rhsObject);
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final char rhs) {
  final Object rhsObject = NgChar.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLogicalRightShiftEquals(lhs, rhsObject);
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final short rhs) {
  final Object rhsObject = NgShort.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLogicalRightShiftEquals(lhs, rhsObject);
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final int rhs) {
  final Object rhsObject = NgInt.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLogicalRightShiftEquals(lhs, rhsObject);
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final long rhs) {
  final Object rhsObject = NgLong.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLogicalRightShiftEquals(lhs, rhsObject);
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLogicalRightShiftEquals(lhs, rhsObject);
  }

  public Object doReverseLogicalRightShiftEquals(final byte lhs, final Object rhs) {
  final Object lhsObject = NgByte.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShiftEquals(lhsObject, rhs);
  }

  public Object doReverseLogicalRightShiftEquals(final char lhs, final Object rhs) {
  final Object lhsObject = NgChar.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShiftEquals(lhsObject, rhs);
  }

  public Object doReverseLogicalRightShiftEquals(final short lhs, final Object rhs) {
  final Object lhsObject = NgShort.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShiftEquals(lhsObject, rhs);
  }

  public Object doReverseLogicalRightShiftEquals(final int lhs, final Object rhs) {
  final Object lhsObject = NgInt.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShiftEquals(lhsObject, rhs);
  }

  public Object doReverseLogicalRightShiftEquals(final long lhs, final Object rhs) {
  final Object lhsObject = NgLong.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShiftEquals(lhsObject, rhs);
  }

  //
  //   Internal methods for operator <=>
  //
  //  These methods can be overidden to implement <=>
  //  If the underlying object does not have the appropriate method
  //
  public Object doCompare(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.compare(lhs, rhs);
    
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("compare", rhs).call(lhs, rhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseCompare(lhs, rhs);
        }
      }

      return result;
    }
    
    public Object doReverseCompare(final Object lhs, final Object rhs) {
    final Object result = this.instanceHandler.reverseCompare(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        return this.instanceHandler.getMetaMethodQuick("reverseCompare", lhs).call(rhs, lhs);
      }

      return result;
    }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doCompare(final byte lhs, final byte rhs) {
    return doCompare(NgByte.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doCompare(final byte lhs, final char rhs) {
    return doCompare(NgByte.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doCompare(final byte lhs, final short rhs) {
    return doCompare(NgByte.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doCompare(final byte lhs, final int rhs) {
    return doCompare(NgByte.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doCompare(final byte lhs, final long rhs) {
    return doCompare(NgByte.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doCompare(final byte lhs, final float rhs) {
    return doCompare(NgByte.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doCompare(final byte lhs, final double rhs) {
    return doCompare(NgByte.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doCompare(final byte lhs, final BigInteger rhs) {
    return doCompare(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doCompare(final byte lhs, final BigDecimal rhs) {
    return doCompare(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doCompare(final char lhs, final byte rhs) {
    return doCompare(NgChar.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doCompare(final char lhs, final char rhs) {
    return doCompare(NgChar.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doCompare(final char lhs, final short rhs) {
    return doCompare(NgChar.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doCompare(final char lhs, final int rhs) {
    return doCompare(NgChar.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doCompare(final char lhs, final long rhs) {
    return doCompare(NgChar.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doCompare(final char lhs, final float rhs) {
    return doCompare(NgChar.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doCompare(final char lhs, final double rhs) {
    return doCompare(NgChar.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doCompare(final char lhs, final BigInteger rhs) {
    return doCompare(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doCompare(final char lhs, final BigDecimal rhs) {
    return doCompare(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doCompare(final short lhs, final byte rhs) {
    return doCompare(NgShort.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doCompare(final short lhs, final char rhs) {
    return doCompare(NgShort.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doCompare(final short lhs, final short rhs) {
    return doCompare(NgShort.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doCompare(final short lhs, final int rhs) {
    return doCompare(NgShort.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doCompare(final short lhs, final long rhs) {
    return doCompare(NgShort.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doCompare(final short lhs, final float rhs) {
    return doCompare(NgShort.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doCompare(final short lhs, final double rhs) {
    return doCompare(NgShort.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doCompare(final short lhs, final BigInteger rhs) {
    return doCompare(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doCompare(final short lhs, final BigDecimal rhs) {
    return doCompare(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doCompare(final int lhs, final byte rhs) {
    return doCompare(NgInt.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doCompare(final int lhs, final char rhs) {
    return doCompare(NgInt.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doCompare(final int lhs, final short rhs) {
    return doCompare(NgInt.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doCompare(final int lhs, final int rhs) {
    return doCompare(NgInt.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doCompare(final int lhs, final long rhs) {
    return doCompare(NgInt.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doCompare(final int lhs, final float rhs) {
    return doCompare(NgInt.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doCompare(final int lhs, final double rhs) {
    return doCompare(NgInt.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doCompare(final int lhs, final BigInteger rhs) {
    return doCompare(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doCompare(final int lhs, final BigDecimal rhs) {
    return doCompare(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doCompare(final long lhs, final byte rhs) {
    return doCompare(NgLong.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doCompare(final long lhs, final char rhs) {
    return doCompare(NgLong.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doCompare(final long lhs, final short rhs) {
    return doCompare(NgLong.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doCompare(final long lhs, final int rhs) {
    return doCompare(NgLong.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doCompare(final long lhs, final long rhs) {
    return doCompare(NgLong.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doCompare(final long lhs, final float rhs) {
    return doCompare(NgLong.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doCompare(final long lhs, final double rhs) {
    return doCompare(NgLong.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doCompare(final long lhs, final BigInteger rhs) {
    return doCompare(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doCompare(final long lhs, final BigDecimal rhs) {
    return doCompare(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doCompare(final float lhs, final byte rhs) {
    return doCompare(NgFloat.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doCompare(final float lhs, final char rhs) {
    return doCompare(NgFloat.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doCompare(final float lhs, final short rhs) {
    return doCompare(NgFloat.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doCompare(final float lhs, final int rhs) {
    return doCompare(NgFloat.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doCompare(final float lhs, final long rhs) {
    return doCompare(NgFloat.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doCompare(final float lhs, final float rhs) {
    return doCompare(NgFloat.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doCompare(final float lhs, final double rhs) {
    return doCompare(NgFloat.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doCompare(final float lhs, final BigInteger rhs) {
    return doCompare(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doCompare(final float lhs, final BigDecimal rhs) {
    return doCompare(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doCompare(final double lhs, final byte rhs) {
    return doCompare(NgDouble.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doCompare(final double lhs, final char rhs) {
    return doCompare(NgDouble.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doCompare(final double lhs, final short rhs) {
    return doCompare(NgDouble.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doCompare(final double lhs, final int rhs) {
    return doCompare(NgDouble.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doCompare(final double lhs, final long rhs) {
    return doCompare(NgDouble.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doCompare(final double lhs, final float rhs) {
    return doCompare(NgDouble.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doCompare(final double lhs, final double rhs) {
    return doCompare(NgDouble.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doCompare(final double lhs, final BigInteger rhs) {
    return doCompare(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doCompare(final double lhs, final BigDecimal rhs) {
    return doCompare(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doCompare(final BigInteger lhs, final byte rhs) {
    return doCompare((Object)lhs, NgByte.valueOf(rhs));
  }

  public Object doCompare(final BigInteger lhs, final char rhs) {
    return doCompare((Object)lhs, NgChar.valueOf(rhs));
  }

  public Object doCompare(final BigInteger lhs, final short rhs) {
    return doCompare((Object)lhs, NgShort.valueOf(rhs));
  }

  public Object doCompare(final BigInteger lhs, final int rhs) {
    return doCompare((Object)lhs, NgInt.valueOf(rhs));
  }

  public Object doCompare(final BigInteger lhs, final long rhs) {
    return doCompare((Object)lhs, NgLong.valueOf(rhs));
  }

  public Object doCompare(final BigInteger lhs, final float rhs) {
    return doCompare((Object)lhs, NgFloat.valueOf(rhs));
  }

  public Object doCompare(final BigInteger lhs, final double rhs) {
    return doCompare((Object)lhs, NgDouble.valueOf(rhs));
  }

  public Object doCompare(final BigInteger lhs, final BigInteger rhs) {
    return doCompare((Object)lhs, (Object)rhs);
  }

  public Object doCompare(final BigInteger lhs, final BigDecimal rhs) {
    return doCompare((Object)lhs, (Object)rhs);
  }

  public Object doCompare(final BigDecimal lhs, final byte rhs) {
    return doCompare((Object)lhs, NgByte.valueOf(rhs));
  }

  public Object doCompare(final BigDecimal lhs, final char rhs) {
    return doCompare((Object)lhs, NgChar.valueOf(rhs));
  }

  public Object doCompare(final BigDecimal lhs, final short rhs) {
    return doCompare((Object)lhs, NgShort.valueOf(rhs));
  }

  public Object doCompare(final BigDecimal lhs, final int rhs) {
    return doCompare((Object)lhs, NgInt.valueOf(rhs));
  }

  public Object doCompare(final BigDecimal lhs, final long rhs) {
    return doCompare((Object)lhs, NgLong.valueOf(rhs));
  }

  public Object doCompare(final BigDecimal lhs, final float rhs) {
    return doCompare((Object)lhs, NgFloat.valueOf(rhs));
  }

  public Object doCompare(final BigDecimal lhs, final double rhs) {
    return doCompare((Object)lhs, NgDouble.valueOf(rhs));
  }

  public Object doCompare(final BigDecimal lhs, final BigInteger rhs) {
    return doCompare((Object)lhs, (Object)rhs);
  }

  public Object doCompare(final BigDecimal lhs, final BigDecimal rhs) {
    return doCompare((Object)lhs, (Object)rhs);
  }

  public Object doCompare(final Object lhs, final byte rhs) {
  final Object rhsObject = NgByte.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseCompare(lhs, rhsObject);
  }

  public Object doCompare(final Object lhs, final char rhs) {
  final Object rhsObject = NgChar.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseCompare(lhs, rhsObject);
  }

  public Object doCompare(final Object lhs, final short rhs) {
  final Object rhsObject = NgShort.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseCompare(lhs, rhsObject);
  }

  public Object doCompare(final Object lhs, final int rhs) {
  final Object rhsObject = NgInt.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseCompare(lhs, rhsObject);
  }

  public Object doCompare(final Object lhs, final long rhs) {
  final Object rhsObject = NgLong.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseCompare(lhs, rhsObject);
  }

  public Object doCompare(final Object lhs, final float rhs) {
  final Object rhsObject = NgFloat.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseCompare(lhs, rhsObject);
  }

  public Object doCompare(final Object lhs, final double rhs) {
  final Object rhsObject = NgDouble.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseCompare(lhs, rhsObject);
  }

  public Object doCompare(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseCompare(lhs, rhsObject);
  }

  public Object doCompare(final Object lhs, final BigDecimal rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseCompare(lhs, rhsObject);
  }

  public Object doReverseCompare(final byte lhs, final Object rhs) {
  final Object lhsObject = NgByte.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseCompare(lhsObject, rhs);
  }

  public Object doReverseCompare(final char lhs, final Object rhs) {
  final Object lhsObject = NgChar.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseCompare(lhsObject, rhs);
  }

  public Object doReverseCompare(final short lhs, final Object rhs) {
  final Object lhsObject = NgShort.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseCompare(lhsObject, rhs);
  }

  public Object doReverseCompare(final int lhs, final Object rhs) {
  final Object lhsObject = NgInt.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseCompare(lhsObject, rhs);
  }

  public Object doReverseCompare(final long lhs, final Object rhs) {
  final Object lhsObject = NgLong.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseCompare(lhsObject, rhs);
  }

  public Object doReverseCompare(final float lhs, final Object rhs) {
  final Object lhsObject = NgFloat.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseCompare(lhsObject, rhs);
  }

  public Object doReverseCompare(final double lhs, final Object rhs) {
  final Object lhsObject = NgDouble.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseCompare(lhsObject, rhs);
  }

  public Object doReverseCompare(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseCompare(lhsObject, rhs);
  }

  public Object doReverseCompare(final BigDecimal lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseCompare(lhsObject, rhs);
  }

  //
  //   Internal methods for operator ==
  //
  //  These methods can be overidden to implement ==
  //  If the underlying object does not have the appropriate method
  //
  public Object doEquals(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.equals(lhs, rhs);
    
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("equals", rhs).call(lhs, rhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEquals(lhs, rhs);
        }
      }

      return result;
    }
    
    public Object doReverseEquals(final Object lhs, final Object rhs) {
    final Object result = this.instanceHandler.reverseEquals(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        return this.instanceHandler.getMetaMethodQuick("reverseEquals", lhs).call(rhs, lhs);
      }

      return result;
    }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doEquals(final byte lhs, final byte rhs) {
    return doEquals(NgByte.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doEquals(final byte lhs, final char rhs) {
    return doEquals(NgByte.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doEquals(final byte lhs, final short rhs) {
    return doEquals(NgByte.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doEquals(final byte lhs, final int rhs) {
    return doEquals(NgByte.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doEquals(final byte lhs, final long rhs) {
    return doEquals(NgByte.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doEquals(final byte lhs, final float rhs) {
    return doEquals(NgByte.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doEquals(final byte lhs, final double rhs) {
    return doEquals(NgByte.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doEquals(final byte lhs, final BigInteger rhs) {
    return doEquals(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doEquals(final byte lhs, final BigDecimal rhs) {
    return doEquals(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doEquals(final char lhs, final byte rhs) {
    return doEquals(NgChar.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doEquals(final char lhs, final char rhs) {
    return doEquals(NgChar.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doEquals(final char lhs, final short rhs) {
    return doEquals(NgChar.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doEquals(final char lhs, final int rhs) {
    return doEquals(NgChar.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doEquals(final char lhs, final long rhs) {
    return doEquals(NgChar.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doEquals(final char lhs, final float rhs) {
    return doEquals(NgChar.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doEquals(final char lhs, final double rhs) {
    return doEquals(NgChar.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doEquals(final char lhs, final BigInteger rhs) {
    return doEquals(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doEquals(final char lhs, final BigDecimal rhs) {
    return doEquals(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doEquals(final short lhs, final byte rhs) {
    return doEquals(NgShort.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doEquals(final short lhs, final char rhs) {
    return doEquals(NgShort.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doEquals(final short lhs, final short rhs) {
    return doEquals(NgShort.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doEquals(final short lhs, final int rhs) {
    return doEquals(NgShort.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doEquals(final short lhs, final long rhs) {
    return doEquals(NgShort.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doEquals(final short lhs, final float rhs) {
    return doEquals(NgShort.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doEquals(final short lhs, final double rhs) {
    return doEquals(NgShort.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doEquals(final short lhs, final BigInteger rhs) {
    return doEquals(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doEquals(final short lhs, final BigDecimal rhs) {
    return doEquals(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doEquals(final int lhs, final byte rhs) {
    return doEquals(NgInt.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doEquals(final int lhs, final char rhs) {
    return doEquals(NgInt.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doEquals(final int lhs, final short rhs) {
    return doEquals(NgInt.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doEquals(final int lhs, final int rhs) {
    return doEquals(NgInt.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doEquals(final int lhs, final long rhs) {
    return doEquals(NgInt.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doEquals(final int lhs, final float rhs) {
    return doEquals(NgInt.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doEquals(final int lhs, final double rhs) {
    return doEquals(NgInt.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doEquals(final int lhs, final BigInteger rhs) {
    return doEquals(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doEquals(final int lhs, final BigDecimal rhs) {
    return doEquals(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doEquals(final long lhs, final byte rhs) {
    return doEquals(NgLong.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doEquals(final long lhs, final char rhs) {
    return doEquals(NgLong.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doEquals(final long lhs, final short rhs) {
    return doEquals(NgLong.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doEquals(final long lhs, final int rhs) {
    return doEquals(NgLong.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doEquals(final long lhs, final long rhs) {
    return doEquals(NgLong.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doEquals(final long lhs, final float rhs) {
    return doEquals(NgLong.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doEquals(final long lhs, final double rhs) {
    return doEquals(NgLong.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doEquals(final long lhs, final BigInteger rhs) {
    return doEquals(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doEquals(final long lhs, final BigDecimal rhs) {
    return doEquals(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doEquals(final float lhs, final byte rhs) {
    return doEquals(NgFloat.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doEquals(final float lhs, final char rhs) {
    return doEquals(NgFloat.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doEquals(final float lhs, final short rhs) {
    return doEquals(NgFloat.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doEquals(final float lhs, final int rhs) {
    return doEquals(NgFloat.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doEquals(final float lhs, final long rhs) {
    return doEquals(NgFloat.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doEquals(final float lhs, final float rhs) {
    return doEquals(NgFloat.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doEquals(final float lhs, final double rhs) {
    return doEquals(NgFloat.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doEquals(final float lhs, final BigInteger rhs) {
    return doEquals(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doEquals(final float lhs, final BigDecimal rhs) {
    return doEquals(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doEquals(final double lhs, final byte rhs) {
    return doEquals(NgDouble.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doEquals(final double lhs, final char rhs) {
    return doEquals(NgDouble.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doEquals(final double lhs, final short rhs) {
    return doEquals(NgDouble.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doEquals(final double lhs, final int rhs) {
    return doEquals(NgDouble.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doEquals(final double lhs, final long rhs) {
    return doEquals(NgDouble.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doEquals(final double lhs, final float rhs) {
    return doEquals(NgDouble.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doEquals(final double lhs, final double rhs) {
    return doEquals(NgDouble.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doEquals(final double lhs, final BigInteger rhs) {
    return doEquals(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doEquals(final double lhs, final BigDecimal rhs) {
    return doEquals(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doEquals(final BigInteger lhs, final byte rhs) {
    return doEquals((Object)lhs, NgByte.valueOf(rhs));
  }

  public Object doEquals(final BigInteger lhs, final char rhs) {
    return doEquals((Object)lhs, NgChar.valueOf(rhs));
  }

  public Object doEquals(final BigInteger lhs, final short rhs) {
    return doEquals((Object)lhs, NgShort.valueOf(rhs));
  }

  public Object doEquals(final BigInteger lhs, final int rhs) {
    return doEquals((Object)lhs, NgInt.valueOf(rhs));
  }

  public Object doEquals(final BigInteger lhs, final long rhs) {
    return doEquals((Object)lhs, NgLong.valueOf(rhs));
  }

  public Object doEquals(final BigInteger lhs, final float rhs) {
    return doEquals((Object)lhs, NgFloat.valueOf(rhs));
  }

  public Object doEquals(final BigInteger lhs, final double rhs) {
    return doEquals((Object)lhs, NgDouble.valueOf(rhs));
  }

  public Object doEquals(final BigInteger lhs, final BigInteger rhs) {
    return doEquals((Object)lhs, (Object)rhs);
  }

  public Object doEquals(final BigInteger lhs, final BigDecimal rhs) {
    return doEquals((Object)lhs, (Object)rhs);
  }

  public Object doEquals(final BigDecimal lhs, final byte rhs) {
    return doEquals((Object)lhs, NgByte.valueOf(rhs));
  }

  public Object doEquals(final BigDecimal lhs, final char rhs) {
    return doEquals((Object)lhs, NgChar.valueOf(rhs));
  }

  public Object doEquals(final BigDecimal lhs, final short rhs) {
    return doEquals((Object)lhs, NgShort.valueOf(rhs));
  }

  public Object doEquals(final BigDecimal lhs, final int rhs) {
    return doEquals((Object)lhs, NgInt.valueOf(rhs));
  }

  public Object doEquals(final BigDecimal lhs, final long rhs) {
    return doEquals((Object)lhs, NgLong.valueOf(rhs));
  }

  public Object doEquals(final BigDecimal lhs, final float rhs) {
    return doEquals((Object)lhs, NgFloat.valueOf(rhs));
  }

  public Object doEquals(final BigDecimal lhs, final double rhs) {
    return doEquals((Object)lhs, NgDouble.valueOf(rhs));
  }

  public Object doEquals(final BigDecimal lhs, final BigInteger rhs) {
    return doEquals((Object)lhs, (Object)rhs);
  }

  public Object doEquals(final BigDecimal lhs, final BigDecimal rhs) {
    return doEquals((Object)lhs, (Object)rhs);
  }

  public Object doEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = NgByte.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseEquals(lhs, rhsObject);
  }

  public Object doEquals(final Object lhs, final char rhs) {
  final Object rhsObject = NgChar.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseEquals(lhs, rhsObject);
  }

  public Object doEquals(final Object lhs, final short rhs) {
  final Object rhsObject = NgShort.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseEquals(lhs, rhsObject);
  }

  public Object doEquals(final Object lhs, final int rhs) {
  final Object rhsObject = NgInt.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseEquals(lhs, rhsObject);
  }

  public Object doEquals(final Object lhs, final long rhs) {
  final Object rhsObject = NgLong.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseEquals(lhs, rhsObject);
  }

  public Object doEquals(final Object lhs, final float rhs) {
  final Object rhsObject = NgFloat.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseEquals(lhs, rhsObject);
  }

  public Object doEquals(final Object lhs, final double rhs) {
  final Object rhsObject = NgDouble.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseEquals(lhs, rhsObject);
  }

  public Object doEquals(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseEquals(lhs, rhsObject);
  }

  public Object doEquals(final Object lhs, final BigDecimal rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseEquals(lhs, rhsObject);
  }

  public Object doReverseEquals(final byte lhs, final Object rhs) {
  final Object lhsObject = NgByte.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEquals(lhsObject, rhs);
  }

  public Object doReverseEquals(final char lhs, final Object rhs) {
  final Object lhsObject = NgChar.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEquals(lhsObject, rhs);
  }

  public Object doReverseEquals(final short lhs, final Object rhs) {
  final Object lhsObject = NgShort.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEquals(lhsObject, rhs);
  }

  public Object doReverseEquals(final int lhs, final Object rhs) {
  final Object lhsObject = NgInt.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEquals(lhsObject, rhs);
  }

  public Object doReverseEquals(final long lhs, final Object rhs) {
  final Object lhsObject = NgLong.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEquals(lhsObject, rhs);
  }

  public Object doReverseEquals(final float lhs, final Object rhs) {
  final Object lhsObject = NgFloat.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEquals(lhsObject, rhs);
  }

  public Object doReverseEquals(final double lhs, final Object rhs) {
  final Object lhsObject = NgDouble.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEquals(lhsObject, rhs);
  }

  public Object doReverseEquals(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEquals(lhsObject, rhs);
  }

  public Object doReverseEquals(final BigDecimal lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEquals(lhsObject, rhs);
  }

  //
  //   Internal methods for operator !=
  //
  //  These methods can be overidden to implement !=
  //  If the underlying object does not have the appropriate method
  //
  public Object doNotEquals(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.notEquals(lhs, rhs);
    
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("notEquals", rhs).call(lhs, rhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          result = NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEquals(lhs, rhs);
          
          if (result == RuntimeMetaClassImpl.NOT_CALLED) {
            result = doEquals(lhs, rhs);
            
            if (result != RuntimeMetaClassImpl.NOT_CALLED) {
              return NgSystem.metaClassRegistry.getInternalMetaClass(result).doNot(result);
            }
          }
        }
      }

      return result;
    }
    
    public Object doReverseNotEquals(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.reverseNotEquals(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("reverseNotEquals", lhs).call(rhs, lhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          result = doReverseEquals(lhs, rhs);
          
          if (result != RuntimeMetaClassImpl.NOT_CALLED) {
            return NgSystem.metaClassRegistry.getInternalMetaClass(result).doNot(result);
          }
        }
      }

      return result;
    }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doNotEquals(final byte lhs, final byte rhs) {
    return doNotEquals(NgByte.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doNotEquals(final byte lhs, final char rhs) {
    return doNotEquals(NgByte.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doNotEquals(final byte lhs, final short rhs) {
    return doNotEquals(NgByte.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doNotEquals(final byte lhs, final int rhs) {
    return doNotEquals(NgByte.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doNotEquals(final byte lhs, final long rhs) {
    return doNotEquals(NgByte.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doNotEquals(final byte lhs, final float rhs) {
    return doNotEquals(NgByte.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doNotEquals(final byte lhs, final double rhs) {
    return doNotEquals(NgByte.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doNotEquals(final byte lhs, final BigInteger rhs) {
    return doNotEquals(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doNotEquals(final byte lhs, final BigDecimal rhs) {
    return doNotEquals(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doNotEquals(final char lhs, final byte rhs) {
    return doNotEquals(NgChar.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doNotEquals(final char lhs, final char rhs) {
    return doNotEquals(NgChar.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doNotEquals(final char lhs, final short rhs) {
    return doNotEquals(NgChar.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doNotEquals(final char lhs, final int rhs) {
    return doNotEquals(NgChar.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doNotEquals(final char lhs, final long rhs) {
    return doNotEquals(NgChar.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doNotEquals(final char lhs, final float rhs) {
    return doNotEquals(NgChar.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doNotEquals(final char lhs, final double rhs) {
    return doNotEquals(NgChar.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doNotEquals(final char lhs, final BigInteger rhs) {
    return doNotEquals(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doNotEquals(final char lhs, final BigDecimal rhs) {
    return doNotEquals(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doNotEquals(final short lhs, final byte rhs) {
    return doNotEquals(NgShort.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doNotEquals(final short lhs, final char rhs) {
    return doNotEquals(NgShort.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doNotEquals(final short lhs, final short rhs) {
    return doNotEquals(NgShort.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doNotEquals(final short lhs, final int rhs) {
    return doNotEquals(NgShort.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doNotEquals(final short lhs, final long rhs) {
    return doNotEquals(NgShort.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doNotEquals(final short lhs, final float rhs) {
    return doNotEquals(NgShort.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doNotEquals(final short lhs, final double rhs) {
    return doNotEquals(NgShort.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doNotEquals(final short lhs, final BigInteger rhs) {
    return doNotEquals(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doNotEquals(final short lhs, final BigDecimal rhs) {
    return doNotEquals(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doNotEquals(final int lhs, final byte rhs) {
    return doNotEquals(NgInt.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doNotEquals(final int lhs, final char rhs) {
    return doNotEquals(NgInt.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doNotEquals(final int lhs, final short rhs) {
    return doNotEquals(NgInt.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doNotEquals(final int lhs, final int rhs) {
    return doNotEquals(NgInt.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doNotEquals(final int lhs, final long rhs) {
    return doNotEquals(NgInt.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doNotEquals(final int lhs, final float rhs) {
    return doNotEquals(NgInt.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doNotEquals(final int lhs, final double rhs) {
    return doNotEquals(NgInt.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doNotEquals(final int lhs, final BigInteger rhs) {
    return doNotEquals(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doNotEquals(final int lhs, final BigDecimal rhs) {
    return doNotEquals(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doNotEquals(final long lhs, final byte rhs) {
    return doNotEquals(NgLong.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doNotEquals(final long lhs, final char rhs) {
    return doNotEquals(NgLong.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doNotEquals(final long lhs, final short rhs) {
    return doNotEquals(NgLong.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doNotEquals(final long lhs, final int rhs) {
    return doNotEquals(NgLong.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doNotEquals(final long lhs, final long rhs) {
    return doNotEquals(NgLong.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doNotEquals(final long lhs, final float rhs) {
    return doNotEquals(NgLong.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doNotEquals(final long lhs, final double rhs) {
    return doNotEquals(NgLong.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doNotEquals(final long lhs, final BigInteger rhs) {
    return doNotEquals(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doNotEquals(final long lhs, final BigDecimal rhs) {
    return doNotEquals(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doNotEquals(final float lhs, final byte rhs) {
    return doNotEquals(NgFloat.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doNotEquals(final float lhs, final char rhs) {
    return doNotEquals(NgFloat.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doNotEquals(final float lhs, final short rhs) {
    return doNotEquals(NgFloat.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doNotEquals(final float lhs, final int rhs) {
    return doNotEquals(NgFloat.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doNotEquals(final float lhs, final long rhs) {
    return doNotEquals(NgFloat.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doNotEquals(final float lhs, final float rhs) {
    return doNotEquals(NgFloat.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doNotEquals(final float lhs, final double rhs) {
    return doNotEquals(NgFloat.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doNotEquals(final float lhs, final BigInteger rhs) {
    return doNotEquals(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doNotEquals(final float lhs, final BigDecimal rhs) {
    return doNotEquals(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doNotEquals(final double lhs, final byte rhs) {
    return doNotEquals(NgDouble.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doNotEquals(final double lhs, final char rhs) {
    return doNotEquals(NgDouble.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doNotEquals(final double lhs, final short rhs) {
    return doNotEquals(NgDouble.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doNotEquals(final double lhs, final int rhs) {
    return doNotEquals(NgDouble.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doNotEquals(final double lhs, final long rhs) {
    return doNotEquals(NgDouble.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doNotEquals(final double lhs, final float rhs) {
    return doNotEquals(NgDouble.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doNotEquals(final double lhs, final double rhs) {
    return doNotEquals(NgDouble.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doNotEquals(final double lhs, final BigInteger rhs) {
    return doNotEquals(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doNotEquals(final double lhs, final BigDecimal rhs) {
    return doNotEquals(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doNotEquals(final BigInteger lhs, final byte rhs) {
    return doNotEquals((Object)lhs, NgByte.valueOf(rhs));
  }

  public Object doNotEquals(final BigInteger lhs, final char rhs) {
    return doNotEquals((Object)lhs, NgChar.valueOf(rhs));
  }

  public Object doNotEquals(final BigInteger lhs, final short rhs) {
    return doNotEquals((Object)lhs, NgShort.valueOf(rhs));
  }

  public Object doNotEquals(final BigInteger lhs, final int rhs) {
    return doNotEquals((Object)lhs, NgInt.valueOf(rhs));
  }

  public Object doNotEquals(final BigInteger lhs, final long rhs) {
    return doNotEquals((Object)lhs, NgLong.valueOf(rhs));
  }

  public Object doNotEquals(final BigInteger lhs, final float rhs) {
    return doNotEquals((Object)lhs, NgFloat.valueOf(rhs));
  }

  public Object doNotEquals(final BigInteger lhs, final double rhs) {
    return doNotEquals((Object)lhs, NgDouble.valueOf(rhs));
  }

  public Object doNotEquals(final BigInteger lhs, final BigInteger rhs) {
    return doNotEquals((Object)lhs, (Object)rhs);
  }

  public Object doNotEquals(final BigInteger lhs, final BigDecimal rhs) {
    return doNotEquals((Object)lhs, (Object)rhs);
  }

  public Object doNotEquals(final BigDecimal lhs, final byte rhs) {
    return doNotEquals((Object)lhs, NgByte.valueOf(rhs));
  }

  public Object doNotEquals(final BigDecimal lhs, final char rhs) {
    return doNotEquals((Object)lhs, NgChar.valueOf(rhs));
  }

  public Object doNotEquals(final BigDecimal lhs, final short rhs) {
    return doNotEquals((Object)lhs, NgShort.valueOf(rhs));
  }

  public Object doNotEquals(final BigDecimal lhs, final int rhs) {
    return doNotEquals((Object)lhs, NgInt.valueOf(rhs));
  }

  public Object doNotEquals(final BigDecimal lhs, final long rhs) {
    return doNotEquals((Object)lhs, NgLong.valueOf(rhs));
  }

  public Object doNotEquals(final BigDecimal lhs, final float rhs) {
    return doNotEquals((Object)lhs, NgFloat.valueOf(rhs));
  }

  public Object doNotEquals(final BigDecimal lhs, final double rhs) {
    return doNotEquals((Object)lhs, NgDouble.valueOf(rhs));
  }

  public Object doNotEquals(final BigDecimal lhs, final BigInteger rhs) {
    return doNotEquals((Object)lhs, (Object)rhs);
  }

  public Object doNotEquals(final BigDecimal lhs, final BigDecimal rhs) {
    return doNotEquals((Object)lhs, (Object)rhs);
  }

  public Object doNotEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = NgByte.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseNotEquals(lhs, rhsObject);
  }

  public Object doNotEquals(final Object lhs, final char rhs) {
  final Object rhsObject = NgChar.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseNotEquals(lhs, rhsObject);
  }

  public Object doNotEquals(final Object lhs, final short rhs) {
  final Object rhsObject = NgShort.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseNotEquals(lhs, rhsObject);
  }

  public Object doNotEquals(final Object lhs, final int rhs) {
  final Object rhsObject = NgInt.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseNotEquals(lhs, rhsObject);
  }

  public Object doNotEquals(final Object lhs, final long rhs) {
  final Object rhsObject = NgLong.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseNotEquals(lhs, rhsObject);
  }

  public Object doNotEquals(final Object lhs, final float rhs) {
  final Object rhsObject = NgFloat.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseNotEquals(lhs, rhsObject);
  }

  public Object doNotEquals(final Object lhs, final double rhs) {
  final Object rhsObject = NgDouble.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseNotEquals(lhs, rhsObject);
  }

  public Object doNotEquals(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseNotEquals(lhs, rhsObject);
  }

  public Object doNotEquals(final Object lhs, final BigDecimal rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseNotEquals(lhs, rhsObject);
  }

  public Object doReverseNotEquals(final byte lhs, final Object rhs) {
  final Object lhsObject = NgByte.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEquals(lhsObject, rhs);
  }

  public Object doReverseNotEquals(final char lhs, final Object rhs) {
  final Object lhsObject = NgChar.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEquals(lhsObject, rhs);
  }

  public Object doReverseNotEquals(final short lhs, final Object rhs) {
  final Object lhsObject = NgShort.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEquals(lhsObject, rhs);
  }

  public Object doReverseNotEquals(final int lhs, final Object rhs) {
  final Object lhsObject = NgInt.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEquals(lhsObject, rhs);
  }

  public Object doReverseNotEquals(final long lhs, final Object rhs) {
  final Object lhsObject = NgLong.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEquals(lhsObject, rhs);
  }

  public Object doReverseNotEquals(final float lhs, final Object rhs) {
  final Object lhsObject = NgFloat.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEquals(lhsObject, rhs);
  }

  public Object doReverseNotEquals(final double lhs, final Object rhs) {
  final Object lhsObject = NgDouble.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEquals(lhsObject, rhs);
  }

  public Object doReverseNotEquals(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEquals(lhsObject, rhs);
  }

  public Object doReverseNotEquals(final BigDecimal lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEquals(lhsObject, rhs);
  }

  //
  //   Internal methods for operator <
  //
  //  These methods can be overidden to implement <
  //  If the underlying object does not have the appropriate method
  //
  public Object doLessThan(final Object lhs, final Object rhs) {
  Object result = this.instanceHandler.lessThan(lhs, rhs);
    
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("lessThan", rhs).call(lhs, rhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          result = NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThan(lhs, rhs);
          
          if (result == RuntimeMetaClassImpl.NOT_CALLED) {
            result = doCompare(lhs, rhs);
            
            if (result != RuntimeMetaClassImpl.NOT_CALLED) {
              return NgSystem.metaClassRegistry.getInternalMetaClass(result).doLessThan(result, NgInt.ZERO);
            }
          }
        }
      }

      return result;
    }
    
    public Object doReverseLessThan(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.reverseLessThan(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("reverseLessThan", lhs).call(rhs, lhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          result = doReverseCompare(lhs, rhs);
          
          if (result != RuntimeMetaClassImpl.NOT_CALLED) {
            return NgSystem.metaClassRegistry.getInternalMetaClass(result).doLessThan(result, NgInt.ZERO);
          }
        }
      }

      return result;
    }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doLessThan(final byte lhs, final byte rhs) {
    return doLessThan(NgByte.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLessThan(final byte lhs, final char rhs) {
    return doLessThan(NgByte.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLessThan(final byte lhs, final short rhs) {
    return doLessThan(NgByte.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLessThan(final byte lhs, final int rhs) {
    return doLessThan(NgByte.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLessThan(final byte lhs, final long rhs) {
    return doLessThan(NgByte.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLessThan(final byte lhs, final float rhs) {
    return doLessThan(NgByte.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doLessThan(final byte lhs, final double rhs) {
    return doLessThan(NgByte.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doLessThan(final byte lhs, final BigInteger rhs) {
    return doLessThan(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doLessThan(final byte lhs, final BigDecimal rhs) {
    return doLessThan(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doLessThan(final char lhs, final byte rhs) {
    return doLessThan(NgChar.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLessThan(final char lhs, final char rhs) {
    return doLessThan(NgChar.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLessThan(final char lhs, final short rhs) {
    return doLessThan(NgChar.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLessThan(final char lhs, final int rhs) {
    return doLessThan(NgChar.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLessThan(final char lhs, final long rhs) {
    return doLessThan(NgChar.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLessThan(final char lhs, final float rhs) {
    return doLessThan(NgChar.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doLessThan(final char lhs, final double rhs) {
    return doLessThan(NgChar.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doLessThan(final char lhs, final BigInteger rhs) {
    return doLessThan(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doLessThan(final char lhs, final BigDecimal rhs) {
    return doLessThan(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doLessThan(final short lhs, final byte rhs) {
    return doLessThan(NgShort.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLessThan(final short lhs, final char rhs) {
    return doLessThan(NgShort.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLessThan(final short lhs, final short rhs) {
    return doLessThan(NgShort.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLessThan(final short lhs, final int rhs) {
    return doLessThan(NgShort.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLessThan(final short lhs, final long rhs) {
    return doLessThan(NgShort.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLessThan(final short lhs, final float rhs) {
    return doLessThan(NgShort.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doLessThan(final short lhs, final double rhs) {
    return doLessThan(NgShort.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doLessThan(final short lhs, final BigInteger rhs) {
    return doLessThan(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doLessThan(final short lhs, final BigDecimal rhs) {
    return doLessThan(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doLessThan(final int lhs, final byte rhs) {
    return doLessThan(NgInt.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLessThan(final int lhs, final char rhs) {
    return doLessThan(NgInt.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLessThan(final int lhs, final short rhs) {
    return doLessThan(NgInt.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLessThan(final int lhs, final int rhs) {
    return doLessThan(NgInt.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLessThan(final int lhs, final long rhs) {
    return doLessThan(NgInt.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLessThan(final int lhs, final float rhs) {
    return doLessThan(NgInt.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doLessThan(final int lhs, final double rhs) {
    return doLessThan(NgInt.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doLessThan(final int lhs, final BigInteger rhs) {
    return doLessThan(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doLessThan(final int lhs, final BigDecimal rhs) {
    return doLessThan(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doLessThan(final long lhs, final byte rhs) {
    return doLessThan(NgLong.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLessThan(final long lhs, final char rhs) {
    return doLessThan(NgLong.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLessThan(final long lhs, final short rhs) {
    return doLessThan(NgLong.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLessThan(final long lhs, final int rhs) {
    return doLessThan(NgLong.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLessThan(final long lhs, final long rhs) {
    return doLessThan(NgLong.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLessThan(final long lhs, final float rhs) {
    return doLessThan(NgLong.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doLessThan(final long lhs, final double rhs) {
    return doLessThan(NgLong.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doLessThan(final long lhs, final BigInteger rhs) {
    return doLessThan(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doLessThan(final long lhs, final BigDecimal rhs) {
    return doLessThan(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doLessThan(final float lhs, final byte rhs) {
    return doLessThan(NgFloat.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLessThan(final float lhs, final char rhs) {
    return doLessThan(NgFloat.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLessThan(final float lhs, final short rhs) {
    return doLessThan(NgFloat.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLessThan(final float lhs, final int rhs) {
    return doLessThan(NgFloat.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLessThan(final float lhs, final long rhs) {
    return doLessThan(NgFloat.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLessThan(final float lhs, final float rhs) {
    return doLessThan(NgFloat.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doLessThan(final float lhs, final double rhs) {
    return doLessThan(NgFloat.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doLessThan(final float lhs, final BigInteger rhs) {
    return doLessThan(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doLessThan(final float lhs, final BigDecimal rhs) {
    return doLessThan(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doLessThan(final double lhs, final byte rhs) {
    return doLessThan(NgDouble.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLessThan(final double lhs, final char rhs) {
    return doLessThan(NgDouble.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLessThan(final double lhs, final short rhs) {
    return doLessThan(NgDouble.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLessThan(final double lhs, final int rhs) {
    return doLessThan(NgDouble.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLessThan(final double lhs, final long rhs) {
    return doLessThan(NgDouble.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLessThan(final double lhs, final float rhs) {
    return doLessThan(NgDouble.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doLessThan(final double lhs, final double rhs) {
    return doLessThan(NgDouble.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doLessThan(final double lhs, final BigInteger rhs) {
    return doLessThan(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doLessThan(final double lhs, final BigDecimal rhs) {
    return doLessThan(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doLessThan(final BigInteger lhs, final byte rhs) {
    return doLessThan((Object)lhs, NgByte.valueOf(rhs));
  }

  public Object doLessThan(final BigInteger lhs, final char rhs) {
    return doLessThan((Object)lhs, NgChar.valueOf(rhs));
  }

  public Object doLessThan(final BigInteger lhs, final short rhs) {
    return doLessThan((Object)lhs, NgShort.valueOf(rhs));
  }

  public Object doLessThan(final BigInteger lhs, final int rhs) {
    return doLessThan((Object)lhs, NgInt.valueOf(rhs));
  }

  public Object doLessThan(final BigInteger lhs, final long rhs) {
    return doLessThan((Object)lhs, NgLong.valueOf(rhs));
  }

  public Object doLessThan(final BigInteger lhs, final float rhs) {
    return doLessThan((Object)lhs, NgFloat.valueOf(rhs));
  }

  public Object doLessThan(final BigInteger lhs, final double rhs) {
    return doLessThan((Object)lhs, NgDouble.valueOf(rhs));
  }

  public Object doLessThan(final BigInteger lhs, final BigInteger rhs) {
    return doLessThan((Object)lhs, (Object)rhs);
  }

  public Object doLessThan(final BigInteger lhs, final BigDecimal rhs) {
    return doLessThan((Object)lhs, (Object)rhs);
  }

  public Object doLessThan(final BigDecimal lhs, final byte rhs) {
    return doLessThan((Object)lhs, NgByte.valueOf(rhs));
  }

  public Object doLessThan(final BigDecimal lhs, final char rhs) {
    return doLessThan((Object)lhs, NgChar.valueOf(rhs));
  }

  public Object doLessThan(final BigDecimal lhs, final short rhs) {
    return doLessThan((Object)lhs, NgShort.valueOf(rhs));
  }

  public Object doLessThan(final BigDecimal lhs, final int rhs) {
    return doLessThan((Object)lhs, NgInt.valueOf(rhs));
  }

  public Object doLessThan(final BigDecimal lhs, final long rhs) {
    return doLessThan((Object)lhs, NgLong.valueOf(rhs));
  }

  public Object doLessThan(final BigDecimal lhs, final float rhs) {
    return doLessThan((Object)lhs, NgFloat.valueOf(rhs));
  }

  public Object doLessThan(final BigDecimal lhs, final double rhs) {
    return doLessThan((Object)lhs, NgDouble.valueOf(rhs));
  }

  public Object doLessThan(final BigDecimal lhs, final BigInteger rhs) {
    return doLessThan((Object)lhs, (Object)rhs);
  }

  public Object doLessThan(final BigDecimal lhs, final BigDecimal rhs) {
    return doLessThan((Object)lhs, (Object)rhs);
  }

  public Object doLessThan(final Object lhs, final byte rhs) {
  final Object rhsObject = NgByte.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLessThan(lhs, rhsObject);
  }

  public Object doLessThan(final Object lhs, final char rhs) {
  final Object rhsObject = NgChar.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLessThan(lhs, rhsObject);
  }

  public Object doLessThan(final Object lhs, final short rhs) {
  final Object rhsObject = NgShort.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLessThan(lhs, rhsObject);
  }

  public Object doLessThan(final Object lhs, final int rhs) {
  final Object rhsObject = NgInt.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLessThan(lhs, rhsObject);
  }

  public Object doLessThan(final Object lhs, final long rhs) {
  final Object rhsObject = NgLong.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLessThan(lhs, rhsObject);
  }

  public Object doLessThan(final Object lhs, final float rhs) {
  final Object rhsObject = NgFloat.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLessThan(lhs, rhsObject);
  }

  public Object doLessThan(final Object lhs, final double rhs) {
  final Object rhsObject = NgDouble.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLessThan(lhs, rhsObject);
  }

  public Object doLessThan(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLessThan(lhs, rhsObject);
  }

  public Object doLessThan(final Object lhs, final BigDecimal rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLessThan(lhs, rhsObject);
  }

  public Object doReverseLessThan(final byte lhs, final Object rhs) {
  final Object lhsObject = NgByte.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThan(lhsObject, rhs);
  }

  public Object doReverseLessThan(final char lhs, final Object rhs) {
  final Object lhsObject = NgChar.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThan(lhsObject, rhs);
  }

  public Object doReverseLessThan(final short lhs, final Object rhs) {
  final Object lhsObject = NgShort.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThan(lhsObject, rhs);
  }

  public Object doReverseLessThan(final int lhs, final Object rhs) {
  final Object lhsObject = NgInt.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThan(lhsObject, rhs);
  }

  public Object doReverseLessThan(final long lhs, final Object rhs) {
  final Object lhsObject = NgLong.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThan(lhsObject, rhs);
  }

  public Object doReverseLessThan(final float lhs, final Object rhs) {
  final Object lhsObject = NgFloat.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThan(lhsObject, rhs);
  }

  public Object doReverseLessThan(final double lhs, final Object rhs) {
  final Object lhsObject = NgDouble.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThan(lhsObject, rhs);
  }

  public Object doReverseLessThan(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThan(lhsObject, rhs);
  }

  public Object doReverseLessThan(final BigDecimal lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThan(lhsObject, rhs);
  }

  //
  //   Internal methods for operator <=
  //
  //  These methods can be overidden to implement <=
  //  If the underlying object does not have the appropriate method
  //
  public Object doLessThanOrEquals(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.lessThanOrEquals(lhs, rhs);
    
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("lessThanOrEquals", rhs).call(lhs, rhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          result = NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEquals(lhs, rhs);
          
          if (result == RuntimeMetaClassImpl.NOT_CALLED) {
            result = doCompare(lhs, rhs);
            
            if (result != RuntimeMetaClassImpl.NOT_CALLED) {
              return NgSystem.metaClassRegistry.getInternalMetaClass(result).doLessThanOrEquals(result, NgInt.ZERO);
            }
          }
        }
      }

      return result;
    }
    
    public Object doReverseLessThanOrEquals(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.reverseLessThanOrEquals(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("reverseLessThanOrEquals", lhs).call(rhs, lhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          result = doReverseCompare(lhs, rhs);
          
          if (result != RuntimeMetaClassImpl.NOT_CALLED) {
            return NgSystem.metaClassRegistry.getInternalMetaClass(result).doLessThanOrEquals(result, NgInt.ZERO);
          }
        }
      }

      return result;
    }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doLessThanOrEquals(final byte lhs, final byte rhs) {
    return doLessThanOrEquals(NgByte.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final byte lhs, final char rhs) {
    return doLessThanOrEquals(NgByte.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final byte lhs, final short rhs) {
    return doLessThanOrEquals(NgByte.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final byte lhs, final int rhs) {
    return doLessThanOrEquals(NgByte.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final byte lhs, final long rhs) {
    return doLessThanOrEquals(NgByte.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final byte lhs, final float rhs) {
    return doLessThanOrEquals(NgByte.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final byte lhs, final double rhs) {
    return doLessThanOrEquals(NgByte.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final byte lhs, final BigInteger rhs) {
    return doLessThanOrEquals(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doLessThanOrEquals(final byte lhs, final BigDecimal rhs) {
    return doLessThanOrEquals(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doLessThanOrEquals(final char lhs, final byte rhs) {
    return doLessThanOrEquals(NgChar.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final char lhs, final char rhs) {
    return doLessThanOrEquals(NgChar.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final char lhs, final short rhs) {
    return doLessThanOrEquals(NgChar.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final char lhs, final int rhs) {
    return doLessThanOrEquals(NgChar.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final char lhs, final long rhs) {
    return doLessThanOrEquals(NgChar.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final char lhs, final float rhs) {
    return doLessThanOrEquals(NgChar.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final char lhs, final double rhs) {
    return doLessThanOrEquals(NgChar.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final char lhs, final BigInteger rhs) {
    return doLessThanOrEquals(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doLessThanOrEquals(final char lhs, final BigDecimal rhs) {
    return doLessThanOrEquals(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doLessThanOrEquals(final short lhs, final byte rhs) {
    return doLessThanOrEquals(NgShort.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final short lhs, final char rhs) {
    return doLessThanOrEquals(NgShort.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final short lhs, final short rhs) {
    return doLessThanOrEquals(NgShort.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final short lhs, final int rhs) {
    return doLessThanOrEquals(NgShort.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final short lhs, final long rhs) {
    return doLessThanOrEquals(NgShort.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final short lhs, final float rhs) {
    return doLessThanOrEquals(NgShort.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final short lhs, final double rhs) {
    return doLessThanOrEquals(NgShort.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final short lhs, final BigInteger rhs) {
    return doLessThanOrEquals(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doLessThanOrEquals(final short lhs, final BigDecimal rhs) {
    return doLessThanOrEquals(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doLessThanOrEquals(final int lhs, final byte rhs) {
    return doLessThanOrEquals(NgInt.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final int lhs, final char rhs) {
    return doLessThanOrEquals(NgInt.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final int lhs, final short rhs) {
    return doLessThanOrEquals(NgInt.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final int lhs, final int rhs) {
    return doLessThanOrEquals(NgInt.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final int lhs, final long rhs) {
    return doLessThanOrEquals(NgInt.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final int lhs, final float rhs) {
    return doLessThanOrEquals(NgInt.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final int lhs, final double rhs) {
    return doLessThanOrEquals(NgInt.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final int lhs, final BigInteger rhs) {
    return doLessThanOrEquals(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doLessThanOrEquals(final int lhs, final BigDecimal rhs) {
    return doLessThanOrEquals(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doLessThanOrEquals(final long lhs, final byte rhs) {
    return doLessThanOrEquals(NgLong.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final long lhs, final char rhs) {
    return doLessThanOrEquals(NgLong.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final long lhs, final short rhs) {
    return doLessThanOrEquals(NgLong.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final long lhs, final int rhs) {
    return doLessThanOrEquals(NgLong.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final long lhs, final long rhs) {
    return doLessThanOrEquals(NgLong.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final long lhs, final float rhs) {
    return doLessThanOrEquals(NgLong.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final long lhs, final double rhs) {
    return doLessThanOrEquals(NgLong.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final long lhs, final BigInteger rhs) {
    return doLessThanOrEquals(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doLessThanOrEquals(final long lhs, final BigDecimal rhs) {
    return doLessThanOrEquals(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doLessThanOrEquals(final float lhs, final byte rhs) {
    return doLessThanOrEquals(NgFloat.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final float lhs, final char rhs) {
    return doLessThanOrEquals(NgFloat.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final float lhs, final short rhs) {
    return doLessThanOrEquals(NgFloat.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final float lhs, final int rhs) {
    return doLessThanOrEquals(NgFloat.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final float lhs, final long rhs) {
    return doLessThanOrEquals(NgFloat.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final float lhs, final float rhs) {
    return doLessThanOrEquals(NgFloat.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final float lhs, final double rhs) {
    return doLessThanOrEquals(NgFloat.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final float lhs, final BigInteger rhs) {
    return doLessThanOrEquals(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doLessThanOrEquals(final float lhs, final BigDecimal rhs) {
    return doLessThanOrEquals(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doLessThanOrEquals(final double lhs, final byte rhs) {
    return doLessThanOrEquals(NgDouble.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final double lhs, final char rhs) {
    return doLessThanOrEquals(NgDouble.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final double lhs, final short rhs) {
    return doLessThanOrEquals(NgDouble.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final double lhs, final int rhs) {
    return doLessThanOrEquals(NgDouble.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final double lhs, final long rhs) {
    return doLessThanOrEquals(NgDouble.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final double lhs, final float rhs) {
    return doLessThanOrEquals(NgDouble.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final double lhs, final double rhs) {
    return doLessThanOrEquals(NgDouble.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final double lhs, final BigInteger rhs) {
    return doLessThanOrEquals(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doLessThanOrEquals(final double lhs, final BigDecimal rhs) {
    return doLessThanOrEquals(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doLessThanOrEquals(final BigInteger lhs, final byte rhs) {
    return doLessThanOrEquals((Object)lhs, NgByte.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final BigInteger lhs, final char rhs) {
    return doLessThanOrEquals((Object)lhs, NgChar.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final BigInteger lhs, final short rhs) {
    return doLessThanOrEquals((Object)lhs, NgShort.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final BigInteger lhs, final int rhs) {
    return doLessThanOrEquals((Object)lhs, NgInt.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final BigInteger lhs, final long rhs) {
    return doLessThanOrEquals((Object)lhs, NgLong.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final BigInteger lhs, final float rhs) {
    return doLessThanOrEquals((Object)lhs, NgFloat.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final BigInteger lhs, final double rhs) {
    return doLessThanOrEquals((Object)lhs, NgDouble.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final BigInteger lhs, final BigInteger rhs) {
    return doLessThanOrEquals((Object)lhs, (Object)rhs);
  }

  public Object doLessThanOrEquals(final BigInteger lhs, final BigDecimal rhs) {
    return doLessThanOrEquals((Object)lhs, (Object)rhs);
  }

  public Object doLessThanOrEquals(final BigDecimal lhs, final byte rhs) {
    return doLessThanOrEquals((Object)lhs, NgByte.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final BigDecimal lhs, final char rhs) {
    return doLessThanOrEquals((Object)lhs, NgChar.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final BigDecimal lhs, final short rhs) {
    return doLessThanOrEquals((Object)lhs, NgShort.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final BigDecimal lhs, final int rhs) {
    return doLessThanOrEquals((Object)lhs, NgInt.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final BigDecimal lhs, final long rhs) {
    return doLessThanOrEquals((Object)lhs, NgLong.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final BigDecimal lhs, final float rhs) {
    return doLessThanOrEquals((Object)lhs, NgFloat.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final BigDecimal lhs, final double rhs) {
    return doLessThanOrEquals((Object)lhs, NgDouble.valueOf(rhs));
  }

  public Object doLessThanOrEquals(final BigDecimal lhs, final BigInteger rhs) {
    return doLessThanOrEquals((Object)lhs, (Object)rhs);
  }

  public Object doLessThanOrEquals(final BigDecimal lhs, final BigDecimal rhs) {
    return doLessThanOrEquals((Object)lhs, (Object)rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = NgByte.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLessThanOrEquals(lhs, rhsObject);
  }

  public Object doLessThanOrEquals(final Object lhs, final char rhs) {
  final Object rhsObject = NgChar.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLessThanOrEquals(lhs, rhsObject);
  }

  public Object doLessThanOrEquals(final Object lhs, final short rhs) {
  final Object rhsObject = NgShort.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLessThanOrEquals(lhs, rhsObject);
  }

  public Object doLessThanOrEquals(final Object lhs, final int rhs) {
  final Object rhsObject = NgInt.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLessThanOrEquals(lhs, rhsObject);
  }

  public Object doLessThanOrEquals(final Object lhs, final long rhs) {
  final Object rhsObject = NgLong.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLessThanOrEquals(lhs, rhsObject);
  }

  public Object doLessThanOrEquals(final Object lhs, final float rhs) {
  final Object rhsObject = NgFloat.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLessThanOrEquals(lhs, rhsObject);
  }

  public Object doLessThanOrEquals(final Object lhs, final double rhs) {
  final Object rhsObject = NgDouble.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLessThanOrEquals(lhs, rhsObject);
  }

  public Object doLessThanOrEquals(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLessThanOrEquals(lhs, rhsObject);
  }

  public Object doLessThanOrEquals(final Object lhs, final BigDecimal rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLessThanOrEquals(lhs, rhsObject);
  }

  public Object doReverseLessThanOrEquals(final byte lhs, final Object rhs) {
  final Object lhsObject = NgByte.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEquals(lhsObject, rhs);
  }

  public Object doReverseLessThanOrEquals(final char lhs, final Object rhs) {
  final Object lhsObject = NgChar.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEquals(lhsObject, rhs);
  }

  public Object doReverseLessThanOrEquals(final short lhs, final Object rhs) {
  final Object lhsObject = NgShort.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEquals(lhsObject, rhs);
  }

  public Object doReverseLessThanOrEquals(final int lhs, final Object rhs) {
  final Object lhsObject = NgInt.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEquals(lhsObject, rhs);
  }

  public Object doReverseLessThanOrEquals(final long lhs, final Object rhs) {
  final Object lhsObject = NgLong.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEquals(lhsObject, rhs);
  }

  public Object doReverseLessThanOrEquals(final float lhs, final Object rhs) {
  final Object lhsObject = NgFloat.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEquals(lhsObject, rhs);
  }

  public Object doReverseLessThanOrEquals(final double lhs, final Object rhs) {
  final Object lhsObject = NgDouble.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEquals(lhsObject, rhs);
  }

  public Object doReverseLessThanOrEquals(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEquals(lhsObject, rhs);
  }

  public Object doReverseLessThanOrEquals(final BigDecimal lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEquals(lhsObject, rhs);
  }

  //
  //   Internal methods for operator >
  //
  //  These methods can be overidden to implement >
  //  If the underlying object does not have the appropriate method
  //
  public Object doGreaterThan(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.greaterThan(lhs, rhs);
    
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("greaterThan", rhs).call(lhs, rhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          result = NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThan(lhs, rhs);
          
          if (result == RuntimeMetaClassImpl.NOT_CALLED) {
            result = doCompare(lhs, rhs);
            
            if (result != RuntimeMetaClassImpl.NOT_CALLED) {
              return NgSystem.metaClassRegistry.getInternalMetaClass(result).doGreaterThan(result, NgInt.ZERO);
            }
          }
        }
      }

      return result;
    }
    
    public Object doReverseGreaterThan(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.reverseGreaterThan(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("reverseGreaterThan", lhs).call(rhs, lhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          result = doReverseCompare(lhs, rhs);
          
          if (result != RuntimeMetaClassImpl.NOT_CALLED) {
            return NgSystem.metaClassRegistry.getInternalMetaClass(result).doGreaterThan(result, NgInt.ZERO);
          }
        }
      }

      return result;
    }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doGreaterThan(final byte lhs, final byte rhs) {
    return doGreaterThan(NgByte.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doGreaterThan(final byte lhs, final char rhs) {
    return doGreaterThan(NgByte.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doGreaterThan(final byte lhs, final short rhs) {
    return doGreaterThan(NgByte.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doGreaterThan(final byte lhs, final int rhs) {
    return doGreaterThan(NgByte.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doGreaterThan(final byte lhs, final long rhs) {
    return doGreaterThan(NgByte.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doGreaterThan(final byte lhs, final float rhs) {
    return doGreaterThan(NgByte.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doGreaterThan(final byte lhs, final double rhs) {
    return doGreaterThan(NgByte.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doGreaterThan(final byte lhs, final BigInteger rhs) {
    return doGreaterThan(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doGreaterThan(final byte lhs, final BigDecimal rhs) {
    return doGreaterThan(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doGreaterThan(final char lhs, final byte rhs) {
    return doGreaterThan(NgChar.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doGreaterThan(final char lhs, final char rhs) {
    return doGreaterThan(NgChar.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doGreaterThan(final char lhs, final short rhs) {
    return doGreaterThan(NgChar.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doGreaterThan(final char lhs, final int rhs) {
    return doGreaterThan(NgChar.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doGreaterThan(final char lhs, final long rhs) {
    return doGreaterThan(NgChar.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doGreaterThan(final char lhs, final float rhs) {
    return doGreaterThan(NgChar.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doGreaterThan(final char lhs, final double rhs) {
    return doGreaterThan(NgChar.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doGreaterThan(final char lhs, final BigInteger rhs) {
    return doGreaterThan(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doGreaterThan(final char lhs, final BigDecimal rhs) {
    return doGreaterThan(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doGreaterThan(final short lhs, final byte rhs) {
    return doGreaterThan(NgShort.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doGreaterThan(final short lhs, final char rhs) {
    return doGreaterThan(NgShort.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doGreaterThan(final short lhs, final short rhs) {
    return doGreaterThan(NgShort.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doGreaterThan(final short lhs, final int rhs) {
    return doGreaterThan(NgShort.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doGreaterThan(final short lhs, final long rhs) {
    return doGreaterThan(NgShort.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doGreaterThan(final short lhs, final float rhs) {
    return doGreaterThan(NgShort.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doGreaterThan(final short lhs, final double rhs) {
    return doGreaterThan(NgShort.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doGreaterThan(final short lhs, final BigInteger rhs) {
    return doGreaterThan(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doGreaterThan(final short lhs, final BigDecimal rhs) {
    return doGreaterThan(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doGreaterThan(final int lhs, final byte rhs) {
    return doGreaterThan(NgInt.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doGreaterThan(final int lhs, final char rhs) {
    return doGreaterThan(NgInt.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doGreaterThan(final int lhs, final short rhs) {
    return doGreaterThan(NgInt.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doGreaterThan(final int lhs, final int rhs) {
    return doGreaterThan(NgInt.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doGreaterThan(final int lhs, final long rhs) {
    return doGreaterThan(NgInt.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doGreaterThan(final int lhs, final float rhs) {
    return doGreaterThan(NgInt.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doGreaterThan(final int lhs, final double rhs) {
    return doGreaterThan(NgInt.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doGreaterThan(final int lhs, final BigInteger rhs) {
    return doGreaterThan(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doGreaterThan(final int lhs, final BigDecimal rhs) {
    return doGreaterThan(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doGreaterThan(final long lhs, final byte rhs) {
    return doGreaterThan(NgLong.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doGreaterThan(final long lhs, final char rhs) {
    return doGreaterThan(NgLong.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doGreaterThan(final long lhs, final short rhs) {
    return doGreaterThan(NgLong.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doGreaterThan(final long lhs, final int rhs) {
    return doGreaterThan(NgLong.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doGreaterThan(final long lhs, final long rhs) {
    return doGreaterThan(NgLong.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doGreaterThan(final long lhs, final float rhs) {
    return doGreaterThan(NgLong.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doGreaterThan(final long lhs, final double rhs) {
    return doGreaterThan(NgLong.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doGreaterThan(final long lhs, final BigInteger rhs) {
    return doGreaterThan(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doGreaterThan(final long lhs, final BigDecimal rhs) {
    return doGreaterThan(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doGreaterThan(final float lhs, final byte rhs) {
    return doGreaterThan(NgFloat.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doGreaterThan(final float lhs, final char rhs) {
    return doGreaterThan(NgFloat.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doGreaterThan(final float lhs, final short rhs) {
    return doGreaterThan(NgFloat.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doGreaterThan(final float lhs, final int rhs) {
    return doGreaterThan(NgFloat.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doGreaterThan(final float lhs, final long rhs) {
    return doGreaterThan(NgFloat.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doGreaterThan(final float lhs, final float rhs) {
    return doGreaterThan(NgFloat.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doGreaterThan(final float lhs, final double rhs) {
    return doGreaterThan(NgFloat.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doGreaterThan(final float lhs, final BigInteger rhs) {
    return doGreaterThan(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doGreaterThan(final float lhs, final BigDecimal rhs) {
    return doGreaterThan(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doGreaterThan(final double lhs, final byte rhs) {
    return doGreaterThan(NgDouble.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doGreaterThan(final double lhs, final char rhs) {
    return doGreaterThan(NgDouble.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doGreaterThan(final double lhs, final short rhs) {
    return doGreaterThan(NgDouble.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doGreaterThan(final double lhs, final int rhs) {
    return doGreaterThan(NgDouble.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doGreaterThan(final double lhs, final long rhs) {
    return doGreaterThan(NgDouble.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doGreaterThan(final double lhs, final float rhs) {
    return doGreaterThan(NgDouble.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doGreaterThan(final double lhs, final double rhs) {
    return doGreaterThan(NgDouble.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doGreaterThan(final double lhs, final BigInteger rhs) {
    return doGreaterThan(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doGreaterThan(final double lhs, final BigDecimal rhs) {
    return doGreaterThan(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doGreaterThan(final BigInteger lhs, final byte rhs) {
    return doGreaterThan((Object)lhs, NgByte.valueOf(rhs));
  }

  public Object doGreaterThan(final BigInteger lhs, final char rhs) {
    return doGreaterThan((Object)lhs, NgChar.valueOf(rhs));
  }

  public Object doGreaterThan(final BigInteger lhs, final short rhs) {
    return doGreaterThan((Object)lhs, NgShort.valueOf(rhs));
  }

  public Object doGreaterThan(final BigInteger lhs, final int rhs) {
    return doGreaterThan((Object)lhs, NgInt.valueOf(rhs));
  }

  public Object doGreaterThan(final BigInteger lhs, final long rhs) {
    return doGreaterThan((Object)lhs, NgLong.valueOf(rhs));
  }

  public Object doGreaterThan(final BigInteger lhs, final float rhs) {
    return doGreaterThan((Object)lhs, NgFloat.valueOf(rhs));
  }

  public Object doGreaterThan(final BigInteger lhs, final double rhs) {
    return doGreaterThan((Object)lhs, NgDouble.valueOf(rhs));
  }

  public Object doGreaterThan(final BigInteger lhs, final BigInteger rhs) {
    return doGreaterThan((Object)lhs, (Object)rhs);
  }

  public Object doGreaterThan(final BigInteger lhs, final BigDecimal rhs) {
    return doGreaterThan((Object)lhs, (Object)rhs);
  }

  public Object doGreaterThan(final BigDecimal lhs, final byte rhs) {
    return doGreaterThan((Object)lhs, NgByte.valueOf(rhs));
  }

  public Object doGreaterThan(final BigDecimal lhs, final char rhs) {
    return doGreaterThan((Object)lhs, NgChar.valueOf(rhs));
  }

  public Object doGreaterThan(final BigDecimal lhs, final short rhs) {
    return doGreaterThan((Object)lhs, NgShort.valueOf(rhs));
  }

  public Object doGreaterThan(final BigDecimal lhs, final int rhs) {
    return doGreaterThan((Object)lhs, NgInt.valueOf(rhs));
  }

  public Object doGreaterThan(final BigDecimal lhs, final long rhs) {
    return doGreaterThan((Object)lhs, NgLong.valueOf(rhs));
  }

  public Object doGreaterThan(final BigDecimal lhs, final float rhs) {
    return doGreaterThan((Object)lhs, NgFloat.valueOf(rhs));
  }

  public Object doGreaterThan(final BigDecimal lhs, final double rhs) {
    return doGreaterThan((Object)lhs, NgDouble.valueOf(rhs));
  }

  public Object doGreaterThan(final BigDecimal lhs, final BigInteger rhs) {
    return doGreaterThan((Object)lhs, (Object)rhs);
  }

  public Object doGreaterThan(final BigDecimal lhs, final BigDecimal rhs) {
    return doGreaterThan((Object)lhs, (Object)rhs);
  }

  public Object doGreaterThan(final Object lhs, final byte rhs) {
  final Object rhsObject = NgByte.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseGreaterThan(lhs, rhsObject);
  }

  public Object doGreaterThan(final Object lhs, final char rhs) {
  final Object rhsObject = NgChar.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseGreaterThan(lhs, rhsObject);
  }

  public Object doGreaterThan(final Object lhs, final short rhs) {
  final Object rhsObject = NgShort.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseGreaterThan(lhs, rhsObject);
  }

  public Object doGreaterThan(final Object lhs, final int rhs) {
  final Object rhsObject = NgInt.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseGreaterThan(lhs, rhsObject);
  }

  public Object doGreaterThan(final Object lhs, final long rhs) {
  final Object rhsObject = NgLong.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseGreaterThan(lhs, rhsObject);
  }

  public Object doGreaterThan(final Object lhs, final float rhs) {
  final Object rhsObject = NgFloat.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseGreaterThan(lhs, rhsObject);
  }

  public Object doGreaterThan(final Object lhs, final double rhs) {
  final Object rhsObject = NgDouble.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseGreaterThan(lhs, rhsObject);
  }

  public Object doGreaterThan(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseGreaterThan(lhs, rhsObject);
  }

  public Object doGreaterThan(final Object lhs, final BigDecimal rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseGreaterThan(lhs, rhsObject);
  }

  public Object doReverseGreaterThan(final byte lhs, final Object rhs) {
  final Object lhsObject = NgByte.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThan(lhsObject, rhs);
  }

  public Object doReverseGreaterThan(final char lhs, final Object rhs) {
  final Object lhsObject = NgChar.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThan(lhsObject, rhs);
  }

  public Object doReverseGreaterThan(final short lhs, final Object rhs) {
  final Object lhsObject = NgShort.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThan(lhsObject, rhs);
  }

  public Object doReverseGreaterThan(final int lhs, final Object rhs) {
  final Object lhsObject = NgInt.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThan(lhsObject, rhs);
  }

  public Object doReverseGreaterThan(final long lhs, final Object rhs) {
  final Object lhsObject = NgLong.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThan(lhsObject, rhs);
  }

  public Object doReverseGreaterThan(final float lhs, final Object rhs) {
  final Object lhsObject = NgFloat.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThan(lhsObject, rhs);
  }

  public Object doReverseGreaterThan(final double lhs, final Object rhs) {
  final Object lhsObject = NgDouble.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThan(lhsObject, rhs);
  }

  public Object doReverseGreaterThan(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThan(lhsObject, rhs);
  }

  public Object doReverseGreaterThan(final BigDecimal lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThan(lhsObject, rhs);
  }

  //
  //   Internal methods for operator >=
  //
  //  These methods can be overidden to implement >=
  //  If the underlying object does not have the appropriate method
  //
  public Object doGreaterThanOrEquals(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.greaterThanOrEquals(lhs, rhs);
    
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result = this.instanceHandler.getMetaMethodQuick("greaterThanOrEquals", rhs).call(lhs, rhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          result =  NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThanOrEquals(lhs, rhs);
          
          if (result == RuntimeMetaClassImpl.NOT_CALLED) {
            result = doCompare(lhs, rhs);
            
            if (result != RuntimeMetaClassImpl.NOT_CALLED) {
              return NgSystem.metaClassRegistry.getInternalMetaClass(result).doGreaterThanOrEquals(result, NgInt.ZERO);
            }
          }
        }
      }

      return result;
    }
    
    public Object doReverseGreaterThanOrEquals(final Object lhs, final Object rhs) {
    Object result = this.instanceHandler.reverseGreaterThanOrEquals(lhs, rhs);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        result =  this.instanceHandler.getMetaMethodQuick("reverseGreaterThanOrequals", lhs).call(rhs, lhs);
        
        if (result == RuntimeMetaClassImpl.NOT_CALLED) {
          result = doReverseCompare(lhs, rhs);
          
          if (result != RuntimeMetaClassImpl.NOT_CALLED) {
            return NgSystem.metaClassRegistry.getInternalMetaClass(result).doGreaterThanOrEquals(result, NgInt.ZERO);
          }
        }
      }

      return result;
    }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doGreaterThanOrEquals(final byte lhs, final byte rhs) {
    return doGreaterThanOrEquals(NgByte.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final byte lhs, final char rhs) {
    return doGreaterThanOrEquals(NgByte.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final byte lhs, final short rhs) {
    return doGreaterThanOrEquals(NgByte.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final byte lhs, final int rhs) {
    return doGreaterThanOrEquals(NgByte.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final byte lhs, final long rhs) {
    return doGreaterThanOrEquals(NgByte.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final byte lhs, final float rhs) {
    return doGreaterThanOrEquals(NgByte.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final byte lhs, final double rhs) {
    return doGreaterThanOrEquals(NgByte.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final byte lhs, final BigInteger rhs) {
    return doGreaterThanOrEquals(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final byte lhs, final BigDecimal rhs) {
    return doGreaterThanOrEquals(NgByte.valueOf(lhs), (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final char lhs, final byte rhs) {
    return doGreaterThanOrEquals(NgChar.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final char lhs, final char rhs) {
    return doGreaterThanOrEquals(NgChar.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final char lhs, final short rhs) {
    return doGreaterThanOrEquals(NgChar.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final char lhs, final int rhs) {
    return doGreaterThanOrEquals(NgChar.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final char lhs, final long rhs) {
    return doGreaterThanOrEquals(NgChar.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final char lhs, final float rhs) {
    return doGreaterThanOrEquals(NgChar.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final char lhs, final double rhs) {
    return doGreaterThanOrEquals(NgChar.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final char lhs, final BigInteger rhs) {
    return doGreaterThanOrEquals(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final char lhs, final BigDecimal rhs) {
    return doGreaterThanOrEquals(NgChar.valueOf(lhs), (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final short lhs, final byte rhs) {
    return doGreaterThanOrEquals(NgShort.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final short lhs, final char rhs) {
    return doGreaterThanOrEquals(NgShort.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final short lhs, final short rhs) {
    return doGreaterThanOrEquals(NgShort.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final short lhs, final int rhs) {
    return doGreaterThanOrEquals(NgShort.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final short lhs, final long rhs) {
    return doGreaterThanOrEquals(NgShort.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final short lhs, final float rhs) {
    return doGreaterThanOrEquals(NgShort.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final short lhs, final double rhs) {
    return doGreaterThanOrEquals(NgShort.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final short lhs, final BigInteger rhs) {
    return doGreaterThanOrEquals(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final short lhs, final BigDecimal rhs) {
    return doGreaterThanOrEquals(NgShort.valueOf(lhs), (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final int lhs, final byte rhs) {
    return doGreaterThanOrEquals(NgInt.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final int lhs, final char rhs) {
    return doGreaterThanOrEquals(NgInt.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final int lhs, final short rhs) {
    return doGreaterThanOrEquals(NgInt.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final int lhs, final int rhs) {
    return doGreaterThanOrEquals(NgInt.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final int lhs, final long rhs) {
    return doGreaterThanOrEquals(NgInt.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final int lhs, final float rhs) {
    return doGreaterThanOrEquals(NgInt.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final int lhs, final double rhs) {
    return doGreaterThanOrEquals(NgInt.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final int lhs, final BigInteger rhs) {
    return doGreaterThanOrEquals(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final int lhs, final BigDecimal rhs) {
    return doGreaterThanOrEquals(NgInt.valueOf(lhs), (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final long lhs, final byte rhs) {
    return doGreaterThanOrEquals(NgLong.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final long lhs, final char rhs) {
    return doGreaterThanOrEquals(NgLong.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final long lhs, final short rhs) {
    return doGreaterThanOrEquals(NgLong.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final long lhs, final int rhs) {
    return doGreaterThanOrEquals(NgLong.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final long lhs, final long rhs) {
    return doGreaterThanOrEquals(NgLong.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final long lhs, final float rhs) {
    return doGreaterThanOrEquals(NgLong.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final long lhs, final double rhs) {
    return doGreaterThanOrEquals(NgLong.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final long lhs, final BigInteger rhs) {
    return doGreaterThanOrEquals(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final long lhs, final BigDecimal rhs) {
    return doGreaterThanOrEquals(NgLong.valueOf(lhs), (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final float lhs, final byte rhs) {
    return doGreaterThanOrEquals(NgFloat.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final float lhs, final char rhs) {
    return doGreaterThanOrEquals(NgFloat.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final float lhs, final short rhs) {
    return doGreaterThanOrEquals(NgFloat.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final float lhs, final int rhs) {
    return doGreaterThanOrEquals(NgFloat.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final float lhs, final long rhs) {
    return doGreaterThanOrEquals(NgFloat.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final float lhs, final float rhs) {
    return doGreaterThanOrEquals(NgFloat.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final float lhs, final double rhs) {
    return doGreaterThanOrEquals(NgFloat.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final float lhs, final BigInteger rhs) {
    return doGreaterThanOrEquals(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final float lhs, final BigDecimal rhs) {
    return doGreaterThanOrEquals(NgFloat.valueOf(lhs), (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final double lhs, final byte rhs) {
    return doGreaterThanOrEquals(NgDouble.valueOf(lhs), NgByte.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final double lhs, final char rhs) {
    return doGreaterThanOrEquals(NgDouble.valueOf(lhs), NgChar.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final double lhs, final short rhs) {
    return doGreaterThanOrEquals(NgDouble.valueOf(lhs), NgShort.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final double lhs, final int rhs) {
    return doGreaterThanOrEquals(NgDouble.valueOf(lhs), NgInt.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final double lhs, final long rhs) {
    return doGreaterThanOrEquals(NgDouble.valueOf(lhs), NgLong.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final double lhs, final float rhs) {
    return doGreaterThanOrEquals(NgDouble.valueOf(lhs), NgFloat.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final double lhs, final double rhs) {
    return doGreaterThanOrEquals(NgDouble.valueOf(lhs), NgDouble.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final double lhs, final BigInteger rhs) {
    return doGreaterThanOrEquals(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final double lhs, final BigDecimal rhs) {
    return doGreaterThanOrEquals(NgDouble.valueOf(lhs), (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final BigInteger lhs, final byte rhs) {
    return doGreaterThanOrEquals((Object)lhs, NgByte.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final BigInteger lhs, final char rhs) {
    return doGreaterThanOrEquals((Object)lhs, NgChar.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final BigInteger lhs, final short rhs) {
    return doGreaterThanOrEquals((Object)lhs, NgShort.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final BigInteger lhs, final int rhs) {
    return doGreaterThanOrEquals((Object)lhs, NgInt.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final BigInteger lhs, final long rhs) {
    return doGreaterThanOrEquals((Object)lhs, NgLong.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final BigInteger lhs, final float rhs) {
    return doGreaterThanOrEquals((Object)lhs, NgFloat.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final BigInteger lhs, final double rhs) {
    return doGreaterThanOrEquals((Object)lhs, NgDouble.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final BigInteger lhs, final BigInteger rhs) {
    return doGreaterThanOrEquals((Object)lhs, (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final BigInteger lhs, final BigDecimal rhs) {
    return doGreaterThanOrEquals((Object)lhs, (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final BigDecimal lhs, final byte rhs) {
    return doGreaterThanOrEquals((Object)lhs, NgByte.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final BigDecimal lhs, final char rhs) {
    return doGreaterThanOrEquals((Object)lhs, NgChar.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final BigDecimal lhs, final short rhs) {
    return doGreaterThanOrEquals((Object)lhs, NgShort.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final BigDecimal lhs, final int rhs) {
    return doGreaterThanOrEquals((Object)lhs, NgInt.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final BigDecimal lhs, final long rhs) {
    return doGreaterThanOrEquals((Object)lhs, NgLong.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final BigDecimal lhs, final float rhs) {
    return doGreaterThanOrEquals((Object)lhs, NgFloat.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final BigDecimal lhs, final double rhs) {
    return doGreaterThanOrEquals((Object)lhs, NgDouble.valueOf(rhs));
  }

  public Object doGreaterThanOrEquals(final BigDecimal lhs, final BigInteger rhs) {
    return doGreaterThanOrEquals((Object)lhs, (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final BigDecimal lhs, final BigDecimal rhs) {
    return doGreaterThanOrEquals((Object)lhs, (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = NgByte.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseGreaterThanOrEquals(lhs, rhsObject);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final char rhs) {
  final Object rhsObject = NgChar.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseGreaterThanOrEquals(lhs, rhsObject);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final short rhs) {
  final Object rhsObject = NgShort.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseGreaterThanOrEquals(lhs, rhsObject);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final int rhs) {
  final Object rhsObject = NgInt.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseGreaterThanOrEquals(lhs, rhsObject);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final long rhs) {
  final Object rhsObject = NgLong.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseGreaterThanOrEquals(lhs, rhsObject);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final float rhs) {
  final Object rhsObject = NgFloat.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseGreaterThanOrEquals(lhs, rhsObject);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final double rhs) {
  final Object rhsObject = NgDouble.valueOf(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseGreaterThanOrEquals(lhs, rhsObject);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseGreaterThanOrEquals(lhs, rhsObject);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final BigDecimal rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseGreaterThanOrEquals(lhs, rhsObject);
  }

  public Object doReverseGreaterThanOrEquals(final byte lhs, final Object rhs) {
  final Object lhsObject = NgByte.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThanOrEquals(lhsObject, rhs);
  }

  public Object doReverseGreaterThanOrEquals(final char lhs, final Object rhs) {
  final Object lhsObject = NgChar.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThanOrEquals(lhsObject, rhs);
  }

  public Object doReverseGreaterThanOrEquals(final short lhs, final Object rhs) {
  final Object lhsObject = NgShort.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThanOrEquals(lhsObject, rhs);
  }

  public Object doReverseGreaterThanOrEquals(final int lhs, final Object rhs) {
  final Object lhsObject = NgInt.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThanOrEquals(lhsObject, rhs);
  }

  public Object doReverseGreaterThanOrEquals(final long lhs, final Object rhs) {
  final Object lhsObject = NgLong.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThanOrEquals(lhsObject, rhs);
  }

  public Object doReverseGreaterThanOrEquals(final float lhs, final Object rhs) {
  final Object lhsObject = NgFloat.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThanOrEquals(lhsObject, rhs);
  }

  public Object doReverseGreaterThanOrEquals(final double lhs, final Object rhs) {
  final Object lhsObject = NgDouble.valueOf(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThanOrEquals(lhsObject, rhs);
  }

  public Object doReverseGreaterThanOrEquals(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThanOrEquals(lhsObject, rhs);
  }

  public Object doReverseGreaterThanOrEquals(final BigDecimal lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThanOrEquals(lhsObject, rhs);
  }
}
