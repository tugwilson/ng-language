/*
 * Created on Feb 24, 2007
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
package ng.lang;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import ng.runtime.MetaClassRegistry;
import ng.runtime.NgBoolean;
import ng.runtime.NgByte;
import ng.runtime.NgChar;
import ng.runtime.NgDouble;
import ng.runtime.NgFloat;
import ng.runtime.NgInt;
import ng.runtime.NgLong;
import ng.runtime.NgShort;

import junit.framework.TestCase;

public class LogicalTest extends TestCase {
  final MetaClassRegistry registry = NgSystem.metaClassRegistry;
  
  Object minusOneByte = new NgByte((byte) -1);
  Object zeroByte = new NgByte((byte) 0);
  Object oneByte = new NgByte((byte) 1);
  Object twoByte = new NgByte((byte) 2);
  
  Object zeroChar = new NgChar((char) 0);
  Object oneChar = new NgChar((char) 1);
  Object twoChar = new NgChar((char) 2);
  
  Object minusOneShort = new NgShort((byte) -1);
  Object zeroShort = new NgShort((byte) 0);
  Object oneShort = new NgShort((byte) 1);
  Object twoShort = new NgShort((byte) 2);
  
  Object minusOneInt = new NgInt(-1);
  Object zeroInt = new NgInt(0);
  Object oneInt = new NgInt(1);
  Object twoInt = new NgInt(2);
  
  Object minusOneLong = new NgLong(-1);
  Object zeroLong = new NgLong(0);
  Object oneLong = new NgLong(1);
  Object twoLong = new NgLong(2);
  
  Object minusOneFloat = new NgFloat(-1);
  Object zeroFloat = new NgFloat(0);
  Object oneFloat = new NgFloat(1);
  Object twoFloat = new NgFloat(2);
  
  Object minusOneDouble = new NgDouble(-1);
  Object zeroDouble = new NgDouble(0);
  Object oneDouble = new NgDouble(1);
  Object twoDouble = new NgDouble(2);
  
  BigInteger minusOneBigInt = BigInteger.valueOf(-1);
  BigInteger zeroBigInt = BigInteger.ZERO;
  BigInteger oneBigInt = BigInteger.ONE;
  BigInteger twoBigInt = BigInteger.valueOf(2);
  
  BigDecimal minusOneBigDecimal = BigDecimal.valueOf(-1);
  BigDecimal zeroBigDecimal = BigDecimal.valueOf(0);
  BigDecimal oneBigDecimal = BigDecimal.valueOf(1);
  BigDecimal twoBigDecimal = BigDecimal.valueOf(2);
  
  Object[] ones = new Object[] {oneByte, oneChar, oneShort, oneInt, oneLong, oneFloat, oneDouble, oneBigInt, oneBigDecimal};
  Object[] twos = new Object[] {twoByte, twoChar, twoShort, twoInt, twoLong, twoFloat, twoDouble, twoBigInt, twoBigDecimal};
  
  Object[] integralOnes = new Object[] {oneByte, oneChar, oneShort, oneInt, oneLong, oneBigInt};
  Object[] integralTwos = new Object[] {twoByte, twoChar, twoShort, twoInt, twoLong, twoBigInt};
  
  Object[] logicalShiftIntegralOnes = new Object[] {oneByte, oneChar, oneShort, oneInt, oneLong};
  Object[] logicalShiftIntegralTwos = new Object[] {twoByte, twoChar, twoShort, twoInt, twoLong};
  
  Map<Class, Class> allIntsType = new HashMap<Class, Class>();
  {
    allIntsType.put(byte.class, int.class);
    allIntsType.put(char.class, int.class);
    allIntsType.put(short.class, int.class);
    allIntsType.put(int.class, int.class);
    allIntsType.put(long.class, int.class);
    allIntsType.put(BigInteger.class, int.class);
  }
  
  Map<Class, Class> integralType = new HashMap<Class, Class>();
  {
    integralType.put(byte.class, int.class);
    integralType.put(char.class, int.class);
    integralType.put(short.class, int.class);
    integralType.put(int.class, int.class);
    integralType.put(long.class, long.class);
    integralType.put(float.class, float.class);
    integralType.put(double.class, double.class);
    integralType.put(BigInteger.class, BigInteger.class);
    integralType.put(BigDecimal.class, BigDecimal.class);
  }
  
  Map<Class, Class> allLongsType = new HashMap<Class, Class>();
  {
    allLongsType.put(byte.class, long.class);
    allLongsType.put(char.class, long.class);
    allLongsType.put(short.class, long.class);
    allLongsType.put(int.class, long.class);
    allLongsType.put(long.class, long.class);
    allLongsType.put(BigInteger.class, long.class);
  }
  
  Map<Class, Class> longType = new HashMap<Class, Class>();
  {
    longType.put(byte.class, long.class);
    longType.put(char.class, long.class);
    longType.put(short.class, long.class);
    longType.put(int.class, long.class);
    longType.put(long.class, long.class);
    longType.put(float.class, float.class);
    longType.put(double.class, double.class);
    longType.put(BigInteger.class, BigInteger.class);
    longType.put(BigDecimal.class, BigDecimal.class);
  }
  
  Map<Class, Class> floatType = new HashMap<Class, Class>();
  {
    floatType.put(byte.class, float.class);
    floatType.put(char.class, float.class);
    floatType.put(short.class, float.class);
    floatType.put(int.class, float.class);
    floatType.put(long.class, float.class);
    floatType.put(float.class, float.class);
    floatType.put(double.class, double.class);
    floatType.put(BigInteger.class, float.class);
    floatType.put(BigDecimal.class, BigDecimal.class);
  }
  
  Map<Class, Class> doubleType = new HashMap<Class, Class>();
  {
    doubleType.put(byte.class, double.class);
    doubleType.put(char.class, double.class);
    doubleType.put(short.class, double.class);
    doubleType.put(int.class, double.class);
    doubleType.put(long.class, double.class);
    doubleType.put(float.class, double.class);
    doubleType.put(double.class, double.class);
    doubleType.put(BigInteger.class, double.class);
    doubleType.put(BigDecimal.class, BigDecimal.class);
  }
  
  Map<Class, Class> bigIntegerType = new HashMap<Class, Class>();
  {
    bigIntegerType.put(byte.class, BigInteger.class);
    bigIntegerType.put(char.class, BigInteger.class);
    bigIntegerType.put(short.class, BigInteger.class);
    bigIntegerType.put(int.class, BigInteger.class);
    bigIntegerType.put(long.class, BigInteger.class);
    bigIntegerType.put(float.class, float.class);
    bigIntegerType.put(double.class, double.class);
    bigIntegerType.put(BigInteger.class, BigInteger.class);
    bigIntegerType.put(BigDecimal.class, BigDecimal.class);
  }
  
  Map<Class, Class> bigDecimalType = new HashMap<Class, Class>();
  {
    bigDecimalType.put(byte.class, BigDecimal.class);
    bigDecimalType.put(char.class, BigDecimal.class);
    bigDecimalType.put(short.class, BigDecimal.class);
    bigDecimalType.put(int.class, BigDecimal.class);
    bigDecimalType.put(long.class, BigDecimal.class);
    bigDecimalType.put(float.class, BigDecimal.class);
    bigDecimalType.put(double.class, BigDecimal.class);
    bigDecimalType.put(BigInteger.class, BigDecimal.class);
    bigDecimalType.put(BigDecimal.class, BigDecimal.class);
  }

  Map<Class, Map<Class, Class>> typeConverter = new HashMap<Class, Map<Class, Class>>();
  {
    typeConverter.put(byte.class, integralType);
    typeConverter.put(char.class, integralType);
    typeConverter.put(short.class, integralType);
    typeConverter.put(int.class, integralType);
    typeConverter.put(long.class, longType);
    typeConverter.put(float.class, floatType);
    typeConverter.put(double.class, doubleType);
    typeConverter.put(BigInteger.class, bigIntegerType);
    typeConverter.put(BigDecimal.class, bigDecimalType);
  }

  Map<Class, Map<Class, Class>> shiftTypeConverter = new HashMap<Class, Map<Class, Class>>();
  {
    shiftTypeConverter.put(byte.class, allIntsType);
    shiftTypeConverter.put(char.class, allIntsType);
    shiftTypeConverter.put(short.class, allIntsType);
    shiftTypeConverter.put(int.class, allIntsType);
    shiftTypeConverter.put(long.class, allLongsType);
    shiftTypeConverter.put(BigInteger.class, bigIntegerType);
  }
  
  public void testNot() {
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(boolean.class).not(true)).getBooleanValue(), false);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(boolean.class).not(false)).getBooleanValue(), true);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(NgBoolean.TRUE).not(NgBoolean.TRUE)).getBooleanValue(), false);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(NgBoolean.FALSE).not(NgBoolean.FALSE)).getBooleanValue(), true);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(NgBoolean.TRUE).not((Object)NgBoolean.TRUE)).getBooleanValue(), false);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(NgBoolean.FALSE).not((Object)NgBoolean.FALSE)).getBooleanValue(), true);
    try {
      registry.getRuntimeMetaClass(Object.class).not(true);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).not(NgBoolean.TRUE);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testAnd() {
  Object o;
  
    o = registry.getRuntimeMetaClass(byte.class).and((byte)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).and((char)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).and((short)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).and((int)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).and((long)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).and((byte)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).and((char)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).and((short)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).and((int)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).and((long)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).and((byte)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).and((char)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).and((short)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).and((int)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).and((long)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).and((byte)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).and((char)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).and((short)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).and((int)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).and((long)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).and((byte)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).and((char)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).and((short)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).and((int)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).and((long)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).and((byte)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).and((char)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).and((short)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).and((int)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).and((long)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigInteger.class).and((BigInteger)oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).and((BigInteger)oneBigInt, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).and((BigInteger)oneBigInt, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).and((BigInteger)oneBigInt, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).and((BigInteger)oneBigInt, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).and((BigInteger)oneBigInt, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      registry.getRuntimeMetaClass(Object.class).and((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((BigInteger)oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((BigDecimal)oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((BigInteger)oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((BigDecimal)oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((BigInteger)oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((BigDecimal)oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).and((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).and((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).and((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((BigInteger)oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((BigDecimal)oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((BigInteger)oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((BigDecimal)oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((byte) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((char) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((short) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((int) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((long) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and((BigInteger) oneBigInt, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).and((BigInteger) oneBigInt, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).and((BigDecimal) oneBigDecimal, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).and((BigDecimal) oneBigDecimal, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 

    for (int i = 0; i != integralOnes.length; i++) {
      
      o = registry.getRuntimeMetaClass(integralOnes[i]).and(integralOnes[i], (byte)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(byte.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).and(integralOnes[i], (char)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(char.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).and(integralOnes[i], (short)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(short.class),  registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).and(integralOnes[i], (int)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(int.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).and(integralOnes[i], (long)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(long.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).and(integralOnes[i], (BigInteger)oneBigInt);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(BigInteger.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseAnd((byte)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(byte.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseAnd((char)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(char.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseAnd((short)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(short.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseAnd((int)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(int.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseAnd((long)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(long.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseAnd((BigInteger)oneBigInt, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(BigInteger.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != integralTwos.length; j++) {
        o = registry.getRuntimeMetaClass(integralOnes[i]).and(integralOnes[i], integralOnes[j]);   
        assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
        assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(registry.getRuntimeMetaClass(integralOnes[j]).getTheClass(o)),  registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      registry.getRuntimeMetaClass(Object.class).and(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and(new Object(), (BigInteger)oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).and(new Object(), (BigDecimal)oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      registry.getRuntimeMetaClass(Object.class).reverseAnd((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseAnd((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseAnd((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseAnd((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseAnd((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseAnd((BigInteger)oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testAndEquals() {
  Object o;
  
    o = registry.getRuntimeMetaClass(byte.class).andEquals((byte)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).andEquals((char)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).andEquals((short)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).andEquals((int)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).andEquals((long)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).andEquals((byte)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).andEquals((char)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).andEquals((short)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).andEquals((int)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).andEquals((long)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).andEquals((byte)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).andEquals((char)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).andEquals((short)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).andEquals((int)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).andEquals((long)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).andEquals((byte)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).andEquals((char)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).andEquals((short)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).andEquals((int)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).andEquals((long)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).andEquals((byte)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).andEquals((char)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).andEquals((short)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).andEquals((int)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).andEquals((long)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).andEquals((byte)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).andEquals((char)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).andEquals((short)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).andEquals((int)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).andEquals((long)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigInteger.class).andEquals((BigInteger)oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).andEquals((BigInteger)oneBigInt, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).andEquals((BigInteger)oneBigInt, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).andEquals((BigInteger)oneBigInt, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).andEquals((BigInteger)oneBigInt, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).andEquals((BigInteger)oneBigInt, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((BigInteger)oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((BigDecimal)oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((BigInteger)oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((BigDecimal)oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((BigInteger)oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((BigDecimal)oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((BigInteger)oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((BigDecimal)oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((BigInteger)oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((BigDecimal)oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((byte) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((char) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((short) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((int) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((long) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((BigInteger) oneBigInt, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((BigInteger) oneBigInt, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((BigDecimal) oneBigDecimal, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals((BigDecimal) oneBigDecimal, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 

    for (int i = 0; i != integralOnes.length; i++) {
      
      o = registry.getRuntimeMetaClass(integralOnes[i]).andEquals(integralOnes[i], (byte)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(byte.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).andEquals(integralOnes[i], (char)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(char.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).andEquals(integralOnes[i], (short)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(short.class),  registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).andEquals(integralOnes[i], (int)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(int.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).andEquals(integralOnes[i], (long)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(long.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).andEquals(integralOnes[i], (BigInteger)oneBigInt);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(BigInteger.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseAndEquals((byte)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(byte.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseAndEquals((char)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(char.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseAndEquals((short)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(short.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseAndEquals((int)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(int.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseAndEquals((long)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(long.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseAndEquals((BigInteger)oneBigInt, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(BigInteger.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != integralTwos.length; j++) {
        o = registry.getRuntimeMetaClass(integralOnes[i]).andEquals(integralOnes[i], integralOnes[j]);   
        assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
        assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(registry.getRuntimeMetaClass(integralOnes[j]).getTheClass(o)),  registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals(new Object(), (BigInteger)oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).andEquals(new Object(), (BigDecimal)oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      registry.getRuntimeMetaClass(Object.class).reverseAndEquals((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseAndEquals((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseAndEquals((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseAndEquals((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseAndEquals((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseAndEquals((BigInteger)oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testOr() {
  Object o;
  
    o = registry.getRuntimeMetaClass(byte.class).or((byte)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).or((char)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).or((short)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).or((int)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).or((long)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).or((byte)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).or((char)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).or((short)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).or((int)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).or((long)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).or((byte)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).or((char)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).or((short)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).or((int)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).or((long)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).or((byte)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).or((char)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).or((short)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).or((int)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).or((long)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).or((byte)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).or((char)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).or((short)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).or((int)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).or((long)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).or((byte)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).or((char)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).or((short)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).or((int)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).or((long)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigInteger.class).or((BigInteger)oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).or((BigInteger)oneBigInt, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).or((BigInteger)oneBigInt, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).or((BigInteger)oneBigInt, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).or((BigInteger)oneBigInt, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).or((BigInteger)oneBigInt, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      registry.getRuntimeMetaClass(Object.class).or((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((BigInteger)oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((BigDecimal)oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((BigInteger)oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((BigDecimal)oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((BigInteger)oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((BigDecimal)oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).or((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).or((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).or((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((BigInteger)oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((BigDecimal)oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((BigInteger)oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((BigDecimal)oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((byte) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((char) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((short) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((int) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((long) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or((BigInteger) oneBigInt, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).or((BigInteger) oneBigInt, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).or((BigDecimal) oneBigDecimal, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).or((BigDecimal) oneBigDecimal, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 

    for (int i = 0; i != integralOnes.length; i++) {
      
      o = registry.getRuntimeMetaClass(integralOnes[i]).or(integralOnes[i], (byte)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(byte.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).or(integralOnes[i], (char)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(char.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).or(integralOnes[i], (short)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(short.class),  registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).or(integralOnes[i], (int)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(int.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).or(integralOnes[i], (long)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(long.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).or(integralOnes[i], (BigInteger)oneBigInt);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(BigInteger.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseOr((byte)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(byte.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseOr((char)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(char.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseOr((short)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(short.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseOr((int)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(int.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseOr((long)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(long.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseOr((BigInteger)oneBigInt, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(BigInteger.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != integralTwos.length; j++) {
        o = registry.getRuntimeMetaClass(integralOnes[i]).or(integralOnes[i], integralOnes[j]);   
        assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
        assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(registry.getRuntimeMetaClass(integralOnes[j]).getTheClass(o)),  registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      registry.getRuntimeMetaClass(Object.class).or(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or(new Object(), (BigInteger)oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).or(new Object(), (BigDecimal)oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      registry.getRuntimeMetaClass(Object.class).reverseOr((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseOr((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseOr((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseOr((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseOr((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseOr((BigInteger)oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testOrEquals() {
  Object o;
  
    o = registry.getRuntimeMetaClass(byte.class).orEquals((byte)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).orEquals((char)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).orEquals((short)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).orEquals((int)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).orEquals((long)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).orEquals((byte)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).orEquals((char)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).orEquals((short)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).orEquals((int)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).orEquals((long)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).orEquals((byte)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).orEquals((char)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).orEquals((short)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).orEquals((int)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).orEquals((long)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).orEquals((byte)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).orEquals((char)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).orEquals((short)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).orEquals((int)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).orEquals((long)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).orEquals((byte)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).orEquals((char)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).orEquals((short)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).orEquals((int)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).orEquals((long)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).orEquals((byte)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).orEquals((char)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).orEquals((short)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).orEquals((int)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).orEquals((long)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigInteger.class).orEquals((BigInteger)oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).orEquals((BigInteger)oneBigInt, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).orEquals((BigInteger)oneBigInt, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).orEquals((BigInteger)oneBigInt, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).orEquals((BigInteger)oneBigInt, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).orEquals((BigInteger)oneBigInt, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((BigInteger)oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((BigDecimal)oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((BigInteger)oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((BigDecimal)oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((BigInteger)oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((BigDecimal)oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((BigInteger)oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((BigDecimal)oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((BigInteger)oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((BigDecimal)oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((byte) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((char) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((short) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((int) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((long) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((BigInteger) oneBigInt, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((BigInteger) oneBigInt, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((BigDecimal) oneBigDecimal, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals((BigDecimal) oneBigDecimal, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 

    for (int i = 0; i != integralOnes.length; i++) {
      
      o = registry.getRuntimeMetaClass(integralOnes[i]).orEquals(integralOnes[i], (byte)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(byte.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).orEquals(integralOnes[i], (char)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(char.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).orEquals(integralOnes[i], (short)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(short.class),  registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).orEquals(integralOnes[i], (int)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(int.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).orEquals(integralOnes[i], (long)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(long.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).orEquals(integralOnes[i], (BigInteger)oneBigInt);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(BigInteger.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseOrEquals((byte)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(byte.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseOrEquals((char)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(char.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseOrEquals((short)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(short.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseOrEquals((int)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(int.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseOrEquals((long)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(long.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseOrEquals((BigInteger)oneBigInt, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(BigInteger.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != integralTwos.length; j++) {
        o = registry.getRuntimeMetaClass(integralOnes[i]).orEquals(integralOnes[i], integralOnes[j]);   
        assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
        assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(registry.getRuntimeMetaClass(integralOnes[j]).getTheClass(o)),  registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals(new Object(), (BigInteger)oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).orEquals(new Object(), (BigDecimal)oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      registry.getRuntimeMetaClass(Object.class).reverseOrEquals((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseOrEquals((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseOrEquals((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseOrEquals((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseOrEquals((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseOrEquals((BigInteger)oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testXor() {
  Object o;
  
    o = registry.getRuntimeMetaClass(byte.class).xor((byte)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).xor((char)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).xor((short)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).xor((int)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).xor((long)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).xor((byte)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).xor((char)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).xor((short)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).xor((int)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).xor((long)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).xor((byte)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).xor((char)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).xor((short)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).xor((int)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).xor((long)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).xor((byte)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).xor((char)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).xor((short)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).xor((int)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).xor((long)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).xor((byte)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).xor((char)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).xor((short)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).xor((int)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).xor((long)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).xor((byte)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).xor((char)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).xor((short)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).xor((int)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).xor((long)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigInteger.class).xor((BigInteger)oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).xor((BigInteger)oneBigInt, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).xor((BigInteger)oneBigInt, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).xor((BigInteger)oneBigInt, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).xor((BigInteger)oneBigInt, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).xor((BigInteger)oneBigInt, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      registry.getRuntimeMetaClass(Object.class).xor((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((BigInteger)oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((BigDecimal)oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((BigInteger)oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((BigDecimal)oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((BigInteger)oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((BigDecimal)oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).xor((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).xor((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).xor((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((BigInteger)oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((BigDecimal)oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((BigInteger)oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((BigDecimal)oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((byte) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((char) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((short) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((int) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((long) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor((BigInteger) oneBigInt, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).xor((BigInteger) oneBigInt, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).xor((BigDecimal) oneBigDecimal, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).xor((BigDecimal) oneBigDecimal, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 

    for (int i = 0; i != integralOnes.length; i++) {
      
      o = registry.getRuntimeMetaClass(integralOnes[i]).xor(integralOnes[i], (byte)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(byte.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).xor(integralOnes[i], (char)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(char.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).xor(integralOnes[i], (short)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(short.class),  registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).xor(integralOnes[i], (int)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(int.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).xor(integralOnes[i], (long)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(long.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).xor(integralOnes[i], (BigInteger)oneBigInt);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(BigInteger.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseXor((byte)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(byte.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseXor((char)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(char.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseXor((short)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(short.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseXor((int)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(int.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseXor((long)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(long.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseXor((BigInteger)oneBigInt, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(BigInteger.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != integralTwos.length; j++) {
        o = registry.getRuntimeMetaClass(integralOnes[i]).xor(integralOnes[i], integralOnes[j]);   
        assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
        assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(registry.getRuntimeMetaClass(integralOnes[j]).getTheClass(o)),  registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      registry.getRuntimeMetaClass(Object.class).xor(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor(new Object(), (BigInteger)oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xor(new Object(), (BigDecimal)oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      registry.getRuntimeMetaClass(Object.class).reverseXor((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseXor((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseXor((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseXor((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseXor((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseXor((BigInteger)oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testXorEquals() {
  Object o;
  
    o = registry.getRuntimeMetaClass(byte.class).xorEquals((byte)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).xorEquals((char)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).xorEquals((short)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).xorEquals((int)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).xorEquals((long)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).xorEquals((byte)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).xorEquals((char)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).xorEquals((short)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).xorEquals((int)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).xorEquals((long)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).xorEquals((byte)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).xorEquals((char)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).xorEquals((short)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).xorEquals((int)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).xorEquals((long)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).xorEquals((byte)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).xorEquals((char)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).xorEquals((short)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).xorEquals((int)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).xorEquals((long)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).xorEquals((byte)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).xorEquals((char)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).xorEquals((short)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).xorEquals((int)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).xorEquals((long)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).xorEquals((byte)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).xorEquals((char)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).xorEquals((short)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).xorEquals((int)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).xorEquals((long)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigInteger.class).xorEquals((BigInteger)oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).xorEquals((BigInteger)oneBigInt, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).xorEquals((BigInteger)oneBigInt, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).xorEquals((BigInteger)oneBigInt, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).xorEquals((BigInteger)oneBigInt, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).xorEquals((BigInteger)oneBigInt, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    for (int i = 0; i != integralOnes.length; i++) {
      
      o = registry.getRuntimeMetaClass(integralOnes[i]).xorEquals(integralOnes[i], (byte)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(byte.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).xorEquals(integralOnes[i], (char)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(char.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).xorEquals(integralOnes[i], (short)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(short.class),  registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).xorEquals(integralOnes[i], (int)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(int.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).xorEquals(integralOnes[i], (long)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(long.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).xorEquals(integralOnes[i], (BigInteger)oneBigInt);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(BigInteger.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseXorEquals((byte)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(byte.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseXorEquals((char)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(char.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseXorEquals((short)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(short.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseXorEquals((int)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(int.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseXorEquals((long)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(long.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseXorEquals((BigInteger)oneBigInt, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(BigInteger.class), registry.getRuntimeMetaClass(o).getTheClass(o));

      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((byte) 1, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((char) 1, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((short) 1, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((int) 1, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((long) 1, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((BigInteger)oneBigInt, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((BigDecimal)oneBigDecimal, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((byte) 1, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((char) 1, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((short) 1, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((int) 1, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((long) 1, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((BigInteger)oneBigInt, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((BigDecimal)oneBigDecimal, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((byte) 1, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((char) 1, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((short) 1, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((int) 1, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((long) 1, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((BigInteger)oneBigInt, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((BigDecimal)oneBigDecimal, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((byte) 1, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((char) 1, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {
      }
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((short) 1, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {
      }
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((int) 1, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {
      }
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((long) 1, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((BigInteger)oneBigInt, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((BigDecimal)oneBigDecimal, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((byte) 1, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((char) 1, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((short) 1, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((int) 1, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((long) 1, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((BigInteger)oneBigInt, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((BigDecimal)oneBigDecimal, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((byte) 1, (BigInteger) oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((char) 1, (BigInteger) oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((short) 1, (BigInteger) oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((int) 1, (BigInteger) oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((long) 1, (BigInteger) oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((BigInteger) oneBigInt, (BigInteger) oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {} 
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((BigInteger) oneBigInt, (BigDecimal) oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {} 
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((BigDecimal) oneBigDecimal, (BigInteger) oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {} 
      try {
        registry.getRuntimeMetaClass(Object.class).xorEquals((BigDecimal) oneBigDecimal, (BigDecimal) oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {} 
      
      for (int j = 0; j != integralTwos.length; j++) {
        o = registry.getRuntimeMetaClass(integralOnes[i]).xorEquals(integralOnes[i], integralOnes[j]);   
        assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
        assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(registry.getRuntimeMetaClass(integralOnes[j]).getTheClass(o)),  registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      registry.getRuntimeMetaClass(Object.class).xorEquals(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xorEquals(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xorEquals(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xorEquals(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xorEquals(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xorEquals(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xorEquals(new Object(), (BigInteger)oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).xorEquals(new Object(), (BigDecimal)oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      registry.getRuntimeMetaClass(Object.class).reverseXorEquals((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseXorEquals((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseXorEquals((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseXorEquals((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseXorEquals((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseXorEquals((BigInteger)oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testLeftShift() {
  Object o;
  
    o = registry.getRuntimeMetaClass(byte.class).leftShift((byte)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).leftShift((char)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).leftShift((short)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).leftShift((int)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).leftShift((long)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).leftShift((byte)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).leftShift((char)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).leftShift((short)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).leftShift((int)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).leftShift((long)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).leftShift((byte)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).leftShift((char)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).leftShift((short)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).leftShift((int)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).leftShift((long)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).leftShift((byte)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).leftShift((char)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).leftShift((short)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).leftShift((int)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).leftShift((long)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).leftShift((byte)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).leftShift((char)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).leftShift((short)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).leftShift((int)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).leftShift((long)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).leftShift((byte)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).leftShift((char)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).leftShift((short)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).leftShift((int)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).leftShift((long)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigInteger.class).leftShift((BigInteger)oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).leftShift((BigInteger)oneBigInt, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).leftShift((BigInteger)oneBigInt, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).leftShift((BigInteger)oneBigInt, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).leftShift((BigInteger)oneBigInt, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).leftShift((BigInteger)oneBigInt, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((BigInteger)oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((BigDecimal)oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((BigInteger)oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((BigDecimal)oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((BigInteger)oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((BigDecimal)oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((BigInteger)oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((BigDecimal)oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((BigInteger)oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((BigDecimal)oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((byte) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((char) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((short) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((int) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((long) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((BigInteger) oneBigInt, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((BigInteger) oneBigInt, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((BigDecimal) oneBigDecimal, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift((BigDecimal) oneBigDecimal, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 

    for (int i = 0; i != integralOnes.length; i++) {
      
      o = registry.getRuntimeMetaClass(integralOnes[i]).leftShift(integralOnes[i], (byte)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(byte.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).leftShift(integralOnes[i], (char)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(char.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).leftShift(integralOnes[i], (short)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(short.class),  registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).leftShift(integralOnes[i], (int)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(int.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).leftShift(integralOnes[i], (long)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(long.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).leftShift(integralOnes[i], (BigInteger)oneBigInt);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(BigInteger.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseLeftShift((byte)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(byte.class)).get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseLeftShift((char)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(char.class)).get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseLeftShift((short)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(short.class)).get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseLeftShift((int)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(int.class)).get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseLeftShift((long)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(long.class)).get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseLeftShift((BigInteger)oneBigInt, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(BigInteger.class)).get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != integralTwos.length; j++) {
        o = registry.getRuntimeMetaClass(integralOnes[i]).leftShift(integralOnes[i], integralOnes[j]);   
        assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
        assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(registry.getRuntimeMetaClass(integralOnes[j]).getTheClass(o)),  registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift(new Object(), (BigInteger)oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShift(new Object(), (BigDecimal)oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLeftShift((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLeftShift((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLeftShift((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLeftShift((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLeftShift((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLeftShift((BigInteger)oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testLeftShiftEquals() {
  Object o;
  
    o = registry.getRuntimeMetaClass(byte.class).leftShiftEquals((byte)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).leftShiftEquals((char)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).leftShiftEquals((short)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).leftShiftEquals((int)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).leftShiftEquals((long)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).leftShiftEquals((byte)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).leftShiftEquals((char)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).leftShiftEquals((short)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).leftShiftEquals((int)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).leftShiftEquals((long)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).leftShiftEquals((byte)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).leftShiftEquals((char)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).leftShiftEquals((short)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).leftShiftEquals((int)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).leftShiftEquals((long)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).leftShiftEquals((byte)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).leftShiftEquals((char)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).leftShiftEquals((short)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).leftShiftEquals((int)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).leftShiftEquals((long)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).leftShiftEquals((byte)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).leftShiftEquals((char)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).leftShiftEquals((short)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).leftShiftEquals((int)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).leftShiftEquals((long)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).leftShiftEquals((byte)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).leftShiftEquals((char)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).leftShiftEquals((short)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).leftShiftEquals((int)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).leftShiftEquals((long)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigInteger.class).leftShiftEquals((BigInteger)oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).leftShiftEquals((BigInteger)oneBigInt, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).leftShiftEquals((BigInteger)oneBigInt, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).leftShiftEquals((BigInteger)oneBigInt, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).leftShiftEquals((BigInteger)oneBigInt, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).leftShiftEquals((BigInteger)oneBigInt, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((BigInteger)oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((BigDecimal)oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((BigInteger)oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((BigDecimal)oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((BigInteger)oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((BigDecimal)oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((BigInteger)oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((BigDecimal)oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((BigInteger)oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((BigDecimal)oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((byte) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((char) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((short) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((int) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((long) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((BigInteger) oneBigInt, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((BigInteger) oneBigInt, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((BigDecimal) oneBigDecimal, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals((BigDecimal) oneBigDecimal, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 

    for (int i = 0; i != integralOnes.length; i++) {
      
      o = registry.getRuntimeMetaClass(integralOnes[i]).leftShiftEquals(integralOnes[i], (byte)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(byte.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).leftShiftEquals(integralOnes[i], (char)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(char.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).leftShiftEquals(integralOnes[i], (short)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(short.class),  registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).leftShiftEquals(integralOnes[i], (int)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(int.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).leftShiftEquals(integralOnes[i], (long)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(long.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).leftShiftEquals(integralOnes[i], (BigInteger)oneBigInt);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(BigInteger.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseLeftShiftEquals((byte)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(byte.class)).get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseLeftShiftEquals((char)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(char.class)).get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseLeftShiftEquals((short)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(short.class)).get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseLeftShiftEquals((int)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(int.class)).get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseLeftShiftEquals((long)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(long.class)).get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseLeftShiftEquals((BigInteger)oneBigInt, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(BigInteger.class)).get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != integralTwos.length; j++) {
        o = registry.getRuntimeMetaClass(integralOnes[i]).leftShiftEquals(integralOnes[i], integralOnes[j]);   
        assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
        assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(registry.getRuntimeMetaClass(integralOnes[j]).getTheClass(o)),  registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals(new Object(), (BigInteger)oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).leftShiftEquals(new Object(), (BigDecimal)oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLeftShiftEquals((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLeftShiftEquals((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLeftShiftEquals((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLeftShiftEquals((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLeftShiftEquals((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLeftShiftEquals((BigInteger)oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testArithmeticRightShift() {
  Object o;
  
    o = registry.getRuntimeMetaClass(byte.class).arithmeticRightShift((byte)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).arithmeticRightShift((char)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).arithmeticRightShift((short)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).arithmeticRightShift((int)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).arithmeticRightShift((long)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).arithmeticRightShift((byte)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).arithmeticRightShift((char)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).arithmeticRightShift((short)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).arithmeticRightShift((int)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).arithmeticRightShift((long)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).arithmeticRightShift((byte)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).arithmeticRightShift((char)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).arithmeticRightShift((short)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).arithmeticRightShift((int)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).arithmeticRightShift((long)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).arithmeticRightShift((byte)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).arithmeticRightShift((char)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).arithmeticRightShift((short)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).arithmeticRightShift((int)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).arithmeticRightShift((long)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).arithmeticRightShift((byte)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).arithmeticRightShift((char)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).arithmeticRightShift((short)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).arithmeticRightShift((int)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).arithmeticRightShift((long)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).arithmeticRightShift((byte)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).arithmeticRightShift((char)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).arithmeticRightShift((short)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).arithmeticRightShift((int)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).arithmeticRightShift((long)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigInteger.class).arithmeticRightShift((BigInteger)oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).arithmeticRightShift((BigInteger)oneBigInt, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).arithmeticRightShift((BigInteger)oneBigInt, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).arithmeticRightShift((BigInteger)oneBigInt, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).arithmeticRightShift((BigInteger)oneBigInt, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).arithmeticRightShift((BigInteger)oneBigInt, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((BigInteger)oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((BigDecimal)oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((BigInteger)oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((BigDecimal)oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((BigInteger)oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((BigDecimal)oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((BigInteger)oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((BigDecimal)oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((BigInteger)oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((BigDecimal)oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((byte) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((char) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((short) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((int) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((long) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((BigInteger) oneBigInt, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((BigInteger) oneBigInt, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((BigDecimal) oneBigDecimal, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((BigDecimal) oneBigDecimal, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 

    for (int i = 0; i != integralOnes.length; i++) {
      
      o = registry.getRuntimeMetaClass(integralOnes[i]).arithmeticRightShift(integralOnes[i], (byte)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(byte.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).arithmeticRightShift(integralOnes[i], (char)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(char.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).arithmeticRightShift(integralOnes[i], (short)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(short.class),  registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).arithmeticRightShift(integralOnes[i], (int)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(int.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).arithmeticRightShift(integralOnes[i], (long)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(long.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).arithmeticRightShift(integralOnes[i], (BigInteger)oneBigInt);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(BigInteger.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseArithmeticRightShift((byte)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(byte.class)).get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseArithmeticRightShift((char)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(char.class)).get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseArithmeticRightShift((short)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(short.class)).get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseArithmeticRightShift((int)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(int.class)).get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseArithmeticRightShift((long)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(long.class)).get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseArithmeticRightShift((BigInteger)oneBigInt, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(BigInteger.class)).get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != integralTwos.length; j++) {
        o = registry.getRuntimeMetaClass(integralOnes[i]).arithmeticRightShift(integralOnes[i], integralOnes[j]);   
        assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
        assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(registry.getRuntimeMetaClass(integralOnes[j]).getTheClass(o)),  registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift(new Object(), (BigInteger)oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShift(new Object(), (BigDecimal)oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      registry.getRuntimeMetaClass(Object.class).reverseArithmeticRightShift((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseArithmeticRightShift((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseArithmeticRightShift((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseArithmeticRightShift((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseArithmeticRightShift((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseArithmeticRightShift((BigInteger)oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testArithmeticRightShiftEquals() {
  Object o;
  
    o = registry.getRuntimeMetaClass(byte.class).arithmeticRightShiftEquals((byte)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).arithmeticRightShiftEquals((char)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).arithmeticRightShiftEquals((short)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).arithmeticRightShiftEquals((int)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).arithmeticRightShiftEquals((long)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).arithmeticRightShiftEquals((byte)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).arithmeticRightShiftEquals((char)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).arithmeticRightShiftEquals((short)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).arithmeticRightShiftEquals((int)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).arithmeticRightShiftEquals((long)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).arithmeticRightShiftEquals((byte)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).arithmeticRightShiftEquals((char)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).arithmeticRightShiftEquals((short)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).arithmeticRightShiftEquals((int)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).arithmeticRightShiftEquals((long)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).arithmeticRightShiftEquals((byte)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).arithmeticRightShiftEquals((char)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).arithmeticRightShiftEquals((short)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).arithmeticRightShiftEquals((int)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).arithmeticRightShiftEquals((long)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).arithmeticRightShiftEquals((byte)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).arithmeticRightShiftEquals((char)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).arithmeticRightShiftEquals((short)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).arithmeticRightShiftEquals((int)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).arithmeticRightShiftEquals((long)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).arithmeticRightShiftEquals((byte)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).arithmeticRightShiftEquals((char)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).arithmeticRightShiftEquals((short)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).arithmeticRightShiftEquals((int)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).arithmeticRightShiftEquals((long)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigInteger.class).arithmeticRightShiftEquals((BigInteger)oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).arithmeticRightShiftEquals((BigInteger)oneBigInt, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).arithmeticRightShiftEquals((BigInteger)oneBigInt, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).arithmeticRightShiftEquals((BigInteger)oneBigInt, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).arithmeticRightShiftEquals((BigInteger)oneBigInt, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).arithmeticRightShiftEquals((BigInteger)oneBigInt, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((BigInteger)oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((BigDecimal)oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((BigInteger)oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((BigDecimal)oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((BigInteger)oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((BigDecimal)oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((BigInteger)oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((BigDecimal)oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((BigInteger)oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((BigDecimal)oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((byte) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((char) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((short) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((int) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((long) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((BigInteger) oneBigInt, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((BigInteger) oneBigInt, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((BigDecimal) oneBigDecimal, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((BigDecimal) oneBigDecimal, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 

    for (int i = 0; i != integralOnes.length; i++) {
      
      o = registry.getRuntimeMetaClass(integralOnes[i]).arithmeticRightShiftEquals(integralOnes[i], (byte)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(byte.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).arithmeticRightShiftEquals(integralOnes[i], (char)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(char.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).arithmeticRightShiftEquals(integralOnes[i], (short)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(short.class),  registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).arithmeticRightShiftEquals(integralOnes[i], (int)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(int.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).arithmeticRightShiftEquals(integralOnes[i], (long)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(long.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).arithmeticRightShiftEquals(integralOnes[i], (BigInteger)oneBigInt);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(BigInteger.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseArithmeticRightShiftEquals((byte)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(byte.class)).get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseArithmeticRightShiftEquals((char)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(char.class)).get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseArithmeticRightShiftEquals((short)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(short.class)).get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseArithmeticRightShiftEquals((int)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(int.class)).get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseArithmeticRightShiftEquals((long)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(long.class)).get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseArithmeticRightShiftEquals((BigInteger)oneBigInt, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(BigInteger.class)).get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != integralTwos.length; j++) {
        o = registry.getRuntimeMetaClass(integralOnes[i]).arithmeticRightShiftEquals(integralOnes[i], integralOnes[j]);   
        assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
        assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(registry.getRuntimeMetaClass(integralOnes[j]).getTheClass(o)),  registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals(new Object(), (BigInteger)oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals(new Object(), (BigDecimal)oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      registry.getRuntimeMetaClass(Object.class).reverseArithmeticRightShiftEquals((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseArithmeticRightShiftEquals((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseArithmeticRightShiftEquals((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseArithmeticRightShiftEquals((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseArithmeticRightShiftEquals((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseArithmeticRightShiftEquals((BigInteger)oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testLogicalRightShift() {
  Object o;
  
    o = registry.getRuntimeMetaClass(byte.class).logicalRightShift((byte)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).logicalRightShift((char)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).logicalRightShift((short)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).logicalRightShift((int)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).logicalRightShift((long)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).logicalRightShift((byte)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).logicalRightShift((char)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).logicalRightShift((short)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).logicalRightShift((int)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).logicalRightShift((long)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).logicalRightShift((byte)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).logicalRightShift((char)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).logicalRightShift((short)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).logicalRightShift((int)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).logicalRightShift((long)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).logicalRightShift((byte)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).logicalRightShift((char)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).logicalRightShift((short)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).logicalRightShift((int)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).logicalRightShift((long)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).logicalRightShift((byte)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).logicalRightShift((char)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).logicalRightShift((short)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).logicalRightShift((int)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).logicalRightShift((long)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).logicalRightShift((byte)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).logicalRightShift((char)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).logicalRightShift((short)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).logicalRightShift((int)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).logicalRightShift((long)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((BigInteger)oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((BigDecimal)oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((BigInteger)oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((BigDecimal)oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((BigInteger)oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((BigDecimal)oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((BigInteger)oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((BigDecimal)oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((BigInteger)oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((BigDecimal)oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((byte) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((char) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((short) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((int) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((long) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((BigInteger) oneBigInt, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((BigInteger) oneBigInt, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((BigDecimal) oneBigDecimal, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift((BigDecimal) oneBigDecimal, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 

    for (int i = 0; i != logicalShiftIntegralOnes.length; i++) {
      
      o = registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).logicalRightShift(logicalShiftIntegralOnes[i], (byte)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).getTheClass(o))).get(byte.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).logicalRightShift(logicalShiftIntegralOnes[i], (char)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).getTheClass(o))).get(char.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).logicalRightShift(logicalShiftIntegralOnes[i], (short)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).getTheClass(o))).get(short.class),  registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).logicalRightShift(logicalShiftIntegralOnes[i], (int)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).getTheClass(o))).get(int.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).logicalRightShift(logicalShiftIntegralOnes[i], (long)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).getTheClass(o))).get(long.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).logicalRightShift(logicalShiftIntegralOnes[i], (BigInteger)oneBigInt);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).getTheClass(o))).get(BigInteger.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).reverseLogicalRightShift((byte)1, logicalShiftIntegralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(byte.class)).get(registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).reverseLogicalRightShift((char)1, logicalShiftIntegralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(char.class)).get(registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).reverseLogicalRightShift((short)1, logicalShiftIntegralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(short.class)).get(registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).reverseLogicalRightShift((int)1, logicalShiftIntegralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(int.class)).get(registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).reverseLogicalRightShift((long)1, logicalShiftIntegralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(long.class)).get(registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != logicalShiftIntegralTwos.length; j++) {
        o = registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).logicalRightShift(logicalShiftIntegralOnes[i], logicalShiftIntegralOnes[j]);   
        assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
        assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).getTheClass(o))).get(registry.getRuntimeMetaClass(logicalShiftIntegralOnes[j]).getTheClass(o)),  registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift(new Object(), (BigInteger)oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShift(new Object(), (BigDecimal)oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLogicalRightShift((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLogicalRightShift((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLogicalRightShift((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLogicalRightShift((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLogicalRightShift((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testLogicalRightShiftEquals() {
  Object o;
  
    o = registry.getRuntimeMetaClass(byte.class).logicalRightShiftEquals((byte)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).logicalRightShiftEquals((char)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).logicalRightShiftEquals((short)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).logicalRightShiftEquals((int)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).logicalRightShiftEquals((long)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).logicalRightShiftEquals((byte)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).logicalRightShiftEquals((char)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).logicalRightShiftEquals((short)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).logicalRightShiftEquals((int)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).logicalRightShiftEquals((long)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).logicalRightShiftEquals((byte)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).logicalRightShiftEquals((char)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).logicalRightShiftEquals((short)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).logicalRightShiftEquals((int)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).logicalRightShiftEquals((long)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).logicalRightShiftEquals((byte)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).logicalRightShiftEquals((char)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).logicalRightShiftEquals((short)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).logicalRightShiftEquals((int)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).logicalRightShiftEquals((long)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).logicalRightShiftEquals((byte)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).logicalRightShiftEquals((char)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).logicalRightShiftEquals((short)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).logicalRightShiftEquals((int)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).logicalRightShiftEquals((long)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).logicalRightShiftEquals((byte)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).logicalRightShiftEquals((char)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).logicalRightShiftEquals((short)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).logicalRightShiftEquals((int)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).logicalRightShiftEquals((long)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((BigInteger)oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((BigDecimal)oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((BigInteger)oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((BigDecimal)oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((BigInteger)oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((BigDecimal)oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((BigInteger)oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((BigDecimal)oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((BigInteger)oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((BigDecimal)oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((byte) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((char) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((short) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((int) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((long) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((BigInteger) oneBigInt, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((BigInteger) oneBigInt, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((BigDecimal) oneBigDecimal, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((BigDecimal) oneBigDecimal, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 

    for (int i = 0; i != logicalShiftIntegralOnes.length; i++) {
      
      o = registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).logicalRightShiftEquals(logicalShiftIntegralOnes[i], (byte)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).getTheClass(o))).get(byte.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).logicalRightShiftEquals(logicalShiftIntegralOnes[i], (char)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).getTheClass(o))).get(char.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).logicalRightShiftEquals(logicalShiftIntegralOnes[i], (short)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).getTheClass(o))).get(short.class),  registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).logicalRightShiftEquals(logicalShiftIntegralOnes[i], (int)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).getTheClass(o))).get(int.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).logicalRightShiftEquals(logicalShiftIntegralOnes[i], (long)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).getTheClass(o))).get(long.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).logicalRightShiftEquals(logicalShiftIntegralOnes[i], (BigInteger)oneBigInt);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).getTheClass(o))).get(BigInteger.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).reverseLogicalRightShiftEquals((byte)1, logicalShiftIntegralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(byte.class)).get(registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).reverseLogicalRightShiftEquals((char)1, logicalShiftIntegralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(char.class)).get(registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).reverseLogicalRightShiftEquals((short)1, logicalShiftIntegralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(short.class)).get(registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).reverseLogicalRightShiftEquals((int)1, logicalShiftIntegralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(int.class)).get(registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).reverseLogicalRightShiftEquals((long)1, logicalShiftIntegralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)shiftTypeConverter.get(long.class)).get(registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).getTheClass(o)), registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != logicalShiftIntegralTwos.length; j++) {
        o = registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).logicalRightShiftEquals(logicalShiftIntegralOnes[i], logicalShiftIntegralOnes[j]);   
        assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
        assertEquals(((Map)shiftTypeConverter.get(registry.getRuntimeMetaClass(logicalShiftIntegralOnes[i]).getTheClass(o))).get(registry.getRuntimeMetaClass(logicalShiftIntegralOnes[j]).getTheClass(o)),  registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals(new Object(), (BigInteger)oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals(new Object(), (BigDecimal)oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLogicalRightShiftEquals((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLogicalRightShiftEquals((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLogicalRightShiftEquals((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLogicalRightShiftEquals((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLogicalRightShiftEquals((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testGreaterThanOrEquals () {
  final boolean b1 = false, b2 = true, b3 = true, b4 = true;
  
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(oneBigInt, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(oneBigInt, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(twoBigInt, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(twoBigInt, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(oneBigInt, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(oneBigInt, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(twoBigInt, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(twoBigInt, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(oneBigInt, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(oneBigInt, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(twoBigInt, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(twoBigInt, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(oneBigInt, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(oneBigInt, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(twoBigInt, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(twoBigInt, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(oneBigInt, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(oneBigInt, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(twoBigInt, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(twoBigInt, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(oneBigInt, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(oneBigInt, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(twoBigInt, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(twoBigInt, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(oneBigInt, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(oneBigInt, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(twoBigInt, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(twoBigInt, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(oneBigInt, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(oneBigInt, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(twoBigInt, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(twoBigInt, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(oneBigInt, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(oneBigInt, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(twoBigInt, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(twoBigInt, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(oneBigInt, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(oneBigInt, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(twoBigInt, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(twoBigInt, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(oneBigDecimal, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(oneBigDecimal, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(twoBigDecimal, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(twoBigDecimal, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(oneBigDecimal, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(oneBigDecimal, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(twoBigDecimal, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(twoBigDecimal, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(oneBigDecimal, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(oneBigDecimal, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(twoBigDecimal, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(twoBigDecimal, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(oneBigDecimal, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(oneBigDecimal, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(twoBigDecimal, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(twoBigDecimal, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(oneBigDecimal, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(oneBigDecimal, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(twoBigDecimal, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(twoBigDecimal, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(oneBigDecimal, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(oneBigDecimal, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(twoBigDecimal, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(twoBigDecimal, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(oneBigDecimal, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(oneBigDecimal, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(twoBigDecimal, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(twoBigDecimal, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(oneBigDecimal, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(oneBigDecimal, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(twoBigDecimal, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(twoBigDecimal, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(oneBigDecimal, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(oneBigDecimal, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(twoBigDecimal, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(twoBigDecimal, oneBigDecimal)).getBooleanValue(), b4);

    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigInteger)oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigDecimal)oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigInteger)oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigDecimal)oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigInteger)oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigDecimal)oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((float) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((double) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigInteger)oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigDecimal)oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigInteger)oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigDecimal)oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((int) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigInteger)oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigDecimal)oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((int) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigInteger)oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigDecimal)oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((byte) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((char) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((short) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((int) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((long) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((float) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((double) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((byte) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((char) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((short) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((int) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((long) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((float) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((double) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigInteger) oneBigInt, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigInteger) oneBigInt, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigDecimal) oneBigDecimal, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigDecimal) oneBigDecimal, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    
    for (int i = 0; i != ones.length; i++) {
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThanOrEquals(ones[i], (byte)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThanOrEquals(ones[i], (byte)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThanOrEquals(twos[i], (byte)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThanOrEquals(twos[i], (byte)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThanOrEquals(ones[i], (char)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThanOrEquals(ones[i], (char)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThanOrEquals(twos[i], (char)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThanOrEquals(twos[i], (char)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThanOrEquals(ones[i], (short)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThanOrEquals(ones[i], (short)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThanOrEquals(twos[i], (short)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThanOrEquals(twos[i], (short)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThanOrEquals(ones[i], (int)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThanOrEquals(ones[i], (int)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThanOrEquals(twos[i], (int)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThanOrEquals(twos[i], (int)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThanOrEquals(ones[i], (long)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThanOrEquals(ones[i], (long)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThanOrEquals(twos[i], (long)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThanOrEquals(twos[i], (long)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThanOrEquals(ones[i], (float)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThanOrEquals(ones[i], (float)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThanOrEquals(twos[i], (float)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThanOrEquals(twos[i], (float)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThanOrEquals(ones[i], (double)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThanOrEquals(ones[i], (double)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThanOrEquals(twos[i], (double)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThanOrEquals(twos[i], (double)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThanOrEquals(ones[i], twoBigInt)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThanOrEquals(ones[i], oneBigInt)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThanOrEquals(twos[i], twoBigInt)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThanOrEquals(twos[i], oneBigInt)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThanOrEquals(ones[i], twoBigDecimal)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThanOrEquals(ones[i], oneBigDecimal)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThanOrEquals(twos[i], twoBigDecimal)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThanOrEquals(twos[i], oneBigDecimal)).getBooleanValue(), b4);
  
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThanOrEquals(((byte)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThanOrEquals(((byte)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThanOrEquals(((byte)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThanOrEquals(((byte)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThanOrEquals(((char)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThanOrEquals(((char)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThanOrEquals(((char)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThanOrEquals(((char)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThanOrEquals(((short)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThanOrEquals(((short)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThanOrEquals(((short)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThanOrEquals(((short)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThanOrEquals(((int)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThanOrEquals(((int)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThanOrEquals(((int)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThanOrEquals(((int)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThanOrEquals(((long)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThanOrEquals(((long)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThanOrEquals(((long)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThanOrEquals(((long)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThanOrEquals(((float)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThanOrEquals(((float)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThanOrEquals(((float)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThanOrEquals(((float)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThanOrEquals(((double)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThanOrEquals(((double)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThanOrEquals(((double)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThanOrEquals(((double)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThanOrEquals(twoBigInt, ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThanOrEquals(oneBigInt, ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThanOrEquals(twoBigInt, twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThanOrEquals(oneBigInt, twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThanOrEquals(twoBigDecimal, ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThanOrEquals(oneBigDecimal, ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThanOrEquals(twoBigDecimal, twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThanOrEquals(oneBigDecimal, twos[i])).getBooleanValue(), b1);
      
      for (int j = 0; j != twos.length; j++) {
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThanOrEquals(ones[i], twos[j])).getBooleanValue(), b1);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThanOrEquals(ones[i], ones[j])).getBooleanValue(), b2);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThanOrEquals(twos[i], twos[j])).getBooleanValue(), b3);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThanOrEquals(twos[i], ones[j])).getBooleanValue(), b4);
      }      
    }
    
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals(new Object(), (BigInteger)oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals(new Object(), (BigDecimal)oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      registry.getRuntimeMetaClass(Object.class).reverseGreaterThanOrEquals((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseGreaterThanOrEquals((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseGreaterThanOrEquals((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseGreaterThanOrEquals((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseGreaterThanOrEquals((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseGreaterThanOrEquals((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseGreaterThanOrEquals((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseGreaterThanOrEquals((BigInteger)oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseGreaterThanOrEquals((BigDecimal)oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testGreaterThan() {
  final boolean b1 = false, b2 = false, b3 = false, b4 = true;
  
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(oneBigInt, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(oneBigInt, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(twoBigInt, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(twoBigInt, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(oneBigInt, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(oneBigInt, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(twoBigInt, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(twoBigInt, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(oneBigInt, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(oneBigInt, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(twoBigInt, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(twoBigInt, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(oneBigInt, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(oneBigInt, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(twoBigInt, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(twoBigInt, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(oneBigInt, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(oneBigInt, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(twoBigInt, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(twoBigInt, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(oneBigInt, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(oneBigInt, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(twoBigInt, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(twoBigInt, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(oneBigInt, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(oneBigInt, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(twoBigInt, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(twoBigInt, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(oneBigInt, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(oneBigInt, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(twoBigInt, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(twoBigInt, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(oneBigInt, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(oneBigInt, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(twoBigInt, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(twoBigInt, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(oneBigInt, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(oneBigInt, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(twoBigInt, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).greaterThan(twoBigInt, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).greaterThan((char)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).greaterThan((short)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).greaterThan((int)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).greaterThan((long)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).greaterThan((float)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).greaterThan((double)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(oneBigDecimal, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(oneBigDecimal, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(twoBigDecimal, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(twoBigDecimal, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(oneBigDecimal, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(oneBigDecimal, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(twoBigDecimal, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(twoBigDecimal, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(oneBigDecimal, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(oneBigDecimal, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(twoBigDecimal, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(twoBigDecimal, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(oneBigDecimal, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(oneBigDecimal, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(twoBigDecimal, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(twoBigDecimal, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(oneBigDecimal, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(oneBigDecimal, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(twoBigDecimal, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(twoBigDecimal, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(oneBigDecimal, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(oneBigDecimal, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(twoBigDecimal, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(twoBigDecimal, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(oneBigDecimal, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(oneBigDecimal, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(twoBigDecimal, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(twoBigDecimal, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(oneBigDecimal, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(oneBigDecimal, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(twoBigDecimal, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(twoBigDecimal, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(oneBigDecimal, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(oneBigDecimal, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(twoBigDecimal, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(twoBigDecimal, oneBigDecimal)).getBooleanValue(), b4);

    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((BigInteger)oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((BigDecimal)oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((BigInteger)oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((BigDecimal)oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((BigInteger)oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((BigDecimal)oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((float) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((double) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((BigInteger)oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((BigDecimal)oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((BigInteger)oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((BigDecimal)oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((int) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((BigInteger)oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((BigDecimal)oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((int) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((BigInteger)oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((BigDecimal)oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((byte) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((char) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((short) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((int) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((long) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((float) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((double) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((byte) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((char) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((short) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((int) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((long) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((float) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((double) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((BigInteger) oneBigInt, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((BigInteger) oneBigInt, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((BigDecimal) oneBigDecimal, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan((BigDecimal) oneBigDecimal, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    
    for (int i = 0; i != ones.length; i++) {
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThan(ones[i], (byte)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThan(ones[i], (byte)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThan(twos[i], (byte)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThan(twos[i], (byte)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThan(ones[i], (char)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThan(ones[i], (char)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThan(twos[i], (char)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThan(twos[i], (char)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThan(ones[i], (short)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThan(ones[i], (short)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThan(twos[i], (short)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThan(twos[i], (short)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThan(ones[i], (int)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThan(ones[i], (int)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThan(twos[i], (int)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThan(twos[i], (int)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThan(ones[i], (long)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThan(ones[i], (long)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThan(twos[i], (long)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThan(twos[i], (long)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThan(ones[i], (float)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThan(ones[i], (float)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThan(twos[i], (float)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThan(twos[i], (float)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThan(ones[i], (double)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThan(ones[i], (double)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThan(twos[i], (double)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThan(twos[i], (double)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThan(ones[i], twoBigInt)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThan(ones[i], oneBigInt)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThan(twos[i], twoBigInt)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThan(twos[i], oneBigInt)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThan(ones[i], twoBigDecimal)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThan(ones[i], oneBigDecimal)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThan(twos[i], twoBigDecimal)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThan(twos[i], oneBigDecimal)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThan(((byte)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThan(((byte)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThan(((byte)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThan(((byte)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThan(((char)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThan(((char)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThan(((char)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThan(((char)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThan(((short)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThan(((short)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThan(((short)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThan(((short)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThan(((int)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThan(((int)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThan(((int)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThan(((int)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThan(((long)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThan(((long)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThan(((long)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThan(((long)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThan(((float)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThan(((float)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThan(((float)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThan(((float)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThan(((double)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThan(((double)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThan(((double)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThan(((double)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThan(twoBigInt, ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThan(oneBigInt, ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThan(twoBigInt, twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThan(oneBigInt, twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThan(twoBigDecimal, ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseGreaterThan(oneBigDecimal, ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThan(twoBigDecimal, twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseGreaterThan(oneBigDecimal, twos[i])).getBooleanValue(), b1);
      
      for (int j = 0; j != twos.length; j++) {
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThan(ones[i], twos[j])).getBooleanValue(), b1);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).greaterThan(ones[i], ones[j])).getBooleanValue(), b2);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThan(twos[i], twos[j])).getBooleanValue(), b3);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).greaterThan(twos[i], ones[j])).getBooleanValue(), b4);
      }      
    }
    
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan(new Object(), (BigInteger)oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).greaterThan(new Object(), (BigDecimal)oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      registry.getRuntimeMetaClass(Object.class).reverseGreaterThan((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseGreaterThan((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseGreaterThan((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseGreaterThan((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseGreaterThan((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseGreaterThan((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseGreaterThan((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseGreaterThan((BigInteger)oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseGreaterThan((BigDecimal)oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testCompare() {
  
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)1, (byte)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)1, (byte)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)2, (byte)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)2, (byte)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)1, (char)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)1, (char)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)2, (char)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)2, (char)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)1, (short)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)1, (short)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)2, (short)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)2, (short)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)1, (int)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)1, (int)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)2, (int)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)2, (int)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)1, (long)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)1, (long)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)2, (long)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)2, (long)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)1, (float)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)1, (float)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)2, (float)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)2, (float)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)1, (double)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)1, (double)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)2, (double)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)2, (double)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)1, (byte)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)1, (byte)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)2, (byte)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)2, (byte)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)1, (char)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)1, (char)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)2, (char)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)2, (char)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)1, (short)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)1, (short)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)2, (short)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)2, (short)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)1, (int)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)1, (int)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)2, (int)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)2, (int)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)1, (long)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)1, (long)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)2, (long)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)2, (long)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)1, (float)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)1, (float)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)2, (float)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)2, (float)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)1, (double)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)1, (double)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)2, (double)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)2, (double)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)1, (byte)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)1, (byte)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)2, (byte)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)2, (byte)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)1, (char)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)1, (char)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)2, (char)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)2, (char)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)1, (short)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)1, (short)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)2, (short)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)2, (short)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)1, (int)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)1, (int)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)2, (int)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)2, (int)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)1, (long)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)1, (long)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)2, (long)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)2, (long)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)1, (float)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)1, (float)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)2, (float)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)2, (float)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)1, (double)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)1, (double)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)2, (double)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)2, (double)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)1, (byte)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)1, (byte)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)2, (byte)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)2, (byte)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)1, (char)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)1, (char)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)2, (char)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)2, (char)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)1, (short)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)1, (short)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)2, (short)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)2, (short)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)1, (int)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)1, (int)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)2, (int)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)2, (int)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)1, (long)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)1, (long)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)2, (long)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)2, (long)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)1, (float)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)1, (float)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)2, (float)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)2, (float)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)1, (double)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)1, (double)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)2, (double)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)2, (double)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)1, (byte)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)1, (byte)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)2, (byte)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)2, (byte)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)1, (char)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)1, (char)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)2, (char)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)2, (char)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)1, (short)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)1, (short)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)2, (short)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)2, (short)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)1, (int)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)1, (int)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)2, (int)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)2, (int)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)1, (long)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)1, (long)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)2, (long)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)2, (long)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)1, (float)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)1, (float)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)2, (float)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)2, (float)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)1, (double)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)1, (double)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)2, (double)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)2, (double)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)1, (byte)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)1, (byte)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)2, (byte)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)2, (byte)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)1, (char)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)1, (char)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)2, (char)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)2, (char)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)1, (short)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)1, (short)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)2, (short)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)2, (short)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)1, (int)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)1, (int)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)2, (int)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)2, (int)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)1, (long)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)1, (long)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)2, (long)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)2, (long)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)1, (float)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)1, (float)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)2, (float)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)2, (float)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)1, (double)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)1, (double)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)2, (double)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)2, (double)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)1, (byte)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)1, (byte)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)2, (byte)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)2, (byte)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)1, (char)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)1, (char)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)2, (char)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)2, (char)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)1, (short)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)1, (short)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)2, (short)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)2, (short)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)1, (int)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)1, (int)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)2, (int)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)2, (int)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)1, (long)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)1, (long)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)2, (long)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)2, (long)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)1, (float)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)1, (float)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)2, (float)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)2, (float)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)1, (double)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)1, (double)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)2, (double)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)2, (double)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)1, twoBigInt)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)1, oneBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)2, twoBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)2, oneBigInt)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)1, twoBigInt)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)1, oneBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)2, twoBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)2, oneBigInt)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)1, twoBigInt)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)1, oneBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)2, twoBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)2, oneBigInt)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)1, twoBigInt)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)1, oneBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)2, twoBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)2, oneBigInt)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)1, twoBigInt)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)1, oneBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)2, twoBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)2, oneBigInt)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)1, twoBigInt)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)1, oneBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)2, twoBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)2, oneBigInt)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)1, twoBigInt)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)1, oneBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)2, twoBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)2, oneBigInt)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(oneBigInt, (byte)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(oneBigInt, (byte)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(twoBigInt, (byte)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(twoBigInt, (byte)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(oneBigInt, (char)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(oneBigInt, (char)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(twoBigInt, (char)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(twoBigInt, (char)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(oneBigInt, (short)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(oneBigInt, (short)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(twoBigInt, (short)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(twoBigInt, (short)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(oneBigInt, (int)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(oneBigInt, (int)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(twoBigInt, (int)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(twoBigInt, (int)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(oneBigInt, (long)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(oneBigInt, (long)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(twoBigInt, (long)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(twoBigInt, (long)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(oneBigInt, (float)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(oneBigInt, (float)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(twoBigInt, (float)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(twoBigInt, (float)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(oneBigInt, (double)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(oneBigInt, (double)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(twoBigInt, (double)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(twoBigInt, (double)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(oneBigInt, (byte)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(oneBigInt, (byte)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(twoBigInt, (byte)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(twoBigInt, (byte)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(oneBigInt, twoBigInt)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(oneBigInt, oneBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(twoBigInt, twoBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(twoBigInt, oneBigInt)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(oneBigInt, twoBigDecimal)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(oneBigInt, oneBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(twoBigInt, twoBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigInteger.class).compare(twoBigInt, oneBigDecimal)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)1, twoBigDecimal)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)1, oneBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)2, twoBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(byte.class).compare((byte)2, oneBigDecimal)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)1, twoBigDecimal)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)1, oneBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)2, twoBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(char.class).compare((char)2, oneBigDecimal)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)1, twoBigDecimal)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)1, oneBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)2, twoBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(short.class).compare((short)2, oneBigDecimal)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)1, twoBigDecimal)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)1, oneBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)2, twoBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(int.class).compare((int)2, oneBigDecimal)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)1, twoBigDecimal)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)1, oneBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)2, twoBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(long.class).compare((long)2, oneBigDecimal)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)1, twoBigDecimal)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)1, oneBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)2, twoBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(float.class).compare((float)2, oneBigDecimal)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)1, twoBigDecimal)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)1, oneBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)2, twoBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(double.class).compare((double)2, oneBigDecimal)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(oneBigDecimal, (byte)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(oneBigDecimal, (byte)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(twoBigDecimal, (byte)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(twoBigDecimal, (byte)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(oneBigDecimal, (char)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(oneBigDecimal, (char)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(twoBigDecimal, (char)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(twoBigDecimal, (char)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(oneBigDecimal, (short)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(oneBigDecimal, (short)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(twoBigDecimal, (short)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(twoBigDecimal, (short)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(oneBigDecimal, (int)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(oneBigDecimal, (int)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(twoBigDecimal, (int)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(twoBigDecimal, (int)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(oneBigDecimal, (long)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(oneBigDecimal, (long)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(twoBigDecimal, (long)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(twoBigDecimal, (long)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(oneBigDecimal, (float)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(oneBigDecimal, (float)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(twoBigDecimal, (float)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(twoBigDecimal, (float)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(oneBigDecimal, (double)2)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(oneBigDecimal, (double)1)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(twoBigDecimal, (double)2)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(twoBigDecimal, (double)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(oneBigDecimal, twoBigInt)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(oneBigDecimal, oneBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(twoBigDecimal, twoBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(twoBigDecimal, oneBigInt)).getIntValue() > 0);
    
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(oneBigDecimal, twoBigDecimal)).getIntValue() < 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(oneBigDecimal, oneBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(twoBigDecimal, twoBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)registry.getRuntimeMetaClass(BigDecimal.class).compare(twoBigDecimal, oneBigDecimal)).getIntValue() > 0);

    try {
      registry.getRuntimeMetaClass(Object.class).compare((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((BigInteger)oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((BigDecimal)oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((BigInteger)oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((BigDecimal)oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((BigInteger)oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((BigDecimal)oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).compare((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).compare((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).compare((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((float) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((double) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((BigInteger)oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((BigDecimal)oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((BigInteger)oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((BigDecimal)oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((int) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((BigInteger)oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((BigDecimal)oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((int) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((BigInteger)oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((BigDecimal)oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((byte) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((char) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((short) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((int) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((long) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((float) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((double) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((byte) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((char) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((short) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((int) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((long) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((float) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare((double) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).compare((BigInteger) oneBigInt, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).compare((BigInteger) oneBigInt, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).compare((BigDecimal) oneBigDecimal, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).compare((BigDecimal) oneBigDecimal, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    
    for (int i = 0; i != ones.length; i++) {
      
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).compare(ones[i], (byte)2)).getIntValue() < 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).compare(ones[i], (byte)1)).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).compare(twos[i], (byte)2)).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).compare(twos[i], (byte)1)).getIntValue() > 0);
      
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).compare(ones[i], (char)2)).getIntValue() < 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).compare(ones[i], (char)1)).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).compare(twos[i], (char)2)).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).compare(twos[i], (char)1)).getIntValue() > 0);
      
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).compare(ones[i], (short)2)).getIntValue() < 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).compare(ones[i], (short)1)).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).compare(twos[i], (short)2)).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).compare(twos[i], (short)1)).getIntValue() > 0);
      
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).compare(ones[i], (int)2)).getIntValue() < 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).compare(ones[i], (int)1)).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).compare(twos[i], (int)2)).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).compare(twos[i], (int)1)).getIntValue() > 0);
      
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).compare(ones[i], (long)2)).getIntValue() < 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).compare(ones[i], (long)1)).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).compare(twos[i], (long)2)).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).compare(twos[i], (long)1)).getIntValue() > 0);
      
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).compare(ones[i], (float)2)).getIntValue() < 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).compare(ones[i], (float)1)).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).compare(twos[i], (float)2)).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).compare(twos[i], (float)1)).getIntValue() > 0);
      
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).compare(ones[i], (double)2)).getIntValue() < 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).compare(ones[i], (double)1)).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).compare(twos[i], (double)2)).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).compare(twos[i], (double)1)).getIntValue() > 0);
      
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).compare(ones[i], twoBigInt)).getIntValue() < 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).compare(ones[i], oneBigInt)).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).compare(twos[i], twoBigInt)).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).compare(twos[i], oneBigInt)).getIntValue() > 0);
      
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).compare(ones[i], twoBigDecimal)).getIntValue() < 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).compare(ones[i], oneBigDecimal)).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).compare(twos[i], twoBigDecimal)).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).compare(twos[i], oneBigDecimal)).getIntValue() > 0);
      
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).reverseCompare(((byte)2), ones[i])).getIntValue() > 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).reverseCompare(((byte)1), ones[i])).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).reverseCompare(((byte)2), twos[i])).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).reverseCompare(((byte)1), twos[i])).getIntValue() < 0);
      
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).reverseCompare(((char)2), ones[i])).getIntValue() > 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).reverseCompare(((char)1), ones[i])).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).reverseCompare(((char)2), twos[i])).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).reverseCompare(((char)1), twos[i])).getIntValue() < 0);
      
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).reverseCompare(((short)2), ones[i])).getIntValue() > 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).reverseCompare(((short)1), ones[i])).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).reverseCompare(((short)2), twos[i])).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).reverseCompare(((short)1), twos[i])).getIntValue() < 0);
      
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).reverseCompare(((int)2), ones[i])).getIntValue() > 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).reverseCompare(((int)1), ones[i])).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).reverseCompare(((int)2), twos[i])).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).reverseCompare(((int)1), twos[i])).getIntValue() < 0);
      
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).reverseCompare(((long)2), ones[i])).getIntValue() > 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).reverseCompare(((long)1), ones[i])).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).reverseCompare(((long)2), twos[i])).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).reverseCompare(((long)1), twos[i])).getIntValue() < 0);
      
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).reverseCompare(((float)2), ones[i])).getIntValue() > 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).reverseCompare(((float)1), ones[i])).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).reverseCompare(((float)2), twos[i])).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).reverseCompare(((float)1), twos[i])).getIntValue() < 0);
      
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).reverseCompare(((double)2), ones[i])).getIntValue() > 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).reverseCompare(((double)1), ones[i])).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).reverseCompare(((double)2), twos[i])).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).reverseCompare(((double)1), twos[i])).getIntValue() < 0);
      
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).reverseCompare(twoBigInt, ones[i])).getIntValue() > 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).reverseCompare(oneBigInt, ones[i])).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).reverseCompare(twoBigInt, twos[i])).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).reverseCompare(oneBigInt, twos[i])).getIntValue() < 0);
      
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).reverseCompare(twoBigDecimal, ones[i])).getIntValue() > 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).reverseCompare(oneBigDecimal, ones[i])).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).reverseCompare(twoBigDecimal, twos[i])).getIntValue() == 0);
      assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).reverseCompare(oneBigDecimal, twos[i])).getIntValue() < 0);
      
      for (int j = 0; j != twos.length; j++) {
        assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).compare(ones[i], twos[j])).getIntValue() < 0);
        assertTrue(((NgInt)registry.getRuntimeMetaClass(ones[i]).compare(ones[i], ones[j])).getIntValue() == 0);
        assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).compare(twos[i], twos[j])).getIntValue() == 0);
        assertTrue(((NgInt)registry.getRuntimeMetaClass(twos[i]).compare(twos[i], ones[j])).getIntValue() > 0);
      }      
    }
    
    try {
      registry.getRuntimeMetaClass(Object.class).compare(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare(new Object(), (BigInteger)oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).compare(new Object(), (BigDecimal)oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      registry.getRuntimeMetaClass(Object.class).reverseCompare((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseCompare((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseCompare((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseCompare((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseCompare((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseCompare((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseCompare((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseCompare((BigInteger)oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseCompare((BigDecimal)oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testEquals() {
  final boolean b1 = false, b2 = true, b3 = true, b4 = false;
  
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(oneBigInt, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(oneBigInt, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(twoBigInt, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(twoBigInt, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(oneBigInt, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(oneBigInt, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(twoBigInt, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(twoBigInt, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(oneBigInt, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(oneBigInt, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(twoBigInt, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(twoBigInt, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(oneBigInt, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(oneBigInt, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(twoBigInt, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(twoBigInt, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(oneBigInt, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(oneBigInt, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(twoBigInt, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(twoBigInt, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(oneBigInt, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(oneBigInt, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(twoBigInt, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(twoBigInt, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(oneBigInt, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(oneBigInt, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(twoBigInt, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(twoBigInt, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(oneBigInt, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(oneBigInt, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(twoBigInt, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(twoBigInt, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(oneBigInt, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(oneBigInt, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(twoBigInt, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(twoBigInt, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(oneBigInt, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(oneBigInt, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(twoBigInt, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).equals(twoBigInt, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).equals((byte)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).equals((char)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).equals((short)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).equals((int)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).equals((long)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).equals((float)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).equals((double)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(oneBigDecimal, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(oneBigDecimal, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(twoBigDecimal, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(twoBigDecimal, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(oneBigDecimal, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(oneBigDecimal, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(twoBigDecimal, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(twoBigDecimal, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(oneBigDecimal, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(oneBigDecimal, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(twoBigDecimal, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(twoBigDecimal, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(oneBigDecimal, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(oneBigDecimal, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(twoBigDecimal, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(twoBigDecimal, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(oneBigDecimal, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(oneBigDecimal, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(twoBigDecimal, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(twoBigDecimal, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(oneBigDecimal, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(oneBigDecimal, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(twoBigDecimal, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(twoBigDecimal, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(oneBigDecimal, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(oneBigDecimal, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(twoBigDecimal, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(twoBigDecimal, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(oneBigDecimal, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(oneBigDecimal, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(twoBigDecimal, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(twoBigDecimal, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(oneBigDecimal, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(oneBigDecimal, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(twoBigDecimal, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).equals(twoBigDecimal, oneBigDecimal)).getBooleanValue(), b4);

    try {
      registry.getRuntimeMetaClass(Object.class).equals((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((BigInteger)oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((BigDecimal)oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((BigInteger)oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((BigDecimal)oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((BigInteger)oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((BigDecimal)oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).equals((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).equals((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).equals((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((float) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((double) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((BigInteger)oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((BigDecimal)oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((BigInteger)oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((BigDecimal)oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((int) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((BigInteger)oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((BigDecimal)oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((int) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((BigInteger)oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((BigDecimal)oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((byte) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((char) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((short) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((int) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((long) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((float) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((double) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((byte) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((char) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((short) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((int) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((long) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((float) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals((double) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).equals((BigInteger) oneBigInt, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).equals((BigInteger) oneBigInt, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).equals((BigDecimal) oneBigDecimal, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).equals((BigDecimal) oneBigDecimal, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    
    for (int i = 0; i != ones.length; i++) {
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).equals(ones[i], (byte)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).equals(ones[i], (byte)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).equals(twos[i], (byte)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).equals(twos[i], (byte)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).equals(ones[i], (char)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).equals(ones[i], (char)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).equals(twos[i], (char)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).equals(twos[i], (char)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).equals(ones[i], (short)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).equals(ones[i], (short)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).equals(twos[i], (short)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).equals(twos[i], (short)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).equals(ones[i], (int)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).equals(ones[i], (int)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).equals(twos[i], (int)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).equals(twos[i], (int)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).equals(ones[i], (long)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).equals(ones[i], (long)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).equals(twos[i], (long)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).equals(twos[i], (long)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).equals(ones[i], (float)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).equals(ones[i], (float)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).equals(twos[i], (float)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).equals(twos[i], (float)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).equals(ones[i], (double)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).equals(ones[i], (double)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).equals(twos[i], (double)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).equals(twos[i], (double)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).equals(ones[i], twoBigInt)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).equals(ones[i], oneBigInt)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).equals(twos[i], twoBigInt)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).equals(twos[i], oneBigInt)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).equals(ones[i], twoBigDecimal)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).equals(ones[i], oneBigDecimal)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).equals(twos[i], twoBigDecimal)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).equals(twos[i], oneBigDecimal)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseEquals(((byte)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseEquals(((byte)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseEquals(((byte)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseEquals(((byte)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseEquals(((char)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseEquals(((char)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseEquals(((char)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseEquals(((char)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseEquals(((short)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseEquals(((short)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseEquals(((short)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseEquals(((short)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseEquals(((int)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseEquals(((int)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseEquals(((int)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseEquals(((int)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseEquals(((long)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseEquals(((long)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseEquals(((long)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseEquals(((long)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseEquals(((float)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseEquals(((float)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseEquals(((float)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseEquals(((float)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseEquals(((double)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseEquals(((double)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseEquals(((double)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseEquals(((double)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseEquals(twoBigInt, ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseEquals(oneBigInt, ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseEquals(twoBigInt, twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseEquals(oneBigInt, twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseEquals(twoBigDecimal, ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseEquals(oneBigDecimal, ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseEquals(twoBigDecimal, twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseEquals(oneBigDecimal, twos[i])).getBooleanValue(), b1);
      
      for (int j = 0; j != twos.length; j++) {
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).equals(ones[i], twos[j])).getBooleanValue(), b1);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).equals(ones[i], ones[j])).getBooleanValue(), b2);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).equals(twos[i], twos[j])).getBooleanValue(), b3);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).equals(twos[i], ones[j])).getBooleanValue(), b4);
      }      
    }
    
    try {
      registry.getRuntimeMetaClass(Object.class).equals(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals(new Object(), (BigInteger)oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).equals(new Object(), (BigDecimal)oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      registry.getRuntimeMetaClass(Object.class).reverseEquals((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseEquals((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseEquals((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseEquals((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseEquals((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseEquals((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseEquals((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseEquals((BigInteger)oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseEquals((BigDecimal)oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }

  public void testNotEquals() {
    final boolean b1 = true, b2 = false, b3 = false, b4 = true;
    
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, (byte)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, (byte)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, (byte)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, (byte)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, (char)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, (char)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, (char)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, (char)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, (short)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, (short)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, (short)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, (short)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, (int)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, (int)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, (int)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, (int)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, (long)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, (long)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, (long)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, (long)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, (float)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, (float)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, (float)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, (float)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, (double)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, (double)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, (double)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, (double)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)1, (byte)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)1, (byte)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)2, (byte)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)2, (byte)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)1, (char)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)1, (char)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)2, (char)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)2, (char)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)1, (short)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)1, (short)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)2, (short)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)2, (short)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)1, (int)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)1, (int)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)2, (int)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)2, (int)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)1, (long)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)1, (long)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)2, (long)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)2, (long)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)1, (float)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)1, (float)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)2, (float)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)2, (float)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)1, (double)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)1, (double)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)2, (double)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)2, (double)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)1, (byte)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)1, (byte)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)2, (byte)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)2, (byte)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)1, (char)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)1, (char)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)2, (char)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)2, (char)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)1, (short)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)1, (short)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)2, (short)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)2, (short)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)1, (int)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)1, (int)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)2, (int)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)2, (int)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)1, (long)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)1, (long)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)2, (long)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)2, (long)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)1, (float)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)1, (float)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)2, (float)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)2, (float)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)1, (double)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)1, (double)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)2, (double)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)2, (double)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)1, (byte)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)1, (byte)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)2, (byte)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)2, (byte)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)1, (char)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)1, (char)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)2, (char)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)2, (char)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)1, (short)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)1, (short)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)2, (short)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)2, (short)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)1, (int)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)1, (int)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)2, (int)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)2, (int)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)1, (long)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)1, (long)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)2, (long)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)2, (long)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)1, (float)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)1, (float)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)2, (float)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)2, (float)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)1, (double)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)1, (double)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)2, (double)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)2, (double)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)1, (byte)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)1, (byte)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)2, (byte)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)2, (byte)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)1, (char)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)1, (char)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)2, (char)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)2, (char)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)1, (short)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)1, (short)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)2, (short)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)2, (short)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)1, (int)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)1, (int)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)2, (int)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)2, (int)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)1, (long)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)1, (long)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)2, (long)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)2, (long)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)1, (float)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)1, (float)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)2, (float)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)2, (float)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)1, (double)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)1, (double)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)2, (double)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)2, (double)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)1, (byte)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)1, (byte)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)2, (byte)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)2, (byte)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)1, (char)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)1, (char)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)2, (char)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)2, (char)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)1, (short)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)1, (short)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)2, (short)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)2, (short)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)1, (int)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)1, (int)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)2, (int)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)2, (int)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)1, (long)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)1, (long)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)2, (long)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)2, (long)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)1, (float)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)1, (float)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)2, (float)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)2, (float)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)1, (double)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)1, (double)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)2, (double)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)2, (double)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)1, (byte)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)1, (byte)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)2, (byte)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)2, (byte)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)1, (char)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)1, (char)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)2, (char)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)2, (char)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)1, (short)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)1, (short)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)2, (short)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)2, (short)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)1, (int)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)1, (int)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)2, (int)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)2, (int)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)1, (long)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)1, (long)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)2, (long)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)2, (long)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)1, (float)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)1, (float)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)2, (float)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)2, (float)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)1, (double)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)1, (double)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)2, (double)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)2, (double)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, twoBigInt)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, oneBigInt)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, twoBigInt)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, oneBigInt)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)1, twoBigInt)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)1, oneBigInt)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)2, twoBigInt)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)2, oneBigInt)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)1, twoBigInt)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)1, oneBigInt)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)2, twoBigInt)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)2, oneBigInt)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)1, twoBigInt)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)1, oneBigInt)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)2, twoBigInt)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)2, oneBigInt)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)1, twoBigInt)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)1, oneBigInt)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)2, twoBigInt)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)2, oneBigInt)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)1, twoBigInt)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)1, oneBigInt)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)2, twoBigInt)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)2, oneBigInt)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)1, twoBigInt)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)1, oneBigInt)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)2, twoBigInt)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)2, oneBigInt)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(oneBigInt, (byte)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(oneBigInt, (byte)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(twoBigInt, (byte)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(twoBigInt, (byte)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(oneBigInt, (char)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(oneBigInt, (char)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(twoBigInt, (char)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(twoBigInt, (char)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(oneBigInt, (short)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(oneBigInt, (short)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(twoBigInt, (short)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(twoBigInt, (short)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(oneBigInt, (int)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(oneBigInt, (int)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(twoBigInt, (int)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(twoBigInt, (int)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(oneBigInt, (long)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(oneBigInt, (long)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(twoBigInt, (long)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(twoBigInt, (long)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(oneBigInt, (float)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(oneBigInt, (float)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(twoBigInt, (float)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(twoBigInt, (float)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(oneBigInt, (double)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(oneBigInt, (double)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(twoBigInt, (double)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(twoBigInt, (double)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(oneBigInt, (byte)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(oneBigInt, (byte)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(twoBigInt, (byte)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(twoBigInt, (byte)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(oneBigInt, twoBigInt)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(oneBigInt, oneBigInt)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(twoBigInt, twoBigInt)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(twoBigInt, oneBigInt)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(oneBigInt, twoBigDecimal)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(oneBigInt, oneBigDecimal)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(twoBigInt, twoBigDecimal)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).notEquals(twoBigInt, oneBigDecimal)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, twoBigDecimal)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, oneBigDecimal)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, twoBigDecimal)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, oneBigDecimal)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)1, twoBigDecimal)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)1, oneBigDecimal)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)2, twoBigDecimal)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).notEquals((char)2, oneBigDecimal)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)1, twoBigDecimal)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)1, oneBigDecimal)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)2, twoBigDecimal)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).notEquals((short)2, oneBigDecimal)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)1, twoBigDecimal)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)1, oneBigDecimal)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)2, twoBigDecimal)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).notEquals((int)2, oneBigDecimal)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)1, twoBigDecimal)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)1, oneBigDecimal)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)2, twoBigDecimal)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).notEquals((long)2, oneBigDecimal)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)1, twoBigDecimal)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)1, oneBigDecimal)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)2, twoBigDecimal)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).notEquals((float)2, oneBigDecimal)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)1, twoBigDecimal)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)1, oneBigDecimal)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)2, twoBigDecimal)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).notEquals((double)2, oneBigDecimal)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(oneBigDecimal, (byte)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(oneBigDecimal, (byte)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(twoBigDecimal, (byte)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(twoBigDecimal, (byte)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(oneBigDecimal, (char)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(oneBigDecimal, (char)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(twoBigDecimal, (char)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(twoBigDecimal, (char)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(oneBigDecimal, (short)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(oneBigDecimal, (short)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(twoBigDecimal, (short)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(twoBigDecimal, (short)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(oneBigDecimal, (int)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(oneBigDecimal, (int)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(twoBigDecimal, (int)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(twoBigDecimal, (int)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(oneBigDecimal, (long)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(oneBigDecimal, (long)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(twoBigDecimal, (long)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(twoBigDecimal, (long)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(oneBigDecimal, (float)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(oneBigDecimal, (float)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(twoBigDecimal, (float)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(twoBigDecimal, (float)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(oneBigDecimal, (double)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(oneBigDecimal, (double)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(twoBigDecimal, (double)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(twoBigDecimal, (double)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(oneBigDecimal, twoBigInt)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(oneBigDecimal, oneBigInt)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(twoBigDecimal, twoBigInt)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(twoBigDecimal, oneBigInt)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(oneBigDecimal, twoBigDecimal)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(oneBigDecimal, oneBigDecimal)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(twoBigDecimal, twoBigDecimal)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).notEquals(twoBigDecimal, oneBigDecimal)).getBooleanValue(), b4);

      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((byte) 1, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((char) 1, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((short) 1, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((int) 1, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((long) 1, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((float) 1, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((double) 1, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((BigInteger)oneBigInt, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((BigDecimal)oneBigDecimal, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((byte) 1, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((char) 1, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((short) 1, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((int) 1, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((long) 1, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((float) 1, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((double) 1, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((BigInteger)oneBigInt, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((BigDecimal)oneBigDecimal, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((byte) 1, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((char) 1, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((short) 1, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((int) 1, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((long) 1, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((float) 1, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((double) 1, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((BigInteger)oneBigInt, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((BigDecimal)oneBigDecimal, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((byte) 1, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((char) 1, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {
      }
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((short) 1, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {
      }
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((int) 1, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {
      }
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((long) 1, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((float) 1, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((double) 1, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((BigInteger)oneBigInt, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((BigDecimal)oneBigDecimal, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((byte) 1, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((char) 1, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((short) 1, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((int) 1, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((long) 1, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((float) 1, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((double) 1, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((BigInteger)oneBigInt, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((BigDecimal)oneBigDecimal, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((byte) 1, (float) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((char) 1, (float) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((short) 1, (float) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((int) 1, (float) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((long) 1, (float) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((float) 1, (float) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((double) 1, (float) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((BigInteger)oneBigInt, (float) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((BigDecimal)oneBigDecimal, (float) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((byte) 1, (double) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((char) 1, (double) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((short) 1, (double) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((int) 1, (double) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((long) 1, (double) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((float) 1, (double) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((double) 1, (double) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((BigInteger)oneBigInt, (double) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((BigDecimal)oneBigDecimal, (double) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((byte) 1, (BigInteger) oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((char) 1, (BigInteger) oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((short) 1, (BigInteger) oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((int) 1, (BigInteger) oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((long) 1, (BigInteger) oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((float) 1, (BigInteger) oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((double) 1, (BigInteger) oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((byte) 1, (BigDecimal) oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((char) 1, (BigDecimal) oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((short) 1, (BigDecimal) oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((int) 1, (BigDecimal) oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((long) 1, (BigDecimal) oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((float) 1, (BigDecimal) oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((double) 1, (BigDecimal) oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {} 
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((BigInteger) oneBigInt, (BigInteger) oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {} 
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((BigInteger) oneBigInt, (BigDecimal) oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {} 
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((BigDecimal) oneBigDecimal, (BigInteger) oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {} 
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals((BigDecimal) oneBigDecimal, (BigDecimal) oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {} 
      
      for (int i = 0; i != ones.length; i++) {
        
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).notEquals(ones[i], (byte)2)).getBooleanValue(), b1);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).notEquals(ones[i], (byte)1)).getBooleanValue(), b2);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).notEquals(twos[i], (byte)2)).getBooleanValue(), b3);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).notEquals(twos[i], (byte)1)).getBooleanValue(), b4);
        
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).notEquals(ones[i], (char)2)).getBooleanValue(), b1);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).notEquals(ones[i], (char)1)).getBooleanValue(), b2);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).notEquals(twos[i], (char)2)).getBooleanValue(), b3);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).notEquals(twos[i], (char)1)).getBooleanValue(), b4);
        
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).notEquals(ones[i], (short)2)).getBooleanValue(), b1);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).notEquals(ones[i], (short)1)).getBooleanValue(), b2);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).notEquals(twos[i], (short)2)).getBooleanValue(), b3);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).notEquals(twos[i], (short)1)).getBooleanValue(), b4);
        
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).notEquals(ones[i], (int)2)).getBooleanValue(), b1);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).notEquals(ones[i], (int)1)).getBooleanValue(), b2);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).notEquals(twos[i], (int)2)).getBooleanValue(), b3);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).notEquals(twos[i], (int)1)).getBooleanValue(), b4);
        
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).notEquals(ones[i], (long)2)).getBooleanValue(), b1);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).notEquals(ones[i], (long)1)).getBooleanValue(), b2);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).notEquals(twos[i], (long)2)).getBooleanValue(), b3);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).notEquals(twos[i], (long)1)).getBooleanValue(), b4);
        
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).notEquals(ones[i], (float)2)).getBooleanValue(), b1);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).notEquals(ones[i], (float)1)).getBooleanValue(), b2);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).notEquals(twos[i], (float)2)).getBooleanValue(), b3);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).notEquals(twos[i], (float)1)).getBooleanValue(), b4);
        
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).notEquals(ones[i], (double)2)).getBooleanValue(), b1);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).notEquals(ones[i], (double)1)).getBooleanValue(), b2);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).notEquals(twos[i], (double)2)).getBooleanValue(), b3);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).notEquals(twos[i], (double)1)).getBooleanValue(), b4);
        
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).notEquals(ones[i], twoBigInt)).getBooleanValue(), b1);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).notEquals(ones[i], oneBigInt)).getBooleanValue(), b2);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).notEquals(twos[i], twoBigInt)).getBooleanValue(), b3);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).notEquals(twos[i], oneBigInt)).getBooleanValue(), b4);
        
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).notEquals(ones[i], twoBigDecimal)).getBooleanValue(), b1);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).notEquals(ones[i], oneBigDecimal)).getBooleanValue(), b2);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).notEquals(twos[i], twoBigDecimal)).getBooleanValue(), b3);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).notEquals(twos[i], oneBigDecimal)).getBooleanValue(), b4);
        
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseNotEquals(((byte)2), ones[i])).getBooleanValue(), b4);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseNotEquals(((byte)1), ones[i])).getBooleanValue(), b3);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseNotEquals(((byte)2), twos[i])).getBooleanValue(), b2);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseNotEquals(((byte)1), twos[i])).getBooleanValue(), b1);
        
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseNotEquals(((char)2), ones[i])).getBooleanValue(), b4);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseNotEquals(((char)1), ones[i])).getBooleanValue(), b3);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseNotEquals(((char)2), twos[i])).getBooleanValue(), b2);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseNotEquals(((char)1), twos[i])).getBooleanValue(), b1);
        
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseNotEquals(((short)2), ones[i])).getBooleanValue(), b4);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseNotEquals(((short)1), ones[i])).getBooleanValue(), b3);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseNotEquals(((short)2), twos[i])).getBooleanValue(), b2);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseNotEquals(((short)1), twos[i])).getBooleanValue(), b1);
        
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseNotEquals(((int)2), ones[i])).getBooleanValue(), b4);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseNotEquals(((int)1), ones[i])).getBooleanValue(), b3);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseNotEquals(((int)2), twos[i])).getBooleanValue(), b2);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseNotEquals(((int)1), twos[i])).getBooleanValue(), b1);
        
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseNotEquals(((long)2), ones[i])).getBooleanValue(), b4);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseNotEquals(((long)1), ones[i])).getBooleanValue(), b3);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseNotEquals(((long)2), twos[i])).getBooleanValue(), b2);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseNotEquals(((long)1), twos[i])).getBooleanValue(), b1);
        
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseNotEquals(((float)2), ones[i])).getBooleanValue(), b4);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseNotEquals(((float)1), ones[i])).getBooleanValue(), b3);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseNotEquals(((float)2), twos[i])).getBooleanValue(), b2);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseNotEquals(((float)1), twos[i])).getBooleanValue(), b1);
        
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseNotEquals(((double)2), ones[i])).getBooleanValue(), b4);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseNotEquals(((double)1), ones[i])).getBooleanValue(), b3);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseNotEquals(((double)2), twos[i])).getBooleanValue(), b2);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseNotEquals(((double)1), twos[i])).getBooleanValue(), b1);
        
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseNotEquals(twoBigInt, ones[i])).getBooleanValue(), b4);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseNotEquals(oneBigInt, ones[i])).getBooleanValue(), b3);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseNotEquals(twoBigInt, twos[i])).getBooleanValue(), b2);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseNotEquals(oneBigInt, twos[i])).getBooleanValue(), b1);
        
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseNotEquals(twoBigDecimal, ones[i])).getBooleanValue(), b4);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseNotEquals(oneBigDecimal, ones[i])).getBooleanValue(), b3);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseNotEquals(twoBigDecimal, twos[i])).getBooleanValue(), b2);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseNotEquals(oneBigDecimal, twos[i])).getBooleanValue(), b1);
        
        for (int j = 0; j != twos.length; j++) {
          assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).notEquals(ones[i], twos[j])).getBooleanValue(), b1);
          assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).notEquals(ones[i], ones[j])).getBooleanValue(), b2);
          assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).notEquals(twos[i], twos[j])).getBooleanValue(), b3);
          assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).notEquals(twos[i], ones[j])).getBooleanValue(), b4);
        }      
      }
      
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals(new Object(), new Object());
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals(new Object(), (byte)1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals(new Object(), (char)1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals(new Object(), (short)1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals(new Object(), (int)1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals(new Object(), (long)1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals(new Object(), (float)1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals(new Object(), (double)1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals(new Object(), (BigInteger)oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).notEquals(new Object(), (BigDecimal)oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      
      try {
        registry.getRuntimeMetaClass(Object.class).reverseNotEquals((byte)1, new Object());
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).reverseNotEquals((char)1, new Object());
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).reverseNotEquals((short)1, new Object());
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).reverseNotEquals((int)1, new Object());
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).reverseNotEquals((long)1, new Object());
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).reverseNotEquals((float)1, new Object());
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).reverseNotEquals((double)1, new Object());
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).reverseNotEquals((BigInteger)oneBigInt, new Object());
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        registry.getRuntimeMetaClass(Object.class).reverseNotEquals((BigDecimal)oneBigDecimal, new Object());
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
    }
  
  public void testLessThan() {
  final boolean b1 = true, b2 = false, b3 = false, b4 = false;
  
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(oneBigInt, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(oneBigInt, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(twoBigInt, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(twoBigInt, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(oneBigInt, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(oneBigInt, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(twoBigInt, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(twoBigInt, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(oneBigInt, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(oneBigInt, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(twoBigInt, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(twoBigInt, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(oneBigInt, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(oneBigInt, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(twoBigInt, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(twoBigInt, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(oneBigInt, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(oneBigInt, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(twoBigInt, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(twoBigInt, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(oneBigInt, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(oneBigInt, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(twoBigInt, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(twoBigInt, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(oneBigInt, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(oneBigInt, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(twoBigInt, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(twoBigInt, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(oneBigInt, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(oneBigInt, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(twoBigInt, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(twoBigInt, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(oneBigInt, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(oneBigInt, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(twoBigInt, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(twoBigInt, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(oneBigInt, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(oneBigInt, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(twoBigInt, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThan(twoBigInt, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThan((char)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThan((short)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThan((int)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThan((long)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThan((float)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThan((double)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(oneBigDecimal, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(oneBigDecimal, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(twoBigDecimal, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(twoBigDecimal, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(oneBigDecimal, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(oneBigDecimal, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(twoBigDecimal, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(twoBigDecimal, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(oneBigDecimal, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(oneBigDecimal, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(twoBigDecimal, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(twoBigDecimal, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(oneBigDecimal, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(oneBigDecimal, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(twoBigDecimal, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(twoBigDecimal, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(oneBigDecimal, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(oneBigDecimal, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(twoBigDecimal, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(twoBigDecimal, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(oneBigDecimal, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(oneBigDecimal, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(twoBigDecimal, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(twoBigDecimal, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(oneBigDecimal, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(oneBigDecimal, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(twoBigDecimal, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(twoBigDecimal, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(oneBigDecimal, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(oneBigDecimal, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(twoBigDecimal, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(twoBigDecimal, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(oneBigDecimal, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(oneBigDecimal, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(twoBigDecimal, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThan(twoBigDecimal, oneBigDecimal)).getBooleanValue(), b4);

    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((BigInteger)oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((BigDecimal)oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((BigInteger)oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((BigDecimal)oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((BigInteger)oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((BigDecimal)oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((float) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((double) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((BigInteger)oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((BigDecimal)oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((BigInteger)oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((BigDecimal)oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((int) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((BigInteger)oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((BigDecimal)oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((int) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((BigInteger)oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((BigDecimal)oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((byte) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((char) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((short) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((int) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((long) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((float) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((double) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((byte) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((char) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((short) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((int) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((long) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((float) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((double) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((BigInteger) oneBigInt, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((BigInteger) oneBigInt, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((BigDecimal) oneBigDecimal, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan((BigDecimal) oneBigDecimal, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    
    for (int i = 0; i != ones.length; i++) {
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThan(ones[i], (byte)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThan(ones[i], (byte)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThan(twos[i], (byte)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThan(twos[i], (byte)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThan(ones[i], (char)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThan(ones[i], (char)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThan(twos[i], (char)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThan(twos[i], (char)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThan(ones[i], (short)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThan(ones[i], (short)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThan(twos[i], (short)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThan(twos[i], (short)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThan(ones[i], (int)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThan(ones[i], (int)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThan(twos[i], (int)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThan(twos[i], (int)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThan(ones[i], (long)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThan(ones[i], (long)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThan(twos[i], (long)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThan(twos[i], (long)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThan(ones[i], (float)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThan(ones[i], (float)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThan(twos[i], (float)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThan(twos[i], (float)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThan(ones[i], (double)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThan(ones[i], (double)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThan(twos[i], (double)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThan(twos[i], (double)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThan(ones[i], twoBigInt)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThan(ones[i], oneBigInt)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThan(twos[i], twoBigInt)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThan(twos[i], oneBigInt)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThan(ones[i], twoBigDecimal)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThan(ones[i], oneBigDecimal)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThan(twos[i], twoBigDecimal)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThan(twos[i], oneBigDecimal)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThan(((byte)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThan(((byte)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThan(((byte)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThan(((byte)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThan(((char)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThan(((char)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThan(((char)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThan(((char)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThan(((short)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThan(((short)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThan(((short)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThan(((short)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThan(((int)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThan(((int)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThan(((int)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThan(((int)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThan(((long)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThan(((long)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThan(((long)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThan(((long)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThan(((float)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThan(((float)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThan(((float)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThan(((float)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThan(((double)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThan(((double)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThan(((double)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThan(((double)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThan(twoBigInt, ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThan(oneBigInt, ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThan(twoBigInt, twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThan(oneBigInt, twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThan(twoBigDecimal, ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThan(oneBigDecimal, ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThan(twoBigDecimal, twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThan(oneBigDecimal, twos[i])).getBooleanValue(), b1);
     
      for (int j = 0; j != twos.length; j++) {
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThan(ones[i], twos[j])).getBooleanValue(), b1);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThan(ones[i], ones[j])).getBooleanValue(), b2);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThan(twos[i], twos[j])).getBooleanValue(), b3);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThan(twos[i], ones[j])).getBooleanValue(), b4);
      }      
    }
    
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan(new Object(), (BigInteger)oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThan(new Object(), (BigDecimal)oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLessThan((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLessThan((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLessThan((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLessThan((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLessThan((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLessThan((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLessThan((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLessThan((BigInteger)oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLessThan((BigDecimal)oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
     
  public void testLessThanOrEquals() {
  final boolean b1 = true, b2 = true, b3 = true, b4 = false;
  
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(oneBigInt, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(oneBigInt, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(twoBigInt, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(twoBigInt, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(oneBigInt, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(oneBigInt, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(twoBigInt, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(twoBigInt, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(oneBigInt, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(oneBigInt, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(twoBigInt, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(twoBigInt, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(oneBigInt, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(oneBigInt, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(twoBigInt, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(twoBigInt, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(oneBigInt, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(oneBigInt, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(twoBigInt, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(twoBigInt, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(oneBigInt, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(oneBigInt, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(twoBigInt, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(twoBigInt, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(oneBigInt, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(oneBigInt, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(twoBigInt, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(twoBigInt, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(oneBigInt, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(oneBigInt, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(twoBigInt, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(twoBigInt, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(oneBigInt, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(oneBigInt, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(twoBigInt, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(twoBigInt, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(oneBigInt, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(oneBigInt, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(twoBigInt, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(twoBigInt, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(oneBigDecimal, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(oneBigDecimal, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(twoBigDecimal, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(twoBigDecimal, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(oneBigDecimal, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(oneBigDecimal, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(twoBigDecimal, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(twoBigDecimal, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(oneBigDecimal, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(oneBigDecimal, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(twoBigDecimal, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(twoBigDecimal, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(oneBigDecimal, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(oneBigDecimal, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(twoBigDecimal, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(twoBigDecimal, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(oneBigDecimal, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(oneBigDecimal, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(twoBigDecimal, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(twoBigDecimal, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(oneBigDecimal, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(oneBigDecimal, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(twoBigDecimal, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(twoBigDecimal, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(oneBigDecimal, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(oneBigDecimal, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(twoBigDecimal, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(twoBigDecimal, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(oneBigDecimal, twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(oneBigDecimal, oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(twoBigDecimal, twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(twoBigDecimal, oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(oneBigDecimal, twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(oneBigDecimal, oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(twoBigDecimal, twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(twoBigDecimal, oneBigDecimal)).getBooleanValue(), b4);

    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigInteger)oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigDecimal)oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigInteger)oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigDecimal)oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigInteger)oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigDecimal)oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((float) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((double) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigInteger)oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigDecimal)oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigInteger)oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigDecimal)oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((int) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigInteger)oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigDecimal)oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((int) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigInteger)oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigDecimal)oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((byte) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((char) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((short) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((int) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((long) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((float) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((double) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((byte) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((char) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((short) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((int) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((long) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((float) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((double) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigInteger) oneBigInt, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigInteger) oneBigInt, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigDecimal) oneBigDecimal, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigDecimal) oneBigDecimal, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    
    for (int i = 0; i != ones.length; i++) {
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThanOrEquals(ones[i], (byte)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThanOrEquals(ones[i], (byte)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThanOrEquals(twos[i], (byte)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThanOrEquals(twos[i], (byte)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThanOrEquals(ones[i], (char)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThanOrEquals(ones[i], (char)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThanOrEquals(twos[i], (char)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThanOrEquals(twos[i], (char)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThanOrEquals(ones[i], (short)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThanOrEquals(ones[i], (short)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThanOrEquals(twos[i], (short)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThanOrEquals(twos[i], (short)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThanOrEquals(ones[i], (int)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThanOrEquals(ones[i], (int)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThanOrEquals(twos[i], (int)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThanOrEquals(twos[i], (int)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThanOrEquals(ones[i], (long)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThanOrEquals(ones[i], (long)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThanOrEquals(twos[i], (long)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThanOrEquals(twos[i], (long)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThanOrEquals(ones[i], (float)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThanOrEquals(ones[i], (float)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThanOrEquals(twos[i], (float)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThanOrEquals(twos[i], (float)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThanOrEquals(ones[i], (double)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThanOrEquals(ones[i], (double)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThanOrEquals(twos[i], (double)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThanOrEquals(twos[i], (double)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThanOrEquals(ones[i], twoBigInt)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThanOrEquals(ones[i], oneBigInt)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThanOrEquals(twos[i], twoBigInt)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThanOrEquals(twos[i], oneBigInt)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThanOrEquals(ones[i], twoBigDecimal)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThanOrEquals(ones[i], oneBigDecimal)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThanOrEquals(twos[i], twoBigDecimal)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThanOrEquals(twos[i], oneBigDecimal)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThanOrEquals(((byte)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThanOrEquals(((byte)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThanOrEquals(((byte)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThanOrEquals(((byte)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThanOrEquals(((char)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThanOrEquals(((char)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThanOrEquals(((char)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThanOrEquals(((char)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThanOrEquals(((short)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThanOrEquals(((short)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThanOrEquals(((short)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThanOrEquals(((short)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThanOrEquals(((int)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThanOrEquals(((int)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThanOrEquals(((int)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThanOrEquals(((int)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThanOrEquals(((long)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThanOrEquals(((long)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThanOrEquals(((long)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThanOrEquals(((long)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThanOrEquals(((float)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThanOrEquals(((float)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThanOrEquals(((float)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThanOrEquals(((float)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThanOrEquals(((double)2), ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThanOrEquals(((double)1), ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThanOrEquals(((double)2), twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThanOrEquals(((double)1), twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThanOrEquals(twoBigInt, ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThanOrEquals(oneBigInt, ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThanOrEquals(twoBigInt, twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThanOrEquals(oneBigInt, twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThanOrEquals(twoBigDecimal, ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).reverseLessThanOrEquals(oneBigDecimal, ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThanOrEquals(twoBigDecimal, twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).reverseLessThanOrEquals(oneBigDecimal, twos[i])).getBooleanValue(), b1);
      
      for (int j = 0; j != twos.length; j++) {
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThanOrEquals(ones[i], twos[j])).getBooleanValue(), b1);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(ones[i]).lessThanOrEquals(ones[i], ones[j])).getBooleanValue(), b2);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThanOrEquals(twos[i], twos[j])).getBooleanValue(), b3);
        assertEquals(((NgBoolean)registry.getRuntimeMetaClass(twos[i]).lessThanOrEquals(twos[i], ones[j])).getBooleanValue(), b4);
      }      
    }
    
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals(new Object(), (BigInteger)oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).lessThanOrEquals(new Object(), (BigDecimal)oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLessThanOrEquals((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLessThanOrEquals((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLessThanOrEquals((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLessThanOrEquals((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLessThanOrEquals((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLessThanOrEquals((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLessThanOrEquals((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLessThanOrEquals((BigInteger)oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseLessThanOrEquals((BigDecimal)oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
}
