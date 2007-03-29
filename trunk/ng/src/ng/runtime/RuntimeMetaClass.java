package ng.runtime;

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

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author John Wilson tug@wilson.co.uk
 *
 */
public interface RuntimeMetaClass extends MetaClass {
  /**
   * @param theClass
   * @return The MetaClass which represents the behaviour of this class
   */
  RuntimeMetaClass createMetaClassFor(Class theClass);
  
  /**
   * @return
   */
  InternalMetaClass getInternalMetaClass();

  /**
   * @param internalMetaClass
   */
  void setInternalMetaClass(InternalMetaClass internalMetaClass);
  
  /**
   * @param instance
   * @param methodName
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName);
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, Object p1);
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, Object p1, Object p2);
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, Object p1, Object p2, Object p3);
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, Object p1, Object p2, Object p3, Object p4);
  
  /**
   * @param instance
   * @return
   */
  Object callQuick(Object instance);
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, Object p1);
  
  /**
   * @param instance
   * @param p1
   * @param p2
   * @return
   */
  Object callQuick(Object instance, Object p1, Object p2);
  
  /**
   * @param instance
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  Object callQuick(Object instance, Object p1, Object p2, Object p3);
  
  /**
   * @param instance
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  Object callQuick(Object instance, Object p1, Object p2, Object p3, Object p4);
  
  /**
   * @param instance
   * @return
   */
  Object complement(int instance);
  
  /**
   * @param instance
   * @return
   */
  Object complement(long instance);
  
  /**
   * @param instance
   * @return
   */
  Object complement(BigInteger instance);

  /**
   * @param instance
   * @return
   */
  Object not(boolean instance);

  /**
   * @param instance
   * @return
   */
  Object unaryPlus(int instance);
  
  /**
   * @param instance
   * @return
   */
  Object unaryPlus(long instance);
  
  /**
   * @param instance
   * @return
   */
  Object unaryPlus(float instance);
  
  /**
   * @param instance
   * @return
   */
  Object unaryPlus(double instance);
  
  /**
   * @param instance
   * @return
   */
  Object unaryPlus(BigInteger instance);
  
  /**
   * @param instance
   * @return
   */
  Object unaryPlus(BigDecimal instance);

  /**
   * @param instance
   * @return
   */
  Object unaryMinus(int instance);
  
  /**
   * @param instance
   * @return
   */
  Object unaryMinus(long instance);
  
  /**
   * @param instance
   * @return
   */
  Object unaryMinus(float instance);
  
  /**
   * @param instance
   * @return
   */
  Object unaryMinus(double instance);
  
  /**
   * @param instance
   * @return
   */
  Object unaryMinus(BigInteger instance);
  
  /**
   * @param instance
   * @return
   */
  Object unaryMinus(BigDecimal instance);
 
  /**
   * @param instance
   * @param index
   * @return
   */
  Object getAt(Object instance, int index);
  
  /**
   * @param instance
   * @param index
   * @return
   */
  Object getAt(Object instance, BigInteger index);
  
  /**
   * @param instance
   * @param index
   */
  Object putAt(Object instance, int index);
  
  /**
   * @param instance
   * @param index
   */
  Object putAt(Object instance, BigInteger index); 

  /**
   * @param instance
   * @return
   */
  Object prefixIncrement(int instance);
  
  /**
   * @param instance
   * @return
   */
  Object prefixIncrement(long instance);
  
  /**
   * @param instance
   * @return
   */
  Object prefixIncrement(float instance);
  
  /**
   * @param instance
   * @return
   */
  Object prefixIncrement(double instance);
  
  /**
   * @param instance
   * @return
   */
  Object prefixIncrement(BigInteger instance);
  
  /**
   * @param instance
   * @return
   */
  Object prefixIncrement(BigDecimal instance);

  /**
   * @param instance
   * @return
   */
  Object prefixDecrement(int instance);
  
  /**
   * @param instance
   * @return
   */
  Object prefixDecrement(long instance);
  
  /**
   * @param instance
   * @return
   */
  Object prefixDecrement(float instance);
  
  /**
   * @param instance
   * @return
   */
  Object prefixDecrement(double instance);
  
  /**
   * @param instance
   * @return
   */
  Object prefixDecrement(BigInteger instance);
  
  /**
   * @param instance
   * @return
   */
  Object prefixDecrement(BigDecimal instance);

  /**
   * @param instance
   * @return
   */
  Object postfixIncrement(int instance);
  
  /**
   * @param instance
   * @return
   */
  Object postfixIncrement(long instance);
  
  /**
   * @param instance
   * @return
   */
  Object postfixIncrement(float instance);
  
  /**
   * @param instance
   * @return
   */
  Object postfixIncrement(double instance);
  
  /**
   * @param instance
   * @return
   */
  Object postfixIncrement(BigInteger instance);
  
  /**
   * @param instance
   * @return
   */
  Object postfixIncrement(BigDecimal instance);

  /**
   * @param instance
   * @return
   */
  Object postfixDecrement(int instance);
  
  /**
   * @param instance
   * @return
   */
  Object postfixDecrement(long instance);
  
  /**
   * @param instance
   * @return
   */
  Object postfixDecrement(float instance);
  
  /**
   * @param instance
   * @return
   */
  Object postfixDecrement(double instance);
  
  /**
   * @param instance
   * @return
   */
  Object postfixDecrement(BigInteger instance);
  
  /**
   * @param instance
   * @return
   */
  Object postfixDecrement(BigDecimal instance);

  //
  //   Methods callable from compiler generated code for operator +
  //

  Object add(byte lhs, byte rhs);

  Object add(byte lhs, char rhs);

  Object add(byte lhs, short rhs);

  Object add(byte lhs, int rhs);

  Object add(byte lhs, long rhs);

  Object add(byte lhs, float rhs);

  Object add(byte lhs, double rhs);

  Object add(byte lhs, BigInteger rhs);

  Object add(byte lhs, BigDecimal rhs);

  Object add(char lhs, byte rhs);

  Object add(char lhs, char rhs);

  Object add(char lhs, short rhs);

  Object add(char lhs, int rhs);

  Object add(char lhs, long rhs);

  Object add(char lhs, float rhs);

  Object add(char lhs, double rhs);

  Object add(char lhs, BigInteger rhs);

  Object add(char lhs, BigDecimal rhs);

  Object add(short lhs, byte rhs);

  Object add(short lhs, char rhs);

  Object add(short lhs, short rhs);

  Object add(short lhs, int rhs);

  Object add(short lhs, long rhs);

  Object add(short lhs, float rhs);

  Object add(short lhs, double rhs);

  Object add(short lhs, BigInteger rhs);

  Object add(short lhs, BigDecimal rhs);

  Object add(int lhs, byte rhs);

  Object add(int lhs, char rhs);

  Object add(int lhs, short rhs);

  Object add(int lhs, int rhs);

  Object add(int lhs, long rhs);

  Object add(int lhs, float rhs);

  Object add(int lhs, double rhs);

  Object add(int lhs, BigInteger rhs);

  Object add(int lhs, BigDecimal rhs);

  Object add(long lhs, byte rhs);

  Object add(long lhs, char rhs);

  Object add(long lhs, short rhs);

  Object add(long lhs, int rhs);

  Object add(long lhs, long rhs);

  Object add(long lhs, float rhs);

  Object add(long lhs, double rhs);

  Object add(long lhs, BigInteger rhs);

  Object add(long lhs, BigDecimal rhs);

  Object add(float lhs, byte rhs);

  Object add(float lhs, char rhs);

  Object add(float lhs, short rhs);

  Object add(float lhs, int rhs);

  Object add(float lhs, long rhs);

  Object add(float lhs, float rhs);

  Object add(float lhs, double rhs);

  Object add(float lhs, BigInteger rhs);

  Object add(float lhs, BigDecimal rhs);

  Object add(double lhs, byte rhs);

  Object add(double lhs, char rhs);

  Object add(double lhs, short rhs);

  Object add(double lhs, int rhs);

  Object add(double lhs, long rhs);

  Object add(double lhs, float rhs);

  Object add(double lhs, double rhs);

  Object add(double lhs, BigInteger rhs);

  Object add(double lhs, BigDecimal rhs);

  Object add(BigInteger lhs, byte rhs);

  Object add(BigInteger lhs, char rhs);

  Object add(BigInteger lhs, short rhs);

  Object add(BigInteger lhs, int rhs);

  Object add(BigInteger lhs, long rhs);

  Object add(BigInteger lhs, float rhs);

  Object add(BigInteger lhs, double rhs);

  Object add(BigInteger lhs, BigInteger rhs);

  Object add(BigInteger lhs, BigDecimal rhs);

  Object add(BigDecimal lhs, byte rhs);

  Object add(BigDecimal lhs, char rhs);

  Object add(BigDecimal lhs, short rhs);

  Object add(BigDecimal lhs, int rhs);

  Object add(BigDecimal lhs, long rhs);

  Object add(BigDecimal lhs, float rhs);

  Object add(BigDecimal lhs, double rhs);

  Object add(BigDecimal lhs, BigInteger rhs);

  Object add(BigDecimal lhs, BigDecimal rhs);

  Object add(Object lhs, byte rhs);

  Object add(Object lhs, char rhs);

  Object add(Object lhs, short rhs);

  Object add(Object lhs, int rhs);

  Object add(Object lhs, long rhs);

  Object add(Object lhs, float rhs);

  Object add(Object lhs, double rhs);

  Object add(Object lhs, BigInteger rhs);

  Object add(Object lhs, BigDecimal rhs);

  Object reverseAdd(byte lhs, Object rhs);

  Object reverseAdd(char lhs, Object rhs);

  Object reverseAdd(short lhs, Object rhs);

  Object reverseAdd(int lhs, Object rhs);

  Object reverseAdd(long lhs, Object rhs);

  Object reverseAdd(float lhs, Object rhs);

  Object reverseAdd(double lhs, Object rhs);

  Object reverseAdd(BigInteger lhs, Object rhs);

  Object reverseAdd(BigDecimal lhs, Object rhs);

  //
  //   Methods callable from compiler generated code for operator +=
  //

  Object addEquals(byte lhs, byte rhs);

  Object addEquals(byte lhs, char rhs);

  Object addEquals(byte lhs, short rhs);

  Object addEquals(byte lhs, int rhs);

  Object addEquals(byte lhs, long rhs);

  Object addEquals(byte lhs, float rhs);

  Object addEquals(byte lhs, double rhs);

  Object addEquals(byte lhs, BigInteger rhs);

  Object addEquals(byte lhs, BigDecimal rhs);

  Object addEquals(char lhs, byte rhs);

  Object addEquals(char lhs, char rhs);

  Object addEquals(char lhs, short rhs);

  Object addEquals(char lhs, int rhs);

  Object addEquals(char lhs, long rhs);

  Object addEquals(char lhs, float rhs);

  Object addEquals(char lhs, double rhs);

  Object addEquals(char lhs, BigInteger rhs);

  Object addEquals(char lhs, BigDecimal rhs);

  Object addEquals(short lhs, byte rhs);

  Object addEquals(short lhs, char rhs);

  Object addEquals(short lhs, short rhs);

  Object addEquals(short lhs, int rhs);

  Object addEquals(short lhs, long rhs);

  Object addEquals(short lhs, float rhs);

  Object addEquals(short lhs, double rhs);

  Object addEquals(short lhs, BigInteger rhs);

  Object addEquals(short lhs, BigDecimal rhs);

  Object addEquals(int lhs, byte rhs);

  Object addEquals(int lhs, char rhs);

  Object addEquals(int lhs, short rhs);

  Object addEquals(int lhs, int rhs);

  Object addEquals(int lhs, long rhs);

  Object addEquals(int lhs, float rhs);

  Object addEquals(int lhs, double rhs);

  Object addEquals(int lhs, BigInteger rhs);

  Object addEquals(int lhs, BigDecimal rhs);

  Object addEquals(long lhs, byte rhs);

  Object addEquals(long lhs, char rhs);

  Object addEquals(long lhs, short rhs);

  Object addEquals(long lhs, int rhs);

  Object addEquals(long lhs, long rhs);

  Object addEquals(long lhs, float rhs);

  Object addEquals(long lhs, double rhs);

  Object addEquals(long lhs, BigInteger rhs);

  Object addEquals(long lhs, BigDecimal rhs);

  Object addEquals(float lhs, byte rhs);

  Object addEquals(float lhs, char rhs);

  Object addEquals(float lhs, short rhs);

  Object addEquals(float lhs, int rhs);

  Object addEquals(float lhs, long rhs);

  Object addEquals(float lhs, float rhs);

  Object addEquals(float lhs, double rhs);

  Object addEquals(float lhs, BigInteger rhs);

  Object addEquals(float lhs, BigDecimal rhs);

  Object addEquals(double lhs, byte rhs);

  Object addEquals(double lhs, char rhs);

  Object addEquals(double lhs, short rhs);

  Object addEquals(double lhs, int rhs);

  Object addEquals(double lhs, long rhs);

  Object addEquals(double lhs, float rhs);

  Object addEquals(double lhs, double rhs);

  Object addEquals(double lhs, BigInteger rhs);

  Object addEquals(double lhs, BigDecimal rhs);

  Object addEquals(BigInteger lhs, byte rhs);

  Object addEquals(BigInteger lhs, char rhs);

  Object addEquals(BigInteger lhs, short rhs);

  Object addEquals(BigInteger lhs, int rhs);

  Object addEquals(BigInteger lhs, long rhs);

  Object addEquals(BigInteger lhs, float rhs);

  Object addEquals(BigInteger lhs, double rhs);

  Object addEquals(BigInteger lhs, BigInteger rhs);

  Object addEquals(BigInteger lhs, BigDecimal rhs);

  Object addEquals(BigDecimal lhs, byte rhs);

  Object addEquals(BigDecimal lhs, char rhs);

  Object addEquals(BigDecimal lhs, short rhs);

  Object addEquals(BigDecimal lhs, int rhs);

  Object addEquals(BigDecimal lhs, long rhs);

  Object addEquals(BigDecimal lhs, float rhs);

  Object addEquals(BigDecimal lhs, double rhs);

  Object addEquals(BigDecimal lhs, BigInteger rhs);

  Object addEquals(BigDecimal lhs, BigDecimal rhs);

  Object addEquals(Object lhs, byte rhs);

  Object addEquals(Object lhs, char rhs);

  Object addEquals(Object lhs, short rhs);

  Object addEquals(Object lhs, int rhs);

  Object addEquals(Object lhs, long rhs);

  Object addEquals(Object lhs, float rhs);

  Object addEquals(Object lhs, double rhs);

  Object addEquals(Object lhs, BigInteger rhs);

  Object addEquals(Object lhs, BigDecimal rhs);

  Object reverseAddEquals(byte lhs, Object rhs);

  Object reverseAddEquals(char lhs, Object rhs);

  Object reverseAddEquals(short lhs, Object rhs);

  Object reverseAddEquals(int lhs, Object rhs);

  Object reverseAddEquals(long lhs, Object rhs);

  Object reverseAddEquals(float lhs, Object rhs);

  Object reverseAddEquals(double lhs, Object rhs);

  Object reverseAddEquals(BigInteger lhs, Object rhs);

  Object reverseAddEquals(BigDecimal lhs, Object rhs);

  //
  //   Methods callable from compiler generated code for operator -
  //

  Object subtract(byte lhs, byte rhs);

  Object subtract(byte lhs, char rhs);

  Object subtract(byte lhs, short rhs);

  Object subtract(byte lhs, int rhs);

  Object subtract(byte lhs, long rhs);

  Object subtract(byte lhs, float rhs);

  Object subtract(byte lhs, double rhs);

  Object subtract(byte lhs, BigInteger rhs);

  Object subtract(byte lhs, BigDecimal rhs);

  Object subtract(char lhs, byte rhs);

  Object subtract(char lhs, char rhs);

  Object subtract(char lhs, short rhs);

  Object subtract(char lhs, int rhs);

  Object subtract(char lhs, long rhs);

  Object subtract(char lhs, float rhs);

  Object subtract(char lhs, double rhs);

  Object subtract(char lhs, BigInteger rhs);

  Object subtract(char lhs, BigDecimal rhs);

  Object subtract(short lhs, byte rhs);

  Object subtract(short lhs, char rhs);

  Object subtract(short lhs, short rhs);

  Object subtract(short lhs, int rhs);

  Object subtract(short lhs, long rhs);

  Object subtract(short lhs, float rhs);

  Object subtract(short lhs, double rhs);

  Object subtract(short lhs, BigInteger rhs);

  Object subtract(short lhs, BigDecimal rhs);

  Object subtract(int lhs, byte rhs);

  Object subtract(int lhs, char rhs);

  Object subtract(int lhs, short rhs);

  Object subtract(int lhs, int rhs);

  Object subtract(int lhs, long rhs);

  Object subtract(int lhs, float rhs);

  Object subtract(int lhs, double rhs);

  Object subtract(int lhs, BigInteger rhs);

  Object subtract(int lhs, BigDecimal rhs);

  Object subtract(long lhs, byte rhs);

  Object subtract(long lhs, char rhs);

  Object subtract(long lhs, short rhs);

  Object subtract(long lhs, int rhs);

  Object subtract(long lhs, long rhs);

  Object subtract(long lhs, float rhs);

  Object subtract(long lhs, double rhs);

  Object subtract(long lhs, BigInteger rhs);

  Object subtract(long lhs, BigDecimal rhs);

  Object subtract(float lhs, byte rhs);

  Object subtract(float lhs, char rhs);

  Object subtract(float lhs, short rhs);

  Object subtract(float lhs, int rhs);

  Object subtract(float lhs, long rhs);

  Object subtract(float lhs, float rhs);

  Object subtract(float lhs, double rhs);

  Object subtract(float lhs, BigInteger rhs);

  Object subtract(float lhs, BigDecimal rhs);

  Object subtract(double lhs, byte rhs);

  Object subtract(double lhs, char rhs);

  Object subtract(double lhs, short rhs);

  Object subtract(double lhs, int rhs);

  Object subtract(double lhs, long rhs);

  Object subtract(double lhs, float rhs);

  Object subtract(double lhs, double rhs);

  Object subtract(double lhs, BigInteger rhs);

  Object subtract(double lhs, BigDecimal rhs);

  Object subtract(BigInteger lhs, byte rhs);

  Object subtract(BigInteger lhs, char rhs);

  Object subtract(BigInteger lhs, short rhs);

  Object subtract(BigInteger lhs, int rhs);

  Object subtract(BigInteger lhs, long rhs);

  Object subtract(BigInteger lhs, float rhs);

  Object subtract(BigInteger lhs, double rhs);

  Object subtract(BigInteger lhs, BigInteger rhs);

  Object subtract(BigInteger lhs, BigDecimal rhs);

  Object subtract(BigDecimal lhs, byte rhs);

  Object subtract(BigDecimal lhs, char rhs);

  Object subtract(BigDecimal lhs, short rhs);

  Object subtract(BigDecimal lhs, int rhs);

  Object subtract(BigDecimal lhs, long rhs);

  Object subtract(BigDecimal lhs, float rhs);

  Object subtract(BigDecimal lhs, double rhs);

  Object subtract(BigDecimal lhs, BigInteger rhs);

  Object subtract(BigDecimal lhs, BigDecimal rhs);

  Object subtract(Object lhs, byte rhs);

  Object subtract(Object lhs, char rhs);

  Object subtract(Object lhs, short rhs);

  Object subtract(Object lhs, int rhs);

  Object subtract(Object lhs, long rhs);

  Object subtract(Object lhs, float rhs);

  Object subtract(Object lhs, double rhs);

  Object subtract(Object lhs, BigInteger rhs);

  Object subtract(Object lhs, BigDecimal rhs);

  Object reverseSubtract(byte lhs, Object rhs);

  Object reverseSubtract(char lhs, Object rhs);

  Object reverseSubtract(short lhs, Object rhs);

  Object reverseSubtract(int lhs, Object rhs);

  Object reverseSubtract(long lhs, Object rhs);

  Object reverseSubtract(float lhs, Object rhs);

  Object reverseSubtract(double lhs, Object rhs);

  Object reverseSubtract(BigInteger lhs, Object rhs);

  Object reverseSubtract(BigDecimal lhs, Object rhs);

  //
  //   Methods callable from compiler generated code for operator -=
  //

  Object subtractEquals(byte lhs, byte rhs);

  Object subtractEquals(byte lhs, char rhs);

  Object subtractEquals(byte lhs, short rhs);

  Object subtractEquals(byte lhs, int rhs);

  Object subtractEquals(byte lhs, long rhs);

  Object subtractEquals(byte lhs, float rhs);

  Object subtractEquals(byte lhs, double rhs);

  Object subtractEquals(byte lhs, BigInteger rhs);

  Object subtractEquals(byte lhs, BigDecimal rhs);

  Object subtractEquals(char lhs, byte rhs);

  Object subtractEquals(char lhs, char rhs);

  Object subtractEquals(char lhs, short rhs);

  Object subtractEquals(char lhs, int rhs);

  Object subtractEquals(char lhs, long rhs);

  Object subtractEquals(char lhs, float rhs);

  Object subtractEquals(char lhs, double rhs);

  Object subtractEquals(char lhs, BigInteger rhs);

  Object subtractEquals(char lhs, BigDecimal rhs);

  Object subtractEquals(short lhs, byte rhs);

  Object subtractEquals(short lhs, char rhs);

  Object subtractEquals(short lhs, short rhs);

  Object subtractEquals(short lhs, int rhs);

  Object subtractEquals(short lhs, long rhs);

  Object subtractEquals(short lhs, float rhs);

  Object subtractEquals(short lhs, double rhs);

  Object subtractEquals(short lhs, BigInteger rhs);

  Object subtractEquals(short lhs, BigDecimal rhs);

  Object subtractEquals(int lhs, byte rhs);

  Object subtractEquals(int lhs, char rhs);

  Object subtractEquals(int lhs, short rhs);

  Object subtractEquals(int lhs, int rhs);

  Object subtractEquals(int lhs, long rhs);

  Object subtractEquals(int lhs, float rhs);

  Object subtractEquals(int lhs, double rhs);

  Object subtractEquals(int lhs, BigInteger rhs);

  Object subtractEquals(int lhs, BigDecimal rhs);

  Object subtractEquals(long lhs, byte rhs);

  Object subtractEquals(long lhs, char rhs);

  Object subtractEquals(long lhs, short rhs);

  Object subtractEquals(long lhs, int rhs);

  Object subtractEquals(long lhs, long rhs);

  Object subtractEquals(long lhs, float rhs);

  Object subtractEquals(long lhs, double rhs);

  Object subtractEquals(long lhs, BigInteger rhs);

  Object subtractEquals(long lhs, BigDecimal rhs);

  Object subtractEquals(float lhs, byte rhs);

  Object subtractEquals(float lhs, char rhs);

  Object subtractEquals(float lhs, short rhs);

  Object subtractEquals(float lhs, int rhs);

  Object subtractEquals(float lhs, long rhs);

  Object subtractEquals(float lhs, float rhs);

  Object subtractEquals(float lhs, double rhs);

  Object subtractEquals(float lhs, BigInteger rhs);

  Object subtractEquals(float lhs, BigDecimal rhs);

  Object subtractEquals(double lhs, byte rhs);

  Object subtractEquals(double lhs, char rhs);

  Object subtractEquals(double lhs, short rhs);

  Object subtractEquals(double lhs, int rhs);

  Object subtractEquals(double lhs, long rhs);

  Object subtractEquals(double lhs, float rhs);

  Object subtractEquals(double lhs, double rhs);

  Object subtractEquals(double lhs, BigInteger rhs);

  Object subtractEquals(double lhs, BigDecimal rhs);

  Object subtractEquals(BigInteger lhs, byte rhs);

  Object subtractEquals(BigInteger lhs, char rhs);

  Object subtractEquals(BigInteger lhs, short rhs);

  Object subtractEquals(BigInteger lhs, int rhs);

  Object subtractEquals(BigInteger lhs, long rhs);

  Object subtractEquals(BigInteger lhs, float rhs);

  Object subtractEquals(BigInteger lhs, double rhs);

  Object subtractEquals(BigInteger lhs, BigInteger rhs);

  Object subtractEquals(BigInteger lhs, BigDecimal rhs);

  Object subtractEquals(BigDecimal lhs, byte rhs);

  Object subtractEquals(BigDecimal lhs, char rhs);

  Object subtractEquals(BigDecimal lhs, short rhs);

  Object subtractEquals(BigDecimal lhs, int rhs);

  Object subtractEquals(BigDecimal lhs, long rhs);

  Object subtractEquals(BigDecimal lhs, float rhs);

  Object subtractEquals(BigDecimal lhs, double rhs);

  Object subtractEquals(BigDecimal lhs, BigInteger rhs);

  Object subtractEquals(BigDecimal lhs, BigDecimal rhs);

  Object subtractEquals(Object lhs, byte rhs);

  Object subtractEquals(Object lhs, char rhs);

  Object subtractEquals(Object lhs, short rhs);

  Object subtractEquals(Object lhs, int rhs);

  Object subtractEquals(Object lhs, long rhs);

  Object subtractEquals(Object lhs, float rhs);

  Object subtractEquals(Object lhs, double rhs);

  Object subtractEquals(Object lhs, BigInteger rhs);

  Object subtractEquals(Object lhs, BigDecimal rhs);

  Object reverseSubtractEquals(byte lhs, Object rhs);

  Object reverseSubtractEquals(char lhs, Object rhs);

  Object reverseSubtractEquals(short lhs, Object rhs);

  Object reverseSubtractEquals(int lhs, Object rhs);

  Object reverseSubtractEquals(long lhs, Object rhs);

  Object reverseSubtractEquals(float lhs, Object rhs);

  Object reverseSubtractEquals(double lhs, Object rhs);

  Object reverseSubtractEquals(BigInteger lhs, Object rhs);

  Object reverseSubtractEquals(BigDecimal lhs, Object rhs);

  //
  //   Methods callable from compiler generated code for operator *
  //

  Object multiply(byte lhs, byte rhs);

  Object multiply(byte lhs, char rhs);

  Object multiply(byte lhs, short rhs);

  Object multiply(byte lhs, int rhs);

  Object multiply(byte lhs, long rhs);

  Object multiply(byte lhs, float rhs);

  Object multiply(byte lhs, double rhs);

  Object multiply(byte lhs, BigInteger rhs);

  Object multiply(byte lhs, BigDecimal rhs);

  Object multiply(char lhs, byte rhs);

  Object multiply(char lhs, char rhs);

  Object multiply(char lhs, short rhs);

  Object multiply(char lhs, int rhs);

  Object multiply(char lhs, long rhs);

  Object multiply(char lhs, float rhs);

  Object multiply(char lhs, double rhs);

  Object multiply(char lhs, BigInteger rhs);

  Object multiply(char lhs, BigDecimal rhs);

  Object multiply(short lhs, byte rhs);

  Object multiply(short lhs, char rhs);

  Object multiply(short lhs, short rhs);

  Object multiply(short lhs, int rhs);

  Object multiply(short lhs, long rhs);

  Object multiply(short lhs, float rhs);

  Object multiply(short lhs, double rhs);

  Object multiply(short lhs, BigInteger rhs);

  Object multiply(short lhs, BigDecimal rhs);

  Object multiply(int lhs, byte rhs);

  Object multiply(int lhs, char rhs);

  Object multiply(int lhs, short rhs);

  Object multiply(int lhs, int rhs);

  Object multiply(int lhs, long rhs);

  Object multiply(int lhs, float rhs);

  Object multiply(int lhs, double rhs);

  Object multiply(int lhs, BigInteger rhs);

  Object multiply(int lhs, BigDecimal rhs);

  Object multiply(long lhs, byte rhs);

  Object multiply(long lhs, char rhs);

  Object multiply(long lhs, short rhs);

  Object multiply(long lhs, int rhs);

  Object multiply(long lhs, long rhs);

  Object multiply(long lhs, float rhs);

  Object multiply(long lhs, double rhs);

  Object multiply(long lhs, BigInteger rhs);

  Object multiply(long lhs, BigDecimal rhs);

  Object multiply(float lhs, byte rhs);

  Object multiply(float lhs, char rhs);

  Object multiply(float lhs, short rhs);

  Object multiply(float lhs, int rhs);

  Object multiply(float lhs, long rhs);

  Object multiply(float lhs, float rhs);

  Object multiply(float lhs, double rhs);

  Object multiply(float lhs, BigInteger rhs);

  Object multiply(float lhs, BigDecimal rhs);

  Object multiply(double lhs, byte rhs);

  Object multiply(double lhs, char rhs);

  Object multiply(double lhs, short rhs);

  Object multiply(double lhs, int rhs);

  Object multiply(double lhs, long rhs);

  Object multiply(double lhs, float rhs);

  Object multiply(double lhs, double rhs);

  Object multiply(double lhs, BigInteger rhs);

  Object multiply(double lhs, BigDecimal rhs);

  Object multiply(BigInteger lhs, byte rhs);

  Object multiply(BigInteger lhs, char rhs);

  Object multiply(BigInteger lhs, short rhs);

  Object multiply(BigInteger lhs, int rhs);

  Object multiply(BigInteger lhs, long rhs);

  Object multiply(BigInteger lhs, float rhs);

  Object multiply(BigInteger lhs, double rhs);

  Object multiply(BigInteger lhs, BigInteger rhs);

  Object multiply(BigInteger lhs, BigDecimal rhs);

  Object multiply(BigDecimal lhs, byte rhs);

  Object multiply(BigDecimal lhs, char rhs);

  Object multiply(BigDecimal lhs, short rhs);

  Object multiply(BigDecimal lhs, int rhs);

  Object multiply(BigDecimal lhs, long rhs);

  Object multiply(BigDecimal lhs, float rhs);

  Object multiply(BigDecimal lhs, double rhs);

  Object multiply(BigDecimal lhs, BigInteger rhs);

  Object multiply(BigDecimal lhs, BigDecimal rhs);

  Object multiply(Object lhs, byte rhs);

  Object multiply(Object lhs, char rhs);

  Object multiply(Object lhs, short rhs);

  Object multiply(Object lhs, int rhs);

  Object multiply(Object lhs, long rhs);

  Object multiply(Object lhs, float rhs);

  Object multiply(Object lhs, double rhs);

  Object multiply(Object lhs, BigInteger rhs);

  Object multiply(Object lhs, BigDecimal rhs);

  Object reverseMultiply(byte lhs, Object rhs);

  Object reverseMultiply(char lhs, Object rhs);

  Object reverseMultiply(short lhs, Object rhs);

  Object reverseMultiply(int lhs, Object rhs);

  Object reverseMultiply(long lhs, Object rhs);

  Object reverseMultiply(float lhs, Object rhs);

  Object reverseMultiply(double lhs, Object rhs);

  Object reverseMultiply(BigInteger lhs, Object rhs);

  Object reverseMultiply(BigDecimal lhs, Object rhs);

  //
  //   Methods callable from compiler generated code for operator *=
  //

  Object multiplyEquals(byte lhs, byte rhs);

  Object multiplyEquals(byte lhs, char rhs);

  Object multiplyEquals(byte lhs, short rhs);

  Object multiplyEquals(byte lhs, int rhs);

  Object multiplyEquals(byte lhs, long rhs);

  Object multiplyEquals(byte lhs, float rhs);

  Object multiplyEquals(byte lhs, double rhs);

  Object multiplyEquals(byte lhs, BigInteger rhs);

  Object multiplyEquals(byte lhs, BigDecimal rhs);

  Object multiplyEquals(char lhs, byte rhs);

  Object multiplyEquals(char lhs, char rhs);

  Object multiplyEquals(char lhs, short rhs);

  Object multiplyEquals(char lhs, int rhs);

  Object multiplyEquals(char lhs, long rhs);

  Object multiplyEquals(char lhs, float rhs);

  Object multiplyEquals(char lhs, double rhs);

  Object multiplyEquals(char lhs, BigInteger rhs);

  Object multiplyEquals(char lhs, BigDecimal rhs);

  Object multiplyEquals(short lhs, byte rhs);

  Object multiplyEquals(short lhs, char rhs);

  Object multiplyEquals(short lhs, short rhs);

  Object multiplyEquals(short lhs, int rhs);

  Object multiplyEquals(short lhs, long rhs);

  Object multiplyEquals(short lhs, float rhs);

  Object multiplyEquals(short lhs, double rhs);

  Object multiplyEquals(short lhs, BigInteger rhs);

  Object multiplyEquals(short lhs, BigDecimal rhs);

  Object multiplyEquals(int lhs, byte rhs);

  Object multiplyEquals(int lhs, char rhs);

  Object multiplyEquals(int lhs, short rhs);

  Object multiplyEquals(int lhs, int rhs);

  Object multiplyEquals(int lhs, long rhs);

  Object multiplyEquals(int lhs, float rhs);

  Object multiplyEquals(int lhs, double rhs);

  Object multiplyEquals(int lhs, BigInteger rhs);

  Object multiplyEquals(int lhs, BigDecimal rhs);

  Object multiplyEquals(long lhs, byte rhs);

  Object multiplyEquals(long lhs, char rhs);

  Object multiplyEquals(long lhs, short rhs);

  Object multiplyEquals(long lhs, int rhs);

  Object multiplyEquals(long lhs, long rhs);

  Object multiplyEquals(long lhs, float rhs);

  Object multiplyEquals(long lhs, double rhs);

  Object multiplyEquals(long lhs, BigInteger rhs);

  Object multiplyEquals(long lhs, BigDecimal rhs);

  Object multiplyEquals(float lhs, byte rhs);

  Object multiplyEquals(float lhs, char rhs);

  Object multiplyEquals(float lhs, short rhs);

  Object multiplyEquals(float lhs, int rhs);

  Object multiplyEquals(float lhs, long rhs);

  Object multiplyEquals(float lhs, float rhs);

  Object multiplyEquals(float lhs, double rhs);

  Object multiplyEquals(float lhs, BigInteger rhs);

  Object multiplyEquals(float lhs, BigDecimal rhs);

  Object multiplyEquals(double lhs, byte rhs);

  Object multiplyEquals(double lhs, char rhs);

  Object multiplyEquals(double lhs, short rhs);

  Object multiplyEquals(double lhs, int rhs);

  Object multiplyEquals(double lhs, long rhs);

  Object multiplyEquals(double lhs, float rhs);

  Object multiplyEquals(double lhs, double rhs);

  Object multiplyEquals(double lhs, BigInteger rhs);

  Object multiplyEquals(double lhs, BigDecimal rhs);

  Object multiplyEquals(BigInteger lhs, byte rhs);

  Object multiplyEquals(BigInteger lhs, char rhs);

  Object multiplyEquals(BigInteger lhs, short rhs);

  Object multiplyEquals(BigInteger lhs, int rhs);

  Object multiplyEquals(BigInteger lhs, long rhs);

  Object multiplyEquals(BigInteger lhs, float rhs);

  Object multiplyEquals(BigInteger lhs, double rhs);

  Object multiplyEquals(BigInteger lhs, BigInteger rhs);

  Object multiplyEquals(BigInteger lhs, BigDecimal rhs);

  Object multiplyEquals(BigDecimal lhs, byte rhs);

  Object multiplyEquals(BigDecimal lhs, char rhs);

  Object multiplyEquals(BigDecimal lhs, short rhs);

  Object multiplyEquals(BigDecimal lhs, int rhs);

  Object multiplyEquals(BigDecimal lhs, long rhs);

  Object multiplyEquals(BigDecimal lhs, float rhs);

  Object multiplyEquals(BigDecimal lhs, double rhs);

  Object multiplyEquals(BigDecimal lhs, BigInteger rhs);

  Object multiplyEquals(BigDecimal lhs, BigDecimal rhs);

  Object multiplyEquals(Object lhs, byte rhs);

  Object multiplyEquals(Object lhs, char rhs);

  Object multiplyEquals(Object lhs, short rhs);

  Object multiplyEquals(Object lhs, int rhs);

  Object multiplyEquals(Object lhs, long rhs);

  Object multiplyEquals(Object lhs, float rhs);

  Object multiplyEquals(Object lhs, double rhs);

  Object multiplyEquals(Object lhs, BigInteger rhs);

  Object multiplyEquals(Object lhs, BigDecimal rhs);

  Object reverseMultiplyEquals(byte lhs, Object rhs);

  Object reverseMultiplyEquals(char lhs, Object rhs);

  Object reverseMultiplyEquals(short lhs, Object rhs);

  Object reverseMultiplyEquals(int lhs, Object rhs);

  Object reverseMultiplyEquals(long lhs, Object rhs);

  Object reverseMultiplyEquals(float lhs, Object rhs);

  Object reverseMultiplyEquals(double lhs, Object rhs);

  Object reverseMultiplyEquals(BigInteger lhs, Object rhs);

  Object reverseMultiplyEquals(BigDecimal lhs, Object rhs);

  //
  //   Methods callable from compiler generated code for operator /
  //

  Object divide(byte lhs, byte rhs);

  Object divide(byte lhs, char rhs);

  Object divide(byte lhs, short rhs);

  Object divide(byte lhs, int rhs);

  Object divide(byte lhs, long rhs);

  Object divide(byte lhs, float rhs);

  Object divide(byte lhs, double rhs);

  Object divide(byte lhs, BigInteger rhs);

  Object divide(byte lhs, BigDecimal rhs);

  Object divide(char lhs, byte rhs);

  Object divide(char lhs, char rhs);

  Object divide(char lhs, short rhs);

  Object divide(char lhs, int rhs);

  Object divide(char lhs, long rhs);

  Object divide(char lhs, float rhs);

  Object divide(char lhs, double rhs);

  Object divide(char lhs, BigInteger rhs);

  Object divide(char lhs, BigDecimal rhs);

  Object divide(short lhs, byte rhs);

  Object divide(short lhs, char rhs);

  Object divide(short lhs, short rhs);

  Object divide(short lhs, int rhs);

  Object divide(short lhs, long rhs);

  Object divide(short lhs, float rhs);

  Object divide(short lhs, double rhs);

  Object divide(short lhs, BigInteger rhs);

  Object divide(short lhs, BigDecimal rhs);

  Object divide(int lhs, byte rhs);

  Object divide(int lhs, char rhs);

  Object divide(int lhs, short rhs);

  Object divide(int lhs, int rhs);

  Object divide(int lhs, long rhs);

  Object divide(int lhs, float rhs);

  Object divide(int lhs, double rhs);

  Object divide(int lhs, BigInteger rhs);

  Object divide(int lhs, BigDecimal rhs);

  Object divide(long lhs, byte rhs);

  Object divide(long lhs, char rhs);

  Object divide(long lhs, short rhs);

  Object divide(long lhs, int rhs);

  Object divide(long lhs, long rhs);

  Object divide(long lhs, float rhs);

  Object divide(long lhs, double rhs);

  Object divide(long lhs, BigInteger rhs);

  Object divide(long lhs, BigDecimal rhs);

  Object divide(float lhs, byte rhs);

  Object divide(float lhs, char rhs);

  Object divide(float lhs, short rhs);

  Object divide(float lhs, int rhs);

  Object divide(float lhs, long rhs);

  Object divide(float lhs, float rhs);

  Object divide(float lhs, double rhs);

  Object divide(float lhs, BigInteger rhs);

  Object divide(float lhs, BigDecimal rhs);

  Object divide(double lhs, byte rhs);

  Object divide(double lhs, char rhs);

  Object divide(double lhs, short rhs);

  Object divide(double lhs, int rhs);

  Object divide(double lhs, long rhs);

  Object divide(double lhs, float rhs);

  Object divide(double lhs, double rhs);

  Object divide(double lhs, BigInteger rhs);

  Object divide(double lhs, BigDecimal rhs);

  Object divide(BigInteger lhs, byte rhs);

  Object divide(BigInteger lhs, char rhs);

  Object divide(BigInteger lhs, short rhs);

  Object divide(BigInteger lhs, int rhs);

  Object divide(BigInteger lhs, long rhs);

  Object divide(BigInteger lhs, float rhs);

  Object divide(BigInteger lhs, double rhs);

  Object divide(BigInteger lhs, BigInteger rhs);

  Object divide(BigInteger lhs, BigDecimal rhs);

  Object divide(BigDecimal lhs, byte rhs);

  Object divide(BigDecimal lhs, char rhs);

  Object divide(BigDecimal lhs, short rhs);

  Object divide(BigDecimal lhs, int rhs);

  Object divide(BigDecimal lhs, long rhs);

  Object divide(BigDecimal lhs, float rhs);

  Object divide(BigDecimal lhs, double rhs);

  Object divide(BigDecimal lhs, BigInteger rhs);

  Object divide(BigDecimal lhs, BigDecimal rhs);

  Object divide(Object lhs, byte rhs);

  Object divide(Object lhs, char rhs);

  Object divide(Object lhs, short rhs);

  Object divide(Object lhs, int rhs);

  Object divide(Object lhs, long rhs);

  Object divide(Object lhs, float rhs);

  Object divide(Object lhs, double rhs);

  Object divide(Object lhs, BigInteger rhs);

  Object divide(Object lhs, BigDecimal rhs);

  Object reverseDivide(byte lhs, Object rhs);

  Object reverseDivide(char lhs, Object rhs);

  Object reverseDivide(short lhs, Object rhs);

  Object reverseDivide(int lhs, Object rhs);

  Object reverseDivide(long lhs, Object rhs);

  Object reverseDivide(float lhs, Object rhs);

  Object reverseDivide(double lhs, Object rhs);

  Object reverseDivide(BigInteger lhs, Object rhs);

  Object reverseDivide(BigDecimal lhs, Object rhs);

  //
  //   Methods callable from compiler generated code for operator /=
  //

  Object divideEquals(byte lhs, byte rhs);

  Object divideEquals(byte lhs, char rhs);

  Object divideEquals(byte lhs, short rhs);

  Object divideEquals(byte lhs, int rhs);

  Object divideEquals(byte lhs, long rhs);

  Object divideEquals(byte lhs, float rhs);

  Object divideEquals(byte lhs, double rhs);

  Object divideEquals(byte lhs, BigInteger rhs);

  Object divideEquals(byte lhs, BigDecimal rhs);

  Object divideEquals(char lhs, byte rhs);

  Object divideEquals(char lhs, char rhs);

  Object divideEquals(char lhs, short rhs);

  Object divideEquals(char lhs, int rhs);

  Object divideEquals(char lhs, long rhs);

  Object divideEquals(char lhs, float rhs);

  Object divideEquals(char lhs, double rhs);

  Object divideEquals(char lhs, BigInteger rhs);

  Object divideEquals(char lhs, BigDecimal rhs);

  Object divideEquals(short lhs, byte rhs);

  Object divideEquals(short lhs, char rhs);

  Object divideEquals(short lhs, short rhs);

  Object divideEquals(short lhs, int rhs);

  Object divideEquals(short lhs, long rhs);

  Object divideEquals(short lhs, float rhs);

  Object divideEquals(short lhs, double rhs);

  Object divideEquals(short lhs, BigInteger rhs);

  Object divideEquals(short lhs, BigDecimal rhs);

  Object divideEquals(int lhs, byte rhs);

  Object divideEquals(int lhs, char rhs);

  Object divideEquals(int lhs, short rhs);

  Object divideEquals(int lhs, int rhs);

  Object divideEquals(int lhs, long rhs);

  Object divideEquals(int lhs, float rhs);

  Object divideEquals(int lhs, double rhs);

  Object divideEquals(int lhs, BigInteger rhs);

  Object divideEquals(int lhs, BigDecimal rhs);

  Object divideEquals(long lhs, byte rhs);

  Object divideEquals(long lhs, char rhs);

  Object divideEquals(long lhs, short rhs);

  Object divideEquals(long lhs, int rhs);

  Object divideEquals(long lhs, long rhs);

  Object divideEquals(long lhs, float rhs);

  Object divideEquals(long lhs, double rhs);

  Object divideEquals(long lhs, BigInteger rhs);

  Object divideEquals(long lhs, BigDecimal rhs);

  Object divideEquals(float lhs, byte rhs);

  Object divideEquals(float lhs, char rhs);

  Object divideEquals(float lhs, short rhs);

  Object divideEquals(float lhs, int rhs);

  Object divideEquals(float lhs, long rhs);

  Object divideEquals(float lhs, float rhs);

  Object divideEquals(float lhs, double rhs);

  Object divideEquals(float lhs, BigInteger rhs);

  Object divideEquals(float lhs, BigDecimal rhs);

  Object divideEquals(double lhs, byte rhs);

  Object divideEquals(double lhs, char rhs);

  Object divideEquals(double lhs, short rhs);

  Object divideEquals(double lhs, int rhs);

  Object divideEquals(double lhs, long rhs);

  Object divideEquals(double lhs, float rhs);

  Object divideEquals(double lhs, double rhs);

  Object divideEquals(double lhs, BigInteger rhs);

  Object divideEquals(double lhs, BigDecimal rhs);

  Object divideEquals(BigInteger lhs, byte rhs);

  Object divideEquals(BigInteger lhs, char rhs);

  Object divideEquals(BigInteger lhs, short rhs);

  Object divideEquals(BigInteger lhs, int rhs);

  Object divideEquals(BigInteger lhs, long rhs);

  Object divideEquals(BigInteger lhs, float rhs);

  Object divideEquals(BigInteger lhs, double rhs);

  Object divideEquals(BigInteger lhs, BigInteger rhs);

  Object divideEquals(BigInteger lhs, BigDecimal rhs);

  Object divideEquals(BigDecimal lhs, byte rhs);

  Object divideEquals(BigDecimal lhs, char rhs);

  Object divideEquals(BigDecimal lhs, short rhs);

  Object divideEquals(BigDecimal lhs, int rhs);

  Object divideEquals(BigDecimal lhs, long rhs);

  Object divideEquals(BigDecimal lhs, float rhs);

  Object divideEquals(BigDecimal lhs, double rhs);

  Object divideEquals(BigDecimal lhs, BigInteger rhs);

  Object divideEquals(BigDecimal lhs, BigDecimal rhs);

  Object divideEquals(Object lhs, byte rhs);

  Object divideEquals(Object lhs, char rhs);

  Object divideEquals(Object lhs, short rhs);

  Object divideEquals(Object lhs, int rhs);

  Object divideEquals(Object lhs, long rhs);

  Object divideEquals(Object lhs, float rhs);

  Object divideEquals(Object lhs, double rhs);

  Object divideEquals(Object lhs, BigInteger rhs);

  Object divideEquals(Object lhs, BigDecimal rhs);

  Object reverseDivideEquals(byte lhs, Object rhs);

  Object reverseDivideEquals(char lhs, Object rhs);

  Object reverseDivideEquals(short lhs, Object rhs);

  Object reverseDivideEquals(int lhs, Object rhs);

  Object reverseDivideEquals(long lhs, Object rhs);

  Object reverseDivideEquals(float lhs, Object rhs);

  Object reverseDivideEquals(double lhs, Object rhs);

  Object reverseDivideEquals(BigInteger lhs, Object rhs);

  Object reverseDivideEquals(BigDecimal lhs, Object rhs);

  //
  //   Methods callable from compiler generated code for operator %
  //

  Object remainder(byte lhs, byte rhs);

  Object remainder(byte lhs, char rhs);

  Object remainder(byte lhs, short rhs);

  Object remainder(byte lhs, int rhs);

  Object remainder(byte lhs, long rhs);

  Object remainder(byte lhs, BigInteger rhs);

  Object remainder(char lhs, byte rhs);

  Object remainder(char lhs, char rhs);

  Object remainder(char lhs, short rhs);

  Object remainder(char lhs, int rhs);

  Object remainder(char lhs, long rhs);

  Object remainder(char lhs, BigInteger rhs);

  Object remainder(short lhs, byte rhs);

  Object remainder(short lhs, char rhs);

  Object remainder(short lhs, short rhs);

  Object remainder(short lhs, int rhs);

  Object remainder(short lhs, long rhs);

  Object remainder(short lhs, BigInteger rhs);

  Object remainder(int lhs, byte rhs);

  Object remainder(int lhs, char rhs);

  Object remainder(int lhs, short rhs);

  Object remainder(int lhs, int rhs);

  Object remainder(int lhs, long rhs);

  Object remainder(int lhs, BigInteger rhs);

  Object remainder(long lhs, byte rhs);

  Object remainder(long lhs, char rhs);

  Object remainder(long lhs, short rhs);

  Object remainder(long lhs, int rhs);

  Object remainder(long lhs, long rhs);

  Object remainder(long lhs, BigInteger rhs);

  Object remainder(BigInteger lhs, byte rhs);

  Object remainder(BigInteger lhs, char rhs);

  Object remainder(BigInteger lhs, short rhs);

  Object remainder(BigInteger lhs, int rhs);

  Object remainder(BigInteger lhs, long rhs);

  Object remainder(BigInteger lhs, BigInteger rhs);

  Object remainder(Object lhs, byte rhs);

  Object remainder(Object lhs, char rhs);

  Object remainder(Object lhs, short rhs);

  Object remainder(Object lhs, int rhs);

  Object remainder(Object lhs, long rhs);

  Object remainder(Object lhs, BigInteger rhs);

  Object reverseRemainder(byte lhs, Object rhs);

  Object reverseRemainder(char lhs, Object rhs);

  Object reverseRemainder(short lhs, Object rhs);

  Object reverseRemainder(int lhs, Object rhs);

  Object reverseRemainder(long lhs, Object rhs);

  Object reverseRemainder(BigInteger lhs, Object rhs);

  //
  //   Methods callable from compiler generated code for operator %=
  //

  Object remainderEquals(byte lhs, byte rhs);

  Object remainderEquals(byte lhs, char rhs);

  Object remainderEquals(byte lhs, short rhs);

  Object remainderEquals(byte lhs, int rhs);

  Object remainderEquals(byte lhs, long rhs);

  Object remainderEquals(byte lhs, BigInteger rhs);

  Object remainderEquals(char lhs, byte rhs);

  Object remainderEquals(char lhs, char rhs);

  Object remainderEquals(char lhs, short rhs);

  Object remainderEquals(char lhs, int rhs);

  Object remainderEquals(char lhs, long rhs);

  Object remainderEquals(char lhs, BigInteger rhs);

  Object remainderEquals(short lhs, byte rhs);

  Object remainderEquals(short lhs, char rhs);

  Object remainderEquals(short lhs, short rhs);

  Object remainderEquals(short lhs, int rhs);

  Object remainderEquals(short lhs, long rhs);

  Object remainderEquals(short lhs, BigInteger rhs);

  Object remainderEquals(int lhs, byte rhs);

  Object remainderEquals(int lhs, char rhs);

  Object remainderEquals(int lhs, short rhs);

  Object remainderEquals(int lhs, int rhs);

  Object remainderEquals(int lhs, long rhs);

  Object remainderEquals(int lhs, BigInteger rhs);

  Object remainderEquals(long lhs, byte rhs);

  Object remainderEquals(long lhs, char rhs);

  Object remainderEquals(long lhs, short rhs);

  Object remainderEquals(long lhs, int rhs);

  Object remainderEquals(long lhs, long rhs);

  Object remainderEquals(long lhs, BigInteger rhs);

  Object remainderEquals(BigInteger lhs, byte rhs);

  Object remainderEquals(BigInteger lhs, char rhs);

  Object remainderEquals(BigInteger lhs, short rhs);

  Object remainderEquals(BigInteger lhs, int rhs);

  Object remainderEquals(BigInteger lhs, long rhs);

  Object remainderEquals(BigInteger lhs, BigInteger rhs);

  Object remainderEquals(Object lhs, byte rhs);

  Object remainderEquals(Object lhs, char rhs);

  Object remainderEquals(Object lhs, short rhs);

  Object remainderEquals(Object lhs, int rhs);

  Object remainderEquals(Object lhs, long rhs);

  Object remainderEquals(Object lhs, BigInteger rhs);

  Object reverseRemainderEquals(byte lhs, Object rhs);

  Object reverseRemainderEquals(char lhs, Object rhs);

  Object reverseRemainderEquals(short lhs, Object rhs);

  Object reverseRemainderEquals(int lhs, Object rhs);

  Object reverseRemainderEquals(long lhs, Object rhs);

  Object reverseRemainderEquals(BigInteger lhs, Object rhs);

  //
  //   Methods callable from compiler generated code for operator ÷
  //

  Object integerDivide(byte lhs, byte rhs);

  Object integerDivide(byte lhs, char rhs);

  Object integerDivide(byte lhs, short rhs);

  Object integerDivide(byte lhs, int rhs);

  Object integerDivide(byte lhs, long rhs);

  Object integerDivide(byte lhs, float rhs);

  Object integerDivide(byte lhs, double rhs);

  Object integerDivide(byte lhs, BigInteger rhs);

  Object integerDivide(byte lhs, BigDecimal rhs);

  Object integerDivide(char lhs, byte rhs);

  Object integerDivide(char lhs, char rhs);

  Object integerDivide(char lhs, short rhs);

  Object integerDivide(char lhs, int rhs);

  Object integerDivide(char lhs, long rhs);

  Object integerDivide(char lhs, float rhs);

  Object integerDivide(char lhs, double rhs);

  Object integerDivide(char lhs, BigInteger rhs);

  Object integerDivide(char lhs, BigDecimal rhs);

  Object integerDivide(short lhs, byte rhs);

  Object integerDivide(short lhs, char rhs);

  Object integerDivide(short lhs, short rhs);

  Object integerDivide(short lhs, int rhs);

  Object integerDivide(short lhs, long rhs);

  Object integerDivide(short lhs, float rhs);

  Object integerDivide(short lhs, double rhs);

  Object integerDivide(short lhs, BigInteger rhs);

  Object integerDivide(short lhs, BigDecimal rhs);

  Object integerDivide(int lhs, byte rhs);

  Object integerDivide(int lhs, char rhs);

  Object integerDivide(int lhs, short rhs);

  Object integerDivide(int lhs, int rhs);

  Object integerDivide(int lhs, long rhs);

  Object integerDivide(int lhs, float rhs);

  Object integerDivide(int lhs, double rhs);

  Object integerDivide(int lhs, BigInteger rhs);

  Object integerDivide(int lhs, BigDecimal rhs);

  Object integerDivide(long lhs, byte rhs);

  Object integerDivide(long lhs, char rhs);

  Object integerDivide(long lhs, short rhs);

  Object integerDivide(long lhs, int rhs);

  Object integerDivide(long lhs, long rhs);

  Object integerDivide(long lhs, float rhs);

  Object integerDivide(long lhs, double rhs);

  Object integerDivide(long lhs, BigInteger rhs);

  Object integerDivide(long lhs, BigDecimal rhs);

  Object integerDivide(float lhs, byte rhs);

  Object integerDivide(float lhs, char rhs);

  Object integerDivide(float lhs, short rhs);

  Object integerDivide(float lhs, int rhs);

  Object integerDivide(float lhs, long rhs);

  Object integerDivide(float lhs, float rhs);

  Object integerDivide(float lhs, double rhs);

  Object integerDivide(float lhs, BigInteger rhs);

  Object integerDivide(float lhs, BigDecimal rhs);

  Object integerDivide(double lhs, byte rhs);

  Object integerDivide(double lhs, char rhs);

  Object integerDivide(double lhs, short rhs);

  Object integerDivide(double lhs, int rhs);

  Object integerDivide(double lhs, long rhs);

  Object integerDivide(double lhs, float rhs);

  Object integerDivide(double lhs, double rhs);

  Object integerDivide(double lhs, BigInteger rhs);

  Object integerDivide(double lhs, BigDecimal rhs);

  Object integerDivide(BigInteger lhs, byte rhs);

  Object integerDivide(BigInteger lhs, char rhs);

  Object integerDivide(BigInteger lhs, short rhs);

  Object integerDivide(BigInteger lhs, int rhs);

  Object integerDivide(BigInteger lhs, long rhs);

  Object integerDivide(BigInteger lhs, float rhs);

  Object integerDivide(BigInteger lhs, double rhs);

  Object integerDivide(BigInteger lhs, BigInteger rhs);

  Object integerDivide(BigInteger lhs, BigDecimal rhs);

  Object integerDivide(BigDecimal lhs, byte rhs);

  Object integerDivide(BigDecimal lhs, char rhs);

  Object integerDivide(BigDecimal lhs, short rhs);

  Object integerDivide(BigDecimal lhs, int rhs);

  Object integerDivide(BigDecimal lhs, long rhs);

  Object integerDivide(BigDecimal lhs, float rhs);

  Object integerDivide(BigDecimal lhs, double rhs);

  Object integerDivide(BigDecimal lhs, BigInteger rhs);

  Object integerDivide(BigDecimal lhs, BigDecimal rhs);

  Object integerDivide(Object lhs, byte rhs);

  Object integerDivide(Object lhs, char rhs);

  Object integerDivide(Object lhs, short rhs);

  Object integerDivide(Object lhs, int rhs);

  Object integerDivide(Object lhs, long rhs);

  Object integerDivide(Object lhs, float rhs);

  Object integerDivide(Object lhs, double rhs);

  Object integerDivide(Object lhs, BigInteger rhs);

  Object integerDivide(Object lhs, BigDecimal rhs);

  Object reverseIntegerDivide(byte lhs, Object rhs);

  Object reverseIntegerDivide(char lhs, Object rhs);

  Object reverseIntegerDivide(short lhs, Object rhs);

  Object reverseIntegerDivide(int lhs, Object rhs);

  Object reverseIntegerDivide(long lhs, Object rhs);

  Object reverseIntegerDivide(float lhs, Object rhs);

  Object reverseIntegerDivide(double lhs, Object rhs);

  Object reverseIntegerDivide(BigInteger lhs, Object rhs);

  Object reverseIntegerDivide(BigDecimal lhs, Object rhs);

  //
  //   Methods callable from compiler generated code for operator ÷=
  //

  Object integerDivideEquals(byte lhs, byte rhs);

  Object integerDivideEquals(byte lhs, char rhs);

  Object integerDivideEquals(byte lhs, short rhs);

  Object integerDivideEquals(byte lhs, int rhs);

  Object integerDivideEquals(byte lhs, long rhs);

  Object integerDivideEquals(byte lhs, float rhs);

  Object integerDivideEquals(byte lhs, double rhs);

  Object integerDivideEquals(byte lhs, BigInteger rhs);

  Object integerDivideEquals(byte lhs, BigDecimal rhs);

  Object integerDivideEquals(char lhs, byte rhs);

  Object integerDivideEquals(char lhs, char rhs);

  Object integerDivideEquals(char lhs, short rhs);

  Object integerDivideEquals(char lhs, int rhs);

  Object integerDivideEquals(char lhs, long rhs);

  Object integerDivideEquals(char lhs, float rhs);

  Object integerDivideEquals(char lhs, double rhs);

  Object integerDivideEquals(char lhs, BigInteger rhs);

  Object integerDivideEquals(char lhs, BigDecimal rhs);

  Object integerDivideEquals(short lhs, byte rhs);

  Object integerDivideEquals(short lhs, char rhs);

  Object integerDivideEquals(short lhs, short rhs);

  Object integerDivideEquals(short lhs, int rhs);

  Object integerDivideEquals(short lhs, long rhs);

  Object integerDivideEquals(short lhs, float rhs);

  Object integerDivideEquals(short lhs, double rhs);

  Object integerDivideEquals(short lhs, BigInteger rhs);

  Object integerDivideEquals(short lhs, BigDecimal rhs);

  Object integerDivideEquals(int lhs, byte rhs);

  Object integerDivideEquals(int lhs, char rhs);

  Object integerDivideEquals(int lhs, short rhs);

  Object integerDivideEquals(int lhs, int rhs);

  Object integerDivideEquals(int lhs, long rhs);

  Object integerDivideEquals(int lhs, float rhs);

  Object integerDivideEquals(int lhs, double rhs);

  Object integerDivideEquals(int lhs, BigInteger rhs);

  Object integerDivideEquals(int lhs, BigDecimal rhs);

  Object integerDivideEquals(long lhs, byte rhs);

  Object integerDivideEquals(long lhs, char rhs);

  Object integerDivideEquals(long lhs, short rhs);

  Object integerDivideEquals(long lhs, int rhs);

  Object integerDivideEquals(long lhs, long rhs);

  Object integerDivideEquals(long lhs, float rhs);

  Object integerDivideEquals(long lhs, double rhs);

  Object integerDivideEquals(long lhs, BigInteger rhs);

  Object integerDivideEquals(long lhs, BigDecimal rhs);

  Object integerDivideEquals(float lhs, byte rhs);

  Object integerDivideEquals(float lhs, char rhs);

  Object integerDivideEquals(float lhs, short rhs);

  Object integerDivideEquals(float lhs, int rhs);

  Object integerDivideEquals(float lhs, long rhs);

  Object integerDivideEquals(float lhs, float rhs);

  Object integerDivideEquals(float lhs, double rhs);

  Object integerDivideEquals(float lhs, BigInteger rhs);

  Object integerDivideEquals(float lhs, BigDecimal rhs);

  Object integerDivideEquals(double lhs, byte rhs);

  Object integerDivideEquals(double lhs, char rhs);

  Object integerDivideEquals(double lhs, short rhs);

  Object integerDivideEquals(double lhs, int rhs);

  Object integerDivideEquals(double lhs, long rhs);

  Object integerDivideEquals(double lhs, float rhs);

  Object integerDivideEquals(double lhs, double rhs);

  Object integerDivideEquals(double lhs, BigInteger rhs);

  Object integerDivideEquals(double lhs, BigDecimal rhs);

  Object integerDivideEquals(BigInteger lhs, byte rhs);

  Object integerDivideEquals(BigInteger lhs, char rhs);

  Object integerDivideEquals(BigInteger lhs, short rhs);

  Object integerDivideEquals(BigInteger lhs, int rhs);

  Object integerDivideEquals(BigInteger lhs, long rhs);

  Object integerDivideEquals(BigInteger lhs, float rhs);

  Object integerDivideEquals(BigInteger lhs, double rhs);

  Object integerDivideEquals(BigInteger lhs, BigInteger rhs);

  Object integerDivideEquals(BigInteger lhs, BigDecimal rhs);

  Object integerDivideEquals(BigDecimal lhs, byte rhs);

  Object integerDivideEquals(BigDecimal lhs, char rhs);

  Object integerDivideEquals(BigDecimal lhs, short rhs);

  Object integerDivideEquals(BigDecimal lhs, int rhs);

  Object integerDivideEquals(BigDecimal lhs, long rhs);

  Object integerDivideEquals(BigDecimal lhs, float rhs);

  Object integerDivideEquals(BigDecimal lhs, double rhs);

  Object integerDivideEquals(BigDecimal lhs, BigInteger rhs);

  Object integerDivideEquals(BigDecimal lhs, BigDecimal rhs);

  Object integerDivideEquals(Object lhs, byte rhs);

  Object integerDivideEquals(Object lhs, char rhs);

  Object integerDivideEquals(Object lhs, short rhs);

  Object integerDivideEquals(Object lhs, int rhs);

  Object integerDivideEquals(Object lhs, long rhs);

  Object integerDivideEquals(Object lhs, float rhs);

  Object integerDivideEquals(Object lhs, double rhs);

  Object integerDivideEquals(Object lhs, BigInteger rhs);

  Object integerDivideEquals(Object lhs, BigDecimal rhs);

  Object reverseIntegerDivideEquals(byte lhs, Object rhs);

  Object reverseIntegerDivideEquals(char lhs, Object rhs);

  Object reverseIntegerDivideEquals(short lhs, Object rhs);

  Object reverseIntegerDivideEquals(int lhs, Object rhs);

  Object reverseIntegerDivideEquals(long lhs, Object rhs);

  Object reverseIntegerDivideEquals(float lhs, Object rhs);

  Object reverseIntegerDivideEquals(double lhs, Object rhs);

  Object reverseIntegerDivideEquals(BigInteger lhs, Object rhs);

  Object reverseIntegerDivideEquals(BigDecimal lhs, Object rhs);

  //
  //   Methods callable from compiler generated code for operator &
  //

  Object and(byte lhs, byte rhs);

  Object and(byte lhs, char rhs);

  Object and(byte lhs, short rhs);

  Object and(byte lhs, int rhs);

  Object and(byte lhs, long rhs);

  Object and(byte lhs, BigInteger rhs);

  Object and(char lhs, byte rhs);

  Object and(char lhs, char rhs);

  Object and(char lhs, short rhs);

  Object and(char lhs, int rhs);

  Object and(char lhs, long rhs);

  Object and(char lhs, BigInteger rhs);

  Object and(short lhs, byte rhs);

  Object and(short lhs, char rhs);

  Object and(short lhs, short rhs);

  Object and(short lhs, int rhs);

  Object and(short lhs, long rhs);

  Object and(short lhs, BigInteger rhs);

  Object and(int lhs, byte rhs);

  Object and(int lhs, char rhs);

  Object and(int lhs, short rhs);

  Object and(int lhs, int rhs);

  Object and(int lhs, long rhs);

  Object and(int lhs, BigInteger rhs);

  Object and(long lhs, byte rhs);

  Object and(long lhs, char rhs);

  Object and(long lhs, short rhs);

  Object and(long lhs, int rhs);

  Object and(long lhs, long rhs);

  Object and(long lhs, BigInteger rhs);

  Object and(BigInteger lhs, byte rhs);

  Object and(BigInteger lhs, char rhs);

  Object and(BigInteger lhs, short rhs);

  Object and(BigInteger lhs, int rhs);

  Object and(BigInteger lhs, long rhs);

  Object and(BigInteger lhs, BigInteger rhs);

  Object and(Object lhs, byte rhs);

  Object and(Object lhs, char rhs);

  Object and(Object lhs, short rhs);

  Object and(Object lhs, int rhs);

  Object and(Object lhs, long rhs);

  Object and(Object lhs, BigInteger rhs);

  Object reverseAnd(byte lhs, Object rhs);

  Object reverseAnd(char lhs, Object rhs);

  Object reverseAnd(short lhs, Object rhs);

  Object reverseAnd(int lhs, Object rhs);

  Object reverseAnd(long lhs, Object rhs);

  Object reverseAnd(BigInteger lhs, Object rhs);

  //
  //   Methods callable from compiler generated code for operator &=
  //

  Object andEquals(byte lhs, byte rhs);

  Object andEquals(byte lhs, char rhs);

  Object andEquals(byte lhs, short rhs);

  Object andEquals(byte lhs, int rhs);

  Object andEquals(byte lhs, long rhs);

  Object andEquals(byte lhs, BigInteger rhs);

  Object andEquals(char lhs, byte rhs);

  Object andEquals(char lhs, char rhs);

  Object andEquals(char lhs, short rhs);

  Object andEquals(char lhs, int rhs);

  Object andEquals(char lhs, long rhs);

  Object andEquals(char lhs, BigInteger rhs);

  Object andEquals(short lhs, byte rhs);

  Object andEquals(short lhs, char rhs);

  Object andEquals(short lhs, short rhs);

  Object andEquals(short lhs, int rhs);

  Object andEquals(short lhs, long rhs);

  Object andEquals(short lhs, BigInteger rhs);

  Object andEquals(int lhs, byte rhs);

  Object andEquals(int lhs, char rhs);

  Object andEquals(int lhs, short rhs);

  Object andEquals(int lhs, int rhs);

  Object andEquals(int lhs, long rhs);

  Object andEquals(int lhs, BigInteger rhs);

  Object andEquals(long lhs, byte rhs);

  Object andEquals(long lhs, char rhs);

  Object andEquals(long lhs, short rhs);

  Object andEquals(long lhs, int rhs);

  Object andEquals(long lhs, long rhs);

  Object andEquals(long lhs, BigInteger rhs);

  Object andEquals(BigInteger lhs, byte rhs);

  Object andEquals(BigInteger lhs, char rhs);

  Object andEquals(BigInteger lhs, short rhs);

  Object andEquals(BigInteger lhs, int rhs);

  Object andEquals(BigInteger lhs, long rhs);

  Object andEquals(BigInteger lhs, BigInteger rhs);

  Object andEquals(Object lhs, byte rhs);

  Object andEquals(Object lhs, char rhs);

  Object andEquals(Object lhs, short rhs);

  Object andEquals(Object lhs, int rhs);

  Object andEquals(Object lhs, long rhs);

  Object andEquals(Object lhs, BigInteger rhs);

  Object reverseAndEquals(byte lhs, Object rhs);

  Object reverseAndEquals(char lhs, Object rhs);

  Object reverseAndEquals(short lhs, Object rhs);

  Object reverseAndEquals(int lhs, Object rhs);

  Object reverseAndEquals(long lhs, Object rhs);

  Object reverseAndEquals(BigInteger lhs, Object rhs);

  //
  //   Methods callable from compiler generated code for operator |
  //

  Object or(byte lhs, byte rhs);

  Object or(byte lhs, char rhs);

  Object or(byte lhs, short rhs);

  Object or(byte lhs, int rhs);

  Object or(byte lhs, long rhs);

  Object or(byte lhs, BigInteger rhs);

  Object or(char lhs, byte rhs);

  Object or(char lhs, char rhs);

  Object or(char lhs, short rhs);

  Object or(char lhs, int rhs);

  Object or(char lhs, long rhs);

  Object or(char lhs, BigInteger rhs);

  Object or(short lhs, byte rhs);

  Object or(short lhs, char rhs);

  Object or(short lhs, short rhs);

  Object or(short lhs, int rhs);

  Object or(short lhs, long rhs);

  Object or(short lhs, BigInteger rhs);

  Object or(int lhs, byte rhs);

  Object or(int lhs, char rhs);

  Object or(int lhs, short rhs);

  Object or(int lhs, int rhs);

  Object or(int lhs, long rhs);

  Object or(int lhs, BigInteger rhs);

  Object or(long lhs, byte rhs);

  Object or(long lhs, char rhs);

  Object or(long lhs, short rhs);

  Object or(long lhs, int rhs);

  Object or(long lhs, long rhs);

  Object or(long lhs, BigInteger rhs);

  Object or(BigInteger lhs, byte rhs);

  Object or(BigInteger lhs, char rhs);

  Object or(BigInteger lhs, short rhs);

  Object or(BigInteger lhs, int rhs);

  Object or(BigInteger lhs, long rhs);

  Object or(BigInteger lhs, BigInteger rhs);

  Object or(Object lhs, byte rhs);

  Object or(Object lhs, char rhs);

  Object or(Object lhs, short rhs);

  Object or(Object lhs, int rhs);

  Object or(Object lhs, long rhs);

  Object or(Object lhs, BigInteger rhs);

  Object reverseOr(byte lhs, Object rhs);

  Object reverseOr(char lhs, Object rhs);

  Object reverseOr(short lhs, Object rhs);

  Object reverseOr(int lhs, Object rhs);

  Object reverseOr(long lhs, Object rhs);

  Object reverseOr(BigInteger lhs, Object rhs);

  //
  //   Methods callable from compiler generated code for operator |=
  //

  Object orEquals(byte lhs, byte rhs);

  Object orEquals(byte lhs, char rhs);

  Object orEquals(byte lhs, short rhs);

  Object orEquals(byte lhs, int rhs);

  Object orEquals(byte lhs, long rhs);

  Object orEquals(byte lhs, BigInteger rhs);

  Object orEquals(char lhs, byte rhs);

  Object orEquals(char lhs, char rhs);

  Object orEquals(char lhs, short rhs);

  Object orEquals(char lhs, int rhs);

  Object orEquals(char lhs, long rhs);

  Object orEquals(char lhs, BigInteger rhs);

  Object orEquals(short lhs, byte rhs);

  Object orEquals(short lhs, char rhs);

  Object orEquals(short lhs, short rhs);

  Object orEquals(short lhs, int rhs);

  Object orEquals(short lhs, long rhs);

  Object orEquals(short lhs, BigInteger rhs);

  Object orEquals(int lhs, byte rhs);

  Object orEquals(int lhs, char rhs);

  Object orEquals(int lhs, short rhs);

  Object orEquals(int lhs, int rhs);

  Object orEquals(int lhs, long rhs);

  Object orEquals(int lhs, BigInteger rhs);

  Object orEquals(long lhs, byte rhs);

  Object orEquals(long lhs, char rhs);

  Object orEquals(long lhs, short rhs);

  Object orEquals(long lhs, int rhs);

  Object orEquals(long lhs, long rhs);

  Object orEquals(long lhs, BigInteger rhs);

  Object orEquals(BigInteger lhs, byte rhs);

  Object orEquals(BigInteger lhs, char rhs);

  Object orEquals(BigInteger lhs, short rhs);

  Object orEquals(BigInteger lhs, int rhs);

  Object orEquals(BigInteger lhs, long rhs);

  Object orEquals(BigInteger lhs, BigInteger rhs);

  Object orEquals(Object lhs, byte rhs);

  Object orEquals(Object lhs, char rhs);

  Object orEquals(Object lhs, short rhs);

  Object orEquals(Object lhs, int rhs);

  Object orEquals(Object lhs, long rhs);

  Object orEquals(Object lhs, BigInteger rhs);

  Object reverseOrEquals(byte lhs, Object rhs);

  Object reverseOrEquals(char lhs, Object rhs);

  Object reverseOrEquals(short lhs, Object rhs);

  Object reverseOrEquals(int lhs, Object rhs);

  Object reverseOrEquals(long lhs, Object rhs);

  Object reverseOrEquals(BigInteger lhs, Object rhs);

  //
  //   Methods callable from compiler generated code for operator ^
  //

  Object xor(byte lhs, byte rhs);

  Object xor(byte lhs, char rhs);

  Object xor(byte lhs, short rhs);

  Object xor(byte lhs, int rhs);

  Object xor(byte lhs, long rhs);

  Object xor(byte lhs, BigInteger rhs);

  Object xor(char lhs, byte rhs);

  Object xor(char lhs, char rhs);

  Object xor(char lhs, short rhs);

  Object xor(char lhs, int rhs);

  Object xor(char lhs, long rhs);

  Object xor(char lhs, BigInteger rhs);

  Object xor(short lhs, byte rhs);

  Object xor(short lhs, char rhs);

  Object xor(short lhs, short rhs);

  Object xor(short lhs, int rhs);

  Object xor(short lhs, long rhs);

  Object xor(short lhs, BigInteger rhs);

  Object xor(int lhs, byte rhs);

  Object xor(int lhs, char rhs);

  Object xor(int lhs, short rhs);

  Object xor(int lhs, int rhs);

  Object xor(int lhs, long rhs);

  Object xor(int lhs, BigInteger rhs);

  Object xor(long lhs, byte rhs);

  Object xor(long lhs, char rhs);

  Object xor(long lhs, short rhs);

  Object xor(long lhs, int rhs);

  Object xor(long lhs, long rhs);

  Object xor(long lhs, BigInteger rhs);

  Object xor(BigInteger lhs, byte rhs);

  Object xor(BigInteger lhs, char rhs);

  Object xor(BigInteger lhs, short rhs);

  Object xor(BigInteger lhs, int rhs);

  Object xor(BigInteger lhs, long rhs);

  Object xor(BigInteger lhs, BigInteger rhs);

  Object xor(Object lhs, byte rhs);

  Object xor(Object lhs, char rhs);

  Object xor(Object lhs, short rhs);

  Object xor(Object lhs, int rhs);

  Object xor(Object lhs, long rhs);

  Object xor(Object lhs, BigInteger rhs);

  Object reverseXor(byte lhs, Object rhs);

  Object reverseXor(char lhs, Object rhs);

  Object reverseXor(short lhs, Object rhs);

  Object reverseXor(int lhs, Object rhs);

  Object reverseXor(long lhs, Object rhs);

  Object reverseXor(BigInteger lhs, Object rhs);

  //
  //   Methods callable from compiler generated code for operator ^=
  //

  Object xorEquals(byte lhs, byte rhs);

  Object xorEquals(byte lhs, char rhs);

  Object xorEquals(byte lhs, short rhs);

  Object xorEquals(byte lhs, int rhs);

  Object xorEquals(byte lhs, long rhs);

  Object xorEquals(byte lhs, BigInteger rhs);

  Object xorEquals(char lhs, byte rhs);

  Object xorEquals(char lhs, char rhs);

  Object xorEquals(char lhs, short rhs);

  Object xorEquals(char lhs, int rhs);

  Object xorEquals(char lhs, long rhs);

  Object xorEquals(char lhs, BigInteger rhs);

  Object xorEquals(short lhs, byte rhs);

  Object xorEquals(short lhs, char rhs);

  Object xorEquals(short lhs, short rhs);

  Object xorEquals(short lhs, int rhs);

  Object xorEquals(short lhs, long rhs);

  Object xorEquals(short lhs, BigInteger rhs);

  Object xorEquals(int lhs, byte rhs);

  Object xorEquals(int lhs, char rhs);

  Object xorEquals(int lhs, short rhs);

  Object xorEquals(int lhs, int rhs);

  Object xorEquals(int lhs, long rhs);

  Object xorEquals(int lhs, BigInteger rhs);

  Object xorEquals(long lhs, byte rhs);

  Object xorEquals(long lhs, char rhs);

  Object xorEquals(long lhs, short rhs);

  Object xorEquals(long lhs, int rhs);

  Object xorEquals(long lhs, long rhs);

  Object xorEquals(long lhs, BigInteger rhs);

  Object xorEquals(BigInteger lhs, byte rhs);

  Object xorEquals(BigInteger lhs, char rhs);

  Object xorEquals(BigInteger lhs, short rhs);

  Object xorEquals(BigInteger lhs, int rhs);

  Object xorEquals(BigInteger lhs, long rhs);

  Object xorEquals(BigInteger lhs, BigInteger rhs);

  Object xorEquals(Object lhs, byte rhs);

  Object xorEquals(Object lhs, char rhs);

  Object xorEquals(Object lhs, short rhs);

  Object xorEquals(Object lhs, int rhs);

  Object xorEquals(Object lhs, long rhs);

  Object xorEquals(Object lhs, BigInteger rhs);

  Object reverseXorEquals(byte lhs, Object rhs);

  Object reverseXorEquals(char lhs, Object rhs);

  Object reverseXorEquals(short lhs, Object rhs);

  Object reverseXorEquals(int lhs, Object rhs);

  Object reverseXorEquals(long lhs, Object rhs);

  Object reverseXorEquals(BigInteger lhs, Object rhs);

  //
  //   Methods callable from compiler generated code for operator <<
  //

  Object leftShift(byte lhs, byte rhs);

  Object leftShift(byte lhs, char rhs);

  Object leftShift(byte lhs, short rhs);

  Object leftShift(byte lhs, int rhs);

  Object leftShift(byte lhs, long rhs);

  Object leftShift(byte lhs, BigInteger rhs);

  Object leftShift(char lhs, byte rhs);

  Object leftShift(char lhs, char rhs);

  Object leftShift(char lhs, short rhs);

  Object leftShift(char lhs, int rhs);

  Object leftShift(char lhs, long rhs);

  Object leftShift(char lhs, BigInteger rhs);

  Object leftShift(short lhs, byte rhs);

  Object leftShift(short lhs, char rhs);

  Object leftShift(short lhs, short rhs);

  Object leftShift(short lhs, int rhs);

  Object leftShift(short lhs, long rhs);

  Object leftShift(short lhs, BigInteger rhs);

  Object leftShift(int lhs, byte rhs);

  Object leftShift(int lhs, char rhs);

  Object leftShift(int lhs, short rhs);

  Object leftShift(int lhs, int rhs);

  Object leftShift(int lhs, long rhs);

  Object leftShift(int lhs, BigInteger rhs);

  Object leftShift(long lhs, byte rhs);

  Object leftShift(long lhs, char rhs);

  Object leftShift(long lhs, short rhs);

  Object leftShift(long lhs, int rhs);

  Object leftShift(long lhs, long rhs);

  Object leftShift(long lhs, BigInteger rhs);

  Object leftShift(BigInteger lhs, byte rhs);

  Object leftShift(BigInteger lhs, char rhs);

  Object leftShift(BigInteger lhs, short rhs);

  Object leftShift(BigInteger lhs, int rhs);

  Object leftShift(BigInteger lhs, long rhs);

  Object leftShift(BigInteger lhs, BigInteger rhs);

  Object leftShift(Object lhs, byte rhs);

  Object leftShift(Object lhs, char rhs);

  Object leftShift(Object lhs, short rhs);

  Object leftShift(Object lhs, int rhs);

  Object leftShift(Object lhs, long rhs);

  Object leftShift(Object lhs, BigInteger rhs);

  Object reverseLeftShift(byte lhs, Object rhs);

  Object reverseLeftShift(char lhs, Object rhs);

  Object reverseLeftShift(short lhs, Object rhs);

  Object reverseLeftShift(int lhs, Object rhs);

  Object reverseLeftShift(long lhs, Object rhs);

  Object reverseLeftShift(BigInteger lhs, Object rhs);

  //
  //   Methods callable from compiler generated code for operator <<=
  //

  Object leftShiftEquals(byte lhs, byte rhs);

  Object leftShiftEquals(byte lhs, char rhs);

  Object leftShiftEquals(byte lhs, short rhs);

  Object leftShiftEquals(byte lhs, int rhs);

  Object leftShiftEquals(byte lhs, long rhs);

  Object leftShiftEquals(byte lhs, BigInteger rhs);

  Object leftShiftEquals(char lhs, byte rhs);

  Object leftShiftEquals(char lhs, char rhs);

  Object leftShiftEquals(char lhs, short rhs);

  Object leftShiftEquals(char lhs, int rhs);

  Object leftShiftEquals(char lhs, long rhs);

  Object leftShiftEquals(char lhs, BigInteger rhs);

  Object leftShiftEquals(short lhs, byte rhs);

  Object leftShiftEquals(short lhs, char rhs);

  Object leftShiftEquals(short lhs, short rhs);

  Object leftShiftEquals(short lhs, int rhs);

  Object leftShiftEquals(short lhs, long rhs);

  Object leftShiftEquals(short lhs, BigInteger rhs);

  Object leftShiftEquals(int lhs, byte rhs);

  Object leftShiftEquals(int lhs, char rhs);

  Object leftShiftEquals(int lhs, short rhs);

  Object leftShiftEquals(int lhs, int rhs);

  Object leftShiftEquals(int lhs, long rhs);

  Object leftShiftEquals(int lhs, BigInteger rhs);

  Object leftShiftEquals(long lhs, byte rhs);

  Object leftShiftEquals(long lhs, char rhs);

  Object leftShiftEquals(long lhs, short rhs);

  Object leftShiftEquals(long lhs, int rhs);

  Object leftShiftEquals(long lhs, long rhs);

  Object leftShiftEquals(long lhs, BigInteger rhs);

  Object leftShiftEquals(BigInteger lhs, byte rhs);

  Object leftShiftEquals(BigInteger lhs, char rhs);

  Object leftShiftEquals(BigInteger lhs, short rhs);

  Object leftShiftEquals(BigInteger lhs, int rhs);

  Object leftShiftEquals(BigInteger lhs, long rhs);

  Object leftShiftEquals(BigInteger lhs, BigInteger rhs);

  Object leftShiftEquals(Object lhs, byte rhs);

  Object leftShiftEquals(Object lhs, char rhs);

  Object leftShiftEquals(Object lhs, short rhs);

  Object leftShiftEquals(Object lhs, int rhs);

  Object leftShiftEquals(Object lhs, long rhs);

  Object leftShiftEquals(Object lhs, BigInteger rhs);

  Object reverseLeftShiftEquals(byte lhs, Object rhs);

  Object reverseLeftShiftEquals(char lhs, Object rhs);

  Object reverseLeftShiftEquals(short lhs, Object rhs);

  Object reverseLeftShiftEquals(int lhs, Object rhs);

  Object reverseLeftShiftEquals(long lhs, Object rhs);

  Object reverseLeftShiftEquals(BigInteger lhs, Object rhs);

  //
  //   Methods callable from compiler generated code for operator >>
  //

  Object logicalRightShift(byte lhs, byte rhs);

  Object logicalRightShift(byte lhs, char rhs);

  Object logicalRightShift(byte lhs, short rhs);

  Object logicalRightShift(byte lhs, int rhs);

  Object logicalRightShift(byte lhs, long rhs);

  Object logicalRightShift(byte lhs, BigInteger rhs);

  Object logicalRightShift(char lhs, byte rhs);

  Object logicalRightShift(char lhs, char rhs);

  Object logicalRightShift(char lhs, short rhs);

  Object logicalRightShift(char lhs, int rhs);

  Object logicalRightShift(char lhs, long rhs);

  Object logicalRightShift(char lhs, BigInteger rhs);

  Object logicalRightShift(short lhs, byte rhs);

  Object logicalRightShift(short lhs, char rhs);

  Object logicalRightShift(short lhs, short rhs);

  Object logicalRightShift(short lhs, int rhs);

  Object logicalRightShift(short lhs, long rhs);

  Object logicalRightShift(short lhs, BigInteger rhs);

  Object logicalRightShift(int lhs, byte rhs);

  Object logicalRightShift(int lhs, char rhs);

  Object logicalRightShift(int lhs, short rhs);

  Object logicalRightShift(int lhs, int rhs);

  Object logicalRightShift(int lhs, long rhs);

  Object logicalRightShift(int lhs, BigInteger rhs);

  Object logicalRightShift(long lhs, byte rhs);

  Object logicalRightShift(long lhs, char rhs);

  Object logicalRightShift(long lhs, short rhs);

  Object logicalRightShift(long lhs, int rhs);

  Object logicalRightShift(long lhs, long rhs);

  Object logicalRightShift(long lhs, BigInteger rhs);

  Object logicalRightShift(Object lhs, byte rhs);

  Object logicalRightShift(Object lhs, char rhs);

  Object logicalRightShift(Object lhs, short rhs);

  Object logicalRightShift(Object lhs, int rhs);

  Object logicalRightShift(Object lhs, long rhs);

  Object logicalRightShift(Object lhs, BigInteger rhs);

  Object reverseLogicalRightShift(byte lhs, Object rhs);

  Object reverseLogicalRightShift(char lhs, Object rhs);

  Object reverseLogicalRightShift(short lhs, Object rhs);

  Object reverseLogicalRightShift(int lhs, Object rhs);

  Object reverseLogicalRightShift(long lhs, Object rhs);

  //
  //   Methods callable from compiler generated code for operator >>=
  //

  Object logicalRightShiftEquals(byte lhs, byte rhs);

  Object logicalRightShiftEquals(byte lhs, char rhs);

  Object logicalRightShiftEquals(byte lhs, short rhs);

  Object logicalRightShiftEquals(byte lhs, int rhs);

  Object logicalRightShiftEquals(byte lhs, long rhs);

  Object logicalRightShiftEquals(byte lhs, BigInteger rhs);

  Object logicalRightShiftEquals(char lhs, byte rhs);

  Object logicalRightShiftEquals(char lhs, char rhs);

  Object logicalRightShiftEquals(char lhs, short rhs);

  Object logicalRightShiftEquals(char lhs, int rhs);

  Object logicalRightShiftEquals(char lhs, long rhs);

  Object logicalRightShiftEquals(char lhs, BigInteger rhs);

  Object logicalRightShiftEquals(short lhs, byte rhs);

  Object logicalRightShiftEquals(short lhs, char rhs);

  Object logicalRightShiftEquals(short lhs, short rhs);

  Object logicalRightShiftEquals(short lhs, int rhs);

  Object logicalRightShiftEquals(short lhs, long rhs);

  Object logicalRightShiftEquals(short lhs, BigInteger rhs);

  Object logicalRightShiftEquals(int lhs, byte rhs);

  Object logicalRightShiftEquals(int lhs, char rhs);

  Object logicalRightShiftEquals(int lhs, short rhs);

  Object logicalRightShiftEquals(int lhs, int rhs);

  Object logicalRightShiftEquals(int lhs, long rhs);

  Object logicalRightShiftEquals(int lhs, BigInteger rhs);

  Object logicalRightShiftEquals(long lhs, byte rhs);

  Object logicalRightShiftEquals(long lhs, char rhs);

  Object logicalRightShiftEquals(long lhs, short rhs);

  Object logicalRightShiftEquals(long lhs, int rhs);

  Object logicalRightShiftEquals(long lhs, long rhs);

  Object logicalRightShiftEquals(long lhs, BigInteger rhs);

  Object logicalRightShiftEquals(Object lhs, byte rhs);

  Object logicalRightShiftEquals(Object lhs, char rhs);

  Object logicalRightShiftEquals(Object lhs, short rhs);

  Object logicalRightShiftEquals(Object lhs, int rhs);

  Object logicalRightShiftEquals(Object lhs, long rhs);

  Object logicalRightShiftEquals(Object lhs, BigInteger rhs);

  Object reverseLogicalRightShiftEquals(byte lhs, Object rhs);

  Object reverseLogicalRightShiftEquals(char lhs, Object rhs);

  Object reverseLogicalRightShiftEquals(short lhs, Object rhs);

  Object reverseLogicalRightShiftEquals(int lhs, Object rhs);

  Object reverseLogicalRightShiftEquals(long lhs, Object rhs);

  //
  //   Methods callable from compiler generated code for operator >>>
  //

  Object arithmeticRightShift(byte lhs, byte rhs);

  Object arithmeticRightShift(byte lhs, char rhs);

  Object arithmeticRightShift(byte lhs, short rhs);

  Object arithmeticRightShift(byte lhs, int rhs);

  Object arithmeticRightShift(byte lhs, long rhs);

  Object arithmeticRightShift(byte lhs, BigInteger rhs);

  Object arithmeticRightShift(char lhs, byte rhs);

  Object arithmeticRightShift(char lhs, char rhs);

  Object arithmeticRightShift(char lhs, short rhs);

  Object arithmeticRightShift(char lhs, int rhs);

  Object arithmeticRightShift(char lhs, long rhs);

  Object arithmeticRightShift(char lhs, BigInteger rhs);

  Object arithmeticRightShift(short lhs, byte rhs);

  Object arithmeticRightShift(short lhs, char rhs);

  Object arithmeticRightShift(short lhs, short rhs);

  Object arithmeticRightShift(short lhs, int rhs);

  Object arithmeticRightShift(short lhs, long rhs);

  Object arithmeticRightShift(short lhs, BigInteger rhs);

  Object arithmeticRightShift(int lhs, byte rhs);

  Object arithmeticRightShift(int lhs, char rhs);

  Object arithmeticRightShift(int lhs, short rhs);

  Object arithmeticRightShift(int lhs, int rhs);

  Object arithmeticRightShift(int lhs, long rhs);

  Object arithmeticRightShift(int lhs, BigInteger rhs);

  Object arithmeticRightShift(long lhs, byte rhs);

  Object arithmeticRightShift(long lhs, char rhs);

  Object arithmeticRightShift(long lhs, short rhs);

  Object arithmeticRightShift(long lhs, int rhs);

  Object arithmeticRightShift(long lhs, long rhs);

  Object arithmeticRightShift(long lhs, BigInteger rhs);

  Object arithmeticRightShift(BigInteger lhs, byte rhs);

  Object arithmeticRightShift(BigInteger lhs, char rhs);

  Object arithmeticRightShift(BigInteger lhs, short rhs);

  Object arithmeticRightShift(BigInteger lhs, int rhs);

  Object arithmeticRightShift(BigInteger lhs, long rhs);

  Object arithmeticRightShift(BigInteger lhs, BigInteger rhs);

  Object arithmeticRightShift(Object lhs, byte rhs);

  Object arithmeticRightShift(Object lhs, char rhs);

  Object arithmeticRightShift(Object lhs, short rhs);

  Object arithmeticRightShift(Object lhs, int rhs);

  Object arithmeticRightShift(Object lhs, long rhs);

  Object arithmeticRightShift(Object lhs, BigInteger rhs);

  Object reverseArithmeticRightShift(byte lhs, Object rhs);

  Object reverseArithmeticRightShift(char lhs, Object rhs);

  Object reverseArithmeticRightShift(short lhs, Object rhs);

  Object reverseArithmeticRightShift(int lhs, Object rhs);

  Object reverseArithmeticRightShift(long lhs, Object rhs);

  Object reverseArithmeticRightShift(BigInteger lhs, Object rhs);

  //
  //   Methods callable from compiler generated code for operator >>>=
  //

  Object arithmeticRightShiftEquals(byte lhs, byte rhs);

  Object arithmeticRightShiftEquals(byte lhs, char rhs);

  Object arithmeticRightShiftEquals(byte lhs, short rhs);

  Object arithmeticRightShiftEquals(byte lhs, int rhs);

  Object arithmeticRightShiftEquals(byte lhs, long rhs);

  Object arithmeticRightShiftEquals(byte lhs, BigInteger rhs);

  Object arithmeticRightShiftEquals(char lhs, byte rhs);

  Object arithmeticRightShiftEquals(char lhs, char rhs);

  Object arithmeticRightShiftEquals(char lhs, short rhs);

  Object arithmeticRightShiftEquals(char lhs, int rhs);

  Object arithmeticRightShiftEquals(char lhs, long rhs);

  Object arithmeticRightShiftEquals(char lhs, BigInteger rhs);

  Object arithmeticRightShiftEquals(short lhs, byte rhs);

  Object arithmeticRightShiftEquals(short lhs, char rhs);

  Object arithmeticRightShiftEquals(short lhs, short rhs);

  Object arithmeticRightShiftEquals(short lhs, int rhs);

  Object arithmeticRightShiftEquals(short lhs, long rhs);

  Object arithmeticRightShiftEquals(short lhs, BigInteger rhs);

  Object arithmeticRightShiftEquals(int lhs, byte rhs);

  Object arithmeticRightShiftEquals(int lhs, char rhs);

  Object arithmeticRightShiftEquals(int lhs, short rhs);

  Object arithmeticRightShiftEquals(int lhs, int rhs);

  Object arithmeticRightShiftEquals(int lhs, long rhs);

  Object arithmeticRightShiftEquals(int lhs, BigInteger rhs);

  Object arithmeticRightShiftEquals(long lhs, byte rhs);

  Object arithmeticRightShiftEquals(long lhs, char rhs);

  Object arithmeticRightShiftEquals(long lhs, short rhs);

  Object arithmeticRightShiftEquals(long lhs, int rhs);

  Object arithmeticRightShiftEquals(long lhs, long rhs);

  Object arithmeticRightShiftEquals(long lhs, BigInteger rhs);

  Object arithmeticRightShiftEquals(BigInteger lhs, byte rhs);

  Object arithmeticRightShiftEquals(BigInteger lhs, char rhs);

  Object arithmeticRightShiftEquals(BigInteger lhs, short rhs);

  Object arithmeticRightShiftEquals(BigInteger lhs, int rhs);

  Object arithmeticRightShiftEquals(BigInteger lhs, long rhs);

  Object arithmeticRightShiftEquals(BigInteger lhs, BigInteger rhs);

  Object arithmeticRightShiftEquals(Object lhs, byte rhs);

  Object arithmeticRightShiftEquals(Object lhs, char rhs);

  Object arithmeticRightShiftEquals(Object lhs, short rhs);

  Object arithmeticRightShiftEquals(Object lhs, int rhs);

  Object arithmeticRightShiftEquals(Object lhs, long rhs);

  Object arithmeticRightShiftEquals(Object lhs, BigInteger rhs);

  Object reverseArithmeticRightShiftEquals(byte lhs, Object rhs);

  Object reverseArithmeticRightShiftEquals(char lhs, Object rhs);

  Object reverseArithmeticRightShiftEquals(short lhs, Object rhs);

  Object reverseArithmeticRightShiftEquals(int lhs, Object rhs);

  Object reverseArithmeticRightShiftEquals(long lhs, Object rhs);

  Object reverseArithmeticRightShiftEquals(BigInteger lhs, Object rhs);

  //
  //   Methods callable from compiler generated code for operator <=>
  //

  Object compare(byte lhs, byte rhs);

  Object compare(byte lhs, char rhs);

  Object compare(byte lhs, short rhs);

  Object compare(byte lhs, int rhs);

  Object compare(byte lhs, long rhs);

  Object compare(byte lhs, float rhs);

  Object compare(byte lhs, double rhs);

  Object compare(byte lhs, BigInteger rhs);

  Object compare(byte lhs, BigDecimal rhs);

  Object compare(char lhs, byte rhs);

  Object compare(char lhs, char rhs);

  Object compare(char lhs, short rhs);

  Object compare(char lhs, int rhs);

  Object compare(char lhs, long rhs);

  Object compare(char lhs, float rhs);

  Object compare(char lhs, double rhs);

  Object compare(char lhs, BigInteger rhs);

  Object compare(char lhs, BigDecimal rhs);

  Object compare(short lhs, byte rhs);

  Object compare(short lhs, char rhs);

  Object compare(short lhs, short rhs);

  Object compare(short lhs, int rhs);

  Object compare(short lhs, long rhs);

  Object compare(short lhs, float rhs);

  Object compare(short lhs, double rhs);

  Object compare(short lhs, BigInteger rhs);

  Object compare(short lhs, BigDecimal rhs);

  Object compare(int lhs, byte rhs);

  Object compare(int lhs, char rhs);

  Object compare(int lhs, short rhs);

  Object compare(int lhs, int rhs);

  Object compare(int lhs, long rhs);

  Object compare(int lhs, float rhs);

  Object compare(int lhs, double rhs);

  Object compare(int lhs, BigInteger rhs);

  Object compare(int lhs, BigDecimal rhs);

  Object compare(long lhs, byte rhs);

  Object compare(long lhs, char rhs);

  Object compare(long lhs, short rhs);

  Object compare(long lhs, int rhs);

  Object compare(long lhs, long rhs);

  Object compare(long lhs, float rhs);

  Object compare(long lhs, double rhs);

  Object compare(long lhs, BigInteger rhs);

  Object compare(long lhs, BigDecimal rhs);

  Object compare(float lhs, byte rhs);

  Object compare(float lhs, char rhs);

  Object compare(float lhs, short rhs);

  Object compare(float lhs, int rhs);

  Object compare(float lhs, long rhs);

  Object compare(float lhs, float rhs);

  Object compare(float lhs, double rhs);

  Object compare(float lhs, BigInteger rhs);

  Object compare(float lhs, BigDecimal rhs);

  Object compare(double lhs, byte rhs);

  Object compare(double lhs, char rhs);

  Object compare(double lhs, short rhs);

  Object compare(double lhs, int rhs);

  Object compare(double lhs, long rhs);

  Object compare(double lhs, float rhs);

  Object compare(double lhs, double rhs);

  Object compare(double lhs, BigInteger rhs);

  Object compare(double lhs, BigDecimal rhs);

  Object compare(BigInteger lhs, byte rhs);

  Object compare(BigInteger lhs, char rhs);

  Object compare(BigInteger lhs, short rhs);

  Object compare(BigInteger lhs, int rhs);

  Object compare(BigInteger lhs, long rhs);

  Object compare(BigInteger lhs, float rhs);

  Object compare(BigInteger lhs, double rhs);

  Object compare(BigInteger lhs, BigInteger rhs);

  Object compare(BigInteger lhs, BigDecimal rhs);

  Object compare(BigDecimal lhs, byte rhs);

  Object compare(BigDecimal lhs, char rhs);

  Object compare(BigDecimal lhs, short rhs);

  Object compare(BigDecimal lhs, int rhs);

  Object compare(BigDecimal lhs, long rhs);

  Object compare(BigDecimal lhs, float rhs);

  Object compare(BigDecimal lhs, double rhs);

  Object compare(BigDecimal lhs, BigInteger rhs);

  Object compare(BigDecimal lhs, BigDecimal rhs);

  Object compare(Object lhs, byte rhs);

  Object compare(Object lhs, char rhs);

  Object compare(Object lhs, short rhs);

  Object compare(Object lhs, int rhs);

  Object compare(Object lhs, long rhs);

  Object compare(Object lhs, float rhs);

  Object compare(Object lhs, double rhs);

  Object compare(Object lhs, BigInteger rhs);

  Object compare(Object lhs, BigDecimal rhs);

  Object reverseCompare(byte lhs, Object rhs);

  Object reverseCompare(char lhs, Object rhs);

  Object reverseCompare(short lhs, Object rhs);

  Object reverseCompare(int lhs, Object rhs);

  Object reverseCompare(long lhs, Object rhs);

  Object reverseCompare(float lhs, Object rhs);

  Object reverseCompare(double lhs, Object rhs);

  Object reverseCompare(BigInteger lhs, Object rhs);

  Object reverseCompare(BigDecimal lhs, Object rhs);

  //
  //   Methods callable from compiler generated code for operator ==
  //

  Object equals(byte lhs, byte rhs);

  Object equals(byte lhs, char rhs);

  Object equals(byte lhs, short rhs);

  Object equals(byte lhs, int rhs);

  Object equals(byte lhs, long rhs);

  Object equals(byte lhs, float rhs);

  Object equals(byte lhs, double rhs);

  Object equals(byte lhs, BigInteger rhs);

  Object equals(byte lhs, BigDecimal rhs);

  Object equals(char lhs, byte rhs);

  Object equals(char lhs, char rhs);

  Object equals(char lhs, short rhs);

  Object equals(char lhs, int rhs);

  Object equals(char lhs, long rhs);

  Object equals(char lhs, float rhs);

  Object equals(char lhs, double rhs);

  Object equals(char lhs, BigInteger rhs);

  Object equals(char lhs, BigDecimal rhs);

  Object equals(short lhs, byte rhs);

  Object equals(short lhs, char rhs);

  Object equals(short lhs, short rhs);

  Object equals(short lhs, int rhs);

  Object equals(short lhs, long rhs);

  Object equals(short lhs, float rhs);

  Object equals(short lhs, double rhs);

  Object equals(short lhs, BigInteger rhs);

  Object equals(short lhs, BigDecimal rhs);

  Object equals(int lhs, byte rhs);

  Object equals(int lhs, char rhs);

  Object equals(int lhs, short rhs);

  Object equals(int lhs, int rhs);

  Object equals(int lhs, long rhs);

  Object equals(int lhs, float rhs);

  Object equals(int lhs, double rhs);

  Object equals(int lhs, BigInteger rhs);

  Object equals(int lhs, BigDecimal rhs);

  Object equals(long lhs, byte rhs);

  Object equals(long lhs, char rhs);

  Object equals(long lhs, short rhs);

  Object equals(long lhs, int rhs);

  Object equals(long lhs, long rhs);

  Object equals(long lhs, float rhs);

  Object equals(long lhs, double rhs);

  Object equals(long lhs, BigInteger rhs);

  Object equals(long lhs, BigDecimal rhs);

  Object equals(float lhs, byte rhs);

  Object equals(float lhs, char rhs);

  Object equals(float lhs, short rhs);

  Object equals(float lhs, int rhs);

  Object equals(float lhs, long rhs);

  Object equals(float lhs, float rhs);

  Object equals(float lhs, double rhs);

  Object equals(float lhs, BigInteger rhs);

  Object equals(float lhs, BigDecimal rhs);

  Object equals(double lhs, byte rhs);

  Object equals(double lhs, char rhs);

  Object equals(double lhs, short rhs);

  Object equals(double lhs, int rhs);

  Object equals(double lhs, long rhs);

  Object equals(double lhs, float rhs);

  Object equals(double lhs, double rhs);

  Object equals(double lhs, BigInteger rhs);

  Object equals(double lhs, BigDecimal rhs);

  Object equals(BigInteger lhs, byte rhs);

  Object equals(BigInteger lhs, char rhs);

  Object equals(BigInteger lhs, short rhs);

  Object equals(BigInteger lhs, int rhs);

  Object equals(BigInteger lhs, long rhs);

  Object equals(BigInteger lhs, float rhs);

  Object equals(BigInteger lhs, double rhs);

  Object equals(BigInteger lhs, BigInteger rhs);

  Object equals(BigInteger lhs, BigDecimal rhs);

  Object equals(BigDecimal lhs, byte rhs);

  Object equals(BigDecimal lhs, char rhs);

  Object equals(BigDecimal lhs, short rhs);

  Object equals(BigDecimal lhs, int rhs);

  Object equals(BigDecimal lhs, long rhs);

  Object equals(BigDecimal lhs, float rhs);

  Object equals(BigDecimal lhs, double rhs);

  Object equals(BigDecimal lhs, BigInteger rhs);

  Object equals(BigDecimal lhs, BigDecimal rhs);

  Object equals(Object lhs, byte rhs);

  Object equals(Object lhs, char rhs);

  Object equals(Object lhs, short rhs);

  Object equals(Object lhs, int rhs);

  Object equals(Object lhs, long rhs);

  Object equals(Object lhs, float rhs);

  Object equals(Object lhs, double rhs);

  Object equals(Object lhs, BigInteger rhs);

  Object equals(Object lhs, BigDecimal rhs);

  Object reverseEquals(byte lhs, Object rhs);

  Object reverseEquals(char lhs, Object rhs);

  Object reverseEquals(short lhs, Object rhs);

  Object reverseEquals(int lhs, Object rhs);

  Object reverseEquals(long lhs, Object rhs);

  Object reverseEquals(float lhs, Object rhs);

  Object reverseEquals(double lhs, Object rhs);

  Object reverseEquals(BigInteger lhs, Object rhs);

  Object reverseEquals(BigDecimal lhs, Object rhs);

  //
  //   Methods callable from compiler generated code for operator !=
  //

  Object notEquals(byte lhs, byte rhs);

  Object notEquals(byte lhs, char rhs);

  Object notEquals(byte lhs, short rhs);

  Object notEquals(byte lhs, int rhs);

  Object notEquals(byte lhs, long rhs);

  Object notEquals(byte lhs, float rhs);

  Object notEquals(byte lhs, double rhs);

  Object notEquals(byte lhs, BigInteger rhs);

  Object notEquals(byte lhs, BigDecimal rhs);

  Object notEquals(char lhs, byte rhs);

  Object notEquals(char lhs, char rhs);

  Object notEquals(char lhs, short rhs);

  Object notEquals(char lhs, int rhs);

  Object notEquals(char lhs, long rhs);

  Object notEquals(char lhs, float rhs);

  Object notEquals(char lhs, double rhs);

  Object notEquals(char lhs, BigInteger rhs);

  Object notEquals(char lhs, BigDecimal rhs);

  Object notEquals(short lhs, byte rhs);

  Object notEquals(short lhs, char rhs);

  Object notEquals(short lhs, short rhs);

  Object notEquals(short lhs, int rhs);

  Object notEquals(short lhs, long rhs);

  Object notEquals(short lhs, float rhs);

  Object notEquals(short lhs, double rhs);

  Object notEquals(short lhs, BigInteger rhs);

  Object notEquals(short lhs, BigDecimal rhs);

  Object notEquals(int lhs, byte rhs);

  Object notEquals(int lhs, char rhs);

  Object notEquals(int lhs, short rhs);

  Object notEquals(int lhs, int rhs);

  Object notEquals(int lhs, long rhs);

  Object notEquals(int lhs, float rhs);

  Object notEquals(int lhs, double rhs);

  Object notEquals(int lhs, BigInteger rhs);

  Object notEquals(int lhs, BigDecimal rhs);

  Object notEquals(long lhs, byte rhs);

  Object notEquals(long lhs, char rhs);

  Object notEquals(long lhs, short rhs);

  Object notEquals(long lhs, int rhs);

  Object notEquals(long lhs, long rhs);

  Object notEquals(long lhs, float rhs);

  Object notEquals(long lhs, double rhs);

  Object notEquals(long lhs, BigInteger rhs);

  Object notEquals(long lhs, BigDecimal rhs);

  Object notEquals(float lhs, byte rhs);

  Object notEquals(float lhs, char rhs);

  Object notEquals(float lhs, short rhs);

  Object notEquals(float lhs, int rhs);

  Object notEquals(float lhs, long rhs);

  Object notEquals(float lhs, float rhs);

  Object notEquals(float lhs, double rhs);

  Object notEquals(float lhs, BigInteger rhs);

  Object notEquals(float lhs, BigDecimal rhs);

  Object notEquals(double lhs, byte rhs);

  Object notEquals(double lhs, char rhs);

  Object notEquals(double lhs, short rhs);

  Object notEquals(double lhs, int rhs);

  Object notEquals(double lhs, long rhs);

  Object notEquals(double lhs, float rhs);

  Object notEquals(double lhs, double rhs);

  Object notEquals(double lhs, BigInteger rhs);

  Object notEquals(double lhs, BigDecimal rhs);

  Object notEquals(BigInteger lhs, byte rhs);

  Object notEquals(BigInteger lhs, char rhs);

  Object notEquals(BigInteger lhs, short rhs);

  Object notEquals(BigInteger lhs, int rhs);

  Object notEquals(BigInteger lhs, long rhs);

  Object notEquals(BigInteger lhs, float rhs);

  Object notEquals(BigInteger lhs, double rhs);

  Object notEquals(BigInteger lhs, BigInteger rhs);

  Object notEquals(BigInteger lhs, BigDecimal rhs);

  Object notEquals(BigDecimal lhs, byte rhs);

  Object notEquals(BigDecimal lhs, char rhs);

  Object notEquals(BigDecimal lhs, short rhs);

  Object notEquals(BigDecimal lhs, int rhs);

  Object notEquals(BigDecimal lhs, long rhs);

  Object notEquals(BigDecimal lhs, float rhs);

  Object notEquals(BigDecimal lhs, double rhs);

  Object notEquals(BigDecimal lhs, BigInteger rhs);

  Object notEquals(BigDecimal lhs, BigDecimal rhs);

  Object notEquals(Object lhs, byte rhs);

  Object notEquals(Object lhs, char rhs);

  Object notEquals(Object lhs, short rhs);

  Object notEquals(Object lhs, int rhs);

  Object notEquals(Object lhs, long rhs);

  Object notEquals(Object lhs, float rhs);

  Object notEquals(Object lhs, double rhs);

  Object notEquals(Object lhs, BigInteger rhs);

  Object notEquals(Object lhs, BigDecimal rhs);

  Object reverseNotEquals(byte lhs, Object rhs);

  Object reverseNotEquals(char lhs, Object rhs);

  Object reverseNotEquals(short lhs, Object rhs);

  Object reverseNotEquals(int lhs, Object rhs);

  Object reverseNotEquals(long lhs, Object rhs);

  Object reverseNotEquals(float lhs, Object rhs);

  Object reverseNotEquals(double lhs, Object rhs);

  Object reverseNotEquals(BigInteger lhs, Object rhs);

  Object reverseNotEquals(BigDecimal lhs, Object rhs);

  //
  //   Methods callable from compiler generated code for operator <
  //

  Object lessThan(byte lhs, byte rhs);

  Object lessThan(byte lhs, char rhs);

  Object lessThan(byte lhs, short rhs);

  Object lessThan(byte lhs, int rhs);

  Object lessThan(byte lhs, long rhs);

  Object lessThan(byte lhs, float rhs);

  Object lessThan(byte lhs, double rhs);

  Object lessThan(byte lhs, BigInteger rhs);

  Object lessThan(byte lhs, BigDecimal rhs);

  Object lessThan(char lhs, byte rhs);

  Object lessThan(char lhs, char rhs);

  Object lessThan(char lhs, short rhs);

  Object lessThan(char lhs, int rhs);

  Object lessThan(char lhs, long rhs);

  Object lessThan(char lhs, float rhs);

  Object lessThan(char lhs, double rhs);

  Object lessThan(char lhs, BigInteger rhs);

  Object lessThan(char lhs, BigDecimal rhs);

  Object lessThan(short lhs, byte rhs);

  Object lessThan(short lhs, char rhs);

  Object lessThan(short lhs, short rhs);

  Object lessThan(short lhs, int rhs);

  Object lessThan(short lhs, long rhs);

  Object lessThan(short lhs, float rhs);

  Object lessThan(short lhs, double rhs);

  Object lessThan(short lhs, BigInteger rhs);

  Object lessThan(short lhs, BigDecimal rhs);

  Object lessThan(int lhs, byte rhs);

  Object lessThan(int lhs, char rhs);

  Object lessThan(int lhs, short rhs);

  Object lessThan(int lhs, int rhs);

  Object lessThan(int lhs, long rhs);

  Object lessThan(int lhs, float rhs);

  Object lessThan(int lhs, double rhs);

  Object lessThan(int lhs, BigInteger rhs);

  Object lessThan(int lhs, BigDecimal rhs);

  Object lessThan(long lhs, byte rhs);

  Object lessThan(long lhs, char rhs);

  Object lessThan(long lhs, short rhs);

  Object lessThan(long lhs, int rhs);

  Object lessThan(long lhs, long rhs);

  Object lessThan(long lhs, float rhs);

  Object lessThan(long lhs, double rhs);

  Object lessThan(long lhs, BigInteger rhs);

  Object lessThan(long lhs, BigDecimal rhs);

  Object lessThan(float lhs, byte rhs);

  Object lessThan(float lhs, char rhs);

  Object lessThan(float lhs, short rhs);

  Object lessThan(float lhs, int rhs);

  Object lessThan(float lhs, long rhs);

  Object lessThan(float lhs, float rhs);

  Object lessThan(float lhs, double rhs);

  Object lessThan(float lhs, BigInteger rhs);

  Object lessThan(float lhs, BigDecimal rhs);

  Object lessThan(double lhs, byte rhs);

  Object lessThan(double lhs, char rhs);

  Object lessThan(double lhs, short rhs);

  Object lessThan(double lhs, int rhs);

  Object lessThan(double lhs, long rhs);

  Object lessThan(double lhs, float rhs);

  Object lessThan(double lhs, double rhs);

  Object lessThan(double lhs, BigInteger rhs);

  Object lessThan(double lhs, BigDecimal rhs);

  Object lessThan(BigInteger lhs, byte rhs);

  Object lessThan(BigInteger lhs, char rhs);

  Object lessThan(BigInteger lhs, short rhs);

  Object lessThan(BigInteger lhs, int rhs);

  Object lessThan(BigInteger lhs, long rhs);

  Object lessThan(BigInteger lhs, float rhs);

  Object lessThan(BigInteger lhs, double rhs);

  Object lessThan(BigInteger lhs, BigInteger rhs);

  Object lessThan(BigInteger lhs, BigDecimal rhs);

  Object lessThan(BigDecimal lhs, byte rhs);

  Object lessThan(BigDecimal lhs, char rhs);

  Object lessThan(BigDecimal lhs, short rhs);

  Object lessThan(BigDecimal lhs, int rhs);

  Object lessThan(BigDecimal lhs, long rhs);

  Object lessThan(BigDecimal lhs, float rhs);

  Object lessThan(BigDecimal lhs, double rhs);

  Object lessThan(BigDecimal lhs, BigInteger rhs);

  Object lessThan(BigDecimal lhs, BigDecimal rhs);

  Object lessThan(Object lhs, byte rhs);

  Object lessThan(Object lhs, char rhs);

  Object lessThan(Object lhs, short rhs);

  Object lessThan(Object lhs, int rhs);

  Object lessThan(Object lhs, long rhs);

  Object lessThan(Object lhs, float rhs);

  Object lessThan(Object lhs, double rhs);

  Object lessThan(Object lhs, BigInteger rhs);

  Object lessThan(Object lhs, BigDecimal rhs);

  Object reverseLessThan(byte lhs, Object rhs);

  Object reverseLessThan(char lhs, Object rhs);

  Object reverseLessThan(short lhs, Object rhs);

  Object reverseLessThan(int lhs, Object rhs);

  Object reverseLessThan(long lhs, Object rhs);

  Object reverseLessThan(float lhs, Object rhs);

  Object reverseLessThan(double lhs, Object rhs);

  Object reverseLessThan(BigInteger lhs, Object rhs);

  Object reverseLessThan(BigDecimal lhs, Object rhs);

  //
  //   Methods callable from compiler generated code for operator <=
  //

  Object lessThanOrEquals(byte lhs, byte rhs);

  Object lessThanOrEquals(byte lhs, char rhs);

  Object lessThanOrEquals(byte lhs, short rhs);

  Object lessThanOrEquals(byte lhs, int rhs);

  Object lessThanOrEquals(byte lhs, long rhs);

  Object lessThanOrEquals(byte lhs, float rhs);

  Object lessThanOrEquals(byte lhs, double rhs);

  Object lessThanOrEquals(byte lhs, BigInteger rhs);

  Object lessThanOrEquals(byte lhs, BigDecimal rhs);

  Object lessThanOrEquals(char lhs, byte rhs);

  Object lessThanOrEquals(char lhs, char rhs);

  Object lessThanOrEquals(char lhs, short rhs);

  Object lessThanOrEquals(char lhs, int rhs);

  Object lessThanOrEquals(char lhs, long rhs);

  Object lessThanOrEquals(char lhs, float rhs);

  Object lessThanOrEquals(char lhs, double rhs);

  Object lessThanOrEquals(char lhs, BigInteger rhs);

  Object lessThanOrEquals(char lhs, BigDecimal rhs);

  Object lessThanOrEquals(short lhs, byte rhs);

  Object lessThanOrEquals(short lhs, char rhs);

  Object lessThanOrEquals(short lhs, short rhs);

  Object lessThanOrEquals(short lhs, int rhs);

  Object lessThanOrEquals(short lhs, long rhs);

  Object lessThanOrEquals(short lhs, float rhs);

  Object lessThanOrEquals(short lhs, double rhs);

  Object lessThanOrEquals(short lhs, BigInteger rhs);

  Object lessThanOrEquals(short lhs, BigDecimal rhs);

  Object lessThanOrEquals(int lhs, byte rhs);

  Object lessThanOrEquals(int lhs, char rhs);

  Object lessThanOrEquals(int lhs, short rhs);

  Object lessThanOrEquals(int lhs, int rhs);

  Object lessThanOrEquals(int lhs, long rhs);

  Object lessThanOrEquals(int lhs, float rhs);

  Object lessThanOrEquals(int lhs, double rhs);

  Object lessThanOrEquals(int lhs, BigInteger rhs);

  Object lessThanOrEquals(int lhs, BigDecimal rhs);

  Object lessThanOrEquals(long lhs, byte rhs);

  Object lessThanOrEquals(long lhs, char rhs);

  Object lessThanOrEquals(long lhs, short rhs);

  Object lessThanOrEquals(long lhs, int rhs);

  Object lessThanOrEquals(long lhs, long rhs);

  Object lessThanOrEquals(long lhs, float rhs);

  Object lessThanOrEquals(long lhs, double rhs);

  Object lessThanOrEquals(long lhs, BigInteger rhs);

  Object lessThanOrEquals(long lhs, BigDecimal rhs);

  Object lessThanOrEquals(float lhs, byte rhs);

  Object lessThanOrEquals(float lhs, char rhs);

  Object lessThanOrEquals(float lhs, short rhs);

  Object lessThanOrEquals(float lhs, int rhs);

  Object lessThanOrEquals(float lhs, long rhs);

  Object lessThanOrEquals(float lhs, float rhs);

  Object lessThanOrEquals(float lhs, double rhs);

  Object lessThanOrEquals(float lhs, BigInteger rhs);

  Object lessThanOrEquals(float lhs, BigDecimal rhs);

  Object lessThanOrEquals(double lhs, byte rhs);

  Object lessThanOrEquals(double lhs, char rhs);

  Object lessThanOrEquals(double lhs, short rhs);

  Object lessThanOrEquals(double lhs, int rhs);

  Object lessThanOrEquals(double lhs, long rhs);

  Object lessThanOrEquals(double lhs, float rhs);

  Object lessThanOrEquals(double lhs, double rhs);

  Object lessThanOrEquals(double lhs, BigInteger rhs);

  Object lessThanOrEquals(double lhs, BigDecimal rhs);

  Object lessThanOrEquals(BigInteger lhs, byte rhs);

  Object lessThanOrEquals(BigInteger lhs, char rhs);

  Object lessThanOrEquals(BigInteger lhs, short rhs);

  Object lessThanOrEquals(BigInteger lhs, int rhs);

  Object lessThanOrEquals(BigInteger lhs, long rhs);

  Object lessThanOrEquals(BigInteger lhs, float rhs);

  Object lessThanOrEquals(BigInteger lhs, double rhs);

  Object lessThanOrEquals(BigInteger lhs, BigInteger rhs);

  Object lessThanOrEquals(BigInteger lhs, BigDecimal rhs);

  Object lessThanOrEquals(BigDecimal lhs, byte rhs);

  Object lessThanOrEquals(BigDecimal lhs, char rhs);

  Object lessThanOrEquals(BigDecimal lhs, short rhs);

  Object lessThanOrEquals(BigDecimal lhs, int rhs);

  Object lessThanOrEquals(BigDecimal lhs, long rhs);

  Object lessThanOrEquals(BigDecimal lhs, float rhs);

  Object lessThanOrEquals(BigDecimal lhs, double rhs);

  Object lessThanOrEquals(BigDecimal lhs, BigInteger rhs);

  Object lessThanOrEquals(BigDecimal lhs, BigDecimal rhs);

  Object lessThanOrEquals(Object lhs, byte rhs);

  Object lessThanOrEquals(Object lhs, char rhs);

  Object lessThanOrEquals(Object lhs, short rhs);

  Object lessThanOrEquals(Object lhs, int rhs);

  Object lessThanOrEquals(Object lhs, long rhs);

  Object lessThanOrEquals(Object lhs, float rhs);

  Object lessThanOrEquals(Object lhs, double rhs);

  Object lessThanOrEquals(Object lhs, BigInteger rhs);

  Object lessThanOrEquals(Object lhs, BigDecimal rhs);

  Object reverseLessThanOrEquals(byte lhs, Object rhs);

  Object reverseLessThanOrEquals(char lhs, Object rhs);

  Object reverseLessThanOrEquals(short lhs, Object rhs);

  Object reverseLessThanOrEquals(int lhs, Object rhs);

  Object reverseLessThanOrEquals(long lhs, Object rhs);

  Object reverseLessThanOrEquals(float lhs, Object rhs);

  Object reverseLessThanOrEquals(double lhs, Object rhs);

  Object reverseLessThanOrEquals(BigInteger lhs, Object rhs);

  Object reverseLessThanOrEquals(BigDecimal lhs, Object rhs);

  //
  //   Methods callable from compiler generated code for operator >
  //

  Object greaterThan(byte lhs, byte rhs);

  Object greaterThan(byte lhs, char rhs);

  Object greaterThan(byte lhs, short rhs);

  Object greaterThan(byte lhs, int rhs);

  Object greaterThan(byte lhs, long rhs);

  Object greaterThan(byte lhs, float rhs);

  Object greaterThan(byte lhs, double rhs);

  Object greaterThan(byte lhs, BigInteger rhs);

  Object greaterThan(byte lhs, BigDecimal rhs);

  Object greaterThan(char lhs, byte rhs);

  Object greaterThan(char lhs, char rhs);

  Object greaterThan(char lhs, short rhs);

  Object greaterThan(char lhs, int rhs);

  Object greaterThan(char lhs, long rhs);

  Object greaterThan(char lhs, float rhs);

  Object greaterThan(char lhs, double rhs);

  Object greaterThan(char lhs, BigInteger rhs);

  Object greaterThan(char lhs, BigDecimal rhs);

  Object greaterThan(short lhs, byte rhs);

  Object greaterThan(short lhs, char rhs);

  Object greaterThan(short lhs, short rhs);

  Object greaterThan(short lhs, int rhs);

  Object greaterThan(short lhs, long rhs);

  Object greaterThan(short lhs, float rhs);

  Object greaterThan(short lhs, double rhs);

  Object greaterThan(short lhs, BigInteger rhs);

  Object greaterThan(short lhs, BigDecimal rhs);

  Object greaterThan(int lhs, byte rhs);

  Object greaterThan(int lhs, char rhs);

  Object greaterThan(int lhs, short rhs);

  Object greaterThan(int lhs, int rhs);

  Object greaterThan(int lhs, long rhs);

  Object greaterThan(int lhs, float rhs);

  Object greaterThan(int lhs, double rhs);

  Object greaterThan(int lhs, BigInteger rhs);

  Object greaterThan(int lhs, BigDecimal rhs);

  Object greaterThan(long lhs, byte rhs);

  Object greaterThan(long lhs, char rhs);

  Object greaterThan(long lhs, short rhs);

  Object greaterThan(long lhs, int rhs);

  Object greaterThan(long lhs, long rhs);

  Object greaterThan(long lhs, float rhs);

  Object greaterThan(long lhs, double rhs);

  Object greaterThan(long lhs, BigInteger rhs);

  Object greaterThan(long lhs, BigDecimal rhs);

  Object greaterThan(float lhs, byte rhs);

  Object greaterThan(float lhs, char rhs);

  Object greaterThan(float lhs, short rhs);

  Object greaterThan(float lhs, int rhs);

  Object greaterThan(float lhs, long rhs);

  Object greaterThan(float lhs, float rhs);

  Object greaterThan(float lhs, double rhs);

  Object greaterThan(float lhs, BigInteger rhs);

  Object greaterThan(float lhs, BigDecimal rhs);

  Object greaterThan(double lhs, byte rhs);

  Object greaterThan(double lhs, char rhs);

  Object greaterThan(double lhs, short rhs);

  Object greaterThan(double lhs, int rhs);

  Object greaterThan(double lhs, long rhs);

  Object greaterThan(double lhs, float rhs);

  Object greaterThan(double lhs, double rhs);

  Object greaterThan(double lhs, BigInteger rhs);

  Object greaterThan(double lhs, BigDecimal rhs);

  Object greaterThan(BigInteger lhs, byte rhs);

  Object greaterThan(BigInteger lhs, char rhs);

  Object greaterThan(BigInteger lhs, short rhs);

  Object greaterThan(BigInteger lhs, int rhs);

  Object greaterThan(BigInteger lhs, long rhs);

  Object greaterThan(BigInteger lhs, float rhs);

  Object greaterThan(BigInteger lhs, double rhs);

  Object greaterThan(BigInteger lhs, BigInteger rhs);

  Object greaterThan(BigInteger lhs, BigDecimal rhs);

  Object greaterThan(BigDecimal lhs, byte rhs);

  Object greaterThan(BigDecimal lhs, char rhs);

  Object greaterThan(BigDecimal lhs, short rhs);

  Object greaterThan(BigDecimal lhs, int rhs);

  Object greaterThan(BigDecimal lhs, long rhs);

  Object greaterThan(BigDecimal lhs, float rhs);

  Object greaterThan(BigDecimal lhs, double rhs);

  Object greaterThan(BigDecimal lhs, BigInteger rhs);

  Object greaterThan(BigDecimal lhs, BigDecimal rhs);

  Object greaterThan(Object lhs, byte rhs);

  Object greaterThan(Object lhs, char rhs);

  Object greaterThan(Object lhs, short rhs);

  Object greaterThan(Object lhs, int rhs);

  Object greaterThan(Object lhs, long rhs);

  Object greaterThan(Object lhs, float rhs);

  Object greaterThan(Object lhs, double rhs);

  Object greaterThan(Object lhs, BigInteger rhs);

  Object greaterThan(Object lhs, BigDecimal rhs);

  Object reverseGreaterThan(byte lhs, Object rhs);

  Object reverseGreaterThan(char lhs, Object rhs);

  Object reverseGreaterThan(short lhs, Object rhs);

  Object reverseGreaterThan(int lhs, Object rhs);

  Object reverseGreaterThan(long lhs, Object rhs);

  Object reverseGreaterThan(float lhs, Object rhs);

  Object reverseGreaterThan(double lhs, Object rhs);

  Object reverseGreaterThan(BigInteger lhs, Object rhs);

  Object reverseGreaterThan(BigDecimal lhs, Object rhs);

  //
  //   Methods callable from compiler generated code for operator >=
  //

  Object greaterThanOrEquals(byte lhs, byte rhs);

  Object greaterThanOrEquals(byte lhs, char rhs);

  Object greaterThanOrEquals(byte lhs, short rhs);

  Object greaterThanOrEquals(byte lhs, int rhs);

  Object greaterThanOrEquals(byte lhs, long rhs);

  Object greaterThanOrEquals(byte lhs, float rhs);

  Object greaterThanOrEquals(byte lhs, double rhs);

  Object greaterThanOrEquals(byte lhs, BigInteger rhs);

  Object greaterThanOrEquals(byte lhs, BigDecimal rhs);

  Object greaterThanOrEquals(char lhs, byte rhs);

  Object greaterThanOrEquals(char lhs, char rhs);

  Object greaterThanOrEquals(char lhs, short rhs);

  Object greaterThanOrEquals(char lhs, int rhs);

  Object greaterThanOrEquals(char lhs, long rhs);

  Object greaterThanOrEquals(char lhs, float rhs);

  Object greaterThanOrEquals(char lhs, double rhs);

  Object greaterThanOrEquals(char lhs, BigInteger rhs);

  Object greaterThanOrEquals(char lhs, BigDecimal rhs);

  Object greaterThanOrEquals(short lhs, byte rhs);

  Object greaterThanOrEquals(short lhs, char rhs);

  Object greaterThanOrEquals(short lhs, short rhs);

  Object greaterThanOrEquals(short lhs, int rhs);

  Object greaterThanOrEquals(short lhs, long rhs);

  Object greaterThanOrEquals(short lhs, float rhs);

  Object greaterThanOrEquals(short lhs, double rhs);

  Object greaterThanOrEquals(short lhs, BigInteger rhs);

  Object greaterThanOrEquals(short lhs, BigDecimal rhs);

  Object greaterThanOrEquals(int lhs, byte rhs);

  Object greaterThanOrEquals(int lhs, char rhs);

  Object greaterThanOrEquals(int lhs, short rhs);

  Object greaterThanOrEquals(int lhs, int rhs);

  Object greaterThanOrEquals(int lhs, long rhs);

  Object greaterThanOrEquals(int lhs, float rhs);

  Object greaterThanOrEquals(int lhs, double rhs);

  Object greaterThanOrEquals(int lhs, BigInteger rhs);

  Object greaterThanOrEquals(int lhs, BigDecimal rhs);

  Object greaterThanOrEquals(long lhs, byte rhs);

  Object greaterThanOrEquals(long lhs, char rhs);

  Object greaterThanOrEquals(long lhs, short rhs);

  Object greaterThanOrEquals(long lhs, int rhs);

  Object greaterThanOrEquals(long lhs, long rhs);

  Object greaterThanOrEquals(long lhs, float rhs);

  Object greaterThanOrEquals(long lhs, double rhs);

  Object greaterThanOrEquals(long lhs, BigInteger rhs);

  Object greaterThanOrEquals(long lhs, BigDecimal rhs);

  Object greaterThanOrEquals(float lhs, byte rhs);

  Object greaterThanOrEquals(float lhs, char rhs);

  Object greaterThanOrEquals(float lhs, short rhs);

  Object greaterThanOrEquals(float lhs, int rhs);

  Object greaterThanOrEquals(float lhs, long rhs);

  Object greaterThanOrEquals(float lhs, float rhs);

  Object greaterThanOrEquals(float lhs, double rhs);

  Object greaterThanOrEquals(float lhs, BigInteger rhs);

  Object greaterThanOrEquals(float lhs, BigDecimal rhs);

  Object greaterThanOrEquals(double lhs, byte rhs);

  Object greaterThanOrEquals(double lhs, char rhs);

  Object greaterThanOrEquals(double lhs, short rhs);

  Object greaterThanOrEquals(double lhs, int rhs);

  Object greaterThanOrEquals(double lhs, long rhs);

  Object greaterThanOrEquals(double lhs, float rhs);

  Object greaterThanOrEquals(double lhs, double rhs);

  Object greaterThanOrEquals(double lhs, BigInteger rhs);

  Object greaterThanOrEquals(double lhs, BigDecimal rhs);

  Object greaterThanOrEquals(BigInteger lhs, byte rhs);

  Object greaterThanOrEquals(BigInteger lhs, char rhs);

  Object greaterThanOrEquals(BigInteger lhs, short rhs);

  Object greaterThanOrEquals(BigInteger lhs, int rhs);

  Object greaterThanOrEquals(BigInteger lhs, long rhs);

  Object greaterThanOrEquals(BigInteger lhs, float rhs);

  Object greaterThanOrEquals(BigInteger lhs, double rhs);

  Object greaterThanOrEquals(BigInteger lhs, BigInteger rhs);

  Object greaterThanOrEquals(BigInteger lhs, BigDecimal rhs);

  Object greaterThanOrEquals(BigDecimal lhs, byte rhs);

  Object greaterThanOrEquals(BigDecimal lhs, char rhs);

  Object greaterThanOrEquals(BigDecimal lhs, short rhs);

  Object greaterThanOrEquals(BigDecimal lhs, int rhs);

  Object greaterThanOrEquals(BigDecimal lhs, long rhs);

  Object greaterThanOrEquals(BigDecimal lhs, float rhs);

  Object greaterThanOrEquals(BigDecimal lhs, double rhs);

  Object greaterThanOrEquals(BigDecimal lhs, BigInteger rhs);

  Object greaterThanOrEquals(BigDecimal lhs, BigDecimal rhs);

  Object greaterThanOrEquals(Object lhs, byte rhs);

  Object greaterThanOrEquals(Object lhs, char rhs);

  Object greaterThanOrEquals(Object lhs, short rhs);

  Object greaterThanOrEquals(Object lhs, int rhs);

  Object greaterThanOrEquals(Object lhs, long rhs);

  Object greaterThanOrEquals(Object lhs, float rhs);

  Object greaterThanOrEquals(Object lhs, double rhs);

  Object greaterThanOrEquals(Object lhs, BigInteger rhs);

  Object greaterThanOrEquals(Object lhs, BigDecimal rhs);

  Object reverseGreaterThanOrEquals(byte lhs, Object rhs);

  Object reverseGreaterThanOrEquals(char lhs, Object rhs);

  Object reverseGreaterThanOrEquals(short lhs, Object rhs);

  Object reverseGreaterThanOrEquals(int lhs, Object rhs);

  Object reverseGreaterThanOrEquals(long lhs, Object rhs);

  Object reverseGreaterThanOrEquals(float lhs, Object rhs);

  Object reverseGreaterThanOrEquals(double lhs, Object rhs);

  Object reverseGreaterThanOrEquals(BigInteger lhs, Object rhs);

  Object reverseGreaterThanOrEquals(BigDecimal lhs, Object rhs);
}
