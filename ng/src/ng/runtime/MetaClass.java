/*
 * Created on Feb 26, 2007
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
package ng.runtime;


public interface MetaClass {

  /**
   * @param instance 
   * @return The class which is represented by this MetaClass
   */
  Class getTheClass(Object instance);
  
  /**
   * @param theClass
   * @return The MetaClass which is to be used when this class is cast to theClass.
   */
  MetaClass getMetaClassFor(Class theClass);
  
  /**
   * @return the RuntimeMetaClass for this MetaClass
   */
  RuntimeMetaClass getRuntimeMetaClass();
  
  /**
   * @param theClass 
   * @param arguments
   * @return an instance of the Class represented by the MetaClass
   */
  Object invokeConstructor(Class theClass, Object[] arguments) throws Throwable;
  /**
   * @param instance
   * @param methodName
   * @param arguments
   * @return the result of invoking the method on the instance with the supplied
   *         parameters.
   */
  Object invokeMethod(Object instance, String methodName, Object[] arguments) throws Throwable;
  
  /**
   * @param instance
   * @param propertyName
   * @return
   */
  Object getProperty(Object instance, String propertyName) throws Throwable;

  /**
   * @param instance
   * @param propertyName
   * @param newValue
   * @return
   */
  Object setProperty(Object instance, String propertyName, Object newValue) throws Throwable;

  /**
   * @param instance
   * @param fieldName
   * @return
   */
  Object getField(Object instance, String fieldName) throws Throwable;

  /**
   * @param instance
   * @param fieldName
   * @param newValue
   * @return
   */
  Object setField(Object instance, String fieldName, Object newValue) throws Throwable;
  
  /**
   * @param instance
   * @param arguments
   * @return
   */
  Object call(Object instance, Object[] arguments) throws Throwable;

  /**
   * @param instance
   * @return
   */
  Object complement(Object instance) throws Throwable;
  
  /**
   * @param operand
   * @return
   */
  Object not(Object operand) throws Throwable;
  
  /**
   * @param operand
   * @return
   */
  Object unaryPlus(Object operand) throws Throwable;
  
  /**
   * @param operand
   * @return
   */
  Object unaryMinus(Object operand) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object add(Object operand, Object rhs) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object addEquals(Object lhs, Object rhs) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object subtract(Object lhs, Object rhs) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object subtractEquals(Object lhs, Object rhs) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object multiply(Object lhs, Object rhs) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object multiplyEquals(Object lhs, Object rhs) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object divide(Object lhs, Object rhs) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object divideEquals(Object lhs, Object rhs) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object remainder(Object lhs, Object rhs) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object remainderEquals(Object lhs, Object rhs) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object integerDivide(Object lhs, Object rhs) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object integerDivideEquals(Object lhs, Object rhs) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object and(Object lhs, Object rhs) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object andEquals(Object lhs, Object rhs) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object or(Object lhs, Object rhs) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object orEquals(Object lhs, Object rhs) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object xor(Object lhs, Object rhs) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object xorEquals(Object lhs, Object rhs) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object leftShift(Object lhs, Object rhs) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object leftShiftEquals(Object lhs, Object rhs) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object arithmeticRightShift(Object lhs, Object rhs) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object arithmeticRightShiftEquals(Object lhs, Object rhs) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object logicalRightShift(Object lhs, Object rhs) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object logicalRightShiftEquals(Object lhs, Object rhs) throws Throwable;
  
  /**
   * @param operand
   * @return
   */
  Object prefixIncrement(Object operand) throws Throwable;
  
  /**
   * @param operand
   * @return
   */
  Object prefixDecrement(Object operand) throws Throwable;
  
  /**
   * @param operand
   * @return
   */
  Object postfixIncrement(Object operand) throws Throwable;
  
  /**
   * @param operand
   * @return
   */
  Object postfixDecrement(Object operand) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object compare(Object lhs, Object rhs) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object equals(Object lhs, Object rhs) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object notEquals(Object lhs, Object rhs) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object lessThan(Object lhs, Object rhs) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object greaterThan(Object lhs, Object rhs) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object lessThanOrEquals(Object lhs, Object rhs) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object greaterThanOrEquals(Object lhs, Object rhs) throws Throwable;
  
  /**
   * @param instance
   * @param type
   * @return
   */
  Object isInstanceof(Object instance, Class type) throws Throwable;
  
  /**
   * @param instance
   * @param rhs
   * @return
   */
  Object isCase(Object instance, Object rhs) throws Throwable;
  
  /**
   * @param instance
   * @param type
   * @return
   */
  Object asType(Object instance, Class type) throws Throwable;
  
  /**
   * @param instance
   * @param index
   * @return
   */
  Object getAt(Object instance, Object index) throws Throwable;
  
  /**
   * @param instance
   * @param index
   * @return
   */
  Object putAt(Object instance, Object index) throws Throwable;
}
