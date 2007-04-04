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

import junit.framework.TestCase;
import ng.runtime.MetaClassRegistry;
import ng.runtime.NgBoolean;
import ng.runtime.NgByte;
import ng.runtime.NgChar;
import ng.runtime.NgDouble;
import ng.runtime.NgFloat;
import ng.runtime.NgInt;
import ng.runtime.NgLong;
import ng.runtime.NgShort;

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
  
  Object[] ones = new Object[] {this.oneByte, this.oneChar, this.oneShort, this.oneInt, this.oneLong, this.oneFloat, this.oneDouble, this.oneBigInt, this.oneBigDecimal};
  Object[] twos = new Object[] {this.twoByte, this.twoChar, this.twoShort, this.twoInt, this.twoLong, this.twoFloat, this.twoDouble, this.twoBigInt, this.twoBigDecimal};
  
  Object[] integralOnes = new Object[] {this.oneByte, this.oneChar, this.oneShort, this.oneInt, this.oneLong, this.oneBigInt};
  Object[] integralTwos = new Object[] {this.twoByte, this.twoChar, this.twoShort, this.twoInt, this.twoLong, this.twoBigInt};
  
  Object[] logicalShiftIntegralOnes = new Object[] {this.oneByte, this.oneChar, this.oneShort, this.oneInt, this.oneLong};
  Object[] logicalShiftIntegralTwos = new Object[] {this.twoByte, this.twoChar, this.twoShort, this.twoInt, this.twoLong};
  
  Map<Class, Class> allIntsType = new HashMap<Class, Class>();
  {
    this.allIntsType.put(byte.class, int.class);
    this.allIntsType.put(char.class, int.class);
    this.allIntsType.put(short.class, int.class);
    this.allIntsType.put(int.class, int.class);
    this.allIntsType.put(long.class, int.class);
    this.allIntsType.put(BigInteger.class, int.class);
  }
  
  Map<Class, Class> integralType = new HashMap<Class, Class>();
  {
    this.integralType.put(byte.class, int.class);
    this.integralType.put(char.class, int.class);
    this.integralType.put(short.class, int.class);
    this.integralType.put(int.class, int.class);
    this.integralType.put(long.class, long.class);
    this.integralType.put(float.class, float.class);
    this.integralType.put(double.class, double.class);
    this.integralType.put(BigInteger.class, BigInteger.class);
    this.integralType.put(BigDecimal.class, BigDecimal.class);
  }
  
  Map<Class, Class> allLongsType = new HashMap<Class, Class>();
  {
    this.allLongsType.put(byte.class, long.class);
    this.allLongsType.put(char.class, long.class);
    this.allLongsType.put(short.class, long.class);
    this.allLongsType.put(int.class, long.class);
    this.allLongsType.put(long.class, long.class);
    this.allLongsType.put(BigInteger.class, long.class);
  }
  
  Map<Class, Class> longType = new HashMap<Class, Class>();
  {
    this.longType.put(byte.class, long.class);
    this.longType.put(char.class, long.class);
    this.longType.put(short.class, long.class);
    this.longType.put(int.class, long.class);
    this.longType.put(long.class, long.class);
    this.longType.put(float.class, float.class);
    this.longType.put(double.class, double.class);
    this.longType.put(BigInteger.class, BigInteger.class);
    this.longType.put(BigDecimal.class, BigDecimal.class);
  }
  
  Map<Class, Class> floatType = new HashMap<Class, Class>();
  {
    this.floatType.put(byte.class, float.class);
    this.floatType.put(char.class, float.class);
    this.floatType.put(short.class, float.class);
    this.floatType.put(int.class, float.class);
    this.floatType.put(long.class, float.class);
    this.floatType.put(float.class, float.class);
    this.floatType.put(double.class, double.class);
    this.floatType.put(BigInteger.class, float.class);
    this.floatType.put(BigDecimal.class, BigDecimal.class);
  }
  
  Map<Class, Class> doubleType = new HashMap<Class, Class>();
  {
    this.doubleType.put(byte.class, double.class);
    this.doubleType.put(char.class, double.class);
    this.doubleType.put(short.class, double.class);
    this.doubleType.put(int.class, double.class);
    this.doubleType.put(long.class, double.class);
    this.doubleType.put(float.class, double.class);
    this.doubleType.put(double.class, double.class);
    this.doubleType.put(BigInteger.class, double.class);
    this.doubleType.put(BigDecimal.class, BigDecimal.class);
  }
  
  Map<Class, Class> bigIntegerType = new HashMap<Class, Class>();
  {
    this.bigIntegerType.put(byte.class, BigInteger.class);
    this.bigIntegerType.put(char.class, BigInteger.class);
    this.bigIntegerType.put(short.class, BigInteger.class);
    this.bigIntegerType.put(int.class, BigInteger.class);
    this.bigIntegerType.put(long.class, BigInteger.class);
    this.bigIntegerType.put(float.class, float.class);
    this.bigIntegerType.put(double.class, double.class);
    this.bigIntegerType.put(BigInteger.class, BigInteger.class);
    this.bigIntegerType.put(BigDecimal.class, BigDecimal.class);
  }
  
  Map<Class, Class> bigDecimalType = new HashMap<Class, Class>();
  {
    this.bigDecimalType.put(byte.class, BigDecimal.class);
    this.bigDecimalType.put(char.class, BigDecimal.class);
    this.bigDecimalType.put(short.class, BigDecimal.class);
    this.bigDecimalType.put(int.class, BigDecimal.class);
    this.bigDecimalType.put(long.class, BigDecimal.class);
    this.bigDecimalType.put(float.class, BigDecimal.class);
    this.bigDecimalType.put(double.class, BigDecimal.class);
    this.bigDecimalType.put(BigInteger.class, BigDecimal.class);
    this.bigDecimalType.put(BigDecimal.class, BigDecimal.class);
  }

  Map<Class, Map<Class, Class>> typeConverter = new HashMap<Class, Map<Class, Class>>();
  {
    this.typeConverter.put(byte.class, this.integralType);
    this.typeConverter.put(char.class, this.integralType);
    this.typeConverter.put(short.class, this.integralType);
    this.typeConverter.put(int.class, this.integralType);
    this.typeConverter.put(long.class, this.longType);
    this.typeConverter.put(float.class, this.floatType);
    this.typeConverter.put(double.class, this.doubleType);
    this.typeConverter.put(BigInteger.class, this.bigIntegerType);
    this.typeConverter.put(BigDecimal.class, this.bigDecimalType);
  }

  Map<Class, Map<Class, Class>> shiftTypeConverter = new HashMap<Class, Map<Class, Class>>();
  {
    this.shiftTypeConverter.put(byte.class, this.allIntsType);
    this.shiftTypeConverter.put(char.class, this.allIntsType);
    this.shiftTypeConverter.put(short.class, this.allIntsType);
    this.shiftTypeConverter.put(int.class, this.allIntsType);
    this.shiftTypeConverter.put(long.class, this.allLongsType);
    this.shiftTypeConverter.put(BigInteger.class, this.bigIntegerType);
  }
  
  public void testNot() {
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(boolean.class).not(true)).getBooleanValue(), false);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(boolean.class).not(false)).getBooleanValue(), true);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(NgBoolean.TRUE).not(NgBoolean.TRUE)).getBooleanValue(), false);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(NgBoolean.FALSE).not(NgBoolean.FALSE)).getBooleanValue(), true);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(NgBoolean.TRUE).not(NgBoolean.TRUE)).getBooleanValue(), false);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(NgBoolean.FALSE).not(NgBoolean.FALSE)).getBooleanValue(), true);
    try {
      this.registry.getRuntimeMetaClass(Object.class).not(true);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).not(NgBoolean.TRUE);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testAnd() {
  Object o;
  
    o = this.registry.getRuntimeMetaClass(byte.class).and((byte)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).and((char)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).and((short)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).and(1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).and((long)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).and((byte)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).and((char)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).and((short)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).and(1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).and((long)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).and((byte)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).and((char)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).and((short)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).and(1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).and((long)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).and((byte)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).and((char)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).and((short)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).and(1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).and((long)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).and((byte)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).and((char)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).and((short)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).and(1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).and((long)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).and((byte)1, this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).and((char)1, this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).and((short)1, this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).and(1, this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).and((long)1, this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigInteger.class).and(this.oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).and(this.oneBigInt, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).and(this.oneBigInt, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).and(this.oneBigInt, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).and(this.oneBigInt, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).and(this.oneBigInt, this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      this.registry.getRuntimeMetaClass(Object.class).and((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and(1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and(this.oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and(this.oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and(1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and(this.oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and(this.oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and(1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and(this.oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and(this.oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and((byte) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and((char) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).and((short) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).and(1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).and((long) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and(this.oneBigInt, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and(this.oneBigDecimal, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and(1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and(this.oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and(this.oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and((byte) 1, this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and((char) 1, this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and((short) 1, this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and(1, this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and((long) 1, this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and(this.oneBigInt, this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).and(this.oneBigInt, this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).and(this.oneBigDecimal, this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).and(this.oneBigDecimal, this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 

    for (int i = 0; i != this.integralOnes.length; i++) {
      
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).and(this.integralOnes[i], (byte)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(byte.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).and(this.integralOnes[i], (char)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(char.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).and(this.integralOnes[i], (short)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(short.class),  this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).and(this.integralOnes[i], 1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(int.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).and(this.integralOnes[i], (long)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(long.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).and(this.integralOnes[i], this.oneBigInt);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(BigInteger.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseAnd((byte)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(byte.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseAnd((char)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(char.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseAnd((short)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(short.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseAnd(1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(int.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseAnd((long)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(long.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseAnd(this.oneBigInt, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(BigInteger.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != this.integralTwos.length; j++) {
        o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).and(this.integralOnes[i], this.integralOnes[j]);   
        assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
        assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(this.registry.getRuntimeMetaClass(this.integralOnes[j]).getTheClass(o)),  this.registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).and(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and(new Object(), 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and(new Object(), this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).and(new Object(), this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseAnd((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseAnd((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseAnd((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseAnd(1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseAnd((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseAnd(this.oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testAndEquals() {
  Object o;
  
    o = this.registry.getRuntimeMetaClass(byte.class).andEquals((byte)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).andEquals((char)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).andEquals((short)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).andEquals(1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).andEquals((long)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).andEquals((byte)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).andEquals((char)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).andEquals((short)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).andEquals(1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).andEquals((long)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).andEquals((byte)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).andEquals((char)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).andEquals((short)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).andEquals(1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).andEquals((long)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).andEquals((byte)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).andEquals((char)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).andEquals((short)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).andEquals(1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).andEquals((long)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).andEquals((byte)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).andEquals((char)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).andEquals((short)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).andEquals(1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).andEquals((long)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).andEquals((byte)1, this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).andEquals((char)1, this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).andEquals((short)1, this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).andEquals(1, this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).andEquals((long)1, this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigInteger.class).andEquals(this.oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).andEquals(this.oneBigInt, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).andEquals(this.oneBigInt, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).andEquals(this.oneBigInt, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).andEquals(this.oneBigInt, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).andEquals(this.oneBigInt, this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals(1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals(this.oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals(this.oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals(1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals(this.oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((BigDecimal)this.oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((BigInteger)this.oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((BigDecimal)this.oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((BigInteger)this.oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((BigDecimal)this.oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((BigInteger)this.oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((BigDecimal)this.oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((byte) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((char) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((short) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((int) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((long) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((BigInteger) this.oneBigInt, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((BigInteger) this.oneBigInt, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((BigDecimal) this.oneBigDecimal, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals((BigDecimal) this.oneBigDecimal, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 

    for (int i = 0; i != this.integralOnes.length; i++) {
      
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).andEquals(this.integralOnes[i], (byte)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(byte.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).andEquals(this.integralOnes[i], (char)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(char.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).andEquals(this.integralOnes[i], (short)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(short.class),  this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).andEquals(this.integralOnes[i], (int)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(int.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).andEquals(this.integralOnes[i], (long)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(long.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).andEquals(this.integralOnes[i], (BigInteger)this.oneBigInt);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(BigInteger.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseAndEquals((byte)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(byte.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseAndEquals((char)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(char.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseAndEquals((short)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(short.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseAndEquals((int)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(int.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseAndEquals((long)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(long.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseAndEquals((BigInteger)this.oneBigInt, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(BigInteger.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != this.integralTwos.length; j++) {
        o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).andEquals(this.integralOnes[i], this.integralOnes[j]);   
        assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
        assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(this.registry.getRuntimeMetaClass(this.integralOnes[j]).getTheClass(o)),  this.registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals(new Object(), (BigInteger)this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).andEquals(new Object(), (BigDecimal)this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseAndEquals((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseAndEquals((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseAndEquals((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseAndEquals((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseAndEquals((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseAndEquals((BigInteger)this.oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testOr() {
  Object o;
  
    o = this.registry.getRuntimeMetaClass(byte.class).or((byte)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).or((char)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).or((short)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).or((int)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).or((long)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).or((byte)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).or((char)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).or((short)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).or((int)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).or((long)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).or((byte)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).or((char)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).or((short)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).or((int)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).or((long)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).or((byte)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).or((char)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).or((short)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).or((int)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).or((long)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).or((byte)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).or((char)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).or((short)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).or((int)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).or((long)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).or((byte)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).or((char)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).or((short)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).or((int)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).or((long)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigInteger.class).or((BigInteger)this.oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).or((BigInteger)this.oneBigInt, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).or((BigInteger)this.oneBigInt, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).or((BigInteger)this.oneBigInt, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).or((BigInteger)this.oneBigInt, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).or((BigInteger)this.oneBigInt, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      this.registry.getRuntimeMetaClass(Object.class).or((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((BigInteger)this.oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((BigDecimal)this.oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((BigInteger)this.oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((BigDecimal)this.oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((BigInteger)this.oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((BigDecimal)this.oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((BigInteger)this.oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((BigDecimal)this.oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((BigInteger)this.oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((BigDecimal)this.oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((byte) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((char) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((short) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((int) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((long) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((BigInteger) this.oneBigInt, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((BigInteger) this.oneBigInt, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((BigDecimal) this.oneBigDecimal, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).or((BigDecimal) this.oneBigDecimal, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 

    for (int i = 0; i != this.integralOnes.length; i++) {
      
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).or(this.integralOnes[i], (byte)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(byte.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).or(this.integralOnes[i], (char)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(char.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).or(this.integralOnes[i], (short)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(short.class),  this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).or(this.integralOnes[i], (int)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(int.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).or(this.integralOnes[i], (long)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(long.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).or(this.integralOnes[i], (BigInteger)this.oneBigInt);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(BigInteger.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseOr((byte)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(byte.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseOr((char)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(char.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseOr((short)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(short.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseOr((int)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(int.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseOr((long)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(long.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseOr((BigInteger)this.oneBigInt, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(BigInteger.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != this.integralTwos.length; j++) {
        o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).or(this.integralOnes[i], this.integralOnes[j]);   
        assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
        assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(this.registry.getRuntimeMetaClass(this.integralOnes[j]).getTheClass(o)),  this.registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).or(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or(new Object(), (BigInteger)this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).or(new Object(), (BigDecimal)this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseOr((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseOr((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseOr((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseOr((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseOr((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseOr((BigInteger)this.oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testOrEquals() {
  Object o;
  
    o = this.registry.getRuntimeMetaClass(byte.class).orEquals((byte)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).orEquals((char)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).orEquals((short)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).orEquals((int)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).orEquals((long)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).orEquals((byte)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).orEquals((char)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).orEquals((short)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).orEquals((int)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).orEquals((long)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).orEquals((byte)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).orEquals((char)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).orEquals((short)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).orEquals((int)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).orEquals((long)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).orEquals((byte)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).orEquals((char)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).orEquals((short)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).orEquals((int)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).orEquals((long)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).orEquals((byte)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).orEquals((char)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).orEquals((short)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).orEquals((int)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).orEquals((long)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).orEquals((byte)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).orEquals((char)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).orEquals((short)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).orEquals((int)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).orEquals((long)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigInteger.class).orEquals((BigInteger)this.oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).orEquals((BigInteger)this.oneBigInt, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).orEquals((BigInteger)this.oneBigInt, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).orEquals((BigInteger)this.oneBigInt, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).orEquals((BigInteger)this.oneBigInt, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).orEquals((BigInteger)this.oneBigInt, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((BigInteger)this.oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((BigDecimal)this.oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((BigInteger)this.oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((BigDecimal)this.oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((BigInteger)this.oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((BigDecimal)this.oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((BigInteger)this.oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((BigDecimal)this.oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((BigInteger)this.oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((BigDecimal)this.oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((byte) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((char) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((short) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((int) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((long) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((BigInteger) this.oneBigInt, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((BigInteger) this.oneBigInt, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((BigDecimal) this.oneBigDecimal, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals((BigDecimal) this.oneBigDecimal, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 

    for (int i = 0; i != this.integralOnes.length; i++) {
      
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).orEquals(this.integralOnes[i], (byte)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(byte.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).orEquals(this.integralOnes[i], (char)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(char.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).orEquals(this.integralOnes[i], (short)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(short.class),  this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).orEquals(this.integralOnes[i], (int)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(int.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).orEquals(this.integralOnes[i], (long)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(long.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).orEquals(this.integralOnes[i], (BigInteger)this.oneBigInt);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(BigInteger.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseOrEquals((byte)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(byte.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseOrEquals((char)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(char.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseOrEquals((short)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(short.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseOrEquals((int)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(int.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseOrEquals((long)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(long.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseOrEquals((BigInteger)this.oneBigInt, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(BigInteger.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != this.integralTwos.length; j++) {
        o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).orEquals(this.integralOnes[i], this.integralOnes[j]);   
        assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
        assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(this.registry.getRuntimeMetaClass(this.integralOnes[j]).getTheClass(o)),  this.registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals(new Object(), (BigInteger)this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).orEquals(new Object(), (BigDecimal)this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseOrEquals((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseOrEquals((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseOrEquals((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseOrEquals((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseOrEquals((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseOrEquals((BigInteger)this.oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testXor() {
  Object o;
  
    o = this.registry.getRuntimeMetaClass(byte.class).xor((byte)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).xor((char)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).xor((short)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).xor((int)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).xor((long)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).xor((byte)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).xor((char)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).xor((short)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).xor((int)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).xor((long)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).xor((byte)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).xor((char)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).xor((short)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).xor((int)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).xor((long)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).xor((byte)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).xor((char)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).xor((short)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).xor((int)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).xor((long)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).xor((byte)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).xor((char)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).xor((short)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).xor((int)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).xor((long)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).xor((byte)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).xor((char)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).xor((short)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).xor((int)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).xor((long)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigInteger.class).xor((BigInteger)this.oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).xor((BigInteger)this.oneBigInt, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).xor((BigInteger)this.oneBigInt, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).xor((BigInteger)this.oneBigInt, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).xor((BigInteger)this.oneBigInt, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).xor((BigInteger)this.oneBigInt, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((BigInteger)this.oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((BigDecimal)this.oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((BigInteger)this.oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((BigDecimal)this.oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((BigInteger)this.oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((BigDecimal)this.oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((BigInteger)this.oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((BigDecimal)this.oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((BigInteger)this.oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((BigDecimal)this.oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((byte) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((char) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((short) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((int) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((long) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((BigInteger) this.oneBigInt, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((BigInteger) this.oneBigInt, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((BigDecimal) this.oneBigDecimal, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor((BigDecimal) this.oneBigDecimal, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 

    for (int i = 0; i != this.integralOnes.length; i++) {
      
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).xor(this.integralOnes[i], (byte)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(byte.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).xor(this.integralOnes[i], (char)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(char.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).xor(this.integralOnes[i], (short)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(short.class),  this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).xor(this.integralOnes[i], (int)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(int.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).xor(this.integralOnes[i], (long)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(long.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).xor(this.integralOnes[i], (BigInteger)this.oneBigInt);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(BigInteger.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseXor((byte)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(byte.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseXor((char)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(char.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseXor((short)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(short.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseXor((int)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(int.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseXor((long)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(long.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseXor((BigInteger)this.oneBigInt, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(BigInteger.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != this.integralTwos.length; j++) {
        o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).xor(this.integralOnes[i], this.integralOnes[j]);   
        assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
        assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(this.registry.getRuntimeMetaClass(this.integralOnes[j]).getTheClass(o)),  this.registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor(new Object(), (BigInteger)this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xor(new Object(), (BigDecimal)this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseXor((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseXor((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseXor((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseXor((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseXor((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseXor((BigInteger)this.oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testXorEquals() {
  Object o;
  
    o = this.registry.getRuntimeMetaClass(byte.class).xorEquals((byte)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).xorEquals((char)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).xorEquals((short)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).xorEquals((int)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).xorEquals((long)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).xorEquals((byte)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).xorEquals((char)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).xorEquals((short)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).xorEquals((int)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).xorEquals((long)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).xorEquals((byte)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).xorEquals((char)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).xorEquals((short)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).xorEquals((int)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).xorEquals((long)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).xorEquals((byte)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).xorEquals((char)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).xorEquals((short)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).xorEquals((int)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).xorEquals((long)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).xorEquals((byte)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).xorEquals((char)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).xorEquals((short)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).xorEquals((int)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).xorEquals((long)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).xorEquals((byte)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).xorEquals((char)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).xorEquals((short)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).xorEquals((int)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).xorEquals((long)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigInteger.class).xorEquals((BigInteger)this.oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).xorEquals((BigInteger)this.oneBigInt, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).xorEquals((BigInteger)this.oneBigInt, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).xorEquals((BigInteger)this.oneBigInt, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).xorEquals((BigInteger)this.oneBigInt, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).xorEquals((BigInteger)this.oneBigInt, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    for (int i = 0; i != this.integralOnes.length; i++) {
      
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).xorEquals(this.integralOnes[i], (byte)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(byte.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).xorEquals(this.integralOnes[i], (char)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(char.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).xorEquals(this.integralOnes[i], (short)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(short.class),  this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).xorEquals(this.integralOnes[i], (int)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(int.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).xorEquals(this.integralOnes[i], (long)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(long.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).xorEquals(this.integralOnes[i], (BigInteger)this.oneBigInt);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(BigInteger.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseXorEquals((byte)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(byte.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseXorEquals((char)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(char.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseXorEquals((short)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(short.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseXorEquals((int)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(int.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseXorEquals((long)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(long.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseXorEquals((BigInteger)this.oneBigInt, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(BigInteger.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));

      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((byte) 1, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((char) 1, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((short) 1, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((int) 1, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((long) 1, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((BigInteger)this.oneBigInt, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((BigDecimal)this.oneBigDecimal, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((byte) 1, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((char) 1, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((short) 1, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((int) 1, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((long) 1, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((BigInteger)this.oneBigInt, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((BigDecimal)this.oneBigDecimal, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((byte) 1, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((char) 1, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((short) 1, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((int) 1, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((long) 1, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((BigInteger)this.oneBigInt, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((BigDecimal)this.oneBigDecimal, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((byte) 1, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((char) 1, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {
      }
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((short) 1, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {
      }
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((int) 1, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {
      }
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((long) 1, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((BigInteger)this.oneBigInt, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((BigDecimal)this.oneBigDecimal, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((byte) 1, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((char) 1, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((short) 1, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((int) 1, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((long) 1, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((BigInteger)this.oneBigInt, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((BigDecimal)this.oneBigDecimal, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((byte) 1, (BigInteger) this.oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((char) 1, (BigInteger) this.oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((short) 1, (BigInteger) this.oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((int) 1, (BigInteger) this.oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((long) 1, (BigInteger) this.oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((BigInteger) this.oneBigInt, (BigInteger) this.oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {} 
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((BigInteger) this.oneBigInt, (BigDecimal) this.oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {} 
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((BigDecimal) this.oneBigDecimal, (BigInteger) this.oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {} 
      try {
        this.registry.getRuntimeMetaClass(Object.class).xorEquals((BigDecimal) this.oneBigDecimal, (BigDecimal) this.oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {} 
      
      for (int j = 0; j != this.integralTwos.length; j++) {
        o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).xorEquals(this.integralOnes[i], this.integralOnes[j]);   
        assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
        assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(this.registry.getRuntimeMetaClass(this.integralOnes[j]).getTheClass(o)),  this.registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).xorEquals(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xorEquals(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xorEquals(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xorEquals(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xorEquals(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xorEquals(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xorEquals(new Object(), (BigInteger)this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).xorEquals(new Object(), (BigDecimal)this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseXorEquals((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseXorEquals((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseXorEquals((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseXorEquals((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseXorEquals((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseXorEquals((BigInteger)this.oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testLeftShift() {
  Object o;
  
    o = this.registry.getRuntimeMetaClass(byte.class).leftShift((byte)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).leftShift((char)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).leftShift((short)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).leftShift((int)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).leftShift((long)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).leftShift((byte)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).leftShift((char)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).leftShift((short)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).leftShift((int)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).leftShift((long)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).leftShift((byte)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).leftShift((char)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).leftShift((short)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).leftShift((int)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).leftShift((long)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).leftShift((byte)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).leftShift((char)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).leftShift((short)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).leftShift((int)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).leftShift((long)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).leftShift((byte)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).leftShift((char)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).leftShift((short)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).leftShift((int)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).leftShift((long)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).leftShift((byte)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).leftShift((char)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).leftShift((short)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).leftShift((int)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).leftShift((long)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigInteger.class).leftShift((BigInteger)this.oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).leftShift((BigInteger)this.oneBigInt, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).leftShift((BigInteger)this.oneBigInt, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).leftShift((BigInteger)this.oneBigInt, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).leftShift((BigInteger)this.oneBigInt, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).leftShift((BigInteger)this.oneBigInt, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((BigInteger)this.oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((BigDecimal)this.oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((BigInteger)this.oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((BigDecimal)this.oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((BigInteger)this.oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((BigDecimal)this.oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((BigInteger)this.oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((BigDecimal)this.oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((BigInteger)this.oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((BigDecimal)this.oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((byte) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((char) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((short) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((int) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((long) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((BigInteger) this.oneBigInt, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((BigInteger) this.oneBigInt, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((BigDecimal) this.oneBigDecimal, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift((BigDecimal) this.oneBigDecimal, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 

    for (int i = 0; i != this.integralOnes.length; i++) {
      
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).leftShift(this.integralOnes[i], (byte)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(byte.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).leftShift(this.integralOnes[i], (char)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(char.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).leftShift(this.integralOnes[i], (short)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(short.class),  this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).leftShift(this.integralOnes[i], (int)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(int.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).leftShift(this.integralOnes[i], (long)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(long.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).leftShift(this.integralOnes[i], (BigInteger)this.oneBigInt);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(BigInteger.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseLeftShift((byte)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(byte.class)).get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseLeftShift((char)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(char.class)).get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseLeftShift((short)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(short.class)).get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseLeftShift((int)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(int.class)).get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseLeftShift((long)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(long.class)).get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseLeftShift((BigInteger)this.oneBigInt, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(BigInteger.class)).get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != this.integralTwos.length; j++) {
        o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).leftShift(this.integralOnes[i], this.integralOnes[j]);   
        assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
        assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(this.registry.getRuntimeMetaClass(this.integralOnes[j]).getTheClass(o)),  this.registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift(new Object(), (BigInteger)this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShift(new Object(), (BigDecimal)this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLeftShift((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLeftShift((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLeftShift((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLeftShift((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLeftShift((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLeftShift((BigInteger)this.oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testLeftShiftEquals() {
  Object o;
  
    o = this.registry.getRuntimeMetaClass(byte.class).leftShiftEquals((byte)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).leftShiftEquals((char)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).leftShiftEquals((short)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).leftShiftEquals((int)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).leftShiftEquals((long)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).leftShiftEquals((byte)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).leftShiftEquals((char)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).leftShiftEquals((short)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).leftShiftEquals((int)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).leftShiftEquals((long)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).leftShiftEquals((byte)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).leftShiftEquals((char)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).leftShiftEquals((short)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).leftShiftEquals((int)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).leftShiftEquals((long)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).leftShiftEquals((byte)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).leftShiftEquals((char)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).leftShiftEquals((short)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).leftShiftEquals((int)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).leftShiftEquals((long)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).leftShiftEquals((byte)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).leftShiftEquals((char)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).leftShiftEquals((short)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).leftShiftEquals((int)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).leftShiftEquals((long)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).leftShiftEquals((byte)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).leftShiftEquals((char)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).leftShiftEquals((short)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).leftShiftEquals((int)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).leftShiftEquals((long)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigInteger.class).leftShiftEquals((BigInteger)this.oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).leftShiftEquals((BigInteger)this.oneBigInt, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).leftShiftEquals((BigInteger)this.oneBigInt, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).leftShiftEquals((BigInteger)this.oneBigInt, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).leftShiftEquals((BigInteger)this.oneBigInt, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).leftShiftEquals((BigInteger)this.oneBigInt, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((BigInteger)this.oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((BigDecimal)this.oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((BigInteger)this.oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((BigDecimal)this.oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((BigInteger)this.oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((BigDecimal)this.oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((BigInteger)this.oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((BigDecimal)this.oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((BigInteger)this.oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((BigDecimal)this.oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((byte) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((char) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((short) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((int) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((long) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((BigInteger) this.oneBigInt, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((BigInteger) this.oneBigInt, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((BigDecimal) this.oneBigDecimal, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals((BigDecimal) this.oneBigDecimal, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 

    for (int i = 0; i != this.integralOnes.length; i++) {
      
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).leftShiftEquals(this.integralOnes[i], (byte)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(byte.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).leftShiftEquals(this.integralOnes[i], (char)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(char.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).leftShiftEquals(this.integralOnes[i], (short)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(short.class),  this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).leftShiftEquals(this.integralOnes[i], (int)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(int.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).leftShiftEquals(this.integralOnes[i], (long)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(long.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).leftShiftEquals(this.integralOnes[i], (BigInteger)this.oneBigInt);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(BigInteger.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseLeftShiftEquals((byte)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(byte.class)).get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseLeftShiftEquals((char)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(char.class)).get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseLeftShiftEquals((short)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(short.class)).get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseLeftShiftEquals((int)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(int.class)).get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseLeftShiftEquals((long)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(long.class)).get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseLeftShiftEquals((BigInteger)this.oneBigInt, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(BigInteger.class)).get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != this.integralTwos.length; j++) {
        o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).leftShiftEquals(this.integralOnes[i], this.integralOnes[j]);   
        assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
        assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(this.registry.getRuntimeMetaClass(this.integralOnes[j]).getTheClass(o)),  this.registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals(new Object(), (BigInteger)this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).leftShiftEquals(new Object(), (BigDecimal)this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLeftShiftEquals((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLeftShiftEquals((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLeftShiftEquals((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLeftShiftEquals((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLeftShiftEquals((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLeftShiftEquals((BigInteger)this.oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testArithmeticRightShift() {
  Object o;
  
    o = this.registry.getRuntimeMetaClass(byte.class).arithmeticRightShift((byte)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).arithmeticRightShift((char)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).arithmeticRightShift((short)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).arithmeticRightShift((int)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).arithmeticRightShift((long)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).arithmeticRightShift((byte)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).arithmeticRightShift((char)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).arithmeticRightShift((short)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).arithmeticRightShift((int)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).arithmeticRightShift((long)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).arithmeticRightShift((byte)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).arithmeticRightShift((char)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).arithmeticRightShift((short)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).arithmeticRightShift((int)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).arithmeticRightShift((long)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).arithmeticRightShift((byte)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).arithmeticRightShift((char)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).arithmeticRightShift((short)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).arithmeticRightShift((int)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).arithmeticRightShift((long)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).arithmeticRightShift((byte)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).arithmeticRightShift((char)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).arithmeticRightShift((short)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).arithmeticRightShift((int)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).arithmeticRightShift((long)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).arithmeticRightShift((byte)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).arithmeticRightShift((char)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).arithmeticRightShift((short)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).arithmeticRightShift((int)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).arithmeticRightShift((long)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigInteger.class).arithmeticRightShift((BigInteger)this.oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).arithmeticRightShift((BigInteger)this.oneBigInt, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).arithmeticRightShift((BigInteger)this.oneBigInt, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).arithmeticRightShift((BigInteger)this.oneBigInt, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).arithmeticRightShift((BigInteger)this.oneBigInt, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).arithmeticRightShift((BigInteger)this.oneBigInt, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((BigInteger)this.oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((BigDecimal)this.oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((BigInteger)this.oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((BigDecimal)this.oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((BigInteger)this.oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((BigDecimal)this.oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((BigInteger)this.oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((BigDecimal)this.oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((BigInteger)this.oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((BigDecimal)this.oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((byte) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((char) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((short) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((int) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((long) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((BigInteger) this.oneBigInt, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((BigInteger) this.oneBigInt, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((BigDecimal) this.oneBigDecimal, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift((BigDecimal) this.oneBigDecimal, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 

    for (int i = 0; i != this.integralOnes.length; i++) {
      
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).arithmeticRightShift(this.integralOnes[i], (byte)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(byte.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).arithmeticRightShift(this.integralOnes[i], (char)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(char.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).arithmeticRightShift(this.integralOnes[i], (short)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(short.class),  this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).arithmeticRightShift(this.integralOnes[i], (int)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(int.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).arithmeticRightShift(this.integralOnes[i], (long)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(long.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).arithmeticRightShift(this.integralOnes[i], (BigInteger)this.oneBigInt);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(BigInteger.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseArithmeticRightShift((byte)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(byte.class)).get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseArithmeticRightShift((char)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(char.class)).get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseArithmeticRightShift((short)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(short.class)).get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseArithmeticRightShift((int)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(int.class)).get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseArithmeticRightShift((long)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(long.class)).get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseArithmeticRightShift((BigInteger)this.oneBigInt, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(BigInteger.class)).get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != this.integralTwos.length; j++) {
        o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).arithmeticRightShift(this.integralOnes[i], this.integralOnes[j]);   
        assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
        assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(this.registry.getRuntimeMetaClass(this.integralOnes[j]).getTheClass(o)),  this.registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift(new Object(), (BigInteger)this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShift(new Object(), (BigDecimal)this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseArithmeticRightShift((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseArithmeticRightShift((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseArithmeticRightShift((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseArithmeticRightShift((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseArithmeticRightShift((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseArithmeticRightShift((BigInteger)this.oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testArithmeticRightShiftEquals() {
  Object o;
  
    o = this.registry.getRuntimeMetaClass(byte.class).arithmeticRightShiftEquals((byte)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).arithmeticRightShiftEquals((char)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).arithmeticRightShiftEquals((short)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).arithmeticRightShiftEquals((int)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).arithmeticRightShiftEquals((long)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).arithmeticRightShiftEquals((byte)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).arithmeticRightShiftEquals((char)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).arithmeticRightShiftEquals((short)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).arithmeticRightShiftEquals((int)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).arithmeticRightShiftEquals((long)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).arithmeticRightShiftEquals((byte)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).arithmeticRightShiftEquals((char)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).arithmeticRightShiftEquals((short)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).arithmeticRightShiftEquals((int)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).arithmeticRightShiftEquals((long)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).arithmeticRightShiftEquals((byte)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).arithmeticRightShiftEquals((char)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).arithmeticRightShiftEquals((short)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).arithmeticRightShiftEquals((int)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).arithmeticRightShiftEquals((long)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).arithmeticRightShiftEquals((byte)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).arithmeticRightShiftEquals((char)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).arithmeticRightShiftEquals((short)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).arithmeticRightShiftEquals((int)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).arithmeticRightShiftEquals((long)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).arithmeticRightShiftEquals((byte)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).arithmeticRightShiftEquals((char)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).arithmeticRightShiftEquals((short)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).arithmeticRightShiftEquals((int)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).arithmeticRightShiftEquals((long)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigInteger.class).arithmeticRightShiftEquals((BigInteger)this.oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).arithmeticRightShiftEquals((BigInteger)this.oneBigInt, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).arithmeticRightShiftEquals((BigInteger)this.oneBigInt, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).arithmeticRightShiftEquals((BigInteger)this.oneBigInt, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).arithmeticRightShiftEquals((BigInteger)this.oneBigInt, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).arithmeticRightShiftEquals((BigInteger)this.oneBigInt, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((BigInteger)this.oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((BigDecimal)this.oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((BigInteger)this.oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((BigDecimal)this.oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((BigInteger)this.oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((BigDecimal)this.oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((BigInteger)this.oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((BigDecimal)this.oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((BigInteger)this.oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((BigDecimal)this.oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((byte) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((char) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((short) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((int) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((long) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((BigInteger) this.oneBigInt, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((BigInteger) this.oneBigInt, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((BigDecimal) this.oneBigDecimal, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals((BigDecimal) this.oneBigDecimal, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 

    for (int i = 0; i != this.integralOnes.length; i++) {
      
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).arithmeticRightShiftEquals(this.integralOnes[i], (byte)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(byte.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).arithmeticRightShiftEquals(this.integralOnes[i], (char)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(char.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).arithmeticRightShiftEquals(this.integralOnes[i], (short)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(short.class),  this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).arithmeticRightShiftEquals(this.integralOnes[i], (int)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(int.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).arithmeticRightShiftEquals(this.integralOnes[i], (long)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(long.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).arithmeticRightShiftEquals(this.integralOnes[i], (BigInteger)this.oneBigInt);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(BigInteger.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseArithmeticRightShiftEquals((byte)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(byte.class)).get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseArithmeticRightShiftEquals((char)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(char.class)).get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseArithmeticRightShiftEquals((short)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(short.class)).get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseArithmeticRightShiftEquals((int)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(int.class)).get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseArithmeticRightShiftEquals((long)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(long.class)).get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseArithmeticRightShiftEquals((BigInteger)this.oneBigInt, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(BigInteger.class)).get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != this.integralTwos.length; j++) {
        o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).arithmeticRightShiftEquals(this.integralOnes[i], this.integralOnes[j]);   
        assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
        assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(this.registry.getRuntimeMetaClass(this.integralOnes[j]).getTheClass(o)),  this.registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals(new Object(), (BigInteger)this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).arithmeticRightShiftEquals(new Object(), (BigDecimal)this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseArithmeticRightShiftEquals((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseArithmeticRightShiftEquals((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseArithmeticRightShiftEquals((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseArithmeticRightShiftEquals((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseArithmeticRightShiftEquals((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseArithmeticRightShiftEquals((BigInteger)this.oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testLogicalRightShift() {
  Object o;
  
    o = this.registry.getRuntimeMetaClass(byte.class).logicalRightShift((byte)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).logicalRightShift((char)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).logicalRightShift((short)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).logicalRightShift((int)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).logicalRightShift((long)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).logicalRightShift((byte)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).logicalRightShift((char)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).logicalRightShift((short)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).logicalRightShift((int)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).logicalRightShift((long)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).logicalRightShift((byte)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).logicalRightShift((char)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).logicalRightShift((short)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).logicalRightShift((int)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).logicalRightShift((long)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).logicalRightShift((byte)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).logicalRightShift((char)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).logicalRightShift((short)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).logicalRightShift((int)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).logicalRightShift((long)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).logicalRightShift((byte)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).logicalRightShift((char)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).logicalRightShift((short)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).logicalRightShift((int)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).logicalRightShift((long)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).logicalRightShift((byte)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).logicalRightShift((char)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).logicalRightShift((short)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).logicalRightShift((int)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).logicalRightShift((long)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((BigInteger)this.oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((BigDecimal)this.oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((BigInteger)this.oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((BigDecimal)this.oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((BigInteger)this.oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((BigDecimal)this.oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((BigInteger)this.oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((BigDecimal)this.oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((BigInteger)this.oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((BigDecimal)this.oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((byte) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((char) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((short) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((int) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((long) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((BigInteger) this.oneBigInt, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((BigInteger) this.oneBigInt, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((BigDecimal) this.oneBigDecimal, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift((BigDecimal) this.oneBigDecimal, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 

    for (int i = 0; i != this.logicalShiftIntegralOnes.length; i++) {
      
      o = this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).logicalRightShift(this.logicalShiftIntegralOnes[i], (byte)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).getTheClass(o))).get(byte.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).logicalRightShift(this.logicalShiftIntegralOnes[i], (char)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).getTheClass(o))).get(char.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).logicalRightShift(this.logicalShiftIntegralOnes[i], (short)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).getTheClass(o))).get(short.class),  this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).logicalRightShift(this.logicalShiftIntegralOnes[i], (int)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).getTheClass(o))).get(int.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).logicalRightShift(this.logicalShiftIntegralOnes[i], (long)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).getTheClass(o))).get(long.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).logicalRightShift(this.logicalShiftIntegralOnes[i], (BigInteger)this.oneBigInt);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).getTheClass(o))).get(BigInteger.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).reverseLogicalRightShift((byte)1, this.logicalShiftIntegralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(byte.class)).get(this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).reverseLogicalRightShift((char)1, this.logicalShiftIntegralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(char.class)).get(this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).reverseLogicalRightShift((short)1, this.logicalShiftIntegralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(short.class)).get(this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).reverseLogicalRightShift((int)1, this.logicalShiftIntegralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(int.class)).get(this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).reverseLogicalRightShift((long)1, this.logicalShiftIntegralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(long.class)).get(this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != this.logicalShiftIntegralTwos.length; j++) {
        o = this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).logicalRightShift(this.logicalShiftIntegralOnes[i], this.logicalShiftIntegralOnes[j]);   
        assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
        assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).getTheClass(o))).get(this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[j]).getTheClass(o)),  this.registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift(new Object(), (BigInteger)this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShift(new Object(), (BigDecimal)this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLogicalRightShift((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLogicalRightShift((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLogicalRightShift((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLogicalRightShift((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLogicalRightShift((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testLogicalRightShiftEquals() {
  Object o;
  
    o = this.registry.getRuntimeMetaClass(byte.class).logicalRightShiftEquals((byte)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).logicalRightShiftEquals((char)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).logicalRightShiftEquals((short)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).logicalRightShiftEquals((int)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).logicalRightShiftEquals((long)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).logicalRightShiftEquals((byte)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).logicalRightShiftEquals((char)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).logicalRightShiftEquals((short)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).logicalRightShiftEquals((int)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).logicalRightShiftEquals((long)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).logicalRightShiftEquals((byte)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).logicalRightShiftEquals((char)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).logicalRightShiftEquals((short)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).logicalRightShiftEquals((int)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).logicalRightShiftEquals((long)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).logicalRightShiftEquals((byte)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).logicalRightShiftEquals((char)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).logicalRightShiftEquals((short)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).logicalRightShiftEquals((int)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).logicalRightShiftEquals((long)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).logicalRightShiftEquals((byte)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).logicalRightShiftEquals((char)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).logicalRightShiftEquals((short)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).logicalRightShiftEquals((int)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).logicalRightShiftEquals((long)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).logicalRightShiftEquals((byte)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).logicalRightShiftEquals((char)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).logicalRightShiftEquals((short)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).logicalRightShiftEquals((int)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).logicalRightShiftEquals((long)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((BigInteger)this.oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((BigDecimal)this.oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((BigInteger)this.oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((BigDecimal)this.oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((BigInteger)this.oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((BigDecimal)this.oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((BigInteger)this.oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((BigDecimal)this.oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((BigInteger)this.oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((BigDecimal)this.oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((byte) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((char) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((short) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((int) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((long) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((BigInteger) this.oneBigInt, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((BigInteger) this.oneBigInt, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((BigDecimal) this.oneBigDecimal, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals((BigDecimal) this.oneBigDecimal, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 

    for (int i = 0; i != this.logicalShiftIntegralOnes.length; i++) {
      
      o = this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).logicalRightShiftEquals(this.logicalShiftIntegralOnes[i], (byte)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).getTheClass(o))).get(byte.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).logicalRightShiftEquals(this.logicalShiftIntegralOnes[i], (char)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).getTheClass(o))).get(char.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).logicalRightShiftEquals(this.logicalShiftIntegralOnes[i], (short)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).getTheClass(o))).get(short.class),  this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).logicalRightShiftEquals(this.logicalShiftIntegralOnes[i], (int)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).getTheClass(o))).get(int.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).logicalRightShiftEquals(this.logicalShiftIntegralOnes[i], (long)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).getTheClass(o))).get(long.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).logicalRightShiftEquals(this.logicalShiftIntegralOnes[i], (BigInteger)this.oneBigInt);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).getTheClass(o))).get(BigInteger.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).reverseLogicalRightShiftEquals((byte)1, this.logicalShiftIntegralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(byte.class)).get(this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).reverseLogicalRightShiftEquals((char)1, this.logicalShiftIntegralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(char.class)).get(this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).reverseLogicalRightShiftEquals((short)1, this.logicalShiftIntegralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(short.class)).get(this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).reverseLogicalRightShiftEquals((int)1, this.logicalShiftIntegralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(int.class)).get(this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).reverseLogicalRightShiftEquals((long)1, this.logicalShiftIntegralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.shiftTypeConverter.get(long.class)).get(this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).getTheClass(o)), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != this.logicalShiftIntegralTwos.length; j++) {
        o = this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).logicalRightShiftEquals(this.logicalShiftIntegralOnes[i], this.logicalShiftIntegralOnes[j]);   
        assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
        assertEquals(((Map)this.shiftTypeConverter.get(this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[i]).getTheClass(o))).get(this.registry.getRuntimeMetaClass(this.logicalShiftIntegralOnes[j]).getTheClass(o)),  this.registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals(new Object(), (BigInteger)this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).logicalRightShiftEquals(new Object(), (BigDecimal)this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLogicalRightShiftEquals((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLogicalRightShiftEquals((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLogicalRightShiftEquals((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLogicalRightShiftEquals((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLogicalRightShiftEquals((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testGreaterThanOrEquals () {
  final boolean b1 = false, b2 = true, b3 = true, b4 = true;
  
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.oneBigInt, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.oneBigInt, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.twoBigInt, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.twoBigInt, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.oneBigInt, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.oneBigInt, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.twoBigInt, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.twoBigInt, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.oneBigInt, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.oneBigInt, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.twoBigInt, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.twoBigInt, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.oneBigInt, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.oneBigInt, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.twoBigInt, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.twoBigInt, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.oneBigInt, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.oneBigInt, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.twoBigInt, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.twoBigInt, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.oneBigInt, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.oneBigInt, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.twoBigInt, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.twoBigInt, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.oneBigInt, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.oneBigInt, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.twoBigInt, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.twoBigInt, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.oneBigInt, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.oneBigInt, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.twoBigInt, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.twoBigInt, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.oneBigInt, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.oneBigInt, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.twoBigInt, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.twoBigInt, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.oneBigInt, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.oneBigInt, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.twoBigInt, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThanOrEquals(this.twoBigInt, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThanOrEquals((byte)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThanOrEquals((char)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThanOrEquals((short)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThanOrEquals((int)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThanOrEquals((long)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThanOrEquals((float)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThanOrEquals((double)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.oneBigDecimal, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.oneBigDecimal, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.twoBigDecimal, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.twoBigDecimal, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.oneBigDecimal, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.oneBigDecimal, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.twoBigDecimal, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.twoBigDecimal, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.oneBigDecimal, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.oneBigDecimal, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.twoBigDecimal, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.twoBigDecimal, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.oneBigDecimal, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.oneBigDecimal, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.twoBigDecimal, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.twoBigDecimal, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.oneBigDecimal, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.oneBigDecimal, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.twoBigDecimal, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.twoBigDecimal, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.oneBigDecimal, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.oneBigDecimal, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.twoBigDecimal, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.twoBigDecimal, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.oneBigDecimal, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.oneBigDecimal, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.twoBigDecimal, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.twoBigDecimal, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.oneBigDecimal, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.oneBigDecimal, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.twoBigDecimal, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.twoBigDecimal, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.oneBigDecimal, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.oneBigDecimal, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.twoBigDecimal, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThanOrEquals(this.twoBigDecimal, this.oneBigDecimal)).getBooleanValue(), b4);

    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigInteger)this.oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigDecimal)this.oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigInteger)this.oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigDecimal)this.oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigInteger)this.oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigDecimal)this.oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((float) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((double) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigInteger)this.oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigDecimal)this.oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigInteger)this.oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigDecimal)this.oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((int) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigInteger)this.oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigDecimal)this.oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((int) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigInteger)this.oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigDecimal)this.oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((byte) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((char) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((short) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((int) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((long) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((float) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((double) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((byte) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((char) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((short) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((int) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((long) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((float) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((double) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigInteger) this.oneBigInt, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigInteger) this.oneBigInt, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigDecimal) this.oneBigDecimal, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals((BigDecimal) this.oneBigDecimal, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    
    for (int i = 0; i != this.ones.length; i++) {
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThanOrEquals(this.ones[i], (byte)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThanOrEquals(this.ones[i], (byte)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThanOrEquals(this.twos[i], (byte)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThanOrEquals(this.twos[i], (byte)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThanOrEquals(this.ones[i], (char)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThanOrEquals(this.ones[i], (char)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThanOrEquals(this.twos[i], (char)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThanOrEquals(this.twos[i], (char)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThanOrEquals(this.ones[i], (short)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThanOrEquals(this.ones[i], (short)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThanOrEquals(this.twos[i], (short)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThanOrEquals(this.twos[i], (short)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThanOrEquals(this.ones[i], (int)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThanOrEquals(this.ones[i], (int)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThanOrEquals(this.twos[i], (int)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThanOrEquals(this.twos[i], (int)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThanOrEquals(this.ones[i], (long)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThanOrEquals(this.ones[i], (long)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThanOrEquals(this.twos[i], (long)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThanOrEquals(this.twos[i], (long)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThanOrEquals(this.ones[i], (float)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThanOrEquals(this.ones[i], (float)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThanOrEquals(this.twos[i], (float)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThanOrEquals(this.twos[i], (float)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThanOrEquals(this.ones[i], (double)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThanOrEquals(this.ones[i], (double)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThanOrEquals(this.twos[i], (double)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThanOrEquals(this.twos[i], (double)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThanOrEquals(this.ones[i], this.twoBigInt)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThanOrEquals(this.ones[i], this.oneBigInt)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThanOrEquals(this.twos[i], this.twoBigInt)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThanOrEquals(this.twos[i], this.oneBigInt)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThanOrEquals(this.ones[i], this.twoBigDecimal)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThanOrEquals(this.ones[i], this.oneBigDecimal)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThanOrEquals(this.twos[i], this.twoBigDecimal)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThanOrEquals(this.twos[i], this.oneBigDecimal)).getBooleanValue(), b4);
  
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThanOrEquals(((byte)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThanOrEquals(((byte)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThanOrEquals(((byte)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThanOrEquals(((byte)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThanOrEquals(((char)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThanOrEquals(((char)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThanOrEquals(((char)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThanOrEquals(((char)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThanOrEquals(((short)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThanOrEquals(((short)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThanOrEquals(((short)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThanOrEquals(((short)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThanOrEquals(((int)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThanOrEquals(((int)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThanOrEquals(((int)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThanOrEquals(((int)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThanOrEquals(((long)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThanOrEquals(((long)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThanOrEquals(((long)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThanOrEquals(((long)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThanOrEquals(((float)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThanOrEquals(((float)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThanOrEquals(((float)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThanOrEquals(((float)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThanOrEquals(((double)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThanOrEquals(((double)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThanOrEquals(((double)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThanOrEquals(((double)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThanOrEquals(this.twoBigInt, this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThanOrEquals(this.oneBigInt, this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThanOrEquals(this.twoBigInt, this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThanOrEquals(this.oneBigInt, this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThanOrEquals(this.twoBigDecimal, this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThanOrEquals(this.oneBigDecimal, this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThanOrEquals(this.twoBigDecimal, this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThanOrEquals(this.oneBigDecimal, this.twos[i])).getBooleanValue(), b1);
      
      for (int j = 0; j != this.twos.length; j++) {
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThanOrEquals(this.ones[i], this.twos[j])).getBooleanValue(), b1);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThanOrEquals(this.ones[i], this.ones[j])).getBooleanValue(), b2);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThanOrEquals(this.twos[i], this.twos[j])).getBooleanValue(), b3);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThanOrEquals(this.twos[i], this.ones[j])).getBooleanValue(), b4);
      }      
    }
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals(new Object(), (BigInteger)this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThanOrEquals(new Object(), (BigDecimal)this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseGreaterThanOrEquals((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseGreaterThanOrEquals((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseGreaterThanOrEquals((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseGreaterThanOrEquals((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseGreaterThanOrEquals((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseGreaterThanOrEquals((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseGreaterThanOrEquals((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseGreaterThanOrEquals((BigInteger)this.oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseGreaterThanOrEquals((BigDecimal)this.oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testGreaterThan() {
  final boolean b1 = false, b2 = false, b3 = false, b4 = true;
  
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.oneBigInt, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.oneBigInt, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.twoBigInt, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.twoBigInt, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.oneBigInt, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.oneBigInt, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.twoBigInt, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.twoBigInt, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.oneBigInt, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.oneBigInt, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.twoBigInt, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.twoBigInt, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.oneBigInt, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.oneBigInt, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.twoBigInt, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.twoBigInt, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.oneBigInt, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.oneBigInt, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.twoBigInt, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.twoBigInt, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.oneBigInt, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.oneBigInt, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.twoBigInt, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.twoBigInt, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.oneBigInt, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.oneBigInt, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.twoBigInt, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.twoBigInt, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.oneBigInt, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.oneBigInt, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.twoBigInt, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.twoBigInt, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.oneBigInt, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.oneBigInt, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.twoBigInt, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.twoBigInt, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.oneBigInt, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.oneBigInt, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.twoBigInt, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).greaterThan(this.twoBigInt, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).greaterThan((byte)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).greaterThan((char)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).greaterThan((short)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).greaterThan((int)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).greaterThan((long)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).greaterThan((float)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).greaterThan((double)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.oneBigDecimal, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.oneBigDecimal, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.twoBigDecimal, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.twoBigDecimal, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.oneBigDecimal, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.oneBigDecimal, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.twoBigDecimal, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.twoBigDecimal, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.oneBigDecimal, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.oneBigDecimal, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.twoBigDecimal, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.twoBigDecimal, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.oneBigDecimal, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.oneBigDecimal, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.twoBigDecimal, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.twoBigDecimal, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.oneBigDecimal, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.oneBigDecimal, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.twoBigDecimal, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.twoBigDecimal, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.oneBigDecimal, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.oneBigDecimal, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.twoBigDecimal, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.twoBigDecimal, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.oneBigDecimal, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.oneBigDecimal, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.twoBigDecimal, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.twoBigDecimal, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.oneBigDecimal, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.oneBigDecimal, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.twoBigDecimal, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.twoBigDecimal, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.oneBigDecimal, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.oneBigDecimal, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.twoBigDecimal, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).greaterThan(this.twoBigDecimal, this.oneBigDecimal)).getBooleanValue(), b4);

    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((BigInteger)this.oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((BigDecimal)this.oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((BigInteger)this.oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((BigDecimal)this.oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((BigInteger)this.oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((BigDecimal)this.oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((float) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((double) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((BigInteger)this.oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((BigDecimal)this.oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((BigInteger)this.oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((BigDecimal)this.oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((int) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((BigInteger)this.oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((BigDecimal)this.oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((int) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((BigInteger)this.oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((BigDecimal)this.oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((byte) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((char) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((short) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((int) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((long) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((float) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((double) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((byte) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((char) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((short) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((int) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((long) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((float) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((double) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((BigInteger) this.oneBigInt, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((BigInteger) this.oneBigInt, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((BigDecimal) this.oneBigDecimal, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan((BigDecimal) this.oneBigDecimal, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    
    for (int i = 0; i != this.ones.length; i++) {
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThan(this.ones[i], (byte)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThan(this.ones[i], (byte)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThan(this.twos[i], (byte)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThan(this.twos[i], (byte)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThan(this.ones[i], (char)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThan(this.ones[i], (char)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThan(this.twos[i], (char)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThan(this.twos[i], (char)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThan(this.ones[i], (short)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThan(this.ones[i], (short)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThan(this.twos[i], (short)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThan(this.twos[i], (short)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThan(this.ones[i], (int)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThan(this.ones[i], (int)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThan(this.twos[i], (int)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThan(this.twos[i], (int)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThan(this.ones[i], (long)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThan(this.ones[i], (long)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThan(this.twos[i], (long)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThan(this.twos[i], (long)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThan(this.ones[i], (float)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThan(this.ones[i], (float)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThan(this.twos[i], (float)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThan(this.twos[i], (float)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThan(this.ones[i], (double)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThan(this.ones[i], (double)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThan(this.twos[i], (double)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThan(this.twos[i], (double)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThan(this.ones[i], this.twoBigInt)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThan(this.ones[i], this.oneBigInt)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThan(this.twos[i], this.twoBigInt)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThan(this.twos[i], this.oneBigInt)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThan(this.ones[i], this.twoBigDecimal)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThan(this.ones[i], this.oneBigDecimal)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThan(this.twos[i], this.twoBigDecimal)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThan(this.twos[i], this.oneBigDecimal)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThan(((byte)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThan(((byte)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThan(((byte)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThan(((byte)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThan(((char)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThan(((char)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThan(((char)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThan(((char)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThan(((short)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThan(((short)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThan(((short)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThan(((short)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThan(((int)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThan(((int)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThan(((int)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThan(((int)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThan(((long)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThan(((long)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThan(((long)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThan(((long)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThan(((float)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThan(((float)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThan(((float)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThan(((float)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThan(((double)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThan(((double)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThan(((double)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThan(((double)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThan(this.twoBigInt, this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThan(this.oneBigInt, this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThan(this.twoBigInt, this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThan(this.oneBigInt, this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThan(this.twoBigDecimal, this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseGreaterThan(this.oneBigDecimal, this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThan(this.twoBigDecimal, this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseGreaterThan(this.oneBigDecimal, this.twos[i])).getBooleanValue(), b1);
      
      for (int j = 0; j != this.twos.length; j++) {
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThan(this.ones[i], this.twos[j])).getBooleanValue(), b1);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).greaterThan(this.ones[i], this.ones[j])).getBooleanValue(), b2);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThan(this.twos[i], this.twos[j])).getBooleanValue(), b3);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).greaterThan(this.twos[i], this.ones[j])).getBooleanValue(), b4);
      }      
    }
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan(new Object(), (BigInteger)this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).greaterThan(new Object(), (BigDecimal)this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseGreaterThan((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseGreaterThan((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseGreaterThan((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseGreaterThan((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseGreaterThan((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseGreaterThan((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseGreaterThan((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseGreaterThan((BigInteger)this.oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseGreaterThan((BigDecimal)this.oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testCompare() {
  
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)1, (byte)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)1, (byte)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)2, (byte)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)2, (byte)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)1, (char)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)1, (char)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)2, (char)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)2, (char)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)1, (short)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)1, (short)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)2, (short)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)2, (short)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)1, (int)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)1, (int)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)2, (int)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)2, (int)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)1, (long)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)1, (long)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)2, (long)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)2, (long)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)1, (float)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)1, (float)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)2, (float)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)2, (float)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)1, (double)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)1, (double)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)2, (double)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)2, (double)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)1, (byte)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)1, (byte)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)2, (byte)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)2, (byte)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)1, (char)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)1, (char)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)2, (char)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)2, (char)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)1, (short)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)1, (short)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)2, (short)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)2, (short)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)1, (int)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)1, (int)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)2, (int)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)2, (int)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)1, (long)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)1, (long)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)2, (long)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)2, (long)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)1, (float)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)1, (float)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)2, (float)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)2, (float)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)1, (double)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)1, (double)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)2, (double)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)2, (double)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)1, (byte)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)1, (byte)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)2, (byte)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)2, (byte)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)1, (char)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)1, (char)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)2, (char)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)2, (char)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)1, (short)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)1, (short)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)2, (short)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)2, (short)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)1, (int)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)1, (int)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)2, (int)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)2, (int)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)1, (long)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)1, (long)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)2, (long)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)2, (long)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)1, (float)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)1, (float)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)2, (float)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)2, (float)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)1, (double)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)1, (double)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)2, (double)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)2, (double)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)1, (byte)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)1, (byte)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)2, (byte)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)2, (byte)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)1, (char)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)1, (char)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)2, (char)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)2, (char)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)1, (short)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)1, (short)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)2, (short)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)2, (short)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)1, (int)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)1, (int)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)2, (int)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)2, (int)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)1, (long)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)1, (long)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)2, (long)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)2, (long)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)1, (float)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)1, (float)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)2, (float)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)2, (float)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)1, (double)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)1, (double)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)2, (double)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)2, (double)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)1, (byte)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)1, (byte)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)2, (byte)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)2, (byte)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)1, (char)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)1, (char)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)2, (char)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)2, (char)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)1, (short)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)1, (short)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)2, (short)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)2, (short)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)1, (int)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)1, (int)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)2, (int)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)2, (int)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)1, (long)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)1, (long)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)2, (long)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)2, (long)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)1, (float)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)1, (float)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)2, (float)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)2, (float)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)1, (double)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)1, (double)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)2, (double)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)2, (double)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)1, (byte)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)1, (byte)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)2, (byte)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)2, (byte)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)1, (char)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)1, (char)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)2, (char)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)2, (char)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)1, (short)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)1, (short)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)2, (short)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)2, (short)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)1, (int)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)1, (int)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)2, (int)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)2, (int)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)1, (long)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)1, (long)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)2, (long)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)2, (long)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)1, (float)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)1, (float)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)2, (float)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)2, (float)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)1, (double)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)1, (double)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)2, (double)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)2, (double)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)1, (byte)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)1, (byte)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)2, (byte)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)2, (byte)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)1, (char)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)1, (char)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)2, (char)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)2, (char)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)1, (short)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)1, (short)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)2, (short)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)2, (short)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)1, (int)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)1, (int)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)2, (int)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)2, (int)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)1, (long)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)1, (long)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)2, (long)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)2, (long)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)1, (float)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)1, (float)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)2, (float)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)2, (float)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)1, (double)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)1, (double)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)2, (double)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)2, (double)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)1, this.twoBigInt)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)1, this.oneBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)2, this.twoBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)2, this.oneBigInt)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)1, this.twoBigInt)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)1, this.oneBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)2, this.twoBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)2, this.oneBigInt)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)1, this.twoBigInt)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)1, this.oneBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)2, this.twoBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)2, this.oneBigInt)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)1, this.twoBigInt)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)1, this.oneBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)2, this.twoBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)2, this.oneBigInt)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)1, this.twoBigInt)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)1, this.oneBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)2, this.twoBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)2, this.oneBigInt)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)1, this.twoBigInt)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)1, this.oneBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)2, this.twoBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)2, this.oneBigInt)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)1, this.twoBigInt)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)1, this.oneBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)2, this.twoBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)2, this.oneBigInt)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.oneBigInt, (byte)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.oneBigInt, (byte)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.twoBigInt, (byte)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.twoBigInt, (byte)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.oneBigInt, (char)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.oneBigInt, (char)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.twoBigInt, (char)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.twoBigInt, (char)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.oneBigInt, (short)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.oneBigInt, (short)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.twoBigInt, (short)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.twoBigInt, (short)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.oneBigInt, (int)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.oneBigInt, (int)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.twoBigInt, (int)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.twoBigInt, (int)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.oneBigInt, (long)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.oneBigInt, (long)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.twoBigInt, (long)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.twoBigInt, (long)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.oneBigInt, (float)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.oneBigInt, (float)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.twoBigInt, (float)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.twoBigInt, (float)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.oneBigInt, (double)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.oneBigInt, (double)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.twoBigInt, (double)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.twoBigInt, (double)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.oneBigInt, (byte)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.oneBigInt, (byte)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.twoBigInt, (byte)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.twoBigInt, (byte)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.oneBigInt, this.twoBigInt)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.oneBigInt, this.oneBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.twoBigInt, this.twoBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.twoBigInt, this.oneBigInt)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.oneBigInt, this.twoBigDecimal)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.oneBigInt, this.oneBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.twoBigInt, this.twoBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigInteger.class).compare(this.twoBigInt, this.oneBigDecimal)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)1, this.twoBigDecimal)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)1, this.oneBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)2, this.twoBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(byte.class).compare((byte)2, this.oneBigDecimal)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)1, this.twoBigDecimal)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)1, this.oneBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)2, this.twoBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(char.class).compare((char)2, this.oneBigDecimal)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)1, this.twoBigDecimal)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)1, this.oneBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)2, this.twoBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(short.class).compare((short)2, this.oneBigDecimal)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)1, this.twoBigDecimal)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)1, this.oneBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)2, this.twoBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(int.class).compare((int)2, this.oneBigDecimal)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)1, this.twoBigDecimal)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)1, this.oneBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)2, this.twoBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(long.class).compare((long)2, this.oneBigDecimal)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)1, this.twoBigDecimal)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)1, this.oneBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)2, this.twoBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(float.class).compare((float)2, this.oneBigDecimal)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)1, this.twoBigDecimal)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)1, this.oneBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)2, this.twoBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(double.class).compare((double)2, this.oneBigDecimal)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.oneBigDecimal, (byte)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.oneBigDecimal, (byte)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.twoBigDecimal, (byte)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.twoBigDecimal, (byte)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.oneBigDecimal, (char)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.oneBigDecimal, (char)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.twoBigDecimal, (char)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.twoBigDecimal, (char)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.oneBigDecimal, (short)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.oneBigDecimal, (short)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.twoBigDecimal, (short)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.twoBigDecimal, (short)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.oneBigDecimal, (int)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.oneBigDecimal, (int)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.twoBigDecimal, (int)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.twoBigDecimal, (int)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.oneBigDecimal, (long)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.oneBigDecimal, (long)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.twoBigDecimal, (long)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.twoBigDecimal, (long)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.oneBigDecimal, (float)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.oneBigDecimal, (float)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.twoBigDecimal, (float)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.twoBigDecimal, (float)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.oneBigDecimal, (double)2)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.oneBigDecimal, (double)1)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.twoBigDecimal, (double)2)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.twoBigDecimal, (double)1)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.oneBigDecimal, this.twoBigInt)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.oneBigDecimal, this.oneBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.twoBigDecimal, this.twoBigInt)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.twoBigDecimal, this.oneBigInt)).getIntValue() > 0);
    
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.oneBigDecimal, this.twoBigDecimal)).getIntValue() < 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.oneBigDecimal, this.oneBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.twoBigDecimal, this.twoBigDecimal)).getIntValue() == 0);
    assertTrue(((NgInt)this.registry.getRuntimeMetaClass(BigDecimal.class).compare(this.twoBigDecimal, this.oneBigDecimal)).getIntValue() > 0);

    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((BigInteger)this.oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((BigDecimal)this.oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((BigInteger)this.oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((BigDecimal)this.oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((BigInteger)this.oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((BigDecimal)this.oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((float) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((double) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((BigInteger)this.oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((BigDecimal)this.oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((BigInteger)this.oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((BigDecimal)this.oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((int) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((BigInteger)this.oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((BigDecimal)this.oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((int) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((BigInteger)this.oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((BigDecimal)this.oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((byte) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((char) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((short) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((int) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((long) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((float) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((double) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((byte) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((char) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((short) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((int) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((long) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((float) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((double) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((BigInteger) this.oneBigInt, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((BigInteger) this.oneBigInt, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((BigDecimal) this.oneBigDecimal, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare((BigDecimal) this.oneBigDecimal, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    
    for (int i = 0; i != this.ones.length; i++) {
      
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).compare(this.ones[i], (byte)2)).getIntValue() < 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).compare(this.ones[i], (byte)1)).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).compare(this.twos[i], (byte)2)).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).compare(this.twos[i], (byte)1)).getIntValue() > 0);
      
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).compare(this.ones[i], (char)2)).getIntValue() < 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).compare(this.ones[i], (char)1)).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).compare(this.twos[i], (char)2)).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).compare(this.twos[i], (char)1)).getIntValue() > 0);
      
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).compare(this.ones[i], (short)2)).getIntValue() < 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).compare(this.ones[i], (short)1)).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).compare(this.twos[i], (short)2)).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).compare(this.twos[i], (short)1)).getIntValue() > 0);
      
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).compare(this.ones[i], (int)2)).getIntValue() < 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).compare(this.ones[i], (int)1)).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).compare(this.twos[i], (int)2)).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).compare(this.twos[i], (int)1)).getIntValue() > 0);
      
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).compare(this.ones[i], (long)2)).getIntValue() < 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).compare(this.ones[i], (long)1)).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).compare(this.twos[i], (long)2)).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).compare(this.twos[i], (long)1)).getIntValue() > 0);
      
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).compare(this.ones[i], (float)2)).getIntValue() < 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).compare(this.ones[i], (float)1)).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).compare(this.twos[i], (float)2)).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).compare(this.twos[i], (float)1)).getIntValue() > 0);
      
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).compare(this.ones[i], (double)2)).getIntValue() < 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).compare(this.ones[i], (double)1)).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).compare(this.twos[i], (double)2)).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).compare(this.twos[i], (double)1)).getIntValue() > 0);
      
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).compare(this.ones[i], this.twoBigInt)).getIntValue() < 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).compare(this.ones[i], this.oneBigInt)).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).compare(this.twos[i], this.twoBigInt)).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).compare(this.twos[i], this.oneBigInt)).getIntValue() > 0);
      
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).compare(this.ones[i], this.twoBigDecimal)).getIntValue() < 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).compare(this.ones[i], this.oneBigDecimal)).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).compare(this.twos[i], this.twoBigDecimal)).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).compare(this.twos[i], this.oneBigDecimal)).getIntValue() > 0);
      
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).reverseCompare(((byte)2), this.ones[i])).getIntValue() > 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).reverseCompare(((byte)1), this.ones[i])).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).reverseCompare(((byte)2), this.twos[i])).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).reverseCompare(((byte)1), this.twos[i])).getIntValue() < 0);
      
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).reverseCompare(((char)2), this.ones[i])).getIntValue() > 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).reverseCompare(((char)1), this.ones[i])).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).reverseCompare(((char)2), this.twos[i])).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).reverseCompare(((char)1), this.twos[i])).getIntValue() < 0);
      
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).reverseCompare(((short)2), this.ones[i])).getIntValue() > 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).reverseCompare(((short)1), this.ones[i])).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).reverseCompare(((short)2), this.twos[i])).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).reverseCompare(((short)1), this.twos[i])).getIntValue() < 0);
      
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).reverseCompare(((int)2), this.ones[i])).getIntValue() > 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).reverseCompare(((int)1), this.ones[i])).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).reverseCompare(((int)2), this.twos[i])).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).reverseCompare(((int)1), this.twos[i])).getIntValue() < 0);
      
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).reverseCompare(((long)2), this.ones[i])).getIntValue() > 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).reverseCompare(((long)1), this.ones[i])).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).reverseCompare(((long)2), this.twos[i])).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).reverseCompare(((long)1), this.twos[i])).getIntValue() < 0);
      
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).reverseCompare(((float)2), this.ones[i])).getIntValue() > 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).reverseCompare(((float)1), this.ones[i])).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).reverseCompare(((float)2), this.twos[i])).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).reverseCompare(((float)1), this.twos[i])).getIntValue() < 0);
      
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).reverseCompare(((double)2), this.ones[i])).getIntValue() > 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).reverseCompare(((double)1), this.ones[i])).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).reverseCompare(((double)2), this.twos[i])).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).reverseCompare(((double)1), this.twos[i])).getIntValue() < 0);
      
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).reverseCompare(this.twoBigInt, this.ones[i])).getIntValue() > 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).reverseCompare(this.oneBigInt, this.ones[i])).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).reverseCompare(this.twoBigInt, this.twos[i])).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).reverseCompare(this.oneBigInt, this.twos[i])).getIntValue() < 0);
      
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).reverseCompare(this.twoBigDecimal, this.ones[i])).getIntValue() > 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).reverseCompare(this.oneBigDecimal, this.ones[i])).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).reverseCompare(this.twoBigDecimal, this.twos[i])).getIntValue() == 0);
      assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).reverseCompare(this.oneBigDecimal, this.twos[i])).getIntValue() < 0);
      
      for (int j = 0; j != this.twos.length; j++) {
        assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).compare(this.ones[i], this.twos[j])).getIntValue() < 0);
        assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.ones[i]).compare(this.ones[i], this.ones[j])).getIntValue() == 0);
        assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).compare(this.twos[i], this.twos[j])).getIntValue() == 0);
        assertTrue(((NgInt)this.registry.getRuntimeMetaClass(this.twos[i]).compare(this.twos[i], this.ones[j])).getIntValue() > 0);
      }      
    }
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare(new Object(), (BigInteger)this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).compare(new Object(), (BigDecimal)this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseCompare((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseCompare((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseCompare((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseCompare((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseCompare((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseCompare((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseCompare((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseCompare((BigInteger)this.oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseCompare((BigDecimal)this.oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testEquals() {
  final boolean b1 = false, b2 = true, b3 = true, b4 = false;
  
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.oneBigInt, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.oneBigInt, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.twoBigInt, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.twoBigInt, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.oneBigInt, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.oneBigInt, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.twoBigInt, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.twoBigInt, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.oneBigInt, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.oneBigInt, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.twoBigInt, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.twoBigInt, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.oneBigInt, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.oneBigInt, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.twoBigInt, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.twoBigInt, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.oneBigInt, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.oneBigInt, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.twoBigInt, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.twoBigInt, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.oneBigInt, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.oneBigInt, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.twoBigInt, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.twoBigInt, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.oneBigInt, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.oneBigInt, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.twoBigInt, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.twoBigInt, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.oneBigInt, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.oneBigInt, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.twoBigInt, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.twoBigInt, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.oneBigInt, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.oneBigInt, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.twoBigInt, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.twoBigInt, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.oneBigInt, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.oneBigInt, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.twoBigInt, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).equals(this.twoBigInt, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).equals((byte)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).equals((char)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).equals((short)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).equals((int)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).equals((long)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).equals((float)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).equals((double)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.oneBigDecimal, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.oneBigDecimal, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.twoBigDecimal, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.twoBigDecimal, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.oneBigDecimal, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.oneBigDecimal, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.twoBigDecimal, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.twoBigDecimal, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.oneBigDecimal, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.oneBigDecimal, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.twoBigDecimal, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.twoBigDecimal, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.oneBigDecimal, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.oneBigDecimal, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.twoBigDecimal, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.twoBigDecimal, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.oneBigDecimal, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.oneBigDecimal, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.twoBigDecimal, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.twoBigDecimal, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.oneBigDecimal, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.oneBigDecimal, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.twoBigDecimal, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.twoBigDecimal, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.oneBigDecimal, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.oneBigDecimal, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.twoBigDecimal, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.twoBigDecimal, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.oneBigDecimal, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.oneBigDecimal, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.twoBigDecimal, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.twoBigDecimal, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.oneBigDecimal, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.oneBigDecimal, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.twoBigDecimal, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).equals(this.twoBigDecimal, this.oneBigDecimal)).getBooleanValue(), b4);

    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((BigInteger)this.oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((BigDecimal)this.oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((BigInteger)this.oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((BigDecimal)this.oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((BigInteger)this.oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((BigDecimal)this.oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((float) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((double) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((BigInteger)this.oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((BigDecimal)this.oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((BigInteger)this.oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((BigDecimal)this.oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((int) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((BigInteger)this.oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((BigDecimal)this.oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((int) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((BigInteger)this.oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((BigDecimal)this.oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((byte) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((char) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((short) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((int) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((long) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((float) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((double) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((byte) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((char) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((short) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((int) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((long) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((float) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((double) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((BigInteger) this.oneBigInt, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((BigInteger) this.oneBigInt, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((BigDecimal) this.oneBigDecimal, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals((BigDecimal) this.oneBigDecimal, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    
    for (int i = 0; i != this.ones.length; i++) {
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).equals(this.ones[i], (byte)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).equals(this.ones[i], (byte)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).equals(this.twos[i], (byte)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).equals(this.twos[i], (byte)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).equals(this.ones[i], (char)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).equals(this.ones[i], (char)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).equals(this.twos[i], (char)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).equals(this.twos[i], (char)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).equals(this.ones[i], (short)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).equals(this.ones[i], (short)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).equals(this.twos[i], (short)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).equals(this.twos[i], (short)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).equals(this.ones[i], (int)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).equals(this.ones[i], (int)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).equals(this.twos[i], (int)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).equals(this.twos[i], (int)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).equals(this.ones[i], (long)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).equals(this.ones[i], (long)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).equals(this.twos[i], (long)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).equals(this.twos[i], (long)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).equals(this.ones[i], (float)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).equals(this.ones[i], (float)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).equals(this.twos[i], (float)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).equals(this.twos[i], (float)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).equals(this.ones[i], (double)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).equals(this.ones[i], (double)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).equals(this.twos[i], (double)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).equals(this.twos[i], (double)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).equals(this.ones[i], this.twoBigInt)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).equals(this.ones[i], this.oneBigInt)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).equals(this.twos[i], this.twoBigInt)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).equals(this.twos[i], this.oneBigInt)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).equals(this.ones[i], this.twoBigDecimal)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).equals(this.ones[i], this.oneBigDecimal)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).equals(this.twos[i], this.twoBigDecimal)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).equals(this.twos[i], this.oneBigDecimal)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseEquals(((byte)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseEquals(((byte)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseEquals(((byte)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseEquals(((byte)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseEquals(((char)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseEquals(((char)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseEquals(((char)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseEquals(((char)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseEquals(((short)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseEquals(((short)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseEquals(((short)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseEquals(((short)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseEquals(((int)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseEquals(((int)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseEquals(((int)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseEquals(((int)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseEquals(((long)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseEquals(((long)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseEquals(((long)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseEquals(((long)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseEquals(((float)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseEquals(((float)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseEquals(((float)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseEquals(((float)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseEquals(((double)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseEquals(((double)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseEquals(((double)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseEquals(((double)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseEquals(this.twoBigInt, this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseEquals(this.oneBigInt, this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseEquals(this.twoBigInt, this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseEquals(this.oneBigInt, this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseEquals(this.twoBigDecimal, this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseEquals(this.oneBigDecimal, this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseEquals(this.twoBigDecimal, this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseEquals(this.oneBigDecimal, this.twos[i])).getBooleanValue(), b1);
      
      for (int j = 0; j != this.twos.length; j++) {
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).equals(this.ones[i], this.twos[j])).getBooleanValue(), b1);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).equals(this.ones[i], this.ones[j])).getBooleanValue(), b2);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).equals(this.twos[i], this.twos[j])).getBooleanValue(), b3);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).equals(this.twos[i], this.ones[j])).getBooleanValue(), b4);
      }      
    }
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals(new Object(), (BigInteger)this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).equals(new Object(), (BigDecimal)this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseEquals((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseEquals((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseEquals((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseEquals((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseEquals((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseEquals((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseEquals((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseEquals((BigInteger)this.oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseEquals((BigDecimal)this.oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }

  public void testNotEquals() {
    final boolean b1 = true, b2 = false, b3 = false, b4 = true;
    
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, (byte)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, (byte)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, (byte)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, (byte)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, (char)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, (char)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, (char)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, (char)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, (short)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, (short)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, (short)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, (short)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, (int)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, (int)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, (int)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, (int)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, (long)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, (long)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, (long)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, (long)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, (float)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, (float)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, (float)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, (float)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, (double)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, (double)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, (double)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, (double)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)1, (byte)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)1, (byte)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)2, (byte)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)2, (byte)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)1, (char)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)1, (char)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)2, (char)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)2, (char)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)1, (short)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)1, (short)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)2, (short)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)2, (short)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)1, (int)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)1, (int)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)2, (int)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)2, (int)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)1, (long)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)1, (long)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)2, (long)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)2, (long)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)1, (float)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)1, (float)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)2, (float)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)2, (float)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)1, (double)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)1, (double)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)2, (double)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)2, (double)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)1, (byte)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)1, (byte)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)2, (byte)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)2, (byte)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)1, (char)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)1, (char)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)2, (char)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)2, (char)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)1, (short)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)1, (short)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)2, (short)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)2, (short)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)1, (int)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)1, (int)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)2, (int)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)2, (int)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)1, (long)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)1, (long)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)2, (long)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)2, (long)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)1, (float)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)1, (float)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)2, (float)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)2, (float)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)1, (double)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)1, (double)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)2, (double)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)2, (double)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)1, (byte)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)1, (byte)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)2, (byte)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)2, (byte)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)1, (char)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)1, (char)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)2, (char)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)2, (char)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)1, (short)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)1, (short)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)2, (short)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)2, (short)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)1, (int)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)1, (int)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)2, (int)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)2, (int)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)1, (long)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)1, (long)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)2, (long)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)2, (long)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)1, (float)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)1, (float)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)2, (float)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)2, (float)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)1, (double)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)1, (double)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)2, (double)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)2, (double)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)1, (byte)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)1, (byte)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)2, (byte)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)2, (byte)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)1, (char)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)1, (char)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)2, (char)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)2, (char)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)1, (short)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)1, (short)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)2, (short)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)2, (short)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)1, (int)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)1, (int)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)2, (int)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)2, (int)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)1, (long)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)1, (long)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)2, (long)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)2, (long)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)1, (float)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)1, (float)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)2, (float)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)2, (float)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)1, (double)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)1, (double)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)2, (double)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)2, (double)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)1, (byte)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)1, (byte)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)2, (byte)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)2, (byte)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)1, (char)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)1, (char)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)2, (char)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)2, (char)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)1, (short)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)1, (short)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)2, (short)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)2, (short)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)1, (int)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)1, (int)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)2, (int)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)2, (int)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)1, (long)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)1, (long)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)2, (long)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)2, (long)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)1, (float)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)1, (float)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)2, (float)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)2, (float)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)1, (double)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)1, (double)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)2, (double)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)2, (double)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)1, (byte)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)1, (byte)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)2, (byte)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)2, (byte)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)1, (char)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)1, (char)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)2, (char)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)2, (char)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)1, (short)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)1, (short)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)2, (short)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)2, (short)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)1, (int)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)1, (int)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)2, (int)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)2, (int)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)1, (long)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)1, (long)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)2, (long)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)2, (long)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)1, (float)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)1, (float)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)2, (float)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)2, (float)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)1, (double)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)1, (double)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)2, (double)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)2, (double)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, this.twoBigInt)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, this.oneBigInt)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, this.twoBigInt)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, this.oneBigInt)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)1, this.twoBigInt)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)1, this.oneBigInt)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)2, this.twoBigInt)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)2, this.oneBigInt)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)1, this.twoBigInt)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)1, this.oneBigInt)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)2, this.twoBigInt)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)2, this.oneBigInt)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)1, this.twoBigInt)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)1, this.oneBigInt)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)2, this.twoBigInt)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)2, this.oneBigInt)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)1, this.twoBigInt)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)1, this.oneBigInt)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)2, this.twoBigInt)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)2, this.oneBigInt)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)1, this.twoBigInt)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)1, this.oneBigInt)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)2, this.twoBigInt)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)2, this.oneBigInt)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)1, this.twoBigInt)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)1, this.oneBigInt)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)2, this.twoBigInt)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)2, this.oneBigInt)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.oneBigInt, (byte)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.oneBigInt, (byte)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.twoBigInt, (byte)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.twoBigInt, (byte)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.oneBigInt, (char)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.oneBigInt, (char)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.twoBigInt, (char)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.twoBigInt, (char)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.oneBigInt, (short)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.oneBigInt, (short)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.twoBigInt, (short)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.twoBigInt, (short)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.oneBigInt, (int)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.oneBigInt, (int)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.twoBigInt, (int)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.twoBigInt, (int)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.oneBigInt, (long)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.oneBigInt, (long)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.twoBigInt, (long)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.twoBigInt, (long)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.oneBigInt, (float)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.oneBigInt, (float)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.twoBigInt, (float)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.twoBigInt, (float)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.oneBigInt, (double)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.oneBigInt, (double)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.twoBigInt, (double)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.twoBigInt, (double)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.oneBigInt, (byte)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.oneBigInt, (byte)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.twoBigInt, (byte)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.twoBigInt, (byte)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.oneBigInt, this.twoBigInt)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.oneBigInt, this.oneBigInt)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.twoBigInt, this.twoBigInt)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.twoBigInt, this.oneBigInt)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.oneBigInt, this.twoBigDecimal)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.oneBigInt, this.oneBigDecimal)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.twoBigInt, this.twoBigDecimal)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).notEquals(this.twoBigInt, this.oneBigDecimal)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, this.twoBigDecimal)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)1, this.oneBigDecimal)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, this.twoBigDecimal)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).notEquals((byte)2, this.oneBigDecimal)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)1, this.twoBigDecimal)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)1, this.oneBigDecimal)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)2, this.twoBigDecimal)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).notEquals((char)2, this.oneBigDecimal)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)1, this.twoBigDecimal)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)1, this.oneBigDecimal)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)2, this.twoBigDecimal)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).notEquals((short)2, this.oneBigDecimal)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)1, this.twoBigDecimal)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)1, this.oneBigDecimal)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)2, this.twoBigDecimal)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).notEquals((int)2, this.oneBigDecimal)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)1, this.twoBigDecimal)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)1, this.oneBigDecimal)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)2, this.twoBigDecimal)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).notEquals((long)2, this.oneBigDecimal)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)1, this.twoBigDecimal)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)1, this.oneBigDecimal)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)2, this.twoBigDecimal)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).notEquals((float)2, this.oneBigDecimal)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)1, this.twoBigDecimal)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)1, this.oneBigDecimal)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)2, this.twoBigDecimal)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).notEquals((double)2, this.oneBigDecimal)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.oneBigDecimal, (byte)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.oneBigDecimal, (byte)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.twoBigDecimal, (byte)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.twoBigDecimal, (byte)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.oneBigDecimal, (char)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.oneBigDecimal, (char)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.twoBigDecimal, (char)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.twoBigDecimal, (char)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.oneBigDecimal, (short)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.oneBigDecimal, (short)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.twoBigDecimal, (short)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.twoBigDecimal, (short)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.oneBigDecimal, (int)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.oneBigDecimal, (int)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.twoBigDecimal, (int)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.twoBigDecimal, (int)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.oneBigDecimal, (long)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.oneBigDecimal, (long)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.twoBigDecimal, (long)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.twoBigDecimal, (long)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.oneBigDecimal, (float)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.oneBigDecimal, (float)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.twoBigDecimal, (float)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.twoBigDecimal, (float)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.oneBigDecimal, (double)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.oneBigDecimal, (double)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.twoBigDecimal, (double)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.twoBigDecimal, (double)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.oneBigDecimal, this.twoBigInt)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.oneBigDecimal, this.oneBigInt)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.twoBigDecimal, this.twoBigInt)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.twoBigDecimal, this.oneBigInt)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.oneBigDecimal, this.twoBigDecimal)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.oneBigDecimal, this.oneBigDecimal)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.twoBigDecimal, this.twoBigDecimal)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).notEquals(this.twoBigDecimal, this.oneBigDecimal)).getBooleanValue(), b4);

      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((byte) 1, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((char) 1, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((short) 1, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((int) 1, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((long) 1, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((float) 1, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((double) 1, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((BigInteger)this.oneBigInt, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((BigDecimal)this.oneBigDecimal, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((byte) 1, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((char) 1, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((short) 1, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((int) 1, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((long) 1, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((float) 1, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((double) 1, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((BigInteger)this.oneBigInt, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((BigDecimal)this.oneBigDecimal, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((byte) 1, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((char) 1, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((short) 1, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((int) 1, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((long) 1, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((float) 1, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((double) 1, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((BigInteger)this.oneBigInt, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((BigDecimal)this.oneBigDecimal, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((byte) 1, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((char) 1, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {
      }
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((short) 1, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {
      }
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((int) 1, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {
      }
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((long) 1, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((float) 1, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((double) 1, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((BigInteger)this.oneBigInt, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((BigDecimal)this.oneBigDecimal, (int) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((byte) 1, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((char) 1, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((short) 1, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((int) 1, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((long) 1, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((float) 1, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((double) 1, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((BigInteger)this.oneBigInt, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((BigDecimal)this.oneBigDecimal, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((byte) 1, (float) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((char) 1, (float) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((short) 1, (float) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((int) 1, (float) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((long) 1, (float) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((float) 1, (float) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((double) 1, (float) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((BigInteger)this.oneBigInt, (float) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((BigDecimal)this.oneBigDecimal, (float) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((byte) 1, (double) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((char) 1, (double) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((short) 1, (double) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((int) 1, (double) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((long) 1, (double) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((float) 1, (double) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((double) 1, (double) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((BigInteger)this.oneBigInt, (double) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((BigDecimal)this.oneBigDecimal, (double) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((byte) 1, (BigInteger) this.oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((char) 1, (BigInteger) this.oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((short) 1, (BigInteger) this.oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((int) 1, (BigInteger) this.oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((long) 1, (BigInteger) this.oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((float) 1, (BigInteger) this.oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((double) 1, (BigInteger) this.oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((byte) 1, (BigDecimal) this.oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((char) 1, (BigDecimal) this.oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((short) 1, (BigDecimal) this.oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((int) 1, (BigDecimal) this.oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((long) 1, (BigDecimal) this.oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((float) 1, (BigDecimal) this.oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((double) 1, (BigDecimal) this.oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {} 
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((BigInteger) this.oneBigInt, (BigInteger) this.oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {} 
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((BigInteger) this.oneBigInt, (BigDecimal) this.oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {} 
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((BigDecimal) this.oneBigDecimal, (BigInteger) this.oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {} 
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals((BigDecimal) this.oneBigDecimal, (BigDecimal) this.oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {} 
      
      for (int i = 0; i != this.ones.length; i++) {
        
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).notEquals(this.ones[i], (byte)2)).getBooleanValue(), b1);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).notEquals(this.ones[i], (byte)1)).getBooleanValue(), b2);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).notEquals(this.twos[i], (byte)2)).getBooleanValue(), b3);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).notEquals(this.twos[i], (byte)1)).getBooleanValue(), b4);
        
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).notEquals(this.ones[i], (char)2)).getBooleanValue(), b1);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).notEquals(this.ones[i], (char)1)).getBooleanValue(), b2);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).notEquals(this.twos[i], (char)2)).getBooleanValue(), b3);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).notEquals(this.twos[i], (char)1)).getBooleanValue(), b4);
        
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).notEquals(this.ones[i], (short)2)).getBooleanValue(), b1);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).notEquals(this.ones[i], (short)1)).getBooleanValue(), b2);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).notEquals(this.twos[i], (short)2)).getBooleanValue(), b3);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).notEquals(this.twos[i], (short)1)).getBooleanValue(), b4);
        
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).notEquals(this.ones[i], (int)2)).getBooleanValue(), b1);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).notEquals(this.ones[i], (int)1)).getBooleanValue(), b2);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).notEquals(this.twos[i], (int)2)).getBooleanValue(), b3);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).notEquals(this.twos[i], (int)1)).getBooleanValue(), b4);
        
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).notEquals(this.ones[i], (long)2)).getBooleanValue(), b1);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).notEquals(this.ones[i], (long)1)).getBooleanValue(), b2);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).notEquals(this.twos[i], (long)2)).getBooleanValue(), b3);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).notEquals(this.twos[i], (long)1)).getBooleanValue(), b4);
        
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).notEquals(this.ones[i], (float)2)).getBooleanValue(), b1);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).notEquals(this.ones[i], (float)1)).getBooleanValue(), b2);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).notEquals(this.twos[i], (float)2)).getBooleanValue(), b3);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).notEquals(this.twos[i], (float)1)).getBooleanValue(), b4);
        
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).notEquals(this.ones[i], (double)2)).getBooleanValue(), b1);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).notEquals(this.ones[i], (double)1)).getBooleanValue(), b2);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).notEquals(this.twos[i], (double)2)).getBooleanValue(), b3);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).notEquals(this.twos[i], (double)1)).getBooleanValue(), b4);
        
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).notEquals(this.ones[i], this.twoBigInt)).getBooleanValue(), b1);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).notEquals(this.ones[i], this.oneBigInt)).getBooleanValue(), b2);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).notEquals(this.twos[i], this.twoBigInt)).getBooleanValue(), b3);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).notEquals(this.twos[i], this.oneBigInt)).getBooleanValue(), b4);
        
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).notEquals(this.ones[i], this.twoBigDecimal)).getBooleanValue(), b1);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).notEquals(this.ones[i], this.oneBigDecimal)).getBooleanValue(), b2);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).notEquals(this.twos[i], this.twoBigDecimal)).getBooleanValue(), b3);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).notEquals(this.twos[i], this.oneBigDecimal)).getBooleanValue(), b4);
        
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseNotEquals(((byte)2), this.ones[i])).getBooleanValue(), b4);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseNotEquals(((byte)1), this.ones[i])).getBooleanValue(), b3);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseNotEquals(((byte)2), this.twos[i])).getBooleanValue(), b2);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseNotEquals(((byte)1), this.twos[i])).getBooleanValue(), b1);
        
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseNotEquals(((char)2), this.ones[i])).getBooleanValue(), b4);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseNotEquals(((char)1), this.ones[i])).getBooleanValue(), b3);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseNotEquals(((char)2), this.twos[i])).getBooleanValue(), b2);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseNotEquals(((char)1), this.twos[i])).getBooleanValue(), b1);
        
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseNotEquals(((short)2), this.ones[i])).getBooleanValue(), b4);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseNotEquals(((short)1), this.ones[i])).getBooleanValue(), b3);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseNotEquals(((short)2), this.twos[i])).getBooleanValue(), b2);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseNotEquals(((short)1), this.twos[i])).getBooleanValue(), b1);
        
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseNotEquals(((int)2), this.ones[i])).getBooleanValue(), b4);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseNotEquals(((int)1), this.ones[i])).getBooleanValue(), b3);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseNotEquals(((int)2), this.twos[i])).getBooleanValue(), b2);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseNotEquals(((int)1), this.twos[i])).getBooleanValue(), b1);
        
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseNotEquals(((long)2), this.ones[i])).getBooleanValue(), b4);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseNotEquals(((long)1), this.ones[i])).getBooleanValue(), b3);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseNotEquals(((long)2), this.twos[i])).getBooleanValue(), b2);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseNotEquals(((long)1), this.twos[i])).getBooleanValue(), b1);
        
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseNotEquals(((float)2), this.ones[i])).getBooleanValue(), b4);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseNotEquals(((float)1), this.ones[i])).getBooleanValue(), b3);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseNotEquals(((float)2), this.twos[i])).getBooleanValue(), b2);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseNotEquals(((float)1), this.twos[i])).getBooleanValue(), b1);
        
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseNotEquals(((double)2), this.ones[i])).getBooleanValue(), b4);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseNotEquals(((double)1), this.ones[i])).getBooleanValue(), b3);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseNotEquals(((double)2), this.twos[i])).getBooleanValue(), b2);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseNotEquals(((double)1), this.twos[i])).getBooleanValue(), b1);
        
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseNotEquals(this.twoBigInt, this.ones[i])).getBooleanValue(), b4);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseNotEquals(this.oneBigInt, this.ones[i])).getBooleanValue(), b3);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseNotEquals(this.twoBigInt, this.twos[i])).getBooleanValue(), b2);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseNotEquals(this.oneBigInt, this.twos[i])).getBooleanValue(), b1);
        
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseNotEquals(this.twoBigDecimal, this.ones[i])).getBooleanValue(), b4);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseNotEquals(this.oneBigDecimal, this.ones[i])).getBooleanValue(), b3);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseNotEquals(this.twoBigDecimal, this.twos[i])).getBooleanValue(), b2);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseNotEquals(this.oneBigDecimal, this.twos[i])).getBooleanValue(), b1);
        
        for (int j = 0; j != this.twos.length; j++) {
          assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).notEquals(this.ones[i], this.twos[j])).getBooleanValue(), b1);
          assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).notEquals(this.ones[i], this.ones[j])).getBooleanValue(), b2);
          assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).notEquals(this.twos[i], this.twos[j])).getBooleanValue(), b3);
          assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).notEquals(this.twos[i], this.ones[j])).getBooleanValue(), b4);
        }      
      }
      
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals(new Object(), new Object());
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals(new Object(), (byte)1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals(new Object(), (char)1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals(new Object(), (short)1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals(new Object(), (int)1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals(new Object(), (long)1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals(new Object(), (float)1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals(new Object(), (double)1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals(new Object(), (BigInteger)this.oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).notEquals(new Object(), (BigDecimal)this.oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      
      try {
        this.registry.getRuntimeMetaClass(Object.class).reverseNotEquals((byte)1, new Object());
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).reverseNotEquals((char)1, new Object());
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).reverseNotEquals((short)1, new Object());
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).reverseNotEquals((int)1, new Object());
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).reverseNotEquals((long)1, new Object());
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).reverseNotEquals((float)1, new Object());
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).reverseNotEquals((double)1, new Object());
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).reverseNotEquals((BigInteger)this.oneBigInt, new Object());
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        this.registry.getRuntimeMetaClass(Object.class).reverseNotEquals((BigDecimal)this.oneBigDecimal, new Object());
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
    }
  
  public void testLessThan() {
  final boolean b1 = true, b2 = false, b3 = false, b4 = false;
  
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.oneBigInt, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.oneBigInt, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.twoBigInt, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.twoBigInt, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.oneBigInt, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.oneBigInt, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.twoBigInt, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.twoBigInt, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.oneBigInt, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.oneBigInt, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.twoBigInt, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.twoBigInt, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.oneBigInt, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.oneBigInt, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.twoBigInt, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.twoBigInt, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.oneBigInt, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.oneBigInt, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.twoBigInt, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.twoBigInt, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.oneBigInt, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.oneBigInt, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.twoBigInt, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.twoBigInt, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.oneBigInt, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.oneBigInt, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.twoBigInt, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.twoBigInt, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.oneBigInt, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.oneBigInt, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.twoBigInt, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.twoBigInt, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.oneBigInt, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.oneBigInt, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.twoBigInt, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.twoBigInt, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.oneBigInt, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.oneBigInt, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.twoBigInt, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThan(this.twoBigInt, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThan((byte)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThan((char)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThan((short)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThan((int)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThan((long)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThan((float)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThan((double)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.oneBigDecimal, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.oneBigDecimal, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.twoBigDecimal, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.twoBigDecimal, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.oneBigDecimal, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.oneBigDecimal, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.twoBigDecimal, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.twoBigDecimal, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.oneBigDecimal, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.oneBigDecimal, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.twoBigDecimal, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.twoBigDecimal, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.oneBigDecimal, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.oneBigDecimal, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.twoBigDecimal, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.twoBigDecimal, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.oneBigDecimal, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.oneBigDecimal, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.twoBigDecimal, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.twoBigDecimal, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.oneBigDecimal, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.oneBigDecimal, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.twoBigDecimal, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.twoBigDecimal, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.oneBigDecimal, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.oneBigDecimal, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.twoBigDecimal, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.twoBigDecimal, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.oneBigDecimal, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.oneBigDecimal, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.twoBigDecimal, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.twoBigDecimal, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.oneBigDecimal, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.oneBigDecimal, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.twoBigDecimal, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThan(this.twoBigDecimal, this.oneBigDecimal)).getBooleanValue(), b4);

    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((BigInteger)this.oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((BigDecimal)this.oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((BigInteger)this.oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((BigDecimal)this.oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((BigInteger)this.oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((BigDecimal)this.oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((float) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((double) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((BigInteger)this.oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((BigDecimal)this.oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((BigInteger)this.oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((BigDecimal)this.oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((int) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((BigInteger)this.oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((BigDecimal)this.oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((int) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((BigInteger)this.oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((BigDecimal)this.oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((byte) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((char) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((short) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((int) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((long) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((float) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((double) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((byte) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((char) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((short) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((int) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((long) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((float) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((double) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((BigInteger) this.oneBigInt, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((BigInteger) this.oneBigInt, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((BigDecimal) this.oneBigDecimal, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan((BigDecimal) this.oneBigDecimal, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    
    for (int i = 0; i != this.ones.length; i++) {
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThan(this.ones[i], (byte)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThan(this.ones[i], (byte)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThan(this.twos[i], (byte)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThan(this.twos[i], (byte)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThan(this.ones[i], (char)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThan(this.ones[i], (char)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThan(this.twos[i], (char)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThan(this.twos[i], (char)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThan(this.ones[i], (short)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThan(this.ones[i], (short)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThan(this.twos[i], (short)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThan(this.twos[i], (short)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThan(this.ones[i], (int)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThan(this.ones[i], (int)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThan(this.twos[i], (int)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThan(this.twos[i], (int)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThan(this.ones[i], (long)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThan(this.ones[i], (long)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThan(this.twos[i], (long)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThan(this.twos[i], (long)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThan(this.ones[i], (float)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThan(this.ones[i], (float)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThan(this.twos[i], (float)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThan(this.twos[i], (float)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThan(this.ones[i], (double)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThan(this.ones[i], (double)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThan(this.twos[i], (double)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThan(this.twos[i], (double)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThan(this.ones[i], this.twoBigInt)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThan(this.ones[i], this.oneBigInt)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThan(this.twos[i], this.twoBigInt)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThan(this.twos[i], this.oneBigInt)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThan(this.ones[i], this.twoBigDecimal)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThan(this.ones[i], this.oneBigDecimal)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThan(this.twos[i], this.twoBigDecimal)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThan(this.twos[i], this.oneBigDecimal)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThan(((byte)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThan(((byte)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThan(((byte)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThan(((byte)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThan(((char)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThan(((char)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThan(((char)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThan(((char)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThan(((short)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThan(((short)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThan(((short)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThan(((short)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThan(((int)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThan(((int)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThan(((int)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThan(((int)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThan(((long)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThan(((long)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThan(((long)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThan(((long)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThan(((float)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThan(((float)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThan(((float)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThan(((float)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThan(((double)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThan(((double)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThan(((double)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThan(((double)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThan(this.twoBigInt, this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThan(this.oneBigInt, this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThan(this.twoBigInt, this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThan(this.oneBigInt, this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThan(this.twoBigDecimal, this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThan(this.oneBigDecimal, this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThan(this.twoBigDecimal, this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThan(this.oneBigDecimal, this.twos[i])).getBooleanValue(), b1);
     
      for (int j = 0; j != this.twos.length; j++) {
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThan(this.ones[i], this.twos[j])).getBooleanValue(), b1);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThan(this.ones[i], this.ones[j])).getBooleanValue(), b2);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThan(this.twos[i], this.twos[j])).getBooleanValue(), b3);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThan(this.twos[i], this.ones[j])).getBooleanValue(), b4);
      }      
    }
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan(new Object(), (BigInteger)this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThan(new Object(), (BigDecimal)this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLessThan((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLessThan((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLessThan((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLessThan((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLessThan((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLessThan((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLessThan((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLessThan((BigInteger)this.oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLessThan((BigDecimal)this.oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
     
  public void testLessThanOrEquals() {
  final boolean b1 = true, b2 = true, b3 = true, b4 = false;
  
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.oneBigInt, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.oneBigInt, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.twoBigInt, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.twoBigInt, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.oneBigInt, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.oneBigInt, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.twoBigInt, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.twoBigInt, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.oneBigInt, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.oneBigInt, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.twoBigInt, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.twoBigInt, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.oneBigInt, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.oneBigInt, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.twoBigInt, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.twoBigInt, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.oneBigInt, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.oneBigInt, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.twoBigInt, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.twoBigInt, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.oneBigInt, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.oneBigInt, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.twoBigInt, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.twoBigInt, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.oneBigInt, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.oneBigInt, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.twoBigInt, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.twoBigInt, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.oneBigInt, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.oneBigInt, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.twoBigInt, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.twoBigInt, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.oneBigInt, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.oneBigInt, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.twoBigInt, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.twoBigInt, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.oneBigInt, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.oneBigInt, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.twoBigInt, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigInteger.class).lessThanOrEquals(this.twoBigInt, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(byte.class).lessThanOrEquals((byte)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(char.class).lessThanOrEquals((char)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(short.class).lessThanOrEquals((short)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(int.class).lessThanOrEquals((int)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(long.class).lessThanOrEquals((long)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(float.class).lessThanOrEquals((float)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)1, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(double.class).lessThanOrEquals((double)2, this.oneBigDecimal)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.oneBigDecimal, (byte)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.oneBigDecimal, (byte)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.twoBigDecimal, (byte)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.twoBigDecimal, (byte)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.oneBigDecimal, (char)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.oneBigDecimal, (char)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.twoBigDecimal, (char)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.twoBigDecimal, (char)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.oneBigDecimal, (short)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.oneBigDecimal, (short)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.twoBigDecimal, (short)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.twoBigDecimal, (short)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.oneBigDecimal, (int)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.oneBigDecimal, (int)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.twoBigDecimal, (int)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.twoBigDecimal, (int)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.oneBigDecimal, (long)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.oneBigDecimal, (long)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.twoBigDecimal, (long)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.twoBigDecimal, (long)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.oneBigDecimal, (float)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.oneBigDecimal, (float)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.twoBigDecimal, (float)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.twoBigDecimal, (float)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.oneBigDecimal, (double)2)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.oneBigDecimal, (double)1)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.twoBigDecimal, (double)2)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.twoBigDecimal, (double)1)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.oneBigDecimal, this.twoBigInt)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.oneBigDecimal, this.oneBigInt)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.twoBigDecimal, this.twoBigInt)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.twoBigDecimal, this.oneBigInt)).getBooleanValue(), b4);
    
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.oneBigDecimal, this.twoBigDecimal)).getBooleanValue(), b1);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.oneBigDecimal, this.oneBigDecimal)).getBooleanValue(), b2);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.twoBigDecimal, this.twoBigDecimal)).getBooleanValue(), b3);
    assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(BigDecimal.class).lessThanOrEquals(this.twoBigDecimal, this.oneBigDecimal)).getBooleanValue(), b4);

    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigInteger)this.oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigDecimal)this.oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigInteger)this.oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigDecimal)this.oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigInteger)this.oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigDecimal)this.oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((float) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((double) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigInteger)this.oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigDecimal)this.oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigInteger)this.oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigDecimal)this.oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((int) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigInteger)this.oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigDecimal)this.oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((int) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigInteger)this.oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigDecimal)this.oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((byte) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((char) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((short) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((int) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((long) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((float) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((double) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((byte) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((char) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((short) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((int) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((long) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((float) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((double) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigInteger) this.oneBigInt, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigInteger) this.oneBigInt, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigDecimal) this.oneBigDecimal, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals((BigDecimal) this.oneBigDecimal, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    
    for (int i = 0; i != this.ones.length; i++) {
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThanOrEquals(this.ones[i], (byte)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThanOrEquals(this.ones[i], (byte)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThanOrEquals(this.twos[i], (byte)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThanOrEquals(this.twos[i], (byte)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThanOrEquals(this.ones[i], (char)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThanOrEquals(this.ones[i], (char)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThanOrEquals(this.twos[i], (char)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThanOrEquals(this.twos[i], (char)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThanOrEquals(this.ones[i], (short)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThanOrEquals(this.ones[i], (short)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThanOrEquals(this.twos[i], (short)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThanOrEquals(this.twos[i], (short)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThanOrEquals(this.ones[i], (int)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThanOrEquals(this.ones[i], (int)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThanOrEquals(this.twos[i], (int)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThanOrEquals(this.twos[i], (int)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThanOrEquals(this.ones[i], (long)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThanOrEquals(this.ones[i], (long)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThanOrEquals(this.twos[i], (long)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThanOrEquals(this.twos[i], (long)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThanOrEquals(this.ones[i], (float)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThanOrEquals(this.ones[i], (float)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThanOrEquals(this.twos[i], (float)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThanOrEquals(this.twos[i], (float)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThanOrEquals(this.ones[i], (double)2)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThanOrEquals(this.ones[i], (double)1)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThanOrEquals(this.twos[i], (double)2)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThanOrEquals(this.twos[i], (double)1)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThanOrEquals(this.ones[i], this.twoBigInt)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThanOrEquals(this.ones[i], this.oneBigInt)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThanOrEquals(this.twos[i], this.twoBigInt)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThanOrEquals(this.twos[i], this.oneBigInt)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThanOrEquals(this.ones[i], this.twoBigDecimal)).getBooleanValue(), b1);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThanOrEquals(this.ones[i], this.oneBigDecimal)).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThanOrEquals(this.twos[i], this.twoBigDecimal)).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThanOrEquals(this.twos[i], this.oneBigDecimal)).getBooleanValue(), b4);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThanOrEquals(((byte)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThanOrEquals(((byte)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThanOrEquals(((byte)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThanOrEquals(((byte)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThanOrEquals(((char)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThanOrEquals(((char)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThanOrEquals(((char)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThanOrEquals(((char)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThanOrEquals(((short)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThanOrEquals(((short)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThanOrEquals(((short)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThanOrEquals(((short)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThanOrEquals(((int)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThanOrEquals(((int)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThanOrEquals(((int)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThanOrEquals(((int)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThanOrEquals(((long)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThanOrEquals(((long)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThanOrEquals(((long)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThanOrEquals(((long)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThanOrEquals(((float)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThanOrEquals(((float)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThanOrEquals(((float)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThanOrEquals(((float)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThanOrEquals(((double)2), this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThanOrEquals(((double)1), this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThanOrEquals(((double)2), this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThanOrEquals(((double)1), this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThanOrEquals(this.twoBigInt, this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThanOrEquals(this.oneBigInt, this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThanOrEquals(this.twoBigInt, this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThanOrEquals(this.oneBigInt, this.twos[i])).getBooleanValue(), b1);
      
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThanOrEquals(this.twoBigDecimal, this.ones[i])).getBooleanValue(), b4);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).reverseLessThanOrEquals(this.oneBigDecimal, this.ones[i])).getBooleanValue(), b3);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThanOrEquals(this.twoBigDecimal, this.twos[i])).getBooleanValue(), b2);
      assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).reverseLessThanOrEquals(this.oneBigDecimal, this.twos[i])).getBooleanValue(), b1);
      
      for (int j = 0; j != this.twos.length; j++) {
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThanOrEquals(this.ones[i], this.twos[j])).getBooleanValue(), b1);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.ones[i]).lessThanOrEquals(this.ones[i], this.ones[j])).getBooleanValue(), b2);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThanOrEquals(this.twos[i], this.twos[j])).getBooleanValue(), b3);
        assertEquals(((NgBoolean)this.registry.getRuntimeMetaClass(this.twos[i]).lessThanOrEquals(this.twos[i], this.ones[j])).getBooleanValue(), b4);
      }      
    }
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals(new Object(), (BigInteger)this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).lessThanOrEquals(new Object(), (BigDecimal)this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLessThanOrEquals((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLessThanOrEquals((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLessThanOrEquals((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLessThanOrEquals((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLessThanOrEquals((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLessThanOrEquals((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLessThanOrEquals((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLessThanOrEquals((BigInteger)this.oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseLessThanOrEquals((BigDecimal)this.oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
}
