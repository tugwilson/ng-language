package uk.co.wilson.ng.runtime.metaclass;

import uk.co.wilson.ng.runtime.metaclass.RuntimeMetaClassImpl.NgBinaryOperatorException;
import ng.lang.NgSystem;
import ng.runtime.InternalMetaClass;
import ng.runtime.MetaClass;
/*
 * Created on 6 Jul 2007
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
public class MetaClassImpl implements MetaClass {
  public static final Object NOT_CONSTRUCTED = new Object();
  public static final Object NOT_CALLED = new Object();
  public static final Object[] NO_PARAMETERS = new Object[] {};
  protected volatile InternalMetaClass internalMetaClass;


  public Object add(final Object lhs, final Object rhs) throws Throwable {
  final Object result = this.internalMetaClass.doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "+", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#addEquals(java.lang.Object, java.lang.Object)
   */
  public Object addEquals(Object lhs, Object rhs) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#and(java.lang.Object, java.lang.Object)
   */
  public Object and(Object lhs, Object rhs) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#andEquals(java.lang.Object, java.lang.Object)
   */
  public Object andEquals(Object lhs, Object rhs) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#arithmeticRightShift(java.lang.Object, java.lang.Object)
   */
  public Object arithmeticRightShift(Object lhs, Object rhs) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#arithmeticRightShiftEquals(java.lang.Object, java.lang.Object)
   */
  public Object arithmeticRightShiftEquals(Object lhs, Object rhs) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#asType(java.lang.Object, java.lang.Class)
   */
  public Object asType(Object instance, Class type) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#call(java.lang.Object, java.lang.Object[])
   */
  public Object call(Object instance, Object[] arguments) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#compare(java.lang.Object, java.lang.Object)
   */
  public Object compare(Object lhs, Object rhs) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#complement(java.lang.Object)
   */
  public Object complement(Object instance) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#divide(java.lang.Object, java.lang.Object)
   */
  public Object divide(Object lhs, Object rhs) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#divideEquals(java.lang.Object, java.lang.Object)
   */
  public Object divideEquals(Object lhs, Object rhs) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#equals(java.lang.Object, java.lang.Object)
   */
  public Object equals(Object lhs, Object rhs) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#getAt(java.lang.Object, java.lang.Object)
   */
  public Object getAt(Object instance, Object index) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#getField(java.lang.Object, java.lang.String)
   */
  public Object getField(Object instance, String fieldName) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#getInternalMetaClass()
   */
  public InternalMetaClass getInternalMetaClass() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#getMetaClassFor(java.lang.Class)
   */
  public MetaClass getMetaClassFor(Class theClass) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#getProperty(java.lang.Object, java.lang.String)
   */
  public Object getProperty(Object instance, String propertyName) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#getTheClass(java.lang.Object)
   */
  public Class getTheClass(Object instance) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#greaterThan(java.lang.Object, java.lang.Object)
   */
  public Object greaterThan(Object lhs, Object rhs) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#greaterThanOrEquals(java.lang.Object, java.lang.Object)
   */
  public Object greaterThanOrEquals(Object lhs, Object rhs) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#integerDivide(java.lang.Object, java.lang.Object)
   */
  public Object integerDivide(Object lhs, Object rhs) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#integerDivideEquals(java.lang.Object, java.lang.Object)
   */
  public Object integerDivideEquals(Object lhs, Object rhs) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#invokeConstructor(java.lang.Class, java.lang.Object[])
   */
  public Object invokeConstructor(Class theClass, Object[] arguments) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#invokeMethod(java.lang.Object, java.lang.String, java.lang.Object[])
   */
  public Object invokeMethod(Object instance, String methodName, Object[] arguments) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#isCase(java.lang.Object, java.lang.Object)
   */
  public Object isCase(Object instance, Object rhs) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#isInstanceof(java.lang.Object, java.lang.Class)
   */
  public Object isInstanceof(Object instance, Class type) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#leftShift(java.lang.Object, java.lang.Object)
   */
  public Object leftShift(Object lhs, Object rhs) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#leftShiftEquals(java.lang.Object, java.lang.Object)
   */
  public Object leftShiftEquals(Object lhs, Object rhs) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#lessThan(java.lang.Object, java.lang.Object)
   */
  public Object lessThan(Object lhs, Object rhs) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#lessThanOrEquals(java.lang.Object, java.lang.Object)
   */
  public Object lessThanOrEquals(Object lhs, Object rhs) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#logicalRightShift(java.lang.Object, java.lang.Object)
   */
  public Object logicalRightShift(Object lhs, Object rhs) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#logicalRightShiftEquals(java.lang.Object, java.lang.Object)
   */
  public Object logicalRightShiftEquals(Object lhs, Object rhs) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#multiply(java.lang.Object, java.lang.Object)
   */
  public Object multiply(Object lhs, Object rhs) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#multiplyEquals(java.lang.Object, java.lang.Object)
   */
  public Object multiplyEquals(Object lhs, Object rhs) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#not(java.lang.Object)
   */
  public Object not(Object operand) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#notEquals(java.lang.Object, java.lang.Object)
   */
  public Object notEquals(Object lhs, Object rhs) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#or(java.lang.Object, java.lang.Object)
   */
  public Object or(Object lhs, Object rhs) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#orEquals(java.lang.Object, java.lang.Object)
   */
  public Object orEquals(Object lhs, Object rhs) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#postfixDecrement(java.lang.Object)
   */
  public Object postfixDecrement(Object operand) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#postfixIncrement(java.lang.Object)
   */
  public Object postfixIncrement(Object operand) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#prefixDecrement(java.lang.Object)
   */
  public Object prefixDecrement(Object operand) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#prefixIncrement(java.lang.Object)
   */
  public Object prefixIncrement(Object operand) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#putAt(java.lang.Object, java.lang.Object)
   */
  public Object putAt(Object instance, Object index) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#remainder(java.lang.Object, java.lang.Object)
   */
  public Object remainder(Object lhs, Object rhs) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#remainderEquals(java.lang.Object, java.lang.Object)
   */
  public Object remainderEquals(Object lhs, Object rhs) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#setField(java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object setField(Object instance, String fieldName, Object newValue) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#setInternalMetaClass(ng.runtime.InternalMetaClass)
   */
  public void setInternalMetaClass(InternalMetaClass internalMetaClass) {
    // TODO Auto-generated method stub

  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#setProperty(java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object setProperty(Object instance, String propertyName, Object newValue) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#subtract(java.lang.Object, java.lang.Object)
   */
  public Object subtract(Object lhs, Object rhs) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#subtractEquals(java.lang.Object, java.lang.Object)
   */
  public Object subtractEquals(Object lhs, Object rhs) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#unaryMinus(java.lang.Object)
   */
  public Object unaryMinus(Object operand) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#unaryPlus(java.lang.Object)
   */
  public Object unaryPlus(Object operand) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#xor(java.lang.Object, java.lang.Object)
   */
  public Object xor(Object lhs, Object rhs) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#xorEquals(java.lang.Object, java.lang.Object)
   */
  public Object xorEquals(Object lhs, Object rhs) throws Throwable {
    // TODO Auto-generated method stub
    return null;
  }

}
