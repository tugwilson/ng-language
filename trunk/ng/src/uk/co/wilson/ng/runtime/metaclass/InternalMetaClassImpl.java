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

import uk.co.wilson.ng.runtime.metaclass.reflection.InstanceReflectionHandler;

import ng.lang.NgSystem;
import ng.runtime.InstanceHandler;
import ng.runtime.InternalMetaClass;
import ng.runtime.MetaClass;
import ng.runtime.NgBoolean;
import ng.runtime.NgByte;
import ng.runtime.NgChar;
import ng.runtime.NgDouble;
import ng.runtime.NgFloat;
import ng.runtime.NgInt;
import ng.runtime.NgLong;
import ng.runtime.NgShort;

public class InternalMetaClassImpl implements InternalMetaClass {
  final InstanceHandler instanceHandler;;
  
  public InternalMetaClassImpl(final Class theClass) {
    this.instanceHandler = new InstanceReflectionHandler(theClass);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#getParamObject(java.lang.Object)
   */
  public Object getParamObject(final Object instance) {
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
   * @see ng.runtime.InternalMetaClass#doInvokeConstructor(java.lang.Class, java.lang.Object[])
   */
  public Object doInvokeConstructor(final Class theClass, final Object[] arguments) {
    return this.instanceHandler.invokeConstructor(theClass, arguments);
  }

  /**
   * @param instance
   * @param methodName
   * @param arguments
   * @return
   */
  public Object doInvokeMethod(final Object instance, final String methodName, final Object[] arguments) {
    return this.instanceHandler.invokeMethod(instance, methodName, arguments);
  }

  /**
   * @param instance
   * @param methodName
   * @return the result of invoking the method on the instance with no
   *         parameters.
   * @return
   */
  public Object doInvokeMethodQuick(final Object instance, final String methodName) {
    return this.instanceHandler.invokeMethodQuick(instance, methodName);
  }

  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return the result of invoking the method on the instance with the supplied
   *         parameters.
   */
  public Object doInvokeMethodQuick(final Object instance, final String methodName, final Object p1) {
    return this.instanceHandler.invokeMethodQuick(instance, methodName, p1);
  }

  /**
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @return the result of invoking the method on the instance with the supplied
   *         parameters.
   */
  public Object doInvokeMethodQuick(final Object instance, final String methodName, final Object p1, final Object p2) {
    return this.instanceHandler.invokeMethodQuick(instance, methodName, p1, p2);
  }

  /**
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @return the result of invoking the method on the instance with the supplied
   *         parameters.
   */
  public Object doInvokeMethodQuick(final Object instance, final String methodName, final Object p1, final Object p2, final Object p3) {
    return this.instanceHandler.invokeMethodQuick(instance, methodName, p1, p2, p3);
  }

  /**
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  public Object doInvokeMethodQuick(final Object instance, final String methodName, final Object p1, final Object p2, final Object p3, final Object p4) {
    return this.instanceHandler.invokeMethodQuick(instance, methodName, p1, p2, p3, p4);
  }

  /**
   * @param instance
   * @param propertyName
   * @return
   */
  public Object doGetProperty(final Object instance, final String propertyName) {
    return this.instanceHandler.getProperty(instance, propertyName);
  }

  /**
   * @param instance
   * @param propertyName
   * @param newValue
   * @return
   */
  public Object doSetProperty(final Object instance, final String propertyName, final Object newValue) {
    return this.instanceHandler.setProperty(instance, propertyName, newValue);
  }

  /**
   * @param instance
   * @param fieldName
   * @return
   */
  public Object doGetField(final Object instance, final String fieldName) {
    return this.instanceHandler.getField(instance, fieldName);
  }

  /**
   * @param instance
   * @param fieldName
   * @param newValue
   * @return
   */
  public Object doSetField(final Object instance, final String fieldName, final Object newValue) {
    return this.instanceHandler.setField(instance, fieldName, newValue);
  }
  
  /**
   * @param instance
   * @param arguments
   * @return
   */
  public Object doCall(final Object instance, final Object[] arguments) {
    return this.instanceHandler.call(instance, arguments);
  }
  
  /**
   * @param instance
   * @return
   */
  public Object doCallQuick(final Object instance) {
    return this.instanceHandler.callQuick(instance);
  }

  /**
   * @param instance
   * @param p1
   * @return
   */
  public Object doCallQuick(final Object instance, final Object p1) {
    return this.instanceHandler.callQuick(instance, p1);
  }

  /**
   * @param instance
   * @param p1
   * @param p2
   * @return
   */
  public Object doCallQuick(final Object instance, final Object p1, final Object p2) {
    return this.instanceHandler.callQuick(instance, p1, p2);
  }

  /**
   * @param instance
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  public Object doCallQuick(final Object instance, final Object p1, final Object p2, final Object p3) {
    return this.instanceHandler.callQuick(instance, p1, p2, p3);
  }

  /**
   * @param instance
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  public Object doCallQuick(final Object instance, final Object p1, final Object p2, final Object p3, final Object p4) {
    return this.instanceHandler.callQuick(instance, p1, p2, p3, p4);
  }

  public Object doComplement(final Object instance) {
    return this.instanceHandler.complement(instance);
  }

  public Object doComplement(final int instance) {
    return doComplement(new NgInt(instance));
  }

  public Object doComplement(final long instance) {
    return doComplement(new NgLong(instance));
  }

  public Object doComplement(final BigInteger instance) {
    return doComplement((Object)instance);
  }

  public Object doNot(final Object instance) {
    return this.instanceHandler.not(instance);
  }

  public Object doNot(final boolean instance) {
    return doNot((instance) ? NgBoolean.TRUE : NgBoolean.FALSE);
  }

  public Object doUnaryPlus(final Object instance) {
    return this.instanceHandler.unaryPlus(instance);
  }

  public Object doUnaryPlus(final int instance) {
    return doUnaryPlus(new NgInt(instance));
  }

  public Object doUnaryPlus(final long instance) {
    return doUnaryPlus(new NgLong(instance));
  }

  public Object doUnaryPlus(final float instance) {
    return doUnaryPlus(new NgFloat(instance));
  }

  public Object doUnaryPlus(final double instance) {
    return doUnaryPlus(new NgDouble(instance));
  }

  public Object doUnaryPlus(final BigInteger instance) {
    return doUnaryPlus((Object)instance);
  }

  public Object doUnaryPlus(final BigDecimal instance) {
    return doUnaryPlus((Object)instance);
  }

  public Object doUnaryMinus(final Object instance) {
    return this.instanceHandler.unaryMinus(instance);
  }

  public Object doUnaryMinus(final int instance) {
    return doUnaryMinus(new NgInt(instance));
  }

  public Object doUnaryMinus(final long instance) {
    return doUnaryMinus(new NgLong(instance));
  }

  public Object doUnaryMinus(final float instance) {
    return doUnaryMinus(new NgFloat(instance));
  }

  public Object doUnaryMinus(final double instance) {
    return doUnaryMinus(new NgDouble(instance));
  }

  public Object doUnaryMinus(final BigInteger instance) {
    return doUnaryMinus((Object)instance);
  }

  public Object doUnaryMinus(final BigDecimal instance) {
    return doUnaryMinus((Object)instance);
  }

  public Object doIsCase(final Object instance, final Object rhs) {
    return this.instanceHandler.isCase(instance, rhs);
  }

  public Object doIsInstanceof(final Object instance, final Class type) {
    return this.instanceHandler.isInstanceof(instance, type);
  }

  public Object doAsType(final Object instance, final Class type) {
    return this.instanceHandler.asType(instance, type);
  }

  public Object doGetAt(final Object instance, final Object index) {
    return this.instanceHandler.getAt(instance, index);
  }

  public Object doGetAt(final Object instance, final int index) {
    return doGetAt(instance, new NgInt(index));
  }

  public Object doGetAt(final Object instance, final BigInteger index) {
   return doGetAt(instance, (Object)index);
  }

  public Object doPutAt(final Object instance, final Object index) {
    return this.instanceHandler.putAt(instance, index);
  }

  public Object doPutAt(final Object instance, int index) {
    return doPutAt(instance, new NgInt(index));
  }

  public Object doPutAt(final Object instance, final BigInteger index) {
    return doPutAt(instance, (Object)index);
  }

  public Object doPrefixIncrement(final Object instance) {
    return this.instanceHandler.prefixIncrement(instance);
  }

  public Object doPrefixIncrement(final int instance) {
    return doPrefixIncrement(new NgInt(instance));
  }

  public Object doPrefixIncrement(final long instance) {
    return doPrefixIncrement(new NgLong(instance));
  }

  public Object doPrefixIncrement(final float instance) {
    return doPrefixIncrement(new NgFloat(instance));
  }

  public Object doPrefixIncrement(final double instance) {
    return doPrefixIncrement(new NgDouble(instance));
  }

  public Object doPrefixIncrement(final BigInteger instance) {
    return doPrefixIncrement((Object)instance);
  }

  public Object doPrefixIncrement(final BigDecimal instance) {
    return doPrefixIncrement((Object)instance);
  }

  public Object doPrefixDecrement(final Object instance) {
    return this.instanceHandler.prefixDecrement(instance);
  }

  public Object doPrefixDecrement(final int instance) {
    return doPrefixDecrement(new NgInt(instance));
  }

  public Object doPrefixDecrement(final long instance) {
    return doPrefixDecrement(new NgLong(instance));
  }

  public Object doPrefixDecrement(final float instance) {
    return doPrefixDecrement(new NgFloat(instance));
  }

  public Object doPrefixDecrement(final double instance) {
    return doPrefixDecrement(new NgDouble(instance));
  }

  public Object doPrefixDecrement(final BigInteger instance) {
    return doPrefixDecrement((Object)instance);
  }

  public Object doPrefixDecrement(final BigDecimal instance) {
    return doPrefixDecrement((Object)instance);
  }

  public Object doPostfixIncrement(final Object instance) {
    return this.instanceHandler.postfixIncrement(instance);
  }

  public Object doPostfixIncrement(final int instance) {
    return doPostfixIncrement(new NgInt(instance));
  }

  public Object doPostfixIncrement(final long instance) {
    return doPostfixIncrement(new NgLong(instance));
  }

  public Object doPostfixIncrement(final float instance) {
    return doPostfixIncrement(new NgFloat(instance));
  }

  public Object doPostfixIncrement(final double instance) {
    return doPostfixIncrement(new NgDouble(instance));
  }

  public Object doPostfixIncrement(final BigInteger instance) {
    return doPostfixIncrement((Object)instance);
  }

  public Object doPostfixIncrement(final BigDecimal instance) {
    return doPostfixIncrement((Object)instance);
  }

  public Object doPostfixDecrement(final Object instance) {
    return this.instanceHandler.postfixDecrement(instance);
  }

  public Object doPostfixDecrement(final int instance) {
    return doPostfixDecrement(new NgInt(instance));
  }

  public Object doPostfixDecrement(final long instance) {
    return doPostfixDecrement(new NgLong(instance));
  }

  public Object doPostfixDecrement(final float instance) {
    return doPostfixDecrement(new NgFloat(instance));
  }

  public Object doPostfixDecrement(final double instance) {
    return doPostfixDecrement(new NgDouble(instance));
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
  final Object result = this.instanceHandler.add(lhs, rhs);
  
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAdd(lhs, rhs);
    } else {
      return result;
    }
  }
  
  public Object doReverseAdd(final Object lhs, final Object rhs) {
    return this.instanceHandler.reverseAdd(lhs, rhs);
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doAdd(final byte lhs, final byte rhs) {
    return doAdd(new NgByte(lhs), new NgByte(rhs));
  }

  public Object doAdd(final byte lhs, final char rhs) {
    return doAdd(new NgByte(lhs), new NgChar(rhs));
  }

  public Object doAdd(final byte lhs, final short rhs) {
    return doAdd(new NgByte(lhs), new NgShort(rhs));
  }

  public Object doAdd(final byte lhs, final int rhs) {
    return doAdd(new NgByte(lhs), new NgInt(rhs));
  }

  public Object doAdd(final byte lhs, final long rhs) {
    return doAdd(new NgByte(lhs), new NgLong(rhs));
  }

  public Object doAdd(final byte lhs, final float rhs) {
    return doAdd(new NgByte(lhs), new NgFloat(rhs));
  }

  public Object doAdd(final byte lhs, final double rhs) {
    return doAdd(new NgByte(lhs), new NgDouble(rhs));
  }

  public Object doAdd(final byte lhs, final BigInteger rhs) {
    return doAdd(new NgByte(lhs), (Object)rhs);
  }

  public Object doAdd(final byte lhs, final BigDecimal rhs) {
    return doAdd(new NgByte(lhs), (Object)rhs);
  }

  public Object doAdd(final char lhs, final byte rhs) {
    return doAdd(new NgChar(lhs), new NgByte(rhs));
  }

  public Object doAdd(final char lhs, final char rhs) {
    return doAdd(new NgChar(lhs), new NgChar(rhs));
  }

  public Object doAdd(final char lhs, final short rhs) {
    return doAdd(new NgChar(lhs), new NgShort(rhs));
  }

  public Object doAdd(final char lhs, final int rhs) {
    return doAdd(new NgChar(lhs), new NgInt(rhs));
  }

  public Object doAdd(final char lhs, final long rhs) {
    return doAdd(new NgChar(lhs), new NgLong(rhs));
  }

  public Object doAdd(final char lhs, final float rhs) {
    return doAdd(new NgChar(lhs), new NgFloat(rhs));
  }

  public Object doAdd(final char lhs, final double rhs) {
    return doAdd(new NgChar(lhs), new NgDouble(rhs));
  }

  public Object doAdd(final char lhs, final BigInteger rhs) {
    return doAdd(new NgChar(lhs), (Object)rhs);
  }

  public Object doAdd(final char lhs, final BigDecimal rhs) {
    return doAdd(new NgChar(lhs), (Object)rhs);
  }

  public Object doAdd(final short lhs, final byte rhs) {
    return doAdd(new NgShort(lhs), new NgByte(rhs));
  }

  public Object doAdd(final short lhs, final char rhs) {
    return doAdd(new NgShort(lhs), new NgChar(rhs));
  }

  public Object doAdd(final short lhs, final short rhs) {
    return doAdd(new NgShort(lhs), new NgShort(rhs));
  }

  public Object doAdd(final short lhs, final int rhs) {
    return doAdd(new NgShort(lhs), new NgInt(rhs));
  }

  public Object doAdd(final short lhs, final long rhs) {
    return doAdd(new NgShort(lhs), new NgLong(rhs));
  }

  public Object doAdd(final short lhs, final float rhs) {
    return doAdd(new NgShort(lhs), new NgFloat(rhs));
  }

  public Object doAdd(final short lhs, final double rhs) {
    return doAdd(new NgShort(lhs), new NgDouble(rhs));
  }

  public Object doAdd(final short lhs, final BigInteger rhs) {
    return doAdd(new NgShort(lhs), (Object)rhs);
  }

  public Object doAdd(final short lhs, final BigDecimal rhs) {
    return doAdd(new NgShort(lhs), (Object)rhs);
  }

  public Object doAdd(final int lhs, final byte rhs) {
    return doAdd(new NgInt(lhs), new NgByte(rhs));
  }

  public Object doAdd(final int lhs, final char rhs) {
    return doAdd(new NgInt(lhs), new NgChar(rhs));
  }

  public Object doAdd(final int lhs, final short rhs) {
    return doAdd(new NgInt(lhs), new NgShort(rhs));
  }

  public Object doAdd(final int lhs, final int rhs) {
    return doAdd(new NgInt(lhs), new NgInt(rhs));
  }

  public Object doAdd(final int lhs, final long rhs) {
    return doAdd(new NgInt(lhs), new NgLong(rhs));
  }

  public Object doAdd(final int lhs, final float rhs) {
    return doAdd(new NgInt(lhs), new NgFloat(rhs));
  }

  public Object doAdd(final int lhs, final double rhs) {
    return doAdd(new NgInt(lhs), new NgDouble(rhs));
  }

  public Object doAdd(final int lhs, final BigInteger rhs) {
    return doAdd(new NgInt(lhs), (Object)rhs);
  }

  public Object doAdd(final int lhs, final BigDecimal rhs) {
    return doAdd(new NgInt(lhs), (Object)rhs);
  }

  public Object doAdd(final long lhs, final byte rhs) {
    return doAdd(new NgLong(lhs), new NgByte(rhs));
  }

  public Object doAdd(final long lhs, final char rhs) {
    return doAdd(new NgLong(lhs), new NgChar(rhs));
  }

  public Object doAdd(final long lhs, final short rhs) {
    return doAdd(new NgLong(lhs), new NgShort(rhs));
  }

  public Object doAdd(final long lhs, final int rhs) {
    return doAdd(new NgLong(lhs), new NgInt(rhs));
  }

  public Object doAdd(final long lhs, final long rhs) {
    return doAdd(new NgLong(lhs), new NgLong(rhs));
  }

  public Object doAdd(final long lhs, final float rhs) {
    return doAdd(new NgLong(lhs), new NgFloat(rhs));
  }

  public Object doAdd(final long lhs, final double rhs) {
    return doAdd(new NgLong(lhs), new NgDouble(rhs));
  }

  public Object doAdd(final long lhs, final BigInteger rhs) {
    return doAdd(new NgLong(lhs), (Object)rhs);
  }

  public Object doAdd(final long lhs, final BigDecimal rhs) {
    return doAdd(new NgLong(lhs), (Object)rhs);
  }

  public Object doAdd(final float lhs, final byte rhs) {
    return doAdd(new NgFloat(lhs), new NgByte(rhs));
  }

  public Object doAdd(final float lhs, final char rhs) {
    return doAdd(new NgFloat(lhs), new NgChar(rhs));
  }

  public Object doAdd(final float lhs, final short rhs) {
    return doAdd(new NgFloat(lhs), new NgShort(rhs));
  }

  public Object doAdd(final float lhs, final int rhs) {
    return doAdd(new NgFloat(lhs), new NgInt(rhs));
  }

  public Object doAdd(final float lhs, final long rhs) {
    return doAdd(new NgFloat(lhs), new NgLong(rhs));
  }

  public Object doAdd(final float lhs, final float rhs) {
    return doAdd(new NgFloat(lhs), new NgFloat(rhs));
  }

  public Object doAdd(final float lhs, final double rhs) {
    return doAdd(new NgFloat(lhs), new NgDouble(rhs));
  }

  public Object doAdd(final float lhs, final BigInteger rhs) {
    return doAdd(new NgFloat(lhs), (Object)rhs);
  }

  public Object doAdd(final float lhs, final BigDecimal rhs) {
    return doAdd(new NgFloat(lhs), (Object)rhs);
  }

  public Object doAdd(final double lhs, final byte rhs) {
    return doAdd(new NgDouble(lhs), new NgByte(rhs));
  }

  public Object doAdd(final double lhs, final char rhs) {
    return doAdd(new NgDouble(lhs), new NgChar(rhs));
  }

  public Object doAdd(final double lhs, final short rhs) {
    return doAdd(new NgDouble(lhs), new NgShort(rhs));
  }

  public Object doAdd(final double lhs, final int rhs) {
    return doAdd(new NgDouble(lhs), new NgInt(rhs));
  }

  public Object doAdd(final double lhs, final long rhs) {
    return doAdd(new NgDouble(lhs), new NgLong(rhs));
  }

  public Object doAdd(final double lhs, final float rhs) {
    return doAdd(new NgDouble(lhs), new NgFloat(rhs));
  }

  public Object doAdd(final double lhs, final double rhs) {
    return doAdd(new NgDouble(lhs), new NgDouble(rhs));
  }

  public Object doAdd(final double lhs, final BigInteger rhs) {
    return doAdd(new NgDouble(lhs), (Object)rhs);
  }

  public Object doAdd(final double lhs, final BigDecimal rhs) {
    return doAdd(new NgDouble(lhs), (Object)rhs);
  }

  public Object doAdd(final BigInteger lhs, final byte rhs) {
    return doAdd((Object)lhs, new NgByte(rhs));
  }

  public Object doAdd(final BigInteger lhs, final char rhs) {
    return doAdd((Object)lhs, new NgChar(rhs));
  }

  public Object doAdd(final BigInteger lhs, final short rhs) {
    return doAdd((Object)lhs, new NgShort(rhs));
  }

  public Object doAdd(final BigInteger lhs, final int rhs) {
    return doAdd((Object)lhs, new NgInt(rhs));
  }

  public Object doAdd(final BigInteger lhs, final long rhs) {
    return doAdd((Object)lhs, new NgLong(rhs));
  }

  public Object doAdd(final BigInteger lhs, final float rhs) {
    return doAdd((Object)lhs, new NgFloat(rhs));
  }

  public Object doAdd(final BigInteger lhs, final double rhs) {
    return doAdd((Object)lhs, new NgDouble(rhs));
  }

  public Object doAdd(final BigInteger lhs, final BigInteger rhs) {
    return doAdd((Object)lhs, (Object)rhs);
  }

  public Object doAdd(final BigInteger lhs, final BigDecimal rhs) {
    return doAdd((Object)lhs, (Object)rhs);
  }

  public Object doAdd(final BigDecimal lhs, final byte rhs) {
    return doAdd((Object)lhs, new NgByte(rhs));
  }

  public Object doAdd(final BigDecimal lhs, final char rhs) {
    return doAdd((Object)lhs, new NgChar(rhs));
  }

  public Object doAdd(final BigDecimal lhs, final short rhs) {
    return doAdd((Object)lhs, new NgShort(rhs));
  }

  public Object doAdd(final BigDecimal lhs, final int rhs) {
    return doAdd((Object)lhs, new NgInt(rhs));
  }

  public Object doAdd(final BigDecimal lhs, final long rhs) {
    return doAdd((Object)lhs, new NgLong(rhs));
  }

  public Object doAdd(final BigDecimal lhs, final float rhs) {
    return doAdd((Object)lhs, new NgFloat(rhs));
  }

  public Object doAdd(final BigDecimal lhs, final double rhs) {
    return doAdd((Object)lhs, new NgDouble(rhs));
  }

  public Object doAdd(final BigDecimal lhs, final BigInteger rhs) {
    return doAdd((Object)lhs, (Object)rhs);
  }

  public Object doAdd(final BigDecimal lhs, final BigDecimal rhs) {
    return doAdd((Object)lhs, (Object)rhs);
  }

  public Object doAdd(final Object lhs, final byte rhs) {
  final Object rhsObject = new NgByte(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAdd(lhs, rhsObject);
  }

  public Object doAdd(final Object lhs, final char rhs) {
  final Object rhsObject = new NgChar(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAdd(lhs, rhsObject);
  }

  public Object doAdd(final Object lhs, final short rhs) {
  final Object rhsObject = new NgShort(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAdd(lhs, rhsObject);
  }

  public Object doAdd(final Object lhs, final int rhs) {
  final Object rhsObject = new NgInt(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAdd(lhs, rhsObject);
  }

  public Object doAdd(final Object lhs, final long rhs) {
  final Object rhsObject = new NgLong(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAdd(lhs, rhsObject);
  }

  public Object doAdd(final Object lhs, final float rhs) {
  final Object rhsObject = new NgFloat(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAdd(lhs, rhsObject);
  }

  public Object doAdd(final Object lhs, final double rhs) {
  final Object rhsObject = new NgDouble(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAdd(lhs, rhsObject);
  }

  public Object doAdd(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAdd(lhs, rhsObject);
  }

  public Object doAdd(final Object lhs, final BigDecimal rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAdd(lhs, rhsObject);
  }

  public Object doReverseAdd(final byte lhs, final Object rhs) {
  final Object lhsObject = new NgByte(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAdd(lhsObject, rhs);
  }

  public Object doReverseAdd(final char lhs, final Object rhs) {
  final Object lhsObject = new NgChar(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAdd(lhsObject, rhs);
  }

  public Object doReverseAdd(final short lhs, final Object rhs) {
  final Object lhsObject = new NgShort(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAdd(lhsObject, rhs);
  }

  public Object doReverseAdd(final int lhs, final Object rhs) {
  final Object lhsObject = new NgInt(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAdd(lhsObject, rhs);
  }

  public Object doReverseAdd(final long lhs, final Object rhs) {
  final Object lhsObject = new NgLong(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAdd(lhsObject, rhs);
  }

  public Object doReverseAdd(final float lhs, final Object rhs) {
  final Object lhsObject = new NgFloat(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAdd(lhsObject, rhs);
  }

  public Object doReverseAdd(final double lhs, final Object rhs) {
  final Object lhsObject = new NgDouble(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAdd(lhsObject, rhs);
  }

  public Object doReverseAdd(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAdd(lhsObject, rhs);
  }

  public Object doReverseAdd(final BigDecimal lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAdd(lhsObject, rhs);
  }

  //
  //   Internal methods for operator +=
  //
  //  These methods can be overidden to implement +=
  //  If the underlying object does not have the appropriate method
  //
  public Object doAddEquals(final Object lhs, final Object rhs) {
    final Object result = this.instanceHandler.addEquals(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAddEquals(lhs, rhs);
    } else {
      return result;
    }
  }
  
  public Object doReverseAddEquals(final Object lhs, final Object rhs) {
    return this.instanceHandler.reverseAddEquals(lhs, rhs);
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doAddEquals(final byte lhs, final byte rhs) {
    return doAddEquals(new NgByte(lhs), new NgByte(rhs));
  }

  public Object doAddEquals(final byte lhs, final char rhs) {
    return doAddEquals(new NgByte(lhs), new NgChar(rhs));
  }

  public Object doAddEquals(final byte lhs, final short rhs) {
    return doAddEquals(new NgByte(lhs), new NgShort(rhs));
  }

  public Object doAddEquals(final byte lhs, final int rhs) {
    return doAddEquals(new NgByte(lhs), new NgInt(rhs));
  }

  public Object doAddEquals(final byte lhs, final long rhs) {
    return doAddEquals(new NgByte(lhs), new NgLong(rhs));
  }

  public Object doAddEquals(final byte lhs, final float rhs) {
    return doAddEquals(new NgByte(lhs), new NgFloat(rhs));
  }

  public Object doAddEquals(final byte lhs, final double rhs) {
    return doAddEquals(new NgByte(lhs), new NgDouble(rhs));
  }

  public Object doAddEquals(final byte lhs, final BigInteger rhs) {
    return doAddEquals(new NgByte(lhs), (Object)rhs);
  }

  public Object doAddEquals(final byte lhs, final BigDecimal rhs) {
    return doAddEquals(new NgByte(lhs), (Object)rhs);
  }

  public Object doAddEquals(final char lhs, final byte rhs) {
    return doAddEquals(new NgChar(lhs), new NgByte(rhs));
  }

  public Object doAddEquals(final char lhs, final char rhs) {
    return doAddEquals(new NgChar(lhs), new NgChar(rhs));
  }

  public Object doAddEquals(final char lhs, final short rhs) {
    return doAddEquals(new NgChar(lhs), new NgShort(rhs));
  }

  public Object doAddEquals(final char lhs, final int rhs) {
    return doAddEquals(new NgChar(lhs), new NgInt(rhs));
  }

  public Object doAddEquals(final char lhs, final long rhs) {
    return doAddEquals(new NgChar(lhs), new NgLong(rhs));
  }

  public Object doAddEquals(final char lhs, final float rhs) {
    return doAddEquals(new NgChar(lhs), new NgFloat(rhs));
  }

  public Object doAddEquals(final char lhs, final double rhs) {
    return doAddEquals(new NgChar(lhs), new NgDouble(rhs));
  }

  public Object doAddEquals(final char lhs, final BigInteger rhs) {
    return doAddEquals(new NgChar(lhs), (Object)rhs);
  }

  public Object doAddEquals(final char lhs, final BigDecimal rhs) {
    return doAddEquals(new NgChar(lhs), (Object)rhs);
  }

  public Object doAddEquals(final short lhs, final byte rhs) {
    return doAddEquals(new NgShort(lhs), new NgByte(rhs));
  }

  public Object doAddEquals(final short lhs, final char rhs) {
    return doAddEquals(new NgShort(lhs), new NgChar(rhs));
  }

  public Object doAddEquals(final short lhs, final short rhs) {
    return doAddEquals(new NgShort(lhs), new NgShort(rhs));
  }

  public Object doAddEquals(final short lhs, final int rhs) {
    return doAddEquals(new NgShort(lhs), new NgInt(rhs));
  }

  public Object doAddEquals(final short lhs, final long rhs) {
    return doAddEquals(new NgShort(lhs), new NgLong(rhs));
  }

  public Object doAddEquals(final short lhs, final float rhs) {
    return doAddEquals(new NgShort(lhs), new NgFloat(rhs));
  }

  public Object doAddEquals(final short lhs, final double rhs) {
    return doAddEquals(new NgShort(lhs), new NgDouble(rhs));
  }

  public Object doAddEquals(final short lhs, final BigInteger rhs) {
    return doAddEquals(new NgShort(lhs), (Object)rhs);
  }

  public Object doAddEquals(final short lhs, final BigDecimal rhs) {
    return doAddEquals(new NgShort(lhs), (Object)rhs);
  }

  public Object doAddEquals(final int lhs, final byte rhs) {
    return doAddEquals(new NgInt(lhs), new NgByte(rhs));
  }

  public Object doAddEquals(final int lhs, final char rhs) {
    return doAddEquals(new NgInt(lhs), new NgChar(rhs));
  }

  public Object doAddEquals(final int lhs, final short rhs) {
    return doAddEquals(new NgInt(lhs), new NgShort(rhs));
  }

  public Object doAddEquals(final int lhs, final int rhs) {
    return doAddEquals(new NgInt(lhs), new NgInt(rhs));
  }

  public Object doAddEquals(final int lhs, final long rhs) {
    return doAddEquals(new NgInt(lhs), new NgLong(rhs));
  }

  public Object doAddEquals(final int lhs, final float rhs) {
    return doAddEquals(new NgInt(lhs), new NgFloat(rhs));
  }

  public Object doAddEquals(final int lhs, final double rhs) {
    return doAddEquals(new NgInt(lhs), new NgDouble(rhs));
  }

  public Object doAddEquals(final int lhs, final BigInteger rhs) {
    return doAddEquals(new NgInt(lhs), (Object)rhs);
  }

  public Object doAddEquals(final int lhs, final BigDecimal rhs) {
    return doAddEquals(new NgInt(lhs), (Object)rhs);
  }

  public Object doAddEquals(final long lhs, final byte rhs) {
    return doAddEquals(new NgLong(lhs), new NgByte(rhs));
  }

  public Object doAddEquals(final long lhs, final char rhs) {
    return doAddEquals(new NgLong(lhs), new NgChar(rhs));
  }

  public Object doAddEquals(final long lhs, final short rhs) {
    return doAddEquals(new NgLong(lhs), new NgShort(rhs));
  }

  public Object doAddEquals(final long lhs, final int rhs) {
    return doAddEquals(new NgLong(lhs), new NgInt(rhs));
  }

  public Object doAddEquals(final long lhs, final long rhs) {
    return doAddEquals(new NgLong(lhs), new NgLong(rhs));
  }

  public Object doAddEquals(final long lhs, final float rhs) {
    return doAddEquals(new NgLong(lhs), new NgFloat(rhs));
  }

  public Object doAddEquals(final long lhs, final double rhs) {
    return doAddEquals(new NgLong(lhs), new NgDouble(rhs));
  }

  public Object doAddEquals(final long lhs, final BigInteger rhs) {
    return doAddEquals(new NgLong(lhs), (Object)rhs);
  }

  public Object doAddEquals(final long lhs, final BigDecimal rhs) {
    return doAddEquals(new NgLong(lhs), (Object)rhs);
  }

  public Object doAddEquals(final float lhs, final byte rhs) {
    return doAddEquals(new NgFloat(lhs), new NgByte(rhs));
  }

  public Object doAddEquals(final float lhs, final char rhs) {
    return doAddEquals(new NgFloat(lhs), new NgChar(rhs));
  }

  public Object doAddEquals(final float lhs, final short rhs) {
    return doAddEquals(new NgFloat(lhs), new NgShort(rhs));
  }

  public Object doAddEquals(final float lhs, final int rhs) {
    return doAddEquals(new NgFloat(lhs), new NgInt(rhs));
  }

  public Object doAddEquals(final float lhs, final long rhs) {
    return doAddEquals(new NgFloat(lhs), new NgLong(rhs));
  }

  public Object doAddEquals(final float lhs, final float rhs) {
    return doAddEquals(new NgFloat(lhs), new NgFloat(rhs));
  }

  public Object doAddEquals(final float lhs, final double rhs) {
    return doAddEquals(new NgFloat(lhs), new NgDouble(rhs));
  }

  public Object doAddEquals(final float lhs, final BigInteger rhs) {
    return doAddEquals(new NgFloat(lhs), (Object)rhs);
  }

  public Object doAddEquals(final float lhs, final BigDecimal rhs) {
    return doAddEquals(new NgFloat(lhs), (Object)rhs);
  }

  public Object doAddEquals(final double lhs, final byte rhs) {
    return doAddEquals(new NgDouble(lhs), new NgByte(rhs));
  }

  public Object doAddEquals(final double lhs, final char rhs) {
    return doAddEquals(new NgDouble(lhs), new NgChar(rhs));
  }

  public Object doAddEquals(final double lhs, final short rhs) {
    return doAddEquals(new NgDouble(lhs), new NgShort(rhs));
  }

  public Object doAddEquals(final double lhs, final int rhs) {
    return doAddEquals(new NgDouble(lhs), new NgInt(rhs));
  }

  public Object doAddEquals(final double lhs, final long rhs) {
    return doAddEquals(new NgDouble(lhs), new NgLong(rhs));
  }

  public Object doAddEquals(final double lhs, final float rhs) {
    return doAddEquals(new NgDouble(lhs), new NgFloat(rhs));
  }

  public Object doAddEquals(final double lhs, final double rhs) {
    return doAddEquals(new NgDouble(lhs), new NgDouble(rhs));
  }

  public Object doAddEquals(final double lhs, final BigInteger rhs) {
    return doAddEquals(new NgDouble(lhs), (Object)rhs);
  }

  public Object doAddEquals(final double lhs, final BigDecimal rhs) {
    return doAddEquals(new NgDouble(lhs), (Object)rhs);
  }

  public Object doAddEquals(final BigInteger lhs, final byte rhs) {
    return doAddEquals((Object)lhs, new NgByte(rhs));
  }

  public Object doAddEquals(final BigInteger lhs, final char rhs) {
    return doAddEquals((Object)lhs, new NgChar(rhs));
  }

  public Object doAddEquals(final BigInteger lhs, final short rhs) {
    return doAddEquals((Object)lhs, new NgShort(rhs));
  }

  public Object doAddEquals(final BigInteger lhs, final int rhs) {
    return doAddEquals((Object)lhs, new NgInt(rhs));
  }

  public Object doAddEquals(final BigInteger lhs, final long rhs) {
    return doAddEquals((Object)lhs, new NgLong(rhs));
  }

  public Object doAddEquals(final BigInteger lhs, final float rhs) {
    return doAddEquals((Object)lhs, new NgFloat(rhs));
  }

  public Object doAddEquals(final BigInteger lhs, final double rhs) {
    return doAddEquals((Object)lhs, new NgDouble(rhs));
  }

  public Object doAddEquals(final BigInteger lhs, final BigInteger rhs) {
    return doAddEquals((Object)lhs, (Object)rhs);
  }

  public Object doAddEquals(final BigInteger lhs, final BigDecimal rhs) {
    return doAddEquals((Object)lhs, (Object)rhs);
  }

  public Object doAddEquals(final BigDecimal lhs, final byte rhs) {
    return doAddEquals((Object)lhs, new NgByte(rhs));
  }

  public Object doAddEquals(final BigDecimal lhs, final char rhs) {
    return doAddEquals((Object)lhs, new NgChar(rhs));
  }

  public Object doAddEquals(final BigDecimal lhs, final short rhs) {
    return doAddEquals((Object)lhs, new NgShort(rhs));
  }

  public Object doAddEquals(final BigDecimal lhs, final int rhs) {
    return doAddEquals((Object)lhs, new NgInt(rhs));
  }

  public Object doAddEquals(final BigDecimal lhs, final long rhs) {
    return doAddEquals((Object)lhs, new NgLong(rhs));
  }

  public Object doAddEquals(final BigDecimal lhs, final float rhs) {
    return doAddEquals((Object)lhs, new NgFloat(rhs));
  }

  public Object doAddEquals(final BigDecimal lhs, final double rhs) {
    return doAddEquals((Object)lhs, new NgDouble(rhs));
  }

  public Object doAddEquals(final BigDecimal lhs, final BigInteger rhs) {
    return doAddEquals((Object)lhs, (Object)rhs);
  }

  public Object doAddEquals(final BigDecimal lhs, final BigDecimal rhs) {
    return doAddEquals((Object)lhs, (Object)rhs);
  }

  public Object doAddEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = new NgByte(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAddEquals(lhs, rhsObject);
  }

  public Object doAddEquals(final Object lhs, final char rhs) {
  final Object rhsObject = new NgChar(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAddEquals(lhs, rhsObject);
  }

  public Object doAddEquals(final Object lhs, final short rhs) {
  final Object rhsObject = new NgShort(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAddEquals(lhs, rhsObject);
  }

  public Object doAddEquals(final Object lhs, final int rhs) {
  final Object rhsObject = new NgInt(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAddEquals(lhs, rhsObject);
  }

  public Object doAddEquals(final Object lhs, final long rhs) {
  final Object rhsObject = new NgLong(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAddEquals(lhs, rhsObject);
  }

  public Object doAddEquals(final Object lhs, final float rhs) {
  final Object rhsObject = new NgFloat(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAddEquals(lhs, rhsObject);
  }

  public Object doAddEquals(final Object lhs, final double rhs) {
  final Object rhsObject = new NgDouble(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAddEquals(lhs, rhsObject);
  }

  public Object doAddEquals(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAddEquals(lhs, rhsObject);
  }

  public Object doAddEquals(final Object lhs, final BigDecimal rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAddEquals(lhs, rhsObject);
  }

  public Object doReverseAddEquals(final byte lhs, final Object rhs) {
  final Object lhsObject = new NgByte(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAddEquals(lhsObject, rhs);
  }

  public Object doReverseAddEquals(final char lhs, final Object rhs) {
  final Object lhsObject = new NgChar(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAddEquals(lhsObject, rhs);
  }

  public Object doReverseAddEquals(final short lhs, final Object rhs) {
  final Object lhsObject = new NgShort(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAddEquals(lhsObject, rhs);
  }

  public Object doReverseAddEquals(final int lhs, final Object rhs) {
  final Object lhsObject = new NgInt(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAddEquals(lhsObject, rhs);
  }

  public Object doReverseAddEquals(final long lhs, final Object rhs) {
  final Object lhsObject = new NgLong(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAddEquals(lhsObject, rhs);
  }

  public Object doReverseAddEquals(final float lhs, final Object rhs) {
  final Object lhsObject = new NgFloat(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAddEquals(lhsObject, rhs);
  }

  public Object doReverseAddEquals(final double lhs, final Object rhs) {
  final Object lhsObject = new NgDouble(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAddEquals(lhsObject, rhs);
  }

  public Object doReverseAddEquals(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAddEquals(lhsObject, rhs);
  }

  public Object doReverseAddEquals(final BigDecimal lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAddEquals(lhsObject, rhs);
  }

  //
  //   Internal methods for operator -
  //
  //  These methods can be overidden to implement -
  //  If the underlying object does not have the appropriate method
  //
  public Object doSubtract(final Object lhs, final Object rhs) {
  final Object result = this.instanceHandler.subtract(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtract(lhs, rhs);
    } else {
      return result;
    }
  }
  
  public Object doReverseSubtract(final Object lhs, final Object rhs) {
    return this.instanceHandler.reverseSubtract(lhs, rhs);
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doSubtract(final byte lhs, final byte rhs) {
    return doSubtract(new NgByte(lhs), new NgByte(rhs));
  }

  public Object doSubtract(final byte lhs, final char rhs) {
    return doSubtract(new NgByte(lhs), new NgChar(rhs));
  }

  public Object doSubtract(final byte lhs, final short rhs) {
    return doSubtract(new NgByte(lhs), new NgShort(rhs));
  }

  public Object doSubtract(final byte lhs, final int rhs) {
    return doSubtract(new NgByte(lhs), new NgInt(rhs));
  }

  public Object doSubtract(final byte lhs, final long rhs) {
    return doSubtract(new NgByte(lhs), new NgLong(rhs));
  }

  public Object doSubtract(final byte lhs, final float rhs) {
    return doSubtract(new NgByte(lhs), new NgFloat(rhs));
  }

  public Object doSubtract(final byte lhs, final double rhs) {
    return doSubtract(new NgByte(lhs), new NgDouble(rhs));
  }

  public Object doSubtract(final byte lhs, final BigInteger rhs) {
    return doSubtract(new NgByte(lhs), (Object)rhs);
  }

  public Object doSubtract(final byte lhs, final BigDecimal rhs) {
    return doSubtract(new NgByte(lhs), (Object)rhs);
  }

  public Object doSubtract(final char lhs, final byte rhs) {
    return doSubtract(new NgChar(lhs), new NgByte(rhs));
  }

  public Object doSubtract(final char lhs, final char rhs) {
    return doSubtract(new NgChar(lhs), new NgChar(rhs));
  }

  public Object doSubtract(final char lhs, final short rhs) {
    return doSubtract(new NgChar(lhs), new NgShort(rhs));
  }

  public Object doSubtract(final char lhs, final int rhs) {
    return doSubtract(new NgChar(lhs), new NgInt(rhs));
  }

  public Object doSubtract(final char lhs, final long rhs) {
    return doSubtract(new NgChar(lhs), new NgLong(rhs));
  }

  public Object doSubtract(final char lhs, final float rhs) {
    return doSubtract(new NgChar(lhs), new NgFloat(rhs));
  }

  public Object doSubtract(final char lhs, final double rhs) {
    return doSubtract(new NgChar(lhs), new NgDouble(rhs));
  }

  public Object doSubtract(final char lhs, final BigInteger rhs) {
    return doSubtract(new NgChar(lhs), (Object)rhs);
  }

  public Object doSubtract(final char lhs, final BigDecimal rhs) {
    return doSubtract(new NgChar(lhs), (Object)rhs);
  }

  public Object doSubtract(final short lhs, final byte rhs) {
    return doSubtract(new NgShort(lhs), new NgByte(rhs));
  }

  public Object doSubtract(final short lhs, final char rhs) {
    return doSubtract(new NgShort(lhs), new NgChar(rhs));
  }

  public Object doSubtract(final short lhs, final short rhs) {
    return doSubtract(new NgShort(lhs), new NgShort(rhs));
  }

  public Object doSubtract(final short lhs, final int rhs) {
    return doSubtract(new NgShort(lhs), new NgInt(rhs));
  }

  public Object doSubtract(final short lhs, final long rhs) {
    return doSubtract(new NgShort(lhs), new NgLong(rhs));
  }

  public Object doSubtract(final short lhs, final float rhs) {
    return doSubtract(new NgShort(lhs), new NgFloat(rhs));
  }

  public Object doSubtract(final short lhs, final double rhs) {
    return doSubtract(new NgShort(lhs), new NgDouble(rhs));
  }

  public Object doSubtract(final short lhs, final BigInteger rhs) {
    return doSubtract(new NgShort(lhs), (Object)rhs);
  }

  public Object doSubtract(final short lhs, final BigDecimal rhs) {
    return doSubtract(new NgShort(lhs), (Object)rhs);
  }

  public Object doSubtract(final int lhs, final byte rhs) {
    return doSubtract(new NgInt(lhs), new NgByte(rhs));
  }

  public Object doSubtract(final int lhs, final char rhs) {
    return doSubtract(new NgInt(lhs), new NgChar(rhs));
  }

  public Object doSubtract(final int lhs, final short rhs) {
    return doSubtract(new NgInt(lhs), new NgShort(rhs));
  }

  public Object doSubtract(final int lhs, final int rhs) {
    return doSubtract(new NgInt(lhs), new NgInt(rhs));
  }

  public Object doSubtract(final int lhs, final long rhs) {
    return doSubtract(new NgInt(lhs), new NgLong(rhs));
  }

  public Object doSubtract(final int lhs, final float rhs) {
    return doSubtract(new NgInt(lhs), new NgFloat(rhs));
  }

  public Object doSubtract(final int lhs, final double rhs) {
    return doSubtract(new NgInt(lhs), new NgDouble(rhs));
  }

  public Object doSubtract(final int lhs, final BigInteger rhs) {
    return doSubtract(new NgInt(lhs), (Object)rhs);
  }

  public Object doSubtract(final int lhs, final BigDecimal rhs) {
    return doSubtract(new NgInt(lhs), (Object)rhs);
  }

  public Object doSubtract(final long lhs, final byte rhs) {
    return doSubtract(new NgLong(lhs), new NgByte(rhs));
  }

  public Object doSubtract(final long lhs, final char rhs) {
    return doSubtract(new NgLong(lhs), new NgChar(rhs));
  }

  public Object doSubtract(final long lhs, final short rhs) {
    return doSubtract(new NgLong(lhs), new NgShort(rhs));
  }

  public Object doSubtract(final long lhs, final int rhs) {
    return doSubtract(new NgLong(lhs), new NgInt(rhs));
  }

  public Object doSubtract(final long lhs, final long rhs) {
    return doSubtract(new NgLong(lhs), new NgLong(rhs));
  }

  public Object doSubtract(final long lhs, final float rhs) {
    return doSubtract(new NgLong(lhs), new NgFloat(rhs));
  }

  public Object doSubtract(final long lhs, final double rhs) {
    return doSubtract(new NgLong(lhs), new NgDouble(rhs));
  }

  public Object doSubtract(final long lhs, final BigInteger rhs) {
    return doSubtract(new NgLong(lhs), (Object)rhs);
  }

  public Object doSubtract(final long lhs, final BigDecimal rhs) {
    return doSubtract(new NgLong(lhs), (Object)rhs);
  }

  public Object doSubtract(final float lhs, final byte rhs) {
    return doSubtract(new NgFloat(lhs), new NgByte(rhs));
  }

  public Object doSubtract(final float lhs, final char rhs) {
    return doSubtract(new NgFloat(lhs), new NgChar(rhs));
  }

  public Object doSubtract(final float lhs, final short rhs) {
    return doSubtract(new NgFloat(lhs), new NgShort(rhs));
  }

  public Object doSubtract(final float lhs, final int rhs) {
    return doSubtract(new NgFloat(lhs), new NgInt(rhs));
  }

  public Object doSubtract(final float lhs, final long rhs) {
    return doSubtract(new NgFloat(lhs), new NgLong(rhs));
  }

  public Object doSubtract(final float lhs, final float rhs) {
    return doSubtract(new NgFloat(lhs), new NgFloat(rhs));
  }

  public Object doSubtract(final float lhs, final double rhs) {
    return doSubtract(new NgFloat(lhs), new NgDouble(rhs));
  }

  public Object doSubtract(final float lhs, final BigInteger rhs) {
    return doSubtract(new NgFloat(lhs), (Object)rhs);
  }

  public Object doSubtract(final float lhs, final BigDecimal rhs) {
    return doSubtract(new NgFloat(lhs), (Object)rhs);
  }

  public Object doSubtract(final double lhs, final byte rhs) {
    return doSubtract(new NgDouble(lhs), new NgByte(rhs));
  }

  public Object doSubtract(final double lhs, final char rhs) {
    return doSubtract(new NgDouble(lhs), new NgChar(rhs));
  }

  public Object doSubtract(final double lhs, final short rhs) {
    return doSubtract(new NgDouble(lhs), new NgShort(rhs));
  }

  public Object doSubtract(final double lhs, final int rhs) {
    return doSubtract(new NgDouble(lhs), new NgInt(rhs));
  }

  public Object doSubtract(final double lhs, final long rhs) {
    return doSubtract(new NgDouble(lhs), new NgLong(rhs));
  }

  public Object doSubtract(final double lhs, final float rhs) {
    return doSubtract(new NgDouble(lhs), new NgFloat(rhs));
  }

  public Object doSubtract(final double lhs, final double rhs) {
    return doSubtract(new NgDouble(lhs), new NgDouble(rhs));
  }

  public Object doSubtract(final double lhs, final BigInteger rhs) {
    return doSubtract(new NgDouble(lhs), (Object)rhs);
  }

  public Object doSubtract(final double lhs, final BigDecimal rhs) {
    return doSubtract(new NgDouble(lhs), (Object)rhs);
  }

  public Object doSubtract(final BigInteger lhs, final byte rhs) {
    return doSubtract((Object)lhs, new NgByte(rhs));
  }

  public Object doSubtract(final BigInteger lhs, final char rhs) {
    return doSubtract((Object)lhs, new NgChar(rhs));
  }

  public Object doSubtract(final BigInteger lhs, final short rhs) {
    return doSubtract((Object)lhs, new NgShort(rhs));
  }

  public Object doSubtract(final BigInteger lhs, final int rhs) {
    return doSubtract((Object)lhs, new NgInt(rhs));
  }

  public Object doSubtract(final BigInteger lhs, final long rhs) {
    return doSubtract((Object)lhs, new NgLong(rhs));
  }

  public Object doSubtract(final BigInteger lhs, final float rhs) {
    return doSubtract((Object)lhs, new NgFloat(rhs));
  }

  public Object doSubtract(final BigInteger lhs, final double rhs) {
    return doSubtract((Object)lhs, new NgDouble(rhs));
  }

  public Object doSubtract(final BigInteger lhs, final BigInteger rhs) {
    return doSubtract((Object)lhs, (Object)rhs);
  }

  public Object doSubtract(final BigInteger lhs, final BigDecimal rhs) {
    return doSubtract((Object)lhs, (Object)rhs);
  }

  public Object doSubtract(final BigDecimal lhs, final byte rhs) {
    return doSubtract((Object)lhs, new NgByte(rhs));
  }

  public Object doSubtract(final BigDecimal lhs, final char rhs) {
    return doSubtract((Object)lhs, new NgChar(rhs));
  }

  public Object doSubtract(final BigDecimal lhs, final short rhs) {
    return doSubtract((Object)lhs, new NgShort(rhs));
  }

  public Object doSubtract(final BigDecimal lhs, final int rhs) {
    return doSubtract((Object)lhs, new NgInt(rhs));
  }

  public Object doSubtract(final BigDecimal lhs, final long rhs) {
    return doSubtract((Object)lhs, new NgLong(rhs));
  }

  public Object doSubtract(final BigDecimal lhs, final float rhs) {
    return doSubtract((Object)lhs, new NgFloat(rhs));
  }

  public Object doSubtract(final BigDecimal lhs, final double rhs) {
    return doSubtract((Object)lhs, new NgDouble(rhs));
  }

  public Object doSubtract(final BigDecimal lhs, final BigInteger rhs) {
    return doSubtract((Object)lhs, (Object)rhs);
  }

  public Object doSubtract(final BigDecimal lhs, final BigDecimal rhs) {
    return doSubtract((Object)lhs, (Object)rhs);
  }

  public Object doSubtract(final Object lhs, final byte rhs) {
  final Object rhsObject = new NgByte(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtract(lhs, rhsObject);
  }

  public Object doSubtract(final Object lhs, final char rhs) {
  final Object rhsObject = new NgChar(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtract(lhs, rhsObject);
  }

  public Object doSubtract(final Object lhs, final short rhs) {
  final Object rhsObject = new NgShort(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtract(lhs, rhsObject);
  }

  public Object doSubtract(final Object lhs, final int rhs) {
  final Object rhsObject = new NgInt(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtract(lhs, rhsObject);
  }

  public Object doSubtract(final Object lhs, final long rhs) {
  final Object rhsObject = new NgLong(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtract(lhs, rhsObject);
  }

  public Object doSubtract(final Object lhs, final float rhs) {
  final Object rhsObject = new NgFloat(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtract(lhs, rhsObject);
  }

  public Object doSubtract(final Object lhs, final double rhs) {
  final Object rhsObject = new NgDouble(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtract(lhs, rhsObject);
  }

  public Object doSubtract(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtract(lhs, rhsObject);
  }

  public Object doSubtract(final Object lhs, final BigDecimal rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtract(lhs, rhsObject);
  }

  public Object doReverseSubtract(final byte lhs, final Object rhs) {
  final Object lhsObject = new NgByte(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtract(lhsObject, rhs);
  }

  public Object doReverseSubtract(final char lhs, final Object rhs) {
  final Object lhsObject = new NgChar(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtract(lhsObject, rhs);
  }

  public Object doReverseSubtract(final short lhs, final Object rhs) {
  final Object lhsObject = new NgShort(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtract(lhsObject, rhs);
  }

  public Object doReverseSubtract(final int lhs, final Object rhs) {
  final Object lhsObject = new NgInt(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtract(lhsObject, rhs);
  }

  public Object doReverseSubtract(final long lhs, final Object rhs) {
  final Object lhsObject = new NgLong(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtract(lhsObject, rhs);
  }

  public Object doReverseSubtract(final float lhs, final Object rhs) {
  final Object lhsObject = new NgFloat(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtract(lhsObject, rhs);
  }

  public Object doReverseSubtract(final double lhs, final Object rhs) {
  final Object lhsObject = new NgDouble(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtract(lhsObject, rhs);
  }

  public Object doReverseSubtract(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtract(lhsObject, rhs);
  }

  public Object doReverseSubtract(final BigDecimal lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtract(lhsObject, rhs);
  }

  //
  //   Internal methods for operator -=
  //
  //  These methods can be overidden to implement -=
  //  If the underlying object does not have the appropriate method
  //
  public Object doSubtractEquals(final Object lhs, final Object rhs) {
  final Object result = this.instanceHandler.subtractEquals(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtractEquals(lhs, rhs);
    } else {
      return result;
    }
  }
  
  public Object doReverseSubtractEquals(final Object lhs, final Object rhs) {
    return this.instanceHandler.reverseSubtractEquals(lhs, rhs);
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doSubtractEquals(final byte lhs, final byte rhs) {
    return doSubtractEquals(new NgByte(lhs), new NgByte(rhs));
  }

  public Object doSubtractEquals(final byte lhs, final char rhs) {
    return doSubtractEquals(new NgByte(lhs), new NgChar(rhs));
  }

  public Object doSubtractEquals(final byte lhs, final short rhs) {
    return doSubtractEquals(new NgByte(lhs), new NgShort(rhs));
  }

  public Object doSubtractEquals(final byte lhs, final int rhs) {
    return doSubtractEquals(new NgByte(lhs), new NgInt(rhs));
  }

  public Object doSubtractEquals(final byte lhs, final long rhs) {
    return doSubtractEquals(new NgByte(lhs), new NgLong(rhs));
  }

  public Object doSubtractEquals(final byte lhs, final float rhs) {
    return doSubtractEquals(new NgByte(lhs), new NgFloat(rhs));
  }

  public Object doSubtractEquals(final byte lhs, final double rhs) {
    return doSubtractEquals(new NgByte(lhs), new NgDouble(rhs));
  }

  public Object doSubtractEquals(final byte lhs, final BigInteger rhs) {
    return doSubtractEquals(new NgByte(lhs), (Object)rhs);
  }

  public Object doSubtractEquals(final byte lhs, final BigDecimal rhs) {
    return doSubtractEquals(new NgByte(lhs), (Object)rhs);
  }

  public Object doSubtractEquals(final char lhs, final byte rhs) {
    return doSubtractEquals(new NgChar(lhs), new NgByte(rhs));
  }

  public Object doSubtractEquals(final char lhs, final char rhs) {
    return doSubtractEquals(new NgChar(lhs), new NgChar(rhs));
  }

  public Object doSubtractEquals(final char lhs, final short rhs) {
    return doSubtractEquals(new NgChar(lhs), new NgShort(rhs));
  }

  public Object doSubtractEquals(final char lhs, final int rhs) {
    return doSubtractEquals(new NgChar(lhs), new NgInt(rhs));
  }

  public Object doSubtractEquals(final char lhs, final long rhs) {
    return doSubtractEquals(new NgChar(lhs), new NgLong(rhs));
  }

  public Object doSubtractEquals(final char lhs, final float rhs) {
    return doSubtractEquals(new NgChar(lhs), new NgFloat(rhs));
  }

  public Object doSubtractEquals(final char lhs, final double rhs) {
    return doSubtractEquals(new NgChar(lhs), new NgDouble(rhs));
  }

  public Object doSubtractEquals(final char lhs, final BigInteger rhs) {
    return doSubtractEquals(new NgChar(lhs), (Object)rhs);
  }

  public Object doSubtractEquals(final char lhs, final BigDecimal rhs) {
    return doSubtractEquals(new NgChar(lhs), (Object)rhs);
  }

  public Object doSubtractEquals(final short lhs, final byte rhs) {
    return doSubtractEquals(new NgShort(lhs), new NgByte(rhs));
  }

  public Object doSubtractEquals(final short lhs, final char rhs) {
    return doSubtractEquals(new NgShort(lhs), new NgChar(rhs));
  }

  public Object doSubtractEquals(final short lhs, final short rhs) {
    return doSubtractEquals(new NgShort(lhs), new NgShort(rhs));
  }

  public Object doSubtractEquals(final short lhs, final int rhs) {
    return doSubtractEquals(new NgShort(lhs), new NgInt(rhs));
  }

  public Object doSubtractEquals(final short lhs, final long rhs) {
    return doSubtractEquals(new NgShort(lhs), new NgLong(rhs));
  }

  public Object doSubtractEquals(final short lhs, final float rhs) {
    return doSubtractEquals(new NgShort(lhs), new NgFloat(rhs));
  }

  public Object doSubtractEquals(final short lhs, final double rhs) {
    return doSubtractEquals(new NgShort(lhs), new NgDouble(rhs));
  }

  public Object doSubtractEquals(final short lhs, final BigInteger rhs) {
    return doSubtractEquals(new NgShort(lhs), (Object)rhs);
  }

  public Object doSubtractEquals(final short lhs, final BigDecimal rhs) {
    return doSubtractEquals(new NgShort(lhs), (Object)rhs);
  }

  public Object doSubtractEquals(final int lhs, final byte rhs) {
    return doSubtractEquals(new NgInt(lhs), new NgByte(rhs));
  }

  public Object doSubtractEquals(final int lhs, final char rhs) {
    return doSubtractEquals(new NgInt(lhs), new NgChar(rhs));
  }

  public Object doSubtractEquals(final int lhs, final short rhs) {
    return doSubtractEquals(new NgInt(lhs), new NgShort(rhs));
  }

  public Object doSubtractEquals(final int lhs, final int rhs) {
    return doSubtractEquals(new NgInt(lhs), new NgInt(rhs));
  }

  public Object doSubtractEquals(final int lhs, final long rhs) {
    return doSubtractEquals(new NgInt(lhs), new NgLong(rhs));
  }

  public Object doSubtractEquals(final int lhs, final float rhs) {
    return doSubtractEquals(new NgInt(lhs), new NgFloat(rhs));
  }

  public Object doSubtractEquals(final int lhs, final double rhs) {
    return doSubtractEquals(new NgInt(lhs), new NgDouble(rhs));
  }

  public Object doSubtractEquals(final int lhs, final BigInteger rhs) {
    return doSubtractEquals(new NgInt(lhs), (Object)rhs);
  }

  public Object doSubtractEquals(final int lhs, final BigDecimal rhs) {
    return doSubtractEquals(new NgInt(lhs), (Object)rhs);
  }

  public Object doSubtractEquals(final long lhs, final byte rhs) {
    return doSubtractEquals(new NgLong(lhs), new NgByte(rhs));
  }

  public Object doSubtractEquals(final long lhs, final char rhs) {
    return doSubtractEquals(new NgLong(lhs), new NgChar(rhs));
  }

  public Object doSubtractEquals(final long lhs, final short rhs) {
    return doSubtractEquals(new NgLong(lhs), new NgShort(rhs));
  }

  public Object doSubtractEquals(final long lhs, final int rhs) {
    return doSubtractEquals(new NgLong(lhs), new NgInt(rhs));
  }

  public Object doSubtractEquals(final long lhs, final long rhs) {
    return doSubtractEquals(new NgLong(lhs), new NgLong(rhs));
  }

  public Object doSubtractEquals(final long lhs, final float rhs) {
    return doSubtractEquals(new NgLong(lhs), new NgFloat(rhs));
  }

  public Object doSubtractEquals(final long lhs, final double rhs) {
    return doSubtractEquals(new NgLong(lhs), new NgDouble(rhs));
  }

  public Object doSubtractEquals(final long lhs, final BigInteger rhs) {
    return doSubtractEquals(new NgLong(lhs), (Object)rhs);
  }

  public Object doSubtractEquals(final long lhs, final BigDecimal rhs) {
    return doSubtractEquals(new NgLong(lhs), (Object)rhs);
  }

  public Object doSubtractEquals(final float lhs, final byte rhs) {
    return doSubtractEquals(new NgFloat(lhs), new NgByte(rhs));
  }

  public Object doSubtractEquals(final float lhs, final char rhs) {
    return doSubtractEquals(new NgFloat(lhs), new NgChar(rhs));
  }

  public Object doSubtractEquals(final float lhs, final short rhs) {
    return doSubtractEquals(new NgFloat(lhs), new NgShort(rhs));
  }

  public Object doSubtractEquals(final float lhs, final int rhs) {
    return doSubtractEquals(new NgFloat(lhs), new NgInt(rhs));
  }

  public Object doSubtractEquals(final float lhs, final long rhs) {
    return doSubtractEquals(new NgFloat(lhs), new NgLong(rhs));
  }

  public Object doSubtractEquals(final float lhs, final float rhs) {
    return doSubtractEquals(new NgFloat(lhs), new NgFloat(rhs));
  }

  public Object doSubtractEquals(final float lhs, final double rhs) {
    return doSubtractEquals(new NgFloat(lhs), new NgDouble(rhs));
  }

  public Object doSubtractEquals(final float lhs, final BigInteger rhs) {
    return doSubtractEquals(new NgFloat(lhs), (Object)rhs);
  }

  public Object doSubtractEquals(final float lhs, final BigDecimal rhs) {
    return doSubtractEquals(new NgFloat(lhs), (Object)rhs);
  }

  public Object doSubtractEquals(final double lhs, final byte rhs) {
    return doSubtractEquals(new NgDouble(lhs), new NgByte(rhs));
  }

  public Object doSubtractEquals(final double lhs, final char rhs) {
    return doSubtractEquals(new NgDouble(lhs), new NgChar(rhs));
  }

  public Object doSubtractEquals(final double lhs, final short rhs) {
    return doSubtractEquals(new NgDouble(lhs), new NgShort(rhs));
  }

  public Object doSubtractEquals(final double lhs, final int rhs) {
    return doSubtractEquals(new NgDouble(lhs), new NgInt(rhs));
  }

  public Object doSubtractEquals(final double lhs, final long rhs) {
    return doSubtractEquals(new NgDouble(lhs), new NgLong(rhs));
  }

  public Object doSubtractEquals(final double lhs, final float rhs) {
    return doSubtractEquals(new NgDouble(lhs), new NgFloat(rhs));
  }

  public Object doSubtractEquals(final double lhs, final double rhs) {
    return doSubtractEquals(new NgDouble(lhs), new NgDouble(rhs));
  }

  public Object doSubtractEquals(final double lhs, final BigInteger rhs) {
    return doSubtractEquals(new NgDouble(lhs), (Object)rhs);
  }

  public Object doSubtractEquals(final double lhs, final BigDecimal rhs) {
    return doSubtractEquals(new NgDouble(lhs), (Object)rhs);
  }

  public Object doSubtractEquals(final BigInteger lhs, final byte rhs) {
    return doSubtractEquals((Object)lhs, new NgByte(rhs));
  }

  public Object doSubtractEquals(final BigInteger lhs, final char rhs) {
    return doSubtractEquals((Object)lhs, new NgChar(rhs));
  }

  public Object doSubtractEquals(final BigInteger lhs, final short rhs) {
    return doSubtractEquals((Object)lhs, new NgShort(rhs));
  }

  public Object doSubtractEquals(final BigInteger lhs, final int rhs) {
    return doSubtractEquals((Object)lhs, new NgInt(rhs));
  }

  public Object doSubtractEquals(final BigInteger lhs, final long rhs) {
    return doSubtractEquals((Object)lhs, new NgLong(rhs));
  }

  public Object doSubtractEquals(final BigInteger lhs, final float rhs) {
    return doSubtractEquals((Object)lhs, new NgFloat(rhs));
  }

  public Object doSubtractEquals(final BigInteger lhs, final double rhs) {
    return doSubtractEquals((Object)lhs, new NgDouble(rhs));
  }

  public Object doSubtractEquals(final BigInteger lhs, final BigInteger rhs) {
    return doSubtractEquals((Object)lhs, (Object)rhs);
  }

  public Object doSubtractEquals(final BigInteger lhs, final BigDecimal rhs) {
    return doSubtractEquals((Object)lhs, (Object)rhs);
  }

  public Object doSubtractEquals(final BigDecimal lhs, final byte rhs) {
    return doSubtractEquals((Object)lhs, new NgByte(rhs));
  }

  public Object doSubtractEquals(final BigDecimal lhs, final char rhs) {
    return doSubtractEquals((Object)lhs, new NgChar(rhs));
  }

  public Object doSubtractEquals(final BigDecimal lhs, final short rhs) {
    return doSubtractEquals((Object)lhs, new NgShort(rhs));
  }

  public Object doSubtractEquals(final BigDecimal lhs, final int rhs) {
    return doSubtractEquals((Object)lhs, new NgInt(rhs));
  }

  public Object doSubtractEquals(final BigDecimal lhs, final long rhs) {
    return doSubtractEquals((Object)lhs, new NgLong(rhs));
  }

  public Object doSubtractEquals(final BigDecimal lhs, final float rhs) {
    return doSubtractEquals((Object)lhs, new NgFloat(rhs));
  }

  public Object doSubtractEquals(final BigDecimal lhs, final double rhs) {
    return doSubtractEquals((Object)lhs, new NgDouble(rhs));
  }

  public Object doSubtractEquals(final BigDecimal lhs, final BigInteger rhs) {
    return doSubtractEquals((Object)lhs, (Object)rhs);
  }

  public Object doSubtractEquals(final BigDecimal lhs, final BigDecimal rhs) {
    return doSubtractEquals((Object)lhs, (Object)rhs);
  }

  public Object doSubtractEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = new NgByte(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtractEquals(lhs, rhsObject);
  }

  public Object doSubtractEquals(final Object lhs, final char rhs) {
  final Object rhsObject = new NgChar(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtractEquals(lhs, rhsObject);
  }

  public Object doSubtractEquals(final Object lhs, final short rhs) {
  final Object rhsObject = new NgShort(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtractEquals(lhs, rhsObject);
  }

  public Object doSubtractEquals(final Object lhs, final int rhs) {
  final Object rhsObject = new NgInt(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtractEquals(lhs, rhsObject);
  }

  public Object doSubtractEquals(final Object lhs, final long rhs) {
  final Object rhsObject = new NgLong(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtractEquals(lhs, rhsObject);
  }

  public Object doSubtractEquals(final Object lhs, final float rhs) {
  final Object rhsObject = new NgFloat(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtractEquals(lhs, rhsObject);
  }

  public Object doSubtractEquals(final Object lhs, final double rhs) {
  final Object rhsObject = new NgDouble(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtractEquals(lhs, rhsObject);
  }

  public Object doSubtractEquals(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtractEquals(lhs, rhsObject);
  }

  public Object doSubtractEquals(final Object lhs, final BigDecimal rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseSubtractEquals(lhs, rhsObject);
  }

  public Object doReverseSubtractEquals(final byte lhs, final Object rhs) {
  final Object lhsObject = new NgByte(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtractEquals(lhsObject, rhs);
  }

  public Object doReverseSubtractEquals(final char lhs, final Object rhs) {
  final Object lhsObject = new NgChar(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtractEquals(lhsObject, rhs);
  }

  public Object doReverseSubtractEquals(final short lhs, final Object rhs) {
  final Object lhsObject = new NgShort(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtractEquals(lhsObject, rhs);
  }

  public Object doReverseSubtractEquals(final int lhs, final Object rhs) {
  final Object lhsObject = new NgInt(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtractEquals(lhsObject, rhs);
  }

  public Object doReverseSubtractEquals(final long lhs, final Object rhs) {
  final Object lhsObject = new NgLong(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtractEquals(lhsObject, rhs);
  }

  public Object doReverseSubtractEquals(final float lhs, final Object rhs) {
  final Object lhsObject = new NgFloat(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtractEquals(lhsObject, rhs);
  }

  public Object doReverseSubtractEquals(final double lhs, final Object rhs) {
  final Object lhsObject = new NgDouble(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtractEquals(lhsObject, rhs);
  }

  public Object doReverseSubtractEquals(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtractEquals(lhsObject, rhs);
  }

  public Object doReverseSubtractEquals(final BigDecimal lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtractEquals(lhsObject, rhs);
  }

  //
  //   Internal methods for operator *
  //
  //  These methods can be overidden to implement *
  //  If the underlying object does not have the appropriate method
  //
  public Object doMultiply(final Object lhs, final Object rhs) {
  final Object result = this.instanceHandler.multiply(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiply(lhs, rhs);
    } else {
      return result;
    }
  }
  
  public Object doReverseMultiply(final Object lhs, final Object rhs) {
    return this.instanceHandler.reverseMultiply(lhs, rhs);
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doMultiply(final byte lhs, final byte rhs) {
    return doMultiply(new NgByte(lhs), new NgByte(rhs));
  }

  public Object doMultiply(final byte lhs, final char rhs) {
    return doMultiply(new NgByte(lhs), new NgChar(rhs));
  }

  public Object doMultiply(final byte lhs, final short rhs) {
    return doMultiply(new NgByte(lhs), new NgShort(rhs));
  }

  public Object doMultiply(final byte lhs, final int rhs) {
    return doMultiply(new NgByte(lhs), new NgInt(rhs));
  }

  public Object doMultiply(final byte lhs, final long rhs) {
    return doMultiply(new NgByte(lhs), new NgLong(rhs));
  }

  public Object doMultiply(final byte lhs, final float rhs) {
    return doMultiply(new NgByte(lhs), new NgFloat(rhs));
  }

  public Object doMultiply(final byte lhs, final double rhs) {
    return doMultiply(new NgByte(lhs), new NgDouble(rhs));
  }

  public Object doMultiply(final byte lhs, final BigInteger rhs) {
    return doMultiply(new NgByte(lhs), (Object)rhs);
  }

  public Object doMultiply(final byte lhs, final BigDecimal rhs) {
    return doMultiply(new NgByte(lhs), (Object)rhs);
  }

  public Object doMultiply(final char lhs, final byte rhs) {
    return doMultiply(new NgChar(lhs), new NgByte(rhs));
  }

  public Object doMultiply(final char lhs, final char rhs) {
    return doMultiply(new NgChar(lhs), new NgChar(rhs));
  }

  public Object doMultiply(final char lhs, final short rhs) {
    return doMultiply(new NgChar(lhs), new NgShort(rhs));
  }

  public Object doMultiply(final char lhs, final int rhs) {
    return doMultiply(new NgChar(lhs), new NgInt(rhs));
  }

  public Object doMultiply(final char lhs, final long rhs) {
    return doMultiply(new NgChar(lhs), new NgLong(rhs));
  }

  public Object doMultiply(final char lhs, final float rhs) {
    return doMultiply(new NgChar(lhs), new NgFloat(rhs));
  }

  public Object doMultiply(final char lhs, final double rhs) {
    return doMultiply(new NgChar(lhs), new NgDouble(rhs));
  }

  public Object doMultiply(final char lhs, final BigInteger rhs) {
    return doMultiply(new NgChar(lhs), (Object)rhs);
  }

  public Object doMultiply(final char lhs, final BigDecimal rhs) {
    return doMultiply(new NgChar(lhs), (Object)rhs);
  }

  public Object doMultiply(final short lhs, final byte rhs) {
    return doMultiply(new NgShort(lhs), new NgByte(rhs));
  }

  public Object doMultiply(final short lhs, final char rhs) {
    return doMultiply(new NgShort(lhs), new NgChar(rhs));
  }

  public Object doMultiply(final short lhs, final short rhs) {
    return doMultiply(new NgShort(lhs), new NgShort(rhs));
  }

  public Object doMultiply(final short lhs, final int rhs) {
    return doMultiply(new NgShort(lhs), new NgInt(rhs));
  }

  public Object doMultiply(final short lhs, final long rhs) {
    return doMultiply(new NgShort(lhs), new NgLong(rhs));
  }

  public Object doMultiply(final short lhs, final float rhs) {
    return doMultiply(new NgShort(lhs), new NgFloat(rhs));
  }

  public Object doMultiply(final short lhs, final double rhs) {
    return doMultiply(new NgShort(lhs), new NgDouble(rhs));
  }

  public Object doMultiply(final short lhs, final BigInteger rhs) {
    return doMultiply(new NgShort(lhs), (Object)rhs);
  }

  public Object doMultiply(final short lhs, final BigDecimal rhs) {
    return doMultiply(new NgShort(lhs), (Object)rhs);
  }

  public Object doMultiply(final int lhs, final byte rhs) {
    return doMultiply(new NgInt(lhs), new NgByte(rhs));
  }

  public Object doMultiply(final int lhs, final char rhs) {
    return doMultiply(new NgInt(lhs), new NgChar(rhs));
  }

  public Object doMultiply(final int lhs, final short rhs) {
    return doMultiply(new NgInt(lhs), new NgShort(rhs));
  }

  public Object doMultiply(final int lhs, final int rhs) {
    return doMultiply(new NgInt(lhs), new NgInt(rhs));
  }

  public Object doMultiply(final int lhs, final long rhs) {
    return doMultiply(new NgInt(lhs), new NgLong(rhs));
  }

  public Object doMultiply(final int lhs, final float rhs) {
    return doMultiply(new NgInt(lhs), new NgFloat(rhs));
  }

  public Object doMultiply(final int lhs, final double rhs) {
    return doMultiply(new NgInt(lhs), new NgDouble(rhs));
  }

  public Object doMultiply(final int lhs, final BigInteger rhs) {
    return doMultiply(new NgInt(lhs), (Object)rhs);
  }

  public Object doMultiply(final int lhs, final BigDecimal rhs) {
    return doMultiply(new NgInt(lhs), (Object)rhs);
  }

  public Object doMultiply(final long lhs, final byte rhs) {
    return doMultiply(new NgLong(lhs), new NgByte(rhs));
  }

  public Object doMultiply(final long lhs, final char rhs) {
    return doMultiply(new NgLong(lhs), new NgChar(rhs));
  }

  public Object doMultiply(final long lhs, final short rhs) {
    return doMultiply(new NgLong(lhs), new NgShort(rhs));
  }

  public Object doMultiply(final long lhs, final int rhs) {
    return doMultiply(new NgLong(lhs), new NgInt(rhs));
  }

  public Object doMultiply(final long lhs, final long rhs) {
    return doMultiply(new NgLong(lhs), new NgLong(rhs));
  }

  public Object doMultiply(final long lhs, final float rhs) {
    return doMultiply(new NgLong(lhs), new NgFloat(rhs));
  }

  public Object doMultiply(final long lhs, final double rhs) {
    return doMultiply(new NgLong(lhs), new NgDouble(rhs));
  }

  public Object doMultiply(final long lhs, final BigInteger rhs) {
    return doMultiply(new NgLong(lhs), (Object)rhs);
  }

  public Object doMultiply(final long lhs, final BigDecimal rhs) {
    return doMultiply(new NgLong(lhs), (Object)rhs);
  }

  public Object doMultiply(final float lhs, final byte rhs) {
    return doMultiply(new NgFloat(lhs), new NgByte(rhs));
  }

  public Object doMultiply(final float lhs, final char rhs) {
    return doMultiply(new NgFloat(lhs), new NgChar(rhs));
  }

  public Object doMultiply(final float lhs, final short rhs) {
    return doMultiply(new NgFloat(lhs), new NgShort(rhs));
  }

  public Object doMultiply(final float lhs, final int rhs) {
    return doMultiply(new NgFloat(lhs), new NgInt(rhs));
  }

  public Object doMultiply(final float lhs, final long rhs) {
    return doMultiply(new NgFloat(lhs), new NgLong(rhs));
  }

  public Object doMultiply(final float lhs, final float rhs) {
    return doMultiply(new NgFloat(lhs), new NgFloat(rhs));
  }

  public Object doMultiply(final float lhs, final double rhs) {
    return doMultiply(new NgFloat(lhs), new NgDouble(rhs));
  }

  public Object doMultiply(final float lhs, final BigInteger rhs) {
    return doMultiply(new NgFloat(lhs), (Object)rhs);
  }

  public Object doMultiply(final float lhs, final BigDecimal rhs) {
    return doMultiply(new NgFloat(lhs), (Object)rhs);
  }

  public Object doMultiply(final double lhs, final byte rhs) {
    return doMultiply(new NgDouble(lhs), new NgByte(rhs));
  }

  public Object doMultiply(final double lhs, final char rhs) {
    return doMultiply(new NgDouble(lhs), new NgChar(rhs));
  }

  public Object doMultiply(final double lhs, final short rhs) {
    return doMultiply(new NgDouble(lhs), new NgShort(rhs));
  }

  public Object doMultiply(final double lhs, final int rhs) {
    return doMultiply(new NgDouble(lhs), new NgInt(rhs));
  }

  public Object doMultiply(final double lhs, final long rhs) {
    return doMultiply(new NgDouble(lhs), new NgLong(rhs));
  }

  public Object doMultiply(final double lhs, final float rhs) {
    return doMultiply(new NgDouble(lhs), new NgFloat(rhs));
  }

  public Object doMultiply(final double lhs, final double rhs) {
    return doMultiply(new NgDouble(lhs), new NgDouble(rhs));
  }

  public Object doMultiply(final double lhs, final BigInteger rhs) {
    return doMultiply(new NgDouble(lhs), (Object)rhs);
  }

  public Object doMultiply(final double lhs, final BigDecimal rhs) {
    return doMultiply(new NgDouble(lhs), (Object)rhs);
  }

  public Object doMultiply(final BigInteger lhs, final byte rhs) {
    return doMultiply((Object)lhs, new NgByte(rhs));
  }

  public Object doMultiply(final BigInteger lhs, final char rhs) {
    return doMultiply((Object)lhs, new NgChar(rhs));
  }

  public Object doMultiply(final BigInteger lhs, final short rhs) {
    return doMultiply((Object)lhs, new NgShort(rhs));
  }

  public Object doMultiply(final BigInteger lhs, final int rhs) {
    return doMultiply((Object)lhs, new NgInt(rhs));
  }

  public Object doMultiply(final BigInteger lhs, final long rhs) {
    return doMultiply((Object)lhs, new NgLong(rhs));
  }

  public Object doMultiply(final BigInteger lhs, final float rhs) {
    return doMultiply((Object)lhs, new NgFloat(rhs));
  }

  public Object doMultiply(final BigInteger lhs, final double rhs) {
    return doMultiply((Object)lhs, new NgDouble(rhs));
  }

  public Object doMultiply(final BigInteger lhs, final BigInteger rhs) {
    return doMultiply((Object)lhs, (Object)rhs);
  }

  public Object doMultiply(final BigInteger lhs, final BigDecimal rhs) {
    return doMultiply((Object)lhs, (Object)rhs);
  }

  public Object doMultiply(final BigDecimal lhs, final byte rhs) {
    return doMultiply((Object)lhs, new NgByte(rhs));
  }

  public Object doMultiply(final BigDecimal lhs, final char rhs) {
    return doMultiply((Object)lhs, new NgChar(rhs));
  }

  public Object doMultiply(final BigDecimal lhs, final short rhs) {
    return doMultiply((Object)lhs, new NgShort(rhs));
  }

  public Object doMultiply(final BigDecimal lhs, final int rhs) {
    return doMultiply((Object)lhs, new NgInt(rhs));
  }

  public Object doMultiply(final BigDecimal lhs, final long rhs) {
    return doMultiply((Object)lhs, new NgLong(rhs));
  }

  public Object doMultiply(final BigDecimal lhs, final float rhs) {
    return doMultiply((Object)lhs, new NgFloat(rhs));
  }

  public Object doMultiply(final BigDecimal lhs, final double rhs) {
    return doMultiply((Object)lhs, new NgDouble(rhs));
  }

  public Object doMultiply(final BigDecimal lhs, final BigInteger rhs) {
    return doMultiply((Object)lhs, (Object)rhs);
  }

  public Object doMultiply(final BigDecimal lhs, final BigDecimal rhs) {
    return doMultiply((Object)lhs, (Object)rhs);
  }

  public Object doMultiply(final Object lhs, final byte rhs) {
  final Object rhsObject = new NgByte(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiply(lhs, rhsObject);
  }

  public Object doMultiply(final Object lhs, final char rhs) {
  final Object rhsObject = new NgChar(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiply(lhs, rhsObject);
  }

  public Object doMultiply(final Object lhs, final short rhs) {
  final Object rhsObject = new NgShort(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiply(lhs, rhsObject);
  }

  public Object doMultiply(final Object lhs, final int rhs) {
  final Object rhsObject = new NgInt(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiply(lhs, rhsObject);
  }

  public Object doMultiply(final Object lhs, final long rhs) {
  final Object rhsObject = new NgLong(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiply(lhs, rhsObject);
  }

  public Object doMultiply(final Object lhs, final float rhs) {
  final Object rhsObject = new NgFloat(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiply(lhs, rhsObject);
  }

  public Object doMultiply(final Object lhs, final double rhs) {
  final Object rhsObject = new NgDouble(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiply(lhs, rhsObject);
  }

  public Object doMultiply(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiply(lhs, rhsObject);
  }

  public Object doMultiply(final Object lhs, final BigDecimal rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiply(lhs, rhsObject);
  }

  public Object doReverseMultiply(final byte lhs, final Object rhs) {
  final Object lhsObject = new NgByte(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiply(lhsObject, rhs);
  }

  public Object doReverseMultiply(final char lhs, final Object rhs) {
  final Object lhsObject = new NgChar(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiply(lhsObject, rhs);
  }

  public Object doReverseMultiply(final short lhs, final Object rhs) {
  final Object lhsObject = new NgShort(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiply(lhsObject, rhs);
  }

  public Object doReverseMultiply(final int lhs, final Object rhs) {
  final Object lhsObject = new NgInt(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiply(lhsObject, rhs);
  }

  public Object doReverseMultiply(final long lhs, final Object rhs) {
  final Object lhsObject = new NgLong(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiply(lhsObject, rhs);
  }

  public Object doReverseMultiply(final float lhs, final Object rhs) {
  final Object lhsObject = new NgFloat(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiply(lhsObject, rhs);
  }

  public Object doReverseMultiply(final double lhs, final Object rhs) {
  final Object lhsObject = new NgDouble(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiply(lhsObject, rhs);
  }

  public Object doReverseMultiply(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiply(lhsObject, rhs);
  }

  public Object doReverseMultiply(final BigDecimal lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiply(lhsObject, rhs);
  }

  //
  //   Internal methods for operator *=
  //
  //  These methods can be overidden to implement *=
  //  If the underlying object does not have the appropriate method
  //
  public Object doMultiplyEquals(final Object lhs, final Object rhs) {
  final Object result = this.instanceHandler.multiplyEquals(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiplyEquals(lhs, rhs);
    } else {
      return result;
    }
  }
  
  public Object doReverseMultiplyEquals(final Object lhs, final Object rhs) {
    return this.instanceHandler.reverseMultiplyEquals(lhs, rhs);
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doMultiplyEquals(final byte lhs, final byte rhs) {
    return doMultiplyEquals(new NgByte(lhs), new NgByte(rhs));
  }

  public Object doMultiplyEquals(final byte lhs, final char rhs) {
    return doMultiplyEquals(new NgByte(lhs), new NgChar(rhs));
  }

  public Object doMultiplyEquals(final byte lhs, final short rhs) {
    return doMultiplyEquals(new NgByte(lhs), new NgShort(rhs));
  }

  public Object doMultiplyEquals(final byte lhs, final int rhs) {
    return doMultiplyEquals(new NgByte(lhs), new NgInt(rhs));
  }

  public Object doMultiplyEquals(final byte lhs, final long rhs) {
    return doMultiplyEquals(new NgByte(lhs), new NgLong(rhs));
  }

  public Object doMultiplyEquals(final byte lhs, final float rhs) {
    return doMultiplyEquals(new NgByte(lhs), new NgFloat(rhs));
  }

  public Object doMultiplyEquals(final byte lhs, final double rhs) {
    return doMultiplyEquals(new NgByte(lhs), new NgDouble(rhs));
  }

  public Object doMultiplyEquals(final byte lhs, final BigInteger rhs) {
    return doMultiplyEquals(new NgByte(lhs), (Object)rhs);
  }

  public Object doMultiplyEquals(final byte lhs, final BigDecimal rhs) {
    return doMultiplyEquals(new NgByte(lhs), (Object)rhs);
  }

  public Object doMultiplyEquals(final char lhs, final byte rhs) {
    return doMultiplyEquals(new NgChar(lhs), new NgByte(rhs));
  }

  public Object doMultiplyEquals(final char lhs, final char rhs) {
    return doMultiplyEquals(new NgChar(lhs), new NgChar(rhs));
  }

  public Object doMultiplyEquals(final char lhs, final short rhs) {
    return doMultiplyEquals(new NgChar(lhs), new NgShort(rhs));
  }

  public Object doMultiplyEquals(final char lhs, final int rhs) {
    return doMultiplyEquals(new NgChar(lhs), new NgInt(rhs));
  }

  public Object doMultiplyEquals(final char lhs, final long rhs) {
    return doMultiplyEquals(new NgChar(lhs), new NgLong(rhs));
  }

  public Object doMultiplyEquals(final char lhs, final float rhs) {
    return doMultiplyEquals(new NgChar(lhs), new NgFloat(rhs));
  }

  public Object doMultiplyEquals(final char lhs, final double rhs) {
    return doMultiplyEquals(new NgChar(lhs), new NgDouble(rhs));
  }

  public Object doMultiplyEquals(final char lhs, final BigInteger rhs) {
    return doMultiplyEquals(new NgChar(lhs), (Object)rhs);
  }

  public Object doMultiplyEquals(final char lhs, final BigDecimal rhs) {
    return doMultiplyEquals(new NgChar(lhs), (Object)rhs);
  }

  public Object doMultiplyEquals(final short lhs, final byte rhs) {
    return doMultiplyEquals(new NgShort(lhs), new NgByte(rhs));
  }

  public Object doMultiplyEquals(final short lhs, final char rhs) {
    return doMultiplyEquals(new NgShort(lhs), new NgChar(rhs));
  }

  public Object doMultiplyEquals(final short lhs, final short rhs) {
    return doMultiplyEquals(new NgShort(lhs), new NgShort(rhs));
  }

  public Object doMultiplyEquals(final short lhs, final int rhs) {
    return doMultiplyEquals(new NgShort(lhs), new NgInt(rhs));
  }

  public Object doMultiplyEquals(final short lhs, final long rhs) {
    return doMultiplyEquals(new NgShort(lhs), new NgLong(rhs));
  }

  public Object doMultiplyEquals(final short lhs, final float rhs) {
    return doMultiplyEquals(new NgShort(lhs), new NgFloat(rhs));
  }

  public Object doMultiplyEquals(final short lhs, final double rhs) {
    return doMultiplyEquals(new NgShort(lhs), new NgDouble(rhs));
  }

  public Object doMultiplyEquals(final short lhs, final BigInteger rhs) {
    return doMultiplyEquals(new NgShort(lhs), (Object)rhs);
  }

  public Object doMultiplyEquals(final short lhs, final BigDecimal rhs) {
    return doMultiplyEquals(new NgShort(lhs), (Object)rhs);
  }

  public Object doMultiplyEquals(final int lhs, final byte rhs) {
    return doMultiplyEquals(new NgInt(lhs), new NgByte(rhs));
  }

  public Object doMultiplyEquals(final int lhs, final char rhs) {
    return doMultiplyEquals(new NgInt(lhs), new NgChar(rhs));
  }

  public Object doMultiplyEquals(final int lhs, final short rhs) {
    return doMultiplyEquals(new NgInt(lhs), new NgShort(rhs));
  }

  public Object doMultiplyEquals(final int lhs, final int rhs) {
    return doMultiplyEquals(new NgInt(lhs), new NgInt(rhs));
  }

  public Object doMultiplyEquals(final int lhs, final long rhs) {
    return doMultiplyEquals(new NgInt(lhs), new NgLong(rhs));
  }

  public Object doMultiplyEquals(final int lhs, final float rhs) {
    return doMultiplyEquals(new NgInt(lhs), new NgFloat(rhs));
  }

  public Object doMultiplyEquals(final int lhs, final double rhs) {
    return doMultiplyEquals(new NgInt(lhs), new NgDouble(rhs));
  }

  public Object doMultiplyEquals(final int lhs, final BigInteger rhs) {
    return doMultiplyEquals(new NgInt(lhs), (Object)rhs);
  }

  public Object doMultiplyEquals(final int lhs, final BigDecimal rhs) {
    return doMultiplyEquals(new NgInt(lhs), (Object)rhs);
  }

  public Object doMultiplyEquals(final long lhs, final byte rhs) {
    return doMultiplyEquals(new NgLong(lhs), new NgByte(rhs));
  }

  public Object doMultiplyEquals(final long lhs, final char rhs) {
    return doMultiplyEquals(new NgLong(lhs), new NgChar(rhs));
  }

  public Object doMultiplyEquals(final long lhs, final short rhs) {
    return doMultiplyEquals(new NgLong(lhs), new NgShort(rhs));
  }

  public Object doMultiplyEquals(final long lhs, final int rhs) {
    return doMultiplyEquals(new NgLong(lhs), new NgInt(rhs));
  }

  public Object doMultiplyEquals(final long lhs, final long rhs) {
    return doMultiplyEquals(new NgLong(lhs), new NgLong(rhs));
  }

  public Object doMultiplyEquals(final long lhs, final float rhs) {
    return doMultiplyEquals(new NgLong(lhs), new NgFloat(rhs));
  }

  public Object doMultiplyEquals(final long lhs, final double rhs) {
    return doMultiplyEquals(new NgLong(lhs), new NgDouble(rhs));
  }

  public Object doMultiplyEquals(final long lhs, final BigInteger rhs) {
    return doMultiplyEquals(new NgLong(lhs), (Object)rhs);
  }

  public Object doMultiplyEquals(final long lhs, final BigDecimal rhs) {
    return doMultiplyEquals(new NgLong(lhs), (Object)rhs);
  }

  public Object doMultiplyEquals(final float lhs, final byte rhs) {
    return doMultiplyEquals(new NgFloat(lhs), new NgByte(rhs));
  }

  public Object doMultiplyEquals(final float lhs, final char rhs) {
    return doMultiplyEquals(new NgFloat(lhs), new NgChar(rhs));
  }

  public Object doMultiplyEquals(final float lhs, final short rhs) {
    return doMultiplyEquals(new NgFloat(lhs), new NgShort(rhs));
  }

  public Object doMultiplyEquals(final float lhs, final int rhs) {
    return doMultiplyEquals(new NgFloat(lhs), new NgInt(rhs));
  }

  public Object doMultiplyEquals(final float lhs, final long rhs) {
    return doMultiplyEquals(new NgFloat(lhs), new NgLong(rhs));
  }

  public Object doMultiplyEquals(final float lhs, final float rhs) {
    return doMultiplyEquals(new NgFloat(lhs), new NgFloat(rhs));
  }

  public Object doMultiplyEquals(final float lhs, final double rhs) {
    return doMultiplyEquals(new NgFloat(lhs), new NgDouble(rhs));
  }

  public Object doMultiplyEquals(final float lhs, final BigInteger rhs) {
    return doMultiplyEquals(new NgFloat(lhs), (Object)rhs);
  }

  public Object doMultiplyEquals(final float lhs, final BigDecimal rhs) {
    return doMultiplyEquals(new NgFloat(lhs), (Object)rhs);
  }

  public Object doMultiplyEquals(final double lhs, final byte rhs) {
    return doMultiplyEquals(new NgDouble(lhs), new NgByte(rhs));
  }

  public Object doMultiplyEquals(final double lhs, final char rhs) {
    return doMultiplyEquals(new NgDouble(lhs), new NgChar(rhs));
  }

  public Object doMultiplyEquals(final double lhs, final short rhs) {
    return doMultiplyEquals(new NgDouble(lhs), new NgShort(rhs));
  }

  public Object doMultiplyEquals(final double lhs, final int rhs) {
    return doMultiplyEquals(new NgDouble(lhs), new NgInt(rhs));
  }

  public Object doMultiplyEquals(final double lhs, final long rhs) {
    return doMultiplyEquals(new NgDouble(lhs), new NgLong(rhs));
  }

  public Object doMultiplyEquals(final double lhs, final float rhs) {
    return doMultiplyEquals(new NgDouble(lhs), new NgFloat(rhs));
  }

  public Object doMultiplyEquals(final double lhs, final double rhs) {
    return doMultiplyEquals(new NgDouble(lhs), new NgDouble(rhs));
  }

  public Object doMultiplyEquals(final double lhs, final BigInteger rhs) {
    return doMultiplyEquals(new NgDouble(lhs), (Object)rhs);
  }

  public Object doMultiplyEquals(final double lhs, final BigDecimal rhs) {
    return doMultiplyEquals(new NgDouble(lhs), (Object)rhs);
  }

  public Object doMultiplyEquals(final BigInteger lhs, final byte rhs) {
    return doMultiplyEquals((Object)lhs, new NgByte(rhs));
  }

  public Object doMultiplyEquals(final BigInteger lhs, final char rhs) {
    return doMultiplyEquals((Object)lhs, new NgChar(rhs));
  }

  public Object doMultiplyEquals(final BigInteger lhs, final short rhs) {
    return doMultiplyEquals((Object)lhs, new NgShort(rhs));
  }

  public Object doMultiplyEquals(final BigInteger lhs, final int rhs) {
    return doMultiplyEquals((Object)lhs, new NgInt(rhs));
  }

  public Object doMultiplyEquals(final BigInteger lhs, final long rhs) {
    return doMultiplyEquals((Object)lhs, new NgLong(rhs));
  }

  public Object doMultiplyEquals(final BigInteger lhs, final float rhs) {
    return doMultiplyEquals((Object)lhs, new NgFloat(rhs));
  }

  public Object doMultiplyEquals(final BigInteger lhs, final double rhs) {
    return doMultiplyEquals((Object)lhs, new NgDouble(rhs));
  }

  public Object doMultiplyEquals(final BigInteger lhs, final BigInteger rhs) {
    return doMultiplyEquals((Object)lhs, (Object)rhs);
  }

  public Object doMultiplyEquals(final BigInteger lhs, final BigDecimal rhs) {
    return doMultiplyEquals((Object)lhs, (Object)rhs);
  }

  public Object doMultiplyEquals(final BigDecimal lhs, final byte rhs) {
    return doMultiplyEquals((Object)lhs, new NgByte(rhs));
  }

  public Object doMultiplyEquals(final BigDecimal lhs, final char rhs) {
    return doMultiplyEquals((Object)lhs, new NgChar(rhs));
  }

  public Object doMultiplyEquals(final BigDecimal lhs, final short rhs) {
    return doMultiplyEquals((Object)lhs, new NgShort(rhs));
  }

  public Object doMultiplyEquals(final BigDecimal lhs, final int rhs) {
    return doMultiplyEquals((Object)lhs, new NgInt(rhs));
  }

  public Object doMultiplyEquals(final BigDecimal lhs, final long rhs) {
    return doMultiplyEquals((Object)lhs, new NgLong(rhs));
  }

  public Object doMultiplyEquals(final BigDecimal lhs, final float rhs) {
    return doMultiplyEquals((Object)lhs, new NgFloat(rhs));
  }

  public Object doMultiplyEquals(final BigDecimal lhs, final double rhs) {
    return doMultiplyEquals((Object)lhs, new NgDouble(rhs));
  }

  public Object doMultiplyEquals(final BigDecimal lhs, final BigInteger rhs) {
    return doMultiplyEquals((Object)lhs, (Object)rhs);
  }

  public Object doMultiplyEquals(final BigDecimal lhs, final BigDecimal rhs) {
    return doMultiplyEquals((Object)lhs, (Object)rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = new NgByte(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiplyEquals(lhs, rhsObject);
  }

  public Object doMultiplyEquals(final Object lhs, final char rhs) {
  final Object rhsObject = new NgChar(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiplyEquals(lhs, rhsObject);
  }

  public Object doMultiplyEquals(final Object lhs, final short rhs) {
  final Object rhsObject = new NgShort(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiplyEquals(lhs, rhsObject);
  }

  public Object doMultiplyEquals(final Object lhs, final int rhs) {
  final Object rhsObject = new NgInt(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiplyEquals(lhs, rhsObject);
  }

  public Object doMultiplyEquals(final Object lhs, final long rhs) {
  final Object rhsObject = new NgLong(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiplyEquals(lhs, rhsObject);
  }

  public Object doMultiplyEquals(final Object lhs, final float rhs) {
  final Object rhsObject = new NgFloat(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiplyEquals(lhs, rhsObject);
  }

  public Object doMultiplyEquals(final Object lhs, final double rhs) {
  final Object rhsObject = new NgDouble(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiplyEquals(lhs, rhsObject);
  }

  public Object doMultiplyEquals(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiplyEquals(lhs, rhsObject);
  }

  public Object doMultiplyEquals(final Object lhs, final BigDecimal rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseMultiplyEquals(lhs, rhsObject);
  }

  public Object doReverseMultiplyEquals(final byte lhs, final Object rhs) {
  final Object lhsObject = new NgByte(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiplyEquals(lhsObject, rhs);
  }

  public Object doReverseMultiplyEquals(final char lhs, final Object rhs) {
  final Object lhsObject = new NgChar(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiplyEquals(lhsObject, rhs);
  }

  public Object doReverseMultiplyEquals(final short lhs, final Object rhs) {
  final Object lhsObject = new NgShort(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiplyEquals(lhsObject, rhs);
  }

  public Object doReverseMultiplyEquals(final int lhs, final Object rhs) {
  final Object lhsObject = new NgInt(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiplyEquals(lhsObject, rhs);
  }

  public Object doReverseMultiplyEquals(final long lhs, final Object rhs) {
  final Object lhsObject = new NgLong(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiplyEquals(lhsObject, rhs);
  }

  public Object doReverseMultiplyEquals(final float lhs, final Object rhs) {
  final Object lhsObject = new NgFloat(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiplyEquals(lhsObject, rhs);
  }

  public Object doReverseMultiplyEquals(final double lhs, final Object rhs) {
  final Object lhsObject = new NgDouble(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiplyEquals(lhsObject, rhs);
  }

  public Object doReverseMultiplyEquals(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiplyEquals(lhsObject, rhs);
  }

  public Object doReverseMultiplyEquals(final BigDecimal lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiplyEquals(lhsObject, rhs);
  }

  //
  //   Internal methods for operator /
  //
  //  These methods can be overidden to implement /
  //  If the underlying object does not have the appropriate method
  //
  public Object doDivide(final Object lhs, final Object rhs) {
  final Object result = this.instanceHandler.divide(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivide(lhs, rhs);
    } else {
      return result;
    }
  }
  
  public Object doReverseDivide(final Object lhs, final Object rhs) {
    return this.instanceHandler.reverseDivide(lhs, rhs);
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doDivide(final byte lhs, final byte rhs) {
    return doDivide(new NgByte(lhs), new NgByte(rhs));
  }

  public Object doDivide(final byte lhs, final char rhs) {
    return doDivide(new NgByte(lhs), new NgChar(rhs));
  }

  public Object doDivide(final byte lhs, final short rhs) {
    return doDivide(new NgByte(lhs), new NgShort(rhs));
  }

  public Object doDivide(final byte lhs, final int rhs) {
    return doDivide(new NgByte(lhs), new NgInt(rhs));
  }

  public Object doDivide(final byte lhs, final long rhs) {
    return doDivide(new NgByte(lhs), new NgLong(rhs));
  }

  public Object doDivide(final byte lhs, final float rhs) {
    return doDivide(new NgByte(lhs), new NgFloat(rhs));
  }

  public Object doDivide(final byte lhs, final double rhs) {
    return doDivide(new NgByte(lhs), new NgDouble(rhs));
  }

  public Object doDivide(final byte lhs, final BigInteger rhs) {
    return doDivide(new NgByte(lhs), (Object)rhs);
  }

  public Object doDivide(final byte lhs, final BigDecimal rhs) {
    return doDivide(new NgByte(lhs), (Object)rhs);
  }

  public Object doDivide(final char lhs, final byte rhs) {
    return doDivide(new NgChar(lhs), new NgByte(rhs));
  }

  public Object doDivide(final char lhs, final char rhs) {
    return doDivide(new NgChar(lhs), new NgChar(rhs));
  }

  public Object doDivide(final char lhs, final short rhs) {
    return doDivide(new NgChar(lhs), new NgShort(rhs));
  }

  public Object doDivide(final char lhs, final int rhs) {
    return doDivide(new NgChar(lhs), new NgInt(rhs));
  }

  public Object doDivide(final char lhs, final long rhs) {
    return doDivide(new NgChar(lhs), new NgLong(rhs));
  }

  public Object doDivide(final char lhs, final float rhs) {
    return doDivide(new NgChar(lhs), new NgFloat(rhs));
  }

  public Object doDivide(final char lhs, final double rhs) {
    return doDivide(new NgChar(lhs), new NgDouble(rhs));
  }

  public Object doDivide(final char lhs, final BigInteger rhs) {
    return doDivide(new NgChar(lhs), (Object)rhs);
  }

  public Object doDivide(final char lhs, final BigDecimal rhs) {
    return doDivide(new NgChar(lhs), (Object)rhs);
  }

  public Object doDivide(final short lhs, final byte rhs) {
    return doDivide(new NgShort(lhs), new NgByte(rhs));
  }

  public Object doDivide(final short lhs, final char rhs) {
    return doDivide(new NgShort(lhs), new NgChar(rhs));
  }

  public Object doDivide(final short lhs, final short rhs) {
    return doDivide(new NgShort(lhs), new NgShort(rhs));
  }

  public Object doDivide(final short lhs, final int rhs) {
    return doDivide(new NgShort(lhs), new NgInt(rhs));
  }

  public Object doDivide(final short lhs, final long rhs) {
    return doDivide(new NgShort(lhs), new NgLong(rhs));
  }

  public Object doDivide(final short lhs, final float rhs) {
    return doDivide(new NgShort(lhs), new NgFloat(rhs));
  }

  public Object doDivide(final short lhs, final double rhs) {
    return doDivide(new NgShort(lhs), new NgDouble(rhs));
  }

  public Object doDivide(final short lhs, final BigInteger rhs) {
    return doDivide(new NgShort(lhs), (Object)rhs);
  }

  public Object doDivide(final short lhs, final BigDecimal rhs) {
    return doDivide(new NgShort(lhs), (Object)rhs);
  }

  public Object doDivide(final int lhs, final byte rhs) {
    return doDivide(new NgInt(lhs), new NgByte(rhs));
  }

  public Object doDivide(final int lhs, final char rhs) {
    return doDivide(new NgInt(lhs), new NgChar(rhs));
  }

  public Object doDivide(final int lhs, final short rhs) {
    return doDivide(new NgInt(lhs), new NgShort(rhs));
  }

  public Object doDivide(final int lhs, final int rhs) {
    return doDivide(new NgInt(lhs), new NgInt(rhs));
  }

  public Object doDivide(final int lhs, final long rhs) {
    return doDivide(new NgInt(lhs), new NgLong(rhs));
  }

  public Object doDivide(final int lhs, final float rhs) {
    return doDivide(new NgInt(lhs), new NgFloat(rhs));
  }

  public Object doDivide(final int lhs, final double rhs) {
    return doDivide(new NgInt(lhs), new NgDouble(rhs));
  }

  public Object doDivide(final int lhs, final BigInteger rhs) {
    return doDivide(new NgInt(lhs), (Object)rhs);
  }

  public Object doDivide(final int lhs, final BigDecimal rhs) {
    return doDivide(new NgInt(lhs), (Object)rhs);
  }

  public Object doDivide(final long lhs, final byte rhs) {
    return doDivide(new NgLong(lhs), new NgByte(rhs));
  }

  public Object doDivide(final long lhs, final char rhs) {
    return doDivide(new NgLong(lhs), new NgChar(rhs));
  }

  public Object doDivide(final long lhs, final short rhs) {
    return doDivide(new NgLong(lhs), new NgShort(rhs));
  }

  public Object doDivide(final long lhs, final int rhs) {
    return doDivide(new NgLong(lhs), new NgInt(rhs));
  }

  public Object doDivide(final long lhs, final long rhs) {
    return doDivide(new NgLong(lhs), new NgLong(rhs));
  }

  public Object doDivide(final long lhs, final float rhs) {
    return doDivide(new NgLong(lhs), new NgFloat(rhs));
  }

  public Object doDivide(final long lhs, final double rhs) {
    return doDivide(new NgLong(lhs), new NgDouble(rhs));
  }

  public Object doDivide(final long lhs, final BigInteger rhs) {
    return doDivide(new NgLong(lhs), (Object)rhs);
  }

  public Object doDivide(final long lhs, final BigDecimal rhs) {
    return doDivide(new NgLong(lhs), (Object)rhs);
  }

  public Object doDivide(final float lhs, final byte rhs) {
    return doDivide(new NgFloat(lhs), new NgByte(rhs));
  }

  public Object doDivide(final float lhs, final char rhs) {
    return doDivide(new NgFloat(lhs), new NgChar(rhs));
  }

  public Object doDivide(final float lhs, final short rhs) {
    return doDivide(new NgFloat(lhs), new NgShort(rhs));
  }

  public Object doDivide(final float lhs, final int rhs) {
    return doDivide(new NgFloat(lhs), new NgInt(rhs));
  }

  public Object doDivide(final float lhs, final long rhs) {
    return doDivide(new NgFloat(lhs), new NgLong(rhs));
  }

  public Object doDivide(final float lhs, final float rhs) {
    return doDivide(new NgFloat(lhs), new NgFloat(rhs));
  }

  public Object doDivide(final float lhs, final double rhs) {
    return doDivide(new NgFloat(lhs), new NgDouble(rhs));
  }

  public Object doDivide(final float lhs, final BigInteger rhs) {
    return doDivide(new NgFloat(lhs), (Object)rhs);
  }

  public Object doDivide(final float lhs, final BigDecimal rhs) {
    return doDivide(new NgFloat(lhs), (Object)rhs);
  }

  public Object doDivide(final double lhs, final byte rhs) {
    return doDivide(new NgDouble(lhs), new NgByte(rhs));
  }

  public Object doDivide(final double lhs, final char rhs) {
    return doDivide(new NgDouble(lhs), new NgChar(rhs));
  }

  public Object doDivide(final double lhs, final short rhs) {
    return doDivide(new NgDouble(lhs), new NgShort(rhs));
  }

  public Object doDivide(final double lhs, final int rhs) {
    return doDivide(new NgDouble(lhs), new NgInt(rhs));
  }

  public Object doDivide(final double lhs, final long rhs) {
    return doDivide(new NgDouble(lhs), new NgLong(rhs));
  }

  public Object doDivide(final double lhs, final float rhs) {
    return doDivide(new NgDouble(lhs), new NgFloat(rhs));
  }

  public Object doDivide(final double lhs, final double rhs) {
    return doDivide(new NgDouble(lhs), new NgDouble(rhs));
  }

  public Object doDivide(final double lhs, final BigInteger rhs) {
    return doDivide(new NgDouble(lhs), (Object)rhs);
  }

  public Object doDivide(final double lhs, final BigDecimal rhs) {
    return doDivide(new NgDouble(lhs), (Object)rhs);
  }

  public Object doDivide(final BigInteger lhs, final byte rhs) {
    return doDivide((Object)lhs, new NgByte(rhs));
  }

  public Object doDivide(final BigInteger lhs, final char rhs) {
    return doDivide((Object)lhs, new NgChar(rhs));
  }

  public Object doDivide(final BigInteger lhs, final short rhs) {
    return doDivide((Object)lhs, new NgShort(rhs));
  }

  public Object doDivide(final BigInteger lhs, final int rhs) {
    return doDivide((Object)lhs, new NgInt(rhs));
  }

  public Object doDivide(final BigInteger lhs, final long rhs) {
    return doDivide((Object)lhs, new NgLong(rhs));
  }

  public Object doDivide(final BigInteger lhs, final float rhs) {
    return doDivide((Object)lhs, new NgFloat(rhs));
  }

  public Object doDivide(final BigInteger lhs, final double rhs) {
    return doDivide((Object)lhs, new NgDouble(rhs));
  }

  public Object doDivide(final BigInteger lhs, final BigInteger rhs) {
    return doDivide((Object)lhs, (Object)rhs);
  }

  public Object doDivide(final BigInteger lhs, final BigDecimal rhs) {
    return doDivide((Object)lhs, (Object)rhs);
  }

  public Object doDivide(final BigDecimal lhs, final byte rhs) {
    return doDivide((Object)lhs, new NgByte(rhs));
  }

  public Object doDivide(final BigDecimal lhs, final char rhs) {
    return doDivide((Object)lhs, new NgChar(rhs));
  }

  public Object doDivide(final BigDecimal lhs, final short rhs) {
    return doDivide((Object)lhs, new NgShort(rhs));
  }

  public Object doDivide(final BigDecimal lhs, final int rhs) {
    return doDivide((Object)lhs, new NgInt(rhs));
  }

  public Object doDivide(final BigDecimal lhs, final long rhs) {
    return doDivide((Object)lhs, new NgLong(rhs));
  }

  public Object doDivide(final BigDecimal lhs, final float rhs) {
    return doDivide((Object)lhs, new NgFloat(rhs));
  }

  public Object doDivide(final BigDecimal lhs, final double rhs) {
    return doDivide((Object)lhs, new NgDouble(rhs));
  }

  public Object doDivide(final BigDecimal lhs, final BigInteger rhs) {
    return doDivide((Object)lhs, (Object)rhs);
  }

  public Object doDivide(final BigDecimal lhs, final BigDecimal rhs) {
    return doDivide((Object)lhs, (Object)rhs);
  }

  public Object doDivide(final Object lhs, final byte rhs) {
  final Object rhsObject = new NgByte(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivide(lhs, rhsObject);
  }

  public Object doDivide(final Object lhs, final char rhs) {
  final Object rhsObject = new NgChar(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivide(lhs, rhsObject);
  }

  public Object doDivide(final Object lhs, final short rhs) {
  final Object rhsObject = new NgShort(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivide(lhs, rhsObject);
  }

  public Object doDivide(final Object lhs, final int rhs) {
  final Object rhsObject = new NgInt(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivide(lhs, rhsObject);
  }

  public Object doDivide(final Object lhs, final long rhs) {
  final Object rhsObject = new NgLong(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivide(lhs, rhsObject);
  }

  public Object doDivide(final Object lhs, final float rhs) {
  final Object rhsObject = new NgFloat(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivide(lhs, rhsObject);
  }

  public Object doDivide(final Object lhs, final double rhs) {
  final Object rhsObject = new NgDouble(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivide(lhs, rhsObject);
  }

  public Object doDivide(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivide(lhs, rhsObject);
  }

  public Object doDivide(final Object lhs, final BigDecimal rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivide(lhs, rhsObject);
  }

  public Object doReverseDivide(final byte lhs, final Object rhs) {
  final Object lhsObject = new NgByte(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivide(lhsObject, rhs);
  }

  public Object doReverseDivide(final char lhs, final Object rhs) {
  final Object lhsObject = new NgChar(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivide(lhsObject, rhs);
  }

  public Object doReverseDivide(final short lhs, final Object rhs) {
  final Object lhsObject = new NgShort(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivide(lhsObject, rhs);
  }

  public Object doReverseDivide(final int lhs, final Object rhs) {
  final Object lhsObject = new NgInt(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivide(lhsObject, rhs);
  }

  public Object doReverseDivide(final long lhs, final Object rhs) {
  final Object lhsObject = new NgLong(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivide(lhsObject, rhs);
  }

  public Object doReverseDivide(final float lhs, final Object rhs) {
  final Object lhsObject = new NgFloat(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivide(lhsObject, rhs);
  }

  public Object doReverseDivide(final double lhs, final Object rhs) {
  final Object lhsObject = new NgDouble(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivide(lhsObject, rhs);
  }

  public Object doReverseDivide(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivide(lhsObject, rhs);
  }

  public Object doReverseDivide(final BigDecimal lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivide(lhsObject, rhs);
  }

  //
  //   Internal methods for operator /=
  //
  //  These methods can be overidden to implement /=
  //  If the underlying object does not have the appropriate method
  //
  public Object doDivideEquals(final Object lhs, final Object rhs) {
  final Object result = this.instanceHandler.divideEquals(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivideEquals(lhs, rhs);
    } else {
      return result;
    }
  }
  
  public Object doReverseDivideEquals(final Object lhs, final Object rhs) {
    return this.instanceHandler.reverseDivideEquals(lhs, rhs);
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doDivideEquals(final byte lhs, final byte rhs) {
    return doDivideEquals(new NgByte(lhs), new NgByte(rhs));
  }

  public Object doDivideEquals(final byte lhs, final char rhs) {
    return doDivideEquals(new NgByte(lhs), new NgChar(rhs));
  }

  public Object doDivideEquals(final byte lhs, final short rhs) {
    return doDivideEquals(new NgByte(lhs), new NgShort(rhs));
  }

  public Object doDivideEquals(final byte lhs, final int rhs) {
    return doDivideEquals(new NgByte(lhs), new NgInt(rhs));
  }

  public Object doDivideEquals(final byte lhs, final long rhs) {
    return doDivideEquals(new NgByte(lhs), new NgLong(rhs));
  }

  public Object doDivideEquals(final byte lhs, final float rhs) {
    return doDivideEquals(new NgByte(lhs), new NgFloat(rhs));
  }

  public Object doDivideEquals(final byte lhs, final double rhs) {
    return doDivideEquals(new NgByte(lhs), new NgDouble(rhs));
  }

  public Object doDivideEquals(final byte lhs, final BigInteger rhs) {
    return doDivideEquals(new NgByte(lhs), (Object)rhs);
  }

  public Object doDivideEquals(final byte lhs, final BigDecimal rhs) {
    return doDivideEquals(new NgByte(lhs), (Object)rhs);
  }

  public Object doDivideEquals(final char lhs, final byte rhs) {
    return doDivideEquals(new NgChar(lhs), new NgByte(rhs));
  }

  public Object doDivideEquals(final char lhs, final char rhs) {
    return doDivideEquals(new NgChar(lhs), new NgChar(rhs));
  }

  public Object doDivideEquals(final char lhs, final short rhs) {
    return doDivideEquals(new NgChar(lhs), new NgShort(rhs));
  }

  public Object doDivideEquals(final char lhs, final int rhs) {
    return doDivideEquals(new NgChar(lhs), new NgInt(rhs));
  }

  public Object doDivideEquals(final char lhs, final long rhs) {
    return doDivideEquals(new NgChar(lhs), new NgLong(rhs));
  }

  public Object doDivideEquals(final char lhs, final float rhs) {
    return doDivideEquals(new NgChar(lhs), new NgFloat(rhs));
  }

  public Object doDivideEquals(final char lhs, final double rhs) {
    return doDivideEquals(new NgChar(lhs), new NgDouble(rhs));
  }

  public Object doDivideEquals(final char lhs, final BigInteger rhs) {
    return doDivideEquals(new NgChar(lhs), (Object)rhs);
  }

  public Object doDivideEquals(final char lhs, final BigDecimal rhs) {
    return doDivideEquals(new NgChar(lhs), (Object)rhs);
  }

  public Object doDivideEquals(final short lhs, final byte rhs) {
    return doDivideEquals(new NgShort(lhs), new NgByte(rhs));
  }

  public Object doDivideEquals(final short lhs, final char rhs) {
    return doDivideEquals(new NgShort(lhs), new NgChar(rhs));
  }

  public Object doDivideEquals(final short lhs, final short rhs) {
    return doDivideEquals(new NgShort(lhs), new NgShort(rhs));
  }

  public Object doDivideEquals(final short lhs, final int rhs) {
    return doDivideEquals(new NgShort(lhs), new NgInt(rhs));
  }

  public Object doDivideEquals(final short lhs, final long rhs) {
    return doDivideEquals(new NgShort(lhs), new NgLong(rhs));
  }

  public Object doDivideEquals(final short lhs, final float rhs) {
    return doDivideEquals(new NgShort(lhs), new NgFloat(rhs));
  }

  public Object doDivideEquals(final short lhs, final double rhs) {
    return doDivideEquals(new NgShort(lhs), new NgDouble(rhs));
  }

  public Object doDivideEquals(final short lhs, final BigInteger rhs) {
    return doDivideEquals(new NgShort(lhs), (Object)rhs);
  }

  public Object doDivideEquals(final short lhs, final BigDecimal rhs) {
    return doDivideEquals(new NgShort(lhs), (Object)rhs);
  }

  public Object doDivideEquals(final int lhs, final byte rhs) {
    return doDivideEquals(new NgInt(lhs), new NgByte(rhs));
  }

  public Object doDivideEquals(final int lhs, final char rhs) {
    return doDivideEquals(new NgInt(lhs), new NgChar(rhs));
  }

  public Object doDivideEquals(final int lhs, final short rhs) {
    return doDivideEquals(new NgInt(lhs), new NgShort(rhs));
  }

  public Object doDivideEquals(final int lhs, final int rhs) {
    return doDivideEquals(new NgInt(lhs), new NgInt(rhs));
  }

  public Object doDivideEquals(final int lhs, final long rhs) {
    return doDivideEquals(new NgInt(lhs), new NgLong(rhs));
  }

  public Object doDivideEquals(final int lhs, final float rhs) {
    return doDivideEquals(new NgInt(lhs), new NgFloat(rhs));
  }

  public Object doDivideEquals(final int lhs, final double rhs) {
    return doDivideEquals(new NgInt(lhs), new NgDouble(rhs));
  }

  public Object doDivideEquals(final int lhs, final BigInteger rhs) {
    return doDivideEquals(new NgInt(lhs), (Object)rhs);
  }

  public Object doDivideEquals(final int lhs, final BigDecimal rhs) {
    return doDivideEquals(new NgInt(lhs), (Object)rhs);
  }

  public Object doDivideEquals(final long lhs, final byte rhs) {
    return doDivideEquals(new NgLong(lhs), new NgByte(rhs));
  }

  public Object doDivideEquals(final long lhs, final char rhs) {
    return doDivideEquals(new NgLong(lhs), new NgChar(rhs));
  }

  public Object doDivideEquals(final long lhs, final short rhs) {
    return doDivideEquals(new NgLong(lhs), new NgShort(rhs));
  }

  public Object doDivideEquals(final long lhs, final int rhs) {
    return doDivideEquals(new NgLong(lhs), new NgInt(rhs));
  }

  public Object doDivideEquals(final long lhs, final long rhs) {
    return doDivideEquals(new NgLong(lhs), new NgLong(rhs));
  }

  public Object doDivideEquals(final long lhs, final float rhs) {
    return doDivideEquals(new NgLong(lhs), new NgFloat(rhs));
  }

  public Object doDivideEquals(final long lhs, final double rhs) {
    return doDivideEquals(new NgLong(lhs), new NgDouble(rhs));
  }

  public Object doDivideEquals(final long lhs, final BigInteger rhs) {
    return doDivideEquals(new NgLong(lhs), (Object)rhs);
  }

  public Object doDivideEquals(final long lhs, final BigDecimal rhs) {
    return doDivideEquals(new NgLong(lhs), (Object)rhs);
  }

  public Object doDivideEquals(final float lhs, final byte rhs) {
    return doDivideEquals(new NgFloat(lhs), new NgByte(rhs));
  }

  public Object doDivideEquals(final float lhs, final char rhs) {
    return doDivideEquals(new NgFloat(lhs), new NgChar(rhs));
  }

  public Object doDivideEquals(final float lhs, final short rhs) {
    return doDivideEquals(new NgFloat(lhs), new NgShort(rhs));
  }

  public Object doDivideEquals(final float lhs, final int rhs) {
    return doDivideEquals(new NgFloat(lhs), new NgInt(rhs));
  }

  public Object doDivideEquals(final float lhs, final long rhs) {
    return doDivideEquals(new NgFloat(lhs), new NgLong(rhs));
  }

  public Object doDivideEquals(final float lhs, final float rhs) {
    return doDivideEquals(new NgFloat(lhs), new NgFloat(rhs));
  }

  public Object doDivideEquals(final float lhs, final double rhs) {
    return doDivideEquals(new NgFloat(lhs), new NgDouble(rhs));
  }

  public Object doDivideEquals(final float lhs, final BigInteger rhs) {
    return doDivideEquals(new NgFloat(lhs), (Object)rhs);
  }

  public Object doDivideEquals(final float lhs, final BigDecimal rhs) {
    return doDivideEquals(new NgFloat(lhs), (Object)rhs);
  }

  public Object doDivideEquals(final double lhs, final byte rhs) {
    return doDivideEquals(new NgDouble(lhs), new NgByte(rhs));
  }

  public Object doDivideEquals(final double lhs, final char rhs) {
    return doDivideEquals(new NgDouble(lhs), new NgChar(rhs));
  }

  public Object doDivideEquals(final double lhs, final short rhs) {
    return doDivideEquals(new NgDouble(lhs), new NgShort(rhs));
  }

  public Object doDivideEquals(final double lhs, final int rhs) {
    return doDivideEquals(new NgDouble(lhs), new NgInt(rhs));
  }

  public Object doDivideEquals(final double lhs, final long rhs) {
    return doDivideEquals(new NgDouble(lhs), new NgLong(rhs));
  }

  public Object doDivideEquals(final double lhs, final float rhs) {
    return doDivideEquals(new NgDouble(lhs), new NgFloat(rhs));
  }

  public Object doDivideEquals(final double lhs, final double rhs) {
    return doDivideEquals(new NgDouble(lhs), new NgDouble(rhs));
  }

  public Object doDivideEquals(final double lhs, final BigInteger rhs) {
    return doDivideEquals(new NgDouble(lhs), (Object)rhs);
  }

  public Object doDivideEquals(final double lhs, final BigDecimal rhs) {
    return doDivideEquals(new NgDouble(lhs), (Object)rhs);
  }

  public Object doDivideEquals(final BigInteger lhs, final byte rhs) {
    return doDivideEquals((Object)lhs, new NgByte(rhs));
  }

  public Object doDivideEquals(final BigInteger lhs, final char rhs) {
    return doDivideEquals((Object)lhs, new NgChar(rhs));
  }

  public Object doDivideEquals(final BigInteger lhs, final short rhs) {
    return doDivideEquals((Object)lhs, new NgShort(rhs));
  }

  public Object doDivideEquals(final BigInteger lhs, final int rhs) {
    return doDivideEquals((Object)lhs, new NgInt(rhs));
  }

  public Object doDivideEquals(final BigInteger lhs, final long rhs) {
    return doDivideEquals((Object)lhs, new NgLong(rhs));
  }

  public Object doDivideEquals(final BigInteger lhs, final float rhs) {
    return doDivideEquals((Object)lhs, new NgFloat(rhs));
  }

  public Object doDivideEquals(final BigInteger lhs, final double rhs) {
    return doDivideEquals((Object)lhs, new NgDouble(rhs));
  }

  public Object doDivideEquals(final BigInteger lhs, final BigInteger rhs) {
    return doDivideEquals((Object)lhs, (Object)rhs);
  }

  public Object doDivideEquals(final BigInteger lhs, final BigDecimal rhs) {
    return doDivideEquals((Object)lhs, (Object)rhs);
  }

  public Object doDivideEquals(final BigDecimal lhs, final byte rhs) {
    return doDivideEquals((Object)lhs, new NgByte(rhs));
  }

  public Object doDivideEquals(final BigDecimal lhs, final char rhs) {
    return doDivideEquals((Object)lhs, new NgChar(rhs));
  }

  public Object doDivideEquals(final BigDecimal lhs, final short rhs) {
    return doDivideEquals((Object)lhs, new NgShort(rhs));
  }

  public Object doDivideEquals(final BigDecimal lhs, final int rhs) {
    return doDivideEquals((Object)lhs, new NgInt(rhs));
  }

  public Object doDivideEquals(final BigDecimal lhs, final long rhs) {
    return doDivideEquals((Object)lhs, new NgLong(rhs));
  }

  public Object doDivideEquals(final BigDecimal lhs, final float rhs) {
    return doDivideEquals((Object)lhs, new NgFloat(rhs));
  }

  public Object doDivideEquals(final BigDecimal lhs, final double rhs) {
    return doDivideEquals((Object)lhs, new NgDouble(rhs));
  }

  public Object doDivideEquals(final BigDecimal lhs, final BigInteger rhs) {
    return doDivideEquals((Object)lhs, (Object)rhs);
  }

  public Object doDivideEquals(final BigDecimal lhs, final BigDecimal rhs) {
    return doDivideEquals((Object)lhs, (Object)rhs);
  }

  public Object doDivideEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = new NgByte(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivideEquals(lhs, rhsObject);
  }

  public Object doDivideEquals(final Object lhs, final char rhs) {
  final Object rhsObject = new NgChar(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivideEquals(lhs, rhsObject);
  }

  public Object doDivideEquals(final Object lhs, final short rhs) {
  final Object rhsObject = new NgShort(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivideEquals(lhs, rhsObject);
  }

  public Object doDivideEquals(final Object lhs, final int rhs) {
  final Object rhsObject = new NgInt(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivideEquals(lhs, rhsObject);
  }

  public Object doDivideEquals(final Object lhs, final long rhs) {
  final Object rhsObject = new NgLong(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivideEquals(lhs, rhsObject);
  }

  public Object doDivideEquals(final Object lhs, final float rhs) {
  final Object rhsObject = new NgFloat(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivideEquals(lhs, rhsObject);
  }

  public Object doDivideEquals(final Object lhs, final double rhs) {
  final Object rhsObject = new NgDouble(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivideEquals(lhs, rhsObject);
  }

  public Object doDivideEquals(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivideEquals(lhs, rhsObject);
  }

  public Object doDivideEquals(final Object lhs, final BigDecimal rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseDivideEquals(lhs, rhsObject);
  }

  public Object doReverseDivideEquals(final byte lhs, final Object rhs) {
  final Object lhsObject = new NgByte(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivideEquals(lhsObject, rhs);
  }

  public Object doReverseDivideEquals(final char lhs, final Object rhs) {
  final Object lhsObject = new NgChar(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivideEquals(lhsObject, rhs);
  }

  public Object doReverseDivideEquals(final short lhs, final Object rhs) {
  final Object lhsObject = new NgShort(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivideEquals(lhsObject, rhs);
  }

  public Object doReverseDivideEquals(final int lhs, final Object rhs) {
  final Object lhsObject = new NgInt(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivideEquals(lhsObject, rhs);
  }

  public Object doReverseDivideEquals(final long lhs, final Object rhs) {
  final Object lhsObject = new NgLong(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivideEquals(lhsObject, rhs);
  }

  public Object doReverseDivideEquals(final float lhs, final Object rhs) {
  final Object lhsObject = new NgFloat(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivideEquals(lhsObject, rhs);
  }

  public Object doReverseDivideEquals(final double lhs, final Object rhs) {
  final Object lhsObject = new NgDouble(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivideEquals(lhsObject, rhs);
  }

  public Object doReverseDivideEquals(final BigInteger lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivideEquals(lhsObject, rhs);
  }

  public Object doReverseDivideEquals(final BigDecimal lhs, final Object rhs) {
  final Object lhsObject = (Object)lhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivideEquals(lhsObject, rhs);
  }

  //
  //   Internal methods for operator %
  //
  //  These methods can be overidden to implement %
  //  If the underlying object does not have the appropriate method
  //
  public Object doRemainder(final Object lhs, final Object rhs) {
  final Object result = this.instanceHandler.remainder(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainder(lhs, rhs);
    } else {
      return result;
    }
  }
  
  public Object doReverseRemainder(final Object lhs, final Object rhs) {
    return this.instanceHandler.reverseRemainder(lhs, rhs);
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doRemainder(final byte lhs, final byte rhs) {
    return doRemainder(new NgByte(lhs), new NgByte(rhs));
  }

  public Object doRemainder(final byte lhs, final char rhs) {
    return doRemainder(new NgByte(lhs), new NgChar(rhs));
  }

  public Object doRemainder(final byte lhs, final short rhs) {
    return doRemainder(new NgByte(lhs), new NgShort(rhs));
  }

  public Object doRemainder(final byte lhs, final int rhs) {
    return doRemainder(new NgByte(lhs), new NgInt(rhs));
  }

  public Object doRemainder(final byte lhs, final long rhs) {
    return doRemainder(new NgByte(lhs), new NgLong(rhs));
  }

  public Object doRemainder(final byte lhs, final BigInteger rhs) {
    return doRemainder(new NgByte(lhs), (Object)rhs);
  }

  public Object doRemainder(final char lhs, final byte rhs) {
    return doRemainder(new NgChar(lhs), new NgByte(rhs));
  }

  public Object doRemainder(final char lhs, final char rhs) {
    return doRemainder(new NgChar(lhs), new NgChar(rhs));
  }

  public Object doRemainder(final char lhs, final short rhs) {
    return doRemainder(new NgChar(lhs), new NgShort(rhs));
  }

  public Object doRemainder(final char lhs, final int rhs) {
    return doRemainder(new NgChar(lhs), new NgInt(rhs));
  }

  public Object doRemainder(final char lhs, final long rhs) {
    return doRemainder(new NgChar(lhs), new NgLong(rhs));
  }

  public Object doRemainder(final char lhs, final BigInteger rhs) {
    return doRemainder(new NgChar(lhs), (Object)rhs);
  }

  public Object doRemainder(final short lhs, final byte rhs) {
    return doRemainder(new NgShort(lhs), new NgByte(rhs));
  }

  public Object doRemainder(final short lhs, final char rhs) {
    return doRemainder(new NgShort(lhs), new NgChar(rhs));
  }

  public Object doRemainder(final short lhs, final short rhs) {
    return doRemainder(new NgShort(lhs), new NgShort(rhs));
  }

  public Object doRemainder(final short lhs, final int rhs) {
    return doRemainder(new NgShort(lhs), new NgInt(rhs));
  }

  public Object doRemainder(final short lhs, final long rhs) {
    return doRemainder(new NgShort(lhs), new NgLong(rhs));
  }

  public Object doRemainder(final short lhs, final BigInteger rhs) {
    return doRemainder(new NgShort(lhs), (Object)rhs);
  }

  public Object doRemainder(final int lhs, final byte rhs) {
    return doRemainder(new NgInt(lhs), new NgByte(rhs));
  }

  public Object doRemainder(final int lhs, final char rhs) {
    return doRemainder(new NgInt(lhs), new NgChar(rhs));
  }

  public Object doRemainder(final int lhs, final short rhs) {
    return doRemainder(new NgInt(lhs), new NgShort(rhs));
  }

  public Object doRemainder(final int lhs, final int rhs) {
    return doRemainder(new NgInt(lhs), new NgInt(rhs));
  }

  public Object doRemainder(final int lhs, final long rhs) {
    return doRemainder(new NgInt(lhs), new NgLong(rhs));
  }

  public Object doRemainder(final int lhs, final BigInteger rhs) {
    return doRemainder(new NgInt(lhs), (Object)rhs);
  }

  public Object doRemainder(final long lhs, final byte rhs) {
    return doRemainder(new NgLong(lhs), new NgByte(rhs));
  }

  public Object doRemainder(final long lhs, final char rhs) {
    return doRemainder(new NgLong(lhs), new NgChar(rhs));
  }

  public Object doRemainder(final long lhs, final short rhs) {
    return doRemainder(new NgLong(lhs), new NgShort(rhs));
  }

  public Object doRemainder(final long lhs, final int rhs) {
    return doRemainder(new NgLong(lhs), new NgInt(rhs));
  }

  public Object doRemainder(final long lhs, final long rhs) {
    return doRemainder(new NgLong(lhs), new NgLong(rhs));
  }

  public Object doRemainder(final long lhs, final BigInteger rhs) {
    return doRemainder(new NgLong(lhs), (Object)rhs);
  }

  public Object doRemainder(final BigInteger lhs, final byte rhs) {
    return doRemainder((Object)lhs, new NgByte(rhs));
  }

  public Object doRemainder(final BigInteger lhs, final char rhs) {
    return doRemainder((Object)lhs, new NgChar(rhs));
  }

  public Object doRemainder(final BigInteger lhs, final short rhs) {
    return doRemainder((Object)lhs, new NgShort(rhs));
  }

  public Object doRemainder(final BigInteger lhs, final int rhs) {
    return doRemainder((Object)lhs, new NgInt(rhs));
  }

  public Object doRemainder(final BigInteger lhs, final long rhs) {
    return doRemainder((Object)lhs, new NgLong(rhs));
  }

  public Object doRemainder(final BigInteger lhs, final BigInteger rhs) {
    return doRemainder((Object)lhs, (Object)rhs);
  }

  public Object doRemainder(final Object lhs, final byte rhs) {
  final Object rhsObject = new NgByte(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseRemainder(lhs, rhsObject);
  }

  public Object doRemainder(final Object lhs, final char rhs) {
  final Object rhsObject = new NgChar(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseRemainder(lhs, rhsObject);
  }

  public Object doRemainder(final Object lhs, final short rhs) {
  final Object rhsObject = new NgShort(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseRemainder(lhs, rhsObject);
  }

  public Object doRemainder(final Object lhs, final int rhs) {
  final Object rhsObject = new NgInt(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseRemainder(lhs, rhsObject);
  }

  public Object doRemainder(final Object lhs, final long rhs) {
  final Object rhsObject = new NgLong(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseRemainder(lhs, rhsObject);
  }

  public Object doRemainder(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseRemainder(lhs, rhsObject);
  }

  public Object doReverseRemainder(final byte lhs, final Object rhs) {
  final Object lhsObject = new NgByte(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainder(lhsObject, rhs);
  }

  public Object doReverseRemainder(final char lhs, final Object rhs) {
  final Object lhsObject = new NgChar(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainder(lhsObject, rhs);
  }

  public Object doReverseRemainder(final short lhs, final Object rhs) {
  final Object lhsObject = new NgShort(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainder(lhsObject, rhs);
  }

  public Object doReverseRemainder(final int lhs, final Object rhs) {
  final Object lhsObject = new NgInt(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainder(lhsObject, rhs);
  }

  public Object doReverseRemainder(final long lhs, final Object rhs) {
  final Object lhsObject = new NgLong(lhs);
    
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
  final Object result = this.instanceHandler.remainderEquals(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainderEquals(lhs, rhs);
    } else {
      return result;
    }
  }
  
  public Object doReverseRemainderEquals(final Object lhs, final Object rhs) {
    return this.instanceHandler.reverseRemainderEquals(lhs, rhs);
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doRemainderEquals(final byte lhs, final byte rhs) {
    return doRemainderEquals(new NgByte(lhs), new NgByte(rhs));
  }

  public Object doRemainderEquals(final byte lhs, final char rhs) {
    return doRemainderEquals(new NgByte(lhs), new NgChar(rhs));
  }

  public Object doRemainderEquals(final byte lhs, final short rhs) {
    return doRemainderEquals(new NgByte(lhs), new NgShort(rhs));
  }

  public Object doRemainderEquals(final byte lhs, final int rhs) {
    return doRemainderEquals(new NgByte(lhs), new NgInt(rhs));
  }

  public Object doRemainderEquals(final byte lhs, final long rhs) {
    return doRemainderEquals(new NgByte(lhs), new NgLong(rhs));
  }

  public Object doRemainderEquals(final byte lhs, final BigInteger rhs) {
    return doRemainderEquals(new NgByte(lhs), (Object)rhs);
  }

  public Object doRemainderEquals(final char lhs, final byte rhs) {
    return doRemainderEquals(new NgChar(lhs), new NgByte(rhs));
  }

  public Object doRemainderEquals(final char lhs, final char rhs) {
    return doRemainderEquals(new NgChar(lhs), new NgChar(rhs));
  }

  public Object doRemainderEquals(final char lhs, final short rhs) {
    return doRemainderEquals(new NgChar(lhs), new NgShort(rhs));
  }

  public Object doRemainderEquals(final char lhs, final int rhs) {
    return doRemainderEquals(new NgChar(lhs), new NgInt(rhs));
  }

  public Object doRemainderEquals(final char lhs, final long rhs) {
    return doRemainderEquals(new NgChar(lhs), new NgLong(rhs));
  }

  public Object doRemainderEquals(final char lhs, final BigInteger rhs) {
    return doRemainderEquals(new NgChar(lhs), (Object)rhs);
  }

  public Object doRemainderEquals(final short lhs, final byte rhs) {
    return doRemainderEquals(new NgShort(lhs), new NgByte(rhs));
  }

  public Object doRemainderEquals(final short lhs, final char rhs) {
    return doRemainderEquals(new NgShort(lhs), new NgChar(rhs));
  }

  public Object doRemainderEquals(final short lhs, final short rhs) {
    return doRemainderEquals(new NgShort(lhs), new NgShort(rhs));
  }

  public Object doRemainderEquals(final short lhs, final int rhs) {
    return doRemainderEquals(new NgShort(lhs), new NgInt(rhs));
  }

  public Object doRemainderEquals(final short lhs, final long rhs) {
    return doRemainderEquals(new NgShort(lhs), new NgLong(rhs));
  }

  public Object doRemainderEquals(final short lhs, final BigInteger rhs) {
    return doRemainderEquals(new NgShort(lhs), (Object)rhs);
  }

  public Object doRemainderEquals(final int lhs, final byte rhs) {
    return doRemainderEquals(new NgInt(lhs), new NgByte(rhs));
  }

  public Object doRemainderEquals(final int lhs, final char rhs) {
    return doRemainderEquals(new NgInt(lhs), new NgChar(rhs));
  }

  public Object doRemainderEquals(final int lhs, final short rhs) {
    return doRemainderEquals(new NgInt(lhs), new NgShort(rhs));
  }

  public Object doRemainderEquals(final int lhs, final int rhs) {
    return doRemainderEquals(new NgInt(lhs), new NgInt(rhs));
  }

  public Object doRemainderEquals(final int lhs, final long rhs) {
    return doRemainderEquals(new NgInt(lhs), new NgLong(rhs));
  }

  public Object doRemainderEquals(final int lhs, final BigInteger rhs) {
    return doRemainderEquals(new NgInt(lhs), (Object)rhs);
  }

  public Object doRemainderEquals(final long lhs, final byte rhs) {
    return doRemainderEquals(new NgLong(lhs), new NgByte(rhs));
  }

  public Object doRemainderEquals(final long lhs, final char rhs) {
    return doRemainderEquals(new NgLong(lhs), new NgChar(rhs));
  }

  public Object doRemainderEquals(final long lhs, final short rhs) {
    return doRemainderEquals(new NgLong(lhs), new NgShort(rhs));
  }

  public Object doRemainderEquals(final long lhs, final int rhs) {
    return doRemainderEquals(new NgLong(lhs), new NgInt(rhs));
  }

  public Object doRemainderEquals(final long lhs, final long rhs) {
    return doRemainderEquals(new NgLong(lhs), new NgLong(rhs));
  }

  public Object doRemainderEquals(final long lhs, final BigInteger rhs) {
    return doRemainderEquals(new NgLong(lhs), (Object)rhs);
  }

  public Object doRemainderEquals(final BigInteger lhs, final byte rhs) {
    return doRemainderEquals((Object)lhs, new NgByte(rhs));
  }

  public Object doRemainderEquals(final BigInteger lhs, final char rhs) {
    return doRemainderEquals((Object)lhs, new NgChar(rhs));
  }

  public Object doRemainderEquals(final BigInteger lhs, final short rhs) {
    return doRemainderEquals((Object)lhs, new NgShort(rhs));
  }

  public Object doRemainderEquals(final BigInteger lhs, final int rhs) {
    return doRemainderEquals((Object)lhs, new NgInt(rhs));
  }

  public Object doRemainderEquals(final BigInteger lhs, final long rhs) {
    return doRemainderEquals((Object)lhs, new NgLong(rhs));
  }

  public Object doRemainderEquals(final BigInteger lhs, final BigInteger rhs) {
    return doRemainderEquals((Object)lhs, (Object)rhs);
  }

  public Object doRemainderEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = new NgByte(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseRemainderEquals(lhs, rhsObject);
  }

  public Object doRemainderEquals(final Object lhs, final char rhs) {
  final Object rhsObject = new NgChar(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseRemainderEquals(lhs, rhsObject);
  }

  public Object doRemainderEquals(final Object lhs, final short rhs) {
  final Object rhsObject = new NgShort(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseRemainderEquals(lhs, rhsObject);
  }

  public Object doRemainderEquals(final Object lhs, final int rhs) {
  final Object rhsObject = new NgInt(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseRemainderEquals(lhs, rhsObject);
  }

  public Object doRemainderEquals(final Object lhs, final long rhs) {
  final Object rhsObject = new NgLong(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseRemainderEquals(lhs, rhsObject);
  }

  public Object doRemainderEquals(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseRemainderEquals(lhs, rhsObject);
  }

  public Object doReverseRemainderEquals(final byte lhs, final Object rhs) {
  final Object lhsObject = new NgByte(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainderEquals(lhsObject, rhs);
  }

  public Object doReverseRemainderEquals(final char lhs, final Object rhs) {
  final Object lhsObject = new NgChar(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainderEquals(lhsObject, rhs);
  }

  public Object doReverseRemainderEquals(final short lhs, final Object rhs) {
  final Object lhsObject = new NgShort(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainderEquals(lhsObject, rhs);
  }

  public Object doReverseRemainderEquals(final int lhs, final Object rhs) {
  final Object lhsObject = new NgInt(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainderEquals(lhsObject, rhs);
  }

  public Object doReverseRemainderEquals(final long lhs, final Object rhs) {
  final Object lhsObject = new NgLong(lhs);
    
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
  final Object result = this.instanceHandler.integerDivide(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivide(lhs, rhs);
    } else {
      return result;
    }
  }
  
  public Object doReverseIntegerDivide(final Object lhs, final Object rhs) {
    return this.instanceHandler.reverseIntegerDivide(lhs, rhs);
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doIntegerDivide(final byte lhs, final byte rhs) {
    return doIntegerDivide(new NgByte(lhs), new NgByte(rhs));
  }

  public Object doIntegerDivide(final byte lhs, final char rhs) {
    return doIntegerDivide(new NgByte(lhs), new NgChar(rhs));
  }

  public Object doIntegerDivide(final byte lhs, final short rhs) {
    return doIntegerDivide(new NgByte(lhs), new NgShort(rhs));
  }

  public Object doIntegerDivide(final byte lhs, final int rhs) {
    return doIntegerDivide(new NgByte(lhs), new NgInt(rhs));
  }

  public Object doIntegerDivide(final byte lhs, final long rhs) {
    return doIntegerDivide(new NgByte(lhs), new NgLong(rhs));
  }

  public Object doIntegerDivide(final byte lhs, final float rhs) {
    return doIntegerDivide(new NgByte(lhs), new NgFloat(rhs));
  }

  public Object doIntegerDivide(final byte lhs, final double rhs) {
    return doIntegerDivide(new NgByte(lhs), new NgDouble(rhs));
  }

  public Object doIntegerDivide(final byte lhs, final BigInteger rhs) {
    return doIntegerDivide(new NgByte(lhs), (Object)rhs);
  }

  public Object doIntegerDivide(final byte lhs, final BigDecimal rhs) {
    return doIntegerDivide(new NgByte(lhs), (Object)rhs);
  }

  public Object doIntegerDivide(final char lhs, final byte rhs) {
    return doIntegerDivide(new NgChar(lhs), new NgByte(rhs));
  }

  public Object doIntegerDivide(final char lhs, final char rhs) {
    return doIntegerDivide(new NgChar(lhs), new NgChar(rhs));
  }

  public Object doIntegerDivide(final char lhs, final short rhs) {
    return doIntegerDivide(new NgChar(lhs), new NgShort(rhs));
  }

  public Object doIntegerDivide(final char lhs, final int rhs) {
    return doIntegerDivide(new NgChar(lhs), new NgInt(rhs));
  }

  public Object doIntegerDivide(final char lhs, final long rhs) {
    return doIntegerDivide(new NgChar(lhs), new NgLong(rhs));
  }

  public Object doIntegerDivide(final char lhs, final float rhs) {
    return doIntegerDivide(new NgChar(lhs), new NgFloat(rhs));
  }

  public Object doIntegerDivide(final char lhs, final double rhs) {
    return doIntegerDivide(new NgChar(lhs), new NgDouble(rhs));
  }

  public Object doIntegerDivide(final char lhs, final BigInteger rhs) {
    return doIntegerDivide(new NgChar(lhs), (Object)rhs);
  }

  public Object doIntegerDivide(final char lhs, final BigDecimal rhs) {
    return doIntegerDivide(new NgChar(lhs), (Object)rhs);
  }

  public Object doIntegerDivide(final short lhs, final byte rhs) {
    return doIntegerDivide(new NgShort(lhs), new NgByte(rhs));
  }

  public Object doIntegerDivide(final short lhs, final char rhs) {
    return doIntegerDivide(new NgShort(lhs), new NgChar(rhs));
  }

  public Object doIntegerDivide(final short lhs, final short rhs) {
    return doIntegerDivide(new NgShort(lhs), new NgShort(rhs));
  }

  public Object doIntegerDivide(final short lhs, final int rhs) {
    return doIntegerDivide(new NgShort(lhs), new NgInt(rhs));
  }

  public Object doIntegerDivide(final short lhs, final long rhs) {
    return doIntegerDivide(new NgShort(lhs), new NgLong(rhs));
  }

  public Object doIntegerDivide(final short lhs, final float rhs) {
    return doIntegerDivide(new NgShort(lhs), new NgFloat(rhs));
  }

  public Object doIntegerDivide(final short lhs, final double rhs) {
    return doIntegerDivide(new NgShort(lhs), new NgDouble(rhs));
  }

  public Object doIntegerDivide(final short lhs, final BigInteger rhs) {
    return doIntegerDivide(new NgShort(lhs), (Object)rhs);
  }

  public Object doIntegerDivide(final short lhs, final BigDecimal rhs) {
    return doIntegerDivide(new NgShort(lhs), (Object)rhs);
  }

  public Object doIntegerDivide(final int lhs, final byte rhs) {
    return doIntegerDivide(new NgInt(lhs), new NgByte(rhs));
  }

  public Object doIntegerDivide(final int lhs, final char rhs) {
    return doIntegerDivide(new NgInt(lhs), new NgChar(rhs));
  }

  public Object doIntegerDivide(final int lhs, final short rhs) {
    return doIntegerDivide(new NgInt(lhs), new NgShort(rhs));
  }

  public Object doIntegerDivide(final int lhs, final int rhs) {
    return doIntegerDivide(new NgInt(lhs), new NgInt(rhs));
  }

  public Object doIntegerDivide(final int lhs, final long rhs) {
    return doIntegerDivide(new NgInt(lhs), new NgLong(rhs));
  }

  public Object doIntegerDivide(final int lhs, final float rhs) {
    return doIntegerDivide(new NgInt(lhs), new NgFloat(rhs));
  }

  public Object doIntegerDivide(final int lhs, final double rhs) {
    return doIntegerDivide(new NgInt(lhs), new NgDouble(rhs));
  }

  public Object doIntegerDivide(final int lhs, final BigInteger rhs) {
    return doIntegerDivide(new NgInt(lhs), (Object)rhs);
  }

  public Object doIntegerDivide(final int lhs, final BigDecimal rhs) {
    return doIntegerDivide(new NgInt(lhs), (Object)rhs);
  }

  public Object doIntegerDivide(final long lhs, final byte rhs) {
    return doIntegerDivide(new NgLong(lhs), new NgByte(rhs));
  }

  public Object doIntegerDivide(final long lhs, final char rhs) {
    return doIntegerDivide(new NgLong(lhs), new NgChar(rhs));
  }

  public Object doIntegerDivide(final long lhs, final short rhs) {
    return doIntegerDivide(new NgLong(lhs), new NgShort(rhs));
  }

  public Object doIntegerDivide(final long lhs, final int rhs) {
    return doIntegerDivide(new NgLong(lhs), new NgInt(rhs));
  }

  public Object doIntegerDivide(final long lhs, final long rhs) {
    return doIntegerDivide(new NgLong(lhs), new NgLong(rhs));
  }

  public Object doIntegerDivide(final long lhs, final float rhs) {
    return doIntegerDivide(new NgLong(lhs), new NgFloat(rhs));
  }

  public Object doIntegerDivide(final long lhs, final double rhs) {
    return doIntegerDivide(new NgLong(lhs), new NgDouble(rhs));
  }

  public Object doIntegerDivide(final long lhs, final BigInteger rhs) {
    return doIntegerDivide(new NgLong(lhs), (Object)rhs);
  }

  public Object doIntegerDivide(final long lhs, final BigDecimal rhs) {
    return doIntegerDivide(new NgLong(lhs), (Object)rhs);
  }

  public Object doIntegerDivide(final float lhs, final byte rhs) {
    return doIntegerDivide(new NgFloat(lhs), new NgByte(rhs));
  }

  public Object doIntegerDivide(final float lhs, final char rhs) {
    return doIntegerDivide(new NgFloat(lhs), new NgChar(rhs));
  }

  public Object doIntegerDivide(final float lhs, final short rhs) {
    return doIntegerDivide(new NgFloat(lhs), new NgShort(rhs));
  }

  public Object doIntegerDivide(final float lhs, final int rhs) {
    return doIntegerDivide(new NgFloat(lhs), new NgInt(rhs));
  }

  public Object doIntegerDivide(final float lhs, final long rhs) {
    return doIntegerDivide(new NgFloat(lhs), new NgLong(rhs));
  }

  public Object doIntegerDivide(final float lhs, final float rhs) {
    return doIntegerDivide(new NgFloat(lhs), new NgFloat(rhs));
  }

  public Object doIntegerDivide(final float lhs, final double rhs) {
    return doIntegerDivide(new NgFloat(lhs), new NgDouble(rhs));
  }

  public Object doIntegerDivide(final float lhs, final BigInteger rhs) {
    return doIntegerDivide(new NgFloat(lhs), (Object)rhs);
  }

  public Object doIntegerDivide(final float lhs, final BigDecimal rhs) {
    return doIntegerDivide(new NgFloat(lhs), (Object)rhs);
  }

  public Object doIntegerDivide(final double lhs, final byte rhs) {
    return doIntegerDivide(new NgDouble(lhs), new NgByte(rhs));
  }

  public Object doIntegerDivide(final double lhs, final char rhs) {
    return doIntegerDivide(new NgDouble(lhs), new NgChar(rhs));
  }

  public Object doIntegerDivide(final double lhs, final short rhs) {
    return doIntegerDivide(new NgDouble(lhs), new NgShort(rhs));
  }

  public Object doIntegerDivide(final double lhs, final int rhs) {
    return doIntegerDivide(new NgDouble(lhs), new NgInt(rhs));
  }

  public Object doIntegerDivide(final double lhs, final long rhs) {
    return doIntegerDivide(new NgDouble(lhs), new NgLong(rhs));
  }

  public Object doIntegerDivide(final double lhs, final float rhs) {
    return doIntegerDivide(new NgDouble(lhs), new NgFloat(rhs));
  }

  public Object doIntegerDivide(final double lhs, final double rhs) {
    return doIntegerDivide(new NgDouble(lhs), new NgDouble(rhs));
  }

  public Object doIntegerDivide(final double lhs, final BigInteger rhs) {
    return doIntegerDivide(new NgDouble(lhs), (Object)rhs);
  }

  public Object doIntegerDivide(final double lhs, final BigDecimal rhs) {
    return doIntegerDivide(new NgDouble(lhs), (Object)rhs);
  }

  public Object doIntegerDivide(final BigInteger lhs, final byte rhs) {
    return doIntegerDivide((Object)lhs, new NgByte(rhs));
  }

  public Object doIntegerDivide(final BigInteger lhs, final char rhs) {
    return doIntegerDivide((Object)lhs, new NgChar(rhs));
  }

  public Object doIntegerDivide(final BigInteger lhs, final short rhs) {
    return doIntegerDivide((Object)lhs, new NgShort(rhs));
  }

  public Object doIntegerDivide(final BigInteger lhs, final int rhs) {
    return doIntegerDivide((Object)lhs, new NgInt(rhs));
  }

  public Object doIntegerDivide(final BigInteger lhs, final long rhs) {
    return doIntegerDivide((Object)lhs, new NgLong(rhs));
  }

  public Object doIntegerDivide(final BigInteger lhs, final float rhs) {
    return doIntegerDivide((Object)lhs, new NgFloat(rhs));
  }

  public Object doIntegerDivide(final BigInteger lhs, final double rhs) {
    return doIntegerDivide((Object)lhs, new NgDouble(rhs));
  }

  public Object doIntegerDivide(final BigInteger lhs, final BigInteger rhs) {
    return doIntegerDivide((Object)lhs, (Object)rhs);
  }

  public Object doIntegerDivide(final BigInteger lhs, final BigDecimal rhs) {
    return doIntegerDivide((Object)lhs, (Object)rhs);
  }

  public Object doIntegerDivide(final BigDecimal lhs, final byte rhs) {
    return doIntegerDivide((Object)lhs, new NgByte(rhs));
  }

  public Object doIntegerDivide(final BigDecimal lhs, final char rhs) {
    return doIntegerDivide((Object)lhs, new NgChar(rhs));
  }

  public Object doIntegerDivide(final BigDecimal lhs, final short rhs) {
    return doIntegerDivide((Object)lhs, new NgShort(rhs));
  }

  public Object doIntegerDivide(final BigDecimal lhs, final int rhs) {
    return doIntegerDivide((Object)lhs, new NgInt(rhs));
  }

  public Object doIntegerDivide(final BigDecimal lhs, final long rhs) {
    return doIntegerDivide((Object)lhs, new NgLong(rhs));
  }

  public Object doIntegerDivide(final BigDecimal lhs, final float rhs) {
    return doIntegerDivide((Object)lhs, new NgFloat(rhs));
  }

  public Object doIntegerDivide(final BigDecimal lhs, final double rhs) {
    return doIntegerDivide((Object)lhs, new NgDouble(rhs));
  }

  public Object doIntegerDivide(final BigDecimal lhs, final BigInteger rhs) {
    return doIntegerDivide((Object)lhs, (Object)rhs);
  }

  public Object doIntegerDivide(final BigDecimal lhs, final BigDecimal rhs) {
    return doIntegerDivide((Object)lhs, (Object)rhs);
  }

  public Object doIntegerDivide(final Object lhs, final byte rhs) {
  final Object rhsObject = new NgByte(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseIntegerDivide(lhs, rhsObject);
  }

  public Object doIntegerDivide(final Object lhs, final char rhs) {
  final Object rhsObject = new NgChar(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseIntegerDivide(lhs, rhsObject);
  }

  public Object doIntegerDivide(final Object lhs, final short rhs) {
  final Object rhsObject = new NgShort(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseIntegerDivide(lhs, rhsObject);
  }

  public Object doIntegerDivide(final Object lhs, final int rhs) {
  final Object rhsObject = new NgInt(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseIntegerDivide(lhs, rhsObject);
  }

  public Object doIntegerDivide(final Object lhs, final long rhs) {
  final Object rhsObject = new NgLong(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseIntegerDivide(lhs, rhsObject);
  }

  public Object doIntegerDivide(final Object lhs, final float rhs) {
  final Object rhsObject = new NgFloat(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseIntegerDivide(lhs, rhsObject);
  }

  public Object doIntegerDivide(final Object lhs, final double rhs) {
  final Object rhsObject = new NgDouble(rhs);
    
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
  final Object lhsObject = new NgByte(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivide(lhsObject, rhs);
  }

  public Object doReverseIntegerDivide(final char lhs, final Object rhs) {
  final Object lhsObject = new NgChar(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivide(lhsObject, rhs);
  }

  public Object doReverseIntegerDivide(final short lhs, final Object rhs) {
  final Object lhsObject = new NgShort(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivide(lhsObject, rhs);
  }

  public Object doReverseIntegerDivide(final int lhs, final Object rhs) {
  final Object lhsObject = new NgInt(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivide(lhsObject, rhs);
  }

  public Object doReverseIntegerDivide(final long lhs, final Object rhs) {
  final Object lhsObject = new NgLong(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivide(lhsObject, rhs);
  }

  public Object doReverseIntegerDivide(final float lhs, final Object rhs) {
  final Object lhsObject = new NgFloat(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivide(lhsObject, rhs);
  }

  public Object doReverseIntegerDivide(final double lhs, final Object rhs) {
  final Object lhsObject = new NgDouble(lhs);
    
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
  final Object result = this.instanceHandler.integerDivideEquals(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivideEquals(lhs, rhs);
    } else {
      return result;
    }
  }
  
  public Object doReverseIntegerDivideEquals(final Object lhs, final Object rhs) {
    return this.instanceHandler.reverseIntegerDivideEquals(lhs, rhs);
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doIntegerDivideEquals(final byte lhs, final byte rhs) {
    return doIntegerDivideEquals(new NgByte(lhs), new NgByte(rhs));
  }

  public Object doIntegerDivideEquals(final byte lhs, final char rhs) {
    return doIntegerDivideEquals(new NgByte(lhs), new NgChar(rhs));
  }

  public Object doIntegerDivideEquals(final byte lhs, final short rhs) {
    return doIntegerDivideEquals(new NgByte(lhs), new NgShort(rhs));
  }

  public Object doIntegerDivideEquals(final byte lhs, final int rhs) {
    return doIntegerDivideEquals(new NgByte(lhs), new NgInt(rhs));
  }

  public Object doIntegerDivideEquals(final byte lhs, final long rhs) {
    return doIntegerDivideEquals(new NgByte(lhs), new NgLong(rhs));
  }

  public Object doIntegerDivideEquals(final byte lhs, final float rhs) {
    return doIntegerDivideEquals(new NgByte(lhs), new NgFloat(rhs));
  }

  public Object doIntegerDivideEquals(final byte lhs, final double rhs) {
    return doIntegerDivideEquals(new NgByte(lhs), new NgDouble(rhs));
  }

  public Object doIntegerDivideEquals(final byte lhs, final BigInteger rhs) {
    return doIntegerDivideEquals(new NgByte(lhs), (Object)rhs);
  }

  public Object doIntegerDivideEquals(final byte lhs, final BigDecimal rhs) {
    return doIntegerDivideEquals(new NgByte(lhs), (Object)rhs);
  }

  public Object doIntegerDivideEquals(final char lhs, final byte rhs) {
    return doIntegerDivideEquals(new NgChar(lhs), new NgByte(rhs));
  }

  public Object doIntegerDivideEquals(final char lhs, final char rhs) {
    return doIntegerDivideEquals(new NgChar(lhs), new NgChar(rhs));
  }

  public Object doIntegerDivideEquals(final char lhs, final short rhs) {
    return doIntegerDivideEquals(new NgChar(lhs), new NgShort(rhs));
  }

  public Object doIntegerDivideEquals(final char lhs, final int rhs) {
    return doIntegerDivideEquals(new NgChar(lhs), new NgInt(rhs));
  }

  public Object doIntegerDivideEquals(final char lhs, final long rhs) {
    return doIntegerDivideEquals(new NgChar(lhs), new NgLong(rhs));
  }

  public Object doIntegerDivideEquals(final char lhs, final float rhs) {
    return doIntegerDivideEquals(new NgChar(lhs), new NgFloat(rhs));
  }

  public Object doIntegerDivideEquals(final char lhs, final double rhs) {
    return doIntegerDivideEquals(new NgChar(lhs), new NgDouble(rhs));
  }

  public Object doIntegerDivideEquals(final char lhs, final BigInteger rhs) {
    return doIntegerDivideEquals(new NgChar(lhs), (Object)rhs);
  }

  public Object doIntegerDivideEquals(final char lhs, final BigDecimal rhs) {
    return doIntegerDivideEquals(new NgChar(lhs), (Object)rhs);
  }

  public Object doIntegerDivideEquals(final short lhs, final byte rhs) {
    return doIntegerDivideEquals(new NgShort(lhs), new NgByte(rhs));
  }

  public Object doIntegerDivideEquals(final short lhs, final char rhs) {
    return doIntegerDivideEquals(new NgShort(lhs), new NgChar(rhs));
  }

  public Object doIntegerDivideEquals(final short lhs, final short rhs) {
    return doIntegerDivideEquals(new NgShort(lhs), new NgShort(rhs));
  }

  public Object doIntegerDivideEquals(final short lhs, final int rhs) {
    return doIntegerDivideEquals(new NgShort(lhs), new NgInt(rhs));
  }

  public Object doIntegerDivideEquals(final short lhs, final long rhs) {
    return doIntegerDivideEquals(new NgShort(lhs), new NgLong(rhs));
  }

  public Object doIntegerDivideEquals(final short lhs, final float rhs) {
    return doIntegerDivideEquals(new NgShort(lhs), new NgFloat(rhs));
  }

  public Object doIntegerDivideEquals(final short lhs, final double rhs) {
    return doIntegerDivideEquals(new NgShort(lhs), new NgDouble(rhs));
  }

  public Object doIntegerDivideEquals(final short lhs, final BigInteger rhs) {
    return doIntegerDivideEquals(new NgShort(lhs), (Object)rhs);
  }

  public Object doIntegerDivideEquals(final short lhs, final BigDecimal rhs) {
    return doIntegerDivideEquals(new NgShort(lhs), (Object)rhs);
  }

  public Object doIntegerDivideEquals(final int lhs, final byte rhs) {
    return doIntegerDivideEquals(new NgInt(lhs), new NgByte(rhs));
  }

  public Object doIntegerDivideEquals(final int lhs, final char rhs) {
    return doIntegerDivideEquals(new NgInt(lhs), new NgChar(rhs));
  }

  public Object doIntegerDivideEquals(final int lhs, final short rhs) {
    return doIntegerDivideEquals(new NgInt(lhs), new NgShort(rhs));
  }

  public Object doIntegerDivideEquals(final int lhs, final int rhs) {
    return doIntegerDivideEquals(new NgInt(lhs), new NgInt(rhs));
  }

  public Object doIntegerDivideEquals(final int lhs, final long rhs) {
    return doIntegerDivideEquals(new NgInt(lhs), new NgLong(rhs));
  }

  public Object doIntegerDivideEquals(final int lhs, final float rhs) {
    return doIntegerDivideEquals(new NgInt(lhs), new NgFloat(rhs));
  }

  public Object doIntegerDivideEquals(final int lhs, final double rhs) {
    return doIntegerDivideEquals(new NgInt(lhs), new NgDouble(rhs));
  }

  public Object doIntegerDivideEquals(final int lhs, final BigInteger rhs) {
    return doIntegerDivideEquals(new NgInt(lhs), (Object)rhs);
  }

  public Object doIntegerDivideEquals(final int lhs, final BigDecimal rhs) {
    return doIntegerDivideEquals(new NgInt(lhs), (Object)rhs);
  }

  public Object doIntegerDivideEquals(final long lhs, final byte rhs) {
    return doIntegerDivideEquals(new NgLong(lhs), new NgByte(rhs));
  }

  public Object doIntegerDivideEquals(final long lhs, final char rhs) {
    return doIntegerDivideEquals(new NgLong(lhs), new NgChar(rhs));
  }

  public Object doIntegerDivideEquals(final long lhs, final short rhs) {
    return doIntegerDivideEquals(new NgLong(lhs), new NgShort(rhs));
  }

  public Object doIntegerDivideEquals(final long lhs, final int rhs) {
    return doIntegerDivideEquals(new NgLong(lhs), new NgInt(rhs));
  }

  public Object doIntegerDivideEquals(final long lhs, final long rhs) {
    return doIntegerDivideEquals(new NgLong(lhs), new NgLong(rhs));
  }

  public Object doIntegerDivideEquals(final long lhs, final float rhs) {
    return doIntegerDivideEquals(new NgLong(lhs), new NgFloat(rhs));
  }

  public Object doIntegerDivideEquals(final long lhs, final double rhs) {
    return doIntegerDivideEquals(new NgLong(lhs), new NgDouble(rhs));
  }

  public Object doIntegerDivideEquals(final long lhs, final BigInteger rhs) {
    return doIntegerDivideEquals(new NgLong(lhs), (Object)rhs);
  }

  public Object doIntegerDivideEquals(final long lhs, final BigDecimal rhs) {
    return doIntegerDivideEquals(new NgLong(lhs), (Object)rhs);
  }

  public Object doIntegerDivideEquals(final float lhs, final byte rhs) {
    return doIntegerDivideEquals(new NgFloat(lhs), new NgByte(rhs));
  }

  public Object doIntegerDivideEquals(final float lhs, final char rhs) {
    return doIntegerDivideEquals(new NgFloat(lhs), new NgChar(rhs));
  }

  public Object doIntegerDivideEquals(final float lhs, final short rhs) {
    return doIntegerDivideEquals(new NgFloat(lhs), new NgShort(rhs));
  }

  public Object doIntegerDivideEquals(final float lhs, final int rhs) {
    return doIntegerDivideEquals(new NgFloat(lhs), new NgInt(rhs));
  }

  public Object doIntegerDivideEquals(final float lhs, final long rhs) {
    return doIntegerDivideEquals(new NgFloat(lhs), new NgLong(rhs));
  }

  public Object doIntegerDivideEquals(final float lhs, final float rhs) {
    return doIntegerDivideEquals(new NgFloat(lhs), new NgFloat(rhs));
  }

  public Object doIntegerDivideEquals(final float lhs, final double rhs) {
    return doIntegerDivideEquals(new NgFloat(lhs), new NgDouble(rhs));
  }

  public Object doIntegerDivideEquals(final float lhs, final BigInteger rhs) {
    return doIntegerDivideEquals(new NgFloat(lhs), (Object)rhs);
  }

  public Object doIntegerDivideEquals(final float lhs, final BigDecimal rhs) {
    return doIntegerDivideEquals(new NgFloat(lhs), (Object)rhs);
  }

  public Object doIntegerDivideEquals(final double lhs, final byte rhs) {
    return doIntegerDivideEquals(new NgDouble(lhs), new NgByte(rhs));
  }

  public Object doIntegerDivideEquals(final double lhs, final char rhs) {
    return doIntegerDivideEquals(new NgDouble(lhs), new NgChar(rhs));
  }

  public Object doIntegerDivideEquals(final double lhs, final short rhs) {
    return doIntegerDivideEquals(new NgDouble(lhs), new NgShort(rhs));
  }

  public Object doIntegerDivideEquals(final double lhs, final int rhs) {
    return doIntegerDivideEquals(new NgDouble(lhs), new NgInt(rhs));
  }

  public Object doIntegerDivideEquals(final double lhs, final long rhs) {
    return doIntegerDivideEquals(new NgDouble(lhs), new NgLong(rhs));
  }

  public Object doIntegerDivideEquals(final double lhs, final float rhs) {
    return doIntegerDivideEquals(new NgDouble(lhs), new NgFloat(rhs));
  }

  public Object doIntegerDivideEquals(final double lhs, final double rhs) {
    return doIntegerDivideEquals(new NgDouble(lhs), new NgDouble(rhs));
  }

  public Object doIntegerDivideEquals(final double lhs, final BigInteger rhs) {
    return doIntegerDivideEquals(new NgDouble(lhs), (Object)rhs);
  }

  public Object doIntegerDivideEquals(final double lhs, final BigDecimal rhs) {
    return doIntegerDivideEquals(new NgDouble(lhs), (Object)rhs);
  }

  public Object doIntegerDivideEquals(final BigInteger lhs, final byte rhs) {
    return doIntegerDivideEquals((Object)lhs, new NgByte(rhs));
  }

  public Object doIntegerDivideEquals(final BigInteger lhs, final char rhs) {
    return doIntegerDivideEquals((Object)lhs, new NgChar(rhs));
  }

  public Object doIntegerDivideEquals(final BigInteger lhs, final short rhs) {
    return doIntegerDivideEquals((Object)lhs, new NgShort(rhs));
  }

  public Object doIntegerDivideEquals(final BigInteger lhs, final int rhs) {
    return doIntegerDivideEquals((Object)lhs, new NgInt(rhs));
  }

  public Object doIntegerDivideEquals(final BigInteger lhs, final long rhs) {
    return doIntegerDivideEquals((Object)lhs, new NgLong(rhs));
  }

  public Object doIntegerDivideEquals(final BigInteger lhs, final float rhs) {
    return doIntegerDivideEquals((Object)lhs, new NgFloat(rhs));
  }

  public Object doIntegerDivideEquals(final BigInteger lhs, final double rhs) {
    return doIntegerDivideEquals((Object)lhs, new NgDouble(rhs));
  }

  public Object doIntegerDivideEquals(final BigInteger lhs, final BigInteger rhs) {
    return doIntegerDivideEquals((Object)lhs, (Object)rhs);
  }

  public Object doIntegerDivideEquals(final BigInteger lhs, final BigDecimal rhs) {
    return doIntegerDivideEquals((Object)lhs, (Object)rhs);
  }

  public Object doIntegerDivideEquals(final BigDecimal lhs, final byte rhs) {
    return doIntegerDivideEquals((Object)lhs, new NgByte(rhs));
  }

  public Object doIntegerDivideEquals(final BigDecimal lhs, final char rhs) {
    return doIntegerDivideEquals((Object)lhs, new NgChar(rhs));
  }

  public Object doIntegerDivideEquals(final BigDecimal lhs, final short rhs) {
    return doIntegerDivideEquals((Object)lhs, new NgShort(rhs));
  }

  public Object doIntegerDivideEquals(final BigDecimal lhs, final int rhs) {
    return doIntegerDivideEquals((Object)lhs, new NgInt(rhs));
  }

  public Object doIntegerDivideEquals(final BigDecimal lhs, final long rhs) {
    return doIntegerDivideEquals((Object)lhs, new NgLong(rhs));
  }

  public Object doIntegerDivideEquals(final BigDecimal lhs, final float rhs) {
    return doIntegerDivideEquals((Object)lhs, new NgFloat(rhs));
  }

  public Object doIntegerDivideEquals(final BigDecimal lhs, final double rhs) {
    return doIntegerDivideEquals((Object)lhs, new NgDouble(rhs));
  }

  public Object doIntegerDivideEquals(final BigDecimal lhs, final BigInteger rhs) {
    return doIntegerDivideEquals((Object)lhs, (Object)rhs);
  }

  public Object doIntegerDivideEquals(final BigDecimal lhs, final BigDecimal rhs) {
    return doIntegerDivideEquals((Object)lhs, (Object)rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = new NgByte(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseIntegerDivideEquals(lhs, rhsObject);
  }

  public Object doIntegerDivideEquals(final Object lhs, final char rhs) {
  final Object rhsObject = new NgChar(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseIntegerDivideEquals(lhs, rhsObject);
  }

  public Object doIntegerDivideEquals(final Object lhs, final short rhs) {
  final Object rhsObject = new NgShort(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseIntegerDivideEquals(lhs, rhsObject);
  }

  public Object doIntegerDivideEquals(final Object lhs, final int rhs) {
  final Object rhsObject = new NgInt(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseIntegerDivideEquals(lhs, rhsObject);
  }

  public Object doIntegerDivideEquals(final Object lhs, final long rhs) {
  final Object rhsObject = new NgLong(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseIntegerDivideEquals(lhs, rhsObject);
  }

  public Object doIntegerDivideEquals(final Object lhs, final float rhs) {
  final Object rhsObject = new NgFloat(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseIntegerDivideEquals(lhs, rhsObject);
  }

  public Object doIntegerDivideEquals(final Object lhs, final double rhs) {
  final Object rhsObject = new NgDouble(rhs);
    
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
  final Object lhsObject = new NgByte(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivideEquals(lhsObject, rhs);
  }

  public Object doReverseIntegerDivideEquals(final char lhs, final Object rhs) {
  final Object lhsObject = new NgChar(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivideEquals(lhsObject, rhs);
  }

  public Object doReverseIntegerDivideEquals(final short lhs, final Object rhs) {
  final Object lhsObject = new NgShort(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivideEquals(lhsObject, rhs);
  }

  public Object doReverseIntegerDivideEquals(final int lhs, final Object rhs) {
  final Object lhsObject = new NgInt(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivideEquals(lhsObject, rhs);
  }

  public Object doReverseIntegerDivideEquals(final long lhs, final Object rhs) {
  final Object lhsObject = new NgLong(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivideEquals(lhsObject, rhs);
  }

  public Object doReverseIntegerDivideEquals(final float lhs, final Object rhs) {
  final Object lhsObject = new NgFloat(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivideEquals(lhsObject, rhs);
  }

  public Object doReverseIntegerDivideEquals(final double lhs, final Object rhs) {
  final Object lhsObject = new NgDouble(lhs);
    
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
    final Object result = this.instanceHandler.and(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAnd(lhs, rhs);
    } else {
      return result;
    }
  }
  
  public Object doReverseAnd(final Object lhs, final Object rhs) {
    return this.instanceHandler.reverseAnd(lhs, rhs);
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doAnd(final byte lhs, final byte rhs) {
    return doAnd(new NgByte(lhs), new NgByte(rhs));
  }

  public Object doAnd(final byte lhs, final char rhs) {
    return doAnd(new NgByte(lhs), new NgChar(rhs));
  }

  public Object doAnd(final byte lhs, final short rhs) {
    return doAnd(new NgByte(lhs), new NgShort(rhs));
  }

  public Object doAnd(final byte lhs, final int rhs) {
    return doAnd(new NgByte(lhs), new NgInt(rhs));
  }

  public Object doAnd(final byte lhs, final long rhs) {
    return doAnd(new NgByte(lhs), new NgLong(rhs));
  }

  public Object doAnd(final byte lhs, final BigInteger rhs) {
    return doAnd(new NgByte(lhs), (Object)rhs);
  }

  public Object doAnd(final char lhs, final byte rhs) {
    return doAnd(new NgChar(lhs), new NgByte(rhs));
  }

  public Object doAnd(final char lhs, final char rhs) {
    return doAnd(new NgChar(lhs), new NgChar(rhs));
  }

  public Object doAnd(final char lhs, final short rhs) {
    return doAnd(new NgChar(lhs), new NgShort(rhs));
  }

  public Object doAnd(final char lhs, final int rhs) {
    return doAnd(new NgChar(lhs), new NgInt(rhs));
  }

  public Object doAnd(final char lhs, final long rhs) {
    return doAnd(new NgChar(lhs), new NgLong(rhs));
  }

  public Object doAnd(final char lhs, final BigInteger rhs) {
    return doAnd(new NgChar(lhs), (Object)rhs);
  }

  public Object doAnd(final short lhs, final byte rhs) {
    return doAnd(new NgShort(lhs), new NgByte(rhs));
  }

  public Object doAnd(final short lhs, final char rhs) {
    return doAnd(new NgShort(lhs), new NgChar(rhs));
  }

  public Object doAnd(final short lhs, final short rhs) {
    return doAnd(new NgShort(lhs), new NgShort(rhs));
  }

  public Object doAnd(final short lhs, final int rhs) {
    return doAnd(new NgShort(lhs), new NgInt(rhs));
  }

  public Object doAnd(final short lhs, final long rhs) {
    return doAnd(new NgShort(lhs), new NgLong(rhs));
  }

  public Object doAnd(final short lhs, final BigInteger rhs) {
    return doAnd(new NgShort(lhs), (Object)rhs);
  }

  public Object doAnd(final int lhs, final byte rhs) {
    return doAnd(new NgInt(lhs), new NgByte(rhs));
  }

  public Object doAnd(final int lhs, final char rhs) {
    return doAnd(new NgInt(lhs), new NgChar(rhs));
  }

  public Object doAnd(final int lhs, final short rhs) {
    return doAnd(new NgInt(lhs), new NgShort(rhs));
  }

  public Object doAnd(final int lhs, final int rhs) {
    return doAnd(new NgInt(lhs), new NgInt(rhs));
  }

  public Object doAnd(final int lhs, final long rhs) {
    return doAnd(new NgInt(lhs), new NgLong(rhs));
  }

  public Object doAnd(final int lhs, final BigInteger rhs) {
    return doAnd(new NgInt(lhs), (Object)rhs);
  }

  public Object doAnd(final long lhs, final byte rhs) {
    return doAnd(new NgLong(lhs), new NgByte(rhs));
  }

  public Object doAnd(final long lhs, final char rhs) {
    return doAnd(new NgLong(lhs), new NgChar(rhs));
  }

  public Object doAnd(final long lhs, final short rhs) {
    return doAnd(new NgLong(lhs), new NgShort(rhs));
  }

  public Object doAnd(final long lhs, final int rhs) {
    return doAnd(new NgLong(lhs), new NgInt(rhs));
  }

  public Object doAnd(final long lhs, final long rhs) {
    return doAnd(new NgLong(lhs), new NgLong(rhs));
  }

  public Object doAnd(final long lhs, final BigInteger rhs) {
    return doAnd(new NgLong(lhs), (Object)rhs);
  }

  public Object doAnd(final BigInteger lhs, final byte rhs) {
    return doAnd((Object)lhs, new NgByte(rhs));
  }

  public Object doAnd(final BigInteger lhs, final char rhs) {
    return doAnd((Object)lhs, new NgChar(rhs));
  }

  public Object doAnd(final BigInteger lhs, final short rhs) {
    return doAnd((Object)lhs, new NgShort(rhs));
  }

  public Object doAnd(final BigInteger lhs, final int rhs) {
    return doAnd((Object)lhs, new NgInt(rhs));
  }

  public Object doAnd(final BigInteger lhs, final long rhs) {
    return doAnd((Object)lhs, new NgLong(rhs));
  }

  public Object doAnd(final BigInteger lhs, final BigInteger rhs) {
    return doAnd((Object)lhs, (Object)rhs);
  }

  public Object doAnd(final Object lhs, final byte rhs) {
  final Object rhsObject = new NgByte(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAnd(lhs, rhsObject);
  }

  public Object doAnd(final Object lhs, final char rhs) {
  final Object rhsObject = new NgChar(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAnd(lhs, rhsObject);
  }

  public Object doAnd(final Object lhs, final short rhs) {
  final Object rhsObject = new NgShort(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAnd(lhs, rhsObject);
  }

  public Object doAnd(final Object lhs, final int rhs) {
  final Object rhsObject = new NgInt(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAnd(lhs, rhsObject);
  }

  public Object doAnd(final Object lhs, final long rhs) {
  final Object rhsObject = new NgLong(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAnd(lhs, rhsObject);
  }

  public Object doAnd(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAnd(lhs, rhsObject);
  }

  public Object doReverseAnd(final byte lhs, final Object rhs) {
  final Object lhsObject = new NgByte(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAnd(lhsObject, rhs);
  }

  public Object doReverseAnd(final char lhs, final Object rhs) {
  final Object lhsObject = new NgChar(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAnd(lhsObject, rhs);
  }

  public Object doReverseAnd(final short lhs, final Object rhs) {
  final Object lhsObject = new NgShort(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAnd(lhsObject, rhs);
  }

  public Object doReverseAnd(final int lhs, final Object rhs) {
  final Object lhsObject = new NgInt(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAnd(lhsObject, rhs);
  }

  public Object doReverseAnd(final long lhs, final Object rhs) {
  final Object lhsObject = new NgLong(lhs);
    
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
    final Object result = this.instanceHandler.andEquals(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAndEquals(lhs, rhs);
    } else {
      return result;
    }
  }
  
  public Object doReverseAndEquals(final Object lhs, final Object rhs) {
    return this.instanceHandler.reverseAndEquals(lhs, rhs);
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doAndEquals(final byte lhs, final byte rhs) {
    return doAndEquals(new NgByte(lhs), new NgByte(rhs));
  }

  public Object doAndEquals(final byte lhs, final char rhs) {
    return doAndEquals(new NgByte(lhs), new NgChar(rhs));
  }

  public Object doAndEquals(final byte lhs, final short rhs) {
    return doAndEquals(new NgByte(lhs), new NgShort(rhs));
  }

  public Object doAndEquals(final byte lhs, final int rhs) {
    return doAndEquals(new NgByte(lhs), new NgInt(rhs));
  }

  public Object doAndEquals(final byte lhs, final long rhs) {
    return doAndEquals(new NgByte(lhs), new NgLong(rhs));
  }

  public Object doAndEquals(final byte lhs, final BigInteger rhs) {
    return doAndEquals(new NgByte(lhs), (Object)rhs);
  }

  public Object doAndEquals(final char lhs, final byte rhs) {
    return doAndEquals(new NgChar(lhs), new NgByte(rhs));
  }

  public Object doAndEquals(final char lhs, final char rhs) {
    return doAndEquals(new NgChar(lhs), new NgChar(rhs));
  }

  public Object doAndEquals(final char lhs, final short rhs) {
    return doAndEquals(new NgChar(lhs), new NgShort(rhs));
  }

  public Object doAndEquals(final char lhs, final int rhs) {
    return doAndEquals(new NgChar(lhs), new NgInt(rhs));
  }

  public Object doAndEquals(final char lhs, final long rhs) {
    return doAndEquals(new NgChar(lhs), new NgLong(rhs));
  }

  public Object doAndEquals(final char lhs, final BigInteger rhs) {
    return doAndEquals(new NgChar(lhs), (Object)rhs);
  }

  public Object doAndEquals(final short lhs, final byte rhs) {
    return doAndEquals(new NgShort(lhs), new NgByte(rhs));
  }

  public Object doAndEquals(final short lhs, final char rhs) {
    return doAndEquals(new NgShort(lhs), new NgChar(rhs));
  }

  public Object doAndEquals(final short lhs, final short rhs) {
    return doAndEquals(new NgShort(lhs), new NgShort(rhs));
  }

  public Object doAndEquals(final short lhs, final int rhs) {
    return doAndEquals(new NgShort(lhs), new NgInt(rhs));
  }

  public Object doAndEquals(final short lhs, final long rhs) {
    return doAndEquals(new NgShort(lhs), new NgLong(rhs));
  }

  public Object doAndEquals(final short lhs, final BigInteger rhs) {
    return doAndEquals(new NgShort(lhs), (Object)rhs);
  }

  public Object doAndEquals(final int lhs, final byte rhs) {
    return doAndEquals(new NgInt(lhs), new NgByte(rhs));
  }

  public Object doAndEquals(final int lhs, final char rhs) {
    return doAndEquals(new NgInt(lhs), new NgChar(rhs));
  }

  public Object doAndEquals(final int lhs, final short rhs) {
    return doAndEquals(new NgInt(lhs), new NgShort(rhs));
  }

  public Object doAndEquals(final int lhs, final int rhs) {
    return doAndEquals(new NgInt(lhs), new NgInt(rhs));
  }

  public Object doAndEquals(final int lhs, final long rhs) {
    return doAndEquals(new NgInt(lhs), new NgLong(rhs));
  }

  public Object doAndEquals(final int lhs, final BigInteger rhs) {
    return doAndEquals(new NgInt(lhs), (Object)rhs);
  }

  public Object doAndEquals(final long lhs, final byte rhs) {
    return doAndEquals(new NgLong(lhs), new NgByte(rhs));
  }

  public Object doAndEquals(final long lhs, final char rhs) {
    return doAndEquals(new NgLong(lhs), new NgChar(rhs));
  }

  public Object doAndEquals(final long lhs, final short rhs) {
    return doAndEquals(new NgLong(lhs), new NgShort(rhs));
  }

  public Object doAndEquals(final long lhs, final int rhs) {
    return doAndEquals(new NgLong(lhs), new NgInt(rhs));
  }

  public Object doAndEquals(final long lhs, final long rhs) {
    return doAndEquals(new NgLong(lhs), new NgLong(rhs));
  }

  public Object doAndEquals(final long lhs, final BigInteger rhs) {
    return doAndEquals(new NgLong(lhs), (Object)rhs);
  }

  public Object doAndEquals(final BigInteger lhs, final byte rhs) {
    return doAndEquals((Object)lhs, new NgByte(rhs));
  }

  public Object doAndEquals(final BigInteger lhs, final char rhs) {
    return doAndEquals((Object)lhs, new NgChar(rhs));
  }

  public Object doAndEquals(final BigInteger lhs, final short rhs) {
    return doAndEquals((Object)lhs, new NgShort(rhs));
  }

  public Object doAndEquals(final BigInteger lhs, final int rhs) {
    return doAndEquals((Object)lhs, new NgInt(rhs));
  }

  public Object doAndEquals(final BigInteger lhs, final long rhs) {
    return doAndEquals((Object)lhs, new NgLong(rhs));
  }

  public Object doAndEquals(final BigInteger lhs, final BigInteger rhs) {
    return doAndEquals((Object)lhs, (Object)rhs);
  }

  public Object doAndEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = new NgByte(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAndEquals(lhs, rhsObject);
  }

  public Object doAndEquals(final Object lhs, final char rhs) {
  final Object rhsObject = new NgChar(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAndEquals(lhs, rhsObject);
  }

  public Object doAndEquals(final Object lhs, final short rhs) {
  final Object rhsObject = new NgShort(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAndEquals(lhs, rhsObject);
  }

  public Object doAndEquals(final Object lhs, final int rhs) {
  final Object rhsObject = new NgInt(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAndEquals(lhs, rhsObject);
  }

  public Object doAndEquals(final Object lhs, final long rhs) {
  final Object rhsObject = new NgLong(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAndEquals(lhs, rhsObject);
  }

  public Object doAndEquals(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseAndEquals(lhs, rhsObject);
  }

  public Object doReverseAndEquals(final byte lhs, final Object rhs) {
  final Object lhsObject = new NgByte(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAndEquals(lhsObject, rhs);
  }

  public Object doReverseAndEquals(final char lhs, final Object rhs) {
  final Object lhsObject = new NgChar(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAndEquals(lhsObject, rhs);
  }

  public Object doReverseAndEquals(final short lhs, final Object rhs) {
  final Object lhsObject = new NgShort(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAndEquals(lhsObject, rhs);
  }

  public Object doReverseAndEquals(final int lhs, final Object rhs) {
  final Object lhsObject = new NgInt(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAndEquals(lhsObject, rhs);
  }

  public Object doReverseAndEquals(final long lhs, final Object rhs) {
  final Object lhsObject = new NgLong(lhs);
    
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
  final Object result = this.instanceHandler.or(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOr(lhs, rhs);
    } else {
      return result;
    }
  }
  
  public Object doReverseOr(final Object lhs, final Object rhs) {
    return this.instanceHandler.reverseOr(lhs, rhs);
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doOr(final byte lhs, final byte rhs) {
    return doOr(new NgByte(lhs), new NgByte(rhs));
  }

  public Object doOr(final byte lhs, final char rhs) {
    return doOr(new NgByte(lhs), new NgChar(rhs));
  }

  public Object doOr(final byte lhs, final short rhs) {
    return doOr(new NgByte(lhs), new NgShort(rhs));
  }

  public Object doOr(final byte lhs, final int rhs) {
    return doOr(new NgByte(lhs), new NgInt(rhs));
  }

  public Object doOr(final byte lhs, final long rhs) {
    return doOr(new NgByte(lhs), new NgLong(rhs));
  }

  public Object doOr(final byte lhs, final BigInteger rhs) {
    return doOr(new NgByte(lhs), (Object)rhs);
  }

  public Object doOr(final char lhs, final byte rhs) {
    return doOr(new NgChar(lhs), new NgByte(rhs));
  }

  public Object doOr(final char lhs, final char rhs) {
    return doOr(new NgChar(lhs), new NgChar(rhs));
  }

  public Object doOr(final char lhs, final short rhs) {
    return doOr(new NgChar(lhs), new NgShort(rhs));
  }

  public Object doOr(final char lhs, final int rhs) {
    return doOr(new NgChar(lhs), new NgInt(rhs));
  }

  public Object doOr(final char lhs, final long rhs) {
    return doOr(new NgChar(lhs), new NgLong(rhs));
  }

  public Object doOr(final char lhs, final BigInteger rhs) {
    return doOr(new NgChar(lhs), (Object)rhs);
  }

  public Object doOr(final short lhs, final byte rhs) {
    return doOr(new NgShort(lhs), new NgByte(rhs));
  }

  public Object doOr(final short lhs, final char rhs) {
    return doOr(new NgShort(lhs), new NgChar(rhs));
  }

  public Object doOr(final short lhs, final short rhs) {
    return doOr(new NgShort(lhs), new NgShort(rhs));
  }

  public Object doOr(final short lhs, final int rhs) {
    return doOr(new NgShort(lhs), new NgInt(rhs));
  }

  public Object doOr(final short lhs, final long rhs) {
    return doOr(new NgShort(lhs), new NgLong(rhs));
  }

  public Object doOr(final short lhs, final BigInteger rhs) {
    return doOr(new NgShort(lhs), (Object)rhs);
  }

  public Object doOr(final int lhs, final byte rhs) {
    return doOr(new NgInt(lhs), new NgByte(rhs));
  }

  public Object doOr(final int lhs, final char rhs) {
    return doOr(new NgInt(lhs), new NgChar(rhs));
  }

  public Object doOr(final int lhs, final short rhs) {
    return doOr(new NgInt(lhs), new NgShort(rhs));
  }

  public Object doOr(final int lhs, final int rhs) {
    return doOr(new NgInt(lhs), new NgInt(rhs));
  }

  public Object doOr(final int lhs, final long rhs) {
    return doOr(new NgInt(lhs), new NgLong(rhs));
  }

  public Object doOr(final int lhs, final BigInteger rhs) {
    return doOr(new NgInt(lhs), (Object)rhs);
  }

  public Object doOr(final long lhs, final byte rhs) {
    return doOr(new NgLong(lhs), new NgByte(rhs));
  }

  public Object doOr(final long lhs, final char rhs) {
    return doOr(new NgLong(lhs), new NgChar(rhs));
  }

  public Object doOr(final long lhs, final short rhs) {
    return doOr(new NgLong(lhs), new NgShort(rhs));
  }

  public Object doOr(final long lhs, final int rhs) {
    return doOr(new NgLong(lhs), new NgInt(rhs));
  }

  public Object doOr(final long lhs, final long rhs) {
    return doOr(new NgLong(lhs), new NgLong(rhs));
  }

  public Object doOr(final long lhs, final BigInteger rhs) {
    return doOr(new NgLong(lhs), (Object)rhs);
  }

  public Object doOr(final BigInteger lhs, final byte rhs) {
    return doOr((Object)lhs, new NgByte(rhs));
  }

  public Object doOr(final BigInteger lhs, final char rhs) {
    return doOr((Object)lhs, new NgChar(rhs));
  }

  public Object doOr(final BigInteger lhs, final short rhs) {
    return doOr((Object)lhs, new NgShort(rhs));
  }

  public Object doOr(final BigInteger lhs, final int rhs) {
    return doOr((Object)lhs, new NgInt(rhs));
  }

  public Object doOr(final BigInteger lhs, final long rhs) {
    return doOr((Object)lhs, new NgLong(rhs));
  }

  public Object doOr(final BigInteger lhs, final BigInteger rhs) {
    return doOr((Object)lhs, (Object)rhs);
  }

  public Object doOr(final Object lhs, final byte rhs) {
  final Object rhsObject = new NgByte(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseOr(lhs, rhsObject);
  }

  public Object doOr(final Object lhs, final char rhs) {
  final Object rhsObject = new NgChar(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseOr(lhs, rhsObject);
  }

  public Object doOr(final Object lhs, final short rhs) {
  final Object rhsObject = new NgShort(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseOr(lhs, rhsObject);
  }

  public Object doOr(final Object lhs, final int rhs) {
  final Object rhsObject = new NgInt(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseOr(lhs, rhsObject);
  }

  public Object doOr(final Object lhs, final long rhs) {
  final Object rhsObject = new NgLong(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseOr(lhs, rhsObject);
  }

  public Object doOr(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseOr(lhs, rhsObject);
  }

  public Object doReverseOr(final byte lhs, final Object rhs) {
  final Object lhsObject = new NgByte(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOr(lhsObject, rhs);
  }

  public Object doReverseOr(final char lhs, final Object rhs) {
  final Object lhsObject = new NgChar(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOr(lhsObject, rhs);
  }

  public Object doReverseOr(final short lhs, final Object rhs) {
  final Object lhsObject = new NgShort(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOr(lhsObject, rhs);
  }

  public Object doReverseOr(final int lhs, final Object rhs) {
  final Object lhsObject = new NgInt(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOr(lhsObject, rhs);
  }

  public Object doReverseOr(final long lhs, final Object rhs) {
  final Object lhsObject = new NgLong(lhs);
    
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
  final Object result = this.instanceHandler.orEquals(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOrEquals(lhs, rhs);
    } else {
      return result;
    }
  }
  
  public Object doReverseOrEquals(final Object lhs, final Object rhs) {
    return this.instanceHandler.reverseOrEquals(lhs, rhs);
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doOrEquals(final byte lhs, final byte rhs) {
    return doOrEquals(new NgByte(lhs), new NgByte(rhs));
  }

  public Object doOrEquals(final byte lhs, final char rhs) {
    return doOrEquals(new NgByte(lhs), new NgChar(rhs));
  }

  public Object doOrEquals(final byte lhs, final short rhs) {
    return doOrEquals(new NgByte(lhs), new NgShort(rhs));
  }

  public Object doOrEquals(final byte lhs, final int rhs) {
    return doOrEquals(new NgByte(lhs), new NgInt(rhs));
  }

  public Object doOrEquals(final byte lhs, final long rhs) {
    return doOrEquals(new NgByte(lhs), new NgLong(rhs));
  }

  public Object doOrEquals(final byte lhs, final BigInteger rhs) {
    return doOrEquals(new NgByte(lhs), (Object)rhs);
  }

  public Object doOrEquals(final char lhs, final byte rhs) {
    return doOrEquals(new NgChar(lhs), new NgByte(rhs));
  }

  public Object doOrEquals(final char lhs, final char rhs) {
    return doOrEquals(new NgChar(lhs), new NgChar(rhs));
  }

  public Object doOrEquals(final char lhs, final short rhs) {
    return doOrEquals(new NgChar(lhs), new NgShort(rhs));
  }

  public Object doOrEquals(final char lhs, final int rhs) {
    return doOrEquals(new NgChar(lhs), new NgInt(rhs));
  }

  public Object doOrEquals(final char lhs, final long rhs) {
    return doOrEquals(new NgChar(lhs), new NgLong(rhs));
  }

  public Object doOrEquals(final char lhs, final BigInteger rhs) {
    return doOrEquals(new NgChar(lhs), (Object)rhs);
  }

  public Object doOrEquals(final short lhs, final byte rhs) {
    return doOrEquals(new NgShort(lhs), new NgByte(rhs));
  }

  public Object doOrEquals(final short lhs, final char rhs) {
    return doOrEquals(new NgShort(lhs), new NgChar(rhs));
  }

  public Object doOrEquals(final short lhs, final short rhs) {
    return doOrEquals(new NgShort(lhs), new NgShort(rhs));
  }

  public Object doOrEquals(final short lhs, final int rhs) {
    return doOrEquals(new NgShort(lhs), new NgInt(rhs));
  }

  public Object doOrEquals(final short lhs, final long rhs) {
    return doOrEquals(new NgShort(lhs), new NgLong(rhs));
  }

  public Object doOrEquals(final short lhs, final BigInteger rhs) {
    return doOrEquals(new NgShort(lhs), (Object)rhs);
  }

  public Object doOrEquals(final int lhs, final byte rhs) {
    return doOrEquals(new NgInt(lhs), new NgByte(rhs));
  }

  public Object doOrEquals(final int lhs, final char rhs) {
    return doOrEquals(new NgInt(lhs), new NgChar(rhs));
  }

  public Object doOrEquals(final int lhs, final short rhs) {
    return doOrEquals(new NgInt(lhs), new NgShort(rhs));
  }

  public Object doOrEquals(final int lhs, final int rhs) {
    return doOrEquals(new NgInt(lhs), new NgInt(rhs));
  }

  public Object doOrEquals(final int lhs, final long rhs) {
    return doOrEquals(new NgInt(lhs), new NgLong(rhs));
  }

  public Object doOrEquals(final int lhs, final BigInteger rhs) {
    return doOrEquals(new NgInt(lhs), (Object)rhs);
  }

  public Object doOrEquals(final long lhs, final byte rhs) {
    return doOrEquals(new NgLong(lhs), new NgByte(rhs));
  }

  public Object doOrEquals(final long lhs, final char rhs) {
    return doOrEquals(new NgLong(lhs), new NgChar(rhs));
  }

  public Object doOrEquals(final long lhs, final short rhs) {
    return doOrEquals(new NgLong(lhs), new NgShort(rhs));
  }

  public Object doOrEquals(final long lhs, final int rhs) {
    return doOrEquals(new NgLong(lhs), new NgInt(rhs));
  }

  public Object doOrEquals(final long lhs, final long rhs) {
    return doOrEquals(new NgLong(lhs), new NgLong(rhs));
  }

  public Object doOrEquals(final long lhs, final BigInteger rhs) {
    return doOrEquals(new NgLong(lhs), (Object)rhs);
  }

  public Object doOrEquals(final BigInteger lhs, final byte rhs) {
    return doOrEquals((Object)lhs, new NgByte(rhs));
  }

  public Object doOrEquals(final BigInteger lhs, final char rhs) {
    return doOrEquals((Object)lhs, new NgChar(rhs));
  }

  public Object doOrEquals(final BigInteger lhs, final short rhs) {
    return doOrEquals((Object)lhs, new NgShort(rhs));
  }

  public Object doOrEquals(final BigInteger lhs, final int rhs) {
    return doOrEquals((Object)lhs, new NgInt(rhs));
  }

  public Object doOrEquals(final BigInteger lhs, final long rhs) {
    return doOrEquals((Object)lhs, new NgLong(rhs));
  }

  public Object doOrEquals(final BigInteger lhs, final BigInteger rhs) {
    return doOrEquals((Object)lhs, (Object)rhs);
  }

  public Object doOrEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = new NgByte(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseOrEquals(lhs, rhsObject);
  }

  public Object doOrEquals(final Object lhs, final char rhs) {
  final Object rhsObject = new NgChar(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseOrEquals(lhs, rhsObject);
  }

  public Object doOrEquals(final Object lhs, final short rhs) {
  final Object rhsObject = new NgShort(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseOrEquals(lhs, rhsObject);
  }

  public Object doOrEquals(final Object lhs, final int rhs) {
  final Object rhsObject = new NgInt(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseOrEquals(lhs, rhsObject);
  }

  public Object doOrEquals(final Object lhs, final long rhs) {
  final Object rhsObject = new NgLong(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseOrEquals(lhs, rhsObject);
  }

  public Object doOrEquals(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseOrEquals(lhs, rhsObject);
  }

  public Object doReverseOrEquals(final byte lhs, final Object rhs) {
  final Object lhsObject = new NgByte(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOrEquals(lhsObject, rhs);
  }

  public Object doReverseOrEquals(final char lhs, final Object rhs) {
  final Object lhsObject = new NgChar(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOrEquals(lhsObject, rhs);
  }

  public Object doReverseOrEquals(final short lhs, final Object rhs) {
  final Object lhsObject = new NgShort(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOrEquals(lhsObject, rhs);
  }

  public Object doReverseOrEquals(final int lhs, final Object rhs) {
  final Object lhsObject = new NgInt(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOrEquals(lhsObject, rhs);
  }

  public Object doReverseOrEquals(final long lhs, final Object rhs) {
  final Object lhsObject = new NgLong(lhs);
    
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
  final Object result = this.instanceHandler.xor(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXorEquals(lhs, rhs);
    } else {
      return result;
    }
  }
  
  public Object doReverseXor(final Object lhs, final Object rhs) {
    return this.instanceHandler.reverseXor(lhs, rhs);
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doXor(final byte lhs, final byte rhs) {
    return doXor(new NgByte(lhs), new NgByte(rhs));
  }

  public Object doXor(final byte lhs, final char rhs) {
    return doXor(new NgByte(lhs), new NgChar(rhs));
  }

  public Object doXor(final byte lhs, final short rhs) {
    return doXor(new NgByte(lhs), new NgShort(rhs));
  }

  public Object doXor(final byte lhs, final int rhs) {
    return doXor(new NgByte(lhs), new NgInt(rhs));
  }

  public Object doXor(final byte lhs, final long rhs) {
    return doXor(new NgByte(lhs), new NgLong(rhs));
  }

  public Object doXor(final byte lhs, final BigInteger rhs) {
    return doXor(new NgByte(lhs), (Object)rhs);
  }

  public Object doXor(final char lhs, final byte rhs) {
    return doXor(new NgChar(lhs), new NgByte(rhs));
  }

  public Object doXor(final char lhs, final char rhs) {
    return doXor(new NgChar(lhs), new NgChar(rhs));
  }

  public Object doXor(final char lhs, final short rhs) {
    return doXor(new NgChar(lhs), new NgShort(rhs));
  }

  public Object doXor(final char lhs, final int rhs) {
    return doXor(new NgChar(lhs), new NgInt(rhs));
  }

  public Object doXor(final char lhs, final long rhs) {
    return doXor(new NgChar(lhs), new NgLong(rhs));
  }

  public Object doXor(final char lhs, final BigInteger rhs) {
    return doXor(new NgChar(lhs), (Object)rhs);
  }

  public Object doXor(final short lhs, final byte rhs) {
    return doXor(new NgShort(lhs), new NgByte(rhs));
  }

  public Object doXor(final short lhs, final char rhs) {
    return doXor(new NgShort(lhs), new NgChar(rhs));
  }

  public Object doXor(final short lhs, final short rhs) {
    return doXor(new NgShort(lhs), new NgShort(rhs));
  }

  public Object doXor(final short lhs, final int rhs) {
    return doXor(new NgShort(lhs), new NgInt(rhs));
  }

  public Object doXor(final short lhs, final long rhs) {
    return doXor(new NgShort(lhs), new NgLong(rhs));
  }

  public Object doXor(final short lhs, final BigInteger rhs) {
    return doXor(new NgShort(lhs), (Object)rhs);
  }

  public Object doXor(final int lhs, final byte rhs) {
    return doXor(new NgInt(lhs), new NgByte(rhs));
  }

  public Object doXor(final int lhs, final char rhs) {
    return doXor(new NgInt(lhs), new NgChar(rhs));
  }

  public Object doXor(final int lhs, final short rhs) {
    return doXor(new NgInt(lhs), new NgShort(rhs));
  }

  public Object doXor(final int lhs, final int rhs) {
    return doXor(new NgInt(lhs), new NgInt(rhs));
  }

  public Object doXor(final int lhs, final long rhs) {
    return doXor(new NgInt(lhs), new NgLong(rhs));
  }

  public Object doXor(final int lhs, final BigInteger rhs) {
    return doXor(new NgInt(lhs), (Object)rhs);
  }

  public Object doXor(final long lhs, final byte rhs) {
    return doXor(new NgLong(lhs), new NgByte(rhs));
  }

  public Object doXor(final long lhs, final char rhs) {
    return doXor(new NgLong(lhs), new NgChar(rhs));
  }

  public Object doXor(final long lhs, final short rhs) {
    return doXor(new NgLong(lhs), new NgShort(rhs));
  }

  public Object doXor(final long lhs, final int rhs) {
    return doXor(new NgLong(lhs), new NgInt(rhs));
  }

  public Object doXor(final long lhs, final long rhs) {
    return doXor(new NgLong(lhs), new NgLong(rhs));
  }

  public Object doXor(final long lhs, final BigInteger rhs) {
    return doXor(new NgLong(lhs), (Object)rhs);
  }

  public Object doXor(final BigInteger lhs, final byte rhs) {
    return doXor((Object)lhs, new NgByte(rhs));
  }

  public Object doXor(final BigInteger lhs, final char rhs) {
    return doXor((Object)lhs, new NgChar(rhs));
  }

  public Object doXor(final BigInteger lhs, final short rhs) {
    return doXor((Object)lhs, new NgShort(rhs));
  }

  public Object doXor(final BigInteger lhs, final int rhs) {
    return doXor((Object)lhs, new NgInt(rhs));
  }

  public Object doXor(final BigInteger lhs, final long rhs) {
    return doXor((Object)lhs, new NgLong(rhs));
  }

  public Object doXor(final BigInteger lhs, final BigInteger rhs) {
    return doXor((Object)lhs, (Object)rhs);
  }

  public Object doXor(final Object lhs, final byte rhs) {
  final Object rhsObject = new NgByte(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseXor(lhs, rhsObject);
  }

  public Object doXor(final Object lhs, final char rhs) {
  final Object rhsObject = new NgChar(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseXor(lhs, rhsObject);
  }

  public Object doXor(final Object lhs, final short rhs) {
  final Object rhsObject = new NgShort(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseXor(lhs, rhsObject);
  }

  public Object doXor(final Object lhs, final int rhs) {
  final Object rhsObject = new NgInt(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseXor(lhs, rhsObject);
  }

  public Object doXor(final Object lhs, final long rhs) {
  final Object rhsObject = new NgLong(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseXor(lhs, rhsObject);
  }

  public Object doXor(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseXor(lhs, rhsObject);
  }


  public Object doReverseXor(final byte lhs, final Object rhs) {
  final Object lhsObject = new NgByte(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXor(lhsObject, rhs);
  }

  public Object doReverseXor(final char lhs, final Object rhs) {
  final Object lhsObject = new NgChar(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXor(lhsObject, rhs);
  }

  public Object doReverseXor(final short lhs, final Object rhs) {
  final Object lhsObject = new NgShort(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXor(lhsObject, rhs);
  }

  public Object doReverseXor(final int lhs, final Object rhs) {
  final Object lhsObject = new NgInt(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXor(lhsObject, rhs);
  }

  public Object doReverseXor(final long lhs, final Object rhs) {
  final Object lhsObject = new NgLong(lhs);
    
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
  final Object result = this.instanceHandler.xorEquals(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXorEquals(lhs, rhs);
    } else {
      return result;
    }
  }
  
  public Object doReverseXorEquals(final Object lhs, final Object rhs) {
    return this.instanceHandler.reverseXorEquals(lhs, rhs);
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doXorEquals(final byte lhs, final byte rhs) {
    return doXorEquals(new NgByte(lhs), new NgByte(rhs));
  }

  public Object doXorEquals(final byte lhs, final char rhs) {
    return doXorEquals(new NgByte(lhs), new NgChar(rhs));
  }

  public Object doXorEquals(final byte lhs, final short rhs) {
    return doXorEquals(new NgByte(lhs), new NgShort(rhs));
  }

  public Object doXorEquals(final byte lhs, final int rhs) {
    return doXorEquals(new NgByte(lhs), new NgInt(rhs));
  }

  public Object doXorEquals(final byte lhs, final long rhs) {
    return doXorEquals(new NgByte(lhs), new NgLong(rhs));
  }

  public Object doXorEquals(final byte lhs, final BigInteger rhs) {
    return doXorEquals(new NgByte(lhs), (Object)rhs);
  }

  public Object doXorEquals(final char lhs, final byte rhs) {
    return doXorEquals(new NgChar(lhs), new NgByte(rhs));
  }

  public Object doXorEquals(final char lhs, final char rhs) {
    return doXorEquals(new NgChar(lhs), new NgChar(rhs));
  }

  public Object doXorEquals(final char lhs, final short rhs) {
    return doXorEquals(new NgChar(lhs), new NgShort(rhs));
  }

  public Object doXorEquals(final char lhs, final int rhs) {
    return doXorEquals(new NgChar(lhs), new NgInt(rhs));
  }

  public Object doXorEquals(final char lhs, final long rhs) {
    return doXorEquals(new NgChar(lhs), new NgLong(rhs));
  }

  public Object doXorEquals(final char lhs, final BigInteger rhs) {
    return doXorEquals(new NgChar(lhs), (Object)rhs);
  }

  public Object doXorEquals(final short lhs, final byte rhs) {
    return doXorEquals(new NgShort(lhs), new NgByte(rhs));
  }

  public Object doXorEquals(final short lhs, final char rhs) {
    return doXorEquals(new NgShort(lhs), new NgChar(rhs));
  }

  public Object doXorEquals(final short lhs, final short rhs) {
    return doXorEquals(new NgShort(lhs), new NgShort(rhs));
  }

  public Object doXorEquals(final short lhs, final int rhs) {
    return doXorEquals(new NgShort(lhs), new NgInt(rhs));
  }

  public Object doXorEquals(final short lhs, final long rhs) {
    return doXorEquals(new NgShort(lhs), new NgLong(rhs));
  }

  public Object doXorEquals(final short lhs, final BigInteger rhs) {
    return doXorEquals(new NgShort(lhs), (Object)rhs);
  }

  public Object doXorEquals(final int lhs, final byte rhs) {
    return doXorEquals(new NgInt(lhs), new NgByte(rhs));
  }

  public Object doXorEquals(final int lhs, final char rhs) {
    return doXorEquals(new NgInt(lhs), new NgChar(rhs));
  }

  public Object doXorEquals(final int lhs, final short rhs) {
    return doXorEquals(new NgInt(lhs), new NgShort(rhs));
  }

  public Object doXorEquals(final int lhs, final int rhs) {
    return doXorEquals(new NgInt(lhs), new NgInt(rhs));
  }

  public Object doXorEquals(final int lhs, final long rhs) {
    return doXorEquals(new NgInt(lhs), new NgLong(rhs));
  }

  public Object doXorEquals(final int lhs, final BigInteger rhs) {
    return doXorEquals(new NgInt(lhs), (Object)rhs);
  }

  public Object doXorEquals(final long lhs, final byte rhs) {
    return doXorEquals(new NgLong(lhs), new NgByte(rhs));
  }

  public Object doXorEquals(final long lhs, final char rhs) {
    return doXorEquals(new NgLong(lhs), new NgChar(rhs));
  }

  public Object doXorEquals(final long lhs, final short rhs) {
    return doXorEquals(new NgLong(lhs), new NgShort(rhs));
  }

  public Object doXorEquals(final long lhs, final int rhs) {
    return doXorEquals(new NgLong(lhs), new NgInt(rhs));
  }

  public Object doXorEquals(final long lhs, final long rhs) {
    return doXorEquals(new NgLong(lhs), new NgLong(rhs));
  }

  public Object doXorEquals(final long lhs, final BigInteger rhs) {
    return doXorEquals(new NgLong(lhs), (Object)rhs);
  }

  public Object doXorEquals(final BigInteger lhs, final byte rhs) {
    return doXorEquals((Object)lhs, new NgByte(rhs));
  }

  public Object doXorEquals(final BigInteger lhs, final char rhs) {
    return doXorEquals((Object)lhs, new NgChar(rhs));
  }

  public Object doXorEquals(final BigInteger lhs, final short rhs) {
    return doXorEquals((Object)lhs, new NgShort(rhs));
  }

  public Object doXorEquals(final BigInteger lhs, final int rhs) {
    return doXorEquals((Object)lhs, new NgInt(rhs));
  }

  public Object doXorEquals(final BigInteger lhs, final long rhs) {
    return doXorEquals((Object)lhs, new NgLong(rhs));
  }

  public Object doXorEquals(final BigInteger lhs, final BigInteger rhs) {
    return doXorEquals((Object)lhs, (Object)rhs);
  }

  public Object doXorEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = new NgByte(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseXorEquals(lhs, rhsObject);
  }

  public Object doXorEquals(final Object lhs, final char rhs) {
  final Object rhsObject = new NgChar(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseXorEquals(lhs, rhsObject);
  }

  public Object doXorEquals(final Object lhs, final short rhs) {
  final Object rhsObject = new NgShort(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseXorEquals(lhs, rhsObject);
  }

  public Object doXorEquals(final Object lhs, final int rhs) {
  final Object rhsObject = new NgInt(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseXorEquals(lhs, rhsObject);
  }

  public Object doXorEquals(final Object lhs, final long rhs) {
  final Object rhsObject = new NgLong(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseXorEquals(lhs, rhsObject);
  }
 
  public Object doXorEquals(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseXorEquals(lhs, rhsObject);
  }

  public Object doReverseXorEquals(final byte lhs, final Object rhs) {
  final Object lhsObject = new NgByte(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXorEquals(lhsObject, rhs);
  }

  public Object doReverseXorEquals(final char lhs, final Object rhs) {
  final Object lhsObject = new NgChar(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXorEquals(lhsObject, rhs);
  }

  public Object doReverseXorEquals(final short lhs, final Object rhs) {
  final Object lhsObject = new NgShort(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXorEquals(lhsObject, rhs);
  }

  public Object doReverseXorEquals(final int lhs, final Object rhs) {
  final Object lhsObject = new NgInt(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXorEquals(lhsObject, rhs);
  }

  public Object doReverseXorEquals(final long lhs, final Object rhs) {
  final Object lhsObject = new NgLong(lhs);
    
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
  final Object result = this.instanceHandler.leftShift(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShift(lhs, rhs);
    } else {
      return result;
    }
  }
  
  public Object doReverseLeftShift(final Object lhs, final Object rhs) {
    return this.instanceHandler.reverseLeftShift(lhs, rhs);
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doLeftShift(final byte lhs, final byte rhs) {
    return doLeftShift(new NgByte(lhs), new NgByte(rhs));
  }

  public Object doLeftShift(final byte lhs, final char rhs) {
    return doLeftShift(new NgByte(lhs), new NgChar(rhs));
  }

  public Object doLeftShift(final byte lhs, final short rhs) {
    return doLeftShift(new NgByte(lhs), new NgShort(rhs));
  }

  public Object doLeftShift(final byte lhs, final int rhs) {
    return doLeftShift(new NgByte(lhs), new NgInt(rhs));
  }

  public Object doLeftShift(final byte lhs, final long rhs) {
    return doLeftShift(new NgByte(lhs), new NgLong(rhs));
  }

  public Object doLeftShift(final byte lhs, final BigInteger rhs) {
    return doLeftShift(new NgByte(lhs), (Object)rhs);
  }

  public Object doLeftShift(final char lhs, final byte rhs) {
    return doLeftShift(new NgChar(lhs), new NgByte(rhs));
  }

  public Object doLeftShift(final char lhs, final char rhs) {
    return doLeftShift(new NgChar(lhs), new NgChar(rhs));
  }

  public Object doLeftShift(final char lhs, final short rhs) {
    return doLeftShift(new NgChar(lhs), new NgShort(rhs));
  }

  public Object doLeftShift(final char lhs, final int rhs) {
    return doLeftShift(new NgChar(lhs), new NgInt(rhs));
  }

  public Object doLeftShift(final char lhs, final long rhs) {
    return doLeftShift(new NgChar(lhs), new NgLong(rhs));
  }

  public Object doLeftShift(final char lhs, final BigInteger rhs) {
    return doLeftShift(new NgChar(lhs), (Object)rhs);
  }

  public Object doLeftShift(final short lhs, final byte rhs) {
    return doLeftShift(new NgShort(lhs), new NgByte(rhs));
  }

  public Object doLeftShift(final short lhs, final char rhs) {
    return doLeftShift(new NgShort(lhs), new NgChar(rhs));
  }

  public Object doLeftShift(final short lhs, final short rhs) {
    return doLeftShift(new NgShort(lhs), new NgShort(rhs));
  }

  public Object doLeftShift(final short lhs, final int rhs) {
    return doLeftShift(new NgShort(lhs), new NgInt(rhs));
  }

  public Object doLeftShift(final short lhs, final long rhs) {
    return doLeftShift(new NgShort(lhs), new NgLong(rhs));
  }

  public Object doLeftShift(final short lhs, final BigInteger rhs) {
    return doLeftShift(new NgShort(lhs), (Object)rhs);
  }

  public Object doLeftShift(final int lhs, final byte rhs) {
    return doLeftShift(new NgInt(lhs), new NgByte(rhs));
  }

  public Object doLeftShift(final int lhs, final char rhs) {
    return doLeftShift(new NgInt(lhs), new NgChar(rhs));
  }

  public Object doLeftShift(final int lhs, final short rhs) {
    return doLeftShift(new NgInt(lhs), new NgShort(rhs));
  }

  public Object doLeftShift(final int lhs, final int rhs) {
    return doLeftShift(new NgInt(lhs), new NgInt(rhs));
  }

  public Object doLeftShift(final int lhs, final long rhs) {
    return doLeftShift(new NgInt(lhs), new NgLong(rhs));
  }

  public Object doLeftShift(final int lhs, final BigInteger rhs) {
    return doLeftShift(new NgInt(lhs), (Object)rhs);
  }

  public Object doLeftShift(final long lhs, final byte rhs) {
    return doLeftShift(new NgLong(lhs), new NgByte(rhs));
  }

  public Object doLeftShift(final long lhs, final char rhs) {
    return doLeftShift(new NgLong(lhs), new NgChar(rhs));
  }

  public Object doLeftShift(final long lhs, final short rhs) {
    return doLeftShift(new NgLong(lhs), new NgShort(rhs));
  }

  public Object doLeftShift(final long lhs, final int rhs) {
    return doLeftShift(new NgLong(lhs), new NgInt(rhs));
  }

  public Object doLeftShift(final long lhs, final long rhs) {
    return doLeftShift(new NgLong(lhs), new NgLong(rhs));
  }

  public Object doLeftShift(final long lhs, final BigInteger rhs) {
    return doLeftShift(new NgLong(lhs), (Object)rhs);
  }

  public Object doLeftShift(final BigInteger lhs, final byte rhs) {
    return doLeftShift((Object)lhs, new NgByte(rhs));
  }

  public Object doLeftShift(final BigInteger lhs, final char rhs) {
    return doLeftShift((Object)lhs, new NgChar(rhs));
  }

  public Object doLeftShift(final BigInteger lhs, final short rhs) {
    return doLeftShift((Object)lhs, new NgShort(rhs));
  }

  public Object doLeftShift(final BigInteger lhs, final int rhs) {
    return doLeftShift((Object)lhs, new NgInt(rhs));
  }

  public Object doLeftShift(final BigInteger lhs, final long rhs) {
    return doLeftShift((Object)lhs, new NgLong(rhs));
  }

  public Object doLeftShift(final BigInteger lhs, final BigInteger rhs) {
    return doLeftShift((Object)lhs, (Object)rhs);
  }

  public Object doLeftShift(final Object lhs, final byte rhs) {
  final Object rhsObject = new NgByte(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLeftShift(lhs, rhsObject);
  }

  public Object doLeftShift(final Object lhs, final char rhs) {
  final Object rhsObject = new NgChar(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLeftShift(lhs, rhsObject);
  }

  public Object doLeftShift(final Object lhs, final short rhs) {
  final Object rhsObject = new NgShort(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLeftShift(lhs, rhsObject);
  }

  public Object doLeftShift(final Object lhs, final int rhs) {
  final Object rhsObject = new NgInt(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLeftShift(lhs, rhsObject);
  }

  public Object doLeftShift(final Object lhs, final long rhs) {
  final Object rhsObject = new NgLong(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLeftShift(lhs, rhsObject);
  }

  public Object doLeftShift(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLeftShift(lhs, rhsObject);
  }

  public Object doReverseLeftShift(final byte lhs, final Object rhs) {
  final Object lhsObject = new NgByte(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShift(lhsObject, rhs);
  }

  public Object doReverseLeftShift(final char lhs, final Object rhs) {
  final Object lhsObject = new NgChar(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShift(lhsObject, rhs);
  }

  public Object doReverseLeftShift(final short lhs, final Object rhs) {
  final Object lhsObject = new NgShort(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShift(lhsObject, rhs);
  }

  public Object doReverseLeftShift(final int lhs, final Object rhs) {
  final Object lhsObject = new NgInt(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShift(lhsObject, rhs);
  }

  public Object doReverseLeftShift(final long lhs, final Object rhs) {
  final Object lhsObject = new NgLong(lhs);
    
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
  final Object result = this.instanceHandler.leftShiftEquals(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShiftEquals(lhs, rhs);
    } else {
      return result;
    }
  }
  
  public Object doReverseLeftShiftEquals(final Object lhs, final Object rhs) {
    return this.instanceHandler.reverseLeftShiftEquals(lhs, rhs);
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doLeftShiftEquals(final byte lhs, final byte rhs) {
    return doLeftShiftEquals(new NgByte(lhs), new NgByte(rhs));
  }

  public Object doLeftShiftEquals(final byte lhs, final char rhs) {
    return doLeftShiftEquals(new NgByte(lhs), new NgChar(rhs));
  }

  public Object doLeftShiftEquals(final byte lhs, final short rhs) {
    return doLeftShiftEquals(new NgByte(lhs), new NgShort(rhs));
  }

  public Object doLeftShiftEquals(final byte lhs, final int rhs) {
    return doLeftShiftEquals(new NgByte(lhs), new NgInt(rhs));
  }

  public Object doLeftShiftEquals(final byte lhs, final long rhs) {
    return doLeftShiftEquals(new NgByte(lhs), new NgLong(rhs));
  }

  public Object doLeftShiftEquals(final byte lhs, final BigInteger rhs) {
    return doLeftShiftEquals(new NgByte(lhs), (Object)rhs);
  }

  public Object doLeftShiftEquals(final char lhs, final byte rhs) {
    return doLeftShiftEquals(new NgChar(lhs), new NgByte(rhs));
  }

  public Object doLeftShiftEquals(final char lhs, final char rhs) {
    return doLeftShiftEquals(new NgChar(lhs), new NgChar(rhs));
  }

  public Object doLeftShiftEquals(final char lhs, final short rhs) {
    return doLeftShiftEquals(new NgChar(lhs), new NgShort(rhs));
  }

  public Object doLeftShiftEquals(final char lhs, final int rhs) {
    return doLeftShiftEquals(new NgChar(lhs), new NgInt(rhs));
  }

  public Object doLeftShiftEquals(final char lhs, final long rhs) {
    return doLeftShiftEquals(new NgChar(lhs), new NgLong(rhs));
  }

  public Object doLeftShiftEquals(final char lhs, final BigInteger rhs) {
    return doLeftShiftEquals(new NgChar(lhs), (Object)rhs);
  }

  public Object doLeftShiftEquals(final short lhs, final byte rhs) {
    return doLeftShiftEquals(new NgShort(lhs), new NgByte(rhs));
  }

  public Object doLeftShiftEquals(final short lhs, final char rhs) {
    return doLeftShiftEquals(new NgShort(lhs), new NgChar(rhs));
  }

  public Object doLeftShiftEquals(final short lhs, final short rhs) {
    return doLeftShiftEquals(new NgShort(lhs), new NgShort(rhs));
  }

  public Object doLeftShiftEquals(final short lhs, final int rhs) {
    return doLeftShiftEquals(new NgShort(lhs), new NgInt(rhs));
  }

  public Object doLeftShiftEquals(final short lhs, final long rhs) {
    return doLeftShiftEquals(new NgShort(lhs), new NgLong(rhs));
  }

  public Object doLeftShiftEquals(final short lhs, final BigInteger rhs) {
    return doLeftShiftEquals(new NgShort(lhs), (Object)rhs);
  }

  public Object doLeftShiftEquals(final int lhs, final byte rhs) {
    return doLeftShiftEquals(new NgInt(lhs), new NgByte(rhs));
  }

  public Object doLeftShiftEquals(final int lhs, final char rhs) {
    return doLeftShiftEquals(new NgInt(lhs), new NgChar(rhs));
  }

  public Object doLeftShiftEquals(final int lhs, final short rhs) {
    return doLeftShiftEquals(new NgInt(lhs), new NgShort(rhs));
  }

  public Object doLeftShiftEquals(final int lhs, final int rhs) {
    return doLeftShiftEquals(new NgInt(lhs), new NgInt(rhs));
  }

  public Object doLeftShiftEquals(final int lhs, final long rhs) {
    return doLeftShiftEquals(new NgInt(lhs), new NgLong(rhs));
  }

  public Object doLeftShiftEquals(final int lhs, final BigInteger rhs) {
    return doLeftShiftEquals(new NgInt(lhs), (Object)rhs);
  }

  public Object doLeftShiftEquals(final long lhs, final byte rhs) {
    return doLeftShiftEquals(new NgLong(lhs), new NgByte(rhs));
  }

  public Object doLeftShiftEquals(final long lhs, final char rhs) {
    return doLeftShiftEquals(new NgLong(lhs), new NgChar(rhs));
  }

  public Object doLeftShiftEquals(final long lhs, final short rhs) {
    return doLeftShiftEquals(new NgLong(lhs), new NgShort(rhs));
  }

  public Object doLeftShiftEquals(final long lhs, final int rhs) {
    return doLeftShiftEquals(new NgLong(lhs), new NgInt(rhs));
  }

  public Object doLeftShiftEquals(final long lhs, final long rhs) {
    return doLeftShiftEquals(new NgLong(lhs), new NgLong(rhs));
  }

  public Object doLeftShiftEquals(final long lhs, final BigInteger rhs) {
    return doLeftShiftEquals(new NgLong(lhs), (Object)rhs);
  }

  public Object doLeftShiftEquals(final BigInteger lhs, final byte rhs) {
    return doLeftShiftEquals((Object)lhs, new NgByte(rhs));
  }

  public Object doLeftShiftEquals(final BigInteger lhs, final char rhs) {
    return doLeftShiftEquals((Object)lhs, new NgChar(rhs));
  }

  public Object doLeftShiftEquals(final BigInteger lhs, final short rhs) {
    return doLeftShiftEquals((Object)lhs, new NgShort(rhs));
  }

  public Object doLeftShiftEquals(final BigInteger lhs, final int rhs) {
    return doLeftShiftEquals((Object)lhs, new NgInt(rhs));
  }

  public Object doLeftShiftEquals(final BigInteger lhs, final long rhs) {
    return doLeftShiftEquals((Object)lhs, new NgLong(rhs));
  }

  public Object doLeftShiftEquals(final BigInteger lhs, final BigInteger rhs) {
    return doLeftShiftEquals((Object)lhs, (Object)rhs);
  }

  public Object doLeftShiftEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = new NgByte(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLeftShiftEquals(lhs, rhsObject);
  }

  public Object doLeftShiftEquals(final Object lhs, final char rhs) {
  final Object rhsObject = new NgChar(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLeftShiftEquals(lhs, rhsObject);
  }

  public Object doLeftShiftEquals(final Object lhs, final short rhs) {
  final Object rhsObject = new NgShort(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLeftShiftEquals(lhs, rhsObject);
  }

  public Object doLeftShiftEquals(final Object lhs, final int rhs) {
  final Object rhsObject = new NgInt(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLeftShiftEquals(lhs, rhsObject);
  }

  public Object doLeftShiftEquals(final Object lhs, final long rhs) {
  final Object rhsObject = new NgLong(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLeftShiftEquals(lhs, rhsObject);
  }

  public Object doLeftShiftEquals(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLeftShiftEquals(lhs, rhsObject);
  }

  public Object doReverseLeftShiftEquals(final byte lhs, final Object rhs) {
  final Object lhsObject = new NgByte(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShiftEquals(lhsObject, rhs);
  }

  public Object doReverseLeftShiftEquals(final char lhs, final Object rhs) {
  final Object lhsObject = new NgChar(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShiftEquals(lhsObject, rhs);
  }

  public Object doReverseLeftShiftEquals(final short lhs, final Object rhs) {
  final Object lhsObject = new NgShort(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShiftEquals(lhsObject, rhs);
  }

  public Object doReverseLeftShiftEquals(final int lhs, final Object rhs) {
  final Object lhsObject = new NgInt(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShiftEquals(lhsObject, rhs);
  }

  public Object doReverseLeftShiftEquals(final long lhs, final Object rhs) {
  final Object lhsObject = new NgLong(lhs);
    
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
  final Object result = this.instanceHandler.arithmeticRightShift(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShift(lhs, rhs);
    } else {
      return result;
    }
  }
  
  public Object doReverseArithmeticRightShift(final Object lhs, final Object rhs) {
    return this.instanceHandler.reverseArithmeticRightShift(lhs, rhs);
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doArithmeticRightShift(final byte lhs, final byte rhs) {
    return doArithmeticRightShift(new NgByte(lhs), new NgByte(rhs));
  }

  public Object doArithmeticRightShift(final byte lhs, final char rhs) {
    return doArithmeticRightShift(new NgByte(lhs), new NgChar(rhs));
  }

  public Object doArithmeticRightShift(final byte lhs, final short rhs) {
    return doArithmeticRightShift(new NgByte(lhs), new NgShort(rhs));
  }

  public Object doArithmeticRightShift(final byte lhs, final int rhs) {
    return doArithmeticRightShift(new NgByte(lhs), new NgInt(rhs));
  }

  public Object doArithmeticRightShift(final byte lhs, final long rhs) {
    return doArithmeticRightShift(new NgByte(lhs), new NgLong(rhs));
  }

  public Object doArithmeticRightShift(final byte lhs, final BigInteger rhs) {
    return doArithmeticRightShift(new NgByte(lhs), (Object)rhs);
  }

  public Object doArithmeticRightShift(final char lhs, final byte rhs) {
    return doArithmeticRightShift(new NgChar(lhs), new NgByte(rhs));
  }

  public Object doArithmeticRightShift(final char lhs, final char rhs) {
    return doArithmeticRightShift(new NgChar(lhs), new NgChar(rhs));
  }

  public Object doArithmeticRightShift(final char lhs, final short rhs) {
    return doArithmeticRightShift(new NgChar(lhs), new NgShort(rhs));
  }

  public Object doArithmeticRightShift(final char lhs, final int rhs) {
    return doArithmeticRightShift(new NgChar(lhs), new NgInt(rhs));
  }

  public Object doArithmeticRightShift(final char lhs, final long rhs) {
    return doArithmeticRightShift(new NgChar(lhs), new NgLong(rhs));
  }

  public Object doArithmeticRightShift(final char lhs, final BigInteger rhs) {
    return doArithmeticRightShift(new NgChar(lhs), (Object)rhs);
  }

  public Object doArithmeticRightShift(final short lhs, final byte rhs) {
    return doArithmeticRightShift(new NgShort(lhs), new NgByte(rhs));
  }

  public Object doArithmeticRightShift(final short lhs, final char rhs) {
    return doArithmeticRightShift(new NgShort(lhs), new NgChar(rhs));
  }

  public Object doArithmeticRightShift(final short lhs, final short rhs) {
    return doArithmeticRightShift(new NgShort(lhs), new NgShort(rhs));
  }

  public Object doArithmeticRightShift(final short lhs, final int rhs) {
    return doArithmeticRightShift(new NgShort(lhs), new NgInt(rhs));
  }

  public Object doArithmeticRightShift(final short lhs, final long rhs) {
    return doArithmeticRightShift(new NgShort(lhs), new NgLong(rhs));
  }

  public Object doArithmeticRightShift(final short lhs, final BigInteger rhs) {
    return doArithmeticRightShift(new NgShort(lhs), (Object)rhs);
  }

  public Object doArithmeticRightShift(final int lhs, final byte rhs) {
    return doArithmeticRightShift(new NgInt(lhs), new NgByte(rhs));
  }

  public Object doArithmeticRightShift(final int lhs, final char rhs) {
    return doArithmeticRightShift(new NgInt(lhs), new NgChar(rhs));
  }

  public Object doArithmeticRightShift(final int lhs, final short rhs) {
    return doArithmeticRightShift(new NgInt(lhs), new NgShort(rhs));
  }

  public Object doArithmeticRightShift(final int lhs, final int rhs) {
    return doArithmeticRightShift(new NgInt(lhs), new NgInt(rhs));
  }

  public Object doArithmeticRightShift(final int lhs, final long rhs) {
    return doArithmeticRightShift(new NgInt(lhs), new NgLong(rhs));
  }

  public Object doArithmeticRightShift(final int lhs, final BigInteger rhs) {
    return doArithmeticRightShift(new NgInt(lhs), (Object)rhs);
  }

  public Object doArithmeticRightShift(final long lhs, final byte rhs) {
    return doArithmeticRightShift(new NgLong(lhs), new NgByte(rhs));
  }

  public Object doArithmeticRightShift(final long lhs, final char rhs) {
    return doArithmeticRightShift(new NgLong(lhs), new NgChar(rhs));
  }

  public Object doArithmeticRightShift(final long lhs, final short rhs) {
    return doArithmeticRightShift(new NgLong(lhs), new NgShort(rhs));
  }

  public Object doArithmeticRightShift(final long lhs, final int rhs) {
    return doArithmeticRightShift(new NgLong(lhs), new NgInt(rhs));
  }

  public Object doArithmeticRightShift(final long lhs, final long rhs) {
    return doArithmeticRightShift(new NgLong(lhs), new NgLong(rhs));
  }

  public Object doArithmeticRightShift(final long lhs, final BigInteger rhs) {
    return doArithmeticRightShift(new NgLong(lhs), (Object)rhs);
  }

  public Object doArithmeticRightShift(final BigInteger lhs, final byte rhs) {
    return doArithmeticRightShift((Object)lhs, new NgByte(rhs));
  }

  public Object doArithmeticRightShift(final BigInteger lhs, final char rhs) {
    return doArithmeticRightShift((Object)lhs, new NgChar(rhs));
  }

  public Object doArithmeticRightShift(final BigInteger lhs, final short rhs) {
    return doArithmeticRightShift((Object)lhs, new NgShort(rhs));
  }

  public Object doArithmeticRightShift(final BigInteger lhs, final int rhs) {
    return doArithmeticRightShift((Object)lhs, new NgInt(rhs));
  }

  public Object doArithmeticRightShift(final BigInteger lhs, final long rhs) {
    return doArithmeticRightShift((Object)lhs, new NgLong(rhs));
  }

  public Object doArithmeticRightShift(final BigInteger lhs, final BigInteger rhs) {
    return doArithmeticRightShift((Object)lhs, (Object)rhs);
  }

  public Object doArithmeticRightShift(final Object lhs, final byte rhs) {
  final Object rhsObject = new NgByte(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseArithmeticRightShift(lhs, rhsObject);
  }

  public Object doArithmeticRightShift(final Object lhs, final char rhs) {
  final Object rhsObject = new NgChar(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseArithmeticRightShift(lhs, rhsObject);
  }

  public Object doArithmeticRightShift(final Object lhs, final short rhs) {
  final Object rhsObject = new NgShort(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseArithmeticRightShift(lhs, rhsObject);
  }

  public Object doArithmeticRightShift(final Object lhs, final int rhs) {
  final Object rhsObject = new NgInt(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseArithmeticRightShift(lhs, rhsObject);
  }

  public Object doArithmeticRightShift(final Object lhs, final long rhs) {
  final Object rhsObject = new NgLong(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseArithmeticRightShift(lhs, rhsObject);
  }

  public Object doArithmeticRightShift(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseArithmeticRightShift(lhs, rhsObject);
  }

  public Object doReverseArithmeticRightShift(final byte lhs, final Object rhs) {
  final Object lhsObject = new NgByte(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShift(lhsObject, rhs);
  }

  public Object doReverseArithmeticRightShift(final char lhs, final Object rhs) {
  final Object lhsObject = new NgChar(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShift(lhsObject, rhs);
  }

  public Object doReverseArithmeticRightShift(final short lhs, final Object rhs) {
  final Object lhsObject = new NgShort(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShift(lhsObject, rhs);
  }

  public Object doReverseArithmeticRightShift(final int lhs, final Object rhs) {
  final Object lhsObject = new NgInt(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShift(lhsObject, rhs);
  }

  public Object doReverseArithmeticRightShift(final long lhs, final Object rhs) {
  final Object lhsObject = new NgLong(lhs);
    
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
  final Object result = this.instanceHandler.arithmeticRightShiftEquals(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShiftEquals(lhs, rhs);
    } else {
      return result;
    }
  }
  
  public Object doReverseArithmeticRightShiftEquals(final Object lhs, final Object rhs) {
    return this.instanceHandler.reverseArithmeticRightShiftEquals(lhs, rhs);
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doArithmeticRightShiftEquals(final byte lhs, final byte rhs) {
    return doArithmeticRightShiftEquals(new NgByte(lhs), new NgByte(rhs));
  }

  public Object doArithmeticRightShiftEquals(final byte lhs, final char rhs) {
    return doArithmeticRightShiftEquals(new NgByte(lhs), new NgChar(rhs));
  }

  public Object doArithmeticRightShiftEquals(final byte lhs, final short rhs) {
    return doArithmeticRightShiftEquals(new NgByte(lhs), new NgShort(rhs));
  }

  public Object doArithmeticRightShiftEquals(final byte lhs, final int rhs) {
    return doArithmeticRightShiftEquals(new NgByte(lhs), new NgInt(rhs));
  }

  public Object doArithmeticRightShiftEquals(final byte lhs, final long rhs) {
    return doArithmeticRightShiftEquals(new NgByte(lhs), new NgLong(rhs));
  }

  public Object doArithmeticRightShiftEquals(final byte lhs, final BigInteger rhs) {
    return doArithmeticRightShiftEquals(new NgByte(lhs), (Object)rhs);
  }

  public Object doArithmeticRightShiftEquals(final char lhs, final byte rhs) {
    return doArithmeticRightShiftEquals(new NgChar(lhs), new NgByte(rhs));
  }

  public Object doArithmeticRightShiftEquals(final char lhs, final char rhs) {
    return doArithmeticRightShiftEquals(new NgChar(lhs), new NgChar(rhs));
  }

  public Object doArithmeticRightShiftEquals(final char lhs, final short rhs) {
    return doArithmeticRightShiftEquals(new NgChar(lhs), new NgShort(rhs));
  }

  public Object doArithmeticRightShiftEquals(final char lhs, final int rhs) {
    return doArithmeticRightShiftEquals(new NgChar(lhs), new NgInt(rhs));
  }

  public Object doArithmeticRightShiftEquals(final char lhs, final long rhs) {
    return doArithmeticRightShiftEquals(new NgChar(lhs), new NgLong(rhs));
  }

  public Object doArithmeticRightShiftEquals(final char lhs, final BigInteger rhs) {
    return doArithmeticRightShiftEquals(new NgChar(lhs), (Object)rhs);
  }

  public Object doArithmeticRightShiftEquals(final short lhs, final byte rhs) {
    return doArithmeticRightShiftEquals(new NgShort(lhs), new NgByte(rhs));
  }

  public Object doArithmeticRightShiftEquals(final short lhs, final char rhs) {
    return doArithmeticRightShiftEquals(new NgShort(lhs), new NgChar(rhs));
  }

  public Object doArithmeticRightShiftEquals(final short lhs, final short rhs) {
    return doArithmeticRightShiftEquals(new NgShort(lhs), new NgShort(rhs));
  }

  public Object doArithmeticRightShiftEquals(final short lhs, final int rhs) {
    return doArithmeticRightShiftEquals(new NgShort(lhs), new NgInt(rhs));
  }

  public Object doArithmeticRightShiftEquals(final short lhs, final long rhs) {
    return doArithmeticRightShiftEquals(new NgShort(lhs), new NgLong(rhs));
  }

  public Object doArithmeticRightShiftEquals(final short lhs, final BigInteger rhs) {
    return doArithmeticRightShiftEquals(new NgShort(lhs), (Object)rhs);
  }

  public Object doArithmeticRightShiftEquals(final int lhs, final byte rhs) {
    return doArithmeticRightShiftEquals(new NgInt(lhs), new NgByte(rhs));
  }

  public Object doArithmeticRightShiftEquals(final int lhs, final char rhs) {
    return doArithmeticRightShiftEquals(new NgInt(lhs), new NgChar(rhs));
  }

  public Object doArithmeticRightShiftEquals(final int lhs, final short rhs) {
    return doArithmeticRightShiftEquals(new NgInt(lhs), new NgShort(rhs));
  }

  public Object doArithmeticRightShiftEquals(final int lhs, final int rhs) {
    return doArithmeticRightShiftEquals(new NgInt(lhs), new NgInt(rhs));
  }

  public Object doArithmeticRightShiftEquals(final int lhs, final long rhs) {
    return doArithmeticRightShiftEquals(new NgInt(lhs), new NgLong(rhs));
  }

  public Object doArithmeticRightShiftEquals(final int lhs, final BigInteger rhs) {
    return doArithmeticRightShiftEquals(new NgInt(lhs), (Object)rhs);
  }

  public Object doArithmeticRightShiftEquals(final long lhs, final byte rhs) {
    return doArithmeticRightShiftEquals(new NgLong(lhs), new NgByte(rhs));
  }

  public Object doArithmeticRightShiftEquals(final long lhs, final char rhs) {
    return doArithmeticRightShiftEquals(new NgLong(lhs), new NgChar(rhs));
  }

  public Object doArithmeticRightShiftEquals(final long lhs, final short rhs) {
    return doArithmeticRightShiftEquals(new NgLong(lhs), new NgShort(rhs));
  }

  public Object doArithmeticRightShiftEquals(final long lhs, final int rhs) {
    return doArithmeticRightShiftEquals(new NgLong(lhs), new NgInt(rhs));
  }

  public Object doArithmeticRightShiftEquals(final long lhs, final long rhs) {
    return doArithmeticRightShiftEquals(new NgLong(lhs), new NgLong(rhs));
  }

  public Object doArithmeticRightShiftEquals(final long lhs, final BigInteger rhs) {
    return doArithmeticRightShiftEquals(new NgLong(lhs), (Object)rhs);
  }

  public Object doArithmeticRightShiftEquals(final BigInteger lhs, final byte rhs) {
    return doArithmeticRightShiftEquals((Object)lhs, new NgByte(rhs));
  }

  public Object doArithmeticRightShiftEquals(final BigInteger lhs, final char rhs) {
    return doArithmeticRightShiftEquals((Object)lhs, new NgChar(rhs));
  }

  public Object doArithmeticRightShiftEquals(final BigInteger lhs, final short rhs) {
    return doArithmeticRightShiftEquals((Object)lhs, new NgShort(rhs));
  }

  public Object doArithmeticRightShiftEquals(final BigInteger lhs, final int rhs) {
    return doArithmeticRightShiftEquals((Object)lhs, new NgInt(rhs));
  }

  public Object doArithmeticRightShiftEquals(final BigInteger lhs, final long rhs) {
    return doArithmeticRightShiftEquals((Object)lhs, new NgLong(rhs));
  }

  public Object doArithmeticRightShiftEquals(final BigInteger lhs, final BigInteger rhs) {
    return doArithmeticRightShiftEquals((Object)lhs, (Object)rhs);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = new NgByte(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseArithmeticRightShiftEquals(lhs, rhsObject);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final char rhs) {
  final Object rhsObject = new NgChar(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseArithmeticRightShiftEquals(lhs, rhsObject);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final short rhs) {
  final Object rhsObject = new NgShort(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseArithmeticRightShiftEquals(lhs, rhsObject);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final int rhs) {
  final Object rhsObject = new NgInt(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseArithmeticRightShiftEquals(lhs, rhsObject);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final long rhs) {
  final Object rhsObject = new NgLong(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseArithmeticRightShiftEquals(lhs, rhsObject);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseArithmeticRightShiftEquals(lhs, rhsObject);
  }

  public Object doReverseArithmeticRightShiftEquals(final byte lhs, final Object rhs) {
  final Object lhsObject = new NgByte(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShiftEquals(lhsObject, rhs);
  }

  public Object doReverseArithmeticRightShiftEquals(final char lhs, final Object rhs) {
  final Object lhsObject = new NgChar(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShiftEquals(lhsObject, rhs);
  }

  public Object doReverseArithmeticRightShiftEquals(final short lhs, final Object rhs) {
  final Object lhsObject = new NgShort(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShiftEquals(lhsObject, rhs);
  }

  public Object doReverseArithmeticRightShiftEquals(final int lhs, final Object rhs) {
  final Object lhsObject = new NgInt(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShiftEquals(lhsObject, rhs);
  }

  public Object doReverseArithmeticRightShiftEquals(final long lhs, final Object rhs) {
  final Object lhsObject = new NgLong(lhs);
    
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
  final Object result = this.instanceHandler.logicalRightShift(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShift(lhs, rhs);
    } else {
      return result;
    }
  }
  
  public Object doReverseLogicalRightShift(final Object lhs, final Object rhs) {
    return this.instanceHandler.reverseLogicalRightShift(lhs, rhs);
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doLogicalRightShift(final byte lhs, final byte rhs) {
    return doLogicalRightShift(new NgByte(lhs), new NgByte(rhs));
  }

  public Object doLogicalRightShift(final byte lhs, final char rhs) {
    return doLogicalRightShift(new NgByte(lhs), new NgChar(rhs));
  }

  public Object doLogicalRightShift(final byte lhs, final short rhs) {
    return doLogicalRightShift(new NgByte(lhs), new NgShort(rhs));
  }

  public Object doLogicalRightShift(final byte lhs, final int rhs) {
    return doLogicalRightShift(new NgByte(lhs), new NgInt(rhs));
  }

  public Object doLogicalRightShift(final byte lhs, final long rhs) {
    return doLogicalRightShift(new NgByte(lhs), new NgLong(rhs));
  }

  public Object doLogicalRightShift(final byte lhs, final BigInteger rhs) {
    return doLogicalRightShift(new NgByte(lhs), (Object)rhs);
  }

  public Object doLogicalRightShift(final char lhs, final byte rhs) {
    return doLogicalRightShift(new NgChar(lhs), new NgByte(rhs));
  }

  public Object doLogicalRightShift(final char lhs, final char rhs) {
    return doLogicalRightShift(new NgChar(lhs), new NgChar(rhs));
  }

  public Object doLogicalRightShift(final char lhs, final short rhs) {
    return doLogicalRightShift(new NgChar(lhs), new NgShort(rhs));
  }

  public Object doLogicalRightShift(final char lhs, final int rhs) {
    return doLogicalRightShift(new NgChar(lhs), new NgInt(rhs));
  }

  public Object doLogicalRightShift(final char lhs, final long rhs) {
    return doLogicalRightShift(new NgChar(lhs), new NgLong(rhs));
  }

  public Object doLogicalRightShift(final char lhs, final BigInteger rhs) {
    return doLogicalRightShift(new NgChar(lhs), (Object)rhs);
  }

  public Object doLogicalRightShift(final short lhs, final byte rhs) {
    return doLogicalRightShift(new NgShort(lhs), new NgByte(rhs));
  }

  public Object doLogicalRightShift(final short lhs, final char rhs) {
    return doLogicalRightShift(new NgShort(lhs), new NgChar(rhs));
  }

  public Object doLogicalRightShift(final short lhs, final short rhs) {
    return doLogicalRightShift(new NgShort(lhs), new NgShort(rhs));
  }

  public Object doLogicalRightShift(final short lhs, final int rhs) {
    return doLogicalRightShift(new NgShort(lhs), new NgInt(rhs));
  }

  public Object doLogicalRightShift(final short lhs, final long rhs) {
    return doLogicalRightShift(new NgShort(lhs), new NgLong(rhs));
  }

  public Object doLogicalRightShift(final short lhs, final BigInteger rhs) {
    return doLogicalRightShift(new NgShort(lhs), (Object)rhs);
  }

  public Object doLogicalRightShift(final int lhs, final byte rhs) {
    return doLogicalRightShift(new NgInt(lhs), new NgByte(rhs));
  }

  public Object doLogicalRightShift(final int lhs, final char rhs) {
    return doLogicalRightShift(new NgInt(lhs), new NgChar(rhs));
  }

  public Object doLogicalRightShift(final int lhs, final short rhs) {
    return doLogicalRightShift(new NgInt(lhs), new NgShort(rhs));
  }

  public Object doLogicalRightShift(final int lhs, final int rhs) {
    return doLogicalRightShift(new NgInt(lhs), new NgInt(rhs));
  }

  public Object doLogicalRightShift(final int lhs, final long rhs) {
    return doLogicalRightShift(new NgInt(lhs), new NgLong(rhs));
  }

  public Object doLogicalRightShift(final int lhs, final BigInteger rhs) {
    return doLogicalRightShift(new NgInt(lhs), (Object)rhs);
  }

  public Object doLogicalRightShift(final long lhs, final byte rhs) {
    return doLogicalRightShift(new NgLong(lhs), new NgByte(rhs));
  }

  public Object doLogicalRightShift(final long lhs, final char rhs) {
    return doLogicalRightShift(new NgLong(lhs), new NgChar(rhs));
  }

  public Object doLogicalRightShift(final long lhs, final short rhs) {
    return doLogicalRightShift(new NgLong(lhs), new NgShort(rhs));
  }

  public Object doLogicalRightShift(final long lhs, final int rhs) {
    return doLogicalRightShift(new NgLong(lhs), new NgInt(rhs));
  }

  public Object doLogicalRightShift(final long lhs, final long rhs) {
    return doLogicalRightShift(new NgLong(lhs), new NgLong(rhs));
  }

  public Object doLogicalRightShift(final long lhs, final BigInteger rhs) {
    return doLogicalRightShift(new NgLong(lhs), (Object)rhs);
  }

  public Object doLogicalRightShift(final Object lhs, final byte rhs) {
  final Object rhsObject = new NgByte(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLogicalRightShift(lhs, rhsObject);
  }

  public Object doLogicalRightShift(final Object lhs, final char rhs) {
  final Object rhsObject = new NgChar(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLogicalRightShift(lhs, rhsObject);
  }

  public Object doLogicalRightShift(final Object lhs, final short rhs) {
  final Object rhsObject = new NgShort(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLogicalRightShift(lhs, rhsObject);
  }

  public Object doLogicalRightShift(final Object lhs, final int rhs) {
  final Object rhsObject = new NgInt(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLogicalRightShift(lhs, rhsObject);
  }

  public Object doLogicalRightShift(final Object lhs, final long rhs) {
  final Object rhsObject = new NgLong(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLogicalRightShift(lhs, rhsObject);
  }

  public Object doLogicalRightShift(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLogicalRightShift(lhs, rhsObject);
  }

  public Object doReverseLogicalRightShift(final byte lhs, final Object rhs) {
  final Object lhsObject = new NgByte(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShift(lhsObject, rhs);
  }

  public Object doReverseLogicalRightShift(final char lhs, final Object rhs) {
  final Object lhsObject = new NgChar(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShift(lhsObject, rhs);
  }

  public Object doReverseLogicalRightShift(final short lhs, final Object rhs) {
  final Object lhsObject = new NgShort(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShift(lhsObject, rhs);
  }

  public Object doReverseLogicalRightShift(final int lhs, final Object rhs) {
  final Object lhsObject = new NgInt(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShift(lhsObject, rhs);
  }

  public Object doReverseLogicalRightShift(final long lhs, final Object rhs) {
  final Object lhsObject = new NgLong(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShift(lhsObject, rhs);
  }

  //
  //   Internal methods for operator &=
  //
  //  These methods can be overidden to implement &=
  //  If the underlying object does not have the appropriate method
  //
  public Object doLogicalRightShiftEquals(final Object lhs, final Object rhs) {
  final Object result = this.instanceHandler.logicalRightShiftEquals(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShift(lhs, rhs);
    } else {
      return result;
    }
  }
  
  public Object doReverseLogicalRightShiftEquals(final Object lhs, final Object rhs) {
    return this.instanceHandler.reverseLogicalRightShiftEquals(lhs, rhs);
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doLogicalRightShiftEquals(final byte lhs, final byte rhs) {
    return doLogicalRightShiftEquals(new NgByte(lhs), new NgByte(rhs));
  }

  public Object doLogicalRightShiftEquals(final byte lhs, final char rhs) {
    return doLogicalRightShiftEquals(new NgByte(lhs), new NgChar(rhs));
  }

  public Object doLogicalRightShiftEquals(final byte lhs, final short rhs) {
    return doLogicalRightShiftEquals(new NgByte(lhs), new NgShort(rhs));
  }

  public Object doLogicalRightShiftEquals(final byte lhs, final int rhs) {
    return doLogicalRightShiftEquals(new NgByte(lhs), new NgInt(rhs));
  }

  public Object doLogicalRightShiftEquals(final byte lhs, final long rhs) {
    return doLogicalRightShiftEquals(new NgByte(lhs), new NgLong(rhs));
  }

  public Object doLogicalRightShiftEquals(final byte lhs, final BigInteger rhs) {
    return doLogicalRightShiftEquals(new NgByte(lhs), (Object)rhs);
  }

  public Object doLogicalRightShiftEquals(final char lhs, final byte rhs) {
    return doLogicalRightShiftEquals(new NgChar(lhs), new NgByte(rhs));
  }

  public Object doLogicalRightShiftEquals(final char lhs, final char rhs) {
    return doLogicalRightShiftEquals(new NgChar(lhs), new NgChar(rhs));
  }

  public Object doLogicalRightShiftEquals(final char lhs, final short rhs) {
    return doLogicalRightShiftEquals(new NgChar(lhs), new NgShort(rhs));
  }

  public Object doLogicalRightShiftEquals(final char lhs, final int rhs) {
    return doLogicalRightShiftEquals(new NgChar(lhs), new NgInt(rhs));
  }

  public Object doLogicalRightShiftEquals(final char lhs, final long rhs) {
    return doLogicalRightShiftEquals(new NgChar(lhs), new NgLong(rhs));
  }

  public Object doLogicalRightShiftEquals(final char lhs, final BigInteger rhs) {
    return doLogicalRightShiftEquals(new NgChar(lhs), (Object)rhs);
  }

  public Object doLogicalRightShiftEquals(final short lhs, final byte rhs) {
    return doLogicalRightShiftEquals(new NgShort(lhs), new NgByte(rhs));
  }

  public Object doLogicalRightShiftEquals(final short lhs, final char rhs) {
    return doLogicalRightShiftEquals(new NgShort(lhs), new NgChar(rhs));
  }

  public Object doLogicalRightShiftEquals(final short lhs, final short rhs) {
    return doLogicalRightShiftEquals(new NgShort(lhs), new NgShort(rhs));
  }

  public Object doLogicalRightShiftEquals(final short lhs, final int rhs) {
    return doLogicalRightShiftEquals(new NgShort(lhs), new NgInt(rhs));
  }

  public Object doLogicalRightShiftEquals(final short lhs, final long rhs) {
    return doLogicalRightShiftEquals(new NgShort(lhs), new NgLong(rhs));
  }

  public Object doLogicalRightShiftEquals(final short lhs, final BigInteger rhs) {
    return doLogicalRightShiftEquals(new NgShort(lhs), (Object)rhs);
  }

  public Object doLogicalRightShiftEquals(final int lhs, final byte rhs) {
    return doLogicalRightShiftEquals(new NgInt(lhs), new NgByte(rhs));
  }

  public Object doLogicalRightShiftEquals(final int lhs, final char rhs) {
    return doLogicalRightShiftEquals(new NgInt(lhs), new NgChar(rhs));
  }

  public Object doLogicalRightShiftEquals(final int lhs, final short rhs) {
    return doLogicalRightShiftEquals(new NgInt(lhs), new NgShort(rhs));
  }

  public Object doLogicalRightShiftEquals(final int lhs, final int rhs) {
    return doLogicalRightShiftEquals(new NgInt(lhs), new NgInt(rhs));
  }

  public Object doLogicalRightShiftEquals(final int lhs, final long rhs) {
    return doLogicalRightShiftEquals(new NgInt(lhs), new NgLong(rhs));
  }

  public Object doLogicalRightShiftEquals(final int lhs, final BigInteger rhs) {
    return doLogicalRightShiftEquals(new NgInt(lhs), (Object)rhs);
  }

  public Object doLogicalRightShiftEquals(final long lhs, final byte rhs) {
    return doLogicalRightShiftEquals(new NgLong(lhs), new NgByte(rhs));
  }

  public Object doLogicalRightShiftEquals(final long lhs, final char rhs) {
    return doLogicalRightShiftEquals(new NgLong(lhs), new NgChar(rhs));
  }

  public Object doLogicalRightShiftEquals(final long lhs, final short rhs) {
    return doLogicalRightShiftEquals(new NgLong(lhs), new NgShort(rhs));
  }

  public Object doLogicalRightShiftEquals(final long lhs, final int rhs) {
    return doLogicalRightShiftEquals(new NgLong(lhs), new NgInt(rhs));
  }

  public Object doLogicalRightShiftEquals(final long lhs, final long rhs) {
    return doLogicalRightShiftEquals(new NgLong(lhs), new NgLong(rhs));
  }

  public Object doLogicalRightShiftEquals(final long lhs, final BigInteger rhs) {
    return doLogicalRightShiftEquals(new NgLong(lhs), (Object)rhs);
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = new NgByte(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLogicalRightShiftEquals(lhs, rhsObject);
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final char rhs) {
  final Object rhsObject = new NgChar(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLogicalRightShiftEquals(lhs, rhsObject);
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final short rhs) {
  final Object rhsObject = new NgShort(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLogicalRightShiftEquals(lhs, rhsObject);
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final int rhs) {
  final Object rhsObject = new NgInt(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLogicalRightShiftEquals(lhs, rhsObject);
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final long rhs) {
  final Object rhsObject = new NgLong(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLogicalRightShiftEquals(lhs, rhsObject);
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final BigInteger rhs) {
  final Object rhsObject = (Object)rhs;
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLogicalRightShiftEquals(lhs, rhsObject);
  }

  public Object doReverseLogicalRightShiftEquals(final byte lhs, final Object rhs) {
  final Object lhsObject = new NgByte(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShiftEquals(lhsObject, rhs);
  }

  public Object doReverseLogicalRightShiftEquals(final char lhs, final Object rhs) {
  final Object lhsObject = new NgChar(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShiftEquals(lhsObject, rhs);
  }

  public Object doReverseLogicalRightShiftEquals(final short lhs, final Object rhs) {
  final Object lhsObject = new NgShort(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShiftEquals(lhsObject, rhs);
  }

  public Object doReverseLogicalRightShiftEquals(final int lhs, final Object rhs) {
  final Object lhsObject = new NgInt(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShiftEquals(lhsObject, rhs);
  }

  public Object doReverseLogicalRightShiftEquals(final long lhs, final Object rhs) {
  final Object lhsObject = new NgLong(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShiftEquals(lhsObject, rhs);
  }

  //
  //   Internal methods for operator <=>
  //
  //  These methods can be overidden to implement <=>
  //  If the underlying object does not have the appropriate method
  //
  public Object doCompare(final Object lhs, final Object rhs) {
  final Object result = this.instanceHandler.compare(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseCompare(lhs, rhs);
    } else {
      return result;
    }
  }

  public Object doReverseCompare(final Object lhs, final Object rhs) {
    return this.instanceHandler.reverseCompare(lhs, rhs);
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doCompare(final byte lhs, final byte rhs) {
    return doCompare(new NgByte(lhs), new NgByte(rhs));
  }

  public Object doCompare(final byte lhs, final char rhs) {
    return doCompare(new NgByte(lhs), new NgChar(rhs));
  }

  public Object doCompare(final byte lhs, final short rhs) {
    return doCompare(new NgByte(lhs), new NgShort(rhs));
  }

  public Object doCompare(final byte lhs, final int rhs) {
    return doCompare(new NgByte(lhs), new NgInt(rhs));
  }

  public Object doCompare(final byte lhs, final long rhs) {
    return doCompare(new NgByte(lhs), new NgLong(rhs));
  }

  public Object doCompare(final byte lhs, final float rhs) {
    return doCompare(new NgByte(lhs), new NgFloat(rhs));
  }

  public Object doCompare(final byte lhs, final double rhs) {
    return doCompare(new NgByte(lhs), new NgDouble(rhs));
  }

  public Object doCompare(final byte lhs, final BigInteger rhs) {
    return doCompare(new NgByte(lhs), (Object)rhs);
  }

  public Object doCompare(final byte lhs, final BigDecimal rhs) {
    return doCompare(new NgByte(lhs), (Object)rhs);
  }

  public Object doCompare(final char lhs, final byte rhs) {
    return doCompare(new NgChar(lhs), new NgByte(rhs));
  }

  public Object doCompare(final char lhs, final char rhs) {
    return doCompare(new NgChar(lhs), new NgChar(rhs));
  }

  public Object doCompare(final char lhs, final short rhs) {
    return doCompare(new NgChar(lhs), new NgShort(rhs));
  }

  public Object doCompare(final char lhs, final int rhs) {
    return doCompare(new NgChar(lhs), new NgInt(rhs));
  }

  public Object doCompare(final char lhs, final long rhs) {
    return doCompare(new NgChar(lhs), new NgLong(rhs));
  }

  public Object doCompare(final char lhs, final float rhs) {
    return doCompare(new NgChar(lhs), new NgFloat(rhs));
  }

  public Object doCompare(final char lhs, final double rhs) {
    return doCompare(new NgChar(lhs), new NgDouble(rhs));
  }

  public Object doCompare(final char lhs, final BigInteger rhs) {
    return doCompare(new NgChar(lhs), (Object)rhs);
  }

  public Object doCompare(final char lhs, final BigDecimal rhs) {
    return doCompare(new NgChar(lhs), (Object)rhs);
  }

  public Object doCompare(final short lhs, final byte rhs) {
    return doCompare(new NgShort(lhs), new NgByte(rhs));
  }

  public Object doCompare(final short lhs, final char rhs) {
    return doCompare(new NgShort(lhs), new NgChar(rhs));
  }

  public Object doCompare(final short lhs, final short rhs) {
    return doCompare(new NgShort(lhs), new NgShort(rhs));
  }

  public Object doCompare(final short lhs, final int rhs) {
    return doCompare(new NgShort(lhs), new NgInt(rhs));
  }

  public Object doCompare(final short lhs, final long rhs) {
    return doCompare(new NgShort(lhs), new NgLong(rhs));
  }

  public Object doCompare(final short lhs, final float rhs) {
    return doCompare(new NgShort(lhs), new NgFloat(rhs));
  }

  public Object doCompare(final short lhs, final double rhs) {
    return doCompare(new NgShort(lhs), new NgDouble(rhs));
  }

  public Object doCompare(final short lhs, final BigInteger rhs) {
    return doCompare(new NgShort(lhs), (Object)rhs);
  }

  public Object doCompare(final short lhs, final BigDecimal rhs) {
    return doCompare(new NgShort(lhs), (Object)rhs);
  }

  public Object doCompare(final int lhs, final byte rhs) {
    return doCompare(new NgInt(lhs), new NgByte(rhs));
  }

  public Object doCompare(final int lhs, final char rhs) {
    return doCompare(new NgInt(lhs), new NgChar(rhs));
  }

  public Object doCompare(final int lhs, final short rhs) {
    return doCompare(new NgInt(lhs), new NgShort(rhs));
  }

  public Object doCompare(final int lhs, final int rhs) {
    return doCompare(new NgInt(lhs), new NgInt(rhs));
  }

  public Object doCompare(final int lhs, final long rhs) {
    return doCompare(new NgInt(lhs), new NgLong(rhs));
  }

  public Object doCompare(final int lhs, final float rhs) {
    return doCompare(new NgInt(lhs), new NgFloat(rhs));
  }

  public Object doCompare(final int lhs, final double rhs) {
    return doCompare(new NgInt(lhs), new NgDouble(rhs));
  }

  public Object doCompare(final int lhs, final BigInteger rhs) {
    return doCompare(new NgInt(lhs), (Object)rhs);
  }

  public Object doCompare(final int lhs, final BigDecimal rhs) {
    return doCompare(new NgInt(lhs), (Object)rhs);
  }

  public Object doCompare(final long lhs, final byte rhs) {
    return doCompare(new NgLong(lhs), new NgByte(rhs));
  }

  public Object doCompare(final long lhs, final char rhs) {
    return doCompare(new NgLong(lhs), new NgChar(rhs));
  }

  public Object doCompare(final long lhs, final short rhs) {
    return doCompare(new NgLong(lhs), new NgShort(rhs));
  }

  public Object doCompare(final long lhs, final int rhs) {
    return doCompare(new NgLong(lhs), new NgInt(rhs));
  }

  public Object doCompare(final long lhs, final long rhs) {
    return doCompare(new NgLong(lhs), new NgLong(rhs));
  }

  public Object doCompare(final long lhs, final float rhs) {
    return doCompare(new NgLong(lhs), new NgFloat(rhs));
  }

  public Object doCompare(final long lhs, final double rhs) {
    return doCompare(new NgLong(lhs), new NgDouble(rhs));
  }

  public Object doCompare(final long lhs, final BigInteger rhs) {
    return doCompare(new NgLong(lhs), (Object)rhs);
  }

  public Object doCompare(final long lhs, final BigDecimal rhs) {
    return doCompare(new NgLong(lhs), (Object)rhs);
  }

  public Object doCompare(final float lhs, final byte rhs) {
    return doCompare(new NgFloat(lhs), new NgByte(rhs));
  }

  public Object doCompare(final float lhs, final char rhs) {
    return doCompare(new NgFloat(lhs), new NgChar(rhs));
  }

  public Object doCompare(final float lhs, final short rhs) {
    return doCompare(new NgFloat(lhs), new NgShort(rhs));
  }

  public Object doCompare(final float lhs, final int rhs) {
    return doCompare(new NgFloat(lhs), new NgInt(rhs));
  }

  public Object doCompare(final float lhs, final long rhs) {
    return doCompare(new NgFloat(lhs), new NgLong(rhs));
  }

  public Object doCompare(final float lhs, final float rhs) {
    return doCompare(new NgFloat(lhs), new NgFloat(rhs));
  }

  public Object doCompare(final float lhs, final double rhs) {
    return doCompare(new NgFloat(lhs), new NgDouble(rhs));
  }

  public Object doCompare(final float lhs, final BigInteger rhs) {
    return doCompare(new NgFloat(lhs), (Object)rhs);
  }

  public Object doCompare(final float lhs, final BigDecimal rhs) {
    return doCompare(new NgFloat(lhs), (Object)rhs);
  }

  public Object doCompare(final double lhs, final byte rhs) {
    return doCompare(new NgDouble(lhs), new NgByte(rhs));
  }

  public Object doCompare(final double lhs, final char rhs) {
    return doCompare(new NgDouble(lhs), new NgChar(rhs));
  }

  public Object doCompare(final double lhs, final short rhs) {
    return doCompare(new NgDouble(lhs), new NgShort(rhs));
  }

  public Object doCompare(final double lhs, final int rhs) {
    return doCompare(new NgDouble(lhs), new NgInt(rhs));
  }

  public Object doCompare(final double lhs, final long rhs) {
    return doCompare(new NgDouble(lhs), new NgLong(rhs));
  }

  public Object doCompare(final double lhs, final float rhs) {
    return doCompare(new NgDouble(lhs), new NgFloat(rhs));
  }

  public Object doCompare(final double lhs, final double rhs) {
    return doCompare(new NgDouble(lhs), new NgDouble(rhs));
  }

  public Object doCompare(final double lhs, final BigInteger rhs) {
    return doCompare(new NgDouble(lhs), (Object)rhs);
  }

  public Object doCompare(final double lhs, final BigDecimal rhs) {
    return doCompare(new NgDouble(lhs), (Object)rhs);
  }

  public Object doCompare(final BigInteger lhs, final byte rhs) {
    return doCompare((Object)lhs, new NgByte(rhs));
  }

  public Object doCompare(final BigInteger lhs, final char rhs) {
    return doCompare((Object)lhs, new NgChar(rhs));
  }

  public Object doCompare(final BigInteger lhs, final short rhs) {
    return doCompare((Object)lhs, new NgShort(rhs));
  }

  public Object doCompare(final BigInteger lhs, final int rhs) {
    return doCompare((Object)lhs, new NgInt(rhs));
  }

  public Object doCompare(final BigInteger lhs, final long rhs) {
    return doCompare((Object)lhs, new NgLong(rhs));
  }

  public Object doCompare(final BigInteger lhs, final float rhs) {
    return doCompare((Object)lhs, new NgFloat(rhs));
  }

  public Object doCompare(final BigInteger lhs, final double rhs) {
    return doCompare((Object)lhs, new NgDouble(rhs));
  }

  public Object doCompare(final BigInteger lhs, final BigInteger rhs) {
    return doCompare((Object)lhs, (Object)rhs);
  }

  public Object doCompare(final BigInteger lhs, final BigDecimal rhs) {
    return doCompare((Object)lhs, (Object)rhs);
  }

  public Object doCompare(final BigDecimal lhs, final byte rhs) {
    return doCompare((Object)lhs, new NgByte(rhs));
  }

  public Object doCompare(final BigDecimal lhs, final char rhs) {
    return doCompare((Object)lhs, new NgChar(rhs));
  }

  public Object doCompare(final BigDecimal lhs, final short rhs) {
    return doCompare((Object)lhs, new NgShort(rhs));
  }

  public Object doCompare(final BigDecimal lhs, final int rhs) {
    return doCompare((Object)lhs, new NgInt(rhs));
  }

  public Object doCompare(final BigDecimal lhs, final long rhs) {
    return doCompare((Object)lhs, new NgLong(rhs));
  }

  public Object doCompare(final BigDecimal lhs, final float rhs) {
    return doCompare((Object)lhs, new NgFloat(rhs));
  }

  public Object doCompare(final BigDecimal lhs, final double rhs) {
    return doCompare((Object)lhs, new NgDouble(rhs));
  }

  public Object doCompare(final BigDecimal lhs, final BigInteger rhs) {
    return doCompare((Object)lhs, (Object)rhs);
  }

  public Object doCompare(final BigDecimal lhs, final BigDecimal rhs) {
    return doCompare((Object)lhs, (Object)rhs);
  }

  public Object doCompare(final Object lhs, final byte rhs) {
  final Object rhsObject = new NgByte(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseCompare(lhs, rhsObject);
  }

  public Object doCompare(final Object lhs, final char rhs) {
  final Object rhsObject = new NgChar(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseCompare(lhs, rhsObject);
  }

  public Object doCompare(final Object lhs, final short rhs) {
  final Object rhsObject = new NgShort(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseCompare(lhs, rhsObject);
  }

  public Object doCompare(final Object lhs, final int rhs) {
  final Object rhsObject = new NgInt(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseCompare(lhs, rhsObject);
  }

  public Object doCompare(final Object lhs, final long rhs) {
  final Object rhsObject = new NgLong(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseCompare(lhs, rhsObject);
  }

  public Object doCompare(final Object lhs, final float rhs) {
  final Object rhsObject = new NgFloat(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseCompare(lhs, rhsObject);
  }

  public Object doCompare(final Object lhs, final double rhs) {
  final Object rhsObject = new NgDouble(rhs);
    
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
  final Object lhsObject = new NgByte(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseCompare(lhsObject, rhs);
  }

  public Object doReverseCompare(final char lhs, final Object rhs) {
  final Object lhsObject = new NgChar(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseCompare(lhsObject, rhs);
  }

  public Object doReverseCompare(final short lhs, final Object rhs) {
  final Object lhsObject = new NgShort(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseCompare(lhsObject, rhs);
  }

  public Object doReverseCompare(final int lhs, final Object rhs) {
  final Object lhsObject = new NgInt(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseCompare(lhsObject, rhs);
  }

  public Object doReverseCompare(final long lhs, final Object rhs) {
  final Object lhsObject = new NgLong(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseCompare(lhsObject, rhs);
  }

  public Object doReverseCompare(final float lhs, final Object rhs) {
  final Object lhsObject = new NgFloat(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseCompare(lhsObject, rhs);
  }

  public Object doReverseCompare(final double lhs, final Object rhs) {
  final Object lhsObject = new NgDouble(lhs);
    
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
  final Object result = this.instanceHandler.equals(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEquals(lhs, rhs);
    } else {
      return result;
    }
  }
  
  public Object doReverseEquals(final Object lhs, final Object rhs) {
    return this.instanceHandler.reverseEquals(lhs, rhs);
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doEquals(final byte lhs, final byte rhs) {
    return doEquals(new NgByte(lhs), new NgByte(rhs));
  }

  public Object doEquals(final byte lhs, final char rhs) {
    return doEquals(new NgByte(lhs), new NgChar(rhs));
  }

  public Object doEquals(final byte lhs, final short rhs) {
    return doEquals(new NgByte(lhs), new NgShort(rhs));
  }

  public Object doEquals(final byte lhs, final int rhs) {
    return doEquals(new NgByte(lhs), new NgInt(rhs));
  }

  public Object doEquals(final byte lhs, final long rhs) {
    return doEquals(new NgByte(lhs), new NgLong(rhs));
  }

  public Object doEquals(final byte lhs, final float rhs) {
    return doEquals(new NgByte(lhs), new NgFloat(rhs));
  }

  public Object doEquals(final byte lhs, final double rhs) {
    return doEquals(new NgByte(lhs), new NgDouble(rhs));
  }

  public Object doEquals(final byte lhs, final BigInteger rhs) {
    return doEquals(new NgByte(lhs), (Object)rhs);
  }

  public Object doEquals(final byte lhs, final BigDecimal rhs) {
    return doEquals(new NgByte(lhs), (Object)rhs);
  }

  public Object doEquals(final char lhs, final byte rhs) {
    return doEquals(new NgChar(lhs), new NgByte(rhs));
  }

  public Object doEquals(final char lhs, final char rhs) {
    return doEquals(new NgChar(lhs), new NgChar(rhs));
  }

  public Object doEquals(final char lhs, final short rhs) {
    return doEquals(new NgChar(lhs), new NgShort(rhs));
  }

  public Object doEquals(final char lhs, final int rhs) {
    return doEquals(new NgChar(lhs), new NgInt(rhs));
  }

  public Object doEquals(final char lhs, final long rhs) {
    return doEquals(new NgChar(lhs), new NgLong(rhs));
  }

  public Object doEquals(final char lhs, final float rhs) {
    return doEquals(new NgChar(lhs), new NgFloat(rhs));
  }

  public Object doEquals(final char lhs, final double rhs) {
    return doEquals(new NgChar(lhs), new NgDouble(rhs));
  }

  public Object doEquals(final char lhs, final BigInteger rhs) {
    return doEquals(new NgChar(lhs), (Object)rhs);
  }

  public Object doEquals(final char lhs, final BigDecimal rhs) {
    return doEquals(new NgChar(lhs), (Object)rhs);
  }

  public Object doEquals(final short lhs, final byte rhs) {
    return doEquals(new NgShort(lhs), new NgByte(rhs));
  }

  public Object doEquals(final short lhs, final char rhs) {
    return doEquals(new NgShort(lhs), new NgChar(rhs));
  }

  public Object doEquals(final short lhs, final short rhs) {
    return doEquals(new NgShort(lhs), new NgShort(rhs));
  }

  public Object doEquals(final short lhs, final int rhs) {
    return doEquals(new NgShort(lhs), new NgInt(rhs));
  }

  public Object doEquals(final short lhs, final long rhs) {
    return doEquals(new NgShort(lhs), new NgLong(rhs));
  }

  public Object doEquals(final short lhs, final float rhs) {
    return doEquals(new NgShort(lhs), new NgFloat(rhs));
  }

  public Object doEquals(final short lhs, final double rhs) {
    return doEquals(new NgShort(lhs), new NgDouble(rhs));
  }

  public Object doEquals(final short lhs, final BigInteger rhs) {
    return doEquals(new NgShort(lhs), (Object)rhs);
  }

  public Object doEquals(final short lhs, final BigDecimal rhs) {
    return doEquals(new NgShort(lhs), (Object)rhs);
  }

  public Object doEquals(final int lhs, final byte rhs) {
    return doEquals(new NgInt(lhs), new NgByte(rhs));
  }

  public Object doEquals(final int lhs, final char rhs) {
    return doEquals(new NgInt(lhs), new NgChar(rhs));
  }

  public Object doEquals(final int lhs, final short rhs) {
    return doEquals(new NgInt(lhs), new NgShort(rhs));
  }

  public Object doEquals(final int lhs, final int rhs) {
    return doEquals(new NgInt(lhs), new NgInt(rhs));
  }

  public Object doEquals(final int lhs, final long rhs) {
    return doEquals(new NgInt(lhs), new NgLong(rhs));
  }

  public Object doEquals(final int lhs, final float rhs) {
    return doEquals(new NgInt(lhs), new NgFloat(rhs));
  }

  public Object doEquals(final int lhs, final double rhs) {
    return doEquals(new NgInt(lhs), new NgDouble(rhs));
  }

  public Object doEquals(final int lhs, final BigInteger rhs) {
    return doEquals(new NgInt(lhs), (Object)rhs);
  }

  public Object doEquals(final int lhs, final BigDecimal rhs) {
    return doEquals(new NgInt(lhs), (Object)rhs);
  }

  public Object doEquals(final long lhs, final byte rhs) {
    return doEquals(new NgLong(lhs), new NgByte(rhs));
  }

  public Object doEquals(final long lhs, final char rhs) {
    return doEquals(new NgLong(lhs), new NgChar(rhs));
  }

  public Object doEquals(final long lhs, final short rhs) {
    return doEquals(new NgLong(lhs), new NgShort(rhs));
  }

  public Object doEquals(final long lhs, final int rhs) {
    return doEquals(new NgLong(lhs), new NgInt(rhs));
  }

  public Object doEquals(final long lhs, final long rhs) {
    return doEquals(new NgLong(lhs), new NgLong(rhs));
  }

  public Object doEquals(final long lhs, final float rhs) {
    return doEquals(new NgLong(lhs), new NgFloat(rhs));
  }

  public Object doEquals(final long lhs, final double rhs) {
    return doEquals(new NgLong(lhs), new NgDouble(rhs));
  }

  public Object doEquals(final long lhs, final BigInteger rhs) {
    return doEquals(new NgLong(lhs), (Object)rhs);
  }

  public Object doEquals(final long lhs, final BigDecimal rhs) {
    return doEquals(new NgLong(lhs), (Object)rhs);
  }

  public Object doEquals(final float lhs, final byte rhs) {
    return doEquals(new NgFloat(lhs), new NgByte(rhs));
  }

  public Object doEquals(final float lhs, final char rhs) {
    return doEquals(new NgFloat(lhs), new NgChar(rhs));
  }

  public Object doEquals(final float lhs, final short rhs) {
    return doEquals(new NgFloat(lhs), new NgShort(rhs));
  }

  public Object doEquals(final float lhs, final int rhs) {
    return doEquals(new NgFloat(lhs), new NgInt(rhs));
  }

  public Object doEquals(final float lhs, final long rhs) {
    return doEquals(new NgFloat(lhs), new NgLong(rhs));
  }

  public Object doEquals(final float lhs, final float rhs) {
    return doEquals(new NgFloat(lhs), new NgFloat(rhs));
  }

  public Object doEquals(final float lhs, final double rhs) {
    return doEquals(new NgFloat(lhs), new NgDouble(rhs));
  }

  public Object doEquals(final float lhs, final BigInteger rhs) {
    return doEquals(new NgFloat(lhs), (Object)rhs);
  }

  public Object doEquals(final float lhs, final BigDecimal rhs) {
    return doEquals(new NgFloat(lhs), (Object)rhs);
  }

  public Object doEquals(final double lhs, final byte rhs) {
    return doEquals(new NgDouble(lhs), new NgByte(rhs));
  }

  public Object doEquals(final double lhs, final char rhs) {
    return doEquals(new NgDouble(lhs), new NgChar(rhs));
  }

  public Object doEquals(final double lhs, final short rhs) {
    return doEquals(new NgDouble(lhs), new NgShort(rhs));
  }

  public Object doEquals(final double lhs, final int rhs) {
    return doEquals(new NgDouble(lhs), new NgInt(rhs));
  }

  public Object doEquals(final double lhs, final long rhs) {
    return doEquals(new NgDouble(lhs), new NgLong(rhs));
  }

  public Object doEquals(final double lhs, final float rhs) {
    return doEquals(new NgDouble(lhs), new NgFloat(rhs));
  }

  public Object doEquals(final double lhs, final double rhs) {
    return doEquals(new NgDouble(lhs), new NgDouble(rhs));
  }

  public Object doEquals(final double lhs, final BigInteger rhs) {
    return doEquals(new NgDouble(lhs), (Object)rhs);
  }

  public Object doEquals(final double lhs, final BigDecimal rhs) {
    return doEquals(new NgDouble(lhs), (Object)rhs);
  }

  public Object doEquals(final BigInteger lhs, final byte rhs) {
    return doEquals((Object)lhs, new NgByte(rhs));
  }

  public Object doEquals(final BigInteger lhs, final char rhs) {
    return doEquals((Object)lhs, new NgChar(rhs));
  }

  public Object doEquals(final BigInteger lhs, final short rhs) {
    return doEquals((Object)lhs, new NgShort(rhs));
  }

  public Object doEquals(final BigInteger lhs, final int rhs) {
    return doEquals((Object)lhs, new NgInt(rhs));
  }

  public Object doEquals(final BigInteger lhs, final long rhs) {
    return doEquals((Object)lhs, new NgLong(rhs));
  }

  public Object doEquals(final BigInteger lhs, final float rhs) {
    return doEquals((Object)lhs, new NgFloat(rhs));
  }

  public Object doEquals(final BigInteger lhs, final double rhs) {
    return doEquals((Object)lhs, new NgDouble(rhs));
  }

  public Object doEquals(final BigInteger lhs, final BigInteger rhs) {
    return doEquals((Object)lhs, (Object)rhs);
  }

  public Object doEquals(final BigInteger lhs, final BigDecimal rhs) {
    return doEquals((Object)lhs, (Object)rhs);
  }

  public Object doEquals(final BigDecimal lhs, final byte rhs) {
    return doEquals((Object)lhs, new NgByte(rhs));
  }

  public Object doEquals(final BigDecimal lhs, final char rhs) {
    return doEquals((Object)lhs, new NgChar(rhs));
  }

  public Object doEquals(final BigDecimal lhs, final short rhs) {
    return doEquals((Object)lhs, new NgShort(rhs));
  }

  public Object doEquals(final BigDecimal lhs, final int rhs) {
    return doEquals((Object)lhs, new NgInt(rhs));
  }

  public Object doEquals(final BigDecimal lhs, final long rhs) {
    return doEquals((Object)lhs, new NgLong(rhs));
  }

  public Object doEquals(final BigDecimal lhs, final float rhs) {
    return doEquals((Object)lhs, new NgFloat(rhs));
  }

  public Object doEquals(final BigDecimal lhs, final double rhs) {
    return doEquals((Object)lhs, new NgDouble(rhs));
  }

  public Object doEquals(final BigDecimal lhs, final BigInteger rhs) {
    return doEquals((Object)lhs, (Object)rhs);
  }

  public Object doEquals(final BigDecimal lhs, final BigDecimal rhs) {
    return doEquals((Object)lhs, (Object)rhs);
  }

  public Object doEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = new NgByte(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseEquals(lhs, rhsObject);
  }

  public Object doEquals(final Object lhs, final char rhs) {
  final Object rhsObject = new NgChar(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseEquals(lhs, rhsObject);
  }

  public Object doEquals(final Object lhs, final short rhs) {
  final Object rhsObject = new NgShort(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseEquals(lhs, rhsObject);
  }

  public Object doEquals(final Object lhs, final int rhs) {
  final Object rhsObject = new NgInt(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseEquals(lhs, rhsObject);
  }

  public Object doEquals(final Object lhs, final long rhs) {
  final Object rhsObject = new NgLong(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseEquals(lhs, rhsObject);
  }

  public Object doEquals(final Object lhs, final float rhs) {
  final Object rhsObject = new NgFloat(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseEquals(lhs, rhsObject);
  }

  public Object doEquals(final Object lhs, final double rhs) {
  final Object rhsObject = new NgDouble(rhs);
    
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
  final Object lhsObject = new NgByte(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEquals(lhsObject, rhs);
  }

  public Object doReverseEquals(final char lhs, final Object rhs) {
  final Object lhsObject = new NgChar(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEquals(lhsObject, rhs);
  }

  public Object doReverseEquals(final short lhs, final Object rhs) {
  final Object lhsObject = new NgShort(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEquals(lhsObject, rhs);
  }

  public Object doReverseEquals(final int lhs, final Object rhs) {
  final Object lhsObject = new NgInt(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEquals(lhsObject, rhs);
  }

  public Object doReverseEquals(final long lhs, final Object rhs) {
  final Object lhsObject = new NgLong(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEquals(lhsObject, rhs);
  }

  public Object doReverseEquals(final float lhs, final Object rhs) {
  final Object lhsObject = new NgFloat(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEquals(lhsObject, rhs);
  }

  public Object doReverseEquals(final double lhs, final Object rhs) {
  final Object lhsObject = new NgDouble(lhs);
    
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
  final Object result = this.instanceHandler.notEquals(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEquals(lhs, rhs);
    } else {
      return result;
    }
  }
  
  public Object doReverseNotEquals(final Object lhs, final Object rhs) {
    return this.instanceHandler.reverseNotEquals(lhs, rhs);
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doNotEquals(final byte lhs, final byte rhs) {
    return doNotEquals(new NgByte(lhs), new NgByte(rhs));
  }

  public Object doNotEquals(final byte lhs, final char rhs) {
    return doNotEquals(new NgByte(lhs), new NgChar(rhs));
  }

  public Object doNotEquals(final byte lhs, final short rhs) {
    return doNotEquals(new NgByte(lhs), new NgShort(rhs));
  }

  public Object doNotEquals(final byte lhs, final int rhs) {
    return doNotEquals(new NgByte(lhs), new NgInt(rhs));
  }

  public Object doNotEquals(final byte lhs, final long rhs) {
    return doNotEquals(new NgByte(lhs), new NgLong(rhs));
  }

  public Object doNotEquals(final byte lhs, final float rhs) {
    return doNotEquals(new NgByte(lhs), new NgFloat(rhs));
  }

  public Object doNotEquals(final byte lhs, final double rhs) {
    return doNotEquals(new NgByte(lhs), new NgDouble(rhs));
  }

  public Object doNotEquals(final byte lhs, final BigInteger rhs) {
    return doNotEquals(new NgByte(lhs), (Object)rhs);
  }

  public Object doNotEquals(final byte lhs, final BigDecimal rhs) {
    return doNotEquals(new NgByte(lhs), (Object)rhs);
  }

  public Object doNotEquals(final char lhs, final byte rhs) {
    return doNotEquals(new NgChar(lhs), new NgByte(rhs));
  }

  public Object doNotEquals(final char lhs, final char rhs) {
    return doNotEquals(new NgChar(lhs), new NgChar(rhs));
  }

  public Object doNotEquals(final char lhs, final short rhs) {
    return doNotEquals(new NgChar(lhs), new NgShort(rhs));
  }

  public Object doNotEquals(final char lhs, final int rhs) {
    return doNotEquals(new NgChar(lhs), new NgInt(rhs));
  }

  public Object doNotEquals(final char lhs, final long rhs) {
    return doNotEquals(new NgChar(lhs), new NgLong(rhs));
  }

  public Object doNotEquals(final char lhs, final float rhs) {
    return doNotEquals(new NgChar(lhs), new NgFloat(rhs));
  }

  public Object doNotEquals(final char lhs, final double rhs) {
    return doNotEquals(new NgChar(lhs), new NgDouble(rhs));
  }

  public Object doNotEquals(final char lhs, final BigInteger rhs) {
    return doNotEquals(new NgChar(lhs), (Object)rhs);
  }

  public Object doNotEquals(final char lhs, final BigDecimal rhs) {
    return doNotEquals(new NgChar(lhs), (Object)rhs);
  }

  public Object doNotEquals(final short lhs, final byte rhs) {
    return doNotEquals(new NgShort(lhs), new NgByte(rhs));
  }

  public Object doNotEquals(final short lhs, final char rhs) {
    return doNotEquals(new NgShort(lhs), new NgChar(rhs));
  }

  public Object doNotEquals(final short lhs, final short rhs) {
    return doNotEquals(new NgShort(lhs), new NgShort(rhs));
  }

  public Object doNotEquals(final short lhs, final int rhs) {
    return doNotEquals(new NgShort(lhs), new NgInt(rhs));
  }

  public Object doNotEquals(final short lhs, final long rhs) {
    return doNotEquals(new NgShort(lhs), new NgLong(rhs));
  }

  public Object doNotEquals(final short lhs, final float rhs) {
    return doNotEquals(new NgShort(lhs), new NgFloat(rhs));
  }

  public Object doNotEquals(final short lhs, final double rhs) {
    return doNotEquals(new NgShort(lhs), new NgDouble(rhs));
  }

  public Object doNotEquals(final short lhs, final BigInteger rhs) {
    return doNotEquals(new NgShort(lhs), (Object)rhs);
  }

  public Object doNotEquals(final short lhs, final BigDecimal rhs) {
    return doNotEquals(new NgShort(lhs), (Object)rhs);
  }

  public Object doNotEquals(final int lhs, final byte rhs) {
    return doNotEquals(new NgInt(lhs), new NgByte(rhs));
  }

  public Object doNotEquals(final int lhs, final char rhs) {
    return doNotEquals(new NgInt(lhs), new NgChar(rhs));
  }

  public Object doNotEquals(final int lhs, final short rhs) {
    return doNotEquals(new NgInt(lhs), new NgShort(rhs));
  }

  public Object doNotEquals(final int lhs, final int rhs) {
    return doNotEquals(new NgInt(lhs), new NgInt(rhs));
  }

  public Object doNotEquals(final int lhs, final long rhs) {
    return doNotEquals(new NgInt(lhs), new NgLong(rhs));
  }

  public Object doNotEquals(final int lhs, final float rhs) {
    return doNotEquals(new NgInt(lhs), new NgFloat(rhs));
  }

  public Object doNotEquals(final int lhs, final double rhs) {
    return doNotEquals(new NgInt(lhs), new NgDouble(rhs));
  }

  public Object doNotEquals(final int lhs, final BigInteger rhs) {
    return doNotEquals(new NgInt(lhs), (Object)rhs);
  }

  public Object doNotEquals(final int lhs, final BigDecimal rhs) {
    return doNotEquals(new NgInt(lhs), (Object)rhs);
  }

  public Object doNotEquals(final long lhs, final byte rhs) {
    return doNotEquals(new NgLong(lhs), new NgByte(rhs));
  }

  public Object doNotEquals(final long lhs, final char rhs) {
    return doNotEquals(new NgLong(lhs), new NgChar(rhs));
  }

  public Object doNotEquals(final long lhs, final short rhs) {
    return doNotEquals(new NgLong(lhs), new NgShort(rhs));
  }

  public Object doNotEquals(final long lhs, final int rhs) {
    return doNotEquals(new NgLong(lhs), new NgInt(rhs));
  }

  public Object doNotEquals(final long lhs, final long rhs) {
    return doNotEquals(new NgLong(lhs), new NgLong(rhs));
  }

  public Object doNotEquals(final long lhs, final float rhs) {
    return doNotEquals(new NgLong(lhs), new NgFloat(rhs));
  }

  public Object doNotEquals(final long lhs, final double rhs) {
    return doNotEquals(new NgLong(lhs), new NgDouble(rhs));
  }

  public Object doNotEquals(final long lhs, final BigInteger rhs) {
    return doNotEquals(new NgLong(lhs), (Object)rhs);
  }

  public Object doNotEquals(final long lhs, final BigDecimal rhs) {
    return doNotEquals(new NgLong(lhs), (Object)rhs);
  }

  public Object doNotEquals(final float lhs, final byte rhs) {
    return doNotEquals(new NgFloat(lhs), new NgByte(rhs));
  }

  public Object doNotEquals(final float lhs, final char rhs) {
    return doNotEquals(new NgFloat(lhs), new NgChar(rhs));
  }

  public Object doNotEquals(final float lhs, final short rhs) {
    return doNotEquals(new NgFloat(lhs), new NgShort(rhs));
  }

  public Object doNotEquals(final float lhs, final int rhs) {
    return doNotEquals(new NgFloat(lhs), new NgInt(rhs));
  }

  public Object doNotEquals(final float lhs, final long rhs) {
    return doNotEquals(new NgFloat(lhs), new NgLong(rhs));
  }

  public Object doNotEquals(final float lhs, final float rhs) {
    return doNotEquals(new NgFloat(lhs), new NgFloat(rhs));
  }

  public Object doNotEquals(final float lhs, final double rhs) {
    return doNotEquals(new NgFloat(lhs), new NgDouble(rhs));
  }

  public Object doNotEquals(final float lhs, final BigInteger rhs) {
    return doNotEquals(new NgFloat(lhs), (Object)rhs);
  }

  public Object doNotEquals(final float lhs, final BigDecimal rhs) {
    return doNotEquals(new NgFloat(lhs), (Object)rhs);
  }

  public Object doNotEquals(final double lhs, final byte rhs) {
    return doNotEquals(new NgDouble(lhs), new NgByte(rhs));
  }

  public Object doNotEquals(final double lhs, final char rhs) {
    return doNotEquals(new NgDouble(lhs), new NgChar(rhs));
  }

  public Object doNotEquals(final double lhs, final short rhs) {
    return doNotEquals(new NgDouble(lhs), new NgShort(rhs));
  }

  public Object doNotEquals(final double lhs, final int rhs) {
    return doNotEquals(new NgDouble(lhs), new NgInt(rhs));
  }

  public Object doNotEquals(final double lhs, final long rhs) {
    return doNotEquals(new NgDouble(lhs), new NgLong(rhs));
  }

  public Object doNotEquals(final double lhs, final float rhs) {
    return doNotEquals(new NgDouble(lhs), new NgFloat(rhs));
  }

  public Object doNotEquals(final double lhs, final double rhs) {
    return doNotEquals(new NgDouble(lhs), new NgDouble(rhs));
  }

  public Object doNotEquals(final double lhs, final BigInteger rhs) {
    return doNotEquals(new NgDouble(lhs), (Object)rhs);
  }

  public Object doNotEquals(final double lhs, final BigDecimal rhs) {
    return doNotEquals(new NgDouble(lhs), (Object)rhs);
  }

  public Object doNotEquals(final BigInteger lhs, final byte rhs) {
    return doNotEquals((Object)lhs, new NgByte(rhs));
  }

  public Object doNotEquals(final BigInteger lhs, final char rhs) {
    return doNotEquals((Object)lhs, new NgChar(rhs));
  }

  public Object doNotEquals(final BigInteger lhs, final short rhs) {
    return doNotEquals((Object)lhs, new NgShort(rhs));
  }

  public Object doNotEquals(final BigInteger lhs, final int rhs) {
    return doNotEquals((Object)lhs, new NgInt(rhs));
  }

  public Object doNotEquals(final BigInteger lhs, final long rhs) {
    return doNotEquals((Object)lhs, new NgLong(rhs));
  }

  public Object doNotEquals(final BigInteger lhs, final float rhs) {
    return doNotEquals((Object)lhs, new NgFloat(rhs));
  }

  public Object doNotEquals(final BigInteger lhs, final double rhs) {
    return doNotEquals((Object)lhs, new NgDouble(rhs));
  }

  public Object doNotEquals(final BigInteger lhs, final BigInteger rhs) {
    return doNotEquals((Object)lhs, (Object)rhs);
  }

  public Object doNotEquals(final BigInteger lhs, final BigDecimal rhs) {
    return doNotEquals((Object)lhs, (Object)rhs);
  }

  public Object doNotEquals(final BigDecimal lhs, final byte rhs) {
    return doNotEquals((Object)lhs, new NgByte(rhs));
  }

  public Object doNotEquals(final BigDecimal lhs, final char rhs) {
    return doNotEquals((Object)lhs, new NgChar(rhs));
  }

  public Object doNotEquals(final BigDecimal lhs, final short rhs) {
    return doNotEquals((Object)lhs, new NgShort(rhs));
  }

  public Object doNotEquals(final BigDecimal lhs, final int rhs) {
    return doNotEquals((Object)lhs, new NgInt(rhs));
  }

  public Object doNotEquals(final BigDecimal lhs, final long rhs) {
    return doNotEquals((Object)lhs, new NgLong(rhs));
  }

  public Object doNotEquals(final BigDecimal lhs, final float rhs) {
    return doNotEquals((Object)lhs, new NgFloat(rhs));
  }

  public Object doNotEquals(final BigDecimal lhs, final double rhs) {
    return doNotEquals((Object)lhs, new NgDouble(rhs));
  }

  public Object doNotEquals(final BigDecimal lhs, final BigInteger rhs) {
    return doNotEquals((Object)lhs, (Object)rhs);
  }

  public Object doNotEquals(final BigDecimal lhs, final BigDecimal rhs) {
    return doNotEquals((Object)lhs, (Object)rhs);
  }

  public Object doNotEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = new NgByte(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseNotEquals(lhs, rhsObject);
  }

  public Object doNotEquals(final Object lhs, final char rhs) {
  final Object rhsObject = new NgChar(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseNotEquals(lhs, rhsObject);
  }

  public Object doNotEquals(final Object lhs, final short rhs) {
  final Object rhsObject = new NgShort(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseNotEquals(lhs, rhsObject);
  }

  public Object doNotEquals(final Object lhs, final int rhs) {
  final Object rhsObject = new NgInt(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseNotEquals(lhs, rhsObject);
  }

  public Object doNotEquals(final Object lhs, final long rhs) {
  final Object rhsObject = new NgLong(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseNotEquals(lhs, rhsObject);
  }

  public Object doNotEquals(final Object lhs, final float rhs) {
  final Object rhsObject = new NgFloat(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseNotEquals(lhs, rhsObject);
  }

  public Object doNotEquals(final Object lhs, final double rhs) {
  final Object rhsObject = new NgDouble(rhs);
    
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
  final Object lhsObject = new NgByte(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEquals(lhsObject, rhs);
  }

  public Object doReverseNotEquals(final char lhs, final Object rhs) {
  final Object lhsObject = new NgChar(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEquals(lhsObject, rhs);
  }

  public Object doReverseNotEquals(final short lhs, final Object rhs) {
  final Object lhsObject = new NgShort(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEquals(lhsObject, rhs);
  }

  public Object doReverseNotEquals(final int lhs, final Object rhs) {
  final Object lhsObject = new NgInt(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEquals(lhsObject, rhs);
  }

  public Object doReverseNotEquals(final long lhs, final Object rhs) {
  final Object lhsObject = new NgLong(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEquals(lhsObject, rhs);
  }

  public Object doReverseNotEquals(final float lhs, final Object rhs) {
  final Object lhsObject = new NgFloat(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEquals(lhsObject, rhs);
  }

  public Object doReverseNotEquals(final double lhs, final Object rhs) {
  final Object lhsObject = new NgDouble(lhs);
    
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
  final Object result = this.instanceHandler.lessThan(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThan(lhs, rhs);
    } else {
      return result;
    }
  }
  
  public Object doReverseLessThan(final Object lhs, final Object rhs) {
    return this.instanceHandler.reverseLessThan(lhs, rhs);
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doLessThan(final byte lhs, final byte rhs) {
    return doLessThan(new NgByte(lhs), new NgByte(rhs));
  }

  public Object doLessThan(final byte lhs, final char rhs) {
    return doLessThan(new NgByte(lhs), new NgChar(rhs));
  }

  public Object doLessThan(final byte lhs, final short rhs) {
    return doLessThan(new NgByte(lhs), new NgShort(rhs));
  }

  public Object doLessThan(final byte lhs, final int rhs) {
    return doLessThan(new NgByte(lhs), new NgInt(rhs));
  }

  public Object doLessThan(final byte lhs, final long rhs) {
    return doLessThan(new NgByte(lhs), new NgLong(rhs));
  }

  public Object doLessThan(final byte lhs, final float rhs) {
    return doLessThan(new NgByte(lhs), new NgFloat(rhs));
  }

  public Object doLessThan(final byte lhs, final double rhs) {
    return doLessThan(new NgByte(lhs), new NgDouble(rhs));
  }

  public Object doLessThan(final byte lhs, final BigInteger rhs) {
    return doLessThan(new NgByte(lhs), (Object)rhs);
  }

  public Object doLessThan(final byte lhs, final BigDecimal rhs) {
    return doLessThan(new NgByte(lhs), (Object)rhs);
  }

  public Object doLessThan(final char lhs, final byte rhs) {
    return doLessThan(new NgChar(lhs), new NgByte(rhs));
  }

  public Object doLessThan(final char lhs, final char rhs) {
    return doLessThan(new NgChar(lhs), new NgChar(rhs));
  }

  public Object doLessThan(final char lhs, final short rhs) {
    return doLessThan(new NgChar(lhs), new NgShort(rhs));
  }

  public Object doLessThan(final char lhs, final int rhs) {
    return doLessThan(new NgChar(lhs), new NgInt(rhs));
  }

  public Object doLessThan(final char lhs, final long rhs) {
    return doLessThan(new NgChar(lhs), new NgLong(rhs));
  }

  public Object doLessThan(final char lhs, final float rhs) {
    return doLessThan(new NgChar(lhs), new NgFloat(rhs));
  }

  public Object doLessThan(final char lhs, final double rhs) {
    return doLessThan(new NgChar(lhs), new NgDouble(rhs));
  }

  public Object doLessThan(final char lhs, final BigInteger rhs) {
    return doLessThan(new NgChar(lhs), (Object)rhs);
  }

  public Object doLessThan(final char lhs, final BigDecimal rhs) {
    return doLessThan(new NgChar(lhs), (Object)rhs);
  }

  public Object doLessThan(final short lhs, final byte rhs) {
    return doLessThan(new NgShort(lhs), new NgByte(rhs));
  }

  public Object doLessThan(final short lhs, final char rhs) {
    return doLessThan(new NgShort(lhs), new NgChar(rhs));
  }

  public Object doLessThan(final short lhs, final short rhs) {
    return doLessThan(new NgShort(lhs), new NgShort(rhs));
  }

  public Object doLessThan(final short lhs, final int rhs) {
    return doLessThan(new NgShort(lhs), new NgInt(rhs));
  }

  public Object doLessThan(final short lhs, final long rhs) {
    return doLessThan(new NgShort(lhs), new NgLong(rhs));
  }

  public Object doLessThan(final short lhs, final float rhs) {
    return doLessThan(new NgShort(lhs), new NgFloat(rhs));
  }

  public Object doLessThan(final short lhs, final double rhs) {
    return doLessThan(new NgShort(lhs), new NgDouble(rhs));
  }

  public Object doLessThan(final short lhs, final BigInteger rhs) {
    return doLessThan(new NgShort(lhs), (Object)rhs);
  }

  public Object doLessThan(final short lhs, final BigDecimal rhs) {
    return doLessThan(new NgShort(lhs), (Object)rhs);
  }

  public Object doLessThan(final int lhs, final byte rhs) {
    return doLessThan(new NgInt(lhs), new NgByte(rhs));
  }

  public Object doLessThan(final int lhs, final char rhs) {
    return doLessThan(new NgInt(lhs), new NgChar(rhs));
  }

  public Object doLessThan(final int lhs, final short rhs) {
    return doLessThan(new NgInt(lhs), new NgShort(rhs));
  }

  public Object doLessThan(final int lhs, final int rhs) {
    return doLessThan(new NgInt(lhs), new NgInt(rhs));
  }

  public Object doLessThan(final int lhs, final long rhs) {
    return doLessThan(new NgInt(lhs), new NgLong(rhs));
  }

  public Object doLessThan(final int lhs, final float rhs) {
    return doLessThan(new NgInt(lhs), new NgFloat(rhs));
  }

  public Object doLessThan(final int lhs, final double rhs) {
    return doLessThan(new NgInt(lhs), new NgDouble(rhs));
  }

  public Object doLessThan(final int lhs, final BigInteger rhs) {
    return doLessThan(new NgInt(lhs), (Object)rhs);
  }

  public Object doLessThan(final int lhs, final BigDecimal rhs) {
    return doLessThan(new NgInt(lhs), (Object)rhs);
  }

  public Object doLessThan(final long lhs, final byte rhs) {
    return doLessThan(new NgLong(lhs), new NgByte(rhs));
  }

  public Object doLessThan(final long lhs, final char rhs) {
    return doLessThan(new NgLong(lhs), new NgChar(rhs));
  }

  public Object doLessThan(final long lhs, final short rhs) {
    return doLessThan(new NgLong(lhs), new NgShort(rhs));
  }

  public Object doLessThan(final long lhs, final int rhs) {
    return doLessThan(new NgLong(lhs), new NgInt(rhs));
  }

  public Object doLessThan(final long lhs, final long rhs) {
    return doLessThan(new NgLong(lhs), new NgLong(rhs));
  }

  public Object doLessThan(final long lhs, final float rhs) {
    return doLessThan(new NgLong(lhs), new NgFloat(rhs));
  }

  public Object doLessThan(final long lhs, final double rhs) {
    return doLessThan(new NgLong(lhs), new NgDouble(rhs));
  }

  public Object doLessThan(final long lhs, final BigInteger rhs) {
    return doLessThan(new NgLong(lhs), (Object)rhs);
  }

  public Object doLessThan(final long lhs, final BigDecimal rhs) {
    return doLessThan(new NgLong(lhs), (Object)rhs);
  }

  public Object doLessThan(final float lhs, final byte rhs) {
    return doLessThan(new NgFloat(lhs), new NgByte(rhs));
  }

  public Object doLessThan(final float lhs, final char rhs) {
    return doLessThan(new NgFloat(lhs), new NgChar(rhs));
  }

  public Object doLessThan(final float lhs, final short rhs) {
    return doLessThan(new NgFloat(lhs), new NgShort(rhs));
  }

  public Object doLessThan(final float lhs, final int rhs) {
    return doLessThan(new NgFloat(lhs), new NgInt(rhs));
  }

  public Object doLessThan(final float lhs, final long rhs) {
    return doLessThan(new NgFloat(lhs), new NgLong(rhs));
  }

  public Object doLessThan(final float lhs, final float rhs) {
    return doLessThan(new NgFloat(lhs), new NgFloat(rhs));
  }

  public Object doLessThan(final float lhs, final double rhs) {
    return doLessThan(new NgFloat(lhs), new NgDouble(rhs));
  }

  public Object doLessThan(final float lhs, final BigInteger rhs) {
    return doLessThan(new NgFloat(lhs), (Object)rhs);
  }

  public Object doLessThan(final float lhs, final BigDecimal rhs) {
    return doLessThan(new NgFloat(lhs), (Object)rhs);
  }

  public Object doLessThan(final double lhs, final byte rhs) {
    return doLessThan(new NgDouble(lhs), new NgByte(rhs));
  }

  public Object doLessThan(final double lhs, final char rhs) {
    return doLessThan(new NgDouble(lhs), new NgChar(rhs));
  }

  public Object doLessThan(final double lhs, final short rhs) {
    return doLessThan(new NgDouble(lhs), new NgShort(rhs));
  }

  public Object doLessThan(final double lhs, final int rhs) {
    return doLessThan(new NgDouble(lhs), new NgInt(rhs));
  }

  public Object doLessThan(final double lhs, final long rhs) {
    return doLessThan(new NgDouble(lhs), new NgLong(rhs));
  }

  public Object doLessThan(final double lhs, final float rhs) {
    return doLessThan(new NgDouble(lhs), new NgFloat(rhs));
  }

  public Object doLessThan(final double lhs, final double rhs) {
    return doLessThan(new NgDouble(lhs), new NgDouble(rhs));
  }

  public Object doLessThan(final double lhs, final BigInteger rhs) {
    return doLessThan(new NgDouble(lhs), (Object)rhs);
  }

  public Object doLessThan(final double lhs, final BigDecimal rhs) {
    return doLessThan(new NgDouble(lhs), (Object)rhs);
  }

  public Object doLessThan(final BigInteger lhs, final byte rhs) {
    return doLessThan((Object)lhs, new NgByte(rhs));
  }

  public Object doLessThan(final BigInteger lhs, final char rhs) {
    return doLessThan((Object)lhs, new NgChar(rhs));
  }

  public Object doLessThan(final BigInteger lhs, final short rhs) {
    return doLessThan((Object)lhs, new NgShort(rhs));
  }

  public Object doLessThan(final BigInteger lhs, final int rhs) {
    return doLessThan((Object)lhs, new NgInt(rhs));
  }

  public Object doLessThan(final BigInteger lhs, final long rhs) {
    return doLessThan((Object)lhs, new NgLong(rhs));
  }

  public Object doLessThan(final BigInteger lhs, final float rhs) {
    return doLessThan((Object)lhs, new NgFloat(rhs));
  }

  public Object doLessThan(final BigInteger lhs, final double rhs) {
    return doLessThan((Object)lhs, new NgDouble(rhs));
  }

  public Object doLessThan(final BigInteger lhs, final BigInteger rhs) {
    return doLessThan((Object)lhs, (Object)rhs);
  }

  public Object doLessThan(final BigInteger lhs, final BigDecimal rhs) {
    return doLessThan((Object)lhs, (Object)rhs);
  }

  public Object doLessThan(final BigDecimal lhs, final byte rhs) {
    return doLessThan((Object)lhs, new NgByte(rhs));
  }

  public Object doLessThan(final BigDecimal lhs, final char rhs) {
    return doLessThan((Object)lhs, new NgChar(rhs));
  }

  public Object doLessThan(final BigDecimal lhs, final short rhs) {
    return doLessThan((Object)lhs, new NgShort(rhs));
  }

  public Object doLessThan(final BigDecimal lhs, final int rhs) {
    return doLessThan((Object)lhs, new NgInt(rhs));
  }

  public Object doLessThan(final BigDecimal lhs, final long rhs) {
    return doLessThan((Object)lhs, new NgLong(rhs));
  }

  public Object doLessThan(final BigDecimal lhs, final float rhs) {
    return doLessThan((Object)lhs, new NgFloat(rhs));
  }

  public Object doLessThan(final BigDecimal lhs, final double rhs) {
    return doLessThan((Object)lhs, new NgDouble(rhs));
  }

  public Object doLessThan(final BigDecimal lhs, final BigInteger rhs) {
    return doLessThan((Object)lhs, (Object)rhs);
  }

  public Object doLessThan(final BigDecimal lhs, final BigDecimal rhs) {
    return doLessThan((Object)lhs, (Object)rhs);
  }

  public Object doLessThan(final Object lhs, final byte rhs) {
  final Object rhsObject = new NgByte(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLessThan(lhs, rhsObject);
  }

  public Object doLessThan(final Object lhs, final char rhs) {
  final Object rhsObject = new NgChar(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLessThan(lhs, rhsObject);
  }

  public Object doLessThan(final Object lhs, final short rhs) {
  final Object rhsObject = new NgShort(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLessThan(lhs, rhsObject);
  }

  public Object doLessThan(final Object lhs, final int rhs) {
  final Object rhsObject = new NgInt(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLessThan(lhs, rhsObject);
  }

  public Object doLessThan(final Object lhs, final long rhs) {
  final Object rhsObject = new NgLong(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLessThan(lhs, rhsObject);
  }

  public Object doLessThan(final Object lhs, final float rhs) {
  final Object rhsObject = new NgFloat(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLessThan(lhs, rhsObject);
  }

  public Object doLessThan(final Object lhs, final double rhs) {
  final Object rhsObject = new NgDouble(rhs);
    
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
  final Object lhsObject = new NgByte(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThan(lhsObject, rhs);
  }

  public Object doReverseLessThan(final char lhs, final Object rhs) {
  final Object lhsObject = new NgChar(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThan(lhsObject, rhs);
  }

  public Object doReverseLessThan(final short lhs, final Object rhs) {
  final Object lhsObject = new NgShort(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThan(lhsObject, rhs);
  }

  public Object doReverseLessThan(final int lhs, final Object rhs) {
  final Object lhsObject = new NgInt(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThan(lhsObject, rhs);
  }

  public Object doReverseLessThan(final long lhs, final Object rhs) {
  final Object lhsObject = new NgLong(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThan(lhsObject, rhs);
  }

  public Object doReverseLessThan(final float lhs, final Object rhs) {
  final Object lhsObject = new NgFloat(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThan(lhsObject, rhs);
  }

  public Object doReverseLessThan(final double lhs, final Object rhs) {
  final Object lhsObject = new NgDouble(lhs);
    
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
  final Object result = this.instanceHandler.lessThanOrEquals(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEquals(lhs, rhs);
    } else {
      return result;
    }
  }
  
  public Object doReverseLessThanOrEquals(final Object lhs, final Object rhs) {
    return this.instanceHandler.reverseLessThanOrEquals(lhs, rhs);
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doLessThanOrEquals(final byte lhs, final byte rhs) {
    return doLessThanOrEquals(new NgByte(lhs), new NgByte(rhs));
  }

  public Object doLessThanOrEquals(final byte lhs, final char rhs) {
    return doLessThanOrEquals(new NgByte(lhs), new NgChar(rhs));
  }

  public Object doLessThanOrEquals(final byte lhs, final short rhs) {
    return doLessThanOrEquals(new NgByte(lhs), new NgShort(rhs));
  }

  public Object doLessThanOrEquals(final byte lhs, final int rhs) {
    return doLessThanOrEquals(new NgByte(lhs), new NgInt(rhs));
  }

  public Object doLessThanOrEquals(final byte lhs, final long rhs) {
    return doLessThanOrEquals(new NgByte(lhs), new NgLong(rhs));
  }

  public Object doLessThanOrEquals(final byte lhs, final float rhs) {
    return doLessThanOrEquals(new NgByte(lhs), new NgFloat(rhs));
  }

  public Object doLessThanOrEquals(final byte lhs, final double rhs) {
    return doLessThanOrEquals(new NgByte(lhs), new NgDouble(rhs));
  }

  public Object doLessThanOrEquals(final byte lhs, final BigInteger rhs) {
    return doLessThanOrEquals(new NgByte(lhs), (Object)rhs);
  }

  public Object doLessThanOrEquals(final byte lhs, final BigDecimal rhs) {
    return doLessThanOrEquals(new NgByte(lhs), (Object)rhs);
  }

  public Object doLessThanOrEquals(final char lhs, final byte rhs) {
    return doLessThanOrEquals(new NgChar(lhs), new NgByte(rhs));
  }

  public Object doLessThanOrEquals(final char lhs, final char rhs) {
    return doLessThanOrEquals(new NgChar(lhs), new NgChar(rhs));
  }

  public Object doLessThanOrEquals(final char lhs, final short rhs) {
    return doLessThanOrEquals(new NgChar(lhs), new NgShort(rhs));
  }

  public Object doLessThanOrEquals(final char lhs, final int rhs) {
    return doLessThanOrEquals(new NgChar(lhs), new NgInt(rhs));
  }

  public Object doLessThanOrEquals(final char lhs, final long rhs) {
    return doLessThanOrEquals(new NgChar(lhs), new NgLong(rhs));
  }

  public Object doLessThanOrEquals(final char lhs, final float rhs) {
    return doLessThanOrEquals(new NgChar(lhs), new NgFloat(rhs));
  }

  public Object doLessThanOrEquals(final char lhs, final double rhs) {
    return doLessThanOrEquals(new NgChar(lhs), new NgDouble(rhs));
  }

  public Object doLessThanOrEquals(final char lhs, final BigInteger rhs) {
    return doLessThanOrEquals(new NgChar(lhs), (Object)rhs);
  }

  public Object doLessThanOrEquals(final char lhs, final BigDecimal rhs) {
    return doLessThanOrEquals(new NgChar(lhs), (Object)rhs);
  }

  public Object doLessThanOrEquals(final short lhs, final byte rhs) {
    return doLessThanOrEquals(new NgShort(lhs), new NgByte(rhs));
  }

  public Object doLessThanOrEquals(final short lhs, final char rhs) {
    return doLessThanOrEquals(new NgShort(lhs), new NgChar(rhs));
  }

  public Object doLessThanOrEquals(final short lhs, final short rhs) {
    return doLessThanOrEquals(new NgShort(lhs), new NgShort(rhs));
  }

  public Object doLessThanOrEquals(final short lhs, final int rhs) {
    return doLessThanOrEquals(new NgShort(lhs), new NgInt(rhs));
  }

  public Object doLessThanOrEquals(final short lhs, final long rhs) {
    return doLessThanOrEquals(new NgShort(lhs), new NgLong(rhs));
  }

  public Object doLessThanOrEquals(final short lhs, final float rhs) {
    return doLessThanOrEquals(new NgShort(lhs), new NgFloat(rhs));
  }

  public Object doLessThanOrEquals(final short lhs, final double rhs) {
    return doLessThanOrEquals(new NgShort(lhs), new NgDouble(rhs));
  }

  public Object doLessThanOrEquals(final short lhs, final BigInteger rhs) {
    return doLessThanOrEquals(new NgShort(lhs), (Object)rhs);
  }

  public Object doLessThanOrEquals(final short lhs, final BigDecimal rhs) {
    return doLessThanOrEquals(new NgShort(lhs), (Object)rhs);
  }

  public Object doLessThanOrEquals(final int lhs, final byte rhs) {
    return doLessThanOrEquals(new NgInt(lhs), new NgByte(rhs));
  }

  public Object doLessThanOrEquals(final int lhs, final char rhs) {
    return doLessThanOrEquals(new NgInt(lhs), new NgChar(rhs));
  }

  public Object doLessThanOrEquals(final int lhs, final short rhs) {
    return doLessThanOrEquals(new NgInt(lhs), new NgShort(rhs));
  }

  public Object doLessThanOrEquals(final int lhs, final int rhs) {
    return doLessThanOrEquals(new NgInt(lhs), new NgInt(rhs));
  }

  public Object doLessThanOrEquals(final int lhs, final long rhs) {
    return doLessThanOrEquals(new NgInt(lhs), new NgLong(rhs));
  }

  public Object doLessThanOrEquals(final int lhs, final float rhs) {
    return doLessThanOrEquals(new NgInt(lhs), new NgFloat(rhs));
  }

  public Object doLessThanOrEquals(final int lhs, final double rhs) {
    return doLessThanOrEquals(new NgInt(lhs), new NgDouble(rhs));
  }

  public Object doLessThanOrEquals(final int lhs, final BigInteger rhs) {
    return doLessThanOrEquals(new NgInt(lhs), (Object)rhs);
  }

  public Object doLessThanOrEquals(final int lhs, final BigDecimal rhs) {
    return doLessThanOrEquals(new NgInt(lhs), (Object)rhs);
  }

  public Object doLessThanOrEquals(final long lhs, final byte rhs) {
    return doLessThanOrEquals(new NgLong(lhs), new NgByte(rhs));
  }

  public Object doLessThanOrEquals(final long lhs, final char rhs) {
    return doLessThanOrEquals(new NgLong(lhs), new NgChar(rhs));
  }

  public Object doLessThanOrEquals(final long lhs, final short rhs) {
    return doLessThanOrEquals(new NgLong(lhs), new NgShort(rhs));
  }

  public Object doLessThanOrEquals(final long lhs, final int rhs) {
    return doLessThanOrEquals(new NgLong(lhs), new NgInt(rhs));
  }

  public Object doLessThanOrEquals(final long lhs, final long rhs) {
    return doLessThanOrEquals(new NgLong(lhs), new NgLong(rhs));
  }

  public Object doLessThanOrEquals(final long lhs, final float rhs) {
    return doLessThanOrEquals(new NgLong(lhs), new NgFloat(rhs));
  }

  public Object doLessThanOrEquals(final long lhs, final double rhs) {
    return doLessThanOrEquals(new NgLong(lhs), new NgDouble(rhs));
  }

  public Object doLessThanOrEquals(final long lhs, final BigInteger rhs) {
    return doLessThanOrEquals(new NgLong(lhs), (Object)rhs);
  }

  public Object doLessThanOrEquals(final long lhs, final BigDecimal rhs) {
    return doLessThanOrEquals(new NgLong(lhs), (Object)rhs);
  }

  public Object doLessThanOrEquals(final float lhs, final byte rhs) {
    return doLessThanOrEquals(new NgFloat(lhs), new NgByte(rhs));
  }

  public Object doLessThanOrEquals(final float lhs, final char rhs) {
    return doLessThanOrEquals(new NgFloat(lhs), new NgChar(rhs));
  }

  public Object doLessThanOrEquals(final float lhs, final short rhs) {
    return doLessThanOrEquals(new NgFloat(lhs), new NgShort(rhs));
  }

  public Object doLessThanOrEquals(final float lhs, final int rhs) {
    return doLessThanOrEquals(new NgFloat(lhs), new NgInt(rhs));
  }

  public Object doLessThanOrEquals(final float lhs, final long rhs) {
    return doLessThanOrEquals(new NgFloat(lhs), new NgLong(rhs));
  }

  public Object doLessThanOrEquals(final float lhs, final float rhs) {
    return doLessThanOrEquals(new NgFloat(lhs), new NgFloat(rhs));
  }

  public Object doLessThanOrEquals(final float lhs, final double rhs) {
    return doLessThanOrEquals(new NgFloat(lhs), new NgDouble(rhs));
  }

  public Object doLessThanOrEquals(final float lhs, final BigInteger rhs) {
    return doLessThanOrEquals(new NgFloat(lhs), (Object)rhs);
  }

  public Object doLessThanOrEquals(final float lhs, final BigDecimal rhs) {
    return doLessThanOrEquals(new NgFloat(lhs), (Object)rhs);
  }

  public Object doLessThanOrEquals(final double lhs, final byte rhs) {
    return doLessThanOrEquals(new NgDouble(lhs), new NgByte(rhs));
  }

  public Object doLessThanOrEquals(final double lhs, final char rhs) {
    return doLessThanOrEquals(new NgDouble(lhs), new NgChar(rhs));
  }

  public Object doLessThanOrEquals(final double lhs, final short rhs) {
    return doLessThanOrEquals(new NgDouble(lhs), new NgShort(rhs));
  }

  public Object doLessThanOrEquals(final double lhs, final int rhs) {
    return doLessThanOrEquals(new NgDouble(lhs), new NgInt(rhs));
  }

  public Object doLessThanOrEquals(final double lhs, final long rhs) {
    return doLessThanOrEquals(new NgDouble(lhs), new NgLong(rhs));
  }

  public Object doLessThanOrEquals(final double lhs, final float rhs) {
    return doLessThanOrEquals(new NgDouble(lhs), new NgFloat(rhs));
  }

  public Object doLessThanOrEquals(final double lhs, final double rhs) {
    return doLessThanOrEquals(new NgDouble(lhs), new NgDouble(rhs));
  }

  public Object doLessThanOrEquals(final double lhs, final BigInteger rhs) {
    return doLessThanOrEquals(new NgDouble(lhs), (Object)rhs);
  }

  public Object doLessThanOrEquals(final double lhs, final BigDecimal rhs) {
    return doLessThanOrEquals(new NgDouble(lhs), (Object)rhs);
  }

  public Object doLessThanOrEquals(final BigInteger lhs, final byte rhs) {
    return doLessThanOrEquals((Object)lhs, new NgByte(rhs));
  }

  public Object doLessThanOrEquals(final BigInteger lhs, final char rhs) {
    return doLessThanOrEquals((Object)lhs, new NgChar(rhs));
  }

  public Object doLessThanOrEquals(final BigInteger lhs, final short rhs) {
    return doLessThanOrEquals((Object)lhs, new NgShort(rhs));
  }

  public Object doLessThanOrEquals(final BigInteger lhs, final int rhs) {
    return doLessThanOrEquals((Object)lhs, new NgInt(rhs));
  }

  public Object doLessThanOrEquals(final BigInteger lhs, final long rhs) {
    return doLessThanOrEquals((Object)lhs, new NgLong(rhs));
  }

  public Object doLessThanOrEquals(final BigInteger lhs, final float rhs) {
    return doLessThanOrEquals((Object)lhs, new NgFloat(rhs));
  }

  public Object doLessThanOrEquals(final BigInteger lhs, final double rhs) {
    return doLessThanOrEquals((Object)lhs, new NgDouble(rhs));
  }

  public Object doLessThanOrEquals(final BigInteger lhs, final BigInteger rhs) {
    return doLessThanOrEquals((Object)lhs, (Object)rhs);
  }

  public Object doLessThanOrEquals(final BigInteger lhs, final BigDecimal rhs) {
    return doLessThanOrEquals((Object)lhs, (Object)rhs);
  }

  public Object doLessThanOrEquals(final BigDecimal lhs, final byte rhs) {
    return doLessThanOrEquals((Object)lhs, new NgByte(rhs));
  }

  public Object doLessThanOrEquals(final BigDecimal lhs, final char rhs) {
    return doLessThanOrEquals((Object)lhs, new NgChar(rhs));
  }

  public Object doLessThanOrEquals(final BigDecimal lhs, final short rhs) {
    return doLessThanOrEquals((Object)lhs, new NgShort(rhs));
  }

  public Object doLessThanOrEquals(final BigDecimal lhs, final int rhs) {
    return doLessThanOrEquals((Object)lhs, new NgInt(rhs));
  }

  public Object doLessThanOrEquals(final BigDecimal lhs, final long rhs) {
    return doLessThanOrEquals((Object)lhs, new NgLong(rhs));
  }

  public Object doLessThanOrEquals(final BigDecimal lhs, final float rhs) {
    return doLessThanOrEquals((Object)lhs, new NgFloat(rhs));
  }

  public Object doLessThanOrEquals(final BigDecimal lhs, final double rhs) {
    return doLessThanOrEquals((Object)lhs, new NgDouble(rhs));
  }

  public Object doLessThanOrEquals(final BigDecimal lhs, final BigInteger rhs) {
    return doLessThanOrEquals((Object)lhs, (Object)rhs);
  }

  public Object doLessThanOrEquals(final BigDecimal lhs, final BigDecimal rhs) {
    return doLessThanOrEquals((Object)lhs, (Object)rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = new NgByte(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLessThanOrEquals(lhs, rhsObject);
  }

  public Object doLessThanOrEquals(final Object lhs, final char rhs) {
  final Object rhsObject = new NgChar(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLessThanOrEquals(lhs, rhsObject);
  }

  public Object doLessThanOrEquals(final Object lhs, final short rhs) {
  final Object rhsObject = new NgShort(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLessThanOrEquals(lhs, rhsObject);
  }

  public Object doLessThanOrEquals(final Object lhs, final int rhs) {
  final Object rhsObject = new NgInt(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLessThanOrEquals(lhs, rhsObject);
  }

  public Object doLessThanOrEquals(final Object lhs, final long rhs) {
  final Object rhsObject = new NgLong(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLessThanOrEquals(lhs, rhsObject);
  }

  public Object doLessThanOrEquals(final Object lhs, final float rhs) {
  final Object rhsObject = new NgFloat(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseLessThanOrEquals(lhs, rhsObject);
  }

  public Object doLessThanOrEquals(final Object lhs, final double rhs) {
  final Object rhsObject = new NgDouble(rhs);
    
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
  final Object lhsObject = new NgByte(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEquals(lhsObject, rhs);
  }

  public Object doReverseLessThanOrEquals(final char lhs, final Object rhs) {
  final Object lhsObject = new NgChar(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEquals(lhsObject, rhs);
  }

  public Object doReverseLessThanOrEquals(final short lhs, final Object rhs) {
  final Object lhsObject = new NgShort(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEquals(lhsObject, rhs);
  }

  public Object doReverseLessThanOrEquals(final int lhs, final Object rhs) {
  final Object lhsObject = new NgInt(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEquals(lhsObject, rhs);
  }

  public Object doReverseLessThanOrEquals(final long lhs, final Object rhs) {
  final Object lhsObject = new NgLong(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEquals(lhsObject, rhs);
  }

  public Object doReverseLessThanOrEquals(final float lhs, final Object rhs) {
  final Object lhsObject = new NgFloat(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEquals(lhsObject, rhs);
  }

  public Object doReverseLessThanOrEquals(final double lhs, final Object rhs) {
  final Object lhsObject = new NgDouble(lhs);
    
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
  final Object result = this.instanceHandler.greaterThan(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThan(lhs, rhs);
    } else {
      return result;
    }
  }
  
  public Object doReverseGreaterThan(final Object lhs, final Object rhs) {
    return this.instanceHandler.reverseGreaterThan(lhs, rhs);
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doGreaterThan(final byte lhs, final byte rhs) {
    return doGreaterThan(new NgByte(lhs), new NgByte(rhs));
  }

  public Object doGreaterThan(final byte lhs, final char rhs) {
    return doGreaterThan(new NgByte(lhs), new NgChar(rhs));
  }

  public Object doGreaterThan(final byte lhs, final short rhs) {
    return doGreaterThan(new NgByte(lhs), new NgShort(rhs));
  }

  public Object doGreaterThan(final byte lhs, final int rhs) {
    return doGreaterThan(new NgByte(lhs), new NgInt(rhs));
  }

  public Object doGreaterThan(final byte lhs, final long rhs) {
    return doGreaterThan(new NgByte(lhs), new NgLong(rhs));
  }

  public Object doGreaterThan(final byte lhs, final float rhs) {
    return doGreaterThan(new NgByte(lhs), new NgFloat(rhs));
  }

  public Object doGreaterThan(final byte lhs, final double rhs) {
    return doGreaterThan(new NgByte(lhs), new NgDouble(rhs));
  }

  public Object doGreaterThan(final byte lhs, final BigInteger rhs) {
    return doGreaterThan(new NgByte(lhs), (Object)rhs);
  }

  public Object doGreaterThan(final byte lhs, final BigDecimal rhs) {
    return doGreaterThan(new NgByte(lhs), (Object)rhs);
  }

  public Object doGreaterThan(final char lhs, final byte rhs) {
    return doGreaterThan(new NgChar(lhs), new NgByte(rhs));
  }

  public Object doGreaterThan(final char lhs, final char rhs) {
    return doGreaterThan(new NgChar(lhs), new NgChar(rhs));
  }

  public Object doGreaterThan(final char lhs, final short rhs) {
    return doGreaterThan(new NgChar(lhs), new NgShort(rhs));
  }

  public Object doGreaterThan(final char lhs, final int rhs) {
    return doGreaterThan(new NgChar(lhs), new NgInt(rhs));
  }

  public Object doGreaterThan(final char lhs, final long rhs) {
    return doGreaterThan(new NgChar(lhs), new NgLong(rhs));
  }

  public Object doGreaterThan(final char lhs, final float rhs) {
    return doGreaterThan(new NgChar(lhs), new NgFloat(rhs));
  }

  public Object doGreaterThan(final char lhs, final double rhs) {
    return doGreaterThan(new NgChar(lhs), new NgDouble(rhs));
  }

  public Object doGreaterThan(final char lhs, final BigInteger rhs) {
    return doGreaterThan(new NgChar(lhs), (Object)rhs);
  }

  public Object doGreaterThan(final char lhs, final BigDecimal rhs) {
    return doGreaterThan(new NgChar(lhs), (Object)rhs);
  }

  public Object doGreaterThan(final short lhs, final byte rhs) {
    return doGreaterThan(new NgShort(lhs), new NgByte(rhs));
  }

  public Object doGreaterThan(final short lhs, final char rhs) {
    return doGreaterThan(new NgShort(lhs), new NgChar(rhs));
  }

  public Object doGreaterThan(final short lhs, final short rhs) {
    return doGreaterThan(new NgShort(lhs), new NgShort(rhs));
  }

  public Object doGreaterThan(final short lhs, final int rhs) {
    return doGreaterThan(new NgShort(lhs), new NgInt(rhs));
  }

  public Object doGreaterThan(final short lhs, final long rhs) {
    return doGreaterThan(new NgShort(lhs), new NgLong(rhs));
  }

  public Object doGreaterThan(final short lhs, final float rhs) {
    return doGreaterThan(new NgShort(lhs), new NgFloat(rhs));
  }

  public Object doGreaterThan(final short lhs, final double rhs) {
    return doGreaterThan(new NgShort(lhs), new NgDouble(rhs));
  }

  public Object doGreaterThan(final short lhs, final BigInteger rhs) {
    return doGreaterThan(new NgShort(lhs), (Object)rhs);
  }

  public Object doGreaterThan(final short lhs, final BigDecimal rhs) {
    return doGreaterThan(new NgShort(lhs), (Object)rhs);
  }

  public Object doGreaterThan(final int lhs, final byte rhs) {
    return doGreaterThan(new NgInt(lhs), new NgByte(rhs));
  }

  public Object doGreaterThan(final int lhs, final char rhs) {
    return doGreaterThan(new NgInt(lhs), new NgChar(rhs));
  }

  public Object doGreaterThan(final int lhs, final short rhs) {
    return doGreaterThan(new NgInt(lhs), new NgShort(rhs));
  }

  public Object doGreaterThan(final int lhs, final int rhs) {
    return doGreaterThan(new NgInt(lhs), new NgInt(rhs));
  }

  public Object doGreaterThan(final int lhs, final long rhs) {
    return doGreaterThan(new NgInt(lhs), new NgLong(rhs));
  }

  public Object doGreaterThan(final int lhs, final float rhs) {
    return doGreaterThan(new NgInt(lhs), new NgFloat(rhs));
  }

  public Object doGreaterThan(final int lhs, final double rhs) {
    return doGreaterThan(new NgInt(lhs), new NgDouble(rhs));
  }

  public Object doGreaterThan(final int lhs, final BigInteger rhs) {
    return doGreaterThan(new NgInt(lhs), (Object)rhs);
  }

  public Object doGreaterThan(final int lhs, final BigDecimal rhs) {
    return doGreaterThan(new NgInt(lhs), (Object)rhs);
  }

  public Object doGreaterThan(final long lhs, final byte rhs) {
    return doGreaterThan(new NgLong(lhs), new NgByte(rhs));
  }

  public Object doGreaterThan(final long lhs, final char rhs) {
    return doGreaterThan(new NgLong(lhs), new NgChar(rhs));
  }

  public Object doGreaterThan(final long lhs, final short rhs) {
    return doGreaterThan(new NgLong(lhs), new NgShort(rhs));
  }

  public Object doGreaterThan(final long lhs, final int rhs) {
    return doGreaterThan(new NgLong(lhs), new NgInt(rhs));
  }

  public Object doGreaterThan(final long lhs, final long rhs) {
    return doGreaterThan(new NgLong(lhs), new NgLong(rhs));
  }

  public Object doGreaterThan(final long lhs, final float rhs) {
    return doGreaterThan(new NgLong(lhs), new NgFloat(rhs));
  }

  public Object doGreaterThan(final long lhs, final double rhs) {
    return doGreaterThan(new NgLong(lhs), new NgDouble(rhs));
  }

  public Object doGreaterThan(final long lhs, final BigInteger rhs) {
    return doGreaterThan(new NgLong(lhs), (Object)rhs);
  }

  public Object doGreaterThan(final long lhs, final BigDecimal rhs) {
    return doGreaterThan(new NgLong(lhs), (Object)rhs);
  }

  public Object doGreaterThan(final float lhs, final byte rhs) {
    return doGreaterThan(new NgFloat(lhs), new NgByte(rhs));
  }

  public Object doGreaterThan(final float lhs, final char rhs) {
    return doGreaterThan(new NgFloat(lhs), new NgChar(rhs));
  }

  public Object doGreaterThan(final float lhs, final short rhs) {
    return doGreaterThan(new NgFloat(lhs), new NgShort(rhs));
  }

  public Object doGreaterThan(final float lhs, final int rhs) {
    return doGreaterThan(new NgFloat(lhs), new NgInt(rhs));
  }

  public Object doGreaterThan(final float lhs, final long rhs) {
    return doGreaterThan(new NgFloat(lhs), new NgLong(rhs));
  }

  public Object doGreaterThan(final float lhs, final float rhs) {
    return doGreaterThan(new NgFloat(lhs), new NgFloat(rhs));
  }

  public Object doGreaterThan(final float lhs, final double rhs) {
    return doGreaterThan(new NgFloat(lhs), new NgDouble(rhs));
  }

  public Object doGreaterThan(final float lhs, final BigInteger rhs) {
    return doGreaterThan(new NgFloat(lhs), (Object)rhs);
  }

  public Object doGreaterThan(final float lhs, final BigDecimal rhs) {
    return doGreaterThan(new NgFloat(lhs), (Object)rhs);
  }

  public Object doGreaterThan(final double lhs, final byte rhs) {
    return doGreaterThan(new NgDouble(lhs), new NgByte(rhs));
  }

  public Object doGreaterThan(final double lhs, final char rhs) {
    return doGreaterThan(new NgDouble(lhs), new NgChar(rhs));
  }

  public Object doGreaterThan(final double lhs, final short rhs) {
    return doGreaterThan(new NgDouble(lhs), new NgShort(rhs));
  }

  public Object doGreaterThan(final double lhs, final int rhs) {
    return doGreaterThan(new NgDouble(lhs), new NgInt(rhs));
  }

  public Object doGreaterThan(final double lhs, final long rhs) {
    return doGreaterThan(new NgDouble(lhs), new NgLong(rhs));
  }

  public Object doGreaterThan(final double lhs, final float rhs) {
    return doGreaterThan(new NgDouble(lhs), new NgFloat(rhs));
  }

  public Object doGreaterThan(final double lhs, final double rhs) {
    return doGreaterThan(new NgDouble(lhs), new NgDouble(rhs));
  }

  public Object doGreaterThan(final double lhs, final BigInteger rhs) {
    return doGreaterThan(new NgDouble(lhs), (Object)rhs);
  }

  public Object doGreaterThan(final double lhs, final BigDecimal rhs) {
    return doGreaterThan(new NgDouble(lhs), (Object)rhs);
  }

  public Object doGreaterThan(final BigInteger lhs, final byte rhs) {
    return doGreaterThan((Object)lhs, new NgByte(rhs));
  }

  public Object doGreaterThan(final BigInteger lhs, final char rhs) {
    return doGreaterThan((Object)lhs, new NgChar(rhs));
  }

  public Object doGreaterThan(final BigInteger lhs, final short rhs) {
    return doGreaterThan((Object)lhs, new NgShort(rhs));
  }

  public Object doGreaterThan(final BigInteger lhs, final int rhs) {
    return doGreaterThan((Object)lhs, new NgInt(rhs));
  }

  public Object doGreaterThan(final BigInteger lhs, final long rhs) {
    return doGreaterThan((Object)lhs, new NgLong(rhs));
  }

  public Object doGreaterThan(final BigInteger lhs, final float rhs) {
    return doGreaterThan((Object)lhs, new NgFloat(rhs));
  }

  public Object doGreaterThan(final BigInteger lhs, final double rhs) {
    return doGreaterThan((Object)lhs, new NgDouble(rhs));
  }

  public Object doGreaterThan(final BigInteger lhs, final BigInteger rhs) {
    return doGreaterThan((Object)lhs, (Object)rhs);
  }

  public Object doGreaterThan(final BigInteger lhs, final BigDecimal rhs) {
    return doGreaterThan((Object)lhs, (Object)rhs);
  }

  public Object doGreaterThan(final BigDecimal lhs, final byte rhs) {
    return doGreaterThan((Object)lhs, new NgByte(rhs));
  }

  public Object doGreaterThan(final BigDecimal lhs, final char rhs) {
    return doGreaterThan((Object)lhs, new NgChar(rhs));
  }

  public Object doGreaterThan(final BigDecimal lhs, final short rhs) {
    return doGreaterThan((Object)lhs, new NgShort(rhs));
  }

  public Object doGreaterThan(final BigDecimal lhs, final int rhs) {
    return doGreaterThan((Object)lhs, new NgInt(rhs));
  }

  public Object doGreaterThan(final BigDecimal lhs, final long rhs) {
    return doGreaterThan((Object)lhs, new NgLong(rhs));
  }

  public Object doGreaterThan(final BigDecimal lhs, final float rhs) {
    return doGreaterThan((Object)lhs, new NgFloat(rhs));
  }

  public Object doGreaterThan(final BigDecimal lhs, final double rhs) {
    return doGreaterThan((Object)lhs, new NgDouble(rhs));
  }

  public Object doGreaterThan(final BigDecimal lhs, final BigInteger rhs) {
    return doGreaterThan((Object)lhs, (Object)rhs);
  }

  public Object doGreaterThan(final BigDecimal lhs, final BigDecimal rhs) {
    return doGreaterThan((Object)lhs, (Object)rhs);
  }

  public Object doGreaterThan(final Object lhs, final byte rhs) {
  final Object rhsObject = new NgByte(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseGreaterThan(lhs, rhsObject);
  }

  public Object doGreaterThan(final Object lhs, final char rhs) {
  final Object rhsObject = new NgChar(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseGreaterThan(lhs, rhsObject);
  }

  public Object doGreaterThan(final Object lhs, final short rhs) {
  final Object rhsObject = new NgShort(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseGreaterThan(lhs, rhsObject);
  }

  public Object doGreaterThan(final Object lhs, final int rhs) {
  final Object rhsObject = new NgInt(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseGreaterThan(lhs, rhsObject);
  }

  public Object doGreaterThan(final Object lhs, final long rhs) {
  final Object rhsObject = new NgLong(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseGreaterThan(lhs, rhsObject);
  }

  public Object doGreaterThan(final Object lhs, final float rhs) {
  final Object rhsObject = new NgFloat(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseGreaterThan(lhs, rhsObject);
  }

  public Object doGreaterThan(final Object lhs, final double rhs) {
  final Object rhsObject = new NgDouble(rhs);
    
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
  final Object lhsObject = new NgByte(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThan(lhsObject, rhs);
  }

  public Object doReverseGreaterThan(final char lhs, final Object rhs) {
  final Object lhsObject = new NgChar(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThan(lhsObject, rhs);
  }

  public Object doReverseGreaterThan(final short lhs, final Object rhs) {
  final Object lhsObject = new NgShort(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThan(lhsObject, rhs);
  }

  public Object doReverseGreaterThan(final int lhs, final Object rhs) {
  final Object lhsObject = new NgInt(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThan(lhsObject, rhs);
  }

  public Object doReverseGreaterThan(final long lhs, final Object rhs) {
  final Object lhsObject = new NgLong(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThan(lhsObject, rhs);
  }

  public Object doReverseGreaterThan(final float lhs, final Object rhs) {
  final Object lhsObject = new NgFloat(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThan(lhsObject, rhs);
  }

  public Object doReverseGreaterThan(final double lhs, final Object rhs) {
  final Object lhsObject = new NgDouble(lhs);
    
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
  final Object result = this.instanceHandler.greaterThanOrEquals(lhs, rhs);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThanOrEquals(lhs, rhs);
    } else {
      return result;
    }
  }
  
  public Object doReverseGreaterThanOrEquals(final Object lhs, final Object rhs) {
    return this.instanceHandler.reverseGreaterThanOrEquals(lhs, rhs);
  }

  //
  // These methods can be overridden to improve performance
  //
  //

  public Object doGreaterThanOrEquals(final byte lhs, final byte rhs) {
    return doGreaterThanOrEquals(new NgByte(lhs), new NgByte(rhs));
  }

  public Object doGreaterThanOrEquals(final byte lhs, final char rhs) {
    return doGreaterThanOrEquals(new NgByte(lhs), new NgChar(rhs));
  }

  public Object doGreaterThanOrEquals(final byte lhs, final short rhs) {
    return doGreaterThanOrEquals(new NgByte(lhs), new NgShort(rhs));
  }

  public Object doGreaterThanOrEquals(final byte lhs, final int rhs) {
    return doGreaterThanOrEquals(new NgByte(lhs), new NgInt(rhs));
  }

  public Object doGreaterThanOrEquals(final byte lhs, final long rhs) {
    return doGreaterThanOrEquals(new NgByte(lhs), new NgLong(rhs));
  }

  public Object doGreaterThanOrEquals(final byte lhs, final float rhs) {
    return doGreaterThanOrEquals(new NgByte(lhs), new NgFloat(rhs));
  }

  public Object doGreaterThanOrEquals(final byte lhs, final double rhs) {
    return doGreaterThanOrEquals(new NgByte(lhs), new NgDouble(rhs));
  }

  public Object doGreaterThanOrEquals(final byte lhs, final BigInteger rhs) {
    return doGreaterThanOrEquals(new NgByte(lhs), (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final byte lhs, final BigDecimal rhs) {
    return doGreaterThanOrEquals(new NgByte(lhs), (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final char lhs, final byte rhs) {
    return doGreaterThanOrEquals(new NgChar(lhs), new NgByte(rhs));
  }

  public Object doGreaterThanOrEquals(final char lhs, final char rhs) {
    return doGreaterThanOrEquals(new NgChar(lhs), new NgChar(rhs));
  }

  public Object doGreaterThanOrEquals(final char lhs, final short rhs) {
    return doGreaterThanOrEquals(new NgChar(lhs), new NgShort(rhs));
  }

  public Object doGreaterThanOrEquals(final char lhs, final int rhs) {
    return doGreaterThanOrEquals(new NgChar(lhs), new NgInt(rhs));
  }

  public Object doGreaterThanOrEquals(final char lhs, final long rhs) {
    return doGreaterThanOrEquals(new NgChar(lhs), new NgLong(rhs));
  }

  public Object doGreaterThanOrEquals(final char lhs, final float rhs) {
    return doGreaterThanOrEquals(new NgChar(lhs), new NgFloat(rhs));
  }

  public Object doGreaterThanOrEquals(final char lhs, final double rhs) {
    return doGreaterThanOrEquals(new NgChar(lhs), new NgDouble(rhs));
  }

  public Object doGreaterThanOrEquals(final char lhs, final BigInteger rhs) {
    return doGreaterThanOrEquals(new NgChar(lhs), (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final char lhs, final BigDecimal rhs) {
    return doGreaterThanOrEquals(new NgChar(lhs), (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final short lhs, final byte rhs) {
    return doGreaterThanOrEquals(new NgShort(lhs), new NgByte(rhs));
  }

  public Object doGreaterThanOrEquals(final short lhs, final char rhs) {
    return doGreaterThanOrEquals(new NgShort(lhs), new NgChar(rhs));
  }

  public Object doGreaterThanOrEquals(final short lhs, final short rhs) {
    return doGreaterThanOrEquals(new NgShort(lhs), new NgShort(rhs));
  }

  public Object doGreaterThanOrEquals(final short lhs, final int rhs) {
    return doGreaterThanOrEquals(new NgShort(lhs), new NgInt(rhs));
  }

  public Object doGreaterThanOrEquals(final short lhs, final long rhs) {
    return doGreaterThanOrEquals(new NgShort(lhs), new NgLong(rhs));
  }

  public Object doGreaterThanOrEquals(final short lhs, final float rhs) {
    return doGreaterThanOrEquals(new NgShort(lhs), new NgFloat(rhs));
  }

  public Object doGreaterThanOrEquals(final short lhs, final double rhs) {
    return doGreaterThanOrEquals(new NgShort(lhs), new NgDouble(rhs));
  }

  public Object doGreaterThanOrEquals(final short lhs, final BigInteger rhs) {
    return doGreaterThanOrEquals(new NgShort(lhs), (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final short lhs, final BigDecimal rhs) {
    return doGreaterThanOrEquals(new NgShort(lhs), (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final int lhs, final byte rhs) {
    return doGreaterThanOrEquals(new NgInt(lhs), new NgByte(rhs));
  }

  public Object doGreaterThanOrEquals(final int lhs, final char rhs) {
    return doGreaterThanOrEquals(new NgInt(lhs), new NgChar(rhs));
  }

  public Object doGreaterThanOrEquals(final int lhs, final short rhs) {
    return doGreaterThanOrEquals(new NgInt(lhs), new NgShort(rhs));
  }

  public Object doGreaterThanOrEquals(final int lhs, final int rhs) {
    return doGreaterThanOrEquals(new NgInt(lhs), new NgInt(rhs));
  }

  public Object doGreaterThanOrEquals(final int lhs, final long rhs) {
    return doGreaterThanOrEquals(new NgInt(lhs), new NgLong(rhs));
  }

  public Object doGreaterThanOrEquals(final int lhs, final float rhs) {
    return doGreaterThanOrEquals(new NgInt(lhs), new NgFloat(rhs));
  }

  public Object doGreaterThanOrEquals(final int lhs, final double rhs) {
    return doGreaterThanOrEquals(new NgInt(lhs), new NgDouble(rhs));
  }

  public Object doGreaterThanOrEquals(final int lhs, final BigInteger rhs) {
    return doGreaterThanOrEquals(new NgInt(lhs), (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final int lhs, final BigDecimal rhs) {
    return doGreaterThanOrEquals(new NgInt(lhs), (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final long lhs, final byte rhs) {
    return doGreaterThanOrEquals(new NgLong(lhs), new NgByte(rhs));
  }

  public Object doGreaterThanOrEquals(final long lhs, final char rhs) {
    return doGreaterThanOrEquals(new NgLong(lhs), new NgChar(rhs));
  }

  public Object doGreaterThanOrEquals(final long lhs, final short rhs) {
    return doGreaterThanOrEquals(new NgLong(lhs), new NgShort(rhs));
  }

  public Object doGreaterThanOrEquals(final long lhs, final int rhs) {
    return doGreaterThanOrEquals(new NgLong(lhs), new NgInt(rhs));
  }

  public Object doGreaterThanOrEquals(final long lhs, final long rhs) {
    return doGreaterThanOrEquals(new NgLong(lhs), new NgLong(rhs));
  }

  public Object doGreaterThanOrEquals(final long lhs, final float rhs) {
    return doGreaterThanOrEquals(new NgLong(lhs), new NgFloat(rhs));
  }

  public Object doGreaterThanOrEquals(final long lhs, final double rhs) {
    return doGreaterThanOrEquals(new NgLong(lhs), new NgDouble(rhs));
  }

  public Object doGreaterThanOrEquals(final long lhs, final BigInteger rhs) {
    return doGreaterThanOrEquals(new NgLong(lhs), (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final long lhs, final BigDecimal rhs) {
    return doGreaterThanOrEquals(new NgLong(lhs), (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final float lhs, final byte rhs) {
    return doGreaterThanOrEquals(new NgFloat(lhs), new NgByte(rhs));
  }

  public Object doGreaterThanOrEquals(final float lhs, final char rhs) {
    return doGreaterThanOrEquals(new NgFloat(lhs), new NgChar(rhs));
  }

  public Object doGreaterThanOrEquals(final float lhs, final short rhs) {
    return doGreaterThanOrEquals(new NgFloat(lhs), new NgShort(rhs));
  }

  public Object doGreaterThanOrEquals(final float lhs, final int rhs) {
    return doGreaterThanOrEquals(new NgFloat(lhs), new NgInt(rhs));
  }

  public Object doGreaterThanOrEquals(final float lhs, final long rhs) {
    return doGreaterThanOrEquals(new NgFloat(lhs), new NgLong(rhs));
  }

  public Object doGreaterThanOrEquals(final float lhs, final float rhs) {
    return doGreaterThanOrEquals(new NgFloat(lhs), new NgFloat(rhs));
  }

  public Object doGreaterThanOrEquals(final float lhs, final double rhs) {
    return doGreaterThanOrEquals(new NgFloat(lhs), new NgDouble(rhs));
  }

  public Object doGreaterThanOrEquals(final float lhs, final BigInteger rhs) {
    return doGreaterThanOrEquals(new NgFloat(lhs), (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final float lhs, final BigDecimal rhs) {
    return doGreaterThanOrEquals(new NgFloat(lhs), (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final double lhs, final byte rhs) {
    return doGreaterThanOrEquals(new NgDouble(lhs), new NgByte(rhs));
  }

  public Object doGreaterThanOrEquals(final double lhs, final char rhs) {
    return doGreaterThanOrEquals(new NgDouble(lhs), new NgChar(rhs));
  }

  public Object doGreaterThanOrEquals(final double lhs, final short rhs) {
    return doGreaterThanOrEquals(new NgDouble(lhs), new NgShort(rhs));
  }

  public Object doGreaterThanOrEquals(final double lhs, final int rhs) {
    return doGreaterThanOrEquals(new NgDouble(lhs), new NgInt(rhs));
  }

  public Object doGreaterThanOrEquals(final double lhs, final long rhs) {
    return doGreaterThanOrEquals(new NgDouble(lhs), new NgLong(rhs));
  }

  public Object doGreaterThanOrEquals(final double lhs, final float rhs) {
    return doGreaterThanOrEquals(new NgDouble(lhs), new NgFloat(rhs));
  }

  public Object doGreaterThanOrEquals(final double lhs, final double rhs) {
    return doGreaterThanOrEquals(new NgDouble(lhs), new NgDouble(rhs));
  }

  public Object doGreaterThanOrEquals(final double lhs, final BigInteger rhs) {
    return doGreaterThanOrEquals(new NgDouble(lhs), (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final double lhs, final BigDecimal rhs) {
    return doGreaterThanOrEquals(new NgDouble(lhs), (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final BigInteger lhs, final byte rhs) {
    return doGreaterThanOrEquals((Object)lhs, new NgByte(rhs));
  }

  public Object doGreaterThanOrEquals(final BigInteger lhs, final char rhs) {
    return doGreaterThanOrEquals((Object)lhs, new NgChar(rhs));
  }

  public Object doGreaterThanOrEquals(final BigInteger lhs, final short rhs) {
    return doGreaterThanOrEquals((Object)lhs, new NgShort(rhs));
  }

  public Object doGreaterThanOrEquals(final BigInteger lhs, final int rhs) {
    return doGreaterThanOrEquals((Object)lhs, new NgInt(rhs));
  }

  public Object doGreaterThanOrEquals(final BigInteger lhs, final long rhs) {
    return doGreaterThanOrEquals((Object)lhs, new NgLong(rhs));
  }

  public Object doGreaterThanOrEquals(final BigInteger lhs, final float rhs) {
    return doGreaterThanOrEquals((Object)lhs, new NgFloat(rhs));
  }

  public Object doGreaterThanOrEquals(final BigInteger lhs, final double rhs) {
    return doGreaterThanOrEquals((Object)lhs, new NgDouble(rhs));
  }

  public Object doGreaterThanOrEquals(final BigInteger lhs, final BigInteger rhs) {
    return doGreaterThanOrEquals((Object)lhs, (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final BigInteger lhs, final BigDecimal rhs) {
    return doGreaterThanOrEquals((Object)lhs, (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final BigDecimal lhs, final byte rhs) {
    return doGreaterThanOrEquals((Object)lhs, new NgByte(rhs));
  }

  public Object doGreaterThanOrEquals(final BigDecimal lhs, final char rhs) {
    return doGreaterThanOrEquals((Object)lhs, new NgChar(rhs));
  }

  public Object doGreaterThanOrEquals(final BigDecimal lhs, final short rhs) {
    return doGreaterThanOrEquals((Object)lhs, new NgShort(rhs));
  }

  public Object doGreaterThanOrEquals(final BigDecimal lhs, final int rhs) {
    return doGreaterThanOrEquals((Object)lhs, new NgInt(rhs));
  }

  public Object doGreaterThanOrEquals(final BigDecimal lhs, final long rhs) {
    return doGreaterThanOrEquals((Object)lhs, new NgLong(rhs));
  }

  public Object doGreaterThanOrEquals(final BigDecimal lhs, final float rhs) {
    return doGreaterThanOrEquals((Object)lhs, new NgFloat(rhs));
  }

  public Object doGreaterThanOrEquals(final BigDecimal lhs, final double rhs) {
    return doGreaterThanOrEquals((Object)lhs, new NgDouble(rhs));
  }

  public Object doGreaterThanOrEquals(final BigDecimal lhs, final BigInteger rhs) {
    return doGreaterThanOrEquals((Object)lhs, (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final BigDecimal lhs, final BigDecimal rhs) {
    return doGreaterThanOrEquals((Object)lhs, (Object)rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final byte rhs) {
  final Object rhsObject = new NgByte(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseGreaterThanOrEquals(lhs, rhsObject);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final char rhs) {
  final Object rhsObject = new NgChar(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseGreaterThanOrEquals(lhs, rhsObject);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final short rhs) {
  final Object rhsObject = new NgShort(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseGreaterThanOrEquals(lhs, rhsObject);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final int rhs) {
  final Object rhsObject = new NgInt(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseGreaterThanOrEquals(lhs, rhsObject);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final long rhs) {
  final Object rhsObject = new NgLong(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseGreaterThanOrEquals(lhs, rhsObject);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final float rhs) {
  final Object rhsObject = new NgFloat(rhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhsObject).doReverseGreaterThanOrEquals(lhs, rhsObject);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final double rhs) {
  final Object rhsObject = new NgDouble(rhs);
    
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
  final Object lhsObject = new NgByte(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThanOrEquals(lhsObject, rhs);
  }

  public Object doReverseGreaterThanOrEquals(final char lhs, final Object rhs) {
  final Object lhsObject = new NgChar(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThanOrEquals(lhsObject, rhs);
  }

  public Object doReverseGreaterThanOrEquals(final short lhs, final Object rhs) {
  final Object lhsObject = new NgShort(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThanOrEquals(lhsObject, rhs);
  }

  public Object doReverseGreaterThanOrEquals(final int lhs, final Object rhs) {
  final Object lhsObject = new NgInt(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThanOrEquals(lhsObject, rhs);
  }

  public Object doReverseGreaterThanOrEquals(final long lhs, final Object rhs) {
  final Object lhsObject = new NgLong(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThanOrEquals(lhsObject, rhs);
  }

  public Object doReverseGreaterThanOrEquals(final float lhs, final Object rhs) {
  final Object lhsObject = new NgFloat(lhs);
    
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThanOrEquals(lhsObject, rhs);
  }

  public Object doReverseGreaterThanOrEquals(final double lhs, final Object rhs) {
  final Object lhsObject = new NgDouble(lhs);
    
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
