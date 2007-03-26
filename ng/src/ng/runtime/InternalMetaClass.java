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

public interface InternalMetaClass {
  /**
   * @param instance
   * @return the Object to be used whan passing this instance as a parameter
   */
  Object getParamObject(Object instance);
  
  MetaClass doGetMetaClassFor(Class theClass);

  /**
   * @param instance 
   * @return The class which is represented by this MetaClass
   */
  Class doGetTheClass(Object instance);
  
  /**
   * @param theClass 
   * @param arguments
   * @return
   */
  Object doInvokeConstructor(Class theClass, Object[] arguments);

  /**
   * @param instance
   * @param methodName
   * @param arguments
   * @return
   */
  Object doInvokeMethod(Object instance, String methodName, Object[] arguments);

  /**
   * @param instance
   * @param methodName
   * @return the result of invoking the method on the instance with no
   *         parameters.
   * @return
   */
  Object doInvokeMethod(Object instance, String methodName);

  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return the result of invoking the method on the instance with the supplied
   *         parameters.
   */
  Object doInvokeMethod(Object instance, String methodName, Object p1);

  /**
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @return the result of invoking the method on the instance with the supplied
   *         parameters.
   */
  Object doInvokeMethod(Object instance, String methodName, Object p1, Object p2);

  /**
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @return the result of invoking the method on the instance with the supplied
   *         parameters.
   */
  Object doInvokeMethod(Object instance, String methodName, Object p1, Object p2, Object p3);

  /**
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  Object doInvokeMethod(Object instance, String methodName, Object p1, Object p2, Object p3, Object p4);

  /**
   * @param instance
   * @param propertyName
   * @return
   */
  Object doGetProperty(Object instance, String propertyName);

  /**
   * @param instance
   * @param propertyName
   * @param newValue
   * @return
   */
  Object doSetProperty(Object instance, String propertyName, Object newValue);

  /**
   * @param instance
   * @param fieldName
   * @return
   */
  Object doGetField(Object instance, String fieldName);

  /**
   * @param instance
   * @param fieldName
   * @param newValue
   * @return
   */
  Object doSetField(Object instance, String fieldName, Object newValue);
  
  /**
   * @param instance
   * @param arguments
   * @return
   */
  Object doCall(Object instance, Object[] arguments);
  
  /**
   * @param instance
   * @return
   */
  Object doCall(Object instance);

  /**
   * @param instance
   * @param p1
   * @return
   */
  Object doCall(Object instance, Object p1);

  /**
   * @param instance
   * @param p1
   * @param p2
   * @return
   */
  Object doCall(Object instance, Object p1, Object p2);

  /**
   * @param instance
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  Object doCall(Object instance, Object p1, Object p2, Object p3);

  /**
   * @param instance
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  Object doCall(Object instance, Object p1, Object p2, Object p3, Object p4);

  /**
   * @param instance
   * @return
   */
  Object doComplement(Object instance);

  /**
   * @param instance
   * @return
   */
  Object doComplement(int instance);

  /**
   * @param instance
   * @return
   */
  Object doComplement(long instance);

  /**
   * @param instance
   * @return
   */
  Object doComplement(BigInteger instance);

  /**
   * @param instance
   * @return
   */
  Object doNot(Object instance);

  /**
   * @param instance
   * @return
   */
  Object doNot(boolean instance);

  /**
   * @param instance
   * @return
   */
  Object doUnaryPlus(Object instance);

  /**
   * @param instance
   * @return
   */
  Object doUnaryPlus(int instance);

  /**
   * @param instance
   * @return
   */
  Object doUnaryPlus(long instance);

  /**
   * @param instance
   * @return
   */
  Object doUnaryPlus(float instance);

  /**
   * @param instance
   * @return
   */
  Object doUnaryPlus(double instance);

  /**
   * @param instance
   * @return
   */
  Object doUnaryPlus(BigInteger instance);

  /**
   * @param instance
   * @return
   */
  Object doUnaryPlus(BigDecimal instance);

  /**
   * @param instance
   * @return
   */
  Object doUnaryMinus(Object instance);

  /**
   * @param instance
   * @return
   */
  Object doUnaryMinus(int instance);

  /**
   * @param instance
   * @return
   */
  Object doUnaryMinus(long instance);

  /**
   * @param instance
   * @return
   */
  Object doUnaryMinus(float instance);

  /**
   * @param instance
   * @return
   */
  Object doUnaryMinus(double instance);

  /**
   * @param instance
   * @return
   */
  Object doUnaryMinus(BigInteger instance);

  /**
   * @param instance
   * @return
   */
  Object doUnaryMinus(BigDecimal instance);

  /**
   * @param instance
   * @param type
   * @return
   */
  Object doIsInstanceof(Object instance, Class type);

  /**
   * @param instance
   * @param rhs
   * @return
   */
  Object doIsCase(Object instance, Object rhs);

  /**
   * @param instance
   * @param type
   * @return
   */
  Object doAsType(Object instance, Class type);

  /**
   * @param instance
   * @param index
   * @return
   */
  Object doGetAt(Object instance, Object index);

  /**
   * @param instance
   * @param index
   * @return
   */
  Object doGetAt(Object instance, int index);

  /**
   * @param instance
   * @param index
   * @return
   */
  Object doGetAt(Object instance, BigInteger index);

  /**
   * @param instance
   * @param index
   * @return
   */
  Object doPutAt(Object instance, Object index);

  /**
   * @param instance
   * @param index
   * @return
   */
  Object doPutAt(Object instance, int index);

  /**
   * @param instance
   * @param index
   * @return
   */
  Object doPutAt(Object instance, BigInteger index);
  
  /**
   * @param instance
   * @return
   */
  Object doPrefixIncrement(Object instance);
  
  /**
   * @param instance
   * @return
   */
  Object doPrefixIncrement(int instance);
  
  /**
   * @param instance
   * @return
   */
  Object doPrefixIncrement(long instance);
  
  /**
   * @param instance
   * @return
   */
  Object doPrefixIncrement(float instance);
  
  /**
   * @param instance
   * @return
   */
  Object doPrefixIncrement(double instance);
  
  /**
   * @param instance
   * @return
   */
  Object doPrefixIncrement(BigInteger instance);
  
  /**
   * @param instance
   * @return
   */
  Object doPrefixIncrement(BigDecimal instance);
  
  /**
   * @param instance
   * @return
   */
  Object doPrefixDecrement(Object instance);
  
  /**
   * @param instance
   * @return
   */
  Object doPrefixDecrement(int instance);
  
  /**
   * @param instance
   * @return
   */
  Object doPrefixDecrement(long instance);
  
  /**
   * @param instance
   * @return
   */
  Object doPrefixDecrement(float instance);
  
  /**
   * @param instance
   * @return
   */
  Object doPrefixDecrement(double instance);
  
  /**
   * @param instance
   * @return
   */
  Object doPrefixDecrement(BigInteger instance);
  
  /**
   * @param instance
   * @return
   */
  Object doPrefixDecrement(BigDecimal instance);
  
  /**
   * @param instance
   * @return
   */
  Object doPostfixIncrement(Object instance);
  
  /**
   * @param instance
   * @return
   */
  Object doPostfixIncrement(int instance);
  
  /**
   * @param instance
   * @return
   */
  Object doPostfixIncrement(long instance);
  
  /**
   * @param instance
   * @return
   */
  Object doPostfixIncrement(float instance);
  
  /**
   * @param instance
   * @return
   */
  Object doPostfixIncrement(BigDecimal instance);
  
  /**
   * @param instance
   * @return
   */
  Object doPostfixIncrement(BigInteger instance);
  
  /**
   * @param instance
   * @return
   */
  Object doPostfixIncrement(double instance);
  
  /**
   * @param instance
   * @return
   */
  Object doPostfixDecrement(Object instance);
  
  /**
   * @param instance
   * @return
   */
  Object doPostfixDecrement(int instance);
  
  /**
   * @param instance
   * @return
   */
  Object doPostfixDecrement(long instance);
  
  /**
   * @param instance
   * @return
   */
  Object doPostfixDecrement(float instance);
  
  /**
   * @param instance
   * @return
   */
  Object doPostfixDecrement(double instance);
  
  /**
   * @param instance
   * @return
   */
  Object doPostfixDecrement(BigDecimal instance);
  
  /**
   * @param instance
   * @return
   */
  Object doPostfixDecrement(BigInteger instance);

  //
  //   Internal methods for operator +
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement +
  //

  Object doAdd(Object lhs, Object rhs);

  Object doReverseAdd(Object lhs, Object rhs);

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doAdd(byte lhs, byte rhs);

  Object doAdd(byte lhs, char rhs);

  Object doAdd(byte lhs, short rhs);

  Object doAdd(byte lhs, int rhs);

  Object doAdd(byte lhs, long rhs);

  Object doAdd(byte lhs, float rhs);

  Object doAdd(byte lhs, double rhs);

  Object doAdd(byte lhs, BigInteger rhs);

  Object doAdd(byte lhs, BigDecimal rhs);

  Object doAdd(char lhs, byte rhs);

  Object doAdd(char lhs, char rhs);

  Object doAdd(char lhs, short rhs);

  Object doAdd(char lhs, int rhs);

  Object doAdd(char lhs, long rhs);

  Object doAdd(char lhs, float rhs);

  Object doAdd(char lhs, double rhs);

  Object doAdd(char lhs, BigInteger rhs);

  Object doAdd(char lhs, BigDecimal rhs);

  Object doAdd(short lhs, byte rhs);

  Object doAdd(short lhs, char rhs);

  Object doAdd(short lhs, short rhs);

  Object doAdd(short lhs, int rhs);

  Object doAdd(short lhs, long rhs);

  Object doAdd(short lhs, float rhs);

  Object doAdd(short lhs, double rhs);

  Object doAdd(short lhs, BigInteger rhs);

  Object doAdd(short lhs, BigDecimal rhs);

  Object doAdd(int lhs, byte rhs);

  Object doAdd(int lhs, char rhs);

  Object doAdd(int lhs, short rhs);

  Object doAdd(int lhs, int rhs);

  Object doAdd(int lhs, long rhs);

  Object doAdd(int lhs, float rhs);

  Object doAdd(int lhs, double rhs);

  Object doAdd(int lhs, BigInteger rhs);

  Object doAdd(int lhs, BigDecimal rhs);

  Object doAdd(long lhs, byte rhs);

  Object doAdd(long lhs, char rhs);

  Object doAdd(long lhs, short rhs);

  Object doAdd(long lhs, int rhs);

  Object doAdd(long lhs, long rhs);

  Object doAdd(long lhs, float rhs);

  Object doAdd(long lhs, double rhs);

  Object doAdd(long lhs, BigInteger rhs);

  Object doAdd(long lhs, BigDecimal rhs);

  Object doAdd(float lhs, byte rhs);

  Object doAdd(float lhs, char rhs);

  Object doAdd(float lhs, short rhs);

  Object doAdd(float lhs, int rhs);

  Object doAdd(float lhs, long rhs);

  Object doAdd(float lhs, float rhs);

  Object doAdd(float lhs, double rhs);

  Object doAdd(float lhs, BigInteger rhs);

  Object doAdd(float lhs, BigDecimal rhs);

  Object doAdd(double lhs, byte rhs);

  Object doAdd(double lhs, char rhs);

  Object doAdd(double lhs, short rhs);

  Object doAdd(double lhs, int rhs);

  Object doAdd(double lhs, long rhs);

  Object doAdd(double lhs, float rhs);

  Object doAdd(double lhs, double rhs);

  Object doAdd(double lhs, BigInteger rhs);

  Object doAdd(double lhs, BigDecimal rhs);

  Object doAdd(BigInteger lhs, byte rhs);

  Object doAdd(BigInteger lhs, char rhs);

  Object doAdd(BigInteger lhs, short rhs);

  Object doAdd(BigInteger lhs, int rhs);

  Object doAdd(BigInteger lhs, long rhs);

  Object doAdd(BigInteger lhs, float rhs);

  Object doAdd(BigInteger lhs, double rhs);

  Object doAdd(BigInteger lhs, BigInteger rhs);

  Object doAdd(BigInteger lhs, BigDecimal rhs);

  Object doAdd(BigDecimal lhs, byte rhs);

  Object doAdd(BigDecimal lhs, char rhs);

  Object doAdd(BigDecimal lhs, short rhs);

  Object doAdd(BigDecimal lhs, int rhs);

  Object doAdd(BigDecimal lhs, long rhs);

  Object doAdd(BigDecimal lhs, float rhs);

  Object doAdd(BigDecimal lhs, double rhs);

  Object doAdd(BigDecimal lhs, BigInteger rhs);

  Object doAdd(BigDecimal lhs, BigDecimal rhs);

  Object doAdd(Object lhs, byte rhs);

  Object doAdd(Object lhs, char rhs);

  Object doAdd(Object lhs, short rhs);

  Object doAdd(Object lhs, int rhs);

  Object doAdd(Object lhs, long rhs);

  Object doAdd(Object lhs, float rhs);

  Object doAdd(Object lhs, double rhs);

  Object doAdd(Object lhs, BigInteger rhs);

  Object doAdd(Object lhs, BigDecimal rhs);

  Object doReverseAdd(byte lhs, Object rhs);

  Object doReverseAdd(char lhs, Object rhs);

  Object doReverseAdd(short lhs, Object rhs);

  Object doReverseAdd(int lhs, Object rhs);

  Object doReverseAdd(long lhs, Object rhs);

  Object doReverseAdd(float lhs, Object rhs);

  Object doReverseAdd(double lhs, Object rhs);

  Object doReverseAdd(BigInteger lhs, Object rhs);

  Object doReverseAdd(BigDecimal lhs, Object rhs);

  //
  //   Internal methods for operator +=
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement +=
  //

  Object doAddEquals(Object lhs, Object rhs);

  Object doReverseAddEquals(Object lhs, Object rhs);

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doAddEquals(byte lhs, byte rhs);

  Object doAddEquals(byte lhs, char rhs);

  Object doAddEquals(byte lhs, short rhs);

  Object doAddEquals(byte lhs, int rhs);

  Object doAddEquals(byte lhs, long rhs);

  Object doAddEquals(byte lhs, float rhs);

  Object doAddEquals(byte lhs, double rhs);

  Object doAddEquals(byte lhs, BigInteger rhs);

  Object doAddEquals(byte lhs, BigDecimal rhs);

  Object doAddEquals(char lhs, byte rhs);

  Object doAddEquals(char lhs, char rhs);

  Object doAddEquals(char lhs, short rhs);

  Object doAddEquals(char lhs, int rhs);

  Object doAddEquals(char lhs, long rhs);

  Object doAddEquals(char lhs, float rhs);

  Object doAddEquals(char lhs, double rhs);

  Object doAddEquals(char lhs, BigInteger rhs);

  Object doAddEquals(char lhs, BigDecimal rhs);

  Object doAddEquals(short lhs, byte rhs);

  Object doAddEquals(short lhs, char rhs);

  Object doAddEquals(short lhs, short rhs);

  Object doAddEquals(short lhs, int rhs);

  Object doAddEquals(short lhs, long rhs);

  Object doAddEquals(short lhs, float rhs);

  Object doAddEquals(short lhs, double rhs);

  Object doAddEquals(short lhs, BigInteger rhs);

  Object doAddEquals(short lhs, BigDecimal rhs);

  Object doAddEquals(int lhs, byte rhs);

  Object doAddEquals(int lhs, char rhs);

  Object doAddEquals(int lhs, short rhs);

  Object doAddEquals(int lhs, int rhs);

  Object doAddEquals(int lhs, long rhs);

  Object doAddEquals(int lhs, float rhs);

  Object doAddEquals(int lhs, double rhs);

  Object doAddEquals(int lhs, BigInteger rhs);

  Object doAddEquals(int lhs, BigDecimal rhs);

  Object doAddEquals(long lhs, byte rhs);

  Object doAddEquals(long lhs, char rhs);

  Object doAddEquals(long lhs, short rhs);

  Object doAddEquals(long lhs, int rhs);

  Object doAddEquals(long lhs, long rhs);

  Object doAddEquals(long lhs, float rhs);

  Object doAddEquals(long lhs, double rhs);

  Object doAddEquals(long lhs, BigInteger rhs);

  Object doAddEquals(long lhs, BigDecimal rhs);

  Object doAddEquals(float lhs, byte rhs);

  Object doAddEquals(float lhs, char rhs);

  Object doAddEquals(float lhs, short rhs);

  Object doAddEquals(float lhs, int rhs);

  Object doAddEquals(float lhs, long rhs);

  Object doAddEquals(float lhs, float rhs);

  Object doAddEquals(float lhs, double rhs);

  Object doAddEquals(float lhs, BigInteger rhs);

  Object doAddEquals(float lhs, BigDecimal rhs);

  Object doAddEquals(double lhs, byte rhs);

  Object doAddEquals(double lhs, char rhs);

  Object doAddEquals(double lhs, short rhs);

  Object doAddEquals(double lhs, int rhs);

  Object doAddEquals(double lhs, long rhs);

  Object doAddEquals(double lhs, float rhs);

  Object doAddEquals(double lhs, double rhs);

  Object doAddEquals(double lhs, BigInteger rhs);

  Object doAddEquals(double lhs, BigDecimal rhs);

  Object doAddEquals(BigInteger lhs, byte rhs);

  Object doAddEquals(BigInteger lhs, char rhs);

  Object doAddEquals(BigInteger lhs, short rhs);

  Object doAddEquals(BigInteger lhs, int rhs);

  Object doAddEquals(BigInteger lhs, long rhs);

  Object doAddEquals(BigInteger lhs, float rhs);

  Object doAddEquals(BigInteger lhs, double rhs);

  Object doAddEquals(BigInteger lhs, BigInteger rhs);

  Object doAddEquals(BigInteger lhs, BigDecimal rhs);

  Object doAddEquals(BigDecimal lhs, byte rhs);

  Object doAddEquals(BigDecimal lhs, char rhs);

  Object doAddEquals(BigDecimal lhs, short rhs);

  Object doAddEquals(BigDecimal lhs, int rhs);

  Object doAddEquals(BigDecimal lhs, long rhs);

  Object doAddEquals(BigDecimal lhs, float rhs);

  Object doAddEquals(BigDecimal lhs, double rhs);

  Object doAddEquals(BigDecimal lhs, BigInteger rhs);

  Object doAddEquals(BigDecimal lhs, BigDecimal rhs);

  Object doAddEquals(Object lhs, byte rhs);

  Object doAddEquals(Object lhs, char rhs);

  Object doAddEquals(Object lhs, short rhs);

  Object doAddEquals(Object lhs, int rhs);

  Object doAddEquals(Object lhs, long rhs);

  Object doAddEquals(Object lhs, float rhs);

  Object doAddEquals(Object lhs, double rhs);

  Object doAddEquals(Object lhs, BigInteger rhs);

  Object doAddEquals(Object lhs, BigDecimal rhs);

  Object doReverseAddEquals(byte lhs, Object rhs);

  Object doReverseAddEquals(char lhs, Object rhs);

  Object doReverseAddEquals(short lhs, Object rhs);

  Object doReverseAddEquals(int lhs, Object rhs);

  Object doReverseAddEquals(long lhs, Object rhs);

  Object doReverseAddEquals(float lhs, Object rhs);

  Object doReverseAddEquals(double lhs, Object rhs);

  Object doReverseAddEquals(BigInteger lhs, Object rhs);

  Object doReverseAddEquals(BigDecimal lhs, Object rhs);

  //
  //   Internal methods for operator -
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement -
  //

  Object doSubtract(Object lhs, Object rhs);

  Object doReverseSubtract(Object lhs, Object rhs);

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doSubtract(byte lhs, byte rhs);

  Object doSubtract(byte lhs, char rhs);

  Object doSubtract(byte lhs, short rhs);

  Object doSubtract(byte lhs, int rhs);

  Object doSubtract(byte lhs, long rhs);

  Object doSubtract(byte lhs, float rhs);

  Object doSubtract(byte lhs, double rhs);

  Object doSubtract(byte lhs, BigInteger rhs);

  Object doSubtract(byte lhs, BigDecimal rhs);

  Object doSubtract(char lhs, byte rhs);

  Object doSubtract(char lhs, char rhs);

  Object doSubtract(char lhs, short rhs);

  Object doSubtract(char lhs, int rhs);

  Object doSubtract(char lhs, long rhs);

  Object doSubtract(char lhs, float rhs);

  Object doSubtract(char lhs, double rhs);

  Object doSubtract(char lhs, BigInteger rhs);

  Object doSubtract(char lhs, BigDecimal rhs);

  Object doSubtract(short lhs, byte rhs);

  Object doSubtract(short lhs, char rhs);

  Object doSubtract(short lhs, short rhs);

  Object doSubtract(short lhs, int rhs);

  Object doSubtract(short lhs, long rhs);

  Object doSubtract(short lhs, float rhs);

  Object doSubtract(short lhs, double rhs);

  Object doSubtract(short lhs, BigInteger rhs);

  Object doSubtract(short lhs, BigDecimal rhs);

  Object doSubtract(int lhs, byte rhs);

  Object doSubtract(int lhs, char rhs);

  Object doSubtract(int lhs, short rhs);

  Object doSubtract(int lhs, int rhs);

  Object doSubtract(int lhs, long rhs);

  Object doSubtract(int lhs, float rhs);

  Object doSubtract(int lhs, double rhs);

  Object doSubtract(int lhs, BigInteger rhs);

  Object doSubtract(int lhs, BigDecimal rhs);

  Object doSubtract(long lhs, byte rhs);

  Object doSubtract(long lhs, char rhs);

  Object doSubtract(long lhs, short rhs);

  Object doSubtract(long lhs, int rhs);

  Object doSubtract(long lhs, long rhs);

  Object doSubtract(long lhs, float rhs);

  Object doSubtract(long lhs, double rhs);

  Object doSubtract(long lhs, BigInteger rhs);

  Object doSubtract(long lhs, BigDecimal rhs);

  Object doSubtract(float lhs, byte rhs);

  Object doSubtract(float lhs, char rhs);

  Object doSubtract(float lhs, short rhs);

  Object doSubtract(float lhs, int rhs);

  Object doSubtract(float lhs, long rhs);

  Object doSubtract(float lhs, float rhs);

  Object doSubtract(float lhs, double rhs);

  Object doSubtract(float lhs, BigInteger rhs);

  Object doSubtract(float lhs, BigDecimal rhs);

  Object doSubtract(double lhs, byte rhs);

  Object doSubtract(double lhs, char rhs);

  Object doSubtract(double lhs, short rhs);

  Object doSubtract(double lhs, int rhs);

  Object doSubtract(double lhs, long rhs);

  Object doSubtract(double lhs, float rhs);

  Object doSubtract(double lhs, double rhs);

  Object doSubtract(double lhs, BigInteger rhs);

  Object doSubtract(double lhs, BigDecimal rhs);

  Object doSubtract(BigInteger lhs, byte rhs);

  Object doSubtract(BigInteger lhs, char rhs);

  Object doSubtract(BigInteger lhs, short rhs);

  Object doSubtract(BigInteger lhs, int rhs);

  Object doSubtract(BigInteger lhs, long rhs);

  Object doSubtract(BigInteger lhs, float rhs);

  Object doSubtract(BigInteger lhs, double rhs);

  Object doSubtract(BigInteger lhs, BigInteger rhs);

  Object doSubtract(BigInteger lhs, BigDecimal rhs);

  Object doSubtract(BigDecimal lhs, byte rhs);

  Object doSubtract(BigDecimal lhs, char rhs);

  Object doSubtract(BigDecimal lhs, short rhs);

  Object doSubtract(BigDecimal lhs, int rhs);

  Object doSubtract(BigDecimal lhs, long rhs);

  Object doSubtract(BigDecimal lhs, float rhs);

  Object doSubtract(BigDecimal lhs, double rhs);

  Object doSubtract(BigDecimal lhs, BigInteger rhs);

  Object doSubtract(BigDecimal lhs, BigDecimal rhs);

  Object doSubtract(Object lhs, byte rhs);

  Object doSubtract(Object lhs, char rhs);

  Object doSubtract(Object lhs, short rhs);

  Object doSubtract(Object lhs, int rhs);

  Object doSubtract(Object lhs, long rhs);

  Object doSubtract(Object lhs, float rhs);

  Object doSubtract(Object lhs, double rhs);

  Object doSubtract(Object lhs, BigInteger rhs);

  Object doSubtract(Object lhs, BigDecimal rhs);

  Object doReverseSubtract(byte lhs, Object rhs);

  Object doReverseSubtract(char lhs, Object rhs);

  Object doReverseSubtract(short lhs, Object rhs);

  Object doReverseSubtract(int lhs, Object rhs);

  Object doReverseSubtract(long lhs, Object rhs);

  Object doReverseSubtract(float lhs, Object rhs);

  Object doReverseSubtract(double lhs, Object rhs);

  Object doReverseSubtract(BigInteger lhs, Object rhs);

  Object doReverseSubtract(BigDecimal lhs, Object rhs);

  //
  //   Internal methods for operator -=
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement -=
  //

  Object doSubtractEquals(Object lhs, Object rhs);

  Object doReverseSubtractEquals(Object lhs, Object rhs);

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doSubtractEquals(byte lhs, byte rhs);

  Object doSubtractEquals(byte lhs, char rhs);

  Object doSubtractEquals(byte lhs, short rhs);

  Object doSubtractEquals(byte lhs, int rhs);

  Object doSubtractEquals(byte lhs, long rhs);

  Object doSubtractEquals(byte lhs, float rhs);

  Object doSubtractEquals(byte lhs, double rhs);

  Object doSubtractEquals(byte lhs, BigInteger rhs);

  Object doSubtractEquals(byte lhs, BigDecimal rhs);

  Object doSubtractEquals(char lhs, byte rhs);

  Object doSubtractEquals(char lhs, char rhs);

  Object doSubtractEquals(char lhs, short rhs);

  Object doSubtractEquals(char lhs, int rhs);

  Object doSubtractEquals(char lhs, long rhs);

  Object doSubtractEquals(char lhs, float rhs);

  Object doSubtractEquals(char lhs, double rhs);

  Object doSubtractEquals(char lhs, BigInteger rhs);

  Object doSubtractEquals(char lhs, BigDecimal rhs);

  Object doSubtractEquals(short lhs, byte rhs);

  Object doSubtractEquals(short lhs, char rhs);

  Object doSubtractEquals(short lhs, short rhs);

  Object doSubtractEquals(short lhs, int rhs);

  Object doSubtractEquals(short lhs, long rhs);

  Object doSubtractEquals(short lhs, float rhs);

  Object doSubtractEquals(short lhs, double rhs);

  Object doSubtractEquals(short lhs, BigInteger rhs);

  Object doSubtractEquals(short lhs, BigDecimal rhs);

  Object doSubtractEquals(int lhs, byte rhs);

  Object doSubtractEquals(int lhs, char rhs);

  Object doSubtractEquals(int lhs, short rhs);

  Object doSubtractEquals(int lhs, int rhs);

  Object doSubtractEquals(int lhs, long rhs);

  Object doSubtractEquals(int lhs, float rhs);

  Object doSubtractEquals(int lhs, double rhs);

  Object doSubtractEquals(int lhs, BigInteger rhs);

  Object doSubtractEquals(int lhs, BigDecimal rhs);

  Object doSubtractEquals(long lhs, byte rhs);

  Object doSubtractEquals(long lhs, char rhs);

  Object doSubtractEquals(long lhs, short rhs);

  Object doSubtractEquals(long lhs, int rhs);

  Object doSubtractEquals(long lhs, long rhs);

  Object doSubtractEquals(long lhs, float rhs);

  Object doSubtractEquals(long lhs, double rhs);

  Object doSubtractEquals(long lhs, BigInteger rhs);

  Object doSubtractEquals(long lhs, BigDecimal rhs);

  Object doSubtractEquals(float lhs, byte rhs);

  Object doSubtractEquals(float lhs, char rhs);

  Object doSubtractEquals(float lhs, short rhs);

  Object doSubtractEquals(float lhs, int rhs);

  Object doSubtractEquals(float lhs, long rhs);

  Object doSubtractEquals(float lhs, float rhs);

  Object doSubtractEquals(float lhs, double rhs);

  Object doSubtractEquals(float lhs, BigInteger rhs);

  Object doSubtractEquals(float lhs, BigDecimal rhs);

  Object doSubtractEquals(double lhs, byte rhs);

  Object doSubtractEquals(double lhs, char rhs);

  Object doSubtractEquals(double lhs, short rhs);

  Object doSubtractEquals(double lhs, int rhs);

  Object doSubtractEquals(double lhs, long rhs);

  Object doSubtractEquals(double lhs, float rhs);

  Object doSubtractEquals(double lhs, double rhs);

  Object doSubtractEquals(double lhs, BigInteger rhs);

  Object doSubtractEquals(double lhs, BigDecimal rhs);

  Object doSubtractEquals(BigInteger lhs, byte rhs);

  Object doSubtractEquals(BigInteger lhs, char rhs);

  Object doSubtractEquals(BigInteger lhs, short rhs);

  Object doSubtractEquals(BigInteger lhs, int rhs);

  Object doSubtractEquals(BigInteger lhs, long rhs);

  Object doSubtractEquals(BigInteger lhs, float rhs);

  Object doSubtractEquals(BigInteger lhs, double rhs);

  Object doSubtractEquals(BigInteger lhs, BigInteger rhs);

  Object doSubtractEquals(BigInteger lhs, BigDecimal rhs);

  Object doSubtractEquals(BigDecimal lhs, byte rhs);

  Object doSubtractEquals(BigDecimal lhs, char rhs);

  Object doSubtractEquals(BigDecimal lhs, short rhs);

  Object doSubtractEquals(BigDecimal lhs, int rhs);

  Object doSubtractEquals(BigDecimal lhs, long rhs);

  Object doSubtractEquals(BigDecimal lhs, float rhs);

  Object doSubtractEquals(BigDecimal lhs, double rhs);

  Object doSubtractEquals(BigDecimal lhs, BigInteger rhs);

  Object doSubtractEquals(BigDecimal lhs, BigDecimal rhs);

  Object doSubtractEquals(Object lhs, byte rhs);

  Object doSubtractEquals(Object lhs, char rhs);

  Object doSubtractEquals(Object lhs, short rhs);

  Object doSubtractEquals(Object lhs, int rhs);

  Object doSubtractEquals(Object lhs, long rhs);

  Object doSubtractEquals(Object lhs, float rhs);

  Object doSubtractEquals(Object lhs, double rhs);

  Object doSubtractEquals(Object lhs, BigInteger rhs);

  Object doSubtractEquals(Object lhs, BigDecimal rhs);

  Object doReverseSubtractEquals(byte lhs, Object rhs);

  Object doReverseSubtractEquals(char lhs, Object rhs);

  Object doReverseSubtractEquals(short lhs, Object rhs);

  Object doReverseSubtractEquals(int lhs, Object rhs);

  Object doReverseSubtractEquals(long lhs, Object rhs);

  Object doReverseSubtractEquals(float lhs, Object rhs);

  Object doReverseSubtractEquals(double lhs, Object rhs);

  Object doReverseSubtractEquals(BigInteger lhs, Object rhs);

  Object doReverseSubtractEquals(BigDecimal lhs, Object rhs);

  //
  //   Internal methods for operator *
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement *
  //

  Object doMultiply(Object lhs, Object rhs);

  Object doReverseMultiply(Object lhs, Object rhs);

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doMultiply(byte lhs, byte rhs);

  Object doMultiply(byte lhs, char rhs);

  Object doMultiply(byte lhs, short rhs);

  Object doMultiply(byte lhs, int rhs);

  Object doMultiply(byte lhs, long rhs);

  Object doMultiply(byte lhs, float rhs);

  Object doMultiply(byte lhs, double rhs);

  Object doMultiply(byte lhs, BigInteger rhs);

  Object doMultiply(byte lhs, BigDecimal rhs);

  Object doMultiply(char lhs, byte rhs);

  Object doMultiply(char lhs, char rhs);

  Object doMultiply(char lhs, short rhs);

  Object doMultiply(char lhs, int rhs);

  Object doMultiply(char lhs, long rhs);

  Object doMultiply(char lhs, float rhs);

  Object doMultiply(char lhs, double rhs);

  Object doMultiply(char lhs, BigInteger rhs);

  Object doMultiply(char lhs, BigDecimal rhs);

  Object doMultiply(short lhs, byte rhs);

  Object doMultiply(short lhs, char rhs);

  Object doMultiply(short lhs, short rhs);

  Object doMultiply(short lhs, int rhs);

  Object doMultiply(short lhs, long rhs);

  Object doMultiply(short lhs, float rhs);

  Object doMultiply(short lhs, double rhs);

  Object doMultiply(short lhs, BigInteger rhs);

  Object doMultiply(short lhs, BigDecimal rhs);

  Object doMultiply(int lhs, byte rhs);

  Object doMultiply(int lhs, char rhs);

  Object doMultiply(int lhs, short rhs);

  Object doMultiply(int lhs, int rhs);

  Object doMultiply(int lhs, long rhs);

  Object doMultiply(int lhs, float rhs);

  Object doMultiply(int lhs, double rhs);

  Object doMultiply(int lhs, BigInteger rhs);

  Object doMultiply(int lhs, BigDecimal rhs);

  Object doMultiply(long lhs, byte rhs);

  Object doMultiply(long lhs, char rhs);

  Object doMultiply(long lhs, short rhs);

  Object doMultiply(long lhs, int rhs);

  Object doMultiply(long lhs, long rhs);

  Object doMultiply(long lhs, float rhs);

  Object doMultiply(long lhs, double rhs);

  Object doMultiply(long lhs, BigInteger rhs);

  Object doMultiply(long lhs, BigDecimal rhs);

  Object doMultiply(float lhs, byte rhs);

  Object doMultiply(float lhs, char rhs);

  Object doMultiply(float lhs, short rhs);

  Object doMultiply(float lhs, int rhs);

  Object doMultiply(float lhs, long rhs);

  Object doMultiply(float lhs, float rhs);

  Object doMultiply(float lhs, double rhs);

  Object doMultiply(float lhs, BigInteger rhs);

  Object doMultiply(float lhs, BigDecimal rhs);

  Object doMultiply(double lhs, byte rhs);

  Object doMultiply(double lhs, char rhs);

  Object doMultiply(double lhs, short rhs);

  Object doMultiply(double lhs, int rhs);

  Object doMultiply(double lhs, long rhs);

  Object doMultiply(double lhs, float rhs);

  Object doMultiply(double lhs, double rhs);

  Object doMultiply(double lhs, BigInteger rhs);

  Object doMultiply(double lhs, BigDecimal rhs);

  Object doMultiply(BigInteger lhs, byte rhs);

  Object doMultiply(BigInteger lhs, char rhs);

  Object doMultiply(BigInteger lhs, short rhs);

  Object doMultiply(BigInteger lhs, int rhs);

  Object doMultiply(BigInteger lhs, long rhs);

  Object doMultiply(BigInteger lhs, float rhs);

  Object doMultiply(BigInteger lhs, double rhs);

  Object doMultiply(BigInteger lhs, BigInteger rhs);

  Object doMultiply(BigInteger lhs, BigDecimal rhs);

  Object doMultiply(BigDecimal lhs, byte rhs);

  Object doMultiply(BigDecimal lhs, char rhs);

  Object doMultiply(BigDecimal lhs, short rhs);

  Object doMultiply(BigDecimal lhs, int rhs);

  Object doMultiply(BigDecimal lhs, long rhs);

  Object doMultiply(BigDecimal lhs, float rhs);

  Object doMultiply(BigDecimal lhs, double rhs);

  Object doMultiply(BigDecimal lhs, BigInteger rhs);

  Object doMultiply(BigDecimal lhs, BigDecimal rhs);

  Object doMultiply(Object lhs, byte rhs);

  Object doMultiply(Object lhs, char rhs);

  Object doMultiply(Object lhs, short rhs);

  Object doMultiply(Object lhs, int rhs);

  Object doMultiply(Object lhs, long rhs);

  Object doMultiply(Object lhs, float rhs);

  Object doMultiply(Object lhs, double rhs);

  Object doMultiply(Object lhs, BigInteger rhs);

  Object doMultiply(Object lhs, BigDecimal rhs);

  Object doReverseMultiply(byte lhs, Object rhs);

  Object doReverseMultiply(char lhs, Object rhs);

  Object doReverseMultiply(short lhs, Object rhs);

  Object doReverseMultiply(int lhs, Object rhs);

  Object doReverseMultiply(long lhs, Object rhs);

  Object doReverseMultiply(float lhs, Object rhs);

  Object doReverseMultiply(double lhs, Object rhs);

  Object doReverseMultiply(BigInteger lhs, Object rhs);

  Object doReverseMultiply(BigDecimal lhs, Object rhs);

  //
  //   Internal methods for operator *=
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement *=
  //

  Object doMultiplyEquals(Object lhs, Object rhs);

  Object doReverseMultiplyEquals(Object lhs, Object rhs);

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doMultiplyEquals(byte lhs, byte rhs);

  Object doMultiplyEquals(byte lhs, char rhs);

  Object doMultiplyEquals(byte lhs, short rhs);

  Object doMultiplyEquals(byte lhs, int rhs);

  Object doMultiplyEquals(byte lhs, long rhs);

  Object doMultiplyEquals(byte lhs, float rhs);

  Object doMultiplyEquals(byte lhs, double rhs);

  Object doMultiplyEquals(byte lhs, BigInteger rhs);

  Object doMultiplyEquals(byte lhs, BigDecimal rhs);

  Object doMultiplyEquals(char lhs, byte rhs);

  Object doMultiplyEquals(char lhs, char rhs);

  Object doMultiplyEquals(char lhs, short rhs);

  Object doMultiplyEquals(char lhs, int rhs);

  Object doMultiplyEquals(char lhs, long rhs);

  Object doMultiplyEquals(char lhs, float rhs);

  Object doMultiplyEquals(char lhs, double rhs);

  Object doMultiplyEquals(char lhs, BigInteger rhs);

  Object doMultiplyEquals(char lhs, BigDecimal rhs);

  Object doMultiplyEquals(short lhs, byte rhs);

  Object doMultiplyEquals(short lhs, char rhs);

  Object doMultiplyEquals(short lhs, short rhs);

  Object doMultiplyEquals(short lhs, int rhs);

  Object doMultiplyEquals(short lhs, long rhs);

  Object doMultiplyEquals(short lhs, float rhs);

  Object doMultiplyEquals(short lhs, double rhs);

  Object doMultiplyEquals(short lhs, BigInteger rhs);

  Object doMultiplyEquals(short lhs, BigDecimal rhs);

  Object doMultiplyEquals(int lhs, byte rhs);

  Object doMultiplyEquals(int lhs, char rhs);

  Object doMultiplyEquals(int lhs, short rhs);

  Object doMultiplyEquals(int lhs, int rhs);

  Object doMultiplyEquals(int lhs, long rhs);

  Object doMultiplyEquals(int lhs, float rhs);

  Object doMultiplyEquals(int lhs, double rhs);

  Object doMultiplyEquals(int lhs, BigInteger rhs);

  Object doMultiplyEquals(int lhs, BigDecimal rhs);

  Object doMultiplyEquals(long lhs, byte rhs);

  Object doMultiplyEquals(long lhs, char rhs);

  Object doMultiplyEquals(long lhs, short rhs);

  Object doMultiplyEquals(long lhs, int rhs);

  Object doMultiplyEquals(long lhs, long rhs);

  Object doMultiplyEquals(long lhs, float rhs);

  Object doMultiplyEquals(long lhs, double rhs);

  Object doMultiplyEquals(long lhs, BigInteger rhs);

  Object doMultiplyEquals(long lhs, BigDecimal rhs);

  Object doMultiplyEquals(float lhs, byte rhs);

  Object doMultiplyEquals(float lhs, char rhs);

  Object doMultiplyEquals(float lhs, short rhs);

  Object doMultiplyEquals(float lhs, int rhs);

  Object doMultiplyEquals(float lhs, long rhs);

  Object doMultiplyEquals(float lhs, float rhs);

  Object doMultiplyEquals(float lhs, double rhs);

  Object doMultiplyEquals(float lhs, BigInteger rhs);

  Object doMultiplyEquals(float lhs, BigDecimal rhs);

  Object doMultiplyEquals(double lhs, byte rhs);

  Object doMultiplyEquals(double lhs, char rhs);

  Object doMultiplyEquals(double lhs, short rhs);

  Object doMultiplyEquals(double lhs, int rhs);

  Object doMultiplyEquals(double lhs, long rhs);

  Object doMultiplyEquals(double lhs, float rhs);

  Object doMultiplyEquals(double lhs, double rhs);

  Object doMultiplyEquals(double lhs, BigInteger rhs);

  Object doMultiplyEquals(double lhs, BigDecimal rhs);

  Object doMultiplyEquals(BigInteger lhs, byte rhs);

  Object doMultiplyEquals(BigInteger lhs, char rhs);

  Object doMultiplyEquals(BigInteger lhs, short rhs);

  Object doMultiplyEquals(BigInteger lhs, int rhs);

  Object doMultiplyEquals(BigInteger lhs, long rhs);

  Object doMultiplyEquals(BigInteger lhs, float rhs);

  Object doMultiplyEquals(BigInteger lhs, double rhs);

  Object doMultiplyEquals(BigInteger lhs, BigInteger rhs);

  Object doMultiplyEquals(BigInteger lhs, BigDecimal rhs);

  Object doMultiplyEquals(BigDecimal lhs, byte rhs);

  Object doMultiplyEquals(BigDecimal lhs, char rhs);

  Object doMultiplyEquals(BigDecimal lhs, short rhs);

  Object doMultiplyEquals(BigDecimal lhs, int rhs);

  Object doMultiplyEquals(BigDecimal lhs, long rhs);

  Object doMultiplyEquals(BigDecimal lhs, float rhs);

  Object doMultiplyEquals(BigDecimal lhs, double rhs);

  Object doMultiplyEquals(BigDecimal lhs, BigInteger rhs);

  Object doMultiplyEquals(BigDecimal lhs, BigDecimal rhs);

  Object doMultiplyEquals(Object lhs, byte rhs);

  Object doMultiplyEquals(Object lhs, char rhs);

  Object doMultiplyEquals(Object lhs, short rhs);

  Object doMultiplyEquals(Object lhs, int rhs);

  Object doMultiplyEquals(Object lhs, long rhs);

  Object doMultiplyEquals(Object lhs, float rhs);

  Object doMultiplyEquals(Object lhs, double rhs);

  Object doMultiplyEquals(Object lhs, BigInteger rhs);

  Object doMultiplyEquals(Object lhs, BigDecimal rhs);

  Object doReverseMultiplyEquals(byte lhs, Object rhs);

  Object doReverseMultiplyEquals(char lhs, Object rhs);

  Object doReverseMultiplyEquals(short lhs, Object rhs);

  Object doReverseMultiplyEquals(int lhs, Object rhs);

  Object doReverseMultiplyEquals(long lhs, Object rhs);

  Object doReverseMultiplyEquals(float lhs, Object rhs);

  Object doReverseMultiplyEquals(double lhs, Object rhs);

  Object doReverseMultiplyEquals(BigInteger lhs, Object rhs);

  Object doReverseMultiplyEquals(BigDecimal lhs, Object rhs);

  //
  //   Internal methods for operator /
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement /
  //

  Object doDivide(Object lhs, Object rhs);

  Object doReverseDivide(Object lhs, Object rhs);

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doDivide(byte lhs, byte rhs);

  Object doDivide(byte lhs, char rhs);

  Object doDivide(byte lhs, short rhs);

  Object doDivide(byte lhs, int rhs);

  Object doDivide(byte lhs, long rhs);

  Object doDivide(byte lhs, float rhs);

  Object doDivide(byte lhs, double rhs);

  Object doDivide(byte lhs, BigInteger rhs);

  Object doDivide(byte lhs, BigDecimal rhs);

  Object doDivide(char lhs, byte rhs);

  Object doDivide(char lhs, char rhs);

  Object doDivide(char lhs, short rhs);

  Object doDivide(char lhs, int rhs);

  Object doDivide(char lhs, long rhs);

  Object doDivide(char lhs, float rhs);

  Object doDivide(char lhs, double rhs);

  Object doDivide(char lhs, BigInteger rhs);

  Object doDivide(char lhs, BigDecimal rhs);

  Object doDivide(short lhs, byte rhs);

  Object doDivide(short lhs, char rhs);

  Object doDivide(short lhs, short rhs);

  Object doDivide(short lhs, int rhs);

  Object doDivide(short lhs, long rhs);

  Object doDivide(short lhs, float rhs);

  Object doDivide(short lhs, double rhs);

  Object doDivide(short lhs, BigInteger rhs);

  Object doDivide(short lhs, BigDecimal rhs);

  Object doDivide(int lhs, byte rhs);

  Object doDivide(int lhs, char rhs);

  Object doDivide(int lhs, short rhs);

  Object doDivide(int lhs, int rhs);

  Object doDivide(int lhs, long rhs);

  Object doDivide(int lhs, float rhs);

  Object doDivide(int lhs, double rhs);

  Object doDivide(int lhs, BigInteger rhs);

  Object doDivide(int lhs, BigDecimal rhs);

  Object doDivide(long lhs, byte rhs);

  Object doDivide(long lhs, char rhs);

  Object doDivide(long lhs, short rhs);

  Object doDivide(long lhs, int rhs);

  Object doDivide(long lhs, long rhs);

  Object doDivide(long lhs, float rhs);

  Object doDivide(long lhs, double rhs);

  Object doDivide(long lhs, BigInteger rhs);

  Object doDivide(long lhs, BigDecimal rhs);

  Object doDivide(float lhs, byte rhs);

  Object doDivide(float lhs, char rhs);

  Object doDivide(float lhs, short rhs);

  Object doDivide(float lhs, int rhs);

  Object doDivide(float lhs, long rhs);

  Object doDivide(float lhs, float rhs);

  Object doDivide(float lhs, double rhs);

  Object doDivide(float lhs, BigInteger rhs);

  Object doDivide(float lhs, BigDecimal rhs);

  Object doDivide(double lhs, byte rhs);

  Object doDivide(double lhs, char rhs);

  Object doDivide(double lhs, short rhs);

  Object doDivide(double lhs, int rhs);

  Object doDivide(double lhs, long rhs);

  Object doDivide(double lhs, float rhs);

  Object doDivide(double lhs, double rhs);

  Object doDivide(double lhs, BigInteger rhs);

  Object doDivide(double lhs, BigDecimal rhs);

  Object doDivide(BigInteger lhs, byte rhs);

  Object doDivide(BigInteger lhs, char rhs);

  Object doDivide(BigInteger lhs, short rhs);

  Object doDivide(BigInteger lhs, int rhs);

  Object doDivide(BigInteger lhs, long rhs);

  Object doDivide(BigInteger lhs, float rhs);

  Object doDivide(BigInteger lhs, double rhs);

  Object doDivide(BigInteger lhs, BigInteger rhs);

  Object doDivide(BigInteger lhs, BigDecimal rhs);

  Object doDivide(BigDecimal lhs, byte rhs);

  Object doDivide(BigDecimal lhs, char rhs);

  Object doDivide(BigDecimal lhs, short rhs);

  Object doDivide(BigDecimal lhs, int rhs);

  Object doDivide(BigDecimal lhs, long rhs);

  Object doDivide(BigDecimal lhs, float rhs);

  Object doDivide(BigDecimal lhs, double rhs);

  Object doDivide(BigDecimal lhs, BigInteger rhs);

  Object doDivide(BigDecimal lhs, BigDecimal rhs);

  Object doDivide(Object lhs, byte rhs);

  Object doDivide(Object lhs, char rhs);

  Object doDivide(Object lhs, short rhs);

  Object doDivide(Object lhs, int rhs);

  Object doDivide(Object lhs, long rhs);

  Object doDivide(Object lhs, float rhs);

  Object doDivide(Object lhs, double rhs);

  Object doDivide(Object lhs, BigInteger rhs);

  Object doDivide(Object lhs, BigDecimal rhs);

  Object doReverseDivide(byte lhs, Object rhs);

  Object doReverseDivide(char lhs, Object rhs);

  Object doReverseDivide(short lhs, Object rhs);

  Object doReverseDivide(int lhs, Object rhs);

  Object doReverseDivide(long lhs, Object rhs);

  Object doReverseDivide(float lhs, Object rhs);

  Object doReverseDivide(double lhs, Object rhs);

  Object doReverseDivide(BigInteger lhs, Object rhs);

  Object doReverseDivide(BigDecimal lhs, Object rhs);

  //
  //   Internal methods for operator /=
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement /=
  //

  Object doDivideEquals(Object lhs, Object rhs);

  Object doReverseDivideEquals(Object lhs, Object rhs);

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doDivideEquals(byte lhs, byte rhs);

  Object doDivideEquals(byte lhs, char rhs);

  Object doDivideEquals(byte lhs, short rhs);

  Object doDivideEquals(byte lhs, int rhs);

  Object doDivideEquals(byte lhs, long rhs);

  Object doDivideEquals(byte lhs, float rhs);

  Object doDivideEquals(byte lhs, double rhs);

  Object doDivideEquals(byte lhs, BigInteger rhs);

  Object doDivideEquals(byte lhs, BigDecimal rhs);

  Object doDivideEquals(char lhs, byte rhs);

  Object doDivideEquals(char lhs, char rhs);

  Object doDivideEquals(char lhs, short rhs);

  Object doDivideEquals(char lhs, int rhs);

  Object doDivideEquals(char lhs, long rhs);

  Object doDivideEquals(char lhs, float rhs);

  Object doDivideEquals(char lhs, double rhs);

  Object doDivideEquals(char lhs, BigInteger rhs);

  Object doDivideEquals(char lhs, BigDecimal rhs);

  Object doDivideEquals(short lhs, byte rhs);

  Object doDivideEquals(short lhs, char rhs);

  Object doDivideEquals(short lhs, short rhs);

  Object doDivideEquals(short lhs, int rhs);

  Object doDivideEquals(short lhs, long rhs);

  Object doDivideEquals(short lhs, float rhs);

  Object doDivideEquals(short lhs, double rhs);

  Object doDivideEquals(short lhs, BigInteger rhs);

  Object doDivideEquals(short lhs, BigDecimal rhs);

  Object doDivideEquals(int lhs, byte rhs);

  Object doDivideEquals(int lhs, char rhs);

  Object doDivideEquals(int lhs, short rhs);

  Object doDivideEquals(int lhs, int rhs);

  Object doDivideEquals(int lhs, long rhs);

  Object doDivideEquals(int lhs, float rhs);

  Object doDivideEquals(int lhs, double rhs);

  Object doDivideEquals(int lhs, BigInteger rhs);

  Object doDivideEquals(int lhs, BigDecimal rhs);

  Object doDivideEquals(long lhs, byte rhs);

  Object doDivideEquals(long lhs, char rhs);

  Object doDivideEquals(long lhs, short rhs);

  Object doDivideEquals(long lhs, int rhs);

  Object doDivideEquals(long lhs, long rhs);

  Object doDivideEquals(long lhs, float rhs);

  Object doDivideEquals(long lhs, double rhs);

  Object doDivideEquals(long lhs, BigInteger rhs);

  Object doDivideEquals(long lhs, BigDecimal rhs);

  Object doDivideEquals(float lhs, byte rhs);

  Object doDivideEquals(float lhs, char rhs);

  Object doDivideEquals(float lhs, short rhs);

  Object doDivideEquals(float lhs, int rhs);

  Object doDivideEquals(float lhs, long rhs);

  Object doDivideEquals(float lhs, float rhs);

  Object doDivideEquals(float lhs, double rhs);

  Object doDivideEquals(float lhs, BigInteger rhs);

  Object doDivideEquals(float lhs, BigDecimal rhs);

  Object doDivideEquals(double lhs, byte rhs);

  Object doDivideEquals(double lhs, char rhs);

  Object doDivideEquals(double lhs, short rhs);

  Object doDivideEquals(double lhs, int rhs);

  Object doDivideEquals(double lhs, long rhs);

  Object doDivideEquals(double lhs, float rhs);

  Object doDivideEquals(double lhs, double rhs);

  Object doDivideEquals(double lhs, BigInteger rhs);

  Object doDivideEquals(double lhs, BigDecimal rhs);

  Object doDivideEquals(BigInteger lhs, byte rhs);

  Object doDivideEquals(BigInteger lhs, char rhs);

  Object doDivideEquals(BigInteger lhs, short rhs);

  Object doDivideEquals(BigInteger lhs, int rhs);

  Object doDivideEquals(BigInteger lhs, long rhs);

  Object doDivideEquals(BigInteger lhs, float rhs);

  Object doDivideEquals(BigInteger lhs, double rhs);

  Object doDivideEquals(BigInteger lhs, BigInteger rhs);

  Object doDivideEquals(BigInteger lhs, BigDecimal rhs);

  Object doDivideEquals(BigDecimal lhs, byte rhs);

  Object doDivideEquals(BigDecimal lhs, char rhs);

  Object doDivideEquals(BigDecimal lhs, short rhs);

  Object doDivideEquals(BigDecimal lhs, int rhs);

  Object doDivideEquals(BigDecimal lhs, long rhs);

  Object doDivideEquals(BigDecimal lhs, float rhs);

  Object doDivideEquals(BigDecimal lhs, double rhs);

  Object doDivideEquals(BigDecimal lhs, BigInteger rhs);

  Object doDivideEquals(BigDecimal lhs, BigDecimal rhs);

  Object doDivideEquals(Object lhs, byte rhs);

  Object doDivideEquals(Object lhs, char rhs);

  Object doDivideEquals(Object lhs, short rhs);

  Object doDivideEquals(Object lhs, int rhs);

  Object doDivideEquals(Object lhs, long rhs);

  Object doDivideEquals(Object lhs, float rhs);

  Object doDivideEquals(Object lhs, double rhs);

  Object doDivideEquals(Object lhs, BigInteger rhs);

  Object doDivideEquals(Object lhs, BigDecimal rhs);

  Object doReverseDivideEquals(byte lhs, Object rhs);

  Object doReverseDivideEquals(char lhs, Object rhs);

  Object doReverseDivideEquals(short lhs, Object rhs);

  Object doReverseDivideEquals(int lhs, Object rhs);

  Object doReverseDivideEquals(long lhs, Object rhs);

  Object doReverseDivideEquals(float lhs, Object rhs);

  Object doReverseDivideEquals(double lhs, Object rhs);

  Object doReverseDivideEquals(BigInteger lhs, Object rhs);

  Object doReverseDivideEquals(BigDecimal lhs, Object rhs);

  //
  //   Internal methods for operator %
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement %
  //

  Object doRemainder(Object lhs, Object rhs);

  Object doReverseRemainder(Object lhs, Object rhs);

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doRemainder(byte lhs, byte rhs);

  Object doRemainder(byte lhs, char rhs);

  Object doRemainder(byte lhs, short rhs);

  Object doRemainder(byte lhs, int rhs);

  Object doRemainder(byte lhs, long rhs);

  Object doRemainder(byte lhs, BigInteger rhs);

  Object doRemainder(char lhs, byte rhs);

  Object doRemainder(char lhs, char rhs);

  Object doRemainder(char lhs, short rhs);

  Object doRemainder(char lhs, int rhs);

  Object doRemainder(char lhs, long rhs);

  Object doRemainder(char lhs, BigInteger rhs);

  Object doRemainder(short lhs, byte rhs);

  Object doRemainder(short lhs, char rhs);

  Object doRemainder(short lhs, short rhs);

  Object doRemainder(short lhs, int rhs);

  Object doRemainder(short lhs, long rhs);

  Object doRemainder(short lhs, BigInteger rhs);

  Object doRemainder(int lhs, byte rhs);

  Object doRemainder(int lhs, char rhs);

  Object doRemainder(int lhs, short rhs);

  Object doRemainder(int lhs, int rhs);

  Object doRemainder(int lhs, long rhs);

  Object doRemainder(int lhs, BigInteger rhs);

  Object doRemainder(long lhs, byte rhs);

  Object doRemainder(long lhs, char rhs);

  Object doRemainder(long lhs, short rhs);

  Object doRemainder(long lhs, int rhs);

  Object doRemainder(long lhs, long rhs);

  Object doRemainder(long lhs, BigInteger rhs);

  Object doRemainder(BigInteger lhs, byte rhs);

  Object doRemainder(BigInteger lhs, char rhs);

  Object doRemainder(BigInteger lhs, short rhs);

  Object doRemainder(BigInteger lhs, int rhs);

  Object doRemainder(BigInteger lhs, long rhs);

  Object doRemainder(BigInteger lhs, BigInteger rhs);

  Object doRemainder(Object lhs, byte rhs);

  Object doRemainder(Object lhs, char rhs);

  Object doRemainder(Object lhs, short rhs);

  Object doRemainder(Object lhs, int rhs);

  Object doRemainder(Object lhs, long rhs);

  Object doRemainder(Object lhs, BigInteger rhs);

  Object doReverseRemainder(byte lhs, Object rhs);

  Object doReverseRemainder(char lhs, Object rhs);

  Object doReverseRemainder(short lhs, Object rhs);

  Object doReverseRemainder(int lhs, Object rhs);

  Object doReverseRemainder(long lhs, Object rhs);

  Object doReverseRemainder(BigInteger lhs, Object rhs);

  //
  //   Internal methods for operator %=
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement %=
  //

  Object doRemainderEquals(Object lhs, Object rhs);

  Object doReverseRemainderEquals(Object lhs, Object rhs);

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doRemainderEquals(byte lhs, byte rhs);

  Object doRemainderEquals(byte lhs, char rhs);

  Object doRemainderEquals(byte lhs, short rhs);

  Object doRemainderEquals(byte lhs, int rhs);

  Object doRemainderEquals(byte lhs, long rhs);

  Object doRemainderEquals(byte lhs, BigInteger rhs);

  Object doRemainderEquals(char lhs, byte rhs);

  Object doRemainderEquals(char lhs, char rhs);

  Object doRemainderEquals(char lhs, short rhs);

  Object doRemainderEquals(char lhs, int rhs);

  Object doRemainderEquals(char lhs, long rhs);

  Object doRemainderEquals(char lhs, BigInteger rhs);

  Object doRemainderEquals(short lhs, byte rhs);

  Object doRemainderEquals(short lhs, char rhs);

  Object doRemainderEquals(short lhs, short rhs);

  Object doRemainderEquals(short lhs, int rhs);

  Object doRemainderEquals(short lhs, long rhs);

  Object doRemainderEquals(short lhs, BigInteger rhs);

  Object doRemainderEquals(int lhs, byte rhs);

  Object doRemainderEquals(int lhs, char rhs);

  Object doRemainderEquals(int lhs, short rhs);

  Object doRemainderEquals(int lhs, int rhs);

  Object doRemainderEquals(int lhs, long rhs);

  Object doRemainderEquals(int lhs, BigInteger rhs);

  Object doRemainderEquals(long lhs, byte rhs);

  Object doRemainderEquals(long lhs, char rhs);

  Object doRemainderEquals(long lhs, short rhs);

  Object doRemainderEquals(long lhs, int rhs);

  Object doRemainderEquals(long lhs, long rhs);

  Object doRemainderEquals(long lhs, BigInteger rhs);

  Object doRemainderEquals(BigInteger lhs, byte rhs);

  Object doRemainderEquals(BigInteger lhs, char rhs);

  Object doRemainderEquals(BigInteger lhs, short rhs);

  Object doRemainderEquals(BigInteger lhs, int rhs);

  Object doRemainderEquals(BigInteger lhs, long rhs);

  Object doRemainderEquals(BigInteger lhs, BigInteger rhs);

  Object doRemainderEquals(Object lhs, byte rhs);

  Object doRemainderEquals(Object lhs, char rhs);

  Object doRemainderEquals(Object lhs, short rhs);

  Object doRemainderEquals(Object lhs, int rhs);

  Object doRemainderEquals(Object lhs, long rhs);

  Object doRemainderEquals(Object lhs, BigInteger rhs);

  Object doReverseRemainderEquals(byte lhs, Object rhs);

  Object doReverseRemainderEquals(char lhs, Object rhs);

  Object doReverseRemainderEquals(short lhs, Object rhs);

  Object doReverseRemainderEquals(int lhs, Object rhs);

  Object doReverseRemainderEquals(long lhs, Object rhs);

  Object doReverseRemainderEquals(BigInteger lhs, Object rhs);

  //
  //   Internal methods for operator ÷
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement ÷
  //

  Object doIntegerDivide(Object lhs, Object rhs);

  Object doReverseIntegerDivide(Object lhs, Object rhs);

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doIntegerDivide(byte lhs, byte rhs);

  Object doIntegerDivide(byte lhs, char rhs);

  Object doIntegerDivide(byte lhs, short rhs);

  Object doIntegerDivide(byte lhs, int rhs);

  Object doIntegerDivide(byte lhs, long rhs);

  Object doIntegerDivide(byte lhs, float rhs);

  Object doIntegerDivide(byte lhs, double rhs);

  Object doIntegerDivide(byte lhs, BigInteger rhs);

  Object doIntegerDivide(byte lhs, BigDecimal rhs);

  Object doIntegerDivide(char lhs, byte rhs);

  Object doIntegerDivide(char lhs, char rhs);

  Object doIntegerDivide(char lhs, short rhs);

  Object doIntegerDivide(char lhs, int rhs);

  Object doIntegerDivide(char lhs, long rhs);

  Object doIntegerDivide(char lhs, float rhs);

  Object doIntegerDivide(char lhs, double rhs);

  Object doIntegerDivide(char lhs, BigInteger rhs);

  Object doIntegerDivide(char lhs, BigDecimal rhs);

  Object doIntegerDivide(short lhs, byte rhs);

  Object doIntegerDivide(short lhs, char rhs);

  Object doIntegerDivide(short lhs, short rhs);

  Object doIntegerDivide(short lhs, int rhs);

  Object doIntegerDivide(short lhs, long rhs);

  Object doIntegerDivide(short lhs, float rhs);

  Object doIntegerDivide(short lhs, double rhs);

  Object doIntegerDivide(short lhs, BigInteger rhs);

  Object doIntegerDivide(short lhs, BigDecimal rhs);

  Object doIntegerDivide(int lhs, byte rhs);

  Object doIntegerDivide(int lhs, char rhs);

  Object doIntegerDivide(int lhs, short rhs);

  Object doIntegerDivide(int lhs, int rhs);

  Object doIntegerDivide(int lhs, long rhs);

  Object doIntegerDivide(int lhs, float rhs);

  Object doIntegerDivide(int lhs, double rhs);

  Object doIntegerDivide(int lhs, BigInteger rhs);

  Object doIntegerDivide(int lhs, BigDecimal rhs);

  Object doIntegerDivide(long lhs, byte rhs);

  Object doIntegerDivide(long lhs, char rhs);

  Object doIntegerDivide(long lhs, short rhs);

  Object doIntegerDivide(long lhs, int rhs);

  Object doIntegerDivide(long lhs, long rhs);

  Object doIntegerDivide(long lhs, float rhs);

  Object doIntegerDivide(long lhs, double rhs);

  Object doIntegerDivide(long lhs, BigInteger rhs);

  Object doIntegerDivide(long lhs, BigDecimal rhs);

  Object doIntegerDivide(float lhs, byte rhs);

  Object doIntegerDivide(float lhs, char rhs);

  Object doIntegerDivide(float lhs, short rhs);

  Object doIntegerDivide(float lhs, int rhs);

  Object doIntegerDivide(float lhs, long rhs);

  Object doIntegerDivide(float lhs, float rhs);

  Object doIntegerDivide(float lhs, double rhs);

  Object doIntegerDivide(float lhs, BigInteger rhs);

  Object doIntegerDivide(float lhs, BigDecimal rhs);

  Object doIntegerDivide(double lhs, byte rhs);

  Object doIntegerDivide(double lhs, char rhs);

  Object doIntegerDivide(double lhs, short rhs);

  Object doIntegerDivide(double lhs, int rhs);

  Object doIntegerDivide(double lhs, long rhs);

  Object doIntegerDivide(double lhs, float rhs);

  Object doIntegerDivide(double lhs, double rhs);

  Object doIntegerDivide(double lhs, BigInteger rhs);

  Object doIntegerDivide(double lhs, BigDecimal rhs);

  Object doIntegerDivide(BigInteger lhs, byte rhs);

  Object doIntegerDivide(BigInteger lhs, char rhs);

  Object doIntegerDivide(BigInteger lhs, short rhs);

  Object doIntegerDivide(BigInteger lhs, int rhs);

  Object doIntegerDivide(BigInteger lhs, long rhs);

  Object doIntegerDivide(BigInteger lhs, float rhs);

  Object doIntegerDivide(BigInteger lhs, double rhs);

  Object doIntegerDivide(BigInteger lhs, BigInteger rhs);

  Object doIntegerDivide(BigInteger lhs, BigDecimal rhs);

  Object doIntegerDivide(BigDecimal lhs, byte rhs);

  Object doIntegerDivide(BigDecimal lhs, char rhs);

  Object doIntegerDivide(BigDecimal lhs, short rhs);

  Object doIntegerDivide(BigDecimal lhs, int rhs);

  Object doIntegerDivide(BigDecimal lhs, long rhs);

  Object doIntegerDivide(BigDecimal lhs, float rhs);

  Object doIntegerDivide(BigDecimal lhs, double rhs);

  Object doIntegerDivide(BigDecimal lhs, BigInteger rhs);

  Object doIntegerDivide(BigDecimal lhs, BigDecimal rhs);

  Object doIntegerDivide(Object lhs, byte rhs);

  Object doIntegerDivide(Object lhs, char rhs);

  Object doIntegerDivide(Object lhs, short rhs);

  Object doIntegerDivide(Object lhs, int rhs);

  Object doIntegerDivide(Object lhs, long rhs);

  Object doIntegerDivide(Object lhs, float rhs);

  Object doIntegerDivide(Object lhs, double rhs);

  Object doIntegerDivide(Object lhs, BigInteger rhs);

  Object doIntegerDivide(Object lhs, BigDecimal rhs);

  Object doReverseIntegerDivide(byte lhs, Object rhs);

  Object doReverseIntegerDivide(char lhs, Object rhs);

  Object doReverseIntegerDivide(short lhs, Object rhs);

  Object doReverseIntegerDivide(int lhs, Object rhs);

  Object doReverseIntegerDivide(long lhs, Object rhs);

  Object doReverseIntegerDivide(float lhs, Object rhs);

  Object doReverseIntegerDivide(double lhs, Object rhs);

  Object doReverseIntegerDivide(BigInteger lhs, Object rhs);

  Object doReverseIntegerDivide(BigDecimal lhs, Object rhs);

  //
  //   Internal methods for operator ÷=
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement ÷=
  //

  Object doIntegerDivideEquals(Object lhs, Object rhs);

  Object doReverseIntegerDivideEquals(Object lhs, Object rhs);

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doIntegerDivideEquals(byte lhs, byte rhs);

  Object doIntegerDivideEquals(byte lhs, char rhs);

  Object doIntegerDivideEquals(byte lhs, short rhs);

  Object doIntegerDivideEquals(byte lhs, int rhs);

  Object doIntegerDivideEquals(byte lhs, long rhs);

  Object doIntegerDivideEquals(byte lhs, float rhs);

  Object doIntegerDivideEquals(byte lhs, double rhs);

  Object doIntegerDivideEquals(byte lhs, BigInteger rhs);

  Object doIntegerDivideEquals(byte lhs, BigDecimal rhs);

  Object doIntegerDivideEquals(char lhs, byte rhs);

  Object doIntegerDivideEquals(char lhs, char rhs);

  Object doIntegerDivideEquals(char lhs, short rhs);

  Object doIntegerDivideEquals(char lhs, int rhs);

  Object doIntegerDivideEquals(char lhs, long rhs);

  Object doIntegerDivideEquals(char lhs, float rhs);

  Object doIntegerDivideEquals(char lhs, double rhs);

  Object doIntegerDivideEquals(char lhs, BigInteger rhs);

  Object doIntegerDivideEquals(char lhs, BigDecimal rhs);

  Object doIntegerDivideEquals(short lhs, byte rhs);

  Object doIntegerDivideEquals(short lhs, char rhs);

  Object doIntegerDivideEquals(short lhs, short rhs);

  Object doIntegerDivideEquals(short lhs, int rhs);

  Object doIntegerDivideEquals(short lhs, long rhs);

  Object doIntegerDivideEquals(short lhs, float rhs);

  Object doIntegerDivideEquals(short lhs, double rhs);

  Object doIntegerDivideEquals(short lhs, BigInteger rhs);

  Object doIntegerDivideEquals(short lhs, BigDecimal rhs);

  Object doIntegerDivideEquals(int lhs, byte rhs);

  Object doIntegerDivideEquals(int lhs, char rhs);

  Object doIntegerDivideEquals(int lhs, short rhs);

  Object doIntegerDivideEquals(int lhs, int rhs);

  Object doIntegerDivideEquals(int lhs, long rhs);

  Object doIntegerDivideEquals(int lhs, float rhs);

  Object doIntegerDivideEquals(int lhs, double rhs);

  Object doIntegerDivideEquals(int lhs, BigInteger rhs);

  Object doIntegerDivideEquals(int lhs, BigDecimal rhs);

  Object doIntegerDivideEquals(long lhs, byte rhs);

  Object doIntegerDivideEquals(long lhs, char rhs);

  Object doIntegerDivideEquals(long lhs, short rhs);

  Object doIntegerDivideEquals(long lhs, int rhs);

  Object doIntegerDivideEquals(long lhs, long rhs);

  Object doIntegerDivideEquals(long lhs, float rhs);

  Object doIntegerDivideEquals(long lhs, double rhs);

  Object doIntegerDivideEquals(long lhs, BigInteger rhs);

  Object doIntegerDivideEquals(long lhs, BigDecimal rhs);

  Object doIntegerDivideEquals(float lhs, byte rhs);

  Object doIntegerDivideEquals(float lhs, char rhs);

  Object doIntegerDivideEquals(float lhs, short rhs);

  Object doIntegerDivideEquals(float lhs, int rhs);

  Object doIntegerDivideEquals(float lhs, long rhs);

  Object doIntegerDivideEquals(float lhs, float rhs);

  Object doIntegerDivideEquals(float lhs, double rhs);

  Object doIntegerDivideEquals(float lhs, BigInteger rhs);

  Object doIntegerDivideEquals(float lhs, BigDecimal rhs);

  Object doIntegerDivideEquals(double lhs, byte rhs);

  Object doIntegerDivideEquals(double lhs, char rhs);

  Object doIntegerDivideEquals(double lhs, short rhs);

  Object doIntegerDivideEquals(double lhs, int rhs);

  Object doIntegerDivideEquals(double lhs, long rhs);

  Object doIntegerDivideEquals(double lhs, float rhs);

  Object doIntegerDivideEquals(double lhs, double rhs);

  Object doIntegerDivideEquals(double lhs, BigInteger rhs);

  Object doIntegerDivideEquals(double lhs, BigDecimal rhs);

  Object doIntegerDivideEquals(BigInteger lhs, byte rhs);

  Object doIntegerDivideEquals(BigInteger lhs, char rhs);

  Object doIntegerDivideEquals(BigInteger lhs, short rhs);

  Object doIntegerDivideEquals(BigInteger lhs, int rhs);

  Object doIntegerDivideEquals(BigInteger lhs, long rhs);

  Object doIntegerDivideEquals(BigInteger lhs, float rhs);

  Object doIntegerDivideEquals(BigInteger lhs, double rhs);

  Object doIntegerDivideEquals(BigInteger lhs, BigInteger rhs);

  Object doIntegerDivideEquals(BigInteger lhs, BigDecimal rhs);

  Object doIntegerDivideEquals(BigDecimal lhs, byte rhs);

  Object doIntegerDivideEquals(BigDecimal lhs, char rhs);

  Object doIntegerDivideEquals(BigDecimal lhs, short rhs);

  Object doIntegerDivideEquals(BigDecimal lhs, int rhs);

  Object doIntegerDivideEquals(BigDecimal lhs, long rhs);

  Object doIntegerDivideEquals(BigDecimal lhs, float rhs);

  Object doIntegerDivideEquals(BigDecimal lhs, double rhs);

  Object doIntegerDivideEquals(BigDecimal lhs, BigInteger rhs);

  Object doIntegerDivideEquals(BigDecimal lhs, BigDecimal rhs);

  Object doIntegerDivideEquals(Object lhs, byte rhs);

  Object doIntegerDivideEquals(Object lhs, char rhs);

  Object doIntegerDivideEquals(Object lhs, short rhs);

  Object doIntegerDivideEquals(Object lhs, int rhs);

  Object doIntegerDivideEquals(Object lhs, long rhs);

  Object doIntegerDivideEquals(Object lhs, float rhs);

  Object doIntegerDivideEquals(Object lhs, double rhs);

  Object doIntegerDivideEquals(Object lhs, BigInteger rhs);

  Object doIntegerDivideEquals(Object lhs, BigDecimal rhs);

  Object doReverseIntegerDivideEquals(byte lhs, Object rhs);

  Object doReverseIntegerDivideEquals(char lhs, Object rhs);

  Object doReverseIntegerDivideEquals(short lhs, Object rhs);

  Object doReverseIntegerDivideEquals(int lhs, Object rhs);

  Object doReverseIntegerDivideEquals(long lhs, Object rhs);

  Object doReverseIntegerDivideEquals(float lhs, Object rhs);

  Object doReverseIntegerDivideEquals(double lhs, Object rhs);

  Object doReverseIntegerDivideEquals(BigInteger lhs, Object rhs);

  Object doReverseIntegerDivideEquals(BigDecimal lhs, Object rhs);

  //
  //   Internal methods for operator &
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement &
  //

  Object doAnd(Object lhs, Object rhs);

  Object doReverseAnd(Object lhs, Object rhs);

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doAnd(byte lhs, byte rhs);

  Object doAnd(byte lhs, char rhs);

  Object doAnd(byte lhs, short rhs);

  Object doAnd(byte lhs, int rhs);

  Object doAnd(byte lhs, long rhs);

  Object doAnd(byte lhs, BigInteger rhs);

  Object doAnd(char lhs, byte rhs);

  Object doAnd(char lhs, char rhs);

  Object doAnd(char lhs, short rhs);

  Object doAnd(char lhs, int rhs);

  Object doAnd(char lhs, long rhs);

  Object doAnd(char lhs, BigInteger rhs);

  Object doAnd(short lhs, byte rhs);

  Object doAnd(short lhs, char rhs);

  Object doAnd(short lhs, short rhs);

  Object doAnd(short lhs, int rhs);

  Object doAnd(short lhs, long rhs);

  Object doAnd(short lhs, BigInteger rhs);

  Object doAnd(int lhs, byte rhs);

  Object doAnd(int lhs, char rhs);

  Object doAnd(int lhs, short rhs);

  Object doAnd(int lhs, int rhs);

  Object doAnd(int lhs, long rhs);

  Object doAnd(int lhs, BigInteger rhs);

  Object doAnd(long lhs, byte rhs);

  Object doAnd(long lhs, char rhs);

  Object doAnd(long lhs, short rhs);

  Object doAnd(long lhs, int rhs);

  Object doAnd(long lhs, long rhs);

  Object doAnd(long lhs, BigInteger rhs);

  Object doAnd(BigInteger lhs, byte rhs);

  Object doAnd(BigInteger lhs, char rhs);

  Object doAnd(BigInteger lhs, short rhs);

  Object doAnd(BigInteger lhs, int rhs);

  Object doAnd(BigInteger lhs, long rhs);

  Object doAnd(BigInteger lhs, BigInteger rhs);

  Object doAnd(Object lhs, byte rhs);

  Object doAnd(Object lhs, char rhs);

  Object doAnd(Object lhs, short rhs);

  Object doAnd(Object lhs, int rhs);

  Object doAnd(Object lhs, long rhs);

  Object doAnd(Object lhs, BigInteger rhs);

  Object doReverseAnd(byte lhs, Object rhs);

  Object doReverseAnd(char lhs, Object rhs);

  Object doReverseAnd(short lhs, Object rhs);

  Object doReverseAnd(int lhs, Object rhs);

  Object doReverseAnd(long lhs, Object rhs);

  Object doReverseAnd(BigInteger lhs, Object rhs);

  //
  //   Internal methods for operator &=
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement &=
  //

  Object doAndEquals(Object lhs, Object rhs);

  Object doReverseAndEquals(Object lhs, Object rhs);

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doAndEquals(byte lhs, byte rhs);

  Object doAndEquals(byte lhs, char rhs);

  Object doAndEquals(byte lhs, short rhs);

  Object doAndEquals(byte lhs, int rhs);

  Object doAndEquals(byte lhs, long rhs);

  Object doAndEquals(byte lhs, BigInteger rhs);

  Object doAndEquals(char lhs, byte rhs);

  Object doAndEquals(char lhs, char rhs);

  Object doAndEquals(char lhs, short rhs);

  Object doAndEquals(char lhs, int rhs);

  Object doAndEquals(char lhs, long rhs);

  Object doAndEquals(char lhs, BigInteger rhs);

  Object doAndEquals(short lhs, byte rhs);

  Object doAndEquals(short lhs, char rhs);

  Object doAndEquals(short lhs, short rhs);

  Object doAndEquals(short lhs, int rhs);

  Object doAndEquals(short lhs, long rhs);

  Object doAndEquals(short lhs, BigInteger rhs);

  Object doAndEquals(int lhs, byte rhs);

  Object doAndEquals(int lhs, char rhs);

  Object doAndEquals(int lhs, short rhs);

  Object doAndEquals(int lhs, int rhs);

  Object doAndEquals(int lhs, long rhs);

  Object doAndEquals(int lhs, BigInteger rhs);

  Object doAndEquals(long lhs, byte rhs);

  Object doAndEquals(long lhs, char rhs);

  Object doAndEquals(long lhs, short rhs);

  Object doAndEquals(long lhs, int rhs);

  Object doAndEquals(long lhs, long rhs);

  Object doAndEquals(long lhs, BigInteger rhs);

  Object doAndEquals(BigInteger lhs, byte rhs);

  Object doAndEquals(BigInteger lhs, char rhs);

  Object doAndEquals(BigInteger lhs, short rhs);

  Object doAndEquals(BigInteger lhs, int rhs);

  Object doAndEquals(BigInteger lhs, long rhs);

  Object doAndEquals(BigInteger lhs, BigInteger rhs);

  Object doAndEquals(Object lhs, byte rhs);

  Object doAndEquals(Object lhs, char rhs);

  Object doAndEquals(Object lhs, short rhs);

  Object doAndEquals(Object lhs, int rhs);

  Object doAndEquals(Object lhs, long rhs);

  Object doAndEquals(Object lhs, BigInteger rhs);

  Object doReverseAndEquals(byte lhs, Object rhs);

  Object doReverseAndEquals(char lhs, Object rhs);

  Object doReverseAndEquals(short lhs, Object rhs);

  Object doReverseAndEquals(int lhs, Object rhs);

  Object doReverseAndEquals(long lhs, Object rhs);

  Object doReverseAndEquals(BigInteger lhs, Object rhs);

  //
  //   Internal methods for operator |
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement |
  //

  Object doOr(Object lhs, Object rhs);

  Object doReverseOr(Object lhs, Object rhs);

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doOr(byte lhs, byte rhs);

  Object doOr(byte lhs, char rhs);

  Object doOr(byte lhs, short rhs);

  Object doOr(byte lhs, int rhs);

  Object doOr(byte lhs, long rhs);

  Object doOr(byte lhs, BigInteger rhs);

  Object doOr(char lhs, byte rhs);

  Object doOr(char lhs, char rhs);

  Object doOr(char lhs, short rhs);

  Object doOr(char lhs, int rhs);

  Object doOr(char lhs, long rhs);

  Object doOr(char lhs, BigInteger rhs);

  Object doOr(short lhs, byte rhs);

  Object doOr(short lhs, char rhs);

  Object doOr(short lhs, short rhs);

  Object doOr(short lhs, int rhs);

  Object doOr(short lhs, long rhs);

  Object doOr(short lhs, BigInteger rhs);

  Object doOr(int lhs, byte rhs);

  Object doOr(int lhs, char rhs);

  Object doOr(int lhs, short rhs);

  Object doOr(int lhs, int rhs);

  Object doOr(int lhs, long rhs);

  Object doOr(int lhs, BigInteger rhs);

  Object doOr(long lhs, byte rhs);

  Object doOr(long lhs, char rhs);

  Object doOr(long lhs, short rhs);

  Object doOr(long lhs, int rhs);

  Object doOr(long lhs, long rhs);

  Object doOr(long lhs, BigInteger rhs);

  Object doOr(BigInteger lhs, byte rhs);

  Object doOr(BigInteger lhs, char rhs);

  Object doOr(BigInteger lhs, short rhs);

  Object doOr(BigInteger lhs, int rhs);

  Object doOr(BigInteger lhs, long rhs);

  Object doOr(BigInteger lhs, BigInteger rhs);

  Object doOr(Object lhs, byte rhs);

  Object doOr(Object lhs, char rhs);

  Object doOr(Object lhs, short rhs);

  Object doOr(Object lhs, int rhs);

  Object doOr(Object lhs, long rhs);

  Object doOr(Object lhs, BigInteger rhs);

  Object doReverseOr(byte lhs, Object rhs);

  Object doReverseOr(char lhs, Object rhs);

  Object doReverseOr(short lhs, Object rhs);

  Object doReverseOr(int lhs, Object rhs);

  Object doReverseOr(long lhs, Object rhs);

  Object doReverseOr(BigInteger lhs, Object rhs);

  //
  //   Internal methods for operator |=
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement |=
  //

  Object doOrEquals(Object lhs, Object rhs);

  Object doReverseOrEquals(Object lhs, Object rhs);

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doOrEquals(byte lhs, byte rhs);

  Object doOrEquals(byte lhs, char rhs);

  Object doOrEquals(byte lhs, short rhs);

  Object doOrEquals(byte lhs, int rhs);

  Object doOrEquals(byte lhs, long rhs);

  Object doOrEquals(byte lhs, BigInteger rhs);

  Object doOrEquals(char lhs, byte rhs);

  Object doOrEquals(char lhs, char rhs);

  Object doOrEquals(char lhs, short rhs);

  Object doOrEquals(char lhs, int rhs);

  Object doOrEquals(char lhs, long rhs);

  Object doOrEquals(char lhs, BigInteger rhs);

  Object doOrEquals(short lhs, byte rhs);

  Object doOrEquals(short lhs, char rhs);

  Object doOrEquals(short lhs, short rhs);

  Object doOrEquals(short lhs, int rhs);

  Object doOrEquals(short lhs, long rhs);

  Object doOrEquals(short lhs, BigInteger rhs);

  Object doOrEquals(int lhs, byte rhs);

  Object doOrEquals(int lhs, char rhs);

  Object doOrEquals(int lhs, short rhs);

  Object doOrEquals(int lhs, int rhs);

  Object doOrEquals(int lhs, long rhs);

  Object doOrEquals(int lhs, BigInteger rhs);

  Object doOrEquals(long lhs, byte rhs);

  Object doOrEquals(long lhs, char rhs);

  Object doOrEquals(long lhs, short rhs);

  Object doOrEquals(long lhs, int rhs);

  Object doOrEquals(long lhs, long rhs);

  Object doOrEquals(long lhs, BigInteger rhs);

  Object doOrEquals(BigInteger lhs, byte rhs);

  Object doOrEquals(BigInteger lhs, char rhs);

  Object doOrEquals(BigInteger lhs, short rhs);

  Object doOrEquals(BigInteger lhs, int rhs);

  Object doOrEquals(BigInteger lhs, long rhs);

  Object doOrEquals(BigInteger lhs, BigInteger rhs);

  Object doOrEquals(Object lhs, byte rhs);

  Object doOrEquals(Object lhs, char rhs);

  Object doOrEquals(Object lhs, short rhs);

  Object doOrEquals(Object lhs, int rhs);

  Object doOrEquals(Object lhs, long rhs);

  Object doOrEquals(Object lhs, BigInteger rhs);

  Object doReverseOrEquals(byte lhs, Object rhs);

  Object doReverseOrEquals(char lhs, Object rhs);

  Object doReverseOrEquals(short lhs, Object rhs);

  Object doReverseOrEquals(int lhs, Object rhs);

  Object doReverseOrEquals(long lhs, Object rhs);

  Object doReverseOrEquals(BigInteger lhs, Object rhs);

  //
  //   Internal methods for operator ^
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement ^
  //

  Object doXor(Object lhs, Object rhs);

  Object doReverseXor(Object lhs, Object rhs);

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doXor(byte lhs, byte rhs);

  Object doXor(byte lhs, char rhs);

  Object doXor(byte lhs, short rhs);

  Object doXor(byte lhs, int rhs);

  Object doXor(byte lhs, long rhs);

  Object doXor(byte lhs, BigInteger rhs);

  Object doXor(char lhs, byte rhs);

  Object doXor(char lhs, char rhs);

  Object doXor(char lhs, short rhs);

  Object doXor(char lhs, int rhs);

  Object doXor(char lhs, long rhs);

  Object doXor(char lhs, BigInteger rhs);

  Object doXor(short lhs, byte rhs);

  Object doXor(short lhs, char rhs);

  Object doXor(short lhs, short rhs);

  Object doXor(short lhs, int rhs);

  Object doXor(short lhs, long rhs);

  Object doXor(short lhs, BigInteger rhs);

  Object doXor(int lhs, byte rhs);

  Object doXor(int lhs, char rhs);

  Object doXor(int lhs, short rhs);

  Object doXor(int lhs, int rhs);

  Object doXor(int lhs, long rhs);

  Object doXor(int lhs, BigInteger rhs);

  Object doXor(long lhs, byte rhs);

  Object doXor(long lhs, char rhs);

  Object doXor(long lhs, short rhs);

  Object doXor(long lhs, int rhs);

  Object doXor(long lhs, long rhs);

  Object doXor(long lhs, BigInteger rhs);

  Object doXor(BigInteger lhs, byte rhs);

  Object doXor(BigInteger lhs, char rhs);

  Object doXor(BigInteger lhs, short rhs);

  Object doXor(BigInteger lhs, int rhs);

  Object doXor(BigInteger lhs, long rhs);

  Object doXor(BigInteger lhs, BigInteger rhs);

  Object doXor(Object lhs, byte rhs);

  Object doXor(Object lhs, char rhs);

  Object doXor(Object lhs, short rhs);

  Object doXor(Object lhs, int rhs);

  Object doXor(Object lhs, long rhs);

  Object doXor(Object lhs, BigInteger rhs);

  Object doReverseXor(byte lhs, Object rhs);

  Object doReverseXor(char lhs, Object rhs);

  Object doReverseXor(short lhs, Object rhs);

  Object doReverseXor(int lhs, Object rhs);

  Object doReverseXor(long lhs, Object rhs);

  Object doReverseXor(BigInteger lhs, Object rhs);

  //
  //   Internal methods for operator ^=
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement ^=
  //

  Object doXorEquals(Object lhs, Object rhs);

  Object doReverseXorEquals(Object lhs, Object rhs);

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doXorEquals(byte lhs, byte rhs);

  Object doXorEquals(byte lhs, char rhs);

  Object doXorEquals(byte lhs, short rhs);

  Object doXorEquals(byte lhs, int rhs);

  Object doXorEquals(byte lhs, long rhs);

  Object doXorEquals(byte lhs, BigInteger rhs);

  Object doXorEquals(char lhs, byte rhs);

  Object doXorEquals(char lhs, char rhs);

  Object doXorEquals(char lhs, short rhs);

  Object doXorEquals(char lhs, int rhs);

  Object doXorEquals(char lhs, long rhs);

  Object doXorEquals(char lhs, BigInteger rhs);

  Object doXorEquals(short lhs, byte rhs);

  Object doXorEquals(short lhs, char rhs);

  Object doXorEquals(short lhs, short rhs);

  Object doXorEquals(short lhs, int rhs);

  Object doXorEquals(short lhs, long rhs);

  Object doXorEquals(short lhs, BigInteger rhs);

  Object doXorEquals(int lhs, byte rhs);

  Object doXorEquals(int lhs, char rhs);

  Object doXorEquals(int lhs, short rhs);

  Object doXorEquals(int lhs, int rhs);

  Object doXorEquals(int lhs, long rhs);

  Object doXorEquals(int lhs, BigInteger rhs);

  Object doXorEquals(long lhs, byte rhs);

  Object doXorEquals(long lhs, char rhs);

  Object doXorEquals(long lhs, short rhs);

  Object doXorEquals(long lhs, int rhs);

  Object doXorEquals(long lhs, long rhs);

  Object doXorEquals(long lhs, BigInteger rhs);

  Object doXorEquals(BigInteger lhs, byte rhs);

  Object doXorEquals(BigInteger lhs, char rhs);

  Object doXorEquals(BigInteger lhs, short rhs);

  Object doXorEquals(BigInteger lhs, int rhs);

  Object doXorEquals(BigInteger lhs, long rhs);

  Object doXorEquals(BigInteger lhs, BigInteger rhs);

  Object doXorEquals(Object lhs, byte rhs);

  Object doXorEquals(Object lhs, char rhs);

  Object doXorEquals(Object lhs, short rhs);

  Object doXorEquals(Object lhs, int rhs);

  Object doXorEquals(Object lhs, long rhs);

  Object doXorEquals(Object lhs, BigInteger rhs);

  Object doReverseXorEquals(byte lhs, Object rhs);

  Object doReverseXorEquals(char lhs, Object rhs);

  Object doReverseXorEquals(short lhs, Object rhs);

  Object doReverseXorEquals(int lhs, Object rhs);

  Object doReverseXorEquals(long lhs, Object rhs);

  Object doReverseXorEquals(BigInteger lhs, Object rhs);

  //
  //   Internal methods for operator <<
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement <<
  //

  Object doLeftShift(Object lhs, Object rhs);

  Object doReverseLeftShift(Object lhs, Object rhs);

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doLeftShift(byte lhs, byte rhs);

  Object doLeftShift(byte lhs, char rhs);

  Object doLeftShift(byte lhs, short rhs);

  Object doLeftShift(byte lhs, int rhs);

  Object doLeftShift(byte lhs, long rhs);

  Object doLeftShift(byte lhs, BigInteger rhs);

  Object doLeftShift(char lhs, byte rhs);

  Object doLeftShift(char lhs, char rhs);

  Object doLeftShift(char lhs, short rhs);

  Object doLeftShift(char lhs, int rhs);

  Object doLeftShift(char lhs, long rhs);

  Object doLeftShift(char lhs, BigInteger rhs);

  Object doLeftShift(short lhs, byte rhs);

  Object doLeftShift(short lhs, char rhs);

  Object doLeftShift(short lhs, short rhs);

  Object doLeftShift(short lhs, int rhs);

  Object doLeftShift(short lhs, long rhs);

  Object doLeftShift(short lhs, BigInteger rhs);

  Object doLeftShift(int lhs, byte rhs);

  Object doLeftShift(int lhs, char rhs);

  Object doLeftShift(int lhs, short rhs);

  Object doLeftShift(int lhs, int rhs);

  Object doLeftShift(int lhs, long rhs);

  Object doLeftShift(int lhs, BigInteger rhs);

  Object doLeftShift(long lhs, byte rhs);

  Object doLeftShift(long lhs, char rhs);

  Object doLeftShift(long lhs, short rhs);

  Object doLeftShift(long lhs, int rhs);

  Object doLeftShift(long lhs, long rhs);

  Object doLeftShift(long lhs, BigInteger rhs);

  Object doLeftShift(BigInteger lhs, byte rhs);

  Object doLeftShift(BigInteger lhs, char rhs);

  Object doLeftShift(BigInteger lhs, short rhs);

  Object doLeftShift(BigInteger lhs, int rhs);

  Object doLeftShift(BigInteger lhs, long rhs);

  Object doLeftShift(BigInteger lhs, BigInteger rhs);

  Object doLeftShift(Object lhs, byte rhs);

  Object doLeftShift(Object lhs, char rhs);

  Object doLeftShift(Object lhs, short rhs);

  Object doLeftShift(Object lhs, int rhs);

  Object doLeftShift(Object lhs, long rhs);

  Object doLeftShift(Object lhs, BigInteger rhs);

  Object doReverseLeftShift(byte lhs, Object rhs);

  Object doReverseLeftShift(char lhs, Object rhs);

  Object doReverseLeftShift(short lhs, Object rhs);

  Object doReverseLeftShift(int lhs, Object rhs);

  Object doReverseLeftShift(long lhs, Object rhs);

  Object doReverseLeftShift(BigInteger lhs, Object rhs);

  //
  //   Internal methods for operator <<=
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement <<=
  //

  Object doLeftShiftEquals(Object lhs, Object rhs);

  Object doReverseLeftShiftEquals(Object lhs, Object rhs);

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doLeftShiftEquals(byte lhs, byte rhs);

  Object doLeftShiftEquals(byte lhs, char rhs);

  Object doLeftShiftEquals(byte lhs, short rhs);

  Object doLeftShiftEquals(byte lhs, int rhs);

  Object doLeftShiftEquals(byte lhs, long rhs);

  Object doLeftShiftEquals(byte lhs, BigInteger rhs);

  Object doLeftShiftEquals(char lhs, byte rhs);

  Object doLeftShiftEquals(char lhs, char rhs);

  Object doLeftShiftEquals(char lhs, short rhs);

  Object doLeftShiftEquals(char lhs, int rhs);

  Object doLeftShiftEquals(char lhs, long rhs);

  Object doLeftShiftEquals(char lhs, BigInteger rhs);

  Object doLeftShiftEquals(short lhs, byte rhs);

  Object doLeftShiftEquals(short lhs, char rhs);

  Object doLeftShiftEquals(short lhs, short rhs);

  Object doLeftShiftEquals(short lhs, int rhs);

  Object doLeftShiftEquals(short lhs, long rhs);

  Object doLeftShiftEquals(short lhs, BigInteger rhs);

  Object doLeftShiftEquals(int lhs, byte rhs);

  Object doLeftShiftEquals(int lhs, char rhs);

  Object doLeftShiftEquals(int lhs, short rhs);

  Object doLeftShiftEquals(int lhs, int rhs);

  Object doLeftShiftEquals(int lhs, long rhs);

  Object doLeftShiftEquals(int lhs, BigInteger rhs);

  Object doLeftShiftEquals(long lhs, byte rhs);

  Object doLeftShiftEquals(long lhs, char rhs);

  Object doLeftShiftEquals(long lhs, short rhs);

  Object doLeftShiftEquals(long lhs, int rhs);

  Object doLeftShiftEquals(long lhs, long rhs);

  Object doLeftShiftEquals(long lhs, BigInteger rhs);

  Object doLeftShiftEquals(BigInteger lhs, byte rhs);

  Object doLeftShiftEquals(BigInteger lhs, char rhs);

  Object doLeftShiftEquals(BigInteger lhs, short rhs);

  Object doLeftShiftEquals(BigInteger lhs, int rhs);

  Object doLeftShiftEquals(BigInteger lhs, long rhs);

  Object doLeftShiftEquals(BigInteger lhs, BigInteger rhs);

  Object doLeftShiftEquals(Object lhs, byte rhs);

  Object doLeftShiftEquals(Object lhs, char rhs);

  Object doLeftShiftEquals(Object lhs, short rhs);

  Object doLeftShiftEquals(Object lhs, int rhs);

  Object doLeftShiftEquals(Object lhs, long rhs);

  Object doLeftShiftEquals(Object lhs, BigInteger rhs);

  Object doReverseLeftShiftEquals(byte lhs, Object rhs);

  Object doReverseLeftShiftEquals(char lhs, Object rhs);

  Object doReverseLeftShiftEquals(short lhs, Object rhs);

  Object doReverseLeftShiftEquals(int lhs, Object rhs);

  Object doReverseLeftShiftEquals(long lhs, Object rhs);

  Object doReverseLeftShiftEquals(BigInteger lhs, Object rhs);

  //
  //   Internal methods for operator >>
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement >>
  //

  Object doArithmeticRightShift(Object lhs, Object rhs);

  Object doReverseArithmeticRightShift(Object lhs, Object rhs);

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doArithmeticRightShift(byte lhs, byte rhs);

  Object doArithmeticRightShift(byte lhs, char rhs);

  Object doArithmeticRightShift(byte lhs, short rhs);

  Object doArithmeticRightShift(byte lhs, int rhs);

  Object doArithmeticRightShift(byte lhs, long rhs);

  Object doArithmeticRightShift(byte lhs, BigInteger rhs);

  Object doArithmeticRightShift(char lhs, byte rhs);

  Object doArithmeticRightShift(char lhs, char rhs);

  Object doArithmeticRightShift(char lhs, short rhs);

  Object doArithmeticRightShift(char lhs, int rhs);

  Object doArithmeticRightShift(char lhs, long rhs);

  Object doArithmeticRightShift(char lhs, BigInteger rhs);

  Object doArithmeticRightShift(short lhs, byte rhs);

  Object doArithmeticRightShift(short lhs, char rhs);

  Object doArithmeticRightShift(short lhs, short rhs);

  Object doArithmeticRightShift(short lhs, int rhs);

  Object doArithmeticRightShift(short lhs, long rhs);

  Object doArithmeticRightShift(short lhs, BigInteger rhs);

  Object doArithmeticRightShift(int lhs, byte rhs);

  Object doArithmeticRightShift(int lhs, char rhs);

  Object doArithmeticRightShift(int lhs, short rhs);

  Object doArithmeticRightShift(int lhs, int rhs);

  Object doArithmeticRightShift(int lhs, long rhs);

  Object doArithmeticRightShift(int lhs, BigInteger rhs);

  Object doArithmeticRightShift(long lhs, byte rhs);

  Object doArithmeticRightShift(long lhs, char rhs);

  Object doArithmeticRightShift(long lhs, short rhs);

  Object doArithmeticRightShift(long lhs, int rhs);

  Object doArithmeticRightShift(long lhs, long rhs);

  Object doArithmeticRightShift(long lhs, BigInteger rhs);

  Object doArithmeticRightShift(BigInteger lhs, byte rhs);

  Object doArithmeticRightShift(BigInteger lhs, char rhs);

  Object doArithmeticRightShift(BigInteger lhs, short rhs);

  Object doArithmeticRightShift(BigInteger lhs, int rhs);

  Object doArithmeticRightShift(BigInteger lhs, long rhs);

  Object doArithmeticRightShift(BigInteger lhs, BigInteger rhs);

  Object doArithmeticRightShift(Object lhs, byte rhs);

  Object doArithmeticRightShift(Object lhs, char rhs);

  Object doArithmeticRightShift(Object lhs, short rhs);

  Object doArithmeticRightShift(Object lhs, int rhs);

  Object doArithmeticRightShift(Object lhs, long rhs);

  Object doArithmeticRightShift(Object lhs, BigInteger rhs);

  Object doReverseArithmeticRightShift(byte lhs, Object rhs);

  Object doReverseArithmeticRightShift(char lhs, Object rhs);

  Object doReverseArithmeticRightShift(short lhs, Object rhs);

  Object doReverseArithmeticRightShift(int lhs, Object rhs);

  Object doReverseArithmeticRightShift(long lhs, Object rhs);

  Object doReverseArithmeticRightShift(BigInteger lhs, Object rhs);

  //
  //   Internal methods for operator >>=
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement >>=
  //

  Object doArithmeticRightShiftEquals(Object lhs, Object rhs);

  Object doReverseArithmeticRightShiftEquals(Object lhs, Object rhs);

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doArithmeticRightShiftEquals(byte lhs, byte rhs);

  Object doArithmeticRightShiftEquals(byte lhs, char rhs);

  Object doArithmeticRightShiftEquals(byte lhs, short rhs);

  Object doArithmeticRightShiftEquals(byte lhs, int rhs);

  Object doArithmeticRightShiftEquals(byte lhs, long rhs);

  Object doArithmeticRightShiftEquals(byte lhs, BigInteger rhs);

  Object doArithmeticRightShiftEquals(char lhs, byte rhs);

  Object doArithmeticRightShiftEquals(char lhs, char rhs);

  Object doArithmeticRightShiftEquals(char lhs, short rhs);

  Object doArithmeticRightShiftEquals(char lhs, int rhs);

  Object doArithmeticRightShiftEquals(char lhs, long rhs);

  Object doArithmeticRightShiftEquals(char lhs, BigInteger rhs);

  Object doArithmeticRightShiftEquals(short lhs, byte rhs);

  Object doArithmeticRightShiftEquals(short lhs, char rhs);

  Object doArithmeticRightShiftEquals(short lhs, short rhs);

  Object doArithmeticRightShiftEquals(short lhs, int rhs);

  Object doArithmeticRightShiftEquals(short lhs, long rhs);

  Object doArithmeticRightShiftEquals(short lhs, BigInteger rhs);

  Object doArithmeticRightShiftEquals(int lhs, byte rhs);

  Object doArithmeticRightShiftEquals(int lhs, char rhs);

  Object doArithmeticRightShiftEquals(int lhs, short rhs);

  Object doArithmeticRightShiftEquals(int lhs, int rhs);

  Object doArithmeticRightShiftEquals(int lhs, long rhs);

  Object doArithmeticRightShiftEquals(int lhs, BigInteger rhs);

  Object doArithmeticRightShiftEquals(long lhs, byte rhs);

  Object doArithmeticRightShiftEquals(long lhs, char rhs);

  Object doArithmeticRightShiftEquals(long lhs, short rhs);

  Object doArithmeticRightShiftEquals(long lhs, int rhs);

  Object doArithmeticRightShiftEquals(long lhs, long rhs);

  Object doArithmeticRightShiftEquals(long lhs, BigInteger rhs);

  Object doArithmeticRightShiftEquals(BigInteger lhs, byte rhs);

  Object doArithmeticRightShiftEquals(BigInteger lhs, char rhs);

  Object doArithmeticRightShiftEquals(BigInteger lhs, short rhs);

  Object doArithmeticRightShiftEquals(BigInteger lhs, int rhs);

  Object doArithmeticRightShiftEquals(BigInteger lhs, long rhs);

  Object doArithmeticRightShiftEquals(BigInteger lhs, BigInteger rhs);

  Object doArithmeticRightShiftEquals(Object lhs, byte rhs);

  Object doArithmeticRightShiftEquals(Object lhs, char rhs);

  Object doArithmeticRightShiftEquals(Object lhs, short rhs);

  Object doArithmeticRightShiftEquals(Object lhs, int rhs);

  Object doArithmeticRightShiftEquals(Object lhs, long rhs);

  Object doArithmeticRightShiftEquals(Object lhs, BigInteger rhs);

  Object doReverseArithmeticRightShiftEquals(byte lhs, Object rhs);

  Object doReverseArithmeticRightShiftEquals(char lhs, Object rhs);

  Object doReverseArithmeticRightShiftEquals(short lhs, Object rhs);

  Object doReverseArithmeticRightShiftEquals(int lhs, Object rhs);

  Object doReverseArithmeticRightShiftEquals(long lhs, Object rhs);

  Object doReverseArithmeticRightShiftEquals(BigInteger lhs, Object rhs);

  //
  //   Internal methods for operator >>>
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement >>>
  //

  Object doLogicalRightShift(Object lhs, Object rhs);

  Object doReverseLogicalRightShift(Object lhs, Object rhs);

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doLogicalRightShift(byte lhs, byte rhs);

  Object doLogicalRightShift(byte lhs, char rhs);

  Object doLogicalRightShift(byte lhs, short rhs);

  Object doLogicalRightShift(byte lhs, int rhs);

  Object doLogicalRightShift(byte lhs, long rhs);

  Object doLogicalRightShift(byte lhs, BigInteger rhs);

  Object doLogicalRightShift(char lhs, byte rhs);

  Object doLogicalRightShift(char lhs, char rhs);

  Object doLogicalRightShift(char lhs, short rhs);

  Object doLogicalRightShift(char lhs, int rhs);

  Object doLogicalRightShift(char lhs, long rhs);

  Object doLogicalRightShift(char lhs, BigInteger rhs);

  Object doLogicalRightShift(short lhs, byte rhs);

  Object doLogicalRightShift(short lhs, char rhs);

  Object doLogicalRightShift(short lhs, short rhs);

  Object doLogicalRightShift(short lhs, int rhs);

  Object doLogicalRightShift(short lhs, long rhs);

  Object doLogicalRightShift(short lhs, BigInteger rhs);

  Object doLogicalRightShift(int lhs, byte rhs);

  Object doLogicalRightShift(int lhs, char rhs);

  Object doLogicalRightShift(int lhs, short rhs);

  Object doLogicalRightShift(int lhs, int rhs);

  Object doLogicalRightShift(int lhs, long rhs);

  Object doLogicalRightShift(int lhs, BigInteger rhs);

  Object doLogicalRightShift(long lhs, byte rhs);

  Object doLogicalRightShift(long lhs, char rhs);

  Object doLogicalRightShift(long lhs, short rhs);

  Object doLogicalRightShift(long lhs, int rhs);

  Object doLogicalRightShift(long lhs, long rhs);

  Object doLogicalRightShift(long lhs, BigInteger rhs);

  Object doLogicalRightShift(Object lhs, byte rhs);

  Object doLogicalRightShift(Object lhs, char rhs);

  Object doLogicalRightShift(Object lhs, short rhs);

  Object doLogicalRightShift(Object lhs, int rhs);

  Object doLogicalRightShift(Object lhs, long rhs);

  Object doLogicalRightShift(Object lhs, BigInteger rhs);

  Object doReverseLogicalRightShift(byte lhs, Object rhs);

  Object doReverseLogicalRightShift(char lhs, Object rhs);

  Object doReverseLogicalRightShift(short lhs, Object rhs);

  Object doReverseLogicalRightShift(int lhs, Object rhs);

  Object doReverseLogicalRightShift(long lhs, Object rhs);

  //
  //   Internal methods for operator >>>=
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement >>>=
  //

  Object doLogicalRightShiftEquals(Object lhs, Object rhs);

  Object doReverseLogicalRightShiftEquals(Object lhs, Object rhs);

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doLogicalRightShiftEquals(byte lhs, byte rhs);

  Object doLogicalRightShiftEquals(byte lhs, char rhs);

  Object doLogicalRightShiftEquals(byte lhs, short rhs);

  Object doLogicalRightShiftEquals(byte lhs, int rhs);

  Object doLogicalRightShiftEquals(byte lhs, long rhs);

  Object doLogicalRightShiftEquals(byte lhs, BigInteger rhs);

  Object doLogicalRightShiftEquals(char lhs, byte rhs);

  Object doLogicalRightShiftEquals(char lhs, char rhs);

  Object doLogicalRightShiftEquals(char lhs, short rhs);

  Object doLogicalRightShiftEquals(char lhs, int rhs);

  Object doLogicalRightShiftEquals(char lhs, long rhs);

  Object doLogicalRightShiftEquals(char lhs, BigInteger rhs);

  Object doLogicalRightShiftEquals(short lhs, byte rhs);

  Object doLogicalRightShiftEquals(short lhs, char rhs);

  Object doLogicalRightShiftEquals(short lhs, short rhs);

  Object doLogicalRightShiftEquals(short lhs, int rhs);

  Object doLogicalRightShiftEquals(short lhs, long rhs);

  Object doLogicalRightShiftEquals(short lhs, BigInteger rhs);

  Object doLogicalRightShiftEquals(int lhs, byte rhs);

  Object doLogicalRightShiftEquals(int lhs, char rhs);

  Object doLogicalRightShiftEquals(int lhs, short rhs);

  Object doLogicalRightShiftEquals(int lhs, int rhs);

  Object doLogicalRightShiftEquals(int lhs, long rhs);

  Object doLogicalRightShiftEquals(int lhs, BigInteger rhs);

  Object doLogicalRightShiftEquals(long lhs, byte rhs);

  Object doLogicalRightShiftEquals(long lhs, char rhs);

  Object doLogicalRightShiftEquals(long lhs, short rhs);

  Object doLogicalRightShiftEquals(long lhs, int rhs);

  Object doLogicalRightShiftEquals(long lhs, long rhs);

  Object doLogicalRightShiftEquals(long lhs, BigInteger rhs);

  Object doLogicalRightShiftEquals(Object lhs, byte rhs);

  Object doLogicalRightShiftEquals(Object lhs, char rhs);

  Object doLogicalRightShiftEquals(Object lhs, short rhs);

  Object doLogicalRightShiftEquals(Object lhs, int rhs);

  Object doLogicalRightShiftEquals(Object lhs, long rhs);

  Object doLogicalRightShiftEquals(Object lhs, BigInteger rhs);

  Object doReverseLogicalRightShiftEquals(byte lhs, Object rhs);

  Object doReverseLogicalRightShiftEquals(char lhs, Object rhs);

  Object doReverseLogicalRightShiftEquals(short lhs, Object rhs);

  Object doReverseLogicalRightShiftEquals(int lhs, Object rhs);

  Object doReverseLogicalRightShiftEquals(long lhs, Object rhs);

  //
  //   Internal methods for operator <=>
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement <=>
  //

  Object doCompare(Object lhs, Object rhs);

  Object doReverseCompare(Object lhs, Object rhs);

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doCompare(byte lhs, byte rhs);

  Object doCompare(byte lhs, char rhs);

  Object doCompare(byte lhs, short rhs);

  Object doCompare(byte lhs, int rhs);

  Object doCompare(byte lhs, long rhs);

  Object doCompare(byte lhs, float rhs);

  Object doCompare(byte lhs, double rhs);

  Object doCompare(byte lhs, BigInteger rhs);

  Object doCompare(byte lhs, BigDecimal rhs);

  Object doCompare(char lhs, byte rhs);

  Object doCompare(char lhs, char rhs);

  Object doCompare(char lhs, short rhs);

  Object doCompare(char lhs, int rhs);

  Object doCompare(char lhs, long rhs);

  Object doCompare(char lhs, float rhs);

  Object doCompare(char lhs, double rhs);

  Object doCompare(char lhs, BigInteger rhs);

  Object doCompare(char lhs, BigDecimal rhs);

  Object doCompare(short lhs, byte rhs);

  Object doCompare(short lhs, char rhs);

  Object doCompare(short lhs, short rhs);

  Object doCompare(short lhs, int rhs);

  Object doCompare(short lhs, long rhs);

  Object doCompare(short lhs, float rhs);

  Object doCompare(short lhs, double rhs);

  Object doCompare(short lhs, BigInteger rhs);

  Object doCompare(short lhs, BigDecimal rhs);

  Object doCompare(int lhs, byte rhs);

  Object doCompare(int lhs, char rhs);

  Object doCompare(int lhs, short rhs);

  Object doCompare(int lhs, int rhs);

  Object doCompare(int lhs, long rhs);

  Object doCompare(int lhs, float rhs);

  Object doCompare(int lhs, double rhs);

  Object doCompare(int lhs, BigInteger rhs);

  Object doCompare(int lhs, BigDecimal rhs);

  Object doCompare(long lhs, byte rhs);

  Object doCompare(long lhs, char rhs);

  Object doCompare(long lhs, short rhs);

  Object doCompare(long lhs, int rhs);

  Object doCompare(long lhs, long rhs);

  Object doCompare(long lhs, float rhs);

  Object doCompare(long lhs, double rhs);

  Object doCompare(long lhs, BigInteger rhs);

  Object doCompare(long lhs, BigDecimal rhs);

  Object doCompare(float lhs, byte rhs);

  Object doCompare(float lhs, char rhs);

  Object doCompare(float lhs, short rhs);

  Object doCompare(float lhs, int rhs);

  Object doCompare(float lhs, long rhs);

  Object doCompare(float lhs, float rhs);

  Object doCompare(float lhs, double rhs);

  Object doCompare(float lhs, BigInteger rhs);

  Object doCompare(float lhs, BigDecimal rhs);

  Object doCompare(double lhs, byte rhs);

  Object doCompare(double lhs, char rhs);

  Object doCompare(double lhs, short rhs);

  Object doCompare(double lhs, int rhs);

  Object doCompare(double lhs, long rhs);

  Object doCompare(double lhs, float rhs);

  Object doCompare(double lhs, double rhs);

  Object doCompare(double lhs, BigInteger rhs);

  Object doCompare(double lhs, BigDecimal rhs);

  Object doCompare(BigInteger lhs, byte rhs);

  Object doCompare(BigInteger lhs, char rhs);

  Object doCompare(BigInteger lhs, short rhs);

  Object doCompare(BigInteger lhs, int rhs);

  Object doCompare(BigInteger lhs, long rhs);

  Object doCompare(BigInteger lhs, float rhs);

  Object doCompare(BigInteger lhs, double rhs);

  Object doCompare(BigInteger lhs, BigInteger rhs);

  Object doCompare(BigInteger lhs, BigDecimal rhs);

  Object doCompare(BigDecimal lhs, byte rhs);

  Object doCompare(BigDecimal lhs, char rhs);

  Object doCompare(BigDecimal lhs, short rhs);

  Object doCompare(BigDecimal lhs, int rhs);

  Object doCompare(BigDecimal lhs, long rhs);

  Object doCompare(BigDecimal lhs, float rhs);

  Object doCompare(BigDecimal lhs, double rhs);

  Object doCompare(BigDecimal lhs, BigInteger rhs);

  Object doCompare(BigDecimal lhs, BigDecimal rhs);

  Object doCompare(Object lhs, byte rhs);

  Object doCompare(Object lhs, char rhs);

  Object doCompare(Object lhs, short rhs);

  Object doCompare(Object lhs, int rhs);

  Object doCompare(Object lhs, long rhs);

  Object doCompare(Object lhs, float rhs);

  Object doCompare(Object lhs, double rhs);

  Object doCompare(Object lhs, BigInteger rhs);

  Object doCompare(Object lhs, BigDecimal rhs);

  Object doReverseCompare(byte lhs, Object rhs);

  Object doReverseCompare(char lhs, Object rhs);

  Object doReverseCompare(short lhs, Object rhs);

  Object doReverseCompare(int lhs, Object rhs);

  Object doReverseCompare(long lhs, Object rhs);

  Object doReverseCompare(float lhs, Object rhs);

  Object doReverseCompare(double lhs, Object rhs);

  Object doReverseCompare(BigInteger lhs, Object rhs);

  Object doReverseCompare(BigDecimal lhs, Object rhs);

  //
  //   Internal methods for operator ==
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement ==
  //

  Object doEquals(Object lhs, Object rhs);

  Object doReverseEquals(Object lhs, Object rhs);

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doEquals(byte lhs, byte rhs);

  Object doEquals(byte lhs, char rhs);

  Object doEquals(byte lhs, short rhs);

  Object doEquals(byte lhs, int rhs);

  Object doEquals(byte lhs, long rhs);

  Object doEquals(byte lhs, float rhs);

  Object doEquals(byte lhs, double rhs);

  Object doEquals(byte lhs, BigInteger rhs);

  Object doEquals(byte lhs, BigDecimal rhs);

  Object doEquals(char lhs, byte rhs);

  Object doEquals(char lhs, char rhs);

  Object doEquals(char lhs, short rhs);

  Object doEquals(char lhs, int rhs);

  Object doEquals(char lhs, long rhs);

  Object doEquals(char lhs, float rhs);

  Object doEquals(char lhs, double rhs);

  Object doEquals(char lhs, BigInteger rhs);

  Object doEquals(char lhs, BigDecimal rhs);

  Object doEquals(short lhs, byte rhs);

  Object doEquals(short lhs, char rhs);

  Object doEquals(short lhs, short rhs);

  Object doEquals(short lhs, int rhs);

  Object doEquals(short lhs, long rhs);

  Object doEquals(short lhs, float rhs);

  Object doEquals(short lhs, double rhs);

  Object doEquals(short lhs, BigInteger rhs);

  Object doEquals(short lhs, BigDecimal rhs);

  Object doEquals(int lhs, byte rhs);

  Object doEquals(int lhs, char rhs);

  Object doEquals(int lhs, short rhs);

  Object doEquals(int lhs, int rhs);

  Object doEquals(int lhs, long rhs);

  Object doEquals(int lhs, float rhs);

  Object doEquals(int lhs, double rhs);

  Object doEquals(int lhs, BigInteger rhs);

  Object doEquals(int lhs, BigDecimal rhs);

  Object doEquals(long lhs, byte rhs);

  Object doEquals(long lhs, char rhs);

  Object doEquals(long lhs, short rhs);

  Object doEquals(long lhs, int rhs);

  Object doEquals(long lhs, long rhs);

  Object doEquals(long lhs, float rhs);

  Object doEquals(long lhs, double rhs);

  Object doEquals(long lhs, BigInteger rhs);

  Object doEquals(long lhs, BigDecimal rhs);

  Object doEquals(float lhs, byte rhs);

  Object doEquals(float lhs, char rhs);

  Object doEquals(float lhs, short rhs);

  Object doEquals(float lhs, int rhs);

  Object doEquals(float lhs, long rhs);

  Object doEquals(float lhs, float rhs);

  Object doEquals(float lhs, double rhs);

  Object doEquals(float lhs, BigInteger rhs);

  Object doEquals(float lhs, BigDecimal rhs);

  Object doEquals(double lhs, byte rhs);

  Object doEquals(double lhs, char rhs);

  Object doEquals(double lhs, short rhs);

  Object doEquals(double lhs, int rhs);

  Object doEquals(double lhs, long rhs);

  Object doEquals(double lhs, float rhs);

  Object doEquals(double lhs, double rhs);

  Object doEquals(double lhs, BigInteger rhs);

  Object doEquals(double lhs, BigDecimal rhs);

  Object doEquals(BigInteger lhs, byte rhs);

  Object doEquals(BigInteger lhs, char rhs);

  Object doEquals(BigInteger lhs, short rhs);

  Object doEquals(BigInteger lhs, int rhs);

  Object doEquals(BigInteger lhs, long rhs);

  Object doEquals(BigInteger lhs, float rhs);

  Object doEquals(BigInteger lhs, double rhs);

  Object doEquals(BigInteger lhs, BigInteger rhs);

  Object doEquals(BigInteger lhs, BigDecimal rhs);

  Object doEquals(BigDecimal lhs, byte rhs);

  Object doEquals(BigDecimal lhs, char rhs);

  Object doEquals(BigDecimal lhs, short rhs);

  Object doEquals(BigDecimal lhs, int rhs);

  Object doEquals(BigDecimal lhs, long rhs);

  Object doEquals(BigDecimal lhs, float rhs);

  Object doEquals(BigDecimal lhs, double rhs);

  Object doEquals(BigDecimal lhs, BigInteger rhs);

  Object doEquals(BigDecimal lhs, BigDecimal rhs);

  Object doEquals(Object lhs, byte rhs);

  Object doEquals(Object lhs, char rhs);

  Object doEquals(Object lhs, short rhs);

  Object doEquals(Object lhs, int rhs);

  Object doEquals(Object lhs, long rhs);

  Object doEquals(Object lhs, float rhs);

  Object doEquals(Object lhs, double rhs);

  Object doEquals(Object lhs, BigInteger rhs);

  Object doEquals(Object lhs, BigDecimal rhs);

  Object doReverseEquals(byte lhs, Object rhs);

  Object doReverseEquals(char lhs, Object rhs);

  Object doReverseEquals(short lhs, Object rhs);

  Object doReverseEquals(int lhs, Object rhs);

  Object doReverseEquals(long lhs, Object rhs);

  Object doReverseEquals(float lhs, Object rhs);

  Object doReverseEquals(double lhs, Object rhs);

  Object doReverseEquals(BigInteger lhs, Object rhs);

  Object doReverseEquals(BigDecimal lhs, Object rhs);

  //
  //   Internal methods for operator !=
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement !=
  //

  Object doNotEquals(Object lhs, Object rhs);

  Object doReverseNotEquals(Object lhs, Object rhs);

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doNotEquals(byte lhs, byte rhs);

  Object doNotEquals(byte lhs, char rhs);

  Object doNotEquals(byte lhs, short rhs);

  Object doNotEquals(byte lhs, int rhs);

  Object doNotEquals(byte lhs, long rhs);

  Object doNotEquals(byte lhs, float rhs);

  Object doNotEquals(byte lhs, double rhs);

  Object doNotEquals(byte lhs, BigInteger rhs);

  Object doNotEquals(byte lhs, BigDecimal rhs);

  Object doNotEquals(char lhs, byte rhs);

  Object doNotEquals(char lhs, char rhs);

  Object doNotEquals(char lhs, short rhs);

  Object doNotEquals(char lhs, int rhs);

  Object doNotEquals(char lhs, long rhs);

  Object doNotEquals(char lhs, float rhs);

  Object doNotEquals(char lhs, double rhs);

  Object doNotEquals(char lhs, BigInteger rhs);

  Object doNotEquals(char lhs, BigDecimal rhs);

  Object doNotEquals(short lhs, byte rhs);

  Object doNotEquals(short lhs, char rhs);

  Object doNotEquals(short lhs, short rhs);

  Object doNotEquals(short lhs, int rhs);

  Object doNotEquals(short lhs, long rhs);

  Object doNotEquals(short lhs, float rhs);

  Object doNotEquals(short lhs, double rhs);

  Object doNotEquals(short lhs, BigInteger rhs);

  Object doNotEquals(short lhs, BigDecimal rhs);

  Object doNotEquals(int lhs, byte rhs);

  Object doNotEquals(int lhs, char rhs);

  Object doNotEquals(int lhs, short rhs);

  Object doNotEquals(int lhs, int rhs);

  Object doNotEquals(int lhs, long rhs);

  Object doNotEquals(int lhs, float rhs);

  Object doNotEquals(int lhs, double rhs);

  Object doNotEquals(int lhs, BigInteger rhs);

  Object doNotEquals(int lhs, BigDecimal rhs);

  Object doNotEquals(long lhs, byte rhs);

  Object doNotEquals(long lhs, char rhs);

  Object doNotEquals(long lhs, short rhs);

  Object doNotEquals(long lhs, int rhs);

  Object doNotEquals(long lhs, long rhs);

  Object doNotEquals(long lhs, float rhs);

  Object doNotEquals(long lhs, double rhs);

  Object doNotEquals(long lhs, BigInteger rhs);

  Object doNotEquals(long lhs, BigDecimal rhs);

  Object doNotEquals(float lhs, byte rhs);

  Object doNotEquals(float lhs, char rhs);

  Object doNotEquals(float lhs, short rhs);

  Object doNotEquals(float lhs, int rhs);

  Object doNotEquals(float lhs, long rhs);

  Object doNotEquals(float lhs, float rhs);

  Object doNotEquals(float lhs, double rhs);

  Object doNotEquals(float lhs, BigInteger rhs);

  Object doNotEquals(float lhs, BigDecimal rhs);

  Object doNotEquals(double lhs, byte rhs);

  Object doNotEquals(double lhs, char rhs);

  Object doNotEquals(double lhs, short rhs);

  Object doNotEquals(double lhs, int rhs);

  Object doNotEquals(double lhs, long rhs);

  Object doNotEquals(double lhs, float rhs);

  Object doNotEquals(double lhs, double rhs);

  Object doNotEquals(double lhs, BigInteger rhs);

  Object doNotEquals(double lhs, BigDecimal rhs);

  Object doNotEquals(BigInteger lhs, byte rhs);

  Object doNotEquals(BigInteger lhs, char rhs);

  Object doNotEquals(BigInteger lhs, short rhs);

  Object doNotEquals(BigInteger lhs, int rhs);

  Object doNotEquals(BigInteger lhs, long rhs);

  Object doNotEquals(BigInteger lhs, float rhs);

  Object doNotEquals(BigInteger lhs, double rhs);

  Object doNotEquals(BigInteger lhs, BigInteger rhs);

  Object doNotEquals(BigInteger lhs, BigDecimal rhs);

  Object doNotEquals(BigDecimal lhs, byte rhs);

  Object doNotEquals(BigDecimal lhs, char rhs);

  Object doNotEquals(BigDecimal lhs, short rhs);

  Object doNotEquals(BigDecimal lhs, int rhs);

  Object doNotEquals(BigDecimal lhs, long rhs);

  Object doNotEquals(BigDecimal lhs, float rhs);

  Object doNotEquals(BigDecimal lhs, double rhs);

  Object doNotEquals(BigDecimal lhs, BigInteger rhs);

  Object doNotEquals(BigDecimal lhs, BigDecimal rhs);

  Object doNotEquals(Object lhs, byte rhs);

  Object doNotEquals(Object lhs, char rhs);

  Object doNotEquals(Object lhs, short rhs);

  Object doNotEquals(Object lhs, int rhs);

  Object doNotEquals(Object lhs, long rhs);

  Object doNotEquals(Object lhs, float rhs);

  Object doNotEquals(Object lhs, double rhs);

  Object doNotEquals(Object lhs, BigInteger rhs);

  Object doNotEquals(Object lhs, BigDecimal rhs);

  Object doReverseNotEquals(byte lhs, Object rhs);

  Object doReverseNotEquals(char lhs, Object rhs);

  Object doReverseNotEquals(short lhs, Object rhs);

  Object doReverseNotEquals(int lhs, Object rhs);

  Object doReverseNotEquals(long lhs, Object rhs);

  Object doReverseNotEquals(float lhs, Object rhs);

  Object doReverseNotEquals(double lhs, Object rhs);

  Object doReverseNotEquals(BigInteger lhs, Object rhs);

  Object doReverseNotEquals(BigDecimal lhs, Object rhs);

  //
  //   Internal methods for operator <
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement <
  //

  Object doLessThan(Object lhs, Object rhs);

  Object doReverseLessThan(Object lhs, Object rhs);

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doLessThan(byte lhs, byte rhs);

  Object doLessThan(byte lhs, char rhs);

  Object doLessThan(byte lhs, short rhs);

  Object doLessThan(byte lhs, int rhs);

  Object doLessThan(byte lhs, long rhs);

  Object doLessThan(byte lhs, float rhs);

  Object doLessThan(byte lhs, double rhs);

  Object doLessThan(byte lhs, BigInteger rhs);

  Object doLessThan(byte lhs, BigDecimal rhs);

  Object doLessThan(char lhs, byte rhs);

  Object doLessThan(char lhs, char rhs);

  Object doLessThan(char lhs, short rhs);

  Object doLessThan(char lhs, int rhs);

  Object doLessThan(char lhs, long rhs);

  Object doLessThan(char lhs, float rhs);

  Object doLessThan(char lhs, double rhs);

  Object doLessThan(char lhs, BigInteger rhs);

  Object doLessThan(char lhs, BigDecimal rhs);

  Object doLessThan(short lhs, byte rhs);

  Object doLessThan(short lhs, char rhs);

  Object doLessThan(short lhs, short rhs);

  Object doLessThan(short lhs, int rhs);

  Object doLessThan(short lhs, long rhs);

  Object doLessThan(short lhs, float rhs);

  Object doLessThan(short lhs, double rhs);

  Object doLessThan(short lhs, BigInteger rhs);

  Object doLessThan(short lhs, BigDecimal rhs);

  Object doLessThan(int lhs, byte rhs);

  Object doLessThan(int lhs, char rhs);

  Object doLessThan(int lhs, short rhs);

  Object doLessThan(int lhs, int rhs);

  Object doLessThan(int lhs, long rhs);

  Object doLessThan(int lhs, float rhs);

  Object doLessThan(int lhs, double rhs);

  Object doLessThan(int lhs, BigInteger rhs);

  Object doLessThan(int lhs, BigDecimal rhs);

  Object doLessThan(long lhs, byte rhs);

  Object doLessThan(long lhs, char rhs);

  Object doLessThan(long lhs, short rhs);

  Object doLessThan(long lhs, int rhs);

  Object doLessThan(long lhs, long rhs);

  Object doLessThan(long lhs, float rhs);

  Object doLessThan(long lhs, double rhs);

  Object doLessThan(long lhs, BigInteger rhs);

  Object doLessThan(long lhs, BigDecimal rhs);

  Object doLessThan(float lhs, byte rhs);

  Object doLessThan(float lhs, char rhs);

  Object doLessThan(float lhs, short rhs);

  Object doLessThan(float lhs, int rhs);

  Object doLessThan(float lhs, long rhs);

  Object doLessThan(float lhs, float rhs);

  Object doLessThan(float lhs, double rhs);

  Object doLessThan(float lhs, BigInteger rhs);

  Object doLessThan(float lhs, BigDecimal rhs);

  Object doLessThan(double lhs, byte rhs);

  Object doLessThan(double lhs, char rhs);

  Object doLessThan(double lhs, short rhs);

  Object doLessThan(double lhs, int rhs);

  Object doLessThan(double lhs, long rhs);

  Object doLessThan(double lhs, float rhs);

  Object doLessThan(double lhs, double rhs);

  Object doLessThan(double lhs, BigInteger rhs);

  Object doLessThan(double lhs, BigDecimal rhs);

  Object doLessThan(BigInteger lhs, byte rhs);

  Object doLessThan(BigInteger lhs, char rhs);

  Object doLessThan(BigInteger lhs, short rhs);

  Object doLessThan(BigInteger lhs, int rhs);

  Object doLessThan(BigInteger lhs, long rhs);

  Object doLessThan(BigInteger lhs, float rhs);

  Object doLessThan(BigInteger lhs, double rhs);

  Object doLessThan(BigInteger lhs, BigInteger rhs);

  Object doLessThan(BigInteger lhs, BigDecimal rhs);

  Object doLessThan(BigDecimal lhs, byte rhs);

  Object doLessThan(BigDecimal lhs, char rhs);

  Object doLessThan(BigDecimal lhs, short rhs);

  Object doLessThan(BigDecimal lhs, int rhs);

  Object doLessThan(BigDecimal lhs, long rhs);

  Object doLessThan(BigDecimal lhs, float rhs);

  Object doLessThan(BigDecimal lhs, double rhs);

  Object doLessThan(BigDecimal lhs, BigInteger rhs);

  Object doLessThan(BigDecimal lhs, BigDecimal rhs);

  Object doLessThan(Object lhs, byte rhs);

  Object doLessThan(Object lhs, char rhs);

  Object doLessThan(Object lhs, short rhs);

  Object doLessThan(Object lhs, int rhs);

  Object doLessThan(Object lhs, long rhs);

  Object doLessThan(Object lhs, float rhs);

  Object doLessThan(Object lhs, double rhs);

  Object doLessThan(Object lhs, BigInteger rhs);

  Object doLessThan(Object lhs, BigDecimal rhs);

  Object doReverseLessThan(byte lhs, Object rhs);

  Object doReverseLessThan(char lhs, Object rhs);

  Object doReverseLessThan(short lhs, Object rhs);

  Object doReverseLessThan(int lhs, Object rhs);

  Object doReverseLessThan(long lhs, Object rhs);

  Object doReverseLessThan(float lhs, Object rhs);

  Object doReverseLessThan(double lhs, Object rhs);

  Object doReverseLessThan(BigInteger lhs, Object rhs);

  Object doReverseLessThan(BigDecimal lhs, Object rhs);

  //
  //   Internal methods for operator <=
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement <=
  //

  Object doLessThanOrEquals(Object lhs, Object rhs);

  Object doReverseLessThanOrEquals(Object lhs, Object rhs);

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doLessThanOrEquals(byte lhs, byte rhs);

  Object doLessThanOrEquals(byte lhs, char rhs);

  Object doLessThanOrEquals(byte lhs, short rhs);

  Object doLessThanOrEquals(byte lhs, int rhs);

  Object doLessThanOrEquals(byte lhs, long rhs);

  Object doLessThanOrEquals(byte lhs, float rhs);

  Object doLessThanOrEquals(byte lhs, double rhs);

  Object doLessThanOrEquals(byte lhs, BigInteger rhs);

  Object doLessThanOrEquals(byte lhs, BigDecimal rhs);

  Object doLessThanOrEquals(char lhs, byte rhs);

  Object doLessThanOrEquals(char lhs, char rhs);

  Object doLessThanOrEquals(char lhs, short rhs);

  Object doLessThanOrEquals(char lhs, int rhs);

  Object doLessThanOrEquals(char lhs, long rhs);

  Object doLessThanOrEquals(char lhs, float rhs);

  Object doLessThanOrEquals(char lhs, double rhs);

  Object doLessThanOrEquals(char lhs, BigInteger rhs);

  Object doLessThanOrEquals(char lhs, BigDecimal rhs);

  Object doLessThanOrEquals(short lhs, byte rhs);

  Object doLessThanOrEquals(short lhs, char rhs);

  Object doLessThanOrEquals(short lhs, short rhs);

  Object doLessThanOrEquals(short lhs, int rhs);

  Object doLessThanOrEquals(short lhs, long rhs);

  Object doLessThanOrEquals(short lhs, float rhs);

  Object doLessThanOrEquals(short lhs, double rhs);

  Object doLessThanOrEquals(short lhs, BigInteger rhs);

  Object doLessThanOrEquals(short lhs, BigDecimal rhs);

  Object doLessThanOrEquals(int lhs, byte rhs);

  Object doLessThanOrEquals(int lhs, char rhs);

  Object doLessThanOrEquals(int lhs, short rhs);

  Object doLessThanOrEquals(int lhs, int rhs);

  Object doLessThanOrEquals(int lhs, long rhs);

  Object doLessThanOrEquals(int lhs, float rhs);

  Object doLessThanOrEquals(int lhs, double rhs);

  Object doLessThanOrEquals(int lhs, BigInteger rhs);

  Object doLessThanOrEquals(int lhs, BigDecimal rhs);

  Object doLessThanOrEquals(long lhs, byte rhs);

  Object doLessThanOrEquals(long lhs, char rhs);

  Object doLessThanOrEquals(long lhs, short rhs);

  Object doLessThanOrEquals(long lhs, int rhs);

  Object doLessThanOrEquals(long lhs, long rhs);

  Object doLessThanOrEquals(long lhs, float rhs);

  Object doLessThanOrEquals(long lhs, double rhs);

  Object doLessThanOrEquals(long lhs, BigInteger rhs);

  Object doLessThanOrEquals(long lhs, BigDecimal rhs);

  Object doLessThanOrEquals(float lhs, byte rhs);

  Object doLessThanOrEquals(float lhs, char rhs);

  Object doLessThanOrEquals(float lhs, short rhs);

  Object doLessThanOrEquals(float lhs, int rhs);

  Object doLessThanOrEquals(float lhs, long rhs);

  Object doLessThanOrEquals(float lhs, float rhs);

  Object doLessThanOrEquals(float lhs, double rhs);

  Object doLessThanOrEquals(float lhs, BigInteger rhs);

  Object doLessThanOrEquals(float lhs, BigDecimal rhs);

  Object doLessThanOrEquals(double lhs, byte rhs);

  Object doLessThanOrEquals(double lhs, char rhs);

  Object doLessThanOrEquals(double lhs, short rhs);

  Object doLessThanOrEquals(double lhs, int rhs);

  Object doLessThanOrEquals(double lhs, long rhs);

  Object doLessThanOrEquals(double lhs, float rhs);

  Object doLessThanOrEquals(double lhs, double rhs);

  Object doLessThanOrEquals(double lhs, BigInteger rhs);

  Object doLessThanOrEquals(double lhs, BigDecimal rhs);

  Object doLessThanOrEquals(BigInteger lhs, byte rhs);

  Object doLessThanOrEquals(BigInteger lhs, char rhs);

  Object doLessThanOrEquals(BigInteger lhs, short rhs);

  Object doLessThanOrEquals(BigInteger lhs, int rhs);

  Object doLessThanOrEquals(BigInteger lhs, long rhs);

  Object doLessThanOrEquals(BigInteger lhs, float rhs);

  Object doLessThanOrEquals(BigInteger lhs, double rhs);

  Object doLessThanOrEquals(BigInteger lhs, BigInteger rhs);

  Object doLessThanOrEquals(BigInteger lhs, BigDecimal rhs);

  Object doLessThanOrEquals(BigDecimal lhs, byte rhs);

  Object doLessThanOrEquals(BigDecimal lhs, char rhs);

  Object doLessThanOrEquals(BigDecimal lhs, short rhs);

  Object doLessThanOrEquals(BigDecimal lhs, int rhs);

  Object doLessThanOrEquals(BigDecimal lhs, long rhs);

  Object doLessThanOrEquals(BigDecimal lhs, float rhs);

  Object doLessThanOrEquals(BigDecimal lhs, double rhs);

  Object doLessThanOrEquals(BigDecimal lhs, BigInteger rhs);

  Object doLessThanOrEquals(BigDecimal lhs, BigDecimal rhs);

  Object doLessThanOrEquals(Object lhs, byte rhs);

  Object doLessThanOrEquals(Object lhs, char rhs);

  Object doLessThanOrEquals(Object lhs, short rhs);

  Object doLessThanOrEquals(Object lhs, int rhs);

  Object doLessThanOrEquals(Object lhs, long rhs);

  Object doLessThanOrEquals(Object lhs, float rhs);

  Object doLessThanOrEquals(Object lhs, double rhs);

  Object doLessThanOrEquals(Object lhs, BigInteger rhs);

  Object doLessThanOrEquals(Object lhs, BigDecimal rhs);

  Object doReverseLessThanOrEquals(byte lhs, Object rhs);

  Object doReverseLessThanOrEquals(char lhs, Object rhs);

  Object doReverseLessThanOrEquals(short lhs, Object rhs);

  Object doReverseLessThanOrEquals(int lhs, Object rhs);

  Object doReverseLessThanOrEquals(long lhs, Object rhs);

  Object doReverseLessThanOrEquals(float lhs, Object rhs);

  Object doReverseLessThanOrEquals(double lhs, Object rhs);

  Object doReverseLessThanOrEquals(BigInteger lhs, Object rhs);

  Object doReverseLessThanOrEquals(BigDecimal lhs, Object rhs);

  //
  //   Internal methods for operator >
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement >
  //

  Object doGreaterThan(Object lhs, Object rhs);

  Object doReverseGreaterThan(Object lhs, Object rhs);

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doGreaterThan(byte lhs, byte rhs);

  Object doGreaterThan(byte lhs, char rhs);

  Object doGreaterThan(byte lhs, short rhs);

  Object doGreaterThan(byte lhs, int rhs);

  Object doGreaterThan(byte lhs, long rhs);

  Object doGreaterThan(byte lhs, float rhs);

  Object doGreaterThan(byte lhs, double rhs);

  Object doGreaterThan(byte lhs, BigInteger rhs);

  Object doGreaterThan(byte lhs, BigDecimal rhs);

  Object doGreaterThan(char lhs, byte rhs);

  Object doGreaterThan(char lhs, char rhs);

  Object doGreaterThan(char lhs, short rhs);

  Object doGreaterThan(char lhs, int rhs);

  Object doGreaterThan(char lhs, long rhs);

  Object doGreaterThan(char lhs, float rhs);

  Object doGreaterThan(char lhs, double rhs);

  Object doGreaterThan(char lhs, BigInteger rhs);

  Object doGreaterThan(char lhs, BigDecimal rhs);

  Object doGreaterThan(short lhs, byte rhs);

  Object doGreaterThan(short lhs, char rhs);

  Object doGreaterThan(short lhs, short rhs);

  Object doGreaterThan(short lhs, int rhs);

  Object doGreaterThan(short lhs, long rhs);

  Object doGreaterThan(short lhs, float rhs);

  Object doGreaterThan(short lhs, double rhs);

  Object doGreaterThan(short lhs, BigInteger rhs);

  Object doGreaterThan(short lhs, BigDecimal rhs);

  Object doGreaterThan(int lhs, byte rhs);

  Object doGreaterThan(int lhs, char rhs);

  Object doGreaterThan(int lhs, short rhs);

  Object doGreaterThan(int lhs, int rhs);

  Object doGreaterThan(int lhs, long rhs);

  Object doGreaterThan(int lhs, float rhs);

  Object doGreaterThan(int lhs, double rhs);

  Object doGreaterThan(int lhs, BigInteger rhs);

  Object doGreaterThan(int lhs, BigDecimal rhs);

  Object doGreaterThan(long lhs, byte rhs);

  Object doGreaterThan(long lhs, char rhs);

  Object doGreaterThan(long lhs, short rhs);

  Object doGreaterThan(long lhs, int rhs);

  Object doGreaterThan(long lhs, long rhs);

  Object doGreaterThan(long lhs, float rhs);

  Object doGreaterThan(long lhs, double rhs);

  Object doGreaterThan(long lhs, BigInteger rhs);

  Object doGreaterThan(long lhs, BigDecimal rhs);

  Object doGreaterThan(float lhs, byte rhs);

  Object doGreaterThan(float lhs, char rhs);

  Object doGreaterThan(float lhs, short rhs);

  Object doGreaterThan(float lhs, int rhs);

  Object doGreaterThan(float lhs, long rhs);

  Object doGreaterThan(float lhs, float rhs);

  Object doGreaterThan(float lhs, double rhs);

  Object doGreaterThan(float lhs, BigInteger rhs);

  Object doGreaterThan(float lhs, BigDecimal rhs);

  Object doGreaterThan(double lhs, byte rhs);

  Object doGreaterThan(double lhs, char rhs);

  Object doGreaterThan(double lhs, short rhs);

  Object doGreaterThan(double lhs, int rhs);

  Object doGreaterThan(double lhs, long rhs);

  Object doGreaterThan(double lhs, float rhs);

  Object doGreaterThan(double lhs, double rhs);

  Object doGreaterThan(double lhs, BigInteger rhs);

  Object doGreaterThan(double lhs, BigDecimal rhs);

  Object doGreaterThan(BigInteger lhs, byte rhs);

  Object doGreaterThan(BigInteger lhs, char rhs);

  Object doGreaterThan(BigInteger lhs, short rhs);

  Object doGreaterThan(BigInteger lhs, int rhs);

  Object doGreaterThan(BigInteger lhs, long rhs);

  Object doGreaterThan(BigInteger lhs, float rhs);

  Object doGreaterThan(BigInteger lhs, double rhs);

  Object doGreaterThan(BigInteger lhs, BigInteger rhs);

  Object doGreaterThan(BigInteger lhs, BigDecimal rhs);

  Object doGreaterThan(BigDecimal lhs, byte rhs);

  Object doGreaterThan(BigDecimal lhs, char rhs);

  Object doGreaterThan(BigDecimal lhs, short rhs);

  Object doGreaterThan(BigDecimal lhs, int rhs);

  Object doGreaterThan(BigDecimal lhs, long rhs);

  Object doGreaterThan(BigDecimal lhs, float rhs);

  Object doGreaterThan(BigDecimal lhs, double rhs);

  Object doGreaterThan(BigDecimal lhs, BigInteger rhs);

  Object doGreaterThan(BigDecimal lhs, BigDecimal rhs);

  Object doGreaterThan(Object lhs, byte rhs);

  Object doGreaterThan(Object lhs, char rhs);

  Object doGreaterThan(Object lhs, short rhs);

  Object doGreaterThan(Object lhs, int rhs);

  Object doGreaterThan(Object lhs, long rhs);

  Object doGreaterThan(Object lhs, float rhs);

  Object doGreaterThan(Object lhs, double rhs);

  Object doGreaterThan(Object lhs, BigInteger rhs);

  Object doGreaterThan(Object lhs, BigDecimal rhs);

  Object doReverseGreaterThan(byte lhs, Object rhs);

  Object doReverseGreaterThan(char lhs, Object rhs);

  Object doReverseGreaterThan(short lhs, Object rhs);

  Object doReverseGreaterThan(int lhs, Object rhs);

  Object doReverseGreaterThan(long lhs, Object rhs);

  Object doReverseGreaterThan(float lhs, Object rhs);

  Object doReverseGreaterThan(double lhs, Object rhs);

  Object doReverseGreaterThan(BigInteger lhs, Object rhs);

  Object doReverseGreaterThan(BigDecimal lhs, Object rhs);

  //
  //   Internal methods for operator >=
  //   Do not generate calls to these
  //  

  //
  //  These are the only methods which need to be overriden
  //  to implement >=
  //

  Object doGreaterThanOrEquals(Object lhs, Object rhs);

  Object doReverseGreaterThanOrEquals(Object lhs, Object rhs);

  //
  // These methods can be overridden to improve performance
  //
  //

  Object doGreaterThanOrEquals(byte lhs, byte rhs);

  Object doGreaterThanOrEquals(byte lhs, char rhs);

  Object doGreaterThanOrEquals(byte lhs, short rhs);

  Object doGreaterThanOrEquals(byte lhs, int rhs);

  Object doGreaterThanOrEquals(byte lhs, long rhs);

  Object doGreaterThanOrEquals(byte lhs, float rhs);

  Object doGreaterThanOrEquals(byte lhs, double rhs);

  Object doGreaterThanOrEquals(byte lhs, BigInteger rhs);

  Object doGreaterThanOrEquals(byte lhs, BigDecimal rhs);

  Object doGreaterThanOrEquals(char lhs, byte rhs);

  Object doGreaterThanOrEquals(char lhs, char rhs);

  Object doGreaterThanOrEquals(char lhs, short rhs);

  Object doGreaterThanOrEquals(char lhs, int rhs);

  Object doGreaterThanOrEquals(char lhs, long rhs);

  Object doGreaterThanOrEquals(char lhs, float rhs);

  Object doGreaterThanOrEquals(char lhs, double rhs);

  Object doGreaterThanOrEquals(char lhs, BigInteger rhs);

  Object doGreaterThanOrEquals(char lhs, BigDecimal rhs);

  Object doGreaterThanOrEquals(short lhs, byte rhs);

  Object doGreaterThanOrEquals(short lhs, char rhs);

  Object doGreaterThanOrEquals(short lhs, short rhs);

  Object doGreaterThanOrEquals(short lhs, int rhs);

  Object doGreaterThanOrEquals(short lhs, long rhs);

  Object doGreaterThanOrEquals(short lhs, float rhs);

  Object doGreaterThanOrEquals(short lhs, double rhs);

  Object doGreaterThanOrEquals(short lhs, BigInteger rhs);

  Object doGreaterThanOrEquals(short lhs, BigDecimal rhs);

  Object doGreaterThanOrEquals(int lhs, byte rhs);

  Object doGreaterThanOrEquals(int lhs, char rhs);

  Object doGreaterThanOrEquals(int lhs, short rhs);

  Object doGreaterThanOrEquals(int lhs, int rhs);

  Object doGreaterThanOrEquals(int lhs, long rhs);

  Object doGreaterThanOrEquals(int lhs, float rhs);

  Object doGreaterThanOrEquals(int lhs, double rhs);

  Object doGreaterThanOrEquals(int lhs, BigInteger rhs);

  Object doGreaterThanOrEquals(int lhs, BigDecimal rhs);

  Object doGreaterThanOrEquals(long lhs, byte rhs);

  Object doGreaterThanOrEquals(long lhs, char rhs);

  Object doGreaterThanOrEquals(long lhs, short rhs);

  Object doGreaterThanOrEquals(long lhs, int rhs);

  Object doGreaterThanOrEquals(long lhs, long rhs);

  Object doGreaterThanOrEquals(long lhs, float rhs);

  Object doGreaterThanOrEquals(long lhs, double rhs);

  Object doGreaterThanOrEquals(long lhs, BigInteger rhs);

  Object doGreaterThanOrEquals(long lhs, BigDecimal rhs);

  Object doGreaterThanOrEquals(float lhs, byte rhs);

  Object doGreaterThanOrEquals(float lhs, char rhs);

  Object doGreaterThanOrEquals(float lhs, short rhs);

  Object doGreaterThanOrEquals(float lhs, int rhs);

  Object doGreaterThanOrEquals(float lhs, long rhs);

  Object doGreaterThanOrEquals(float lhs, float rhs);

  Object doGreaterThanOrEquals(float lhs, double rhs);

  Object doGreaterThanOrEquals(float lhs, BigInteger rhs);

  Object doGreaterThanOrEquals(float lhs, BigDecimal rhs);

  Object doGreaterThanOrEquals(double lhs, byte rhs);

  Object doGreaterThanOrEquals(double lhs, char rhs);

  Object doGreaterThanOrEquals(double lhs, short rhs);

  Object doGreaterThanOrEquals(double lhs, int rhs);

  Object doGreaterThanOrEquals(double lhs, long rhs);

  Object doGreaterThanOrEquals(double lhs, float rhs);

  Object doGreaterThanOrEquals(double lhs, double rhs);

  Object doGreaterThanOrEquals(double lhs, BigInteger rhs);

  Object doGreaterThanOrEquals(double lhs, BigDecimal rhs);

  Object doGreaterThanOrEquals(BigInteger lhs, byte rhs);

  Object doGreaterThanOrEquals(BigInteger lhs, char rhs);

  Object doGreaterThanOrEquals(BigInteger lhs, short rhs);

  Object doGreaterThanOrEquals(BigInteger lhs, int rhs);

  Object doGreaterThanOrEquals(BigInteger lhs, long rhs);

  Object doGreaterThanOrEquals(BigInteger lhs, float rhs);

  Object doGreaterThanOrEquals(BigInteger lhs, double rhs);

  Object doGreaterThanOrEquals(BigInteger lhs, BigInteger rhs);

  Object doGreaterThanOrEquals(BigInteger lhs, BigDecimal rhs);

  Object doGreaterThanOrEquals(BigDecimal lhs, byte rhs);

  Object doGreaterThanOrEquals(BigDecimal lhs, char rhs);

  Object doGreaterThanOrEquals(BigDecimal lhs, short rhs);

  Object doGreaterThanOrEquals(BigDecimal lhs, int rhs);

  Object doGreaterThanOrEquals(BigDecimal lhs, long rhs);

  Object doGreaterThanOrEquals(BigDecimal lhs, float rhs);

  Object doGreaterThanOrEquals(BigDecimal lhs, double rhs);

  Object doGreaterThanOrEquals(BigDecimal lhs, BigInteger rhs);

  Object doGreaterThanOrEquals(BigDecimal lhs, BigDecimal rhs);

  Object doGreaterThanOrEquals(Object lhs, byte rhs);

  Object doGreaterThanOrEquals(Object lhs, char rhs);

  Object doGreaterThanOrEquals(Object lhs, short rhs);

  Object doGreaterThanOrEquals(Object lhs, int rhs);

  Object doGreaterThanOrEquals(Object lhs, long rhs);

  Object doGreaterThanOrEquals(Object lhs, float rhs);

  Object doGreaterThanOrEquals(Object lhs, double rhs);

  Object doGreaterThanOrEquals(Object lhs, BigInteger rhs);

  Object doGreaterThanOrEquals(Object lhs, BigDecimal rhs);

  Object doReverseGreaterThanOrEquals(byte lhs, Object rhs);

  Object doReverseGreaterThanOrEquals(char lhs, Object rhs);

  Object doReverseGreaterThanOrEquals(short lhs, Object rhs);

  Object doReverseGreaterThanOrEquals(int lhs, Object rhs);

  Object doReverseGreaterThanOrEquals(long lhs, Object rhs);

  Object doReverseGreaterThanOrEquals(float lhs, Object rhs);

  Object doReverseGreaterThanOrEquals(double lhs, Object rhs);

  Object doReverseGreaterThanOrEquals(BigInteger lhs, Object rhs);

  Object doReverseGreaterThanOrEquals(BigDecimal lhs, Object rhs);
}
