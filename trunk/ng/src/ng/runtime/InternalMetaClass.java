package ng.runtime;

/*
 * Created on Mar 1, 2007
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

import uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection;

public interface InternalMetaClass {
  /**
   * @param instance
   * @param theClass
   * @return
   */
  Object doGetParamObject(Object instance, Class theClass);
  
  /**
   * @param theClass
   * @return
   */
  MetaClass doGetMetaClassFor(Class theClass);

  /**
   * @param instance 
   * @return The class which is represented by this MetaClass
   */
  Class doGetTheClass(Object instance);
  
  /**
   * @param parameterType
   * @return
   */
  int doCalculateConversionCost(Class parameterType);
  
  /**
   * @param theClass 
   * @param arguments
   * @return
   */
  Object doInvokeConstructor(Class theClass, Object[] arguments) throws Throwable;

  /**
   * @param methodName
   * @param arguments
   * @return
   */
  MetaMethod doGetMetaMethodFor(String methodName, Object[] arguments) throws Throwable;
  
  /**
   * @param currentSelection
   * @param methodName
   * @param argumentMetaClasses
   * @return
   */
  MetaMethodSelection doSelectMethod(MetaMethodSelection currentSelection, String methodName, RuntimeMetaClass[] argumentMetaClasses);

  /**
   * @param currentSelection
   * @param methodName
   * @return
   */
  MetaMethodSelection doSelectMethod(MetaMethodSelection currentSelection, String methodName);

  /**
   * @param currentSelection
   * @param methodName
   * @param p1
   * @return
   */
  MetaMethodSelection doSelectMethod(MetaMethodSelection currentSelection, String methodName, RuntimeMetaClass p1);

  /**
   * @param currentSelection
   * @param methodName
   * @param p1
   * @param p2
   * @return
   */
  MetaMethodSelection doSelectMethod(MetaMethodSelection currentSelection, String methodName, RuntimeMetaClass p1, RuntimeMetaClass p2);

  /**
   * @param currentSelection
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  MetaMethodSelection doSelectMethod(MetaMethodSelection currentSelection, String methodName, RuntimeMetaClass p1, RuntimeMetaClass p2, RuntimeMetaClass p3);

  /**
   * @param currentSelection
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  MetaMethodSelection doSelectMethod(MetaMethodSelection currentSelection, String methodName, RuntimeMetaClass p1, RuntimeMetaClass p2, RuntimeMetaClass p3, RuntimeMetaClass p4);

  /**
   * @param methodName
   * @return the result of invoking the method on the instance with no
   *         parameters.
   * @return
   */
  MetaMethod doGetMetaMethodQuick(String methodName) throws Throwable;

  /**
   * @param methodName
   * @param p1
   * @return the result of invoking the method on the instance with the supplied
   *         parameter.
   */
  MetaMethod doGetMetaMethodQuick(String methodName, Object p1) throws Throwable;

  /**
   * @param methodName
   * @param p1
   * @return the result of invoking the method on the instance with the supplied
   *         parameter.
   */
  MetaMethod doGetMetaMethodQuick(String methodName, boolean p1) throws Throwable;

  /**
   * @param methodName
   * @param p1
   * @return the result of invoking the method on the instance with the supplied
   *         parameter.
   */
  MetaMethod doGetMetaMethodQuick(String methodName, char p1) throws Throwable;

  /**
   * @param methodName
   * @param p1
   * @return the result of invoking the method on the instance with the supplied
   *         parameter.
   */
  MetaMethod doGetMetaMethodQuick(String methodName, byte p1) throws Throwable;

  /**
   * @param methodName
   * @param p1
   * @return the result of invoking the method on the instance with the supplied
   *         parameter.
   */
  MetaMethod doGetMetaMethodQuick(String methodName, short p1) throws Throwable;

  /**
   * @param methodName
   * @param p1
   * @return the result of invoking the method on the instance with the supplied
   *         parameter.
   */
  MetaMethod doGetMetaMethodQuick(String methodName, int p1) throws Throwable;

  /**
   * @param methodName
   * @param p1
   * @return the result of invoking the method on the instance with the supplied
   *         parameter.
   */
  MetaMethod doGetMetaMethodQuick(String methodName, long p1) throws Throwable;

  /**
   * @param methodName
   * @param p1
   * @return the result of invoking the method on the instance with the supplied
   *         parameter.
   */
  MetaMethod doGetMetaMethodQuick(String methodName, float p1) throws Throwable;

  /**
   * @param methodName
   * @param p1
   * @return the result of invoking the method on the instance with the supplied
   *         parameter.
   */
  MetaMethod doGetMetaMethodQuick(String methodName, double p1) throws Throwable;

  /**
   * @param methodName
   * @param p1
   * @return the result of invoking the method on the instance with the supplied
   *         parameter.
   */
  MetaMethod doGetMetaMethodQuick(String methodName, BigInteger p1) throws Throwable;

  /**
   * @param methodName
   * @param p1
   * @return the result of invoking the method on the instance with the supplied
   *         parameter.
   */
  MetaMethod doGetMetaMethodQuick(String methodName, BigDecimal p1) throws Throwable;

  /**
   * @param methodName
   * @param p1
   * @param p2
   * @return the result of invoking the method on the instance with the supplied
   *         parameters.
   */
  MetaMethod doGetMetaMethodQuick(String methodName, Object p1, Object p2) throws Throwable;

  /**
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @return the result of invoking the method on the instance with the supplied
   *         parameters.
   */
  MetaMethod doGetMetaMethodQuick(String methodName, Object p1, Object p2, Object p3) throws Throwable;

  /**
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  MetaMethod doGetMetaMethodQuick(String methodName, Object p1, Object p2, Object p3, Object p4) throws Throwable;

  /**
   * @param instance
   * @param propertyName
   * @return
   */
  MetaMethod doGetGetPropertyMetaMethod(Object instance, String propertyName) throws Throwable;

  /**
   * @param instance
   * @param propertyName
   * @param newValue
   * @return
   */
  MetaMethod doGetSetPropertyMetaMethod(Object instance, String propertyName, Object newValue) throws Throwable;

  /**
   * @param instance
   * @param fieldName
   * @return
   */
  MetaMethod doGetGetFieldMetaMethod(Object instance, String fieldName) throws Throwable;

  /**
   * @param instance
   * @param fieldName
   * @param newValue
   * @return
   */
  MetaMethod doGetSetFieldMetaMethod(Object instance, String fieldName, Object newValue) throws Throwable;
  
  /**
   * @return
   */
  MetaMethod doGetAnonMetaMethod() throws Throwable;

  /**
   * @param instance
   * @return
   */
  Object doComplement(Object instance) throws Throwable;

  /**
   * @param instance
   * @return
   */
  Object doComplement(int instance) throws Throwable;

  /**
   * @param instance
   * @return
   */
  Object doComplement(long instance) throws Throwable;

  /**
   * @param instance
   * @return
   */
  Object doComplement(BigInteger instance) throws Throwable;

  /**
   * @param instance
   * @return
   */
  Object doNot(Object instance) throws Throwable;

  /**
   * @param instance
   * @return
   */
  Object doNot(boolean instance) throws Throwable;

  /**
   * @param instance
   * @return
   */
  Object doUnaryPlus(Object instance) throws Throwable;

  /**
   * @param instance
   * @return
   */
  Object doUnaryPlus(int instance) throws Throwable;

  /**
   * @param instance
   * @return
   */
  Object doUnaryPlus(long instance) throws Throwable;

  /**
   * @param instance
   * @return
   */
  Object doUnaryPlus(float instance) throws Throwable;

  /**
   * @param instance
   * @return
   */
  Object doUnaryPlus(double instance) throws Throwable;

  /**
   * @param instance
   * @return
   */
  Object doUnaryPlus(BigInteger instance) throws Throwable;

  /**
   * @param instance
   * @return
   */
  Object doUnaryPlus(BigDecimal instance) throws Throwable;

  /**
   * @param instance
   * @return
   */
  Object doUnaryMinus(Object instance) throws Throwable;

  /**
   * @param instance
   * @return
   */
  Object doUnaryMinus(int instance) throws Throwable;

  /**
   * @param instance
   * @return
   */
  Object doUnaryMinus(long instance) throws Throwable;

  /**
   * @param instance
   * @return
   */
  Object doUnaryMinus(float instance) throws Throwable;

  /**
   * @param instance
   * @return
   */
  Object doUnaryMinus(double instance) throws Throwable;

  /**
   * @param instance
   * @return
   */
  Object doUnaryMinus(BigInteger instance) throws Throwable;

  /**
   * @param instance
   * @return
   */
  Object doUnaryMinus(BigDecimal instance) throws Throwable;

  /**
   * @param instance
   * @param type
   * @return
   */
  Object doIsInstanceof(Object instance, Class type) throws Throwable;

  /**
   * @param instance
   * @param rhs
   * @return
   */
  Object doIsCase(Object instance, Object rhs) throws Throwable;

  /**
   * @param instance
   * @param type
   * @return
   */
  Object doAsType(Object instance, Class type) throws Throwable;

  /**
   * @param instance
   * @param index
   * @return
   */
  Object doGetAt(Object instance, Object index) throws Throwable;

  /**
   * @param instance
   * @param index
   * @return
   */
  Object doGetAt(Object instance, int index) throws Throwable;

  /**
   * @param instance
   * @param index
   * @return
   */
  Object doGetAt(Object instance, BigInteger index) throws Throwable;

  /**
   * @param instance
   * @param index
   * @return
   */
  Object doPutAt(Object instance, Object index) throws Throwable;

  /**
   * @param instance
   * @param index
   * @return
   */
  Object doPutAt(Object instance, int index) throws Throwable;

  /**
   * @param instance
   * @param index
   * @return
   */
  Object doPutAt(Object instance, BigInteger index) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object doPrefixIncrement(Object instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object doPrefixIncrement(int instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object doPrefixIncrement(long instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object doPrefixIncrement(float instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object doPrefixIncrement(double instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object doPrefixIncrement(BigInteger instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object doPrefixIncrement(BigDecimal instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object doPrefixDecrement(Object instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object doPrefixDecrement(int instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object doPrefixDecrement(long instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object doPrefixDecrement(float instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object doPrefixDecrement(double instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object doPrefixDecrement(BigInteger instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object doPrefixDecrement(BigDecimal instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object doPostfixIncrement(Object instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object doPostfixIncrement(int instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object doPostfixIncrement(long instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object doPostfixIncrement(float instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object doPostfixIncrement(BigDecimal instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object doPostfixIncrement(BigInteger instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object doPostfixIncrement(double instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object doPostfixDecrement(Object instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object doPostfixDecrement(int instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object doPostfixDecrement(long instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object doPostfixDecrement(float instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object doPostfixDecrement(double instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object doPostfixDecrement(BigDecimal instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object doPostfixDecrement(BigInteger instance) throws Throwable;

  //
  //   Internal methods for operator +
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement +
  //

  Object doAdd(Object lhs, Object rhs) throws Throwable;

  Object doReverseAdd(Object lhs, Object rhs) throws Throwable;

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doAdd(byte lhs, byte rhs) throws Throwable;

  Object doAdd(byte lhs, char rhs) throws Throwable;

  Object doAdd(byte lhs, short rhs) throws Throwable;

  Object doAdd(byte lhs, int rhs) throws Throwable;

  Object doAdd(byte lhs, long rhs) throws Throwable;

  Object doAdd(byte lhs, float rhs) throws Throwable;

  Object doAdd(byte lhs, double rhs) throws Throwable;

  Object doAdd(byte lhs, BigInteger rhs) throws Throwable;

  Object doAdd(byte lhs, BigDecimal rhs) throws Throwable;

  Object doAdd(char lhs, byte rhs) throws Throwable;

  Object doAdd(char lhs, char rhs) throws Throwable;

  Object doAdd(char lhs, short rhs) throws Throwable;

  Object doAdd(char lhs, int rhs) throws Throwable;

  Object doAdd(char lhs, long rhs) throws Throwable;

  Object doAdd(char lhs, float rhs) throws Throwable;

  Object doAdd(char lhs, double rhs) throws Throwable;

  Object doAdd(char lhs, BigInteger rhs) throws Throwable;

  Object doAdd(char lhs, BigDecimal rhs) throws Throwable;

  Object doAdd(short lhs, byte rhs) throws Throwable;

  Object doAdd(short lhs, char rhs) throws Throwable;

  Object doAdd(short lhs, short rhs) throws Throwable;

  Object doAdd(short lhs, int rhs) throws Throwable;

  Object doAdd(short lhs, long rhs) throws Throwable;

  Object doAdd(short lhs, float rhs) throws Throwable;

  Object doAdd(short lhs, double rhs) throws Throwable;

  Object doAdd(short lhs, BigInteger rhs) throws Throwable;

  Object doAdd(short lhs, BigDecimal rhs) throws Throwable;

  Object doAdd(int lhs, byte rhs) throws Throwable;

  Object doAdd(int lhs, char rhs) throws Throwable;

  Object doAdd(int lhs, short rhs) throws Throwable;

  Object doAdd(int lhs, int rhs) throws Throwable;

  Object doAdd(int lhs, long rhs) throws Throwable;

  Object doAdd(int lhs, float rhs) throws Throwable;

  Object doAdd(int lhs, double rhs) throws Throwable;

  Object doAdd(int lhs, BigInteger rhs) throws Throwable;

  Object doAdd(int lhs, BigDecimal rhs) throws Throwable;

  Object doAdd(long lhs, byte rhs) throws Throwable;

  Object doAdd(long lhs, char rhs) throws Throwable;

  Object doAdd(long lhs, short rhs) throws Throwable;

  Object doAdd(long lhs, int rhs) throws Throwable;

  Object doAdd(long lhs, long rhs) throws Throwable;

  Object doAdd(long lhs, float rhs) throws Throwable;

  Object doAdd(long lhs, double rhs) throws Throwable;

  Object doAdd(long lhs, BigInteger rhs) throws Throwable;

  Object doAdd(long lhs, BigDecimal rhs) throws Throwable;

  Object doAdd(float lhs, byte rhs) throws Throwable;

  Object doAdd(float lhs, char rhs) throws Throwable;

  Object doAdd(float lhs, short rhs) throws Throwable;

  Object doAdd(float lhs, int rhs) throws Throwable;

  Object doAdd(float lhs, long rhs) throws Throwable;

  Object doAdd(float lhs, float rhs) throws Throwable;

  Object doAdd(float lhs, double rhs) throws Throwable;

  Object doAdd(float lhs, BigInteger rhs) throws Throwable;

  Object doAdd(float lhs, BigDecimal rhs) throws Throwable;

  Object doAdd(double lhs, byte rhs) throws Throwable;

  Object doAdd(double lhs, char rhs) throws Throwable;

  Object doAdd(double lhs, short rhs) throws Throwable;

  Object doAdd(double lhs, int rhs) throws Throwable;

  Object doAdd(double lhs, long rhs) throws Throwable;

  Object doAdd(double lhs, float rhs) throws Throwable;

  Object doAdd(double lhs, double rhs) throws Throwable;

  Object doAdd(double lhs, BigInteger rhs) throws Throwable;

  Object doAdd(double lhs, BigDecimal rhs) throws Throwable;

  Object doAdd(BigInteger lhs, byte rhs) throws Throwable;

  Object doAdd(BigInteger lhs, char rhs) throws Throwable;

  Object doAdd(BigInteger lhs, short rhs) throws Throwable;

  Object doAdd(BigInteger lhs, int rhs) throws Throwable;

  Object doAdd(BigInteger lhs, long rhs) throws Throwable;

  Object doAdd(BigInteger lhs, float rhs) throws Throwable;

  Object doAdd(BigInteger lhs, double rhs) throws Throwable;

  Object doAdd(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object doAdd(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object doAdd(BigDecimal lhs, byte rhs) throws Throwable;

  Object doAdd(BigDecimal lhs, char rhs) throws Throwable;

  Object doAdd(BigDecimal lhs, short rhs) throws Throwable;

  Object doAdd(BigDecimal lhs, int rhs) throws Throwable;

  Object doAdd(BigDecimal lhs, long rhs) throws Throwable;

  Object doAdd(BigDecimal lhs, float rhs) throws Throwable;

  Object doAdd(BigDecimal lhs, double rhs) throws Throwable;

  Object doAdd(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object doAdd(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object doAdd(Object lhs, byte rhs) throws Throwable;

  Object doAdd(Object lhs, char rhs) throws Throwable;

  Object doAdd(Object lhs, short rhs) throws Throwable;

  Object doAdd(Object lhs, int rhs) throws Throwable;

  Object doAdd(Object lhs, long rhs) throws Throwable;

  Object doAdd(Object lhs, float rhs) throws Throwable;

  Object doAdd(Object lhs, double rhs) throws Throwable;

  Object doAdd(Object lhs, BigInteger rhs) throws Throwable;

  Object doAdd(Object lhs, BigDecimal rhs) throws Throwable;

  Object doReverseAdd(byte lhs, Object rhs) throws Throwable;

  Object doReverseAdd(char lhs, Object rhs) throws Throwable;

  Object doReverseAdd(short lhs, Object rhs) throws Throwable;

  Object doReverseAdd(int lhs, Object rhs) throws Throwable;

  Object doReverseAdd(long lhs, Object rhs) throws Throwable;

  Object doReverseAdd(float lhs, Object rhs) throws Throwable;

  Object doReverseAdd(double lhs, Object rhs) throws Throwable;

  Object doReverseAdd(BigInteger lhs, Object rhs) throws Throwable;

  Object doReverseAdd(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Internal methods for operator +=
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement +=
  //

  Object doAddEquals(Object lhs, Object rhs) throws Throwable;

  Object doReverseAddEquals(Object lhs, Object rhs) throws Throwable;

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doAddEquals(byte lhs, byte rhs) throws Throwable;

  Object doAddEquals(byte lhs, char rhs) throws Throwable;

  Object doAddEquals(byte lhs, short rhs) throws Throwable;

  Object doAddEquals(byte lhs, int rhs) throws Throwable;

  Object doAddEquals(byte lhs, long rhs) throws Throwable;

  Object doAddEquals(byte lhs, float rhs) throws Throwable;

  Object doAddEquals(byte lhs, double rhs) throws Throwable;

  Object doAddEquals(byte lhs, BigInteger rhs) throws Throwable;

  Object doAddEquals(byte lhs, BigDecimal rhs) throws Throwable;

  Object doAddEquals(char lhs, byte rhs) throws Throwable;

  Object doAddEquals(char lhs, char rhs) throws Throwable;

  Object doAddEquals(char lhs, short rhs) throws Throwable;

  Object doAddEquals(char lhs, int rhs) throws Throwable;

  Object doAddEquals(char lhs, long rhs) throws Throwable;

  Object doAddEquals(char lhs, float rhs) throws Throwable;

  Object doAddEquals(char lhs, double rhs) throws Throwable;

  Object doAddEquals(char lhs, BigInteger rhs) throws Throwable;

  Object doAddEquals(char lhs, BigDecimal rhs) throws Throwable;

  Object doAddEquals(short lhs, byte rhs) throws Throwable;

  Object doAddEquals(short lhs, char rhs) throws Throwable;

  Object doAddEquals(short lhs, short rhs) throws Throwable;

  Object doAddEquals(short lhs, int rhs) throws Throwable;

  Object doAddEquals(short lhs, long rhs) throws Throwable;

  Object doAddEquals(short lhs, float rhs) throws Throwable;

  Object doAddEquals(short lhs, double rhs) throws Throwable;

  Object doAddEquals(short lhs, BigInteger rhs) throws Throwable;

  Object doAddEquals(short lhs, BigDecimal rhs) throws Throwable;

  Object doAddEquals(int lhs, byte rhs) throws Throwable;

  Object doAddEquals(int lhs, char rhs) throws Throwable;

  Object doAddEquals(int lhs, short rhs) throws Throwable;

  Object doAddEquals(int lhs, int rhs) throws Throwable;

  Object doAddEquals(int lhs, long rhs) throws Throwable;

  Object doAddEquals(int lhs, float rhs) throws Throwable;

  Object doAddEquals(int lhs, double rhs) throws Throwable;

  Object doAddEquals(int lhs, BigInteger rhs) throws Throwable;

  Object doAddEquals(int lhs, BigDecimal rhs) throws Throwable;

  Object doAddEquals(long lhs, byte rhs) throws Throwable;

  Object doAddEquals(long lhs, char rhs) throws Throwable;

  Object doAddEquals(long lhs, short rhs) throws Throwable;

  Object doAddEquals(long lhs, int rhs) throws Throwable;

  Object doAddEquals(long lhs, long rhs) throws Throwable;

  Object doAddEquals(long lhs, float rhs) throws Throwable;

  Object doAddEquals(long lhs, double rhs) throws Throwable;

  Object doAddEquals(long lhs, BigInteger rhs) throws Throwable;

  Object doAddEquals(long lhs, BigDecimal rhs) throws Throwable;

  Object doAddEquals(float lhs, byte rhs) throws Throwable;

  Object doAddEquals(float lhs, char rhs) throws Throwable;

  Object doAddEquals(float lhs, short rhs) throws Throwable;

  Object doAddEquals(float lhs, int rhs) throws Throwable;

  Object doAddEquals(float lhs, long rhs) throws Throwable;

  Object doAddEquals(float lhs, float rhs) throws Throwable;

  Object doAddEquals(float lhs, double rhs) throws Throwable;

  Object doAddEquals(float lhs, BigInteger rhs) throws Throwable;

  Object doAddEquals(float lhs, BigDecimal rhs) throws Throwable;

  Object doAddEquals(double lhs, byte rhs) throws Throwable;

  Object doAddEquals(double lhs, char rhs) throws Throwable;

  Object doAddEquals(double lhs, short rhs) throws Throwable;

  Object doAddEquals(double lhs, int rhs) throws Throwable;

  Object doAddEquals(double lhs, long rhs) throws Throwable;

  Object doAddEquals(double lhs, float rhs) throws Throwable;

  Object doAddEquals(double lhs, double rhs) throws Throwable;

  Object doAddEquals(double lhs, BigInteger rhs) throws Throwable;

  Object doAddEquals(double lhs, BigDecimal rhs) throws Throwable;

  Object doAddEquals(BigInteger lhs, byte rhs) throws Throwable;

  Object doAddEquals(BigInteger lhs, char rhs) throws Throwable;

  Object doAddEquals(BigInteger lhs, short rhs) throws Throwable;

  Object doAddEquals(BigInteger lhs, int rhs) throws Throwable;

  Object doAddEquals(BigInteger lhs, long rhs) throws Throwable;

  Object doAddEquals(BigInteger lhs, float rhs) throws Throwable;

  Object doAddEquals(BigInteger lhs, double rhs) throws Throwable;

  Object doAddEquals(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object doAddEquals(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object doAddEquals(BigDecimal lhs, byte rhs) throws Throwable;

  Object doAddEquals(BigDecimal lhs, char rhs) throws Throwable;

  Object doAddEquals(BigDecimal lhs, short rhs) throws Throwable;

  Object doAddEquals(BigDecimal lhs, int rhs) throws Throwable;

  Object doAddEquals(BigDecimal lhs, long rhs) throws Throwable;

  Object doAddEquals(BigDecimal lhs, float rhs) throws Throwable;

  Object doAddEquals(BigDecimal lhs, double rhs) throws Throwable;

  Object doAddEquals(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object doAddEquals(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object doAddEquals(Object lhs, byte rhs) throws Throwable;

  Object doAddEquals(Object lhs, char rhs) throws Throwable;

  Object doAddEquals(Object lhs, short rhs) throws Throwable;

  Object doAddEquals(Object lhs, int rhs) throws Throwable;

  Object doAddEquals(Object lhs, long rhs) throws Throwable;

  Object doAddEquals(Object lhs, float rhs) throws Throwable;

  Object doAddEquals(Object lhs, double rhs) throws Throwable;

  Object doAddEquals(Object lhs, BigInteger rhs) throws Throwable;

  Object doAddEquals(Object lhs, BigDecimal rhs) throws Throwable;

  Object doReverseAddEquals(byte lhs, Object rhs) throws Throwable;

  Object doReverseAddEquals(char lhs, Object rhs) throws Throwable;

  Object doReverseAddEquals(short lhs, Object rhs) throws Throwable;

  Object doReverseAddEquals(int lhs, Object rhs) throws Throwable;

  Object doReverseAddEquals(long lhs, Object rhs) throws Throwable;

  Object doReverseAddEquals(float lhs, Object rhs) throws Throwable;

  Object doReverseAddEquals(double lhs, Object rhs) throws Throwable;

  Object doReverseAddEquals(BigInteger lhs, Object rhs) throws Throwable;

  Object doReverseAddEquals(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Internal methods for operator -
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement -
  //

  Object doSubtract(Object lhs, Object rhs) throws Throwable;

  Object doReverseSubtract(Object lhs, Object rhs) throws Throwable;

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doSubtract(byte lhs, byte rhs) throws Throwable;

  Object doSubtract(byte lhs, char rhs) throws Throwable;

  Object doSubtract(byte lhs, short rhs) throws Throwable;

  Object doSubtract(byte lhs, int rhs) throws Throwable;

  Object doSubtract(byte lhs, long rhs) throws Throwable;

  Object doSubtract(byte lhs, float rhs) throws Throwable;

  Object doSubtract(byte lhs, double rhs) throws Throwable;

  Object doSubtract(byte lhs, BigInteger rhs) throws Throwable;

  Object doSubtract(byte lhs, BigDecimal rhs) throws Throwable;

  Object doSubtract(char lhs, byte rhs) throws Throwable;

  Object doSubtract(char lhs, char rhs) throws Throwable;

  Object doSubtract(char lhs, short rhs) throws Throwable;

  Object doSubtract(char lhs, int rhs) throws Throwable;

  Object doSubtract(char lhs, long rhs) throws Throwable;

  Object doSubtract(char lhs, float rhs) throws Throwable;

  Object doSubtract(char lhs, double rhs) throws Throwable;

  Object doSubtract(char lhs, BigInteger rhs) throws Throwable;

  Object doSubtract(char lhs, BigDecimal rhs) throws Throwable;

  Object doSubtract(short lhs, byte rhs) throws Throwable;

  Object doSubtract(short lhs, char rhs) throws Throwable;

  Object doSubtract(short lhs, short rhs) throws Throwable;

  Object doSubtract(short lhs, int rhs) throws Throwable;

  Object doSubtract(short lhs, long rhs) throws Throwable;

  Object doSubtract(short lhs, float rhs) throws Throwable;

  Object doSubtract(short lhs, double rhs) throws Throwable;

  Object doSubtract(short lhs, BigInteger rhs) throws Throwable;

  Object doSubtract(short lhs, BigDecimal rhs) throws Throwable;

  Object doSubtract(int lhs, byte rhs) throws Throwable;

  Object doSubtract(int lhs, char rhs) throws Throwable;

  Object doSubtract(int lhs, short rhs) throws Throwable;

  Object doSubtract(int lhs, int rhs) throws Throwable;

  Object doSubtract(int lhs, long rhs) throws Throwable;

  Object doSubtract(int lhs, float rhs) throws Throwable;

  Object doSubtract(int lhs, double rhs) throws Throwable;

  Object doSubtract(int lhs, BigInteger rhs) throws Throwable;

  Object doSubtract(int lhs, BigDecimal rhs) throws Throwable;

  Object doSubtract(long lhs, byte rhs) throws Throwable;

  Object doSubtract(long lhs, char rhs) throws Throwable;

  Object doSubtract(long lhs, short rhs) throws Throwable;

  Object doSubtract(long lhs, int rhs) throws Throwable;

  Object doSubtract(long lhs, long rhs) throws Throwable;

  Object doSubtract(long lhs, float rhs) throws Throwable;

  Object doSubtract(long lhs, double rhs) throws Throwable;

  Object doSubtract(long lhs, BigInteger rhs) throws Throwable;

  Object doSubtract(long lhs, BigDecimal rhs) throws Throwable;

  Object doSubtract(float lhs, byte rhs) throws Throwable;

  Object doSubtract(float lhs, char rhs) throws Throwable;

  Object doSubtract(float lhs, short rhs) throws Throwable;

  Object doSubtract(float lhs, int rhs) throws Throwable;

  Object doSubtract(float lhs, long rhs) throws Throwable;

  Object doSubtract(float lhs, float rhs) throws Throwable;

  Object doSubtract(float lhs, double rhs) throws Throwable;

  Object doSubtract(float lhs, BigInteger rhs) throws Throwable;

  Object doSubtract(float lhs, BigDecimal rhs) throws Throwable;

  Object doSubtract(double lhs, byte rhs) throws Throwable;

  Object doSubtract(double lhs, char rhs) throws Throwable;

  Object doSubtract(double lhs, short rhs) throws Throwable;

  Object doSubtract(double lhs, int rhs) throws Throwable;

  Object doSubtract(double lhs, long rhs) throws Throwable;

  Object doSubtract(double lhs, float rhs) throws Throwable;

  Object doSubtract(double lhs, double rhs) throws Throwable;

  Object doSubtract(double lhs, BigInteger rhs) throws Throwable;

  Object doSubtract(double lhs, BigDecimal rhs) throws Throwable;

  Object doSubtract(BigInteger lhs, byte rhs) throws Throwable;

  Object doSubtract(BigInteger lhs, char rhs) throws Throwable;

  Object doSubtract(BigInteger lhs, short rhs) throws Throwable;

  Object doSubtract(BigInteger lhs, int rhs) throws Throwable;

  Object doSubtract(BigInteger lhs, long rhs) throws Throwable;

  Object doSubtract(BigInteger lhs, float rhs) throws Throwable;

  Object doSubtract(BigInteger lhs, double rhs) throws Throwable;

  Object doSubtract(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object doSubtract(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object doSubtract(BigDecimal lhs, byte rhs) throws Throwable;

  Object doSubtract(BigDecimal lhs, char rhs) throws Throwable;

  Object doSubtract(BigDecimal lhs, short rhs) throws Throwable;

  Object doSubtract(BigDecimal lhs, int rhs) throws Throwable;

  Object doSubtract(BigDecimal lhs, long rhs) throws Throwable;

  Object doSubtract(BigDecimal lhs, float rhs) throws Throwable;

  Object doSubtract(BigDecimal lhs, double rhs) throws Throwable;

  Object doSubtract(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object doSubtract(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object doSubtract(Object lhs, byte rhs) throws Throwable;

  Object doSubtract(Object lhs, char rhs) throws Throwable;

  Object doSubtract(Object lhs, short rhs) throws Throwable;

  Object doSubtract(Object lhs, int rhs) throws Throwable;

  Object doSubtract(Object lhs, long rhs) throws Throwable;

  Object doSubtract(Object lhs, float rhs) throws Throwable;

  Object doSubtract(Object lhs, double rhs) throws Throwable;

  Object doSubtract(Object lhs, BigInteger rhs) throws Throwable;

  Object doSubtract(Object lhs, BigDecimal rhs) throws Throwable;

  Object doReverseSubtract(byte lhs, Object rhs) throws Throwable;

  Object doReverseSubtract(char lhs, Object rhs) throws Throwable;

  Object doReverseSubtract(short lhs, Object rhs) throws Throwable;

  Object doReverseSubtract(int lhs, Object rhs) throws Throwable;

  Object doReverseSubtract(long lhs, Object rhs) throws Throwable;

  Object doReverseSubtract(float lhs, Object rhs) throws Throwable;

  Object doReverseSubtract(double lhs, Object rhs) throws Throwable;

  Object doReverseSubtract(BigInteger lhs, Object rhs) throws Throwable;

  Object doReverseSubtract(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Internal methods for operator -=
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement -=
  //

  Object doSubtractEquals(Object lhs, Object rhs) throws Throwable;

  Object doReverseSubtractEquals(Object lhs, Object rhs) throws Throwable;

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doSubtractEquals(byte lhs, byte rhs) throws Throwable;

  Object doSubtractEquals(byte lhs, char rhs) throws Throwable;

  Object doSubtractEquals(byte lhs, short rhs) throws Throwable;

  Object doSubtractEquals(byte lhs, int rhs) throws Throwable;

  Object doSubtractEquals(byte lhs, long rhs) throws Throwable;

  Object doSubtractEquals(byte lhs, float rhs) throws Throwable;

  Object doSubtractEquals(byte lhs, double rhs) throws Throwable;

  Object doSubtractEquals(byte lhs, BigInteger rhs) throws Throwable;

  Object doSubtractEquals(byte lhs, BigDecimal rhs) throws Throwable;

  Object doSubtractEquals(char lhs, byte rhs) throws Throwable;

  Object doSubtractEquals(char lhs, char rhs) throws Throwable;

  Object doSubtractEquals(char lhs, short rhs) throws Throwable;

  Object doSubtractEquals(char lhs, int rhs) throws Throwable;

  Object doSubtractEquals(char lhs, long rhs) throws Throwable;

  Object doSubtractEquals(char lhs, float rhs) throws Throwable;

  Object doSubtractEquals(char lhs, double rhs) throws Throwable;

  Object doSubtractEquals(char lhs, BigInteger rhs) throws Throwable;

  Object doSubtractEquals(char lhs, BigDecimal rhs) throws Throwable;

  Object doSubtractEquals(short lhs, byte rhs) throws Throwable;

  Object doSubtractEquals(short lhs, char rhs) throws Throwable;

  Object doSubtractEquals(short lhs, short rhs) throws Throwable;

  Object doSubtractEquals(short lhs, int rhs) throws Throwable;

  Object doSubtractEquals(short lhs, long rhs) throws Throwable;

  Object doSubtractEquals(short lhs, float rhs) throws Throwable;

  Object doSubtractEquals(short lhs, double rhs) throws Throwable;

  Object doSubtractEquals(short lhs, BigInteger rhs) throws Throwable;

  Object doSubtractEquals(short lhs, BigDecimal rhs) throws Throwable;

  Object doSubtractEquals(int lhs, byte rhs) throws Throwable;

  Object doSubtractEquals(int lhs, char rhs) throws Throwable;

  Object doSubtractEquals(int lhs, short rhs) throws Throwable;

  Object doSubtractEquals(int lhs, int rhs) throws Throwable;

  Object doSubtractEquals(int lhs, long rhs) throws Throwable;

  Object doSubtractEquals(int lhs, float rhs) throws Throwable;

  Object doSubtractEquals(int lhs, double rhs) throws Throwable;

  Object doSubtractEquals(int lhs, BigInteger rhs) throws Throwable;

  Object doSubtractEquals(int lhs, BigDecimal rhs) throws Throwable;

  Object doSubtractEquals(long lhs, byte rhs) throws Throwable;

  Object doSubtractEquals(long lhs, char rhs) throws Throwable;

  Object doSubtractEquals(long lhs, short rhs) throws Throwable;

  Object doSubtractEquals(long lhs, int rhs) throws Throwable;

  Object doSubtractEquals(long lhs, long rhs) throws Throwable;

  Object doSubtractEquals(long lhs, float rhs) throws Throwable;

  Object doSubtractEquals(long lhs, double rhs) throws Throwable;

  Object doSubtractEquals(long lhs, BigInteger rhs) throws Throwable;

  Object doSubtractEquals(long lhs, BigDecimal rhs) throws Throwable;

  Object doSubtractEquals(float lhs, byte rhs) throws Throwable;

  Object doSubtractEquals(float lhs, char rhs) throws Throwable;

  Object doSubtractEquals(float lhs, short rhs) throws Throwable;

  Object doSubtractEquals(float lhs, int rhs) throws Throwable;

  Object doSubtractEquals(float lhs, long rhs) throws Throwable;

  Object doSubtractEquals(float lhs, float rhs) throws Throwable;

  Object doSubtractEquals(float lhs, double rhs) throws Throwable;

  Object doSubtractEquals(float lhs, BigInteger rhs) throws Throwable;

  Object doSubtractEquals(float lhs, BigDecimal rhs) throws Throwable;

  Object doSubtractEquals(double lhs, byte rhs) throws Throwable;

  Object doSubtractEquals(double lhs, char rhs) throws Throwable;

  Object doSubtractEquals(double lhs, short rhs) throws Throwable;

  Object doSubtractEquals(double lhs, int rhs) throws Throwable;

  Object doSubtractEquals(double lhs, long rhs) throws Throwable;

  Object doSubtractEquals(double lhs, float rhs) throws Throwable;

  Object doSubtractEquals(double lhs, double rhs) throws Throwable;

  Object doSubtractEquals(double lhs, BigInteger rhs) throws Throwable;

  Object doSubtractEquals(double lhs, BigDecimal rhs) throws Throwable;

  Object doSubtractEquals(BigInteger lhs, byte rhs) throws Throwable;

  Object doSubtractEquals(BigInteger lhs, char rhs) throws Throwable;

  Object doSubtractEquals(BigInteger lhs, short rhs) throws Throwable;

  Object doSubtractEquals(BigInteger lhs, int rhs) throws Throwable;

  Object doSubtractEquals(BigInteger lhs, long rhs) throws Throwable;

  Object doSubtractEquals(BigInteger lhs, float rhs) throws Throwable;

  Object doSubtractEquals(BigInteger lhs, double rhs) throws Throwable;

  Object doSubtractEquals(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object doSubtractEquals(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object doSubtractEquals(BigDecimal lhs, byte rhs) throws Throwable;

  Object doSubtractEquals(BigDecimal lhs, char rhs) throws Throwable;

  Object doSubtractEquals(BigDecimal lhs, short rhs) throws Throwable;

  Object doSubtractEquals(BigDecimal lhs, int rhs) throws Throwable;

  Object doSubtractEquals(BigDecimal lhs, long rhs) throws Throwable;

  Object doSubtractEquals(BigDecimal lhs, float rhs) throws Throwable;

  Object doSubtractEquals(BigDecimal lhs, double rhs) throws Throwable;

  Object doSubtractEquals(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object doSubtractEquals(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object doSubtractEquals(Object lhs, byte rhs) throws Throwable;

  Object doSubtractEquals(Object lhs, char rhs) throws Throwable;

  Object doSubtractEquals(Object lhs, short rhs) throws Throwable;

  Object doSubtractEquals(Object lhs, int rhs) throws Throwable;

  Object doSubtractEquals(Object lhs, long rhs) throws Throwable;

  Object doSubtractEquals(Object lhs, float rhs) throws Throwable;

  Object doSubtractEquals(Object lhs, double rhs) throws Throwable;

  Object doSubtractEquals(Object lhs, BigInteger rhs) throws Throwable;

  Object doSubtractEquals(Object lhs, BigDecimal rhs) throws Throwable;

  Object doReverseSubtractEquals(byte lhs, Object rhs) throws Throwable;

  Object doReverseSubtractEquals(char lhs, Object rhs) throws Throwable;

  Object doReverseSubtractEquals(short lhs, Object rhs) throws Throwable;

  Object doReverseSubtractEquals(int lhs, Object rhs) throws Throwable;

  Object doReverseSubtractEquals(long lhs, Object rhs) throws Throwable;

  Object doReverseSubtractEquals(float lhs, Object rhs) throws Throwable;

  Object doReverseSubtractEquals(double lhs, Object rhs) throws Throwable;

  Object doReverseSubtractEquals(BigInteger lhs, Object rhs) throws Throwable;

  Object doReverseSubtractEquals(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Internal methods for operator *
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement *
  //

  Object doMultiply(Object lhs, Object rhs) throws Throwable;

  Object doReverseMultiply(Object lhs, Object rhs) throws Throwable;

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doMultiply(byte lhs, byte rhs) throws Throwable;

  Object doMultiply(byte lhs, char rhs) throws Throwable;

  Object doMultiply(byte lhs, short rhs) throws Throwable;

  Object doMultiply(byte lhs, int rhs) throws Throwable;

  Object doMultiply(byte lhs, long rhs) throws Throwable;

  Object doMultiply(byte lhs, float rhs) throws Throwable;

  Object doMultiply(byte lhs, double rhs) throws Throwable;

  Object doMultiply(byte lhs, BigInteger rhs) throws Throwable;

  Object doMultiply(byte lhs, BigDecimal rhs) throws Throwable;

  Object doMultiply(char lhs, byte rhs) throws Throwable;

  Object doMultiply(char lhs, char rhs) throws Throwable;

  Object doMultiply(char lhs, short rhs) throws Throwable;

  Object doMultiply(char lhs, int rhs) throws Throwable;

  Object doMultiply(char lhs, long rhs) throws Throwable;

  Object doMultiply(char lhs, float rhs) throws Throwable;

  Object doMultiply(char lhs, double rhs) throws Throwable;

  Object doMultiply(char lhs, BigInteger rhs) throws Throwable;

  Object doMultiply(char lhs, BigDecimal rhs) throws Throwable;

  Object doMultiply(short lhs, byte rhs) throws Throwable;

  Object doMultiply(short lhs, char rhs) throws Throwable;

  Object doMultiply(short lhs, short rhs) throws Throwable;

  Object doMultiply(short lhs, int rhs) throws Throwable;

  Object doMultiply(short lhs, long rhs) throws Throwable;

  Object doMultiply(short lhs, float rhs) throws Throwable;

  Object doMultiply(short lhs, double rhs) throws Throwable;

  Object doMultiply(short lhs, BigInteger rhs) throws Throwable;

  Object doMultiply(short lhs, BigDecimal rhs) throws Throwable;

  Object doMultiply(int lhs, byte rhs) throws Throwable;

  Object doMultiply(int lhs, char rhs) throws Throwable;

  Object doMultiply(int lhs, short rhs) throws Throwable;

  Object doMultiply(int lhs, int rhs) throws Throwable;

  Object doMultiply(int lhs, long rhs) throws Throwable;

  Object doMultiply(int lhs, float rhs) throws Throwable;

  Object doMultiply(int lhs, double rhs) throws Throwable;

  Object doMultiply(int lhs, BigInteger rhs) throws Throwable;

  Object doMultiply(int lhs, BigDecimal rhs) throws Throwable;

  Object doMultiply(long lhs, byte rhs) throws Throwable;

  Object doMultiply(long lhs, char rhs) throws Throwable;

  Object doMultiply(long lhs, short rhs) throws Throwable;

  Object doMultiply(long lhs, int rhs) throws Throwable;

  Object doMultiply(long lhs, long rhs) throws Throwable;

  Object doMultiply(long lhs, float rhs) throws Throwable;

  Object doMultiply(long lhs, double rhs) throws Throwable;

  Object doMultiply(long lhs, BigInteger rhs) throws Throwable;

  Object doMultiply(long lhs, BigDecimal rhs) throws Throwable;

  Object doMultiply(float lhs, byte rhs) throws Throwable;

  Object doMultiply(float lhs, char rhs) throws Throwable;

  Object doMultiply(float lhs, short rhs) throws Throwable;

  Object doMultiply(float lhs, int rhs) throws Throwable;

  Object doMultiply(float lhs, long rhs) throws Throwable;

  Object doMultiply(float lhs, float rhs) throws Throwable;

  Object doMultiply(float lhs, double rhs) throws Throwable;

  Object doMultiply(float lhs, BigInteger rhs) throws Throwable;

  Object doMultiply(float lhs, BigDecimal rhs) throws Throwable;

  Object doMultiply(double lhs, byte rhs) throws Throwable;

  Object doMultiply(double lhs, char rhs) throws Throwable;

  Object doMultiply(double lhs, short rhs) throws Throwable;

  Object doMultiply(double lhs, int rhs) throws Throwable;

  Object doMultiply(double lhs, long rhs) throws Throwable;

  Object doMultiply(double lhs, float rhs) throws Throwable;

  Object doMultiply(double lhs, double rhs) throws Throwable;

  Object doMultiply(double lhs, BigInteger rhs) throws Throwable;

  Object doMultiply(double lhs, BigDecimal rhs) throws Throwable;

  Object doMultiply(BigInteger lhs, byte rhs) throws Throwable;

  Object doMultiply(BigInteger lhs, char rhs) throws Throwable;

  Object doMultiply(BigInteger lhs, short rhs) throws Throwable;

  Object doMultiply(BigInteger lhs, int rhs) throws Throwable;

  Object doMultiply(BigInteger lhs, long rhs) throws Throwable;

  Object doMultiply(BigInteger lhs, float rhs) throws Throwable;

  Object doMultiply(BigInteger lhs, double rhs) throws Throwable;

  Object doMultiply(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object doMultiply(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object doMultiply(BigDecimal lhs, byte rhs) throws Throwable;

  Object doMultiply(BigDecimal lhs, char rhs) throws Throwable;

  Object doMultiply(BigDecimal lhs, short rhs) throws Throwable;

  Object doMultiply(BigDecimal lhs, int rhs) throws Throwable;

  Object doMultiply(BigDecimal lhs, long rhs) throws Throwable;

  Object doMultiply(BigDecimal lhs, float rhs) throws Throwable;

  Object doMultiply(BigDecimal lhs, double rhs) throws Throwable;

  Object doMultiply(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object doMultiply(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object doMultiply(Object lhs, byte rhs) throws Throwable;

  Object doMultiply(Object lhs, char rhs) throws Throwable;

  Object doMultiply(Object lhs, short rhs) throws Throwable;

  Object doMultiply(Object lhs, int rhs) throws Throwable;

  Object doMultiply(Object lhs, long rhs) throws Throwable;

  Object doMultiply(Object lhs, float rhs) throws Throwable;

  Object doMultiply(Object lhs, double rhs) throws Throwable;

  Object doMultiply(Object lhs, BigInteger rhs) throws Throwable;

  Object doMultiply(Object lhs, BigDecimal rhs) throws Throwable;

  Object doReverseMultiply(byte lhs, Object rhs) throws Throwable;

  Object doReverseMultiply(char lhs, Object rhs) throws Throwable;

  Object doReverseMultiply(short lhs, Object rhs) throws Throwable;

  Object doReverseMultiply(int lhs, Object rhs) throws Throwable;

  Object doReverseMultiply(long lhs, Object rhs) throws Throwable;

  Object doReverseMultiply(float lhs, Object rhs) throws Throwable;

  Object doReverseMultiply(double lhs, Object rhs) throws Throwable;

  Object doReverseMultiply(BigInteger lhs, Object rhs) throws Throwable;

  Object doReverseMultiply(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Internal methods for operator *=
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement *=
  //

  Object doMultiplyEquals(Object lhs, Object rhs) throws Throwable;

  Object doReverseMultiplyEquals(Object lhs, Object rhs) throws Throwable;

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doMultiplyEquals(byte lhs, byte rhs) throws Throwable;

  Object doMultiplyEquals(byte lhs, char rhs) throws Throwable;

  Object doMultiplyEquals(byte lhs, short rhs) throws Throwable;

  Object doMultiplyEquals(byte lhs, int rhs) throws Throwable;

  Object doMultiplyEquals(byte lhs, long rhs) throws Throwable;

  Object doMultiplyEquals(byte lhs, float rhs) throws Throwable;

  Object doMultiplyEquals(byte lhs, double rhs) throws Throwable;

  Object doMultiplyEquals(byte lhs, BigInteger rhs) throws Throwable;

  Object doMultiplyEquals(byte lhs, BigDecimal rhs) throws Throwable;

  Object doMultiplyEquals(char lhs, byte rhs) throws Throwable;

  Object doMultiplyEquals(char lhs, char rhs) throws Throwable;

  Object doMultiplyEquals(char lhs, short rhs) throws Throwable;

  Object doMultiplyEquals(char lhs, int rhs) throws Throwable;

  Object doMultiplyEquals(char lhs, long rhs) throws Throwable;

  Object doMultiplyEquals(char lhs, float rhs) throws Throwable;

  Object doMultiplyEquals(char lhs, double rhs) throws Throwable;

  Object doMultiplyEquals(char lhs, BigInteger rhs) throws Throwable;

  Object doMultiplyEquals(char lhs, BigDecimal rhs) throws Throwable;

  Object doMultiplyEquals(short lhs, byte rhs) throws Throwable;

  Object doMultiplyEquals(short lhs, char rhs) throws Throwable;

  Object doMultiplyEquals(short lhs, short rhs) throws Throwable;

  Object doMultiplyEquals(short lhs, int rhs) throws Throwable;

  Object doMultiplyEquals(short lhs, long rhs) throws Throwable;

  Object doMultiplyEquals(short lhs, float rhs) throws Throwable;

  Object doMultiplyEquals(short lhs, double rhs) throws Throwable;

  Object doMultiplyEquals(short lhs, BigInteger rhs) throws Throwable;

  Object doMultiplyEquals(short lhs, BigDecimal rhs) throws Throwable;

  Object doMultiplyEquals(int lhs, byte rhs) throws Throwable;

  Object doMultiplyEquals(int lhs, char rhs) throws Throwable;

  Object doMultiplyEquals(int lhs, short rhs) throws Throwable;

  Object doMultiplyEquals(int lhs, int rhs) throws Throwable;

  Object doMultiplyEquals(int lhs, long rhs) throws Throwable;

  Object doMultiplyEquals(int lhs, float rhs) throws Throwable;

  Object doMultiplyEquals(int lhs, double rhs) throws Throwable;

  Object doMultiplyEquals(int lhs, BigInteger rhs) throws Throwable;

  Object doMultiplyEquals(int lhs, BigDecimal rhs) throws Throwable;

  Object doMultiplyEquals(long lhs, byte rhs) throws Throwable;

  Object doMultiplyEquals(long lhs, char rhs) throws Throwable;

  Object doMultiplyEquals(long lhs, short rhs) throws Throwable;

  Object doMultiplyEquals(long lhs, int rhs) throws Throwable;

  Object doMultiplyEquals(long lhs, long rhs) throws Throwable;

  Object doMultiplyEquals(long lhs, float rhs) throws Throwable;

  Object doMultiplyEquals(long lhs, double rhs) throws Throwable;

  Object doMultiplyEquals(long lhs, BigInteger rhs) throws Throwable;

  Object doMultiplyEquals(long lhs, BigDecimal rhs) throws Throwable;

  Object doMultiplyEquals(float lhs, byte rhs) throws Throwable;

  Object doMultiplyEquals(float lhs, char rhs) throws Throwable;

  Object doMultiplyEquals(float lhs, short rhs) throws Throwable;

  Object doMultiplyEquals(float lhs, int rhs) throws Throwable;

  Object doMultiplyEquals(float lhs, long rhs) throws Throwable;

  Object doMultiplyEquals(float lhs, float rhs) throws Throwable;

  Object doMultiplyEquals(float lhs, double rhs) throws Throwable;

  Object doMultiplyEquals(float lhs, BigInteger rhs) throws Throwable;

  Object doMultiplyEquals(float lhs, BigDecimal rhs) throws Throwable;

  Object doMultiplyEquals(double lhs, byte rhs) throws Throwable;

  Object doMultiplyEquals(double lhs, char rhs) throws Throwable;

  Object doMultiplyEquals(double lhs, short rhs) throws Throwable;

  Object doMultiplyEquals(double lhs, int rhs) throws Throwable;

  Object doMultiplyEquals(double lhs, long rhs) throws Throwable;

  Object doMultiplyEquals(double lhs, float rhs) throws Throwable;

  Object doMultiplyEquals(double lhs, double rhs) throws Throwable;

  Object doMultiplyEquals(double lhs, BigInteger rhs) throws Throwable;

  Object doMultiplyEquals(double lhs, BigDecimal rhs) throws Throwable;

  Object doMultiplyEquals(BigInteger lhs, byte rhs) throws Throwable;

  Object doMultiplyEquals(BigInteger lhs, char rhs) throws Throwable;

  Object doMultiplyEquals(BigInteger lhs, short rhs) throws Throwable;

  Object doMultiplyEquals(BigInteger lhs, int rhs) throws Throwable;

  Object doMultiplyEquals(BigInteger lhs, long rhs) throws Throwable;

  Object doMultiplyEquals(BigInteger lhs, float rhs) throws Throwable;

  Object doMultiplyEquals(BigInteger lhs, double rhs) throws Throwable;

  Object doMultiplyEquals(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object doMultiplyEquals(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object doMultiplyEquals(BigDecimal lhs, byte rhs) throws Throwable;

  Object doMultiplyEquals(BigDecimal lhs, char rhs) throws Throwable;

  Object doMultiplyEquals(BigDecimal lhs, short rhs) throws Throwable;

  Object doMultiplyEquals(BigDecimal lhs, int rhs) throws Throwable;

  Object doMultiplyEquals(BigDecimal lhs, long rhs) throws Throwable;

  Object doMultiplyEquals(BigDecimal lhs, float rhs) throws Throwable;

  Object doMultiplyEquals(BigDecimal lhs, double rhs) throws Throwable;

  Object doMultiplyEquals(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object doMultiplyEquals(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object doMultiplyEquals(Object lhs, byte rhs) throws Throwable;

  Object doMultiplyEquals(Object lhs, char rhs) throws Throwable;

  Object doMultiplyEquals(Object lhs, short rhs) throws Throwable;

  Object doMultiplyEquals(Object lhs, int rhs) throws Throwable;

  Object doMultiplyEquals(Object lhs, long rhs) throws Throwable;

  Object doMultiplyEquals(Object lhs, float rhs) throws Throwable;

  Object doMultiplyEquals(Object lhs, double rhs) throws Throwable;

  Object doMultiplyEquals(Object lhs, BigInteger rhs) throws Throwable;

  Object doMultiplyEquals(Object lhs, BigDecimal rhs) throws Throwable;

  Object doReverseMultiplyEquals(byte lhs, Object rhs) throws Throwable;

  Object doReverseMultiplyEquals(char lhs, Object rhs) throws Throwable;

  Object doReverseMultiplyEquals(short lhs, Object rhs) throws Throwable;

  Object doReverseMultiplyEquals(int lhs, Object rhs) throws Throwable;

  Object doReverseMultiplyEquals(long lhs, Object rhs) throws Throwable;

  Object doReverseMultiplyEquals(float lhs, Object rhs) throws Throwable;

  Object doReverseMultiplyEquals(double lhs, Object rhs) throws Throwable;

  Object doReverseMultiplyEquals(BigInteger lhs, Object rhs) throws Throwable;

  Object doReverseMultiplyEquals(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Internal methods for operator /
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement /
  //

  Object doDivide(Object lhs, Object rhs) throws Throwable;

  Object doReverseDivide(Object lhs, Object rhs) throws Throwable;

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doDivide(byte lhs, byte rhs) throws Throwable;

  Object doDivide(byte lhs, char rhs) throws Throwable;

  Object doDivide(byte lhs, short rhs) throws Throwable;

  Object doDivide(byte lhs, int rhs) throws Throwable;

  Object doDivide(byte lhs, long rhs) throws Throwable;

  Object doDivide(byte lhs, float rhs) throws Throwable;

  Object doDivide(byte lhs, double rhs) throws Throwable;

  Object doDivide(byte lhs, BigInteger rhs) throws Throwable;

  Object doDivide(byte lhs, BigDecimal rhs) throws Throwable;

  Object doDivide(char lhs, byte rhs) throws Throwable;

  Object doDivide(char lhs, char rhs) throws Throwable;

  Object doDivide(char lhs, short rhs) throws Throwable;

  Object doDivide(char lhs, int rhs) throws Throwable;

  Object doDivide(char lhs, long rhs) throws Throwable;

  Object doDivide(char lhs, float rhs) throws Throwable;

  Object doDivide(char lhs, double rhs) throws Throwable;

  Object doDivide(char lhs, BigInteger rhs) throws Throwable;

  Object doDivide(char lhs, BigDecimal rhs) throws Throwable;

  Object doDivide(short lhs, byte rhs) throws Throwable;

  Object doDivide(short lhs, char rhs) throws Throwable;

  Object doDivide(short lhs, short rhs) throws Throwable;

  Object doDivide(short lhs, int rhs) throws Throwable;

  Object doDivide(short lhs, long rhs) throws Throwable;

  Object doDivide(short lhs, float rhs) throws Throwable;

  Object doDivide(short lhs, double rhs) throws Throwable;

  Object doDivide(short lhs, BigInteger rhs) throws Throwable;

  Object doDivide(short lhs, BigDecimal rhs) throws Throwable;

  Object doDivide(int lhs, byte rhs) throws Throwable;

  Object doDivide(int lhs, char rhs) throws Throwable;

  Object doDivide(int lhs, short rhs) throws Throwable;

  Object doDivide(int lhs, int rhs) throws Throwable;

  Object doDivide(int lhs, long rhs) throws Throwable;

  Object doDivide(int lhs, float rhs) throws Throwable;

  Object doDivide(int lhs, double rhs) throws Throwable;

  Object doDivide(int lhs, BigInteger rhs) throws Throwable;

  Object doDivide(int lhs, BigDecimal rhs) throws Throwable;

  Object doDivide(long lhs, byte rhs) throws Throwable;

  Object doDivide(long lhs, char rhs) throws Throwable;

  Object doDivide(long lhs, short rhs) throws Throwable;

  Object doDivide(long lhs, int rhs) throws Throwable;

  Object doDivide(long lhs, long rhs) throws Throwable;

  Object doDivide(long lhs, float rhs) throws Throwable;

  Object doDivide(long lhs, double rhs) throws Throwable;

  Object doDivide(long lhs, BigInteger rhs) throws Throwable;

  Object doDivide(long lhs, BigDecimal rhs) throws Throwable;

  Object doDivide(float lhs, byte rhs) throws Throwable;

  Object doDivide(float lhs, char rhs) throws Throwable;

  Object doDivide(float lhs, short rhs) throws Throwable;

  Object doDivide(float lhs, int rhs) throws Throwable;

  Object doDivide(float lhs, long rhs) throws Throwable;

  Object doDivide(float lhs, float rhs) throws Throwable;

  Object doDivide(float lhs, double rhs) throws Throwable;

  Object doDivide(float lhs, BigInteger rhs) throws Throwable;

  Object doDivide(float lhs, BigDecimal rhs) throws Throwable;

  Object doDivide(double lhs, byte rhs) throws Throwable;

  Object doDivide(double lhs, char rhs) throws Throwable;

  Object doDivide(double lhs, short rhs) throws Throwable;

  Object doDivide(double lhs, int rhs) throws Throwable;

  Object doDivide(double lhs, long rhs) throws Throwable;

  Object doDivide(double lhs, float rhs) throws Throwable;

  Object doDivide(double lhs, double rhs) throws Throwable;

  Object doDivide(double lhs, BigInteger rhs) throws Throwable;

  Object doDivide(double lhs, BigDecimal rhs) throws Throwable;

  Object doDivide(BigInteger lhs, byte rhs) throws Throwable;

  Object doDivide(BigInteger lhs, char rhs) throws Throwable;

  Object doDivide(BigInteger lhs, short rhs) throws Throwable;

  Object doDivide(BigInteger lhs, int rhs) throws Throwable;

  Object doDivide(BigInteger lhs, long rhs) throws Throwable;

  Object doDivide(BigInteger lhs, float rhs) throws Throwable;

  Object doDivide(BigInteger lhs, double rhs) throws Throwable;

  Object doDivide(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object doDivide(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object doDivide(BigDecimal lhs, byte rhs) throws Throwable;

  Object doDivide(BigDecimal lhs, char rhs) throws Throwable;

  Object doDivide(BigDecimal lhs, short rhs) throws Throwable;

  Object doDivide(BigDecimal lhs, int rhs) throws Throwable;

  Object doDivide(BigDecimal lhs, long rhs) throws Throwable;

  Object doDivide(BigDecimal lhs, float rhs) throws Throwable;

  Object doDivide(BigDecimal lhs, double rhs) throws Throwable;

  Object doDivide(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object doDivide(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object doDivide(Object lhs, byte rhs) throws Throwable;

  Object doDivide(Object lhs, char rhs) throws Throwable;

  Object doDivide(Object lhs, short rhs) throws Throwable;

  Object doDivide(Object lhs, int rhs) throws Throwable;

  Object doDivide(Object lhs, long rhs) throws Throwable;

  Object doDivide(Object lhs, float rhs) throws Throwable;

  Object doDivide(Object lhs, double rhs) throws Throwable;

  Object doDivide(Object lhs, BigInteger rhs) throws Throwable;

  Object doDivide(Object lhs, BigDecimal rhs) throws Throwable;

  Object doReverseDivide(byte lhs, Object rhs) throws Throwable;

  Object doReverseDivide(char lhs, Object rhs) throws Throwable;

  Object doReverseDivide(short lhs, Object rhs) throws Throwable;

  Object doReverseDivide(int lhs, Object rhs) throws Throwable;

  Object doReverseDivide(long lhs, Object rhs) throws Throwable;

  Object doReverseDivide(float lhs, Object rhs) throws Throwable;

  Object doReverseDivide(double lhs, Object rhs) throws Throwable;

  Object doReverseDivide(BigInteger lhs, Object rhs) throws Throwable;

  Object doReverseDivide(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Internal methods for operator /=
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement /=
  //

  Object doDivideEquals(Object lhs, Object rhs) throws Throwable;

  Object doReverseDivideEquals(Object lhs, Object rhs) throws Throwable;

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doDivideEquals(byte lhs, byte rhs) throws Throwable;

  Object doDivideEquals(byte lhs, char rhs) throws Throwable;

  Object doDivideEquals(byte lhs, short rhs) throws Throwable;

  Object doDivideEquals(byte lhs, int rhs) throws Throwable;

  Object doDivideEquals(byte lhs, long rhs) throws Throwable;

  Object doDivideEquals(byte lhs, float rhs) throws Throwable;

  Object doDivideEquals(byte lhs, double rhs) throws Throwable;

  Object doDivideEquals(byte lhs, BigInteger rhs) throws Throwable;

  Object doDivideEquals(byte lhs, BigDecimal rhs) throws Throwable;

  Object doDivideEquals(char lhs, byte rhs) throws Throwable;

  Object doDivideEquals(char lhs, char rhs) throws Throwable;

  Object doDivideEquals(char lhs, short rhs) throws Throwable;

  Object doDivideEquals(char lhs, int rhs) throws Throwable;

  Object doDivideEquals(char lhs, long rhs) throws Throwable;

  Object doDivideEquals(char lhs, float rhs) throws Throwable;

  Object doDivideEquals(char lhs, double rhs) throws Throwable;

  Object doDivideEquals(char lhs, BigInteger rhs) throws Throwable;

  Object doDivideEquals(char lhs, BigDecimal rhs) throws Throwable;

  Object doDivideEquals(short lhs, byte rhs) throws Throwable;

  Object doDivideEquals(short lhs, char rhs) throws Throwable;

  Object doDivideEquals(short lhs, short rhs) throws Throwable;

  Object doDivideEquals(short lhs, int rhs) throws Throwable;

  Object doDivideEquals(short lhs, long rhs) throws Throwable;

  Object doDivideEquals(short lhs, float rhs) throws Throwable;

  Object doDivideEquals(short lhs, double rhs) throws Throwable;

  Object doDivideEquals(short lhs, BigInteger rhs) throws Throwable;

  Object doDivideEquals(short lhs, BigDecimal rhs) throws Throwable;

  Object doDivideEquals(int lhs, byte rhs) throws Throwable;

  Object doDivideEquals(int lhs, char rhs) throws Throwable;

  Object doDivideEquals(int lhs, short rhs) throws Throwable;

  Object doDivideEquals(int lhs, int rhs) throws Throwable;

  Object doDivideEquals(int lhs, long rhs) throws Throwable;

  Object doDivideEquals(int lhs, float rhs) throws Throwable;

  Object doDivideEquals(int lhs, double rhs) throws Throwable;

  Object doDivideEquals(int lhs, BigInteger rhs) throws Throwable;

  Object doDivideEquals(int lhs, BigDecimal rhs) throws Throwable;

  Object doDivideEquals(long lhs, byte rhs) throws Throwable;

  Object doDivideEquals(long lhs, char rhs) throws Throwable;

  Object doDivideEquals(long lhs, short rhs) throws Throwable;

  Object doDivideEquals(long lhs, int rhs) throws Throwable;

  Object doDivideEquals(long lhs, long rhs) throws Throwable;

  Object doDivideEquals(long lhs, float rhs) throws Throwable;

  Object doDivideEquals(long lhs, double rhs) throws Throwable;

  Object doDivideEquals(long lhs, BigInteger rhs) throws Throwable;

  Object doDivideEquals(long lhs, BigDecimal rhs) throws Throwable;

  Object doDivideEquals(float lhs, byte rhs) throws Throwable;

  Object doDivideEquals(float lhs, char rhs) throws Throwable;

  Object doDivideEquals(float lhs, short rhs) throws Throwable;

  Object doDivideEquals(float lhs, int rhs) throws Throwable;

  Object doDivideEquals(float lhs, long rhs) throws Throwable;

  Object doDivideEquals(float lhs, float rhs) throws Throwable;

  Object doDivideEquals(float lhs, double rhs) throws Throwable;

  Object doDivideEquals(float lhs, BigInteger rhs) throws Throwable;

  Object doDivideEquals(float lhs, BigDecimal rhs) throws Throwable;

  Object doDivideEquals(double lhs, byte rhs) throws Throwable;

  Object doDivideEquals(double lhs, char rhs) throws Throwable;

  Object doDivideEquals(double lhs, short rhs) throws Throwable;

  Object doDivideEquals(double lhs, int rhs) throws Throwable;

  Object doDivideEquals(double lhs, long rhs) throws Throwable;

  Object doDivideEquals(double lhs, float rhs) throws Throwable;

  Object doDivideEquals(double lhs, double rhs) throws Throwable;

  Object doDivideEquals(double lhs, BigInteger rhs) throws Throwable;

  Object doDivideEquals(double lhs, BigDecimal rhs) throws Throwable;

  Object doDivideEquals(BigInteger lhs, byte rhs) throws Throwable;

  Object doDivideEquals(BigInteger lhs, char rhs) throws Throwable;

  Object doDivideEquals(BigInteger lhs, short rhs) throws Throwable;

  Object doDivideEquals(BigInteger lhs, int rhs) throws Throwable;

  Object doDivideEquals(BigInteger lhs, long rhs) throws Throwable;

  Object doDivideEquals(BigInteger lhs, float rhs) throws Throwable;

  Object doDivideEquals(BigInteger lhs, double rhs) throws Throwable;

  Object doDivideEquals(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object doDivideEquals(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object doDivideEquals(BigDecimal lhs, byte rhs) throws Throwable;

  Object doDivideEquals(BigDecimal lhs, char rhs) throws Throwable;

  Object doDivideEquals(BigDecimal lhs, short rhs) throws Throwable;

  Object doDivideEquals(BigDecimal lhs, int rhs) throws Throwable;

  Object doDivideEquals(BigDecimal lhs, long rhs) throws Throwable;

  Object doDivideEquals(BigDecimal lhs, float rhs) throws Throwable;

  Object doDivideEquals(BigDecimal lhs, double rhs) throws Throwable;

  Object doDivideEquals(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object doDivideEquals(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object doDivideEquals(Object lhs, byte rhs) throws Throwable;

  Object doDivideEquals(Object lhs, char rhs) throws Throwable;

  Object doDivideEquals(Object lhs, short rhs) throws Throwable;

  Object doDivideEquals(Object lhs, int rhs) throws Throwable;

  Object doDivideEquals(Object lhs, long rhs) throws Throwable;

  Object doDivideEquals(Object lhs, float rhs) throws Throwable;

  Object doDivideEquals(Object lhs, double rhs) throws Throwable;

  Object doDivideEquals(Object lhs, BigInteger rhs) throws Throwable;

  Object doDivideEquals(Object lhs, BigDecimal rhs) throws Throwable;

  Object doReverseDivideEquals(byte lhs, Object rhs) throws Throwable;

  Object doReverseDivideEquals(char lhs, Object rhs) throws Throwable;

  Object doReverseDivideEquals(short lhs, Object rhs) throws Throwable;

  Object doReverseDivideEquals(int lhs, Object rhs) throws Throwable;

  Object doReverseDivideEquals(long lhs, Object rhs) throws Throwable;

  Object doReverseDivideEquals(float lhs, Object rhs) throws Throwable;

  Object doReverseDivideEquals(double lhs, Object rhs) throws Throwable;

  Object doReverseDivideEquals(BigInteger lhs, Object rhs) throws Throwable;

  Object doReverseDivideEquals(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Internal methods for operator %
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement %
  //

  Object doRemainder(Object lhs, Object rhs) throws Throwable;

  Object doReverseRemainder(Object lhs, Object rhs) throws Throwable;

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doRemainder(byte lhs, byte rhs) throws Throwable;

  Object doRemainder(byte lhs, char rhs) throws Throwable;

  Object doRemainder(byte lhs, short rhs) throws Throwable;

  Object doRemainder(byte lhs, int rhs) throws Throwable;

  Object doRemainder(byte lhs, long rhs) throws Throwable;

  Object doRemainder(byte lhs, BigInteger rhs) throws Throwable;

  Object doRemainder(char lhs, byte rhs) throws Throwable;

  Object doRemainder(char lhs, char rhs) throws Throwable;

  Object doRemainder(char lhs, short rhs) throws Throwable;

  Object doRemainder(char lhs, int rhs) throws Throwable;

  Object doRemainder(char lhs, long rhs) throws Throwable;

  Object doRemainder(char lhs, BigInteger rhs) throws Throwable;

  Object doRemainder(short lhs, byte rhs) throws Throwable;

  Object doRemainder(short lhs, char rhs) throws Throwable;

  Object doRemainder(short lhs, short rhs) throws Throwable;

  Object doRemainder(short lhs, int rhs) throws Throwable;

  Object doRemainder(short lhs, long rhs) throws Throwable;

  Object doRemainder(short lhs, BigInteger rhs) throws Throwable;

  Object doRemainder(int lhs, byte rhs) throws Throwable;

  Object doRemainder(int lhs, char rhs) throws Throwable;

  Object doRemainder(int lhs, short rhs) throws Throwable;

  Object doRemainder(int lhs, int rhs) throws Throwable;

  Object doRemainder(int lhs, long rhs) throws Throwable;

  Object doRemainder(int lhs, BigInteger rhs) throws Throwable;

  Object doRemainder(long lhs, byte rhs) throws Throwable;

  Object doRemainder(long lhs, char rhs) throws Throwable;

  Object doRemainder(long lhs, short rhs) throws Throwable;

  Object doRemainder(long lhs, int rhs) throws Throwable;

  Object doRemainder(long lhs, long rhs) throws Throwable;

  Object doRemainder(long lhs, BigInteger rhs) throws Throwable;

  Object doRemainder(BigInteger lhs, byte rhs) throws Throwable;

  Object doRemainder(BigInteger lhs, char rhs) throws Throwable;

  Object doRemainder(BigInteger lhs, short rhs) throws Throwable;

  Object doRemainder(BigInteger lhs, int rhs) throws Throwable;

  Object doRemainder(BigInteger lhs, long rhs) throws Throwable;

  Object doRemainder(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object doRemainder(Object lhs, byte rhs) throws Throwable;

  Object doRemainder(Object lhs, char rhs) throws Throwable;

  Object doRemainder(Object lhs, short rhs) throws Throwable;

  Object doRemainder(Object lhs, int rhs) throws Throwable;

  Object doRemainder(Object lhs, long rhs) throws Throwable;

  Object doRemainder(Object lhs, BigInteger rhs) throws Throwable;

  Object doReverseRemainder(byte lhs, Object rhs) throws Throwable;

  Object doReverseRemainder(char lhs, Object rhs) throws Throwable;

  Object doReverseRemainder(short lhs, Object rhs) throws Throwable;

  Object doReverseRemainder(int lhs, Object rhs) throws Throwable;

  Object doReverseRemainder(long lhs, Object rhs) throws Throwable;

  Object doReverseRemainder(BigInteger lhs, Object rhs) throws Throwable;

  //
  //   Internal methods for operator %=
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement %=
  //

  Object doRemainderEquals(Object lhs, Object rhs) throws Throwable;

  Object doReverseRemainderEquals(Object lhs, Object rhs) throws Throwable;

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doRemainderEquals(byte lhs, byte rhs) throws Throwable;

  Object doRemainderEquals(byte lhs, char rhs) throws Throwable;

  Object doRemainderEquals(byte lhs, short rhs) throws Throwable;

  Object doRemainderEquals(byte lhs, int rhs) throws Throwable;

  Object doRemainderEquals(byte lhs, long rhs) throws Throwable;

  Object doRemainderEquals(byte lhs, BigInteger rhs) throws Throwable;

  Object doRemainderEquals(char lhs, byte rhs) throws Throwable;

  Object doRemainderEquals(char lhs, char rhs) throws Throwable;

  Object doRemainderEquals(char lhs, short rhs) throws Throwable;

  Object doRemainderEquals(char lhs, int rhs) throws Throwable;

  Object doRemainderEquals(char lhs, long rhs) throws Throwable;

  Object doRemainderEquals(char lhs, BigInteger rhs) throws Throwable;

  Object doRemainderEquals(short lhs, byte rhs) throws Throwable;

  Object doRemainderEquals(short lhs, char rhs) throws Throwable;

  Object doRemainderEquals(short lhs, short rhs) throws Throwable;

  Object doRemainderEquals(short lhs, int rhs) throws Throwable;

  Object doRemainderEquals(short lhs, long rhs) throws Throwable;

  Object doRemainderEquals(short lhs, BigInteger rhs) throws Throwable;

  Object doRemainderEquals(int lhs, byte rhs) throws Throwable;

  Object doRemainderEquals(int lhs, char rhs) throws Throwable;

  Object doRemainderEquals(int lhs, short rhs) throws Throwable;

  Object doRemainderEquals(int lhs, int rhs) throws Throwable;

  Object doRemainderEquals(int lhs, long rhs) throws Throwable;

  Object doRemainderEquals(int lhs, BigInteger rhs) throws Throwable;

  Object doRemainderEquals(long lhs, byte rhs) throws Throwable;

  Object doRemainderEquals(long lhs, char rhs) throws Throwable;

  Object doRemainderEquals(long lhs, short rhs) throws Throwable;

  Object doRemainderEquals(long lhs, int rhs) throws Throwable;

  Object doRemainderEquals(long lhs, long rhs) throws Throwable;

  Object doRemainderEquals(long lhs, BigInteger rhs) throws Throwable;

  Object doRemainderEquals(BigInteger lhs, byte rhs) throws Throwable;

  Object doRemainderEquals(BigInteger lhs, char rhs) throws Throwable;

  Object doRemainderEquals(BigInteger lhs, short rhs) throws Throwable;

  Object doRemainderEquals(BigInteger lhs, int rhs) throws Throwable;

  Object doRemainderEquals(BigInteger lhs, long rhs) throws Throwable;

  Object doRemainderEquals(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object doRemainderEquals(Object lhs, byte rhs) throws Throwable;

  Object doRemainderEquals(Object lhs, char rhs) throws Throwable;

  Object doRemainderEquals(Object lhs, short rhs) throws Throwable;

  Object doRemainderEquals(Object lhs, int rhs) throws Throwable;

  Object doRemainderEquals(Object lhs, long rhs) throws Throwable;

  Object doRemainderEquals(Object lhs, BigInteger rhs) throws Throwable;

  Object doReverseRemainderEquals(byte lhs, Object rhs) throws Throwable;

  Object doReverseRemainderEquals(char lhs, Object rhs) throws Throwable;

  Object doReverseRemainderEquals(short lhs, Object rhs) throws Throwable;

  Object doReverseRemainderEquals(int lhs, Object rhs) throws Throwable;

  Object doReverseRemainderEquals(long lhs, Object rhs) throws Throwable;

  Object doReverseRemainderEquals(BigInteger lhs, Object rhs) throws Throwable;

  //
  //   Internal methods for operator ÷
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement ÷
  //

  Object doIntegerDivide(Object lhs, Object rhs) throws Throwable;

  Object doReverseIntegerDivide(Object lhs, Object rhs) throws Throwable;

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doIntegerDivide(byte lhs, byte rhs) throws Throwable;

  Object doIntegerDivide(byte lhs, char rhs) throws Throwable;

  Object doIntegerDivide(byte lhs, short rhs) throws Throwable;

  Object doIntegerDivide(byte lhs, int rhs) throws Throwable;

  Object doIntegerDivide(byte lhs, long rhs) throws Throwable;

  Object doIntegerDivide(byte lhs, float rhs) throws Throwable;

  Object doIntegerDivide(byte lhs, double rhs) throws Throwable;

  Object doIntegerDivide(byte lhs, BigInteger rhs) throws Throwable;

  Object doIntegerDivide(byte lhs, BigDecimal rhs) throws Throwable;

  Object doIntegerDivide(char lhs, byte rhs) throws Throwable;

  Object doIntegerDivide(char lhs, char rhs) throws Throwable;

  Object doIntegerDivide(char lhs, short rhs) throws Throwable;

  Object doIntegerDivide(char lhs, int rhs) throws Throwable;

  Object doIntegerDivide(char lhs, long rhs) throws Throwable;

  Object doIntegerDivide(char lhs, float rhs) throws Throwable;

  Object doIntegerDivide(char lhs, double rhs) throws Throwable;

  Object doIntegerDivide(char lhs, BigInteger rhs) throws Throwable;

  Object doIntegerDivide(char lhs, BigDecimal rhs) throws Throwable;

  Object doIntegerDivide(short lhs, byte rhs) throws Throwable;

  Object doIntegerDivide(short lhs, char rhs) throws Throwable;

  Object doIntegerDivide(short lhs, short rhs) throws Throwable;

  Object doIntegerDivide(short lhs, int rhs) throws Throwable;

  Object doIntegerDivide(short lhs, long rhs) throws Throwable;

  Object doIntegerDivide(short lhs, float rhs) throws Throwable;

  Object doIntegerDivide(short lhs, double rhs) throws Throwable;

  Object doIntegerDivide(short lhs, BigInteger rhs) throws Throwable;

  Object doIntegerDivide(short lhs, BigDecimal rhs) throws Throwable;

  Object doIntegerDivide(int lhs, byte rhs) throws Throwable;

  Object doIntegerDivide(int lhs, char rhs) throws Throwable;

  Object doIntegerDivide(int lhs, short rhs) throws Throwable;

  Object doIntegerDivide(int lhs, int rhs) throws Throwable;

  Object doIntegerDivide(int lhs, long rhs) throws Throwable;

  Object doIntegerDivide(int lhs, float rhs) throws Throwable;

  Object doIntegerDivide(int lhs, double rhs) throws Throwable;

  Object doIntegerDivide(int lhs, BigInteger rhs) throws Throwable;

  Object doIntegerDivide(int lhs, BigDecimal rhs) throws Throwable;

  Object doIntegerDivide(long lhs, byte rhs) throws Throwable;

  Object doIntegerDivide(long lhs, char rhs) throws Throwable;

  Object doIntegerDivide(long lhs, short rhs) throws Throwable;

  Object doIntegerDivide(long lhs, int rhs) throws Throwable;

  Object doIntegerDivide(long lhs, long rhs) throws Throwable;

  Object doIntegerDivide(long lhs, float rhs) throws Throwable;

  Object doIntegerDivide(long lhs, double rhs) throws Throwable;

  Object doIntegerDivide(long lhs, BigInteger rhs) throws Throwable;

  Object doIntegerDivide(long lhs, BigDecimal rhs) throws Throwable;

  Object doIntegerDivide(float lhs, byte rhs) throws Throwable;

  Object doIntegerDivide(float lhs, char rhs) throws Throwable;

  Object doIntegerDivide(float lhs, short rhs) throws Throwable;

  Object doIntegerDivide(float lhs, int rhs) throws Throwable;

  Object doIntegerDivide(float lhs, long rhs) throws Throwable;

  Object doIntegerDivide(float lhs, float rhs) throws Throwable;

  Object doIntegerDivide(float lhs, double rhs) throws Throwable;

  Object doIntegerDivide(float lhs, BigInteger rhs) throws Throwable;

  Object doIntegerDivide(float lhs, BigDecimal rhs) throws Throwable;

  Object doIntegerDivide(double lhs, byte rhs) throws Throwable;

  Object doIntegerDivide(double lhs, char rhs) throws Throwable;

  Object doIntegerDivide(double lhs, short rhs) throws Throwable;

  Object doIntegerDivide(double lhs, int rhs) throws Throwable;

  Object doIntegerDivide(double lhs, long rhs) throws Throwable;

  Object doIntegerDivide(double lhs, float rhs) throws Throwable;

  Object doIntegerDivide(double lhs, double rhs) throws Throwable;

  Object doIntegerDivide(double lhs, BigInteger rhs) throws Throwable;

  Object doIntegerDivide(double lhs, BigDecimal rhs) throws Throwable;

  Object doIntegerDivide(BigInteger lhs, byte rhs) throws Throwable;

  Object doIntegerDivide(BigInteger lhs, char rhs) throws Throwable;

  Object doIntegerDivide(BigInteger lhs, short rhs) throws Throwable;

  Object doIntegerDivide(BigInteger lhs, int rhs) throws Throwable;

  Object doIntegerDivide(BigInteger lhs, long rhs) throws Throwable;

  Object doIntegerDivide(BigInteger lhs, float rhs) throws Throwable;

  Object doIntegerDivide(BigInteger lhs, double rhs) throws Throwable;

  Object doIntegerDivide(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object doIntegerDivide(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object doIntegerDivide(BigDecimal lhs, byte rhs) throws Throwable;

  Object doIntegerDivide(BigDecimal lhs, char rhs) throws Throwable;

  Object doIntegerDivide(BigDecimal lhs, short rhs) throws Throwable;

  Object doIntegerDivide(BigDecimal lhs, int rhs) throws Throwable;

  Object doIntegerDivide(BigDecimal lhs, long rhs) throws Throwable;

  Object doIntegerDivide(BigDecimal lhs, float rhs) throws Throwable;

  Object doIntegerDivide(BigDecimal lhs, double rhs) throws Throwable;

  Object doIntegerDivide(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object doIntegerDivide(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object doIntegerDivide(Object lhs, byte rhs) throws Throwable;

  Object doIntegerDivide(Object lhs, char rhs) throws Throwable;

  Object doIntegerDivide(Object lhs, short rhs) throws Throwable;

  Object doIntegerDivide(Object lhs, int rhs) throws Throwable;

  Object doIntegerDivide(Object lhs, long rhs) throws Throwable;

  Object doIntegerDivide(Object lhs, float rhs) throws Throwable;

  Object doIntegerDivide(Object lhs, double rhs) throws Throwable;

  Object doIntegerDivide(Object lhs, BigInteger rhs) throws Throwable;

  Object doIntegerDivide(Object lhs, BigDecimal rhs) throws Throwable;

  Object doReverseIntegerDivide(byte lhs, Object rhs) throws Throwable;

  Object doReverseIntegerDivide(char lhs, Object rhs) throws Throwable;

  Object doReverseIntegerDivide(short lhs, Object rhs) throws Throwable;

  Object doReverseIntegerDivide(int lhs, Object rhs) throws Throwable;

  Object doReverseIntegerDivide(long lhs, Object rhs) throws Throwable;

  Object doReverseIntegerDivide(float lhs, Object rhs) throws Throwable;

  Object doReverseIntegerDivide(double lhs, Object rhs) throws Throwable;

  Object doReverseIntegerDivide(BigInteger lhs, Object rhs) throws Throwable;

  Object doReverseIntegerDivide(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Internal methods for operator ÷=
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement ÷=
  //

  Object doIntegerDivideEquals(Object lhs, Object rhs) throws Throwable;

  Object doReverseIntegerDivideEquals(Object lhs, Object rhs) throws Throwable;

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doIntegerDivideEquals(byte lhs, byte rhs) throws Throwable;

  Object doIntegerDivideEquals(byte lhs, char rhs) throws Throwable;

  Object doIntegerDivideEquals(byte lhs, short rhs) throws Throwable;

  Object doIntegerDivideEquals(byte lhs, int rhs) throws Throwable;

  Object doIntegerDivideEquals(byte lhs, long rhs) throws Throwable;

  Object doIntegerDivideEquals(byte lhs, float rhs) throws Throwable;

  Object doIntegerDivideEquals(byte lhs, double rhs) throws Throwable;

  Object doIntegerDivideEquals(byte lhs, BigInteger rhs) throws Throwable;

  Object doIntegerDivideEquals(byte lhs, BigDecimal rhs) throws Throwable;

  Object doIntegerDivideEquals(char lhs, byte rhs) throws Throwable;

  Object doIntegerDivideEquals(char lhs, char rhs) throws Throwable;

  Object doIntegerDivideEquals(char lhs, short rhs) throws Throwable;

  Object doIntegerDivideEquals(char lhs, int rhs) throws Throwable;

  Object doIntegerDivideEquals(char lhs, long rhs) throws Throwable;

  Object doIntegerDivideEquals(char lhs, float rhs) throws Throwable;

  Object doIntegerDivideEquals(char lhs, double rhs) throws Throwable;

  Object doIntegerDivideEquals(char lhs, BigInteger rhs) throws Throwable;

  Object doIntegerDivideEquals(char lhs, BigDecimal rhs) throws Throwable;

  Object doIntegerDivideEquals(short lhs, byte rhs) throws Throwable;

  Object doIntegerDivideEquals(short lhs, char rhs) throws Throwable;

  Object doIntegerDivideEquals(short lhs, short rhs) throws Throwable;

  Object doIntegerDivideEquals(short lhs, int rhs) throws Throwable;

  Object doIntegerDivideEquals(short lhs, long rhs) throws Throwable;

  Object doIntegerDivideEquals(short lhs, float rhs) throws Throwable;

  Object doIntegerDivideEquals(short lhs, double rhs) throws Throwable;

  Object doIntegerDivideEquals(short lhs, BigInteger rhs) throws Throwable;

  Object doIntegerDivideEquals(short lhs, BigDecimal rhs) throws Throwable;

  Object doIntegerDivideEquals(int lhs, byte rhs) throws Throwable;

  Object doIntegerDivideEquals(int lhs, char rhs) throws Throwable;

  Object doIntegerDivideEquals(int lhs, short rhs) throws Throwable;

  Object doIntegerDivideEquals(int lhs, int rhs) throws Throwable;

  Object doIntegerDivideEquals(int lhs, long rhs) throws Throwable;

  Object doIntegerDivideEquals(int lhs, float rhs) throws Throwable;

  Object doIntegerDivideEquals(int lhs, double rhs) throws Throwable;

  Object doIntegerDivideEquals(int lhs, BigInteger rhs) throws Throwable;

  Object doIntegerDivideEquals(int lhs, BigDecimal rhs) throws Throwable;

  Object doIntegerDivideEquals(long lhs, byte rhs) throws Throwable;

  Object doIntegerDivideEquals(long lhs, char rhs) throws Throwable;

  Object doIntegerDivideEquals(long lhs, short rhs) throws Throwable;

  Object doIntegerDivideEquals(long lhs, int rhs) throws Throwable;

  Object doIntegerDivideEquals(long lhs, long rhs) throws Throwable;

  Object doIntegerDivideEquals(long lhs, float rhs) throws Throwable;

  Object doIntegerDivideEquals(long lhs, double rhs) throws Throwable;

  Object doIntegerDivideEquals(long lhs, BigInteger rhs) throws Throwable;

  Object doIntegerDivideEquals(long lhs, BigDecimal rhs) throws Throwable;

  Object doIntegerDivideEquals(float lhs, byte rhs) throws Throwable;

  Object doIntegerDivideEquals(float lhs, char rhs) throws Throwable;

  Object doIntegerDivideEquals(float lhs, short rhs) throws Throwable;

  Object doIntegerDivideEquals(float lhs, int rhs) throws Throwable;

  Object doIntegerDivideEquals(float lhs, long rhs) throws Throwable;

  Object doIntegerDivideEquals(float lhs, float rhs) throws Throwable;

  Object doIntegerDivideEquals(float lhs, double rhs) throws Throwable;

  Object doIntegerDivideEquals(float lhs, BigInteger rhs) throws Throwable;

  Object doIntegerDivideEquals(float lhs, BigDecimal rhs) throws Throwable;

  Object doIntegerDivideEquals(double lhs, byte rhs) throws Throwable;

  Object doIntegerDivideEquals(double lhs, char rhs) throws Throwable;

  Object doIntegerDivideEquals(double lhs, short rhs) throws Throwable;

  Object doIntegerDivideEquals(double lhs, int rhs) throws Throwable;

  Object doIntegerDivideEquals(double lhs, long rhs) throws Throwable;

  Object doIntegerDivideEquals(double lhs, float rhs) throws Throwable;

  Object doIntegerDivideEquals(double lhs, double rhs) throws Throwable;

  Object doIntegerDivideEquals(double lhs, BigInteger rhs) throws Throwable;

  Object doIntegerDivideEquals(double lhs, BigDecimal rhs) throws Throwable;

  Object doIntegerDivideEquals(BigInteger lhs, byte rhs) throws Throwable;

  Object doIntegerDivideEquals(BigInteger lhs, char rhs) throws Throwable;

  Object doIntegerDivideEquals(BigInteger lhs, short rhs) throws Throwable;

  Object doIntegerDivideEquals(BigInteger lhs, int rhs) throws Throwable;

  Object doIntegerDivideEquals(BigInteger lhs, long rhs) throws Throwable;

  Object doIntegerDivideEquals(BigInteger lhs, float rhs) throws Throwable;

  Object doIntegerDivideEquals(BigInteger lhs, double rhs) throws Throwable;

  Object doIntegerDivideEquals(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object doIntegerDivideEquals(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object doIntegerDivideEquals(BigDecimal lhs, byte rhs) throws Throwable;

  Object doIntegerDivideEquals(BigDecimal lhs, char rhs) throws Throwable;

  Object doIntegerDivideEquals(BigDecimal lhs, short rhs) throws Throwable;

  Object doIntegerDivideEquals(BigDecimal lhs, int rhs) throws Throwable;

  Object doIntegerDivideEquals(BigDecimal lhs, long rhs) throws Throwable;

  Object doIntegerDivideEquals(BigDecimal lhs, float rhs) throws Throwable;

  Object doIntegerDivideEquals(BigDecimal lhs, double rhs) throws Throwable;

  Object doIntegerDivideEquals(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object doIntegerDivideEquals(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object doIntegerDivideEquals(Object lhs, byte rhs) throws Throwable;

  Object doIntegerDivideEquals(Object lhs, char rhs) throws Throwable;

  Object doIntegerDivideEquals(Object lhs, short rhs) throws Throwable;

  Object doIntegerDivideEquals(Object lhs, int rhs) throws Throwable;

  Object doIntegerDivideEquals(Object lhs, long rhs) throws Throwable;

  Object doIntegerDivideEquals(Object lhs, float rhs) throws Throwable;

  Object doIntegerDivideEquals(Object lhs, double rhs) throws Throwable;

  Object doIntegerDivideEquals(Object lhs, BigInteger rhs) throws Throwable;

  Object doIntegerDivideEquals(Object lhs, BigDecimal rhs) throws Throwable;

  Object doReverseIntegerDivideEquals(byte lhs, Object rhs) throws Throwable;

  Object doReverseIntegerDivideEquals(char lhs, Object rhs) throws Throwable;

  Object doReverseIntegerDivideEquals(short lhs, Object rhs) throws Throwable;

  Object doReverseIntegerDivideEquals(int lhs, Object rhs) throws Throwable;

  Object doReverseIntegerDivideEquals(long lhs, Object rhs) throws Throwable;

  Object doReverseIntegerDivideEquals(float lhs, Object rhs) throws Throwable;

  Object doReverseIntegerDivideEquals(double lhs, Object rhs) throws Throwable;

  Object doReverseIntegerDivideEquals(BigInteger lhs, Object rhs) throws Throwable;

  Object doReverseIntegerDivideEquals(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Internal methods for operator &
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement &
  //

  Object doAnd(Object lhs, Object rhs) throws Throwable;

  Object doReverseAnd(Object lhs, Object rhs) throws Throwable;

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doAnd(byte lhs, byte rhs) throws Throwable;

  Object doAnd(byte lhs, char rhs) throws Throwable;

  Object doAnd(byte lhs, short rhs) throws Throwable;

  Object doAnd(byte lhs, int rhs) throws Throwable;

  Object doAnd(byte lhs, long rhs) throws Throwable;

  Object doAnd(byte lhs, BigInteger rhs) throws Throwable;

  Object doAnd(char lhs, byte rhs) throws Throwable;

  Object doAnd(char lhs, char rhs) throws Throwable;

  Object doAnd(char lhs, short rhs) throws Throwable;

  Object doAnd(char lhs, int rhs) throws Throwable;

  Object doAnd(char lhs, long rhs) throws Throwable;

  Object doAnd(char lhs, BigInteger rhs) throws Throwable;

  Object doAnd(short lhs, byte rhs) throws Throwable;

  Object doAnd(short lhs, char rhs) throws Throwable;

  Object doAnd(short lhs, short rhs) throws Throwable;

  Object doAnd(short lhs, int rhs) throws Throwable;

  Object doAnd(short lhs, long rhs) throws Throwable;

  Object doAnd(short lhs, BigInteger rhs) throws Throwable;

  Object doAnd(int lhs, byte rhs) throws Throwable;

  Object doAnd(int lhs, char rhs) throws Throwable;

  Object doAnd(int lhs, short rhs) throws Throwable;

  Object doAnd(int lhs, int rhs) throws Throwable;

  Object doAnd(int lhs, long rhs) throws Throwable;

  Object doAnd(int lhs, BigInteger rhs) throws Throwable;

  Object doAnd(long lhs, byte rhs) throws Throwable;

  Object doAnd(long lhs, char rhs) throws Throwable;

  Object doAnd(long lhs, short rhs) throws Throwable;

  Object doAnd(long lhs, int rhs) throws Throwable;

  Object doAnd(long lhs, long rhs) throws Throwable;

  Object doAnd(long lhs, BigInteger rhs) throws Throwable;

  Object doAnd(BigInteger lhs, byte rhs) throws Throwable;

  Object doAnd(BigInteger lhs, char rhs) throws Throwable;

  Object doAnd(BigInteger lhs, short rhs) throws Throwable;

  Object doAnd(BigInteger lhs, int rhs) throws Throwable;

  Object doAnd(BigInteger lhs, long rhs) throws Throwable;

  Object doAnd(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object doAnd(Object lhs, byte rhs) throws Throwable;

  Object doAnd(Object lhs, char rhs) throws Throwable;

  Object doAnd(Object lhs, short rhs) throws Throwable;

  Object doAnd(Object lhs, int rhs) throws Throwable;

  Object doAnd(Object lhs, long rhs) throws Throwable;

  Object doAnd(Object lhs, BigInteger rhs) throws Throwable;

  Object doReverseAnd(byte lhs, Object rhs) throws Throwable;

  Object doReverseAnd(char lhs, Object rhs) throws Throwable;

  Object doReverseAnd(short lhs, Object rhs) throws Throwable;

  Object doReverseAnd(int lhs, Object rhs) throws Throwable;

  Object doReverseAnd(long lhs, Object rhs) throws Throwable;

  Object doReverseAnd(BigInteger lhs, Object rhs) throws Throwable;

  //
  //   Internal methods for operator &=
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement &=
  //

  Object doAndEquals(Object lhs, Object rhs) throws Throwable;

  Object doReverseAndEquals(Object lhs, Object rhs) throws Throwable;

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doAndEquals(byte lhs, byte rhs) throws Throwable;

  Object doAndEquals(byte lhs, char rhs) throws Throwable;

  Object doAndEquals(byte lhs, short rhs) throws Throwable;

  Object doAndEquals(byte lhs, int rhs) throws Throwable;

  Object doAndEquals(byte lhs, long rhs) throws Throwable;

  Object doAndEquals(byte lhs, BigInteger rhs) throws Throwable;

  Object doAndEquals(char lhs, byte rhs) throws Throwable;

  Object doAndEquals(char lhs, char rhs) throws Throwable;

  Object doAndEquals(char lhs, short rhs) throws Throwable;

  Object doAndEquals(char lhs, int rhs) throws Throwable;

  Object doAndEquals(char lhs, long rhs) throws Throwable;

  Object doAndEquals(char lhs, BigInteger rhs) throws Throwable;

  Object doAndEquals(short lhs, byte rhs) throws Throwable;

  Object doAndEquals(short lhs, char rhs) throws Throwable;

  Object doAndEquals(short lhs, short rhs) throws Throwable;

  Object doAndEquals(short lhs, int rhs) throws Throwable;

  Object doAndEquals(short lhs, long rhs) throws Throwable;

  Object doAndEquals(short lhs, BigInteger rhs) throws Throwable;

  Object doAndEquals(int lhs, byte rhs) throws Throwable;

  Object doAndEquals(int lhs, char rhs) throws Throwable;

  Object doAndEquals(int lhs, short rhs) throws Throwable;

  Object doAndEquals(int lhs, int rhs) throws Throwable;

  Object doAndEquals(int lhs, long rhs) throws Throwable;

  Object doAndEquals(int lhs, BigInteger rhs) throws Throwable;

  Object doAndEquals(long lhs, byte rhs) throws Throwable;

  Object doAndEquals(long lhs, char rhs) throws Throwable;

  Object doAndEquals(long lhs, short rhs) throws Throwable;

  Object doAndEquals(long lhs, int rhs) throws Throwable;

  Object doAndEquals(long lhs, long rhs) throws Throwable;

  Object doAndEquals(long lhs, BigInteger rhs) throws Throwable;

  Object doAndEquals(BigInteger lhs, byte rhs) throws Throwable;

  Object doAndEquals(BigInteger lhs, char rhs) throws Throwable;

  Object doAndEquals(BigInteger lhs, short rhs) throws Throwable;

  Object doAndEquals(BigInteger lhs, int rhs) throws Throwable;

  Object doAndEquals(BigInteger lhs, long rhs) throws Throwable;

  Object doAndEquals(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object doAndEquals(Object lhs, byte rhs) throws Throwable;

  Object doAndEquals(Object lhs, char rhs) throws Throwable;

  Object doAndEquals(Object lhs, short rhs) throws Throwable;

  Object doAndEquals(Object lhs, int rhs) throws Throwable;

  Object doAndEquals(Object lhs, long rhs) throws Throwable;

  Object doAndEquals(Object lhs, BigInteger rhs) throws Throwable;

  Object doReverseAndEquals(byte lhs, Object rhs) throws Throwable;

  Object doReverseAndEquals(char lhs, Object rhs) throws Throwable;

  Object doReverseAndEquals(short lhs, Object rhs) throws Throwable;

  Object doReverseAndEquals(int lhs, Object rhs) throws Throwable;

  Object doReverseAndEquals(long lhs, Object rhs) throws Throwable;

  Object doReverseAndEquals(BigInteger lhs, Object rhs) throws Throwable;

  //
  //   Internal methods for operator |
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement |
  //

  Object doOr(Object lhs, Object rhs) throws Throwable;

  Object doReverseOr(Object lhs, Object rhs) throws Throwable;

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doOr(byte lhs, byte rhs) throws Throwable;

  Object doOr(byte lhs, char rhs) throws Throwable;

  Object doOr(byte lhs, short rhs) throws Throwable;

  Object doOr(byte lhs, int rhs) throws Throwable;

  Object doOr(byte lhs, long rhs) throws Throwable;

  Object doOr(byte lhs, BigInteger rhs) throws Throwable;

  Object doOr(char lhs, byte rhs) throws Throwable;

  Object doOr(char lhs, char rhs) throws Throwable;

  Object doOr(char lhs, short rhs) throws Throwable;

  Object doOr(char lhs, int rhs) throws Throwable;

  Object doOr(char lhs, long rhs) throws Throwable;

  Object doOr(char lhs, BigInteger rhs) throws Throwable;

  Object doOr(short lhs, byte rhs) throws Throwable;

  Object doOr(short lhs, char rhs) throws Throwable;

  Object doOr(short lhs, short rhs) throws Throwable;

  Object doOr(short lhs, int rhs) throws Throwable;

  Object doOr(short lhs, long rhs) throws Throwable;

  Object doOr(short lhs, BigInteger rhs) throws Throwable;

  Object doOr(int lhs, byte rhs) throws Throwable;

  Object doOr(int lhs, char rhs) throws Throwable;

  Object doOr(int lhs, short rhs) throws Throwable;

  Object doOr(int lhs, int rhs) throws Throwable;

  Object doOr(int lhs, long rhs) throws Throwable;

  Object doOr(int lhs, BigInteger rhs) throws Throwable;

  Object doOr(long lhs, byte rhs) throws Throwable;

  Object doOr(long lhs, char rhs) throws Throwable;

  Object doOr(long lhs, short rhs) throws Throwable;

  Object doOr(long lhs, int rhs) throws Throwable;

  Object doOr(long lhs, long rhs) throws Throwable;

  Object doOr(long lhs, BigInteger rhs) throws Throwable;

  Object doOr(BigInteger lhs, byte rhs) throws Throwable;

  Object doOr(BigInteger lhs, char rhs) throws Throwable;

  Object doOr(BigInteger lhs, short rhs) throws Throwable;

  Object doOr(BigInteger lhs, int rhs) throws Throwable;

  Object doOr(BigInteger lhs, long rhs) throws Throwable;

  Object doOr(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object doOr(Object lhs, byte rhs) throws Throwable;

  Object doOr(Object lhs, char rhs) throws Throwable;

  Object doOr(Object lhs, short rhs) throws Throwable;

  Object doOr(Object lhs, int rhs) throws Throwable;

  Object doOr(Object lhs, long rhs) throws Throwable;

  Object doOr(Object lhs, BigInteger rhs) throws Throwable;

  Object doReverseOr(byte lhs, Object rhs) throws Throwable;

  Object doReverseOr(char lhs, Object rhs) throws Throwable;

  Object doReverseOr(short lhs, Object rhs) throws Throwable;

  Object doReverseOr(int lhs, Object rhs) throws Throwable;

  Object doReverseOr(long lhs, Object rhs) throws Throwable;

  Object doReverseOr(BigInteger lhs, Object rhs) throws Throwable;

  //
  //   Internal methods for operator |=
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement |=
  //

  Object doOrEquals(Object lhs, Object rhs) throws Throwable;

  Object doReverseOrEquals(Object lhs, Object rhs) throws Throwable;

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doOrEquals(byte lhs, byte rhs) throws Throwable;

  Object doOrEquals(byte lhs, char rhs) throws Throwable;

  Object doOrEquals(byte lhs, short rhs) throws Throwable;

  Object doOrEquals(byte lhs, int rhs) throws Throwable;

  Object doOrEquals(byte lhs, long rhs) throws Throwable;

  Object doOrEquals(byte lhs, BigInteger rhs) throws Throwable;

  Object doOrEquals(char lhs, byte rhs) throws Throwable;

  Object doOrEquals(char lhs, char rhs) throws Throwable;

  Object doOrEquals(char lhs, short rhs) throws Throwable;

  Object doOrEquals(char lhs, int rhs) throws Throwable;

  Object doOrEquals(char lhs, long rhs) throws Throwable;

  Object doOrEquals(char lhs, BigInteger rhs) throws Throwable;

  Object doOrEquals(short lhs, byte rhs) throws Throwable;

  Object doOrEquals(short lhs, char rhs) throws Throwable;

  Object doOrEquals(short lhs, short rhs) throws Throwable;

  Object doOrEquals(short lhs, int rhs) throws Throwable;

  Object doOrEquals(short lhs, long rhs) throws Throwable;

  Object doOrEquals(short lhs, BigInteger rhs) throws Throwable;

  Object doOrEquals(int lhs, byte rhs) throws Throwable;

  Object doOrEquals(int lhs, char rhs) throws Throwable;

  Object doOrEquals(int lhs, short rhs) throws Throwable;

  Object doOrEquals(int lhs, int rhs) throws Throwable;

  Object doOrEquals(int lhs, long rhs) throws Throwable;

  Object doOrEquals(int lhs, BigInteger rhs) throws Throwable;

  Object doOrEquals(long lhs, byte rhs) throws Throwable;

  Object doOrEquals(long lhs, char rhs) throws Throwable;

  Object doOrEquals(long lhs, short rhs) throws Throwable;

  Object doOrEquals(long lhs, int rhs) throws Throwable;

  Object doOrEquals(long lhs, long rhs) throws Throwable;

  Object doOrEquals(long lhs, BigInteger rhs) throws Throwable;

  Object doOrEquals(BigInteger lhs, byte rhs) throws Throwable;

  Object doOrEquals(BigInteger lhs, char rhs) throws Throwable;

  Object doOrEquals(BigInteger lhs, short rhs) throws Throwable;

  Object doOrEquals(BigInteger lhs, int rhs) throws Throwable;

  Object doOrEquals(BigInteger lhs, long rhs) throws Throwable;

  Object doOrEquals(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object doOrEquals(Object lhs, byte rhs) throws Throwable;

  Object doOrEquals(Object lhs, char rhs) throws Throwable;

  Object doOrEquals(Object lhs, short rhs) throws Throwable;

  Object doOrEquals(Object lhs, int rhs) throws Throwable;

  Object doOrEquals(Object lhs, long rhs) throws Throwable;

  Object doOrEquals(Object lhs, BigInteger rhs) throws Throwable;

  Object doReverseOrEquals(byte lhs, Object rhs) throws Throwable;

  Object doReverseOrEquals(char lhs, Object rhs) throws Throwable;

  Object doReverseOrEquals(short lhs, Object rhs) throws Throwable;

  Object doReverseOrEquals(int lhs, Object rhs) throws Throwable;

  Object doReverseOrEquals(long lhs, Object rhs) throws Throwable;

  Object doReverseOrEquals(BigInteger lhs, Object rhs) throws Throwable;

  //
  //   Internal methods for operator ^
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement ^
  //

  Object doXor(Object lhs, Object rhs) throws Throwable;

  Object doReverseXor(Object lhs, Object rhs) throws Throwable;

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doXor(byte lhs, byte rhs) throws Throwable;

  Object doXor(byte lhs, char rhs) throws Throwable;

  Object doXor(byte lhs, short rhs) throws Throwable;

  Object doXor(byte lhs, int rhs) throws Throwable;

  Object doXor(byte lhs, long rhs) throws Throwable;

  Object doXor(byte lhs, BigInteger rhs) throws Throwable;

  Object doXor(char lhs, byte rhs) throws Throwable;

  Object doXor(char lhs, char rhs) throws Throwable;

  Object doXor(char lhs, short rhs) throws Throwable;

  Object doXor(char lhs, int rhs) throws Throwable;

  Object doXor(char lhs, long rhs) throws Throwable;

  Object doXor(char lhs, BigInteger rhs) throws Throwable;

  Object doXor(short lhs, byte rhs) throws Throwable;

  Object doXor(short lhs, char rhs) throws Throwable;

  Object doXor(short lhs, short rhs) throws Throwable;

  Object doXor(short lhs, int rhs) throws Throwable;

  Object doXor(short lhs, long rhs) throws Throwable;

  Object doXor(short lhs, BigInteger rhs) throws Throwable;

  Object doXor(int lhs, byte rhs) throws Throwable;

  Object doXor(int lhs, char rhs) throws Throwable;

  Object doXor(int lhs, short rhs) throws Throwable;

  Object doXor(int lhs, int rhs) throws Throwable;

  Object doXor(int lhs, long rhs) throws Throwable;

  Object doXor(int lhs, BigInteger rhs) throws Throwable;

  Object doXor(long lhs, byte rhs) throws Throwable;

  Object doXor(long lhs, char rhs) throws Throwable;

  Object doXor(long lhs, short rhs) throws Throwable;

  Object doXor(long lhs, int rhs) throws Throwable;

  Object doXor(long lhs, long rhs) throws Throwable;

  Object doXor(long lhs, BigInteger rhs) throws Throwable;

  Object doXor(BigInteger lhs, byte rhs) throws Throwable;

  Object doXor(BigInteger lhs, char rhs) throws Throwable;

  Object doXor(BigInteger lhs, short rhs) throws Throwable;

  Object doXor(BigInteger lhs, int rhs) throws Throwable;

  Object doXor(BigInteger lhs, long rhs) throws Throwable;

  Object doXor(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object doXor(Object lhs, byte rhs) throws Throwable;

  Object doXor(Object lhs, char rhs) throws Throwable;

  Object doXor(Object lhs, short rhs) throws Throwable;

  Object doXor(Object lhs, int rhs) throws Throwable;

  Object doXor(Object lhs, long rhs) throws Throwable;

  Object doXor(Object lhs, BigInteger rhs) throws Throwable;

  Object doReverseXor(byte lhs, Object rhs) throws Throwable;

  Object doReverseXor(char lhs, Object rhs) throws Throwable;

  Object doReverseXor(short lhs, Object rhs) throws Throwable;

  Object doReverseXor(int lhs, Object rhs) throws Throwable;

  Object doReverseXor(long lhs, Object rhs) throws Throwable;

  Object doReverseXor(BigInteger lhs, Object rhs) throws Throwable;

  //
  //   Internal methods for operator ^=
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement ^=
  //

  Object doXorEquals(Object lhs, Object rhs) throws Throwable;

  Object doReverseXorEquals(Object lhs, Object rhs) throws Throwable;

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doXorEquals(byte lhs, byte rhs) throws Throwable;

  Object doXorEquals(byte lhs, char rhs) throws Throwable;

  Object doXorEquals(byte lhs, short rhs) throws Throwable;

  Object doXorEquals(byte lhs, int rhs) throws Throwable;

  Object doXorEquals(byte lhs, long rhs) throws Throwable;

  Object doXorEquals(byte lhs, BigInteger rhs) throws Throwable;

  Object doXorEquals(char lhs, byte rhs) throws Throwable;

  Object doXorEquals(char lhs, char rhs) throws Throwable;

  Object doXorEquals(char lhs, short rhs) throws Throwable;

  Object doXorEquals(char lhs, int rhs) throws Throwable;

  Object doXorEquals(char lhs, long rhs) throws Throwable;

  Object doXorEquals(char lhs, BigInteger rhs) throws Throwable;

  Object doXorEquals(short lhs, byte rhs) throws Throwable;

  Object doXorEquals(short lhs, char rhs) throws Throwable;

  Object doXorEquals(short lhs, short rhs) throws Throwable;

  Object doXorEquals(short lhs, int rhs) throws Throwable;

  Object doXorEquals(short lhs, long rhs) throws Throwable;

  Object doXorEquals(short lhs, BigInteger rhs) throws Throwable;

  Object doXorEquals(int lhs, byte rhs) throws Throwable;

  Object doXorEquals(int lhs, char rhs) throws Throwable;

  Object doXorEquals(int lhs, short rhs) throws Throwable;

  Object doXorEquals(int lhs, int rhs) throws Throwable;

  Object doXorEquals(int lhs, long rhs) throws Throwable;

  Object doXorEquals(int lhs, BigInteger rhs) throws Throwable;

  Object doXorEquals(long lhs, byte rhs) throws Throwable;

  Object doXorEquals(long lhs, char rhs) throws Throwable;

  Object doXorEquals(long lhs, short rhs) throws Throwable;

  Object doXorEquals(long lhs, int rhs) throws Throwable;

  Object doXorEquals(long lhs, long rhs) throws Throwable;

  Object doXorEquals(long lhs, BigInteger rhs) throws Throwable;

  Object doXorEquals(BigInteger lhs, byte rhs) throws Throwable;

  Object doXorEquals(BigInteger lhs, char rhs) throws Throwable;

  Object doXorEquals(BigInteger lhs, short rhs) throws Throwable;

  Object doXorEquals(BigInteger lhs, int rhs) throws Throwable;

  Object doXorEquals(BigInteger lhs, long rhs) throws Throwable;

  Object doXorEquals(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object doXorEquals(Object lhs, byte rhs) throws Throwable;

  Object doXorEquals(Object lhs, char rhs) throws Throwable;

  Object doXorEquals(Object lhs, short rhs) throws Throwable;

  Object doXorEquals(Object lhs, int rhs) throws Throwable;

  Object doXorEquals(Object lhs, long rhs) throws Throwable;

  Object doXorEquals(Object lhs, BigInteger rhs) throws Throwable;

  Object doReverseXorEquals(byte lhs, Object rhs) throws Throwable;

  Object doReverseXorEquals(char lhs, Object rhs) throws Throwable;

  Object doReverseXorEquals(short lhs, Object rhs) throws Throwable;

  Object doReverseXorEquals(int lhs, Object rhs) throws Throwable;

  Object doReverseXorEquals(long lhs, Object rhs) throws Throwable;

  Object doReverseXorEquals(BigInteger lhs, Object rhs) throws Throwable;

  //
  //   Internal methods for operator <<
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement <<
  //

  Object doLeftShift(Object lhs, Object rhs) throws Throwable;

  Object doReverseLeftShift(Object lhs, Object rhs) throws Throwable;

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doLeftShift(byte lhs, byte rhs) throws Throwable;

  Object doLeftShift(byte lhs, char rhs) throws Throwable;

  Object doLeftShift(byte lhs, short rhs) throws Throwable;

  Object doLeftShift(byte lhs, int rhs) throws Throwable;

  Object doLeftShift(byte lhs, long rhs) throws Throwable;

  Object doLeftShift(byte lhs, BigInteger rhs) throws Throwable;

  Object doLeftShift(char lhs, byte rhs) throws Throwable;

  Object doLeftShift(char lhs, char rhs) throws Throwable;

  Object doLeftShift(char lhs, short rhs) throws Throwable;

  Object doLeftShift(char lhs, int rhs) throws Throwable;

  Object doLeftShift(char lhs, long rhs) throws Throwable;

  Object doLeftShift(char lhs, BigInteger rhs) throws Throwable;

  Object doLeftShift(short lhs, byte rhs) throws Throwable;

  Object doLeftShift(short lhs, char rhs) throws Throwable;

  Object doLeftShift(short lhs, short rhs) throws Throwable;

  Object doLeftShift(short lhs, int rhs) throws Throwable;

  Object doLeftShift(short lhs, long rhs) throws Throwable;

  Object doLeftShift(short lhs, BigInteger rhs) throws Throwable;

  Object doLeftShift(int lhs, byte rhs) throws Throwable;

  Object doLeftShift(int lhs, char rhs) throws Throwable;

  Object doLeftShift(int lhs, short rhs) throws Throwable;

  Object doLeftShift(int lhs, int rhs) throws Throwable;

  Object doLeftShift(int lhs, long rhs) throws Throwable;

  Object doLeftShift(int lhs, BigInteger rhs) throws Throwable;

  Object doLeftShift(long lhs, byte rhs) throws Throwable;

  Object doLeftShift(long lhs, char rhs) throws Throwable;

  Object doLeftShift(long lhs, short rhs) throws Throwable;

  Object doLeftShift(long lhs, int rhs) throws Throwable;

  Object doLeftShift(long lhs, long rhs) throws Throwable;

  Object doLeftShift(long lhs, BigInteger rhs) throws Throwable;

  Object doLeftShift(BigInteger lhs, byte rhs) throws Throwable;

  Object doLeftShift(BigInteger lhs, char rhs) throws Throwable;

  Object doLeftShift(BigInteger lhs, short rhs) throws Throwable;

  Object doLeftShift(BigInteger lhs, int rhs) throws Throwable;

  Object doLeftShift(BigInteger lhs, long rhs) throws Throwable;

  Object doLeftShift(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object doLeftShift(Object lhs, byte rhs) throws Throwable;

  Object doLeftShift(Object lhs, char rhs) throws Throwable;

  Object doLeftShift(Object lhs, short rhs) throws Throwable;

  Object doLeftShift(Object lhs, int rhs) throws Throwable;

  Object doLeftShift(Object lhs, long rhs) throws Throwable;

  Object doLeftShift(Object lhs, BigInteger rhs) throws Throwable;

  Object doReverseLeftShift(byte lhs, Object rhs) throws Throwable;

  Object doReverseLeftShift(char lhs, Object rhs) throws Throwable;

  Object doReverseLeftShift(short lhs, Object rhs) throws Throwable;

  Object doReverseLeftShift(int lhs, Object rhs) throws Throwable;

  Object doReverseLeftShift(long lhs, Object rhs) throws Throwable;

  Object doReverseLeftShift(BigInteger lhs, Object rhs) throws Throwable;

  //
  //   Internal methods for operator <<=
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement <<=
  //

  Object doLeftShiftEquals(Object lhs, Object rhs) throws Throwable;

  Object doReverseLeftShiftEquals(Object lhs, Object rhs) throws Throwable;

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doLeftShiftEquals(byte lhs, byte rhs) throws Throwable;

  Object doLeftShiftEquals(byte lhs, char rhs) throws Throwable;

  Object doLeftShiftEquals(byte lhs, short rhs) throws Throwable;

  Object doLeftShiftEquals(byte lhs, int rhs) throws Throwable;

  Object doLeftShiftEquals(byte lhs, long rhs) throws Throwable;

  Object doLeftShiftEquals(byte lhs, BigInteger rhs) throws Throwable;

  Object doLeftShiftEquals(char lhs, byte rhs) throws Throwable;

  Object doLeftShiftEquals(char lhs, char rhs) throws Throwable;

  Object doLeftShiftEquals(char lhs, short rhs) throws Throwable;

  Object doLeftShiftEquals(char lhs, int rhs) throws Throwable;

  Object doLeftShiftEquals(char lhs, long rhs) throws Throwable;

  Object doLeftShiftEquals(char lhs, BigInteger rhs) throws Throwable;

  Object doLeftShiftEquals(short lhs, byte rhs) throws Throwable;

  Object doLeftShiftEquals(short lhs, char rhs) throws Throwable;

  Object doLeftShiftEquals(short lhs, short rhs) throws Throwable;

  Object doLeftShiftEquals(short lhs, int rhs) throws Throwable;

  Object doLeftShiftEquals(short lhs, long rhs) throws Throwable;

  Object doLeftShiftEquals(short lhs, BigInteger rhs) throws Throwable;

  Object doLeftShiftEquals(int lhs, byte rhs) throws Throwable;

  Object doLeftShiftEquals(int lhs, char rhs) throws Throwable;

  Object doLeftShiftEquals(int lhs, short rhs) throws Throwable;

  Object doLeftShiftEquals(int lhs, int rhs) throws Throwable;

  Object doLeftShiftEquals(int lhs, long rhs) throws Throwable;

  Object doLeftShiftEquals(int lhs, BigInteger rhs) throws Throwable;

  Object doLeftShiftEquals(long lhs, byte rhs) throws Throwable;

  Object doLeftShiftEquals(long lhs, char rhs) throws Throwable;

  Object doLeftShiftEquals(long lhs, short rhs) throws Throwable;

  Object doLeftShiftEquals(long lhs, int rhs) throws Throwable;

  Object doLeftShiftEquals(long lhs, long rhs) throws Throwable;

  Object doLeftShiftEquals(long lhs, BigInteger rhs) throws Throwable;

  Object doLeftShiftEquals(BigInteger lhs, byte rhs) throws Throwable;

  Object doLeftShiftEquals(BigInteger lhs, char rhs) throws Throwable;

  Object doLeftShiftEquals(BigInteger lhs, short rhs) throws Throwable;

  Object doLeftShiftEquals(BigInteger lhs, int rhs) throws Throwable;

  Object doLeftShiftEquals(BigInteger lhs, long rhs) throws Throwable;

  Object doLeftShiftEquals(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object doLeftShiftEquals(Object lhs, byte rhs) throws Throwable;

  Object doLeftShiftEquals(Object lhs, char rhs) throws Throwable;

  Object doLeftShiftEquals(Object lhs, short rhs) throws Throwable;

  Object doLeftShiftEquals(Object lhs, int rhs) throws Throwable;

  Object doLeftShiftEquals(Object lhs, long rhs) throws Throwable;

  Object doLeftShiftEquals(Object lhs, BigInteger rhs) throws Throwable;

  Object doReverseLeftShiftEquals(byte lhs, Object rhs) throws Throwable;

  Object doReverseLeftShiftEquals(char lhs, Object rhs) throws Throwable;

  Object doReverseLeftShiftEquals(short lhs, Object rhs) throws Throwable;

  Object doReverseLeftShiftEquals(int lhs, Object rhs) throws Throwable;

  Object doReverseLeftShiftEquals(long lhs, Object rhs) throws Throwable;

  Object doReverseLeftShiftEquals(BigInteger lhs, Object rhs) throws Throwable;

  //
  //   Internal methods for operator >>
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement >>
  //

  Object doArithmeticRightShift(Object lhs, Object rhs) throws Throwable;

  Object doReverseArithmeticRightShift(Object lhs, Object rhs) throws Throwable;

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doArithmeticRightShift(byte lhs, byte rhs) throws Throwable;

  Object doArithmeticRightShift(byte lhs, char rhs) throws Throwable;

  Object doArithmeticRightShift(byte lhs, short rhs) throws Throwable;

  Object doArithmeticRightShift(byte lhs, int rhs) throws Throwable;

  Object doArithmeticRightShift(byte lhs, long rhs) throws Throwable;

  Object doArithmeticRightShift(byte lhs, BigInteger rhs) throws Throwable;

  Object doArithmeticRightShift(char lhs, byte rhs) throws Throwable;

  Object doArithmeticRightShift(char lhs, char rhs) throws Throwable;

  Object doArithmeticRightShift(char lhs, short rhs) throws Throwable;

  Object doArithmeticRightShift(char lhs, int rhs) throws Throwable;

  Object doArithmeticRightShift(char lhs, long rhs) throws Throwable;

  Object doArithmeticRightShift(char lhs, BigInteger rhs) throws Throwable;

  Object doArithmeticRightShift(short lhs, byte rhs) throws Throwable;

  Object doArithmeticRightShift(short lhs, char rhs) throws Throwable;

  Object doArithmeticRightShift(short lhs, short rhs) throws Throwable;

  Object doArithmeticRightShift(short lhs, int rhs) throws Throwable;

  Object doArithmeticRightShift(short lhs, long rhs) throws Throwable;

  Object doArithmeticRightShift(short lhs, BigInteger rhs) throws Throwable;

  Object doArithmeticRightShift(int lhs, byte rhs) throws Throwable;

  Object doArithmeticRightShift(int lhs, char rhs) throws Throwable;

  Object doArithmeticRightShift(int lhs, short rhs) throws Throwable;

  Object doArithmeticRightShift(int lhs, int rhs) throws Throwable;

  Object doArithmeticRightShift(int lhs, long rhs) throws Throwable;

  Object doArithmeticRightShift(int lhs, BigInteger rhs) throws Throwable;

  Object doArithmeticRightShift(long lhs, byte rhs) throws Throwable;

  Object doArithmeticRightShift(long lhs, char rhs) throws Throwable;

  Object doArithmeticRightShift(long lhs, short rhs) throws Throwable;

  Object doArithmeticRightShift(long lhs, int rhs) throws Throwable;

  Object doArithmeticRightShift(long lhs, long rhs) throws Throwable;

  Object doArithmeticRightShift(long lhs, BigInteger rhs) throws Throwable;

  Object doArithmeticRightShift(BigInteger lhs, byte rhs) throws Throwable;

  Object doArithmeticRightShift(BigInteger lhs, char rhs) throws Throwable;

  Object doArithmeticRightShift(BigInteger lhs, short rhs) throws Throwable;

  Object doArithmeticRightShift(BigInteger lhs, int rhs) throws Throwable;

  Object doArithmeticRightShift(BigInteger lhs, long rhs) throws Throwable;

  Object doArithmeticRightShift(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object doArithmeticRightShift(Object lhs, byte rhs) throws Throwable;

  Object doArithmeticRightShift(Object lhs, char rhs) throws Throwable;

  Object doArithmeticRightShift(Object lhs, short rhs) throws Throwable;

  Object doArithmeticRightShift(Object lhs, int rhs) throws Throwable;

  Object doArithmeticRightShift(Object lhs, long rhs) throws Throwable;

  Object doArithmeticRightShift(Object lhs, BigInteger rhs) throws Throwable;

  Object doReverseArithmeticRightShift(byte lhs, Object rhs) throws Throwable;

  Object doReverseArithmeticRightShift(char lhs, Object rhs) throws Throwable;

  Object doReverseArithmeticRightShift(short lhs, Object rhs) throws Throwable;

  Object doReverseArithmeticRightShift(int lhs, Object rhs) throws Throwable;

  Object doReverseArithmeticRightShift(long lhs, Object rhs) throws Throwable;

  Object doReverseArithmeticRightShift(BigInteger lhs, Object rhs) throws Throwable;

  //
  //   Internal methods for operator >>=
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement >>=
  //

  Object doArithmeticRightShiftEquals(Object lhs, Object rhs) throws Throwable;

  Object doReverseArithmeticRightShiftEquals(Object lhs, Object rhs) throws Throwable;

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doArithmeticRightShiftEquals(byte lhs, byte rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(byte lhs, char rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(byte lhs, short rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(byte lhs, int rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(byte lhs, long rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(byte lhs, BigInteger rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(char lhs, byte rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(char lhs, char rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(char lhs, short rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(char lhs, int rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(char lhs, long rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(char lhs, BigInteger rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(short lhs, byte rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(short lhs, char rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(short lhs, short rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(short lhs, int rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(short lhs, long rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(short lhs, BigInteger rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(int lhs, byte rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(int lhs, char rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(int lhs, short rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(int lhs, int rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(int lhs, long rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(int lhs, BigInteger rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(long lhs, byte rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(long lhs, char rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(long lhs, short rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(long lhs, int rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(long lhs, long rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(long lhs, BigInteger rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(BigInteger lhs, byte rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(BigInteger lhs, char rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(BigInteger lhs, short rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(BigInteger lhs, int rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(BigInteger lhs, long rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(Object lhs, byte rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(Object lhs, char rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(Object lhs, short rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(Object lhs, int rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(Object lhs, long rhs) throws Throwable;

  Object doArithmeticRightShiftEquals(Object lhs, BigInteger rhs) throws Throwable;

  Object doReverseArithmeticRightShiftEquals(byte lhs, Object rhs) throws Throwable;

  Object doReverseArithmeticRightShiftEquals(char lhs, Object rhs) throws Throwable;

  Object doReverseArithmeticRightShiftEquals(short lhs, Object rhs) throws Throwable;

  Object doReverseArithmeticRightShiftEquals(int lhs, Object rhs) throws Throwable;

  Object doReverseArithmeticRightShiftEquals(long lhs, Object rhs) throws Throwable;

  Object doReverseArithmeticRightShiftEquals(BigInteger lhs, Object rhs) throws Throwable;

  //
  //   Internal methods for operator >>>
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement >>>
  //

  Object doLogicalRightShift(Object lhs, Object rhs) throws Throwable;

  Object doReverseLogicalRightShift(Object lhs, Object rhs) throws Throwable;

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doLogicalRightShift(byte lhs, byte rhs) throws Throwable;

  Object doLogicalRightShift(byte lhs, char rhs) throws Throwable;

  Object doLogicalRightShift(byte lhs, short rhs) throws Throwable;

  Object doLogicalRightShift(byte lhs, int rhs) throws Throwable;

  Object doLogicalRightShift(byte lhs, long rhs) throws Throwable;

  Object doLogicalRightShift(byte lhs, BigInteger rhs) throws Throwable;

  Object doLogicalRightShift(char lhs, byte rhs) throws Throwable;

  Object doLogicalRightShift(char lhs, char rhs) throws Throwable;

  Object doLogicalRightShift(char lhs, short rhs) throws Throwable;

  Object doLogicalRightShift(char lhs, int rhs) throws Throwable;

  Object doLogicalRightShift(char lhs, long rhs) throws Throwable;

  Object doLogicalRightShift(char lhs, BigInteger rhs) throws Throwable;

  Object doLogicalRightShift(short lhs, byte rhs) throws Throwable;

  Object doLogicalRightShift(short lhs, char rhs) throws Throwable;

  Object doLogicalRightShift(short lhs, short rhs) throws Throwable;

  Object doLogicalRightShift(short lhs, int rhs) throws Throwable;

  Object doLogicalRightShift(short lhs, long rhs) throws Throwable;

  Object doLogicalRightShift(short lhs, BigInteger rhs) throws Throwable;

  Object doLogicalRightShift(int lhs, byte rhs) throws Throwable;

  Object doLogicalRightShift(int lhs, char rhs) throws Throwable;

  Object doLogicalRightShift(int lhs, short rhs) throws Throwable;

  Object doLogicalRightShift(int lhs, int rhs) throws Throwable;

  Object doLogicalRightShift(int lhs, long rhs) throws Throwable;

  Object doLogicalRightShift(int lhs, BigInteger rhs) throws Throwable;

  Object doLogicalRightShift(long lhs, byte rhs) throws Throwable;

  Object doLogicalRightShift(long lhs, char rhs) throws Throwable;

  Object doLogicalRightShift(long lhs, short rhs) throws Throwable;

  Object doLogicalRightShift(long lhs, int rhs) throws Throwable;

  Object doLogicalRightShift(long lhs, long rhs) throws Throwable;

  Object doLogicalRightShift(long lhs, BigInteger rhs) throws Throwable;

  Object doLogicalRightShift(Object lhs, byte rhs) throws Throwable;

  Object doLogicalRightShift(Object lhs, char rhs) throws Throwable;

  Object doLogicalRightShift(Object lhs, short rhs) throws Throwable;

  Object doLogicalRightShift(Object lhs, int rhs) throws Throwable;

  Object doLogicalRightShift(Object lhs, long rhs) throws Throwable;

  Object doLogicalRightShift(Object lhs, BigInteger rhs) throws Throwable;

  Object doReverseLogicalRightShift(byte lhs, Object rhs) throws Throwable;

  Object doReverseLogicalRightShift(char lhs, Object rhs) throws Throwable;

  Object doReverseLogicalRightShift(short lhs, Object rhs) throws Throwable;

  Object doReverseLogicalRightShift(int lhs, Object rhs) throws Throwable;

  Object doReverseLogicalRightShift(long lhs, Object rhs) throws Throwable;

  //
  //   Internal methods for operator >>>=
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement >>>=
  //

  Object doLogicalRightShiftEquals(Object lhs, Object rhs) throws Throwable;

  Object doReverseLogicalRightShiftEquals(Object lhs, Object rhs) throws Throwable;

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doLogicalRightShiftEquals(byte lhs, byte rhs) throws Throwable;

  Object doLogicalRightShiftEquals(byte lhs, char rhs) throws Throwable;

  Object doLogicalRightShiftEquals(byte lhs, short rhs) throws Throwable;

  Object doLogicalRightShiftEquals(byte lhs, int rhs) throws Throwable;

  Object doLogicalRightShiftEquals(byte lhs, long rhs) throws Throwable;

  Object doLogicalRightShiftEquals(byte lhs, BigInteger rhs) throws Throwable;

  Object doLogicalRightShiftEquals(char lhs, byte rhs) throws Throwable;

  Object doLogicalRightShiftEquals(char lhs, char rhs) throws Throwable;

  Object doLogicalRightShiftEquals(char lhs, short rhs) throws Throwable;

  Object doLogicalRightShiftEquals(char lhs, int rhs) throws Throwable;

  Object doLogicalRightShiftEquals(char lhs, long rhs) throws Throwable;

  Object doLogicalRightShiftEquals(char lhs, BigInteger rhs) throws Throwable;

  Object doLogicalRightShiftEquals(short lhs, byte rhs) throws Throwable;

  Object doLogicalRightShiftEquals(short lhs, char rhs) throws Throwable;

  Object doLogicalRightShiftEquals(short lhs, short rhs) throws Throwable;

  Object doLogicalRightShiftEquals(short lhs, int rhs) throws Throwable;

  Object doLogicalRightShiftEquals(short lhs, long rhs) throws Throwable;

  Object doLogicalRightShiftEquals(short lhs, BigInteger rhs) throws Throwable;

  Object doLogicalRightShiftEquals(int lhs, byte rhs) throws Throwable;

  Object doLogicalRightShiftEquals(int lhs, char rhs) throws Throwable;

  Object doLogicalRightShiftEquals(int lhs, short rhs) throws Throwable;

  Object doLogicalRightShiftEquals(int lhs, int rhs) throws Throwable;

  Object doLogicalRightShiftEquals(int lhs, long rhs) throws Throwable;

  Object doLogicalRightShiftEquals(int lhs, BigInteger rhs) throws Throwable;

  Object doLogicalRightShiftEquals(long lhs, byte rhs) throws Throwable;

  Object doLogicalRightShiftEquals(long lhs, char rhs) throws Throwable;

  Object doLogicalRightShiftEquals(long lhs, short rhs) throws Throwable;

  Object doLogicalRightShiftEquals(long lhs, int rhs) throws Throwable;

  Object doLogicalRightShiftEquals(long lhs, long rhs) throws Throwable;

  Object doLogicalRightShiftEquals(long lhs, BigInteger rhs) throws Throwable;

  Object doLogicalRightShiftEquals(Object lhs, byte rhs) throws Throwable;

  Object doLogicalRightShiftEquals(Object lhs, char rhs) throws Throwable;

  Object doLogicalRightShiftEquals(Object lhs, short rhs) throws Throwable;

  Object doLogicalRightShiftEquals(Object lhs, int rhs) throws Throwable;

  Object doLogicalRightShiftEquals(Object lhs, long rhs) throws Throwable;

  Object doLogicalRightShiftEquals(Object lhs, BigInteger rhs) throws Throwable;

  Object doReverseLogicalRightShiftEquals(byte lhs, Object rhs) throws Throwable;

  Object doReverseLogicalRightShiftEquals(char lhs, Object rhs) throws Throwable;

  Object doReverseLogicalRightShiftEquals(short lhs, Object rhs) throws Throwable;

  Object doReverseLogicalRightShiftEquals(int lhs, Object rhs) throws Throwable;

  Object doReverseLogicalRightShiftEquals(long lhs, Object rhs) throws Throwable;

  //
  //   Internal methods for operator <=>
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement <=>
  //

  Object doCompare(Object lhs, Object rhs) throws Throwable;

  Object doReverseCompare(Object lhs, Object rhs) throws Throwable;

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doCompare(byte lhs, byte rhs) throws Throwable;

  Object doCompare(byte lhs, char rhs) throws Throwable;

  Object doCompare(byte lhs, short rhs) throws Throwable;

  Object doCompare(byte lhs, int rhs) throws Throwable;

  Object doCompare(byte lhs, long rhs) throws Throwable;

  Object doCompare(byte lhs, float rhs) throws Throwable;

  Object doCompare(byte lhs, double rhs) throws Throwable;

  Object doCompare(byte lhs, BigInteger rhs) throws Throwable;

  Object doCompare(byte lhs, BigDecimal rhs) throws Throwable;

  Object doCompare(char lhs, byte rhs) throws Throwable;

  Object doCompare(char lhs, char rhs) throws Throwable;

  Object doCompare(char lhs, short rhs) throws Throwable;

  Object doCompare(char lhs, int rhs) throws Throwable;

  Object doCompare(char lhs, long rhs) throws Throwable;

  Object doCompare(char lhs, float rhs) throws Throwable;

  Object doCompare(char lhs, double rhs) throws Throwable;

  Object doCompare(char lhs, BigInteger rhs) throws Throwable;

  Object doCompare(char lhs, BigDecimal rhs) throws Throwable;

  Object doCompare(short lhs, byte rhs) throws Throwable;

  Object doCompare(short lhs, char rhs) throws Throwable;

  Object doCompare(short lhs, short rhs) throws Throwable;

  Object doCompare(short lhs, int rhs) throws Throwable;

  Object doCompare(short lhs, long rhs) throws Throwable;

  Object doCompare(short lhs, float rhs) throws Throwable;

  Object doCompare(short lhs, double rhs) throws Throwable;

  Object doCompare(short lhs, BigInteger rhs) throws Throwable;

  Object doCompare(short lhs, BigDecimal rhs) throws Throwable;

  Object doCompare(int lhs, byte rhs) throws Throwable;

  Object doCompare(int lhs, char rhs) throws Throwable;

  Object doCompare(int lhs, short rhs) throws Throwable;

  Object doCompare(int lhs, int rhs) throws Throwable;

  Object doCompare(int lhs, long rhs) throws Throwable;

  Object doCompare(int lhs, float rhs) throws Throwable;

  Object doCompare(int lhs, double rhs) throws Throwable;

  Object doCompare(int lhs, BigInteger rhs) throws Throwable;

  Object doCompare(int lhs, BigDecimal rhs) throws Throwable;

  Object doCompare(long lhs, byte rhs) throws Throwable;

  Object doCompare(long lhs, char rhs) throws Throwable;

  Object doCompare(long lhs, short rhs) throws Throwable;

  Object doCompare(long lhs, int rhs) throws Throwable;

  Object doCompare(long lhs, long rhs) throws Throwable;

  Object doCompare(long lhs, float rhs) throws Throwable;

  Object doCompare(long lhs, double rhs) throws Throwable;

  Object doCompare(long lhs, BigInteger rhs) throws Throwable;

  Object doCompare(long lhs, BigDecimal rhs) throws Throwable;

  Object doCompare(float lhs, byte rhs) throws Throwable;

  Object doCompare(float lhs, char rhs) throws Throwable;

  Object doCompare(float lhs, short rhs) throws Throwable;

  Object doCompare(float lhs, int rhs) throws Throwable;

  Object doCompare(float lhs, long rhs) throws Throwable;

  Object doCompare(float lhs, float rhs) throws Throwable;

  Object doCompare(float lhs, double rhs) throws Throwable;

  Object doCompare(float lhs, BigInteger rhs) throws Throwable;

  Object doCompare(float lhs, BigDecimal rhs) throws Throwable;

  Object doCompare(double lhs, byte rhs) throws Throwable;

  Object doCompare(double lhs, char rhs) throws Throwable;

  Object doCompare(double lhs, short rhs) throws Throwable;

  Object doCompare(double lhs, int rhs) throws Throwable;

  Object doCompare(double lhs, long rhs) throws Throwable;

  Object doCompare(double lhs, float rhs) throws Throwable;

  Object doCompare(double lhs, double rhs) throws Throwable;

  Object doCompare(double lhs, BigInteger rhs) throws Throwable;

  Object doCompare(double lhs, BigDecimal rhs) throws Throwable;

  Object doCompare(BigInteger lhs, byte rhs) throws Throwable;

  Object doCompare(BigInteger lhs, char rhs) throws Throwable;

  Object doCompare(BigInteger lhs, short rhs) throws Throwable;

  Object doCompare(BigInteger lhs, int rhs) throws Throwable;

  Object doCompare(BigInteger lhs, long rhs) throws Throwable;

  Object doCompare(BigInteger lhs, float rhs) throws Throwable;

  Object doCompare(BigInteger lhs, double rhs) throws Throwable;

  Object doCompare(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object doCompare(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object doCompare(BigDecimal lhs, byte rhs) throws Throwable;

  Object doCompare(BigDecimal lhs, char rhs) throws Throwable;

  Object doCompare(BigDecimal lhs, short rhs) throws Throwable;

  Object doCompare(BigDecimal lhs, int rhs) throws Throwable;

  Object doCompare(BigDecimal lhs, long rhs) throws Throwable;

  Object doCompare(BigDecimal lhs, float rhs) throws Throwable;

  Object doCompare(BigDecimal lhs, double rhs) throws Throwable;

  Object doCompare(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object doCompare(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object doCompare(Object lhs, byte rhs) throws Throwable;

  Object doCompare(Object lhs, char rhs) throws Throwable;

  Object doCompare(Object lhs, short rhs) throws Throwable;

  Object doCompare(Object lhs, int rhs) throws Throwable;

  Object doCompare(Object lhs, long rhs) throws Throwable;

  Object doCompare(Object lhs, float rhs) throws Throwable;

  Object doCompare(Object lhs, double rhs) throws Throwable;

  Object doCompare(Object lhs, BigInteger rhs) throws Throwable;

  Object doCompare(Object lhs, BigDecimal rhs) throws Throwable;

  Object doReverseCompare(byte lhs, Object rhs) throws Throwable;

  Object doReverseCompare(char lhs, Object rhs) throws Throwable;

  Object doReverseCompare(short lhs, Object rhs) throws Throwable;

  Object doReverseCompare(int lhs, Object rhs) throws Throwable;

  Object doReverseCompare(long lhs, Object rhs) throws Throwable;

  Object doReverseCompare(float lhs, Object rhs) throws Throwable;

  Object doReverseCompare(double lhs, Object rhs) throws Throwable;

  Object doReverseCompare(BigInteger lhs, Object rhs) throws Throwable;

  Object doReverseCompare(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Internal methods for operator ==
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement ==
  //

  Object doEquals(Object lhs, Object rhs) throws Throwable;

  Object doReverseEquals(Object lhs, Object rhs) throws Throwable;

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doEquals(byte lhs, byte rhs) throws Throwable;

  Object doEquals(byte lhs, char rhs) throws Throwable;

  Object doEquals(byte lhs, short rhs) throws Throwable;

  Object doEquals(byte lhs, int rhs) throws Throwable;

  Object doEquals(byte lhs, long rhs) throws Throwable;

  Object doEquals(byte lhs, float rhs) throws Throwable;

  Object doEquals(byte lhs, double rhs) throws Throwable;

  Object doEquals(byte lhs, BigInteger rhs) throws Throwable;

  Object doEquals(byte lhs, BigDecimal rhs) throws Throwable;

  Object doEquals(char lhs, byte rhs) throws Throwable;

  Object doEquals(char lhs, char rhs) throws Throwable;

  Object doEquals(char lhs, short rhs) throws Throwable;

  Object doEquals(char lhs, int rhs) throws Throwable;

  Object doEquals(char lhs, long rhs) throws Throwable;

  Object doEquals(char lhs, float rhs) throws Throwable;

  Object doEquals(char lhs, double rhs) throws Throwable;

  Object doEquals(char lhs, BigInteger rhs) throws Throwable;

  Object doEquals(char lhs, BigDecimal rhs) throws Throwable;

  Object doEquals(short lhs, byte rhs) throws Throwable;

  Object doEquals(short lhs, char rhs) throws Throwable;

  Object doEquals(short lhs, short rhs) throws Throwable;

  Object doEquals(short lhs, int rhs) throws Throwable;

  Object doEquals(short lhs, long rhs) throws Throwable;

  Object doEquals(short lhs, float rhs) throws Throwable;

  Object doEquals(short lhs, double rhs) throws Throwable;

  Object doEquals(short lhs, BigInteger rhs) throws Throwable;

  Object doEquals(short lhs, BigDecimal rhs) throws Throwable;

  Object doEquals(int lhs, byte rhs) throws Throwable;

  Object doEquals(int lhs, char rhs) throws Throwable;

  Object doEquals(int lhs, short rhs) throws Throwable;

  Object doEquals(int lhs, int rhs) throws Throwable;

  Object doEquals(int lhs, long rhs) throws Throwable;

  Object doEquals(int lhs, float rhs) throws Throwable;

  Object doEquals(int lhs, double rhs) throws Throwable;

  Object doEquals(int lhs, BigInteger rhs) throws Throwable;

  Object doEquals(int lhs, BigDecimal rhs) throws Throwable;

  Object doEquals(long lhs, byte rhs) throws Throwable;

  Object doEquals(long lhs, char rhs) throws Throwable;

  Object doEquals(long lhs, short rhs) throws Throwable;

  Object doEquals(long lhs, int rhs) throws Throwable;

  Object doEquals(long lhs, long rhs) throws Throwable;

  Object doEquals(long lhs, float rhs) throws Throwable;

  Object doEquals(long lhs, double rhs) throws Throwable;

  Object doEquals(long lhs, BigInteger rhs) throws Throwable;

  Object doEquals(long lhs, BigDecimal rhs) throws Throwable;

  Object doEquals(float lhs, byte rhs) throws Throwable;

  Object doEquals(float lhs, char rhs) throws Throwable;

  Object doEquals(float lhs, short rhs) throws Throwable;

  Object doEquals(float lhs, int rhs) throws Throwable;

  Object doEquals(float lhs, long rhs) throws Throwable;

  Object doEquals(float lhs, float rhs) throws Throwable;

  Object doEquals(float lhs, double rhs) throws Throwable;

  Object doEquals(float lhs, BigInteger rhs) throws Throwable;

  Object doEquals(float lhs, BigDecimal rhs) throws Throwable;

  Object doEquals(double lhs, byte rhs) throws Throwable;

  Object doEquals(double lhs, char rhs) throws Throwable;

  Object doEquals(double lhs, short rhs) throws Throwable;

  Object doEquals(double lhs, int rhs) throws Throwable;

  Object doEquals(double lhs, long rhs) throws Throwable;

  Object doEquals(double lhs, float rhs) throws Throwable;

  Object doEquals(double lhs, double rhs) throws Throwable;

  Object doEquals(double lhs, BigInteger rhs) throws Throwable;

  Object doEquals(double lhs, BigDecimal rhs) throws Throwable;

  Object doEquals(BigInteger lhs, byte rhs) throws Throwable;

  Object doEquals(BigInteger lhs, char rhs) throws Throwable;

  Object doEquals(BigInteger lhs, short rhs) throws Throwable;

  Object doEquals(BigInteger lhs, int rhs) throws Throwable;

  Object doEquals(BigInteger lhs, long rhs) throws Throwable;

  Object doEquals(BigInteger lhs, float rhs) throws Throwable;

  Object doEquals(BigInteger lhs, double rhs) throws Throwable;

  Object doEquals(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object doEquals(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object doEquals(BigDecimal lhs, byte rhs) throws Throwable;

  Object doEquals(BigDecimal lhs, char rhs) throws Throwable;

  Object doEquals(BigDecimal lhs, short rhs) throws Throwable;

  Object doEquals(BigDecimal lhs, int rhs) throws Throwable;

  Object doEquals(BigDecimal lhs, long rhs) throws Throwable;

  Object doEquals(BigDecimal lhs, float rhs) throws Throwable;

  Object doEquals(BigDecimal lhs, double rhs) throws Throwable;

  Object doEquals(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object doEquals(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object doEquals(Object lhs, byte rhs) throws Throwable;

  Object doEquals(Object lhs, char rhs) throws Throwable;

  Object doEquals(Object lhs, short rhs) throws Throwable;

  Object doEquals(Object lhs, int rhs) throws Throwable;

  Object doEquals(Object lhs, long rhs) throws Throwable;

  Object doEquals(Object lhs, float rhs) throws Throwable;

  Object doEquals(Object lhs, double rhs) throws Throwable;

  Object doEquals(Object lhs, BigInteger rhs) throws Throwable;

  Object doEquals(Object lhs, BigDecimal rhs) throws Throwable;

  Object doReverseEquals(byte lhs, Object rhs) throws Throwable;

  Object doReverseEquals(char lhs, Object rhs) throws Throwable;

  Object doReverseEquals(short lhs, Object rhs) throws Throwable;

  Object doReverseEquals(int lhs, Object rhs) throws Throwable;

  Object doReverseEquals(long lhs, Object rhs) throws Throwable;

  Object doReverseEquals(float lhs, Object rhs) throws Throwable;

  Object doReverseEquals(double lhs, Object rhs) throws Throwable;

  Object doReverseEquals(BigInteger lhs, Object rhs) throws Throwable;

  Object doReverseEquals(BigDecimal lhs, Object rhs) throws Throwable;

  boolean doEqualsBoolean(Object lhs, Object rhs) throws Throwable;

  boolean doEqualsBoolean(byte lhs, byte rhs) throws Throwable;

  boolean doEqualsBoolean(byte lhs, char rhs) throws Throwable;

  boolean doEqualsBoolean(byte lhs, short rhs) throws Throwable;

  boolean doEqualsBoolean(byte lhs, int rhs) throws Throwable;

  boolean doEqualsBoolean(byte lhs, long rhs) throws Throwable;

  boolean doEqualsBoolean(byte lhs, float rhs) throws Throwable;

  boolean doEqualsBoolean(byte lhs, double rhs) throws Throwable;

  boolean doEqualsBoolean(byte lhs, BigInteger rhs) throws Throwable;

  boolean doEqualsBoolean(byte lhs, BigDecimal rhs) throws Throwable;

  boolean doEqualsBoolean(char lhs, byte rhs) throws Throwable;

  boolean doEqualsBoolean(char lhs, char rhs) throws Throwable;

  boolean doEqualsBoolean(char lhs, short rhs) throws Throwable;

  boolean doEqualsBoolean(char lhs, int rhs) throws Throwable;

  boolean doEqualsBoolean(char lhs, long rhs) throws Throwable;

  boolean doEqualsBoolean(char lhs, float rhs) throws Throwable;

  boolean doEqualsBoolean(char lhs, double rhs) throws Throwable;

  boolean doEqualsBoolean(char lhs, BigInteger rhs) throws Throwable;

  boolean doEqualsBoolean(char lhs, BigDecimal rhs) throws Throwable;

  boolean doEqualsBoolean(short lhs, byte rhs) throws Throwable;

  boolean doEqualsBoolean(short lhs, char rhs) throws Throwable;

  boolean doEqualsBoolean(short lhs, short rhs) throws Throwable;

  boolean doEqualsBoolean(short lhs, int rhs) throws Throwable;

  boolean doEqualsBoolean(short lhs, long rhs) throws Throwable;

  boolean doEqualsBoolean(short lhs, float rhs) throws Throwable;

  boolean doEqualsBoolean(short lhs, double rhs) throws Throwable;

  boolean doEqualsBoolean(short lhs, BigInteger rhs) throws Throwable;

  boolean doEqualsBoolean(short lhs, BigDecimal rhs) throws Throwable;

  boolean doEqualsBoolean(int lhs, byte rhs) throws Throwable;

  boolean doEqualsBoolean(int lhs, char rhs) throws Throwable;

  boolean doEqualsBoolean(int lhs, short rhs) throws Throwable;

  boolean doEqualsBoolean(int lhs, int rhs) throws Throwable;

  boolean doEqualsBoolean(int lhs, long rhs) throws Throwable;

  boolean doEqualsBoolean(int lhs, float rhs) throws Throwable;

  boolean doEqualsBoolean(int lhs, double rhs) throws Throwable;

  boolean doEqualsBoolean(int lhs, BigInteger rhs) throws Throwable;

  boolean doEqualsBoolean(int lhs, BigDecimal rhs) throws Throwable;

  boolean doEqualsBoolean(long lhs, byte rhs) throws Throwable;

  boolean doEqualsBoolean(long lhs, char rhs) throws Throwable;

  boolean doEqualsBoolean(long lhs, short rhs) throws Throwable;

  boolean doEqualsBoolean(long lhs, int rhs) throws Throwable;

  boolean doEqualsBoolean(long lhs, long rhs) throws Throwable;

  boolean doEqualsBoolean(long lhs, float rhs) throws Throwable;

  boolean doEqualsBoolean(long lhs, double rhs) throws Throwable;

  boolean doEqualsBoolean(long lhs, BigInteger rhs) throws Throwable;

  boolean doEqualsBoolean(long lhs, BigDecimal rhs) throws Throwable;

  boolean doEqualsBoolean(float lhs, byte rhs) throws Throwable;

  boolean doEqualsBoolean(float lhs, char rhs) throws Throwable;

  boolean doEqualsBoolean(float lhs, short rhs) throws Throwable;

  boolean doEqualsBoolean(float lhs, int rhs) throws Throwable;

  boolean doEqualsBoolean(float lhs, long rhs) throws Throwable;

  boolean doEqualsBoolean(float lhs, float rhs) throws Throwable;

  boolean doEqualsBoolean(float lhs, double rhs) throws Throwable;

  boolean doEqualsBoolean(float lhs, BigInteger rhs) throws Throwable;

  boolean doEqualsBoolean(float lhs, BigDecimal rhs) throws Throwable;

  boolean doEqualsBoolean(double lhs, byte rhs) throws Throwable;

  boolean doEqualsBoolean(double lhs, char rhs) throws Throwable;

  boolean doEqualsBoolean(double lhs, short rhs) throws Throwable;

  boolean doEqualsBoolean(double lhs, int rhs) throws Throwable;

  boolean doEqualsBoolean(double lhs, long rhs) throws Throwable;

  boolean doEqualsBoolean(double lhs, float rhs) throws Throwable;

  boolean doEqualsBoolean(double lhs, double rhs) throws Throwable;

  boolean doEqualsBoolean(double lhs, BigInteger rhs) throws Throwable;

  boolean doEqualsBoolean(double lhs, BigDecimal rhs) throws Throwable;

  boolean doEqualsBoolean(BigInteger lhs, byte rhs) throws Throwable;

  boolean doEqualsBoolean(BigInteger lhs, char rhs) throws Throwable;

  boolean doEqualsBoolean(BigInteger lhs, short rhs) throws Throwable;

  boolean doEqualsBoolean(BigInteger lhs, int rhs) throws Throwable;

  boolean doEqualsBoolean(BigInteger lhs, long rhs) throws Throwable;

  boolean doEqualsBoolean(BigInteger lhs, float rhs) throws Throwable;

  boolean doEqualsBoolean(BigInteger lhs, double rhs) throws Throwable;

  boolean doEqualsBoolean(BigInteger lhs, BigInteger rhs) throws Throwable;

  boolean doEqualsBoolean(BigInteger lhs, BigDecimal rhs) throws Throwable;

  boolean doEqualsBoolean(BigDecimal lhs, byte rhs) throws Throwable;

  boolean doEqualsBoolean(BigDecimal lhs, char rhs) throws Throwable;

  boolean doEqualsBoolean(BigDecimal lhs, short rhs) throws Throwable;

  boolean doEqualsBoolean(BigDecimal lhs, int rhs) throws Throwable;

  boolean doEqualsBoolean(BigDecimal lhs, long rhs) throws Throwable;

  boolean doEqualsBoolean(BigDecimal lhs, float rhs) throws Throwable;

  boolean doEqualsBoolean(BigDecimal lhs, double rhs) throws Throwable;

  boolean doEqualsBoolean(BigDecimal lhs, BigInteger rhs) throws Throwable;

  boolean doEqualsBoolean(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  boolean doEqualsBoolean(Object lhs, byte rhs) throws Throwable;

  boolean doEqualsBoolean(Object lhs, char rhs) throws Throwable;

  boolean doEqualsBoolean(Object lhs, short rhs) throws Throwable;

  boolean doEqualsBoolean(Object lhs, int rhs) throws Throwable;

  boolean doEqualsBoolean(Object lhs, long rhs) throws Throwable;

  boolean doEqualsBoolean(Object lhs, float rhs) throws Throwable;

  boolean doEqualsBoolean(Object lhs, double rhs) throws Throwable;

  boolean doEqualsBoolean(Object lhs, BigInteger rhs) throws Throwable;

  boolean doEqualsBoolean(Object lhs, BigDecimal rhs) throws Throwable;

  boolean doReverseEqualsBoolean(byte lhs, Object rhs) throws Throwable;

  boolean doReverseEqualsBoolean(char lhs, Object rhs) throws Throwable;

  boolean doReverseEqualsBoolean(short lhs, Object rhs) throws Throwable;

  boolean doReverseEqualsBoolean(int lhs, Object rhs) throws Throwable;

  boolean doReverseEqualsBoolean(long lhs, Object rhs) throws Throwable;

  boolean doReverseEqualsBoolean(float lhs, Object rhs) throws Throwable;

  boolean doReverseEqualsBoolean(double lhs, Object rhs) throws Throwable;

  boolean doReverseEqualsBoolean(BigInteger lhs, Object rhs) throws Throwable;

  boolean doReverseEqualsBoolean(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Internal methods for operator !=
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement !=
  //

  Object doNotEquals(Object lhs, Object rhs) throws Throwable;

  Object doReverseNotEquals(Object lhs, Object rhs) throws Throwable;

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doNotEquals(byte lhs, byte rhs) throws Throwable;

  Object doNotEquals(byte lhs, char rhs) throws Throwable;

  Object doNotEquals(byte lhs, short rhs) throws Throwable;

  Object doNotEquals(byte lhs, int rhs) throws Throwable;

  Object doNotEquals(byte lhs, long rhs) throws Throwable;

  Object doNotEquals(byte lhs, float rhs) throws Throwable;

  Object doNotEquals(byte lhs, double rhs) throws Throwable;

  Object doNotEquals(byte lhs, BigInteger rhs) throws Throwable;

  Object doNotEquals(byte lhs, BigDecimal rhs) throws Throwable;

  Object doNotEquals(char lhs, byte rhs) throws Throwable;

  Object doNotEquals(char lhs, char rhs) throws Throwable;

  Object doNotEquals(char lhs, short rhs) throws Throwable;

  Object doNotEquals(char lhs, int rhs) throws Throwable;

  Object doNotEquals(char lhs, long rhs) throws Throwable;

  Object doNotEquals(char lhs, float rhs) throws Throwable;

  Object doNotEquals(char lhs, double rhs) throws Throwable;

  Object doNotEquals(char lhs, BigInteger rhs) throws Throwable;

  Object doNotEquals(char lhs, BigDecimal rhs) throws Throwable;

  Object doNotEquals(short lhs, byte rhs) throws Throwable;

  Object doNotEquals(short lhs, char rhs) throws Throwable;

  Object doNotEquals(short lhs, short rhs) throws Throwable;

  Object doNotEquals(short lhs, int rhs) throws Throwable;

  Object doNotEquals(short lhs, long rhs) throws Throwable;

  Object doNotEquals(short lhs, float rhs) throws Throwable;

  Object doNotEquals(short lhs, double rhs) throws Throwable;

  Object doNotEquals(short lhs, BigInteger rhs) throws Throwable;

  Object doNotEquals(short lhs, BigDecimal rhs) throws Throwable;

  Object doNotEquals(int lhs, byte rhs) throws Throwable;

  Object doNotEquals(int lhs, char rhs) throws Throwable;

  Object doNotEquals(int lhs, short rhs) throws Throwable;

  Object doNotEquals(int lhs, int rhs) throws Throwable;

  Object doNotEquals(int lhs, long rhs) throws Throwable;

  Object doNotEquals(int lhs, float rhs) throws Throwable;

  Object doNotEquals(int lhs, double rhs) throws Throwable;

  Object doNotEquals(int lhs, BigInteger rhs) throws Throwable;

  Object doNotEquals(int lhs, BigDecimal rhs) throws Throwable;

  Object doNotEquals(long lhs, byte rhs) throws Throwable;

  Object doNotEquals(long lhs, char rhs) throws Throwable;

  Object doNotEquals(long lhs, short rhs) throws Throwable;

  Object doNotEquals(long lhs, int rhs) throws Throwable;

  Object doNotEquals(long lhs, long rhs) throws Throwable;

  Object doNotEquals(long lhs, float rhs) throws Throwable;

  Object doNotEquals(long lhs, double rhs) throws Throwable;

  Object doNotEquals(long lhs, BigInteger rhs) throws Throwable;

  Object doNotEquals(long lhs, BigDecimal rhs) throws Throwable;

  Object doNotEquals(float lhs, byte rhs) throws Throwable;

  Object doNotEquals(float lhs, char rhs) throws Throwable;

  Object doNotEquals(float lhs, short rhs) throws Throwable;

  Object doNotEquals(float lhs, int rhs) throws Throwable;

  Object doNotEquals(float lhs, long rhs) throws Throwable;

  Object doNotEquals(float lhs, float rhs) throws Throwable;

  Object doNotEquals(float lhs, double rhs) throws Throwable;

  Object doNotEquals(float lhs, BigInteger rhs) throws Throwable;

  Object doNotEquals(float lhs, BigDecimal rhs) throws Throwable;

  Object doNotEquals(double lhs, byte rhs) throws Throwable;

  Object doNotEquals(double lhs, char rhs) throws Throwable;

  Object doNotEquals(double lhs, short rhs) throws Throwable;

  Object doNotEquals(double lhs, int rhs) throws Throwable;

  Object doNotEquals(double lhs, long rhs) throws Throwable;

  Object doNotEquals(double lhs, float rhs) throws Throwable;

  Object doNotEquals(double lhs, double rhs) throws Throwable;

  Object doNotEquals(double lhs, BigInteger rhs) throws Throwable;

  Object doNotEquals(double lhs, BigDecimal rhs) throws Throwable;

  Object doNotEquals(BigInteger lhs, byte rhs) throws Throwable;

  Object doNotEquals(BigInteger lhs, char rhs) throws Throwable;

  Object doNotEquals(BigInteger lhs, short rhs) throws Throwable;

  Object doNotEquals(BigInteger lhs, int rhs) throws Throwable;

  Object doNotEquals(BigInteger lhs, long rhs) throws Throwable;

  Object doNotEquals(BigInteger lhs, float rhs) throws Throwable;

  Object doNotEquals(BigInteger lhs, double rhs) throws Throwable;

  Object doNotEquals(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object doNotEquals(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object doNotEquals(BigDecimal lhs, byte rhs) throws Throwable;

  Object doNotEquals(BigDecimal lhs, char rhs) throws Throwable;

  Object doNotEquals(BigDecimal lhs, short rhs) throws Throwable;

  Object doNotEquals(BigDecimal lhs, int rhs) throws Throwable;

  Object doNotEquals(BigDecimal lhs, long rhs) throws Throwable;

  Object doNotEquals(BigDecimal lhs, float rhs) throws Throwable;

  Object doNotEquals(BigDecimal lhs, double rhs) throws Throwable;

  Object doNotEquals(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object doNotEquals(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object doNotEquals(Object lhs, byte rhs) throws Throwable;

  Object doNotEquals(Object lhs, char rhs) throws Throwable;

  Object doNotEquals(Object lhs, short rhs) throws Throwable;

  Object doNotEquals(Object lhs, int rhs) throws Throwable;

  Object doNotEquals(Object lhs, long rhs) throws Throwable;

  Object doNotEquals(Object lhs, float rhs) throws Throwable;

  Object doNotEquals(Object lhs, double rhs) throws Throwable;

  Object doNotEquals(Object lhs, BigInteger rhs) throws Throwable;

  Object doNotEquals(Object lhs, BigDecimal rhs) throws Throwable;

  Object doReverseNotEquals(byte lhs, Object rhs) throws Throwable;

  Object doReverseNotEquals(char lhs, Object rhs) throws Throwable;

  Object doReverseNotEquals(short lhs, Object rhs) throws Throwable;

  Object doReverseNotEquals(int lhs, Object rhs) throws Throwable;

  Object doReverseNotEquals(long lhs, Object rhs) throws Throwable;

  Object doReverseNotEquals(float lhs, Object rhs) throws Throwable;

  Object doReverseNotEquals(double lhs, Object rhs) throws Throwable;

  Object doReverseNotEquals(BigInteger lhs, Object rhs) throws Throwable;

  Object doReverseNotEquals(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Internal methods for operator <
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement <
  //

  Object doLessThan(Object lhs, Object rhs) throws Throwable;

  Object doReverseLessThan(Object lhs, Object rhs) throws Throwable;

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doLessThan(byte lhs, byte rhs) throws Throwable;

  Object doLessThan(byte lhs, char rhs) throws Throwable;

  Object doLessThan(byte lhs, short rhs) throws Throwable;

  Object doLessThan(byte lhs, int rhs) throws Throwable;

  Object doLessThan(byte lhs, long rhs) throws Throwable;

  Object doLessThan(byte lhs, float rhs) throws Throwable;

  Object doLessThan(byte lhs, double rhs) throws Throwable;

  Object doLessThan(byte lhs, BigInteger rhs) throws Throwable;

  Object doLessThan(byte lhs, BigDecimal rhs) throws Throwable;

  Object doLessThan(char lhs, byte rhs) throws Throwable;

  Object doLessThan(char lhs, char rhs) throws Throwable;

  Object doLessThan(char lhs, short rhs) throws Throwable;

  Object doLessThan(char lhs, int rhs) throws Throwable;

  Object doLessThan(char lhs, long rhs) throws Throwable;

  Object doLessThan(char lhs, float rhs) throws Throwable;

  Object doLessThan(char lhs, double rhs) throws Throwable;

  Object doLessThan(char lhs, BigInteger rhs) throws Throwable;

  Object doLessThan(char lhs, BigDecimal rhs) throws Throwable;

  Object doLessThan(short lhs, byte rhs) throws Throwable;

  Object doLessThan(short lhs, char rhs) throws Throwable;

  Object doLessThan(short lhs, short rhs) throws Throwable;

  Object doLessThan(short lhs, int rhs) throws Throwable;

  Object doLessThan(short lhs, long rhs) throws Throwable;

  Object doLessThan(short lhs, float rhs) throws Throwable;

  Object doLessThan(short lhs, double rhs) throws Throwable;

  Object doLessThan(short lhs, BigInteger rhs) throws Throwable;

  Object doLessThan(short lhs, BigDecimal rhs) throws Throwable;

  Object doLessThan(int lhs, byte rhs) throws Throwable;

  Object doLessThan(int lhs, char rhs) throws Throwable;

  Object doLessThan(int lhs, short rhs) throws Throwable;

  Object doLessThan(int lhs, int rhs) throws Throwable;

  Object doLessThan(int lhs, long rhs) throws Throwable;

  Object doLessThan(int lhs, float rhs) throws Throwable;

  Object doLessThan(int lhs, double rhs) throws Throwable;

  Object doLessThan(int lhs, BigInteger rhs) throws Throwable;

  Object doLessThan(int lhs, BigDecimal rhs) throws Throwable;

  Object doLessThan(long lhs, byte rhs) throws Throwable;

  Object doLessThan(long lhs, char rhs) throws Throwable;

  Object doLessThan(long lhs, short rhs) throws Throwable;

  Object doLessThan(long lhs, int rhs) throws Throwable;

  Object doLessThan(long lhs, long rhs) throws Throwable;

  Object doLessThan(long lhs, float rhs) throws Throwable;

  Object doLessThan(long lhs, double rhs) throws Throwable;

  Object doLessThan(long lhs, BigInteger rhs) throws Throwable;

  Object doLessThan(long lhs, BigDecimal rhs) throws Throwable;

  Object doLessThan(float lhs, byte rhs) throws Throwable;

  Object doLessThan(float lhs, char rhs) throws Throwable;

  Object doLessThan(float lhs, short rhs) throws Throwable;

  Object doLessThan(float lhs, int rhs) throws Throwable;

  Object doLessThan(float lhs, long rhs) throws Throwable;

  Object doLessThan(float lhs, float rhs) throws Throwable;

  Object doLessThan(float lhs, double rhs) throws Throwable;

  Object doLessThan(float lhs, BigInteger rhs) throws Throwable;

  Object doLessThan(float lhs, BigDecimal rhs) throws Throwable;

  Object doLessThan(double lhs, byte rhs) throws Throwable;

  Object doLessThan(double lhs, char rhs) throws Throwable;

  Object doLessThan(double lhs, short rhs) throws Throwable;

  Object doLessThan(double lhs, int rhs) throws Throwable;

  Object doLessThan(double lhs, long rhs) throws Throwable;

  Object doLessThan(double lhs, float rhs) throws Throwable;

  Object doLessThan(double lhs, double rhs) throws Throwable;

  Object doLessThan(double lhs, BigInteger rhs) throws Throwable;

  Object doLessThan(double lhs, BigDecimal rhs) throws Throwable;

  Object doLessThan(BigInteger lhs, byte rhs) throws Throwable;

  Object doLessThan(BigInteger lhs, char rhs) throws Throwable;

  Object doLessThan(BigInteger lhs, short rhs) throws Throwable;

  Object doLessThan(BigInteger lhs, int rhs) throws Throwable;

  Object doLessThan(BigInteger lhs, long rhs) throws Throwable;

  Object doLessThan(BigInteger lhs, float rhs) throws Throwable;

  Object doLessThan(BigInteger lhs, double rhs) throws Throwable;

  Object doLessThan(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object doLessThan(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object doLessThan(BigDecimal lhs, byte rhs) throws Throwable;

  Object doLessThan(BigDecimal lhs, char rhs) throws Throwable;

  Object doLessThan(BigDecimal lhs, short rhs) throws Throwable;

  Object doLessThan(BigDecimal lhs, int rhs) throws Throwable;

  Object doLessThan(BigDecimal lhs, long rhs) throws Throwable;

  Object doLessThan(BigDecimal lhs, float rhs) throws Throwable;

  Object doLessThan(BigDecimal lhs, double rhs) throws Throwable;

  Object doLessThan(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object doLessThan(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object doLessThan(Object lhs, byte rhs) throws Throwable;

  Object doLessThan(Object lhs, char rhs) throws Throwable;

  Object doLessThan(Object lhs, short rhs) throws Throwable;

  Object doLessThan(Object lhs, int rhs) throws Throwable;

  Object doLessThan(Object lhs, long rhs) throws Throwable;

  Object doLessThan(Object lhs, float rhs) throws Throwable;

  Object doLessThan(Object lhs, double rhs) throws Throwable;

  Object doLessThan(Object lhs, BigInteger rhs) throws Throwable;

  Object doLessThan(Object lhs, BigDecimal rhs) throws Throwable;

  Object doReverseLessThan(byte lhs, Object rhs) throws Throwable;

  Object doReverseLessThan(char lhs, Object rhs) throws Throwable;

  Object doReverseLessThan(short lhs, Object rhs) throws Throwable;

  Object doReverseLessThan(int lhs, Object rhs) throws Throwable;

  Object doReverseLessThan(long lhs, Object rhs) throws Throwable;

  Object doReverseLessThan(float lhs, Object rhs) throws Throwable;

  Object doReverseLessThan(double lhs, Object rhs) throws Throwable;

  Object doReverseLessThan(BigInteger lhs, Object rhs) throws Throwable;

  Object doReverseLessThan(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Internal methods for operator <=
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement <=
  //

  Object doLessThanOrEquals(Object lhs, Object rhs) throws Throwable;

  Object doReverseLessThanOrEquals(Object lhs, Object rhs) throws Throwable;

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doLessThanOrEquals(byte lhs, byte rhs) throws Throwable;

  Object doLessThanOrEquals(byte lhs, char rhs) throws Throwable;

  Object doLessThanOrEquals(byte lhs, short rhs) throws Throwable;

  Object doLessThanOrEquals(byte lhs, int rhs) throws Throwable;

  Object doLessThanOrEquals(byte lhs, long rhs) throws Throwable;

  Object doLessThanOrEquals(byte lhs, float rhs) throws Throwable;

  Object doLessThanOrEquals(byte lhs, double rhs) throws Throwable;

  Object doLessThanOrEquals(byte lhs, BigInteger rhs) throws Throwable;

  Object doLessThanOrEquals(byte lhs, BigDecimal rhs) throws Throwable;

  Object doLessThanOrEquals(char lhs, byte rhs) throws Throwable;

  Object doLessThanOrEquals(char lhs, char rhs) throws Throwable;

  Object doLessThanOrEquals(char lhs, short rhs) throws Throwable;

  Object doLessThanOrEquals(char lhs, int rhs) throws Throwable;

  Object doLessThanOrEquals(char lhs, long rhs) throws Throwable;

  Object doLessThanOrEquals(char lhs, float rhs) throws Throwable;

  Object doLessThanOrEquals(char lhs, double rhs) throws Throwable;

  Object doLessThanOrEquals(char lhs, BigInteger rhs) throws Throwable;

  Object doLessThanOrEquals(char lhs, BigDecimal rhs) throws Throwable;

  Object doLessThanOrEquals(short lhs, byte rhs) throws Throwable;

  Object doLessThanOrEquals(short lhs, char rhs) throws Throwable;

  Object doLessThanOrEquals(short lhs, short rhs) throws Throwable;

  Object doLessThanOrEquals(short lhs, int rhs) throws Throwable;

  Object doLessThanOrEquals(short lhs, long rhs) throws Throwable;

  Object doLessThanOrEquals(short lhs, float rhs) throws Throwable;

  Object doLessThanOrEquals(short lhs, double rhs) throws Throwable;

  Object doLessThanOrEquals(short lhs, BigInteger rhs) throws Throwable;

  Object doLessThanOrEquals(short lhs, BigDecimal rhs) throws Throwable;

  Object doLessThanOrEquals(int lhs, byte rhs) throws Throwable;

  Object doLessThanOrEquals(int lhs, char rhs) throws Throwable;

  Object doLessThanOrEquals(int lhs, short rhs) throws Throwable;

  Object doLessThanOrEquals(int lhs, int rhs) throws Throwable;

  Object doLessThanOrEquals(int lhs, long rhs) throws Throwable;

  Object doLessThanOrEquals(int lhs, float rhs) throws Throwable;

  Object doLessThanOrEquals(int lhs, double rhs) throws Throwable;

  Object doLessThanOrEquals(int lhs, BigInteger rhs) throws Throwable;

  Object doLessThanOrEquals(int lhs, BigDecimal rhs) throws Throwable;

  Object doLessThanOrEquals(long lhs, byte rhs) throws Throwable;

  Object doLessThanOrEquals(long lhs, char rhs) throws Throwable;

  Object doLessThanOrEquals(long lhs, short rhs) throws Throwable;

  Object doLessThanOrEquals(long lhs, int rhs) throws Throwable;

  Object doLessThanOrEquals(long lhs, long rhs) throws Throwable;

  Object doLessThanOrEquals(long lhs, float rhs) throws Throwable;

  Object doLessThanOrEquals(long lhs, double rhs) throws Throwable;

  Object doLessThanOrEquals(long lhs, BigInteger rhs) throws Throwable;

  Object doLessThanOrEquals(long lhs, BigDecimal rhs) throws Throwable;

  Object doLessThanOrEquals(float lhs, byte rhs) throws Throwable;

  Object doLessThanOrEquals(float lhs, char rhs) throws Throwable;

  Object doLessThanOrEquals(float lhs, short rhs) throws Throwable;

  Object doLessThanOrEquals(float lhs, int rhs) throws Throwable;

  Object doLessThanOrEquals(float lhs, long rhs) throws Throwable;

  Object doLessThanOrEquals(float lhs, float rhs) throws Throwable;

  Object doLessThanOrEquals(float lhs, double rhs) throws Throwable;

  Object doLessThanOrEquals(float lhs, BigInteger rhs) throws Throwable;

  Object doLessThanOrEquals(float lhs, BigDecimal rhs) throws Throwable;

  Object doLessThanOrEquals(double lhs, byte rhs) throws Throwable;

  Object doLessThanOrEquals(double lhs, char rhs) throws Throwable;

  Object doLessThanOrEquals(double lhs, short rhs) throws Throwable;

  Object doLessThanOrEquals(double lhs, int rhs) throws Throwable;

  Object doLessThanOrEquals(double lhs, long rhs) throws Throwable;

  Object doLessThanOrEquals(double lhs, float rhs) throws Throwable;

  Object doLessThanOrEquals(double lhs, double rhs) throws Throwable;

  Object doLessThanOrEquals(double lhs, BigInteger rhs) throws Throwable;

  Object doLessThanOrEquals(double lhs, BigDecimal rhs) throws Throwable;

  Object doLessThanOrEquals(BigInteger lhs, byte rhs) throws Throwable;

  Object doLessThanOrEquals(BigInteger lhs, char rhs) throws Throwable;

  Object doLessThanOrEquals(BigInteger lhs, short rhs) throws Throwable;

  Object doLessThanOrEquals(BigInteger lhs, int rhs) throws Throwable;

  Object doLessThanOrEquals(BigInteger lhs, long rhs) throws Throwable;

  Object doLessThanOrEquals(BigInteger lhs, float rhs) throws Throwable;

  Object doLessThanOrEquals(BigInteger lhs, double rhs) throws Throwable;

  Object doLessThanOrEquals(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object doLessThanOrEquals(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object doLessThanOrEquals(BigDecimal lhs, byte rhs) throws Throwable;

  Object doLessThanOrEquals(BigDecimal lhs, char rhs) throws Throwable;

  Object doLessThanOrEquals(BigDecimal lhs, short rhs) throws Throwable;

  Object doLessThanOrEquals(BigDecimal lhs, int rhs) throws Throwable;

  Object doLessThanOrEquals(BigDecimal lhs, long rhs) throws Throwable;

  Object doLessThanOrEquals(BigDecimal lhs, float rhs) throws Throwable;

  Object doLessThanOrEquals(BigDecimal lhs, double rhs) throws Throwable;

  Object doLessThanOrEquals(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object doLessThanOrEquals(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object doLessThanOrEquals(Object lhs, byte rhs) throws Throwable;

  Object doLessThanOrEquals(Object lhs, char rhs) throws Throwable;

  Object doLessThanOrEquals(Object lhs, short rhs) throws Throwable;

  Object doLessThanOrEquals(Object lhs, int rhs) throws Throwable;

  Object doLessThanOrEquals(Object lhs, long rhs) throws Throwable;

  Object doLessThanOrEquals(Object lhs, float rhs) throws Throwable;

  Object doLessThanOrEquals(Object lhs, double rhs) throws Throwable;

  Object doLessThanOrEquals(Object lhs, BigInteger rhs) throws Throwable;

  Object doLessThanOrEquals(Object lhs, BigDecimal rhs) throws Throwable;

  Object doReverseLessThanOrEquals(byte lhs, Object rhs) throws Throwable;

  Object doReverseLessThanOrEquals(char lhs, Object rhs) throws Throwable;

  Object doReverseLessThanOrEquals(short lhs, Object rhs) throws Throwable;

  Object doReverseLessThanOrEquals(int lhs, Object rhs) throws Throwable;

  Object doReverseLessThanOrEquals(long lhs, Object rhs) throws Throwable;

  Object doReverseLessThanOrEquals(float lhs, Object rhs) throws Throwable;

  Object doReverseLessThanOrEquals(double lhs, Object rhs) throws Throwable;

  Object doReverseLessThanOrEquals(BigInteger lhs, Object rhs) throws Throwable;

  Object doReverseLessThanOrEquals(BigDecimal lhs, Object rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(Object lhs, Object rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(byte lhs, byte rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(byte lhs, char rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(byte lhs, short rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(byte lhs, int rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(byte lhs, long rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(byte lhs, float rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(byte lhs, double rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(byte lhs, BigInteger rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(byte lhs, BigDecimal rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(char lhs, byte rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(char lhs, char rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(char lhs, short rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(char lhs, int rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(char lhs, long rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(char lhs, float rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(char lhs, double rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(char lhs, BigInteger rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(char lhs, BigDecimal rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(short lhs, byte rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(short lhs, char rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(short lhs, short rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(short lhs, int rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(short lhs, long rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(short lhs, float rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(short lhs, double rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(short lhs, BigInteger rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(short lhs, BigDecimal rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(int lhs, byte rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(int lhs, char rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(int lhs, short rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(int lhs, int rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(int lhs, long rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(int lhs, float rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(int lhs, double rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(int lhs, BigInteger rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(int lhs, BigDecimal rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(long lhs, byte rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(long lhs, char rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(long lhs, short rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(long lhs, int rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(long lhs, long rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(long lhs, float rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(long lhs, double rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(long lhs, BigInteger rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(long lhs, BigDecimal rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(float lhs, byte rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(float lhs, char rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(float lhs, short rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(float lhs, int rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(float lhs, long rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(float lhs, float rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(float lhs, double rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(float lhs, BigInteger rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(float lhs, BigDecimal rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(double lhs, byte rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(double lhs, char rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(double lhs, short rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(double lhs, int rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(double lhs, long rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(double lhs, float rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(double lhs, double rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(double lhs, BigInteger rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(double lhs, BigDecimal rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(BigInteger lhs, byte rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(BigInteger lhs, char rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(BigInteger lhs, short rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(BigInteger lhs, int rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(BigInteger lhs, long rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(BigInteger lhs, float rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(BigInteger lhs, double rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(BigInteger lhs, BigInteger rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(BigInteger lhs, BigDecimal rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(BigDecimal lhs, byte rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(BigDecimal lhs, char rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(BigDecimal lhs, short rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(BigDecimal lhs, int rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(BigDecimal lhs, long rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(BigDecimal lhs, float rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(BigDecimal lhs, double rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(BigDecimal lhs, BigInteger rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(Object lhs, byte rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(Object lhs, char rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(Object lhs, short rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(Object lhs, int rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(Object lhs, long rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(Object lhs, float rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(Object lhs, double rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(Object lhs, BigInteger rhs) throws Throwable;

  boolean doLessThanOrEqualsBoolean(Object lhs, BigDecimal rhs) throws Throwable;

  boolean doReverseLessThanOrEqualsBoolean(byte lhs, Object rhs) throws Throwable;

  boolean doReverseLessThanOrEqualsBoolean(char lhs, Object rhs) throws Throwable;

  boolean doReverseLessThanOrEqualsBoolean(short lhs, Object rhs) throws Throwable;

  boolean doReverseLessThanOrEqualsBoolean(int lhs, Object rhs) throws Throwable;

  boolean doReverseLessThanOrEqualsBoolean(long lhs, Object rhs) throws Throwable;

  boolean doReverseLessThanOrEqualsBoolean(float lhs, Object rhs) throws Throwable;

  boolean doReverseLessThanOrEqualsBoolean(double lhs, Object rhs) throws Throwable;

  boolean doReverseLessThanOrEqualsBoolean(BigInteger lhs, Object rhs) throws Throwable;

  boolean doReverseLessThanOrEqualsBoolean(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Internal methods for operator >
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement >
  //

  Object doGreaterThan(Object lhs, Object rhs) throws Throwable;

  Object doReverseGreaterThan(Object lhs, Object rhs) throws Throwable;

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doGreaterThan(byte lhs, byte rhs) throws Throwable;

  Object doGreaterThan(byte lhs, char rhs) throws Throwable;

  Object doGreaterThan(byte lhs, short rhs) throws Throwable;

  Object doGreaterThan(byte lhs, int rhs) throws Throwable;

  Object doGreaterThan(byte lhs, long rhs) throws Throwable;

  Object doGreaterThan(byte lhs, float rhs) throws Throwable;

  Object doGreaterThan(byte lhs, double rhs) throws Throwable;

  Object doGreaterThan(byte lhs, BigInteger rhs) throws Throwable;

  Object doGreaterThan(byte lhs, BigDecimal rhs) throws Throwable;

  Object doGreaterThan(char lhs, byte rhs) throws Throwable;

  Object doGreaterThan(char lhs, char rhs) throws Throwable;

  Object doGreaterThan(char lhs, short rhs) throws Throwable;

  Object doGreaterThan(char lhs, int rhs) throws Throwable;

  Object doGreaterThan(char lhs, long rhs) throws Throwable;

  Object doGreaterThan(char lhs, float rhs) throws Throwable;

  Object doGreaterThan(char lhs, double rhs) throws Throwable;

  Object doGreaterThan(char lhs, BigInteger rhs) throws Throwable;

  Object doGreaterThan(char lhs, BigDecimal rhs) throws Throwable;

  Object doGreaterThan(short lhs, byte rhs) throws Throwable;

  Object doGreaterThan(short lhs, char rhs) throws Throwable;

  Object doGreaterThan(short lhs, short rhs) throws Throwable;

  Object doGreaterThan(short lhs, int rhs) throws Throwable;

  Object doGreaterThan(short lhs, long rhs) throws Throwable;

  Object doGreaterThan(short lhs, float rhs) throws Throwable;

  Object doGreaterThan(short lhs, double rhs) throws Throwable;

  Object doGreaterThan(short lhs, BigInteger rhs) throws Throwable;

  Object doGreaterThan(short lhs, BigDecimal rhs) throws Throwable;

  Object doGreaterThan(int lhs, byte rhs) throws Throwable;

  Object doGreaterThan(int lhs, char rhs) throws Throwable;

  Object doGreaterThan(int lhs, short rhs) throws Throwable;

  Object doGreaterThan(int lhs, int rhs) throws Throwable;

  Object doGreaterThan(int lhs, long rhs) throws Throwable;

  Object doGreaterThan(int lhs, float rhs) throws Throwable;

  Object doGreaterThan(int lhs, double rhs) throws Throwable;

  Object doGreaterThan(int lhs, BigInteger rhs) throws Throwable;

  Object doGreaterThan(int lhs, BigDecimal rhs) throws Throwable;

  Object doGreaterThan(long lhs, byte rhs) throws Throwable;

  Object doGreaterThan(long lhs, char rhs) throws Throwable;

  Object doGreaterThan(long lhs, short rhs) throws Throwable;

  Object doGreaterThan(long lhs, int rhs) throws Throwable;

  Object doGreaterThan(long lhs, long rhs) throws Throwable;

  Object doGreaterThan(long lhs, float rhs) throws Throwable;

  Object doGreaterThan(long lhs, double rhs) throws Throwable;

  Object doGreaterThan(long lhs, BigInteger rhs) throws Throwable;

  Object doGreaterThan(long lhs, BigDecimal rhs) throws Throwable;

  Object doGreaterThan(float lhs, byte rhs) throws Throwable;

  Object doGreaterThan(float lhs, char rhs) throws Throwable;

  Object doGreaterThan(float lhs, short rhs) throws Throwable;

  Object doGreaterThan(float lhs, int rhs) throws Throwable;

  Object doGreaterThan(float lhs, long rhs) throws Throwable;

  Object doGreaterThan(float lhs, float rhs) throws Throwable;

  Object doGreaterThan(float lhs, double rhs) throws Throwable;

  Object doGreaterThan(float lhs, BigInteger rhs) throws Throwable;

  Object doGreaterThan(float lhs, BigDecimal rhs) throws Throwable;

  Object doGreaterThan(double lhs, byte rhs) throws Throwable;

  Object doGreaterThan(double lhs, char rhs) throws Throwable;

  Object doGreaterThan(double lhs, short rhs) throws Throwable;

  Object doGreaterThan(double lhs, int rhs) throws Throwable;

  Object doGreaterThan(double lhs, long rhs) throws Throwable;

  Object doGreaterThan(double lhs, float rhs) throws Throwable;

  Object doGreaterThan(double lhs, double rhs) throws Throwable;

  Object doGreaterThan(double lhs, BigInteger rhs) throws Throwable;

  Object doGreaterThan(double lhs, BigDecimal rhs) throws Throwable;

  Object doGreaterThan(BigInteger lhs, byte rhs) throws Throwable;

  Object doGreaterThan(BigInteger lhs, char rhs) throws Throwable;

  Object doGreaterThan(BigInteger lhs, short rhs) throws Throwable;

  Object doGreaterThan(BigInteger lhs, int rhs) throws Throwable;

  Object doGreaterThan(BigInteger lhs, long rhs) throws Throwable;

  Object doGreaterThan(BigInteger lhs, float rhs) throws Throwable;

  Object doGreaterThan(BigInteger lhs, double rhs) throws Throwable;

  Object doGreaterThan(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object doGreaterThan(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object doGreaterThan(BigDecimal lhs, byte rhs) throws Throwable;

  Object doGreaterThan(BigDecimal lhs, char rhs) throws Throwable;

  Object doGreaterThan(BigDecimal lhs, short rhs) throws Throwable;

  Object doGreaterThan(BigDecimal lhs, int rhs) throws Throwable;

  Object doGreaterThan(BigDecimal lhs, long rhs) throws Throwable;

  Object doGreaterThan(BigDecimal lhs, float rhs) throws Throwable;

  Object doGreaterThan(BigDecimal lhs, double rhs) throws Throwable;

  Object doGreaterThan(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object doGreaterThan(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object doGreaterThan(Object lhs, byte rhs) throws Throwable;

  Object doGreaterThan(Object lhs, char rhs) throws Throwable;

  Object doGreaterThan(Object lhs, short rhs) throws Throwable;

  Object doGreaterThan(Object lhs, int rhs) throws Throwable;

  Object doGreaterThan(Object lhs, long rhs) throws Throwable;

  Object doGreaterThan(Object lhs, float rhs) throws Throwable;

  Object doGreaterThan(Object lhs, double rhs) throws Throwable;

  Object doGreaterThan(Object lhs, BigInteger rhs) throws Throwable;

  Object doGreaterThan(Object lhs, BigDecimal rhs) throws Throwable;

  Object doReverseGreaterThan(byte lhs, Object rhs) throws Throwable;

  Object doReverseGreaterThan(char lhs, Object rhs) throws Throwable;

  Object doReverseGreaterThan(short lhs, Object rhs) throws Throwable;

  Object doReverseGreaterThan(int lhs, Object rhs) throws Throwable;

  Object doReverseGreaterThan(long lhs, Object rhs) throws Throwable;

  Object doReverseGreaterThan(float lhs, Object rhs) throws Throwable;

  Object doReverseGreaterThan(double lhs, Object rhs) throws Throwable;

  Object doReverseGreaterThan(BigInteger lhs, Object rhs) throws Throwable;

  Object doReverseGreaterThan(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Internal methods for operator >=
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement >=
  //

  Object doGreaterThanOrEquals(Object lhs, Object rhs) throws Throwable;

  Object doReverseGreaterThanOrEquals(Object lhs, Object rhs) throws Throwable;

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doGreaterThanOrEquals(byte lhs, byte rhs) throws Throwable;

  Object doGreaterThanOrEquals(byte lhs, char rhs) throws Throwable;

  Object doGreaterThanOrEquals(byte lhs, short rhs) throws Throwable;

  Object doGreaterThanOrEquals(byte lhs, int rhs) throws Throwable;

  Object doGreaterThanOrEquals(byte lhs, long rhs) throws Throwable;

  Object doGreaterThanOrEquals(byte lhs, float rhs) throws Throwable;

  Object doGreaterThanOrEquals(byte lhs, double rhs) throws Throwable;

  Object doGreaterThanOrEquals(byte lhs, BigInteger rhs) throws Throwable;

  Object doGreaterThanOrEquals(byte lhs, BigDecimal rhs) throws Throwable;

  Object doGreaterThanOrEquals(char lhs, byte rhs) throws Throwable;

  Object doGreaterThanOrEquals(char lhs, char rhs) throws Throwable;

  Object doGreaterThanOrEquals(char lhs, short rhs) throws Throwable;

  Object doGreaterThanOrEquals(char lhs, int rhs) throws Throwable;

  Object doGreaterThanOrEquals(char lhs, long rhs) throws Throwable;

  Object doGreaterThanOrEquals(char lhs, float rhs) throws Throwable;

  Object doGreaterThanOrEquals(char lhs, double rhs) throws Throwable;

  Object doGreaterThanOrEquals(char lhs, BigInteger rhs) throws Throwable;

  Object doGreaterThanOrEquals(char lhs, BigDecimal rhs) throws Throwable;

  Object doGreaterThanOrEquals(short lhs, byte rhs) throws Throwable;

  Object doGreaterThanOrEquals(short lhs, char rhs) throws Throwable;

  Object doGreaterThanOrEquals(short lhs, short rhs) throws Throwable;

  Object doGreaterThanOrEquals(short lhs, int rhs) throws Throwable;

  Object doGreaterThanOrEquals(short lhs, long rhs) throws Throwable;

  Object doGreaterThanOrEquals(short lhs, float rhs) throws Throwable;

  Object doGreaterThanOrEquals(short lhs, double rhs) throws Throwable;

  Object doGreaterThanOrEquals(short lhs, BigInteger rhs) throws Throwable;

  Object doGreaterThanOrEquals(short lhs, BigDecimal rhs) throws Throwable;

  Object doGreaterThanOrEquals(int lhs, byte rhs) throws Throwable;

  Object doGreaterThanOrEquals(int lhs, char rhs) throws Throwable;

  Object doGreaterThanOrEquals(int lhs, short rhs) throws Throwable;

  Object doGreaterThanOrEquals(int lhs, int rhs) throws Throwable;

  Object doGreaterThanOrEquals(int lhs, long rhs) throws Throwable;

  Object doGreaterThanOrEquals(int lhs, float rhs) throws Throwable;

  Object doGreaterThanOrEquals(int lhs, double rhs) throws Throwable;

  Object doGreaterThanOrEquals(int lhs, BigInteger rhs) throws Throwable;

  Object doGreaterThanOrEquals(int lhs, BigDecimal rhs) throws Throwable;

  Object doGreaterThanOrEquals(long lhs, byte rhs) throws Throwable;

  Object doGreaterThanOrEquals(long lhs, char rhs) throws Throwable;

  Object doGreaterThanOrEquals(long lhs, short rhs) throws Throwable;

  Object doGreaterThanOrEquals(long lhs, int rhs) throws Throwable;

  Object doGreaterThanOrEquals(long lhs, long rhs) throws Throwable;

  Object doGreaterThanOrEquals(long lhs, float rhs) throws Throwable;

  Object doGreaterThanOrEquals(long lhs, double rhs) throws Throwable;

  Object doGreaterThanOrEquals(long lhs, BigInteger rhs) throws Throwable;

  Object doGreaterThanOrEquals(long lhs, BigDecimal rhs) throws Throwable;

  Object doGreaterThanOrEquals(float lhs, byte rhs) throws Throwable;

  Object doGreaterThanOrEquals(float lhs, char rhs) throws Throwable;

  Object doGreaterThanOrEquals(float lhs, short rhs) throws Throwable;

  Object doGreaterThanOrEquals(float lhs, int rhs) throws Throwable;

  Object doGreaterThanOrEquals(float lhs, long rhs) throws Throwable;

  Object doGreaterThanOrEquals(float lhs, float rhs) throws Throwable;

  Object doGreaterThanOrEquals(float lhs, double rhs) throws Throwable;

  Object doGreaterThanOrEquals(float lhs, BigInteger rhs) throws Throwable;

  Object doGreaterThanOrEquals(float lhs, BigDecimal rhs) throws Throwable;

  Object doGreaterThanOrEquals(double lhs, byte rhs) throws Throwable;

  Object doGreaterThanOrEquals(double lhs, char rhs) throws Throwable;

  Object doGreaterThanOrEquals(double lhs, short rhs) throws Throwable;

  Object doGreaterThanOrEquals(double lhs, int rhs) throws Throwable;

  Object doGreaterThanOrEquals(double lhs, long rhs) throws Throwable;

  Object doGreaterThanOrEquals(double lhs, float rhs) throws Throwable;

  Object doGreaterThanOrEquals(double lhs, double rhs) throws Throwable;

  Object doGreaterThanOrEquals(double lhs, BigInteger rhs) throws Throwable;

  Object doGreaterThanOrEquals(double lhs, BigDecimal rhs) throws Throwable;

  Object doGreaterThanOrEquals(BigInteger lhs, byte rhs) throws Throwable;

  Object doGreaterThanOrEquals(BigInteger lhs, char rhs) throws Throwable;

  Object doGreaterThanOrEquals(BigInteger lhs, short rhs) throws Throwable;

  Object doGreaterThanOrEquals(BigInteger lhs, int rhs) throws Throwable;

  Object doGreaterThanOrEquals(BigInteger lhs, long rhs) throws Throwable;

  Object doGreaterThanOrEquals(BigInteger lhs, float rhs) throws Throwable;

  Object doGreaterThanOrEquals(BigInteger lhs, double rhs) throws Throwable;

  Object doGreaterThanOrEquals(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object doGreaterThanOrEquals(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object doGreaterThanOrEquals(BigDecimal lhs, byte rhs) throws Throwable;

  Object doGreaterThanOrEquals(BigDecimal lhs, char rhs) throws Throwable;

  Object doGreaterThanOrEquals(BigDecimal lhs, short rhs) throws Throwable;

  Object doGreaterThanOrEquals(BigDecimal lhs, int rhs) throws Throwable;

  Object doGreaterThanOrEquals(BigDecimal lhs, long rhs) throws Throwable;

  Object doGreaterThanOrEquals(BigDecimal lhs, float rhs) throws Throwable;

  Object doGreaterThanOrEquals(BigDecimal lhs, double rhs) throws Throwable;

  Object doGreaterThanOrEquals(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object doGreaterThanOrEquals(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object doGreaterThanOrEquals(Object lhs, byte rhs) throws Throwable;

  Object doGreaterThanOrEquals(Object lhs, char rhs) throws Throwable;

  Object doGreaterThanOrEquals(Object lhs, short rhs) throws Throwable;

  Object doGreaterThanOrEquals(Object lhs, int rhs) throws Throwable;

  Object doGreaterThanOrEquals(Object lhs, long rhs) throws Throwable;

  Object doGreaterThanOrEquals(Object lhs, float rhs) throws Throwable;

  Object doGreaterThanOrEquals(Object lhs, double rhs) throws Throwable;

  Object doGreaterThanOrEquals(Object lhs, BigInteger rhs) throws Throwable;

  Object doGreaterThanOrEquals(Object lhs, BigDecimal rhs) throws Throwable;

  Object doReverseGreaterThanOrEquals(byte lhs, Object rhs) throws Throwable;

  Object doReverseGreaterThanOrEquals(char lhs, Object rhs) throws Throwable;

  Object doReverseGreaterThanOrEquals(short lhs, Object rhs) throws Throwable;

  Object doReverseGreaterThanOrEquals(int lhs, Object rhs) throws Throwable;

  Object doReverseGreaterThanOrEquals(long lhs, Object rhs) throws Throwable;

  Object doReverseGreaterThanOrEquals(float lhs, Object rhs) throws Throwable;

  Object doReverseGreaterThanOrEquals(double lhs, Object rhs) throws Throwable;

  Object doReverseGreaterThanOrEquals(BigInteger lhs, Object rhs) throws Throwable;

  Object doReverseGreaterThanOrEquals(BigDecimal lhs, Object rhs) throws Throwable;
}
