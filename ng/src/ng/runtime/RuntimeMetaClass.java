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

import uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection;

/**
 * @author John Wilson tug@wilson.co.uk
 *
 */
public interface RuntimeMetaClass extends MetaClass {
  /**
   * @param the actual parameter
   * @param the required type
   * @return the Object to be used whan passing this instance as a parameter
   */
  Object getParamObject(Object instance, Class theClass);
  
  
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
   * @param parameterType
   * @return
   */
  int calculateConversionCost(Class parameterType);
  
  /**
   * @param currentSelection
   * @param methodName
   * @param argumentMetaClasses
   * @return
   */
  MetaMethodSelection selectMethod(MetaMethodSelection currentSelection, String methodName, RuntimeMetaClass[] argumentMetaClasses);
  
  /**
   * @param currentSelection
   * @param methodName
   * @return
   */
  MetaMethodSelection selectMethod(MetaMethodSelection currentSelection, String methodName);
  
  /**
   * @param currentSelection
   * @param methodName
   * @param p1
   * @return
   */
  MetaMethodSelection selectMethod(MetaMethodSelection currentSelection, String methodName, RuntimeMetaClass p1);
  
  /**
   * @param currentSelection
   * @param methodName
   * @param p1
   * @param p2
   * @return
   */
  MetaMethodSelection selectMethod(MetaMethodSelection currentSelection, String methodName, RuntimeMetaClass p1, RuntimeMetaClass p2);
  
  /**
   * @param currentSelection
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  MetaMethodSelection selectMethod(MetaMethodSelection currentSelection, String methodName, RuntimeMetaClass p1, RuntimeMetaClass p2, RuntimeMetaClass p3);
  
  /**
   * @param currentSelection
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  MetaMethodSelection selectMethod(MetaMethodSelection currentSelection, String methodName, RuntimeMetaClass p1, RuntimeMetaClass p2, RuntimeMetaClass p3, RuntimeMetaClass p4);
  
  /**
   * @param instance
   * @param methodName
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, Object p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, boolean p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, char p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, byte p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, short p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, int p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, long p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, float p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, double p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, BigInteger p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, BigDecimal p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, Object p1, Object p2) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, Object p1, Object p2, Object p3) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, Object p1, Object p2, Object p3, Object p4) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object callQuick(Object instance) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, Object p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, boolean p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, char p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, byte p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, short p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, int p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, long p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, float p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, double p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, BigInteger p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, BigDecimal p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @param p2
   * @return
   */
  Object callQuick(Object instance, Object p1, Object p2) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  Object callQuick(Object instance, Object p1, Object p2, Object p3) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  Object callQuick(Object instance, Object p1, Object p2, Object p3, Object p4) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  byte asByte(Object instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  char asChar(Object instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  short asShort(Object instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  int asInt(Object instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  long asLong(Object instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  float asFloat(Object instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  double asDouble(Object instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  boolean asBoolean(Object instance) throws Throwable;
   
  /**
   * @param instance
   * @return
   */
  Object complement(int instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object complement(long instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object complement(BigInteger instance) throws Throwable;

  /**
   * @param instance
   * @return
   */
  Object not(boolean instance) throws Throwable;

  /**
   * @param instance
   * @return
   */
  Object unaryPlus(int instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object unaryPlus(long instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object unaryPlus(float instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object unaryPlus(double instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object unaryPlus(BigInteger instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object unaryPlus(BigDecimal instance) throws Throwable;

  /**
   * @param instance
   * @return
   */
  Object unaryMinus(int instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object unaryMinus(long instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object unaryMinus(float instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object unaryMinus(double instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object unaryMinus(BigInteger instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object unaryMinus(BigDecimal instance) throws Throwable;
 
  /**
   * @param instance
   * @param index
   * @return
   */
  Object getAt(Object instance, int index) throws Throwable;
  
  /**
   * @param instance
   * @param index
   * @return
   */
  Object getAt(Object instance, BigInteger index) throws Throwable;
  
  /**
   * @param instance
   * @param index
   */
  Object putAt(Object instance, int index) throws Throwable;
  
  /**
   * @param instance
   * @param index
   */
  Object putAt(Object instance, BigInteger index) throws Throwable; 

  /**
   * @param instance
   * @return
   */
  Object prefixIncrement(int instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object prefixIncrement(long instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object prefixIncrement(float instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object prefixIncrement(double instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object prefixIncrement(BigInteger instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object prefixIncrement(BigDecimal instance) throws Throwable;

  /**
   * @param instance
   * @return
   */
  Object prefixDecrement(int instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object prefixDecrement(long instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object prefixDecrement(float instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object prefixDecrement(double instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object prefixDecrement(BigInteger instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object prefixDecrement(BigDecimal instance) throws Throwable;

  /**
   * @param instance
   * @return
   */
  Object postfixIncrement(int instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object postfixIncrement(long instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object postfixIncrement(float instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object postfixIncrement(double instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object postfixIncrement(BigInteger instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object postfixIncrement(BigDecimal instance) throws Throwable;

  /**
   * @param instance
   * @return
   */
  Object postfixDecrement(int instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object postfixDecrement(long instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object postfixDecrement(float instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object postfixDecrement(double instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object postfixDecrement(BigInteger instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object postfixDecrement(BigDecimal instance) throws Throwable;

  //
  //   Methods callable from compiler generated code for operator +
  //

  Object add(byte lhs, byte rhs) throws Throwable;

  Object add(byte lhs, char rhs) throws Throwable;

  Object add(byte lhs, short rhs) throws Throwable;

  Object add(byte lhs, int rhs) throws Throwable;

  Object add(byte lhs, long rhs) throws Throwable;

  Object add(byte lhs, float rhs) throws Throwable;

  Object add(byte lhs, double rhs) throws Throwable;

  Object add(byte lhs, BigInteger rhs) throws Throwable;

  Object add(byte lhs, BigDecimal rhs) throws Throwable;

  Object add(char lhs, byte rhs) throws Throwable;

  Object add(char lhs, char rhs) throws Throwable;

  Object add(char lhs, short rhs) throws Throwable;

  Object add(char lhs, int rhs) throws Throwable;

  Object add(char lhs, long rhs) throws Throwable;

  Object add(char lhs, float rhs) throws Throwable;

  Object add(char lhs, double rhs) throws Throwable;

  Object add(char lhs, BigInteger rhs) throws Throwable;

  Object add(char lhs, BigDecimal rhs) throws Throwable;

  Object add(short lhs, byte rhs) throws Throwable;

  Object add(short lhs, char rhs) throws Throwable;

  Object add(short lhs, short rhs) throws Throwable;

  Object add(short lhs, int rhs) throws Throwable;

  Object add(short lhs, long rhs) throws Throwable;

  Object add(short lhs, float rhs) throws Throwable;

  Object add(short lhs, double rhs) throws Throwable;

  Object add(short lhs, BigInteger rhs) throws Throwable;

  Object add(short lhs, BigDecimal rhs) throws Throwable;

  Object add(int lhs, byte rhs) throws Throwable;

  Object add(int lhs, char rhs) throws Throwable;

  Object add(int lhs, short rhs) throws Throwable;

  Object add(int lhs, int rhs) throws Throwable;

  Object add(int lhs, long rhs) throws Throwable;

  Object add(int lhs, float rhs) throws Throwable;

  Object add(int lhs, double rhs) throws Throwable;

  Object add(int lhs, BigInteger rhs) throws Throwable;

  Object add(int lhs, BigDecimal rhs) throws Throwable;

  Object add(long lhs, byte rhs) throws Throwable;

  Object add(long lhs, char rhs) throws Throwable;

  Object add(long lhs, short rhs) throws Throwable;

  Object add(long lhs, int rhs) throws Throwable;

  Object add(long lhs, long rhs) throws Throwable;

  Object add(long lhs, float rhs) throws Throwable;

  Object add(long lhs, double rhs) throws Throwable;

  Object add(long lhs, BigInteger rhs) throws Throwable;

  Object add(long lhs, BigDecimal rhs) throws Throwable;

  Object add(float lhs, byte rhs) throws Throwable;

  Object add(float lhs, char rhs) throws Throwable;

  Object add(float lhs, short rhs) throws Throwable;

  Object add(float lhs, int rhs) throws Throwable;

  Object add(float lhs, long rhs) throws Throwable;

  Object add(float lhs, float rhs) throws Throwable;

  Object add(float lhs, double rhs) throws Throwable;

  Object add(float lhs, BigInteger rhs) throws Throwable;

  Object add(float lhs, BigDecimal rhs) throws Throwable;

  Object add(double lhs, byte rhs) throws Throwable;

  Object add(double lhs, char rhs) throws Throwable;

  Object add(double lhs, short rhs) throws Throwable;

  Object add(double lhs, int rhs) throws Throwable;

  Object add(double lhs, long rhs) throws Throwable;

  Object add(double lhs, float rhs) throws Throwable;

  Object add(double lhs, double rhs) throws Throwable;

  Object add(double lhs, BigInteger rhs) throws Throwable;

  Object add(double lhs, BigDecimal rhs) throws Throwable;

  Object add(BigInteger lhs, byte rhs) throws Throwable;

  Object add(BigInteger lhs, char rhs) throws Throwable;

  Object add(BigInteger lhs, short rhs) throws Throwable;

  Object add(BigInteger lhs, int rhs) throws Throwable;

  Object add(BigInteger lhs, long rhs) throws Throwable;

  Object add(BigInteger lhs, float rhs) throws Throwable;

  Object add(BigInteger lhs, double rhs) throws Throwable;

  Object add(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object add(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object add(BigDecimal lhs, byte rhs) throws Throwable;

  Object add(BigDecimal lhs, char rhs) throws Throwable;

  Object add(BigDecimal lhs, short rhs) throws Throwable;

  Object add(BigDecimal lhs, int rhs) throws Throwable;

  Object add(BigDecimal lhs, long rhs) throws Throwable;

  Object add(BigDecimal lhs, float rhs) throws Throwable;

  Object add(BigDecimal lhs, double rhs) throws Throwable;

  Object add(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object add(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object add(Object lhs, byte rhs) throws Throwable;

  Object add(Object lhs, char rhs) throws Throwable;

  Object add(Object lhs, short rhs) throws Throwable;

  Object add(Object lhs, int rhs) throws Throwable;

  Object add(Object lhs, long rhs) throws Throwable;

  Object add(Object lhs, float rhs) throws Throwable;

  Object add(Object lhs, double rhs) throws Throwable;

  Object add(Object lhs, BigInteger rhs) throws Throwable;

  Object add(Object lhs, BigDecimal rhs) throws Throwable;

  Object reverseAdd(byte lhs, Object rhs) throws Throwable;

  Object reverseAdd(char lhs, Object rhs) throws Throwable;

  Object reverseAdd(short lhs, Object rhs) throws Throwable;

  Object reverseAdd(int lhs, Object rhs) throws Throwable;

  Object reverseAdd(long lhs, Object rhs) throws Throwable;

  Object reverseAdd(float lhs, Object rhs) throws Throwable;

  Object reverseAdd(double lhs, Object rhs) throws Throwable;

  Object reverseAdd(BigInteger lhs, Object rhs) throws Throwable;

  Object reverseAdd(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Methods callable from compiler generated code for operator +=
  //

  Object addEquals(byte lhs, byte rhs) throws Throwable;

  Object addEquals(byte lhs, char rhs) throws Throwable;

  Object addEquals(byte lhs, short rhs) throws Throwable;

  Object addEquals(byte lhs, int rhs) throws Throwable;

  Object addEquals(byte lhs, long rhs) throws Throwable;

  Object addEquals(byte lhs, float rhs) throws Throwable;

  Object addEquals(byte lhs, double rhs) throws Throwable;

  Object addEquals(byte lhs, BigInteger rhs) throws Throwable;

  Object addEquals(byte lhs, BigDecimal rhs) throws Throwable;

  Object addEquals(char lhs, byte rhs) throws Throwable;

  Object addEquals(char lhs, char rhs) throws Throwable;

  Object addEquals(char lhs, short rhs) throws Throwable;

  Object addEquals(char lhs, int rhs) throws Throwable;

  Object addEquals(char lhs, long rhs) throws Throwable;

  Object addEquals(char lhs, float rhs) throws Throwable;

  Object addEquals(char lhs, double rhs) throws Throwable;

  Object addEquals(char lhs, BigInteger rhs) throws Throwable;

  Object addEquals(char lhs, BigDecimal rhs) throws Throwable;

  Object addEquals(short lhs, byte rhs) throws Throwable;

  Object addEquals(short lhs, char rhs) throws Throwable;

  Object addEquals(short lhs, short rhs) throws Throwable;

  Object addEquals(short lhs, int rhs) throws Throwable;

  Object addEquals(short lhs, long rhs) throws Throwable;

  Object addEquals(short lhs, float rhs) throws Throwable;

  Object addEquals(short lhs, double rhs) throws Throwable;

  Object addEquals(short lhs, BigInteger rhs) throws Throwable;

  Object addEquals(short lhs, BigDecimal rhs) throws Throwable;

  Object addEquals(int lhs, byte rhs) throws Throwable;

  Object addEquals(int lhs, char rhs) throws Throwable;

  Object addEquals(int lhs, short rhs) throws Throwable;

  Object addEquals(int lhs, int rhs) throws Throwable;

  Object addEquals(int lhs, long rhs) throws Throwable;

  Object addEquals(int lhs, float rhs) throws Throwable;

  Object addEquals(int lhs, double rhs) throws Throwable;

  Object addEquals(int lhs, BigInteger rhs) throws Throwable;

  Object addEquals(int lhs, BigDecimal rhs) throws Throwable;

  Object addEquals(long lhs, byte rhs) throws Throwable;

  Object addEquals(long lhs, char rhs) throws Throwable;

  Object addEquals(long lhs, short rhs) throws Throwable;

  Object addEquals(long lhs, int rhs) throws Throwable;

  Object addEquals(long lhs, long rhs) throws Throwable;

  Object addEquals(long lhs, float rhs) throws Throwable;

  Object addEquals(long lhs, double rhs) throws Throwable;

  Object addEquals(long lhs, BigInteger rhs) throws Throwable;

  Object addEquals(long lhs, BigDecimal rhs) throws Throwable;

  Object addEquals(float lhs, byte rhs) throws Throwable;

  Object addEquals(float lhs, char rhs) throws Throwable;

  Object addEquals(float lhs, short rhs) throws Throwable;

  Object addEquals(float lhs, int rhs) throws Throwable;

  Object addEquals(float lhs, long rhs) throws Throwable;

  Object addEquals(float lhs, float rhs) throws Throwable;

  Object addEquals(float lhs, double rhs) throws Throwable;

  Object addEquals(float lhs, BigInteger rhs) throws Throwable;

  Object addEquals(float lhs, BigDecimal rhs) throws Throwable;

  Object addEquals(double lhs, byte rhs) throws Throwable;

  Object addEquals(double lhs, char rhs) throws Throwable;

  Object addEquals(double lhs, short rhs) throws Throwable;

  Object addEquals(double lhs, int rhs) throws Throwable;

  Object addEquals(double lhs, long rhs) throws Throwable;

  Object addEquals(double lhs, float rhs) throws Throwable;

  Object addEquals(double lhs, double rhs) throws Throwable;

  Object addEquals(double lhs, BigInteger rhs) throws Throwable;

  Object addEquals(double lhs, BigDecimal rhs) throws Throwable;

  Object addEquals(BigInteger lhs, byte rhs) throws Throwable;

  Object addEquals(BigInteger lhs, char rhs) throws Throwable;

  Object addEquals(BigInteger lhs, short rhs) throws Throwable;

  Object addEquals(BigInteger lhs, int rhs) throws Throwable;

  Object addEquals(BigInteger lhs, long rhs) throws Throwable;

  Object addEquals(BigInteger lhs, float rhs) throws Throwable;

  Object addEquals(BigInteger lhs, double rhs) throws Throwable;

  Object addEquals(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object addEquals(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object addEquals(BigDecimal lhs, byte rhs) throws Throwable;

  Object addEquals(BigDecimal lhs, char rhs) throws Throwable;

  Object addEquals(BigDecimal lhs, short rhs) throws Throwable;

  Object addEquals(BigDecimal lhs, int rhs) throws Throwable;

  Object addEquals(BigDecimal lhs, long rhs) throws Throwable;

  Object addEquals(BigDecimal lhs, float rhs) throws Throwable;

  Object addEquals(BigDecimal lhs, double rhs) throws Throwable;

  Object addEquals(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object addEquals(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object addEquals(Object lhs, byte rhs) throws Throwable;

  Object addEquals(Object lhs, char rhs) throws Throwable;

  Object addEquals(Object lhs, short rhs) throws Throwable;

  Object addEquals(Object lhs, int rhs) throws Throwable;

  Object addEquals(Object lhs, long rhs) throws Throwable;

  Object addEquals(Object lhs, float rhs) throws Throwable;

  Object addEquals(Object lhs, double rhs) throws Throwable;

  Object addEquals(Object lhs, BigInteger rhs) throws Throwable;

  Object addEquals(Object lhs, BigDecimal rhs) throws Throwable;

  Object reverseAddEquals(byte lhs, Object rhs) throws Throwable;

  Object reverseAddEquals(char lhs, Object rhs) throws Throwable;

  Object reverseAddEquals(short lhs, Object rhs) throws Throwable;

  Object reverseAddEquals(int lhs, Object rhs) throws Throwable;

  Object reverseAddEquals(long lhs, Object rhs) throws Throwable;

  Object reverseAddEquals(float lhs, Object rhs) throws Throwable;

  Object reverseAddEquals(double lhs, Object rhs) throws Throwable;

  Object reverseAddEquals(BigInteger lhs, Object rhs) throws Throwable;

  Object reverseAddEquals(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Methods callable from compiler generated code for operator -
  //

  Object subtract(byte lhs, byte rhs) throws Throwable;

  Object subtract(byte lhs, char rhs) throws Throwable;

  Object subtract(byte lhs, short rhs) throws Throwable;

  Object subtract(byte lhs, int rhs) throws Throwable;

  Object subtract(byte lhs, long rhs) throws Throwable;

  Object subtract(byte lhs, float rhs) throws Throwable;

  Object subtract(byte lhs, double rhs) throws Throwable;

  Object subtract(byte lhs, BigInteger rhs) throws Throwable;

  Object subtract(byte lhs, BigDecimal rhs) throws Throwable;

  Object subtract(char lhs, byte rhs) throws Throwable;

  Object subtract(char lhs, char rhs) throws Throwable;

  Object subtract(char lhs, short rhs) throws Throwable;

  Object subtract(char lhs, int rhs) throws Throwable;

  Object subtract(char lhs, long rhs) throws Throwable;

  Object subtract(char lhs, float rhs) throws Throwable;

  Object subtract(char lhs, double rhs) throws Throwable;

  Object subtract(char lhs, BigInteger rhs) throws Throwable;

  Object subtract(char lhs, BigDecimal rhs) throws Throwable;

  Object subtract(short lhs, byte rhs) throws Throwable;

  Object subtract(short lhs, char rhs) throws Throwable;

  Object subtract(short lhs, short rhs) throws Throwable;

  Object subtract(short lhs, int rhs) throws Throwable;

  Object subtract(short lhs, long rhs) throws Throwable;

  Object subtract(short lhs, float rhs) throws Throwable;

  Object subtract(short lhs, double rhs) throws Throwable;

  Object subtract(short lhs, BigInteger rhs) throws Throwable;

  Object subtract(short lhs, BigDecimal rhs) throws Throwable;

  Object subtract(int lhs, byte rhs) throws Throwable;

  Object subtract(int lhs, char rhs) throws Throwable;

  Object subtract(int lhs, short rhs) throws Throwable;

  Object subtract(int lhs, int rhs) throws Throwable;

  Object subtract(int lhs, long rhs) throws Throwable;

  Object subtract(int lhs, float rhs) throws Throwable;

  Object subtract(int lhs, double rhs) throws Throwable;

  Object subtract(int lhs, BigInteger rhs) throws Throwable;

  Object subtract(int lhs, BigDecimal rhs) throws Throwable;

  Object subtract(long lhs, byte rhs) throws Throwable;

  Object subtract(long lhs, char rhs) throws Throwable;

  Object subtract(long lhs, short rhs) throws Throwable;

  Object subtract(long lhs, int rhs) throws Throwable;

  Object subtract(long lhs, long rhs) throws Throwable;

  Object subtract(long lhs, float rhs) throws Throwable;

  Object subtract(long lhs, double rhs) throws Throwable;

  Object subtract(long lhs, BigInteger rhs) throws Throwable;

  Object subtract(long lhs, BigDecimal rhs) throws Throwable;

  Object subtract(float lhs, byte rhs) throws Throwable;

  Object subtract(float lhs, char rhs) throws Throwable;

  Object subtract(float lhs, short rhs) throws Throwable;

  Object subtract(float lhs, int rhs) throws Throwable;

  Object subtract(float lhs, long rhs) throws Throwable;

  Object subtract(float lhs, float rhs) throws Throwable;

  Object subtract(float lhs, double rhs) throws Throwable;

  Object subtract(float lhs, BigInteger rhs) throws Throwable;

  Object subtract(float lhs, BigDecimal rhs) throws Throwable;

  Object subtract(double lhs, byte rhs) throws Throwable;

  Object subtract(double lhs, char rhs) throws Throwable;

  Object subtract(double lhs, short rhs) throws Throwable;

  Object subtract(double lhs, int rhs) throws Throwable;

  Object subtract(double lhs, long rhs) throws Throwable;

  Object subtract(double lhs, float rhs) throws Throwable;

  Object subtract(double lhs, double rhs) throws Throwable;

  Object subtract(double lhs, BigInteger rhs) throws Throwable;

  Object subtract(double lhs, BigDecimal rhs) throws Throwable;

  Object subtract(BigInteger lhs, byte rhs) throws Throwable;

  Object subtract(BigInteger lhs, char rhs) throws Throwable;

  Object subtract(BigInteger lhs, short rhs) throws Throwable;

  Object subtract(BigInteger lhs, int rhs) throws Throwable;

  Object subtract(BigInteger lhs, long rhs) throws Throwable;

  Object subtract(BigInteger lhs, float rhs) throws Throwable;

  Object subtract(BigInteger lhs, double rhs) throws Throwable;

  Object subtract(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object subtract(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object subtract(BigDecimal lhs, byte rhs) throws Throwable;

  Object subtract(BigDecimal lhs, char rhs) throws Throwable;

  Object subtract(BigDecimal lhs, short rhs) throws Throwable;

  Object subtract(BigDecimal lhs, int rhs) throws Throwable;

  Object subtract(BigDecimal lhs, long rhs) throws Throwable;

  Object subtract(BigDecimal lhs, float rhs) throws Throwable;

  Object subtract(BigDecimal lhs, double rhs) throws Throwable;

  Object subtract(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object subtract(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object subtract(Object lhs, byte rhs) throws Throwable;

  Object subtract(Object lhs, char rhs) throws Throwable;

  Object subtract(Object lhs, short rhs) throws Throwable;

  Object subtract(Object lhs, int rhs) throws Throwable;

  Object subtract(Object lhs, long rhs) throws Throwable;

  Object subtract(Object lhs, float rhs) throws Throwable;

  Object subtract(Object lhs, double rhs) throws Throwable;

  Object subtract(Object lhs, BigInteger rhs) throws Throwable;

  Object subtract(Object lhs, BigDecimal rhs) throws Throwable;

  Object reverseSubtract(byte lhs, Object rhs) throws Throwable;

  Object reverseSubtract(char lhs, Object rhs) throws Throwable;

  Object reverseSubtract(short lhs, Object rhs) throws Throwable;

  Object reverseSubtract(int lhs, Object rhs) throws Throwable;

  Object reverseSubtract(long lhs, Object rhs) throws Throwable;

  Object reverseSubtract(float lhs, Object rhs) throws Throwable;

  Object reverseSubtract(double lhs, Object rhs) throws Throwable;

  Object reverseSubtract(BigInteger lhs, Object rhs) throws Throwable;

  Object reverseSubtract(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Methods callable from compiler generated code for operator -=
  //

  Object subtractEquals(byte lhs, byte rhs) throws Throwable;

  Object subtractEquals(byte lhs, char rhs) throws Throwable;

  Object subtractEquals(byte lhs, short rhs) throws Throwable;

  Object subtractEquals(byte lhs, int rhs) throws Throwable;

  Object subtractEquals(byte lhs, long rhs) throws Throwable;

  Object subtractEquals(byte lhs, float rhs) throws Throwable;

  Object subtractEquals(byte lhs, double rhs) throws Throwable;

  Object subtractEquals(byte lhs, BigInteger rhs) throws Throwable;

  Object subtractEquals(byte lhs, BigDecimal rhs) throws Throwable;

  Object subtractEquals(char lhs, byte rhs) throws Throwable;

  Object subtractEquals(char lhs, char rhs) throws Throwable;

  Object subtractEquals(char lhs, short rhs) throws Throwable;

  Object subtractEquals(char lhs, int rhs) throws Throwable;

  Object subtractEquals(char lhs, long rhs) throws Throwable;

  Object subtractEquals(char lhs, float rhs) throws Throwable;

  Object subtractEquals(char lhs, double rhs) throws Throwable;

  Object subtractEquals(char lhs, BigInteger rhs) throws Throwable;

  Object subtractEquals(char lhs, BigDecimal rhs) throws Throwable;

  Object subtractEquals(short lhs, byte rhs) throws Throwable;

  Object subtractEquals(short lhs, char rhs) throws Throwable;

  Object subtractEquals(short lhs, short rhs) throws Throwable;

  Object subtractEquals(short lhs, int rhs) throws Throwable;

  Object subtractEquals(short lhs, long rhs) throws Throwable;

  Object subtractEquals(short lhs, float rhs) throws Throwable;

  Object subtractEquals(short lhs, double rhs) throws Throwable;

  Object subtractEquals(short lhs, BigInteger rhs) throws Throwable;

  Object subtractEquals(short lhs, BigDecimal rhs) throws Throwable;

  Object subtractEquals(int lhs, byte rhs) throws Throwable;

  Object subtractEquals(int lhs, char rhs) throws Throwable;

  Object subtractEquals(int lhs, short rhs) throws Throwable;

  Object subtractEquals(int lhs, int rhs) throws Throwable;

  Object subtractEquals(int lhs, long rhs) throws Throwable;

  Object subtractEquals(int lhs, float rhs) throws Throwable;

  Object subtractEquals(int lhs, double rhs) throws Throwable;

  Object subtractEquals(int lhs, BigInteger rhs) throws Throwable;

  Object subtractEquals(int lhs, BigDecimal rhs) throws Throwable;

  Object subtractEquals(long lhs, byte rhs) throws Throwable;

  Object subtractEquals(long lhs, char rhs) throws Throwable;

  Object subtractEquals(long lhs, short rhs) throws Throwable;

  Object subtractEquals(long lhs, int rhs) throws Throwable;

  Object subtractEquals(long lhs, long rhs) throws Throwable;

  Object subtractEquals(long lhs, float rhs) throws Throwable;

  Object subtractEquals(long lhs, double rhs) throws Throwable;

  Object subtractEquals(long lhs, BigInteger rhs) throws Throwable;

  Object subtractEquals(long lhs, BigDecimal rhs) throws Throwable;

  Object subtractEquals(float lhs, byte rhs) throws Throwable;

  Object subtractEquals(float lhs, char rhs) throws Throwable;

  Object subtractEquals(float lhs, short rhs) throws Throwable;

  Object subtractEquals(float lhs, int rhs) throws Throwable;

  Object subtractEquals(float lhs, long rhs) throws Throwable;

  Object subtractEquals(float lhs, float rhs) throws Throwable;

  Object subtractEquals(float lhs, double rhs) throws Throwable;

  Object subtractEquals(float lhs, BigInteger rhs) throws Throwable;

  Object subtractEquals(float lhs, BigDecimal rhs) throws Throwable;

  Object subtractEquals(double lhs, byte rhs) throws Throwable;

  Object subtractEquals(double lhs, char rhs) throws Throwable;

  Object subtractEquals(double lhs, short rhs) throws Throwable;

  Object subtractEquals(double lhs, int rhs) throws Throwable;

  Object subtractEquals(double lhs, long rhs) throws Throwable;

  Object subtractEquals(double lhs, float rhs) throws Throwable;

  Object subtractEquals(double lhs, double rhs) throws Throwable;

  Object subtractEquals(double lhs, BigInteger rhs) throws Throwable;

  Object subtractEquals(double lhs, BigDecimal rhs) throws Throwable;

  Object subtractEquals(BigInteger lhs, byte rhs) throws Throwable;

  Object subtractEquals(BigInteger lhs, char rhs) throws Throwable;

  Object subtractEquals(BigInteger lhs, short rhs) throws Throwable;

  Object subtractEquals(BigInteger lhs, int rhs) throws Throwable;

  Object subtractEquals(BigInteger lhs, long rhs) throws Throwable;

  Object subtractEquals(BigInteger lhs, float rhs) throws Throwable;

  Object subtractEquals(BigInteger lhs, double rhs) throws Throwable;

  Object subtractEquals(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object subtractEquals(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object subtractEquals(BigDecimal lhs, byte rhs) throws Throwable;

  Object subtractEquals(BigDecimal lhs, char rhs) throws Throwable;

  Object subtractEquals(BigDecimal lhs, short rhs) throws Throwable;

  Object subtractEquals(BigDecimal lhs, int rhs) throws Throwable;

  Object subtractEquals(BigDecimal lhs, long rhs) throws Throwable;

  Object subtractEquals(BigDecimal lhs, float rhs) throws Throwable;

  Object subtractEquals(BigDecimal lhs, double rhs) throws Throwable;

  Object subtractEquals(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object subtractEquals(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object subtractEquals(Object lhs, byte rhs) throws Throwable;

  Object subtractEquals(Object lhs, char rhs) throws Throwable;

  Object subtractEquals(Object lhs, short rhs) throws Throwable;

  Object subtractEquals(Object lhs, int rhs) throws Throwable;

  Object subtractEquals(Object lhs, long rhs) throws Throwable;

  Object subtractEquals(Object lhs, float rhs) throws Throwable;

  Object subtractEquals(Object lhs, double rhs) throws Throwable;

  Object subtractEquals(Object lhs, BigInteger rhs) throws Throwable;

  Object subtractEquals(Object lhs, BigDecimal rhs) throws Throwable;

  Object reverseSubtractEquals(byte lhs, Object rhs) throws Throwable;

  Object reverseSubtractEquals(char lhs, Object rhs) throws Throwable;

  Object reverseSubtractEquals(short lhs, Object rhs) throws Throwable;

  Object reverseSubtractEquals(int lhs, Object rhs) throws Throwable;

  Object reverseSubtractEquals(long lhs, Object rhs) throws Throwable;

  Object reverseSubtractEquals(float lhs, Object rhs) throws Throwable;

  Object reverseSubtractEquals(double lhs, Object rhs) throws Throwable;

  Object reverseSubtractEquals(BigInteger lhs, Object rhs) throws Throwable;

  Object reverseSubtractEquals(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Methods callable from compiler generated code for operator *
  //

  Object multiply(byte lhs, byte rhs) throws Throwable;

  Object multiply(byte lhs, char rhs) throws Throwable;

  Object multiply(byte lhs, short rhs) throws Throwable;

  Object multiply(byte lhs, int rhs) throws Throwable;

  Object multiply(byte lhs, long rhs) throws Throwable;

  Object multiply(byte lhs, float rhs) throws Throwable;

  Object multiply(byte lhs, double rhs) throws Throwable;

  Object multiply(byte lhs, BigInteger rhs) throws Throwable;

  Object multiply(byte lhs, BigDecimal rhs) throws Throwable;

  Object multiply(char lhs, byte rhs) throws Throwable;

  Object multiply(char lhs, char rhs) throws Throwable;

  Object multiply(char lhs, short rhs) throws Throwable;

  Object multiply(char lhs, int rhs) throws Throwable;

  Object multiply(char lhs, long rhs) throws Throwable;

  Object multiply(char lhs, float rhs) throws Throwable;

  Object multiply(char lhs, double rhs) throws Throwable;

  Object multiply(char lhs, BigInteger rhs) throws Throwable;

  Object multiply(char lhs, BigDecimal rhs) throws Throwable;

  Object multiply(short lhs, byte rhs) throws Throwable;

  Object multiply(short lhs, char rhs) throws Throwable;

  Object multiply(short lhs, short rhs) throws Throwable;

  Object multiply(short lhs, int rhs) throws Throwable;

  Object multiply(short lhs, long rhs) throws Throwable;

  Object multiply(short lhs, float rhs) throws Throwable;

  Object multiply(short lhs, double rhs) throws Throwable;

  Object multiply(short lhs, BigInteger rhs) throws Throwable;

  Object multiply(short lhs, BigDecimal rhs) throws Throwable;

  Object multiply(int lhs, byte rhs) throws Throwable;

  Object multiply(int lhs, char rhs) throws Throwable;

  Object multiply(int lhs, short rhs) throws Throwable;

  Object multiply(int lhs, int rhs) throws Throwable;

  Object multiply(int lhs, long rhs) throws Throwable;

  Object multiply(int lhs, float rhs) throws Throwable;

  Object multiply(int lhs, double rhs) throws Throwable;

  Object multiply(int lhs, BigInteger rhs) throws Throwable;

  Object multiply(int lhs, BigDecimal rhs) throws Throwable;

  Object multiply(long lhs, byte rhs) throws Throwable;

  Object multiply(long lhs, char rhs) throws Throwable;

  Object multiply(long lhs, short rhs) throws Throwable;

  Object multiply(long lhs, int rhs) throws Throwable;

  Object multiply(long lhs, long rhs) throws Throwable;

  Object multiply(long lhs, float rhs) throws Throwable;

  Object multiply(long lhs, double rhs) throws Throwable;

  Object multiply(long lhs, BigInteger rhs) throws Throwable;

  Object multiply(long lhs, BigDecimal rhs) throws Throwable;

  Object multiply(float lhs, byte rhs) throws Throwable;

  Object multiply(float lhs, char rhs) throws Throwable;

  Object multiply(float lhs, short rhs) throws Throwable;

  Object multiply(float lhs, int rhs) throws Throwable;

  Object multiply(float lhs, long rhs) throws Throwable;

  Object multiply(float lhs, float rhs) throws Throwable;

  Object multiply(float lhs, double rhs) throws Throwable;

  Object multiply(float lhs, BigInteger rhs) throws Throwable;

  Object multiply(float lhs, BigDecimal rhs) throws Throwable;

  Object multiply(double lhs, byte rhs) throws Throwable;

  Object multiply(double lhs, char rhs) throws Throwable;

  Object multiply(double lhs, short rhs) throws Throwable;

  Object multiply(double lhs, int rhs) throws Throwable;

  Object multiply(double lhs, long rhs) throws Throwable;

  Object multiply(double lhs, float rhs) throws Throwable;

  Object multiply(double lhs, double rhs) throws Throwable;

  Object multiply(double lhs, BigInteger rhs) throws Throwable;

  Object multiply(double lhs, BigDecimal rhs) throws Throwable;

  Object multiply(BigInteger lhs, byte rhs) throws Throwable;

  Object multiply(BigInteger lhs, char rhs) throws Throwable;

  Object multiply(BigInteger lhs, short rhs) throws Throwable;

  Object multiply(BigInteger lhs, int rhs) throws Throwable;

  Object multiply(BigInteger lhs, long rhs) throws Throwable;

  Object multiply(BigInteger lhs, float rhs) throws Throwable;

  Object multiply(BigInteger lhs, double rhs) throws Throwable;

  Object multiply(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object multiply(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object multiply(BigDecimal lhs, byte rhs) throws Throwable;

  Object multiply(BigDecimal lhs, char rhs) throws Throwable;

  Object multiply(BigDecimal lhs, short rhs) throws Throwable;

  Object multiply(BigDecimal lhs, int rhs) throws Throwable;

  Object multiply(BigDecimal lhs, long rhs) throws Throwable;

  Object multiply(BigDecimal lhs, float rhs) throws Throwable;

  Object multiply(BigDecimal lhs, double rhs) throws Throwable;

  Object multiply(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object multiply(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object multiply(Object lhs, byte rhs) throws Throwable;

  Object multiply(Object lhs, char rhs) throws Throwable;

  Object multiply(Object lhs, short rhs) throws Throwable;

  Object multiply(Object lhs, int rhs) throws Throwable;

  Object multiply(Object lhs, long rhs) throws Throwable;

  Object multiply(Object lhs, float rhs) throws Throwable;

  Object multiply(Object lhs, double rhs) throws Throwable;

  Object multiply(Object lhs, BigInteger rhs) throws Throwable;

  Object multiply(Object lhs, BigDecimal rhs) throws Throwable;

  Object reverseMultiply(byte lhs, Object rhs) throws Throwable;

  Object reverseMultiply(char lhs, Object rhs) throws Throwable;

  Object reverseMultiply(short lhs, Object rhs) throws Throwable;

  Object reverseMultiply(int lhs, Object rhs) throws Throwable;

  Object reverseMultiply(long lhs, Object rhs) throws Throwable;

  Object reverseMultiply(float lhs, Object rhs) throws Throwable;

  Object reverseMultiply(double lhs, Object rhs) throws Throwable;

  Object reverseMultiply(BigInteger lhs, Object rhs) throws Throwable;

  Object reverseMultiply(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Methods callable from compiler generated code for operator *=
  //

  Object multiplyEquals(byte lhs, byte rhs) throws Throwable;

  Object multiplyEquals(byte lhs, char rhs) throws Throwable;

  Object multiplyEquals(byte lhs, short rhs) throws Throwable;

  Object multiplyEquals(byte lhs, int rhs) throws Throwable;

  Object multiplyEquals(byte lhs, long rhs) throws Throwable;

  Object multiplyEquals(byte lhs, float rhs) throws Throwable;

  Object multiplyEquals(byte lhs, double rhs) throws Throwable;

  Object multiplyEquals(byte lhs, BigInteger rhs) throws Throwable;

  Object multiplyEquals(byte lhs, BigDecimal rhs) throws Throwable;

  Object multiplyEquals(char lhs, byte rhs) throws Throwable;

  Object multiplyEquals(char lhs, char rhs) throws Throwable;

  Object multiplyEquals(char lhs, short rhs) throws Throwable;

  Object multiplyEquals(char lhs, int rhs) throws Throwable;

  Object multiplyEquals(char lhs, long rhs) throws Throwable;

  Object multiplyEquals(char lhs, float rhs) throws Throwable;

  Object multiplyEquals(char lhs, double rhs) throws Throwable;

  Object multiplyEquals(char lhs, BigInteger rhs) throws Throwable;

  Object multiplyEquals(char lhs, BigDecimal rhs) throws Throwable;

  Object multiplyEquals(short lhs, byte rhs) throws Throwable;

  Object multiplyEquals(short lhs, char rhs) throws Throwable;

  Object multiplyEquals(short lhs, short rhs) throws Throwable;

  Object multiplyEquals(short lhs, int rhs) throws Throwable;

  Object multiplyEquals(short lhs, long rhs) throws Throwable;

  Object multiplyEquals(short lhs, float rhs) throws Throwable;

  Object multiplyEquals(short lhs, double rhs) throws Throwable;

  Object multiplyEquals(short lhs, BigInteger rhs) throws Throwable;

  Object multiplyEquals(short lhs, BigDecimal rhs) throws Throwable;

  Object multiplyEquals(int lhs, byte rhs) throws Throwable;

  Object multiplyEquals(int lhs, char rhs) throws Throwable;

  Object multiplyEquals(int lhs, short rhs) throws Throwable;

  Object multiplyEquals(int lhs, int rhs) throws Throwable;

  Object multiplyEquals(int lhs, long rhs) throws Throwable;

  Object multiplyEquals(int lhs, float rhs) throws Throwable;

  Object multiplyEquals(int lhs, double rhs) throws Throwable;

  Object multiplyEquals(int lhs, BigInteger rhs) throws Throwable;

  Object multiplyEquals(int lhs, BigDecimal rhs) throws Throwable;

  Object multiplyEquals(long lhs, byte rhs) throws Throwable;

  Object multiplyEquals(long lhs, char rhs) throws Throwable;

  Object multiplyEquals(long lhs, short rhs) throws Throwable;

  Object multiplyEquals(long lhs, int rhs) throws Throwable;

  Object multiplyEquals(long lhs, long rhs) throws Throwable;

  Object multiplyEquals(long lhs, float rhs) throws Throwable;

  Object multiplyEquals(long lhs, double rhs) throws Throwable;

  Object multiplyEquals(long lhs, BigInteger rhs) throws Throwable;

  Object multiplyEquals(long lhs, BigDecimal rhs) throws Throwable;

  Object multiplyEquals(float lhs, byte rhs) throws Throwable;

  Object multiplyEquals(float lhs, char rhs) throws Throwable;

  Object multiplyEquals(float lhs, short rhs) throws Throwable;

  Object multiplyEquals(float lhs, int rhs) throws Throwable;

  Object multiplyEquals(float lhs, long rhs) throws Throwable;

  Object multiplyEquals(float lhs, float rhs) throws Throwable;

  Object multiplyEquals(float lhs, double rhs) throws Throwable;

  Object multiplyEquals(float lhs, BigInteger rhs) throws Throwable;

  Object multiplyEquals(float lhs, BigDecimal rhs) throws Throwable;

  Object multiplyEquals(double lhs, byte rhs) throws Throwable;

  Object multiplyEquals(double lhs, char rhs) throws Throwable;

  Object multiplyEquals(double lhs, short rhs) throws Throwable;

  Object multiplyEquals(double lhs, int rhs) throws Throwable;

  Object multiplyEquals(double lhs, long rhs) throws Throwable;

  Object multiplyEquals(double lhs, float rhs) throws Throwable;

  Object multiplyEquals(double lhs, double rhs) throws Throwable;

  Object multiplyEquals(double lhs, BigInteger rhs) throws Throwable;

  Object multiplyEquals(double lhs, BigDecimal rhs) throws Throwable;

  Object multiplyEquals(BigInteger lhs, byte rhs) throws Throwable;

  Object multiplyEquals(BigInteger lhs, char rhs) throws Throwable;

  Object multiplyEquals(BigInteger lhs, short rhs) throws Throwable;

  Object multiplyEquals(BigInteger lhs, int rhs) throws Throwable;

  Object multiplyEquals(BigInteger lhs, long rhs) throws Throwable;

  Object multiplyEquals(BigInteger lhs, float rhs) throws Throwable;

  Object multiplyEquals(BigInteger lhs, double rhs) throws Throwable;

  Object multiplyEquals(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object multiplyEquals(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object multiplyEquals(BigDecimal lhs, byte rhs) throws Throwable;

  Object multiplyEquals(BigDecimal lhs, char rhs) throws Throwable;

  Object multiplyEquals(BigDecimal lhs, short rhs) throws Throwable;

  Object multiplyEquals(BigDecimal lhs, int rhs) throws Throwable;

  Object multiplyEquals(BigDecimal lhs, long rhs) throws Throwable;

  Object multiplyEquals(BigDecimal lhs, float rhs) throws Throwable;

  Object multiplyEquals(BigDecimal lhs, double rhs) throws Throwable;

  Object multiplyEquals(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object multiplyEquals(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object multiplyEquals(Object lhs, byte rhs) throws Throwable;

  Object multiplyEquals(Object lhs, char rhs) throws Throwable;

  Object multiplyEquals(Object lhs, short rhs) throws Throwable;

  Object multiplyEquals(Object lhs, int rhs) throws Throwable;

  Object multiplyEquals(Object lhs, long rhs) throws Throwable;

  Object multiplyEquals(Object lhs, float rhs) throws Throwable;

  Object multiplyEquals(Object lhs, double rhs) throws Throwable;

  Object multiplyEquals(Object lhs, BigInteger rhs) throws Throwable;

  Object multiplyEquals(Object lhs, BigDecimal rhs) throws Throwable;

  Object reverseMultiplyEquals(byte lhs, Object rhs) throws Throwable;

  Object reverseMultiplyEquals(char lhs, Object rhs) throws Throwable;

  Object reverseMultiplyEquals(short lhs, Object rhs) throws Throwable;

  Object reverseMultiplyEquals(int lhs, Object rhs) throws Throwable;

  Object reverseMultiplyEquals(long lhs, Object rhs) throws Throwable;

  Object reverseMultiplyEquals(float lhs, Object rhs) throws Throwable;

  Object reverseMultiplyEquals(double lhs, Object rhs) throws Throwable;

  Object reverseMultiplyEquals(BigInteger lhs, Object rhs) throws Throwable;

  Object reverseMultiplyEquals(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Methods callable from compiler generated code for operator /
  //

  Object divide(byte lhs, byte rhs) throws Throwable;

  Object divide(byte lhs, char rhs) throws Throwable;

  Object divide(byte lhs, short rhs) throws Throwable;

  Object divide(byte lhs, int rhs) throws Throwable;

  Object divide(byte lhs, long rhs) throws Throwable;

  Object divide(byte lhs, float rhs) throws Throwable;

  Object divide(byte lhs, double rhs) throws Throwable;

  Object divide(byte lhs, BigInteger rhs) throws Throwable;

  Object divide(byte lhs, BigDecimal rhs) throws Throwable;

  Object divide(char lhs, byte rhs) throws Throwable;

  Object divide(char lhs, char rhs) throws Throwable;

  Object divide(char lhs, short rhs) throws Throwable;

  Object divide(char lhs, int rhs) throws Throwable;

  Object divide(char lhs, long rhs) throws Throwable;

  Object divide(char lhs, float rhs) throws Throwable;

  Object divide(char lhs, double rhs) throws Throwable;

  Object divide(char lhs, BigInteger rhs) throws Throwable;

  Object divide(char lhs, BigDecimal rhs) throws Throwable;

  Object divide(short lhs, byte rhs) throws Throwable;

  Object divide(short lhs, char rhs) throws Throwable;

  Object divide(short lhs, short rhs) throws Throwable;

  Object divide(short lhs, int rhs) throws Throwable;

  Object divide(short lhs, long rhs) throws Throwable;

  Object divide(short lhs, float rhs) throws Throwable;

  Object divide(short lhs, double rhs) throws Throwable;

  Object divide(short lhs, BigInteger rhs) throws Throwable;

  Object divide(short lhs, BigDecimal rhs) throws Throwable;

  Object divide(int lhs, byte rhs) throws Throwable;

  Object divide(int lhs, char rhs) throws Throwable;

  Object divide(int lhs, short rhs) throws Throwable;

  Object divide(int lhs, int rhs) throws Throwable;

  Object divide(int lhs, long rhs) throws Throwable;

  Object divide(int lhs, float rhs) throws Throwable;

  Object divide(int lhs, double rhs) throws Throwable;

  Object divide(int lhs, BigInteger rhs) throws Throwable;

  Object divide(int lhs, BigDecimal rhs) throws Throwable;

  Object divide(long lhs, byte rhs) throws Throwable;

  Object divide(long lhs, char rhs) throws Throwable;

  Object divide(long lhs, short rhs) throws Throwable;

  Object divide(long lhs, int rhs) throws Throwable;

  Object divide(long lhs, long rhs) throws Throwable;

  Object divide(long lhs, float rhs) throws Throwable;

  Object divide(long lhs, double rhs) throws Throwable;

  Object divide(long lhs, BigInteger rhs) throws Throwable;

  Object divide(long lhs, BigDecimal rhs) throws Throwable;

  Object divide(float lhs, byte rhs) throws Throwable;

  Object divide(float lhs, char rhs) throws Throwable;

  Object divide(float lhs, short rhs) throws Throwable;

  Object divide(float lhs, int rhs) throws Throwable;

  Object divide(float lhs, long rhs) throws Throwable;

  Object divide(float lhs, float rhs) throws Throwable;

  Object divide(float lhs, double rhs) throws Throwable;

  Object divide(float lhs, BigInteger rhs) throws Throwable;

  Object divide(float lhs, BigDecimal rhs) throws Throwable;

  Object divide(double lhs, byte rhs) throws Throwable;

  Object divide(double lhs, char rhs) throws Throwable;

  Object divide(double lhs, short rhs) throws Throwable;

  Object divide(double lhs, int rhs) throws Throwable;

  Object divide(double lhs, long rhs) throws Throwable;

  Object divide(double lhs, float rhs) throws Throwable;

  Object divide(double lhs, double rhs) throws Throwable;

  Object divide(double lhs, BigInteger rhs) throws Throwable;

  Object divide(double lhs, BigDecimal rhs) throws Throwable;

  Object divide(BigInteger lhs, byte rhs) throws Throwable;

  Object divide(BigInteger lhs, char rhs) throws Throwable;

  Object divide(BigInteger lhs, short rhs) throws Throwable;

  Object divide(BigInteger lhs, int rhs) throws Throwable;

  Object divide(BigInteger lhs, long rhs) throws Throwable;

  Object divide(BigInteger lhs, float rhs) throws Throwable;

  Object divide(BigInteger lhs, double rhs) throws Throwable;

  Object divide(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object divide(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object divide(BigDecimal lhs, byte rhs) throws Throwable;

  Object divide(BigDecimal lhs, char rhs) throws Throwable;

  Object divide(BigDecimal lhs, short rhs) throws Throwable;

  Object divide(BigDecimal lhs, int rhs) throws Throwable;

  Object divide(BigDecimal lhs, long rhs) throws Throwable;

  Object divide(BigDecimal lhs, float rhs) throws Throwable;

  Object divide(BigDecimal lhs, double rhs) throws Throwable;

  Object divide(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object divide(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object divide(Object lhs, byte rhs) throws Throwable;

  Object divide(Object lhs, char rhs) throws Throwable;

  Object divide(Object lhs, short rhs) throws Throwable;

  Object divide(Object lhs, int rhs) throws Throwable;

  Object divide(Object lhs, long rhs) throws Throwable;

  Object divide(Object lhs, float rhs) throws Throwable;

  Object divide(Object lhs, double rhs) throws Throwable;

  Object divide(Object lhs, BigInteger rhs) throws Throwable;

  Object divide(Object lhs, BigDecimal rhs) throws Throwable;

  Object reverseDivide(byte lhs, Object rhs) throws Throwable;

  Object reverseDivide(char lhs, Object rhs) throws Throwable;

  Object reverseDivide(short lhs, Object rhs) throws Throwable;

  Object reverseDivide(int lhs, Object rhs) throws Throwable;

  Object reverseDivide(long lhs, Object rhs) throws Throwable;

  Object reverseDivide(float lhs, Object rhs) throws Throwable;

  Object reverseDivide(double lhs, Object rhs) throws Throwable;

  Object reverseDivide(BigInteger lhs, Object rhs) throws Throwable;

  Object reverseDivide(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Methods callable from compiler generated code for operator /=
  //

  Object divideEquals(byte lhs, byte rhs) throws Throwable;

  Object divideEquals(byte lhs, char rhs) throws Throwable;

  Object divideEquals(byte lhs, short rhs) throws Throwable;

  Object divideEquals(byte lhs, int rhs) throws Throwable;

  Object divideEquals(byte lhs, long rhs) throws Throwable;

  Object divideEquals(byte lhs, float rhs) throws Throwable;

  Object divideEquals(byte lhs, double rhs) throws Throwable;

  Object divideEquals(byte lhs, BigInteger rhs) throws Throwable;

  Object divideEquals(byte lhs, BigDecimal rhs) throws Throwable;

  Object divideEquals(char lhs, byte rhs) throws Throwable;

  Object divideEquals(char lhs, char rhs) throws Throwable;

  Object divideEquals(char lhs, short rhs) throws Throwable;

  Object divideEquals(char lhs, int rhs) throws Throwable;

  Object divideEquals(char lhs, long rhs) throws Throwable;

  Object divideEquals(char lhs, float rhs) throws Throwable;

  Object divideEquals(char lhs, double rhs) throws Throwable;

  Object divideEquals(char lhs, BigInteger rhs) throws Throwable;

  Object divideEquals(char lhs, BigDecimal rhs) throws Throwable;

  Object divideEquals(short lhs, byte rhs) throws Throwable;

  Object divideEquals(short lhs, char rhs) throws Throwable;

  Object divideEquals(short lhs, short rhs) throws Throwable;

  Object divideEquals(short lhs, int rhs) throws Throwable;

  Object divideEquals(short lhs, long rhs) throws Throwable;

  Object divideEquals(short lhs, float rhs) throws Throwable;

  Object divideEquals(short lhs, double rhs) throws Throwable;

  Object divideEquals(short lhs, BigInteger rhs) throws Throwable;

  Object divideEquals(short lhs, BigDecimal rhs) throws Throwable;

  Object divideEquals(int lhs, byte rhs) throws Throwable;

  Object divideEquals(int lhs, char rhs) throws Throwable;

  Object divideEquals(int lhs, short rhs) throws Throwable;

  Object divideEquals(int lhs, int rhs) throws Throwable;

  Object divideEquals(int lhs, long rhs) throws Throwable;

  Object divideEquals(int lhs, float rhs) throws Throwable;

  Object divideEquals(int lhs, double rhs) throws Throwable;

  Object divideEquals(int lhs, BigInteger rhs) throws Throwable;

  Object divideEquals(int lhs, BigDecimal rhs) throws Throwable;

  Object divideEquals(long lhs, byte rhs) throws Throwable;

  Object divideEquals(long lhs, char rhs) throws Throwable;

  Object divideEquals(long lhs, short rhs) throws Throwable;

  Object divideEquals(long lhs, int rhs) throws Throwable;

  Object divideEquals(long lhs, long rhs) throws Throwable;

  Object divideEquals(long lhs, float rhs) throws Throwable;

  Object divideEquals(long lhs, double rhs) throws Throwable;

  Object divideEquals(long lhs, BigInteger rhs) throws Throwable;

  Object divideEquals(long lhs, BigDecimal rhs) throws Throwable;

  Object divideEquals(float lhs, byte rhs) throws Throwable;

  Object divideEquals(float lhs, char rhs) throws Throwable;

  Object divideEquals(float lhs, short rhs) throws Throwable;

  Object divideEquals(float lhs, int rhs) throws Throwable;

  Object divideEquals(float lhs, long rhs) throws Throwable;

  Object divideEquals(float lhs, float rhs) throws Throwable;

  Object divideEquals(float lhs, double rhs) throws Throwable;

  Object divideEquals(float lhs, BigInteger rhs) throws Throwable;

  Object divideEquals(float lhs, BigDecimal rhs) throws Throwable;

  Object divideEquals(double lhs, byte rhs) throws Throwable;

  Object divideEquals(double lhs, char rhs) throws Throwable;

  Object divideEquals(double lhs, short rhs) throws Throwable;

  Object divideEquals(double lhs, int rhs) throws Throwable;

  Object divideEquals(double lhs, long rhs) throws Throwable;

  Object divideEquals(double lhs, float rhs) throws Throwable;

  Object divideEquals(double lhs, double rhs) throws Throwable;

  Object divideEquals(double lhs, BigInteger rhs) throws Throwable;

  Object divideEquals(double lhs, BigDecimal rhs) throws Throwable;

  Object divideEquals(BigInteger lhs, byte rhs) throws Throwable;

  Object divideEquals(BigInteger lhs, char rhs) throws Throwable;

  Object divideEquals(BigInteger lhs, short rhs) throws Throwable;

  Object divideEquals(BigInteger lhs, int rhs) throws Throwable;

  Object divideEquals(BigInteger lhs, long rhs) throws Throwable;

  Object divideEquals(BigInteger lhs, float rhs) throws Throwable;

  Object divideEquals(BigInteger lhs, double rhs) throws Throwable;

  Object divideEquals(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object divideEquals(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object divideEquals(BigDecimal lhs, byte rhs) throws Throwable;

  Object divideEquals(BigDecimal lhs, char rhs) throws Throwable;

  Object divideEquals(BigDecimal lhs, short rhs) throws Throwable;

  Object divideEquals(BigDecimal lhs, int rhs) throws Throwable;

  Object divideEquals(BigDecimal lhs, long rhs) throws Throwable;

  Object divideEquals(BigDecimal lhs, float rhs) throws Throwable;

  Object divideEquals(BigDecimal lhs, double rhs) throws Throwable;

  Object divideEquals(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object divideEquals(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object divideEquals(Object lhs, byte rhs) throws Throwable;

  Object divideEquals(Object lhs, char rhs) throws Throwable;

  Object divideEquals(Object lhs, short rhs) throws Throwable;

  Object divideEquals(Object lhs, int rhs) throws Throwable;

  Object divideEquals(Object lhs, long rhs) throws Throwable;

  Object divideEquals(Object lhs, float rhs) throws Throwable;

  Object divideEquals(Object lhs, double rhs) throws Throwable;

  Object divideEquals(Object lhs, BigInteger rhs) throws Throwable;

  Object divideEquals(Object lhs, BigDecimal rhs) throws Throwable;

  Object reverseDivideEquals(byte lhs, Object rhs) throws Throwable;

  Object reverseDivideEquals(char lhs, Object rhs) throws Throwable;

  Object reverseDivideEquals(short lhs, Object rhs) throws Throwable;

  Object reverseDivideEquals(int lhs, Object rhs) throws Throwable;

  Object reverseDivideEquals(long lhs, Object rhs) throws Throwable;

  Object reverseDivideEquals(float lhs, Object rhs) throws Throwable;

  Object reverseDivideEquals(double lhs, Object rhs) throws Throwable;

  Object reverseDivideEquals(BigInteger lhs, Object rhs) throws Throwable;

  Object reverseDivideEquals(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Methods callable from compiler generated code for operator %
  //

  Object remainder(byte lhs, byte rhs) throws Throwable;

  Object remainder(byte lhs, char rhs) throws Throwable;

  Object remainder(byte lhs, short rhs) throws Throwable;

  Object remainder(byte lhs, int rhs) throws Throwable;

  Object remainder(byte lhs, long rhs) throws Throwable;

  Object remainder(byte lhs, BigInteger rhs) throws Throwable;

  Object remainder(char lhs, byte rhs) throws Throwable;

  Object remainder(char lhs, char rhs) throws Throwable;

  Object remainder(char lhs, short rhs) throws Throwable;

  Object remainder(char lhs, int rhs) throws Throwable;

  Object remainder(char lhs, long rhs) throws Throwable;

  Object remainder(char lhs, BigInteger rhs) throws Throwable;

  Object remainder(short lhs, byte rhs) throws Throwable;

  Object remainder(short lhs, char rhs) throws Throwable;

  Object remainder(short lhs, short rhs) throws Throwable;

  Object remainder(short lhs, int rhs) throws Throwable;

  Object remainder(short lhs, long rhs) throws Throwable;

  Object remainder(short lhs, BigInteger rhs) throws Throwable;

  Object remainder(int lhs, byte rhs) throws Throwable;

  Object remainder(int lhs, char rhs) throws Throwable;

  Object remainder(int lhs, short rhs) throws Throwable;

  Object remainder(int lhs, int rhs) throws Throwable;

  Object remainder(int lhs, long rhs) throws Throwable;

  Object remainder(int lhs, BigInteger rhs) throws Throwable;

  Object remainder(long lhs, byte rhs) throws Throwable;

  Object remainder(long lhs, char rhs) throws Throwable;

  Object remainder(long lhs, short rhs) throws Throwable;

  Object remainder(long lhs, int rhs) throws Throwable;

  Object remainder(long lhs, long rhs) throws Throwable;

  Object remainder(long lhs, BigInteger rhs) throws Throwable;

  Object remainder(BigInteger lhs, byte rhs) throws Throwable;

  Object remainder(BigInteger lhs, char rhs) throws Throwable;

  Object remainder(BigInteger lhs, short rhs) throws Throwable;

  Object remainder(BigInteger lhs, int rhs) throws Throwable;

  Object remainder(BigInteger lhs, long rhs) throws Throwable;

  Object remainder(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object remainder(Object lhs, byte rhs) throws Throwable;

  Object remainder(Object lhs, char rhs) throws Throwable;

  Object remainder(Object lhs, short rhs) throws Throwable;

  Object remainder(Object lhs, int rhs) throws Throwable;

  Object remainder(Object lhs, long rhs) throws Throwable;

  Object remainder(Object lhs, BigInteger rhs) throws Throwable;

  Object reverseRemainder(byte lhs, Object rhs) throws Throwable;

  Object reverseRemainder(char lhs, Object rhs) throws Throwable;

  Object reverseRemainder(short lhs, Object rhs) throws Throwable;

  Object reverseRemainder(int lhs, Object rhs) throws Throwable;

  Object reverseRemainder(long lhs, Object rhs) throws Throwable;

  Object reverseRemainder(BigInteger lhs, Object rhs) throws Throwable;

  //
  //   Methods callable from compiler generated code for operator %=
  //

  Object remainderEquals(byte lhs, byte rhs) throws Throwable;

  Object remainderEquals(byte lhs, char rhs) throws Throwable;

  Object remainderEquals(byte lhs, short rhs) throws Throwable;

  Object remainderEquals(byte lhs, int rhs) throws Throwable;

  Object remainderEquals(byte lhs, long rhs) throws Throwable;

  Object remainderEquals(byte lhs, BigInteger rhs) throws Throwable;

  Object remainderEquals(char lhs, byte rhs) throws Throwable;

  Object remainderEquals(char lhs, char rhs) throws Throwable;

  Object remainderEquals(char lhs, short rhs) throws Throwable;

  Object remainderEquals(char lhs, int rhs) throws Throwable;

  Object remainderEquals(char lhs, long rhs) throws Throwable;

  Object remainderEquals(char lhs, BigInteger rhs) throws Throwable;

  Object remainderEquals(short lhs, byte rhs) throws Throwable;

  Object remainderEquals(short lhs, char rhs) throws Throwable;

  Object remainderEquals(short lhs, short rhs) throws Throwable;

  Object remainderEquals(short lhs, int rhs) throws Throwable;

  Object remainderEquals(short lhs, long rhs) throws Throwable;

  Object remainderEquals(short lhs, BigInteger rhs) throws Throwable;

  Object remainderEquals(int lhs, byte rhs) throws Throwable;

  Object remainderEquals(int lhs, char rhs) throws Throwable;

  Object remainderEquals(int lhs, short rhs) throws Throwable;

  Object remainderEquals(int lhs, int rhs) throws Throwable;

  Object remainderEquals(int lhs, long rhs) throws Throwable;

  Object remainderEquals(int lhs, BigInteger rhs) throws Throwable;

  Object remainderEquals(long lhs, byte rhs) throws Throwable;

  Object remainderEquals(long lhs, char rhs) throws Throwable;

  Object remainderEquals(long lhs, short rhs) throws Throwable;

  Object remainderEquals(long lhs, int rhs) throws Throwable;

  Object remainderEquals(long lhs, long rhs) throws Throwable;

  Object remainderEquals(long lhs, BigInteger rhs) throws Throwable;

  Object remainderEquals(BigInteger lhs, byte rhs) throws Throwable;

  Object remainderEquals(BigInteger lhs, char rhs) throws Throwable;

  Object remainderEquals(BigInteger lhs, short rhs) throws Throwable;

  Object remainderEquals(BigInteger lhs, int rhs) throws Throwable;

  Object remainderEquals(BigInteger lhs, long rhs) throws Throwable;

  Object remainderEquals(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object remainderEquals(Object lhs, byte rhs) throws Throwable;

  Object remainderEquals(Object lhs, char rhs) throws Throwable;

  Object remainderEquals(Object lhs, short rhs) throws Throwable;

  Object remainderEquals(Object lhs, int rhs) throws Throwable;

  Object remainderEquals(Object lhs, long rhs) throws Throwable;

  Object remainderEquals(Object lhs, BigInteger rhs) throws Throwable;

  Object reverseRemainderEquals(byte lhs, Object rhs) throws Throwable;

  Object reverseRemainderEquals(char lhs, Object rhs) throws Throwable;

  Object reverseRemainderEquals(short lhs, Object rhs) throws Throwable;

  Object reverseRemainderEquals(int lhs, Object rhs) throws Throwable;

  Object reverseRemainderEquals(long lhs, Object rhs) throws Throwable;

  Object reverseRemainderEquals(BigInteger lhs, Object rhs) throws Throwable;

  //
  //   Methods callable from compiler generated code for operator ÷
  //

  Object integerDivide(byte lhs, byte rhs) throws Throwable;

  Object integerDivide(byte lhs, char rhs) throws Throwable;

  Object integerDivide(byte lhs, short rhs) throws Throwable;

  Object integerDivide(byte lhs, int rhs) throws Throwable;

  Object integerDivide(byte lhs, long rhs) throws Throwable;

  Object integerDivide(byte lhs, float rhs) throws Throwable;

  Object integerDivide(byte lhs, double rhs) throws Throwable;

  Object integerDivide(byte lhs, BigInteger rhs) throws Throwable;

  Object integerDivide(byte lhs, BigDecimal rhs) throws Throwable;

  Object integerDivide(char lhs, byte rhs) throws Throwable;

  Object integerDivide(char lhs, char rhs) throws Throwable;

  Object integerDivide(char lhs, short rhs) throws Throwable;

  Object integerDivide(char lhs, int rhs) throws Throwable;

  Object integerDivide(char lhs, long rhs) throws Throwable;

  Object integerDivide(char lhs, float rhs) throws Throwable;

  Object integerDivide(char lhs, double rhs) throws Throwable;

  Object integerDivide(char lhs, BigInteger rhs) throws Throwable;

  Object integerDivide(char lhs, BigDecimal rhs) throws Throwable;

  Object integerDivide(short lhs, byte rhs) throws Throwable;

  Object integerDivide(short lhs, char rhs) throws Throwable;

  Object integerDivide(short lhs, short rhs) throws Throwable;

  Object integerDivide(short lhs, int rhs) throws Throwable;

  Object integerDivide(short lhs, long rhs) throws Throwable;

  Object integerDivide(short lhs, float rhs) throws Throwable;

  Object integerDivide(short lhs, double rhs) throws Throwable;

  Object integerDivide(short lhs, BigInteger rhs) throws Throwable;

  Object integerDivide(short lhs, BigDecimal rhs) throws Throwable;

  Object integerDivide(int lhs, byte rhs) throws Throwable;

  Object integerDivide(int lhs, char rhs) throws Throwable;

  Object integerDivide(int lhs, short rhs) throws Throwable;

  Object integerDivide(int lhs, int rhs) throws Throwable;

  Object integerDivide(int lhs, long rhs) throws Throwable;

  Object integerDivide(int lhs, float rhs) throws Throwable;

  Object integerDivide(int lhs, double rhs) throws Throwable;

  Object integerDivide(int lhs, BigInteger rhs) throws Throwable;

  Object integerDivide(int lhs, BigDecimal rhs) throws Throwable;

  Object integerDivide(long lhs, byte rhs) throws Throwable;

  Object integerDivide(long lhs, char rhs) throws Throwable;

  Object integerDivide(long lhs, short rhs) throws Throwable;

  Object integerDivide(long lhs, int rhs) throws Throwable;

  Object integerDivide(long lhs, long rhs) throws Throwable;

  Object integerDivide(long lhs, float rhs) throws Throwable;

  Object integerDivide(long lhs, double rhs) throws Throwable;

  Object integerDivide(long lhs, BigInteger rhs) throws Throwable;

  Object integerDivide(long lhs, BigDecimal rhs) throws Throwable;

  Object integerDivide(float lhs, byte rhs) throws Throwable;

  Object integerDivide(float lhs, char rhs) throws Throwable;

  Object integerDivide(float lhs, short rhs) throws Throwable;

  Object integerDivide(float lhs, int rhs) throws Throwable;

  Object integerDivide(float lhs, long rhs) throws Throwable;

  Object integerDivide(float lhs, float rhs) throws Throwable;

  Object integerDivide(float lhs, double rhs) throws Throwable;

  Object integerDivide(float lhs, BigInteger rhs) throws Throwable;

  Object integerDivide(float lhs, BigDecimal rhs) throws Throwable;

  Object integerDivide(double lhs, byte rhs) throws Throwable;

  Object integerDivide(double lhs, char rhs) throws Throwable;

  Object integerDivide(double lhs, short rhs) throws Throwable;

  Object integerDivide(double lhs, int rhs) throws Throwable;

  Object integerDivide(double lhs, long rhs) throws Throwable;

  Object integerDivide(double lhs, float rhs) throws Throwable;

  Object integerDivide(double lhs, double rhs) throws Throwable;

  Object integerDivide(double lhs, BigInteger rhs) throws Throwable;

  Object integerDivide(double lhs, BigDecimal rhs) throws Throwable;

  Object integerDivide(BigInteger lhs, byte rhs) throws Throwable;

  Object integerDivide(BigInteger lhs, char rhs) throws Throwable;

  Object integerDivide(BigInteger lhs, short rhs) throws Throwable;

  Object integerDivide(BigInteger lhs, int rhs) throws Throwable;

  Object integerDivide(BigInteger lhs, long rhs) throws Throwable;

  Object integerDivide(BigInteger lhs, float rhs) throws Throwable;

  Object integerDivide(BigInteger lhs, double rhs) throws Throwable;

  Object integerDivide(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object integerDivide(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object integerDivide(BigDecimal lhs, byte rhs) throws Throwable;

  Object integerDivide(BigDecimal lhs, char rhs) throws Throwable;

  Object integerDivide(BigDecimal lhs, short rhs) throws Throwable;

  Object integerDivide(BigDecimal lhs, int rhs) throws Throwable;

  Object integerDivide(BigDecimal lhs, long rhs) throws Throwable;

  Object integerDivide(BigDecimal lhs, float rhs) throws Throwable;

  Object integerDivide(BigDecimal lhs, double rhs) throws Throwable;

  Object integerDivide(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object integerDivide(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object integerDivide(Object lhs, byte rhs) throws Throwable;

  Object integerDivide(Object lhs, char rhs) throws Throwable;

  Object integerDivide(Object lhs, short rhs) throws Throwable;

  Object integerDivide(Object lhs, int rhs) throws Throwable;

  Object integerDivide(Object lhs, long rhs) throws Throwable;

  Object integerDivide(Object lhs, float rhs) throws Throwable;

  Object integerDivide(Object lhs, double rhs) throws Throwable;

  Object integerDivide(Object lhs, BigInteger rhs) throws Throwable;

  Object integerDivide(Object lhs, BigDecimal rhs) throws Throwable;

  Object reverseIntegerDivide(byte lhs, Object rhs) throws Throwable;

  Object reverseIntegerDivide(char lhs, Object rhs) throws Throwable;

  Object reverseIntegerDivide(short lhs, Object rhs) throws Throwable;

  Object reverseIntegerDivide(int lhs, Object rhs) throws Throwable;

  Object reverseIntegerDivide(long lhs, Object rhs) throws Throwable;

  Object reverseIntegerDivide(float lhs, Object rhs) throws Throwable;

  Object reverseIntegerDivide(double lhs, Object rhs) throws Throwable;

  Object reverseIntegerDivide(BigInteger lhs, Object rhs) throws Throwable;

  Object reverseIntegerDivide(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Methods callable from compiler generated code for operator ÷=
  //

  Object integerDivideEquals(byte lhs, byte rhs) throws Throwable;

  Object integerDivideEquals(byte lhs, char rhs) throws Throwable;

  Object integerDivideEquals(byte lhs, short rhs) throws Throwable;

  Object integerDivideEquals(byte lhs, int rhs) throws Throwable;

  Object integerDivideEquals(byte lhs, long rhs) throws Throwable;

  Object integerDivideEquals(byte lhs, float rhs) throws Throwable;

  Object integerDivideEquals(byte lhs, double rhs) throws Throwable;

  Object integerDivideEquals(byte lhs, BigInteger rhs) throws Throwable;

  Object integerDivideEquals(byte lhs, BigDecimal rhs) throws Throwable;

  Object integerDivideEquals(char lhs, byte rhs) throws Throwable;

  Object integerDivideEquals(char lhs, char rhs) throws Throwable;

  Object integerDivideEquals(char lhs, short rhs) throws Throwable;

  Object integerDivideEquals(char lhs, int rhs) throws Throwable;

  Object integerDivideEquals(char lhs, long rhs) throws Throwable;

  Object integerDivideEquals(char lhs, float rhs) throws Throwable;

  Object integerDivideEquals(char lhs, double rhs) throws Throwable;

  Object integerDivideEquals(char lhs, BigInteger rhs) throws Throwable;

  Object integerDivideEquals(char lhs, BigDecimal rhs) throws Throwable;

  Object integerDivideEquals(short lhs, byte rhs) throws Throwable;

  Object integerDivideEquals(short lhs, char rhs) throws Throwable;

  Object integerDivideEquals(short lhs, short rhs) throws Throwable;

  Object integerDivideEquals(short lhs, int rhs) throws Throwable;

  Object integerDivideEquals(short lhs, long rhs) throws Throwable;

  Object integerDivideEquals(short lhs, float rhs) throws Throwable;

  Object integerDivideEquals(short lhs, double rhs) throws Throwable;

  Object integerDivideEquals(short lhs, BigInteger rhs) throws Throwable;

  Object integerDivideEquals(short lhs, BigDecimal rhs) throws Throwable;

  Object integerDivideEquals(int lhs, byte rhs) throws Throwable;

  Object integerDivideEquals(int lhs, char rhs) throws Throwable;

  Object integerDivideEquals(int lhs, short rhs) throws Throwable;

  Object integerDivideEquals(int lhs, int rhs) throws Throwable;

  Object integerDivideEquals(int lhs, long rhs) throws Throwable;

  Object integerDivideEquals(int lhs, float rhs) throws Throwable;

  Object integerDivideEquals(int lhs, double rhs) throws Throwable;

  Object integerDivideEquals(int lhs, BigInteger rhs) throws Throwable;

  Object integerDivideEquals(int lhs, BigDecimal rhs) throws Throwable;

  Object integerDivideEquals(long lhs, byte rhs) throws Throwable;

  Object integerDivideEquals(long lhs, char rhs) throws Throwable;

  Object integerDivideEquals(long lhs, short rhs) throws Throwable;

  Object integerDivideEquals(long lhs, int rhs) throws Throwable;

  Object integerDivideEquals(long lhs, long rhs) throws Throwable;

  Object integerDivideEquals(long lhs, float rhs) throws Throwable;

  Object integerDivideEquals(long lhs, double rhs) throws Throwable;

  Object integerDivideEquals(long lhs, BigInteger rhs) throws Throwable;

  Object integerDivideEquals(long lhs, BigDecimal rhs) throws Throwable;

  Object integerDivideEquals(float lhs, byte rhs) throws Throwable;

  Object integerDivideEquals(float lhs, char rhs) throws Throwable;

  Object integerDivideEquals(float lhs, short rhs) throws Throwable;

  Object integerDivideEquals(float lhs, int rhs) throws Throwable;

  Object integerDivideEquals(float lhs, long rhs) throws Throwable;

  Object integerDivideEquals(float lhs, float rhs) throws Throwable;

  Object integerDivideEquals(float lhs, double rhs) throws Throwable;

  Object integerDivideEquals(float lhs, BigInteger rhs) throws Throwable;

  Object integerDivideEquals(float lhs, BigDecimal rhs) throws Throwable;

  Object integerDivideEquals(double lhs, byte rhs) throws Throwable;

  Object integerDivideEquals(double lhs, char rhs) throws Throwable;

  Object integerDivideEquals(double lhs, short rhs) throws Throwable;

  Object integerDivideEquals(double lhs, int rhs) throws Throwable;

  Object integerDivideEquals(double lhs, long rhs) throws Throwable;

  Object integerDivideEquals(double lhs, float rhs) throws Throwable;

  Object integerDivideEquals(double lhs, double rhs) throws Throwable;

  Object integerDivideEquals(double lhs, BigInteger rhs) throws Throwable;

  Object integerDivideEquals(double lhs, BigDecimal rhs) throws Throwable;

  Object integerDivideEquals(BigInteger lhs, byte rhs) throws Throwable;

  Object integerDivideEquals(BigInteger lhs, char rhs) throws Throwable;

  Object integerDivideEquals(BigInteger lhs, short rhs) throws Throwable;

  Object integerDivideEquals(BigInteger lhs, int rhs) throws Throwable;

  Object integerDivideEquals(BigInteger lhs, long rhs) throws Throwable;

  Object integerDivideEquals(BigInteger lhs, float rhs) throws Throwable;

  Object integerDivideEquals(BigInteger lhs, double rhs) throws Throwable;

  Object integerDivideEquals(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object integerDivideEquals(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object integerDivideEquals(BigDecimal lhs, byte rhs) throws Throwable;

  Object integerDivideEquals(BigDecimal lhs, char rhs) throws Throwable;

  Object integerDivideEquals(BigDecimal lhs, short rhs) throws Throwable;

  Object integerDivideEquals(BigDecimal lhs, int rhs) throws Throwable;

  Object integerDivideEquals(BigDecimal lhs, long rhs) throws Throwable;

  Object integerDivideEquals(BigDecimal lhs, float rhs) throws Throwable;

  Object integerDivideEquals(BigDecimal lhs, double rhs) throws Throwable;

  Object integerDivideEquals(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object integerDivideEquals(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object integerDivideEquals(Object lhs, byte rhs) throws Throwable;

  Object integerDivideEquals(Object lhs, char rhs) throws Throwable;

  Object integerDivideEquals(Object lhs, short rhs) throws Throwable;

  Object integerDivideEquals(Object lhs, int rhs) throws Throwable;

  Object integerDivideEquals(Object lhs, long rhs) throws Throwable;

  Object integerDivideEquals(Object lhs, float rhs) throws Throwable;

  Object integerDivideEquals(Object lhs, double rhs) throws Throwable;

  Object integerDivideEquals(Object lhs, BigInteger rhs) throws Throwable;

  Object integerDivideEquals(Object lhs, BigDecimal rhs) throws Throwable;

  Object reverseIntegerDivideEquals(byte lhs, Object rhs) throws Throwable;

  Object reverseIntegerDivideEquals(char lhs, Object rhs) throws Throwable;

  Object reverseIntegerDivideEquals(short lhs, Object rhs) throws Throwable;

  Object reverseIntegerDivideEquals(int lhs, Object rhs) throws Throwable;

  Object reverseIntegerDivideEquals(long lhs, Object rhs) throws Throwable;

  Object reverseIntegerDivideEquals(float lhs, Object rhs) throws Throwable;

  Object reverseIntegerDivideEquals(double lhs, Object rhs) throws Throwable;

  Object reverseIntegerDivideEquals(BigInteger lhs, Object rhs) throws Throwable;

  Object reverseIntegerDivideEquals(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Methods callable from compiler generated code for operator &
  //

  Object and(byte lhs, byte rhs) throws Throwable;

  Object and(byte lhs, char rhs) throws Throwable;

  Object and(byte lhs, short rhs) throws Throwable;

  Object and(byte lhs, int rhs) throws Throwable;

  Object and(byte lhs, long rhs) throws Throwable;

  Object and(byte lhs, BigInteger rhs) throws Throwable;

  Object and(char lhs, byte rhs) throws Throwable;

  Object and(char lhs, char rhs) throws Throwable;

  Object and(char lhs, short rhs) throws Throwable;

  Object and(char lhs, int rhs) throws Throwable;

  Object and(char lhs, long rhs) throws Throwable;

  Object and(char lhs, BigInteger rhs) throws Throwable;

  Object and(short lhs, byte rhs) throws Throwable;

  Object and(short lhs, char rhs) throws Throwable;

  Object and(short lhs, short rhs) throws Throwable;

  Object and(short lhs, int rhs) throws Throwable;

  Object and(short lhs, long rhs) throws Throwable;

  Object and(short lhs, BigInteger rhs) throws Throwable;

  Object and(int lhs, byte rhs) throws Throwable;

  Object and(int lhs, char rhs) throws Throwable;

  Object and(int lhs, short rhs) throws Throwable;

  Object and(int lhs, int rhs) throws Throwable;

  Object and(int lhs, long rhs) throws Throwable;

  Object and(int lhs, BigInteger rhs) throws Throwable;

  Object and(long lhs, byte rhs) throws Throwable;

  Object and(long lhs, char rhs) throws Throwable;

  Object and(long lhs, short rhs) throws Throwable;

  Object and(long lhs, int rhs) throws Throwable;

  Object and(long lhs, long rhs) throws Throwable;

  Object and(long lhs, BigInteger rhs) throws Throwable;

  Object and(BigInteger lhs, byte rhs) throws Throwable;

  Object and(BigInteger lhs, char rhs) throws Throwable;

  Object and(BigInteger lhs, short rhs) throws Throwable;

  Object and(BigInteger lhs, int rhs) throws Throwable;

  Object and(BigInteger lhs, long rhs) throws Throwable;

  Object and(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object and(Object lhs, byte rhs) throws Throwable;

  Object and(Object lhs, char rhs) throws Throwable;

  Object and(Object lhs, short rhs) throws Throwable;

  Object and(Object lhs, int rhs) throws Throwable;

  Object and(Object lhs, long rhs) throws Throwable;

  Object and(Object lhs, BigInteger rhs) throws Throwable;

  Object reverseAnd(byte lhs, Object rhs) throws Throwable;

  Object reverseAnd(char lhs, Object rhs) throws Throwable;

  Object reverseAnd(short lhs, Object rhs) throws Throwable;

  Object reverseAnd(int lhs, Object rhs) throws Throwable;

  Object reverseAnd(long lhs, Object rhs) throws Throwable;

  Object reverseAnd(BigInteger lhs, Object rhs) throws Throwable;

  //
  //   Methods callable from compiler generated code for operator &=
  //

  Object andEquals(byte lhs, byte rhs) throws Throwable;

  Object andEquals(byte lhs, char rhs) throws Throwable;

  Object andEquals(byte lhs, short rhs) throws Throwable;

  Object andEquals(byte lhs, int rhs) throws Throwable;

  Object andEquals(byte lhs, long rhs) throws Throwable;

  Object andEquals(byte lhs, BigInteger rhs) throws Throwable;

  Object andEquals(char lhs, byte rhs) throws Throwable;

  Object andEquals(char lhs, char rhs) throws Throwable;

  Object andEquals(char lhs, short rhs) throws Throwable;

  Object andEquals(char lhs, int rhs) throws Throwable;

  Object andEquals(char lhs, long rhs) throws Throwable;

  Object andEquals(char lhs, BigInteger rhs) throws Throwable;

  Object andEquals(short lhs, byte rhs) throws Throwable;

  Object andEquals(short lhs, char rhs) throws Throwable;

  Object andEquals(short lhs, short rhs) throws Throwable;

  Object andEquals(short lhs, int rhs) throws Throwable;

  Object andEquals(short lhs, long rhs) throws Throwable;

  Object andEquals(short lhs, BigInteger rhs) throws Throwable;

  Object andEquals(int lhs, byte rhs) throws Throwable;

  Object andEquals(int lhs, char rhs) throws Throwable;

  Object andEquals(int lhs, short rhs) throws Throwable;

  Object andEquals(int lhs, int rhs) throws Throwable;

  Object andEquals(int lhs, long rhs) throws Throwable;

  Object andEquals(int lhs, BigInteger rhs) throws Throwable;

  Object andEquals(long lhs, byte rhs) throws Throwable;

  Object andEquals(long lhs, char rhs) throws Throwable;

  Object andEquals(long lhs, short rhs) throws Throwable;

  Object andEquals(long lhs, int rhs) throws Throwable;

  Object andEquals(long lhs, long rhs) throws Throwable;

  Object andEquals(long lhs, BigInteger rhs) throws Throwable;

  Object andEquals(BigInteger lhs, byte rhs) throws Throwable;

  Object andEquals(BigInteger lhs, char rhs) throws Throwable;

  Object andEquals(BigInteger lhs, short rhs) throws Throwable;

  Object andEquals(BigInteger lhs, int rhs) throws Throwable;

  Object andEquals(BigInteger lhs, long rhs) throws Throwable;

  Object andEquals(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object andEquals(Object lhs, byte rhs) throws Throwable;

  Object andEquals(Object lhs, char rhs) throws Throwable;

  Object andEquals(Object lhs, short rhs) throws Throwable;

  Object andEquals(Object lhs, int rhs) throws Throwable;

  Object andEquals(Object lhs, long rhs) throws Throwable;

  Object andEquals(Object lhs, BigInteger rhs) throws Throwable;

  Object reverseAndEquals(byte lhs, Object rhs) throws Throwable;

  Object reverseAndEquals(char lhs, Object rhs) throws Throwable;

  Object reverseAndEquals(short lhs, Object rhs) throws Throwable;

  Object reverseAndEquals(int lhs, Object rhs) throws Throwable;

  Object reverseAndEquals(long lhs, Object rhs) throws Throwable;

  Object reverseAndEquals(BigInteger lhs, Object rhs) throws Throwable;

  //
  //   Methods callable from compiler generated code for operator |
  //

  Object or(byte lhs, byte rhs) throws Throwable;

  Object or(byte lhs, char rhs) throws Throwable;

  Object or(byte lhs, short rhs) throws Throwable;

  Object or(byte lhs, int rhs) throws Throwable;

  Object or(byte lhs, long rhs) throws Throwable;

  Object or(byte lhs, BigInteger rhs) throws Throwable;

  Object or(char lhs, byte rhs) throws Throwable;

  Object or(char lhs, char rhs) throws Throwable;

  Object or(char lhs, short rhs) throws Throwable;

  Object or(char lhs, int rhs) throws Throwable;

  Object or(char lhs, long rhs) throws Throwable;

  Object or(char lhs, BigInteger rhs) throws Throwable;

  Object or(short lhs, byte rhs) throws Throwable;

  Object or(short lhs, char rhs) throws Throwable;

  Object or(short lhs, short rhs) throws Throwable;

  Object or(short lhs, int rhs) throws Throwable;

  Object or(short lhs, long rhs) throws Throwable;

  Object or(short lhs, BigInteger rhs) throws Throwable;

  Object or(int lhs, byte rhs) throws Throwable;

  Object or(int lhs, char rhs) throws Throwable;

  Object or(int lhs, short rhs) throws Throwable;

  Object or(int lhs, int rhs) throws Throwable;

  Object or(int lhs, long rhs) throws Throwable;

  Object or(int lhs, BigInteger rhs) throws Throwable;

  Object or(long lhs, byte rhs) throws Throwable;

  Object or(long lhs, char rhs) throws Throwable;

  Object or(long lhs, short rhs) throws Throwable;

  Object or(long lhs, int rhs) throws Throwable;

  Object or(long lhs, long rhs) throws Throwable;

  Object or(long lhs, BigInteger rhs) throws Throwable;

  Object or(BigInteger lhs, byte rhs) throws Throwable;

  Object or(BigInteger lhs, char rhs) throws Throwable;

  Object or(BigInteger lhs, short rhs) throws Throwable;

  Object or(BigInteger lhs, int rhs) throws Throwable;

  Object or(BigInteger lhs, long rhs) throws Throwable;

  Object or(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object or(Object lhs, byte rhs) throws Throwable;

  Object or(Object lhs, char rhs) throws Throwable;

  Object or(Object lhs, short rhs) throws Throwable;

  Object or(Object lhs, int rhs) throws Throwable;

  Object or(Object lhs, long rhs) throws Throwable;

  Object or(Object lhs, BigInteger rhs) throws Throwable;

  Object reverseOr(byte lhs, Object rhs) throws Throwable;

  Object reverseOr(char lhs, Object rhs) throws Throwable;

  Object reverseOr(short lhs, Object rhs) throws Throwable;

  Object reverseOr(int lhs, Object rhs) throws Throwable;

  Object reverseOr(long lhs, Object rhs) throws Throwable;

  Object reverseOr(BigInteger lhs, Object rhs) throws Throwable;

  //
  //   Methods callable from compiler generated code for operator |=
  //

  Object orEquals(byte lhs, byte rhs) throws Throwable;

  Object orEquals(byte lhs, char rhs) throws Throwable;

  Object orEquals(byte lhs, short rhs) throws Throwable;

  Object orEquals(byte lhs, int rhs) throws Throwable;

  Object orEquals(byte lhs, long rhs) throws Throwable;

  Object orEquals(byte lhs, BigInteger rhs) throws Throwable;

  Object orEquals(char lhs, byte rhs) throws Throwable;

  Object orEquals(char lhs, char rhs) throws Throwable;

  Object orEquals(char lhs, short rhs) throws Throwable;

  Object orEquals(char lhs, int rhs) throws Throwable;

  Object orEquals(char lhs, long rhs) throws Throwable;

  Object orEquals(char lhs, BigInteger rhs) throws Throwable;

  Object orEquals(short lhs, byte rhs) throws Throwable;

  Object orEquals(short lhs, char rhs) throws Throwable;

  Object orEquals(short lhs, short rhs) throws Throwable;

  Object orEquals(short lhs, int rhs) throws Throwable;

  Object orEquals(short lhs, long rhs) throws Throwable;

  Object orEquals(short lhs, BigInteger rhs) throws Throwable;

  Object orEquals(int lhs, byte rhs) throws Throwable;

  Object orEquals(int lhs, char rhs) throws Throwable;

  Object orEquals(int lhs, short rhs) throws Throwable;

  Object orEquals(int lhs, int rhs) throws Throwable;

  Object orEquals(int lhs, long rhs) throws Throwable;

  Object orEquals(int lhs, BigInteger rhs) throws Throwable;

  Object orEquals(long lhs, byte rhs) throws Throwable;

  Object orEquals(long lhs, char rhs) throws Throwable;

  Object orEquals(long lhs, short rhs) throws Throwable;

  Object orEquals(long lhs, int rhs) throws Throwable;

  Object orEquals(long lhs, long rhs) throws Throwable;

  Object orEquals(long lhs, BigInteger rhs) throws Throwable;

  Object orEquals(BigInteger lhs, byte rhs) throws Throwable;

  Object orEquals(BigInteger lhs, char rhs) throws Throwable;

  Object orEquals(BigInteger lhs, short rhs) throws Throwable;

  Object orEquals(BigInteger lhs, int rhs) throws Throwable;

  Object orEquals(BigInteger lhs, long rhs) throws Throwable;

  Object orEquals(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object orEquals(Object lhs, byte rhs) throws Throwable;

  Object orEquals(Object lhs, char rhs) throws Throwable;

  Object orEquals(Object lhs, short rhs) throws Throwable;

  Object orEquals(Object lhs, int rhs) throws Throwable;

  Object orEquals(Object lhs, long rhs) throws Throwable;

  Object orEquals(Object lhs, BigInteger rhs) throws Throwable;

  Object reverseOrEquals(byte lhs, Object rhs) throws Throwable;

  Object reverseOrEquals(char lhs, Object rhs) throws Throwable;

  Object reverseOrEquals(short lhs, Object rhs) throws Throwable;

  Object reverseOrEquals(int lhs, Object rhs) throws Throwable;

  Object reverseOrEquals(long lhs, Object rhs) throws Throwable;

  Object reverseOrEquals(BigInteger lhs, Object rhs) throws Throwable;

  //
  //   Methods callable from compiler generated code for operator ^
  //

  Object xor(byte lhs, byte rhs) throws Throwable;

  Object xor(byte lhs, char rhs) throws Throwable;

  Object xor(byte lhs, short rhs) throws Throwable;

  Object xor(byte lhs, int rhs) throws Throwable;

  Object xor(byte lhs, long rhs) throws Throwable;

  Object xor(byte lhs, BigInteger rhs) throws Throwable;

  Object xor(char lhs, byte rhs) throws Throwable;

  Object xor(char lhs, char rhs) throws Throwable;

  Object xor(char lhs, short rhs) throws Throwable;

  Object xor(char lhs, int rhs) throws Throwable;

  Object xor(char lhs, long rhs) throws Throwable;

  Object xor(char lhs, BigInteger rhs) throws Throwable;

  Object xor(short lhs, byte rhs) throws Throwable;

  Object xor(short lhs, char rhs) throws Throwable;

  Object xor(short lhs, short rhs) throws Throwable;

  Object xor(short lhs, int rhs) throws Throwable;

  Object xor(short lhs, long rhs) throws Throwable;

  Object xor(short lhs, BigInteger rhs) throws Throwable;

  Object xor(int lhs, byte rhs) throws Throwable;

  Object xor(int lhs, char rhs) throws Throwable;

  Object xor(int lhs, short rhs) throws Throwable;

  Object xor(int lhs, int rhs) throws Throwable;

  Object xor(int lhs, long rhs) throws Throwable;

  Object xor(int lhs, BigInteger rhs) throws Throwable;

  Object xor(long lhs, byte rhs) throws Throwable;

  Object xor(long lhs, char rhs) throws Throwable;

  Object xor(long lhs, short rhs) throws Throwable;

  Object xor(long lhs, int rhs) throws Throwable;

  Object xor(long lhs, long rhs) throws Throwable;

  Object xor(long lhs, BigInteger rhs) throws Throwable;

  Object xor(BigInteger lhs, byte rhs) throws Throwable;

  Object xor(BigInteger lhs, char rhs) throws Throwable;

  Object xor(BigInteger lhs, short rhs) throws Throwable;

  Object xor(BigInteger lhs, int rhs) throws Throwable;

  Object xor(BigInteger lhs, long rhs) throws Throwable;

  Object xor(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object xor(Object lhs, byte rhs) throws Throwable;

  Object xor(Object lhs, char rhs) throws Throwable;

  Object xor(Object lhs, short rhs) throws Throwable;

  Object xor(Object lhs, int rhs) throws Throwable;

  Object xor(Object lhs, long rhs) throws Throwable;

  Object xor(Object lhs, BigInteger rhs) throws Throwable;

  Object reverseXor(byte lhs, Object rhs) throws Throwable;

  Object reverseXor(char lhs, Object rhs) throws Throwable;

  Object reverseXor(short lhs, Object rhs) throws Throwable;

  Object reverseXor(int lhs, Object rhs) throws Throwable;

  Object reverseXor(long lhs, Object rhs) throws Throwable;

  Object reverseXor(BigInteger lhs, Object rhs) throws Throwable;

  //
  //   Methods callable from compiler generated code for operator ^=
  //

  Object xorEquals(byte lhs, byte rhs) throws Throwable;

  Object xorEquals(byte lhs, char rhs) throws Throwable;

  Object xorEquals(byte lhs, short rhs) throws Throwable;

  Object xorEquals(byte lhs, int rhs) throws Throwable;

  Object xorEquals(byte lhs, long rhs) throws Throwable;

  Object xorEquals(byte lhs, BigInteger rhs) throws Throwable;

  Object xorEquals(char lhs, byte rhs) throws Throwable;

  Object xorEquals(char lhs, char rhs) throws Throwable;

  Object xorEquals(char lhs, short rhs) throws Throwable;

  Object xorEquals(char lhs, int rhs) throws Throwable;

  Object xorEquals(char lhs, long rhs) throws Throwable;

  Object xorEquals(char lhs, BigInteger rhs) throws Throwable;

  Object xorEquals(short lhs, byte rhs) throws Throwable;

  Object xorEquals(short lhs, char rhs) throws Throwable;

  Object xorEquals(short lhs, short rhs) throws Throwable;

  Object xorEquals(short lhs, int rhs) throws Throwable;

  Object xorEquals(short lhs, long rhs) throws Throwable;

  Object xorEquals(short lhs, BigInteger rhs) throws Throwable;

  Object xorEquals(int lhs, byte rhs) throws Throwable;

  Object xorEquals(int lhs, char rhs) throws Throwable;

  Object xorEquals(int lhs, short rhs) throws Throwable;

  Object xorEquals(int lhs, int rhs) throws Throwable;

  Object xorEquals(int lhs, long rhs) throws Throwable;

  Object xorEquals(int lhs, BigInteger rhs) throws Throwable;

  Object xorEquals(long lhs, byte rhs) throws Throwable;

  Object xorEquals(long lhs, char rhs) throws Throwable;

  Object xorEquals(long lhs, short rhs) throws Throwable;

  Object xorEquals(long lhs, int rhs) throws Throwable;

  Object xorEquals(long lhs, long rhs) throws Throwable;

  Object xorEquals(long lhs, BigInteger rhs) throws Throwable;

  Object xorEquals(BigInteger lhs, byte rhs) throws Throwable;

  Object xorEquals(BigInteger lhs, char rhs) throws Throwable;

  Object xorEquals(BigInteger lhs, short rhs) throws Throwable;

  Object xorEquals(BigInteger lhs, int rhs) throws Throwable;

  Object xorEquals(BigInteger lhs, long rhs) throws Throwable;

  Object xorEquals(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object xorEquals(Object lhs, byte rhs) throws Throwable;

  Object xorEquals(Object lhs, char rhs) throws Throwable;

  Object xorEquals(Object lhs, short rhs) throws Throwable;

  Object xorEquals(Object lhs, int rhs) throws Throwable;

  Object xorEquals(Object lhs, long rhs) throws Throwable;

  Object xorEquals(Object lhs, BigInteger rhs) throws Throwable;

  Object reverseXorEquals(byte lhs, Object rhs) throws Throwable;

  Object reverseXorEquals(char lhs, Object rhs) throws Throwable;

  Object reverseXorEquals(short lhs, Object rhs) throws Throwable;

  Object reverseXorEquals(int lhs, Object rhs) throws Throwable;

  Object reverseXorEquals(long lhs, Object rhs) throws Throwable;

  Object reverseXorEquals(BigInteger lhs, Object rhs) throws Throwable;

  //
  //   Methods callable from compiler generated code for operator <<
  //

  Object leftShift(byte lhs, byte rhs) throws Throwable;

  Object leftShift(byte lhs, char rhs) throws Throwable;

  Object leftShift(byte lhs, short rhs) throws Throwable;

  Object leftShift(byte lhs, int rhs) throws Throwable;

  Object leftShift(byte lhs, long rhs) throws Throwable;

  Object leftShift(byte lhs, BigInteger rhs) throws Throwable;

  Object leftShift(char lhs, byte rhs) throws Throwable;

  Object leftShift(char lhs, char rhs) throws Throwable;

  Object leftShift(char lhs, short rhs) throws Throwable;

  Object leftShift(char lhs, int rhs) throws Throwable;

  Object leftShift(char lhs, long rhs) throws Throwable;

  Object leftShift(char lhs, BigInteger rhs) throws Throwable;

  Object leftShift(short lhs, byte rhs) throws Throwable;

  Object leftShift(short lhs, char rhs) throws Throwable;

  Object leftShift(short lhs, short rhs) throws Throwable;

  Object leftShift(short lhs, int rhs) throws Throwable;

  Object leftShift(short lhs, long rhs) throws Throwable;

  Object leftShift(short lhs, BigInteger rhs) throws Throwable;

  Object leftShift(int lhs, byte rhs) throws Throwable;

  Object leftShift(int lhs, char rhs) throws Throwable;

  Object leftShift(int lhs, short rhs) throws Throwable;

  Object leftShift(int lhs, int rhs) throws Throwable;

  Object leftShift(int lhs, long rhs) throws Throwable;

  Object leftShift(int lhs, BigInteger rhs) throws Throwable;

  Object leftShift(long lhs, byte rhs) throws Throwable;

  Object leftShift(long lhs, char rhs) throws Throwable;

  Object leftShift(long lhs, short rhs) throws Throwable;

  Object leftShift(long lhs, int rhs) throws Throwable;

  Object leftShift(long lhs, long rhs) throws Throwable;

  Object leftShift(long lhs, BigInteger rhs) throws Throwable;

  Object leftShift(BigInteger lhs, byte rhs) throws Throwable;

  Object leftShift(BigInteger lhs, char rhs) throws Throwable;

  Object leftShift(BigInteger lhs, short rhs) throws Throwable;

  Object leftShift(BigInteger lhs, int rhs) throws Throwable;

  Object leftShift(BigInteger lhs, long rhs) throws Throwable;

  Object leftShift(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object leftShift(Object lhs, byte rhs) throws Throwable;

  Object leftShift(Object lhs, char rhs) throws Throwable;

  Object leftShift(Object lhs, short rhs) throws Throwable;

  Object leftShift(Object lhs, int rhs) throws Throwable;

  Object leftShift(Object lhs, long rhs) throws Throwable;

  Object leftShift(Object lhs, BigInteger rhs) throws Throwable;

  Object reverseLeftShift(byte lhs, Object rhs) throws Throwable;

  Object reverseLeftShift(char lhs, Object rhs) throws Throwable;

  Object reverseLeftShift(short lhs, Object rhs) throws Throwable;

  Object reverseLeftShift(int lhs, Object rhs) throws Throwable;

  Object reverseLeftShift(long lhs, Object rhs) throws Throwable;

  Object reverseLeftShift(BigInteger lhs, Object rhs) throws Throwable;

  //
  //   Methods callable from compiler generated code for operator <<=
  //

  Object leftShiftEquals(byte lhs, byte rhs) throws Throwable;

  Object leftShiftEquals(byte lhs, char rhs) throws Throwable;

  Object leftShiftEquals(byte lhs, short rhs) throws Throwable;

  Object leftShiftEquals(byte lhs, int rhs) throws Throwable;

  Object leftShiftEquals(byte lhs, long rhs) throws Throwable;

  Object leftShiftEquals(byte lhs, BigInteger rhs) throws Throwable;

  Object leftShiftEquals(char lhs, byte rhs) throws Throwable;

  Object leftShiftEquals(char lhs, char rhs) throws Throwable;

  Object leftShiftEquals(char lhs, short rhs) throws Throwable;

  Object leftShiftEquals(char lhs, int rhs) throws Throwable;

  Object leftShiftEquals(char lhs, long rhs) throws Throwable;

  Object leftShiftEquals(char lhs, BigInteger rhs) throws Throwable;

  Object leftShiftEquals(short lhs, byte rhs) throws Throwable;

  Object leftShiftEquals(short lhs, char rhs) throws Throwable;

  Object leftShiftEquals(short lhs, short rhs) throws Throwable;

  Object leftShiftEquals(short lhs, int rhs) throws Throwable;

  Object leftShiftEquals(short lhs, long rhs) throws Throwable;

  Object leftShiftEquals(short lhs, BigInteger rhs) throws Throwable;

  Object leftShiftEquals(int lhs, byte rhs) throws Throwable;

  Object leftShiftEquals(int lhs, char rhs) throws Throwable;

  Object leftShiftEquals(int lhs, short rhs) throws Throwable;

  Object leftShiftEquals(int lhs, int rhs) throws Throwable;

  Object leftShiftEquals(int lhs, long rhs) throws Throwable;

  Object leftShiftEquals(int lhs, BigInteger rhs) throws Throwable;

  Object leftShiftEquals(long lhs, byte rhs) throws Throwable;

  Object leftShiftEquals(long lhs, char rhs) throws Throwable;

  Object leftShiftEquals(long lhs, short rhs) throws Throwable;

  Object leftShiftEquals(long lhs, int rhs) throws Throwable;

  Object leftShiftEquals(long lhs, long rhs) throws Throwable;

  Object leftShiftEquals(long lhs, BigInteger rhs) throws Throwable;

  Object leftShiftEquals(BigInteger lhs, byte rhs) throws Throwable;

  Object leftShiftEquals(BigInteger lhs, char rhs) throws Throwable;

  Object leftShiftEquals(BigInteger lhs, short rhs) throws Throwable;

  Object leftShiftEquals(BigInteger lhs, int rhs) throws Throwable;

  Object leftShiftEquals(BigInteger lhs, long rhs) throws Throwable;

  Object leftShiftEquals(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object leftShiftEquals(Object lhs, byte rhs) throws Throwable;

  Object leftShiftEquals(Object lhs, char rhs) throws Throwable;

  Object leftShiftEquals(Object lhs, short rhs) throws Throwable;

  Object leftShiftEquals(Object lhs, int rhs) throws Throwable;

  Object leftShiftEquals(Object lhs, long rhs) throws Throwable;

  Object leftShiftEquals(Object lhs, BigInteger rhs) throws Throwable;

  Object reverseLeftShiftEquals(byte lhs, Object rhs) throws Throwable;

  Object reverseLeftShiftEquals(char lhs, Object rhs) throws Throwable;

  Object reverseLeftShiftEquals(short lhs, Object rhs) throws Throwable;

  Object reverseLeftShiftEquals(int lhs, Object rhs) throws Throwable;

  Object reverseLeftShiftEquals(long lhs, Object rhs) throws Throwable;

  Object reverseLeftShiftEquals(BigInteger lhs, Object rhs) throws Throwable;

  //
  //   Methods callable from compiler generated code for operator >>
  //

  Object logicalRightShift(byte lhs, byte rhs) throws Throwable;

  Object logicalRightShift(byte lhs, char rhs) throws Throwable;

  Object logicalRightShift(byte lhs, short rhs) throws Throwable;

  Object logicalRightShift(byte lhs, int rhs) throws Throwable;

  Object logicalRightShift(byte lhs, long rhs) throws Throwable;

  Object logicalRightShift(byte lhs, BigInteger rhs) throws Throwable;

  Object logicalRightShift(char lhs, byte rhs) throws Throwable;

  Object logicalRightShift(char lhs, char rhs) throws Throwable;

  Object logicalRightShift(char lhs, short rhs) throws Throwable;

  Object logicalRightShift(char lhs, int rhs) throws Throwable;

  Object logicalRightShift(char lhs, long rhs) throws Throwable;

  Object logicalRightShift(char lhs, BigInteger rhs) throws Throwable;

  Object logicalRightShift(short lhs, byte rhs) throws Throwable;

  Object logicalRightShift(short lhs, char rhs) throws Throwable;

  Object logicalRightShift(short lhs, short rhs) throws Throwable;

  Object logicalRightShift(short lhs, int rhs) throws Throwable;

  Object logicalRightShift(short lhs, long rhs) throws Throwable;

  Object logicalRightShift(short lhs, BigInteger rhs) throws Throwable;

  Object logicalRightShift(int lhs, byte rhs) throws Throwable;

  Object logicalRightShift(int lhs, char rhs) throws Throwable;

  Object logicalRightShift(int lhs, short rhs) throws Throwable;

  Object logicalRightShift(int lhs, int rhs) throws Throwable;

  Object logicalRightShift(int lhs, long rhs) throws Throwable;

  Object logicalRightShift(int lhs, BigInteger rhs) throws Throwable;

  Object logicalRightShift(long lhs, byte rhs) throws Throwable;

  Object logicalRightShift(long lhs, char rhs) throws Throwable;

  Object logicalRightShift(long lhs, short rhs) throws Throwable;

  Object logicalRightShift(long lhs, int rhs) throws Throwable;

  Object logicalRightShift(long lhs, long rhs) throws Throwable;

  Object logicalRightShift(long lhs, BigInteger rhs) throws Throwable;

  Object logicalRightShift(Object lhs, byte rhs) throws Throwable;

  Object logicalRightShift(Object lhs, char rhs) throws Throwable;

  Object logicalRightShift(Object lhs, short rhs) throws Throwable;

  Object logicalRightShift(Object lhs, int rhs) throws Throwable;

  Object logicalRightShift(Object lhs, long rhs) throws Throwable;

  Object logicalRightShift(Object lhs, BigInteger rhs) throws Throwable;

  Object reverseLogicalRightShift(byte lhs, Object rhs) throws Throwable;

  Object reverseLogicalRightShift(char lhs, Object rhs) throws Throwable;

  Object reverseLogicalRightShift(short lhs, Object rhs) throws Throwable;

  Object reverseLogicalRightShift(int lhs, Object rhs) throws Throwable;

  Object reverseLogicalRightShift(long lhs, Object rhs) throws Throwable;

  //
  //   Methods callable from compiler generated code for operator >>=
  //

  Object logicalRightShiftEquals(byte lhs, byte rhs) throws Throwable;

  Object logicalRightShiftEquals(byte lhs, char rhs) throws Throwable;

  Object logicalRightShiftEquals(byte lhs, short rhs) throws Throwable;

  Object logicalRightShiftEquals(byte lhs, int rhs) throws Throwable;

  Object logicalRightShiftEquals(byte lhs, long rhs) throws Throwable;

  Object logicalRightShiftEquals(byte lhs, BigInteger rhs) throws Throwable;

  Object logicalRightShiftEquals(char lhs, byte rhs) throws Throwable;

  Object logicalRightShiftEquals(char lhs, char rhs) throws Throwable;

  Object logicalRightShiftEquals(char lhs, short rhs) throws Throwable;

  Object logicalRightShiftEquals(char lhs, int rhs) throws Throwable;

  Object logicalRightShiftEquals(char lhs, long rhs) throws Throwable;

  Object logicalRightShiftEquals(char lhs, BigInteger rhs) throws Throwable;

  Object logicalRightShiftEquals(short lhs, byte rhs) throws Throwable;

  Object logicalRightShiftEquals(short lhs, char rhs) throws Throwable;

  Object logicalRightShiftEquals(short lhs, short rhs) throws Throwable;

  Object logicalRightShiftEquals(short lhs, int rhs) throws Throwable;

  Object logicalRightShiftEquals(short lhs, long rhs) throws Throwable;

  Object logicalRightShiftEquals(short lhs, BigInteger rhs) throws Throwable;

  Object logicalRightShiftEquals(int lhs, byte rhs) throws Throwable;

  Object logicalRightShiftEquals(int lhs, char rhs) throws Throwable;

  Object logicalRightShiftEquals(int lhs, short rhs) throws Throwable;

  Object logicalRightShiftEquals(int lhs, int rhs) throws Throwable;

  Object logicalRightShiftEquals(int lhs, long rhs) throws Throwable;

  Object logicalRightShiftEquals(int lhs, BigInteger rhs) throws Throwable;

  Object logicalRightShiftEquals(long lhs, byte rhs) throws Throwable;

  Object logicalRightShiftEquals(long lhs, char rhs) throws Throwable;

  Object logicalRightShiftEquals(long lhs, short rhs) throws Throwable;

  Object logicalRightShiftEquals(long lhs, int rhs) throws Throwable;

  Object logicalRightShiftEquals(long lhs, long rhs) throws Throwable;

  Object logicalRightShiftEquals(long lhs, BigInteger rhs) throws Throwable;

  Object logicalRightShiftEquals(Object lhs, byte rhs) throws Throwable;

  Object logicalRightShiftEquals(Object lhs, char rhs) throws Throwable;

  Object logicalRightShiftEquals(Object lhs, short rhs) throws Throwable;

  Object logicalRightShiftEquals(Object lhs, int rhs) throws Throwable;

  Object logicalRightShiftEquals(Object lhs, long rhs) throws Throwable;

  Object logicalRightShiftEquals(Object lhs, BigInteger rhs) throws Throwable;

  Object reverseLogicalRightShiftEquals(byte lhs, Object rhs) throws Throwable;

  Object reverseLogicalRightShiftEquals(char lhs, Object rhs) throws Throwable;

  Object reverseLogicalRightShiftEquals(short lhs, Object rhs) throws Throwable;

  Object reverseLogicalRightShiftEquals(int lhs, Object rhs) throws Throwable;

  Object reverseLogicalRightShiftEquals(long lhs, Object rhs) throws Throwable;

  //
  //   Methods callable from compiler generated code for operator >>>
  //

  Object arithmeticRightShift(byte lhs, byte rhs) throws Throwable;

  Object arithmeticRightShift(byte lhs, char rhs) throws Throwable;

  Object arithmeticRightShift(byte lhs, short rhs) throws Throwable;

  Object arithmeticRightShift(byte lhs, int rhs) throws Throwable;

  Object arithmeticRightShift(byte lhs, long rhs) throws Throwable;

  Object arithmeticRightShift(byte lhs, BigInteger rhs) throws Throwable;

  Object arithmeticRightShift(char lhs, byte rhs) throws Throwable;

  Object arithmeticRightShift(char lhs, char rhs) throws Throwable;

  Object arithmeticRightShift(char lhs, short rhs) throws Throwable;

  Object arithmeticRightShift(char lhs, int rhs) throws Throwable;

  Object arithmeticRightShift(char lhs, long rhs) throws Throwable;

  Object arithmeticRightShift(char lhs, BigInteger rhs) throws Throwable;

  Object arithmeticRightShift(short lhs, byte rhs) throws Throwable;

  Object arithmeticRightShift(short lhs, char rhs) throws Throwable;

  Object arithmeticRightShift(short lhs, short rhs) throws Throwable;

  Object arithmeticRightShift(short lhs, int rhs) throws Throwable;

  Object arithmeticRightShift(short lhs, long rhs) throws Throwable;

  Object arithmeticRightShift(short lhs, BigInteger rhs) throws Throwable;

  Object arithmeticRightShift(int lhs, byte rhs) throws Throwable;

  Object arithmeticRightShift(int lhs, char rhs) throws Throwable;

  Object arithmeticRightShift(int lhs, short rhs) throws Throwable;

  Object arithmeticRightShift(int lhs, int rhs) throws Throwable;

  Object arithmeticRightShift(int lhs, long rhs) throws Throwable;

  Object arithmeticRightShift(int lhs, BigInteger rhs) throws Throwable;

  Object arithmeticRightShift(long lhs, byte rhs) throws Throwable;

  Object arithmeticRightShift(long lhs, char rhs) throws Throwable;

  Object arithmeticRightShift(long lhs, short rhs) throws Throwable;

  Object arithmeticRightShift(long lhs, int rhs) throws Throwable;

  Object arithmeticRightShift(long lhs, long rhs) throws Throwable;

  Object arithmeticRightShift(long lhs, BigInteger rhs) throws Throwable;

  Object arithmeticRightShift(BigInteger lhs, byte rhs) throws Throwable;

  Object arithmeticRightShift(BigInteger lhs, char rhs) throws Throwable;

  Object arithmeticRightShift(BigInteger lhs, short rhs) throws Throwable;

  Object arithmeticRightShift(BigInteger lhs, int rhs) throws Throwable;

  Object arithmeticRightShift(BigInteger lhs, long rhs) throws Throwable;

  Object arithmeticRightShift(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object arithmeticRightShift(Object lhs, byte rhs) throws Throwable;

  Object arithmeticRightShift(Object lhs, char rhs) throws Throwable;

  Object arithmeticRightShift(Object lhs, short rhs) throws Throwable;

  Object arithmeticRightShift(Object lhs, int rhs) throws Throwable;

  Object arithmeticRightShift(Object lhs, long rhs) throws Throwable;

  Object arithmeticRightShift(Object lhs, BigInteger rhs) throws Throwable;

  Object reverseArithmeticRightShift(byte lhs, Object rhs) throws Throwable;

  Object reverseArithmeticRightShift(char lhs, Object rhs) throws Throwable;

  Object reverseArithmeticRightShift(short lhs, Object rhs) throws Throwable;

  Object reverseArithmeticRightShift(int lhs, Object rhs) throws Throwable;

  Object reverseArithmeticRightShift(long lhs, Object rhs) throws Throwable;

  Object reverseArithmeticRightShift(BigInteger lhs, Object rhs) throws Throwable;

  //
  //   Methods callable from compiler generated code for operator >>>=
  //

  Object arithmeticRightShiftEquals(byte lhs, byte rhs) throws Throwable;

  Object arithmeticRightShiftEquals(byte lhs, char rhs) throws Throwable;

  Object arithmeticRightShiftEquals(byte lhs, short rhs) throws Throwable;

  Object arithmeticRightShiftEquals(byte lhs, int rhs) throws Throwable;

  Object arithmeticRightShiftEquals(byte lhs, long rhs) throws Throwable;

  Object arithmeticRightShiftEquals(byte lhs, BigInteger rhs) throws Throwable;

  Object arithmeticRightShiftEquals(char lhs, byte rhs) throws Throwable;

  Object arithmeticRightShiftEquals(char lhs, char rhs) throws Throwable;

  Object arithmeticRightShiftEquals(char lhs, short rhs) throws Throwable;

  Object arithmeticRightShiftEquals(char lhs, int rhs) throws Throwable;

  Object arithmeticRightShiftEquals(char lhs, long rhs) throws Throwable;

  Object arithmeticRightShiftEquals(char lhs, BigInteger rhs) throws Throwable;

  Object arithmeticRightShiftEquals(short lhs, byte rhs) throws Throwable;

  Object arithmeticRightShiftEquals(short lhs, char rhs) throws Throwable;

  Object arithmeticRightShiftEquals(short lhs, short rhs) throws Throwable;

  Object arithmeticRightShiftEquals(short lhs, int rhs) throws Throwable;

  Object arithmeticRightShiftEquals(short lhs, long rhs) throws Throwable;

  Object arithmeticRightShiftEquals(short lhs, BigInteger rhs) throws Throwable;

  Object arithmeticRightShiftEquals(int lhs, byte rhs) throws Throwable;

  Object arithmeticRightShiftEquals(int lhs, char rhs) throws Throwable;

  Object arithmeticRightShiftEquals(int lhs, short rhs) throws Throwable;

  Object arithmeticRightShiftEquals(int lhs, int rhs) throws Throwable;

  Object arithmeticRightShiftEquals(int lhs, long rhs) throws Throwable;

  Object arithmeticRightShiftEquals(int lhs, BigInteger rhs) throws Throwable;

  Object arithmeticRightShiftEquals(long lhs, byte rhs) throws Throwable;

  Object arithmeticRightShiftEquals(long lhs, char rhs) throws Throwable;

  Object arithmeticRightShiftEquals(long lhs, short rhs) throws Throwable;

  Object arithmeticRightShiftEquals(long lhs, int rhs) throws Throwable;

  Object arithmeticRightShiftEquals(long lhs, long rhs) throws Throwable;

  Object arithmeticRightShiftEquals(long lhs, BigInteger rhs) throws Throwable;

  Object arithmeticRightShiftEquals(BigInteger lhs, byte rhs) throws Throwable;

  Object arithmeticRightShiftEquals(BigInteger lhs, char rhs) throws Throwable;

  Object arithmeticRightShiftEquals(BigInteger lhs, short rhs) throws Throwable;

  Object arithmeticRightShiftEquals(BigInteger lhs, int rhs) throws Throwable;

  Object arithmeticRightShiftEquals(BigInteger lhs, long rhs) throws Throwable;

  Object arithmeticRightShiftEquals(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object arithmeticRightShiftEquals(Object lhs, byte rhs) throws Throwable;

  Object arithmeticRightShiftEquals(Object lhs, char rhs) throws Throwable;

  Object arithmeticRightShiftEquals(Object lhs, short rhs) throws Throwable;

  Object arithmeticRightShiftEquals(Object lhs, int rhs) throws Throwable;

  Object arithmeticRightShiftEquals(Object lhs, long rhs) throws Throwable;

  Object arithmeticRightShiftEquals(Object lhs, BigInteger rhs) throws Throwable;

  Object reverseArithmeticRightShiftEquals(byte lhs, Object rhs) throws Throwable;

  Object reverseArithmeticRightShiftEquals(char lhs, Object rhs) throws Throwable;

  Object reverseArithmeticRightShiftEquals(short lhs, Object rhs) throws Throwable;

  Object reverseArithmeticRightShiftEquals(int lhs, Object rhs) throws Throwable;

  Object reverseArithmeticRightShiftEquals(long lhs, Object rhs) throws Throwable;

  Object reverseArithmeticRightShiftEquals(BigInteger lhs, Object rhs) throws Throwable;

  //
  //   Methods callable from compiler generated code for operator <=>
  //

  Object compare(byte lhs, byte rhs) throws Throwable;

  Object compare(byte lhs, char rhs) throws Throwable;

  Object compare(byte lhs, short rhs) throws Throwable;

  Object compare(byte lhs, int rhs) throws Throwable;

  Object compare(byte lhs, long rhs) throws Throwable;

  Object compare(byte lhs, float rhs) throws Throwable;

  Object compare(byte lhs, double rhs) throws Throwable;

  Object compare(byte lhs, BigInteger rhs) throws Throwable;

  Object compare(byte lhs, BigDecimal rhs) throws Throwable;

  Object compare(char lhs, byte rhs) throws Throwable;

  Object compare(char lhs, char rhs) throws Throwable;

  Object compare(char lhs, short rhs) throws Throwable;

  Object compare(char lhs, int rhs) throws Throwable;

  Object compare(char lhs, long rhs) throws Throwable;

  Object compare(char lhs, float rhs) throws Throwable;

  Object compare(char lhs, double rhs) throws Throwable;

  Object compare(char lhs, BigInteger rhs) throws Throwable;

  Object compare(char lhs, BigDecimal rhs) throws Throwable;

  Object compare(short lhs, byte rhs) throws Throwable;

  Object compare(short lhs, char rhs) throws Throwable;

  Object compare(short lhs, short rhs) throws Throwable;

  Object compare(short lhs, int rhs) throws Throwable;

  Object compare(short lhs, long rhs) throws Throwable;

  Object compare(short lhs, float rhs) throws Throwable;

  Object compare(short lhs, double rhs) throws Throwable;

  Object compare(short lhs, BigInteger rhs) throws Throwable;

  Object compare(short lhs, BigDecimal rhs) throws Throwable;

  Object compare(int lhs, byte rhs) throws Throwable;

  Object compare(int lhs, char rhs) throws Throwable;

  Object compare(int lhs, short rhs) throws Throwable;

  Object compare(int lhs, int rhs) throws Throwable;

  Object compare(int lhs, long rhs) throws Throwable;

  Object compare(int lhs, float rhs) throws Throwable;

  Object compare(int lhs, double rhs) throws Throwable;

  Object compare(int lhs, BigInteger rhs) throws Throwable;

  Object compare(int lhs, BigDecimal rhs) throws Throwable;

  Object compare(long lhs, byte rhs) throws Throwable;

  Object compare(long lhs, char rhs) throws Throwable;

  Object compare(long lhs, short rhs) throws Throwable;

  Object compare(long lhs, int rhs) throws Throwable;

  Object compare(long lhs, long rhs) throws Throwable;

  Object compare(long lhs, float rhs) throws Throwable;

  Object compare(long lhs, double rhs) throws Throwable;

  Object compare(long lhs, BigInteger rhs) throws Throwable;

  Object compare(long lhs, BigDecimal rhs) throws Throwable;

  Object compare(float lhs, byte rhs) throws Throwable;

  Object compare(float lhs, char rhs) throws Throwable;

  Object compare(float lhs, short rhs) throws Throwable;

  Object compare(float lhs, int rhs) throws Throwable;

  Object compare(float lhs, long rhs) throws Throwable;

  Object compare(float lhs, float rhs) throws Throwable;

  Object compare(float lhs, double rhs) throws Throwable;

  Object compare(float lhs, BigInteger rhs) throws Throwable;

  Object compare(float lhs, BigDecimal rhs) throws Throwable;

  Object compare(double lhs, byte rhs) throws Throwable;

  Object compare(double lhs, char rhs) throws Throwable;

  Object compare(double lhs, short rhs) throws Throwable;

  Object compare(double lhs, int rhs) throws Throwable;

  Object compare(double lhs, long rhs) throws Throwable;

  Object compare(double lhs, float rhs) throws Throwable;

  Object compare(double lhs, double rhs) throws Throwable;

  Object compare(double lhs, BigInteger rhs) throws Throwable;

  Object compare(double lhs, BigDecimal rhs) throws Throwable;

  Object compare(BigInteger lhs, byte rhs) throws Throwable;

  Object compare(BigInteger lhs, char rhs) throws Throwable;

  Object compare(BigInteger lhs, short rhs) throws Throwable;

  Object compare(BigInteger lhs, int rhs) throws Throwable;

  Object compare(BigInteger lhs, long rhs) throws Throwable;

  Object compare(BigInteger lhs, float rhs) throws Throwable;

  Object compare(BigInteger lhs, double rhs) throws Throwable;

  Object compare(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object compare(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object compare(BigDecimal lhs, byte rhs) throws Throwable;

  Object compare(BigDecimal lhs, char rhs) throws Throwable;

  Object compare(BigDecimal lhs, short rhs) throws Throwable;

  Object compare(BigDecimal lhs, int rhs) throws Throwable;

  Object compare(BigDecimal lhs, long rhs) throws Throwable;

  Object compare(BigDecimal lhs, float rhs) throws Throwable;

  Object compare(BigDecimal lhs, double rhs) throws Throwable;

  Object compare(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object compare(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object compare(Object lhs, byte rhs) throws Throwable;

  Object compare(Object lhs, char rhs) throws Throwable;

  Object compare(Object lhs, short rhs) throws Throwable;

  Object compare(Object lhs, int rhs) throws Throwable;

  Object compare(Object lhs, long rhs) throws Throwable;

  Object compare(Object lhs, float rhs) throws Throwable;

  Object compare(Object lhs, double rhs) throws Throwable;

  Object compare(Object lhs, BigInteger rhs) throws Throwable;

  Object compare(Object lhs, BigDecimal rhs) throws Throwable;

  Object reverseCompare(byte lhs, Object rhs) throws Throwable;

  Object reverseCompare(char lhs, Object rhs) throws Throwable;

  Object reverseCompare(short lhs, Object rhs) throws Throwable;

  Object reverseCompare(int lhs, Object rhs) throws Throwable;

  Object reverseCompare(long lhs, Object rhs) throws Throwable;

  Object reverseCompare(float lhs, Object rhs) throws Throwable;

  Object reverseCompare(double lhs, Object rhs) throws Throwable;

  Object reverseCompare(BigInteger lhs, Object rhs) throws Throwable;

  Object reverseCompare(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Methods callable from compiler generated code for operator ==
  //

  Object equals(byte lhs, byte rhs) throws Throwable;

  Object equals(byte lhs, char rhs) throws Throwable;

  Object equals(byte lhs, short rhs) throws Throwable;

  Object equals(byte lhs, int rhs) throws Throwable;

  Object equals(byte lhs, long rhs) throws Throwable;

  Object equals(byte lhs, float rhs) throws Throwable;

  Object equals(byte lhs, double rhs) throws Throwable;

  Object equals(byte lhs, BigInteger rhs) throws Throwable;

  Object equals(byte lhs, BigDecimal rhs) throws Throwable;

  Object equals(char lhs, byte rhs) throws Throwable;

  Object equals(char lhs, char rhs) throws Throwable;

  Object equals(char lhs, short rhs) throws Throwable;

  Object equals(char lhs, int rhs) throws Throwable;

  Object equals(char lhs, long rhs) throws Throwable;

  Object equals(char lhs, float rhs) throws Throwable;

  Object equals(char lhs, double rhs) throws Throwable;

  Object equals(char lhs, BigInteger rhs) throws Throwable;

  Object equals(char lhs, BigDecimal rhs) throws Throwable;

  Object equals(short lhs, byte rhs) throws Throwable;

  Object equals(short lhs, char rhs) throws Throwable;

  Object equals(short lhs, short rhs) throws Throwable;

  Object equals(short lhs, int rhs) throws Throwable;

  Object equals(short lhs, long rhs) throws Throwable;

  Object equals(short lhs, float rhs) throws Throwable;

  Object equals(short lhs, double rhs) throws Throwable;

  Object equals(short lhs, BigInteger rhs) throws Throwable;

  Object equals(short lhs, BigDecimal rhs) throws Throwable;

  Object equals(int lhs, byte rhs) throws Throwable;

  Object equals(int lhs, char rhs) throws Throwable;

  Object equals(int lhs, short rhs) throws Throwable;

  Object equals(int lhs, int rhs) throws Throwable;

  Object equals(int lhs, long rhs) throws Throwable;

  Object equals(int lhs, float rhs) throws Throwable;

  Object equals(int lhs, double rhs) throws Throwable;

  Object equals(int lhs, BigInteger rhs) throws Throwable;

  Object equals(int lhs, BigDecimal rhs) throws Throwable;

  Object equals(long lhs, byte rhs) throws Throwable;

  Object equals(long lhs, char rhs) throws Throwable;

  Object equals(long lhs, short rhs) throws Throwable;

  Object equals(long lhs, int rhs) throws Throwable;

  Object equals(long lhs, long rhs) throws Throwable;

  Object equals(long lhs, float rhs) throws Throwable;

  Object equals(long lhs, double rhs) throws Throwable;

  Object equals(long lhs, BigInteger rhs) throws Throwable;

  Object equals(long lhs, BigDecimal rhs) throws Throwable;

  Object equals(float lhs, byte rhs) throws Throwable;

  Object equals(float lhs, char rhs) throws Throwable;

  Object equals(float lhs, short rhs) throws Throwable;

  Object equals(float lhs, int rhs) throws Throwable;

  Object equals(float lhs, long rhs) throws Throwable;

  Object equals(float lhs, float rhs) throws Throwable;

  Object equals(float lhs, double rhs) throws Throwable;

  Object equals(float lhs, BigInteger rhs) throws Throwable;

  Object equals(float lhs, BigDecimal rhs) throws Throwable;

  Object equals(double lhs, byte rhs) throws Throwable;

  Object equals(double lhs, char rhs) throws Throwable;

  Object equals(double lhs, short rhs) throws Throwable;

  Object equals(double lhs, int rhs) throws Throwable;

  Object equals(double lhs, long rhs) throws Throwable;

  Object equals(double lhs, float rhs) throws Throwable;

  Object equals(double lhs, double rhs) throws Throwable;

  Object equals(double lhs, BigInteger rhs) throws Throwable;

  Object equals(double lhs, BigDecimal rhs) throws Throwable;

  Object equals(BigInteger lhs, byte rhs) throws Throwable;

  Object equals(BigInteger lhs, char rhs) throws Throwable;

  Object equals(BigInteger lhs, short rhs) throws Throwable;

  Object equals(BigInteger lhs, int rhs) throws Throwable;

  Object equals(BigInteger lhs, long rhs) throws Throwable;

  Object equals(BigInteger lhs, float rhs) throws Throwable;

  Object equals(BigInteger lhs, double rhs) throws Throwable;

  Object equals(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object equals(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object equals(BigDecimal lhs, byte rhs) throws Throwable;

  Object equals(BigDecimal lhs, char rhs) throws Throwable;

  Object equals(BigDecimal lhs, short rhs) throws Throwable;

  Object equals(BigDecimal lhs, int rhs) throws Throwable;

  Object equals(BigDecimal lhs, long rhs) throws Throwable;

  Object equals(BigDecimal lhs, float rhs) throws Throwable;

  Object equals(BigDecimal lhs, double rhs) throws Throwable;

  Object equals(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object equals(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object equals(Object lhs, byte rhs) throws Throwable;

  Object equals(Object lhs, char rhs) throws Throwable;

  Object equals(Object lhs, short rhs) throws Throwable;

  Object equals(Object lhs, int rhs) throws Throwable;

  Object equals(Object lhs, long rhs) throws Throwable;

  Object equals(Object lhs, float rhs) throws Throwable;

  Object equals(Object lhs, double rhs) throws Throwable;

  Object equals(Object lhs, BigInteger rhs) throws Throwable;

  Object equals(Object lhs, BigDecimal rhs) throws Throwable;

  Object reverseEquals(byte lhs, Object rhs) throws Throwable;

  Object reverseEquals(char lhs, Object rhs) throws Throwable;

  Object reverseEquals(short lhs, Object rhs) throws Throwable;

  Object reverseEquals(int lhs, Object rhs) throws Throwable;

  Object reverseEquals(long lhs, Object rhs) throws Throwable;

  Object reverseEquals(float lhs, Object rhs) throws Throwable;

  Object reverseEquals(double lhs, Object rhs) throws Throwable;

  Object reverseEquals(BigInteger lhs, Object rhs) throws Throwable;

  Object reverseEquals(BigDecimal lhs, Object rhs) throws Throwable;

  boolean equalsBoolean(Object lhs, Object rhs) throws Throwable;

  boolean equalsBoolean(byte lhs, byte rhs) throws Throwable;

  boolean equalsBoolean(byte lhs, char rhs) throws Throwable;

  boolean equalsBoolean(byte lhs, short rhs) throws Throwable;

  boolean equalsBoolean(byte lhs, int rhs) throws Throwable;

  boolean equalsBoolean(byte lhs, long rhs) throws Throwable;

  boolean equalsBoolean(byte lhs, float rhs) throws Throwable;

  boolean equalsBoolean(byte lhs, double rhs) throws Throwable;

  boolean equalsBoolean(byte lhs, BigInteger rhs) throws Throwable;

  boolean equalsBoolean(byte lhs, BigDecimal rhs) throws Throwable;

  boolean equalsBoolean(char lhs, byte rhs) throws Throwable;

  boolean equalsBoolean(char lhs, char rhs) throws Throwable;

  boolean equalsBoolean(char lhs, short rhs) throws Throwable;

  boolean equalsBoolean(char lhs, int rhs) throws Throwable;

  boolean equalsBoolean(char lhs, long rhs) throws Throwable;

  boolean equalsBoolean(char lhs, float rhs) throws Throwable;

  boolean equalsBoolean(char lhs, double rhs) throws Throwable;

  boolean equalsBoolean(char lhs, BigInteger rhs) throws Throwable;

  boolean equalsBoolean(char lhs, BigDecimal rhs) throws Throwable;

  boolean equalsBoolean(short lhs, byte rhs) throws Throwable;

  boolean equalsBoolean(short lhs, char rhs) throws Throwable;

  boolean equalsBoolean(short lhs, short rhs) throws Throwable;

  boolean equalsBoolean(short lhs, int rhs) throws Throwable;

  boolean equalsBoolean(short lhs, long rhs) throws Throwable;

  boolean equalsBoolean(short lhs, float rhs) throws Throwable;

  boolean equalsBoolean(short lhs, double rhs) throws Throwable;

  boolean equalsBoolean(short lhs, BigInteger rhs) throws Throwable;

  boolean equalsBoolean(short lhs, BigDecimal rhs) throws Throwable;

  boolean equalsBoolean(int lhs, byte rhs) throws Throwable;

  boolean equalsBoolean(int lhs, char rhs) throws Throwable;

  boolean equalsBoolean(int lhs, short rhs) throws Throwable;

  boolean equalsBoolean(int lhs, int rhs) throws Throwable;

  boolean equalsBoolean(int lhs, long rhs) throws Throwable;

  boolean equalsBoolean(int lhs, float rhs) throws Throwable;

  boolean equalsBoolean(int lhs, double rhs) throws Throwable;

  boolean equalsBoolean(int lhs, BigInteger rhs) throws Throwable;

  boolean equalsBoolean(int lhs, BigDecimal rhs) throws Throwable;

  boolean equalsBoolean(long lhs, byte rhs) throws Throwable;

  boolean equalsBoolean(long lhs, char rhs) throws Throwable;

  boolean equalsBoolean(long lhs, short rhs) throws Throwable;

  boolean equalsBoolean(long lhs, int rhs) throws Throwable;

  boolean equalsBoolean(long lhs, long rhs) throws Throwable;

  boolean equalsBoolean(long lhs, float rhs) throws Throwable;

  boolean equalsBoolean(long lhs, double rhs) throws Throwable;

  boolean equalsBoolean(long lhs, BigInteger rhs) throws Throwable;

  boolean equalsBoolean(long lhs, BigDecimal rhs) throws Throwable;

  boolean equalsBoolean(float lhs, byte rhs) throws Throwable;

  boolean equalsBoolean(float lhs, char rhs) throws Throwable;

  boolean equalsBoolean(float lhs, short rhs) throws Throwable;

  boolean equalsBoolean(float lhs, int rhs) throws Throwable;

  boolean equalsBoolean(float lhs, long rhs) throws Throwable;

  boolean equalsBoolean(float lhs, float rhs) throws Throwable;

  boolean equalsBoolean(float lhs, double rhs) throws Throwable;

  boolean equalsBoolean(float lhs, BigInteger rhs) throws Throwable;

  boolean equalsBoolean(float lhs, BigDecimal rhs) throws Throwable;

  boolean equalsBoolean(double lhs, byte rhs) throws Throwable;

  boolean equalsBoolean(double lhs, char rhs) throws Throwable;

  boolean equalsBoolean(double lhs, short rhs) throws Throwable;

  boolean equalsBoolean(double lhs, int rhs) throws Throwable;

  boolean equalsBoolean(double lhs, long rhs) throws Throwable;

  boolean equalsBoolean(double lhs, float rhs) throws Throwable;

  boolean equalsBoolean(double lhs, double rhs) throws Throwable;

  boolean equalsBoolean(double lhs, BigInteger rhs) throws Throwable;

  boolean equalsBoolean(double lhs, BigDecimal rhs) throws Throwable;

  boolean equalsBoolean(BigInteger lhs, byte rhs) throws Throwable;

  boolean equalsBoolean(BigInteger lhs, char rhs) throws Throwable;

  boolean equalsBoolean(BigInteger lhs, short rhs) throws Throwable;

  boolean equalsBoolean(BigInteger lhs, int rhs) throws Throwable;

  boolean equalsBoolean(BigInteger lhs, long rhs) throws Throwable;

  boolean equalsBoolean(BigInteger lhs, float rhs) throws Throwable;

  boolean equalsBoolean(BigInteger lhs, double rhs) throws Throwable;

  boolean equalsBoolean(BigInteger lhs, BigInteger rhs) throws Throwable;

  boolean equalsBoolean(BigInteger lhs, BigDecimal rhs) throws Throwable;

  boolean equalsBoolean(BigDecimal lhs, byte rhs) throws Throwable;

  boolean equalsBoolean(BigDecimal lhs, char rhs) throws Throwable;

  boolean equalsBoolean(BigDecimal lhs, short rhs) throws Throwable;

  boolean equalsBoolean(BigDecimal lhs, int rhs) throws Throwable;

  boolean equalsBoolean(BigDecimal lhs, long rhs) throws Throwable;

  boolean equalsBoolean(BigDecimal lhs, float rhs) throws Throwable;

  boolean equalsBoolean(BigDecimal lhs, double rhs) throws Throwable;

  boolean equalsBoolean(BigDecimal lhs, BigInteger rhs) throws Throwable;

  boolean equalsBoolean(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  boolean equalsBoolean(Object lhs, byte rhs) throws Throwable;

  boolean equalsBoolean(Object lhs, char rhs) throws Throwable;

  boolean equalsBoolean(Object lhs, short rhs) throws Throwable;

  boolean equalsBoolean(Object lhs, int rhs) throws Throwable;

  boolean equalsBoolean(Object lhs, long rhs) throws Throwable;

  boolean equalsBoolean(Object lhs, float rhs) throws Throwable;

  boolean equalsBoolean(Object lhs, double rhs) throws Throwable;

  boolean equalsBoolean(Object lhs, BigInteger rhs) throws Throwable;

  boolean equalsBoolean(Object lhs, BigDecimal rhs) throws Throwable;

  boolean reverseEqualsBoolean(byte lhs, Object rhs) throws Throwable;

  boolean reverseEqualsBoolean(char lhs, Object rhs) throws Throwable;

  boolean reverseEqualsBoolean(short lhs, Object rhs) throws Throwable;

  boolean reverseEqualsBoolean(int lhs, Object rhs) throws Throwable;

  boolean reverseEqualsBoolean(long lhs, Object rhs) throws Throwable;

  boolean reverseEqualsBoolean(float lhs, Object rhs) throws Throwable;

  boolean reverseEqualsBoolean(double lhs, Object rhs) throws Throwable;

  boolean reverseEqualsBoolean(BigInteger lhs, Object rhs) throws Throwable;

  boolean reverseEqualsBoolean(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Methods callable from compiler generated code for operator !=
  //

  Object notEquals(byte lhs, byte rhs) throws Throwable;

  Object notEquals(byte lhs, char rhs) throws Throwable;

  Object notEquals(byte lhs, short rhs) throws Throwable;

  Object notEquals(byte lhs, int rhs) throws Throwable;

  Object notEquals(byte lhs, long rhs) throws Throwable;

  Object notEquals(byte lhs, float rhs) throws Throwable;

  Object notEquals(byte lhs, double rhs) throws Throwable;

  Object notEquals(byte lhs, BigInteger rhs) throws Throwable;

  Object notEquals(byte lhs, BigDecimal rhs) throws Throwable;

  Object notEquals(char lhs, byte rhs) throws Throwable;

  Object notEquals(char lhs, char rhs) throws Throwable;

  Object notEquals(char lhs, short rhs) throws Throwable;

  Object notEquals(char lhs, int rhs) throws Throwable;

  Object notEquals(char lhs, long rhs) throws Throwable;

  Object notEquals(char lhs, float rhs) throws Throwable;

  Object notEquals(char lhs, double rhs) throws Throwable;

  Object notEquals(char lhs, BigInteger rhs) throws Throwable;

  Object notEquals(char lhs, BigDecimal rhs) throws Throwable;

  Object notEquals(short lhs, byte rhs) throws Throwable;

  Object notEquals(short lhs, char rhs) throws Throwable;

  Object notEquals(short lhs, short rhs) throws Throwable;

  Object notEquals(short lhs, int rhs) throws Throwable;

  Object notEquals(short lhs, long rhs) throws Throwable;

  Object notEquals(short lhs, float rhs) throws Throwable;

  Object notEquals(short lhs, double rhs) throws Throwable;

  Object notEquals(short lhs, BigInteger rhs) throws Throwable;

  Object notEquals(short lhs, BigDecimal rhs) throws Throwable;

  Object notEquals(int lhs, byte rhs) throws Throwable;

  Object notEquals(int lhs, char rhs) throws Throwable;

  Object notEquals(int lhs, short rhs) throws Throwable;

  Object notEquals(int lhs, int rhs) throws Throwable;

  Object notEquals(int lhs, long rhs) throws Throwable;

  Object notEquals(int lhs, float rhs) throws Throwable;

  Object notEquals(int lhs, double rhs) throws Throwable;

  Object notEquals(int lhs, BigInteger rhs) throws Throwable;

  Object notEquals(int lhs, BigDecimal rhs) throws Throwable;

  Object notEquals(long lhs, byte rhs) throws Throwable;

  Object notEquals(long lhs, char rhs) throws Throwable;

  Object notEquals(long lhs, short rhs) throws Throwable;

  Object notEquals(long lhs, int rhs) throws Throwable;

  Object notEquals(long lhs, long rhs) throws Throwable;

  Object notEquals(long lhs, float rhs) throws Throwable;

  Object notEquals(long lhs, double rhs) throws Throwable;

  Object notEquals(long lhs, BigInteger rhs) throws Throwable;

  Object notEquals(long lhs, BigDecimal rhs) throws Throwable;

  Object notEquals(float lhs, byte rhs) throws Throwable;

  Object notEquals(float lhs, char rhs) throws Throwable;

  Object notEquals(float lhs, short rhs) throws Throwable;

  Object notEquals(float lhs, int rhs) throws Throwable;

  Object notEquals(float lhs, long rhs) throws Throwable;

  Object notEquals(float lhs, float rhs) throws Throwable;

  Object notEquals(float lhs, double rhs) throws Throwable;

  Object notEquals(float lhs, BigInteger rhs) throws Throwable;

  Object notEquals(float lhs, BigDecimal rhs) throws Throwable;

  Object notEquals(double lhs, byte rhs) throws Throwable;

  Object notEquals(double lhs, char rhs) throws Throwable;

  Object notEquals(double lhs, short rhs) throws Throwable;

  Object notEquals(double lhs, int rhs) throws Throwable;

  Object notEquals(double lhs, long rhs) throws Throwable;

  Object notEquals(double lhs, float rhs) throws Throwable;

  Object notEquals(double lhs, double rhs) throws Throwable;

  Object notEquals(double lhs, BigInteger rhs) throws Throwable;

  Object notEquals(double lhs, BigDecimal rhs) throws Throwable;

  Object notEquals(BigInteger lhs, byte rhs) throws Throwable;

  Object notEquals(BigInteger lhs, char rhs) throws Throwable;

  Object notEquals(BigInteger lhs, short rhs) throws Throwable;

  Object notEquals(BigInteger lhs, int rhs) throws Throwable;

  Object notEquals(BigInteger lhs, long rhs) throws Throwable;

  Object notEquals(BigInteger lhs, float rhs) throws Throwable;

  Object notEquals(BigInteger lhs, double rhs) throws Throwable;

  Object notEquals(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object notEquals(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object notEquals(BigDecimal lhs, byte rhs) throws Throwable;

  Object notEquals(BigDecimal lhs, char rhs) throws Throwable;

  Object notEquals(BigDecimal lhs, short rhs) throws Throwable;

  Object notEquals(BigDecimal lhs, int rhs) throws Throwable;

  Object notEquals(BigDecimal lhs, long rhs) throws Throwable;

  Object notEquals(BigDecimal lhs, float rhs) throws Throwable;

  Object notEquals(BigDecimal lhs, double rhs) throws Throwable;

  Object notEquals(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object notEquals(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object notEquals(Object lhs, byte rhs) throws Throwable;

  Object notEquals(Object lhs, char rhs) throws Throwable;

  Object notEquals(Object lhs, short rhs) throws Throwable;

  Object notEquals(Object lhs, int rhs) throws Throwable;

  Object notEquals(Object lhs, long rhs) throws Throwable;

  Object notEquals(Object lhs, float rhs) throws Throwable;

  Object notEquals(Object lhs, double rhs) throws Throwable;

  Object notEquals(Object lhs, BigInteger rhs) throws Throwable;

  Object notEquals(Object lhs, BigDecimal rhs) throws Throwable;

  Object reverseNotEquals(byte lhs, Object rhs) throws Throwable;

  Object reverseNotEquals(char lhs, Object rhs) throws Throwable;

  Object reverseNotEquals(short lhs, Object rhs) throws Throwable;

  Object reverseNotEquals(int lhs, Object rhs) throws Throwable;

  Object reverseNotEquals(long lhs, Object rhs) throws Throwable;

  Object reverseNotEquals(float lhs, Object rhs) throws Throwable;

  Object reverseNotEquals(double lhs, Object rhs) throws Throwable;

  Object reverseNotEquals(BigInteger lhs, Object rhs) throws Throwable;

  Object reverseNotEquals(BigDecimal lhs, Object rhs) throws Throwable;

  boolean notEqualsBoolean(Object lhs, Object rhs) throws Throwable;

  boolean notEqualsBoolean(byte lhs, byte rhs) throws Throwable;

  boolean notEqualsBoolean(byte lhs, char rhs) throws Throwable;

  boolean notEqualsBoolean(byte lhs, short rhs) throws Throwable;

  boolean notEqualsBoolean(byte lhs, int rhs) throws Throwable;

  boolean notEqualsBoolean(byte lhs, long rhs) throws Throwable;

  boolean notEqualsBoolean(byte lhs, float rhs) throws Throwable;

  boolean notEqualsBoolean(byte lhs, double rhs) throws Throwable;

  boolean notEqualsBoolean(byte lhs, BigInteger rhs) throws Throwable;

  boolean notEqualsBoolean(byte lhs, BigDecimal rhs) throws Throwable;

  boolean notEqualsBoolean(char lhs, byte rhs) throws Throwable;

  boolean notEqualsBoolean(char lhs, char rhs) throws Throwable;

  boolean notEqualsBoolean(char lhs, short rhs) throws Throwable;

  boolean notEqualsBoolean(char lhs, int rhs) throws Throwable;

  boolean notEqualsBoolean(char lhs, long rhs) throws Throwable;

  boolean notEqualsBoolean(char lhs, float rhs) throws Throwable;

  boolean notEqualsBoolean(char lhs, double rhs) throws Throwable;

  boolean notEqualsBoolean(char lhs, BigInteger rhs) throws Throwable;

  boolean notEqualsBoolean(char lhs, BigDecimal rhs) throws Throwable;

  boolean notEqualsBoolean(short lhs, byte rhs) throws Throwable;

  boolean notEqualsBoolean(short lhs, char rhs) throws Throwable;

  boolean notEqualsBoolean(short lhs, short rhs) throws Throwable;

  boolean notEqualsBoolean(short lhs, int rhs) throws Throwable;

  boolean notEqualsBoolean(short lhs, long rhs) throws Throwable;

  boolean notEqualsBoolean(short lhs, float rhs) throws Throwable;

  boolean notEqualsBoolean(short lhs, double rhs) throws Throwable;

  boolean notEqualsBoolean(short lhs, BigInteger rhs) throws Throwable;

  boolean notEqualsBoolean(short lhs, BigDecimal rhs) throws Throwable;

  boolean notEqualsBoolean(int lhs, byte rhs) throws Throwable;

  boolean notEqualsBoolean(int lhs, char rhs) throws Throwable;

  boolean notEqualsBoolean(int lhs, short rhs) throws Throwable;

  boolean notEqualsBoolean(int lhs, int rhs) throws Throwable;

  boolean notEqualsBoolean(int lhs, long rhs) throws Throwable;

  boolean notEqualsBoolean(int lhs, float rhs) throws Throwable;

  boolean notEqualsBoolean(int lhs, double rhs) throws Throwable;

  boolean notEqualsBoolean(int lhs, BigInteger rhs) throws Throwable;

  boolean notEqualsBoolean(int lhs, BigDecimal rhs) throws Throwable;

  boolean notEqualsBoolean(long lhs, byte rhs) throws Throwable;

  boolean notEqualsBoolean(long lhs, char rhs) throws Throwable;

  boolean notEqualsBoolean(long lhs, short rhs) throws Throwable;

  boolean notEqualsBoolean(long lhs, int rhs) throws Throwable;

  boolean notEqualsBoolean(long lhs, long rhs) throws Throwable;

  boolean notEqualsBoolean(long lhs, float rhs) throws Throwable;

  boolean notEqualsBoolean(long lhs, double rhs) throws Throwable;

  boolean notEqualsBoolean(long lhs, BigInteger rhs) throws Throwable;

  boolean notEqualsBoolean(long lhs, BigDecimal rhs) throws Throwable;

  boolean notEqualsBoolean(float lhs, byte rhs) throws Throwable;

  boolean notEqualsBoolean(float lhs, char rhs) throws Throwable;

  boolean notEqualsBoolean(float lhs, short rhs) throws Throwable;

  boolean notEqualsBoolean(float lhs, int rhs) throws Throwable;

  boolean notEqualsBoolean(float lhs, long rhs) throws Throwable;

  boolean notEqualsBoolean(float lhs, float rhs) throws Throwable;

  boolean notEqualsBoolean(float lhs, double rhs) throws Throwable;

  boolean notEqualsBoolean(float lhs, BigInteger rhs) throws Throwable;

  boolean notEqualsBoolean(float lhs, BigDecimal rhs) throws Throwable;

  boolean notEqualsBoolean(double lhs, byte rhs) throws Throwable;

  boolean notEqualsBoolean(double lhs, char rhs) throws Throwable;

  boolean notEqualsBoolean(double lhs, short rhs) throws Throwable;

  boolean notEqualsBoolean(double lhs, int rhs) throws Throwable;

  boolean notEqualsBoolean(double lhs, long rhs) throws Throwable;

  boolean notEqualsBoolean(double lhs, float rhs) throws Throwable;

  boolean notEqualsBoolean(double lhs, double rhs) throws Throwable;

  boolean notEqualsBoolean(double lhs, BigInteger rhs) throws Throwable;

  boolean notEqualsBoolean(double lhs, BigDecimal rhs) throws Throwable;

  boolean notEqualsBoolean(BigInteger lhs, byte rhs) throws Throwable;

  boolean notEqualsBoolean(BigInteger lhs, char rhs) throws Throwable;

  boolean notEqualsBoolean(BigInteger lhs, short rhs) throws Throwable;

  boolean notEqualsBoolean(BigInteger lhs, int rhs) throws Throwable;

  boolean notEqualsBoolean(BigInteger lhs, long rhs) throws Throwable;

  boolean notEqualsBoolean(BigInteger lhs, float rhs) throws Throwable;

  boolean notEqualsBoolean(BigInteger lhs, double rhs) throws Throwable;

  boolean notEqualsBoolean(BigInteger lhs, BigInteger rhs) throws Throwable;

  boolean notEqualsBoolean(BigInteger lhs, BigDecimal rhs) throws Throwable;

  boolean notEqualsBoolean(BigDecimal lhs, byte rhs) throws Throwable;

  boolean notEqualsBoolean(BigDecimal lhs, char rhs) throws Throwable;

  boolean notEqualsBoolean(BigDecimal lhs, short rhs) throws Throwable;

  boolean notEqualsBoolean(BigDecimal lhs, int rhs) throws Throwable;

  boolean notEqualsBoolean(BigDecimal lhs, long rhs) throws Throwable;

  boolean notEqualsBoolean(BigDecimal lhs, float rhs) throws Throwable;

  boolean notEqualsBoolean(BigDecimal lhs, double rhs) throws Throwable;

  boolean notEqualsBoolean(BigDecimal lhs, BigInteger rhs) throws Throwable;

  boolean notEqualsBoolean(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  boolean notEqualsBoolean(Object lhs, byte rhs) throws Throwable;

  boolean notEqualsBoolean(Object lhs, char rhs) throws Throwable;

  boolean notEqualsBoolean(Object lhs, short rhs) throws Throwable;

  boolean notEqualsBoolean(Object lhs, int rhs) throws Throwable;

  boolean notEqualsBoolean(Object lhs, long rhs) throws Throwable;

  boolean notEqualsBoolean(Object lhs, float rhs) throws Throwable;

  boolean notEqualsBoolean(Object lhs, double rhs) throws Throwable;

  boolean notEqualsBoolean(Object lhs, BigInteger rhs) throws Throwable;

  boolean notEqualsBoolean(Object lhs, BigDecimal rhs) throws Throwable;

  boolean reverseNotEqualsBoolean(byte lhs, Object rhs) throws Throwable;

  boolean reverseNotEqualsBoolean(char lhs, Object rhs) throws Throwable;

  boolean reverseNotEqualsBoolean(short lhs, Object rhs) throws Throwable;

  boolean reverseNotEqualsBoolean(int lhs, Object rhs) throws Throwable;

  boolean reverseNotEqualsBoolean(long lhs, Object rhs) throws Throwable;

  boolean reverseNotEqualsBoolean(float lhs, Object rhs) throws Throwable;

  boolean reverseNotEqualsBoolean(double lhs, Object rhs) throws Throwable;

  boolean reverseNotEqualsBoolean(BigInteger lhs, Object rhs) throws Throwable;

  boolean reverseNotEqualsBoolean(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Methods callable from compiler generated code for operator <
  //

  Object lessThan(byte lhs, byte rhs) throws Throwable;

  Object lessThan(byte lhs, char rhs) throws Throwable;

  Object lessThan(byte lhs, short rhs) throws Throwable;

  Object lessThan(byte lhs, int rhs) throws Throwable;

  Object lessThan(byte lhs, long rhs) throws Throwable;

  Object lessThan(byte lhs, float rhs) throws Throwable;

  Object lessThan(byte lhs, double rhs) throws Throwable;

  Object lessThan(byte lhs, BigInteger rhs) throws Throwable;

  Object lessThan(byte lhs, BigDecimal rhs) throws Throwable;

  Object lessThan(char lhs, byte rhs) throws Throwable;

  Object lessThan(char lhs, char rhs) throws Throwable;

  Object lessThan(char lhs, short rhs) throws Throwable;

  Object lessThan(char lhs, int rhs) throws Throwable;

  Object lessThan(char lhs, long rhs) throws Throwable;

  Object lessThan(char lhs, float rhs) throws Throwable;

  Object lessThan(char lhs, double rhs) throws Throwable;

  Object lessThan(char lhs, BigInteger rhs) throws Throwable;

  Object lessThan(char lhs, BigDecimal rhs) throws Throwable;

  Object lessThan(short lhs, byte rhs) throws Throwable;

  Object lessThan(short lhs, char rhs) throws Throwable;

  Object lessThan(short lhs, short rhs) throws Throwable;

  Object lessThan(short lhs, int rhs) throws Throwable;

  Object lessThan(short lhs, long rhs) throws Throwable;

  Object lessThan(short lhs, float rhs) throws Throwable;

  Object lessThan(short lhs, double rhs) throws Throwable;

  Object lessThan(short lhs, BigInteger rhs) throws Throwable;

  Object lessThan(short lhs, BigDecimal rhs) throws Throwable;

  Object lessThan(int lhs, byte rhs) throws Throwable;

  Object lessThan(int lhs, char rhs) throws Throwable;

  Object lessThan(int lhs, short rhs) throws Throwable;

  Object lessThan(int lhs, int rhs) throws Throwable;

  Object lessThan(int lhs, long rhs) throws Throwable;

  Object lessThan(int lhs, float rhs) throws Throwable;

  Object lessThan(int lhs, double rhs) throws Throwable;

  Object lessThan(int lhs, BigInteger rhs) throws Throwable;

  Object lessThan(int lhs, BigDecimal rhs) throws Throwable;

  Object lessThan(long lhs, byte rhs) throws Throwable;

  Object lessThan(long lhs, char rhs) throws Throwable;

  Object lessThan(long lhs, short rhs) throws Throwable;

  Object lessThan(long lhs, int rhs) throws Throwable;

  Object lessThan(long lhs, long rhs) throws Throwable;

  Object lessThan(long lhs, float rhs) throws Throwable;

  Object lessThan(long lhs, double rhs) throws Throwable;

  Object lessThan(long lhs, BigInteger rhs) throws Throwable;

  Object lessThan(long lhs, BigDecimal rhs) throws Throwable;

  Object lessThan(float lhs, byte rhs) throws Throwable;

  Object lessThan(float lhs, char rhs) throws Throwable;

  Object lessThan(float lhs, short rhs) throws Throwable;

  Object lessThan(float lhs, int rhs) throws Throwable;

  Object lessThan(float lhs, long rhs) throws Throwable;

  Object lessThan(float lhs, float rhs) throws Throwable;

  Object lessThan(float lhs, double rhs) throws Throwable;

  Object lessThan(float lhs, BigInteger rhs) throws Throwable;

  Object lessThan(float lhs, BigDecimal rhs) throws Throwable;

  Object lessThan(double lhs, byte rhs) throws Throwable;

  Object lessThan(double lhs, char rhs) throws Throwable;

  Object lessThan(double lhs, short rhs) throws Throwable;

  Object lessThan(double lhs, int rhs) throws Throwable;

  Object lessThan(double lhs, long rhs) throws Throwable;

  Object lessThan(double lhs, float rhs) throws Throwable;

  Object lessThan(double lhs, double rhs) throws Throwable;

  Object lessThan(double lhs, BigInteger rhs) throws Throwable;

  Object lessThan(double lhs, BigDecimal rhs) throws Throwable;

  Object lessThan(BigInteger lhs, byte rhs) throws Throwable;

  Object lessThan(BigInteger lhs, char rhs) throws Throwable;

  Object lessThan(BigInteger lhs, short rhs) throws Throwable;

  Object lessThan(BigInteger lhs, int rhs) throws Throwable;

  Object lessThan(BigInteger lhs, long rhs) throws Throwable;

  Object lessThan(BigInteger lhs, float rhs) throws Throwable;

  Object lessThan(BigInteger lhs, double rhs) throws Throwable;

  Object lessThan(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object lessThan(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object lessThan(BigDecimal lhs, byte rhs) throws Throwable;

  Object lessThan(BigDecimal lhs, char rhs) throws Throwable;

  Object lessThan(BigDecimal lhs, short rhs) throws Throwable;

  Object lessThan(BigDecimal lhs, int rhs) throws Throwable;

  Object lessThan(BigDecimal lhs, long rhs) throws Throwable;

  Object lessThan(BigDecimal lhs, float rhs) throws Throwable;

  Object lessThan(BigDecimal lhs, double rhs) throws Throwable;

  Object lessThan(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object lessThan(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object lessThan(Object lhs, byte rhs) throws Throwable;

  Object lessThan(Object lhs, char rhs) throws Throwable;

  Object lessThan(Object lhs, short rhs) throws Throwable;

  Object lessThan(Object lhs, int rhs) throws Throwable;

  Object lessThan(Object lhs, long rhs) throws Throwable;

  Object lessThan(Object lhs, float rhs) throws Throwable;

  Object lessThan(Object lhs, double rhs) throws Throwable;

  Object lessThan(Object lhs, BigInteger rhs) throws Throwable;

  Object lessThan(Object lhs, BigDecimal rhs) throws Throwable;

  Object reverseLessThan(byte lhs, Object rhs) throws Throwable;

  Object reverseLessThan(char lhs, Object rhs) throws Throwable;

  Object reverseLessThan(short lhs, Object rhs) throws Throwable;

  Object reverseLessThan(int lhs, Object rhs) throws Throwable;

  Object reverseLessThan(long lhs, Object rhs) throws Throwable;

  Object reverseLessThan(float lhs, Object rhs) throws Throwable;

  Object reverseLessThan(double lhs, Object rhs) throws Throwable;

  Object reverseLessThan(BigInteger lhs, Object rhs) throws Throwable;

  Object reverseLessThan(BigDecimal lhs, Object rhs) throws Throwable;

  boolean lessThanBoolean(Object lhs, Object rhs) throws Throwable;

  boolean lessThanBoolean(byte lhs, byte rhs) throws Throwable;

  boolean lessThanBoolean(byte lhs, char rhs) throws Throwable;

  boolean lessThanBoolean(byte lhs, short rhs) throws Throwable;

  boolean lessThanBoolean(byte lhs, int rhs) throws Throwable;

  boolean lessThanBoolean(byte lhs, long rhs) throws Throwable;

  boolean lessThanBoolean(byte lhs, float rhs) throws Throwable;

  boolean lessThanBoolean(byte lhs, double rhs) throws Throwable;

  boolean lessThanBoolean(byte lhs, BigInteger rhs) throws Throwable;

  boolean lessThanBoolean(byte lhs, BigDecimal rhs) throws Throwable;

  boolean lessThanBoolean(char lhs, byte rhs) throws Throwable;

  boolean lessThanBoolean(char lhs, char rhs) throws Throwable;

  boolean lessThanBoolean(char lhs, short rhs) throws Throwable;

  boolean lessThanBoolean(char lhs, int rhs) throws Throwable;

  boolean lessThanBoolean(char lhs, long rhs) throws Throwable;

  boolean lessThanBoolean(char lhs, float rhs) throws Throwable;

  boolean lessThanBoolean(char lhs, double rhs) throws Throwable;

  boolean lessThanBoolean(char lhs, BigInteger rhs) throws Throwable;

  boolean lessThanBoolean(char lhs, BigDecimal rhs) throws Throwable;

  boolean lessThanBoolean(short lhs, byte rhs) throws Throwable;

  boolean lessThanBoolean(short lhs, char rhs) throws Throwable;

  boolean lessThanBoolean(short lhs, short rhs) throws Throwable;

  boolean lessThanBoolean(short lhs, int rhs) throws Throwable;

  boolean lessThanBoolean(short lhs, long rhs) throws Throwable;

  boolean lessThanBoolean(short lhs, float rhs) throws Throwable;

  boolean lessThanBoolean(short lhs, double rhs) throws Throwable;

  boolean lessThanBoolean(short lhs, BigInteger rhs) throws Throwable;

  boolean lessThanBoolean(short lhs, BigDecimal rhs) throws Throwable;

  boolean lessThanBoolean(int lhs, byte rhs) throws Throwable;

  boolean lessThanBoolean(int lhs, char rhs) throws Throwable;

  boolean lessThanBoolean(int lhs, short rhs) throws Throwable;

  boolean lessThanBoolean(int lhs, int rhs) throws Throwable;

  boolean lessThanBoolean(int lhs, long rhs) throws Throwable;

  boolean lessThanBoolean(int lhs, float rhs) throws Throwable;

  boolean lessThanBoolean(int lhs, double rhs) throws Throwable;

  boolean lessThanBoolean(int lhs, BigInteger rhs) throws Throwable;

  boolean lessThanBoolean(int lhs, BigDecimal rhs) throws Throwable;

  boolean lessThanBoolean(long lhs, byte rhs) throws Throwable;

  boolean lessThanBoolean(long lhs, char rhs) throws Throwable;

  boolean lessThanBoolean(long lhs, short rhs) throws Throwable;

  boolean lessThanBoolean(long lhs, int rhs) throws Throwable;

  boolean lessThanBoolean(long lhs, long rhs) throws Throwable;

  boolean lessThanBoolean(long lhs, float rhs) throws Throwable;

  boolean lessThanBoolean(long lhs, double rhs) throws Throwable;

  boolean lessThanBoolean(long lhs, BigInteger rhs) throws Throwable;

  boolean lessThanBoolean(long lhs, BigDecimal rhs) throws Throwable;

  boolean lessThanBoolean(float lhs, byte rhs) throws Throwable;

  boolean lessThanBoolean(float lhs, char rhs) throws Throwable;

  boolean lessThanBoolean(float lhs, short rhs) throws Throwable;

  boolean lessThanBoolean(float lhs, int rhs) throws Throwable;

  boolean lessThanBoolean(float lhs, long rhs) throws Throwable;

  boolean lessThanBoolean(float lhs, float rhs) throws Throwable;

  boolean lessThanBoolean(float lhs, double rhs) throws Throwable;

  boolean lessThanBoolean(float lhs, BigInteger rhs) throws Throwable;

  boolean lessThanBoolean(float lhs, BigDecimal rhs) throws Throwable;

  boolean lessThanBoolean(double lhs, byte rhs) throws Throwable;

  boolean lessThanBoolean(double lhs, char rhs) throws Throwable;

  boolean lessThanBoolean(double lhs, short rhs) throws Throwable;

  boolean lessThanBoolean(double lhs, int rhs) throws Throwable;

  boolean lessThanBoolean(double lhs, long rhs) throws Throwable;

  boolean lessThanBoolean(double lhs, float rhs) throws Throwable;

  boolean lessThanBoolean(double lhs, double rhs) throws Throwable;

  boolean lessThanBoolean(double lhs, BigInteger rhs) throws Throwable;

  boolean lessThanBoolean(double lhs, BigDecimal rhs) throws Throwable;

  boolean lessThanBoolean(BigInteger lhs, byte rhs) throws Throwable;

  boolean lessThanBoolean(BigInteger lhs, char rhs) throws Throwable;

  boolean lessThanBoolean(BigInteger lhs, short rhs) throws Throwable;

  boolean lessThanBoolean(BigInteger lhs, int rhs) throws Throwable;

  boolean lessThanBoolean(BigInteger lhs, long rhs) throws Throwable;

  boolean lessThanBoolean(BigInteger lhs, float rhs) throws Throwable;

  boolean lessThanBoolean(BigInteger lhs, double rhs) throws Throwable;

  boolean lessThanBoolean(BigInteger lhs, BigInteger rhs) throws Throwable;

  boolean lessThanBoolean(BigInteger lhs, BigDecimal rhs) throws Throwable;

  boolean lessThanBoolean(BigDecimal lhs, byte rhs) throws Throwable;

  boolean lessThanBoolean(BigDecimal lhs, char rhs) throws Throwable;

  boolean lessThanBoolean(BigDecimal lhs, short rhs) throws Throwable;

  boolean lessThanBoolean(BigDecimal lhs, int rhs) throws Throwable;

  boolean lessThanBoolean(BigDecimal lhs, long rhs) throws Throwable;

  boolean lessThanBoolean(BigDecimal lhs, float rhs) throws Throwable;

  boolean lessThanBoolean(BigDecimal lhs, double rhs) throws Throwable;

  boolean lessThanBoolean(BigDecimal lhs, BigInteger rhs) throws Throwable;

  boolean lessThanBoolean(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  boolean lessThanBoolean(Object lhs, byte rhs) throws Throwable;

  boolean lessThanBoolean(Object lhs, char rhs) throws Throwable;

  boolean lessThanBoolean(Object lhs, short rhs) throws Throwable;

  boolean lessThanBoolean(Object lhs, int rhs) throws Throwable;

  boolean lessThanBoolean(Object lhs, long rhs) throws Throwable;

  boolean lessThanBoolean(Object lhs, float rhs) throws Throwable;

  boolean lessThanBoolean(Object lhs, double rhs) throws Throwable;

  boolean lessThanBoolean(Object lhs, BigInteger rhs) throws Throwable;

  boolean lessThanBoolean(Object lhs, BigDecimal rhs) throws Throwable;

  boolean reverseLessThanBoolean(byte lhs, Object rhs) throws Throwable;

  boolean reverseLessThanBoolean(char lhs, Object rhs) throws Throwable;

  boolean reverseLessThanBoolean(short lhs, Object rhs) throws Throwable;

  boolean reverseLessThanBoolean(int lhs, Object rhs) throws Throwable;

  boolean reverseLessThanBoolean(long lhs, Object rhs) throws Throwable;

  boolean reverseLessThanBoolean(float lhs, Object rhs) throws Throwable;

  boolean reverseLessThanBoolean(double lhs, Object rhs) throws Throwable;

  boolean reverseLessThanBoolean(BigInteger lhs, Object rhs) throws Throwable;

  boolean reverseLessThanBoolean(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Methods callable from compiler generated code for operator <=
  //

  Object lessThanOrEquals(byte lhs, byte rhs) throws Throwable;

  Object lessThanOrEquals(byte lhs, char rhs) throws Throwable;

  Object lessThanOrEquals(byte lhs, short rhs) throws Throwable;

  Object lessThanOrEquals(byte lhs, int rhs) throws Throwable;

  Object lessThanOrEquals(byte lhs, long rhs) throws Throwable;

  Object lessThanOrEquals(byte lhs, float rhs) throws Throwable;

  Object lessThanOrEquals(byte lhs, double rhs) throws Throwable;

  Object lessThanOrEquals(byte lhs, BigInteger rhs) throws Throwable;

  Object lessThanOrEquals(byte lhs, BigDecimal rhs) throws Throwable;

  Object lessThanOrEquals(char lhs, byte rhs) throws Throwable;

  Object lessThanOrEquals(char lhs, char rhs) throws Throwable;

  Object lessThanOrEquals(char lhs, short rhs) throws Throwable;

  Object lessThanOrEquals(char lhs, int rhs) throws Throwable;

  Object lessThanOrEquals(char lhs, long rhs) throws Throwable;

  Object lessThanOrEquals(char lhs, float rhs) throws Throwable;

  Object lessThanOrEquals(char lhs, double rhs) throws Throwable;

  Object lessThanOrEquals(char lhs, BigInteger rhs) throws Throwable;

  Object lessThanOrEquals(char lhs, BigDecimal rhs) throws Throwable;

  Object lessThanOrEquals(short lhs, byte rhs) throws Throwable;

  Object lessThanOrEquals(short lhs, char rhs) throws Throwable;

  Object lessThanOrEquals(short lhs, short rhs) throws Throwable;

  Object lessThanOrEquals(short lhs, int rhs) throws Throwable;

  Object lessThanOrEquals(short lhs, long rhs) throws Throwable;

  Object lessThanOrEquals(short lhs, float rhs) throws Throwable;

  Object lessThanOrEquals(short lhs, double rhs) throws Throwable;

  Object lessThanOrEquals(short lhs, BigInteger rhs) throws Throwable;

  Object lessThanOrEquals(short lhs, BigDecimal rhs) throws Throwable;

  Object lessThanOrEquals(int lhs, byte rhs) throws Throwable;

  Object lessThanOrEquals(int lhs, char rhs) throws Throwable;

  Object lessThanOrEquals(int lhs, short rhs) throws Throwable;

  Object lessThanOrEquals(int lhs, int rhs) throws Throwable;

  Object lessThanOrEquals(int lhs, long rhs) throws Throwable;

  Object lessThanOrEquals(int lhs, float rhs) throws Throwable;

  Object lessThanOrEquals(int lhs, double rhs) throws Throwable;

  Object lessThanOrEquals(int lhs, BigInteger rhs) throws Throwable;

  Object lessThanOrEquals(int lhs, BigDecimal rhs) throws Throwable;

  Object lessThanOrEquals(long lhs, byte rhs) throws Throwable;

  Object lessThanOrEquals(long lhs, char rhs) throws Throwable;

  Object lessThanOrEquals(long lhs, short rhs) throws Throwable;

  Object lessThanOrEquals(long lhs, int rhs) throws Throwable;

  Object lessThanOrEquals(long lhs, long rhs) throws Throwable;

  Object lessThanOrEquals(long lhs, float rhs) throws Throwable;

  Object lessThanOrEquals(long lhs, double rhs) throws Throwable;

  Object lessThanOrEquals(long lhs, BigInteger rhs) throws Throwable;

  Object lessThanOrEquals(long lhs, BigDecimal rhs) throws Throwable;

  Object lessThanOrEquals(float lhs, byte rhs) throws Throwable;

  Object lessThanOrEquals(float lhs, char rhs) throws Throwable;

  Object lessThanOrEquals(float lhs, short rhs) throws Throwable;

  Object lessThanOrEquals(float lhs, int rhs) throws Throwable;

  Object lessThanOrEquals(float lhs, long rhs) throws Throwable;

  Object lessThanOrEquals(float lhs, float rhs) throws Throwable;

  Object lessThanOrEquals(float lhs, double rhs) throws Throwable;

  Object lessThanOrEquals(float lhs, BigInteger rhs) throws Throwable;

  Object lessThanOrEquals(float lhs, BigDecimal rhs) throws Throwable;

  Object lessThanOrEquals(double lhs, byte rhs) throws Throwable;

  Object lessThanOrEquals(double lhs, char rhs) throws Throwable;

  Object lessThanOrEquals(double lhs, short rhs) throws Throwable;

  Object lessThanOrEquals(double lhs, int rhs) throws Throwable;

  Object lessThanOrEquals(double lhs, long rhs) throws Throwable;

  Object lessThanOrEquals(double lhs, float rhs) throws Throwable;

  Object lessThanOrEquals(double lhs, double rhs) throws Throwable;

  Object lessThanOrEquals(double lhs, BigInteger rhs) throws Throwable;

  Object lessThanOrEquals(double lhs, BigDecimal rhs) throws Throwable;

  Object lessThanOrEquals(BigInteger lhs, byte rhs) throws Throwable;

  Object lessThanOrEquals(BigInteger lhs, char rhs) throws Throwable;

  Object lessThanOrEquals(BigInteger lhs, short rhs) throws Throwable;

  Object lessThanOrEquals(BigInteger lhs, int rhs) throws Throwable;

  Object lessThanOrEquals(BigInteger lhs, long rhs) throws Throwable;

  Object lessThanOrEquals(BigInteger lhs, float rhs) throws Throwable;

  Object lessThanOrEquals(BigInteger lhs, double rhs) throws Throwable;

  Object lessThanOrEquals(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object lessThanOrEquals(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object lessThanOrEquals(BigDecimal lhs, byte rhs) throws Throwable;

  Object lessThanOrEquals(BigDecimal lhs, char rhs) throws Throwable;

  Object lessThanOrEquals(BigDecimal lhs, short rhs) throws Throwable;

  Object lessThanOrEquals(BigDecimal lhs, int rhs) throws Throwable;

  Object lessThanOrEquals(BigDecimal lhs, long rhs) throws Throwable;

  Object lessThanOrEquals(BigDecimal lhs, float rhs) throws Throwable;

  Object lessThanOrEquals(BigDecimal lhs, double rhs) throws Throwable;

  Object lessThanOrEquals(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object lessThanOrEquals(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object lessThanOrEquals(Object lhs, byte rhs) throws Throwable;

  Object lessThanOrEquals(Object lhs, char rhs) throws Throwable;

  Object lessThanOrEquals(Object lhs, short rhs) throws Throwable;

  Object lessThanOrEquals(Object lhs, int rhs) throws Throwable;

  Object lessThanOrEquals(Object lhs, long rhs) throws Throwable;

  Object lessThanOrEquals(Object lhs, float rhs) throws Throwable;

  Object lessThanOrEquals(Object lhs, double rhs) throws Throwable;

  Object lessThanOrEquals(Object lhs, BigInteger rhs) throws Throwable;

  Object lessThanOrEquals(Object lhs, BigDecimal rhs) throws Throwable;

  Object reverseLessThanOrEquals(byte lhs, Object rhs) throws Throwable;

  Object reverseLessThanOrEquals(char lhs, Object rhs) throws Throwable;

  Object reverseLessThanOrEquals(short lhs, Object rhs) throws Throwable;

  Object reverseLessThanOrEquals(int lhs, Object rhs) throws Throwable;

  Object reverseLessThanOrEquals(long lhs, Object rhs) throws Throwable;

  Object reverseLessThanOrEquals(float lhs, Object rhs) throws Throwable;

  Object reverseLessThanOrEquals(double lhs, Object rhs) throws Throwable;

  Object reverseLessThanOrEquals(BigInteger lhs, Object rhs) throws Throwable;

  Object reverseLessThanOrEquals(BigDecimal lhs, Object rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(Object lhs, Object rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(byte lhs, byte rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(byte lhs, char rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(byte lhs, short rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(byte lhs, int rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(byte lhs, long rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(byte lhs, float rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(byte lhs, double rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(byte lhs, BigInteger rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(byte lhs, BigDecimal rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(char lhs, byte rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(char lhs, char rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(char lhs, short rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(char lhs, int rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(char lhs, long rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(char lhs, float rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(char lhs, double rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(char lhs, BigInteger rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(char lhs, BigDecimal rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(short lhs, byte rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(short lhs, char rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(short lhs, short rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(short lhs, int rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(short lhs, long rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(short lhs, float rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(short lhs, double rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(short lhs, BigInteger rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(short lhs, BigDecimal rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(int lhs, byte rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(int lhs, char rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(int lhs, short rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(int lhs, int rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(int lhs, long rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(int lhs, float rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(int lhs, double rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(int lhs, BigInteger rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(int lhs, BigDecimal rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(long lhs, byte rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(long lhs, char rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(long lhs, short rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(long lhs, int rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(long lhs, long rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(long lhs, float rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(long lhs, double rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(long lhs, BigInteger rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(long lhs, BigDecimal rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(float lhs, byte rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(float lhs, char rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(float lhs, short rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(float lhs, int rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(float lhs, long rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(float lhs, float rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(float lhs, double rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(float lhs, BigInteger rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(float lhs, BigDecimal rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(double lhs, byte rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(double lhs, char rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(double lhs, short rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(double lhs, int rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(double lhs, long rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(double lhs, float rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(double lhs, double rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(double lhs, BigInteger rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(double lhs, BigDecimal rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(BigInteger lhs, byte rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(BigInteger lhs, char rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(BigInteger lhs, short rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(BigInteger lhs, int rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(BigInteger lhs, long rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(BigInteger lhs, float rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(BigInteger lhs, double rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(BigInteger lhs, BigInteger rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(BigInteger lhs, BigDecimal rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(BigDecimal lhs, byte rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(BigDecimal lhs, char rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(BigDecimal lhs, short rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(BigDecimal lhs, int rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(BigDecimal lhs, long rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(BigDecimal lhs, float rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(BigDecimal lhs, double rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(BigDecimal lhs, BigInteger rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(Object lhs, byte rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(Object lhs, char rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(Object lhs, short rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(Object lhs, int rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(Object lhs, long rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(Object lhs, float rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(Object lhs, double rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(Object lhs, BigInteger rhs) throws Throwable;

  boolean lessThanOrEqualsBoolean(Object lhs, BigDecimal rhs) throws Throwable;

  boolean reverseLessThanOrEqualsBoolean(byte lhs, Object rhs) throws Throwable;

  boolean reverseLessThanOrEqualsBoolean(char lhs, Object rhs) throws Throwable;

  boolean reverseLessThanOrEqualsBoolean(short lhs, Object rhs) throws Throwable;

  boolean reverseLessThanOrEqualsBoolean(int lhs, Object rhs) throws Throwable;

  boolean reverseLessThanOrEqualsBoolean(long lhs, Object rhs) throws Throwable;

  boolean reverseLessThanOrEqualsBoolean(float lhs, Object rhs) throws Throwable;

  boolean reverseLessThanOrEqualsBoolean(double lhs, Object rhs) throws Throwable;

  boolean reverseLessThanOrEqualsBoolean(BigInteger lhs, Object rhs) throws Throwable;

  boolean reverseLessThanOrEqualsBoolean(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Methods callable from compiler generated code for operator >
  //

  Object greaterThan(byte lhs, byte rhs) throws Throwable;

  Object greaterThan(byte lhs, char rhs) throws Throwable;

  Object greaterThan(byte lhs, short rhs) throws Throwable;

  Object greaterThan(byte lhs, int rhs) throws Throwable;

  Object greaterThan(byte lhs, long rhs) throws Throwable;

  Object greaterThan(byte lhs, float rhs) throws Throwable;

  Object greaterThan(byte lhs, double rhs) throws Throwable;

  Object greaterThan(byte lhs, BigInteger rhs) throws Throwable;

  Object greaterThan(byte lhs, BigDecimal rhs) throws Throwable;

  Object greaterThan(char lhs, byte rhs) throws Throwable;

  Object greaterThan(char lhs, char rhs) throws Throwable;

  Object greaterThan(char lhs, short rhs) throws Throwable;

  Object greaterThan(char lhs, int rhs) throws Throwable;

  Object greaterThan(char lhs, long rhs) throws Throwable;

  Object greaterThan(char lhs, float rhs) throws Throwable;

  Object greaterThan(char lhs, double rhs) throws Throwable;

  Object greaterThan(char lhs, BigInteger rhs) throws Throwable;

  Object greaterThan(char lhs, BigDecimal rhs) throws Throwable;

  Object greaterThan(short lhs, byte rhs) throws Throwable;

  Object greaterThan(short lhs, char rhs) throws Throwable;

  Object greaterThan(short lhs, short rhs) throws Throwable;

  Object greaterThan(short lhs, int rhs) throws Throwable;

  Object greaterThan(short lhs, long rhs) throws Throwable;

  Object greaterThan(short lhs, float rhs) throws Throwable;

  Object greaterThan(short lhs, double rhs) throws Throwable;

  Object greaterThan(short lhs, BigInteger rhs) throws Throwable;

  Object greaterThan(short lhs, BigDecimal rhs) throws Throwable;

  Object greaterThan(int lhs, byte rhs) throws Throwable;

  Object greaterThan(int lhs, char rhs) throws Throwable;

  Object greaterThan(int lhs, short rhs) throws Throwable;

  Object greaterThan(int lhs, int rhs) throws Throwable;

  Object greaterThan(int lhs, long rhs) throws Throwable;

  Object greaterThan(int lhs, float rhs) throws Throwable;

  Object greaterThan(int lhs, double rhs) throws Throwable;

  Object greaterThan(int lhs, BigInteger rhs) throws Throwable;

  Object greaterThan(int lhs, BigDecimal rhs) throws Throwable;

  Object greaterThan(long lhs, byte rhs) throws Throwable;

  Object greaterThan(long lhs, char rhs) throws Throwable;

  Object greaterThan(long lhs, short rhs) throws Throwable;

  Object greaterThan(long lhs, int rhs) throws Throwable;

  Object greaterThan(long lhs, long rhs) throws Throwable;

  Object greaterThan(long lhs, float rhs) throws Throwable;

  Object greaterThan(long lhs, double rhs) throws Throwable;

  Object greaterThan(long lhs, BigInteger rhs) throws Throwable;

  Object greaterThan(long lhs, BigDecimal rhs) throws Throwable;

  Object greaterThan(float lhs, byte rhs) throws Throwable;

  Object greaterThan(float lhs, char rhs) throws Throwable;

  Object greaterThan(float lhs, short rhs) throws Throwable;

  Object greaterThan(float lhs, int rhs) throws Throwable;

  Object greaterThan(float lhs, long rhs) throws Throwable;

  Object greaterThan(float lhs, float rhs) throws Throwable;

  Object greaterThan(float lhs, double rhs) throws Throwable;

  Object greaterThan(float lhs, BigInteger rhs) throws Throwable;

  Object greaterThan(float lhs, BigDecimal rhs) throws Throwable;

  Object greaterThan(double lhs, byte rhs) throws Throwable;

  Object greaterThan(double lhs, char rhs) throws Throwable;

  Object greaterThan(double lhs, short rhs) throws Throwable;

  Object greaterThan(double lhs, int rhs) throws Throwable;

  Object greaterThan(double lhs, long rhs) throws Throwable;

  Object greaterThan(double lhs, float rhs) throws Throwable;

  Object greaterThan(double lhs, double rhs) throws Throwable;

  Object greaterThan(double lhs, BigInteger rhs) throws Throwable;

  Object greaterThan(double lhs, BigDecimal rhs) throws Throwable;

  Object greaterThan(BigInteger lhs, byte rhs) throws Throwable;

  Object greaterThan(BigInteger lhs, char rhs) throws Throwable;

  Object greaterThan(BigInteger lhs, short rhs) throws Throwable;

  Object greaterThan(BigInteger lhs, int rhs) throws Throwable;

  Object greaterThan(BigInteger lhs, long rhs) throws Throwable;

  Object greaterThan(BigInteger lhs, float rhs) throws Throwable;

  Object greaterThan(BigInteger lhs, double rhs) throws Throwable;

  Object greaterThan(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object greaterThan(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object greaterThan(BigDecimal lhs, byte rhs) throws Throwable;

  Object greaterThan(BigDecimal lhs, char rhs) throws Throwable;

  Object greaterThan(BigDecimal lhs, short rhs) throws Throwable;

  Object greaterThan(BigDecimal lhs, int rhs) throws Throwable;

  Object greaterThan(BigDecimal lhs, long rhs) throws Throwable;

  Object greaterThan(BigDecimal lhs, float rhs) throws Throwable;

  Object greaterThan(BigDecimal lhs, double rhs) throws Throwable;

  Object greaterThan(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object greaterThan(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object greaterThan(Object lhs, byte rhs) throws Throwable;

  Object greaterThan(Object lhs, char rhs) throws Throwable;

  Object greaterThan(Object lhs, short rhs) throws Throwable;

  Object greaterThan(Object lhs, int rhs) throws Throwable;

  Object greaterThan(Object lhs, long rhs) throws Throwable;

  Object greaterThan(Object lhs, float rhs) throws Throwable;

  Object greaterThan(Object lhs, double rhs) throws Throwable;

  Object greaterThan(Object lhs, BigInteger rhs) throws Throwable;

  Object greaterThan(Object lhs, BigDecimal rhs) throws Throwable;

  Object reverseGreaterThan(byte lhs, Object rhs) throws Throwable;

  Object reverseGreaterThan(char lhs, Object rhs) throws Throwable;

  Object reverseGreaterThan(short lhs, Object rhs) throws Throwable;

  Object reverseGreaterThan(int lhs, Object rhs) throws Throwable;

  Object reverseGreaterThan(long lhs, Object rhs) throws Throwable;

  Object reverseGreaterThan(float lhs, Object rhs) throws Throwable;

  Object reverseGreaterThan(double lhs, Object rhs) throws Throwable;

  Object reverseGreaterThan(BigInteger lhs, Object rhs) throws Throwable;

  Object reverseGreaterThan(BigDecimal lhs, Object rhs) throws Throwable;

  boolean greaterThanBoolean(Object lhs, Object rhs) throws Throwable;

  boolean greaterThanBoolean(byte lhs, byte rhs) throws Throwable;

  boolean greaterThanBoolean(byte lhs, char rhs) throws Throwable;

  boolean greaterThanBoolean(byte lhs, short rhs) throws Throwable;

  boolean greaterThanBoolean(byte lhs, int rhs) throws Throwable;

  boolean greaterThanBoolean(byte lhs, long rhs) throws Throwable;

  boolean greaterThanBoolean(byte lhs, float rhs) throws Throwable;

  boolean greaterThanBoolean(byte lhs, double rhs) throws Throwable;

  boolean greaterThanBoolean(byte lhs, BigInteger rhs) throws Throwable;

  boolean greaterThanBoolean(byte lhs, BigDecimal rhs) throws Throwable;

  boolean greaterThanBoolean(char lhs, byte rhs) throws Throwable;

  boolean greaterThanBoolean(char lhs, char rhs) throws Throwable;

  boolean greaterThanBoolean(char lhs, short rhs) throws Throwable;

  boolean greaterThanBoolean(char lhs, int rhs) throws Throwable;

  boolean greaterThanBoolean(char lhs, long rhs) throws Throwable;

  boolean greaterThanBoolean(char lhs, float rhs) throws Throwable;

  boolean greaterThanBoolean(char lhs, double rhs) throws Throwable;

  boolean greaterThanBoolean(char lhs, BigInteger rhs) throws Throwable;

  boolean greaterThanBoolean(char lhs, BigDecimal rhs) throws Throwable;

  boolean greaterThanBoolean(short lhs, byte rhs) throws Throwable;

  boolean greaterThanBoolean(short lhs, char rhs) throws Throwable;

  boolean greaterThanBoolean(short lhs, short rhs) throws Throwable;

  boolean greaterThanBoolean(short lhs, int rhs) throws Throwable;

  boolean greaterThanBoolean(short lhs, long rhs) throws Throwable;

  boolean greaterThanBoolean(short lhs, float rhs) throws Throwable;

  boolean greaterThanBoolean(short lhs, double rhs) throws Throwable;

  boolean greaterThanBoolean(short lhs, BigInteger rhs) throws Throwable;

  boolean greaterThanBoolean(short lhs, BigDecimal rhs) throws Throwable;

  boolean greaterThanBoolean(int lhs, byte rhs) throws Throwable;

  boolean greaterThanBoolean(int lhs, char rhs) throws Throwable;

  boolean greaterThanBoolean(int lhs, short rhs) throws Throwable;

  boolean greaterThanBoolean(int lhs, int rhs) throws Throwable;

  boolean greaterThanBoolean(int lhs, long rhs) throws Throwable;

  boolean greaterThanBoolean(int lhs, float rhs) throws Throwable;

  boolean greaterThanBoolean(int lhs, double rhs) throws Throwable;

  boolean greaterThanBoolean(int lhs, BigInteger rhs) throws Throwable;

  boolean greaterThanBoolean(int lhs, BigDecimal rhs) throws Throwable;

  boolean greaterThanBoolean(long lhs, byte rhs) throws Throwable;

  boolean greaterThanBoolean(long lhs, char rhs) throws Throwable;

  boolean greaterThanBoolean(long lhs, short rhs) throws Throwable;

  boolean greaterThanBoolean(long lhs, int rhs) throws Throwable;

  boolean greaterThanBoolean(long lhs, long rhs) throws Throwable;

  boolean greaterThanBoolean(long lhs, float rhs) throws Throwable;

  boolean greaterThanBoolean(long lhs, double rhs) throws Throwable;

  boolean greaterThanBoolean(long lhs, BigInteger rhs) throws Throwable;

  boolean greaterThanBoolean(long lhs, BigDecimal rhs) throws Throwable;

  boolean greaterThanBoolean(float lhs, byte rhs) throws Throwable;

  boolean greaterThanBoolean(float lhs, char rhs) throws Throwable;

  boolean greaterThanBoolean(float lhs, short rhs) throws Throwable;

  boolean greaterThanBoolean(float lhs, int rhs) throws Throwable;

  boolean greaterThanBoolean(float lhs, long rhs) throws Throwable;

  boolean greaterThanBoolean(float lhs, float rhs) throws Throwable;

  boolean greaterThanBoolean(float lhs, double rhs) throws Throwable;

  boolean greaterThanBoolean(float lhs, BigInteger rhs) throws Throwable;

  boolean greaterThanBoolean(float lhs, BigDecimal rhs) throws Throwable;

  boolean greaterThanBoolean(double lhs, byte rhs) throws Throwable;

  boolean greaterThanBoolean(double lhs, char rhs) throws Throwable;

  boolean greaterThanBoolean(double lhs, short rhs) throws Throwable;

  boolean greaterThanBoolean(double lhs, int rhs) throws Throwable;

  boolean greaterThanBoolean(double lhs, long rhs) throws Throwable;

  boolean greaterThanBoolean(double lhs, float rhs) throws Throwable;

  boolean greaterThanBoolean(double lhs, double rhs) throws Throwable;

  boolean greaterThanBoolean(double lhs, BigInteger rhs) throws Throwable;

  boolean greaterThanBoolean(double lhs, BigDecimal rhs) throws Throwable;

  boolean greaterThanBoolean(BigInteger lhs, byte rhs) throws Throwable;

  boolean greaterThanBoolean(BigInteger lhs, char rhs) throws Throwable;

  boolean greaterThanBoolean(BigInteger lhs, short rhs) throws Throwable;

  boolean greaterThanBoolean(BigInteger lhs, int rhs) throws Throwable;

  boolean greaterThanBoolean(BigInteger lhs, long rhs) throws Throwable;

  boolean greaterThanBoolean(BigInteger lhs, float rhs) throws Throwable;

  boolean greaterThanBoolean(BigInteger lhs, double rhs) throws Throwable;

  boolean greaterThanBoolean(BigInteger lhs, BigInteger rhs) throws Throwable;

  boolean greaterThanBoolean(BigInteger lhs, BigDecimal rhs) throws Throwable;

  boolean greaterThanBoolean(BigDecimal lhs, byte rhs) throws Throwable;

  boolean greaterThanBoolean(BigDecimal lhs, char rhs) throws Throwable;

  boolean greaterThanBoolean(BigDecimal lhs, short rhs) throws Throwable;

  boolean greaterThanBoolean(BigDecimal lhs, int rhs) throws Throwable;

  boolean greaterThanBoolean(BigDecimal lhs, long rhs) throws Throwable;

  boolean greaterThanBoolean(BigDecimal lhs, float rhs) throws Throwable;

  boolean greaterThanBoolean(BigDecimal lhs, double rhs) throws Throwable;

  boolean greaterThanBoolean(BigDecimal lhs, BigInteger rhs) throws Throwable;

  boolean greaterThanBoolean(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  boolean greaterThanBoolean(Object lhs, byte rhs) throws Throwable;

  boolean greaterThanBoolean(Object lhs, char rhs) throws Throwable;

  boolean greaterThanBoolean(Object lhs, short rhs) throws Throwable;

  boolean greaterThanBoolean(Object lhs, int rhs) throws Throwable;

  boolean greaterThanBoolean(Object lhs, long rhs) throws Throwable;

  boolean greaterThanBoolean(Object lhs, float rhs) throws Throwable;

  boolean greaterThanBoolean(Object lhs, double rhs) throws Throwable;

  boolean greaterThanBoolean(Object lhs, BigInteger rhs) throws Throwable;

  boolean greaterThanBoolean(Object lhs, BigDecimal rhs) throws Throwable;

  boolean reverseGreaterThanBoolean(byte lhs, Object rhs) throws Throwable;

  boolean reverseGreaterThanBoolean(char lhs, Object rhs) throws Throwable;

  boolean reverseGreaterThanBoolean(short lhs, Object rhs) throws Throwable;

  boolean reverseGreaterThanBoolean(int lhs, Object rhs) throws Throwable;

  boolean reverseGreaterThanBoolean(long lhs, Object rhs) throws Throwable;

  boolean reverseGreaterThanBoolean(float lhs, Object rhs) throws Throwable;

  boolean reverseGreaterThanBoolean(double lhs, Object rhs) throws Throwable;

  boolean reverseGreaterThanBoolean(BigInteger lhs, Object rhs) throws Throwable;

  boolean reverseGreaterThanBoolean(BigDecimal lhs, Object rhs) throws Throwable;

  //
  //   Methods callable from compiler generated code for operator >=
  //

  Object greaterThanOrEquals(byte lhs, byte rhs) throws Throwable;

  Object greaterThanOrEquals(byte lhs, char rhs) throws Throwable;

  Object greaterThanOrEquals(byte lhs, short rhs) throws Throwable;

  Object greaterThanOrEquals(byte lhs, int rhs) throws Throwable;

  Object greaterThanOrEquals(byte lhs, long rhs) throws Throwable;

  Object greaterThanOrEquals(byte lhs, float rhs) throws Throwable;

  Object greaterThanOrEquals(byte lhs, double rhs) throws Throwable;

  Object greaterThanOrEquals(byte lhs, BigInteger rhs) throws Throwable;

  Object greaterThanOrEquals(byte lhs, BigDecimal rhs) throws Throwable;

  Object greaterThanOrEquals(char lhs, byte rhs) throws Throwable;

  Object greaterThanOrEquals(char lhs, char rhs) throws Throwable;

  Object greaterThanOrEquals(char lhs, short rhs) throws Throwable;

  Object greaterThanOrEquals(char lhs, int rhs) throws Throwable;

  Object greaterThanOrEquals(char lhs, long rhs) throws Throwable;

  Object greaterThanOrEquals(char lhs, float rhs) throws Throwable;

  Object greaterThanOrEquals(char lhs, double rhs) throws Throwable;

  Object greaterThanOrEquals(char lhs, BigInteger rhs) throws Throwable;

  Object greaterThanOrEquals(char lhs, BigDecimal rhs) throws Throwable;

  Object greaterThanOrEquals(short lhs, byte rhs) throws Throwable;

  Object greaterThanOrEquals(short lhs, char rhs) throws Throwable;

  Object greaterThanOrEquals(short lhs, short rhs) throws Throwable;

  Object greaterThanOrEquals(short lhs, int rhs) throws Throwable;

  Object greaterThanOrEquals(short lhs, long rhs) throws Throwable;

  Object greaterThanOrEquals(short lhs, float rhs) throws Throwable;

  Object greaterThanOrEquals(short lhs, double rhs) throws Throwable;

  Object greaterThanOrEquals(short lhs, BigInteger rhs) throws Throwable;

  Object greaterThanOrEquals(short lhs, BigDecimal rhs) throws Throwable;

  Object greaterThanOrEquals(int lhs, byte rhs) throws Throwable;

  Object greaterThanOrEquals(int lhs, char rhs) throws Throwable;

  Object greaterThanOrEquals(int lhs, short rhs) throws Throwable;

  Object greaterThanOrEquals(int lhs, int rhs) throws Throwable;

  Object greaterThanOrEquals(int lhs, long rhs) throws Throwable;

  Object greaterThanOrEquals(int lhs, float rhs) throws Throwable;

  Object greaterThanOrEquals(int lhs, double rhs) throws Throwable;

  Object greaterThanOrEquals(int lhs, BigInteger rhs) throws Throwable;

  Object greaterThanOrEquals(int lhs, BigDecimal rhs) throws Throwable;

  Object greaterThanOrEquals(long lhs, byte rhs) throws Throwable;

  Object greaterThanOrEquals(long lhs, char rhs) throws Throwable;

  Object greaterThanOrEquals(long lhs, short rhs) throws Throwable;

  Object greaterThanOrEquals(long lhs, int rhs) throws Throwable;

  Object greaterThanOrEquals(long lhs, long rhs) throws Throwable;

  Object greaterThanOrEquals(long lhs, float rhs) throws Throwable;

  Object greaterThanOrEquals(long lhs, double rhs) throws Throwable;

  Object greaterThanOrEquals(long lhs, BigInteger rhs) throws Throwable;

  Object greaterThanOrEquals(long lhs, BigDecimal rhs) throws Throwable;

  Object greaterThanOrEquals(float lhs, byte rhs) throws Throwable;

  Object greaterThanOrEquals(float lhs, char rhs) throws Throwable;

  Object greaterThanOrEquals(float lhs, short rhs) throws Throwable;

  Object greaterThanOrEquals(float lhs, int rhs) throws Throwable;

  Object greaterThanOrEquals(float lhs, long rhs) throws Throwable;

  Object greaterThanOrEquals(float lhs, float rhs) throws Throwable;

  Object greaterThanOrEquals(float lhs, double rhs) throws Throwable;

  Object greaterThanOrEquals(float lhs, BigInteger rhs) throws Throwable;

  Object greaterThanOrEquals(float lhs, BigDecimal rhs) throws Throwable;

  Object greaterThanOrEquals(double lhs, byte rhs) throws Throwable;

  Object greaterThanOrEquals(double lhs, char rhs) throws Throwable;

  Object greaterThanOrEquals(double lhs, short rhs) throws Throwable;

  Object greaterThanOrEquals(double lhs, int rhs) throws Throwable;

  Object greaterThanOrEquals(double lhs, long rhs) throws Throwable;

  Object greaterThanOrEquals(double lhs, float rhs) throws Throwable;

  Object greaterThanOrEquals(double lhs, double rhs) throws Throwable;

  Object greaterThanOrEquals(double lhs, BigInteger rhs) throws Throwable;

  Object greaterThanOrEquals(double lhs, BigDecimal rhs) throws Throwable;

  Object greaterThanOrEquals(BigInteger lhs, byte rhs) throws Throwable;

  Object greaterThanOrEquals(BigInteger lhs, char rhs) throws Throwable;

  Object greaterThanOrEquals(BigInteger lhs, short rhs) throws Throwable;

  Object greaterThanOrEquals(BigInteger lhs, int rhs) throws Throwable;

  Object greaterThanOrEquals(BigInteger lhs, long rhs) throws Throwable;

  Object greaterThanOrEquals(BigInteger lhs, float rhs) throws Throwable;

  Object greaterThanOrEquals(BigInteger lhs, double rhs) throws Throwable;

  Object greaterThanOrEquals(BigInteger lhs, BigInteger rhs) throws Throwable;

  Object greaterThanOrEquals(BigInteger lhs, BigDecimal rhs) throws Throwable;

  Object greaterThanOrEquals(BigDecimal lhs, byte rhs) throws Throwable;

  Object greaterThanOrEquals(BigDecimal lhs, char rhs) throws Throwable;

  Object greaterThanOrEquals(BigDecimal lhs, short rhs) throws Throwable;

  Object greaterThanOrEquals(BigDecimal lhs, int rhs) throws Throwable;

  Object greaterThanOrEquals(BigDecimal lhs, long rhs) throws Throwable;

  Object greaterThanOrEquals(BigDecimal lhs, float rhs) throws Throwable;

  Object greaterThanOrEquals(BigDecimal lhs, double rhs) throws Throwable;

  Object greaterThanOrEquals(BigDecimal lhs, BigInteger rhs) throws Throwable;

  Object greaterThanOrEquals(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  Object greaterThanOrEquals(Object lhs, byte rhs) throws Throwable;

  Object greaterThanOrEquals(Object lhs, char rhs) throws Throwable;

  Object greaterThanOrEquals(Object lhs, short rhs) throws Throwable;

  Object greaterThanOrEquals(Object lhs, int rhs) throws Throwable;

  Object greaterThanOrEquals(Object lhs, long rhs) throws Throwable;

  Object greaterThanOrEquals(Object lhs, float rhs) throws Throwable;

  Object greaterThanOrEquals(Object lhs, double rhs) throws Throwable;

  Object greaterThanOrEquals(Object lhs, BigInteger rhs) throws Throwable;

  Object greaterThanOrEquals(Object lhs, BigDecimal rhs) throws Throwable;

  Object reverseGreaterThanOrEquals(byte lhs, Object rhs) throws Throwable;

  Object reverseGreaterThanOrEquals(char lhs, Object rhs) throws Throwable;

  Object reverseGreaterThanOrEquals(short lhs, Object rhs) throws Throwable;

  Object reverseGreaterThanOrEquals(int lhs, Object rhs) throws Throwable;

  Object reverseGreaterThanOrEquals(long lhs, Object rhs) throws Throwable;

  Object reverseGreaterThanOrEquals(float lhs, Object rhs) throws Throwable;

  Object reverseGreaterThanOrEquals(double lhs, Object rhs) throws Throwable;

  Object reverseGreaterThanOrEquals(BigInteger lhs, Object rhs) throws Throwable;

  Object reverseGreaterThanOrEquals(BigDecimal lhs, Object rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(Object lhs, Object rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(byte lhs, byte rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(byte lhs, char rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(byte lhs, short rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(byte lhs, int rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(byte lhs, long rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(byte lhs, float rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(byte lhs, double rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(byte lhs, BigInteger rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(byte lhs, BigDecimal rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(char lhs, byte rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(char lhs, char rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(char lhs, short rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(char lhs, int rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(char lhs, long rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(char lhs, float rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(char lhs, double rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(char lhs, BigInteger rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(char lhs, BigDecimal rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(short lhs, byte rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(short lhs, char rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(short lhs, short rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(short lhs, int rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(short lhs, long rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(short lhs, float rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(short lhs, double rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(short lhs, BigInteger rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(short lhs, BigDecimal rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(int lhs, byte rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(int lhs, char rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(int lhs, short rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(int lhs, int rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(int lhs, long rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(int lhs, float rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(int lhs, double rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(int lhs, BigInteger rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(int lhs, BigDecimal rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(long lhs, byte rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(long lhs, char rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(long lhs, short rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(long lhs, int rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(long lhs, long rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(long lhs, float rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(long lhs, double rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(long lhs, BigInteger rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(long lhs, BigDecimal rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(float lhs, byte rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(float lhs, char rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(float lhs, short rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(float lhs, int rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(float lhs, long rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(float lhs, float rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(float lhs, double rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(float lhs, BigInteger rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(float lhs, BigDecimal rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(double lhs, byte rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(double lhs, char rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(double lhs, short rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(double lhs, int rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(double lhs, long rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(double lhs, float rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(double lhs, double rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(double lhs, BigInteger rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(double lhs, BigDecimal rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(BigInteger lhs, byte rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(BigInteger lhs, char rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(BigInteger lhs, short rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(BigInteger lhs, int rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(BigInteger lhs, long rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(BigInteger lhs, float rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(BigInteger lhs, double rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(BigInteger lhs, BigInteger rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(BigInteger lhs, BigDecimal rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(BigDecimal lhs, byte rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(BigDecimal lhs, char rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(BigDecimal lhs, short rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(BigDecimal lhs, int rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(BigDecimal lhs, long rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(BigDecimal lhs, float rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(BigDecimal lhs, double rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(BigDecimal lhs, BigInteger rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(BigDecimal lhs, BigDecimal rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(Object lhs, byte rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(Object lhs, char rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(Object lhs, short rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(Object lhs, int rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(Object lhs, long rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(Object lhs, float rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(Object lhs, double rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(Object lhs, BigInteger rhs) throws Throwable;

  boolean greaterThanOrEqualsBoolean(Object lhs, BigDecimal rhs) throws Throwable;

  boolean reverseGreaterThanOrEqualsBoolean(byte lhs, Object rhs) throws Throwable;

  boolean reverseGreaterThanOrEqualsBoolean(char lhs, Object rhs) throws Throwable;

  boolean reverseGreaterThanOrEqualsBoolean(short lhs, Object rhs) throws Throwable;

  boolean reverseGreaterThanOrEqualsBoolean(int lhs, Object rhs) throws Throwable;

  boolean reverseGreaterThanOrEqualsBoolean(long lhs, Object rhs) throws Throwable;

  boolean reverseGreaterThanOrEqualsBoolean(float lhs, Object rhs) throws Throwable;

  boolean reverseGreaterThanOrEqualsBoolean(double lhs, Object rhs) throws Throwable;

  boolean reverseGreaterThanOrEqualsBoolean(BigInteger lhs, Object rhs) throws Throwable;

  boolean reverseGreaterThanOrEqualsBoolean(BigDecimal lhs, Object rhs) throws Throwable;
}
